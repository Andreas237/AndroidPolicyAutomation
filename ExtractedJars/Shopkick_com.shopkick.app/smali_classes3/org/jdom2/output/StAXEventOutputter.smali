.class public final Lorg/jdom2/output/StAXEventOutputter;
.super Ljava/lang/Object;
.source "StAXEventOutputter.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/output/StAXEventOutputter$DefaultStAXEventProcessor;
    }
.end annotation


# static fields
.field private static final DEFAULTEVENTFACTORY:Ljavax/xml/stream/XMLEventFactory;

.field private static final DEFAULTPROCESSOR:Lorg/jdom2/output/StAXEventOutputter$DefaultStAXEventProcessor;


# instance fields
.field private myEventFactory:Ljavax/xml/stream/XMLEventFactory;

.field private myFormat:Lorg/jdom2/output/Format;

.field private myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 138
    new-instance v0, Lorg/jdom2/output/StAXEventOutputter$DefaultStAXEventProcessor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/jdom2/output/StAXEventOutputter$DefaultStAXEventProcessor;-><init>(Lorg/jdom2/output/StAXEventOutputter$1;)V

    sput-object v0, Lorg/jdom2/output/StAXEventOutputter;->DEFAULTPROCESSOR:Lorg/jdom2/output/StAXEventOutputter$DefaultStAXEventProcessor;

    .line 145
    invoke-static {}, Ljavax/xml/stream/XMLEventFactory;->newInstance()Ljavax/xml/stream/XMLEventFactory;

    move-result-object v0

    sput-object v0, Lorg/jdom2/output/StAXEventOutputter;->DEFAULTEVENTFACTORY:Ljavax/xml/stream/XMLEventFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 199
    invoke-direct {p0, v0, v0, v0}, Lorg/jdom2/output/StAXEventOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/StAXEventProcessor;Ljavax/xml/stream/XMLEventFactory;)V

    return-void
.end method

.method public constructor <init>(Ljavax/xml/stream/XMLEventFactory;)V
    .locals 1

    const/4 v0, 0x0

    .line 239
    invoke-direct {p0, v0, v0, p1}, Lorg/jdom2/output/StAXEventOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/StAXEventProcessor;Ljavax/xml/stream/XMLEventFactory;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/Format;)V
    .locals 1

    const/4 v0, 0x0

    .line 216
    invoke-direct {p0, p1, v0, v0}, Lorg/jdom2/output/StAXEventOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/StAXEventProcessor;Ljavax/xml/stream/XMLEventFactory;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/StAXEventProcessor;Ljavax/xml/stream/XMLEventFactory;)V
    .locals 1

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    .line 158
    iput-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    .line 160
    iput-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    if-nez p1, :cond_0

    .line 189
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->clone()Lorg/jdom2/output/Format;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    if-nez p2, :cond_1

    .line 190
    sget-object p2, Lorg/jdom2/output/StAXEventOutputter;->DEFAULTPROCESSOR:Lorg/jdom2/output/StAXEventOutputter$DefaultStAXEventProcessor;

    :cond_1
    iput-object p2, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    if-nez p3, :cond_2

    .line 191
    sget-object p3, Lorg/jdom2/output/StAXEventOutputter;->DEFAULTEVENTFACTORY:Ljavax/xml/stream/XMLEventFactory;

    :cond_2
    iput-object p3, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/support/StAXEventProcessor;)V
    .locals 1

    const/4 v0, 0x0

    .line 228
    invoke-direct {p0, v0, p1, v0}, Lorg/jdom2/output/StAXEventOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/StAXEventProcessor;Ljavax/xml/stream/XMLEventFactory;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 112
    invoke-virtual {p0}, Lorg/jdom2/output/StAXEventOutputter;->clone()Lorg/jdom2/output/StAXEventOutputter;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/output/StAXEventOutputter;
    .locals 2

    .line 522
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/output/StAXEventOutputter;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 528
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getEventFactory()Ljavax/xml/stream/XMLEventFactory;
    .locals 1

    .line 299
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    return-object v0
.end method

.method public getFormat()Lorg/jdom2/output/Format;
    .locals 1

    .line 269
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    return-object v0
.end method

.method public getStAXStream()Lorg/jdom2/output/support/StAXEventProcessor;
    .locals 1

    .line 279
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    return-object v0
.end method

.method public final output(Ljava/util/List;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;",
            "Ljavax/xml/stream/util/XMLEventConsumer;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 414
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Ljava/util/List;)V

    return-void
.end method

.method public final output(Lorg/jdom2/CDATA;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 431
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Comment;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 466
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Comment;)V

    return-void
.end method

.method public final output(Lorg/jdom2/DocType;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 352
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/DocType;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Document;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 335
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Document;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Element;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 372
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Element;)V

    return-void
.end method

.method public final output(Lorg/jdom2/EntityRef;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 501
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/EntityRef;)V

    return-void
.end method

.method public final output(Lorg/jdom2/ProcessingInstruction;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 484
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/ProcessingInstruction;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Text;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 449
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V

    return-void
.end method

.method public final outputElementContent(Lorg/jdom2/Element;Ljavax/xml/stream/util/XMLEventConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 394
    iget-object v0, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    invoke-virtual {p1}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p2, v1, v2, p1}, Lorg/jdom2/output/support/StAXEventProcessor;->process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Ljava/util/List;)V

    return-void
.end method

.method public setEventFactory(Ljavax/xml/stream/XMLEventFactory;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lorg/jdom2/output/StAXEventOutputter;->myEventFactory:Ljavax/xml/stream/XMLEventFactory;

    return-void
.end method

.method public setFormat(Lorg/jdom2/output/Format;)V
    .locals 0

    .line 257
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->clone()Lorg/jdom2/output/Format;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    return-void
.end method

.method public setStAXEventProcessor(Lorg/jdom2/output/support/StAXEventProcessor;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lorg/jdom2/output/StAXEventOutputter;->myProcessor:Lorg/jdom2/output/support/StAXEventProcessor;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 539
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StAXStreamOutputter[omitDeclaration = "

    .line 540
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-boolean v1, v1, Lorg/jdom2/output/Format;->omitDeclaration:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 542
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "encoding = "

    .line 543
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v1, v1, Lorg/jdom2/output/Format;->encoding:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 545
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "omitEncoding = "

    .line 546
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-boolean v1, v1, Lorg/jdom2/output/Format;->omitEncoding:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 548
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "indent = \'"

    .line 549
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v1, v1, Lorg/jdom2/output/Format;->indent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    .line 551
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 552
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "expandEmptyElements = "

    .line 553
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-boolean v1, v1, Lorg/jdom2/output/Format;->expandEmptyElements:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 555
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "lineSeparator = \'"

    .line 556
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    iget-object v1, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v1, v1, Lorg/jdom2/output/Format;->lineSeparator:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-char v4, v1, v3

    const/16 v5, 0xd

    if-eq v4, v5, :cond_0

    packed-switch v4, :pswitch_data_0

    .line 569
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v4, "\\n"

    .line 563
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v4, "\\t"

    .line 566
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v4, "\\r"

    .line 560
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "\', "

    .line 573
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "textMode = "

    .line 574
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/jdom2/output/StAXEventOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, v2, Lorg/jdom2/output/Format;->mode:Lorg/jdom2/output/Format$TextMode;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
