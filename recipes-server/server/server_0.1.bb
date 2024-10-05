SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "git://git@github.com/bathroomchef/rachel-server.git;protocol=ssh;branch=feature/first-commit"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake
