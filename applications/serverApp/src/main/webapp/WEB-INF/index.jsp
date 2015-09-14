<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<html xmlns:jsp="http://java.sun.com/JSP/Page">
<title>Биржа Dota 2 игроков</title>
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=Edge">
</head>
<body>
<style>
  #chats {
    position: absolute;
    bottom: 0px;
    max-width: 1440px;
    min-width: 1024px;
    border: 1px solid green;
  }

  body {
    background-color: aliceblue;
  }

  #content {
    max-width: 1440px;
    min-width: 1024px;
    min-height: 100%;
    height: 100%;
    text-align: left;
    margin: 0 auto 0;
    padding: 0;
    border: 0;
    position: relative;
    background-color: white;
  }

  #inner {
    box-sizing: border-box;
    padding-top: 12px;
    padding-left: 24px;
    padding-right: 24px;
  }

  #header {
    width: 100%;
    top: 0;
    border: 1px solid grey;
  }

  #main_content {

  }

  #user_info {
    float: right;
    width: 30%;
    border: 1px solid red;
  }

  td {
    text-align: center;
    border: 1px solid green;
  }

  .tabs input[type=radio] {
    position: absolute;
    top: -9999px;
    left: -9999px;
  }

  .tabs {
    width: 650px;
    float: none;
    list-style: none;
    position: relative;
    padding: 0;
    margin: 75px auto;
  }

  .tabs li {
    float: left;
  }

  .tabs label {
    display: block;
    padding: 10px 20px;
    border-radius: 2px 2px 0 0;
    color: #08C;
    font-size: 24px;
    font-weight: normal;
    font-family: 'Lily Script One', helveti;
    background: rgba(255, 255, 255, 0.2);
    cursor: pointer;
    position: relative;
    top: 3px;
    -webkit-transition: all 0.2s ease-in-out;
    -moz-transition: all 0.2s ease-in-out;
    -o-transition: all 0.2s ease-in-out;
    transition: all 0.2s ease-in-out;
  }

  .tabs label:hover {
    background: rgba(255, 255, 255, 0.5);
    top: 0;
  }

  [id^=tab]:checked + label {
    background: #08C;
    color: white;
    top: 0;
  }

  [id^=tab]:checked ~ [id^=tab-content] {
    display: block;
  }

  .tab-content {
    z-index: 2;
    display: none;
    text-align: left;
    width: 100%;
    font-size: 20px;
    line-height: 140%;
    padding-top: 10px;
    background: #08C;
    padding: 15px;
    color: white;
    position: absolute;
    top: 53px;
    left: 0;
    box-sizing: border-box;
    -webkit-animation-duration: 0.5s;
    -o-animation-duration: 0.5s;
    -moz-animation-duration: 0.5s;
    animation-duration: 0.5s;
  }

</style>
<div id="content">
  <div id="inner">
    <div id="header">
      <table width="100%">
        <tr>
          <td>Команды</td>
          <td>Игроки</td>
          <td>Турниры</td>
          <td>Стримы</td>
          <td>Вход/Выход</td>
        </tr>
      </table>
    </div>

    <div id="main_content">
      <div id="user_info">
        Здесь кратко пользовательская инфа
      </div>
    </div>
  </div>
</div>
<div id="chats">
  <ul class="tabs">
    <li>
      <input type="radio" checked name="tabs" id="tab1">
      <label for="tab1">Чат 1</label>

      <div id="tab-content1" class="tab-content animated fadeIn">
        Контент чата 1
      </div>
    </li>
    <li>
      <input type="radio" name="tabs" id="tab2">
      <label for="tab2">Чат 2</label>

      <div id="tab-content2" class="tab-content animated fadeIn">
        Контент чата 2
      </div>
    </li>
    <li>
      <input type="radio" name="tabs" id="tab3">
      <label for="tab3">Чат 3</label>

      <div id="tab-content3" class="tab-content animated fadeIn">
        Контент чата 3
      </div>
    </li>
  </ul>
</div>
</body>
</html>