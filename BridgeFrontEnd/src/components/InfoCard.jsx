export const InfoCard = ({
  title = "Nombre",
  information = ["informacion"],
}) => {
  return (
    <div className="border border-black p-2 rounded-lg w-[300px] md:w-[400px]">
      <h4 className="font-semibold">{title}</h4>
      <ul>
        {information.map((info) => (
          <li className="text-gray-600/50" key={info}>
            {info}
          </li>
        ))}
      </ul>
    </div>
  );
};
