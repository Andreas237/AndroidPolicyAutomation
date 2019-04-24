.class final Lorg/jdom2/ContentList;
.super Ljava/util/AbstractList;
.source "ContentList.java"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/ContentList$FilterListIterator;,
        Lorg/jdom2/ContentList$FilterList;,
        Lorg/jdom2/ContentList$CLListIterator;,
        Lorg/jdom2/ContentList$CLIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Lorg/jdom2/Content;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field private static final INITIAL_ARRAY_SIZE:I = 0x4


# instance fields
.field private transient dataModiCount:I

.field private elementData:[Lorg/jdom2/Content;

.field private final parent:Lorg/jdom2/Parent;

.field private size:I

.field private transient sizeModCount:I


# direct methods
.method constructor <init>(Lorg/jdom2/Parent;)V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    const/4 v0, 0x0

    .line 85
    iput-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    const/high16 v0, -0x80000000

    .line 98
    iput v0, p0, Lorg/jdom2/ContentList;->sizeModCount:I

    .line 104
    iput v0, p0, Lorg/jdom2/ContentList;->dataModiCount:I

    .line 116
    iput-object p1, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    return-void
.end method

.method static synthetic access$100(Lorg/jdom2/ContentList;)I
    .locals 0

    .line 79
    invoke-direct {p0}, Lorg/jdom2/ContentList;->getModCount()I

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lorg/jdom2/ContentList;)I
    .locals 0

    .line 79
    iget p0, p0, Lorg/jdom2/ContentList;->size:I

    return p0
.end method

