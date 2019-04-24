.class final Lorg/jdom2/AttributeList;
.super Ljava/util/AbstractList;
.source "AttributeList.java"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/AttributeList$ALIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Lorg/jdom2/Attribute;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field private static final ATTRIBUTE_NATURAL:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation
.end field

.field private static final INITIAL_ARRAY_SIZE:I = 0x4


# instance fields
.field private attributeData:[Lorg/jdom2/Attribute;

.field private final parent:Lorg/jdom2/Element;

.field private size:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 90
    new-instance v0, Lorg/jdom2/AttributeList$1;

    invoke-direct {v0}, Lorg/jdom2/AttributeList$1;-><init>()V

    sput-object v0, Lorg/jdom2/AttributeList;->ATTRIBUTE_NATURAL:Ljava/util/Comparator;

    return-void
.end method

.method constructor <init>(Lorg/jdom2/Element;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 111
    iput-object p1, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    return-void
.end method

.method static synthetic access$100(Lorg/jdom2/AttributeList;)I
    .locals 0

    .line 75
    iget p0, p0, Lorg/jdom2/AttributeList;->modCount:I

    return p0
.end method

.method static synthetic access$200(Lorg/jdom2/AttributeList;)I
    .locals 0

    .line 75
    iget p0, p0, Lorg/jdom2/AttributeList;->size:I

    return p0
.end method

.method static synthetic access$300(Lorg/jdom2/AttributeList;)I
    .locals 0

    .line 75
    iget p0, p0, Lorg/jdom2/AttributeList;->modCount:I

    return p0
.end method

.method static synthetic access$400(Lorg/jdom2/AttributeList;)[Lorg/jdom2/Attribute;
    .locals 0

    .line 75
    iget-object p0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    return-object p0
.end method

.method static synthetic access$500(Lorg/jdom2/AttributeList;)I
    .locals 0

    .line 75
    iget p0, p0, Lorg/jdom2/AttributeList;->modCount:I

    return p0
.end method

.method static synthetic access$600(Lorg/jdom2/AttributeList;)I
    .locals 0

    .line 75
    iget p0, p0, Lorg/jdom2/AttributeList;->modCount:I

    return p0
.end method

.method private final binarySearch([IIILjava/util/Comparator;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([III",
            "Ljava/util/Comparator<",
            "-",
            "Lorg/jdom2/Attribute;",
            ">;)I"
        }
    .end annotation

    add-int/lit8 p2, p2, -0x1

    .line 577
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget-object p3, v0, p3

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p2, :cond_3

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    .line 580
    iget-object v2, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget v3, p1, v1

    aget-object v2, v2, v3

    invoke-interface {p4, p3, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_1

    :goto_1
    if-nez v2, :cond_0

    if-ge v1, p2, :cond_0

    .line 582
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

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

.method private ensureCapacity(I)V
    .locals 3

    .line 362
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    const/4 v1, 0x4

    if-nez v0, :cond_0

    .line 363
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array p1, p1, [Lorg/jdom2/Attribute;

    iput-object p1, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    return-void

    .line 366
    :cond_0
    array-length v2, v0

    if-ge p1, v2, :cond_1

    return-void

    :cond_1
    add-int/2addr p1, v1

    ushr-int/lit8 p1, p1, 0x1

    shl-int/lit8 p1, p1, 0x1

    .line 372
    invoke-static {v0, p1}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lorg/jdom2/Attribute;

    iput-object p1, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    return-void
.end method

.method private indexOfDuplicate(Lorg/jdom2/Attribute;)I
    .locals 1

    .line 527
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lorg/jdom2/AttributeList;->indexOf(Ljava/lang/String;Lorg/jdom2/Namespace;)I

    move-result p1

    return p1
.end method

.method private sortInPlace([I)V
    .locals 6

    .line 600
    array-length v0, p1

    invoke-static {p1, v0}, Lorg/jdom2/internal/ArrayCopy;->copyOf([II)[I

    move-result-object v0

    .line 601
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 602
    array-length v1, v0

    new-array v1, v1, [Lorg/jdom2/Attribute;

    const/4 v2, 0x0

    move v3, v2

    .line 603
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_0

    .line 604
    iget-object v4, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget v5, p1, v3

    aget-object v4, v4, v5

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 607
    :cond_0
    :goto_1
    array-length v3, p1

    if-ge v2, v3, :cond_1

    .line 608
    iget-object v3, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

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

    .line 75
    check-cast p2, Lorg/jdom2/Attribute;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/AttributeList;->add(ILorg/jdom2/Attribute;)V

    return-void
.end method

.method public add(ILorg/jdom2/Attribute;)V
    .locals 3

    if-ltz p1, :cond_4

    .line 180
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-gt p1, v0, :cond_4

    .line 185
    invoke-virtual {p2}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object v0

    if-nez v0, :cond_3

    .line 190
    invoke-direct {p0, p2}, Lorg/jdom2/AttributeList;->indexOfDuplicate(Lorg/jdom2/Attribute;)I

    move-result v0

    if-gez v0, :cond_2

    .line 195
    iget-object v0, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-static {p2, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Attribute;Lorg/jdom2/Element;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 200
    iget-object v0, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-virtual {p2, v0}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    .line 202
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lorg/jdom2/AttributeList;->ensureCapacity(I)V

    .line 203
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-ne p1, v0, :cond_0

    .line 204
    iget-object p1, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/jdom2/AttributeList;->size:I

    aput-object p2, p1, v0

    goto :goto_0

    .line 206
    :cond_0
    iget-object v1, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 208
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aput-object p2, v0, p1

    .line 209
    iget p1, p0, Lorg/jdom2/AttributeList;->size:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/jdom2/AttributeList;->size:I

    .line 211
    :goto_0
    iget p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    return-void

    .line 197
    :cond_1
    new-instance p1, Lorg/jdom2/IllegalAddException;

    iget-object v1, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-direct {p1, v1, p2, v0}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/Element;Lorg/jdom2/Attribute;Ljava/lang/String;)V

    throw p1

    .line 192
    :cond_2
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "Cannot add duplicate attribute"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 186
    :cond_3
    new-instance p1, Lorg/jdom2/IllegalAddException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The attribute already has an existing parent \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object p2

    invoke-virtual {p2}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\""

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 181
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 75
    check-cast p1, Lorg/jdom2/Attribute;

    invoke-virtual {p0, p1}, Lorg/jdom2/AttributeList;->add(Lorg/jdom2/Attribute;)Z

    move-result p1

    return p1
.end method

.method public add(Lorg/jdom2/Attribute;)Z
    .locals 4

    .line 141
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object v0

    if-nez v0, :cond_2

    .line 147
    iget-object v0, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-static {p1, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Attribute;Lorg/jdom2/Element;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 153
    invoke-direct {p0, p1}, Lorg/jdom2/AttributeList;->indexOfDuplicate(Lorg/jdom2/Attribute;)I

    move-result v0

    const/4 v1, 0x1

    if-gez v0, :cond_0

    .line 155
    iget-object v0, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-virtual {p1, v0}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    .line 156
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lorg/jdom2/AttributeList;->ensureCapacity(I)V

    .line 157
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    iget v2, p0, Lorg/jdom2/AttributeList;->size:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/jdom2/AttributeList;->size:I

    aput-object p1, v0, v2

    .line 158
    iget p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    add-int/2addr p1, v1

    iput p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    goto :goto_0

    .line 160
    :cond_0
    iget-object v2, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget-object v2, v2, v0

    const/4 v3, 0x0

    .line 161
    invoke-virtual {v2, v3}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    .line 162
    iget-object v2, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aput-object p1, v2, v0

    .line 163
    iget-object v0, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-virtual {p1, v0}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    :goto_0
    return v1

    .line 148
    :cond_1
    new-instance v0, Lorg/jdom2/IllegalAddException;

    iget-object v1, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-static {p1, v1}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Attribute;Lorg/jdom2/Element;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/Element;Lorg/jdom2/Attribute;Ljava/lang/String;)V

    throw v0

    .line 142
    :cond_2
    new-instance v0, Lorg/jdom2/IllegalAddException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The attribute already has an existing parent \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object p1

    invoke-virtual {p1}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Attribute;",
            ">;)Z"
        }
    .end annotation

    if-ltz p1, :cond_5

    .line 246
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-gt p1, v0, :cond_5

    if-eqz p2, :cond_4

    .line 255
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 261
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/jdom2/Attribute;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/AttributeList;->add(ILorg/jdom2/Attribute;)V

    return v2

    .line 265
    :cond_1
    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->size()I

    move-result v3

    add-int/2addr v3, v0

    invoke-direct {p0, v3}, Lorg/jdom2/AttributeList;->ensureCapacity(I)V

    .line 267
    iget v0, p0, Lorg/jdom2/AttributeList;->modCount:I

    .line 273
    :try_start_0
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Attribute;

    add-int v4, p1, v1

    .line 274
    invoke-virtual {p0, v4, v3}, Lorg/jdom2/AttributeList;->add(ILorg/jdom2/Attribute;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2

    :catchall_0
    move-exception p2

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_3

    add-int v2, p1, v1

    .line 281
    invoke-virtual {p0, v2}, Lorg/jdom2/AttributeList;->remove(I)Lorg/jdom2/Attribute;

    goto :goto_1

    .line 283
    :cond_3
    iput v0, p0, Lorg/jdom2/AttributeList;->modCount:I

    throw p2

    .line 252
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Can not add a null Collection to AttributeList"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 247
    :cond_5
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Attribute;",
            ">;)Z"
        }
    .end annotation

    .line 226
    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/jdom2/AttributeList;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 3

    .line 295
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    if-eqz v0, :cond_0

    .line 296
    :goto_0
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 297
    iput v0, p0, Lorg/jdom2/AttributeList;->size:I

    .line 298
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    iget v1, p0, Lorg/jdom2/AttributeList;->size:I

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    .line 299
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    iget v2, p0, Lorg/jdom2/AttributeList;->size:I

    aput-object v1, v0, v2

    goto :goto_0

    .line 302
    :cond_0
    iget v0, p0, Lorg/jdom2/AttributeList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/jdom2/AttributeList;->modCount:I

    return-void
.end method

.method clearAndSet(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lorg/jdom2/Attribute;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 314
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 320
    :cond_0
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    .line 321
    iget v1, p0, Lorg/jdom2/AttributeList;->size:I

    .line 322
    iget v2, p0, Lorg/jdom2/AttributeList;->modCount:I

    .line 328
    :goto_0
    iget v3, p0, Lorg/jdom2/AttributeList;->size:I

    const/4 v4, 0x0

    if-lez v3, :cond_1

    add-int/lit8 v3, v3, -0x1

    .line 329
    iput v3, p0, Lorg/jdom2/AttributeList;->size:I

    aget-object v3, v0, v3

    invoke-virtual {v3, v4}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 331
    iput v3, p0, Lorg/jdom2/AttributeList;->size:I

    .line 332
    iput-object v4, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    .line 336
    :try_start_0
    invoke-virtual {p0, v3, p1}, Lorg/jdom2/AttributeList;->addAll(ILjava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 343
    iput-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    .line 344
    :goto_1
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-ge v0, v1, :cond_2

    .line 345
    iget-object v3, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    add-int/lit8 v4, v0, 0x1

    iput v4, p0, Lorg/jdom2/AttributeList;->size:I

    aget-object v0, v3, v0

    iget-object v3, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-virtual {v0, v3}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    goto :goto_1

    .line 347
    :cond_2
    iput v2, p0, Lorg/jdom2/AttributeList;->modCount:I

    throw p1

    .line 315
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->clear()V

    return-void
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 75
    invoke-virtual {p0, p1}, Lorg/jdom2/AttributeList;->get(I)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Lorg/jdom2/Attribute;
    .locals 3

    if-ltz p1, :cond_0

    .line 385
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-ge p1, v0, :cond_0

    .line 390
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget-object p1, v0, p1

    return-object p1

    .line 386
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method get(Ljava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Attribute;
    .locals 0

    .line 404
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/AttributeList;->indexOf(Ljava/lang/String;Lorg/jdom2/Namespace;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 408
    :cond_0
    iget-object p2, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget-object p1, p2, p1

    return-object p1
.end method

.method indexOf(Ljava/lang/String;Lorg/jdom2/Namespace;)I
    .locals 3

    .line 423
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    if-eqz v0, :cond_2

    if-nez p2, :cond_0

    .line 425
    sget-object p2, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/AttributeList;->indexOf(Ljava/lang/String;Lorg/jdom2/Namespace;)I

    move-result p1

    return p1

    .line 427
    :cond_0
    invoke-virtual {p2}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 428
    :goto_0
    iget v1, p0, Lorg/jdom2/AttributeList;->size:I

    if-ge v0, v1, :cond_2

    .line 429
    iget-object v1, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget-object v1, v1, v0

    .line 430
    invoke-virtual {v1}, Lorg/jdom2/Attribute;->getNamespaceURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 553
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Attribute;",
            ">;"
        }
    .end annotation

    .line 538
    new-instance v0, Lorg/jdom2/AttributeList$ALIterator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/jdom2/AttributeList$ALIterator;-><init>(Lorg/jdom2/AttributeList;Lorg/jdom2/AttributeList$1;)V

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    .line 75
    invoke-virtual {p0, p1}, Lorg/jdom2/AttributeList;->remove(I)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method public remove(I)Lorg/jdom2/Attribute;
    .locals 5

    if-ltz p1, :cond_0

    .line 448
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-ge p1, v0, :cond_0

    .line 452
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget-object v0, v0, p1

    const/4 v1, 0x0

    .line 453
    invoke-virtual {v0, v1}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    .line 454
    iget-object v2, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    add-int/lit8 v3, p1, 0x1

    iget v4, p0, Lorg/jdom2/AttributeList;->size:I

    sub-int/2addr v4, p1

    add-int/lit8 v4, v4, -0x1

    invoke-static {v2, v3, v2, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 456
    iget-object p1, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    iget v2, p0, Lorg/jdom2/AttributeList;->size:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lorg/jdom2/AttributeList;->size:I

    aput-object v1, p1, v2

    .line 457
    iget p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    return-object v0

    .line 449
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method remove(Ljava/lang/String;Lorg/jdom2/Namespace;)Z
    .locals 0

    .line 473
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/AttributeList;->indexOf(Ljava/lang/String;Lorg/jdom2/Namespace;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 477
    :cond_0
    invoke-virtual {p0, p1}, Lorg/jdom2/AttributeList;->remove(I)Lorg/jdom2/Attribute;

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 75
    check-cast p2, Lorg/jdom2/Attribute;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/AttributeList;->set(ILorg/jdom2/Attribute;)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method public set(ILorg/jdom2/Attribute;)Lorg/jdom2/Attribute;
    .locals 2

    if-ltz p1, :cond_4

    .line 494
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    if-ge p1, v0, :cond_4

    .line 498
    invoke-virtual {p2}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object v0

    if-nez v0, :cond_3

    .line 504
    invoke-direct {p0, p2}, Lorg/jdom2/AttributeList;->indexOfDuplicate(Lorg/jdom2/Attribute;)I

    move-result v0

    if-ltz v0, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 506
    :cond_0
    new-instance p1, Lorg/jdom2/IllegalAddException;

    const-string p2, "Cannot set duplicate attribute"

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 509
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-static {p2, v0, p1}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Attribute;Lorg/jdom2/Element;I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 514
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aget-object v0, v0, p1

    const/4 v1, 0x0

    .line 515
    invoke-virtual {v0, v1}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    .line 517
    iget-object v1, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    aput-object p2, v1, p1

    .line 518
    iget-object p1, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-virtual {p2, p1}, Lorg/jdom2/Attribute;->setParent(Lorg/jdom2/Element;)Lorg/jdom2/Attribute;

    return-object v0

    .line 511
    :cond_2
    new-instance p1, Lorg/jdom2/IllegalAddException;

    iget-object v1, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    invoke-direct {p1, v1, p2, v0}, Lorg/jdom2/IllegalAddException;-><init>(Lorg/jdom2/Element;Lorg/jdom2/Attribute;Ljava/lang/String;)V

    throw p1

    .line 499
    :cond_3
    new-instance p1, Lorg/jdom2/IllegalAddException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The attribute already has an existing parent \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/jdom2/Attribute;->getParent()Lorg/jdom2/Element;

    move-result-object p2

    invoke-virtual {p2}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\""

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/jdom2/IllegalAddException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 495
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " Size: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/AttributeList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public size()I
    .locals 1

    .line 548
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    return v0
.end method

.method public sort(Ljava/util/Comparator;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Lorg/jdom2/Attribute;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 624
    sget-object p1, Lorg/jdom2/AttributeList;->ATTRIBUTE_NATURAL:Ljava/util/Comparator;

    .line 626
    :cond_0
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    .line 627
    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 629
    invoke-direct {p0, v1, v2, v2, p1}, Lorg/jdom2/AttributeList;->binarySearch([IIILjava/util/Comparator;)I

    move-result v3

    if-ge v3, v2, :cond_1

    add-int/lit8 v4, v3, 0x1

    sub-int v5, v2, v3

    .line 631
    invoke-static {v1, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 633
    :cond_1
    aput v2, v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 635
    :cond_2
    invoke-direct {p0, v1}, Lorg/jdom2/AttributeList;->sortInPlace([I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 561
    invoke-super {p0}, Ljava/util/AbstractList;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final uncheckedAddAttribute(Lorg/jdom2/Attribute;)V
    .locals 3

    .line 122
    iget-object v0, p0, Lorg/jdom2/AttributeList;->parent:Lorg/jdom2/Element;

    iput-object v0, p1, Lorg/jdom2/Attribute;->parent:Lorg/jdom2/Element;

    .line 123
    iget v0, p0, Lorg/jdom2/AttributeList;->size:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lorg/jdom2/AttributeList;->ensureCapacity(I)V

    .line 124
    iget-object v0, p0, Lorg/jdom2/AttributeList;->attributeData:[Lorg/jdom2/Attribute;

    iget v1, p0, Lorg/jdom2/AttributeList;->size:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/jdom2/AttributeList;->size:I

    aput-object p1, v0, v1

    .line 125
    iget p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/jdom2/AttributeList;->modCount:I

    return-void
.end method
