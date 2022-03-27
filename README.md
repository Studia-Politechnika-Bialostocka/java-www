# Zadanie 2
**✅ Zadanie zostało wykonane z wykorzystaniem jednego listenera za 1 punkt**

(2pkt) Utwórz aplikację, która w pamięci przechowuje listę liczb całkowitych. Lista powinna być zawsze posortowana i dostępna dla wszystkich zasobów aplikacji (zapisana w atrybutach aplikacji). Skorzystaj z klas nasłuchujących. Dodaj serwlet, który przy jednokrotnym żądaniu dodaje do listy losową liczbę.

1. Stworzenie servleta dodającego liczbę do listy.

com/example/zad2/AddNumberServlet.java

2. Stworzenie listenera, który sprawdza dany url i jeżeli jest 'add' to dodaje liczbę do listy i sortuje listę.

com/example/zad2/RequestListener.java

3. W Servlecie pobranie listy i wyświetlenie.

Wszystkie pozostałe filtry i servlety nie mają znaczenia.

Pamiętać o dodaniu listenerów do web.xml.