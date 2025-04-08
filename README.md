# Projeto iPhone - Desafio de POO (Bootcamp)

Este projeto foi desenvolvido como parte de um desafio de Programação Orientada a Objetos (POO) durante um bootcamp, com base no vídeo de apresentação do iPhone em 2007.

## 📱 Objetivo

Modelar e implementar em Java uma representação de um **iPhone**, contendo as funcionalidades principais descritas no vídeo oficial de lançamento.

O projeto segue os pilares da POO, como encapsulamento, abstração e uso de interfaces.

## 🔧 Funcionalidades implementadas

O iPhone simulado possui as seguintes capacidades, organizadas em três interfaces:

### 🎵 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 📞 Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 Navegador de Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

## 🧩 Estrutura do Projeto

- Interfaces:
  - `ReprodutorMusical.java`
  - `AparelhoTelefonico.java`
  - `NavegadorInternet.java`
- Classe principal que implementa todas as interfaces:
  - `iPhone.java`
- Classe de execução:
  - `Main.java`

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/projeto-iphone.git

2. Importe no NetBeans (ou outro IDE de sua preferência).

3. Execute a classe Main.java.

## ✅ Exemplo de saída esperada

text
Copiar
Editar
Tocando música...
Selecionando música: Imagine – John Lennon
Ligando para: 11999998888

## 🎥 Referência

Vídeo de lançamento do iPhone (Apple, 2007):
https://www.youtube.com/watch?v=9ou608QQRq8


Desenvolvido com 💻 por Abner Leandro Gonçalves.
