.class public Lcom/squareup/haha/guava/base/Joiner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/guava/base/Joiner$MapJoiner;
    }
.end annotation


# instance fields
.field private final separator:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/squareup/haha/guava/base/Joiner;)V
    .locals 1

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iget-object v0, p1, Lcom/squareup/haha/guava/base/Joiner;->separator:Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/haha/guava/base/Joiner;->separator:Ljava/lang/String;

    .line 89
    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/haha/guava/base/Joiner;B)V
    .locals 0

    .line 66
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/base/Joiner;-><init>(Lcom/squareup/haha/guava/base/Joiner;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/haha/guava/base/Joiner;->separator:Ljava/lang/String;

    .line 85
    return-void
.end method

.method static badPositionIndex(IILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 3362
    if-gez p0, :cond_0

    .line 3363
    const-string v0, "%s (%s) must not be negative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/base/Joiner;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3364
    :cond_0
    if-gez p1, :cond_1

    .line 3365
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "negative size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3367
    :cond_1
    const-string v0, "%s (%s) must not be greater than size (%s)"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/squareup/haha/guava/base/Joiner;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static checkArgument(Z)V
    .locals 1

    .line 3110
    if-nez p0, :cond_0

    .line 3111
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 3113
    :cond_0
    return-void
.end method

.method public static checkElementIndex(II)I
    .locals 11

    .line 3295
    const-string v7, "index"

    move v6, p1

    .line 3312
    move v5, p0

    if-ltz p0, :cond_0

    if-lt v5, v6, :cond_3

    .line 3313
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    move-object v10, v7

    move v9, v6

    .line 3319
    move v8, v5

    if-gez v5, :cond_1

    .line 3320
    const-string v1, "%s (%s) must not be negative"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v10, v2, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lcom/squareup/haha/guava/base/Joiner;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 3321
    :cond_1
    if-gez v9, :cond_2

    .line 3322
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "negative size: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 3324
    :cond_2
    const-string v1, "%s (%s) must be less than size (%s)"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v10, v2, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lcom/squareup/haha/guava/base/Joiner;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 3313
    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3295
    .line 3315
    :cond_3
    return v5
.end method

.method public static checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(TT;)TT;"
        }
    .end annotation

    .line 3212
    if-nez p0, :cond_0

    .line 3213
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 3215
    :cond_0
    return-object p0
.end method

.method public static checkPositionIndex(II)I
    .locals 5

    .line 3339
    const-string v4, "index"

    move v3, p1

    .line 3355
    move v2, p0

    if-ltz p0, :cond_0

    if-le v2, v3, :cond_1

    .line 3356
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-static {v2, v3, v4}, Lcom/squareup/haha/guava/base/Joiner;->badPositionIndex(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3339
    .line 3358
    :cond_1
    return v2
.end method

.method public static checkPositionIndexes(III)V
    .locals 8

    .line 3385
    if-ltz p0, :cond_0

    if-lt p1, p0, :cond_0

    if-le p1, p2, :cond_5

    .line 3386
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    move v7, p2

    move v6, p1

    .line 3391
    move v5, p0

    if-ltz p0, :cond_1

    if-le v5, v7, :cond_2

    .line 3392
    :cond_1
    const-string v1, "start index"

    invoke-static {v5, v7, v1}, Lcom/squareup/haha/guava/base/Joiner;->badPositionIndex(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 3394
    :cond_2
    if-ltz v6, :cond_3

    if-le v6, v7, :cond_4

    .line 3395
    :cond_3
    const-string v1, "end index"

    invoke-static {v6, v7, v1}, Lcom/squareup/haha/guava/base/Joiner;->badPositionIndex(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 3398
    :cond_4
    const-string v1, "end index (%s) must not be less than start index (%s)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lcom/squareup/haha/guava/base/Joiner;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 3386
    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3388
    :cond_5
    return-void
.end method

.method public static checkRemove(Z)V
    .locals 4

    .line 4049
    const-string v3, "no calls to next() since the last call to remove()"

    .line 4175
    move v2, p0

    if-nez p0, :cond_0

    .line 4176
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4050
    :cond_0
    return-void
.end method

.method public static equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation runtime Ljavax/annotation/CheckReturnValue;
    .end annotation

    .line 3057
    if-eq p0, p1, :cond_0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static equalsImpl(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<*>;Ljava/lang/Object;)Z"
        }
    .end annotation

    .line 5354
    if-ne p0, p1, :cond_0

    .line 5355
    const/4 v0, 0x1

    return v0

    .line 5357
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_2

    .line 5358
    move-object v2, p1

    check-cast v2, Ljava/util/Set;

    .line 5361
    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-interface {p0, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    .line 5362
    .line 5363
    :catch_0
    const/4 v0, 0x0

    return v0

    .line 5364
    .line 5365
    :catch_1
    const/4 v0, 0x0

    return v0

    .line 5368
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method static varargs format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 3413
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 3416
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    array-length v1, p1

    mul-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3417
    const/4 v4, 0x0

    .line 3418
    const/4 v5, 0x0

    .line 3419
    :goto_0
    array-length v0, p1

    if-ge v5, v0, :cond_0

    .line 3420
    const-string v0, "%s"

    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    .line 3421
    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3424
    invoke-virtual {p0, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3425
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-object v0, p1, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3426
    add-int/lit8 v4, v6, 0x2

    .line 3427
    goto :goto_0

    .line 3428
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3431
    array-length v0, p1

    if-ge v5, v0, :cond_2

    .line 3432
    const-string v0, " ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3433
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-object v0, p1, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3434
    :goto_1
    array-length v0, p1

    if-ge v5, v0, :cond_1

    .line 3435
    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3436
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-object v0, p1, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 3438
    :cond_1
    const/16 v0, 0x5d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3441
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static hash(Ljava/lang/Object;)I
    .locals 1

    .line 6105
    if-nez p0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static removeAllImpl(Ljava/util/Set;Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<*>;Ljava/util/Collection<*>;)Z"
        }
    .end annotation

    .line 5547
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5548
    instance-of v0, p1, Lcom/squareup/haha/guava/collect/Multiset;

    if-eqz v0, :cond_0

    .line 5549
    move-object v0, p1

    check-cast v0, Lcom/squareup/haha/guava/collect/Multiset;

    invoke-interface {v0}, Lcom/squareup/haha/guava/collect/Multiset;->elementSet()Ljava/util/Set;

    move-result-object p1

    .line 5558
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 5559
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/squareup/haha/guava/collect/Iterators;->removeAll(Ljava/util/Iterator;Ljava/util/Collection;)Z

    move-result v0

    return v0

    .line 5561
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/squareup/haha/guava/base/Joiner;->removeAllImpl(Ljava/util/Set;Ljava/util/Iterator;)Z

    move-result v0

    return v0
.end method

.method public static removeAllImpl(Ljava/util/Set;Ljava/util/Iterator;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<*>;Ljava/util/Iterator<*>;)Z"
        }
    .end annotation

    .line 5539
    const/4 v1, 0x0

    .line 5540
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5541
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v1, v0

    goto :goto_0

    .line 5543
    :cond_0
    return v1
.end method

.method public static reverse(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/util/List<TT;>;)Ljava/util/List<TT;>;"
        }
    .end annotation

    .line 4752
    instance-of v0, p0, Lcom/squareup/haha/guava/collect/ImmutableList;

    if-eqz v0, :cond_0

    .line 4753
    move-object v0, p0

    check-cast v0, Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->reverse()Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    return-object v0

    .line 4754
    :cond_0
    instance-of v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;

    if-eqz v0, :cond_1

    .line 4755
    move-object v1, p0

    check-cast v1, Lcom/squareup/haha/guava/collect/Lists$ReverseList;

    .line 4771
    iget-object v0, v1, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    .line 4755
    return-object v0

    .line 4756
    :cond_1
    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_2

    .line 4757
    new-instance v0, Lcom/squareup/haha/guava/collect/Lists$RandomAccessReverseList;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/Lists$RandomAccessReverseList;-><init>(Ljava/util/List;)V

    return-object v0

    .line 4759
    :cond_2
    new-instance v0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;

    invoke-direct {v0, p0}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final appendTo(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/StringBuilder;Ljava/util/Iterator<*>;)Ljava/lang/StringBuilder;"
        }
    .end annotation

    .line 152
    move-object v4, p2

    move-object v3, p1

    move-object v2, p0

    .line 2106
    :try_start_0
    invoke-static {v3}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2107
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2108
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/squareup/haha/guava/base/Joiner;->toString(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 2109
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2110
    iget-object v0, v2, Lcom/squareup/haha/guava/base/Joiner;->separator:Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 2111
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/squareup/haha/guava/base/Joiner;->toString(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 155
    :cond_0
    goto :goto_1

    .line 153
    :catch_0
    move-exception v1

    .line 154
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 156
    :goto_1
    return-object p1
.end method

.method toString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    .line 433
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public useForNull(Ljava/lang/String;)Lcom/squareup/haha/guava/base/Joiner;
    .locals 1
    .annotation runtime Ljavax/annotation/CheckReturnValue;
    .end annotation

    .line 218
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    new-instance v0, Lcom/squareup/haha/guava/base/Joiner$1;

    invoke-direct {v0, p0, p0, p1}, Lcom/squareup/haha/guava/base/Joiner$1;-><init>(Lcom/squareup/haha/guava/base/Joiner;Lcom/squareup/haha/guava/base/Joiner;Ljava/lang/String;)V

    return-object v0
.end method
