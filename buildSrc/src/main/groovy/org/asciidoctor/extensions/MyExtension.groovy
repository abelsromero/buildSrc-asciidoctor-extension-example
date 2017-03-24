package org.asciidoctor.extensions

import org.asciidoctor.ast.Document
import org.asciidoctor.extension.Treeprocessor

class MyExtension extends Treeprocessor {

    @Override
    Document process(Document document) {
        document.findBy([context: ':dlist']).each { it.setString('style', 'horizontal') }
        document
    }

}