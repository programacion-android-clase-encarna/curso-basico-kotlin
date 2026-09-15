Empezando con Git – GitHub

1º Crear una organización (de repositorios) pública en tu cuenta de GitHub (entrando con la cuenta de educarex)

Clave: Menu de tu perfil / Organizaciones  / Nueva organización

2º Comparte la url de tu organización en el Foro del curso PMDM en moodle

Por ejemplo: la organización de tu profesora Encarna es la siguiente:

https://github.com/programacion-android-clase-encarna

3º Clonar el repositorio curso-basico-kotlin   de la organización de tu profesora:

Si queremos descargar un proyecto que todavía no tenemos en nuestro ordenador: IntelliJ IDEA File ↓ New ↓ Project from Version (forma más cómoda)

O

Con comando:  git clone URL_DEL_REPOSITORIO



CREAR UN NUEVO PROYECTO KOTLIN + GUARDARLO EN UN REPOSITORIO LOCAL + SUBIRLO A UN REPOSITORIO  DE GITHUB DENTRO DE TU ORGANIZACIÓN


1º Abrir Idea Intellij / Crear Nuevo Proyecto Kotlin → “CursoKotlin2026_27”

2º Crear paquetes para organizar la información: teoria y ejercicios de cada unidad y curso

3º Crear el repositorio local con git

git init

4º Registrar los cambios en el proyecto con git, realizando el primer commit o confirmación de cambio

git status
git add .
git commit -m "Primer commit:unit1 curso2 (completo)"

5º Crear dentro de tu organización de GitHub un repositorio “curso-basico-kotlin”,
donde subir el contenido del repositorio local con tu proyecto

6º Vincular el repositorio local con el remoto

git remote add origin URL_DEL_REPOSITORIO

7º Podemos comprobarlo:

git remote -v

En mi caso:

git remote add origin https://github.com/programacion-android-clase-encarna/curso-basico-kotlin.git
git remote -v

origin  https://github.com/programacion-android-clase-encarna/curso-basico-kotlin.git (fetch)
origin  https://github.com/programacion-android-clase-encarna/curso-basico-kotlin.git (push)
8) ¿Con qué rama estás trabajando en tu repositorio local?  git status

9) Subir los cambios al repositorio remoto:

La primera vez:     git push -u origin master

Después podremos utilizar simplemente: git push 