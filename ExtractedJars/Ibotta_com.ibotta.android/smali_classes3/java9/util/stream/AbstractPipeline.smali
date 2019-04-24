.class abstract Ljava9/util/stream/AbstractPipeline;
.super Ljava9/util/stream/PipelineHelper;
.source "AbstractPipeline.java"

# interfaces
.implements Ljava9/util/stream/BaseStream;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E_IN:",
        "Ljava/lang/Object;",
        "E_OUT:",
        "Ljava/lang/Object;",
        "S::",
        "Ljava9/util/stream/BaseStream<",
        "TE_OUT;TS;>;>",
        "Ljava9/util/stream/PipelineHelper<",
        "TE_OUT;>;",
        "Ljava9/util/stream/BaseStream<",
        "TE_OUT;TS;>;"
    }
.end annotation


# instance fields
.field private combinedFlags:I

.field private depth:I

.field private linkedOrConsumed:Z

.field private nextStage:Ljava9/util/stream/AbstractPipeline;

.field private parallel:Z

.field private final previousStage:Ljava9/util/stream/AbstractPipeline;

.field private sourceAnyStateful:Z

.field private sourceCloseAction:Ljava/lang/Runnable;

.field protected final sourceOrOpFlags:I

.field private sourceSpliterator:Ljava9/util/Spliterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/Spliterator<",
            "*>;"
        }
    .end annotation
.end field

.field private final sourceStage:Ljava9/util/stream/AbstractPipeline;

.field private sourceSupplier:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "+",
            "Ljava9/util/Spliterator<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava9/util/Spliterator;IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "*>;IZ)V"
        }
    .end annotation

    .line 182
    invoke-direct {p0}, Ljava9/util/stream/PipelineHelper;-><init>()V

    const/4 v0, 0x0

    .line 183
    iput-object v0, p0, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    .line 184
    iput-object p1, p0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    .line 185
    iput-object p0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    .line 186
    sget p1, Ljava9/util/stream/StreamOpFlag;->STREAM_MASK:I

    and-int/2addr p1, p2

    iput p1, p0, Ljava9/util/stream/AbstractPipeline;->sourceOrOpFlags:I

    .line 189
    iget p1, p0, Ljava9/util/stream/AbstractPipeline;->sourceOrOpFlags:I

    shl-int/lit8 p1, p1, 0x1

    not-int p1, p1

    sget p2, Ljava9/util/stream/StreamOpFlag;->INITIAL_OPS_VALUE:I

    and-int/2addr p1, p2

    iput p1, p0, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    const/4 p1, 0x0

    .line 190
    iput p1, p0, Ljava9/util/stream/AbstractPipeline;->depth:I

    .line 191
    iput-boolean p3, p0, Ljava9/util/stream/AbstractPipeline;->parallel:Z

    return-void
.end method

