.class public abstract Lorg/junit/c/c;
.super Lorg/junit/runner/k;

# interfaces
.implements Lorg/junit/runner/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/junit/runner/k;",
        "Lorg/junit/runner/a/b;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/junit/d/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/Object;

.field private final c:Lorg/junit/c/a/j;

.field private volatile d:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TT;>;"
        }
    .end annotation
.end field

.field private volatile e:Lorg/junit/c/a/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/junit/d/e;

    new-instance v1, Lorg/junit/d/c;

    invoke-direct {v1}, Lorg/junit/d/c;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lorg/junit/d/d;

    invoke-direct {v1}, Lorg/junit/d/d;-><init>()V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lorg/junit/c/c;->a:Ljava/util/List;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lorg/junit/runner/k;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/junit/c/c;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/junit/c/c;->d:Ljava/util/Collection;

    new-instance v0, Lorg/junit/c/c$1;

    invoke-direct {v0, p0}, Lorg/junit/c/c$1;-><init>(Lorg/junit/c/c;)V

    iput-object v0, p0, Lorg/junit/c/c;->e:Lorg/junit/c/a/h;

    invoke-virtual {p0, p1}, Lorg/junit/c/c;->a(Ljava/lang/Class;)Lorg/junit/c/a/j;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    invoke-direct {p0}, Lorg/junit/c/c;->d()V

    return-void
.end method

