.class public final Lorg/jdom2/xpath/XPathHelper;
.super Ljava/lang/Object;
.source "XPathHelper.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAbsolutePath(Lorg/jdom2/Attribute;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_3

    .line 552
    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v1, v0

    .line 558
    :goto_0
    invoke-virtual {v1}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 559
    invoke-virtual {v1}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v1

    goto :goto_0

    .line 561
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "/"

    .line 563
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    invoke-static {v1, v2}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    if-eq v0, v1, :cond_1

    const-string v3, "/"

    .line 566
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    invoke-static {v1, v0, v2}, Lorg/jdom2/xpath/XPathHelper;->getRelativeElementPath(Lorg/jdom2/Element;Lorg/jdom2/Parent;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v0, "/"

    .line 569
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    invoke-static {p0, v2}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 571
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 554
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot create a path to detached target"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 548
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Cannot create a path to a null target"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getAbsolutePath(Lorg/jdom2/Content;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_6

    .line 506
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 508
    instance-of v1, p0, Lorg/jdom2/Element;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Lorg/jdom2/Element;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/Content;->getParentElement()Lorg/jdom2/Element;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    .line 511
    invoke-virtual {p0}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "/"

    .line 516
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    invoke-static {p0, v0}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 518
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 512
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot create a path to detached target"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    move-object v2, v1

    .line 521
    :goto_1
    invoke-virtual {v2}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 522
    invoke-virtual {v2}, Lorg/jdom2/Element;->getParentElement()Lorg/jdom2/Element;

    move-result-object v2

    goto :goto_1

    :cond_3
    const-string v3, "/"

    .line 524
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    invoke-static {v2, v0}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    if-eq v2, v1, :cond_4

    const-string v3, "/"

    .line 527
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    invoke-static {v2, v1, v0}, Lorg/jdom2/xpath/XPathHelper;->getRelativeElementPath(Lorg/jdom2/Element;Lorg/jdom2/Parent;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    :cond_4
    if-eq v1, p0, :cond_5

    const-string v1, "/"

    .line 531
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    invoke-static {p0, v0}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 534
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 502
    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Cannot create a path to a null target"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getPositionPath(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/StringBuilder;",
            ")",
            "Ljava/lang/StringBuilder;"
        }
    .end annotation

    .line 150
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_3

    const/4 p2, 0x0

    .line 154
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 155
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 p2, p2, 0x1

    .line 157
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    :cond_1
    const/4 p0, 0x1

    if-gt p2, p0, :cond_2

    .line 160
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/16 p0, 0x5b

    .line 163
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    return-object p3
.end method

.method private static getRelativeElementPath(Lorg/jdom2/Element;Lorg/jdom2/Parent;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    if-ne p0, p1, :cond_0

    const-string p0, "."

    .line 271
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p2

    .line 278
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-eqz p1, :cond_1

    if-eq p1, p0, :cond_1

    .line 281
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    invoke-interface {p1}, Lorg/jdom2/Parent;->getParent()Lorg/jdom2/Parent;

    move-result-object p1

    goto :goto_0

    .line 286
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eq p1, p0, :cond_4

    const/4 p1, 0x0

    :goto_1
    if-eqz p0, :cond_2

    .line 296
    invoke-static {p0, v0}, Lorg/jdom2/xpath/XPathHelper;->locate(Lorg/jdom2/Parent;Ljava/util/List;)I

    move-result v1

    if-gez v1, :cond_2

    add-int/lit8 p1, p1, 0x1

    .line 300
    invoke-interface {p0}, Lorg/jdom2/Parent;->getParent()Lorg/jdom2/Parent;

    move-result-object p0

    goto :goto_1

    :cond_2
    if-eqz p0, :cond_3

    :goto_2
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_4

    const-string p0, "../"

    .line 309
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 303
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The \'from\' and \'to\' Element have no common ancestor."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_3
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_5

    .line 315
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/jdom2/NamespaceAware;

    invoke-static {p0, p2}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    .line 316
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 319
    :cond_5
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    return-object p2
.end method

.method public static getRelativePath(Lorg/jdom2/Attribute;Lorg/jdom2/Attribute;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    if-ne p0, p1, :cond_0

    const-string p0, "."

    return-object p0

    .line 449
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 455
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "../"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Lorg/jdom2/xpath/XPathHelper;->getRelativePath(Lorg/jdom2/Content;Lorg/jdom2/Attribute;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 451
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot create a path from a detached attrbibute"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 442
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path to a null target"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 438
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path from a null \'from\'"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getRelativePath(Lorg/jdom2/Attribute;Lorg/jdom2/Content;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    .line 480
    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object p0

    if-eqz p0, :cond_1

    if-ne p0, p1, :cond_0

    const-string p0, ".."

    return-object p0

    .line 488
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "../"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Lorg/jdom2/xpath/XPathHelper;->getRelativePath(Lorg/jdom2/Content;Lorg/jdom2/Content;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 482
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot create a path from a detached attrbibute"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 477
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path to a null target"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 473
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path from a null \'from\'"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getRelativePath(Lorg/jdom2/Content;Lorg/jdom2/Attribute;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_2

    if-eqz p1, :cond_1

    .line 411
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 416
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p0, v0}, Lorg/jdom2/xpath/XPathHelper;->getRelativePath(Lorg/jdom2/Content;Lorg/jdom2/Content;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p0, "/"

    .line 417
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    invoke-static {p1, v1}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 419
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 413
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot create a path to detached Attribute"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 408
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path to a null Attribute"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 404
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path from a null Content"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getRelativePath(Lorg/jdom2/Content;Lorg/jdom2/Content;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_6

    if-eqz p1, :cond_5

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-ne p0, p1, :cond_0

    const-string p0, "."

    return-object p0

    .line 369
    :cond_0
    instance-of v1, p0, Lorg/jdom2/Element;

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, Lorg/jdom2/Element;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lorg/jdom2/Content;->getParentElement()Lorg/jdom2/Element;

    move-result-object v1

    :goto_0
    if-eq p0, v1, :cond_2

    const-string p0, "../"

    .line 372
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    :cond_2
    instance-of p0, p1, Lorg/jdom2/Element;

    if-eqz p0, :cond_3

    .line 375
    check-cast p1, Lorg/jdom2/Element;

    invoke-static {v1, p1, v0}, Lorg/jdom2/xpath/XPathHelper;->getRelativeElementPath(Lorg/jdom2/Element;Lorg/jdom2/Parent;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 377
    :cond_3
    invoke-virtual {p1}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 382
    invoke-static {v1, p0, v0}, Lorg/jdom2/xpath/XPathHelper;->getRelativeElementPath(Lorg/jdom2/Element;Lorg/jdom2/Parent;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    .line 383
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    invoke-static {p1, v0}, Lorg/jdom2/xpath/XPathHelper;->getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 386
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 379
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot get a relative XPath to detached content."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 362
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path to a null target"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 358
    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot create a path from a null target"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final getSingleStep(Lorg/jdom2/NamespaceAware;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 7

    .line 180
    instance-of v0, p0, Lorg/jdom2/Content;

    if-eqz v0, :cond_b

    .line 182
    move-object v0, p0

    check-cast v0, Lorg/jdom2/Content;

    .line 184
    invoke-virtual {v0}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object v1

    .line 186
    instance-of v2, v0, Lorg/jdom2/Text;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 188
    :cond_0
    invoke-static {}, Lorg/jdom2/filter/Filters;->text()Lorg/jdom2/filter/Filter;

    move-result-object p0

    invoke-interface {v1, p0}, Lorg/jdom2/Parent;->getContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object v3

    :goto_0
    const-string p0, "text()"

    .line 190
    invoke-static {v0, v3, p0, p1}, Lorg/jdom2/xpath/XPathHelper;->getPositionPath(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0

    .line 192
    :cond_1
    instance-of v2, v0, Lorg/jdom2/Comment;

    if-eqz v2, :cond_3

    if-nez v1, :cond_2

    goto :goto_1

    .line 194
    :cond_2
    invoke-static {}, Lorg/jdom2/filter/Filters;->comment()Lorg/jdom2/filter/Filter;

    move-result-object p0

    invoke-interface {v1, p0}, Lorg/jdom2/Parent;->getContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object v3

    :goto_1
    const-string p0, "comment()"

    .line 196
    invoke-static {v0, v3, p0, p1}, Lorg/jdom2/xpath/XPathHelper;->getPositionPath(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0

    .line 198
    :cond_3
    instance-of v2, v0, Lorg/jdom2/ProcessingInstruction;

    if-eqz v2, :cond_5

    if-nez v1, :cond_4

    goto :goto_2

    .line 200
    :cond_4
    invoke-static {}, Lorg/jdom2/filter/Filters;->processinginstruction()Lorg/jdom2/filter/Filter;

    move-result-object p0

    invoke-interface {v1, p0}, Lorg/jdom2/Parent;->getContent(Lorg/jdom2/filter/Filter;)Ljava/util/List;

    move-result-object v3

    :goto_2
    const-string p0, "processing-instruction()"

    .line 202
    invoke-static {v0, v3, p0, p1}, Lorg/jdom2/xpath/XPathHelper;->getPositionPath(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0

    .line 205
    :cond_5
    instance-of v2, v0, Lorg/jdom2/Element;

    if-eqz v2, :cond_7

    move-object v4, v0

    check-cast v4, Lorg/jdom2/Element;

    invoke-virtual {v4}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v5

    sget-object v6, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v5, v6, :cond_7

    .line 210
    invoke-virtual {v4}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object p0

    .line 211
    instance-of v2, v1, Lorg/jdom2/Element;

    if-eqz v2, :cond_6

    check-cast v1, Lorg/jdom2/Element;

    invoke-virtual {v1, p0}, Lorg/jdom2/Element;->getChildren(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 213
    :cond_6
    invoke-static {v0, v3, p0, p1}, Lorg/jdom2/xpath/XPathHelper;->getPositionPath(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0

    :cond_7
    if-eqz v2, :cond_9

    .line 220
    move-object p0, v0

    check-cast p0, Lorg/jdom2/Element;

    .line 224
    instance-of v2, v1, Lorg/jdom2/Element;

    if-eqz v2, :cond_8

    check-cast v1, Lorg/jdom2/Element;

    invoke-virtual {p0}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/jdom2/Element;->getChildren(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/util/List;

    move-result-object v3

    .line 226
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "*[local-name() = \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/Element;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' and namespace-uri() = \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\']"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 229
    invoke-static {v0, v3, p0, p1}, Lorg/jdom2/xpath/XPathHelper;->getPositionPath(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0

    :cond_9
    if-nez v1, :cond_a

    .line 232
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_3

    :cond_a
    invoke-interface {v1}, Lorg/jdom2/Parent;->getContent()Ljava/util/List;

    move-result-object p0

    :goto_3
    const-string v1, "node()"

    .line 234
    invoke-static {v0, p0, v1, p1}, Lorg/jdom2/xpath/XPathHelper;->getPositionPath(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0

    .line 237
    :cond_b
    instance-of v0, p0, Lorg/jdom2/Attribute;

    if-eqz v0, :cond_d

    .line 238
    check-cast p0, Lorg/jdom2/Attribute;

    .line 239
    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v0

    sget-object v1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v0, v1, :cond_c

    const-string v0, "@"

    .line 240
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_c
    const-string v0, "@*[local-name() = \'"

    .line 242
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' and namespace-uri() = \'"

    .line 243
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getNamespaceURI()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\']"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    :goto_4
    return-object p1
.end method

.method private static locate(Lorg/jdom2/Parent;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/Parent;",
            "Ljava/util/List<",
            "Lorg/jdom2/Parent;",
            ">;)I"
        }
    .end annotation

    .line 334
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :cond_0
    const/4 v1, -0x1

    add-int/2addr v0, v1

    if-ltz v0, :cond_1

    .line 336
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-ne p0, v1, :cond_0

    return v0

    :cond_1
    return v1
.end method
