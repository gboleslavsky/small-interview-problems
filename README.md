Simple Interview Coding Exercise


to run:

1. Make sure jre, git and sbt are installed.

2. In a new empty directory:
    git clone https://github.com/gboleslavsky/Fazz

3. cd Fazz

4. sbt test


If everything works, output should be something like this:

gregorys-MacBook-Pro:FazzBizzBarrSeamless gregoryboleslavsky$ sbt test
[info] Loading project definition from /Users/gregoryboleslavsky/FazzBizzBarrSeamless/project
[info] Set current project to FazzBizzSeamless (in build file:/Users/gregoryboleslavsky/FazzBizzBarrSeamless/)
[info] FnFazzBizzBarrSpec:
[info] Integer value
[info] - should determine the string that correponds to it based on divisibility by 3,5, and 7
[info] Run completed in 318 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 1 s, completed Jul 12, 2016 6:57:17 PM
gregorys-MacBook-Pro:FazzBizzBarrSeamless gregoryboleslavsky$
