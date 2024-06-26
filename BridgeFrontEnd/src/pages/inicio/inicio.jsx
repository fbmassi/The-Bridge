import { MisCursos } from "./MisCursos";
import { MisEquipos } from "./MisEquipos";

export const Inicio = () => {
  return (
    <main className="p-8">
      <h2 className="text-4xl text-gray-400/80">Inicio</h2>
      <div className="flex flex-col space-y-8">
        <MisCursos />
        <MisEquipos />
      </div>
    </main>
  );
};
