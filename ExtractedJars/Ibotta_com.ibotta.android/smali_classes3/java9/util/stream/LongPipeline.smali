.class abstract Ljava9/util/stream/LongPipeline;
.super Ljava9/util/stream/AbstractPipeline;
.source "LongPipeline.java"

# interfaces
.implements Ljava9/util/stream/LongStream;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/stream/LongPipeline$StatefulOp;,
        Ljava9/util/stream/LongPipeline$StatelessOp;,
        Ljava9/util/stream/LongPipeline$Head;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E_IN:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/stream/AbstractPipeline<",
        "TE_IN;",
        "Ljava/lang/Long;",
        "Ljava9/util/stream/LongStream;",
        ">;",
        "Ljava9/util/stream/LongStream;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava9/util/Spliterator;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Long;",
            ">;IZ)V"
        }
    .end annotation

    .line 82
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

    .line 92
    invoke-direct {p0, p1, p2}, Ljava9/util/stream/AbstractPipeline;-><init>(Ljava9/util/stream/AbstractPipeline;I)V

    return-void
.end method

.method static synthetic access$000(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfLong;
    .locals 0

    .line 55
    invoke-static {p0}, Ljava9/util/stream/LongPipeline;->adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfLong;

    move-result-object p0

    return-object p0
.end method

.method private static adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfLong;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava9/util/Spliterator$OfLong;"
        }
    .end annotation

    .line 115
    instance-of v0, p0, Ljava9/util/Spliterator$OfLong;

    if-eqz v0, :cond_0

    .line 116
    check-cast p0, Ljava9/util/Spliterator$OfLong;

    return-object p0

    .line 118
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "LongStream.adapt(Spliterator<Long> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static adapt(Ljava9/util/stream/Sink;)Ljava9/util/function/LongConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/Sink<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava9/util/function/LongConsumer;"
        }
    .end annotation

    .line 100
    instance-of v0, p0, Ljava9/util/function/LongConsumer;

    if-eqz v0, :cond_0

    .line 101
    check-cast p0, Ljava9/util/function/LongConsumer;

    return-object p0

    .line 103
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava9/util/stream/-$$Lambda$ZYIfHchh3rC0i43ByP-SFQOzpC8;

    invoke-direct {v0, p0}, Ljava9/util/stream/-$$Lambda$ZYIfHchh3rC0i43ByP-SFQOzpC8;-><init>(Ljava9/util/stream/Sink;)V

    return-object v0
.end method