.method static synthetic a(Lorg/junit/c/c;Lorg/junit/runner/b/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/junit/c/c;->d(Lorg/junit/runner/b/c;)V

    return-void
.end method

.method private a(Lorg/junit/runner/a/a;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runner/a/a;",
            "TT;)Z"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lorg/junit/c/c;->d(Ljava/lang/Object;)Lorg/junit/runner/c;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/junit/runner/a/a;->a(Lorg/junit/runner/c;)Z

    move-result p1

    return p1
.end method

.method private b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/c;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/junit/c/a/j;->d()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/junit/c/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/d/e;

    invoke-virtual {p0}, Lorg/junit/c/c;->g()Lorg/junit/c/a/j;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/junit/d/e;->a(Lorg/junit/c/a/j;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private c(Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 3

    invoke-virtual {p0}, Lorg/junit/c/c;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    new-instance v1, Lorg/junit/b/b;

    invoke-virtual {p0}, Lorg/junit/c/c;->a()Lorg/junit/runner/c;

    move-result-object v2

    invoke-direct {v1, p1, v0, v2}, Lorg/junit/b/b;-><init>(Lorg/junit/c/a/i;Ljava/lang/Iterable;Lorg/junit/runner/c;)V

    move-object p1, v1

    return-object p1
.end method

.method private c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lorg/junit/a/c/b/a;->a:Lorg/junit/a/c/b/a;

    invoke-virtual {p0}, Lorg/junit/c/c;->g()Lorg/junit/c/a/j;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/junit/a/c/b/a;->a(Lorg/junit/c/a/j;Ljava/util/List;)V

    sget-object v0, Lorg/junit/a/c/b/a;->c:Lorg/junit/a/c/b/a;

    invoke-virtual {p0}, Lorg/junit/c/c;->g()Lorg/junit/c/a/j;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lorg/junit/a/c/b/a;->a(Lorg/junit/c/a/j;Ljava/util/List;)V

    return-void
.end method

.method private c()Z
    .locals 2

    invoke-direct {p0}, Lorg/junit/c/c;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/junit/c/c;->c(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private d()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lorg/junit/c/c;->a(Ljava/util/List;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lorg/junit/c/a/e;

    invoke-direct {v1, v0}, Lorg/junit/c/a/e;-><init>(Ljava/util/List;)V

    throw v1

    :cond_0
    return-void
.end method

.method private d(Lorg/junit/runner/b/c;)V
    .locals 4

    iget-object v0, p0, Lorg/junit/c/c;->e:Lorg/junit/c/a/h;

    :try_start_0
    invoke-direct {p0}, Lorg/junit/c/c;->i()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Lorg/junit/c/c$3;

    invoke-direct {v3, p0, v2, p1}, Lorg/junit/c/c$3;-><init>(Lorg/junit/c/c;Ljava/lang/Object;Lorg/junit/runner/b/c;)V

    invoke-interface {v0, v3}, Lorg/junit/c/a/h;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lorg/junit/c/a/h;->a()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lorg/junit/c/a/h;->a()V

    throw p1
.end method

.method private i()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/junit/c/c;->d:Ljava/util/Collection;

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/junit/c/c;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/c/c;->d:Ljava/util/Collection;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lorg/junit/c/c;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    iput-object v1, p0, Lorg/junit/c/c;->d:Ljava/util/Collection;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/junit/c/c;->d:Ljava/util/Collection;

    return-object v0
.end method


# virtual methods
.method protected a(Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 3

    iget-object v0, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    const-class v1, Lorg/junit/e;

    invoke-virtual {v0, v1}, Lorg/junit/c/a/j;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    new-instance v1, Lorg/junit/a/c/c/f;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lorg/junit/a/c/c/f;-><init>(Lorg/junit/c/a/i;Ljava/util/List;Ljava/lang/Object;)V

    move-object p1, v1

    return-object p1
.end method

.method protected a(Ljava/lang/Class;)Lorg/junit/c/a/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/c/a/j;"
        }
    .end annotation

    new-instance v0, Lorg/junit/c/a/j;

    invoke-direct {v0, p1}, Lorg/junit/c/a/j;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public a()Lorg/junit/runner/c;
    .locals 3

    invoke-virtual {p0}, Lorg/junit/c/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lorg/junit/c/c;->h()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/junit/runner/c;->a(Ljava/lang/String;[Ljava/lang/annotation/Annotation;)Lorg/junit/runner/c;

    move-result-object v0

    invoke-direct {p0}, Lorg/junit/c/c;->i()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/junit/c/c;->d(Ljava/lang/Object;)Lorg/junit/runner/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/junit/runner/c;->a(Lorg/junit/runner/c;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected a(Ljava/lang/Class;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;Z",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/junit/c/c;->g()Lorg/junit/c/a/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/junit/c/a/j;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/c/a/d;

    invoke-virtual {v0, p2, p3}, Lorg/junit/c/a/d;->a(ZLjava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected abstract a(Ljava/lang/Object;Lorg/junit/runner/b/c;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/junit/runner/b/c;",
            ")V"
        }
    .end annotation
.end method

.method protected a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    const-class v0, Lorg/junit/e;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Lorg/junit/c/c;->a(Ljava/lang/Class;ZLjava/util/List;)V

    const-class v0, Lorg/junit/b;

    invoke-virtual {p0, v0, v1, p1}, Lorg/junit/c/c;->a(Ljava/lang/Class;ZLjava/util/List;)V

    invoke-direct {p0, p1}, Lorg/junit/c/c;->c(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lorg/junit/c/c;->b(Ljava/util/List;)V

    return-void
.end method

.method protected final a(Lorg/junit/c/a/i;Lorg/junit/runner/c;Lorg/junit/runner/b/c;)V
    .locals 1

    new-instance v0, Lorg/junit/a/c/a/a;

    invoke-direct {v0, p3, p2}, Lorg/junit/a/c/a/a;-><init>(Lorg/junit/runner/b/c;Lorg/junit/runner/c;)V

    invoke-virtual {v0}, Lorg/junit/a/c/a/a;->b()V

    :try_start_0
    invoke-virtual {p1}, Lorg/junit/c/a/i;->a()V
    :try_end_0
    .catch Lorg/junit/a/a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v0}, Lorg/junit/a/c/a/a;->a()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0, p1}, Lorg/junit/a/c/a/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-virtual {v0, p1}, Lorg/junit/a/c/a/a;->a(Lorg/junit/a/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    return-void

    :goto_1
    invoke-virtual {v0}, Lorg/junit/a/c/a/a;->a()V

    throw p1
.end method

.method public a(Lorg/junit/runner/a/a;)V
    .locals 5

    iget-object v0, p0, Lorg/junit/c/c;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {p0}, Lorg/junit/c/c;->i()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lorg/junit/c/c;->a(Lorg/junit/runner/a/a;Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    :try_start_1
    invoke-virtual {p1, v3}, Lorg/junit/runner/a/a;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/junit/runner/a/c; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :cond_0
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/c/c;->d:Ljava/util/Collection;

    iget-object p1, p0, Lorg/junit/c/c;->d:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lorg/junit/runner/a/c;

    invoke-direct {p1}, Lorg/junit/runner/a/c;-><init>()V

    throw p1

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public a(Lorg/junit/runner/b/c;)V
    .locals 2

    new-instance v0, Lorg/junit/a/c/a/a;

    invoke-virtual {p0}, Lorg/junit/c/c;->a()Lorg/junit/runner/c;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lorg/junit/a/c/a/a;-><init>(Lorg/junit/runner/b/c;Lorg/junit/runner/c;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/junit/c/c;->b(Lorg/junit/runner/b/c;)Lorg/junit/c/a/i;

    move-result-object p1

    invoke-virtual {p1}, Lorg/junit/c/a/i;->a()V
    :try_end_0
    .catch Lorg/junit/a/a; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/junit/runner/b/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {v0, p1}, Lorg/junit/a/c/a/a;->a(Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception p1

    throw p1

    :catch_2
    move-exception p1

    invoke-virtual {v0, p1}, Lorg/junit/a/c/a/a;->a(Lorg/junit/a/a;)V

    return-void
.end method

.method protected abstract b()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method protected b(Lorg/junit/c/a/i;)Lorg/junit/c/a/i;
    .locals 3

    iget-object v0, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    const-class v1, Lorg/junit/b;

    invoke-virtual {v0, v1}, Lorg/junit/c/a/j;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    new-instance v1, Lorg/junit/a/c/c/e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lorg/junit/a/c/c/e;-><init>(Lorg/junit/c/a/i;Ljava/util/List;Ljava/lang/Object;)V

    move-object p1, v1

    return-object p1
.end method

.method protected b(Lorg/junit/runner/b/c;)Lorg/junit/c/a/i;
    .locals 1

    invoke-virtual {p0, p1}, Lorg/junit/c/c;->c(Lorg/junit/runner/b/c;)Lorg/junit/c/a/i;

    move-result-object p1

    invoke-direct {p0}, Lorg/junit/c/c;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lorg/junit/c/c;->a(Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/junit/c/c;->b(Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/junit/c/c;->c(Lorg/junit/c/a/i;)Lorg/junit/c/a/i;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method protected c(Lorg/junit/runner/b/c;)Lorg/junit/c/a/i;
    .locals 1

    new-instance v0, Lorg/junit/c/c$2;

    invoke-direct {v0, p0, p1}, Lorg/junit/c/c$2;-><init>(Lorg/junit/c/c;Lorg/junit/runner/b/c;)V

    return-object v0
.end method

.method protected c(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method protected abstract d(Ljava/lang/Object;)Lorg/junit/runner/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lorg/junit/runner/c;"
        }
    .end annotation
.end method

.method protected e()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/junit/b/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    const-class v1, Lorg/junit/f;

    const-class v2, Lorg/junit/b/c;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lorg/junit/c/a/j;->b(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    const-class v2, Lorg/junit/f;

    const-class v4, Lorg/junit/b/c;

    invoke-virtual {v1, v3, v2, v4}, Lorg/junit/c/a/j;->a(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method protected f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    invoke-virtual {v0}, Lorg/junit/c/a/j;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lorg/junit/c/a/j;
    .locals 1

    iget-object v0, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    return-object v0
.end method

.method protected h()[Ljava/lang/annotation/Annotation;
    .locals 1

    iget-object v0, p0, Lorg/junit/c/c;->c:Lorg/junit/c/a/j;

    invoke-virtual {v0}, Lorg/junit/c/a/j;->a()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    return-object v0
.end method
