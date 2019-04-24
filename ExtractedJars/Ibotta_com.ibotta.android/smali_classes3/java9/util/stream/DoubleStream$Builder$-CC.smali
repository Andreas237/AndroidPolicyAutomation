.class public final synthetic Ljava9/util/stream/DoubleStream$Builder$-CC;
.super Ljava/lang/Object;
.source "DoubleStream.java"


# direct methods
.method public static $default$add(Ljava9/util/stream/DoubleStream$Builder;D)Ljava9/util/stream/DoubleStream$Builder;
    .locals 0
    .param p0, "-this"    # Ljava9/util/stream/DoubleStream$Builder;

    .line 1170
    invoke-interface {p0, p1, p2}, Ljava9/util/stream/DoubleStream$Builder;->accept(D)V

    return-object p0
.end method
