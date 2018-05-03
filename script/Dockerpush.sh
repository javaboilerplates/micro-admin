echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push javaboilerplates/micro-admin
docker push javaboilerplates/micro-admin:0.0.0
