;; Matheus Monteiro
;; Tarefa Clojure 1
;;----------------------------------------------------------------------
;;Exercício 1
(comment
Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  ultimo  que  receba  uma  lista  e 
devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta 
mesma finalidade na linguagem Clojure. )
;;----------------------------------------------------------------------

(defn ultimo [lista]
  (if (= 0 (count lista) )
   nil 
   (get lista (- (count lista) 1))
  )
)
;;----------------------------------------------------------------------
;;Exercício 2
(comment
Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista 
e  devolva  o  penúltimo  elemento  desta  lista  usar as  funções  já  prontas  e disponíveis para 
esta mesma finalidade na linguagem Clojure.)
;;----------------------------------------------------------------------

(defn penultimo[lista] (last(drop-last lista)))

;;----------------------------------------------------------------------
;;Exercício 3
(comment
Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista 
e um inteiro N e devolva o  elemento que  está na  posição N desta lista usar as funções já 
prontas e disponíveis para esta mesma finalidade na linguagem Clojure.)
;;----------------------------------------------------------------------

(defn elementoN [lista numero]
  (if (> numero (count lista))
       nil 
       (get lista numero)
    )
  )

;;----------------------------------------------------------------------
;; Exercício 4
(comment
 Utilizando  a  linguagem Clojure,  crie  uma função  chamada  inverso  que  receba uma  lista  e 
devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e 
devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na 
linguagem Clojure.)
;;----------------------------------------------------------------------

(defn inverso [lista]
  (if (= 0 (count lista))
    nil
    (concat (vector (peek lista)) (inverso (pop lista ))
    )
  )
)
;;----------------------------------------------------------------------
;;Exercício 5
(comment
 Utilizando a  linguagem Clojure, crie uma função chamada  mdc que receba  dois inteiros e 
devolve o mínimo divisor comum entre eles.  Sem usar as funções já prontas e disponíveis 
para esta mesma finalidade na linguagem Clojure.)
;;----------------------------------------------------------------------


(defn mdc [numero1 numero2]
        (if (zero? numero2)
          numero1
          (mdc numero2 (mod numero1 numero2))))

;;----------------------------------------------------------------------
;; exercício 1
;;------------------------------------
(println(ultimo [1, 2, 3, 4]))
;;------------------------------------
;; exercício 2
(println(penultimo [1,2,3,4]))
;;------------------------------------
;;exercício 3
(println(elementoN [1,2,3,4,5] 4))
;;------------------------------------
;;exercício 4
(println(inverso [1, 2, 3, 4]))
;;------------------------------------
;;exercício 5
(println (mdc 25 50))
