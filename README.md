# 🗺️ Проект по автоматизации тестирования сайта Booking.com
## 📑 Содержание
- [Стек проекта](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/README.md#%D1%81%D1%82%D0%B5%D0%BA-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B0)
- [Текущее тестовое покрытие](https://github.com/Ir4fin/Ir4fin/tree/main#arrow_forward-%D1%82%D0%B5%D0%BA%D1%83%D1%89%D0%B5%D0%B5-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5-%D0%BF%D0%BE%D0%BA%D1%80%D1%8B%D1%82%D0%B8%D0%B5)
- [Запуск тестов](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/README.md#abacus-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2)
- [Проект в Allure TestOps](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/README.md#keyboard-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82-%D0%B2-allure-testops) 
- [Пример Allure отчёта по пройденным тестам](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/README.md#abacus-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2)
- [Пример видео из Allure отчёта](https://github.com/Ir4fin/graduation_project_15_lesson/edit/main/README.md#clapper-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-%D0%B2%D0%B8%D0%B4%D0%B5%D0%BE-%D0%B8%D0%B7-allure-%D0%BE%D1%82%D1%87%D1%91%D1%82%D0%B0)
- [Уведомления](https://github.com/Ir4fin/graduation_project_15_lesson/edit/main/README.md#telephone_receiver-%D1%83%D0%B2%D0%B5%D0%B4%D0%BE%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F)

## ⚙️ Стек проекта

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/Java.svg">
<img width="6%" title="Selenide" src="images/Selenide.svg">
<img width="6%" title="Selenoid" src="images/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/Gradle.svg">
<img width="6%" title="JUnit5" src="images/JUnit5.svg">
<img width="6%" title="GitHub" src="images/GitHub.svg">
<img width="6%" title="Jenkins" src="images/Jenkins.svg">
<img width="6%" title="Telegram" src="images/Telegram.svg">
<img width="6%" title="Allure_TO" src="images/Allure_TO.svg"> 
</p>

## ▶️ Текущее тестовое покрытие

**UI автотесты:**

:white_check_mark: Поиск с главной страницы без заданных дат

:white_check_mark: Проверка функционала по смене языка

:white_check_mark: Проверка наличия ошибки валидации на форме ввода

:white_check_mark: Проверка срабатывания кнопки обратной связи

:white_check_mark: Проверка функционала отправления заявки на обратную связь без совершенного логина в систему

:white_check_mark: Проверка срабатывания кнопки регистрации

:white_check_mark: Проверка поиска нового места назначения со страницы с результатами для другого поиска


## 🧮 Запуск тестов

**Локально** 

Запуск всех тестов осуществляется командой в терминале

```bash  
gradle clean MainPageTests_test
```

Также для каждого теста выделен свой отдельный тег, чтобы запускать не весь набор

**Jenkins**

Для проекта сделана [сборка в Jenkins](https://jenkins.autotests.cloud/job/014-Ir4fin-graduation_project_15_lesson/) со следующими параметрами:

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

Для запуска прогона необходимо нажать на "Собрать с параметрами", выставить необходимые параметры и нажать "Собрать"

![This is an image](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/images/Screenshot_6.jpg)

![This is an image](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/images/Screenshot_7.jpg)

## :keyboard: Проект в Allure TestOps

Проект развернут также в Allure TestOps, что позволяет: отслеживать прогон тестов в реальном времени; автоматически добавлять тесты из прогона в тест-кейсы; адаптировать прогоны для того, чтобы их могли разбирать и запускать участники проекта, не связанные напрямую с автотестированием.

![This is an image](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/images/Screenshot_9.jpg)

![This is an image](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/images/Screenshot_10.jpg)


## 📊 Пример Allure-отчета по пройденным тестам

Для каждого теста прописаны шаги с описанием того, что он делает в процессе прохождения. 

К результатам проверки добавляются итоговый скриншот выполнения теста и видео прохождения.

![This is an image](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/images/Screenshot_11.jpg)

## :clapper: Пример видео из Allure отчёта

![](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/images/02770fab6401b0919bc8e10cc0771d47.gif)

## :telephone_receiver: Уведомления

К проекту подключены уведомления в Telegram - после прохождения тестов в Jenkins бот присылает в чат результаты прогона.

![This is an image](https://github.com/Ir4fin/graduation_project_15_lesson/blob/main/images/Screenshot_8.jpg)











