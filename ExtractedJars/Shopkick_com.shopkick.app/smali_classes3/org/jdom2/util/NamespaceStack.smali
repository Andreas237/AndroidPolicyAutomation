.class public final Lorg/jdom2/util/NamespaceStack;
.super Ljava/lang/Object;
.source "NamespaceStack.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/util/NamespaceStack$EmptyIterable;,
        Lorg/jdom2/util/NamespaceStack$NamespaceIterable;,
        Lorg/jdom2/util/NamespaceStack$BackwardWalker;,
        Lorg/jdom2/util/NamespaceStack$ForwardWalker;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lorg/jdom2/Namespace;",
        ">;"
    }
.end annotation


# static fields
.field private static final DEFAULTSEED:[Lorg/jdom2/Namespace;

.field private static final EMPTY:[Lorg/jdom2/Namespace;

.field private static final EMPTYITER:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation
.end field

.field private static final NSCOMP:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private added:[[Lorg/jdom2/Namespace;

.field private depth:I

.field private scope:[[Lorg/jdom2/Namespace;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    .line 229
    new-array v1, v0, [Lorg/jdom2/Namespace;

    sput-object v1, Lorg/jdom2/util/NamespaceStack;->EMPTY:[Lorg/jdom2/Namespace;

    .line 231
    new-instance v1, Lorg/jdom2/util/NamespaceStack$EmptyIterable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lorg/jdom2/util/NamespaceStack$EmptyIterable;-><init>(Lorg/jdom2/util/NamespaceStack$1;)V

    sput-object v1, Lorg/jdom2/util/NamespaceStack;->EMPTYITER:Ljava/lang/Iterable;

    .line 234
    new-instance v1, Lorg/jdom2/util/NamespaceStack$1;

    invoke-direct {v1}, Lorg/jdom2/util/NamespaceStack$1;-><init>()V

    sput-object v1, Lorg/jdom2/util/NamespaceStack;->NSCOMP:Ljava/util/Comparator;

    const/4 v1, 0x2

    .line 240
    new-array v1, v1, [Lorg/jdom2/Namespace;

    sget-object v2, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    aput-object v2, v1, v0

    sget-object v0, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    sput-object v1, Lorg/jdom2/util/NamespaceStack;->DEFAULTSEED:[Lorg/jdom2/Namespace;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 328
    sget-object v0, Lorg/jdom2/util/NamespaceStack;->DEFAULTSEED:[Lorg/jdom2/Namespace;

    invoke-direct {p0, v0}, Lorg/jdom2/util/NamespaceStack;-><init>([Lorg/jdom2/Namespace;)V

    return-void
.end method

.method public constructor <init>([Lorg/jdom2/Namespace;)V
    .locals 2

    .line 337
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    .line 316
    new-array v1, v0, [[Lorg/jdom2/Namespace;

    iput-object v1, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    .line 318
    new-array v0, v0, [[Lorg/jdom2/Namespace;

    iput-object v0, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    const/4 v0, -0x1

    .line 320
    iput v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    .line 338
    iget v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    .line 339
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    iget v1, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aput-object p1, v0, v1

    .line 341
    iget-object p1, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    aget-object v0, v0, v1

    aput-object v0, p1, v1

    return-void
.end method

.method private static final binarySearch([Lorg/jdom2/Namespace;IILorg/jdom2/Namespace;)I
    .locals 3

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-gt p1, p2, :cond_3

    add-int v0, p1, p2

    ushr-int/lit8 v0, v0, 0x1

    .line 297
    aget-object v1, p0, v0

    if-ne v1, p3, :cond_0

    return v0

    .line 301
    :cond_0
    sget-object v1, Lorg/jdom2/util/NamespaceStack;->NSCOMP:Ljava/util/Comparator;

    aget-object v2, p0, v0

    invoke-interface {v1, v2, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    move p1, v0

    goto :goto_0

    :cond_1
    if-lez v1, :cond_2

    add-int/lit8 v0, v0, -0x1

    move p2, v0

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    neg-int p0, p1

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method private static final checkNamespace(Ljava/util/List;Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;)[Lorg/jdom2/Namespace;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;",
            "Lorg/jdom2/Namespace;",
            "[",
            "Lorg/jdom2/Namespace;",
            ")[",
            "Lorg/jdom2/Namespace;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 362
    aget-object v1, p2, v0

    if-ne p1, v1, :cond_0

    return-object p2

    .line 366
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    aget-object v2, p2, v0

    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 369
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    array-length p0, p2

    invoke-static {p2, p0}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lorg/jdom2/Namespace;

    .line 371
    aput-object p1, p0, v0

    return-object p0

    .line 375
    :cond_1
    array-length v0, p2

    const/4 v1, 0x1

    invoke-static {p2, v1, v0, p1}, Lorg/jdom2/util/NamespaceStack;->binarySearch([Lorg/jdom2/Namespace;IILorg/jdom2/Namespace;)I

    move-result v0

    if-ltz v0, :cond_2

    .line 376
    aget-object v2, p2, v0

    if-ne p1, v2, :cond_2

    return-object p2

    .line 380
    :cond_2
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ltz v0, :cond_3

    .line 384
    array-length p0, p2

    invoke-static {p2, p0}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lorg/jdom2/Namespace;

    .line 385
    aput-object p1, p0, v0

    return-object p0

    .line 389
    :cond_3
    array-length p0, p2

    add-int/2addr p0, v1

    invoke-static {p2, p0}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lorg/jdom2/Namespace;

    neg-int p2, v0

    sub-int/2addr p2, v1

    add-int/lit8 v0, p2, 0x1

    .line 391
    array-length v2, p0

    sub-int/2addr v2, p2

    sub-int/2addr v2, v1

    invoke-static {p0, p2, p0, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 392
    aput-object p1, p0, p2

    return-object p0
.end method

.method private final pushStack(Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/Namespace;",
            "[",
            "Lorg/jdom2/Namespace;",
            "Ljava/util/List<",
            "Lorg/jdom2/Namespace;",
            ">;)V"
        }
    .end annotation

    .line 481
    iget v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    .line 483
    iget v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    iget-object v2, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    array-length v3, v2

    if-lt v0, v3, :cond_0

    .line 485
    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Lorg/jdom2/Namespace;

    iput-object v0, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    .line 486
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    iget-object v2, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    array-length v2, v2

    invoke-static {v0, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Lorg/jdom2/Namespace;

    iput-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    .line 490
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 492
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    iget v3, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    sget-object v4, Lorg/jdom2/util/NamespaceStack;->EMPTY:[Lorg/jdom2/Namespace;

    aput-object v4, v0, v3

    goto :goto_0

    .line 494
    :cond_1
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    iget v3, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Lorg/jdom2/Namespace;

    invoke-interface {p3, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lorg/jdom2/Namespace;

    aput-object v4, v0, v3

    .line 495
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    iget v3, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v4, v0, v3

    aget-object v4, v4, v2

    if-ne v4, p1, :cond_2

    .line 496
    aget-object v4, v0, v3

    aget-object v0, v0, v3

    array-length v0, v0

    sget-object v3, Lorg/jdom2/util/NamespaceStack;->NSCOMP:Ljava/util/Comparator;

    invoke-static {v4, v1, v0, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    goto :goto_0

    .line 498
    :cond_2
    aget-object v0, v0, v3

    sget-object v3, Lorg/jdom2/util/NamespaceStack;->NSCOMP:Ljava/util/Comparator;

    invoke-static {v0, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 502
    :goto_0
    aget-object v0, p2, v2

    if-eq p1, v0, :cond_4

    .line 503
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    .line 506
    array-length p3, p2

    invoke-static {p2, p3}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lorg/jdom2/Namespace;

    .line 512
    :cond_3
    aget-object p3, p2, v2

    .line 513
    array-length v0, p2

    invoke-static {p2, v1, v0, p3}, Lorg/jdom2/util/NamespaceStack;->binarySearch([Lorg/jdom2/Namespace;IILorg/jdom2/Namespace;)I

    move-result v0

    neg-int v0, v0

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    .line 518
    invoke-static {p2, v1, p2, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 519
    aput-object p3, p2, v0

    .line 521
    array-length p3, p2

    invoke-static {p2, v2, p3, p1}, Lorg/jdom2/util/NamespaceStack;->binarySearch([Lorg/jdom2/Namespace;IILorg/jdom2/Namespace;)I

    move-result p3

    .line 523
    invoke-static {p2, v2, p2, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 524
    aput-object p1, p2, v2

    .line 527
    :cond_4
    iget-object p1, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    iget p3, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aput-object p2, p1, p3

    return-void
.end method


# virtual methods
.method public addedForward()Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 550
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    iget v1, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v2, v0, v1

    array-length v2, v2

    if-nez v2, :cond_0

    .line 551
    sget-object v0, Lorg/jdom2/util/NamespaceStack;->EMPTYITER:Ljava/lang/Iterable;

    return-object v0

    .line 553
    :cond_0
    new-instance v2, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;

    aget-object v0, v0, v1

    const/4 v1, 0x1

    invoke-direct {v2, v0, v1}, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;-><init>([Lorg/jdom2/Namespace;Z)V

    return-object v2
.end method

.method public addedReverse()Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 563
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    iget v1, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v2, v0, v1

    array-length v2, v2

    if-nez v2, :cond_0

    .line 564
    sget-object v0, Lorg/jdom2/util/NamespaceStack;->EMPTYITER:Ljava/lang/Iterable;

    return-object v0

    .line 566
    :cond_0
    new-instance v2, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;-><init>([Lorg/jdom2/Namespace;Z)V

    return-object v2
.end method

.method public getScope()[Lorg/jdom2/Namespace;
    .locals 3

    .line 585
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    iget v1, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v2, v0, v1

    aget-object v0, v0, v1

    array-length v0, v0

    invoke-static {v2, v0}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/Namespace;

    return-object v0
.end method

.method public isInScope(Lorg/jdom2/Namespace;)Z
    .locals 5

    .line 595
    iget-object v0, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    iget v1, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const/4 v4, 0x1

    if-ne p1, v2, :cond_0

    return v4

    .line 598
    :cond_0
    aget-object v2, v0, v1

    aget-object v0, v0, v1

    array-length v0, v0

    invoke-static {v2, v4, v0, p1}, Lorg/jdom2/util/NamespaceStack;->binarySearch([Lorg/jdom2/Namespace;IILorg/jdom2/Namespace;)I

    move-result v0

    if-ltz v0, :cond_2

    .line 601
    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    iget v2, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v1, v1, v2

    aget-object v0, v1, v0

    if-ne p1, v0, :cond_1

    move v3, v4

    :cond_1
    return v3

    :cond_2
    return v3
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 576
    new-instance v0, Lorg/jdom2/util/NamespaceStack$ForwardWalker;

    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    iget v2, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Lorg/jdom2/util/NamespaceStack$ForwardWalker;-><init>([Lorg/jdom2/Namespace;)V

    return-object v0
.end method

.method public pop()V
    .locals 3

    .line 535
    iget v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    if-lez v0, :cond_0

    .line 538
    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    .line 539
    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack;->added:[[Lorg/jdom2/Namespace;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, -0x1

    .line 540
    iput v0, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    return-void

    .line 536
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot over-pop the stack."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public push(Lorg/jdom2/Attribute;)V
    .locals 3

    .line 469
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 470
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p1

    .line 472
    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    iget v2, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v1, v1, v2

    invoke-static {v0, p1, v1}, Lorg/jdom2/util/NamespaceStack;->checkNamespace(Ljava/util/List;Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;)[Lorg/jdom2/Namespace;

    move-result-object v1

    .line 474
    invoke-direct {p0, p1, v1, v0}, Lorg/jdom2/util/NamespaceStack;->pushStack(Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;Ljava/util/List;)V

    return-void
.end method

.method public push(Lorg/jdom2/Element;)V
    .locals 5

    .line 430
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 431
    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v1

    .line 433
    iget-object v2, p0, Lorg/jdom2/util/NamespaceStack;->scope:[[Lorg/jdom2/Namespace;

    iget v3, p0, Lorg/jdom2/util/NamespaceStack;->depth:I

    aget-object v2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/jdom2/util/NamespaceStack;->checkNamespace(Ljava/util/List;Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;)[Lorg/jdom2/Namespace;

    move-result-object v2

    .line 434
    invoke-virtual {p1}, Lorg/jdom2/Element;->hasAdditionalNamespaces()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 435
    invoke-virtual {p1}, Lorg/jdom2/Element;->getAdditionalNamespaces()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jdom2/Namespace;

    if-ne v4, v1, :cond_0

    goto :goto_0

    .line 440
    :cond_0
    invoke-static {v0, v4, v2}, Lorg/jdom2/util/NamespaceStack;->checkNamespace(Ljava/util/List;Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;)[Lorg/jdom2/Namespace;

    move-result-object v2

    goto :goto_0

    .line 443
    :cond_1
    invoke-virtual {p1}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 444
    invoke-virtual {p1}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jdom2/Attribute;

    .line 445
    invoke-virtual {v3}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v3

    .line 446
    sget-object v4, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v3, v4, :cond_2

    goto :goto_1

    :cond_2
    if-ne v3, v1, :cond_3

    goto :goto_1

    .line 455
    :cond_3
    invoke-static {v0, v3, v2}, Lorg/jdom2/util/NamespaceStack;->checkNamespace(Ljava/util/List;Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;)[Lorg/jdom2/Namespace;

    move-result-object v2

    goto :goto_1

    .line 459
    :cond_4
    invoke-direct {p0, v1, v2, v0}, Lorg/jdom2/util/NamespaceStack;->pushStack(Lorg/jdom2/Namespace;[Lorg/jdom2/Namespace;Ljava/util/List;)V

    return-void
.end method
