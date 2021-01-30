import React, { Component } from 'react';
import NavBar from '../components/navbar'
import TextInput from '../components/textInput'
import '../css/lecReg.css'
import axios from 'axios'
const REGISTRATION_REST_API_URL = 'http://localhost:8080/admin/registration/admin';
class AdminReg extends Component {
    state = {  }

    constructor(){
        super();
        this.state = {
            "userName" : '',
            "email" : ''
        }
    }
    
    changeHandler = (event) => {

        let name = event.target.name;
        let value = event.target.value;
        this.setState({[name]:value});

    }

    sendReq = () =>{
        //sent http request using state object
        console.log(this.state);

        let data = this.state;
        const auth = "Bearer "+ localStorage.getItem('token');
        axios.post(REGISTRATION_REST_API_URL, data,{
            headers: {
              'Authorization': auth
            }
          })
          .then( response => {
                if(response.data == null){
                    console.log("error");
                }
                console.log('response',response.data);
          })
    }

    render() { 
        return (  
            <React.Fragment>
                <NavBar pageName="Admin Registration" />
                    <div className="lrdataFields">
                        <TextInput tagname="userName" name="UserName :" oc={this.changeHandler}></TextInput>
                        <TextInput tagname="email" name="Email :" oc={this.changeHandler}></TextInput>
                         </div>
                    <button onClick={this.sendReq} className="lrsubmitButton">Submit</button>
               
            </React.Fragment>
        );
    }
}
 
export default AdminReg;