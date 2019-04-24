.class final Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;
.super Ljava/lang/Object;
.source "AbstractStAXEventProcessor.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/support/AbstractStAXEventProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "NSIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljavax/xml/stream/events/Namespace;",
        ">;"
    }
.end annotation


# instance fields
.field private final fac:Ljavax/xml/stream/XMLEventFactory;

.field private final source:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Namespace;",
            ">;",
            "Ljavax/xml/stream/XMLEventFactory;",
            ")V"
        }
    .end annotation

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;->source:Ljava/util/Iterator;

    .line 133
    iput-object p2, p0, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;->fac:Ljavax/xml/stream/XMLEventFactory;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 138
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;->source:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 126
    invoke-virtual {p0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;->next()Ljavax/xml/stream/events/Namespace;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljavax/xml/stream/events/Namespace;
    .locals 3

    .line 143
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;->source:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Namespace;

    .line 144
    iget-object v1, p0, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;->fac:Ljavax/xml/stream/XMLEventFactory;

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljavax/xml/stream/XMLEventFactory;->createNamespace(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/Namespace;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 149
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot remove Namespaces"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
