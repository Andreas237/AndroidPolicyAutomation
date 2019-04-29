.class public Ldagger/internal/ArrayQueue;
.super Ljava/util/AbstractCollection;
.source "ArrayQueue.java"

# interfaces
.implements Ljava/util/Queue;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldagger/internal/ArrayQueue$QueueIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractCollection<",
        "TE;>;",
        "Ljava/util/Queue<",
        "TE;>;",
        "Ljava/lang/Cloneable;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final MIN_INITIAL_CAPACITY:I = 0x8

.field private static final serialVersionUID:J = 0x207cda2e240da08bL


# instance fields
.field private transient elements:[Ljava/lang/Object;

.field private transient head:I

.field private transient tail:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 141
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/16 v0, 0x10

    .line 142
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 152
    invoke-direct {p0, p1}, Ldagger/internal/ArrayQueue;->allocateElements(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)V"
        }
    .end annotation

    .line 165
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 166
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Ldagger/internal/ArrayQueue;->allocateElements(I)V

    .line 167
    invoke-virtual {p0, p1}, Ldagger/internal/ArrayQueue;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method static synthetic access$100(Ldagger/internal/ArrayQueue;)I
    .locals 0

    .line 58
    iget p0, p0, Ldagger/internal/ArrayQueue;->head:I

    return p0
.end method

.method static synthetic access$200(Ldagger/internal/ArrayQueue;)I
    .locals 0

    .line 58
    iget p0, p0, Ldagger/internal/ArrayQueue;->tail:I

    return p0
.end method

