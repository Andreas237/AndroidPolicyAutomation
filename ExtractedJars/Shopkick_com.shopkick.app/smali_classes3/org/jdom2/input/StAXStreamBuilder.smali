.class public Lorg/jdom2/input/StAXStreamBuilder;
.super Ljava/lang/Object;
.source "StAXStreamBuilder.java"


# instance fields
.field private builderfactory:Lorg/jdom2/JDOMFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 530
    new-instance v0, Lorg/jdom2/DefaultJDOMFactory;

    invoke-direct {v0}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    iput-object v0, p0, Lorg/jdom2/input/StAXStreamBuilder;->builderfactory:Lorg/jdom2/JDOMFactory;

    return-void
.end method

.method private static final process(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Document;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 125
    :try_start_0
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result v0

    const/4 v1, 0x7

    if-ne v1, v0, :cond_3

    const/4 v1, 0x0

    .line 132
    invoke-interface {p0, v1}, Lorg/jdom2/JDOMFactory;->document(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    move-result-object v1

    :goto_0
    const/16 v2, 0x8

    if-eq v0, v2, :cond_2

    packed-switch v0, :pswitch_data_0

    .line 186
    :pswitch_0
    new-instance p0, Lorg/jdom2/JDOMException;

    goto/16 :goto_2

    .line 162
    :pswitch_1
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "Unexpected XMLStream event at Document level: CDATA"

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 149
    :pswitch_2
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/jdom2/input/stax/DTDParser;->parse(Ljava/lang/String;Lorg/jdom2/JDOMFactory;)Lorg/jdom2/DocType;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jdom2/Document;->setDocType(Lorg/jdom2/DocType;)Lorg/jdom2/Document;

    goto/16 :goto_1

    .line 160
    :pswitch_3
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "Unexpected XMLStream event at Document level: ENTITY_REFERENCE"

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 139
    :pswitch_4
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getLocation()Ljavax/xml/stream/Location;

    move-result-object v0

    invoke-interface {v0}, Ljavax/xml/stream/Location;->getSystemId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jdom2/Document;->setBaseURI(Ljava/lang/String;)V

    const-string v0, "ENCODING_SCHEME"

    .line 140
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getCharacterEncodingScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/jdom2/Document;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "STANDALONE"

    .line 142
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->isStandalone()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/jdom2/Document;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "ENCODING"

    .line 144
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEncoding()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/jdom2/Document;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 176
    :pswitch_5
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jdom2/Document;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;

    goto :goto_1

    .line 168
    :pswitch_6
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v0

    .line 169
    invoke-static {v0}, Lorg/jdom2/Verifier;->isAllXMLWhitespace(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 170
    :cond_0
    new-instance p0, Lorg/jdom2/JDOMException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected XMLStream event at Document level: CHARACTERS ("

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 181
    :pswitch_7
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPITarget()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPIData()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v0, v2}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jdom2/Document;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;

    goto :goto_1

    .line 158
    :pswitch_8
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "Unexpected XMLStream event at Document level: END_ELEMENT"

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 154
    :pswitch_9
    invoke-static {p0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->processElementFragment(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jdom2/Document;->setRootElement(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    .line 189
    :goto_1
    :pswitch_a
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    move-result v0

    goto/16 :goto_0

    .line 192
    :cond_1
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "Unexpected end-of-XMLStreamReader"

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 186
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected XMLStream event "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-object v1

    .line 128
    :cond_3
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "JDOM requires that XMLStreamReaders are at their beginning when being processed."

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljavax/xml/stream/XMLStreamException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 197
    new-instance p1, Lorg/jdom2/JDOMException;

    const-string v0, "Unable to process XMLStream. See Cause."

    invoke-direct {p1, v0, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_a
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static final processElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;
    .locals 9

    .line 505
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getLocalName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getNamespaceURI()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lorg/jdom2/JDOMFactory;->element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object v0

    .line 510
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    .line 511
    invoke-interface {p1, v3}, Ljavax/xml/stream/XMLStreamReader;->getAttributeLocalName(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v3}, Ljavax/xml/stream/XMLStreamReader;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v3}, Ljavax/xml/stream/XMLStreamReader;->getAttributeType(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lorg/jdom2/AttributeType;->getAttributeType(Ljava/lang/String;)Lorg/jdom2/AttributeType;

    move-result-object v6

    invoke-interface {p1, v3}, Ljavax/xml/stream/XMLStreamReader;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v3}, Ljavax/xml/stream/XMLStreamReader;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v7

    invoke-interface {p0, v4, v5, v6, v7}, Lorg/jdom2/JDOMFactory;->attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object v4

    invoke-interface {p0, v0, v4}, Lorg/jdom2/JDOMFactory;->setAttribute(Lorg/jdom2/Element;Lorg/jdom2/Attribute;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 520
    :cond_0
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getNamespaceCount()I

    move-result p0

    :goto_1
    if-ge v2, p0, :cond_1

    .line 521
    invoke-interface {p1, v2}, Ljavax/xml/stream/XMLStreamReader;->getNamespacePrefix(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2}, Ljavax/xml/stream/XMLStreamReader;->getNamespaceURI(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jdom2/Element;->addNamespaceDeclaration(Lorg/jdom2/Namespace;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method private static final processElementFragment(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;,
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 450
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 456
    invoke-static {p0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->processElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;

    move-result-object v0

    move-object v2, v0

    :goto_0
    if-lez v1, :cond_2

    .line 459
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 460
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    move-result v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_1

    const/16 v4, 0xc

    if-eq v3, v4, :cond_0

    packed-switch v3, :pswitch_data_0

    .line 494
    new-instance p0, Lorg/jdom2/JDOMException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected XMLStream event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 481
    :pswitch_0
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0, v3}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_0

    .line 477
    :pswitch_1
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0, v3}, Lorg/jdom2/JDOMFactory;->text(Ljava/lang/String;)Lorg/jdom2/Text;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_0

    .line 489
    :pswitch_2
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPITarget()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPIData()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0, v3, v4}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_0

    .line 468
    :pswitch_3
    invoke-virtual {v2}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 462
    :pswitch_4
    invoke-static {p0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->processElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;

    move-result-object v3

    .line 463
    invoke-virtual {v2, v3}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    add-int/lit8 v1, v1, 0x1

    move-object v2, v3

    goto :goto_0

    .line 472
    :cond_0
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0, v3}, Lorg/jdom2/JDOMFactory;->cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_0

    .line 485
    :cond_1
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getLocalName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0, v3}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto/16 :goto_0

    :cond_2
    return-object v0

    .line 451
    :cond_3
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "JDOM requires that the XMLStreamReader is at the START_ELEMENT state when retrieving an Element Fragment."

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static final processFragment(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Content;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 392
    :try_start_0
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 439
    :pswitch_0
    new-instance p0, Lorg/jdom2/JDOMException;

    goto :goto_0

    .line 412
    :pswitch_1
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lorg/jdom2/JDOMFactory;->cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object p0

    .line 413
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    return-object p0

    .line 407
    :pswitch_2
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/jdom2/input/stax/DTDParser;->parse(Ljava/lang/String;Lorg/jdom2/JDOMFactory;)Lorg/jdom2/DocType;

    move-result-object p0

    .line 408
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    return-object p0

    .line 428
    :pswitch_3
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getLocalName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p0

    .line 429
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    return-object p0

    .line 397
    :pswitch_4
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "Illegal state for XMLStreamReader. Cannot get XML Fragment for state END_DOCUMENT"

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 395
    :pswitch_5
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "Illegal state for XMLStreamReader. Cannot get XML Fragment for state START_DOCUMENT"

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 423
    :pswitch_6
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object p0

    .line 424
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    return-object p0

    .line 418
    :pswitch_7
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lorg/jdom2/JDOMFactory;->text(Ljava/lang/String;)Lorg/jdom2/Text;

    move-result-object p0

    .line 419
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    return-object p0

    .line 433
    :pswitch_8
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPITarget()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPIData()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p0

    .line 435
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    return-object p0

    .line 399
    :pswitch_9
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "Illegal state for XMLStreamReader. Cannot get XML Fragment for state END_ELEMENT"

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 402
    :pswitch_a
    invoke-static {p0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->processElementFragment(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;

    move-result-object p0

    .line 403
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    return-object p0

    .line 439
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected XMLStream event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljavax/xml/stream/XMLStreamException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 443
    new-instance p1, Lorg/jdom2/JDOMException;

    const-string v0, "Unable to process XMLStream. See Cause."

    invoke-direct {p1, v0, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private processFragments(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;Lorg/jdom2/input/stax/StAXFilter;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/JDOMFactory;",
            "Ljavax/xml/stream/XMLStreamReader;",
            "Lorg/jdom2/input/stax/StAXFilter;",
            ")",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 203
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result v0

    const/4 v1, 0x7

    if-ne v1, v0, :cond_6

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 215
    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->next()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_5

    packed-switch v2, :pswitch_data_0

    .line 283
    :pswitch_0
    new-instance p1, Lorg/jdom2/JDOMException;

    goto/16 :goto_2

    .line 251
    :pswitch_1
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Lorg/jdom2/input/stax/StAXFilter;->includeCDATA(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 252
    invoke-interface {p1, v2}, Lorg/jdom2/JDOMFactory;->cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 245
    :pswitch_2
    invoke-interface {p3}, Lorg/jdom2/input/stax/StAXFilter;->includeDocType()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 246
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lorg/jdom2/input/stax/DTDParser;->parse(Ljava/lang/String;Lorg/jdom2/JDOMFactory;)Lorg/jdom2/DocType;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 270
    :pswitch_3
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getLocalName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Lorg/jdom2/input/stax/StAXFilter;->includeEntityRef(ILjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 271
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getLocalName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 220
    :pswitch_4
    new-instance p1, Lorg/jdom2/JDOMException;

    const-string p2, "Illegal state for XMLStreamReader. Cannot get XML Fragment for state END_DOCUMENT"

    invoke-direct {p1, p2}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 218
    :pswitch_5
    new-instance p1, Lorg/jdom2/JDOMException;

    const-string p2, "Illegal state for XMLStreamReader. Cannot get XML Fragment for state START_DOCUMENT"

    invoke-direct {p1, p2}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 264
    :pswitch_6
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Lorg/jdom2/input/stax/StAXFilter;->includeComment(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 265
    invoke-interface {p1, v2}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 258
    :pswitch_7
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Lorg/jdom2/input/stax/StAXFilter;->includeText(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 259
    invoke-interface {p1, v2}, Lorg/jdom2/JDOMFactory;->text(Ljava/lang/String;)Lorg/jdom2/Text;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 276
    :pswitch_8
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getPITarget()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Lorg/jdom2/input/stax/StAXFilter;->includeProcessingInstruction(ILjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 277
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getPITarget()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getPIData()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 222
    :pswitch_9
    new-instance p1, Lorg/jdom2/JDOMException;

    const-string p2, "Illegal state for XMLStreamReader. Cannot get XML Fragment for state END_ELEMENT"

    invoke-direct {p1, p2}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 225
    :pswitch_a
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getName()Ljavax/xml/namespace/QName;

    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljavax/xml/namespace/QName;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v2

    invoke-interface {p3, v1, v3, v2}, Lorg/jdom2/input/stax/StAXFilter;->includeElement(ILjava/lang/String;Lorg/jdom2/Namespace;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 228
    invoke-static {p1, p2, v1, p3}, Lorg/jdom2/input/StAXStreamBuilder;->processPrunableElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;ILorg/jdom2/input/stax/StAXFilter;)Lorg/jdom2/Element;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1
    add-int/lit8 v2, v1, 0x1

    :cond_2
    :goto_1
    if-le v2, v1, :cond_4

    .line 233
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 234
    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->next()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_4
    move v1, v2

    goto/16 :goto_0

    .line 283
    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected XMLStream event "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljavax/xml/stream/XMLStreamException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    return-object v0

    :catch_0
    move-exception p1

    .line 287
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Unable to process fragments from XMLStreamReader."

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 206
    :cond_6
    new-instance p1, Lorg/jdom2/JDOMException;

    const-string p2, "JDOM requires that XMLStreamReaders are at their beginning when being processed."

    invoke-direct {p1, p2}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static final processPrunableElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;ILorg/jdom2/input/stax/StAXFilter;)Lorg/jdom2/Element;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/stream/XMLStreamException;,
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 298
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_8

    .line 304
    invoke-static {p0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->processElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;

    move-result-object v0

    add-int/lit8 v2, p2, 0x1

    move-object v3, v0

    :cond_0
    :goto_0
    if-le v2, p2, :cond_7

    .line 308
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 309
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    move-result v4

    const/16 v5, 0x9

    if-eq v4, v5, :cond_6

    const/16 v5, 0xc

    if-eq v4, v5, :cond_5

    packed-switch v4, :pswitch_data_0

    .line 370
    new-instance p0, Lorg/jdom2/JDOMException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unexpected XMLStream event "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getEventType()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 351
    :pswitch_0
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v2, v4}, Lorg/jdom2/input/stax/StAXFilter;->pruneComment(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 352
    invoke-interface {p0, v4}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_0

    .line 345
    :pswitch_1
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v2, v4}, Lorg/jdom2/input/stax/StAXFilter;->pruneText(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 346
    invoke-interface {p0, v4}, Lorg/jdom2/JDOMFactory;->text(Ljava/lang/String;)Lorg/jdom2/Text;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_0

    .line 363
    :pswitch_2
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPITarget()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v2, v4}, Lorg/jdom2/input/stax/StAXFilter;->pruneProcessingInstruction(ILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 364
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPITarget()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getPIData()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0, v4, v5}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_0

    .line 334
    :pswitch_3
    invoke-virtual {v3}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 311
    :pswitch_4
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getName()Ljavax/xml/namespace/QName;

    move-result-object v4

    .line 312
    invoke-virtual {v4}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljavax/xml/namespace/QName;->getPrefix()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v4

    invoke-interface {p3, v2, v5, v4}, Lorg/jdom2/input/stax/StAXFilter;->pruneElement(ILjava/lang/String;Lorg/jdom2/Namespace;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 315
    invoke-static {p0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->processElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Element;

    move-result-object v4

    .line 316
    invoke-virtual {v3, v4}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    add-int/lit8 v2, v2, 0x1

    move-object v3, v4

    goto/16 :goto_0

    :cond_1
    add-int/lit8 v4, v2, 0x1

    :cond_2
    :goto_1
    if-le v4, v2, :cond_4

    .line 323
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->next()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_4

    if-ne v5, v1, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x2

    if-ne v5, v6, :cond_2

    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_4
    move v2, v4

    goto/16 :goto_0

    .line 338
    :cond_5
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v2, v4}, Lorg/jdom2/input/stax/StAXFilter;->pruneCDATA(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 339
    invoke-interface {p0, v4}, Lorg/jdom2/JDOMFactory;->cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto/16 :goto_0

    .line 357
    :cond_6
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getLocalName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v2, v4}, Lorg/jdom2/input/stax/StAXFilter;->pruneEntityRef(ILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 358
    invoke-interface {p1}, Ljavax/xml/stream/XMLStreamReader;->getLocalName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0, v4}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto/16 :goto_0

    :cond_7
    return-object v0

    .line 299
    :cond_8
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "JDOM requires that the XMLStreamReader is at the START_ELEMENT state when retrieving an Element Fragment."

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public build(Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 561
    iget-object v0, p0, Lorg/jdom2/input/StAXStreamBuilder;->builderfactory:Lorg/jdom2/JDOMFactory;

    invoke-static {v0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->process(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public buildFragments(Ljavax/xml/stream/XMLStreamReader;Lorg/jdom2/input/stax/StAXFilter;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/xml/stream/XMLStreamReader;",
            "Lorg/jdom2/input/stax/StAXFilter;",
            ")",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 573
    iget-object v0, p0, Lorg/jdom2/input/StAXStreamBuilder;->builderfactory:Lorg/jdom2/JDOMFactory;

    invoke-direct {p0, v0, p1, p2}, Lorg/jdom2/input/StAXStreamBuilder;->processFragments(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;Lorg/jdom2/input/stax/StAXFilter;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public fragment(Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Content;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 587
    iget-object v0, p0, Lorg/jdom2/input/StAXStreamBuilder;->builderfactory:Lorg/jdom2/JDOMFactory;

    invoke-static {v0, p1}, Lorg/jdom2/input/StAXStreamBuilder;->processFragment(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLStreamReader;)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public getFactory()Lorg/jdom2/JDOMFactory;
    .locals 1

    .line 537
    iget-object v0, p0, Lorg/jdom2/input/StAXStreamBuilder;->builderfactory:Lorg/jdom2/JDOMFactory;

    return-object v0
.end method

.method public setFactory(Lorg/jdom2/JDOMFactory;)V
    .locals 0

    .line 547
    iput-object p1, p0, Lorg/jdom2/input/StAXStreamBuilder;->builderfactory:Lorg/jdom2/JDOMFactory;

    return-void
.end method
