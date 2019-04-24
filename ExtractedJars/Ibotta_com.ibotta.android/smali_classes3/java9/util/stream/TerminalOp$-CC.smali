.class public final synthetic Ljava9/util/stream/TerminalOp$-CC;
.super Ljava/lang/Object;
.source "TerminalOp.java"


# direct methods
.method public static $default$evaluateParallel(Ljava9/util/stream/TerminalOp;Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Object;
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/TerminalOp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/PipelineHelper<",
            "TE_IN;>;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)TR;"
        }
    .end annotation

    .line 82
    invoke-interface {p0, p1, p2}, Ljava9/util/stream/TerminalOp;->evaluateSequential(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static $default$getOpFlags(Ljava9/util/stream/TerminalOp;)I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static $default$inputShape(Ljava9/util/stream/TerminalOp;)Ljava9/util/stream/StreamShape;
    .locals 1
    .param p0, "-this"    # Ljava9/util/stream/TerminalOp;

    .line 53
    sget-object v0, Ljava9/util/stream/StreamShape;->REFERENCE:Ljava9/util/stream/StreamShape;

    return-object v0
.end method
