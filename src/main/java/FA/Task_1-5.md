
1. **Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).**

   >root@gb:/home/challenger# cat > Домашние_животные
   Собака\
   Кошка\
   Хомяк

   >root@gb:/home/challenger# cat > Вьючные_животные
   Лошадь\
   Верблюд\
   Осел

   >root@gb:/home/challenger# cat Вьючные_животные >> Домашние_животные

   >root@gb:/home/challenger# cat Домашние_животные
   Собака\
   Кошка\
   Хомяк\
   Лошадь\
   Верюблюд\
   Осел

   >mv Домашние_животные Друзья_человека

2. **Создать директорию, переместить файл туда.**
   
   >root@gb:/home/challenger# mkdir dirTask2\
   >root@gb:/home/challenger# mv Друзья_человека dirTask2/

3. **Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.**

   >wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb \
   >dpkg -i mysql-apt-config_0.8.24-1_all.deb\
   >sudo apt update\
   >apt install mysql-server -y

4. **Установить и удалить deb-пакет с помощью dpkg.**

   >root@gb:~# wget https://download.virtualbox.org/virtualbox/7.0.6/virtualbox-7.0_7.0.6-155176~Ubuntu~jammy_amd64.deb \
   >root@gb:~# dpkg -i virtualbox-7.0_7.0.6-155176~Ubuntu~jammy_amd64.deb \
   >root@gb:~# apt -f install \
   >dpkg -r virtualbox-7.0

5. **Выложить историю команд в терминале ubuntu**

