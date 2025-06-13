//sviet.js
export default function Sviet(props)
{
    return(
        <div>
            <h1>
                {props.title}
            </h1>
        </div>

    );
}

//app.js

import './App.css';
// import Intro from'./intro.js';
//import Form from'./forms.js';
import Sviet from'./sviet.js';

function App() {
  return (
    <div className="App">
      { <header className="App-header">
        <img src="https://www.sviet.edu.in/wp-content/uploads/2023/06/SVIET-LOGO-Edited-1.png" className="App-logo" alt="logo"  width="300px"/>
        <p>
         SRI VASAVI INSTITUTE OF ENGINEERING AND TECHNOLOGY
         
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          SVIET
          
        </a>
        <Sviet title="empowering minds"></Sviet>

      </header> }
      
    </div>
  );
}
export default App;
