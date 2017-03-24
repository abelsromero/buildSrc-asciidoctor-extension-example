package org.asciidoctor.extensions

import org.asciidoctor.Asciidoctor
import org.asciidoctor.extension.spi.ExtensionRegistry

class MyExtensionRegistry implements ExtensionRegistry {

    @Override
    void register(Asciidoctor asciidoctor) {
        asciidoctor.javaExtensionRegistry().treeprocessor(MyExtension.class)
    }

}