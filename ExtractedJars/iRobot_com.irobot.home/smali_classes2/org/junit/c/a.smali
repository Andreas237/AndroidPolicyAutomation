.class public Lorg/junit/c/a;
.super Lorg/junit/c/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/junit/c/c<",
        "Lorg/junit/c/a/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lorg/junit/c/a/d;",
            "Lorg/junit/runner/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/junit/c/c;-><init>(Ljava/lang/Class;)V

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lorg/junit/c/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private a(Lorg/junit/j;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/j;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lorg/junit/j;->a()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lorg/junit/j$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lorg/junit/j;->a()Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(Lorg/junit/c/a/d;Ljava/util/List;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/d;",
            "Ljava/util/List<",
            "Lorg/junit/b/c;",
            ">;",
            "Ljava/lang/Object;",
            "Lorg/junit/c/a/i;",
            ")",
            "Lorg/junit/c/a/i;"
        }
    .end annotation

    invoke-direct {p0, p3}, Lorg/junit/c/a;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/b/a;

    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1, p4, p1, p3}, Lorg/junit/b/a;->a(Lorg/junit/c/a/i;Lorg/junit/c/a/d;Ljava/lang/Object;)Lorg/junit/c/a/i;

    move-result-object p4

    goto :goto_0

    :cond_1
    return-object p4
.end method

