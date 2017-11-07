Example code for https://stackoverflow.com/questions/47106044

How to run:
1. in one console `sbt run`
2. in another console `curl http://localhost:9000/test` multiple times

The 1st web request fails, simulating a transient error, then the service recovers.

Removing the `@` from `routes` the service never recovers instead.
