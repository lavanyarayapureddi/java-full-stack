//forms.js
function Form()
{
    return(
        <div>
        <h1 align="center"><u>REGISTRATION</u></h1>
        <form action="website.html">
            <fieldset>
                <h1 align="center">Fill the details</h1>
                <table cellspacing="20px">
            <tr>
                <td><label for="">Firstname:</label></td>
                <td><input type="text" placeholder="Firstname"/></td>
            </tr>
            <tr>
                <td><label for="">middlename:</label></td>
                <td><input type="text" placeholder="middlename"/></td>
            </tr>
            <tr>
                <td><label for="">lastname:</label></td>
                <td><input type="text" placeholder="lastname"/></td>
            </tr>
            <tr>
                <td><label for="">Email:<span style={{color:'red'}}>*</span></label></td>
                <td><input type="Email" autofocus required  placeholder="Email"/></td>
            </tr>
            <tr>
                <td><label for="">Password:<span style={{color:'red'}}>*</span></label></td>
                <td><input type="password" autofocus required  placeholder="password"/></td>
            </tr>
                <tr>
                <td><label for="">Date of Birth:</label></td>
                <td><input type="date" placeholder="Date of Birth"/></td>
            </tr>
            <tr>
                <td><label for=" ">Gender:</label></td>
            </tr>
            <tr>
                <td>
                    <input type="radio" name="gender" id="male"/>
                    <label for="male">Male</label>
                </td>
                <td> 
                    <input type="radio" name="gender"id="female"/>
                <label for="female">Female</label>
            </td>
                <td>
                    <input type="radio" name="gender"id="others"/>
                <label for="others">Others</label>
                </td>
            </tr>
                <tr>
                    <td>Address of the student:</td>
                </tr>
            <tr>
                 <td><label for=" ">city:</label></td>
                   <td><input type="text" placeholder="city"/></td><br/><br/>
            </tr>
            <tr>      
                   <td><label for=" ">street:</label></td>
                    <td><input type="text" placeholder="street"/></td><br/><br/>
            </tr>
            <tr>
                    <td><label for=" ">state:</label></td>
                   <td><input type="text" placeholder="state"/></td><br/><br/>
                </tr>
                <tr>   
                   <td><label for=" ">country:</label></td>
                    <td><input type="text" placeholder="country"/></td><br/><br/>
            </tr>
            <tr>
                <td>Branches:</td>
            </tr>
            <tr>
                <td><select>
                    <option value=" ">CSE</option>
                    <option value=" ">ECE</option>
                    <option value=" ">AIML</option>
                </select></td>
            </tr>
            <tr>
                <td><label for=" ">Terms and conditions:</label></td>
            </tr>
            <tr>
                <td><input type="checkbox"/> I agree above conditions</td>
            </tr>
            <tr>
                <td><input type="checkbox"/> I agree above terms</td>
            </tr>
            <tr>
                <td><button type=" ">Submit</button></td>
            </tr>
        </table>
            </fieldset>
        </form>
    </div>
    );
}
export default Form;

//app.js

import './App.css';
// import Intro from'./intro.js';
import Form from'./forms.js';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src="https://www.sviet.edu.in/wp-content/uploads/2023/06/SVIET-LOGO-Edited-1.png" className="App-logo" alt="logo" />
        <p>
         SRI VASAVI INSTITUTE OF ENGINEERING AND TECHNOLOGY
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Intro></Intro>
      </header> */}
      <Form></Form>

    </div>
  );
}

export default App;