.method private a(Lorg/junit/c/a/d;Ljava/util/List;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/d;",
            "Ljava/util/List<",
            "Lorg/junit/b/c;",
            ">;",
            "Lorg/junit/c/a/i;",
            ")",
            "Lorg/junit/c/a/i;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p3

    :cond_0
    new-instance v0, Lorg/junit/b/b;

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->b(Lorg/junit/c/a/d;)Lorg/junit/runner/c;

    move-result-object p1

    invoke-direct {v0, p3, p2, p1}, Lorg/junit/b/b;-><init>(Lorg/junit/c/a/i;Ljava/lang/Iterable;Lorg/junit/runner/c;)V

    move-object p3, v0

    return-object p3
.end method

.method private b(Lorg/junit/j;)Z
    .locals 0

    invoke-direct {p0, p1}, Lorg/junit/c/a;->a(Lorg/junit/j;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private c(Lorg/junit/j;)J
    .locals 2

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-interface {p1}, Lorg/junit/j;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method private e(Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lorg/junit/b/a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private e(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 1

    invoke-virtual {p0, p2}, Lorg/junit/c/a;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2, p3}, Lorg/junit/c/a;->a(Lorg/junit/c/a/d;Ljava/util/List;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object p2

    invoke-direct {p0, p1, v0, p2}, Lorg/junit/c/a;->a(Lorg/junit/c/a/d;Ljava/util/List;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object p1

    return-object p1
.end method

.method private i(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lorg/junit/a/c/b/a;->d:Lorg/junit/a/c/b/a;

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/junit/a/c/b/a;->a(Lorg/junit/c/a/j;Ljava/util/List;)V

    return-void
.end method

.method private i()Z
    .locals 2

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/junit/c/a/j;->d()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    return v1
.end method


# virtual methods
.method protected a(Ljava/lang/Object;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lorg/junit/b/a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    const-class v1, Lorg/junit/i;

    const-class v2, Lorg/junit/b/a;

    invoke-virtual {v0, p1, v1, v2}, Lorg/junit/c/a/j;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v1

    const-class v2, Lorg/junit/i;

    const-class v3, Lorg/junit/b/a;

    invoke-virtual {v1, p1, v2, v3}, Lorg/junit/c/a/j;->a(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method protected a(Lorg/junit/c/a/d;Ljava/lang/Object;)Lorg/junit/c/a/i;
    .locals 1

    new-instance v0, Lorg/junit/a/c/c/d;

    invoke-direct {v0, p1, p2}, Lorg/junit/a/c/c/d;-><init>(Lorg/junit/c/a/d;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected a(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 0

    const-class p2, Lorg/junit/j;

    invoke-virtual {p1, p2}, Lorg/junit/c/a/d;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    check-cast p1, Lorg/junit/j;

    invoke-direct {p0, p1}, Lorg/junit/c/a;->b(Lorg/junit/j;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lorg/junit/a/c/c/a;

    invoke-direct {p0, p1}, Lorg/junit/c/a;->a(Lorg/junit/j;)Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lorg/junit/a/c/c/a;-><init>(Lorg/junit/c/a/i;Ljava/lang/Class;)V

    return-object p2

    :cond_0
    move-object p2, p3

    return-object p2
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lorg/junit/runner/b/c;)V
    .locals 0

    check-cast p1, Lorg/junit/c/a/d;

    invoke-virtual {p0, p1, p2}, Lorg/junit/c/a;->a(Lorg/junit/c/a/d;Lorg/junit/runner/b/c;)V

    return-void
.end method

.method protected a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lorg/junit/c/c;->a(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->b(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->c(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->f(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->g(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lorg/junit/c/a;->i(Ljava/util/List;)V

    return-void
.end method

.method protected a(Lorg/junit/c/a/d;Lorg/junit/runner/b/c;)V
    .locals 2

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->b(Lorg/junit/c/a/d;)Lorg/junit/runner/c;

    move-result-object v0

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->a(Lorg/junit/c/a/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lorg/junit/runner/b/c;->c(Lorg/junit/runner/c;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lorg/junit/c/a;->d(Lorg/junit/c/a/d;)Lorg/junit/c/a/i;

    move-result-object p1

    invoke-virtual {p0, p1, v0, p2}, Lorg/junit/c/a;->a(Lorg/junit/c/a/i;Lorg/junit/runner/c;Lorg/junit/runner/b/c;)V

    return-void
.end method

.method protected a(Lorg/junit/c/a/d;)Z
    .locals 1

    const-class v0, Lorg/junit/h;

    invoke-virtual {p1, v0}, Lorg/junit/c/a/d;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/junit/c/a/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/a;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/Object;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lorg/junit/b/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    const-class v1, Lorg/junit/i;

    const-class v2, Lorg/junit/b/c;

    invoke-virtual {v0, p1, v1, v2}, Lorg/junit/c/a/j;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v1

    const-class v2, Lorg/junit/i;

    const-class v3, Lorg/junit/b/c;

    invoke-virtual {v1, p1, v2, v3}, Lorg/junit/c/a/j;->a(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method protected b(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class p2, Lorg/junit/j;

    invoke-virtual {p1, p2}, Lorg/junit/c/a/d;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    check-cast p1, Lorg/junit/j;

    invoke-direct {p0, p1}, Lorg/junit/c/a;->c(Lorg/junit/j;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    return-object p3

    :cond_0
    invoke-static {}, Lorg/junit/a/c/c/c;->b()Lorg/junit/a/c/c/c$a;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v1}, Lorg/junit/a/c/c/c$a;->a(JLjava/util/concurrent/TimeUnit;)Lorg/junit/a/c/c/c$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lorg/junit/a/c/c/c$a;->a(Lorg/junit/c/a/i;)Lorg/junit/a/c/c/c;

    move-result-object p1

    return-object p1
.end method

.method protected b(Lorg/junit/c/a/d;)Lorg/junit/runner/c;
    .locals 3

    iget-object v0, p0, Lorg/junit/c/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/runner/c;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/junit/c/a/j;->d()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->c(Lorg/junit/c/a/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lorg/junit/c/a/d;->a()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lorg/junit/runner/c;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/annotation/Annotation;)Lorg/junit/runner/c;

    move-result-object v0

    iget-object v1, p0, Lorg/junit/c/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method protected b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/junit/c/a/j;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The inner class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v1

    invoke-virtual {v1}, Lorg/junit/c/a/j;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not static."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method protected c(Lorg/junit/c/a/d;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lorg/junit/c/a/d;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/junit/c/a/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    const-class v1, Lorg/junit/j;

    invoke-virtual {v0, v1}, Lorg/junit/c/a/j;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 1

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object p1

    const-class v0, Lorg/junit/d;

    invoke-virtual {p1, v0}, Lorg/junit/c/a/j;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p3

    :cond_0
    new-instance v0, Lorg/junit/a/c/c/f;

    invoke-direct {v0, p3, p1, p2}, Lorg/junit/a/c/c/f;-><init>(Lorg/junit/c/a/i;Ljava/util/List;Ljava/lang/Object;)V

    move-object p3, v0

    return-object p3
.end method

.method protected c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->d(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->e(Ljava/util/List;)V

    return-void
.end method

.method protected synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lorg/junit/c/a/d;

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->a(Lorg/junit/c/a/d;)Z

    move-result p1

    return p1
.end method

.method protected d()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/junit/c/a/j;->f()Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected d(Lorg/junit/c/a/d;)Lorg/junit/c/a/i;
    .locals 2

    :try_start_0
    new-instance v0, Lorg/junit/c/a$1;

    invoke-direct {v0, p0}, Lorg/junit/c/a$1;-><init>(Lorg/junit/c/a;)V

    invoke-virtual {v0}, Lorg/junit/c/a$1;->a()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, p1, v0}, Lorg/junit/c/a;->a(Lorg/junit/c/a/d;Ljava/lang/Object;)Lorg/junit/c/a/i;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lorg/junit/c/a;->a(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lorg/junit/c/a;->b(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lorg/junit/c/a;->c(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lorg/junit/c/a;->d(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lorg/junit/c/a;->e(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lorg/junit/a/c/c/b;

    invoke-direct {v0, p1}, Lorg/junit/a/c/c/b;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method protected d(Lorg/junit/c/a/d;Ljava/lang/Object;Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 1

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object p1

    const-class v0, Lorg/junit/a;

    invoke-virtual {p1, v0}, Lorg/junit/c/a/j;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p3

    :cond_0
    new-instance v0, Lorg/junit/a/c/c/e;

    invoke-direct {v0, p3, p1, p2}, Lorg/junit/a/c/c/e;-><init>(Lorg/junit/c/a/i;Ljava/util/List;Ljava/lang/Object;)V

    move-object p3, v0

    return-object p3
.end method

.method protected synthetic d(Ljava/lang/Object;)Lorg/junit/runner/c;
    .locals 0

    check-cast p1, Lorg/junit/c/a/d;

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->b(Lorg/junit/c/a/d;)Lorg/junit/runner/c;

    move-result-object p1

    return-object p1
.end method

.method protected d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lorg/junit/c/a;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Test class should have exactly one public constructor"

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method protected e(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/junit/c/a/j;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lorg/junit/c/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/junit/c/a/j;->f()Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_0

    const-string v0, "Test class should have exactly one public zero-argument constructor"

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method protected f(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lorg/junit/a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lorg/junit/c/a;->a(Ljava/lang/Class;ZLjava/util/List;)V

    const-class v0, Lorg/junit/d;

    invoke-virtual {p0, v0, v1, p1}, Lorg/junit/c/a;->a(Ljava/lang/Class;ZLjava/util/List;)V

    invoke-virtual {p0, p1}, Lorg/junit/c/a;->h(Ljava/util/List;)V

    invoke-virtual {p0}, Lorg/junit/c/a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "No runnable methods"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method protected g(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lorg/junit/a/c/b/a;->b:Lorg/junit/a/c/b/a;

    invoke-virtual {p0}, Lorg/junit/c/a;->g()Lorg/junit/c/a/j;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/junit/a/c/b/a;->a(Lorg/junit/c/a/j;Ljava/util/List;)V

    return-void
.end method

.method protected h(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    const-class v0, Lorg/junit/j;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lorg/junit/c/a;->a(Ljava/lang/Class;ZLjava/util/List;)V

    return-void
.end method
