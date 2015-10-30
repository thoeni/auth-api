# Set the base image to WildFly official
FROM    jetty

# File Author / Maintainer
MAINTAINER Mahesh Subramanian

# Add webapp; presumes 'gradle build' ran successfully
ADD build/libs/pulse-web-api.war /var/lib/jetty/webapps/

# Enable CORS
# ENV pulse.cors.enabled=true