.class public final synthetic Ljava9/util/Spliterator$OfPrimitive$-CC;
.super Ljava/lang/Object;
.source "Spliterator.java"


# direct methods
.method public static $default$forEachRemaining(Ljava9/util/Spliterator$OfPrimitive;Ljava/lang/Object;)V
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfPrimitive;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_CONS;)V"
        }
    .end annotation

    .line 650
    :cond_0
    invoke-interface {p0, p1}, Ljava9/util/Spliterator$OfPrimitive;->tryAdvance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public static synthetic $default$trySplit(Ljava9/util/Spliterator$OfPrimitive;)Ljava9/util/Spliterator;
    .locals 1
    .param p0, "-this"    # Ljava9/util/Spliterator$OfPrimitive;

    .line 615
    invoke-interface {p0}, Ljava9/util/Spliterator$OfPrimitive;->trySplit()Ljava9/util/Spliterator$OfPrimitive;

    move-result-object v0

    return-object v0
.end method
