.class final Ljava9/util/stream/ForEachOps$ForEachOp$OfLong;
.super Ljava9/util/stream/ForEachOps$ForEachOp;
.source "ForEachOps.java"

# interfaces
.implements Ljava9/util/stream/Sink$OfLong;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/ForEachOps$ForEachOp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "OfLong"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/stream/ForEachOps$ForEachOp<",
        "Ljava/lang/Long;",
        ">;",
        "Ljava9/util/stream/Sink$OfLong;"
    }
.end annotation


# instance fields
.field final consumer:Ljava9/util/function/LongConsumer;


# direct methods
.method constructor <init>(Ljava9/util/function/LongConsumer;Z)V
    .locals 0

    .line 218
    invoke-direct {p0, p2}, Ljava9/util/stream/ForEachOps$ForEachOp;-><init>(Z)V

    .line 219
    iput-object p1, p0, Ljava9/util/stream/ForEachOps$ForEachOp$OfLong;->consumer:Ljava9/util/function/LongConsumer;

    return-void
.end method


# virtual methods
.method public synthetic accept(D)V
    .locals 0

    invoke-static {p0, p1, p2}, Ljava9/util/stream/Sink$-CC;->$default$accept(Ljava9/util/stream/Sink;D)V

    return-void
.end method

.method public synthetic accept(I)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Sink$-CC;->$default$accept(Ljava9/util/stream/Sink;I)V

    return-void
.end method

.method public accept(J)V
    .locals 1

    .line 229
    iget-object v0, p0, Ljava9/util/stream/ForEachOps$ForEachOp$OfLong;->consumer:Ljava9/util/function/LongConsumer;

    invoke-interface {v0, p1, p2}, Ljava9/util/function/LongConsumer;->accept(J)V

    return-void
.end method

.method public synthetic accept(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Sink$OfLong$-CC;->$default$accept(Ljava9/util/stream/Sink$OfLong;Ljava/lang/Long;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Sink$OfLong$-CC;->$default$accept(Ljava9/util/stream/Sink$OfLong;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongConsumer$-CC;->$default$andThen(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method

.method public synthetic begin(J)V
    .locals 0

    invoke-static {p0, p1, p2}, Ljava9/util/stream/Sink$-CC;->$default$begin(Ljava9/util/stream/Sink;J)V

    return-void
.end method

.method public synthetic cancellationRequested()Z
    .locals 1

    invoke-static {p0}, Ljava9/util/stream/Sink$-CC;->$default$cancellationRequested(Ljava9/util/stream/Sink;)Z

    move-result v0

    return v0
.end method

.method public synthetic end()V
    .locals 0

    invoke-static {p0}, Ljava9/util/stream/Sink$-CC;->$default$end(Ljava9/util/stream/Sink;)V

    return-void
.end method

.method public bridge synthetic evaluateParallel(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Object;
    .locals 0

    .line 213
    invoke-super {p0, p1, p2}, Ljava9/util/stream/ForEachOps$ForEachOp;->evaluateParallel(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic evaluateSequential(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Object;
    .locals 0

    .line 213
    invoke-super {p0, p1, p2}, Ljava9/util/stream/ForEachOps$ForEachOp;->evaluateSequential(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 213
    invoke-super {p0}, Ljava9/util/stream/ForEachOps$ForEachOp;->get()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public inputShape()Ljava9/util/stream/StreamShape;
    .locals 1

    .line 224
    sget-object v0, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    return-object v0
.end method
