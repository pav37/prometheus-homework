# Развертывание
    helm -n app upgrade --install --create-namespace app .
Манифесты развертываются в namespace app

# Проверка
Проверить можно с помощью коллекции Postman
    User API.postman_collection.json

# Удаление развернутых ресурсов
    helm -n app delete app
    kubectl delete namespace app

Домашнее задание/проектная работа разработано(-на) для курса [Microservice Architecture](https://otus.ru/lessons/microservice-architecture)
