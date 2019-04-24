.class public abstract Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;
.super Ljava/lang/Object;
.source "AbstractReaderSchemaFactory.java"

# interfaces
.implements Lorg/jdom2/input/sax/XMLReaderJDOMFactory;


# instance fields
.field private final saxfac:Ljavax/xml/parsers/SAXParserFactory;


# direct methods
.method public constructor <init>(Ljavax/xml/parsers/SAXParserFactory;Ljavax/xml/validation/Schema;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    .line 100
    iput-object p1, p0, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;->saxfac:Ljavax/xml/parsers/SAXParserFactory;

    .line 101
    iget-object p1, p0, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;->saxfac:Ljavax/xml/parsers/SAXParserFactory;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 102
    invoke-virtual {p1, v0}, Ljavax/xml/parsers/SAXParserFactory;->setNamespaceAware(Z)V

    .line 103
    iget-object p1, p0, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;->saxfac:Ljavax/xml/parsers/SAXParserFactory;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljavax/xml/parsers/SAXParserFactory;->setValidating(Z)V

    .line 104
    iget-object p1, p0, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;->saxfac:Ljavax/xml/parsers/SAXParserFactory;

    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setSchema(Ljavax/xml/validation/Schema;)V

    :cond_0
    return-void

    .line 97
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot create a SchemaXMLReaderFactory with a null schema"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public createXMLReader()Lorg/xml/sax/XMLReader;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;->saxfac:Ljavax/xml/parsers/SAXParserFactory;

    if-eqz v0, :cond_0

    .line 116
    :try_start_0
    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v0
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 121
    new-instance v1, Lorg/jdom2/JDOMException;

    const-string v2, "Could not create a new Schema-Validating XMLReader."

    invoke-direct {v1, v2, v0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 118
    new-instance v1, Lorg/jdom2/JDOMException;

    const-string v2, "Could not create a new Schema-Validating XMLReader."

    invoke-direct {v1, v2, v0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 111
    :cond_0
    new-instance v0, Lorg/jdom2/JDOMException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It was not possible to configure a suitable XMLReader to support "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isValidating()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
