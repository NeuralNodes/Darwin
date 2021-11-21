package nl.sigmasoft.darwin

import kotlin.math.tanh

open class Neuron(private val inputs:Set<Synapse>) {

    val output: Double
        get()=tanh(inputs.fold(0.0) { acc, synapse -> acc + synapse.output })
}


