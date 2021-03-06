CREATE TABLE VENDA (
                       ID BIGINT AUTO_INCREMENT NOT NULL,
                       DATA DATE NOT NULL,
                       VALOR NUMERIC(15, 2) NOT NULL,
                       CONSTRAINT PK_VENDA PRIMARY KEY (ID)
);

CREATE TABLE VENDA_ITEM (
                            ID BIGINT AUTO_INCREMENT NOT NULL,
                            ID_VENDA BIGINT NOT NULL,
                            ID_PRODUTO BIGINT NOT NULL,
                            QUANTIDADE NUMERIC(10, 2) NOT NULL,
                            VALOR NUMERIC(10, 2) NOT NULL,
                            VALOR_TOTAL NUMERIC(15, 2) NOT NULL,
                            CONSTRAINT PK_VENDA_ITENS PRIMARY KEY (ID),
                            CONSTRAINT U_VENDA_ITENS_VENDA UNIQUE (ID, ID_VENDA),
                            CONSTRAINT FK_VENDA_ITENS_VENDA FOREIGN KEY (ID_VENDA) REFERENCES VENDA (ID)
);
