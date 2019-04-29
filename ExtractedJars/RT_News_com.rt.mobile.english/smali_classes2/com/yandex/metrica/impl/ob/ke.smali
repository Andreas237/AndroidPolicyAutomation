.class public Lcom/yandex/metrica/impl/ob/ke;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ke$a;,
        Lcom/yandex/metrica/impl/ob/ke$c;,
        Lcom/yandex/metrica/impl/ob/ke$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/ServiceConnection;

.field private final b:Landroid/os/Handler;

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/ke$c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;

.field private e:Z

.field private f:Ljava/net/ServerSocket;

.field private final g:Lcom/yandex/metrica/impl/ob/kf;

.field private h:Lcom/yandex/metrica/impl/ob/kj;

.field private i:Ljava/lang/Thread;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Lcom/yandex/metrica/impl/ob/ke$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/ke$1;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->a:Landroid/content/ServiceConnection;

    .line 149
    new-instance v0, Lcom/yandex/metrica/impl/ob/ke$2;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/ob/ke$2;-><init>(Lcom/yandex/metrica/impl/ob/ke;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->b:Landroid/os/Handler;

    .line 218
    new-instance v0, Lcom/yandex/metrica/impl/ob/ke$3;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/ke$3;-><init>(Lcom/yandex/metrica/impl/ob/ke;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->c:Ljava/util/HashMap;

    .line 235
    new-instance v0, Lcom/yandex/metrica/impl/ob/kf;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/kf;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->g:Lcom/yandex/metrica/impl/ob/kf;

    .line 242
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    .line 1247
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/s;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ke$5;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/ke$5;-><init>(Lcom/yandex/metrica/impl/ob/ke;)V

    .line 1248
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v1

    new-instance v2, Lcom/yandex/metrica/impl/ob/ke$4;

    invoke-direct {v2, p0}, Lcom/yandex/metrica/impl/ob/ke$4;-><init>(Lcom/yandex/metrica/impl/ob/ke;)V

    .line 1252
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/l$a;->a(Lcom/yandex/metrica/impl/ob/i;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v1

    .line 1256
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v1

    .line 1247
    invoke-virtual {p1, p0, v0, v1}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 1257
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/o;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ke$6;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/ke$6;-><init>(Lcom/yandex/metrica/impl/ob/ke;)V

    .line 1258
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v1

    .line 1262
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v1

    .line 1257
    invoke-virtual {p1, p0, v0, v1}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 1263
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/m;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ke$7;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/ke$7;-><init>(Lcom/yandex/metrica/impl/ob/ke;)V

    .line 1264
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v1

    .line 1268
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v1

    .line 1263
    invoke-virtual {p1, p0, v0, v1}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 1269
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/n;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ke$8;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/ke$8;-><init>(Lcom/yandex/metrica/impl/ob/ke;)V

    .line 1270
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v1

    .line 1274
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v1

    .line 1269
    invoke-virtual {p1, p0, v0, v1}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 1275
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/q;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ke$9;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/ke$9;-><init>(Lcom/yandex/metrica/impl/ob/ke;)V

    .line 1276
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v1

    .line 1281
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v1

    .line 1275
    invoke-virtual {p1, p0, v0, v1}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/ServiceConnection;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ke;->a:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 471
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "uri"

    .line 472
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    invoke-static {p2}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "socket_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/Context;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(I)Ljava/util/HashMap;
    .locals 0

    .line 57
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/ke;->c(I)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ob/ke;)Lcom/yandex/metrica/impl/ob/kj;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ke;->h:Lcom/yandex/metrica/impl/ob/kj;

    return-object p0
.end method

.method private static c(I)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 420
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "port"

    .line 421
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/yandex/metrica/impl/ob/ke;)Lcom/yandex/metrica/impl/ob/kf;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ke;->g:Lcom/yandex/metrica/impl/ob/kf;

    return-object p0
.end method


# virtual methods
.method a(I)Ljava/net/ServerSocket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 416
    new-instance v0, Ljava/net/ServerSocket;

    invoke-direct {v0, p1}, Ljava/net/ServerSocket;-><init>(I)V

    return-object v0
.end method

.method public a()V
    .locals 5

    .line 285
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ke;->e:Z

    if-eqz v0, :cond_0

    .line 286
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ke;->b()V

    .line 288
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ke;->b:Landroid/os/Handler;

    const/16 v2, 0x64

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ke;->h:Lcom/yandex/metrica/impl/ob/kj;

    iget-wide v3, v3, Lcom/yandex/metrica/impl/ob/kj;->a:J

    .line 289
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    .line 288
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/kj;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 316
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke;->h:Lcom/yandex/metrica/impl/ob/kj;

    return-void
.end method

.method public b()V
    .locals 2

    .line 295
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->b:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    .line 304
    :try_start_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ke;->e:Z

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->h:Lcom/yandex/metrica/impl/ob/kj;

    if-eqz v0, :cond_0

    .line 307
    iput-boolean v1, p0, Lcom/yandex/metrica/impl/ob/ke;->e:Z

    .line 308
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ke;->d()V

    const-string v0, "YMM-IB"

    .line 309
    invoke-static {v0, p0}, Lcom/yandex/metrica/impl/ob/lt;->a(Ljava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->i:Ljava/lang/Thread;

    .line 310
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->i:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 312
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 303
    monitor-exit p0

    throw v0
.end method

.method d()V
    .locals 4
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 321
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    const-class v2, Lcom/yandex/metrica/MetricaService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER"

    .line 322
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 324
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ke;->a:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v0

    const-string v1, "socket_bind_has_failed"

    invoke-interface {v0, v1}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    .line 330
    :catch_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v0

    const-string v1, "socket_bind_has_thrown_exception"

    invoke-interface {v0, v1}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized e()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 337
    :try_start_0
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ke;->e:Z

    .line 338
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->i:Ljava/lang/Thread;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 339
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->i:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 340
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ke;->i:Ljava/lang/Thread;

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->f:Ljava/net/ServerSocket;

    if-eqz v0, :cond_1

    .line 343
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->f:Ljava/net/ServerSocket;

    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V

    .line 344
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ke;->f:Ljava/net/ServerSocket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 348
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 336
    monitor-exit p0

    throw v0

    .line 349
    :catch_0
    monitor-exit p0

    return-void
.end method

.method f()Ljava/net/ServerSocket;
    .locals 6
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 389
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->h:Lcom/yandex/metrica/impl/ob/kj;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/kj;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :catch_0
    :goto_0
    if-nez v1, :cond_1

    .line 392
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 394
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_0

    .line 396
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/yandex/metrica/impl/ob/ke;->a(I)Ljava/net/ServerSocket;

    move-result-object v2
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    move-object v1, v2

    goto :goto_1

    :catch_1
    move-object v2, v3

    goto :goto_2

    :catch_2
    :cond_0
    :goto_1
    move-object v2, v3

    goto :goto_0

    .line 400
    :catch_3
    :goto_2
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    invoke-static {v3}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v3

    const-string v4, "socket_port_already_in_use"

    .line 401
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lcom/yandex/metrica/impl/ob/ke;->c(I)Ljava/util/HashMap;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public run()V
    .locals 9

    .line 353
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ke;->f()Ljava/net/ServerSocket;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ke;->f:Ljava/net/ServerSocket;

    const/16 v0, 0x1a

    .line 354
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x9d26

    .line 355
    invoke-static {v1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 357
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ke;->f:Ljava/net/ServerSocket;

    if-eqz v1, :cond_a

    .line 358
    :catch_0
    :cond_1
    :goto_0
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/ke;->e:Z

    if-eqz v1, :cond_a

    .line 360
    monitor-enter p0

    .line 361
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ke;->f:Ljava/net/ServerSocket;

    .line 362
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 366
    :try_start_1
    invoke-virtual {v1}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 367
    :try_start_2
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 368
    invoke-static {v1}, Landroid/net/TrafficStats;->tagSocket(Ljava/net/Socket;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_2
    const/16 v3, 0x3e8

    .line 1428
    :try_start_3
    invoke-virtual {v1, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 1430
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1432
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1433
    :try_start_4
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 1434
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_6

    const-string v5, "GET /"

    .line 1435
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x2f

    .line 1436
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    const/16 v6, 0x20

    .line 1437
    invoke-virtual {v2, v6, v5}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-lez v6, :cond_5

    .line 1439
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1442
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 1443
    :goto_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    const-string v7, ": "

    .line 1444
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x0

    .line 1445
    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v7, v7, 0x2

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1449
    :cond_3
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ke;->c:Ljava/util/HashMap;

    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/yandex/metrica/impl/ob/ke$c;

    if-eqz v3, :cond_4

    .line 1451
    invoke-virtual {v3, v5, v1}, Lcom/yandex/metrica/impl/ob/ke$c;->a(Landroid/net/Uri;Ljava/net/Socket;)Lcom/yandex/metrica/impl/ob/ke$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ke$b;->a()V

    goto :goto_2

    :cond_4
    const-string v3, "request_to_unknown_path"

    .line 1453
    invoke-direct {p0, v3, v2}, Lcom/yandex/metrica/impl/ob/ke;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    const-string v3, "invalid_route"

    .line 1456
    invoke-direct {p0, v3, v2}, Lcom/yandex/metrica/impl/ob/ke;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1465
    :cond_6
    :goto_2
    :try_start_5
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :catch_1
    move-exception v2

    goto :goto_3

    :catchall_0
    move-exception v3

    move-object v4, v2

    move-object v2, v3

    goto :goto_6

    :catch_2
    move-exception v3

    move-object v4, v2

    move-object v2, v3

    .line 1462
    :goto_3
    :try_start_6
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ke;->d:Landroid/content/Context;

    invoke-static {v3}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v3

    const-string v5, "LocalHttpServer exception"

    invoke-interface {v3, v5, v2}, Lcom/yandex/metrica/b;->reportError(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    :goto_4
    if-eqz v1, :cond_1

    .line 376
    :goto_5
    :try_start_7
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    goto/16 :goto_0

    :catchall_1
    move-exception v2

    :goto_6
    if-eqz v4, :cond_8

    .line 1465
    :try_start_8
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 1467
    :cond_8
    throw v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v1, v2

    :goto_7
    if-eqz v1, :cond_9

    .line 376
    :try_start_9
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3

    .line 381
    :catch_3
    :cond_9
    throw v0

    :catch_4
    move-object v1, v2

    :catch_5
    if-eqz v1, :cond_1

    goto :goto_5

    :catchall_4
    move-exception v0

    .line 362
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    throw v0

    :cond_a
    return-void
.end method
