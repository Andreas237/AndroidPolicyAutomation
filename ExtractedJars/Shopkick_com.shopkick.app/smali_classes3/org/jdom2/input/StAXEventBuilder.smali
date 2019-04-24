.class public Lorg/jdom2/input/StAXEventBuilder;
.super Ljava/lang/Object;
.source "StAXEventBuilder.java"


# instance fields
.field private factory:Lorg/jdom2/JDOMFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    new-instance v0, Lorg/jdom2/DefaultJDOMFactory;

    invoke-direct {v0}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    iput-object v0, p0, Lorg/jdom2/input/StAXEventBuilder;->factory:Lorg/jdom2/JDOMFactory;

    return-void
.end method

.method private static final process(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLEventReader;)Lorg/jdom2/Document;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 127
    :try_start_0
    invoke-interface {p0, v0}, Lorg/jdom2/JDOMFactory;->document(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    move-result-object v1

    .line 130
    invoke-interface {p1}, Ljavax/xml/stream/XMLEventReader;->peek()Ljavax/xml/stream/events/XMLEvent;

    move-result-object v2

    const/4 v3, 0x7

    .line 132
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->getEventType()I

    move-result v4

    if-ne v3, v4, :cond_e

    .line 139
    :goto_0
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->getEventType()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_d

    .line 140
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->isStartDocument()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 141
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->getLocation()Ljavax/xml/stream/Location;

    move-result-object v3

    invoke-interface {v3}, Ljavax/xml/stream/Location;->getSystemId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/jdom2/Document;->setBaseURI(Ljava/lang/String;)V

    const-string v3, "ENCODING_SCHEME"

    .line 142
    move-object v4, v2

    check-cast v4, Ljavax/xml/stream/events/StartDocument;

    invoke-interface {v4}, Ljavax/xml/stream/events/StartDocument;->getCharacterEncodingScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/jdom2/Document;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "STANDALONE"

    .line 144
    check-cast v2, Ljavax/xml/stream/events/StartDocument;

    invoke-interface {v2}, Ljavax/xml/stream/events/StartDocument;->isStandalone()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lorg/jdom2/Document;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 148
    :cond_0
    instance-of v3, v2, Ljavax/xml/stream/events/DTD;

    if-eqz v3, :cond_1

    .line 151
    check-cast v2, Ljavax/xml/stream/events/DTD;

    invoke-interface {v2}, Ljavax/xml/stream/events/DTD;->getDocumentTypeDeclaration()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p0}, Lorg/jdom2/input/stax/DTDParser;->parse(Ljava/lang/String;Lorg/jdom2/JDOMFactory;)Lorg/jdom2/DocType;

    move-result-object v2

    .line 152
    invoke-virtual {v1, v2}, Lorg/jdom2/Document;->setDocType(Lorg/jdom2/DocType;)Lorg/jdom2/Document;

    goto/16 :goto_2

    .line 153
    :cond_1
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->isStartElement()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 154
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->asStartElement()Ljavax/xml/stream/events/StartElement;

    move-result-object v2

    invoke-static {p0, v2}, Lorg/jdom2/input/StAXEventBuilder;->processElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/events/StartElement;)Lorg/jdom2/Element;

    move-result-object v2

    if-nez v0, :cond_2

    .line 156
    invoke-virtual {v1, v2}, Lorg/jdom2/Document;->setRootElement(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    .line 157
    invoke-virtual {v1}, Lorg/jdom2/Document;->getDocType()Lorg/jdom2/DocType;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 159
    invoke-virtual {v2}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/jdom2/DocType;->setElementName(Ljava/lang/String;)Lorg/jdom2/DocType;

    goto :goto_1

    .line 162
    :cond_2
    invoke-virtual {v0, v2}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    :cond_3
    :goto_1
    move-object v0, v2

    goto/16 :goto_2

    .line 165
    :cond_4
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->isCharacters()Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v0, :cond_6

    .line 168
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->asCharacters()Ljavax/xml/stream/events/Characters;

    move-result-object v3

    .line 169
    invoke-interface {v3}, Ljavax/xml/stream/events/Characters;->isCData()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 170
    check-cast v2, Ljavax/xml/stream/events/Characters;

    invoke-interface {v2}, Ljavax/xml/stream/events/Characters;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Lorg/jdom2/JDOMFactory;->cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_2

    .line 173
    :cond_5
    check-cast v2, Ljavax/xml/stream/events/Characters;

    invoke-interface {v2}, Ljavax/xml/stream/events/Characters;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Lorg/jdom2/JDOMFactory;->text(Ljava/lang/String;)Lorg/jdom2/Text;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_2

    .line 176
    :cond_6
    instance-of v3, v2, Ljavax/xml/stream/events/Comment;

    if-eqz v3, :cond_8

    .line 177
    check-cast v2, Ljavax/xml/stream/events/Comment;

    invoke-interface {v2}, Ljavax/xml/stream/events/Comment;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object v2

    if-nez v0, :cond_7

    .line 180
    invoke-virtual {v1, v2}, Lorg/jdom2/Document;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;

    goto :goto_2

    .line 182
    :cond_7
    invoke-virtual {v0, v2}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_2

    .line 184
    :cond_8
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->isEntityReference()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 185
    check-cast v2, Ljavax/xml/stream/events/EntityReference;

    invoke-interface {v2}, Ljavax/xml/stream/events/EntityReference;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_2

    .line 187
    :cond_9
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->isProcessingInstruction()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 188
    move-object v3, v2

    check-cast v3, Ljavax/xml/stream/events/ProcessingInstruction;

    invoke-interface {v3}, Ljavax/xml/stream/events/ProcessingInstruction;->getTarget()Ljava/lang/String;

    move-result-object v3

    check-cast v2, Ljavax/xml/stream/events/ProcessingInstruction;

    invoke-interface {v2}, Ljavax/xml/stream/events/ProcessingInstruction;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v3, v2}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object v2

    if-nez v0, :cond_a

    .line 192
    invoke-virtual {v1, v2}, Lorg/jdom2/Document;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Document;

    goto :goto_2

    .line 194
    :cond_a
    invoke-virtual {v0, v2}, Lorg/jdom2/Element;->addContent(Lorg/jdom2/Content;)Lorg/jdom2/Element;

    goto :goto_2

    .line 196
    :cond_b
    invoke-interface {v2}, Ljavax/xml/stream/events/XMLEvent;->isEndElement()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 197
    invoke-virtual {v0}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v0

    .line 199
    :cond_c
    :goto_2
    invoke-interface {p1}, Ljavax/xml/stream/XMLEventReader;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 200
    invoke-interface {p1}, Ljavax/xml/stream/XMLEventReader;->nextEvent()Ljavax/xml/stream/events/XMLEvent;

    move-result-object v2

    goto/16 :goto_0

    :cond_d
    return-object v1

    .line 133
    :cond_e
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string p1, "JDOM requires that XMLStreamReaders are at their beginning when being processed."

    invoke-direct {p0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljavax/xml/stream/XMLStreamException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 207
    new-instance p1, Lorg/jdom2/JDOMException;

    const-string v0, "Unable to process XMLStream. See Cause."

    invoke-direct {p1, v0, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private static final processElement(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/events/StartElement;)Lorg/jdom2/Element;
    .locals 6

    .line 213
    invoke-interface {p1}, Ljavax/xml/stream/events/StartElement;->getName()Ljavax/xml/namespace/QName;

    move-result-object v0

    .line 215
    invoke-virtual {v0}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljavax/xml/namespace/QName;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v0

    invoke-interface {p0, v1, v0}, Lorg/jdom2/JDOMFactory;->element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object v0

    .line 219
    invoke-interface {p1}, Ljavax/xml/stream/events/StartElement;->getAttributes()Ljava/util/Iterator;

    move-result-object v1

    .line 220
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 222
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljavax/xml/stream/events/Attribute;

    .line 225
    invoke-interface {v2}, Ljavax/xml/stream/events/Attribute;->getName()Ljavax/xml/namespace/QName;

    move-result-object v3

    .line 227
    invoke-virtual {v3}, Ljavax/xml/namespace/QName;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v4

    .line 230
    invoke-virtual {v3}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Ljavax/xml/stream/events/Attribute;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2}, Ljavax/xml/stream/events/Attribute;->getDTDType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/jdom2/AttributeType;->getAttributeType(Ljava/lang/String;)Lorg/jdom2/AttributeType;

    move-result-object v2

    invoke-interface {p0, v3, v5, v2, v4}, Lorg/jdom2/JDOMFactory;->attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object v2

    invoke-interface {p0, v0, v2}, Lorg/jdom2/JDOMFactory;->setAttribute(Lorg/jdom2/Element;Lorg/jdom2/Attribute;)V

    goto :goto_0

    .line 235
    :cond_0
    invoke-interface {p1}, Ljavax/xml/stream/events/StartElement;->getNamespaces()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 236
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/xml/stream/events/Namespace;

    .line 239
    invoke-interface {p1}, Ljavax/xml/stream/events/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ljavax/xml/stream/events/Namespace;->getNamespaceURI()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/jdom2/Element;->addNamespaceDeclaration(Lorg/jdom2/Namespace;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method


# virtual methods
.method public build(Ljavax/xml/stream/XMLEventReader;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 280
    iget-object v0, p0, Lorg/jdom2/input/StAXEventBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-static {v0, p1}, Lorg/jdom2/input/StAXEventBuilder;->process(Lorg/jdom2/JDOMFactory;Ljavax/xml/stream/XMLEventReader;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public getFactory()Lorg/jdom2/JDOMFactory;
    .locals 1

    .line 256
    iget-object v0, p0, Lorg/jdom2/input/StAXEventBuilder;->factory:Lorg/jdom2/JDOMFactory;

    return-object v0
.end method

.method public setFactory(Lorg/jdom2/JDOMFactory;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lorg/jdom2/input/StAXEventBuilder;->factory:Lorg/jdom2/JDOMFactory;

    return-void
.end method
