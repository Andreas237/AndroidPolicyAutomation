.class Lorg/jdom2/transform/JDOMSource$DocumentReader;
.super Lorg/jdom2/output/SAXOutputter;
.source "JDOMSource.java"

# interfaces
.implements Lorg/xml/sax/XMLReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/transform/JDOMSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DocumentReader"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 511
    invoke-direct {p0}, Lorg/jdom2/output/SAXOutputter;-><init>()V

    return-void
.end method


# virtual methods
.method public parse(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    .line 532
    new-instance p1, Lorg/xml/sax/SAXNotSupportedException;

    const-string v0, "Only JDOM Documents are supported as input"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXNotSupportedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public parse(Lorg/xml/sax/InputSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 554
    instance-of v0, p1, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;

    if-eqz v0, :cond_1

    .line 556
    :try_start_0
    move-object v0, p1

    check-cast v0, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;

    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;->getDocumentSource()Lorg/jdom2/Document;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 558
    invoke-virtual {p0, v0}, Lorg/jdom2/transform/JDOMSource$DocumentReader;->output(Lorg/jdom2/Document;)V

    goto :goto_0

    .line 561
    :cond_0
    check-cast p1, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;

    invoke-virtual {p1}, Lorg/jdom2/transform/JDOMSource$JDOMInputSource;->getListSource()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/jdom2/transform/JDOMSource$DocumentReader;->output(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/jdom2/JDOMException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 565
    new-instance v0, Lorg/xml/sax/SAXException;

    invoke-virtual {p1}, Lorg/jdom2/JDOMException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 569
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXNotSupportedException;

    const-string v0, "Only JDOM Documents are supported as input"

    invoke-direct {p1, v0}, Lorg/xml/sax/SAXNotSupportedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
