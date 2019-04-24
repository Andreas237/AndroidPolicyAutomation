.class public abstract Ljava9/util/Spliterators$AbstractDoubleSpliterator;
.super Ljava/lang/Object;
.source "Spliterators.java"

# interfaces
.implements Ljava9/util/Spliterator$OfDouble;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/Spliterators;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractDoubleSpliterator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/Spliterators$AbstractDoubleSpliterator$HoldingDoubleConsumer;
    }
.end annotation


# instance fields
.field private batch:I

.field private final characteristics:I

.field private est:J


# direct methods
.method protected constructor <init>(JI)V
    .locals 0

    .line 1929
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1930
    iput-wide p1, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->est:J

    and-int/lit8 p1, p3, 0x40

    if-eqz p1, :cond_0

    or-int/lit16 p3, p3, 0x4000

    .line 1931
    :cond_0
    iput p3, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->characteristics:I

    return-void
.end method


# virtual methods
.method public characteristics()I
    .locals 1

    .line 1993
    iget v0, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->characteristics:I

    return v0
.end method

.method public estimateSize()J
    .locals 2

    .line 1981
    iget-wide v0, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->est:J

    return-wide v0
.end method

.method public bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/Spliterator$OfDouble$-CC;->$default$forEachRemaining(Ljava9/util/Spliterator$OfDouble;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava9/util/function/Consumer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/Spliterator$OfDouble$-CC;->$default$forEachRemaining(Ljava9/util/Spliterator$OfDouble;Ljava9/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava9/util/function/DoubleConsumer;)V
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/Spliterator$OfDouble$-CC;->$default$forEachRemaining(Ljava9/util/Spliterator$OfDouble;Ljava9/util/function/DoubleConsumer;)V

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

    invoke-static {p0, p1}, Ljava9/util/Spliterator$OfDouble$-CC;->$default$tryAdvance(Ljava9/util/Spliterator$OfDouble;Ljava/lang/Object;)Z

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
            "Ljava/lang/Double;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/Spliterator$OfDouble$-CC;->$default$tryAdvance(Ljava9/util/Spliterator$OfDouble;Ljava9/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public trySplit()Ljava9/util/Spliterator$OfDouble;
    .locals 8

    .line 1952
    new-instance v0, Ljava9/util/Spliterators$AbstractDoubleSpliterator$HoldingDoubleConsumer;

    invoke-direct {v0}, Ljava9/util/Spliterators$AbstractDoubleSpliterator$HoldingDoubleConsumer;-><init>()V

    .line 1953
    iget-wide v1, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->est:J

    const-wide/16 v3, 0x1

    cmp-long v5, v1, v3

    if-lez v5, :cond_5

    .line 1954
    invoke-virtual {p0, v0}, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->tryAdvance(Ljava9/util/function/DoubleConsumer;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 1955
    iget v3, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->batch:I

    add-int/lit16 v3, v3, 0x400

    int-to-long v4, v3

    cmp-long v6, v4, v1

    if-lez v6, :cond_0

    long-to-int v3, v1

    :cond_0
    const/high16 v1, 0x2000000

    if-le v3, v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    .line 1960
    :goto_0
    new-array v2, v1, [D

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1962
    :cond_2
    iget-wide v5, v0, Ljava9/util/Spliterators$AbstractDoubleSpliterator$HoldingDoubleConsumer;->value:D

    aput-wide v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v1, :cond_3

    invoke-virtual {p0, v0}, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->tryAdvance(Ljava9/util/function/DoubleConsumer;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 1963
    :cond_3
    iput v4, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->batch:I

    .line 1964
    iget-wide v0, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->est:J

    const-wide v5, 0x7fffffffffffffffL

    cmp-long v7, v0, v5

    if-eqz v7, :cond_4

    int-to-long v5, v4

    sub-long/2addr v0, v5

    .line 1965
    iput-wide v0, p0, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->est:J

    .line 1966
    :cond_4
    new-instance v0, Ljava9/util/Spliterators$DoubleArraySpliterator;

    invoke-virtual {p0}, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->characteristics()I

    move-result v1

    invoke-direct {v0, v2, v3, v4, v1}, Ljava9/util/Spliterators$DoubleArraySpliterator;-><init>([DIII)V

    return-object v0

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic trySplit()Ljava9/util/Spliterator$OfPrimitive;
    .locals 1

    .line 1912
    invoke-virtual {p0}, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->trySplit()Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic trySplit()Ljava9/util/Spliterator;
    .locals 1

    .line 1912
    invoke-virtual {p0}, Ljava9/util/Spliterators$AbstractDoubleSpliterator;->trySplit()Ljava9/util/Spliterator$OfDouble;

    move-result-object v0

    return-object v0
.end method
