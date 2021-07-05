Padroes de Projeto

1) Criacionais -> Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.
2) Estruturais -> Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.
3) Comportamentais -> Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

* Estruturais

5.Facade

O que é:
O Facade é um padrão de projeto estrutural que fornece uma interface simplificada (mas limitada) para um sistema complexo de classes, biblioteca, ou framework.

Aplicabilidade:
Utilize o padrão Facade quando você precisa ter uma interface limitada mas simples para um subsistema complexo.
Utilize o Facade quando você quer estruturar um subsistema em camadas.

Identificação:
O Facade pode ser reconhecido em uma classe que possui uma interface simples, mas delega a maior parte do trabalho para outras classes. Geralmente, as fachadas gerenciam o ciclo de vida completo dos objetos que usam.
Exempos de utilizacao:
javax.faces.context.ExternalContext usa ServletContext, HttpSession, HttpServletRequest, HttpServletResponse e outras lá dentro