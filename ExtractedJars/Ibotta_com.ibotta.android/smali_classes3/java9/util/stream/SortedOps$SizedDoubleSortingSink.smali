.class final Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;
.super Ljava9/util/stream/SortedOps$AbstractDoubleSortingSink;
.source "SortedOps.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/SortedOps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SizedDoubleSortingSink"
.end annotation


# instance fields
.field private array:[D

.field private offset:I


# direct methods
.method constructor <init>(Ljava9/util/stream/Sink;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/Sink<",
            "-",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .line 641
    invoke-direct {p0, p1}, Ljava9/util/stream/SortedOps$AbstractDoubleSortingSink;-><init>(Ljava9/util/stream/Sink;)V

    return-void
.end method


# virtual methods
.method public accept(D)V
    .locals 3

    .line 669
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->array:[D

    iget v1, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->offset:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->offset:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public begin(J)V
    .locals 3

    const-wide/32 v0, 0x7ffffff7

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    long-to-int p2, p1

    .line 648
    new-array p1, p2, [D

    iput-object p1, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->array:[D

    return-void

    .line 647
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public end()V
    .locals 5

    .line 653
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->array:[D

    iget v1, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->offset:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/util/Arrays;->sort([DII)V

    .line 654
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->downstream:Ljava9/util/stream/Sink;

    iget v1, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->offset:I

    int-to-long v3, v1

    invoke-interface {v0, v3, v4}, Ljava9/util/stream/Sink;->begin(J)V

    .line 655
    iget-boolean v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->cancellationRequestedCalled:Z

    if-nez v0, :cond_0

    .line 656
    :goto_0
    iget v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->offset:I

    if-ge v2, v0, :cond_1

    .line 657
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->downstream:Ljava9/util/stream/Sink;

    iget-object v1, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->array:[D

    aget-wide v3, v1, v2

    invoke-interface {v0, v3, v4}, Ljava9/util/stream/Sink;->accept(D)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 660
    :cond_0
    :goto_1
    iget v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->offset:I

    if-ge v2, v0, :cond_1

    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->downstream:Ljava9/util/stream/Sink;

    invoke-interface {v0}, Ljava9/util/stream/Sink;->cancellationRequested()Z

    move-result v0

    if-nez v0, :cond_1

    .line 661
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->downstream:Ljava9/util/stream/Sink;

    iget-object v1, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->array:[D

    aget-wide v3, v1, v2

    invoke-interface {v0, v3, v4}, Ljava9/util/stream/Sink;->accept(D)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 663
    :cond_1
    iget-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->downstream:Ljava9/util/stream/Sink;

    invoke-interface {v0}, Ljava9/util/stream/Sink;->end()V

    const/4 v0, 0x0

    .line 664
    iput-object v0, p0, Ljava9/util/stream/SortedOps$SizedDoubleSortingSink;->array:[D

    return-void
.end method
