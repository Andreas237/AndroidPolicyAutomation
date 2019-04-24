.class public Lorg/junit/a/a/b;
.super Lorg/junit/c/a/g;


# instance fields
.field private final a:Lorg/junit/c/a/g;


# direct methods
.method public constructor <init>(Lorg/junit/c/a/g;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/c/a/g;-><init>()V

    iput-object p1, p0, Lorg/junit/a/a/b;->a:Lorg/junit/c/a/g;

    return-void
.end method

.method private b(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->isMemberClass()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lorg/junit/runner/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/k;"
        }
    .end annotation

    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_1

    const-class v1, Lorg/junit/runner/j;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lorg/junit/runner/j;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lorg/junit/runner/j;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lorg/junit/a/a/b;->a(Ljava/lang/Class;Ljava/lang/Class;)Lorg/junit/runner/k;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, v0}, Lorg/junit/a/a/b;->b(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;)Lorg/junit/runner/k;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/junit/runner/k;",
            ">;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/k;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Class;

    aput-object v3, v2, v0

    invoke-virtual {p1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    aput-object p2, v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/junit/runner/k;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Ljava/lang/Class;

    aput-object v4, v3, v0

    const-class v4, Lorg/junit/c/a/g;

    aput-object v4, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p2, v4, v0

    iget-object p2, p0, Lorg/junit/a/a/b;->a:Lorg/junit/c/a/g;

    aput-object p2, v4, v1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/junit/runner/k;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p2

    :catch_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lorg/junit/c/a/e;

    const-string v3, "Custom runner class %s should have a public constructor with signature %s(Class testClass)"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    aput-object p1, v2, v1

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/junit/c/a/e;-><init>(Ljava/lang/String;)V

    throw p2
.end method
