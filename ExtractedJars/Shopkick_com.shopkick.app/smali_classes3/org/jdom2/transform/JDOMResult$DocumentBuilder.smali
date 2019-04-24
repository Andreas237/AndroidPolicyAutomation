.class Lorg/jdom2/transform/JDOMResult$DocumentBuilder;
.super Lorg/xml/sax/helpers/XMLFilterImpl;
.source "JDOMResult.java"

# interfaces
.implements Lorg/xml/sax/ext/LexicalHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/transform/JDOMResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DocumentBuilder"
.end annotation


# instance fields
.field private saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

.field private startDocumentReceived:Z

.field final synthetic this$0:Lorg/jdom2/transform/JDOMResult;


# direct methods
.method public constructor <init>(Lorg/jdom2/transform/JDOMResult;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->this$0:Lorg/jdom2/transform/JDOMResult;

    invoke-direct {p0}, Lorg/xml/sax/helpers/XMLFilterImpl;-><init>()V

    const/4 p1, 0x0

    .line 424
    iput-object p1, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    const/4 p1, 0x0

    .line 430
    iput-boolean p1, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->startDocumentReceived:Z

    return-void
.end method

.method private ensureInitialization()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 464
    iget-boolean v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->startDocumentReceived:Z

    if-nez v0, :cond_0

    .line 465
    invoke-virtual {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->startDocument()V

    :cond_0
    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 550
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 551
    invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/XMLFilterImpl;->characters([CII)V

    return-void
.end method

.method public comment([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 687
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 688
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-virtual {v0, p1, p2, p3}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->comment([CII)V

    return-void
.end method

.method public endCDATA()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 671
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->endCDATA()V

    return-void
.end method

.method public endDTD()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 619
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->endDTD()V

    return-void
.end method

.method public endEntity(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 648
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-virtual {v0, p1}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->endEntity(Ljava/lang/String;)V

    return-void
.end method

.method public getResult()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 448
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 450
    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->getResult()Ljava/util/List;

    move-result-object v0

    .line 453
    iput-object v1, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    const/4 v1, 0x0

    .line 456
    iput-boolean v1, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->startDocumentReceived:Z

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public ignorableWhitespace([CII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 561
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 562
    invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/XMLFilterImpl;->ignorableWhitespace([CII)V

    return-void
.end method

.method public processingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 572
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 573
    invoke-super {p0, p1, p2}, Lorg/xml/sax/helpers/XMLFilterImpl;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public skippedEntity(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 582
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 583
    invoke-super {p0, p1}, Lorg/xml/sax/helpers/XMLFilterImpl;->skippedEntity(Ljava/lang/String;)V

    return-void
.end method

.method public startCDATA()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 659
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 660
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-virtual {v0}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->startCDATA()V

    return-void
.end method

.method public startDTD(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 607
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 608
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-virtual {v0, p1, p2, p3}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->startDTD(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public startDocument()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 485
    iput-boolean v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->startDocumentReceived:Z

    .line 488
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->this$0:Lorg/jdom2/transform/JDOMResult;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/jdom2/transform/JDOMResult;->setResult(Ljava/util/List;)V

    .line 494
    new-instance v0, Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    iget-object v1, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->this$0:Lorg/jdom2/transform/JDOMResult;

    invoke-virtual {v1}, Lorg/jdom2/transform/JDOMResult;->getFactory()Lorg/jdom2/JDOMFactory;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;-><init>(Lorg/jdom2/JDOMFactory;)V

    iput-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    .line 495
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-super {p0, v0}, Lorg/xml/sax/helpers/XMLFilterImpl;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    .line 498
    invoke-super {p0}, Lorg/xml/sax/helpers/XMLFilterImpl;->startDocument()V

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 528
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 529
    invoke-super {p0, p1, p2, p3, p4}, Lorg/xml/sax/helpers/XMLFilterImpl;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method

.method public startEntity(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 634
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 635
    iget-object v0, p0, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->saxHandler:Lorg/jdom2/transform/JDOMResult$FragmentHandler;

    invoke-virtual {v0, p1}, Lorg/jdom2/transform/JDOMResult$FragmentHandler;->startEntity(Ljava/lang/String;)V

    return-void
.end method

.method public startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 539
    invoke-direct {p0}, Lorg/jdom2/transform/JDOMResult$DocumentBuilder;->ensureInitialization()V

    .line 540
    invoke-super {p0, p1, p2}, Lorg/xml/sax/helpers/XMLFilterImpl;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
