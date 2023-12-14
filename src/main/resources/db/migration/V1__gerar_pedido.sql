CREATE TABLE pedido (
    id SERIAL PRIMARY KEY,
    items VARCHAR(255) NOT NULL,
    total DOUBLE NOT NULL
);
