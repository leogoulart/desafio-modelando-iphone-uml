```mermaid
classDiagram

class ReprodutorMusical{
  <<interface>>
  + tocar() void
  + pausar() void
  + selecionarMusica(String musica) void
}

class AparelhoTelefonico{
  <<interface>>
  + ligar(String numero) void
  + atender() void
  + iniciarCorreioVoz() void
}

class NavegadorInternet
<<interface>> NavegadorInternet
NavegadorInternet : + exibirPagina(String url) void
NavegadorInternet : + adicionarNovaAba() void
NavegadorInternet : + atualizarPagina() void

class Iphone

Iphone --> ReprodutorMusical
Iphone --> AparelhoTelefonico
Iphone --> NavegadorInternet

```
