import './App.css';
import Dashboard from './layout/Dashboard';
import Navi from './layout/Navi';
import 'semantic-ui-css/semantic.min.css'
import {Container} from 'semantic-ui-react'

function App() {
  return (
    <div className="App">
      <Navi/>
      <Container className="main">
      <Dashboard/>
      </Container>
      
    </div>
  );
}

export default App;
