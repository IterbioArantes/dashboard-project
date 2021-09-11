
import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import React from "react";

function App() {
  return (
    <>
      <NavBar/> 
      <div className="container">
        <h1 className="text-primary">AAA</h1>

        <DataTable/>
        <DataTable/>
        <DataTable/>
        <DataTable/>
        <DataTable/>
        <DataTable/>
        <DataTable/>
        <DataTable/>
        <DataTable/>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
