.class Lorg/junit/runner/d;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;Lorg/junit/runner/f;)Lorg/junit/runner/a/a;
    .locals 0

    invoke-static {p0}, Lorg/junit/runner/d;->a(Ljava/lang/String;)Lorg/junit/runner/e;

    move-result-object p0

    invoke-interface {p0, p1}, Lorg/junit/runner/e;->a(Lorg/junit/runner/f;)Lorg/junit/runner/a/a;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lorg/junit/runner/h;Ljava/lang/String;)Lorg/junit/runner/a/a;
    .locals 4

    invoke-virtual {p0}, Lorg/junit/runner/h;->a()Lorg/junit/runner/k;

    move-result-object p0

    invoke-virtual {p0}, Lorg/junit/runner/k;->a()Lorg/junit/runner/c;

    move-result-object p0

    const-string v0, "="

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    const-string v0, "="

    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array v0, v3, [Ljava/lang/String;

    aput-object p1, v0, v2

    const-string p1, ""

    aput-object p1, v0, v1

    move-object p1, v0

    :goto_0
    aget-object v0, p1, v2

    new-instance v2, Lorg/junit/runner/f;

    aget-object p1, p1, v1

    invoke-direct {v2, p0, p1}, Lorg/junit/runner/f;-><init>(Lorg/junit/runner/c;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lorg/junit/runner/d;->a(Ljava/lang/String;Lorg/junit/runner/f;)Lorg/junit/runner/a/a;

    move-result-object p0

    return-object p0
.end method

.method static a(Ljava/lang/Class;)Lorg/junit/runner/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/junit/runner/e;",
            ">;)",
            "Lorg/junit/runner/e;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/junit/runner/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lorg/junit/runner/e$a;

    invoke-direct {v0, p0}, Lorg/junit/runner/e$a;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method static a(Ljava/lang/String;)Lorg/junit/runner/e;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lorg/junit/a/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const-class v0, Lorg/junit/runner/e;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p0}, Lorg/junit/runner/d;->a(Ljava/lang/Class;)Lorg/junit/runner/e;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lorg/junit/runner/e$a;

    invoke-direct {v0, p0}, Lorg/junit/runner/e$a;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method
