-- liquibase formatted sql

-- changeset fkomlinov:0.0.1.1
CREATE TABLE card
(
    id          INT auto_increment not null,
    card_id     INT                NOT NULL,
    code        varchar(20)        NOT NULL,
    name        varchar(300)       NOT NULL,
    type        varchar(255)       NOT NULL,
    description MEDIUMTEXT         NOT NULL,
    race        varchar(255),
    archetype   varchar(255),
    banlist     varchar(50),
    atk         INT,
    def         INT,
    level       INT,
    attribute   varchar(255),
    scale       INT,
    linkval     INT,
    edition     varchar(255),
    rarity      varchar(255),
    price       DECIMAL(7, 6),

    PRIMARY KEY (id)
);

CREATE TABLE image
(
    id          int auto_increment not null,
    card        INT                NOT NULL,
    image       varchar(255),
    image_small varchar(255),
    PRIMARY KEY (id),
    FOREIGN KEY (card) REFERENCES card (id)
);

CREATE TABLE user
(
    id       INT auto_increment NOT NULL,
    nickname VARCHAR(255)       NOT NULL,
    mail     VARCHAR(255)       NOT NULL,
    password VARCHAR(32)        NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE user_card
(
    id       INT auto_increment NOT NULL,
    user     INT                NOT NULL,
    card     INT                NOT NULL,
    quantity INT                NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user) REFERENCES user (id),
    FOREIGN KEY (card) REFERENCES card (id)
);

ALTER TABLE user
    ADD UNIQUE (mail);
ALTER TABLE card
    ADD UNIQUE (code);
