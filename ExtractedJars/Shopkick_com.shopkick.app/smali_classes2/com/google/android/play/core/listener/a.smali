.class public abstract Lcom/google/android/play/core/listener/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<StateT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:Lcom/google/android/play/core/internal/aa;

.field private final b:Landroid/content/IntentFilter;

.field private final c:Landroid/content/Context;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/play/core/listener/StateUpdatedListener<",
            "TStateT;>;>;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/play/core/listener/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/listener/b;"
        }
    .end annotation
.end field

.field private volatile f:Z


# direct methods
.method protected constructor <init>(Lcom/google/android/play/core/internal/aa;Landroid/content/IntentFilter;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/play/core/listener/a;->d:Ljava/util/Set;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/play/core/listener/a;->e:Lcom/google/android/play/core/listener/b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/play/core/listener/a;->f:Z

    iput-object p1, p0, Lcom/google/android/play/core/listener/a;->a:Lcom/google/android/play/core/internal/aa;

    iput-object p2, p0, Lcom/google/android/play/core/listener/a;->b:Landroid/content/IntentFilter;

    iput-object p3, p0, Lcom/google/android/play/core/listener/a;->c:Landroid/content/Context;

    return-void
.end method

.method private final a()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/play/core/listener/a;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->e:Lcom/google/android/play/core/listener/b;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/play/core/listener/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/play/core/listener/b;-><init>(Lcom/google/android/play/core/listener/a;B)V

    iput-object v0, p0, Lcom/google/android/play/core/listener/a;->e:Lcom/google/android/play/core/listener/b;

    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/play/core/listener/a;->e:Lcom/google/android/play/core/listener/b;

    iget-object v2, p0, Lcom/google/android/play/core/listener/a;->b:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/play/core/listener/a;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->e:Lcom/google/android/play/core/listener/b;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/play/core/listener/a;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/play/core/listener/a;->e:Lcom/google/android/play/core/listener/b;

    :cond_2
    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Intent;)V
.end method

.method public final declared-synchronized a(Lcom/google/android/play/core/listener/StateUpdatedListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/listener/StateUpdatedListener<",
            "TStateT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->a:Lcom/google/android/play/core/internal/aa;

    const-string v1, "registerListener"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/google/android/play/core/listener/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TStateT;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/listener/StateUpdatedListener;

    invoke-interface {v1, p1}, Lcom/google/android/play/core/listener/StateUpdatedListener;->onStateUpdate(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Z)V
    .locals 0

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/play/core/listener/a;->f:Z

    invoke-direct {p0}, Lcom/google/android/play/core/listener/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(Lcom/google/android/play/core/listener/StateUpdatedListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/listener/StateUpdatedListener<",
            "TStateT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->a:Lcom/google/android/play/core/internal/aa;

    const-string/jumbo v1, "unregisterListener"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/listener/a;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/google/android/play/core/listener/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
