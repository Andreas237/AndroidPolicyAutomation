.class final Ljava9/util/HMSpliterators$KeySpliterator;
.super Ljava9/util/HMSpliterators$HashMapSpliterator;
.source "HMSpliterators.java"

# interfaces
.implements Ljava9/util/Spliterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/HMSpliterators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "KeySpliterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/HMSpliterators$HashMapSpliterator<",
        "TK;TV;>;",
        "Ljava9/util/Spliterator<",
        "TK;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/util/HashMap;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "TK;TV;>;IIII)V"
        }
    .end annotation

    .line 69
    invoke-direct/range {p0 .. p5}, Ljava9/util/HMSpliterators$HashMapSpliterator;-><init>(Ljava/util/HashMap;IIII)V

    return-void
.end method


# virtual methods
.method public characteristics()I
    .locals 2

    .line 135
    iget v0, p0, Ljava9/util/HMSpliterators$KeySpliterator;->fence:I

    if-ltz v0, :cond_1

    iget v0, p0, Ljava9/util/HMSpliterators$KeySpliterator;->est:I

    iget-object v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->map:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v0, 0x40

    :goto_1
    or-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public forEachRemaining(Ljava9/util/function/Consumer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TK;>;)V"
        }
    .end annotation

    .line 82
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Ljava9/util/HMSpliterators$KeySpliterator;->map:Ljava/util/HashMap;

    .line 85
    invoke-static {v0}, Ljava9/util/HMSpliterators$KeySpliterator;->getTable(Ljava/util/HashMap;)[Ljava/lang/Object;

    move-result-object v1

    .line 86
    iget v2, p0, Ljava9/util/HMSpliterators$KeySpliterator;->fence:I

    if-gez v2, :cond_1

    .line 87
    invoke-static {v0}, Ljava9/util/HMSpliterators$KeySpliterator;->getModCount(Ljava/util/HashMap;)I

    move-result v2

    iput v2, p0, Ljava9/util/HMSpliterators$KeySpliterator;->expectedModCount:I

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 88
    :cond_0
    array-length v3, v1

    :goto_0
    iput v3, p0, Ljava9/util/HMSpliterators$KeySpliterator;->fence:I

    move v7, v3

    move v3, v2

    move v2, v7

    goto :goto_1

    .line 90
    :cond_1
    iget v3, p0, Ljava9/util/HMSpliterators$KeySpliterator;->expectedModCount:I

    :goto_1
    if-eqz v1, :cond_6

    .line 92
    array-length v4, v1

    if-lt v4, v2, :cond_6

    iget v4, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    if-ltz v4, :cond_6

    iput v2, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    if-lt v4, v2, :cond_2

    iget-object v5, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    if-eqz v5, :cond_6

    .line 94
    :cond_2
    iget-object v5, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    const/4 v6, 0x0

    .line 95
    iput-object v6, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    :cond_3
    if-nez v5, :cond_4

    add-int/lit8 v5, v4, 0x1

    .line 98
    aget-object v4, v1, v4

    move v7, v5

    move-object v5, v4

    move v4, v7

    goto :goto_2

    .line 100
    :cond_4
    invoke-static {v5}, Ljava9/util/HMSpliterators$HashMapSpliterator;->getNodeKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 101
    invoke-static {v5}, Ljava9/util/HMSpliterators$KeySpliterator;->getNextNode(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_2
    if-nez v5, :cond_3

    if-lt v4, v2, :cond_3

    .line 104
    invoke-static {v0}, Ljava9/util/HMSpliterators$KeySpliterator;->getModCount(Ljava/util/HashMap;)I

    move-result p1

    if-ne v3, p1, :cond_5

    goto :goto_3

    .line 105
    :cond_5
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_6
    :goto_3
    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TT;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava9/util/Spliterator$-CC;->$default$getComparator(Ljava9/util/Spliterator;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Ljava9/util/Spliterator$-CC;->$default$getExactSizeIfKnown(Ljava9/util/Spliterator;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/Spliterator$-CC;->$default$hasCharacteristics(Ljava9/util/Spliterator;I)Z

    move-result p1

    return p1
.end method

.method public tryAdvance(Ljava9/util/function/Consumer;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TK;>;)Z"
        }
    .end annotation

    .line 112
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    iget-object v0, p0, Ljava9/util/HMSpliterators$KeySpliterator;->map:Ljava/util/HashMap;

    invoke-static {v0}, Ljava9/util/HMSpliterators$KeySpliterator;->getTable(Ljava/util/HashMap;)[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 115
    array-length v1, v0

    invoke-virtual {p0}, Ljava9/util/HMSpliterators$KeySpliterator;->getFence()I

    move-result v2

    if-lt v1, v2, :cond_3

    iget v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    if-ltz v1, :cond_3

    .line 116
    :goto_0
    iget-object v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    if-nez v1, :cond_0

    iget v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    if-ge v1, v2, :cond_3

    .line 117
    :cond_0
    iget-object v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    if-nez v1, :cond_1

    .line 118
    iget v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    aget-object v1, v0, v1

    iput-object v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    goto :goto_0

    .line 120
    :cond_1
    iget-object v0, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    invoke-static {v0}, Ljava9/util/HMSpliterators$KeySpliterator;->getNodeKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 121
    iget-object v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    invoke-static {v1}, Ljava9/util/HMSpliterators$KeySpliterator;->getNextNode(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    .line 122
    invoke-interface {p1, v0}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 123
    iget p1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->expectedModCount:I

    iget-object v0, p0, Ljava9/util/HMSpliterators$KeySpliterator;->map:Ljava/util/HashMap;

    invoke-static {v0}, Ljava9/util/HMSpliterators$KeySpliterator;->getModCount(Ljava/util/HashMap;)I

    move-result v0

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 124
    :cond_2
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public trySplit()Ljava9/util/HMSpliterators$KeySpliterator;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/HMSpliterators$KeySpliterator<",
            "TK;TV;>;"
        }
    .end annotation

    .line 74
    invoke-virtual {p0}, Ljava9/util/HMSpliterators$KeySpliterator;->getFence()I

    move-result v0

    iget v3, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    add-int/2addr v0, v3

    ushr-int/lit8 v4, v0, 0x1

    if-ge v3, v4, :cond_1

    .line 75
    iget-object v0, p0, Ljava9/util/HMSpliterators$KeySpliterator;->current:Ljava/lang/Object;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava9/util/HMSpliterators$KeySpliterator;

    iget-object v2, p0, Ljava9/util/HMSpliterators$KeySpliterator;->map:Ljava/util/HashMap;

    iput v4, p0, Ljava9/util/HMSpliterators$KeySpliterator;->index:I

    iget v1, p0, Ljava9/util/HMSpliterators$KeySpliterator;->est:I

    ushr-int/lit8 v5, v1, 0x1

    iput v5, p0, Ljava9/util/HMSpliterators$KeySpliterator;->est:I

    iget v6, p0, Ljava9/util/HMSpliterators$KeySpliterator;->expectedModCount:I

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ljava9/util/HMSpliterators$KeySpliterator;-><init>(Ljava/util/HashMap;IIII)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public bridge synthetic trySplit()Ljava9/util/Spliterator;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ljava9/util/HMSpliterators$KeySpliterator;->trySplit()Ljava9/util/HMSpliterators$KeySpliterator;

    move-result-object v0

    return-object v0
.end method
