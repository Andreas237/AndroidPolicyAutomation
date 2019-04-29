.class public Lcom/yandex/metrica/impl/ob/lx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/lx$a;
    }
.end annotation


# instance fields
.field private volatile a:J

.field private b:Lcom/yandex/metrica/impl/ob/fj;

.field private c:Lcom/yandex/metrica/impl/ob/ma;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lx;-><init>()V

    return-void
.end method

.method public static a()Lcom/yandex/metrica/impl/ob/lx;
    .locals 1

    .line 29
    sget-object v0, Lcom/yandex/metrica/impl/ob/lx$a;->a:Lcom/yandex/metrica/impl/ob/lx;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(JLjava/lang/Long;)V
    .locals 6
    .param p3    # Ljava/lang/Long;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 51
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lx;->c:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ma;->a()J

    move-result-wide v0

    sub-long v2, p1, v0

    const-wide/16 v0, 0x3e8

    div-long/2addr v2, v0

    iput-wide v2, p0, Lcom/yandex/metrica/impl/ob/lx;->a:J

    .line 53
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->b(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 56
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/lx;->c:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v2}, Lcom/yandex/metrica/impl/ob/ma;->a()J

    move-result-wide v2

    sub-long v4, p1, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    .line 57
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    cmp-long p3, p1, v3

    if-lez p3, :cond_0

    move v0, v1

    :cond_0
    invoke-virtual {v2, v0}, Lcom/yandex/metrica/impl/ob/fj;->c(Z)Lcom/yandex/metrica/impl/ob/fj;

    goto :goto_0

    .line 59
    :cond_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fj;->c(Z)Lcom/yandex/metrica/impl/ob/fj;

    .line 62
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    iget-wide p2, p0, Lcom/yandex/metrica/impl/ob/lx;->a:J

    invoke-virtual {p1, p2, p3}, Lcom/yandex/metrica/impl/ob/fj;->a(J)Lcom/yandex/metrica/impl/ob/fj;

    .line 63
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 50
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 44
    :try_start_0
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p1

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/fj;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    .line 47
    new-instance p1, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/lx;->a(Lcom/yandex/metrica/impl/ob/fj;Lcom/yandex/metrica/impl/ob/ma;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 42
    monitor-exit p0

    throw p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/fj;Lcom/yandex/metrica/impl/ob/ma;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 83
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    .line 84
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fj;->c(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/lx;->a:J

    .line 85
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/lx;->c:Lcom/yandex/metrica/impl/ob/ma;

    return-void
.end method

.method public declared-synchronized b()J
    .locals 2

    monitor-enter p0

    .line 39
    :try_start_0
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/lx;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    .line 69
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->c(Z)Lcom/yandex/metrica/impl/ob/fj;

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fj;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 68
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()Z
    .locals 2

    monitor-enter p0

    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lx;->b:Lcom/yandex/metrica/impl/ob/fj;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->b(Z)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
