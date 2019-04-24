.class public abstract Lorg/junit/runner/h;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Throwable;)Lorg/junit/runner/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")",
            "Lorg/junit/runner/h;"
        }
    .end annotation

    new-instance v0, Lorg/junit/a/c/a;

    invoke-direct {v0, p0, p1}, Lorg/junit/a/c/a;-><init>(Ljava/lang/Class;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lorg/junit/runner/h;->a(Lorg/junit/runner/k;)Lorg/junit/runner/h;

    move-result-object p0

    return-object p0
.end method

.method public static varargs a(Lorg/junit/runner/a;[Ljava/lang/Class;)Lorg/junit/runner/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runner/a;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/h;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Lorg/junit/a/a/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/junit/a/a/a;-><init>(Z)V

    invoke-virtual {p0, v0, p1}, Lorg/junit/runner/a;->a(Lorg/junit/c/a/g;[Ljava/lang/Class;)Lorg/junit/runner/k;

    move-result-object p0

    invoke-static {p0}, Lorg/junit/runner/h;->a(Lorg/junit/runner/k;)Lorg/junit/runner/h;

    move-result-object p0
    :try_end_0
    .catch Lorg/junit/c/a/e; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Bug in saff\'s brain: Suite constructor, called as above, should always complete"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Lorg/junit/runner/k;)Lorg/junit/runner/h;
    .locals 1

    new-instance v0, Lorg/junit/runner/h$1;

    invoke-direct {v0, p0}, Lorg/junit/runner/h$1;-><init>(Lorg/junit/runner/k;)V

    return-object v0
.end method


# virtual methods
.method public a(Lorg/junit/runner/a/a;)Lorg/junit/runner/h;
    .locals 1

    new-instance v0, Lorg/junit/a/b/a;

    invoke-direct {v0, p0, p1}, Lorg/junit/a/b/a;-><init>(Lorg/junit/runner/h;Lorg/junit/runner/a/a;)V

    return-object v0
.end method

.method public abstract a()Lorg/junit/runner/k;
.end method
