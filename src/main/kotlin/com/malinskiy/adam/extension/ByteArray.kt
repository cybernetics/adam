/*
 * Copyright (C) 2019 Anton Malinskiy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.malinskiy.adam.extension

fun ByteArray.toInt(): Int {
    return (this[0].toInt() and 0x000000FF) or
            (this[1].toInt() and 0x000000FF shl 8) or
            (this[2].toInt() and 0x000000FF shl 16) or
            (this[3].toInt() and 0x000000FF shl 24)
}