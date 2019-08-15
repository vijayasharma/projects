import { Component } from '@angular/core';
import { ClinicRegistrationService } from '../shared/clinic-reg.service';
import { ValueConverter } from '@angular/compiler/src/render3/view/template';
import { FormGroup, FormControl } from '@angular/forms';


@Component({
    selector: "clinic-registration",
    templateUrl: "./clinic-registration.html"
})
export class ClinicRegistration {

    clinicRegForm = new FormGroup({
        clinicName : new FormControl(''),
        ownerName : new FormControl(''),
        address : new FormGroup({
            houseNo : new FormControl(''),
            street : new FormControl(''),
            area : new FormControl(''),
            state : new FormControl(''),
            postcode : new FormControl('')
        })
    });
    

    constructor(private clinicRegistrationService: ClinicRegistrationService) {
    }


    onRegisterClinicFormSubmit(): any{
        console.log('Form submitted'+ JSON.stringify(this.clinicRegForm.value));
        
        return "";
    }

    onRegisterClinicFormReset(){
        console.log('Clear button clicked.');
    }
}