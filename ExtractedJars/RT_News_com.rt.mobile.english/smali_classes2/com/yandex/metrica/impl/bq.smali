.class public Lcom/yandex/metrica/impl/bq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/yandex/metrica/impl/ob/af;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field final b:Lcom/yandex/metrica/impl/al;

.field c:Z

.field private d:Lcom/yandex/metrica/impl/ob/af;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field

.field private final e:Lcom/yandex/metrica/impl/ob/kk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/af;Lcom/yandex/metrica/impl/ob/kk;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/af;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/kk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Lcom/yandex/metrica/impl/ob/kk;",
            ")V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bq;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/bq;->c:Z

    .line 36
    iput-object p1, p0, Lcom/yandex/metrica/impl/bq;->d:Lcom/yandex/metrica/impl/ob/af;

    .line 37
    iput-object p2, p0, Lcom/yandex/metrica/impl/bq;->e:Lcom/yandex/metrica/impl/ob/kk;

    .line 1051
    new-instance p2, Lcom/yandex/metrica/impl/al;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/af;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v0

    sget-object v1, Lcom/yandex/metrica/impl/ai;->a:Ljava/util/concurrent/Executor;

    invoke-direct {p2, v0, v1}, Lcom/yandex/metrica/impl/al;-><init>(Lcom/yandex/metrica/impl/ob/y;Ljava/util/concurrent/Executor;)V

    .line 1054
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "YMM-NC ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1055
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/af;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1054
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lt;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/al;->setName(Ljava/lang/String;)V

    .line 40
    iput-object p2, p0, Lcom/yandex/metrica/impl/bq;->b:Lcom/yandex/metrica/impl/al;

    .line 41
    iget-object p1, p0, Lcom/yandex/metrica/impl/bq;->b:Lcom/yandex/metrica/impl/al;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/al;->start()V

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .line 99
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bq;->d()Lcom/yandex/metrica/impl/bo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v1, p0, Lcom/yandex/metrica/impl/bq;->b:Lcom/yandex/metrica/impl/al;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/al;->a(Lcom/yandex/metrica/impl/an;)V

    :cond_0
    return-void
.end method

.method b()V
    .locals 0

    return-void
.end method

.method public close()V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/yandex/metrica/impl/bq;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 62
    :try_start_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/bq;->c:Z

    if-nez v1, :cond_1

    .line 63
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bq;->b()V

    .line 65
    iget-object v1, p0, Lcom/yandex/metrica/impl/bq;->b:Lcom/yandex/metrica/impl/al;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/al;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 66
    iget-object v1, p0, Lcom/yandex/metrica/impl/bq;->b:Lcom/yandex/metrica/impl/al;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/al;->a()V

    :cond_0
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, Lcom/yandex/metrica/impl/bq;->c:Z

    .line 73
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method d()Lcom/yandex/metrica/impl/bo;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/bq;->e:Lcom/yandex/metrica/impl/ob/kk;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bq;->d:Lcom/yandex/metrica/impl/ob/af;

    iget-object v2, p0, Lcom/yandex/metrica/impl/bq;->d:Lcom/yandex/metrica/impl/ob/af;

    invoke-interface {v2}, Lcom/yandex/metrica/impl/ob/af;->a()Lcom/yandex/metrica/impl/ob/t;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/kk;->a(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/bo;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/yandex/metrica/impl/bq;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 82
    :try_start_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/bq;->c:Z

    if-nez v1, :cond_0

    .line 83
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bq;->f()V

    .line 84
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bq;->b()V

    .line 86
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method f()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/yandex/metrica/impl/bq;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 91
    :try_start_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/bq;->c:Z

    if-nez v1, :cond_0

    .line 92
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bq;->a()V

    .line 94
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method g()Lcom/yandex/metrica/impl/ob/af;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/impl/bq;->d:Lcom/yandex/metrica/impl/ob/af;

    return-object v0
.end method
