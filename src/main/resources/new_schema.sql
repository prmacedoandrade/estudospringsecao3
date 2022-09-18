create table client(
    id integer primary key auto_increment,
    name varchar(100)
);

create table product(
    id integer primary key auto_increment,
    description varchar(100),
    prod_value numeric(20,2)
);

create table cart(
    id integer primary key auto_increment,
    client_id integer references client(id),
    cart_date timestamp,
    cart_value numeric(20,2)
);

create table product_cart(
    id int primary key auto_increment,
    prod_id integer references product(id),
    cart_id integer references cart(id),
    qtd integer
);
