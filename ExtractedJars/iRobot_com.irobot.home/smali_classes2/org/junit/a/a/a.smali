.class public Lorg/junit/a/a/a;
.super Lorg/junit/c/a/g;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/c/a/g;-><init>()V

    iput-boolean p1, p0, Lorg/junit/a/a/a;->a:Z

    return-void
.end method


# virtual methods
.method protected a()Lorg/junit/a/a/f;
    .locals 1

    new-instance v0, Lorg/junit/a/a/f;

    invoke-direct {v0}, Lorg/junit/a/a/f;-><init>()V

    return-object v0
.end method

.method public a(Ljava/lang/Class;)Lorg/junit/runner/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/k;"
        }
    .end annotation

    const/4 v0, 0x5

    new-array v0, v0, [Lorg/junit/c/a/g;

    invoke-virtual {p0}, Lorg/junit/a/a/a;->d()Lorg/junit/a/a/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lorg/junit/a/a/a;->c()Lorg/junit/a/a/b;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lorg/junit/a/a/a;->e()Lorg/junit/c/a/g;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lorg/junit/a/a/a;->b()Lorg/junit/a/a/e;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lorg/junit/a/a/a;->a()Lorg/junit/a/a/f;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/c/a/g;

    invoke-virtual {v1, p1}, Lorg/junit/c/a/g;->c(Ljava/lang/Class;)Lorg/junit/runner/k;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected b()Lorg/junit/a/a/e;
    .locals 1

    new-instance v0, Lorg/junit/a/a/e;

    invoke-direct {v0}, Lorg/junit/a/a/e;-><init>()V

    return-object v0
.end method

.method protected c()Lorg/junit/a/a/b;
    .locals 1

    new-instance v0, Lorg/junit/a/a/b;

    invoke-direct {v0, p0}, Lorg/junit/a/a/b;-><init>(Lorg/junit/c/a/g;)V

    return-object v0
.end method

.method protected d()Lorg/junit/a/a/c;
    .locals 1

    new-instance v0, Lorg/junit/a/a/c;

    invoke-direct {v0}, Lorg/junit/a/a/c;-><init>()V

    return-object v0
.end method

.method protected e()Lorg/junit/c/a/g;
    .locals 1

    iget-boolean v0, p0, Lorg/junit/a/a/a;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lorg/junit/a/a/h;

    invoke-direct {v0}, Lorg/junit/a/a/h;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Lorg/junit/a/a/g;

    invoke-direct {v0}, Lorg/junit/a/a/g;-><init>()V

    return-object v0
.end method
