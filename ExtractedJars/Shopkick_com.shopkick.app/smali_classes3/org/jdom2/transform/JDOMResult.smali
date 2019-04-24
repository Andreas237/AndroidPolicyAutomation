.class public Lorg/jdom2/transform/JDOMResult;
.super Ljavax/xml/transform/sax/SAXResult;
.source "JDOMResult.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/transform/JDOMResult$DocumentBuilder;,
        Lorg/jdom2/transform/JDOMResult$FragmentHandler;
    }
.end annotation


# static fields
.field public static final JDOM_FEATURE:Ljava/lang/String; = "http://jdom.org/jdom2/transform/JDOMResult/feature"


# instance fields
.field private factory:Lorg/jdom2/JDOMFactory;

.field private queried:Z

.field private resultdoc:Lorg/jdom2/Document;

.field private resultlist:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 140
    invoke-direct {p0}, Ljavax/xml/transform/sax/SAXResult;-><init>()V

    const/4 v0, 0x0

    .line 121
    iput-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    .line 123
    iput-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultdoc:Lorg/jdom2/Document;

    const/4 v1, 0x0

    .line 129
    iput-boolean v1, p0, Lorg/jdom2/transform/JDOMResult;->queried:Z

    .line 135
    iput-object v0, p0, Lorg/jdom2/transform/JDOMResult;->factory:Lorg/jdom2/JDOMFactory;

    .line 142
    new-instance v0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;

    invoke-direct {v0, p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;-><init>(Lorg/jdom2/transform/JDOMResult;)V

    .line 145
    invoke-super {p0, v0}, Ljavax/xml/transform/sax/SAXResult;->setHandler(Lorg/xml/sax/ContentHandler;)V

    .line 146
    invoke-super {p0, v0}, Ljavax/xml/transform/sax/SAXResult;->setLexicalHandler(Lorg/xml/sax/ext/LexicalHandler;)V

    return-void
.end method

.method private retrieveResult()V
    .locals 1

    .line 319
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultdoc:Lorg/jdom2/Document;

    if-nez v0, :cond_0

    .line 320
    invoke-virtual {p0}, Lorg/jdom2/transform/JDOMResult;->getHandler()Lorg/xml/sax/ContentHandler;

    move-result-object v0

    check-cast v0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;

    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->getResult()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jdom2/transform/JDOMResult;->setResult(Ljava/util/List;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getDocument()Lorg/jdom2/Document;
    .locals 3

    .line 255
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult;->retrieveResult()V

    .line 257
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultdoc:Lorg/jdom2/Document;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 261
    :cond_0
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lorg/jdom2/transform/JDOMResult;->queried:Z

    if-nez v0, :cond_2

    .line 264
    :try_start_0
    invoke-virtual {p0}, Lorg/jdom2/transform/JDOMResult;->getFactory()Lorg/jdom2/JDOMFactory;

    move-result-object v0

    if-nez v0, :cond_1

    .line 265
    new-instance v0, Lorg/jdom2/DefaultJDOMFactory;

    invoke-direct {v0}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    .line 267
    :cond_1
    invoke-interface {v0, v1}, Lorg/jdom2/JDOMFactory;->document(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    move-result-object v0

    .line 268
    iget-object v2, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    invoke-virtual {v0, v2}, Lorg/jdom2/Document;->setContent(Ljava/util/Collection;)Lorg/jdom2/Document;

    .line 270
    iput-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultdoc:Lorg/jdom2/Document;

    .line 271
    iput-object v1, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return-object v1

    :cond_2
    move-object v0, v1

    :goto_0
    const/4 v1, 0x1

    .line 280
    iput-boolean v1, p0, Lorg/jdom2/transform/JDOMResult;->queried:Z

    return-object v0
.end method

.method public getFactory()Lorg/jdom2/JDOMFactory;
    .locals 1

    .line 311
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult;->factory:Lorg/jdom2/JDOMFactory;

    return-object v0
.end method

.method public getResult()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 183
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 186
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult;->retrieveResult()V

    .line 188
    iget-object v1, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    if-eqz v1, :cond_0

    goto :goto_1

    .line 192
    :cond_0
    iget-object v1, p0, Lorg/jdom2/transform/JDOMResult;->resultdoc:Lorg/jdom2/Document;

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Lorg/jdom2/transform/JDOMResult;->queried:Z

    if-nez v2, :cond_2

    .line 193
    invoke-virtual {v1}, Lorg/jdom2/Document;->getContent()Ljava/util/List;

    move-result-object v0

    .line 194
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    .line 198
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Content;

    .line 199
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 201
    :cond_1
    iput-object v1, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Lorg/jdom2/transform/JDOMResult;->resultdoc:Lorg/jdom2/Document;

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    const/4 v0, 0x1

    .line 205
    iput-boolean v0, p0, Lorg/jdom2/transform/JDOMResult;->queried:Z

    return-object v1
.end method

.method public setDocument(Lorg/jdom2/Document;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lorg/jdom2/transform/JDOMResult;->resultdoc:Lorg/jdom2/Document;

    const/4 p1, 0x0

    .line 227
    iput-object p1, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    const/4 p1, 0x0

    .line 228
    iput-boolean p1, p0, Lorg/jdom2/transform/JDOMResult;->queried:Z

    return-void
.end method

.method public setFactory(Lorg/jdom2/JDOMFactory;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lorg/jdom2/transform/JDOMResult;->factory:Lorg/jdom2/JDOMFactory;

    return-void
.end method

.method public setHandler(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    return-void
.end method

.method public setLexicalHandler(Lorg/xml/sax/ext/LexicalHandler;)V
    .locals 0

    return-void
.end method

.method public setResult(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .line 166
    iput-object p1, p0, Lorg/jdom2/transform/JDOMResult;->resultlist:Ljava/util/List;

    const/4 p1, 0x0

    .line 167
    iput-boolean p1, p0, Lorg/jdom2/transform/JDOMResult;->queried:Z

    return-void
.end method
