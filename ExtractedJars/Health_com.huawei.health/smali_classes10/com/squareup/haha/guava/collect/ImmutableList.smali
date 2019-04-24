.class public abstract Lcom/squareup/haha/guava/collect/ImmutableList;
.super Lcom/squareup/haha/guava/collect/ImmutableCollection;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/guava/collect/ImmutableList$ReverseImmutableList;,
        Lcom/squareup/haha/guava/collect/ImmutableList$SubList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Object;>Lcom/squareup/haha/guava/collect/ImmutableCollection<TE;>;Ljava/util/List<TE;>;Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field static final EMPTY:Lcom/squareup/haha/guava/collect/ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/guava/collect/ImmutableList<Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 66
    new-instance v0, Lcom/squareup/haha/guava/collect/RegularImmutableList;

    sget-object v1, Lcom/squareup/haha/guava/collect/ObjectArrays;->EMPTY_ARRAY:[Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/squareup/haha/guava/collect/RegularImmutableList;-><init>([Ljava/lang/Object;)V

    sput-object v0, Lcom/squareup/haha/guava/collect/ImmutableList;->EMPTY:Lcom/squareup/haha/guava/collect/ImmutableList;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 335
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/ImmutableCollection;-><init>()V

    return-void
.end method

.method static asImmutableList([Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:Ljava/lang/Object;>([Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 312
    array-length v2, p0

    move-object v1, p0

    .line 2320
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    .line 3077
    :sswitch_0
    sget-object v0, Lcom/squareup/haha/guava/collect/ImmutableList;->EMPTY:Lcom/squareup/haha/guava/collect/ImmutableList;

    .line 2322
    return-object v0

    .line 2325
    :sswitch_1
    new-instance v3, Lcom/squareup/haha/guava/collect/SingletonImmutableList;

    const/4 v0, 0x0

    aget-object v0, v1, v0

    invoke-direct {v3, v0}, Lcom/squareup/haha/guava/collect/SingletonImmutableList;-><init>(Ljava/lang/Object;)V

    .line 2326
    return-object v3

    .line 2328
    :goto_0
    array-length v0, v1

    if-ge v2, v0, :cond_0

    .line 2329
    invoke-static {v1, v2}, Lcom/squareup/haha/guava/collect/ObjectArrays;->arraysCopyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    .line 2331
    :cond_0
    new-instance v0, Lcom/squareup/haha/guava/collect/RegularImmutableList;

    invoke-direct {v0, v1}, Lcom/squareup/haha/guava/collect/RegularImmutableList;-><init>([Ljava/lang/Object;)V

    .line 312
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public static copyOf(Ljava/util/Collection;)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:Ljava/lang/Object;>(Ljava/util/Collection<+TE;>;)Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 251
    instance-of v0, p0, Lcom/squareup/haha/guava/collect/ImmutableCollection;

    if-eqz v0, :cond_1

    .line 253
    move-object v0, p0

    check-cast v0, Lcom/squareup/haha/guava/collect/ImmutableCollection;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableCollection;->asList()Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v1

    .line 254
    invoke-virtual {v1}, Lcom/squareup/haha/guava/collect/ImmutableList;->isPartialView()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/squareup/haha/guava/collect/ImmutableList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1

    .line 258
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v2

    .line 2303
    invoke-static {v2}, Lcom/squareup/haha/guava/collect/ObjectArrays;->checkElementsNotNull([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    .line 258
    return-object v0
.end method

.method public static of()Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:Ljava/lang/Object;>()Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 77
    sget-object v0, Lcom/squareup/haha/guava/collect/ImmutableList;->EMPTY:Lcom/squareup/haha/guava/collect/ImmutableList;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:Ljava/lang/Object;>(TE;)Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 89
    new-instance v0, Lcom/squareup/haha/guava/collect/SingletonImmutableList;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/SingletonImmutableList;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:Ljava/lang/Object;>(TE;TE;)Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 98
    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p0, v1, v0

    const/4 v0, 0x1

    aput-object p1, v1, v0

    .line 1303
    invoke-static {v1}, Lcom/squareup/haha/guava/collect/ObjectArrays;->checkElementsNotNull([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    .line 98
    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 467
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Collection<+TE;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 443
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final asList()Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 488
    return-object p0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 368
    invoke-virtual {p0, p1}, Lcom/squareup/haha/guava/collect/ImmutableList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method copyIntoArray([Ljava/lang/Object;I)I
    .locals 4

    .line 494
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;->size()I

    move-result v2

    .line 495
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 496
    add-int v0, p2, v3

    invoke-virtual {p0, v3}, Lcom/squareup/haha/guava/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v1

    aput-object v1, p1, v0

    .line 495
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 498
    :cond_0
    add-int v0, p2, v2

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 567
    move-object v3, p1

    move-object v2, p0

    .line 4909
    invoke-static {v2}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_0

    .line 4910
    const/4 v0, 0x1

    return v0

    .line 4912
    :cond_0
    instance-of v0, v3, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4916
    move-object v4, v3

    check-cast v4, Ljava/util/List;

    .line 4918
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/collect/Iterators;->elementsEqual(Ljava/util/Iterator;Ljava/util/Iterator;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    .line 567
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 571
    const/4 v2, 0x1

    .line 572
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;->size()I

    move-result v3

    .line 573
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 574
    mul-int/lit8 v0, v2, 0x1f

    invoke-virtual {p0, v4}, Lcom/squareup/haha/guava/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 576
    move v2, v0

    xor-int/lit8 v0, v0, -0x1

    xor-int/lit8 v2, v0, -0x1

    .line 573
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 579
    :cond_0
    return v2
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 358
    if-eqz p1, :cond_1

    move-object v2, p1

    .line 3940
    move-object v1, p0

    invoke-interface {p0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v3

    .line 3941
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3942
    invoke-interface {v3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/squareup/haha/guava/base/Joiner;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3943
    invoke-interface {v3}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0

    .line 358
    .line 3946
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public iterator()Lcom/squareup/haha/guava/collect/UnmodifiableIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/guava/collect/UnmodifiableIterator<TE;>;"
        }
    .end annotation

    .line 340
    .line 3344
    move-object v1, p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;

    move-result-object v0

    .line 340
    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 61
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;->iterator()Lcom/squareup/haha/guava/collect/UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 363
    if-eqz p1, :cond_1

    move-object v2, p1

    .line 3953
    move-object v1, p0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    .line 3954
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3955
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/squareup/haha/guava/base/Joiner;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3956
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0

    .line 363
    .line 3959
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator<TE;>;"
        }
    .end annotation

    .line 348
    new-instance v0, Lcom/squareup/haha/guava/collect/ImmutableList$1;

    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;->size()I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lcom/squareup/haha/guava/collect/ImmutableList$1;-><init>(Lcom/squareup/haha/guava/collect/ImmutableList;II)V

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 61
    .line 5344
    move-object v1, p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;

    move-result-object v0

    .line 61
    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 61
    invoke-virtual {p0, p1}, Lcom/squareup/haha/guava/collect/ImmutableList;->listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 479
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public reverse()Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 510
    new-instance v0, Lcom/squareup/haha/guava/collect/ImmutableList$ReverseImmutableList;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/ImmutableList$ReverseImmutableList;-><init>(Lcom/squareup/haha/guava/collect/ImmutableList;)V

    return-object v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 455
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public subList(II)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 381
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/squareup/haha/guava/base/Joiner;->checkPositionIndexes(III)V

    .line 382
    sub-int v0, p2, p1

    .line 383
    move v1, v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 4077
    :sswitch_0
    sget-object v0, Lcom/squareup/haha/guava/collect/ImmutableList;->EMPTY:Lcom/squareup/haha/guava/collect/ImmutableList;

    .line 385
    return-object v0

    .line 387
    :sswitch_1
    invoke-virtual {p0, p1}, Lcom/squareup/haha/guava/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->of(Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    return-object v0

    .line 389
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/squareup/haha/guava/collect/ImmutableList;->subListUnchecked(II)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 1

    .line 61
    invoke-virtual {p0, p1, p2}, Lcom/squareup/haha/guava/collect/ImmutableList;->subList(II)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    return-object v0
.end method

.method subListUnchecked(II)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 399
    new-instance v0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;

    sub-int v1, p2, p1

    invoke-direct {v0, p0, p1, v1}, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;-><init>(Lcom/squareup/haha/guava/collect/ImmutableList;II)V

    return-object v0
.end method