.method static synthetic lambda$average$38()[J
    .locals 1

    const/4 v0, 0x2

    .line 449
    new-array v0, v0, [J

    return-object v0
.end method

.method static synthetic lambda$average$39([JJ)V
    .locals 5

    const/4 v0, 0x0

    .line 451
    aget-wide v1, p0, v0

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x1

    .line 452
    aget-wide v1, p0, v0

    add-long/2addr v1, p1

    aput-wide v1, p0, v0

    return-void
.end method

.method static synthetic lambda$average$40([J[J)V
    .locals 5

    const/4 v0, 0x0

    .line 455
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x1

    .line 456
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    return-void
.end method

.method static synthetic lambda$collect$41(Ljava9/util/function/BiConsumer;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 490
    invoke-interface {p0, p1, p2}, Ljava9/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method static synthetic lambda$distinct$37(Ljava/lang/Long;)J
    .locals 2

    .line 416
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private mapToObj(Ljava9/util/function/LongFunction;I)Ljava9/util/stream/Stream;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/LongFunction<",
            "+TU;>;I)",
            "Ljava9/util/stream/Stream<",
            "TU;>;"
        }
    .end annotation

    .line 166
    new-instance v6, Ljava9/util/stream/LongPipeline$1;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move v4, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/LongPipeline$1;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/LongFunction;)V

    return-object v6
.end method


# virtual methods
.method public final allMatch(Ljava9/util/function/LongPredicate;)Z
    .locals 1

    .line 503
    sget-object v0, Ljava9/util/stream/MatchOps$MatchKind;->ALL:Ljava9/util/stream/MatchOps$MatchKind;

    invoke-static {p1, v0}, Ljava9/util/stream/MatchOps;->makeLong(Ljava9/util/function/LongPredicate;Ljava9/util/stream/MatchOps$MatchKind;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava9/util/function/LongPredicate;)Z
    .locals 1

    .line 498
    sget-object v0, Ljava9/util/stream/MatchOps$MatchKind;->ANY:Ljava9/util/stream/MatchOps$MatchKind;

    invoke-static {p1, v0}, Ljava9/util/stream/MatchOps;->makeLong(Ljava9/util/function/LongPredicate;Ljava9/util/stream/MatchOps$MatchKind;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final asDoubleStream()Ljava9/util/stream/DoubleStream;
    .locals 3

    .line 195
    new-instance v0, Ljava9/util/stream/LongPipeline$2;

    sget-object v1, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    sget v2, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    invoke-direct {v0, p0, p0, v1, v2}, Ljava9/util/stream/LongPipeline$2;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;I)V

    return-object v0
.end method

.method public final average()Ljava9/util/OptionalDouble;
    .locals 7

    .line 449
    sget-object v0, Ljava9/util/stream/-$$Lambda$LongPipeline$TxNeFw7b1sfo6vQqgByZG2ynSB8;->INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$TxNeFw7b1sfo6vQqgByZG2ynSB8;

    sget-object v1, Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;->INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;

    sget-object v2, Ljava9/util/stream/-$$Lambda$LongPipeline$HLxbJzMby3sgGdSDCiNXh9wDbEQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$HLxbJzMby3sgGdSDCiNXh9wDbEQ;

    invoke-virtual {p0, v0, v1, v2}, Ljava9/util/stream/LongPipeline;->collect(Ljava9/util/function/Supplier;Ljava9/util/function/ObjLongConsumer;Ljava9/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    const/4 v1, 0x0

    .line 458
    aget-wide v2, v0, v1

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    const/4 v2, 0x1

    aget-wide v2, v0, v2

    long-to-double v2, v2

    aget-wide v4, v0, v1

    long-to-double v0, v4

    div-double/2addr v2, v0

    .line 459
    invoke-static {v2, v3}, Ljava9/util/OptionalDouble;->of(D)Ljava9/util/OptionalDouble;

    move-result-object v0

    goto :goto_0

    .line 460
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
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 210
    sget-object v0, Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;->INSTANCE:Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava9/util/stream/LongPipeline;->mapToObj(Ljava9/util/function/LongFunction;I)Ljava9/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final collect(Ljava9/util/function/Supplier;Ljava9/util/function/ObjLongConsumer;Ljava9/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Supplier<",
            "TR;>;",
            "Ljava9/util/function/ObjLongConsumer<",
            "TR;>;",
            "Ljava9/util/function/BiConsumer<",
            "TR;TR;>;)TR;"
        }
    .end annotation

    .line 488
    invoke-static {p3}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    new-instance v0, Ljava9/util/stream/-$$Lambda$LongPipeline$nOyCxLIAWtzpddTjMm6pWdNwGCc;

    invoke-direct {v0, p3}, Ljava9/util/stream/-$$Lambda$LongPipeline$nOyCxLIAWtzpddTjMm6pWdNwGCc;-><init>(Ljava9/util/function/BiConsumer;)V

    .line 493
    invoke-static {p1, p2, v0}, Ljava9/util/stream/ReduceOps;->makeLong(Ljava9/util/function/Supplier;Ljava9/util/function/ObjLongConsumer;Ljava9/util/function/BinaryOperator;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 2

    .line 465
    invoke-static {}, Ljava9/util/stream/ReduceOps;->makeLongCounting()Ljava9/util/stream/TerminalOp;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ljava9/util/stream/LongStream;
    .locals 2

    .line 416
    invoke-virtual {p0}, Ljava9/util/stream/LongPipeline;->boxed()Ljava9/util/stream/Stream;

    move-result-object v0

    invoke-interface {v0}, Ljava9/util/stream/Stream;->distinct()Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;->INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->mapToLong(Ljava9/util/function/ToLongFunction;)Ljava9/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public final dropWhile(Ljava9/util/function/LongPredicate;)Ljava9/util/stream/LongStream;
    .locals 0

    .line 404
    invoke-static {p0, p1}, Ljava9/util/stream/WhileOps;->makeDropWhileLong(Ljava9/util/stream/AbstractPipeline;Ljava9/util/function/LongPredicate;)Ljava9/util/stream/LongStream;

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
            "Ljava/lang/Long;",
            ">;",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;Z",
            "Ljava9/util/function/IntFunction<",
            "[",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava9/util/stream/Node<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 135
    invoke-static {p1, p2, p3}, Ljava9/util/stream/Nodes;->collectLong(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Z)Ljava9/util/stream/Node$OfLong;

    move-result-object p1

    return-object p1
.end method

.method public final filter(Ljava9/util/function/LongPredicate;)Ljava9/util/stream/LongStream;
    .locals 7

    .line 339
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    new-instance v6, Ljava9/util/stream/LongPipeline$8;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    sget v4, Ljava9/util/stream/StreamOpFlag;->NOT_SIZED:I

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/LongPipeline$8;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/LongPredicate;)V

    return-object v6
.end method

.method public final findAny()Ljava9/util/OptionalLong;
    .locals 1

    const/4 v0, 0x0

    .line 518
    invoke-static {v0}, Ljava9/util/stream/FindOps;->makeLong(Z)Ljava9/util/stream/TerminalOp;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/OptionalLong;

    return-object v0
.end method

.method public final findFirst()Ljava9/util/OptionalLong;
    .locals 1

    const/4 v0, 0x1

    .line 513
    invoke-static {v0}, Ljava9/util/stream/FindOps;->makeLong(Z)Ljava9/util/stream/TerminalOp;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/OptionalLong;

    return-object v0
.end method

.method public final flatMap(Ljava9/util/function/LongFunction;)Ljava9/util/stream/LongStream;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/LongFunction<",
            "+",
            "Ljava9/util/stream/LongStream;",
            ">;)",
            "Ljava9/util/stream/LongStream;"
        }
    .end annotation

    .line 272
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    new-instance v6, Ljava9/util/stream/LongPipeline$6;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int/2addr v0, v1

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_SIZED:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/LongPipeline$6;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/LongFunction;)V

    return-object v6
.end method

.method public forEach(Ljava9/util/function/LongConsumer;)V
    .locals 1

    const/4 v0, 0x0

    .line 423
    invoke-static {p1, v0}, Ljava9/util/stream/ForEachOps;->makeLong(Ljava9/util/function/LongConsumer;Z)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    return-void
.end method

.method public forEachOrdered(Ljava9/util/function/LongConsumer;)V
    .locals 1

    const/4 v0, 0x1

    .line 428
    invoke-static {p1, v0}, Ljava9/util/stream/ForEachOps;->makeLong(Ljava9/util/function/LongConsumer;Z)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    return-void
.end method

.method final forEachWithCancel(Ljava9/util/Spliterator;Ljava9/util/stream/Sink;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava9/util/stream/Sink<",
            "Ljava/lang/Long;",
            ">;)Z"
        }
    .end annotation

    .line 153
    invoke-static {p1}, Ljava9/util/stream/LongPipeline;->adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfLong;

    move-result-object p1

    .line 154
    invoke-static {p2}, Ljava9/util/stream/LongPipeline;->adapt(Ljava9/util/stream/Sink;)Ljava9/util/function/LongConsumer;

    move-result-object v0

    .line 156
    :cond_0
    invoke-interface {p2}, Ljava9/util/stream/Sink;->cancellationRequested()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1, v0}, Ljava9/util/Spliterator$OfLong;->tryAdvance(Ljava9/util/function/LongConsumer;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_1
    return v1
.end method

.method final getOutputShape()Ljava9/util/stream/StreamShape;
    .locals 1

    .line 127
    sget-object v0, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 55
    invoke-virtual {p0}, Ljava9/util/stream/LongPipeline;->iterator()Ljava9/util/PrimitiveIterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ljava9/util/PrimitiveIterator$OfLong;
    .locals 1

    .line 183
    invoke-virtual {p0}, Ljava9/util/stream/LongPipeline;->spliterator()Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/Spliterators;->iterator(Ljava9/util/Spliterator$OfLong;)Ljava9/util/PrimitiveIterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method final lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator$OfLong;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Supplier<",
            "+",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Ljava9/util/Spliterator$OfLong;"
        }
    .end annotation

    .line 148
    new-instance v0, Ljava9/util/stream/StreamSpliterators$DelegatingSpliterator$OfLong;

    invoke-direct {v0, p1}, Ljava9/util/stream/StreamSpliterators$DelegatingSpliterator$OfLong;-><init>(Ljava9/util/function/Supplier;)V

    return-object v0
.end method

.method bridge synthetic lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator;
    .locals 0

    .line 55
    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->lazySpliterator(Ljava9/util/function/Supplier;)Ljava9/util/Spliterator$OfLong;

    move-result-object p1

    return-object p1
.end method

.method public final limit(J)Ljava9/util/stream/LongStream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 384
    invoke-static {p0, v0, v1, p1, p2}, Ljava9/util/stream/SliceOps;->makeLong(Ljava9/util/stream/AbstractPipeline;JJ)Ljava9/util/stream/LongStream;

    move-result-object p1

    return-object p1

    .line 383
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
            "Ljava/lang/Long;",
            ">;)",
            "Ljava9/util/stream/Node$Builder<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 162
    invoke-static {p1, p2}, Ljava9/util/stream/Nodes;->longBuilder(J)Ljava9/util/stream/Node$Builder$OfLong;

    move-result-object p1

    return-object p1
.end method

.method public final map(Ljava9/util/function/LongUnaryOperator;)Ljava9/util/stream/LongStream;
    .locals 7

    .line 215
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    new-instance v6, Ljava9/util/stream/LongPipeline$3;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/LongPipeline$3;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/LongUnaryOperator;)V

    return-object v6
.end method

.method public final mapToDouble(Ljava9/util/function/LongToDoubleFunction;)Ljava9/util/stream/DoubleStream;
    .locals 7

    .line 255
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    new-instance v6, Ljava9/util/stream/LongPipeline$5;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/LongPipeline$5;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/LongToDoubleFunction;)V

    return-object v6
