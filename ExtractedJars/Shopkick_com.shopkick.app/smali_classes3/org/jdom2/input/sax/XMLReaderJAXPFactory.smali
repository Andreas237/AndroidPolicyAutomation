.class public Lorg/jdom2/input/sax/XMLReaderJAXPFactory;
.super Ljava/lang/Object;
.source "XMLReaderJAXPFactory.java"

# interfaces
.implements Lorg/jdom2/input/sax/XMLReaderJDOMFactory;


# instance fields
.field private final instance:Ljavax/xml/parsers/SAXParserFactory;

.field private final validating:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;Z)V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    invoke-static {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->newInstance(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/input/sax/XMLReaderJAXPFactory;->instance:Ljavax/xml/parsers/SAXParserFactory;

    .line 95
    iget-object p1, p0, Lorg/jdom2/input/sax/XMLReaderJAXPFactory;->instance:Ljavax/xml/parsers/SAXParserFactory;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setNamespaceAware(Z)V

    .line 96
    iget-object p1, p0, Lorg/jdom2/input/sax/XMLReaderJAXPFactory;->instance:Ljavax/xml/parsers/SAXParserFactory;

    invoke-virtual {p1, p3}, Ljavax/xml/parsers/SAXParserFactory;->setValidating(Z)V

    .line 97
    iput-boolean p3, p0, Lorg/jdom2/input/sax/XMLReaderJAXPFactory;->validating:Z

    return-void
.end method


# virtual methods
.method public createXMLReader()Lorg/xml/sax/XMLReader;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 103
    :try_start_0
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaderJAXPFactory;->instance:Ljavax/xml/parsers/SAXParserFactory;

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

    .line 108
    new-instance v1, Lorg/jdom2/JDOMException;

    const-string v2, "Unable to create a new XMLReader instance"

    invoke-direct {v1, v2, v0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 105
    new-instance v1, Lorg/jdom2/JDOMException;

    const-string v2, "Unable to create a new XMLReader instance"

    invoke-direct {v1, v2, v0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public isValidating()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lorg/jdom2/input/sax/XMLReaderJAXPFactory;->validating:Z

    return v0
.end method
