.class public final Ljava9/util/J8Arrays;
.super Ljava/lang/Object;
.source "J8Arrays.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/J8Arrays$NaturalOrder;
    }
.end annotation


# direct methods
.method public static parallelSort([D)V
    .locals 11

    .line 824
    array-length v5, p0

    const/4 v0, 0x1

    const/16 v1, 0x2000

    if-le v5, v1, :cond_2

    .line 826
    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->getCommonPoolParallelism()I

    move-result v3

    if-ne v3, v0, :cond_0

    goto :goto_1

    .line 829
    :cond_0
    new-instance v8, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;

    const/4 v4, 0x0

    new-array v6, v5, [D

    const/4 v7, 0x0

    const/4 v9, 0x0

    shl-int/lit8 v0, v3, 0x2

    div-int v0, v5, v0

    if-gt v0, v1, :cond_1

    const/16 v10, 0x2000

    goto :goto_0

    :cond_1
    move v10, v0

    :goto_0
    move-object v0, v8

    move-object v1, v4

    move-object v2, p0

    move-object v3, v6

    move v4, v7

    move v6, v9

    move v7, v10

    invoke-direct/range {v0 .. v7}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;-><init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIII)V

    .line 832
    invoke-virtual {v8}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x0

    add-int/lit8 v3, v5, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    .line 827
    invoke-static/range {v0 .. v5}, Ljava9/util/DualPivotQuicksort;->sort([DII[DII)V

    :goto_2
    return-void
.end method

.method public static parallelSort([I)V
    .locals 11

    .line 590
    array-length v5, p0

    const/4 v0, 0x1

    const/16 v1, 0x2000

    if-le v5, v1, :cond_2

    .line 592
    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->getCommonPoolParallelism()I

    move-result v3

    if-ne v3, v0, :cond_0

    goto :goto_1

    .line 595
    :cond_0
    new-instance v8, Ljava9/util/ArraysParallelSortHelpers$FJInt$Sorter;

    const/4 v4, 0x0

    new-array v6, v5, [I

    const/4 v7, 0x0

    const/4 v9, 0x0

    shl-int/lit8 v0, v3, 0x2

    div-int v0, v5, v0

    if-gt v0, v1, :cond_1

    const/16 v10, 0x2000

    goto :goto_0

    :cond_1
    move v10, v0

    :goto_0
    move-object v0, v8

    move-object v1, v4

    move-object v2, p0

    move-object v3, v6

    move v4, v7

    move v6, v9

    move v7, v10

    invoke-direct/range {v0 .. v7}, Ljava9/util/ArraysParallelSortHelpers$FJInt$Sorter;-><init>(Ljava9/util/concurrent/CountedCompleter;[I[IIIII)V

    .line 598
    invoke-virtual {v8}, Ljava9/util/ArraysParallelSortHelpers$FJInt$Sorter;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x0

    add-int/lit8 v3, v5, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    .line 593
    invoke-static/range {v0 .. v5}, Ljava9/util/DualPivotQuicksort;->sort([III[III)V

    :goto_2
    return-void
.end method

.method public static parallelSort([J)V
    .locals 11

    .line 660
    array-length v5, p0

    const/4 v0, 0x1

    const/16 v1, 0x2000

    if-le v5, v1, :cond_2

    .line 662
    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->getCommonPoolParallelism()I

    move-result v3

    if-ne v3, v0, :cond_0

    goto :goto_1

    .line 665
    :cond_0
    new-instance v8, Ljava9/util/ArraysParallelSortHelpers$FJLong$Sorter;

    const/4 v4, 0x0

    new-array v6, v5, [J

    const/4 v7, 0x0

    const/4 v9, 0x0

    shl-int/lit8 v0, v3, 0x2

    div-int v0, v5, v0

    if-gt v0, v1, :cond_1

    const/16 v10, 0x2000

    goto :goto_0

    :cond_1
    move v10, v0

    :goto_0
    move-object v0, v8

    move-object v1, v4

    move-object v2, p0

    move-object v3, v6

    move v4, v7

    move v6, v9

    move v7, v10

    invoke-direct/range {v0 .. v7}, Ljava9/util/ArraysParallelSortHelpers$FJLong$Sorter;-><init>(Ljava9/util/concurrent/CountedCompleter;[J[JIIII)V

    .line 668
    invoke-virtual {v8}, Ljava9/util/ArraysParallelSortHelpers$FJLong$Sorter;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x0

    add-int/lit8 v3, v5, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    .line 663
    invoke-static/range {v0 .. v5}, Ljava9/util/DualPivotQuicksort;->sort([JII[JII)V

    :goto_2
    return-void
.end method

.method public static parallelSort([Ljava/lang/Object;Ljava/util/Comparator;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/util/Comparator<",
            "-TT;>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1026
    sget-object p1, Ljava9/util/J8Arrays$NaturalOrder;->INSTANCE:Ljava9/util/J8Arrays$NaturalOrder;

    .line 1027
    :cond_0
    array-length v5, p0

    const/16 v0, 0x2000

    if-le v5, v0, :cond_3

    .line 1029
    invoke-static {}, Ljava9/util/concurrent/ForkJoinPool;->getCommonPoolParallelism()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 1032
    :cond_1
    new-instance v9, Ljava9/util/ArraysParallelSortHelpers$FJObject$Sorter;

    const/4 v2, 0x0

    .line 1034
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v6, 0x0

    shl-int/lit8 v1, v1, 0x2

    div-int v1, v5, v1

    if-gt v1, v0, :cond_2

    const/16 v7, 0x2000

    goto :goto_0

    :cond_2
    move v7, v1

    :goto_0
    move-object v0, v9

    move-object v1, v2

    move-object v2, p0

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Ljava9/util/ArraysParallelSortHelpers$FJObject$Sorter;-><init>(Ljava9/util/concurrent/CountedCompleter;[Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/util/Comparator;)V

    .line 1036
    invoke-virtual {v9}, Ljava9/util/ArraysParallelSortHelpers$FJObject$Sorter;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v2, v5

    move-object v3, p1

    move v5, v6

    move v6, v7

    .line 1030
    invoke-static/range {v0 .. v6}, Ljava9/util/TimSort;->sort([Ljava/lang/Object;IILjava/util/Comparator;[Ljava/lang/Object;II)V

    :goto_2
    return-void
.end method

.method public static spliterator([DII)Ljava9/util/Spliterator$OfDouble;
    .locals 1

    const/16 v0, 0x410

    .line 205
    invoke-static {p0, p1, p2, v0}, Ljava9/util/Spliterators;->spliterator([DIII)Ljava9/util/Spliterator$OfDouble;

    move-result-object p0

    return-object p0
.end method

.method public static spliterator([III)Ljava9/util/Spliterator$OfInt;
    .locals 1

    const/16 v0, 0x410

    .line 126
    invoke-static {p0, p1, p2, v0}, Ljava9/util/Spliterators;->spliterator([IIII)Ljava9/util/Spliterator$OfInt;

    move-result-object p0

    return-object p0
.end method

.method public static spliterator([JII)Ljava9/util/Spliterator$OfLong;
    .locals 1

    const/16 v0, 0x410

    .line 165
    invoke-static {p0, p1, p2, v0}, Ljava9/util/Spliterators;->spliterator([JIII)Ljava9/util/Spliterator$OfLong;

    move-result-object p0

    return-object p0
.end method

.method public static spliterator([Ljava/lang/Object;II)Ljava9/util/Spliterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;II)",
            "Ljava9/util/Spliterator<",
            "TT;>;"
        }
    .end annotation

    const/16 v0, 0x410

    .line 87
    invoke-static {p0, p1, p2, v0}, Ljava9/util/Spliterators;->spliterator([Ljava/lang/Object;III)Ljava9/util/Spliterator;

    move-result-object p0

    return-object p0
.end method

.method public static stream([D)Ljava9/util/stream/DoubleStream;
    .locals 2

    .line 309
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Ljava9/util/J8Arrays;->stream([DII)Ljava9/util/stream/DoubleStream;

    move-result-object p0

    return-object p0
.end method

.method public static stream([DII)Ljava9/util/stream/DoubleStream;
    .locals 0

    .line 327
    invoke-static {p0, p1, p2}, Ljava9/util/J8Arrays;->spliterator([DII)Ljava9/util/Spliterator$OfDouble;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ljava9/util/stream/StreamSupport;->doubleStream(Ljava9/util/Spliterator$OfDouble;Z)Ljava9/util/stream/DoubleStream;

    move-result-object p0

    return-object p0
.end method

.method public static stream([I)Ljava9/util/stream/IntStream;
    .locals 2

    .line 249
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Ljava9/util/J8Arrays;->stream([III)Ljava9/util/stream/IntStream;

    move-result-object p0

    return-object p0
.end method

.method public static stream([III)Ljava9/util/stream/IntStream;
    .locals 0

    .line 267
    invoke-static {p0, p1, p2}, Ljava9/util/J8Arrays;->spliterator([III)Ljava9/util/Spliterator$OfInt;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ljava9/util/stream/StreamSupport;->intStream(Ljava9/util/Spliterator$OfInt;Z)Ljava9/util/stream/IntStream;

    move-result-object p0

    return-object p0
.end method

.method public static stream([J)Ljava9/util/stream/LongStream;
    .locals 2

    .line 279
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Ljava9/util/J8Arrays;->stream([JII)Ljava9/util/stream/LongStream;

    move-result-object p0

    return-object p0
.end method

.method public static stream([JII)Ljava9/util/stream/LongStream;
    .locals 0

    .line 297
    invoke-static {p0, p1, p2}, Ljava9/util/J8Arrays;->spliterator([JII)Ljava9/util/Spliterator$OfLong;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ljava9/util/stream/StreamSupport;->longStream(Ljava9/util/Spliterator$OfLong;Z)Ljava9/util/stream/LongStream;

    move-result-object p0

    return-object p0
.end method

.method public static stream([Ljava/lang/Object;)Ljava9/util/stream/Stream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 218
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Ljava9/util/J8Arrays;->stream([Ljava/lang/Object;II)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method

.method public static stream([Ljava/lang/Object;II)Ljava9/util/stream/Stream;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;II)",
            "Ljava9/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation

    .line 237
    invoke-static {p0, p1, p2}, Ljava9/util/J8Arrays;->spliterator([Ljava/lang/Object;II)Ljava9/util/Spliterator;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava9/util/Spliterator;Z)Ljava9/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method
