.class public Lorg/jdom2/input/DOMBuilder;
.super Ljava/lang/Object;
.source "DOMBuilder.java"


# instance fields
.field private factory:Lorg/jdom2/JDOMFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Lorg/jdom2/DefaultJDOMFactory;

    invoke-direct {v0}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    iput-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    return-void
.end method

.method private buildTree(Lorg/w3c/dom/Node;Lorg/jdom2/Document;Lorg/jdom2/Element;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 248
    invoke-interface/range {p1 .. p1}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v3, v5, :cond_2

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_b

    .line 468
    :pswitch_0
    iget-object v2, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/DocumentType;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/DocumentType;)Lorg/jdom2/DocType;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    .line 250
    :pswitch_1
    invoke-interface/range {p1 .. p1}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v3

    .line 251
    invoke-interface {v3}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v6

    :goto_0
    if-ge v4, v6, :cond_17

    .line 252
    invoke-interface {v3, v4}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v7

    invoke-direct {v0, v7, v1, v2, v5}, Lorg/jdom2/input/DOMBuilder;->buildTree(Lorg/w3c/dom/Node;Lorg/jdom2/Document;Lorg/jdom2/Element;Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :pswitch_2
    if-eqz p4, :cond_0

    .line 452
    iget-object v2, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/Comment;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/Comment;)Lorg/jdom2/Comment;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    .line 454
    :cond_0
    iget-object v1, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/Comment;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/Comment;)Lorg/jdom2/Comment;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    :pswitch_3
    if-eqz p4, :cond_1

    .line 444
    iget-object v2, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/ProcessingInstruction;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/ProcessingInstruction;)Lorg/jdom2/ProcessingInstruction;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    .line 446
    :cond_1
    iget-object v1, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/ProcessingInstruction;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/ProcessingInstruction;)Lorg/jdom2/ProcessingInstruction;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    .line 459
    :pswitch_4
    iget-object v1, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/EntityReference;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/EntityReference;)Lorg/jdom2/EntityRef;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    .line 438
    :pswitch_5
    iget-object v1, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/CDATASection;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/CDATASection;)Lorg/jdom2/CDATA;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    .line 434
    :pswitch_6
    iget-object v1, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    move-object/from16 v3, p1

    check-cast v3, Lorg/w3c/dom/Text;

    invoke-virtual {v0, v3}, Lorg/jdom2/input/DOMBuilder;->build(Lorg/w3c/dom/Text;)Lorg/jdom2/Text;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    goto/16 :goto_b

    .line 257
    :cond_2
    invoke-interface/range {p1 .. p1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v3

    const-string v6, ""

    const/16 v7, 0x3a

    .line 260
    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-ltz v8, :cond_3

    .line 262
    invoke-virtual {v3, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/2addr v8, v5

    .line 263
    invoke-virtual {v3, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 268
    :cond_3
    invoke-interface/range {p1 .. p1}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_5

    if-nez v2, :cond_4

    .line 270
    sget-object v8, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    goto :goto_1

    :cond_4
    invoke-virtual {v2, v6}, Lorg/jdom2/Element;->getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v8

    goto :goto_1

    .line 274
    :cond_5
    invoke-static {v6, v8}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v8

    .line 277
    :goto_1
    iget-object v9, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v9, v3, v8}, Lorg/jdom2/JDOMFactory;->element(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    move-result-object v3

    if-eqz p4, :cond_6

    .line 281
    iget-object v2, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v2, v1, v3}, Lorg/jdom2/JDOMFactory;->setRoot(Lorg/jdom2/Document;Lorg/jdom2/Element;)V

    goto :goto_2

    .line 284
    :cond_6
    iget-object v8, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v8, v2, v3}, Lorg/jdom2/JDOMFactory;->addContent(Lorg/jdom2/Parent;Lorg/jdom2/Content;)V

    .line 288
    :goto_2
    invoke-interface/range {p1 .. p1}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v2

    .line 289
    invoke-interface {v2}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v8

    move v9, v4

    :goto_3
    if-ge v9, v8, :cond_a

    .line 292
    invoke-interface {v2, v9}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v10

    check-cast v10, Lorg/w3c/dom/Attr;

    .line 294
    invoke-interface {v10}, Lorg/w3c/dom/Attr;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "xmlns"

    .line 295
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    const-string v12, ""

    .line 297
    invoke-virtual {v11, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-ltz v13, :cond_7

    add-int/lit8 v13, v13, 0x1

    .line 299
    invoke-virtual {v11, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    .line 302
    :cond_7
    invoke-interface {v10}, Lorg/w3c/dom/Attr;->getValue()Ljava/lang/String;

    move-result-object v10

    .line 304
    invoke-static {v12, v10}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v10

    .line 312
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 317
    invoke-virtual {v3, v10}, Lorg/jdom2/Element;->setNamespace(Lorg/jdom2/Namespace;)Lorg/jdom2/Element;

    goto :goto_4

    .line 320
    :cond_8
    iget-object v11, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v11, v3, v10}, Lorg/jdom2/JDOMFactory;->addNamespaceDeclaration(Lorg/jdom2/Element;Lorg/jdom2/Namespace;)V

    :cond_9
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_a
    move v6, v4

    :goto_5
    if-ge v6, v8, :cond_15

    .line 327
    invoke-interface {v2, v6}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v9

    check-cast v9, Lorg/w3c/dom/Attr;

    .line 329
    invoke-interface {v9}, Lorg/w3c/dom/Attr;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "xmlns"

    .line 331
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_14

    const-string v11, ""

    .line 334
    invoke-virtual {v10, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-ltz v12, :cond_b

    .line 336
    invoke-virtual {v10, v4, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v12, v12, 0x1

    .line 337
    invoke-virtual {v10, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    .line 340
    :cond_b
    invoke-interface {v9}, Lorg/w3c/dom/Attr;->getValue()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    .line 344
    invoke-interface {v9}, Lorg/w3c/dom/Attr;->getNamespaceURI()Ljava/lang/String;

    move-result-object v9

    .line 345
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_d

    if-eqz v9, :cond_c

    const-string v14, ""

    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    .line 346
    :cond_c
    sget-object v9, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    goto/16 :goto_9

    .line 357
    :cond_d
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v14

    if-lez v14, :cond_f

    if-nez v9, :cond_e

    .line 371
    invoke-virtual {v3, v11}, Lorg/jdom2/Element;->getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v9

    goto/16 :goto_9

    .line 373
    :cond_e
    invoke-static {v11, v9}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v9

    goto/16 :goto_9

    .line 380
    :cond_f
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 381
    invoke-virtual {v3}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_11

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lorg/jdom2/Namespace;

    .line 382
    invoke-virtual {v15}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_10

    invoke-virtual {v15}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    move-object v13, v15

    goto :goto_7

    .line 386
    :cond_10
    invoke-virtual {v15}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v7, 0x3a

    goto :goto_6

    :cond_11
    :goto_7
    if-nez v13, :cond_13

    const-string v7, "attns"

    .line 402
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move v14, v4

    .line 403
    :goto_8
    invoke-virtual {v11, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    add-int/2addr v14, v5

    .line 405
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_8

    .line 407
    :cond_12
    invoke-static {v13, v9}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v9

    goto :goto_9

    :cond_13
    move-object v9, v13

    .line 412
    :goto_9
    iget-object v7, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v7, v10, v12, v9}, Lorg/jdom2/JDOMFactory;->attribute(Ljava/lang/String;Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;

    move-result-object v7

    .line 414
    iget-object v9, v0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {v9, v3, v7}, Lorg/jdom2/JDOMFactory;->setAttribute(Lorg/jdom2/Element;Lorg/jdom2/Attribute;)V

    :cond_14
    add-int/lit8 v6, v6, 0x1

    const/16 v7, 0x3a

    goto/16 :goto_5

    .line 421
    :cond_15
    invoke-interface/range {p1 .. p1}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v2

    if-eqz v2, :cond_17

    .line 423
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v5

    move v6, v4

    :goto_a
    if-ge v6, v5, :cond_17

    .line 425
    invoke-interface {v2, v6}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v7

    if-eqz v7, :cond_16

    .line 427
    invoke-direct {v0, v7, v1, v3, v4}, Lorg/jdom2/input/DOMBuilder;->buildTree(Lorg/w3c/dom/Node;Lorg/jdom2/Document;Lorg/jdom2/Element;Z)V

    :cond_16
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_17
    :goto_b
    :pswitch_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public build(Lorg/w3c/dom/CDATASection;)Lorg/jdom2/CDATA;
    .locals 1

    .line 165
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1}, Lorg/w3c/dom/CDATASection;->getNodeValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/jdom2/JDOMFactory;->cdata(Ljava/lang/String;)Lorg/jdom2/CDATA;

    move-result-object p1

    return-object p1
.end method

.method public build(Lorg/w3c/dom/Comment;)Lorg/jdom2/Comment;
    .locals 1

    .line 187
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1}, Lorg/w3c/dom/Comment;->getNodeValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/jdom2/JDOMFactory;->comment(Ljava/lang/String;)Lorg/jdom2/Comment;

    move-result-object p1

    return-object p1
.end method

.method public build(Lorg/w3c/dom/DocumentType;)Lorg/jdom2/DocType;
    .locals 4

    .line 220
    invoke-interface {p1}, Lorg/w3c/dom/DocumentType;->getPublicId()Ljava/lang/String;

    move-result-object v0

    .line 221
    invoke-interface {p1}, Lorg/w3c/dom/DocumentType;->getSystemId()Ljava/lang/String;

    move-result-object v1

    .line 222
    invoke-interface {p1}, Lorg/w3c/dom/DocumentType;->getInternalSubset()Ljava/lang/String;

    move-result-object v2

    .line 224
    iget-object v3, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1}, Lorg/w3c/dom/DocumentType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1}, Lorg/jdom2/JDOMFactory;->docType(Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    .line 225
    invoke-virtual {p1, v0}, Lorg/jdom2/DocType;->setPublicID(Ljava/lang/String;)Lorg/jdom2/DocType;

    .line 226
    invoke-virtual {p1, v1}, Lorg/jdom2/DocType;->setSystemID(Ljava/lang/String;)Lorg/jdom2/DocType;

    .line 227
    invoke-virtual {p1, v2}, Lorg/jdom2/DocType;->setInternalSubset(Ljava/lang/String;)V

    return-object p1
.end method

.method public build(Lorg/w3c/dom/Document;)Lorg/jdom2/Document;
    .locals 3

    .line 140
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/jdom2/JDOMFactory;->document(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    move-result-object v0

    const/4 v2, 0x1

    .line 141
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/jdom2/input/DOMBuilder;->buildTree(Lorg/w3c/dom/Node;Lorg/jdom2/Document;Lorg/jdom2/Element;Z)V

    return-object v0
.end method

.method public build(Lorg/w3c/dom/Element;)Lorg/jdom2/Element;
    .locals 3

    .line 152
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/jdom2/JDOMFactory;->document(Lorg/jdom2/Element;)Lorg/jdom2/Document;

    move-result-object v0

    const/4 v2, 0x1

    .line 153
    invoke-direct {p0, p1, v0, v1, v2}, Lorg/jdom2/input/DOMBuilder;->buildTree(Lorg/w3c/dom/Node;Lorg/jdom2/Document;Lorg/jdom2/Element;Z)V

    .line 154
    invoke-virtual {v0}, Lorg/jdom2/Document;->getRootElement()Lorg/jdom2/Element;

    move-result-object p1

    return-object p1
.end method

.method public build(Lorg/w3c/dom/EntityReference;)Lorg/jdom2/EntityRef;
    .locals 1

    .line 209
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1}, Lorg/w3c/dom/EntityReference;->getNodeName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/jdom2/JDOMFactory;->entityRef(Ljava/lang/String;)Lorg/jdom2/EntityRef;

    move-result-object p1

    return-object p1
.end method

.method public build(Lorg/w3c/dom/ProcessingInstruction;)Lorg/jdom2/ProcessingInstruction;
    .locals 2

    .line 198
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1}, Lorg/w3c/dom/ProcessingInstruction;->getTarget()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lorg/w3c/dom/ProcessingInstruction;->getData()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lorg/jdom2/JDOMFactory;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method public build(Lorg/w3c/dom/Text;)Lorg/jdom2/Text;
    .locals 1

    .line 176
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    invoke-interface {p1}, Lorg/w3c/dom/Text;->getNodeValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/jdom2/JDOMFactory;->text(Ljava/lang/String;)Lorg/jdom2/Text;

    move-result-object p1

    return-object p1
.end method

.method public getFactory()Lorg/jdom2/JDOMFactory;
    .locals 1

    .line 130
    iget-object v0, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    return-object v0
.end method

.method public setFactory(Lorg/jdom2/JDOMFactory;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lorg/jdom2/input/DOMBuilder;->factory:Lorg/jdom2/JDOMFactory;

    return-void
.end method
