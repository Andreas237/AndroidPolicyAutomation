.class public Lorg/jdom2/input/sax/SAXHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SAXHandler.java"

# interfaces
.implements Lorg/xml/sax/ext/LexicalHandler;
.implements Lorg/xml/sax/ext/DeclHandler;
.implements Lorg/xml/sax/DTDHandler;


# instance fields
.field private atRoot:Z

.field private currentDocument:Lorg/jdom2/Document;

.field private currentElement:Lorg/jdom2/Element;

.field private currentLocator:Lorg/xml/sax/Locator;

.field private final declaredNamespaces:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation
.end field

.field private entityDepth:I

.field private expand:Z

.field private final externalEntities:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final factory:Lorg/jdom2/JDOMFactory;

.field private ignoringBoundaryWhite:Z

.field private ignoringWhite:Z

.field private inCDATA:Z

.field private inDTD:Z

.field private inInternalSubset:Z

.field private final internalSubset:Ljava/lang/StringBuilder;

.field private lastcol:I

.field private lastline:I

.field private previousCDATA:Z

.field private suppress:Z

.field private final textBuffer:Lorg/jdom2/input/sax/TextBuffer;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 195
    invoke-direct {p0, v0}, Lorg/jdom2/input/sax/SAXHandler;-><init>(Lorg/jdom2/JDOMFactory;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/JDOMFactory;)V
    .locals 2

    .line 206
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->declaredNamespaces:Ljava/util/List;

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    .line 136
    new-instance v0, Lorg/jdom2/input/sax/TextBuffer;

    invoke-direct {v0}, Lorg/jdom2/input/sax/TextBuffer;-><init>()V

    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->textBuffer:Lorg/jdom2/input/sax/TextBuffer;

    .line 139
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->externalEntities:Ljava/util/Map;

    const/4 v0, 0x0

    .line 142
    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    .line 145
    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    .line 148
    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    const/4 v0, 0x1

    .line 151
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    const/4 v1, 0x0

    .line 158
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inDTD:Z

    .line 161
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    .line 164
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    .line 167
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    .line 170
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->expand:Z

    .line 176
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    .line 179
    iput v1, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    .line 182
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringWhite:Z

    .line 185
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringBoundaryWhite:Z

    .line 187
    iput v1, p0, Lorg/jdom2/input/sax/SAXHandler;->lastline:I

    iput v1, p0, Lorg/jdom2/input/sax/SAXHandler;->lastcol:I

    if-eqz p1, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    new-instance p1, Lorg/jdom2/DefaultJDOMFactory;

    invoke-direct {p1}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    :goto_0
    iput-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    .line 208
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->reset()V

    return-void
.end method