.method constructor <init>(Ljava9/util/stream/AbstractPipeline;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/AbstractPipeline<",
            "*TE_IN;*>;I)V"
        }
    .end annotation

    .line 202
    invoke-direct {p0}, Ljava9/util/stream/PipelineHelper;-><init>()V

    .line 203
    iget-boolean v0, p1, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 205
    iput-boolean v0, p1, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    .line 206
    iput-object p0, p1, Ljava9/util/stream/AbstractPipeline;->nextStage:Ljava9/util/stream/AbstractPipeline;

    .line 208
    iput-object p1, p0, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    .line 209
    sget v1, Ljava9/util/stream/StreamOpFlag;->OP_MASK:I

    and-int/2addr v1, p2

    iput v1, p0, Ljava9/util/stream/AbstractPipeline;->sourceOrOpFlags:I

    .line 210
    iget v1, p1, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    invoke-static {p2, v1}, Ljava9/util/stream/StreamOpFlag;->combineOpFlags(II)I

    move-result p2

    iput p2, p0, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    .line 211
    iget-object p2, p1, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iput-object p2, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    .line 212
    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->opIsStateful()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 213
    iget-object p2, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iput-boolean v0, p2, Ljava9/util/stream/AbstractPipeline;->sourceAnyStateful:Z

    .line 214
    :cond_0
    iget p1, p1, Ljava9/util/stream/AbstractPipeline;->depth:I

    add-int/2addr p1, v0

    iput p1, p0, Ljava9/util/stream/AbstractPipeline;->depth:I

    return-void

    .line 204
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "stream has already been operated upon or closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic lambda$opEvaluateParallelLazy$36(I)[Ljava/lang/Object;
    .locals 0

    .line 706
    new-array p0, p0, [Ljava/lang/Object;

    check-cast p0, [Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic lambda$spliterator$34(Ljava9/util/stream/AbstractPipeline;)Ljava9/util/Spliterator;
    .locals 1

    const/4 v0, 0x0

    .line 364
    invoke-direct {p0, v0}, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator(I)Ljava9/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$wrapSpliterator$35(Ljava9/util/Spliterator;)Ljava9/util/Spliterator;
    .locals 0

    return-object p0
.end method

.method private sourceSpliterator(I)Ljava9/util/Spliterator;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava9/util/Spliterator<",
            "*>;"
        }
    .end annotation

    .line 397
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iget-object v1, v0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 399
    iput-object v2, v0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    goto :goto_0

    .line 401
    :cond_0
    iget-object v0, v0, Ljava9/util/stream/AbstractPipeline;->sourceSupplier:Ljava9/util/function/Supplier;

    if-eqz v0, :cond_6

    .line 402
    invoke-interface {v0}, Ljava9/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava9/util/Spliterator;

    .line 403
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iput-object v2, v0, Ljava9/util/stream/AbstractPipeline;->sourceSupplier:Ljava9/util/function/Supplier;

    .line 409
    :goto_0
    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->isParallel()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iget-boolean v2, v0, Ljava9/util/stream/AbstractPipeline;->sourceAnyStateful:Z

    if-eqz v2, :cond_4

    .line 414
    iget-object v2, v0, Ljava9/util/stream/AbstractPipeline;->nextStage:Ljava9/util/stream/AbstractPipeline;

    const/4 v3, 0x1

    :goto_1
    if-eq v0, p0, :cond_4

    .line 418
    iget v4, v2, Ljava9/util/stream/AbstractPipeline;->sourceOrOpFlags:I

    .line 419
    invoke-virtual {v2}, Ljava9/util/stream/AbstractPipeline;->opIsStateful()Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v3, 0x0

    .line 422
    sget-object v5, Ljava9/util/stream/StreamOpFlag;->SHORT_CIRCUIT:Ljava9/util/stream/StreamOpFlag;

    invoke-virtual {v5, v4}, Ljava9/util/stream/StreamOpFlag;->isKnown(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 428
    sget v5, Ljava9/util/stream/StreamOpFlag;->IS_SHORT_CIRCUIT:I

    not-int v5, v5

    and-int/2addr v4, v5

    .line 431
    :cond_1
    invoke-virtual {v2, v0, v1}, Ljava9/util/stream/AbstractPipeline;->opEvaluateParallelLazy(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava9/util/Spliterator;

    move-result-object v1

    const/16 v5, 0x40

    .line 435
    invoke-interface {v1, v5}, Ljava9/util/Spliterator;->hasCharacteristics(I)Z

    move-result v5

    if-eqz v5, :cond_2

    sget v5, Ljava9/util/stream/StreamOpFlag;->NOT_SIZED:I

    not-int v5, v5

    and-int/2addr v4, v5

    sget v5, Ljava9/util/stream/StreamOpFlag;->IS_SIZED:I

    goto :goto_2

    :cond_2
    sget v5, Ljava9/util/stream/StreamOpFlag;->IS_SIZED:I

    not-int v5, v5

    and-int/2addr v4, v5

    sget v5, Ljava9/util/stream/StreamOpFlag;->NOT_SIZED:I

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    add-int/lit8 v5, v3, 0x1

    .line 439
    iput v3, v2, Ljava9/util/stream/AbstractPipeline;->depth:I

    .line 440
    iget v0, v0, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    invoke-static {v4, v0}, Ljava9/util/stream/StreamOpFlag;->combineOpFlags(II)I

    move-result v0

    iput v0, v2, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    .line 416
    iget-object v0, v2, Ljava9/util/stream/AbstractPipeline;->nextStage:Ljava9/util/stream/AbstractPipeline;

    move v3, v5

    move-object v6, v2

    move-object v2, v0

    move-object v0, v6

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_5

    .line 446
    iget v0, p0, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    invoke-static {p1, v0}, Ljava9/util/stream/StreamOpFlag;->combineOpFlags(II)I

    move-result p1

    iput p1, p0, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    :cond_5
    return-object v1

    .line 406
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "source already consumed or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 3

    const/4 v0, 0x1

    .line 316
    iput-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    const/4 v0, 0x0

    .line 317
    iput-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceSupplier:Ljava9/util/function/Supplier;

    .line 318
    iput-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    .line 319
    iget-object v1, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iget-object v2, v1, Ljava9/util/stream/AbstractPipeline;->sourceCloseAction:Ljava/lang/Runnable;

    if-eqz v2, :cond_0

    .line 321
    iput-object v0, v1, Ljava9/util/stream/AbstractPipeline;->sourceCloseAction:Ljava/lang/Runnable;

    .line 322
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method final copyInto(Ljava9/util/stream/Sink;Ljava9/util/Spliterator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/Sink<",
            "TP_IN;>;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)V"
        }
    .end annotation

    .line 478
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    sget-object v0, Ljava9/util/stream/StreamOpFlag;->SHORT_CIRCUIT:Ljava9/util/stream/StreamOpFlag;

    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->getStreamAndOpFlags()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava9/util/stream/StreamOpFlag;->isKnown(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 481
    invoke-interface {p2}, Ljava9/util/Spliterator;->getExactSizeIfKnown()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Ljava9/util/stream/Sink;->begin(J)V

    .line 482
    invoke-interface {p2, p1}, Ljava9/util/Spliterator;->forEachRemaining(Ljava9/util/function/Consumer;)V

    .line 483
    invoke-interface {p1}, Ljava9/util/stream/Sink;->end()V

    goto :goto_0

    .line 486
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava9/util/stream/AbstractPipeline;->copyIntoWithCancel(Ljava9/util/stream/Sink;Ljava9/util/Spliterator;)Z

    :goto_0
    return-void
.end method

.method final copyIntoWithCancel(Ljava9/util/stream/Sink;Ljava9/util/Spliterator;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/Sink<",
            "TP_IN;>;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)Z"
        }
    .end annotation

    move-object v0, p0

    .line 495
    :goto_0
    iget v1, v0, Ljava9/util/stream/AbstractPipeline;->depth:I

    if-lez v1, :cond_0

    .line 496
    iget-object v0, v0, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    goto :goto_0

    .line 498
    :cond_0
    invoke-interface {p2}, Ljava9/util/Spliterator;->getExactSizeIfKnown()J

    move-result-wide v1

    invoke-interface {p1, v1, v2}, Ljava9/util/stream/Sink;->begin(J)V

    .line 499
    invoke-virtual {v0, p2, p1}, Ljava9/util/stream/AbstractPipeline;->forEachWithCancel(Ljava9/util/Spliterator;Ljava9/util/stream/Sink;)Z

    move-result p2

    .line 500
    invoke-interface {p1}, Ljava9/util/stream/Sink;->end()V

    return p2
.end method

.method final evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/TerminalOp<",
            "TE_OUT;TR;>;)TR;"
        }
    .end annotation

    .line 228
    iget-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 230
    iput-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    .line 232
    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->isParallel()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    invoke-interface {p1}, Ljava9/util/stream/TerminalOp;->getOpFlags()I

    move-result v0

    invoke-direct {p0, v0}, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator(I)Ljava9/util/Spliterator;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Ljava9/util/stream/TerminalOp;->evaluateParallel(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 234
    :cond_0
    invoke-interface {p1}, Ljava9/util/stream/TerminalOp;->getOpFlags()I

    move-result v0

    invoke-direct {p0, v0}, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator(I)Ljava9/util/Spliterator;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Ljava9/util/stream/TerminalOp;->evaluateSequential(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1

    .line 229
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "stream has already been operated upon or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method final evaluate(Ljava9/util/Spliterator;ZLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;Z",
            "Ljava9/util/function/IntFunction<",
            "[TE_OUT;>;)",
            "Ljava9/util/stream/Node<",
            "TE_OUT;>;"
        }
    .end annotation

    .line 539
    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->isParallel()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 541
    invoke-virtual {p0, p0, p1, p2, p3}, Ljava9/util/stream/AbstractPipeline;->evaluateToNode(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;ZLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;

    move-result-object p1

    return-object p1

    .line 545
    :cond_0
    invoke-virtual {p0, p1}, Ljava9/util/stream/AbstractPipeline;->exactOutputSizeIfKnown(Ljava9/util/Spliterator;)J

    move-result-wide v0

    .line 544
    invoke-virtual {p0, v0, v1, p3}, Ljava9/util/stream/AbstractPipeline;->makeNodeBuilder(JLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$Builder;

    move-result-object p2

    .line 546
    invoke-virtual {p0, p2, p1}, Ljava9/util/stream/AbstractPipeline;->wrapAndCopyInto(Ljava9/util/stream/Sink;Ljava9/util/Spliterator;)Ljava9/util/stream/Sink;

    move-result-object p1

    check-cast p1, Ljava9/util/stream/Node$Builder;

    invoke-interface {p1}, Ljava9/util/stream/Node$Builder;->build()Ljava9/util/stream/Node;

    move-result-object p1

    return-object p1
.end method

.method final evaluateToArrayNode(Ljava9/util/function/IntFunction;)Ljava9/util/stream/Node;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/IntFunction<",
            "[TE_OUT;>;)",
            "Ljava9/util/stream/Node<",
            "TE_OUT;>;"
        }
    .end annotation

    .line 245
    iget-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 248
    iput-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    .line 252
    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->isParallel()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->opIsStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 257
    iput v2, p0, Ljava9/util/stream/AbstractPipeline;->depth:I

    .line 258
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    invoke-direct {v0, v2}, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator(I)Ljava9/util/Spliterator;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Ljava9/util/stream/AbstractPipeline;->opEvaluateParallel(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Ljava9/util/function/IntFunction;)Ljava9/util/stream/Node;

    move-result-object p1

    return-object p1

    .line 261
    :cond_0
    invoke-direct {p0, v2}, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator(I)Ljava9/util/Spliterator;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p1}, Ljava9/util/stream/AbstractPipeline;->evaluate(Ljava9/util/Spliterator;ZLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;

    move-result-object p1

    return-object p1

    .line 246
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "stream has already been operated upon or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method abstract evaluateToNode(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;ZLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/PipelineHelper<",
            "TE_OUT;>;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;Z",
            "Ljava9/util/function/IntFunction<",
            "[TE_OUT;>;)",
            "Ljava9/util/stream/Node<",
            "TE_OUT;>;"
        }
    .end annotation
.end method

.method final exactOutputSizeIfKnown(Ljava9/util/Spliterator;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)J"
        }
    .end annotation

    .line 467
    sget-object v0, Ljava9/util/stream/StreamOpFlag;->SIZED:Ljava9/util/stream/StreamOpFlag;

    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->getStreamAndOpFlags()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava9/util/stream/StreamOpFlag;->isKnown(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava9/util/Spliterator;->getExactSizeIfKnown()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method abstract forEachWithCancel(Ljava9/util/Spliterator;Ljava9/util/stream/Sink;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;",
            "Ljava9/util/stream/Sink<",
            "TE_OUT;>;)Z"
        }
    .end annotation
.end method

.method abstract getOutputShape()Ljava9/util/stream/StreamShape;
.end method

.method final getSourceShape()Ljava9/util/stream/StreamShape;
    .locals 2

    move-object v0, p0

    .line 459
    :goto_0
    iget v1, v0, Ljava9/util/stream/AbstractPipeline;->depth:I

    if-lez v1, :cond_0

    .line 460
    iget-object v0, v0, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    goto :goto_0

    .line 462
    :cond_0
    invoke-virtual {v0}, Ljava9/util/stream/AbstractPipeline;->getOutputShape()Ljava9/util/stream/StreamShape;

    move-result-object v0

    return-object v0
.end method

.method final getStreamAndOpFlags()I
    .locals 1

    .line 506
    iget v0, p0, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    return v0
.end method

.method final isOrdered()Z
    .locals 2

    .line 510
    sget-object v0, Ljava9/util/stream/StreamOpFlag;->ORDERED:Ljava9/util/stream/StreamOpFlag;

    iget v1, p0, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    invoke-virtual {v0, v1}, Ljava9/util/stream/StreamOpFlag;->isKnown(I)Z

    move-result v0

    return v0
.end method

.method public final isParallel()Z
    .locals 1

    .line 370
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iget-boolean v0, v0, Ljava9/util/stream/AbstractPipeline;->parallel:Z

    return v0
.end method

.method abstract lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Supplier<",
            "+",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;>;)",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;"
        }
    .end annotation
.end method

.method abstract makeNodeBuilder(JLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava9/util/function/IntFunction<",
            "[TE_OUT;>;)",
            "Ljava9/util/stream/Node$Builder<",
            "TE_OUT;>;"
        }
    .end annotation
.end method

.method public onClose(Ljava/lang/Runnable;)Ljava9/util/stream/BaseStream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")TS;"
        }
    .end annotation

    .line 329
    iget-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    if-nez v0, :cond_1

    .line 331
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iget-object v1, v0, Ljava9/util/stream/AbstractPipeline;->sourceCloseAction:Ljava/lang/Runnable;

    if-nez v1, :cond_0

    goto :goto_0

    .line 336
    :cond_0
    invoke-static {v1, p1}, Ljava9/util/stream/Streams;->composeWithExceptions(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    :goto_0
    iput-object p1, v0, Ljava9/util/stream/AbstractPipeline;->sourceCloseAction:Ljava/lang/Runnable;

    return-object p0

    .line 330
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "stream has already been operated upon or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method opEvaluateParallel(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Ljava9/util/function/IntFunction;)Ljava9/util/stream/Node;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/PipelineHelper<",
            "TE_OUT;>;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;",
            "Ljava9/util/function/IntFunction<",
            "[TE_OUT;>;)",
            "Ljava9/util/stream/Node<",
            "TE_OUT;>;"
        }
    .end annotation

    .line 680
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Parallel evaluation is not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method opEvaluateParallelLazy(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;)Ljava9/util/Spliterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/PipelineHelper<",
            "TE_OUT;>;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;"
        }
    .end annotation

    .line 706
    sget-object v0, Ljava9/util/stream/-$$Lambda$AbstractPipeline$KXIxmxs6JMh2eSVwk24_JjSzn28;->INSTANCE:Ljava9/util/stream/-$$Lambda$AbstractPipeline$KXIxmxs6JMh2eSVwk24_JjSzn28;

    invoke-virtual {p0, p1, p2, v0}, Ljava9/util/stream/AbstractPipeline;->opEvaluateParallel(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Ljava9/util/function/IntFunction;)Ljava9/util/stream/Node;

    move-result-object p1

    invoke-interface {p1}, Ljava9/util/stream/Node;->spliterator()Ljava9/util/Spliterator;

    move-result-object p1

    return-object p1
