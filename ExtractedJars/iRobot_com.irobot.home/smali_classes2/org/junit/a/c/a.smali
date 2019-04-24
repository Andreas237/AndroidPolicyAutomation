.class public Lorg/junit/a/c/a;
.super Lorg/junit/runner/k;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lorg/junit/runner/k;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Test class cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lorg/junit/a/c/a;->b:Ljava/lang/Class;

    invoke-direct {p0, p2}, Lorg/junit/a/c/a;->a(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/a/c/a;->a:Ljava/util/List;

    return-void
.end method

.method private a(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/junit/a/c/a;->a(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lorg/junit/c/a/e;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/junit/c/a/e;

    invoke-virtual {p1}, Lorg/junit/c/a/e;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lorg/junit/a/c/b;

    if-eqz v0, :cond_2

    check-cast p1, Lorg/junit/a/c/b;

    invoke-virtual {p1}, Lorg/junit/a/c/b;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Throwable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private a(Ljava/lang/Throwable;Lorg/junit/runner/b/c;)V
    .locals 2

    invoke-direct {p0, p1}, Lorg/junit/a/c/a;->b(Ljava/lang/Throwable;)Lorg/junit/runner/c;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/junit/runner/b/c;->b(Lorg/junit/runner/c;)V

    new-instance v1, Lorg/junit/runner/b/a;

    invoke-direct {v1, v0, p1}, Lorg/junit/runner/b/a;-><init>(Lorg/junit/runner/c;Ljava/lang/Throwable;)V

    invoke-virtual {p2, v1}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/b/a;)V

    invoke-virtual {p2, v0}, Lorg/junit/runner/b/c;->d(Lorg/junit/runner/c;)V

    return-void
.end method

.method private b(Ljava/lang/Throwable;)Lorg/junit/runner/c;
    .locals 1

    iget-object p1, p0, Lorg/junit/a/c/a;->b:Ljava/lang/Class;

    const-string v0, "initializationError"

    invoke-static {p1, v0}, Lorg/junit/runner/c;->a(Ljava/lang/Class;Ljava/lang/String;)Lorg/junit/runner/c;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Lorg/junit/runner/c;
    .locals 3

    iget-object v0, p0, Lorg/junit/a/c/a;->b:Ljava/lang/Class;

    invoke-static {v0}, Lorg/junit/runner/c;->a(Ljava/lang/Class;)Lorg/junit/runner/c;

    move-result-object v0

    iget-object v1, p0, Lorg/junit/a/c/a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    invoke-direct {p0, v2}, Lorg/junit/a/c/a;->b(Ljava/lang/Throwable;)Lorg/junit/runner/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/junit/runner/c;->a(Lorg/junit/runner/c;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public a(Lorg/junit/runner/b/c;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/a/c/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {p0, v1, p1}, Lorg/junit/a/c/a;->a(Ljava/lang/Throwable;Lorg/junit/runner/b/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method
