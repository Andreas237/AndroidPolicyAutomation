.class final Ljava9/util/Spliterators$IntArraySpliterator;
.super Ljava/lang/Object;
.source "Spliterators.java"

# interfaces
.implements Ljava9/util/Spliterator$OfInt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/Spliterators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "IntArraySpliterator"
.end annotation


# instance fields
.field private final array:[I

.field private final characteristics:I

.field private final fence:I

.field private index:I


# direct methods
.method public constructor <init>([IIII)V
    .locals 0

    .line 1329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1330
    iput-object p1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->array:[I

    .line 1331
    iput p2, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    .line 1332
    iput p3, p0, Ljava9/util/Spliterators$IntArraySpliterator;->fence:I

    or-int/lit8 p1, p4, 0x40

    or-int/lit16 p1, p1, 0x4000

    .line 1333
    iput p1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->characteristics:I

    return-void
.end method


# virtual methods
.method public characteristics()I
    .locals 1

    .line 1369
    iget v0, p0, Ljava9/util/Spliterators$IntArraySpliterator;->characteristics:I

    return v0
.end method

.method public estimateSize()J
    .locals 2

    .line 1365
    iget v0, p0, Ljava9/util/Spliterators$IntArraySpliterator;->fence:I

    iget v1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 1303
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ljava9/util/Spliterators$IntArraySpliterator;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava9/util/function/Consumer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/Spliterator$OfInt$-CC;->$default$forEachRemaining(Ljava9/util/Spliterator$OfInt;Ljava9/util/function/Consumer;)V

    return-void
.end method

.method public forEachRemaining(Ljava9/util/function/IntConsumer;)V
    .locals 4

    .line 1347
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1348
    iget-object v0, p0, Ljava9/util/Spliterators$IntArraySpliterator;->array:[I

    array-length v1, v0

    iget v2, p0, Ljava9/util/Spliterators$IntArraySpliterator;->fence:I

    if-lt v1, v2, :cond_1

    iget v1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    if-ltz v1, :cond_1

    iput v2, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    if-ge v1, v2, :cond_1

    .line 1350
    :cond_0
    aget v3, v0, v1

    invoke-interface {p1, v3}, Ljava9/util/function/IntConsumer;->accept(I)V

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v2, :cond_0

    :cond_1
    return-void
.end method

.method public getComparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 1374
    invoke-virtual {p0, v0}, Ljava9/util/Spliterators$IntArraySpliterator;->hasCharacteristics(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 1376
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
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

.method public bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 1303
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ljava9/util/Spliterators$IntArraySpliterator;->tryAdvance(Ljava9/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public synthetic tryAdvance(Ljava9/util/function/Consumer;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/Spliterator$OfInt$-CC;->$default$tryAdvance(Ljava9/util/Spliterator$OfInt;Ljava9/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public tryAdvance(Ljava9/util/function/IntConsumer;)Z
    .locals 3

    .line 1356
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1357
    iget v0, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    if-ltz v0, :cond_0

    iget v1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->fence:I

    if-ge v0, v1, :cond_0

    .line 1358
    iget-object v1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->array:[I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    aget v0, v1, v0

    invoke-interface {p1, v0}, Ljava9/util/function/IntConsumer;->accept(I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public trySplit()Ljava9/util/Spliterator$OfInt;
    .locals 5

    .line 1338
    iget v0, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    iget v1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->fence:I

    add-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1339
    :cond_0
    new-instance v2, Ljava9/util/Spliterators$IntArraySpliterator;

    iget-object v3, p0, Ljava9/util/Spliterators$IntArraySpliterator;->array:[I

    iput v1, p0, Ljava9/util/Spliterators$IntArraySpliterator;->index:I

    iget v4, p0, Ljava9/util/Spliterators$IntArraySpliterator;->characteristics:I

    invoke-direct {v2, v3, v0, v1, v4}, Ljava9/util/Spliterators$IntArraySpliterator;-><init>([IIII)V

    move-object v0, v2

    :goto_0
    return-object v0
.end method

.method public bridge synthetic trySplit()Ljava9/util/Spliterator$OfPrimitive;
    .locals 1

    .line 1303
    invoke-virtual {p0}, Ljava9/util/Spliterators$IntArraySpliterator;->trySplit()Ljava9/util/Spliterator$OfInt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic trySplit()Ljava9/util/Spliterator;
    .locals 1

    .line 1303
    invoke-virtual {p0}, Ljava9/util/Spliterators$IntArraySpliterator;->trySplit()Ljava9/util/Spliterator$OfInt;

    move-result-object v0

    return-object v0
.end method
