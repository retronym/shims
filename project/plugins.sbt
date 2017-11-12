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

addSbtPlugin("io.get-coursier"   % "sbt-coursier"    % "1.0.0-RC12")
addSbtPlugin("com.dwijnand"      % "sbt-travisci"    % "1.1.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"         % "0.9.3")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "3.0.2")
addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.1.18")

addSbtPlugin("com.jsuereth"   % "sbt-pgp"      % "1.1.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")
