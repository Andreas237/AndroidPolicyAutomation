.class public Lorg/jdom2/output/SAXOutputter;
.super Ljava/lang/Object;
.source "SAXOutputter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/output/SAXOutputter$DefaultSAXOutputProcessor;
    }
.end annotation


# static fields
.field private static final DEFAULT_PROCESSOR:Lorg/jdom2/output/support/SAXOutputProcessor;


# instance fields
.field private contentHandler:Lorg/xml/sax/ContentHandler;

.field private declHandler:Lorg/xml/sax/ext/DeclHandler;

.field private declareNamespaces:Z

.field private dtdHandler:Lorg/xml/sax/DTDHandler;

.field private entityResolver:Lorg/xml/sax/EntityResolver;

.field private errorHandler:Lorg/xml/sax/ErrorHandler;

.field private format:Lorg/jdom2/output/Format;

.field private lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

.field private processor:Lorg/jdom2/output/support/SAXOutputProcessor;

.field private reportDtdEvents:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 116
    new-instance v0, Lorg/jdom2/output/SAXOutputter$DefaultSAXOutputProcessor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/jdom2/output/SAXOutputter$DefaultSAXOutputProcessor;-><init>(Lorg/jdom2/output/SAXOutputter$1;)V

    sput-object v0, Lorg/jdom2/output/SAXOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/SAXOutputProcessor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 143
    iput-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->declareNamespaces:Z

    const/4 v0, 0x1

    .line 149
    iput-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->reportDtdEvents:Z

    .line 154
    sget-object v0, Lorg/jdom2/output/SAXOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/SAXOutputProcessor;

    iput-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    .line 159
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/support/SAXOutputProcessor;Lorg/jdom2/output/Format;Lorg/xml/sax/ContentHandler;Lorg/xml/sax/ErrorHandler;Lorg/xml/sax/DTDHandler;Lorg/xml/sax/EntityResolver;Lorg/xml/sax/ext/LexicalHandler;)V
    .locals 1

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 143
    iput-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->declareNamespaces:Z

    const/4 v0, 0x1

    .line 149
    iput-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->reportDtdEvents:Z

    .line 154
    sget-object v0, Lorg/jdom2/output/SAXOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/SAXOutputProcessor;

    iput-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    .line 159
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    if-nez p1, :cond_0

    .line 250
    sget-object p1, Lorg/jdom2/output/SAXOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/SAXOutputProcessor;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    if-nez p2, :cond_1

    .line 251
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    .line 252
    iput-object p3, p0, Lorg/jdom2/output/SAXOutputter;->contentHandler:Lorg/xml/sax/ContentHandler;

    .line 253
    iput-object p4, p0, Lorg/jdom2/output/SAXOutputter;->errorHandler:Lorg/xml/sax/ErrorHandler;

    .line 254
    iput-object p5, p0, Lorg/jdom2/output/SAXOutputter;->dtdHandler:Lorg/xml/sax/DTDHandler;

    .line 255
    iput-object p6, p0, Lorg/jdom2/output/SAXOutputter;->entityResolver:Lorg/xml/sax/EntityResolver;

    .line 256
    iput-object p7, p0, Lorg/jdom2/output/SAXOutputter;->lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 177
    invoke-direct/range {v0 .. v5}, Lorg/jdom2/output/SAXOutputter;-><init>(Lorg/xml/sax/ContentHandler;Lorg/xml/sax/ErrorHandler;Lorg/xml/sax/DTDHandler;Lorg/xml/sax/EntityResolver;Lorg/xml/sax/ext/LexicalHandler;)V

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/xml/sax/ErrorHandler;Lorg/xml/sax/DTDHandler;Lorg/xml/sax/EntityResolver;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 197
    invoke-direct/range {v0 .. v5}, Lorg/jdom2/output/SAXOutputter;-><init>(Lorg/xml/sax/ContentHandler;Lorg/xml/sax/ErrorHandler;Lorg/xml/sax/DTDHandler;Lorg/xml/sax/EntityResolver;Lorg/xml/sax/ext/LexicalHandler;)V

    return-void
.end method

.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/xml/sax/ErrorHandler;Lorg/xml/sax/DTDHandler;Lorg/xml/sax/EntityResolver;Lorg/xml/sax/ext/LexicalHandler;)V
    .locals 1

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 143
    iput-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->declareNamespaces:Z

    const/4 v0, 0x1

    .line 149
    iput-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->reportDtdEvents:Z

    .line 154
    sget-object v0, Lorg/jdom2/output/SAXOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/SAXOutputProcessor;

    iput-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    .line 159
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    .line 219
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->contentHandler:Lorg/xml/sax/ContentHandler;

    .line 220
    iput-object p2, p0, Lorg/jdom2/output/SAXOutputter;->errorHandler:Lorg/xml/sax/ErrorHandler;

    .line 221
    iput-object p3, p0, Lorg/jdom2/output/SAXOutputter;->dtdHandler:Lorg/xml/sax/DTDHandler;

    .line 222
    iput-object p4, p0, Lorg/jdom2/output/SAXOutputter;->entityResolver:Lorg/xml/sax/EntityResolver;

    .line 223
    iput-object p5, p0, Lorg/jdom2/output/SAXOutputter;->lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

    return-void
