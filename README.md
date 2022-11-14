# :world_map: Проект по автоматизации тестирования сайта Booking.com
## :bookmark_tabs: Содержание
- [Стек проекта](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/README.md#%D1%81%D1%82%D0%B5%D0%BA-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B0)
- [Текущее тестовое покрытие](https://github.com/Ir4fin/Ir4fin/tree/main#arrow_forward-%D1%82%D0%B5%D0%BA%D1%83%D1%89%D0%B5%D0%B5-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5-%D0%BF%D0%BE%D0%BA%D1%80%D1%8B%D1%82%D0%B8%D0%B5)
- [Запуск тестов]([url](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/README.md#abacus-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2))
- Пример Allure-отчёта по пройденным тестам
- Пример видео по одному из пройденных тестов

## :gear: Стек проекта

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="Images/Intelij_IDEA.svg">
<img width="6%" title="Java" src="Images/Java.svg">
<img width="6%" title="Selenide" src="Images/Selenide.svg">
<img width="6%" title="Selenoid" src="Images/Selenoid.svg">
<img width="6%" title="Allure Report" src="Images/Allure_Report.svg">
<img width="6%" title="Gradle" src="Images/Gradle.svg">
<img width="6%" title="JUnit5" src="Images/JUnit5.svg">
<img width="6%" title="GitHub" src="Images/GitHub.svg">
<img width="6%" title="Jenkins" src="Images/Jenkins.svg">
<img width="6%" title="Telegram" src="Images/Telegram.svg">
</p>

## :arrow_forward: Текущее тестовое покрытие

**UI автотесты:**

:white_check_mark: Поиск с главной страницы без заданных дат

:white_check_mark: Проверка функционала по смене языка

:white_check_mark: Проверка наличия ошибки валидации на форме ввода

:white_check_mark: Проверка срабатывания кнопки обратной связи

:white_check_mark: Проверка функционала отправления заявки на обратную связь без совершенного логина в систему

:white_check_mark: Проверка срабатывания кнопки регистрации

:white_check_mark: Проверка поиска нового места назначения со страницы с результатами для другого поиска


## :abacus: Запуск тестов

**Локально** 

Запуск всех тестов осуществляется командой в терминале

```bash  
gradle clean MainPageTests_test
```

Также для каждого теста выделен свой отдельный тег, чтобы запускать не весь набор

**Jenkins**

Для проекта сделана сборка в Jenkins со следующими параметрами:

```bash
clean
${TASK_NAME}
-Dbrowser_name=${BROWSER_NAME}
-Dbowser_size=${BROWSER_SIZE}
-Dbrowser_version=${BROWSER_VERSION}
-Dselenide.remote=${REMOTE_BROWSER_URL}
```

Список параметров, которые можно редактировать при запуске автотестов:

`TASK_NAME` - наименование теста

`BROWSER_NAME` - выбор браузера

`BROWSER_SIZE` - выбор разрешения экрана

`BROWSER_VERSION` - версия браузера

## Пример Allure-отчета по пройденным тестам

Для каждого теста прописаны шаги с описанием того, что он делает в процессе прохождения. 

К результатам проверки добавляются итоговый скриншот выполнения теста и видео прохождения. 

![This is an image](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/Images/Screenshot_11.jpg)