.end method

.method public final mapToInt(Ljava9/util/function/LongToIntFunction;)Ljava9/util/stream/IntStream;
    .locals 7

    .line 238
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    new-instance v6, Ljava9/util/stream/LongPipeline$4;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int v4, v0, v1

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/LongPipeline$4;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/LongToIntFunction;)V

    return-object v6
.end method

.method public final mapToObj(Ljava9/util/function/LongFunction;)Ljava9/util/stream/Stream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/LongFunction<",
            "+TU;>;)",
            "Ljava9/util/stream/Stream<",
            "TU;>;"
        }
    .end annotation

    .line 232
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    sget v0, Ljava9/util/stream/StreamOpFlag;->NOT_SORTED:I

    sget v1, Ljava9/util/stream/StreamOpFlag;->NOT_DISTINCT:I

    or-int/2addr v0, v1

    invoke-direct {p0, p1, v0}, Ljava9/util/stream/LongPipeline;->mapToObj(Ljava9/util/function/LongFunction;I)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final max()Ljava9/util/OptionalLong;
    .locals 1

    .line 444
    sget-object v0, Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;->INSTANCE:Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;

    invoke-virtual {p0, v0}, Ljava9/util/stream/LongPipeline;->reduce(Ljava9/util/function/LongBinaryOperator;)Ljava9/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final min()Ljava9/util/OptionalLong;
    .locals 1

    .line 439
    sget-object v0, Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;->INSTANCE:Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;

    invoke-virtual {p0, v0}, Ljava9/util/stream/LongPipeline;->reduce(Ljava9/util/function/LongBinaryOperator;)Ljava9/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final noneMatch(Ljava9/util/function/LongPredicate;)Z
    .locals 1

    .line 508
    sget-object v0, Ljava9/util/stream/MatchOps$MatchKind;->NONE:Ljava9/util/stream/MatchOps$MatchKind;

    invoke-static {p1, v0}, Ljava9/util/stream/MatchOps;->makeLong(Ljava9/util/function/LongPredicate;Ljava9/util/stream/MatchOps$MatchKind;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic parallel()Ljava9/util/stream/LongStream;
    .locals 1

    .line 55
    invoke-super {p0}, Ljava9/util/stream/AbstractPipeline;->parallel()Ljava9/util/stream/BaseStream;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/LongStream;

    return-object v0
.end method

.method public final peek(Ljava9/util/function/LongConsumer;)Ljava9/util/stream/LongStream;
    .locals 7

    .line 362
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    new-instance v6, Ljava9/util/stream/LongPipeline$9;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    const/4 v4, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/LongPipeline$9;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;ILjava9/util/function/LongConsumer;)V

    return-object v6
