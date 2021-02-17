import React, { Component } from 'react';
import '../css/userCard.css'
import Button from '@material-ui/core/Button';
import EditOutlinedIcon from '@material-ui/icons/EditOutlined';

class UserCard extends Component {
  state = {  }

  render() { 
    
    console.log((this.props.data)[0]);
    return ( 
      <div className="userCard-outer">
      <div class="background"></div>
        <div class="profile-card">
          <div class="cover"></div>
          <div class="profile">
            <div class="hm-pic">
            </div>
            <div class="above-fold">
              <div class="name">
                {(this.props.data)[0]}
              </div>
              <div class="role">
              {(this.props.data)[1]}
              </div>
              
              <div class="row">
                <Button variant="outlined" color="secondary"
                startIcon={<EditOutlinedIcon></EditOutlinedIcon>}>
                  User Name
                </Button>
                <Button variant="outlined" color="secondary"
                startIcon={<EditOutlinedIcon></EditOutlinedIcon>}>
                  Password
                </Button>
              </div>
              
            </div>
            
          </div>
        </div>
        </div>
     );
  }
}
 
export default UserCard;