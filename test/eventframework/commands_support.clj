(ns eventframework.commands-support
  (:use
    [eventframework.commands :only [*command-state* command-state]]))

(defmacro with-clear-commands [& body]
  `(binding [ommand-state* (ref (command-state))]
    (do ~@body)))

