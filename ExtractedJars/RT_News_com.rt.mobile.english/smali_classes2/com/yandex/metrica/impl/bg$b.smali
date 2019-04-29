.class Lcom/yandex/metrica/impl/bg$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final b:Lcom/yandex/metrica/impl/bg$d;

.field c:Z

.field final synthetic d:Lcom/yandex/metrica/impl/bg;


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/bg;Lcom/yandex/metrica/impl/bg$d;)V
    .locals 1

    .line 66
    iput-object p1, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p2, p0, Lcom/yandex/metrica/impl/bg$b;->b:Lcom/yandex/metrica/impl/bg$d;

    .line 68
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class p2, Lcom/yandex/metrica/impl/au;

    new-instance v0, Lcom/yandex/metrica/impl/bg$b$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/bg$b$1;-><init>(Lcom/yandex/metrica/impl/bg$b;)V

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v0

    .line 68
    invoke-virtual {p1, p0, p2, v0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/bg;Lcom/yandex/metrica/impl/bg$d;B)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/bg$b;-><init>(Lcom/yandex/metrica/impl/bg;Lcom/yandex/metrica/impl/bg$d;)V

    return-void
.end method

.method private a(Lcom/yandex/metrica/IMetricaService;Lcom/yandex/metrica/impl/bg$d;)Z
    .locals 2

    .line 111
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bg;->b(Lcom/yandex/metrica/impl/bg;)Lcom/yandex/metrica/impl/v;

    move-result-object v0

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/bg$d;->b()Lcom/yandex/metrica/impl/h;

    move-result-object v1

    invoke-static {p2}, Lcom/yandex/metrica/impl/bg$d;->a(Lcom/yandex/metrica/impl/bg$d;)Lcom/yandex/metrica/impl/bc;

    move-result-object p2

    invoke-interface {v0, p1, v1, p2}, Lcom/yandex/metrica/impl/v;->a(Lcom/yandex/metrica/IMetricaService;Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    const/4 v0, 0x0

    :cond_0
    const/4 v1, 0x0

    .line 81
    :try_start_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v2}, Lcom/yandex/metrica/impl/bg;->a(Lcom/yandex/metrica/impl/bg;)Lcom/yandex/metrica/impl/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/af;->e()Lcom/yandex/metrica/IMetricaService;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 82
    iget-object v3, p0, Lcom/yandex/metrica/impl/bg$b;->b:Lcom/yandex/metrica/impl/bg$d;

    invoke-direct {p0, v2, v3}, Lcom/yandex/metrica/impl/bg$b;->a(Lcom/yandex/metrica/IMetricaService;Lcom/yandex/metrica/impl/bg$d;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    .line 98
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;)V

    return-object v1

    .line 86
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bg$b;->b()Z

    move-result v2

    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_2

    .line 89
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/bg$b;->c:Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_2

    const/4 v2, 0x3

    if-lt v0, v2, :cond_0

    .line 98
    :cond_2
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;)V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;)V

    .line 99
    throw v0

    .line 98
    :catch_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;)V

    return-object v1
.end method

.method b()Z
    .locals 5

    .line 104
    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bg;->a(Lcom/yandex/metrica/impl/bg;)Lcom/yandex/metrica/impl/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/af;->a()V

    .line 1120
    iget-object v0, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bg;->c(Lcom/yandex/metrica/impl/bg;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 1121
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v1}, Lcom/yandex/metrica/impl/bg;->a(Lcom/yandex/metrica/impl/bg;)Lcom/yandex/metrica/impl/af;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/af;->d()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 1123
    :try_start_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v1}, Lcom/yandex/metrica/impl/bg;->c(Lcom/yandex/metrica/impl/bg;)Ljava/lang/Object;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Ljava/lang/Object;->wait(JI)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1125
    :catch_0
    :try_start_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v1}, Lcom/yandex/metrica/impl/bg;->c(Lcom/yandex/metrica/impl/bg;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 1126
    iget-object v1, p0, Lcom/yandex/metrica/impl/bg$b;->d:Lcom/yandex/metrica/impl/bg;

    invoke-static {v1}, Lcom/yandex/metrica/impl/bg;->d(Lcom/yandex/metrica/impl/bg;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 1129
    :cond_0
    :goto_0
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 60
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bg$b;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
