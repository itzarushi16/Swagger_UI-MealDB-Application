import { useEffect, useState } from "react";
import { fetchMeal } from "./services/mealService";
import MealCard from "./component/MealCard";

function App() {
  const [meal, setMeal] = useState(null);

  useEffect(() => {
    fetchMeal().then(setMeal);
  }, []);

  return (
    <div style={{ padding: "20px" }}>
      <h1>Meal With Least Ingredients 🍝</h1>
      <MealCard meal={meal} />
    </div>
  );
}

export default App;
