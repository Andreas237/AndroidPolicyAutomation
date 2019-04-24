.class public abstract Lorg/jdom2/output/support/AbstractDOMOutputProcessor;
.super Lorg/jdom2/output/support/AbstractOutputProcessor;
.source "AbstractDOMOutputProcessor.java"

# interfaces
.implements Lorg/jdom2/output/support/DOMOutputProcessor;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 123
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractOutputProcessor;-><init>()V

    return-void
.end method

.method private static getXmlnsTagFor(Lorg/jdom2/Namespace;)Ljava/lang/String;
    .locals 3

    const-string v0, "xmlns"

    .line 135
    invoke-virtual {p0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method


# virtual methods
.method protected helperContentDispatcher(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Content;)Lorg/w3c/dom/Node;
    .locals 2

    .line 573
    sget-object v0, Lorg/jdom2/output/support/AbstractDOMOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {p4}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 590
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unexpected Content "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 586
    :pswitch_0
    check-cast p4, Lorg/jdom2/Text;

    invoke-virtual {p0, p1, p3, p4}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printText(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;

    move-result-object p1

    return-object p1

    .line 581
    :pswitch_1
    check-cast p4, Lorg/jdom2/EntityRef;

    invoke-virtual {p0, p1, p3, p4}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printEntityRef(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;

    move-result-object p1

    return-object p1

    .line 575
    :pswitch_2
    check-cast p4, Lorg/jdom2/CDATA;

    invoke-virtual {p0, p1, p3, p4}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printCDATA(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;

    move-result-object p1

    return-object p1

    .line 583
    :pswitch_3
    check-cast p4, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p3, p4}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printProcessingInstruction(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;

    move-result-object p1

    return-object p1

    .line 579
    :pswitch_4
    check-cast p4, Lorg/jdom2/Element;

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printElement(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;

    move-result-object p1

    return-object p1

    :pswitch_5
    const/4 p1, 0x0

    return-object p1

    .line 577
    :pswitch_6
    check-cast p4, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p3, p4}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printComment(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;

    move-result-object p1

    return-object p1

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

.method protected printAttribute(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;
    .locals 1

    .line 411
    invoke-virtual {p3}, Lorg/jdom2/Attribute;->isSpecified()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->isSpecifiedAttributesOnly()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 414
    :cond_0
    invoke-virtual {p3}, Lorg/jdom2/Attribute;->getNamespaceURI()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lorg/jdom2/Attribute;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lorg/w3c/dom/Document;->createAttributeNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Attr;

    move-result-object p1

    .line 416
    invoke-virtual {p3}, Lorg/jdom2/Attribute;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/w3c/dom/Attr;->setValue(Ljava/lang/String;)V

    return-object p1
.end method

.method protected printCDATA(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;
    .locals 0

    .line 379
    invoke-virtual {p3}, Lorg/jdom2/CDATA;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/w3c/dom/Document;->createCDATASection(Ljava/lang/String;)Lorg/w3c/dom/CDATASection;

    move-result-object p1

    return-object p1
.end method

.method protected printComment(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;
    .locals 0

    .line 345
    invoke-virtual {p3}, Lorg/jdom2/Comment;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/w3c/dom/Document;->createComment(Ljava/lang/String;)Lorg/w3c/dom/Comment;

    move-result-object p1

    return-object p1
.end method

.method protected printContent(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/w3c/dom/Node;Lorg/jdom2/output/support/Walker;)V
    .locals 2

    .line 533
    :cond_0
    :goto_0
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 534
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object v0

    if-nez v0, :cond_2

    .line 538
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object v0

    .line 539
    invoke-interface {p5}, Lorg/jdom2/output/support/Walker;->isCDATA()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 540
    new-instance v1, Lorg/jdom2/CDATA;

    invoke-direct {v1, v0}, Lorg/jdom2/CDATA;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3, v1}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printCDATA(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;

    move-result-object v0

    goto :goto_1

    .line 542
    :cond_1
    new-instance v1, Lorg/jdom2/Text;

    invoke-direct {v1, v0}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3, v1}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printText(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;

    move-result-object v0

    goto :goto_1

    .line 545
    :cond_2
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->helperContentDispatcher(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Content;)Lorg/w3c/dom/Node;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_0

    .line 549
    invoke-interface {p4, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    goto :goto_0

    :cond_3
    return-void
.end method

.method protected printDocument(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Document;)Lorg/w3c/dom/Document;
    .locals 6

    .line 271
    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->isOmitDeclaration()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "1.0"

    .line 272
    invoke-interface {p3, v0}, Lorg/w3c/dom/Document;->setXmlVersion(Ljava/lang/String;)V

    .line 275
    :cond_0
    invoke-virtual {p4}, Lorg/jdom2/Document;->getContentSize()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 279
    invoke-virtual {p4, v1}, Lorg/jdom2/Document;->getContent(I)Lorg/jdom2/Content;

    move-result-object v2

    const/4 v3, 0x0

    .line 281
    sget-object v4, Lorg/jdom2/output/support/AbstractDOMOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v2}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v5

    invoke-virtual {v5}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 294
    :pswitch_0
    check-cast v2, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p3, v2}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printProcessingInstruction(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;

    move-result-object v3

    goto :goto_1

    .line 291
    :pswitch_1
    check-cast v2, Lorg/jdom2/Element;

    invoke-virtual {p0, p1, p2, p3, v2}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printElement(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;

    move-result-object v3

    goto :goto_1

    .line 283
    :pswitch_2
    check-cast v2, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p3, v2}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printComment(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;

    move-result-object v3

    :goto_1
    :pswitch_3
    if-eqz v3, :cond_1

    .line 301
    invoke-interface {p3, v3}, Lorg/w3c/dom/Document;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected printElement(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;
    .locals 9

    .line 444
    invoke-virtual {p2, p4}, Lorg/jdom2/util/NamespaceStack;->push(Lorg/jdom2/Element;)V

    .line 447
    :try_start_0
    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->getTextMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v0

    const-string v1, "space"

    .line 450
    sget-object v2, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p4, v1, v2}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "default"

    .line 453
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 454
    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->getDefaultMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v2, "preserve"

    .line 455
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 456
    sget-object v0, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    .line 459
    :cond_1
    :goto_0
    invoke-virtual {p4}, Lorg/jdom2/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Lorg/w3c/dom/Document;->createElementNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v1

    .line 462
    invoke-virtual {p2}, Lorg/jdom2/util/NamespaceStack;->addedForward()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Namespace;

    .line 463
    sget-object v4, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v3, v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "http://www.w3.org/2000/xmlns/"

    .line 466
    invoke-static {v3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->getXmlnsTagFor(Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v4, v5, v3}, Lorg/w3c/dom/Element;->setAttributeNS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 469
    :cond_3
    invoke-virtual {p4}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 470
    invoke-virtual {p4}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Attribute;

    .line 471
    invoke-virtual {p0, p1, p3, v3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printAttribute(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 473
    invoke-interface {v1, v3}, Lorg/w3c/dom/Element;->setAttributeNodeNS(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;

    goto :goto_2

    .line 478
    :cond_5
    invoke-virtual {p4}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object p4

    .line 480
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    .line 481
    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->push()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 483
    :try_start_1
    invoke-virtual {p1, v0}, Lorg/jdom2/output/support/FormatStack;->setTextMode(Lorg/jdom2/output/Format$TextMode;)V

    const/4 v0, 0x0

    .line 484
    invoke-virtual {p0, p1, p4, v0}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p4

    .line 486
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->getPadBetween()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 488
    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->getPadBetween()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object v0

    .line 490
    invoke-interface {v1, v0}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    :cond_6
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, v1

    move-object v8, p4

    .line 493
    invoke-virtual/range {v3 .. v8}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printContent(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/w3c/dom/Node;Lorg/jdom2/output/support/Walker;)V

    .line 495
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result p4

    if-nez p4, :cond_7

    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->getPadLast()Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_7

    .line 497
    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->getPadLast()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p3, p4}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object p3

    .line 499
    invoke-interface {v1, p3}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 503
    :cond_7
    :try_start_2
    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->pop()V

    goto :goto_3

    :catchall_0
    move-exception p3

    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->pop()V

    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 510
    :cond_8
    :goto_3
    invoke-virtual {p2}, Lorg/jdom2/util/NamespaceStack;->pop()V

    return-object v1

    :catchall_1
    move-exception p1

    invoke-virtual {p2}, Lorg/jdom2/util/NamespaceStack;->pop()V

    throw p1
.end method

.method protected printEntityRef(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;
    .locals 0

    .line 362
    invoke-virtual {p3}, Lorg/jdom2/EntityRef;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/w3c/dom/Document;->createEntityReference(Ljava/lang/String;)Lorg/w3c/dom/EntityReference;

    move-result-object p1

    return-object p1
.end method

.method protected printProcessingInstruction(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;
    .locals 1

    .line 324
    invoke-virtual {p3}, Lorg/jdom2/ProcessingInstruction;->getTarget()Ljava/lang/String;

    move-result-object p1

    .line 325
    invoke-virtual {p3}, Lorg/jdom2/ProcessingInstruction;->getData()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 326
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string p3, ""

    .line 329
    :cond_1
    invoke-interface {p2, p1, p3}, Lorg/w3c/dom/Document;->createProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method protected printText(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;
    .locals 0

    .line 395
    invoke-virtual {p3}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/w3c/dom/Document;->createTextNode(Ljava/lang/String;)Lorg/w3c/dom/Text;

    move-result-object p1

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Ljava/util/List;)Ljava/util/List;
    .locals 3
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

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 166
    new-instance v1, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v1, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    .line 167
    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    .line 168
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Content;

    .line 169
    invoke-virtual {v1}, Lorg/jdom2/output/support/FormatStack;->push()V

    .line 171
    :try_start_0
    invoke-virtual {p0, v1, p2, p1, v2}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->helperContentDispatcher(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Content;)Lorg/w3c/dom/Node;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 174
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    :cond_0
    invoke-virtual {v1}, Lorg/jdom2/output/support/FormatStack;->pop()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Lorg/jdom2/output/support/FormatStack;->pop()V

    throw p1

    :cond_1
    return-object v0
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;
    .locals 1

    .line 243
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printAttribute(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Attribute;)Lorg/w3c/dom/Attr;

    move-result-object p1

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;
    .locals 2

    .line 186
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 187
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x0

    .line 188
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 189
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 190
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object p3

    if-nez p3, :cond_0

    .line 192
    new-instance p3, Lorg/jdom2/CDATA;

    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Lorg/jdom2/CDATA;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printCDATA(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;

    move-result-object p1

    return-object p1

    .line 194
    :cond_0
    invoke-virtual {p3}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object p2

    sget-object v1, Lorg/jdom2/Content$CType;->CDATA:Lorg/jdom2/Content$CType;

    if-ne p2, v1, :cond_1

    .line 195
    check-cast p3, Lorg/jdom2/CDATA;

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printCDATA(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/CDATA;)Lorg/w3c/dom/CDATASection;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;
    .locals 1

    .line 224
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printComment(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Comment;)Lorg/w3c/dom/Comment;

    move-result-object p1

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)Lorg/w3c/dom/Document;
    .locals 1

    .line 150
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, v0, p2, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printDocument(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Document;)Lorg/w3c/dom/Document;

    move-result-object p1

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;
    .locals 1

    .line 157
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, v0, p2, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printElement(Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/w3c/dom/Document;Lorg/jdom2/Element;)Lorg/w3c/dom/Element;

    move-result-object p1

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;
    .locals 1

    .line 237
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printEntityRef(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/EntityRef;)Lorg/w3c/dom/EntityReference;

    move-result-object p1

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;
    .locals 1

    .line 231
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printProcessingInstruction(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/ProcessingInstruction;)Lorg/w3c/dom/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method public process(Lorg/w3c/dom/Document;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;
    .locals 2

    .line 205
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 206
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x0

    .line 207
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 208
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 209
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object p3

    if-nez p3, :cond_0

    .line 211
    new-instance p3, Lorg/jdom2/Text;

    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printText(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;

    move-result-object p1

    return-object p1

    .line 213
    :cond_0
    invoke-virtual {p3}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object p2

    sget-object v1, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    if-ne p2, v1, :cond_1

    .line 214
    check-cast p3, Lorg/jdom2/Text;

    invoke-virtual {p0, v0, p1, p3}, Lorg/jdom2/output/support/AbstractDOMOutputProcessor;->printText(Lorg/jdom2/output/support/FormatStack;Lorg/w3c/dom/Document;Lorg/jdom2/Text;)Lorg/w3c/dom/Text;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
