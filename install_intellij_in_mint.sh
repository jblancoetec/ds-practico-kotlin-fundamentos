#!/bin/bash

# --- Configuración ---
# URL de descarga automática (Community Edition)
URL="https://download.jetbrains.com/idea/ideaIC-LATEST.tar.gz"
INSTALL_DIR="/opt/idea"
APP_DIR="$HOME/.local/share/applications"
ICON_URL="https://resources.jetbrains.com/storage/products/intellij-idea/img/icon_community.png"

echo "Iniciando instalación de IntelliJ IDEA Community..."

# 1. Descargar y Desempacar
echo "Descargando IntelliJ IDEA..."
wget -O ideaIC.tar.gz "$URL"
echo "Desempaquetando..."
sudo tar -xzf ideaIC.tar.gz -C /opt/
sudo mv /opt/idea-IC-* "$INSTALL_DIR"
rm ideaIC.tar.gz

# 2. Crear Acceso Directo en el Menú
echo "Creando acceso directo..."
mkdir -p "$APP_DIR"
cat <<EOF >"$APP_DIR/intellij-idea.desktop"
[Desktop Entry]
Version=1.0
Type=Application
Name=IntelliJ IDEA Community Edition
Icon=$INSTALL_DIR/bin/idea.png
Exec="$INSTALL_DIR/bin/idea.sh" %f
Comment=Entorno de Desarrollo Integrado (IDE) de JetBrains
Categories=Development;IDE;
Terminal=false
StartupNotify=true
StartupWMClass=jetbrains-idea-ce
EOF

# 3. Configurar Alias
echo "Configurando alias 'idea' en .bashrc..."
if ! grep -q "alias idea=" "$HOME/.bashrc"; then
  echo "alias idea='$INSTALL_DIR/bin/idea.sh'" >>"$HOME/.bashrc"
  source "$HOME/.bashrc"
fi

echo "¡Instalación completada con éxito!"
echo "Puede encontrarlo en el menú o escribir 'idea' en la terminal."
