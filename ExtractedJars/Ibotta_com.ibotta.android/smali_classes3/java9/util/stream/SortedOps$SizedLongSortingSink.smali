.class final Ljava9/util/stream/SortedOps$SizedLongSortingSink;
.super Ljava9/util/stream/SortedOps$AbstractLongSortingSink;
.source "SortedOps.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/SortedOps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SizedLongSortingSink"
.end annotation


# instance fields
.field private array:[J

.field private offset:I


# direct methods
.method constructor <init>(Ljava9/util/stream/Sink;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/Sink<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 542
    invoke-direct {p0, p1}, Ljava9/util/stream/SortedOps$AbstractLongSortingSink;-><init>(Ljava9/util/stream/Sink;)V

    return-void
.end method


# virtual methods
.method public accept(J)V
    .locals 3

    .line 570
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->array:[J

    iget v1, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->offset:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->offset:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public begin(J)V
    .locals 3

    const-wide/32 v0, 0x7ffffff7

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    long-to-int p2, p1

    .line 549
    new-array p1, p2, [J

    iput-object p1, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->array:[J

    return-void

    .line 548
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public end()V
    .locals 5

    .line 554
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->array:[J

    iget v1, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->offset:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/util/Arrays;->sort([JII)V

    .line 555
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->downstream:Ljava9/util/stream/Sink;

    iget v1, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->offset:I

    int-to-long v3, v1

    invoke-interface {v0, v3, v4}, Ljava9/util/stream/Sink;->begin(J)V

    .line 556
    iget-boolean v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->cancellationRequestedCalled:Z

    if-nez v0, :cond_0

    .line 557
    :goto_0
    iget v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->offset:I

    if-ge v2, v0, :cond_1

    .line 558
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->downstream:Ljava9/util/stream/Sink;

    iget-object v1, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->array:[J

    aget-wide v3, v1, v2

    invoke-interface {v0, v3, v4}, Ljava9/util/stream/Sink;->accept(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 561
    :cond_0
    :goto_1
    iget v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->offset:I

    if-ge v2, v0, :cond_1

    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->downstream:Ljava9/util/stream/Sink;

    invoke-interface {v0}, Ljava9/util/stream/Sink;->cancellationRequested()Z

    move-result v0

    if-nez v0, :cond_1

    .line 562
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->downstream:Ljava9/util/stream/Sink;

    iget-object v1, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->array:[J

    aget-wide v3, v1, v2

    invoke-interface {v0, v3, v4}, Ljava9/util/stream/Sink;->accept(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 564
    :cond_1
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->downstream:Ljava9/util/stream/Sink;

    invoke-interface {v0}, Ljava9/util/stream/Sink;->end()V

    const/4 v0, 0x0

    .line 565
    iput-object v0, p0, Ljava9/util/stream/SortedOps$SizedLongSortingSink;->array:[J

    return-void
.end method
