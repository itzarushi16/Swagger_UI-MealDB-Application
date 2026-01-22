import "./MealCard.css";

export default function MealCard({ meal }) {
  if (!meal) return <p className="loading">🍳 Cooking something delicious...</p>;

  return (
    <div className="meal-card">
      <div className="meal-image">
        <img src={meal.strMealThumb} alt={meal.strMeal} />
      </div>

      <div className="meal-content">
        <h2>{meal.strMeal}</h2>

        <div className="tags">
          <span className="tag category">{meal.strCategory}</span>
          <span className="tag area">{meal.strArea}</span>
        </div>
      </div>
    </div>
  );
}
