.class public final Lorg/junit/a/g;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/Throwable;)Ljava/lang/Exception;
    .locals 0

    invoke-static {p0}, Lorg/junit/a/g;->b(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static b(Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Throwable;",
            ")V^TT;"
        }
    .end annotation

    throw p0
.end method
