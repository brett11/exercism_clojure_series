(ns series)

(defn slices [s n]
  (cond
    (empty? s) []
    (= n 0) [""]
    (> n (count s)) []
    :else (let [lstlst (partition n 1 s)]
            (map (partial apply str) lstlst))
    ))


