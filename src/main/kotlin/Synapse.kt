package nl.sigmasoft.darwin

open class Synapse(private val weight : Float, private val neuron: Neuron){
    val output: Double
        get() = weight*neuron.output
}