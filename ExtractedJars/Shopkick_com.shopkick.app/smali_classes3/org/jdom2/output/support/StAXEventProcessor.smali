.class public interface abstract Lorg/jdom2/output/support/StAXEventProcessor;
.super Ljava/lang/Object;
.source "StAXEventProcessor.java"


# virtual methods
.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/xml/stream/util/XMLEventConsumer;",
            "Lorg/jdom2/output/Format;",
            "Ljavax/xml/stream/XMLEventFactory;",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Comment;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/DocType;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Document;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Element;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/EntityRef;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/ProcessingInstruction;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method

.method public abstract process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation
.end method
