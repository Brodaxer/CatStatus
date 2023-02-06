# CatStatus

Zdefiniuj klasę Car reprezentującą samochód. Powinny być w niej przechowywane informacje takie jak:

    poziom paliwa,
    czy silnik jest sprawny,
    czy klapka wlewu paliwa jest zamknięta,
    czy drzwi i bagażnik są zamknięte,
    czy silnik jest uruchomiony.

Zdefiniuj metodę start(), która symuluje próbę uruchomienia samochodu i zwraca jeden z kodów, zgodnie z poniższym opisem:

    100 - samochód udało się uruchomić,
    200 - samochodu nie da się uruchomić z powodu awarii silnika,
    300 - samochodu nie da się uruchomić z powodu braku paliwa,
    400 - samochód udało się uruchomić, ale klapka wlewu paliwa nie jest zamknięta,
    500 - samochód udało się uruchomić, ale drzwi lub bagażnik nie są zamknięte.

Powyższe kody powinny być odzwierciedlone w programie jako stałe w klasie Car.

Dodaj także metodę status(), która zwróci aktualny status pojazdu i jego systemów w postaci napisu - coś jak symulacja deski rozdzielczej. Jeżeli wszystko z samochodem jest ok, tzn. silnik jest sprawny, bak paliwa nie jest pusty, drzwi i wlew paliwa są zamknięte, to zwróć tylko komunikat "Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż". W innym przypadku zwróć informację o tym, co w samochodzie wymaga poprawy.

Jeżeli silnik był uruchomiony, a silnik ulegnie awarii lub skończy się paliwo, to silnik powinien zostać wyłączony. Jeżeli system wykrywa awarię silnika lub brak paliwa, to silnika nie powinno się także dać uruchomić.

Przetestuj działanie obu metod.
