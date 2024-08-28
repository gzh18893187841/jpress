FROM 192.168.8.6:8091/images/jpress:v5.1.0
LABEL maintainer="Michael Yang<fuhai999@gmail.com>"

WORKDIR /opt/jpress

EXPOSE 8080

CMD ["/opt/jpress/jpress.sh", "start"]