.end method

.method abstract opIsStateful()Z
.end method

.method abstract opWrapSink(ILjava9/util/stream/Sink;)Ljava9/util/stream/Sink;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava9/util/stream/Sink<",
            "TE_OUT;>;)",
            "Ljava9/util/stream/Sink<",
            "TE_IN;>;"
        }
    .end annotation
.end method

.method public final parallel()Ljava9/util/stream/BaseStream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 310
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ljava9/util/stream/AbstractPipeline;->parallel:Z

    return-object p0
.end method

.method public final sequential()Ljava9/util/stream/BaseStream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 303
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ljava9/util/stream/AbstractPipeline;->parallel:Z

    return-object p0
.end method

.method final sourceStageSpliterator()Ljava9/util/Spliterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;"
        }
    .end annotation

    .line 276
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    if-ne p0, v0, :cond_3

    .line 279
    iget-boolean v1, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 281
    iput-boolean v1, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    .line 283
    iget-object v1, v0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 285
    iput-object v2, v0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    return-object v1

    .line 288
    :cond_0
    iget-object v0, v0, Ljava9/util/stream/AbstractPipeline;->sourceSupplier:Ljava9/util/function/Supplier;

    if-eqz v0, :cond_1

    .line 289
    invoke-interface {v0}, Ljava9/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/Spliterator;

    .line 290
    iget-object v1, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    iput-object v2, v1, Ljava9/util/stream/AbstractPipeline;->sourceSupplier:Ljava9/util/function/Supplier;

    return-object v0

    .line 294
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "source already consumed or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 280
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "stream has already been operated upon or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 277
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public spliterator()Ljava9/util/Spliterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;"
        }
    .end annotation

    .line 344
    iget-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 346
    iput-boolean v0, p0, Ljava9/util/stream/AbstractPipeline;->linkedOrConsumed:Z

    .line 348
    iget-object v0, p0, Ljava9/util/stream/AbstractPipeline;->sourceStage:Ljava9/util/stream/AbstractPipeline;

    if-ne p0, v0, :cond_2

    .line 349
    iget-object v1, v0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 351
    iput-object v2, v0, Ljava9/util/stream/AbstractPipeline;->sourceSpliterator:Ljava9/util/Spliterator;

    return-object v1

    .line 354
    :cond_0
    iget-object v1, v0, Ljava9/util/stream/AbstractPipeline;->sourceSupplier:Ljava9/util/function/Supplier;

    if-eqz v1, :cond_1

    .line 356
    iput-object v2, v0, Ljava9/util/stream/AbstractPipeline;->sourceSupplier:Ljava9/util/function/Supplier;

    .line 357
    invoke-virtual {p0, v1}, Ljava9/util/stream/AbstractPipeline;->lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator;

    move-result-object v0

    return-object v0

    .line 360
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "source already consumed or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 364
    :cond_2
    new-instance v0, Ljava9/util/stream/-$$Lambda$AbstractPipeline$3IRXK--MnJJnOznlBU5y0H7DtO0;

    invoke-direct {v0, p0}, Ljava9/util/stream/-$$Lambda$AbstractPipeline$3IRXK--MnJJnOznlBU5y0H7DtO0;-><init>(Ljava9/util/stream/AbstractPipeline;)V

    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->isParallel()Z

    move-result v1

    invoke-virtual {p0, p0, v0, v1}, Ljava9/util/stream/AbstractPipeline;->wrap(Ljava9/util/stream/PipelineHelper;Ljava9/util/function/Supplier;Z)Ljava9/util/Spliterator;

    move-result-object v0

    return-object v0

    .line 345
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "stream has already been operated upon or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method abstract wrap(Ljava9/util/stream/PipelineHelper;Ljava9/util/function/Supplier;Z)Ljava9/util/Spliterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/PipelineHelper<",
            "TE_OUT;>;",
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;>;Z)",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;"
        }
    .end annotation
