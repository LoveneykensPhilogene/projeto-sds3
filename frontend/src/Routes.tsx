import { BrowserRouter, Route, Switch } from "react-router-dom";
import Home from "./Pages/Home";
import Dashboard from "./Pages/Dashboard";
const Routes = () => {
  return (
    //chift + Alt + F para identar
    <BrowserRouter>
      <Switch>
        <Route path="/" exact>
          <Home />
        </Route>
        <Route path="/dashboard" >
          <Dashboard />
          <Home />
        </Route>

      </Switch>
    </BrowserRouter>
  );
}

export default Routes;