.method static synthetic access$300(Lorg/jdom2/ContentList;)[Lorg/jdom2/Content;
    .locals 0

    .line 79
    iget-object p0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    return-object p0
.end method

.method static synthetic access$400(Lorg/jdom2/ContentList;IZ)V
    .locals 0

    .line 79
    invoke-direct {p0, p1, p2}, Lorg/jdom2/ContentList;->checkIndex(IZ)V

    return-void
.end method

.method static synthetic access$500(Lorg/jdom2/ContentList;)I
    .locals 0

    .line 79
    invoke-direct {p0}, Lorg/jdom2/ContentList;->getDataModCount()I

    move-result p0

    return p0
.end method

.method static synthetic access$600(Lorg/jdom2/ContentList;II)V
    .locals 0

    .line 79
    invoke-direct {p0, p1, p2}, Lorg/jdom2/ContentList;->setModCount(II)V

    return-void
.end method

.method static synthetic access$700(Lorg/jdom2/ContentList;[I)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Lorg/jdom2/ContentList;->sortInPlace([I)V

    return-void
.end method

.method private final binarySearch([IIILjava/util/Comparator;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([III",
            "Ljava/util/Comparator<",
            "-",
            "Lorg/jdom2/Content;",
            ">;)I"
        }
    .end annotation

    add-int/lit8 p2, p2, -0x1

    .line 612
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget-object p3, v0, p3

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p2, :cond_3

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    .line 615
    iget-object v2, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget v3, p1, v1

    aget-object v2, v2, v3

    invoke-interface {p4, p3, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_1

    :goto_1
    if-nez v2, :cond_0

    if-ge v1, p2, :cond_0

    .line 617
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    add-int/lit8 v3, v1, 0x1

    aget v4, p1, v3

    aget-object v0, v0, v4

    invoke-interface {p4, p3, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    move v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    return v1

    :cond_1
    if-gez v2, :cond_2

    add-int/lit8 p2, v1, -0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method private final checkIndex(IZ)V
    .locals 2

    if-eqz p2, :cond_0

    .line 187
    iget p2, p0, Lorg/jdom2/ContentList;->size:I

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    iget p2, p0, Lorg/jdom2/ContentList;->size:I

    :goto_0
    if-ltz p1, :cond_1

    if-gt p1, p2, :cond_1

    return-void

    .line 190
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lorg/jdom2/ContentList;->size:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final checkPreConditions(Lorg/jdom2/Content;IZ)V
    .locals 1

    if-eqz p1, :cond_5

    .line 202
    invoke-direct {p0, p2, p3}, Lorg/jdom2/ContentList;->checkIndex(IZ)V

    .line 204
    invoke-virtual {p1}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 206
    invoke-virtual {p1}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object p2

    .line 207
    instance-of p3, p2, Lorg/jdom2/Document;

    if-eqz p3, :cond_0

    .line 208
    new-instance p2, Lorg/jdom2/IllegalAddException;

    check-cast p1, Lorg/jdom2/Element;

    const-string p3, "The Content already has an existing parent document"

    invoke-direct {p2, p1, p3}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/Element;Ljava/lang/String;)V

    throw p2

    .line 211
    :cond_0
    new-instance p1, Lorg/jdom2/IllegalAddException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "The Content already has an existing parent \""

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p2, Lorg/jdom2/Element;

    invoke-virtual {p2}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\""

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 216
    :cond_1
    iget-object p2, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    if-eq p1, p2, :cond_4

    .line 222
    instance-of p3, p2, Lorg/jdom2/Element;

    if-eqz p3, :cond_3

    instance-of p3, p1, Lorg/jdom2/Element;

    if-eqz p3, :cond_3

    check-cast p1, Lorg/jdom2/Element;

    check-cast p2, Lorg/jdom2/Element;

    invoke-virtual {p1, p2}, Lorg/jdom2/Element;->isAncestor(Lorg/jdom2/Element;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 224
    :cond_2
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "The Element cannot be added as a descendent of itself"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    return-void

    .line 217
    :cond_4
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "The Element cannot be added to itself"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 199
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot add null object"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final getDataModCount()I
    .locals 1

    .line 183
    iget v0, p0, Lorg/jdom2/ContentList;->dataModiCount:I

    return v0
.end method

.method private final getModCount()I
    .locals 1

    .line 158
    iget v0, p0, Lorg/jdom2/ContentList;->sizeModCount:I

    return v0
.end method

.method private final incDataModOnly()V
    .locals 1

    .line 175
    iget v0, p0, Lorg/jdom2/ContentList;->dataModiCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/jdom2/ContentList;->dataModiCount:I

    return-void
.end method

.method private final incModCount()V
    .locals 1

    .line 169
    iget v0, p0, Lorg/jdom2/ContentList;->dataModiCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/jdom2/ContentList;->dataModiCount:I

    .line 171
    iget v0, p0, Lorg/jdom2/ContentList;->sizeModCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/jdom2/ContentList;->sizeModCount:I

    return-void
.end method

.method private static removeParent(Lorg/jdom2/Content;)V
    .locals 1

    const/4 v0, 0x0

    .line 511
    invoke-virtual {p0, v0}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    return-void
.end method

.method private final setModCount(II)V
    .locals 0

    .line 145
    iput p1, p0, Lorg/jdom2/ContentList;->sizeModCount:I

    .line 146
    iput p2, p0, Lorg/jdom2/ContentList;->dataModiCount:I

    return-void
.end method

.method private sortInPlace([I)V
    .locals 6

    .line 587
    array-length v0, p1

    invoke-static {p1, v0}, Lorg/jdom2/internal/ArrayCopy;->copyOf([II)[I

    move-result-object v0

    .line 588
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 589
    array-length v1, v0

    new-array v1, v1, [Lorg/jdom2/Content;

    const/4 v2, 0x0

    move v3, v2

    .line 590
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_0

    .line 591
    iget-object v4, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget v5, p1, v3

    aget-object v4, v4, v5

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 594
    :cond_0
    :goto_1
    array-length v3, p1

    if-ge v2, v3, :cond_1

    .line 595
    iget-object v3, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget v4, v0, v2

    aget-object v5, v1, v2

    aput-object v5, v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .line 79
    check-cast p2, Lorg/jdom2/Content;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    return-void
.end method

.method public add(ILorg/jdom2/Content;)V
    .locals 3

    const/4 v0, 0x0

    .line 244
    invoke-direct {p0, p2, p1, v0}, Lorg/jdom2/ContentList;->checkPreConditions(Lorg/jdom2/Content;IZ)V

    .line 246
    iget-object v1, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    invoke-interface {v1, p2, p1, v0}, Lorg/jdom2/Parent;->canContainContent(Lorg/jdom2/Content;IZ)V

    .line 248
    iget-object v0, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    invoke-virtual {p2, v0}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    .line 250
    iget v0, p0, Lorg/jdom2/ContentList;->size:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lorg/jdom2/ContentList;->ensureCapacity(I)V

    .line 251
    iget v0, p0, Lorg/jdom2/ContentList;->size:I

    if-ne p1, v0, :cond_0

    .line 252
    iget-object p1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/jdom2/ContentList;->size:I

    aput-object p2, p1, v0

    goto :goto_0

    .line 254
    :cond_0
    iget-object v1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 255
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aput-object p2, v0, p1

    .line 256
    iget p1, p0, Lorg/jdom2/ContentList;->size:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/jdom2/ContentList;->size:I

    .line 259
    :goto_0
    invoke-direct {p0}, Lorg/jdom2/ContentList;->incModCount()V

    return-void
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)Z"
        }
    .end annotation

    if-eqz p2, :cond_4

    const/4 v0, 0x0

    .line 296
    invoke-direct {p0, p1, v0}, Lorg/jdom2/ContentList;->checkIndex(IZ)V

    .line 298
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 303
    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 306
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/jdom2/Content;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    return v2

    .line 310
    :cond_1
    invoke-virtual {p0}, Lorg/jdom2/ContentList;->size()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p0, v3}, Lorg/jdom2/ContentList;->ensureCapacity(I)V

    .line 312
    invoke-direct {p0}, Lorg/jdom2/ContentList;->getModCount()I

    move-result v1

    .line 313
    invoke-direct {p0}, Lorg/jdom2/ContentList;->getDataModCount()I

    move-result v3

    .line 319
    :try_start_0
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jdom2/Content;

    add-int v5, p1, v0

    .line 320
    invoke-virtual {p0, v5, v4}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v2

    :catchall_0
    move-exception p2

    :goto_1
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_3

    add-int v2, p1, v0

    .line 328
    invoke-virtual {p0, v2}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    goto :goto_1

    .line 331
    :cond_3
    invoke-direct {p0, v1, v3}, Lorg/jdom2/ContentList;->setModCount(II)V

    throw p2

    .line 292
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Can not add a null collection to the ContentList"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)Z"
        }
    .end annotation

    .line 272
    iget v0, p0, Lorg/jdom2/ContentList;->size:I

    invoke-virtual {p0, v0, p1}, Lorg/jdom2/ContentList;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 3

    .line 343
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v1, v0

    .line 344
    :goto_0
    iget v2, p0, Lorg/jdom2/ContentList;->size:I

    if-ge v1, v2, :cond_0

    .line 345
    iget-object v2, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget-object v2, v2, v1

    .line 346
    invoke-static {v2}, Lorg/jdom2/ContentList;->removeParent(Lorg/jdom2/Content;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 348
    iput-object v1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    .line 349
    iput v0, p0, Lorg/jdom2/ContentList;->size:I

    .line 351
    :cond_1
    invoke-direct {p0}, Lorg/jdom2/ContentList;->incModCount()V

    return-void
.end method

.method clearAndSet(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 362
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 368
    :cond_0
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    .line 369
    iget v1, p0, Lorg/jdom2/ContentList;->size:I

    .line 370
    invoke-direct {p0}, Lorg/jdom2/ContentList;->getModCount()I

    move-result v2

    .line 371
    invoke-direct {p0}, Lorg/jdom2/ContentList;->getDataModCount()I

    move-result v3

    .line 377
    :goto_0
    iget v4, p0, Lorg/jdom2/ContentList;->size:I

    const/4 v5, 0x0

    if-lez v4, :cond_1

    add-int/lit8 v4, v4, -0x1

    .line 378
    iput v4, p0, Lorg/jdom2/ContentList;->size:I

    aget-object v4, v0, v4

    invoke-virtual {v4, v5}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 380
    iput v4, p0, Lorg/jdom2/ContentList;->size:I

    .line 381
    iput-object v5, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    .line 385
    :try_start_0
    invoke-virtual {p0, v4, p1}, Lorg/jdom2/ContentList;->addAll(ILjava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 394
    iput-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    .line 395
    :goto_1
    iget v0, p0, Lorg/jdom2/ContentList;->size:I

    if-ge v0, v1, :cond_2

    .line 396
    iget-object v4, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    add-int/lit8 v5, v0, 0x1

    iput v5, p0, Lorg/jdom2/ContentList;->size:I

    aget-object v0, v4, v0

    iget-object v4, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    invoke-virtual {v0, v4}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    goto :goto_1

    .line 398
    :cond_2
    invoke-direct {p0, v2, v3}, Lorg/jdom2/ContentList;->setModCount(II)V

    throw p1

    .line 363
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lorg/jdom2/ContentList;->clear()V

    return-void
.end method

.method ensureCapacity(I)V
    .locals 2

    .line 413
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 414
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array p1, p1, [Lorg/jdom2/Content;

    iput-object p1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    return-void

    .line 416
    :cond_0
    array-length v1, v0

    if-ge p1, v1, :cond_1

    return-void

    .line 424
    :cond_1
    iget v1, p0, Lorg/jdom2/ContentList;->size:I

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    if-ge v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move p1, v1

    .line 425
    :goto_0
    invoke-static {v0, p1}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lorg/jdom2/Content;

    iput-object p1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    return-void
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 79
    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList;->get(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Lorg/jdom2/Content;
    .locals 1

    const/4 v0, 0x1

    .line 438
    invoke-direct {p0, p1, v0}, Lorg/jdom2/ContentList;->checkIndex(IZ)V

    .line 439
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget-object p1, v0, p1

    return-object p1
.end method

.method getView(Lorg/jdom2/filter/Filter;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Lorg/jdom2/Content;",
            ">(",
            "Lorg/jdom2/filter/Filter<",
            "TE;>;)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .line 452
    new-instance v0, Lorg/jdom2/ContentList$FilterList;

    invoke-direct {v0, p0, p1}, Lorg/jdom2/ContentList$FilterList;-><init>(Lorg/jdom2/ContentList;Lorg/jdom2/filter/Filter;)V

    return-object v0
.end method

.method indexOfDocType()I
    .locals 2

    .line 480
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 481
    :goto_0
    iget v1, p0, Lorg/jdom2/ContentList;->size:I

    if-ge v0, v1, :cond_1

    .line 482
    iget-object v1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget-object v1, v1, v0

    instance-of v1, v1, Lorg/jdom2/DocType;

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method indexOfFirstElement()I
    .locals 2

    .line 463
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 464
    :goto_0
    iget v1, p0, Lorg/jdom2/ContentList;->size:I

    if-ge v0, v1, :cond_1

    .line 465
    iget-object v1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget-object v1, v1, v0

    instance-of v1, v1, Lorg/jdom2/Element;

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 560
    new-instance v0, Lorg/jdom2/ContentList$CLIterator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/jdom2/ContentList$CLIterator;-><init>(Lorg/jdom2/ContentList;Lorg/jdom2/ContentList$1;)V

    return-object v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 565
    new-instance v0, Lorg/jdom2/ContentList$CLListIterator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/jdom2/ContentList$CLListIterator;-><init>(Lorg/jdom2/ContentList;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation

    .line 570
    new-instance v0, Lorg/jdom2/ContentList$CLListIterator;

    invoke-direct {v0, p0, p1}, Lorg/jdom2/ContentList$CLListIterator;-><init>(Lorg/jdom2/ContentList;I)V

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    .line 79
    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public remove(I)Lorg/jdom2/Content;
    .locals 5

    const/4 v0, 0x1

    .line 499
    invoke-direct {p0, p1, v0}, Lorg/jdom2/ContentList;->checkIndex(IZ)V

    .line 501
    iget-object v1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget-object v1, v1, p1

    .line 502
    invoke-static {v1}, Lorg/jdom2/ContentList;->removeParent(Lorg/jdom2/Content;)V

    .line 503
    iget-object v2, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    add-int/lit8 v3, p1, 0x1

    iget v4, p0, Lorg/jdom2/ContentList;->size:I

    sub-int/2addr v4, p1

    sub-int/2addr v4, v0

    invoke-static {v2, v3, v2, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 504
    iget-object p1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    iget v2, p0, Lorg/jdom2/ContentList;->size:I

    sub-int/2addr v2, v0

    iput v2, p0, Lorg/jdom2/ContentList;->size:I

    const/4 v0, 0x0

    aput-object v0, p1, v2

    .line 505
    invoke-direct {p0}, Lorg/jdom2/ContentList;->incModCount()V

    return-object v1
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 79
    check-cast p2, Lorg/jdom2/Content;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/ContentList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public set(ILorg/jdom2/Content;)Lorg/jdom2/Content;
    .locals 2

    const/4 v0, 0x1

    .line 527
    invoke-direct {p0, p2, p1, v0}, Lorg/jdom2/ContentList;->checkPreConditions(Lorg/jdom2/Content;IZ)V

    .line 530
    iget-object v1, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    invoke-interface {v1, p2, p1, v0}, Lorg/jdom2/Parent;->canContainContent(Lorg/jdom2/Content;IZ)V

    .line 538
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aget-object v0, v0, p1

    .line 539
    invoke-static {v0}, Lorg/jdom2/ContentList;->removeParent(Lorg/jdom2/Content;)V

    .line 540
    iget-object v1, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    invoke-virtual {p2, v1}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    .line 541
    iget-object v1, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    aput-object p2, v1, p1

    .line 544
    invoke-direct {p0}, Lorg/jdom2/ContentList;->incDataModOnly()V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 555
    iget v0, p0, Lorg/jdom2/ContentList;->size:I

    return v0
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 647
    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList;->size:I

    .line 648
    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 650
    invoke-direct {p0, v1, v2, v2, p1}, Lorg/jdom2/ContentList;->binarySearch([IIILjava/util/Comparator;)I

    move-result v3

    if-ge v3, v2, :cond_1

    add-int/lit8 v4, v3, 0x1

    sub-int v5, v2, v3

    .line 652
    invoke-static {v1, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 654
    :cond_1
    aput v2, v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 656
    :cond_2
    invoke-direct {p0, v1}, Lorg/jdom2/ContentList;->sortInPlace([I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 580
    invoke-super {p0}, Ljava/util/AbstractList;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final uncheckedAddContent(Lorg/jdom2/Content;)V
    .locals 3

    .line 127
    iget-object v0, p0, Lorg/jdom2/ContentList;->parent:Lorg/jdom2/Parent;

    iput-object v0, p1, Lorg/jdom2/Content;->parent:Lorg/jdom2/Parent;

    .line 128
    iget v0, p0, Lorg/jdom2/ContentList;->size:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lorg/jdom2/ContentList;->ensureCapacity(I)V

    .line 129
    iget-object v0, p0, Lorg/jdom2/ContentList;->elementData:[Lorg/jdom2/Content;

    iget v1, p0, Lorg/jdom2/ContentList;->size:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/jdom2/ContentList;->size:I

    aput-object p1, v0, v1

    .line 130
    invoke-direct {p0}, Lorg/jdom2/ContentList;->incModCount()V

    return-void
.end method
