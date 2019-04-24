.class public Lorg/jdom2/transform/XSLTransformer;
.super Ljava/lang/Object;
.source "XSLTransformer.java"


# instance fields
.field private factory:Lorg/jdom2/JDOMFactory;

.field private templates:Ljavax/xml/transform/Templates;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 187
    new-instance v0, Ljavax/xml/transform/stream/StreamSource;

    invoke-direct {v0, p1}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v0}, Lorg/jdom2/transform/XSLTransformer;-><init>(Ljavax/xml/transform/Source;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 157
    new-instance v0, Ljavax/xml/transform/stream/StreamSource;

    invoke-direct {v0, p1}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Lorg/jdom2/transform/XSLTransformer;-><init>(Ljavax/xml/transform/Source;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 172
    new-instance v0, Ljavax/xml/transform/stream/StreamSource;

    invoke-direct {v0, p1}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/io/Reader;)V

    invoke-direct {p0, v0}, Lorg/jdom2/transform/XSLTransformer;-><init>(Ljavax/xml/transform/Source;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 142
    new-instance v0, Ljavax/xml/transform/stream/StreamSource;

    invoke-direct {v0, p1}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/jdom2/transform/XSLTransformer;-><init>(Ljavax/xml/transform/Source;)V

    return-void
.end method

.method private constructor <init>(Ljavax/xml/transform/Source;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 122
    iput-object v0, p0, Lorg/jdom2/transform/XSLTransformer;->factory:Lorg/jdom2/JDOMFactory;

    .line 127
    :try_start_0
    invoke-static {}, Ljavax/xml/transform/TransformerFactory;->newInstance()Ljavax/xml/transform/TransformerFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljavax/xml/transform/TransformerFactory;->newTemplates(Ljavax/xml/transform/Source;)Ljavax/xml/transform/Templates;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/transform/XSLTransformer;->templates:Ljavax/xml/transform/Templates;
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 131
    new-instance v0, Lorg/jdom2/transform/XSLTransformException;

    const-string v1, "Could not construct XSLTransformer"

    invoke-direct {v0, v1, p1}, Lorg/jdom2/transform/XSLTransformException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public constructor <init>(Lorg/jdom2/Document;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 202
    new-instance v0, Lorg/jdom2/transform/JDOMSource;

    invoke-direct {v0, p1}, Lorg/jdom2/transform/JDOMSource;-><init>(Lorg/jdom2/Document;)V

    invoke-direct {p0, v0}, Lorg/jdom2/transform/XSLTransformer;-><init>(Ljavax/xml/transform/Source;)V

    return-void
.end method


# virtual methods
.method public getFactory()Lorg/jdom2/JDOMFactory;
    .locals 1

    .line 283
    iget-object v0, p0, Lorg/jdom2/transform/XSLTransformer;->factory:Lorg/jdom2/JDOMFactory;

    return-object v0
.end method

.method public setFactory(Lorg/jdom2/JDOMFactory;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lorg/jdom2/transform/XSLTransformer;->factory:Lorg/jdom2/JDOMFactory;

    return-void
.end method

.method public transform(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;)",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 213
    new-instance v0, Lorg/jdom2/transform/JDOMSource;

    invoke-direct {v0, p1}, Lorg/jdom2/transform/JDOMSource;-><init>(Ljava/util/List;)V

    .line 214
    new-instance p1, Lorg/jdom2/transform/JDOMResult;

    invoke-direct {p1}, Lorg/jdom2/transform/JDOMResult;-><init>()V

    .line 215
    iget-object v1, p0, Lorg/jdom2/transform/XSLTransformer;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p1, v1}, Lorg/jdom2/transform/JDOMResult;->setFactory(Lorg/jdom2/JDOMFactory;)V

    .line 217
    :try_start_0
    iget-object v1, p0, Lorg/jdom2/transform/XSLTransformer;->templates:Ljavax/xml/transform/Templates;

    invoke-interface {v1}, Ljavax/xml/transform/Templates;->newTransformer()Ljavax/xml/transform/Transformer;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Ljavax/xml/transform/Transformer;->transform(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    .line 218
    invoke-virtual {p1}, Lorg/jdom2/transform/JDOMResult;->getResult()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 221
    new-instance v0, Lorg/jdom2/transform/XSLTransformException;

    const-string v1, "Could not perform transformation"

    invoke-direct {v0, v1, p1}, Lorg/jdom2/transform/XSLTransformException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public transform(Lorg/jdom2/Document;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 233
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/transform/XSLTransformer;->transform(Lorg/jdom2/Document;Lorg/xml/sax/EntityResolver;)Lorg/jdom2/Document;

    move-result-object p1

    return-object p1
.end method

.method public transform(Lorg/jdom2/Document;Lorg/xml/sax/EntityResolver;)Lorg/jdom2/Document;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/transform/XSLTransformException;
        }
    .end annotation

    .line 245
    new-instance v0, Lorg/jdom2/transform/JDOMSource;

    invoke-direct {v0, p1, p2}, Lorg/jdom2/transform/JDOMSource;-><init>(Lorg/jdom2/Document;Lorg/xml/sax/EntityResolver;)V

    .line 246
    new-instance p1, Lorg/jdom2/transform/JDOMResult;

    invoke-direct {p1}, Lorg/jdom2/transform/JDOMResult;-><init>()V

    .line 247
    iget-object p2, p0, Lorg/jdom2/transform/XSLTransformer;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p1, p2}, Lorg/jdom2/transform/JDOMResult;->setFactory(Lorg/jdom2/JDOMFactory;)V

    .line 249
    :try_start_0
    iget-object p2, p0, Lorg/jdom2/transform/XSLTransformer;->templates:Ljavax/xml/transform/Templates;

    invoke-interface {p2}, Ljavax/xml/transform/Templates;->newTransformer()Ljavax/xml/transform/Transformer;

    move-result-object p2

    invoke-virtual {p2, v0, p1}, Ljavax/xml/transform/Transformer;->transform(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    .line 250
    invoke-virtual {p1}, Lorg/jdom2/transform/JDOMResult;->getDocument()Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 253
    new-instance p2, Lorg/jdom2/transform/XSLTransformException;

    const-string v0, "Could not perform transformation"

    invoke-direct {p2, v0, p1}, Lorg/jdom2/transform/XSLTransformException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method
