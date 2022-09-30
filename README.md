# http-servlets
## Основы сетей
### Модел OSI (Open System Interconnection model)
<p>Она описывает:</p>
<ul>
    <li>Уровни архитектуры компьютерной сети.</li>
    <li>Вертикальные связи разных уровней одной системы.</li>
    <li>Горизонтальные связи одинаковых уровней разных систем.</li>
</ul>
<p>Всего выделяют 7 уровней:</p>
<ol reversed>
    <li><p>Прикладной уровень(application layer) - обеспечивает связь между приложениями. Единственный уровень, 
    который напрямую взаимодействует с данными от пользователя.</p><p>Пример: HTTP, FTP, SMTP, SSH.</p></li>
    <li><p>Уровень представления(presentation layer) - преобразовывает передаваемые данные в взаимно согласованные
    форматы, шифровании, компрессии данных и обратные этим процессам - дешифрование, декомпрессия и т.д</p><p>Пример:
    TLS, SSL.</p></li>
    <li><p>Сеансовый уровень(session layer) - организует сеансы связи между устройствами, позволяя взаимодействовать
    длительное время, т.е. они отвечают за открытие и закрыте соединений.</p></li>
    <li><p>Транспортный уровень(transport layer) - разбивает поток данных на сегменты для передачи на сетевой уровень (и
    наоборот склеивает пакеты из сетевого уровня в сегменты), добавляя свой заголовок к каждому сегменту (порты 
    приложений), а также выполняет процедуры для обеспечения необходимого уровня надежности передачи информации.<p>
    Пример: TCP, UDP.</p></li>
    <li><p>Сетевой уровень(network layer) - разбивает сегменты с предыдущего уровня на пакеты данных (и наоборот 
    собирает пакеты данных в сегменты для отправки на следующий уровень), а также доставляет эти пакеты данных.</p></li>
    <li><p>Канальный уровень(data link layer) - разбивает пакеты с предыдущего уровня на кадры(frames) данных (и 
    наоборот) и производит доставку кадров в пределах одной сети, осуществляет проверку доступности среды передачи и 
    контроль ошибок передачи.</p><p>Пример: Ethernet, PPP, PPPoE.</p></li>
    <li><p>Физический уровень(physical layer) - реализован аппаратно и определяет методы передачи битов данных по
    физическим каналам.</p><p>Пример: кабель, радиоэфир и т.п.</p></li>
</ol>

### DNS(Domain Name System)
<p>Доменное имя(domain name) - распределенная система, в которой информация о доменах хранится на большом кол-ве
связанных между собой DNS-серверов. Каждый DNS-сервер хранит информаци только о своей зоне. Домены образовывают 
иерархическую структуру в виде уровней: .ru - первый уровень, google - второй уровень и т.д. Это все кэшируется на
локальном уровне и на уровне DNS, чтобы каждый раз не обращаться к сети: ключ - имя домена, значение - ip-адрес.</p>

## Java Network
### TCP/UDP
<p> В Java есть два основных пакета для работы с TCP/UDP - <code>java.net.*, java.nio.*</code>. UDP выигрывает по
производительности, т.к. у него нет дополнительных проверок, доставился ли пакет, удалось ли подключиться к серверу или
нет./p>
<img src="/images/tcp_udp.png" style=" width:1400px;height: 600px;" title="" alt=""/>

### HTTP
<p>Существует 5 классов состояния:</p>
<ol>
    <li>1xx - информация о состоянии процесса передачи.</li>
    <li>2xx - информация об успешном принятии запроса и его обработки.</li>
    <li>3xx - информация о том, что необходимо выполлнить запрос по другому адресу(redirect), указанному в заголовке
    location (header).</li>
    <li>4xx - информация об ошибках со стороны клиента.</li>
    <li>5xx - информация об ошибках на стороне сервера.</li>
</ol>
<p><a href="/src/main/java/ru/atom/http/tcp">Пример TCP</a> с классом <code>Socket</code>/p>
<p><a href="/src/main/java/ru/atom/http/udp">Пример UDP</a> с классом <code>DatagramSocket</code>/p>
<p><a href="/src/main/java/ru/atom/http/client/UrlExample.java">Пример клиента HTTP</a> с классом <code>URL</code>/p>
<p><a href="/src/main/java/ru/atom/http/client/HttpClientExample.java">Пример HTTP клиента</a> с классом 
<code>HttpClient</code>/p>
<p>Структура формата данных xml:</p>
<img src="/images/xml.png" style=" width:600px;height: 350px;" title="" alt=""/>
<p><a href="https://www.w3schools.com/html/">Документация</a> по html и всевозможным тегам.</p>
<p><a href="https://learn.javascript.ru/dom-nodes">Документация</a> по DOM-дереву.</p>