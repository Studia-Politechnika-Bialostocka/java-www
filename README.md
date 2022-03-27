1. Stworzyć servlet
2. Stworzyć klasę nasłuchującą, który będzie dodawać liczbę do tablicy przy każdym get reqest
3. Stworzyć listener, który zawsze będzie sortował tablicę i ją wypisywał


(2pkt) Utwórz aplikację, która w pamięci przechowuje listę liczb całkowitych. Lista powinna być zawsze posortowana i dostępna dla wszystkich zasobów aplikacji (zapisana w atrybutach aplikacji). Skorzystaj z klas nasłuchujących. Dodaj serwlet, który przy jednokrotnym żądaniu dodaje do listy losową liczbę.

1. Stworzyć servlet

com/example/zad2/AddNumberServlet.java

2. Stworzyć listener

com/example/zad2/RequestListener.java

Sprawdzać czy request ma url add i jeżeli ma to wtedy dodać
liczbę i posortować listę.


3. W Servlecie pobrać listę i wyświetlić

Wszystkie pozostałe filtry i servlety nie mają znaczenia.

Pamiętać o dodaniu listenerów do web.xml.