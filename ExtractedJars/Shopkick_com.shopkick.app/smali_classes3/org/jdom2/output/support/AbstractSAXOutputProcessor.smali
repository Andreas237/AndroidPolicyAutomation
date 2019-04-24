.class public Lorg/jdom2/output/support/AbstractSAXOutputProcessor;
.super Lorg/jdom2/output/support/AbstractOutputProcessor;
.source "AbstractSAXOutputProcessor.java"

# interfaces
.implements Lorg/jdom2/output/support/SAXOutputProcessor;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 121
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractOutputProcessor;-><init>()V

    return-void
.end method

.method private createDTDParser(Lorg/jdom2/output/support/SAXTarget;)Lorg/xml/sax/XMLReader;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 794
    :try_start_0
    invoke-virtual {p0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->createParser()Lorg/xml/sax/XMLReader;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 800
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getDTDHandler()Lorg/xml/sax/DTDHandler;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 801
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getDTDHandler()Lorg/xml/sax/DTDHandler;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->setDTDHandler(Lorg/xml/sax/DTDHandler;)V

    .line 803
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getEntityResolver()Lorg/xml/sax/EntityResolver;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 804
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getEntityResolver()Lorg/xml/sax/EntityResolver;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->setEntityResolver(Lorg/xml/sax/EntityResolver;)V

    .line 806
    :cond_1
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;

    move-result-object v1

    if-eqz v1, :cond_2

    :try_start_1
    const-string v1, "http://xml.org/sax/properties/lexical-handler"

    .line 808
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/xml/sax/SAXException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :try_start_2
    const-string v1, "http://xml.org/sax/handlers/LexicalHandler"

    .line 812
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/xml/sax/SAXException; {:try_start_2 .. :try_end_2} :catch_1

    .line 819
    :catch_1
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getDeclHandler()Lorg/xml/sax/ext/DeclHandler;

    move-result-object v1

    if-eqz v1, :cond_3

    :try_start_3
    const-string v1, "http://xml.org/sax/properties/declaration-handler"

    .line 821
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getDeclHandler()Lorg/xml/sax/ext/DeclHandler;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/xml/sax/SAXException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    :try_start_4
    const-string v1, "http://xml.org/sax/handlers/DeclHandler"

    .line 825
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getDeclHandler()Lorg/xml/sax/ext/DeclHandler;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/xml/sax/SAXException; {:try_start_4 .. :try_end_4} :catch_3

    .line 834
    :catch_3
    :cond_3
    :goto_1
    new-instance p1, Lorg/xml/sax/helpers/DefaultHandler;

    invoke-direct {p1}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    invoke-interface {v0, p1}, Lorg/xml/sax/XMLReader;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    return-object v0

    :catch_4
    move-exception p1

    .line 796
    new-instance v0, Lorg/xml/sax/SAXException;

    const-string v1, "Error in SAX parser allocation"

    invoke-direct {v0, v1, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method private static getAttributeTypeName(Lorg/jdom2/AttributeType;)Ljava/lang/String;
    .locals 2

    .line 719
    sget-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$AttributeType:[I

    invoke-virtual {p0}, Lorg/jdom2/AttributeType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 723
    invoke-virtual {p0}, Lorg/jdom2/AttributeType;->name()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "CDATA"

    return-object p0
.end method

.method private static locate(Lorg/jdom2/output/support/SAXTarget;)V
    .locals 1

    .line 125
    invoke-virtual {p0}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jdom2/output/support/SAXTarget;->getLocator()Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    move-result-object p0

    invoke-interface {v0, p0}, Lorg/xml/sax/ContentHandler;->setDocumentLocator(Lorg/xml/sax/Locator;)V

    return-void
.end method


# virtual methods
.method protected createParser()Lorg/xml/sax/XMLReader;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "javax.xml.parsers.SAXParserFactory"

    .line 744
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "newInstance"

    const/4 v3, 0x0

    .line 748
    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 749
    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "newSAXParser"

    .line 752
    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 753
    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 756
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getXMLReader"

    .line 757
    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 758
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xml/sax/XMLReader;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-nez v0, :cond_0

    const-string v0, "org.apache.xerces.parsers.SAXParser"

    .line 772
    invoke-static {v0}, Lorg/xml/sax/helpers/XMLReaderFactory;->createXMLReader(Ljava/lang/String;)Lorg/xml/sax/XMLReader;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected printCDATA(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/CDATA;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 493
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;

    move-result-object p2

    .line 494
    invoke-virtual {p3}, Lorg/jdom2/CDATA;->getText()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 496
    invoke-interface {p2}, Lorg/xml/sax/ext/LexicalHandler;->startCDATA()V

    .line 497
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    array-length v1, p3

    invoke-interface {p1, p3, v0, v1}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 498
    invoke-interface {p2}, Lorg/xml/sax/ext/LexicalHandler;->endCDATA()V

    goto :goto_0

    .line 500
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    array-length p2, p3

    invoke-interface {p1, p3, v0, p2}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    :goto_0
    return-void
.end method

.method protected printComment(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 454
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 455
    invoke-virtual {p3}, Lorg/jdom2/Comment;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    .line 456
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLexicalHandler()Lorg/xml/sax/ext/LexicalHandler;

    move-result-object p1

    const/4 p3, 0x0

    array-length v0, p2

    invoke-interface {p1, p2, p3, v0}, Lorg/xml/sax/ext/LexicalHandler;->comment([CII)V

    :cond_0
    return-void
.end method

.method protected printContent(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 667
    :goto_0
    :pswitch_0
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 668
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object v0

    if-nez v0, :cond_1

    .line 671
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object v0

    .line 672
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->isCDATA()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 673
    new-instance v1, Lorg/jdom2/CDATA;

    invoke-direct {v1, v0}, Lorg/jdom2/CDATA;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, v1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printCDATA(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/CDATA;)V

    goto :goto_0

    .line 675
    :cond_0
    new-instance v1, Lorg/jdom2/Text;

    invoke-direct {v1, v0}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, v1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printText(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Text;)V

    goto :goto_0

    .line 678
    :cond_1
    sget-object v1, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v0}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 699
    :pswitch_1
    check-cast v0, Lorg/jdom2/Text;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printText(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Text;)V

    goto :goto_0

    .line 692
    :pswitch_2
    check-cast v0, Lorg/jdom2/EntityRef;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printEntityRef(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/EntityRef;)V

    goto :goto_0

    .line 680
    :pswitch_3
    check-cast v0, Lorg/jdom2/CDATA;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printCDATA(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/CDATA;)V

    goto :goto_0

    .line 695
    :pswitch_4
    check-cast v0, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printProcessingInstruction(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V

    goto :goto_0

    .line 689
    :pswitch_5
    check-cast v0, Lorg/jdom2/Element;

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printElement(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V

    goto :goto_0

    .line 683
    :pswitch_6
    check-cast v0, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printComment(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V

    goto :goto_0

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method protected printDocType(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 397
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getDTDHandler()Lorg/xml/sax/DTDHandler;

    move-result-object p2

    .line 398
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getDeclHandler()Lorg/xml/sax/ext/DeclHandler;

    move-result-object v0

    if-eqz p3, :cond_1

    if-nez p2, :cond_0

    if-eqz v0, :cond_1

    .line 403
    :cond_0
    new-instance p2, Lorg/jdom2/output/XMLOutputter;

    invoke-direct {p2}, Lorg/jdom2/output/XMLOutputter;-><init>()V

    invoke-virtual {p2, p3}, Lorg/jdom2/output/XMLOutputter;->outputString(Lorg/jdom2/DocType;)Ljava/lang/String;

    move-result-object p2

    .line 407
    :try_start_0
    invoke-direct {p0, p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->createDTDParser(Lorg/jdom2/output/support/SAXTarget;)Lorg/xml/sax/XMLReader;

    move-result-object p1

    new-instance p3, Lorg/xml/sax/InputSource;

    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p3, v0}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    invoke-interface {p1, p3}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 415
    new-instance p2, Lorg/xml/sax/SAXException;

    const-string p3, "DTD parsing error"

    invoke-direct {p2, p3, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    :cond_1
    :goto_0
    return-void
.end method

.method protected printDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Document;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    if-nez p4, :cond_0

    return-void

    .line 339
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object v0

    invoke-interface {v0}, Lorg/xml/sax/ContentHandler;->startDocument()V

    .line 342
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->isReportDTDEvents()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 343
    invoke-virtual {p4}, Lorg/jdom2/Document;->getDocType()Lorg/jdom2/DocType;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printDocType(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V

    .line 349
    :cond_1
    invoke-virtual {p4}, Lorg/jdom2/Document;->getContentSize()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 353
    invoke-virtual {p4, v1}, Lorg/jdom2/Document;->getContent(I)Lorg/jdom2/Content;

    move-result-object v2

    .line 354
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLocator()Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/jdom2/output/support/SAXTarget$SAXLocator;->setNode(Ljava/lang/Object;)V

    .line 355
    sget-object v3, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v2}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v4

    invoke-virtual {v4}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 367
    :pswitch_0
    check-cast v2, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p2, v2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printProcessingInstruction(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V

    goto :goto_1

    .line 364
    :pswitch_1
    check-cast v2, Lorg/jdom2/Element;

    invoke-virtual {p0, p1, p2, p3, v2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printElement(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V

    goto :goto_1

    .line 357
    :pswitch_2
    check-cast v2, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p2, v2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printComment(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V

    :goto_1
    :pswitch_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 377
    :cond_2
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    invoke-interface {p1}, Lorg/xml/sax/ContentHandler;->endDocument()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected printElement(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 543
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object v0

    .line 544
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLocator()Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jdom2/output/support/SAXTarget$SAXLocator;->getNode()Ljava/lang/Object;

    move-result-object v1

    .line 545
    invoke-virtual {p3, p4}, Lorg/jdom2/util/NamespaceStack;->push(Lorg/jdom2/Element;)V

    .line 549
    :try_start_0
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLocator()Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    move-result-object v2

    invoke-virtual {v2, p4}, Lorg/jdom2/output/support/SAXTarget$SAXLocator;->setNode(Ljava/lang/Object;)V

    .line 551
    new-instance v2, Lorg/xml/sax/helpers/AttributesImpl;

    invoke-direct {v2}, Lorg/xml/sax/helpers/AttributesImpl;-><init>()V

    .line 554
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->addedForward()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Namespace;

    .line 555
    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lorg/xml/sax/ContentHandler;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 556
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->isDeclareNamespaces()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 558
    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    .line 559
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, ""

    const-string v5, ""

    const-string v6, "xmlns"

    const-string v7, "CDATA"

    .line 560
    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v8

    move-object v3, v2

    invoke-virtual/range {v3 .. v8}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v4, ""

    const-string v5, ""

    .line 562
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "xmlns:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "CDATA"

    invoke-virtual {v3}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v8

    move-object v3, v2

    invoke-virtual/range {v3 .. v8}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 569
    :cond_2
    invoke-virtual {p4}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 570
    invoke-virtual {p4}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Attribute;

    .line 571
    invoke-virtual {v3}, Lorg/jdom2/Attribute;->isSpecified()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isSpecifiedAttributesOnly()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 574
    :cond_3
    invoke-virtual {v3}, Lorg/jdom2/Attribute;->getNamespaceURI()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lorg/jdom2/Attribute;->getQualifiedName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lorg/jdom2/Attribute;->getAttributeType()Lorg/jdom2/AttributeType;

    move-result-object v7

    invoke-static {v7}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->getAttributeTypeName(Lorg/jdom2/AttributeType;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lorg/jdom2/Attribute;->getValue()Ljava/lang/String;

    move-result-object v8

    move-object v3, v2

    invoke-virtual/range {v3 .. v8}, Lorg/xml/sax/helpers/AttributesImpl;->addAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 582
    :cond_4
    invoke-virtual {p4}, Lorg/jdom2/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p4}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v3, v4, v5, v2}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 585
    invoke-virtual {p4}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object v2

    .line 588
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    .line 589
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getTextMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v3

    const-string v4, "space"

    .line 592
    sget-object v5, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p4, v4, v5}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "default"

    .line 595
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 596
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getDefaultMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v3

    goto :goto_2

    :cond_5
    const-string v5, "preserve"

    .line 597
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 598
    sget-object v3, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    .line 601
    :cond_6
    :goto_2
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->push()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 603
    :try_start_1
    invoke-virtual {p2, v3}, Lorg/jdom2/output/support/FormatStack;->setTextMode(Lorg/jdom2/output/Format$TextMode;)V

    const/4 v3, 0x0

    .line 604
    invoke-virtual {p0, p2, v2, v3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object v2

    .line 605
    invoke-interface {v2}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 607
    invoke-interface {v2}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadBetween()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 610
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadBetween()Ljava/lang/String;

    move-result-object v3

    .line 611
    new-instance v4, Lorg/jdom2/Text;

    invoke-direct {v4, v3}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, v4}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printText(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Text;)V

    .line 614
    :cond_7
    invoke-virtual {p0, p1, p2, p3, v2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printContent(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V

    .line 616
    invoke-interface {v2}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadLast()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 619
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadLast()Ljava/lang/String;

    move-result-object v2

    .line 621
    new-instance v3, Lorg/jdom2/Text;

    invoke-direct {v3, v2}, Lorg/jdom2/Text;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, v3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printText(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Text;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 627
    :cond_8
    :try_start_2
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->pop()V

    goto :goto_3

    :catchall_0
    move-exception p4

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->pop()V

    throw p4

    .line 632
    :cond_9
    :goto_3
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p2

    invoke-virtual {p4}, Lorg/jdom2/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, v2, v3, p4}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->addedReverse()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lorg/jdom2/Namespace;

    .line 638
    invoke-virtual {p4}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object p4

    invoke-interface {v0, p4}, Lorg/xml/sax/ContentHandler;->endPrefixMapping(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    .line 642
    :cond_a
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    .line 643
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLocator()Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/jdom2/output/support/SAXTarget$SAXLocator;->setNode(Ljava/lang/Object;)V

    return-void

    :catchall_1
    move-exception p2

    .line 642
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    .line 643
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getLocator()Lorg/jdom2/output/support/SAXTarget$SAXLocator;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/jdom2/output/support/SAXTarget$SAXLocator;->setNode(Ljava/lang/Object;)V

    throw p2
.end method

.method protected printEntityRef(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/EntityRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 475
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    invoke-virtual {p3}, Lorg/jdom2/EntityRef;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/xml/sax/ContentHandler;->skippedEntity(Ljava/lang/String;)V

    return-void
.end method

.method protected printProcessingInstruction(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 436
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    invoke-virtual {p3}, Lorg/jdom2/ProcessingInstruction;->getTarget()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lorg/jdom2/ProcessingInstruction;->getData()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lorg/xml/sax/ContentHandler;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected printText(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Text;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 518
    invoke-virtual {p3}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    .line 519
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    array-length p3, p2

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0, p3}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    return-void
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/output/support/SAXTarget;",
            "Lorg/jdom2/output/Format;",
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

    .line 170
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 171
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x0

    .line 172
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 173
    new-instance p3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printContent(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 175
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the List: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 184
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 185
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 186
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x0

    .line 187
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 188
    new-instance p3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printContent(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 190
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the CDATA: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 214
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 215
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printComment(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 217
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the Comment: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/DocType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 145
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 146
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printDocType(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 148
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the DocType: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 132
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 133
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Document;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 136
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the Document: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 157
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 158
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printElement(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 161
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the Element: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 239
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 240
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printEntityRef(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/EntityRef;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 242
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the EntityRef: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 226
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 227
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printProcessingInstruction(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 229
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the ProcessingInstruction: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public process(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 199
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 200
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 201
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x0

    .line 202
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 203
    new-instance p3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printContent(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 205
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the Text: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public processAsDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/output/support/SAXTarget;",
            "Lorg/jdom2/output/Format;",
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

    if-eqz p3, :cond_3

    .line 252
    :try_start_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 256
    :cond_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 258
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object v0

    invoke-interface {v0}, Lorg/xml/sax/ContentHandler;->startDocument()V

    .line 260
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    .line 263
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->isReportDTDEvents()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 264
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Content;

    .line 265
    instance-of v2, v1, Lorg/jdom2/DocType;

    if-eqz v2, :cond_1

    .line 266
    check-cast v1, Lorg/jdom2/DocType;

    invoke-virtual {p0, p1, v0, v1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printDocType(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V

    :cond_2
    const/4 p2, 0x0

    .line 274
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 276
    new-instance p3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p3, p2}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printContent(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V

    .line 279
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    invoke-interface {p1}, Lorg/xml/sax/ContentHandler;->endDocument()V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 281
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the List: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    :goto_0
    return-void
.end method

.method public processAsDocument(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-nez p3, :cond_0

    return-void

    .line 294
    :cond_0
    :try_start_0
    invoke-static {p1}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->locate(Lorg/jdom2/output/support/SAXTarget;)V

    .line 296
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object v0

    invoke-interface {v0}, Lorg/xml/sax/ContentHandler;->startDocument()V

    .line 298
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/jdom2/output/support/AbstractSAXOutputProcessor;->printElement(Lorg/jdom2/output/support/SAXTarget;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V

    .line 302
    invoke-virtual {p1}, Lorg/jdom2/output/support/SAXTarget;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    invoke-interface {p1}, Lorg/xml/sax/ContentHandler;->endDocument()V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 304
    new-instance p2, Lorg/jdom2/JDOMException;

    const-string p3, "Encountered a SAX exception processing the Element: "

    invoke-direct {p2, p3, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
