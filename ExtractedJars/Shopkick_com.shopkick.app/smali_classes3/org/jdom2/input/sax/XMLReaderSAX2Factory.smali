.class public Lorg/jdom2/input/sax/XMLReaderSAX2Factory;
.super Ljava/lang/Object;
.source "XMLReaderSAX2Factory.java"

# interfaces
.implements Lorg/jdom2/input/sax/XMLReaderJDOMFactory;


# instance fields
.field private final saxdriver:Ljava/lang/String;

.field private final validate:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, p1, v0}, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;-><init>(ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-boolean p1, p0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->validate:Z

    .line 110
    iput-object p2, p0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->saxdriver:Ljava/lang/String;

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

    .line 116
    :try_start_0
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->saxdriver:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Lorg/xml/sax/helpers/XMLReaderFactory;->createXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->saxdriver:Ljava/lang/String;

    invoke-static {v0}, Lorg/xml/sax/helpers/XMLReaderFactory;->createXMLReader(Ljava/lang/String;)Lorg/xml/sax/XMLReader;

    move-result-object v0

    :goto_0
    const-string v1, "http://xml.org/sax/features/validation"

    .line 119
    iget-boolean v2, p0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->validate:Z

    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    const-string v1, "http://xml.org/sax/features/namespaces"

    const/4 v2, 0x1

    .line 122
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    const-string v1, "http://xml.org/sax/features/namespace-prefixes"

    .line 124
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 129
    new-instance v1, Lorg/jdom2/JDOMException;

    const-string v2, "Unable to create SAX2 XMLReader."

    invoke-direct {v1, v2, v0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getDriverClassName()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->saxdriver:Ljava/lang/String;

    return-object v0
.end method

.method public isValidating()Z
    .locals 1

    .line 145
    iget-boolean v0, p0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->validate:Z

    return v0
.end method
