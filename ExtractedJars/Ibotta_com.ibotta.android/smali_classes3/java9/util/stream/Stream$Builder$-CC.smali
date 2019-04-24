.class public final synthetic Ljava9/util/stream/Stream$Builder$-CC;
.super Ljava/lang/Object;
.source "Stream.java"


# direct methods
.method public static $default$add(Ljava9/util/stream/Stream$Builder;Ljava/lang/Object;)Ljava9/util/stream/Stream$Builder;
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/Stream$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava9/util/stream/Stream$Builder<",
            "TT;>;"
        }
    .end annotation

    .line 1441
    invoke-interface {p0, p1}, Ljava9/util/stream/Stream$Builder;->accept(Ljava/lang/Object;)V

    return-object p0
.end method
