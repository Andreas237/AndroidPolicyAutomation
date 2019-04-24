.class public interface abstract Lorg/jdom2/output/support/SAXOutputProcessor;
.super Ljava/lang/Object;
.source "SAXOutputProcessor.java"


# virtual methods
.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/output/support/SAXTarget;",
            "Lorg/jdom2/output/Format;",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/DocType;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract processAsDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/output/support/SAXTarget;",
            "Lorg/jdom2/output/Format;",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract processAsDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method
