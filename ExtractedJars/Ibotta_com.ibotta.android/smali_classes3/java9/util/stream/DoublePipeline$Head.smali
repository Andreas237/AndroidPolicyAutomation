.class Ljava9/util/stream/DoublePipeline$Head;
.super Ljava9/util/stream/DoublePipeline;
.source "DoublePipeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/DoublePipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Head"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E_IN:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/stream/DoublePipeline<",
        "TE_IN;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava9/util/Spliterator;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Double;",
            ">;IZ)V"
        }
    .end annotation

    .line 580
    invoke-direct {p0, p1, p2, p3}, Ljava9/util/stream/DoublePipeline;-><init>(Ljava9/util/Spliterator;IZ)V

    return-void
.end method


# virtual methods
.method public forEach(Ljava9/util/function/DoubleConsumer;)V
    .locals 1

    .line 597
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline$Head;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    .line 598
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline$Head;->sourceStageSpliterator()Ljava9/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/DoublePipeline;->access$000(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava9/util/Spliterator$OfDouble;->forEachRemaining(Ljava9/util/function/DoubleConsumer;)V

    goto :goto_0

    .line 601
    :cond_0
    invoke-super {p0, p1}, Ljava9/util/stream/DoublePipeline;->forEach(Ljava9/util/function/DoubleConsumer;)V

    :goto_0
    return-void
.end method

.method public forEachOrdered(Ljava9/util/function/DoubleConsumer;)V
    .locals 1

    .line 607
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline$Head;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    .line 608
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline$Head;->sourceStageSpliterator()Ljava9/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/DoublePipeline;->access$000(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava9/util/Spliterator$OfDouble;->forEachRemaining(Ljava9/util/function/DoubleConsumer;)V

    goto :goto_0

    .line 611
    :cond_0
    invoke-super {p0, p1}, Ljava9/util/stream/DoublePipeline;->forEachOrdered(Ljava9/util/function/DoubleConsumer;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 555
    invoke-super {p0}, Ljava9/util/stream/DoublePipeline;->iterator()Ljava9/util/PrimitiveIterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator;
    .locals 0

    .line 555
    invoke-super {p0, p1}, Ljava9/util/stream/DoublePipeline;->lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator$OfDouble;

    move-result-object p1

    return-object p1
.end method

.method final opIsStateful()Z
    .locals 1

    .line 585
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method final opWrapSink(ILjava9/util/stream/Sink;)Ljava9/util/stream/Sink;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava9/util/stream/Sink<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava9/util/stream/Sink<",
            "TE_IN;>;"
        }
    .end annotation

    .line 590
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic parallel()Ljava9/util/stream/DoubleStream;
    .locals 1

    .line 555
    invoke-super {p0}, Ljava9/util/stream/DoublePipeline;->parallel()Ljava9/util/stream/BaseStream;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/DoubleStream;

    return-object v0
.end method

.method public bridge synthetic sequential()Ljava9/util/stream/DoubleStream;
    .locals 1

    .line 555
    invoke-super {p0}, Ljava9/util/stream/DoublePipeline;->sequential()Ljava9/util/stream/BaseStream;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/DoubleStream;

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava9/util/Spliterator;
    .locals 1

    .line 555
    invoke-super {p0}, Ljava9/util/stream/DoublePipeline;->spliterator()Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic unordered()Ljava9/util/stream/BaseStream;
    .locals 1

    .line 555
    invoke-super {p0}, Ljava9/util/stream/DoublePipeline;->unordered()Ljava9/util/stream/DoubleStream;

    move-result-object v0

    return-object v0
.end method
