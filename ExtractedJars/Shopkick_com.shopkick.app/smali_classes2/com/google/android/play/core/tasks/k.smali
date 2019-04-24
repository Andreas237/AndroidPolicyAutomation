.class final Lcom/google/android/play/core/tasks/k;
.super Lcom/google/android/play/core/tasks/Task;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/play/core/tasks/Task<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/google/android/play/core/tasks/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/tasks/h<",
            "TTResult;>;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/Exception;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/play/core/tasks/Task;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/play/core/tasks/h;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/h;-><init>()V

    iput-object v0, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    return-void
.end method

.method private final a()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/at;->a(ZLjava/lang/Object;)V

    return-void
.end method

.method private final b()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Task is already complete"

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/at;->a(ZLjava/lang/Object;)V

    return-void
.end method

.method private final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    invoke-virtual {v0, p0}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/Task;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/play/core/internal/at;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/play/core/tasks/k;->b()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    iput-object p1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    invoke-virtual {p1, p0}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/Task;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/play/core/tasks/k;->b()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    iput-object p1, p0, Lcom/google/android/play/core/tasks/k;->d:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    invoke-virtual {p1, p0}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/Task;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final addOnCompleteListener(Lcom/google/android/play/core/tasks/OnCompleteListener;)Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/tasks/OnCompleteListener<",
            "TTResult;>;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/play/core/tasks/k;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnCompleteListener;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnCompleteListener;)Lcom/google/android/play/core/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/play/core/tasks/OnCompleteListener<",
            "TTResult;>;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    new-instance v1, Lcom/google/android/play/core/tasks/a;

    invoke-direct {v1, p1, p2}, Lcom/google/android/play/core/tasks/a;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnCompleteListener;)V

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/g;)V

    invoke-direct {p0}, Lcom/google/android/play/core/tasks/k;->c()V

    return-object p0
.end method

.method public final addOnFailureListener(Lcom/google/android/play/core/tasks/OnFailureListener;)Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/tasks/OnFailureListener;",
            ")",
            "Lcom/google/android/play/core/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/play/core/tasks/k;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnFailureListener;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnFailureListener;)Lcom/google/android/play/core/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/play/core/tasks/OnFailureListener;",
            ")",
            "Lcom/google/android/play/core/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    new-instance v1, Lcom/google/android/play/core/tasks/c;

    invoke-direct {v1, p1, p2}, Lcom/google/android/play/core/tasks/c;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnFailureListener;)V

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/g;)V

    invoke-direct {p0}, Lcom/google/android/play/core/tasks/k;->c()V

    return-object p0
.end method

.method public final addOnSuccessListener(Lcom/google/android/play/core/tasks/OnSuccessListener;)Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/tasks/OnSuccessListener<",
            "-TTResult;>;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/play/core/tasks/k;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnSuccessListener;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnSuccessListener;)Lcom/google/android/play/core/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/play/core/tasks/OnSuccessListener<",
            "-TTResult;>;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    new-instance v1, Lcom/google/android/play/core/tasks/e;

    invoke-direct {v1, p1, p2}, Lcom/google/android/play/core/tasks/e;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/play/core/tasks/OnSuccessListener;)V

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/g;)V

    invoke-direct {p0}, Lcom/google/android/play/core/tasks/k;->c()V

    return-object p0
.end method

.method public final b(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/play/core/internal/at;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    iput-object p1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    invoke-virtual {p1, p0}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/Task;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    iput-object p1, p0, Lcom/google/android/play/core/tasks/k;->d:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/play/core/tasks/k;->b:Lcom/google/android/play/core/tasks/h;

    invoke-virtual {p1, p0}, Lcom/google/android/play/core/tasks/h;->a(Lcom/google/android/play/core/tasks/Task;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final getException()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/play/core/tasks/k;->a()V

    iget-object v1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/play/core/tasks/k;->d:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Lcom/google/android/play/core/tasks/RuntimeExecutionException;

    iget-object v2, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    invoke-direct {v1, v2}, Lcom/google/android/play/core/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getResult(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;)TTResult;^TX;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/play/core/tasks/k;->a()V

    iget-object v1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/play/core/tasks/k;->d:Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/play/core/tasks/RuntimeExecutionException;

    iget-object v1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    invoke-direct {p1, v1}, Lcom/google/android/play/core/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final isComplete()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final isSuccessful()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/tasks/k;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/play/core/tasks/k;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/play/core/tasks/k;->e:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
