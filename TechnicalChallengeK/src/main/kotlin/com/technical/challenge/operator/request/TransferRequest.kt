package com.technical.challenge.operator.request

import java.math.BigDecimal

data class TransferRequest(val message : String, val transferedValue : BigDecimal)