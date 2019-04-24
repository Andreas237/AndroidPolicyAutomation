.class public final synthetic Ljava9/util/stream/Node$OfPrimitive$-CC;
.super Ljava/lang/Object;
.source "Node.java"


# direct methods
.method public static $default$asArray(Ljava9/util/stream/Node$OfPrimitive;Ljava9/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 5
    .param p0, "-this"    # Ljava9/util/stream/Node$OfPrimitive;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/IntFunction<",
            "[TT;>;)[TT;"
        }
    .end annotation

    .line 267
    invoke-interface {p0}, Ljava9/util/stream/Node$OfPrimitive;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    .line 270
    invoke-interface {p0}, Ljava9/util/stream/Node$OfPrimitive;->count()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-interface {p1, v1}, Ljava9/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 271
    invoke-interface {p0, p1, v0}, Ljava9/util/stream/Node$OfPrimitive;->copyInto([Ljava/lang/Object;I)V

    return-object p1

    .line 269
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static $default$getChild(Ljava9/util/stream/Node$OfPrimitive;I)Ljava9/util/stream/Node$OfPrimitive;
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Node$OfPrimitive;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT_NODE;"
        }
    .end annotation

    .line 252
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public static synthetic $default$getChild(Ljava9/util/stream/Node$OfPrimitive;I)Ljava9/util/stream/Node;
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Node$OfPrimitive;

    .line 227
    invoke-interface {p0, p1}, Ljava9/util/stream/Node$OfPrimitive;->getChild(I)Ljava9/util/stream/Node$OfPrimitive;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic $default$spliterator(Ljava9/util/stream/Node$OfPrimitive;)Ljava9/util/Spliterator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/stream/Node$OfPrimitive;

    .line 227
    invoke-interface {p0}, Ljava9/util/stream/Node$OfPrimitive;->spliterator()Ljava9/util/Spliterator$OfPrimitive;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $default$truncate(Ljava9/util/stream/Node$OfPrimitive;JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node;
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Node$OfPrimitive;

    .line 227
    invoke-interface/range {p0 .. p5}, Ljava9/util/stream/Node$OfPrimitive;->truncate(JJLjava9/util/function/IntFunction;)Ljava9/util/stream/Node$OfPrimitive;

    move-result-object p1

    return-object p1
.end method
