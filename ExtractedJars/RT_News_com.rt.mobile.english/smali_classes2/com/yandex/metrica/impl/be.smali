.class public Lcom/yandex/metrica/impl/be;
.super Lcom/yandex/metrica/impl/bq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/bq<",
        "Lcom/yandex/metrica/impl/ob/ab;",
        ">;"
    }
.end annotation


# instance fields
.field private d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/kk;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/kk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/bq;-><init>(Lcom/yandex/metrica/impl/ob/af;Lcom/yandex/metrica/impl/ob/kk;)V

    .line 23
    new-instance p1, Lcom/yandex/metrica/impl/be$1;

    invoke-direct {p1, p0}, Lcom/yandex/metrica/impl/be$1;-><init>(Lcom/yandex/metrica/impl/be;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/be;->d:Ljava/lang/Runnable;

    return-void
.end method

.method private a(Lcom/yandex/metrica/impl/az$a;Ljava/lang/Long;)V
    .locals 3

    .line 50
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->g()Lcom/yandex/metrica/impl/ob/af;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->m()Lcom/yandex/metrica/impl/ob/es;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/es;->a(Ljava/lang/Long;)Ljava/util/List;

    move-result-object p2

    .line 52
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    sget-object v0, Lcom/yandex/metrica/impl/l;->a:Landroid/content/ContentValues;

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentValues;

    .line 60
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->g()Lcom/yandex/metrica/impl/ob/af;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/az$a;->a(Lcom/yandex/metrica/impl/ob/ab;)Lcom/yandex/metrica/impl/az;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    iget-object v2, p0, Lcom/yandex/metrica/impl/be;->b:Lcom/yandex/metrica/impl/al;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/az;->a(Landroid/content/ContentValues;)Lcom/yandex/metrica/impl/l;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/yandex/metrica/impl/al;->a(Lcom/yandex/metrica/impl/an;)V

    goto :goto_0

    :catch_0
    return-void

    :cond_1
    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    .line 36
    invoke-super {p0}, Lcom/yandex/metrica/impl/bq;->a()V

    .line 37
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->g()Lcom/yandex/metrica/impl/ob/af;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-static {}, Lcom/yandex/metrica/impl/ay;->G()Lcom/yandex/metrica/impl/az$a;

    move-result-object v0

    const-wide/16 v1, -0x2

    .line 41
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 39
    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/be;->a(Lcom/yandex/metrica/impl/az$a;Ljava/lang/Long;)V

    .line 45
    invoke-static {}, Lcom/yandex/metrica/impl/az;->K()Lcom/yandex/metrica/impl/az$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/be;->a(Lcom/yandex/metrica/impl/az$a;Ljava/lang/Long;)V

    :cond_0
    return-void
.end method

.method b()V
    .locals 2

    .line 70
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->g()Lcom/yandex/metrica/impl/ob/af;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->n()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/be;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c()V
    .locals 5

    .line 83
    iget-object v0, p0, Lcom/yandex/metrica/impl/be;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 84
    :try_start_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/be;->c:Z

    if-nez v1, :cond_0

    .line 85
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->b()V

    .line 1074
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->g()Lcom/yandex/metrica/impl/ob/af;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->P()I

    move-result v1

    if-lez v1, :cond_0

    .line 1075
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1076
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->g()Lcom/yandex/metrica/impl/ob/af;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->P()I

    move-result v2

    int-to-long v2, v2

    .line 1075
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    .line 1078
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/be;->g()Lcom/yandex/metrica/impl/ob/af;

    move-result-object v3

    check-cast v3, Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ab;->n()Landroid/os/Handler;

    move-result-object v3

    iget-object v4, p0, Lcom/yandex/metrica/impl/be;->d:Ljava/lang/Runnable;

    invoke-virtual {v3, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 88
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
