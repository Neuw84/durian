# Contributing to Durian

Pull requests are welcome, preferably against the branch `develop`, but definitely not against `master`.

## Build instructions

It's a bog-standard gradle build.

`gradlew eclipse`
* creates an Eclipse project file for you.

`gradlew build`
* builds the jar
* runs FindBugs
* checks the formatting
* runs the tests
* updates the manifest

If you're getting style warnings:

`gradlew licenseFormat` will apply the license template.
~~`gradlew format` will apply the coding style~~ [Github issue](https://github.com/youribonnaffe/gradle-format-plugin/issues/8).

## License

By contributing your code, you agree to license your contribution under the terms of the APLv2: https://github.com/diffplug/durian/blob/master/LICENSE

All files are released with the Apache 2.0 license as such:

```
Copyright 2015 DiffPlug

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```