/*
 * Copyright 2017 Daniel Spiewak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package shims

import cats.kernel.laws._
import scalaz.std.anyVal._

import org.specs2.mutable._
import org.typelevel.discipline.specs2.mutable.Discipline

object KernelConversionSpecs extends Specification with Discipline {

  "order conversion" >> {
    cats.Order[Int]
    scalaz.Order[Int]

    "scalaz -> cats" >> {
      checkAll("Int", OrderLaws[Int].eqv)
      checkAll("Int", OrderLaws[Int].order)
    }
  }

  "semigroup conversion" >> {
    cats.Semigroup[Int]
    scalaz.Semigroup[Int]

    "scalaz -> cats" >> checkAll("Int", GroupLaws[Int].semigroup)
  }

  "monoid conversion" >> {
    cats.Monoid[Int]
    scalaz.Monoid[Int]

    "scalaz -> cats" >> checkAll("Int", GroupLaws[Int].monoid)
  }
}
