;;Tarefa 2 Aluno:Matheus Monteiro
;;-----------------------------------------------------
;; Exercício 1

(comment
;Na  aula  disponível  em:  https://replit.com/@frankalcantara/ClojureAula2?v=1  foram 
destacadas diversas funções (expressões), como funções de primeira ordem, disponíveis em 
Clojure.  Sua  primeira  tarefa  será  descrever  cada  uma  destas  funções  e  apresentar  dois 
exemplos  de  uso  de  cada  uma  delas.  Lembre-se  os  exemplos  precisam  ser  utilizados  de 
forma que o resutado da função possa ser visto no terminal. )
;;-----------------------------------------------------

(comment range é uma função onde vc tem o começo, o fim, e os passos, dessa forma vc vai criar uma seuqencia que vai do começo ao fim seguindo um numero de passos, que pode ser comparado com a razão de uma progressão aritimetica)
(println(range 10))
(println(range 1 99 2))
(comment map é uma função que recebe uma função e uma lista retorna uma lista aplicando essa função a todos os elementos dela)
(println(map  + [1 2 3] [3 2 1]))
(println(map #(* 2 %) [1 2 3]))
(comment inc é uma função que adiciona uma unidade em um numero)
(println(inc 3))
(println(inc -3))
(comment filter é uma função que recebe uma lista e um predicado, e filtra essa lista de acordo dom o predicado, deixando sobrando apenas os elementos que resultam como verdadeira como saida do predicado)
(println(filter #(> 5 %) (range 10)))
(println(filter even? (range 20)))
(comment as funções odd? retorna true se for impar e false se for par even? retorna true se for par e false se for impar)
(println(even? 2))
(println(even? 3))
(println(odd? 2))
(println(odd? 3))

(comment into é uma função que recebe 2 coleções e retornas uma coleção com todos os itens)
(println(into [1 2 3 4 5] '[2 3 7 8 9 45]))
(println(into [ ] ' {1 2 3 4, 5 6 7 8}))

(comment assoc aplica uma inclusão para certo indice em um map)
(println(assoc [1 2 3 4 5] 3 99))
(println(assoc [1 2 3 4 5] 3 '(4 5 6 2)))

(comment dissoc remove algum indice no map)

(println(dissoc {:a 2 :b 6 :c 7} :b))
(println(dissoc {:a 2 :b 6 :c 7} :d))

(comment "->" cria uma lista de expressões a aplicam ela a determinada vairavel da esquerda pra direita)

(println (-> 3 (- 2(+ 4))))
(println (-> "Hello" (str " World!")))

(comment ->> cria uma lista de expressões a aplicam ela a determinada vairavel da direita pra esquerda)

(println (->> 3 (- 2(+ 4))))
(println (->> "Hello" (str " World!")))

(comment require é para importar bibliotecas)

(comment use é para importar bibliotecas só que usando o "namespace")

(comment gen:class é gera um bytecode e um arquivo.class para o diretorio)


;;-----------------------------------------------------
;;Exercício 2


(comment
Utilizando a linguagem Clojure, crie uma função chamada ehPrimo que receba um inteiro e 
devolva True caso este inteiro seja verdadeiro e False caso contrário. )
;;-----------------------------------------------------

(defn divisoresDeN [numero]
  (count(for[x (range 1 numero)
       :when (= (mod numero x) 0)] 
   x)
  )
)

(defn ehPrimo [numero]
  (if(<= (divisoresDeN numero) 1)
    true
    false
  )
)
;;-----------------------------------------------------
;;Exercício 3
(comment
 Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  fatoresPrimos  que  receba  um 
inteiro e devolva uma lista dos seus fatores primos. Decomposição em fatores primos é uma 
tarefa fundamental da aritmética.)
;;-----------------------------------------------------

(defn fatoresNumero [numero] (map #(/ numero %)
  (filter #(zero? (rem numero %)) (range 1 (+ numero 1)))))

(defn fatoresPrimos [numero]
  (filter ehPrimo (fatoresNumero numero)))

;;-----------------------------------------------------
;;Exercício 4
(comment
 Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  todosPrimos  que  receba  dois 
valores inteiros e devolve todos os números primos que existam entre estes dois valores.)
;;-----------------------------------------------------

(defn todosPrimos [numero1 numero2]
  (for[x (range numero1 numero2)
       :when (ehPrimo x)] x)  
)

;;-----------------------------------------------------
(println "Hello World!")
;;---------------------------------------
;;Exercício 1
;;---------------------------------------
;;Exercício 2
(println (ehPrimo 521))
(println (ehPrimo 1002))
;;---------------------------------------
;;Exercício 3

(println( fatoresPrimos 10))

;;---------------------------------------
;;Exercício 4
(println (todosPrimos 10 20))
