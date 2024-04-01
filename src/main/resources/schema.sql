-- Create the country table
CREATE TABLE country (
    countryid INTEGER PRIMARY KEY AUTO_INCREMENT,
    countryname TEXT,
    currency TEXT,
    population INTEGER,
    latitude TEXT,
    longitude TEXT
);

-- Create the city table
CREATE TABLE city (
    cityid INTEGER PRIMARY KEY AUTO_INCREMENT,
    cityname TEXT,
    population INTEGER,
    latitude TEXT,
    longitude TEXT,
    countryid INTEGER,
    FOREIGN KEY (countryid) REFERENCES country(countryid)
);
