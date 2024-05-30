```mermaid
classDiagram
    class IPhone {
        -String modelo
        -String cor
        -int armazenamento
        -String sistemaOperacional
        -int nivelBateria
        +ligar()
        +desligar()
        +tirarFoto()
        +fazerChamada(String numero)
        +instalarAplicativo(Aplicativo app)
    }

    class Camera {
        -int resolucao
        -double abertura
        -boolean modoNoturno
        +tirarFoto()
        +gravarVideo()
    }

    class Bateria {
        -int capacidade
        -int nivelAtual
        +carregar()
        +descarregar()
    }

    class Tela {
        -double tamanho
        -String resolucao
        -String tipo
        +ajustarBrilho(int nivel)
        +ligarTela()
        +desligarTela()
    }

    class Aplicativo {
        -String nome
        -String versao
        +abrir()
        +fechar()
    }

    IPhone --> Camera : usa
    IPhone --> Bateria : usa
    IPhone --> Tela : usa
    IPhone --> Aplicativo : instala
