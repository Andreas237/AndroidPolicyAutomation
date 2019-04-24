.class public abstract Lorg/jdom2/output/support/AbstractStAXEventProcessor;
.super Lorg/jdom2/output/support/AbstractOutputProcessor;
.source "AbstractStAXEventProcessor.java"

# interfaces
.implements Lorg/jdom2/output/support/StAXEventProcessor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/output/support/AbstractStAXEventProcessor$AttIterator;,
        Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 123
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractOutputProcessor;-><init>()V

    return-void
.end method


# virtual methods
.method protected printCDATA(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 591
    invoke-virtual {p4}, Lorg/jdom2/CDATA;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljavax/xml/stream/XMLEventFactory;->createCData(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    return-void
.end method

.method protected printComment(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Comment;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 552
    invoke-virtual {p4}, Lorg/jdom2/Comment;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljavax/xml/stream/XMLEventFactory;->createComment(Ljava/lang/String;)Ljavax/xml/stream/events/Comment;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    return-void
.end method

.method protected printContent(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/output/support/Walker;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 734
    :goto_0
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 736
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object v0

    if-nez v0, :cond_1

    .line 739
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->isCDATA()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 740
    new-instance v0, Lorg/jdom2/CDATA;

    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jdom2/CDATA;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printCDATA(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V

    goto :goto_0

    .line 742
    :cond_0
    new-instance v0, Lorg/jdom2/Text;

    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printText(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V

    goto :goto_0

    .line 745
    :cond_1
    sget-object v1, Lorg/jdom2/output/support/AbstractStAXEventProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v0}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 769
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unexpected Content "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 763
    :pswitch_0
    check-cast v0, Lorg/jdom2/Text;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printText(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V

    goto :goto_0

    .line 756
    :pswitch_1
    check-cast v0, Lorg/jdom2/EntityRef;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printEntityRef(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/EntityRef;)V

    goto :goto_0

    .line 747
    :pswitch_2
    check-cast v0, Lorg/jdom2/CDATA;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printCDATA(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V

    goto :goto_0

    .line 759
    :pswitch_3
    check-cast v0, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printProcessingInstruction(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/ProcessingInstruction;)V

    goto :goto_0

    .line 753
    :pswitch_4
    move-object v6, v0

    check-cast v6, Lorg/jdom2/Element;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printElement(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Element;)V

    goto :goto_0

    .line 766
    :pswitch_5
    check-cast v0, Lorg/jdom2/DocType;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printDocType(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/DocType;)V

    goto :goto_0

    .line 750
    :pswitch_6
    check-cast v0, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printComment(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Comment;)V

    goto/16 :goto_0

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected printDocType(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/DocType;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 469
    invoke-virtual {p4}, Lorg/jdom2/DocType;->getPublicID()Ljava/lang/String;

    move-result-object v0

    .line 470
    invoke-virtual {p4}, Lorg/jdom2/DocType;->getSystemID()Ljava/lang/String;

    move-result-object v1

    .line 471
    invoke-virtual {p4}, Lorg/jdom2/DocType;->getInternalSubset()Ljava/lang/String;

    move-result-object v2

    .line 477
    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    const-string v4, "<!DOCTYPE "

    .line 479
    invoke-virtual {v3, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 480
    invoke-virtual {p4}, Lorg/jdom2/DocType;->getElementName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    const-string v4, " PUBLIC \""

    .line 482
    invoke-virtual {v3, v4}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 483
    invoke-virtual {v3, v0}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    const-string v0, "\""

    .line 484
    invoke-virtual {v3, v0}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    const-string v0, " SYSTEM"

    .line 489
    invoke-virtual {v3, v0}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    :cond_1
    const-string v0, " \""

    .line 491
    invoke-virtual {v3, v0}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 492
    invoke-virtual {v3, v1}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    const-string v0, "\""

    .line 493
    invoke-virtual {v3, v0}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    :cond_2
    if-eqz v2, :cond_3

    const-string v0, ""

    .line 495
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, " ["

    .line 496
    invoke-virtual {v3, v0}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 497
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 498
    invoke-virtual {p4}, Lorg/jdom2/DocType;->getInternalSubset()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    const-string p2, "]"

    .line 499
    invoke-virtual {v3, p2}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    :cond_3
    const-string p2, ">"

    .line 501
    invoke-virtual {v3, p2}, Ljava/io/StringWriter;->write(Ljava/lang/String;)V

    .line 507
    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljavax/xml/stream/XMLEventFactory;->createDTD(Ljava/lang/String;)Ljavax/xml/stream/events/DTD;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    return-void
.end method

.method protected printDocument(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Document;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 375
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isOmitDeclaration()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 377
    invoke-virtual {p4, v1, v1}, Ljavax/xml/stream/XMLEventFactory;->createStartDocument(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/StartDocument;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    goto :goto_0

    .line 378
    :cond_0
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isOmitEncoding()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1.0"

    .line 379
    invoke-virtual {p4, v1, v0}, Ljavax/xml/stream/XMLEventFactory;->createStartDocument(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/StartDocument;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    .line 380
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 381
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljavax/xml/stream/XMLEventFactory;->createCharacters(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    goto :goto_0

    .line 384
    :cond_1
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getEncoding()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1.0"

    invoke-virtual {p4, v0, v1}, Ljavax/xml/stream/XMLEventFactory;->createStartDocument(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/StartDocument;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    .line 385
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 386
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljavax/xml/stream/XMLEventFactory;->createCharacters(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    .line 393
    :cond_2
    :goto_0
    invoke-virtual {p5}, Lorg/jdom2/Document;->hasRootElement()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p5}, Lorg/jdom2/Document;->getContent()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p5}, Lorg/jdom2/Document;->getContentSize()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 395
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 396
    invoke-virtual {p5}, Lorg/jdom2/Document;->getContentSize()I

    move-result v1

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_4

    .line 398
    invoke-virtual {p5, v3}, Lorg/jdom2/Document;->getContent(I)Lorg/jdom2/Content;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 402
    :cond_4
    invoke-virtual {p0, p2, v0, v2}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p5

    .line 403
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 404
    :cond_5
    :goto_3
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 406
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object v0

    if-nez v0, :cond_6

    .line 412
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 413
    invoke-static {v0}, Lorg/jdom2/Verifier;->isAllXMLWhitespace(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->isCDATA()Z

    move-result v1

    if-nez v1, :cond_5

    .line 418
    invoke-virtual {p4, v0}, Ljavax/xml/stream/XMLEventFactory;->createCharacters(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    goto :goto_3

    .line 421
    :cond_6
    sget-object v1, Lorg/jdom2/output/support/AbstractStAXEventProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v0}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_3

    .line 433
    :pswitch_0
    check-cast v0, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printProcessingInstruction(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/ProcessingInstruction;)V

    goto :goto_3

    .line 429
    :pswitch_1
    move-object v6, v0

    check-cast v6, Lorg/jdom2/Element;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printElement(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Element;)V

    goto :goto_3

    .line 426
    :pswitch_2
    check-cast v0, Lorg/jdom2/DocType;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printDocType(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/DocType;)V

    goto :goto_3

    .line 423
    :pswitch_3
    check-cast v0, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p2, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printComment(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Comment;)V

    goto :goto_3

    .line 443
    :cond_7
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_8

    .line 444
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljavax/xml/stream/XMLEventFactory;->createCharacters(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    .line 448
    :cond_8
    invoke-virtual {p4}, Ljavax/xml/stream/XMLEventFactory;->createEndDocument()Ljavax/xml/stream/events/EndDocument;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected printElement(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Element;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 637
    invoke-virtual {p3, p5}, Lorg/jdom2/util/NamespaceStack;->push(Lorg/jdom2/Element;)V

    .line 640
    :try_start_0
    invoke-virtual {p5}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v0

    .line 641
    invoke-virtual {p5}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p5}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 644
    :goto_0
    sget-object v2, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v0, v2, :cond_1

    const-string v4, ""

    const-string v5, ""

    .line 645
    invoke-virtual {p5}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lorg/jdom2/output/support/AbstractStAXEventProcessor$AttIterator;

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isSpecifiedAttributesOnly()Z

    move-result v0

    invoke-direct {v7, v1, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$AttIterator;-><init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;Z)V

    new-instance v8, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;

    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->addedForward()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-direct {v8, v0, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;-><init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;)V

    move-object v3, p4

    invoke-virtual/range {v3 .. v8}, Ljavax/xml/stream/XMLEventFactory;->createStartElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;)Ljavax/xml/stream/events/StartElement;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    goto :goto_1

    :cond_1
    const-string v2, ""

    .line 648
    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v4, ""

    .line 649
    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p5}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lorg/jdom2/output/support/AbstractStAXEventProcessor$AttIterator;

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isSpecifiedAttributesOnly()Z

    move-result v0

    invoke-direct {v7, v1, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$AttIterator;-><init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;Z)V

    new-instance v8, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;

    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->addedForward()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-direct {v8, v0, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;-><init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;)V

    move-object v3, p4

    invoke-virtual/range {v3 .. v8}, Ljavax/xml/stream/XMLEventFactory;->createStartElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;)Ljavax/xml/stream/events/StartElement;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    goto :goto_1

    .line 653
    :cond_2
    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p5}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lorg/jdom2/output/support/AbstractStAXEventProcessor$AttIterator;

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isSpecifiedAttributesOnly()Z

    move-result v0

    invoke-direct {v5, v1, p4, v0}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$AttIterator;-><init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;Z)V

    new-instance v6, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;

    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->addedForward()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-direct {v6, v0, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;-><init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;)V

    move-object v0, p4

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Ljavax/xml/stream/XMLEventFactory;->createStartElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;)Ljavax/xml/stream/events/StartElement;

    move-result-object v0

    invoke-interface {p1, v0}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    .line 659
    :goto_1
    invoke-virtual {p5}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object v0

    .line 661
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 662
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getTextMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v1

    const-string v2, "space"

    .line 665
    sget-object v3, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p5, v2, v3}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "default"

    .line 668
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 669
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getDefaultMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v1

    goto :goto_2

    :cond_3
    const-string v3, "preserve"

    .line 671
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 672
    sget-object v1, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    .line 675
    :cond_4
    :goto_2
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->push()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 678
    :try_start_1
    invoke-virtual {p2, v1}, Lorg/jdom2/output/support/FormatStack;->setTextMode(Lorg/jdom2/output/Format$TextMode;)V

    const/4 v1, 0x0

    .line 680
    invoke-virtual {p0, p2, v0, v1}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object v0

    .line 681
    invoke-interface {v0}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 682
    invoke-interface {v0}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadBetween()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 684
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadBetween()Ljava/lang/String;

    move-result-object v1

    .line 685
    new-instance v2, Lorg/jdom2/Text;

    invoke-direct {v2, v1}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p4, v2}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printText(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V

    :cond_5
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, v0

    .line 688
    invoke-virtual/range {v2 .. v7}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printContent(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/output/support/Walker;)V

    .line 690
    invoke-interface {v0}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadLast()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 692
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadLast()Ljava/lang/String;

    move-result-object v0

    .line 693
    new-instance v1, Lorg/jdom2/Text;

    invoke-direct {v1, v0}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p4, v1}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printText(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 697
    :cond_6
    :try_start_2
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->pop()V

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->pop()V

    throw p1

    .line 702
    :cond_7
    :goto_3
    invoke-virtual {p5}, Lorg/jdom2/Element;->getNamespacePrefix()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p5}, Lorg/jdom2/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object p5

    new-instance v1, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;

    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->addedReverse()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-direct {v1, v2, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor$NSIterator;-><init>(Ljava/util/Iterator;Ljavax/xml/stream/XMLEventFactory;)V

    invoke-virtual {p4, p2, v0, p5, v1}, Ljavax/xml/stream/XMLEventFactory;->createEndElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Ljavax/xml/stream/events/EndElement;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 708
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    return-void

    :catchall_1
    move-exception p1

    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    throw p1
.end method

.method protected printEntityRef(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/EntityRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 571
    invoke-virtual {p4}, Lorg/jdom2/EntityRef;->getName()Ljava/lang/String;

    move-result-object p2

    const/4 p4, 0x0

    invoke-virtual {p3, p2, p4}, Ljavax/xml/stream/XMLEventFactory;->createEntityReference(Ljava/lang/String;Ljavax/xml/stream/events/EntityDeclaration;)Ljavax/xml/stream/events/EntityReference;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    return-void
.end method

.method protected printProcessingInstruction(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/ProcessingInstruction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 527
    invoke-virtual {p4}, Lorg/jdom2/ProcessingInstruction;->getTarget()Ljava/lang/String;

    move-result-object p2

    .line 528
    invoke-virtual {p4}, Lorg/jdom2/ProcessingInstruction;->getData()Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_0

    .line 529
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 530
    invoke-virtual {p3, p2, p4}, Ljavax/xml/stream/XMLEventFactory;->createProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/ProcessingInstruction;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    goto :goto_0

    :cond_0
    const-string p4, ""

    .line 532
    invoke-virtual {p3, p2, p4}, Ljavax/xml/stream/XMLEventFactory;->createProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/ProcessingInstruction;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    :goto_0
    return-void
.end method

.method protected printText(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 610
    invoke-virtual {p4}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljavax/xml/stream/XMLEventFactory;->createCharacters(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;

    move-result-object p2

    invoke-interface {p1, p2}, Ljavax/xml/stream/util/XMLEventConsumer;->add(Ljavax/xml/stream/events/XMLEvent;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Ljava/util/List;)V
    .locals 8
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

    .line 260
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 v1, 0x0

    .line 261
    invoke-virtual {p0, v0, p4, v1}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object v7

    .line 262
    new-instance v4, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v4, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance v5, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {v5}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    move-object v2, p0

    move-object v3, p1

    move-object v6, p3

    invoke-virtual/range {v2 .. v7}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printContent(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/output/support/Walker;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 274
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    .line 275
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x0

    .line 276
    invoke-virtual {p0, v0, p4, p2}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 277
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    .line 278
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object p4

    if-nez p4, :cond_0

    .line 280
    new-instance p4, Lorg/jdom2/CDATA;

    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p4, p2}, Lorg/jdom2/CDATA;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printCDATA(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V

    goto :goto_0

    .line 281
    :cond_0
    invoke-virtual {p4}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object p2

    sget-object v1, Lorg/jdom2/Content$CType;->CDATA:Lorg/jdom2/Content$CType;

    if-ne p2, v1, :cond_1

    .line 282
    check-cast p4, Lorg/jdom2/CDATA;

    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printCDATA(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/CDATA;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Comment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 318
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printComment(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Comment;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/DocType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 232
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printDocType(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/DocType;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Document;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 220
    new-instance v2, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v2, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance v3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {v3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printDocument(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Document;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Element;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 246
    new-instance v2, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v2, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance v3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {v3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printElement(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Element;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/EntityRef;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 345
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printEntityRef(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/EntityRef;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/ProcessingInstruction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 330
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x1

    .line 332
    invoke-virtual {v0, p2}, Lorg/jdom2/output/support/FormatStack;->setIgnoreTrAXEscapingPIs(Z)V

    .line 333
    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printProcessingInstruction(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/ProcessingInstruction;)V

    return-void
.end method

.method public process(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/Format;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;
        }
    .end annotation

    .line 296
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    .line 297
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x0

    .line 298
    invoke-virtual {p0, v0, p4, p2}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 299
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    .line 300
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object p4

    if-nez p4, :cond_0

    .line 302
    new-instance p4, Lorg/jdom2/Text;

    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p4, p2}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printText(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V

    goto :goto_0

    .line 303
    :cond_0
    invoke-virtual {p4}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object p2

    sget-object v1, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    if-ne p2, v1, :cond_1

    .line 304
    check-cast p4, Lorg/jdom2/Text;

    invoke-virtual {p0, p1, v0, p3, p4}, Lorg/jdom2/output/support/AbstractStAXEventProcessor;->printText(Ljavax/xml/stream/util/XMLEventConsumer;Lorg/jdom2/output/support/FormatStack;Ljavax/xml/stream/XMLEventFactory;Lorg/jdom2/Text;)V

    :cond_1
    :goto_0
    return-void
.end method
