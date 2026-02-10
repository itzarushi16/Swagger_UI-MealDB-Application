import { useEffect, useState } from "react";
import { fetchMeal } from "./services/mealService";
import MealCard from "./component/MealCard";

function App() {
  const [meal, setMeal] = useState(null);
  const [ingredientCount, setIngredientCount] = useState(0);

  useEffect(() => {
    fetchMeal().then((data) => {
      setMeal(data);

      if (data) {
        const count = Object.keys(data)
          .filter(
            (key) =>
              key.startsWith("strIngredient") &&
              data[key] &&
              data[key].trim() !== ""
          ).length;

        setIngredientCount(count);
      }
    });
  }, []);

  return (
    <div style={{ padding: "20px" }}>
      <h1>Meal With Least Ingredients 🍝</h1>

      {meal && (
        <p style={{ fontSize: "1.1rem", marginBottom: "15px" }}>
          🧾 Total Ingredients: <strong>{ingredientCount}</strong>
        </p>
      )}

      <MealCard meal={meal} />
    </div>
  );
}

export default App;