.end method

.method public final reduce(JLjava9/util/function/LongBinaryOperator;)J
    .locals 0

    .line 476
    invoke-static {p1, p2, p3}, Ljava9/util/stream/ReduceOps;->makeLong(JLjava9/util/function/LongBinaryOperator;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public final reduce(Ljava9/util/function/LongBinaryOperator;)Ljava9/util/OptionalLong;
    .locals 0

    .line 481
    invoke-static {p1}, Ljava9/util/stream/ReduceOps;->makeLong(Ljava9/util/function/LongBinaryOperator;)Ljava9/util/stream/TerminalOp;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava9/util/stream/LongPipeline;->evaluate(Ljava9/util/stream/TerminalOp;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava9/util/OptionalLong;

    return-object p1
.end method

.method public bridge synthetic sequential()Ljava9/util/stream/LongStream;
    .locals 1

    .line 55
    invoke-super {p0}, Ljava9/util/stream/AbstractPipeline;->sequential()Ljava9/util/stream/BaseStream;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/LongStream;

    return-object v0
.end method

.method public final skip(J)Ljava9/util/stream/LongStream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    .line 394
    invoke-static {p0, p1, p2, v0, v1}, Ljava9/util/stream/SliceOps;->makeLong(Ljava9/util/stream/AbstractPipeline;JJ)Ljava9/util/stream/LongStream;

    move-result-object p1

    return-object p1

    .line 390
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Ljava9/util/stream/LongStream;
    .locals 1

    .line 409
    invoke-static {p0}, Ljava9/util/stream/SortedOps;->makeLong(Ljava9/util/stream/AbstractPipeline;)Ljava9/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ljava9/util/Spliterator$OfLong;
    .locals 1

    .line 188
    invoke-super {p0}, Ljava9/util/stream/AbstractPipeline;->spliterator()Ljava9/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/LongPipeline;->adapt(Ljava9/util/Spliterator;)Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava9/util/Spliterator;
    .locals 1

    .line 55
    invoke-virtual {p0}, Ljava9/util/stream/LongPipeline;->spliterator()Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public final sum()J
    .locals 3

    .line 434
    sget-object v0, Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ljava9/util/stream/LongPipeline;->reduce(JLjava9/util/function/LongBinaryOperator;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final summaryStatistics()Ljava9/util/LongSummaryStatistics;
    .locals 3

    .line 470
    sget-object v0, Ljava9/util/stream/Collectors;->LNG_SUM_STATS:Ljava9/util/function/Supplier;

    sget-object v1, Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;->INSTANCE:Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;

    sget-object v2, Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;->INSTANCE:Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;

    invoke-virtual {p0, v0, v1, v2}, Ljava9/util/stream/LongPipeline;->collect(Ljava9/util/function/Supplier;Ljava9/util/function/ObjLongConsumer;Ljava9/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava9/util/LongSummaryStatistics;

    return-object v0
.end method

.method public final takeWhile(Ljava9/util/function/LongPredicate;)Ljava9/util/stream/LongStream;
    .locals 0

    .line 399
    invoke-static {p0, p1}, Ljava9/util/stream/WhileOps;->makeTakeWhileLong(Ljava9/util/stream/AbstractPipeline;Ljava9/util/function/LongPredicate;)Ljava9/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public final toArray()[J
    .locals 1

    .line 523
    sget-object v0, Ljava9/util/stream/WhileOps;->LONG_ARR_GEN:Ljava9/util/function/IntFunction;

    invoke-virtual {p0, v0}, Ljava9/util/stream/LongPipeline;->evaluateToArrayNode(Ljava9/util/function/IntFunction;)Ljava9/util/stream/Node;

    move-result-object v0

    check-cast v0, Ljava9/util/stream/Node$OfLong;

    invoke-static {v0}, Ljava9/util/stream/Nodes;->flattenLong(Ljava9/util/stream/Node$OfLong;)Ljava9/util/stream/Node$OfLong;

    move-result-object v0

    .line 524
    invoke-interface {v0}, Ljava9/util/stream/Node$OfLong;->asPrimitiveArray()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public bridge synthetic unordered()Ljava9/util/stream/BaseStream;
    .locals 1

    .line 55
    invoke-virtual {p0}, Ljava9/util/stream/LongPipeline;->unordered()Ljava9/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public unordered()Ljava9/util/stream/LongStream;
    .locals 3

    .line 326
    invoke-virtual {p0}, Ljava9/util/stream/LongPipeline;->isOrdered()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 329
    :cond_0
    new-instance v0, Ljava9/util/stream/LongPipeline$7;

    sget-object v1, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    sget v2, Ljava9/util/stream/StreamOpFlag;->NOT_ORDERED:I

    invoke-direct {v0, p0, p0, v1, v2}, Ljava9/util/stream/LongPipeline$7;-><init>(Ljava9/util/stream/LongPipeline;Ljava9/util/stream/AbstractPipeline;Ljava9/util/stream/StreamShape;I)V

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
            "Ljava/lang/Long;",
            ">;",
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/Spliterator<",
            "TP_IN;>;>;Z)",
            "Ljava9/util/Spliterator<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 142
    new-instance v0, Ljava9/util/stream/StreamSpliterators$LongWrappingSpliterator;

    invoke-direct {v0, p1, p2, p3}, Ljava9/util/stream/StreamSpliterators$LongWrappingSpliterator;-><init>(Ljava9/util/stream/PipelineHelper;Ljava9/util/function/Supplier;Z)V

    return-object v0
.end method
