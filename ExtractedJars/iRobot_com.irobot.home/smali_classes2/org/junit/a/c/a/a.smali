.class public Lorg/junit/a/c/a/a;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lorg/junit/runner/b/c;

.field private final b:Lorg/junit/runner/c;


# direct methods
.method public constructor <init>(Lorg/junit/runner/b/c;Lorg/junit/runner/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/junit/a/c/a/a;->a:Lorg/junit/runner/b/c;

    iput-object p2, p0, Lorg/junit/a/c/a/a;->b:Lorg/junit/runner/c;

    return-void
.end method

.method private a(Lorg/junit/c/a/f;)V
    .locals 1

    invoke-virtual {p1}, Lorg/junit/c/a/f;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, Lorg/junit/a/c/a/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lorg/junit/a/c/a/a;->a:Lorg/junit/runner/b/c;

    iget-object v1, p0, Lorg/junit/a/c/a/a;->b:Lorg/junit/runner/c;

    invoke-virtual {v0, v1}, Lorg/junit/runner/b/c;->d(Lorg/junit/runner/c;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Lorg/junit/c/a/f;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/junit/c/a/f;

    invoke-direct {p0, p1}, Lorg/junit/a/c/a/a;->a(Lorg/junit/c/a/f;)V

    return-void

    :cond_0
    iget-object v0, p0, Lorg/junit/a/c/a/a;->a:Lorg/junit/runner/b/c;

    new-instance v1, Lorg/junit/runner/b/a;

    iget-object v2, p0, Lorg/junit/a/c/a/a;->b:Lorg/junit/runner/c;

    invoke-direct {v1, v2, p1}, Lorg/junit/runner/b/a;-><init>(Lorg/junit/runner/c;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/b/a;)V

    return-void
.end method

.method public a(Lorg/junit/a/a;)V
    .locals 3

    iget-object v0, p0, Lorg/junit/a/c/a/a;->a:Lorg/junit/runner/b/c;

    new-instance v1, Lorg/junit/runner/b/a;

    iget-object v2, p0, Lorg/junit/a/c/a/a;->b:Lorg/junit/runner/c;

    invoke-direct {v1, v2, p1}, Lorg/junit/runner/b/a;-><init>(Lorg/junit/runner/c;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lorg/junit/runner/b/c;->b(Lorg/junit/runner/b/a;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lorg/junit/a/c/a/a;->a:Lorg/junit/runner/b/c;

    iget-object v1, p0, Lorg/junit/a/c/a/a;->b:Lorg/junit/runner/c;

    invoke-virtual {v0, v1}, Lorg/junit/runner/b/c;->b(Lorg/junit/runner/c;)V

    return-void
.end method
