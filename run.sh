docker run -d \
  --name java-projects-ide \
  -p 8443:8080 \
  -v "$(pwd)":/home/coder/project \
  java-projects