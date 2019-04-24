.class public Lorg/jdom2/input/JDOMParseException;
.super Lorg/jdom2/JDOMException;
.source "JDOMParseException.java"


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private final partialDocument:Lorg/jdom2/Document;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    .line 90
    invoke-direct {p0, p1, p2, v0}, Lorg/jdom2/input/JDOMParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lorg/jdom2/Document;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lorg/jdom2/Document;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1, p2}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    iput-object p3, p0, Lorg/jdom2/input/JDOMParseException;->partialDocument:Lorg/jdom2/Document;

    return-void
.end method


# virtual methods
.method public getColumnNumber()I
    .locals 1

    .line 170
    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lorg/xml/sax/SAXParseException;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lorg/xml/sax/SAXParseException;

    invoke-virtual {v0}, Lorg/xml/sax/SAXParseException;->getColumnNumber()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getLineNumber()I
    .locals 1

    .line 156
    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lorg/xml/sax/SAXParseException;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lorg/xml/sax/SAXParseException;

    invoke-virtual {v0}, Lorg/xml/sax/SAXParseException;->getLineNumber()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getPartialDocument()Lorg/jdom2/Document;
    .locals 1

    .line 119
    iget-object v0, p0, Lorg/jdom2/input/JDOMParseException;->partialDocument:Lorg/jdom2/Document;

    return-object v0
.end method

.method public getPublicId()Ljava/lang/String;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lorg/xml/sax/SAXParseException;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lorg/xml/sax/SAXParseException;

    invoke-virtual {v0}, Lorg/xml/sax/SAXParseException;->getPublicId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSystemId()Ljava/lang/String;
    .locals 1

    .line 142
    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lorg/xml/sax/SAXParseException;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/jdom2/input/JDOMParseException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lorg/xml/sax/SAXParseException;

    invoke-virtual {v0}, Lorg/xml/sax/SAXParseException;->getSystemId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
