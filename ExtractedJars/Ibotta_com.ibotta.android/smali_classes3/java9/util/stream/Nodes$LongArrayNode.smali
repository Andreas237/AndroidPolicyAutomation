.class Ljava9/util/stream/Nodes$LongArrayNode;
.super Ljava/lang/Object;
.source "Nodes.java"

# interfaces
.implements Ljava9/util/stream/Node$OfLong;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/Nodes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LongArrayNode"
.end annotation


# instance fields
.field final array:[J

.field curSize:I


# direct methods
.method constructor <init>(J)V
    .locals 3

    .line 1369
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x7ffffff7

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    long-to-int p2, p1

    .line 1372
    new-array p1, p2, [J

    iput-object p1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    const/4 p1, 0x0

    .line 1373
    iput p1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    return-void

    .line 1371
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>([J)V
    .locals 0

    .line 1376
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1377
    iput-object p1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    .line 1378
    array-length p1, p1

    iput p1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    return-void
.end method


# virtual methods
.method public synthetic asArray(Ljava9/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/IntFunction<",
            "[TT;>;)[TT;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/stream/Node$OfPrimitive$-CC;->$default$asArray(Ljava9/util/stream/Node$OfPrimitive;Ljava9/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic asPrimitiveArray()Ljava/lang/Object;
    .locals 1

    .line 1365
    invoke-virtual {p0}, Ljava9/util/stream/Nodes$LongArrayNode;->asPrimitiveArray()[J

    move-result-object v0

    return-object v0
.end method

.method public asPrimitiveArray()[J
    .locals 3

    .line 1388
    iget-object v0, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    array-length v1, v0

    iget v2, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    if-ne v1, v2, :cond_0

    return-object v0

    .line 1391
    :cond_0
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic copyInto(Ljava/lang/Object;I)V
    .locals 0

    .line 1365
    check-cast p1, [J

    invoke-virtual {p0, p1, p2}, Ljava9/util/stream/Nodes$LongArrayNode;->copyInto([JI)V

    return-void
.end method

.method public copyInto([JI)V
    .locals 3

    .line 1397
    iget-object v0, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    iget v1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public synthetic copyInto([Ljava/lang/Long;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ljava9/util/stream/Node$OfLong$-CC;->$default$copyInto(Ljava9/util/stream/Node$OfLong;[Ljava/lang/Long;I)V

    return-void
.end method

.method public bridge synthetic copyInto([Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ljava9/util/stream/Node$OfLong$-CC;->$default$copyInto(Ljava9/util/stream/Node$OfLong;[Ljava/lang/Object;I)V

    return-void
.end method

.method public count()J
    .locals 2

    .line 1402
    iget v0, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public bridge synthetic forEach(Ljava/lang/Object;)V
    .locals 0

    .line 1365
    check-cast p1, Ljava9/util/function/LongConsumer;

    invoke-virtual {p0, p1}, Ljava9/util/stream/Nodes$LongArrayNode;->forEach(Ljava9/util/function/LongConsumer;)V

    return-void
.end method

.method public synthetic forEach(Ljava9/util/function/Consumer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/stream/Node$OfLong$-CC;->$default$forEach(Ljava9/util/stream/Node$OfLong;Ljava9/util/function/Consumer;)V

    return-void
.end method

.method public forEach(Ljava9/util/function/LongConsumer;)V
    .locals 4

    const/4 v0, 0x0

    .line 1407
    :goto_0
    iget v1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    if-ge v0, v1, :cond_0

    .line 1408
    iget-object v1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    aget-wide v2, v1, v0

    invoke-interface {p1, v2, v3}, Ljava9/util/function/LongConsumer;->accept(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic getChild(I)Ljava9/util/stream/Node$OfPrimitive;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT_NODE;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/stream/Node$OfPrimitive$-CC;->$default$getChild(Ljava9/util/stream/Node$OfPrimitive;I)Ljava9/util/stream/Node$OfPrimitive;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChild(I)Ljava9/util/stream/Node;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Node$OfPrimitive$-CC;->$default$getChild(Ljava9/util/stream/Node$OfPrimitive;I)Ljava9/util/stream/Node;

    move-result-object p1

    return-object p1
.end method

.method public synthetic getChildCount()I
    .locals 1

    invoke-static {p0}, Ljava9/util/stream/Node$-CC;->$default$getChildCount(Ljava9/util/stream/Node;)I

    move-result v0

    return v0
.end method

.method public synthetic getShape()Ljava9/util/stream/StreamShape;
    .locals 1

    invoke-static {p0}, Ljava9/util/stream/Node$OfLong$-CC;->$default$getShape(Ljava9/util/stream/Node$OfLong;)Ljava9/util/stream/StreamShape;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newArray(I)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Node$OfLong$-CC;->$default$newArray(Ljava9/util/stream/Node$OfLong;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic newArray(I)[J
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/stream/Node$OfLong$-CC;->$default$newArray(Ljava9/util/stream/Node$OfLong;I)[J

    move-result-object p1

    return-object p1
.end method

.method public spliterator()Ljava9/util/Spliterator$OfLong;
    .locals 3

    .line 1383
    iget-object v0, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    iget v1, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava9/util/J8Arrays;->spliterator([JII)Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava9/util/Spliterator$OfPrimitive;
    .locals 1

    .line 1365
    invoke-virtual {p0}, Ljava9/util/stream/Nodes$LongArrayNode;->spliterator()Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Ljava9/util/Spliterator;
    .locals 1

    .line 1365
    invoke-virtual {p0}, Ljava9/util/stream/Nodes$LongArrayNode;->spliterator()Ljava9/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "LongArrayNode[%d][%s]"

    const/4 v1, 0x2

    .line 1414
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    array-length v2, v2

    iget v3, p0, Ljava9/util/stream/Nodes$LongArrayNode;->curSize:I

    sub-int/2addr v2, v3

    .line 1415
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Ljava9/util/stream/Nodes$LongArrayNode;->array:[J

    invoke-static {v2}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 1414
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic truncate(JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$OfLong;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava9/util/function/IntFunction<",
            "[",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava9/util/stream/Node$OfLong;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, Ljava9/util/stream/Node$OfLong$-CC;->$default$truncate(Ljava9/util/stream/Node$OfLong;JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$OfLong;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic truncate(JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$OfPrimitive;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljava9/util/stream/Node$OfLong$-CC;->$default$truncate(Ljava9/util/stream/Node$OfLong;JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$OfPrimitive;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic truncate(JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljava9/util/stream/Node$OfLong$-CC;->$default$truncate(Ljava9/util/stream/Node$OfLong;JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;

    move-result-object p1

    return-object p1
.end method
