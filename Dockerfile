# Usa l'immagine ufficiale di code-server basata su Ubuntu
FROM codercom/code-server:latest

USER root

# Installa OpenJDK 21 e le utility necessarie
RUN apt-get update && apt-get install -y \
    openjdk-21-jdk \
    curl \
    && rm -rf /var/lib/apt/lists/*

# Imposta la cartella di lavoro principale
WORKDIR /home/coder/project

# Ripristina l'utente non-root di code-server per sicurezza
USER coder

# Installa l'estensione VS Code per Java (Language Support per Java di Red Hat)
RUN code-server --install-extension redhat.java

# Espone la porta predefinita di code-server
EXPOSE 8080

# Healthcheck per verificare che code-server sia in esecuzione
HEALTHCHECK --interval=30s --timeout=10s --start-period=40s --retries=3 \
  CMD curl -f http://localhost:8080/ || exit 1

# Avvia code-server disabilitando l'autenticazione (comodo per l'uso locale)
CMD ["code-server", "--bind-addr", "0.0.0.0:8080", "--auth", "none"]
