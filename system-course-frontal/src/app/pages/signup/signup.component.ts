import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/interfaces/User';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {


  user: User ={
    username: '',
    name: '',
    lastname: '',
    email: '',
    password: '',
    phone: ''
  }

  constructor(private userService:UserService){}

  ngOnInit(): void {

  }

  formSubmit(){
    console.log(this.user);
    if(this.user.username == '' || this.user.username == null){
      alert('El nombre de usuario el requerido')
      return
    }

    this.userService.registerUser(this.user).subscribe((data)=>{
      console.log(data)
      alert('Usuario guardado con exito')
    }, (error) =>{
      console.log(error)
      alert('Ha ocurrido un error en el sistema')
    })
  }


}
