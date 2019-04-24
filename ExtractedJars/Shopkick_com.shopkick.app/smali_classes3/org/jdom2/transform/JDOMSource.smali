.class public Lorg/jdom2/transform/JDOMSource;
.super Ljavax/xml/transform/sax/SAXSource;
.source "JDOMSource.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/transform/JDOMSource$DocumentReader;,
        Lorg/jdom2/transform/JDOMSource$JDOMInputSource;
    }
.end annotation


# static fields
.field public static final JDOM_FEATURE:Ljava/lang/String; = "http://jdom.org/jdom2/transform/JDOMSource/feature"


# instance fields
.field private resolver:Lorg/xml/sax/EntityResolver;

.field private xmlReader:Lorg/xml/sax/XMLReader;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .line 166
    invoke-direct {p0}, Ljavax/xml/transform/sax/SAXSource;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput-object v0, p0, Lorg/jdom2/transform/JDOMSource;->xmlReader:Lorg/xml/sax/XMLReader;

    .line 142
    iput-object v0, p0, Lorg/jdom2/transform/JDOMSource;->resolver:Lorg/xml/sax/EntityResolver;

    .line 167
    invoke-virtual {p0, p1}, Lorg/jdom2/transform/JDOMSource;->setNodes(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/Document;)V
    .locals 1

    const/4 v0, 0x0

    .line 154
    invoke-direct {p0, p1, v0}, Lorg/jdom2/transform/JDOMSource;-><init>(Lorg/jdom2/Document;Lorg/xml/sax/EntityResolver;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/Document;Lorg/xml/sax/EntityResolver;)V
    .locals 1

    .line 199
    invoke-direct {p0}, Ljavax/xml/transform/sax/SAXSource;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput-object v0, p0, Lorg/jdom2/transform/JDOMSource;->xmlReader:Lorg/xml/sax/XMLReader;

    .line 142
    iput-object v0, p0, Lorg/jdom2/transform/JDOMSource;->resolver:Lorg/xml/sax/EntityResolver;

    .line 200
    invoke-virtual {p0, p1}, Lorg/jdom2/transform/JDOMSource;->setDocument(Lorg/jdom2/Document;)V

    .line 201
    iput-object p2, p0, Lorg/jdom2/transform/JDOMSource;->resolver:Lorg/xml/sax/EntityResolver;

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {p1}, Lorg/jdom2/Document;->getBaseURI()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 203
    invoke-virtual {p1}, Lorg/jdom2/Document;->getBaseURI()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Ljavax/xml/transform/sax/SAXSource;->setSystemId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/jdom2/Element;)V
    .locals 1

    .line 179
    invoke-direct {p0}, Ljavax/xml/transform/sax/SAXSource;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput-object v0, p0, Lorg/jdom2/transform/JDOMSource;->xmlReader:Lorg/xml/sax/XMLReader;

    .line 142
    iput-object v0, p0, Lorg/jdom2/transform/JDOMSource;->resolver:Lorg/xml/sax/EntityResolver;

    .line 180
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 181
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    invoke-virtual {p0, v0}, Lorg/jdom2/transform/JDOMSource;->setNodes(Ljava/util/List;)V

    return-void
.end method

.method private buildDocumentReader()Lorg/xml/sax/XMLReader;
    .locals 2

    .line 353
    new-instance v0, Lorg/jdom2/transform/JDOMSource$DocumentReader;

    invoke-direct {v0}, Lorg/jdom2/transform/JDOMSource$DocumentReader;-><init>()V

    .line 354
    iget-object v1, p0, Lorg/jdom2/transform/JDOMSource;->resolver:Lorg/xml/sax/EntityResolver;

    if-eqz v1, :cond_0

    .line 355
    invoke-virtual {v0, v1}, Lorg/jdom2/transform/JDOMSource$DocumentReader;->setEntityResolver(Lorg/xml/sax/EntityResolver;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public getDocument()Lorg/jdom2/Document;
    .locals 2

    .line 231
    invoke-virtual {p0}, Lorg/jdom2/transform/JDOMSource;->getInputSource()Lorg/xml/sax/InputSource;

    move-result-object v0

    check-cast v0, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;

    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;->getSource()Ljava/lang/Object;

    move-result-object v0

    .line 234
    instance-of v1, v0, Lorg/jdom2/Document;

    if-eqz v1, :cond_0

    .line 235
    check-cast v0, Lorg/jdom2/Document;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getNodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 264
    invoke-virtual {p0}, Lorg/jdom2/transform/JDOMSource;->getInputSource()Lorg/xml/sax/InputSource;

    move-result-object v0

    check-cast v0, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;

    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;->getListSource()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getXMLReader()Lorg/xml/sax/XMLReader;
    .locals 1

    .line 338
    iget-object v0, p0, Lorg/jdom2/transform/JDOMSource;->xmlReader:Lorg/xml/sax/XMLReader;

    if-nez v0, :cond_0

    .line 339
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMSource;->buildDocumentReader()Lorg/xml/sax/XMLReader;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/transform/JDOMSource;->xmlReader:Lorg/xml/sax/XMLReader;

    .line 341
    :cond_0
    iget-object v0, p0, Lorg/jdom2/transform/JDOMSource;->xmlReader:Lorg/xml/sax/XMLReader;

    return-object v0
.end method

.method public setDocument(Lorg/jdom2/Document;)V
    .locals 1

    .line 219
    new-instance v0, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;

    invoke-direct {v0, p1}, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;-><init>(Lorg/jdom2/Document;)V

    invoke-super {p0, v0}, Ljavax/xml/transform/sax/SAXSource;->setInputSource(Lorg/xml/sax/InputSource;)V

    return-void
.end method

.method public setInputSource(Lorg/xml/sax/InputSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsupportedOperationException;
        }
    .end annotation

    .line 287
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public setNodes(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .line 252
    new-instance v0, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;

    invoke-direct {v0, p1}, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;-><init>(Ljava/util/List;)V

    invoke-super {p0, v0}, Ljavax/xml/transform/sax/SAXSource;->setInputSource(Lorg/xml/sax/InputSource;)V

    return-void
.end method

.method public setXMLReader(Lorg/xml/sax/XMLReader;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsupportedOperationException;
        }
    .end annotation

    .line 310
    instance-of v0, p1, Lorg/xml/sax/XMLFilter;

    if-eqz v0, :cond_1

    .line 312
    move-object v0, p1

    check-cast v0, Lorg/xml/sax/XMLFilter;

    .line 313
    :goto_0
    invoke-interface {v0}, Lorg/xml/sax/XMLFilter;->getParent()Lorg/xml/sax/XMLReader;

    move-result-object v1

    instance-of v1, v1, Lorg/xml/sax/XMLFilter;

    if-eqz v1, :cond_0

    .line 314
    invoke-interface {v0}, Lorg/xml/sax/XMLFilter;->getParent()Lorg/xml/sax/XMLReader;

    move-result-object v0

    check-cast v0, Lorg/xml/sax/XMLFilter;

    goto :goto_0

    .line 316
    :cond_0
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMSource;->buildDocumentReader()Lorg/xml/sax/XMLReader;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/xml/sax/XMLFilter;->setParent(Lorg/xml/sax/XMLReader;)V

    .line 319
    iput-object p1, p0, Lorg/jdom2/transform/JDOMSource;->xmlReader:Lorg/xml/sax/XMLReader;

    return-void

    .line 322
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
