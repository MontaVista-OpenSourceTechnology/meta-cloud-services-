DESCRIPTION = "Tools required to be installed on Heat provisioned cloud instances"
HOMEPAGE = "https://github.com/openstack/heat-cfntools"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI[md5sum] = "0d5f8e7685e7f9a34dbd2552ffa40984"
SRC_URI[sha256sum] = "de7d93338d3afb71cc4c53d713740316ead0af3a9c869b1231617347e94a8326"

inherit setuptools pypi

DEPENDS += "\
    python-pbr \
    "

# Satisfy setup.py 'setup_requires'
DEPENDS += " \
        python-pbr-native \
        "

RDPENDS_${PN} += "\
    python-pbr \
    "
