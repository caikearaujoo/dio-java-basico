classDiagram
    class IPhone {
        -String modelo
        -String cor
        -int armazenamento
        +ligar()
        +desligar()
        +tirarFoto()
        +fazerChamada(String numero)
    }

    class Camera {
        -int resolucao
        +tirarFoto()
    }

    IPhone --> Camera : usa
