import React, {useEffect, useState} from 'react';
import Login from "./LoginPage";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import LoginPage from "./LoginPage";
import LogoutPage from "./LogoutPage";
import Header from "./Header";


function App() {
  const [hello, setHello] = useState('')

  // useEffect(() => {
  //   axios.get('/api/hello')
  //       .then(response => setHello(response.data))
  //       .catch(error => console.log(error))
  // }, []);

  return (
    <Header/>
  );
}

export default App;
