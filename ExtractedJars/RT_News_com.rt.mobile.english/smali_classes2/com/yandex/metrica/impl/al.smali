.class public Lcom/yandex/metrica/impl/al;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/al$a;,
        Lcom/yandex/metrica/impl/al$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/yandex/metrica/impl/al$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/lang/Object;

.field private volatile f:Lcom/yandex/metrica/impl/al$b;

.field private g:Lcom/yandex/metrica/impl/ap;

.field private volatile h:Z


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/y;Ljava/util/concurrent/Executor;)V
    .locals 5
    .param p1    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 33
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/al;->c:Ljava/util/concurrent/BlockingQueue;

    .line 34
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/al;->d:Ljava/lang/Object;

    .line 35
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/al;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/al;->h:Z

    .line 45
    iput-object p2, p0, Lcom/yandex/metrica/impl/al;->a:Ljava/util/concurrent/Executor;

    .line 46
    new-instance p2, Lcom/yandex/metrica/impl/ob/hm;

    invoke-direct {p2}, Lcom/yandex/metrica/impl/ob/hm;-><init>()V

    iput-object p2, p0, Lcom/yandex/metrica/impl/al;->b:Ljava/util/concurrent/Executor;

    .line 47
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "[%s:%s]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "NetworkTaskQueue"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v0

    invoke-static {p2, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    new-instance p1, Lcom/yandex/metrica/impl/ap;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ap;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/al;->g:Lcom/yandex/metrica/impl/ap;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/yandex/metrica/impl/al;->e:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 68
    :try_start_0
    iput-boolean v1, p0, Lcom/yandex/metrica/impl/al;->h:Z

    .line 69
    iget-object v1, p0, Lcom/yandex/metrica/impl/al;->f:Lcom/yandex/metrica/impl/al$b;

    if-eqz v1, :cond_0

    .line 71
    iget-object v1, v1, Lcom/yandex/metrica/impl/al$b;->a:Lcom/yandex/metrica/impl/an;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/an;->x()V

    .line 73
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/al;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->clear()V

    .line 75
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/al;->interrupt()V

    .line 76
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a(Lcom/yandex/metrica/impl/an;)V
    .locals 3

    .line 53
    iget-object v0, p0, Lcom/yandex/metrica/impl/al;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 54
    :try_start_0
    new-instance v1, Lcom/yandex/metrica/impl/al$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/yandex/metrica/impl/al$b;-><init>(Lcom/yandex/metrica/impl/an;B)V

    .line 1126
    iget-object p1, p0, Lcom/yandex/metrica/impl/al;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1, v1}, Ljava/util/concurrent/BlockingQueue;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/yandex/metrica/impl/al;->f:Lcom/yandex/metrica/impl/al$b;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/al$b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v2, 0x1

    :cond_1
    if-nez v2, :cond_2

    .line 59
    iget-object p1, p0, Lcom/yandex/metrica/impl/al;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1, v1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 62
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method b(Lcom/yandex/metrica/impl/an;)Ljava/util/concurrent/Executor;
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 108
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->o()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 110
    iget-object p1, p0, Lcom/yandex/metrica/impl/al;->a:Ljava/util/concurrent/Executor;

    return-object p1

    .line 113
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/al;->b:Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method c(Lcom/yandex/metrica/impl/an;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 131
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->b()Z

    move-result v0

    .line 133
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->d()Lcom/yandex/metrica/impl/ob/ho;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ho;->b()Z

    move-result v1

    if-nez v1, :cond_0

    move v0, v2

    .line 144
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/al;->h:Z

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 152
    iget-object v0, p0, Lcom/yandex/metrica/impl/al;->g:Lcom/yandex/metrica/impl/ap;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ap;->a(Lcom/yandex/metrica/impl/an;)V

    .line 154
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->c()Z

    move-result v0

    .line 155
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/an;->a(Z)V

    if-nez v0, :cond_1

    .line 156
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v0, :cond_0

    .line 159
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->q()J

    move-result-wide v3

    .line 166
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    .line 170
    :cond_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/an;->g()V

    return-void
.end method

.method public run()V
    .locals 5

    .line 83
    :goto_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/al;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 86
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/al;->e:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    :try_start_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/al;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/al$b;

    iput-object v1, p0, Lcom/yandex/metrica/impl/al;->f:Lcom/yandex/metrica/impl/al$b;

    .line 89
    iget-object v1, p0, Lcom/yandex/metrica/impl/al;->f:Lcom/yandex/metrica/impl/al$b;

    iget-object v1, v1, Lcom/yandex/metrica/impl/al$b;->a:Lcom/yandex/metrica/impl/an;

    .line 91
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/al;->b(Lcom/yandex/metrica/impl/an;)Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 2118
    new-instance v3, Lcom/yandex/metrica/impl/al$a;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v1, v4}, Lcom/yandex/metrica/impl/al$a;-><init>(Lcom/yandex/metrica/impl/al;Lcom/yandex/metrica/impl/an;B)V

    .line 91
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 97
    iget-object v1, p0, Lcom/yandex/metrica/impl/al;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 98
    :try_start_3
    iput-object v0, p0, Lcom/yandex/metrica/impl/al;->f:Lcom/yandex/metrica/impl/al$b;

    .line 99
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catchall_1
    move-exception v2

    .line 86
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v2
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    goto :goto_1

    .line 95
    :catch_0
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 97
    iget-object v1, p0, Lcom/yandex/metrica/impl/al;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 98
    :try_start_7
    iput-object v0, p0, Lcom/yandex/metrica/impl/al;->f:Lcom/yandex/metrica/impl/al$b;

    .line 99
    monitor-exit v1

    goto :goto_0

    :catchall_3
    move-exception v0

    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    .line 97
    :goto_1
    iget-object v2, p0, Lcom/yandex/metrica/impl/al;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 98
    :try_start_8
    iput-object v0, p0, Lcom/yandex/metrica/impl/al;->f:Lcom/yandex/metrica/impl/al$b;

    .line 99
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 100
    throw v1

    :catchall_4
    move-exception v0

    .line 99
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    throw v0

    :cond_0
    return-void
.end method
