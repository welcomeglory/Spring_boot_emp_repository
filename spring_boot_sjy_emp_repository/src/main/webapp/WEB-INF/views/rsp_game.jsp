<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rock Paper Scissors Game</title>
</head>
<body>
    <h1>Rock Paper Scissors Game</h1>
    <form action="${pageContext.request.contextPath}/play" method="post">
        <label for="hand">Choose your hand:</label>
        <select id="hand" name="hand">
            <option value="ROCK">Rock</option>
            <option value="PAPER">Paper</option>
            <option value="SCISSORS">Scissors</option>
        </select>
        <button type="submit">Play</button>
    </form>
    <div>
        <h2>Game Result</h2>
        <p>${result}</p>
    </div>
</body>
</html>