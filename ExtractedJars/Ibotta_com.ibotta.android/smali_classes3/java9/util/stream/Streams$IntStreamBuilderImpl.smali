.class final Ljava9/util/stream/Streams$IntStreamBuilderImpl;
.super Ljava9/util/stream/Streams$AbstractStreamBuilderImpl;
.source "Streams.java"

# interfaces
.implements Ljava9/util/Spliterator$OfInt;
.implements Ljava9/util/stream/IntStream$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/Streams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "IntStreamBuilderImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/stream/Streams$AbstractStreamBuilderImpl<",
        "Ljava/lang/Integer;",
        "Ljava9/util/Spliterator$OfInt;",
        ">;",
        "Ljava9/util/Spliterator$OfInt;",
        "Ljava9/util/stream/IntStream$Builder;"
    }
.end annotation


# instance fields
.field buffer:Ljava9/util/stream/SpinedBuffer$OfInt;

.field first:I


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 426
    invoke-direct {p0, v0}, Ljava9/util/stream/Streams$AbstractStreamBuilderImpl;-><init>(Ljava9/util/stream/Streams$1;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 433
    invoke-direct {p0, v0}, Ljava9/util/stream/Streams$AbstractStreamBuilderImpl;-><init>(Ljava9/util/stream/Streams$1;)V

    .line 434
    iput p1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->first:I

    const/4 p1, -0x2

    .line 435
    iput p1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    return-void
.end method


# virtual methods
.method public accept(I)V
    .locals 2

    .line 442
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    if-nez v0, :cond_0

    .line 443
    iput p1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->first:I

    .line 444
    iget p1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    goto :goto_0

    .line 446
    :cond_0
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    if-lez v0, :cond_2

    .line 447
    iget-object v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->buffer:Ljava9/util/stream/SpinedBuffer$OfInt;

    if-nez v0, :cond_1

    .line 448
    new-instance v0, Ljava9/util/stream/SpinedBuffer$OfInt;

    invoke-direct {v0}, Ljava9/util/stream/SpinedBuffer$OfInt;-><init>()V

    iput-object v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->buffer:Ljava9/util/stream/SpinedBuffer$OfInt;

    .line 449
    iget-object v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->buffer:Ljava9/util/stream/SpinedBuffer$OfInt;

    iget v1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->first:I

    invoke-virtual {v0, v1}, Ljava9/util/stream/SpinedBuffer$OfInt;->accept(I)V

    .line 450
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    .line 453
    :cond_1
    iget-object v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->buffer:Ljava9/util/stream/SpinedBuffer$OfInt;

    invoke-virtual {v0, p1}, Ljava9/util/stream/SpinedBuffer$OfInt;->accept(I)V

    :goto_0
    return-void

    .line 456
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public synthetic add(I)Ljava9/util/stream/IntStream$Builder;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/IntStream$Builder$-CC;->$default$add(Ljava9/util/stream/IntStream$Builder;I)Ljava9/util/stream/IntStream$Builder;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Ljava9/util/function/IntConsumer;)Ljava9/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/IntConsumer$-CC;->$default$andThen(Ljava9/util/function/IntConsumer;Ljava9/util/function/IntConsumer;)Ljava9/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public build()Ljava9/util/stream/IntStream;
    .locals 3

    .line 462
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    if-ltz v0, :cond_1

    .line 465
    iget v1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    neg-int v1, v1

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    .line 468
    invoke-static {p0, v2}, Ljava9/util/stream/StreamSupport;->intStream(Ljava9/util/Spliterator$OfInt;Z)Ljava9/util/stream/IntStream;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->buffer:Ljava9/util/stream/SpinedBuffer$OfInt;

    invoke-virtual {v0}, Ljava9/util/stream/SpinedBuffer$OfInt;->spliterator()Ljava9/util/Spliterator$OfInt;

    move-result-object v0

    invoke-static {v0, v2}, Ljava9/util/stream/StreamSupport;->intStream(Ljava9/util/Spliterator$OfInt;Z)Ljava9/util/stream/IntStream;

    move-result-object v0

    :goto_0
    return-object v0

    .line 471
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 412
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->forEachRemaining(Ljava9/util/function/IntConsumer;)V

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
    .locals 2

    .line 494
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 497
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->first:I

    invoke-interface {p1, v0}, Ljava9/util/function/IntConsumer;->accept(I)V

    const/4 p1, -0x1

    .line 498
    iput p1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    :cond_0
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

.method public bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 412
    check-cast p1, Ljava9/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->tryAdvance(Ljava9/util/function/IntConsumer;)Z

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
    .locals 2

    .line 480
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 483
    iget v0, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->first:I

    invoke-interface {p1, v0}, Ljava9/util/function/IntConsumer;->accept(I)V

    const/4 p1, -0x1

    .line 484
    iput p1, p0, Ljava9/util/stream/Streams$IntStreamBuilderImpl;->count:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic trySplit()Ljava9/util/Spliterator$OfInt;
    .locals 1

    .line 412
    invoke-super {p0}, Ljava9/util/stream/Streams$AbstractStreamBuilderImpl;->trySplit()Ljava9/util/Spliterator;

    move-result-object v0

    check-cast v0, Ljava9/util/Spliterator$OfInt;

    return-object v0
.end method

.method public bridge synthetic trySplit()Ljava9/util/Spliterator$OfPrimitive;
    .locals 1

    .line 412
    invoke-super {p0}, Ljava9/util/stream/Streams$AbstractStreamBuilderImpl;->trySplit()Ljava9/util/Spliterator;

    move-result-object v0

    check-cast v0, Ljava9/util/Spliterator$OfPrimitive;

    return-object v0
.end method