.end method

.method final wrapAndCopyInto(Ljava9/util/stream/Sink;Ljava9/util/Spliterator;)Ljava9/util/stream/Sink;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            "S_::",
            "Ljava9/util/stream/Sink<",
            "TE_OUT;>;>(TS_;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)TS_;"
        }
    .end annotation

    .line 472
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/Sink;

    invoke-virtual {p0, v0}, Ljava9/util/stream/AbstractPipeline;->wrapSink(Ljava9/util/stream/Sink;)Ljava9/util/stream/Sink;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Ljava9/util/stream/AbstractPipeline;->copyInto(Ljava9/util/stream/Sink;Ljava9/util/Spliterator;)V

    return-object p1
.end method

.method final wrapSink(Ljava9/util/stream/Sink;)Ljava9/util/stream/Sink;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/Sink<",
            "TE_OUT;>;)",
            "Ljava9/util/stream/Sink<",
            "TP_IN;>;"
        }
    .end annotation

    .line 516
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    move-object p1, p0

    .line 518
    :goto_0
    iget v1, p1, Ljava9/util/stream/AbstractPipeline;->depth:I

    if-lez v1, :cond_0

    .line 519
    iget-object v1, p1, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    iget v1, v1, Ljava9/util/stream/AbstractPipeline;->combinedFlags:I

    invoke-virtual {p1, v1, v0}, Ljava9/util/stream/AbstractPipeline;->opWrapSink(ILjava9/util/stream/Sink;)Ljava9/util/stream/Sink;

    move-result-object v0

    .line 518
    iget-object p1, p1, Ljava9/util/stream/AbstractPipeline;->previousStage:Ljava9/util/stream/AbstractPipeline;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method final wrapSpliterator(Ljava9/util/Spliterator;)Ljava9/util/Spliterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;)",
            "Ljava9/util/Spliterator<",
            "TE_OUT;>;"
        }
    .end annotation

    .line 527
    iget v0, p0, Ljava9/util/stream/AbstractPipeline;->depth:I

    if-nez v0, :cond_0

    return-object p1

    .line 531
    :cond_0
    new-instance v0, Ljava9/util/stream/-$$Lambda$AbstractPipeline$GLRypqiOwZXEy6bymuF5O-6k6Xo;

    invoke-direct {v0, p1}, Ljava9/util/stream/-$$Lambda$AbstractPipeline$GLRypqiOwZXEy6bymuF5O-6k6Xo;-><init>(Ljava9/util/Spliterator;)V

    invoke-virtual {p0}, Ljava9/util/stream/AbstractPipeline;->isParallel()Z

    move-result p1

    invoke-virtual {p0, p0, v0, p1}, Ljava9/util/stream/AbstractPipeline;->wrap(Ljava9/util/stream/PipelineHelper;Ljava9/util/function/Supplier;Z)Ljava9/util/Spliterator;

    move-result-object p1

    return-object p1
.end method
