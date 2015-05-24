# build
```bash
activator clean docker:publishLocal
```

# run
1. main class
```bash
docker run --rm -it cli-docker:1.0 
```

2. other class
```bash
docker run --rm -it cli-docker:1.0 -main com.example.World
```
