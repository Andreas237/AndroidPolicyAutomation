.class public final synthetic Ljava9/util/stream/Stream$-CC;
.super Ljava/lang/Object;
.source "Stream.java"


# direct methods
.method public static $default$dropWhile(Ljava9/util/stream/Stream;Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;
    .locals 3
    .param p0, "-this"    # Ljava9/util/stream/Stream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 630
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    new-instance v0, Ljava9/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Dropping;

    .line 634
    invoke-interface {p0}, Ljava9/util/stream/Stream;->spliterator()Ljava9/util/Spliterator;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p1}, Ljava9/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Dropping;-><init>(Ljava9/util/Spliterator;ZLjava9/util/function/Predicate;)V

    .line 635
    invoke-interface {p0}, Ljava9/util/stream/Stream;->isParallel()Z

    move-result p1

    .line 633
    invoke-static {v0, p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 635
    invoke-static {p0}, Ljava9/util/stream/StreamSupport;->closeHandler(Ljava9/util/stream/BaseStream;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->onClose(Ljava/lang/Runnable;)Ljava9/util/stream/BaseStream;

    move-result-object p1

    check-cast p1, Ljava9/util/stream/Stream;

    return-object p1
.end method

.method public static $default$takeWhile(Ljava9/util/stream/Stream;Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;
    .locals 3
    .param p0, "-this"    # Ljava9/util/stream/Stream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 564
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    new-instance v0, Ljava9/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Taking;

    .line 568
    invoke-interface {p0}, Ljava9/util/stream/Stream;->spliterator()Ljava9/util/Spliterator;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p1}, Ljava9/util/stream/WhileOps$UnorderedWhileSpliterator$OfRef$Taking;-><init>(Ljava9/util/Spliterator;ZLjava9/util/function/Predicate;)V

    .line 569
    invoke-interface {p0}, Ljava9/util/stream/Stream;->isParallel()Z

    move-result p1

    .line 567
    invoke-static {v0, p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 569
    invoke-static {p0}, Ljava9/util/stream/StreamSupport;->closeHandler(Ljava9/util/stream/BaseStream;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->onClose(Ljava/lang/Runnable;)Ljava9/util/stream/BaseStream;

    move-result-object p1

    check-cast p1, Ljava9/util/stream/Stream;

    return-object p1
.end method

.method public static builder()Ljava9/util/stream/Stream$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/stream/Stream$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1148
    new-instance v0, Ljava9/util/stream/Streams$StreamBuilderImpl;

    invoke-direct {v0}, Ljava9/util/stream/Streams$StreamBuilderImpl;-><init>()V

    return-object v0
.end method

.method public static concat(Ljava9/util/stream/Stream;Ljava9/util/stream/Stream;)Ljava9/util/stream/Stream;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/Stream<",
            "+TT;>;",
            "Ljava9/util/stream/Stream<",
            "+TT;>;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 1387
    invoke-static {p0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1388
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1391
    new-instance v0, Ljava9/util/stream/Streams$ConcatSpliterator$OfRef;

    .line 1392
    invoke-interface {p0}, Ljava9/util/stream/Stream;->spliterator()Ljava9/util/Spliterator;

    move-result-object v1

    invoke-interface {p1}, Ljava9/util/stream/Stream;->spliterator()Ljava9/util/Spliterator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava9/util/stream/Streams$ConcatSpliterator$OfRef;-><init>(Ljava9/util/Spliterator;Ljava9/util/Spliterator;)V

    .line 1393
    invoke-interface {p0}, Ljava9/util/stream/Stream;->isParallel()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1}, Ljava9/util/stream/Stream;->isParallel()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v0, v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 1394
    invoke-static {p0, p1}, Ljava9/util/stream/Streams;->composedClose(Ljava9/util/stream/BaseStream;Ljava9/util/stream/BaseStream;)Ljava/lang/Runnable;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava9/util/stream/Stream;->onClose(Ljava/lang/Runnable;)Ljava9/util/stream/BaseStream;

    move-result-object p0

    check-cast p0, Ljava9/util/stream/Stream;

    return-object p0
.end method

.method public static empty()Ljava9/util/stream/Stream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 1158
    invoke-static {}, Ljava9/util/Spliterators;->emptySpliterator()Ljava9/util/Spliterator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public static generate(Ljava9/util/function/Supplier;)Ljava9/util/stream/Stream;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Supplier<",
            "+TT;>;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 1345
    invoke-static {p0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1346
    new-instance v0, Ljava9/util/stream/StreamSpliterators$InfiniteSupplyingSpliterator$OfRef;

    const-wide v1, 0x7fffffffffffffffL

    invoke-direct {v0, v1, v2, p0}, Ljava9/util/stream/StreamSpliterators$InfiniteSupplyingSpliterator$OfRef;-><init>(JLjava9/util/function/Supplier;)V

    const/4 p0, 0x0

    invoke-static {v0, p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method

.method public static iterate(Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/UnaryOperator;)Ljava9/util/stream/Stream;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:TT;>(TS;",
            "Ljava9/util/function/Predicate<",
            "TS;>;",
            "Ljava9/util/function/UnaryOperator<",
            "TS;>;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 1287
    invoke-static {p2}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1288
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1289
    new-instance v7, Ljava9/util/stream/Stream$2;

    const-wide v1, 0x7fffffffffffffffL

    const/16 v3, 0x410

    move-object v0, v7

    move-object v4, p2

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ljava9/util/stream/Stream$2;-><init>(JILjava9/util/function/UnaryOperator;Ljava/lang/Object;Ljava9/util/function/Predicate;)V

    const/4 p0, 0x0

    .line 1331
    invoke-static {v7, p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method

.method public static iterate(Ljava/lang/Object;Ljava9/util/function/UnaryOperator;)Ljava9/util/stream/Stream;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:TT;>(TS;",
            "Ljava9/util/function/UnaryOperator<",
            "TS;>;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 1224
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1225
    new-instance v6, Ljava9/util/stream/Stream$1;

    const-wide v1, 0x7fffffffffffffffL

    const/16 v3, 0x410

    move-object v0, v6

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/Stream$1;-><init>(JILjava9/util/function/UnaryOperator;Ljava/lang/Object;)V

    const/4 p0, 0x0

    .line 1244
    invoke-static {v6, p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;)Ljava9/util/stream/Stream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 1169
    new-instance v0, Ljava9/util/stream/Streams$StreamBuilderImpl;

    invoke-direct {v0, p0}, Ljava9/util/stream/Streams$StreamBuilderImpl;-><init>(Ljava/lang/Object;)V

    const/4 p0, 0x0

    invoke-static {v0, p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of([Ljava/lang/Object;)Ljava9/util/stream/Stream;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 1196
    invoke-static {p0}, Ljava9/util/J8Arrays;->stream([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method

.method public static ofNullable(Ljava/lang/Object;)Ljava9/util/stream/Stream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 1183
    invoke-static {}, Ljava9/util/stream/Stream$-CC;->empty()Ljava9/util/stream/Stream;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava9/util/stream/Streams$StreamBuilderImpl;

    invoke-direct {v0, p0}, Ljava9/util/stream/Streams$StreamBuilderImpl;-><init>(Ljava/lang/Object;)V

    const/4 p0, 0x0

    .line 1184
    invoke-static {v0, p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p0

    :goto_0
    return-object p0
.end method
