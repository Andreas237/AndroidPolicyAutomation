.class public interface abstract Lorg/jdom2/output/support/DOMOutputProcessor;
.super Ljava/lang/Object;
.source "DOMOutputProcessor.java"


# virtual methods
.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Document;",
            "Lorg/jdom2/output/Format;",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Ljava/util/List<",
            "Lorg/w3c/dom/Node;",
            ">;"
        }
    .end annotation
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)Lorg/w3c/dom/Document;
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;
.end method

.method public abstract process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;
.end method
