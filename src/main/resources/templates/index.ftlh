    <!DOCTYPE HTML>
    <html>
    <head>
        <title>
            Test me
        </title>
    </head>
    <body>
    <h1>Опросник</h1><hr>
    <#list questions as question>
        <div>
        <p>${question.discipline}</p>
        <p>${question.question}</p>
         <p>${question.answer}</p>
        </div>
    </#list>
    <h3>
        <form action="/question/create" method="post">
            Предметная область: <input type="text" name="discipline"/><br>
            Вопрос: <input type="text" name="question"/><br>
            Ответ: <input type="text" name="answer"/><br>
            Варианты: <input type="text" name="variables"/><br>
            <input type="submit" value="Добавить вопрос">
        </form>
    </h3>
    </body>
    </html>
