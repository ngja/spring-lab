CREATE TABLE animals (
    animal_id SERIAL PRIMARY KEY,
    name VARCHAR (100) NOT NULL,
    scientific_name VARCHAR (100) NOT NULL,
    family VARCHAR(100) NOT NULL,
    eating_habits VARCHAR(20) NOT NULL,
    lifespan INT NOT NULL
);