(ns darkleaf.di.protocols)

(defprotocol Stoppable
  (stop [this]
    "Stops the object. Returns nothing."))

(defprotocol Factory
  (dependencies [this]
    "Returns a map of a key and a dependency type.
     A type can be `:required` or `:optional`.")
  (build [this dependencies]
    "Builds a stoppable object from dependencies."))
