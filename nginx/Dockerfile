# Dockerfile

# 1. Base Nginx image
FROM nginx:latest

# 2. Remove default nginx website
RUN rm -rf /usr/share/nginx/html/*

# 3. Copy custom nginx configuration
COPY nginx.conf /etc/nginx/nginx.conf

