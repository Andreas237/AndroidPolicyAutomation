.class abstract Ljava9/util/stream/DoublePipeline;
.super Ljava9/util/stream/AbstractPipeline;
.source "DoublePipeline.java"

# interfaces
.implements Ljava9/util/stream/DoubleStream;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/stream/DoublePipeline$StatefulOp;,
        Ljava9/util/stream/DoublePipeline$StatelessOp;,
        Ljava9/util/stream/DoublePipeline$Head;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E_IN:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/stream/AbstractPipeline<",
        "TE_IN;",
        "Ljava/lang/Double;",
        "Ljava9/util/stream/DoubleStream;",
        ">;",
        "Ljava9/util/stream/DoubleStream;"
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

    .line 79
    invoke-direct {p0, p1, p2, p3}, Ljava9/util/stream/AbstractPipeline;-><init>(Ljava9/util/Spliterator;IZ)V

    return-void
.end method

.method constructor <init>(Ljava9/util/stream/AbstractPipeline;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/AbstractPipeline<",
            "*TE_IN;*>;I)V"
        }
    .end annotation

    .line 90
    invoke-direct {p0, p1, p2}, Ljava9/util/stream/AbstractPipeline;-><init>(Ljava9/util/stream/AbstractPipeline;I)V

    return-void
.end method

.method static synthetic access$000(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfDouble;
    .locals 0

    .line 54
    invoke-static {p0}, Ljava9/util/stream/DoublePipeline;->adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfDouble;

    move-result-object p0

    return-object p0
.end method

.method private static adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfDouble;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava9/util/Spliterator$OfDouble;"
        }
    .end annotation

    .line 113
    instance-of v0, p0, Ljava9/util/Spliterator$OfDouble;

    if-eqz v0, :cond_0

    .line 114
    check-cast p0, Ljava9/util/Spliterator$OfDouble;

    return-object p0

    .line 116
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "DoubleStream.adapt(Spliterator<Double> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static adapt(Ljava9/util/stream/Sink;)Ljava9/util/function/DoubleConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/Sink<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava9/util/function/DoubleConsumer;"
        }
    .end annotation

    .line 98
    instance-of v0, p0, Ljava9/util/function/DoubleConsumer;

    if-eqz v0, :cond_0

    .line 99
    check-cast p0, Ljava9/util/function/DoubleConsumer;

    return-object p0

    .line 101
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava9/util/stream/-$$Lambda$giJlSSFTQZka8_Rzo0QZ9boF7KM;

    invoke-direct {v0, p0}, Ljava9/util/stream/-$$Lambda$giJlSSFTQZka8_Rzo0QZ9boF7KM;-><init>(Ljava9/util/stream/Sink;)V

    return-object v0
.end method

