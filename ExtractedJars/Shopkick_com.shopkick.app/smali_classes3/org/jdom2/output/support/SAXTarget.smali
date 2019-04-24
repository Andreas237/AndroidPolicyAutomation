.class public final Lorg/jdom2/output/support/SAXTarget;
.super Ljava/lang/Object;
.source "SAXTarget.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/output/support/SAXTarget$SAXLocator;
    }
.end annotation


# instance fields
.field private final contentHandler:Lorg/xml/sax/ContentHandler;

.field private final declHandler:Lorg/xml/sax/ext/DeclHandler;

.field private final declareNamespaces:Z

.field private final dtdHandler:Lorg/xml/sax/DTDHandler;

.field private final entityResolver:Lorg/xml/sax/EntityResolver;

.field private final errorHandler:Lorg/xml/sax/ErrorHandler;

.field private final lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

.field private final locator:Lorg/jdom2/output/support/SAXTarget$SAXLocator;

.field private final reportDtdEvents:Z


# direct methods
.method public constructor <init>(Lorg/xml/sax/ContentHandler;Lorg/xml/sax/ErrorHandler;Lorg/xml/sax/DTDHandler;Lorg/xml/sax/EntityResolver;Lorg/xml/sax/ext/LexicalHandler;Lorg/xml/sax/ext/DeclHandler;ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    iput-object p1, p0, Lorg/jdom2/output/support/SAXTarget;->contentHandler:Lorg/xml/sax/ContentHandler;

    .line 195
    iput-object p2, p0, Lorg/jdom2/output/support/SAXTarget;->errorHandler:Lorg/xml/sax/ErrorHandler;

    .line 196
    iput-object p3, p0, Lorg/jdom2/output/support/SAXTarget;->dtdHandler:Lorg/xml/sax/DTDHandler;

    .line 197
    iput-object p4, p0, Lorg/jdom2/output/support/SAXTarget;->entityResolver:Lorg/xml/sax/EntityResolver;

    .line 198
    iput-object p5, p0, Lorg/jdom2/output/support/SAXTarget;->lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

    .line 199
    iput-object p6, p0, Lorg/jdom2/output/support/SAXTarget;->declHandler:Lorg/xml/sax/ext/DeclHandler;

    .line 200
    iput-boolean p7, p0, Lorg/jdom2/output/support/SAXTarget;->declareNamespaces:Z

    .line 201
    iput-boolean p8, p0, Lorg/jdom2/output/support/SAXTarget;->reportDtdEvents:Z

    .line 202
    new-instance p1, Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    invoke-direct {p1, p9, p10}, Lorg/jdom2/output/support/SAXTarget$SAXLocator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/jdom2/output/support/SAXTarget;->locator:Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    return-void
.end method


# virtual methods
.method public getContentHandler()Lorg/xml/sax/ContentHandler;
    .locals 1

    .line 210
    iget-object v0, p0, Lorg/jdom2/output/support/SAXTarget;->contentHandler:Lorg/xml/sax/ContentHandler;

    return-object v0
.end method

.method public getDTDHandler()Lorg/xml/sax/DTDHandler;
    .locals 1

    .line 224
    iget-object v0, p0, Lorg/jdom2/output/support/SAXTarget;->dtdHandler:Lorg/xml/sax/DTDHandler;

    return-object v0
.end method

.method public getDeclHandler()Lorg/xml/sax/ext/DeclHandler;
    .locals 1

    .line 245
    iget-object v0, p0, Lorg/jdom2/output/support/SAXTarget;->declHandler:Lorg/xml/sax/ext/DeclHandler;

    return-object v0
.end method

.method public getEntityResolver()Lorg/xml/sax/EntityResolver;
    .locals 1

    .line 231
    iget-object v0, p0, Lorg/jdom2/output/support/SAXTarget;->entityResolver:Lorg/xml/sax/EntityResolver;

    return-object v0
.end method

.method public getErrorHandler()Lorg/xml/sax/ErrorHandler;
    .locals 1

    .line 217
    iget-object v0, p0, Lorg/jdom2/output/support/SAXTarget;->errorHandler:Lorg/xml/sax/ErrorHandler;

    return-object v0
.end method

.method public getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;
    .locals 1

    .line 238
    iget-object v0, p0, Lorg/jdom2/output/support/SAXTarget;->lexicalHandler:Lorg/xml/sax/ext/LexicalHandler;

    return-object v0
.end method

.method public getLocator()Lorg/jdom2/output/support/SAXTarget$SAXLocator;
    .locals 1

    .line 266
    iget-object v0, p0, Lorg/jdom2/output/support/SAXTarget;->locator:Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    return-object v0
.end method

.method public isDeclareNamespaces()Z
    .locals 1

    .line 252
    iget-boolean v0, p0, Lorg/jdom2/output/support/SAXTarget;->declareNamespaces:Z

    return v0
.end method

.method public isReportDTDEvents()Z
    .locals 1

    .line 259
    iget-boolean v0, p0, Lorg/jdom2/output/support/SAXTarget;->reportDtdEvents:Z

    return v0
.end method
