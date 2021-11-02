import Datatable from "componentes/Datatable";
import Footer from "componentes/Footer";
import NavBar from "componentes/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Olá Mundo</h1>

        <Datatable />
      </div>
      <Footer />
    </>
  );
}

export default App;
