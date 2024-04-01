-- Insert sample data into the country table
INSERT INTO country (countryname, currency, population, latitude, longitude)
VALUES ('USA', 'USD', 331000000, '37.0902', '-95.7129'),
       ('UK', 'GBP', 67800000, '55.3781', '-3.4360'),
       ('India', 'INR', 1380000000, '20.5937', '78.9629');

-- Insert sample data into the city table
INSERT INTO city (cityname, population, latitude, longitude, countryid)
VALUES ('New York', 8336697, '40.7128', '-74.0060', 1),
       ('London', 8982000, '51.5074', '-0.1278', 2),
       ('Mumbai', 20000000, '19.0760', '72.8777', 3);