const botoesSaibaMais = document.querySelectorAll('.botãosaibamais');
const sectionCards = document.querySelector('.cardscasos');
const sectionCasos = document.querySelector('.casos_acontecidos');
const botaoVoltar = document.querySelector('.botãovoltar');
const sectionVideoconst = document.querySelector('.sectionvideo')
const finalizacao = document.querySelector('.finalizaçao_explicativas')

botoesSaibaMais.forEach(botao => {
  botao.addEventListener('click', () => {
    sectionVideoconst.style.display = 'none'
    finalizacao.style.display = 'none'
    sectionCards.style.display = 'none';
    sectionCasos.style.display = 'block';
  });
});

botaoVoltar.addEventListener('click', () => {
  sectionCasos.style.display = 'none';
  sectionCards.style.display = 'flex'; 
  sectionVideoconst.style.display = 'block';
  finalizacao.style.display = 'block';
});
