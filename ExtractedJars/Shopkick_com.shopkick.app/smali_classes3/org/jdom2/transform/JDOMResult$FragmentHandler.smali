.class Lorg/jdom2/transform/JDOMResult$FragmentHandler;
.super Lorg/jdom2/input/sax/SAXHandler;
.source "JDOMResult.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/transform/JDOMResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FragmentHandler"
.end annotation


# instance fields
.field private dummyRoot:Lorg/jdom2/Element;


# direct methods
.method public constructor <init>(Lorg/jdom2/JDOMFactory;)V
    .locals 2

    .line 370
    invoke-direct {p0, p1}, Lorg/jdom2/input/sax/SAXHandler;-><init>(Lorg/jdom2/JDOMFactory;)V

    .line 363
    new-instance p1, Lorg/jdom2/Element;

    const-string v0, "root"

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, v1}, Lorg/jdom2/Element;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->dummyRoot:Lorg/jdom2/Element;

    .line 375
    iget-object p1, p0, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->dummyRoot:Lorg/jdom2/Element;

    invoke-virtual {p0, p1}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->pushElement(Lorg/jdom2/Element;)V

    return-void
.end method

.method private getDetachedContent(Lorg/jdom2/Element;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/Element;",
            ")",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 403
    invoke-virtual {p1}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object p1

    .line 404
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 406
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 408
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Content;

    .line 409
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public getResult()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 388
    :try_start_0
    invoke-virtual {p0}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->flushCharacters()V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 391
    :catch_0
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->dummyRoot:Lorg/jdom2/Element;

    invoke-direct {p0, v0}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->getDetachedContent(Lorg/jdom2/Element;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