.method private appendExternalId(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x22

    if-eqz p1, :cond_0

    .line 1113
    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v2, " PUBLIC \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz p2, :cond_2

    if-nez p1, :cond_1

    .line 1117
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, " SYSTEM "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1119
    :cond_1
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1121
    :goto_0
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    return-void
.end method

.method private transferNamespaces(Lorg/jdom2/Element;)V
    .locals 3

    .line 734
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->declaredNamespaces:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Namespace;

    .line 735
    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v2

    if-eq v1, v2, :cond_0

    .line 736
    invoke-virtual {p1, v1}, Lorg/jdom2/Element;->addNamespaceDeclaration(Lorg/jdom2/Namespace;)Z

    goto :goto_0

    .line 739
    :cond_1
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->declaredNamespaces:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method


# virtual methods
.method public attributeDecl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 415
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    if-nez v0, :cond_0

    return-void

    .line 418
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, "  <!ATTLIST "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    if-eqz p4, :cond_1

    .line 421
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 423
    :cond_1
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    if-eqz p4, :cond_2

    const-string p2, "#FIXED"

    .line 425
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 426
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string p3, " \""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 428
    :cond_2
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string p2, ">\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public characters([CII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 756
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-nez v0, :cond_3

    if-nez p3, :cond_0

    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 759
    :cond_0
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    iget-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    if-eq v0, v1, :cond_1

    .line 760
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 763
    :cond_1
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->textBuffer:Lorg/jdom2/input/sax/TextBuffer;

    invoke-virtual {v0, p1, p2, p3}, Lorg/jdom2/input/sax/TextBuffer;->append([CII)V

    .line 765
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-eqz p1, :cond_2

    .line 766
    invoke-interface {p1}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result p1

    iput p1, p0, Lorg/jdom2/input/sax/SAXHandler;->lastline:I

    .line 767
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    invoke-interface {p1}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result p1

    iput p1, p0, Lorg/jdom2/input/sax/SAXHandler;->lastcol:I

    :cond_2
    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public comment([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1032
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-eqz v0, :cond_0

    return-void

    .line 1035
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 1037
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 1038
    iget-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->inDTD:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->expand:Z

    if-nez p1, :cond_1

    .line 1039
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string p2, "  <!--"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "-->\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 1042
    :cond_1
    iget-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->inDTD:Z

    if-nez p1, :cond_4

    const-string p1, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 1043
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez p1, :cond_2

    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1, v0}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result p1

    iget-object p3, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    invoke-interface {p3}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result p3

    invoke-interface {p2, p1, p3, v0}, Lorg/jdom2/JDOMFactory;->comment(IILjava/lang/String;)Lorg/jdom2/Comment;

    move-result-object p1

    .line 1047
    :goto_0
    iget-boolean p2, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    if-eqz p2, :cond_3

    .line 1048
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    iget-object p3, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    invoke-interface {p2, p3, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto :goto_1

    .line 1050
    :cond_3
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->getCurrentElement()Lorg/jdom2/Element;

    move-result-object p3

    invoke-interface {p2, p3, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public elementDecl(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 442
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    if-nez v0, :cond_0

    return-void

    .line 445
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, "  <!ELEMENT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ">\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public endCDATA()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1005
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1008
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    .line 1009
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    const/4 v0, 0x0

    .line 1010
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    .line 1011
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    return-void
.end method

.method public endDTD()V
    .locals 2

    .line 918
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    invoke-virtual {v0}, Lorg/jdom2/Document;->getDocType()Lorg/jdom2/DocType;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jdom2/DocType;->setInternalSubset(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 920
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inDTD:Z

    .line 921
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 866
    iget-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-eqz p1, :cond_0

    return-void

    .line 869
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 871
    iget-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    if-nez p1, :cond_2

    .line 872
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    invoke-virtual {p1}, Lorg/jdom2/Element;->getParent()Lorg/jdom2/Parent;

    move-result-object p1

    .line 873
    instance-of p2, p1, Lorg/jdom2/Document;

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    .line 874
    iput-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    goto :goto_0

    .line 876
    :cond_1
    check-cast p1, Lorg/jdom2/Element;

    iput-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    :goto_0
    return-void

    .line 879
    :cond_2
    new-instance p1, Lorg/xml/sax/SAXException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ill-formed XML document (missing opening tag for "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public endEntity(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 978
    iget v0, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    .line 979
    iget v0, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 982
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    :cond_0
    const-string v0, "[dtd]"

    .line 984
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 985
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    :cond_1
    return-void
.end method

.method public externalEntityDecl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 387
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->externalEntities:Ljava/util/Map;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    if-nez v0, :cond_0

    return-void

    .line 392
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, "  <!ENTITY "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    invoke-direct {p0, p2, p3}, Lorg/jdom2/input/sax/SAXHandler;->appendExternalId(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string p2, ">\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected flushCharacters()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 801
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringBoundaryWhite:Z

    if-eqz v0, :cond_0

    .line 802
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->textBuffer:Lorg/jdom2/input/sax/TextBuffer;

    invoke-virtual {v0}, Lorg/jdom2/input/sax/TextBuffer;->isAllWhitespace()Z

    move-result v0

    if-nez v0, :cond_1

    .line 803
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->textBuffer:Lorg/jdom2/input/sax/TextBuffer;

    invoke-virtual {v0}, Lorg/jdom2/input/sax/TextBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters(Ljava/lang/String;)V

    goto :goto_0

    .line 806
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->textBuffer:Lorg/jdom2/input/sax/TextBuffer;

    invoke-virtual {v0}, Lorg/jdom2/input/sax/TextBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters(Ljava/lang/String;)V

    .line 808
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->textBuffer:Lorg/jdom2/input/sax/TextBuffer;

    invoke-virtual {v0}, Lorg/jdom2/input/sax/TextBuffer;->clear()V

    return-void
.end method

.method protected flushCharacters(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 822
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    if-nez v0, :cond_0

    .line 823
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    return-void

    .line 834
    :cond_0
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    if-eqz v0, :cond_2

    .line 835
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0, p1}, Lorg/jdom2/JDOMFactory;->cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    iget v1, p0, Lorg/jdom2/input/sax/SAXHandler;->lastline:I

    iget v2, p0, Lorg/jdom2/input/sax/SAXHandler;->lastcol:I

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/JDOMFactory;->cdata(IILjava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object p1

    .line 837
    :goto_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->getCurrentElement()Lorg/jdom2/Element;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto :goto_2

    .line 839
    :cond_2
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0, p1}, Lorg/jdom2/JDOMFactory;->text(Ljava/lang/String;)Lorg/jdom2/Text;

    move-result-object p1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    iget v1, p0, Lorg/jdom2/input/sax/SAXHandler;->lastline:I

    iget v2, p0, Lorg/jdom2/input/sax/SAXHandler;->lastcol:I

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/JDOMFactory;->text(IILjava/lang/String;)Lorg/jdom2/Text;

    move-result-object p1

    .line 841
    :goto_1
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->getCurrentElement()Lorg/jdom2/Element;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    .line 844
    :goto_2
    iget-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    iput-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    return-void
.end method

.method public getCurrentElement()Lorg/jdom2/Element;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1133
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    if-eqz v0, :cond_0

    return-object v0

    .line 1134
    :cond_0
    new-instance v0, Lorg/xml/sax/SAXException;

    const-string v1, "Ill-formed XML document (multiple root elements detected)"

    invoke-direct {v0, v1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getDocument()Lorg/jdom2/Document;
    .locals 1

    .line 272
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    return-object v0
.end method

.method public getDocumentLocator()Lorg/xml/sax/Locator;
    .locals 1

    .line 1165
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    return-object v0
.end method

.method public getExpandEntities()Z
    .locals 1

    .line 308
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->expand:Z

    return v0
.end method

.method public getFactory()Lorg/jdom2/JDOMFactory;
    .locals 1

    .line 283
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    return-object v0
.end method

.method public getIgnoringBoundaryWhitespace()Z
    .locals 1

    .line 348
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringBoundaryWhite:Z

    return v0
.end method

.method public getIgnoringElementContentWhitespace()Z
    .locals 1

    .line 361
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringWhite:Z

    return v0
.end method

.method public ignorableWhitespace([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 788
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringWhite:Z

    if-nez v0, :cond_0

    .line 789
    invoke-virtual {p0, p1, p2, p3}, Lorg/jdom2/input/sax/SAXHandler;->characters([CII)V

    :cond_0
    return-void
.end method

.method public internalEntityDecl(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 461
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    if-nez v0, :cond_0

    return-void

    .line 464
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, "  <!ENTITY "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "%"

    .line 465
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 466
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, "% "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 468
    :cond_1
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    :goto_0
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v0, " \""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\">\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public notationDecl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1069
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    if-nez v0, :cond_0

    return-void

    .line 1072
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, "  <!NOTATION "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1073
    invoke-direct {p0, p2, p3}, Lorg/jdom2/input/sax/SAXHandler;->appendExternalId(Ljava/lang/String;Ljava/lang/String;)V

    .line 1074
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string p2, ">\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public processingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 490
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-eqz v0, :cond_0

    return-void

    .line 493
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 495
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0, p1, p2}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result v0

    iget-object v2, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    invoke-interface {v2}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result v2

    invoke-interface {v1, v0, v2, p1, p2}, Lorg/jdom2/JDOMFactory;->processingInstruction(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p1

    .line 500
    :goto_0
    iget-boolean p2, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    if-eqz p2, :cond_2

    .line 501
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    invoke-interface {p2, v0, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto :goto_1

    .line 503
    :cond_2
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->getCurrentElement()Lorg/jdom2/Element;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    :goto_1
    return-void
.end method

.method protected pushElement(Lorg/jdom2/Element;)V
    .locals 2

    .line 256
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    invoke-virtual {v0, p1}, Lorg/jdom2/Document;->setRootElement(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    const/4 v0, 0x0

    .line 259
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    goto :goto_0

    .line 261
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    invoke-interface {v0, v1, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    .line 263
    :goto_0
    iput-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    return-void
.end method

.method public final reset()V
    .locals 2

    const/4 v0, 0x0

    .line 227
    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    .line 228
    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v1, v0}, Lorg/jdom2/JDOMFactory;->document(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    move-result-object v1

    iput-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    .line 229
    iput-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    const/4 v0, 0x1

    .line 230
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    const/4 v1, 0x0

    .line 231
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inDTD:Z

    .line 232
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    .line 233
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->previousCDATA:Z

    .line 234
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    .line 235
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->expand:Z

    .line 236
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    .line 237
    iput v1, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    .line 238
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->declaredNamespaces:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 239
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 240
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->textBuffer:Lorg/jdom2/input/sax/TextBuffer;

    invoke-virtual {v0}, Lorg/jdom2/input/sax/TextBuffer;->clear()V

    .line 241
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->externalEntities:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 242
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringWhite:Z

    .line 243
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringBoundaryWhite:Z

    .line 244
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->resetSubCLass()V

    return-void
.end method

.method protected resetSubCLass()V
    .locals 0

    return-void
.end method

.method public setDocumentLocator(Lorg/xml/sax/Locator;)V
    .locals 0

    .line 1155
    iput-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    return-void
.end method

.method public setExpandEntities(Z)V
    .locals 0

    .line 297
    iput-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->expand:Z

    return-void
.end method

.method public setIgnoringBoundaryWhitespace(Z)V
    .locals 0

    .line 336
    iput-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringBoundaryWhite:Z

    return-void
.end method

.method public setIgnoringElementContentWhitespace(Z)V
    .locals 0

    .line 323
    iput-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->ignoringWhite:Z

    return-void
.end method

.method public skippedEntity(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string v0, "%"

    .line 520
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 523
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 525
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0, p1}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result v0

    iget-object v2, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    invoke-interface {v2}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result v2

    invoke-interface {v1, v0, v2, p1}, Lorg/jdom2/JDOMFactory;->entityRef(IILjava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    .line 529
    :goto_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->getCurrentElement()Lorg/jdom2/Element;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    return-void
.end method

.method public startCDATA()V
    .locals 1

    .line 994
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 997
    iput-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inCDATA:Z

    return-void
.end method

.method public startDTD(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 901
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 903
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0, p1, p2, p3}, Lorg/jdom2/JDOMFactory;->docType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result v2

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result v3

    move-object v0, v1

    move v1, v2

    move v2, v3

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lorg/jdom2/JDOMFactory;->docType(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    .line 907
    :goto_0
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    iget-object p3, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    invoke-interface {p2, p3, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    const/4 p1, 0x1

    .line 908
    iput-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->inDTD:Z

    .line 909
    iput-boolean p1, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    return-void
.end method

.method public startDocument()V
    .locals 2

    .line 366
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-eqz v0, :cond_0

    .line 367
    iget-object v1, p0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getSystemId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jdom2/Document;->setBaseURI(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 575
    iget-boolean v4, v0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-eqz v4, :cond_0

    return-void

    :cond_0
    const-string v4, ""

    const-string v5, ""

    .line 581
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x3a

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-nez v5, :cond_4

    .line 582
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-lez v5, :cond_1

    .line 585
    invoke-virtual {v2, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    :cond_1
    if-eqz v1, :cond_3

    const-string v9, ""

    .line 589
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_1

    :cond_3
    :goto_0
    add-int/2addr v5, v7

    .line 590
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_1

    :cond_4
    move-object v2, v1

    move-object/from16 v1, p1

    .line 596
    :goto_1
    invoke-static {v4, v1}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v1

    .line 598
    iget-object v4, v0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez v4, :cond_5

    iget-object v4, v0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v4, v2, v1}, Lorg/jdom2/JDOMFactory;->element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object v1

    goto :goto_2

    :cond_5
    iget-object v5, v0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v4}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result v4

    iget-object v9, v0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    invoke-interface {v9}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result v9

    invoke-interface {v5, v4, v9, v2, v1}, Lorg/jdom2/JDOMFactory;->element(IILjava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object v1

    .line 605
    :goto_2
    iget-object v2, v0, Lorg/jdom2/input/sax/SAXHandler;->declaredNamespaces:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_6

    .line 606
    invoke-direct {v0, v1}, Lorg/jdom2/input/sax/SAXHandler;->transferNamespaces(Lorg/jdom2/Element;)V

    .line 609
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 611
    iget-boolean v2, v0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    if-eqz v2, :cond_7

    .line 612
    iget-object v2, v0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    iget-object v4, v0, Lorg/jdom2/input/sax/SAXHandler;->currentDocument:Lorg/jdom2/Document;

    invoke-interface {v2, v4, v1}, Lorg/jdom2/JDOMFactory;->setRoot(Lorg/jdom2/Document;Lorg/jdom2/Element;)V

    .line 614
    iput-boolean v8, v0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    goto :goto_3

    .line 616
    :cond_7
    iget-object v2, v0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual/range {p0 .. p0}, Lorg/jdom2/input/sax/SAXHandler;->getCurrentElement()Lorg/jdom2/Element;

    move-result-object v4

    invoke-interface {v2, v4, v1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    .line 618
    :goto_3
    iput-object v1, v0, Lorg/jdom2/input/sax/SAXHandler;->currentElement:Lorg/jdom2/Element;

    .line 621
    invoke-interface/range {p4 .. p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    move v4, v8

    :goto_4
    if-ge v4, v2, :cond_14

    const-string v5, ""

    .line 624
    invoke-interface {v3, v4}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v9

    .line 625
    invoke-interface {v3, v4}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    move-result-object v10

    .line 626
    instance-of v11, v3, Lorg/xml/sax/ext/Attributes2;

    if-eqz v11, :cond_8

    move-object v11, v3

    check-cast v11, Lorg/xml/sax/ext/Attributes2;

    invoke-interface {v11, v4}, Lorg/xml/sax/ext/Attributes2;->isSpecified(I)Z

    move-result v11

    goto :goto_5

    :cond_8
    move v11, v7

    :goto_5
    const-string v12, ""

    .line 630
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    const-string v12, "xmlns:"

    .line 635
    invoke-virtual {v10, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_13

    const-string v12, "xmlns"

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    goto/16 :goto_a

    .line 639
    :cond_9
    invoke-virtual {v10, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-lez v12, :cond_a

    .line 642
    invoke-virtual {v10, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    :cond_a
    const-string v13, ""

    .line 646
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    add-int/lit8 v12, v12, 0x1

    .line 647
    invoke-virtual {v10, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 651
    :cond_b
    invoke-interface {v3, v4}, Lorg/xml/sax/Attributes;->getType(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lorg/jdom2/AttributeType;->getAttributeType(Ljava/lang/String;)Lorg/jdom2/AttributeType;

    move-result-object v10

    .line 653
    invoke-interface {v3, v4}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v12

    .line 654
    invoke-interface {v3, v4}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    move-result-object v13

    const-string v14, "xmlns"

    .line 656
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_13

    const-string v14, "xmlns"

    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_13

    const-string v14, "http://www.w3.org/2000/xmlns/"

    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    goto/16 :goto_a

    :cond_c
    const-string v14, ""

    .line 669
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    const-string v14, ""

    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    .line 681
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 682
    invoke-virtual {v1}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_e

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Lorg/jdom2/Namespace;

    .line 683
    invoke-virtual {v6}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_d

    invoke-virtual {v6}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    .line 685
    invoke-virtual {v6}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v5

    goto :goto_7

    .line 688
    :cond_d
    invoke-virtual {v6}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v6, 0x3a

    const/4 v7, 0x1

    goto :goto_6

    :cond_e
    :goto_7
    const-string v6, ""

    .line 691
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 705
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "attns"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move v6, v8

    .line 706
    :goto_8
    invoke-virtual {v14, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    const/4 v7, 0x1

    add-int/2addr v6, v7

    .line 708
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "attns"

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    :cond_f
    const/4 v7, 0x1

    goto :goto_9

    :cond_10
    const/4 v7, 0x1

    .line 713
    :cond_11
    :goto_9
    invoke-static {v5, v13}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v5

    .line 715
    iget-object v6, v0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v6, v9, v12, v10, v5}, Lorg/jdom2/JDOMFactory;->attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/AttributeType;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object v5

    if-nez v11, :cond_12

    .line 719
    invoke-virtual {v5, v8}, Lorg/jdom2/Attribute;->setSpecified(Z)V

    .line 721
    :cond_12
    iget-object v6, v0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v6, v1, v5}, Lorg/jdom2/JDOMFactory;->setAttribute(Lorg/jdom2/Element;Lorg/jdom2/Attribute;)V

    :cond_13
    :goto_a
    add-int/lit8 v4, v4, 0x1

    const/16 v6, 0x3a

    goto/16 :goto_4

    :cond_14
    return-void
.end method

.method public startEntity(Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 926
    iget v0, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    .line 928
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->expand:Z

    if-nez v0, :cond_6

    iget v0, p0, Lorg/jdom2/input/sax/SAXHandler;->entityDepth:I

    if-le v0, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "[dtd]"

    .line 934
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 935
    iput-boolean v2, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    return-void

    .line 940
    :cond_1
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inDTD:Z

    if-nez v0, :cond_5

    const-string v0, "amp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "lt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "gt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "apos"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "quot"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 944
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->expand:Z

    if-nez v0, :cond_5

    .line 947
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->externalEntities:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    .line 949
    aget-object v3, v0, v2

    .line 950
    aget-object v0, v0, v1

    move-object v9, v0

    move-object v8, v3

    goto :goto_0

    :cond_2
    move-object v8, v3

    move-object v9, v8

    .line 960
    :goto_0
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->atRoot:Z

    if-nez v0, :cond_4

    .line 961
    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->flushCharacters()V

    .line 962
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0, p1, v8, v9}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    goto :goto_1

    :cond_3
    iget-object v4, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getLineNumber()I

    move-result v5

    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->currentLocator:Lorg/xml/sax/Locator;

    invoke-interface {v0}, Lorg/xml/sax/Locator;->getColumnNumber()I

    move-result v6

    move-object v7, p1

    invoke-interface/range {v4 .. v9}, Lorg/jdom2/JDOMFactory;->entityRef(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    .line 969
    :goto_1
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->factory:Lorg/jdom2/JDOMFactory;

    invoke-virtual {p0}, Lorg/jdom2/input/sax/SAXHandler;->getCurrentElement()Lorg/jdom2/Element;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    .line 971
    :cond_4
    iput-boolean v1, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    :cond_5
    return-void

    :cond_6
    :goto_2
    return-void
.end method

.method public startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 545
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->suppress:Z

    if-eqz v0, :cond_0

    return-void

    .line 548
    :cond_0
    invoke-static {p1, p2}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    .line 549
    iget-object p2, p0, Lorg/jdom2/input/sax/SAXHandler;->declaredNamespaces:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public unparsedEntityDecl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1093
    iget-boolean v0, p0, Lorg/jdom2/input/sax/SAXHandler;->inInternalSubset:Z

    if-nez v0, :cond_0

    return-void

    .line 1096
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string v1, "  <!ENTITY "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1097
    invoke-direct {p0, p2, p3}, Lorg/jdom2/input/sax/SAXHandler;->appendExternalId(Ljava/lang/String;Ljava/lang/String;)V

    .line 1098
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string p2, " NDATA "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1099
    iget-object p1, p0, Lorg/jdom2/input/sax/SAXHandler;->internalSubset:Ljava/lang/StringBuilder;

    const-string p2, ">\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