.method static synthetic access$300(Ldagger/internal/ArrayQueue;)[Ljava/lang/Object;
    .locals 0

    .line 58
    iget-object p0, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$400(Ldagger/internal/ArrayQueue;I)Z
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Ldagger/internal/ArrayQueue;->delete(I)Z

    move-result p0

    return p0
.end method

.method private allocateElements(I)V
    .locals 1

    const/16 v0, 0x8

    if-lt p1, v0, :cond_0

    ushr-int/lit8 v0, p1, 0x1

    or-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x2

    or-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x4

    or-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x8

    or-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0x10

    or-int/2addr p1, v0

    add-int/lit8 v0, p1, 0x1

    if-gez v0, :cond_0

    ushr-int/lit8 v0, v0, 0x1

    .line 114
    :cond_0
    new-array p1, v0, [Ljava/lang/Object;

    iput-object p1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    return-void
.end method

.method private delete(I)Z
    .locals 8

    .line 280
    iget-object v0, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    const/4 v1, 0x1

    .line 281
    array-length v2, v0

    sub-int/2addr v2, v1

    .line 282
    iget v3, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 283
    iget v4, p0, Ldagger/internal/ArrayQueue;->tail:I

    sub-int v5, p1, v3

    and-int/2addr v5, v2

    sub-int v6, v4, p1

    and-int/2addr v6, v2

    sub-int v7, v4, v3

    and-int/2addr v7, v2

    if-lt v5, v7, :cond_0

    .line 289
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_0
    const/4 v7, 0x0

    if-ge v5, v6, :cond_2

    if-gt v3, p1, :cond_1

    add-int/lit8 p1, v3, 0x1

    .line 294
    invoke-static {v0, v3, v0, p1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 296
    :cond_1
    invoke-static {v0, v7, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 297
    aget-object p1, v0, v2

    aput-object p1, v0, v7

    add-int/lit8 p1, v3, 0x1

    sub-int v4, v2, v3

    .line 298
    invoke-static {v0, v3, v0, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    const/4 p1, 0x0

    .line 300
    aput-object p1, v0, v3

    add-int/2addr v3, v1

    and-int p1, v3, v2

    .line 301
    iput p1, p0, Ldagger/internal/ArrayQueue;->head:I

    return v7

    :cond_2
    if-ge p1, v4, :cond_3

    add-int/lit8 v2, p1, 0x1

    .line 305
    invoke-static {v0, v2, v0, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v4, v1

    .line 306
    iput v4, p0, Ldagger/internal/ArrayQueue;->tail:I

    goto :goto_1

    :cond_3
    add-int/lit8 v3, p1, 0x1

    sub-int v5, v2, p1

    .line 308
    invoke-static {v0, v3, v0, p1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 309
    aget-object p1, v0, v7

    aput-object p1, v0, v2

    .line 310
    invoke-static {v0, v1, v0, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v4, v1

    and-int p1, v4, v2

    .line 311
    iput p1, p0, Ldagger/internal/ArrayQueue;->tail:I

    :goto_1
    return v1
.end method

.method private doubleCapacity()V
    .locals 6

    .line 123
    iget v0, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 124
    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v1, v1

    sub-int v2, v1, v0

    shl-int/lit8 v3, v1, 0x1

    if-gez v3, :cond_0

    .line 128
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Sorry, queue too big"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_0
    new-array v3, v3, [Ljava/lang/Object;

    .line 130
    iget-object v4, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v4, v0, v3, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 131
    iget-object v4, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    invoke-static {v4, v5, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    iput-object v3, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    .line 133
    iput v5, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 134
    iput v1, p0, Ldagger/internal/ArrayQueue;->tail:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 595
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 598
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 599
    invoke-direct {p0, v0}, Ldagger/internal/ArrayQueue;->allocateElements(I)V

    const/4 v1, 0x0

    .line 600
    iput v1, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 601
    iput v0, p0, Ldagger/internal/ArrayQueue;->tail:I

    :goto_0
    if-ge v1, v0, :cond_0

    .line 605
    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 579
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 582
    invoke-virtual {p0}, Ldagger/internal/ArrayQueue;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 585
    iget-object v0, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 586
    iget v1, p0, Ldagger/internal/ArrayQueue;->head:I

    :goto_0
    iget v2, p0, Ldagger/internal/ArrayQueue;->tail:I

    if-eq v1, v2, :cond_0

    .line 587
    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    and-int/2addr v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 182
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "e == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 183
    :cond_0
    iget-object v0, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v1, p0, Ldagger/internal/ArrayQueue;->tail:I

    aput-object p1, v0, v1

    .line 184
    iget p1, p0, Ldagger/internal/ArrayQueue;->tail:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v1, v1

    sub-int/2addr v1, v0

    and-int/2addr p1, v1

    iput p1, p0, Ldagger/internal/ArrayQueue;->tail:I

    iget v1, p0, Ldagger/internal/ArrayQueue;->head:I

    if-ne p1, v1, :cond_1

    .line 185
    invoke-direct {p0}, Ldagger/internal/ArrayQueue;->doubleCapacity()V

    :cond_1
    return v0
.end method

.method public clear()V
    .locals 5

    .line 459
    iget v0, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 460
    iget v1, p0, Ldagger/internal/ArrayQueue;->tail:I

    if-eq v0, v1, :cond_1

    const/4 v2, 0x0

    .line 462
    iput v2, p0, Ldagger/internal/ArrayQueue;->tail:I

    iput v2, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 464
    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    .line 466
    :cond_0
    iget-object v3, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v4, v3, v0

    add-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v2

    if-ne v0, v1, :cond_0

    :cond_1
    return-void
.end method

.method public clone()Ldagger/internal/ArrayQueue;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldagger/internal/ArrayQueue<",
            "TE;>;"
        }
    .end annotation

    .line 554
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldagger/internal/ArrayQueue;

    .line 555
    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v2, v2

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    .line 557
    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget-object v3, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v3, v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 558
    iput-object v1, v0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 561
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Ldagger/internal/ArrayQueue;->clone()Ldagger/internal/ArrayQueue;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 414
    :cond_0
    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    const/4 v2, 0x1

    array-length v1, v1

    sub-int/2addr v1, v2

    .line 415
    iget v3, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 417
    :goto_0
    iget-object v4, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    aget-object v4, v4, v3

    if-eqz v4, :cond_2

    .line 418
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public element()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 248
    iget-object v0, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v1, p0, Ldagger/internal/ArrayQueue;->head:I

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    .line 250
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 2

    .line 336
    iget v0, p0, Ldagger/internal/ArrayQueue;->head:I

    iget v1, p0, Ldagger/internal/ArrayQueue;->tail:I

    if-ne v0, v1, :cond_0

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
            "TE;>;"
        }
    .end annotation

    .line 349
    new-instance v0, Ldagger/internal/ArrayQueue$QueueIterator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldagger/internal/ArrayQueue$QueueIterator;-><init>(Ldagger/internal/ArrayQueue;Ldagger/internal/ArrayQueue$1;)V

    return-object v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 198
    invoke-virtual {p0, p1}, Ldagger/internal/ArrayQueue;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public peek()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 263
    iget-object v0, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v1, p0, Ldagger/internal/ArrayQueue;->head:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public poll()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 228
    iget v0, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 229
    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    aget-object v1, v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 233
    :cond_0
    iget-object v3, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    aput-object v2, v3, v0

    add-int/lit8 v0, v0, 0x1

    .line 234
    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v0, v2

    iput v0, p0, Ldagger/internal/ArrayQueue;->head:I

    return-object v1
.end method

.method public remove()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 212
    invoke-virtual {p0}, Ldagger/internal/ArrayQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 214
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_0
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 440
    :cond_0
    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    const/4 v2, 0x1

    array-length v1, v1

    sub-int/2addr v1, v2

    .line 441
    iget v3, p0, Ldagger/internal/ArrayQueue;->head:I

    .line 443
    :goto_0
    iget-object v4, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    aget-object v4, v4, v3

    if-eqz v4, :cond_2

    .line 444
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 445
    invoke-direct {p0, v3}, Ldagger/internal/ArrayQueue;->delete(I)Z

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public size()I
    .locals 2

    .line 326
    iget v0, p0, Ldagger/internal/ArrayQueue;->tail:I

    iget v1, p0, Ldagger/internal/ArrayQueue;->head:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 487
    invoke-virtual {p0}, Ldagger/internal/ArrayQueue;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ldagger/internal/ArrayQueue;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 528
    invoke-virtual {p0}, Ldagger/internal/ArrayQueue;->size()I

    move-result v0

    .line 529
    array-length v1, p1

    if-ge v1, v0, :cond_0

    .line 530
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 532
    :cond_0
    iget v1, p0, Ldagger/internal/ArrayQueue;->head:I

    iget v2, p0, Ldagger/internal/ArrayQueue;->tail:I

    const/4 v3, 0x0

    if-ge v1, v2, :cond_1

    .line 533
    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v2, p0, Ldagger/internal/ArrayQueue;->head:I

    invoke-virtual {p0}, Ldagger/internal/ArrayQueue;->size()I

    move-result v4

    invoke-static {v1, v2, p1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 534
    :cond_1
    iget v1, p0, Ldagger/internal/ArrayQueue;->head:I

    iget v2, p0, Ldagger/internal/ArrayQueue;->tail:I

    if-le v1, v2, :cond_2

    .line 535
    iget-object v1, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v1, v1

    iget v2, p0, Ldagger/internal/ArrayQueue;->head:I

    sub-int/2addr v1, v2

    .line 536
    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v4, p0, Ldagger/internal/ArrayQueue;->head:I

    invoke-static {v2, v4, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 537
    iget-object v2, p0, Ldagger/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v4, p0, Ldagger/internal/ArrayQueue;->tail:I

    invoke-static {v2, v3, p1, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 539
    :cond_2
    :goto_0
    array-length v1, p1

    if-le v1, v0, :cond_3

    const/4 v1, 0x0

    .line 540
    aput-object v1, p1, v0

    :cond_3
    return-object p1
.end method