.method static synthetic lambda$average$53()[D
    .locals 1

    const/4 v0, 0x4

    .line 467
    new-array v0, v0, [D

    return-object v0
.end method

.method static synthetic lambda$average$54([DD)V
    .locals 5

    const/4 v0, 0x2

    .line 469
    aget-wide v1, p0, v0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v1, v3

    aput-wide v1, p0, v0

    .line 470
    invoke-static {p0, p1, p2}, Ljava9/util/stream/Collectors;->sumWithCompensation([DD)[D

    const/4 v0, 0x3

    .line 471
    aget-wide v1, p0, v0

    add-double/2addr v1, p1

    aput-wide v1, p0, v0

    return-void
.end method

.method static synthetic lambda$average$55([D[D)V
    .locals 5

    const/4 v0, 0x0

    .line 474
    aget-wide v0, p1, v0

    invoke-static {p0, v0, v1}, Ljava9/util/stream/Collectors;->sumWithCompensation([DD)[D

    const/4 v0, 0x1

    .line 475
    aget-wide v0, p1, v0

    invoke-static {p0, v0, v1}, Ljava9/util/stream/Collectors;->sumWithCompensation([DD)[D

    const/4 v0, 0x2

    .line 476
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    add-double/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x3

    .line 477
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    add-double/2addr v1, v3

    aput-wide v1, p0, v0

    return-void
.end method

.method static synthetic lambda$collect$56(Ljava9/util/function/BiConsumer;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 511
    invoke-interface {p0, p1, p2}, Ljava9/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method static synthetic lambda$distinct$49(Ljava/lang/Double;)D
    .locals 2

    .line 400
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic lambda$sum$50()[D
    .locals 1

    const/4 v0, 0x3

    .line 425
    new-array v0, v0, [D

    return-object v0
.end method

.method static synthetic lambda$sum$51([DD)V
    .locals 3

    .line 427
    invoke-static {p0, p1, p2}, Ljava9/util/stream/Collectors;->sumWithCompensation([DD)[D

    const/4 v0, 0x2

    .line 428
    aget-wide v1, p0, v0

    add-double/2addr v1, p1

    aput-wide v1, p0, v0

    return-void
.end method

.method static synthetic lambda$sum$52([D[D)V
    .locals 5

    const/4 v0, 0x0

    .line 431
    aget-wide v0, p1, v0

    invoke-static {p0, v0, v1}, Ljava9/util/stream/Collectors;->sumWithCompensation([DD)[D

    const/4 v0, 0x1

    .line 432
    aget-wide v0, p1, v0

    invoke-static {p0, v0, v1}, Ljava9/util/stream/Collectors;->sumWithCompensation([DD)[D

    const/4 v0, 0x2

    .line 433
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    add-double/2addr v1, v3

    aput-wide v1, p0, v0

    return-void
.end method

.method private mapToObj(Ljava9/util/function/DoubleFunction;I)Ljava9/util/stream/Stream;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/DoubleFunction<",
            "+TU;>;I)",
            "Ljava9/util/stream/Stream<",
            "TU;>;"
        }
    .end annotation

    .line 164
    new-instance v6, Ljava9/util/stream/DoublePipeline$1;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move v4, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/DoublePipeline$1;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoubleFunction;)V

    return-object v6
.end method


# virtual methods
.method public final allMatch(Ljava9/util/function/DoublePredicate;)Z
    .locals 1

    .line 524
    sget-object v0, Ljava9/util/stream/MatchOps$MatchKind;->ALL:Ljava9/util/stream/MatchOps$MatchKind;

    invoke-static {p1, v0}, Ljava9/util/stream/MatchOps;->makeDouble(Ljava9/util/function/DoublePredicate;Ljava9/util/stream/MatchOps$MatchKind;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava9/util/function/DoublePredicate;)Z
    .locals 1

    .line 519
    sget-object v0, Ljava9/util/stream/MatchOps$MatchKind;->ANY:Ljava9/util/stream/MatchOps$MatchKind;

    invoke-static {p1, v0}, Ljava9/util/stream/MatchOps;->makeDouble(Ljava9/util/function/DoublePredicate;Ljava9/util/stream/MatchOps$MatchKind;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final average()Ljava9/util/OptionalDouble;
    .locals 7

    .line 467
    sget-object v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$xj8Ypp11f3Mds4KCvXiQxpXrgQ8;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$xj8Ypp11f3Mds4KCvXiQxpXrgQ8;

    sget-object v1, Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;

    sget-object v2, Ljava9/util/stream/-$$Lambda$DoublePipeline$iLqB8gjkH_SJZmZbYQLUAMllg6U;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$iLqB8gjkH_SJZmZbYQLUAMllg6U;

    invoke-virtual {p0, v0, v1, v2}, Ljava9/util/stream/DoublePipeline;->collect(Ljava9/util/function/Supplier;Ljava9/util/function/ObjDoubleConsumer;Ljava9/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    const/4 v1, 0x2

    .line 479
    aget-wide v2, v0, v1

    const-wide/16 v4, 0x0

    cmpl-double v6, v2, v4

    if-lez v6, :cond_0

    .line 480
    invoke-static {v0}, Ljava9/util/stream/Collectors;->computeFinalSum([D)D

    move-result-wide v2

    aget-wide v4, v0, v1

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava9/util/OptionalDouble;->of(D)Ljava9/util/OptionalDouble;

    move-result-object v0

    goto :goto_0

    .line 481
    :cond_0
    invoke-static {}, Ljava9/util/OptionalDouble;->empty()Ljava9/util/OptionalDouble;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final boxed()Ljava9/util/stream/Stream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/stream/Stream<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 193
    sget-object v0, Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;->INSTANCE:Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava9/util/stream/DoublePipeline;->mapToObj(Ljava9/util/function/DoubleFunction;I)Ljava9/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final collect(Ljava9/util/function/Supplier;Ljava9/util/function/ObjDoubleConsumer;Ljava9/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Supplier<",
            "TR;>;",
            "Ljava9/util/function/ObjDoubleConsumer<",
            "TR;>;",
            "Ljava9/util/function/BiConsumer<",
            "TR;TR;>;)TR;"
        }
    .end annotation

    .line 509
    invoke-static {p3}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    new-instance v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$4IQoYps-kHq4753MdWJZxkLSX3U;

    invoke-direct {v0, p3}, Ljava9/util/stream/-$$Lambda$DoublePipeline$4IQoYps-kHq4753MdWJZxkLSX3U;-><init>(Ljava9/util/function/BiConsumer;)V

    .line 514
    invoke-static {p1, p2, v0}, Ljava9/util/stream/ReduceOps;->makeDouble(Ljava9/util/function/Supplier;Ljava9/util/function/ObjDoubleConsumer;Ljava9/util/function/BinaryOperator;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 2

    .line 486
    invoke-static {}, Ljava9/util/stream/ReduceOps;->makeDoubleCounting()Ljava9/util/stream/TerminalOp;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ljava9/util/stream/DoubleStream;
    .locals 2

    .line 400
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline;->boxed()Ljava9/util/stream/Stream;

    move-result-object v0

    invoke-interface {v0}, Ljava9/util/stream/Stream;->distinct()Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->mapToDouble(Ljava9/util/function/ToDoubleFunction;)Ljava9/util/stream/DoubleStream;

    move-result-object v0

    return-object v0
.end method

.method public final dropWhile(Ljava9/util/function/DoublePredicate;)Ljava9/util/stream/DoubleStream;
    .locals 0

    .line 388
    invoke-static {p0, p1}, Ljava9/util/stream/WhileOps;->makeDropWhileDouble(Ljava9/util/stream/AbstractPipeline;Ljava9/util/function/DoublePredicate;)Ljava9/util/stream/DoubleStream;

    move-result-object p1

    return-object p1
.end method

.method final evaluateToNode(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;ZLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/PipelineHelper<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;Z",
            "Ljava9/util/function/IntFunction<",
            "[",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava9/util/stream/Node<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 133
    invoke-static {p1, p2, p3}, Ljava9/util/stream/Nodes;->collectDouble(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Z)Ljava9/util/stream/Node$OfDouble;

    move-result-object p1

    return-object p1
.end method

.method public final filter(Ljava9/util/function/DoublePredicate;)Ljava9/util/stream/DoubleStream;
    .locals 7

    .line 321
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    new-instance v6, Ljava9/util/stream/DoublePipeline$7;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    sget v4, Ljava9/util/stream/StreamOpFlag;->NOT_SIZED:I

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/DoublePipeline$7;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoublePredicate;)V

    return-object v6
.end method

.method public final findAny()Ljava9/util/OptionalDouble;
    .locals 1

    const/4 v0, 0x0

    .line 539
    invoke-static {v0}, Ljava9/util/stream/FindOps;->makeDouble(Z)Ljava9/util/stream/TerminalOp;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/OptionalDouble;

    return-object v0
.end method

.method public final findFirst()Ljava9/util/OptionalDouble;
    .locals 1

    const/4 v0, 0x1

    .line 534
    invoke-static {v0}, Ljava9/util/stream/FindOps;->makeDouble(Z)Ljava9/util/stream/TerminalOp;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/OptionalDouble;

    return-object v0
.end method

.method public final flatMap(Ljava9/util/function/DoubleFunction;)Ljava9/util/stream/DoubleStream;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/DoubleFunction<",
            "+",
            "Ljava9/util/stream/DoubleStream;",
            ">;)",
            "Ljava9/util/stream/DoubleStream;"
        }
    .end annotation

    .line 255
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    new-instance v6, Ljava9/util/stream/DoublePipeline$5;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int/2addr v0, v1

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_SIZED:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/DoublePipeline$5;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoubleFunction;)V

    return-object v6
.end method

.method public forEach(Ljava9/util/function/DoubleConsumer;)V
    .locals 1

    const/4 v0, 0x0

    .line 407
    invoke-static {p1, v0}, Ljava9/util/stream/ForEachOps;->makeDouble(Ljava9/util/function/DoubleConsumer;Z)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    return-void
.end method

.method public forEachOrdered(Ljava9/util/function/DoubleConsumer;)V
    .locals 1

    const/4 v0, 0x1

    .line 412
    invoke-static {p1, v0}, Ljava9/util/stream/ForEachOps;->makeDouble(Ljava9/util/function/DoubleConsumer;Z)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    return-void
.end method

.method final forEachWithCancel(Ljava9/util/Spliterator;Ljava9/util/stream/Sink;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava9/util/stream/Sink<",
            "Ljava/lang/Double;",
            ">;)Z"
        }
    .end annotation

    .line 151
    invoke-static {p1}, Ljava9/util/stream/DoublePipeline;->adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfDouble;

    move-result-object p1

    .line 152
    invoke-static {p2}, Ljava9/util/stream/DoublePipeline;->adapt(Ljava9/util/stream/Sink;)Ljava9/util/function/DoubleConsumer;

    move-result-object v0

    .line 154
    :cond_0
    invoke-interface {p2}, Ljava9/util/stream/Sink;->cancellationRequested()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1, v0}, Ljava9/util/Spliterator$OfDouble;->tryAdvance(Ljava9/util/function/DoubleConsumer;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_1
    return v1
.end method

.method final getOutputShape()Ljava9/util/stream/StreamShape;
    .locals 1

    .line 125
    sget-object v0, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline;->iterator()Ljava9/util/PrimitiveIterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ljava9/util/PrimitiveIterator$OfDouble;
    .locals 1

    .line 181
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline;->spliterator()Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/Spliterators;->iterator(Ljava9/util/Spliterator$OfDouble;)Ljava9/util/PrimitiveIterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method final lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator$OfDouble;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Supplier<",
            "+",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Double;",
            ">;>;)",
            "Ljava9/util/Spliterator$OfDouble;"
        }
    .end annotation

    .line 146
    new-instance v0, Ljava9/util/stream/StreamSpliterators$DelegatingSpliterator$OfDouble;

    invoke-direct {v0, p1}, Ljava9/util/stream/StreamSpliterators$DelegatingSpliterator$OfDouble;-><init>(Ljava9/util/function/Supplier;)V

    return-object v0
.end method

.method bridge synthetic lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator;
    .locals 0

    .line 54
    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator$OfDouble;

    move-result-object p1

    return-object p1
.end method

.method public final limit(J)Ljava9/util/stream/DoubleStream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 366
    invoke-static {p0, v0, v1, p1, p2}, Ljava9/util/stream/SliceOps;->makeDouble(Ljava9/util/stream/AbstractPipeline;JJ)Ljava9/util/stream/DoubleStream;

    move-result-object p1

    return-object p1

    .line 365
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final makeNodeBuilder(JLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava9/util/function/IntFunction<",
            "[",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava9/util/stream/Node$Builder<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 160
    invoke-static {p1, p2}, Ljava9/util/stream/Nodes;->doubleBuilder(J)Ljava9/util/stream/Node$Builder$OfDouble;

    move-result-object p1

    return-object p1
.end method

.method public final map(Ljava9/util/function/DoubleUnaryOperator;)Ljava9/util/stream/DoubleStream;
    .locals 7

    .line 198
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    new-instance v6, Ljava9/util/stream/DoublePipeline$2;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/DoublePipeline$2;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoubleUnaryOperator;)V

    return-object v6
.end method

.method public final mapToInt(Ljava9/util/function/DoubleToIntFunction;)Ljava9/util/stream/IntStream;
    .locals 7

    .line 221
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    new-instance v6, Ljava9/util/stream/DoublePipeline$3;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/DoublePipeline$3;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoubleToIntFunction;)V

    return-object v6
.end method

.method public final mapToLong(Ljava9/util/function/DoubleToLongFunction;)Ljava9/util/stream/LongStream;
    .locals 7

    .line 238
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    new-instance v6, Ljava9/util/stream/DoublePipeline$4;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/DoublePipeline$4;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoubleToLongFunction;)V

    return-object v6
.end method

.method public final mapToObj(Ljava9/util/function/DoubleFunction;)Ljava9/util/stream/Stream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/DoubleFunction<",
            "+TU;>;)",
            "Ljava9/util/stream/Stream<",
            "TU;>;"
        }
    .end annotation

    .line 215
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int/2addr v0, v1

    invoke-direct {p0, p1, v0}, Ljava9/util/stream/DoublePipeline;->mapToObj(Ljava9/util/function/DoubleFunction;I)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final max()Ljava9/util/OptionalDouble;
    .locals 1

    .line 446
    sget-object v0, Ljava9/util/stream/-$$Lambda$yqWzjO8YAgEAzc1j7mqeBXROVdA;->INSTANCE:Ljava9/util/stream/-$$Lambda$yqWzjO8YAgEAzc1j7mqeBXROVdA;

    invoke-virtual {p0, v0}, Ljava9/util/stream/DoublePipeline;->reduce(Ljava9/util/function/DoubleBinaryOperator;)Ljava9/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final min()Ljava9/util/OptionalDouble;
    .locals 1

    .line 441
    sget-object v0, Ljava9/util/stream/-$$Lambda$-s7DDKaaOLbuwsEU1jgZAqeX2as;->INSTANCE:Ljava9/util/stream/-$$Lambda$-s7DDKaaOLbuwsEU1jgZAqeX2as;

    invoke-virtual {p0, v0}, Ljava9/util/stream/DoublePipeline;->reduce(Ljava9/util/function/DoubleBinaryOperator;)Ljava9/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final noneMatch(Ljava9/util/function/DoublePredicate;)Z
    .locals 1

    .line 529
    sget-object v0, Ljava9/util/stream/MatchOps$MatchKind;->NONE:Ljava9/util/stream/MatchOps$MatchKind;

    invoke-static {p1, v0}, Ljava9/util/stream/MatchOps;->makeDouble(Ljava9/util/function/DoublePredicate;Ljava9/util/stream/MatchOps$MatchKind;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic parallel()Ljava9/util/stream/DoubleStream;
    .locals 1

    .line 54
    invoke-super {p0}, Ljava9/util/stream/AbstractPipeline;->parallel()Ljava9/util/stream/BaseStream;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/DoubleStream;

    return-object v0
.end method

.method public final peek(Ljava9/util/function/DoubleConsumer;)Ljava9/util/stream/DoubleStream;
    .locals 7

    .line 344
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    new-instance v6, Ljava9/util/stream/DoublePipeline$8;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    const/4 v4, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/DoublePipeline$8;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/DoubleConsumer;)V

    return-object v6
.end method

.method public final reduce(DLjava9/util/function/DoubleBinaryOperator;)D
    .locals 0

    .line 497
    invoke-static {p1, p2, p3}, Ljava9/util/stream/ReduceOps;->makeDouble(DLjava9/util/function/DoubleBinaryOperator;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    return-wide p1
.end method

.method public final reduce(Ljava9/util/function/DoubleBinaryOperator;)Ljava9/util/OptionalDouble;
    .locals 0

    .line 502
    invoke-static {p1}, Ljava9/util/stream/ReduceOps;->makeDouble(Ljava9/util/function/DoubleBinaryOperator;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/DoublePipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava9/util/OptionalDouble;

    return-object p1
.end method

.method public bridge synthetic sequential()Ljava9/util/stream/DoubleStream;
    .locals 1

    .line 54
    invoke-super {p0}, Ljava9/util/stream/AbstractPipeline;->sequential()Ljava9/util/stream/BaseStream;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/DoubleStream;

    return-object v0
.end method

.method public final skip(J)Ljava9/util/stream/DoubleStream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    .line 377
    invoke-static {p0, p1, p2, v0, v1}, Ljava9/util/stream/SliceOps;->makeDouble(Ljava9/util/stream/AbstractPipeline;JJ)Ljava9/util/stream/DoubleStream;

    move-result-object p1

    return-object p1

    .line 372
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Ljava9/util/stream/DoubleStream;
    .locals 1

    .line 393
    invoke-static {p0}, Ljava9/util/stream/SortedOps;->makeDouble(Ljava9/util/stream/AbstractPipeline;)Ljava9/util/stream/DoubleStream;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ljava9/util/Spliterator$OfDouble;
    .locals 1

    .line 186
    invoke-super {p0}, Ljava9/util/stream/AbstractPipeline;->spliterator()Ljava9/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/DoublePipeline;->adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava9/util/Spliterator;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline;->spliterator()Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method public final sum()D
    .locals 3

    .line 425
    sget-object v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;

    sget-object v1, Ljava9/util/stream/-$$Lambda$DoublePipeline$46BWG0igGER2KjMnPx1QN98QswM;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$46BWG0igGER2KjMnPx1QN98QswM;

    sget-object v2, Ljava9/util/stream/-$$Lambda$DoublePipeline$kBJ49RxhCBeGaNbwQ4IltZekSMQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$kBJ49RxhCBeGaNbwQ4IltZekSMQ;

    invoke-virtual {p0, v0, v1, v2}, Ljava9/util/stream/DoublePipeline;->collect(Ljava9/util/function/Supplier;Ljava9/util/function/ObjDoubleConsumer;Ljava9/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    .line 436
    invoke-static {v0}, Ljava9/util/stream/Collectors;->computeFinalSum([D)D

    move-result-wide v0

    return-wide v0
.end method

.method public final summaryStatistics()Ljava9/util/DoubleSummaryStatistics;
    .locals 3

    .line 491
    sget-object v0, Ljava9/util/stream/Collectors;->DBL_SUM_STATS:Ljava9/util/function/Supplier;

    sget-object v1, Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;->INSTANCE:Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;

    sget-object v2, Ljava9/util/stream/-$$Lambda$kU3duutKiZDBAfOsBcI92z080Rs;->INSTANCE:Ljava9/util/stream/-$$Lambda$kU3duutKiZDBAfOsBcI92z080Rs;

    invoke-virtual {p0, v0, v1, v2}, Ljava9/util/stream/DoublePipeline;->collect(Ljava9/util/function/Supplier;Ljava9/util/function/ObjDoubleConsumer;Ljava9/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/DoubleSummaryStatistics;

    return-object v0
.end method

.method public final takeWhile(Ljava9/util/function/DoublePredicate;)Ljava9/util/stream/DoubleStream;
    .locals 0

    .line 383
    invoke-static {p0, p1}, Ljava9/util/stream/WhileOps;->makeTakeWhileDouble(Ljava9/util/stream/AbstractPipeline;Ljava9/util/function/DoublePredicate;)Ljava9/util/stream/DoubleStream;

    move-result-object p1

    return-object p1
.end method

.method public final toArray()[D
    .locals 1

    .line 544
    sget-object v0, Ljava9/util/stream/WhileOps;->DOUBLE_ARR_GEN:Ljava9/util/function/IntFunction;

    invoke-virtual {p0, v0}, Ljava9/util/stream/DoublePipeline;->evaluateToArrayNode(Ljava9/util/function/IntFunction;)Ljava9/util/stream/Node;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/Node$OfDouble;

    invoke-static {v0}, Ljava9/util/stream/Nodes;->flattenDouble(Ljava9/util/stream/Node$OfDouble;)Ljava9/util/stream/Node$OfDouble;

    move-result-object v0

    .line 545
    invoke-interface {v0}, Ljava9/util/stream/Node$OfDouble;->asPrimitiveArray()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public bridge synthetic unordered()Ljava9/util/stream/BaseStream;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline;->unordered()Ljava9/util/stream/DoubleStream;

    move-result-object v0

    return-object v0
.end method

.method public unordered()Ljava9/util/stream/DoubleStream;
    .locals 3

    .line 309
    invoke-virtual {p0}, Ljava9/util/stream/DoublePipeline;->isOrdered()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 311
    :cond_0
    new-instance v0, Ljava9/util/stream/DoublePipeline$6;

    sget-object v1, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    sget v2, Ljava9/util/stream/StreamOpFlag;->NOT_ORDERED:I

    invoke-direct {v0, p0, p0, v1, v2}, Ljava9/util/stream/DoublePipeline$6;-><init>(Ljava9/util/stream/DoublePipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;I)V

    return-object v0
.end method

.method final wrap(Ljava9/util/stream/PipelineHelper;Ljava9/util/function/Supplier;Z)Ljava9/util/Spliterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P_IN:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/PipelineHelper<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;>;Z)",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 140
    new-instance v0, Ljava9/util/stream/StreamSpliterators$DoubleWrappingSpliterator;

    invoke-direct {v0, p1, p2, p3}, Ljava9/util/stream/StreamSpliterators$DoubleWrappingSpliterator;-><init>(Ljava9/util/stream/PipelineHelper;Ljava9/util/function/Supplier;Z)V

    return-object v0
.end method