.end method

.method private final buildTarget(Lorg/jdom2/Document;)Lorg/jdom2/output/support/SAXTarget;
    .locals 12

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 632
    invoke-virtual {p1}, Lorg/jdom2/Document;->getDocType()Lorg/jdom2/DocType;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 634
    invoke-virtual {p1}, Lorg/jdom2/DocType;->getPublicID()Ljava/lang/String;

    move-result-object v0

    .line 635
    invoke-virtual {p1}, Lorg/jdom2/DocType;->getSystemID()Ljava/lang/String;

    move-result-object p1

    move-object v11, p1

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object v10, v0

    move-object v11, v10

    .line 638
    :goto_0
    new-instance p1, Lorg/jdom2/output/support/SAXTarget;

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->contentHandler:Lorg/xml/sax/ContentHandler;

    iget-object v3, p0, Lorg/jdom2/output/SAXOutputter;->errorHandler:Lorg/xml/sax/ErrorHandler;

    iget-object v4, p0, Lorg/jdom2/output/SAXOutputter;->dtdHandler:Lorg/xml/sax/DTDHandler;

    iget-object v5, p0, Lorg/jdom2/output/SAXOutputter;->entityResolver:Lorg/xml/sax/EntityResolver;

    iget-object v6, p0, Lorg/jdom2/output/SAXOutputter;->lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

    iget-object v7, p0, Lorg/jdom2/output/SAXOutputter;->declHandler:Lorg/xml/sax/ext/DeclHandler;

    iget-boolean v8, p0, Lorg/jdom2/output/SAXOutputter;->declareNamespaces:Z

    iget-boolean v9, p0, Lorg/jdom2/output/SAXOutputter;->reportDtdEvents:Z

    move-object v1, p1

    invoke-direct/range {v1 .. v11}, Lorg/jdom2/output/support/SAXTarget;-><init>(Lorg/xml/sax/ContentHandler;Lorg/xml/sax/ErrorHandler;Lorg/xml/sax/DTDHandler;Lorg/xml/sax/EntityResolver;Lorg/xml/sax/ext/LexicalHandler;Lorg/xml/sax/ext/DeclHandler;ZZLjava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private handleError(Lorg/jdom2/JDOMException;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 783
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->errorHandler:Lorg/xml/sax/ErrorHandler;

    if-eqz v0, :cond_1

    .line 785
    :try_start_0
    new-instance v1, Lorg/xml/sax/SAXParseException;

    invoke-virtual {p1}, Lorg/jdom2/JDOMException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, p1}, Lorg/xml/sax/SAXParseException;-><init>(Ljava/lang/String;Lorg/xml/sax/Locator;Ljava/lang/Exception;)V

    invoke-interface {v0, v1}, Lorg/xml/sax/ErrorHandler;->error(Lorg/xml/sax/SAXParseException;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 789
    invoke-virtual {p1}, Lorg/xml/sax/SAXException;->getException()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lorg/jdom2/JDOMException;

    if-eqz v0, :cond_0

    .line 790
    invoke-virtual {p1}, Lorg/xml/sax/SAXException;->getException()Ljava/lang/Exception;

    move-result-object p1

    check-cast p1, Lorg/jdom2/JDOMException;

    throw p1

    .line 792
    :cond_0
    new-instance v0, Lorg/jdom2/JDOMException;

    invoke-virtual {p1}, Lorg/xml/sax/SAXException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 796
    :cond_1
    throw p1
.end method


# virtual methods
.method public getContentHandler()Lorg/xml/sax/ContentHandler;
    .locals 1

    .line 276
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->contentHandler:Lorg/xml/sax/ContentHandler;

    return-object v0
.end method

.method public getDTDHandler()Lorg/xml/sax/DTDHandler;
    .locals 1

    .line 316
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->dtdHandler:Lorg/xml/sax/DTDHandler;

    return-object v0
.end method

.method public getDeclHandler()Lorg/xml/sax/ext/DeclHandler;
    .locals 1

    .line 376
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->declHandler:Lorg/xml/sax/ext/DeclHandler;

    return-object v0
.end method

.method public getEntityResolver()Lorg/xml/sax/EntityResolver;
    .locals 1

    .line 336
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->entityResolver:Lorg/xml/sax/EntityResolver;

    return-object v0
.end method

.method public getErrorHandler()Lorg/xml/sax/ErrorHandler;
    .locals 1

    .line 296
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->errorHandler:Lorg/xml/sax/ErrorHandler;

    return-object v0
.end method

.method public getFeature(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    const-string v0, "http://xml.org/sax/features/namespace-prefixes"

    .line 502
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    iget-boolean p1, p0, Lorg/jdom2/output/SAXOutputter;->declareNamespaces:Z

    return p1

    :cond_0
    const-string v0, "http://xml.org/sax/features/namespaces"

    .line 506
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const-string v0, "http://xml.org/sax/features/validation"

    .line 510
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 512
    iget-boolean p1, p0, Lorg/jdom2/output/SAXOutputter;->reportDtdEvents:Z

    return p1

    .line 515
    :cond_2
    new-instance v0, Lorg/xml/sax/SAXNotRecognizedException;

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getFormat()Lorg/jdom2/output/Format;
    .locals 1

    .line 615
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    return-object v0
.end method

.method public getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;
    .locals 1

    .line 356
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

    return-object v0
.end method

.method public getLocator()Lorg/jdom2/output/JDOMLocator;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    const-string v0, "http://xml.org/sax/properties/lexical-handler"

    .line 579
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "http://xml.org/sax/handlers/LexicalHandler"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "http://xml.org/sax/properties/declaration-handler"

    .line 583
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "http://xml.org/sax/handlers/DeclHandler"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 587
    :cond_1
    new-instance v0, Lorg/xml/sax/SAXNotRecognizedException;

    invoke-direct {v0, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 585
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lorg/jdom2/output/SAXOutputter;->getDeclHandler()Lorg/xml/sax/ext/DeclHandler;

    move-result-object p1

    return-object p1

    .line 581
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lorg/jdom2/output/SAXOutputter;->getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;

    move-result-object p1

    return-object p1
.end method

.method public getReportDTDEvents()Z
    .locals 1

    .line 409
    iget-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->reportDtdEvents:Z

    return v0
.end method

.method public getReportNamespaceDeclarations()Z
    .locals 1

    .line 387
    iget-boolean v0, p0, Lorg/jdom2/output/SAXOutputter;->declareNamespaces:Z

    return v0
.end method

.method public getSAXOutputProcessor()Lorg/jdom2/output/support/SAXOutputProcessor;
    .locals 1

    .line 596
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    return-object v0
.end method

.method public output(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 674
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lorg/jdom2/output/SAXOutputter;->buildTarget(Lorg/jdom2/Document;)Lorg/jdom2/output/support/SAXTarget;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->processAsDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Ljava/util/List;)V

    return-void
.end method

.method public output(Lorg/jdom2/Document;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 653
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    invoke-direct {p0, p1}, Lorg/jdom2/output/SAXOutputter;->buildTarget(Lorg/jdom2/Document;)Lorg/jdom2/output/support/SAXTarget;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)V

    return-void
.end method

.method public output(Lorg/jdom2/Element;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 687
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lorg/jdom2/output/SAXOutputter;->buildTarget(Lorg/jdom2/Document;)Lorg/jdom2/output/support/SAXTarget;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->processAsDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V

    return-void
.end method

.method public outputFragment(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 713
    :cond_0
    iget-object v0, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lorg/jdom2/output/SAXOutputter;->buildTarget(Lorg/jdom2/Document;)Lorg/jdom2/output/support/SAXTarget;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    invoke-interface {v0, v1, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Ljava/util/List;)V

    return-void
.end method

.method public outputFragment(Lorg/jdom2/Content;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 739
    invoke-direct {p0, v0}, Lorg/jdom2/output/SAXOutputter;->buildTarget(Lorg/jdom2/Document;)Lorg/jdom2/output/support/SAXTarget;

    move-result-object v0

    .line 741
    sget-object v1, Lorg/jdom2/output/SAXOutputter$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {p1}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 761
    new-instance v0, Lorg/jdom2/JDOMException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid element content: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/jdom2/output/SAXOutputter;->handleError(Lorg/jdom2/JDOMException;)V

    goto :goto_0

    .line 758
    :pswitch_0
    iget-object v1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    check-cast p1, Lorg/jdom2/Text;

    invoke-interface {v1, v0, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)V

    goto :goto_0

    .line 755
    :pswitch_1
    iget-object v1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    check-cast p1, Lorg/jdom2/ProcessingInstruction;

    invoke-interface {v1, v0, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)V

    goto :goto_0

    .line 752
    :pswitch_2
    iget-object v1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    check-cast p1, Lorg/jdom2/EntityRef;

    invoke-interface {v1, v0, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)V

    goto :goto_0

    .line 749
    :pswitch_3
    iget-object v1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    check-cast p1, Lorg/jdom2/Element;

    invoke-interface {v1, v0, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V

    goto :goto_0

    .line 746
    :pswitch_4
    iget-object v1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    check-cast p1, Lorg/jdom2/Comment;

    invoke-interface {v1, v0, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)V

    goto :goto_0

    .line 743
    :pswitch_5
    iget-object v1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    iget-object v2, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    check-cast p1, Lorg/jdom2/CDATA;

    invoke-interface {v1, v0, v2, p1}, Lorg/jdom2/output/support/SAXOutputProcessor;->process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setContentHandler(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->contentHandler:Lorg/xml/sax/ContentHandler;

    return-void
.end method

.method public setDTDHandler(Lorg/xml/sax/DTDHandler;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->dtdHandler:Lorg/xml/sax/DTDHandler;

    return-void
.end method

.method public setDeclHandler(Lorg/xml/sax/ext/DeclHandler;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->declHandler:Lorg/xml/sax/ext/DeclHandler;

    return-void
.end method

.method public setEntityResolver(Lorg/xml/sax/EntityResolver;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->entityResolver:Lorg/xml/sax/EntityResolver;

    return-void
.end method

.method public setErrorHandler(Lorg/xml/sax/ErrorHandler;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->errorHandler:Lorg/xml/sax/ErrorHandler;

    return-void
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    const-string v0, "http://xml.org/sax/features/namespace-prefixes"

    .line 464
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 466
    invoke-virtual {p0, p2}, Lorg/jdom2/output/SAXOutputter;->setReportNamespaceDeclarations(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "http://xml.org/sax/features/namespaces"

    .line 468
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 471
    :cond_1
    new-instance p2, Lorg/xml/sax/SAXNotSupportedException;

    invoke-direct {p2, p1}, Lorg/xml/sax/SAXNotSupportedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-string v0, "http://xml.org/sax/features/validation"

    .line 475
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 477
    invoke-virtual {p0, p2}, Lorg/jdom2/output/SAXOutputter;->setReportDTDEvents(Z)V

    :goto_0
    return-void

    .line 480
    :cond_3
    new-instance p2, Lorg/xml/sax/SAXNotRecognizedException;

    invoke-direct {p2, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public setFormat(Lorg/jdom2/output/Format;)V
    .locals 0

    if-nez p1, :cond_0

    .line 625
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->format:Lorg/jdom2/output/Format;

    return-void
.end method

.method public setLexicalHandler(Lorg/xml/sax/ext/LexicalHandler;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

    return-void
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    const-string v0, "http://xml.org/sax/properties/lexical-handler"

    .line 551
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "http://xml.org/sax/handlers/LexicalHandler"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "http://xml.org/sax/properties/declaration-handler"

    .line 555
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "http://xml.org/sax/handlers/DeclHandler"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 559
    :cond_1
    new-instance p2, Lorg/xml/sax/SAXNotRecognizedException;

    invoke-direct {p2, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 557
    :cond_2
    :goto_0
    check-cast p2, Lorg/xml/sax/ext/DeclHandler;

    invoke-virtual {p0, p2}, Lorg/jdom2/output/SAXOutputter;->setDeclHandler(Lorg/xml/sax/ext/DeclHandler;)V

    goto :goto_2

    .line 553
    :cond_3
    :goto_1
    check-cast p2, Lorg/xml/sax/ext/LexicalHandler;

    invoke-virtual {p0, p2}, Lorg/jdom2/output/SAXOutputter;->setLexicalHandler(Lorg/xml/sax/ext/LexicalHandler;)V

    :goto_2
    return-void
.end method

.method public setReportDTDEvents(Z)V
    .locals 0

    .line 421
    iput-boolean p1, p0, Lorg/jdom2/output/SAXOutputter;->reportDtdEvents:Z

    return-void
.end method

.method public setReportNamespaceDeclarations(Z)V
    .locals 0

    .line 400
    iput-boolean p1, p0, Lorg/jdom2/output/SAXOutputter;->declareNamespaces:Z

    return-void
.end method

.method public setSAXOutputProcessor(Lorg/jdom2/output/support/SAXOutputProcessor;)V
    .locals 0

    if-nez p1, :cond_0

    .line 606
    sget-object p1, Lorg/jdom2/output/SAXOutputter;->DEFAULT_PROCESSOR:Lorg/jdom2/output/support/SAXOutputProcessor;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/SAXOutputter;->processor:Lorg/jdom2/output/support/SAXOutputProcessor;

    return-void
.end method
