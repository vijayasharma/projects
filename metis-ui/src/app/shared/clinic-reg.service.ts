import { Injectable } from '@angular/core';

@Injectable()
export class ClinicRegistrationService{

    public registerClinic() {

    }

    public getClinicInfo(){
        return {"name":"Sai Clinic", email: "sai@gmail.com"};
    }
}