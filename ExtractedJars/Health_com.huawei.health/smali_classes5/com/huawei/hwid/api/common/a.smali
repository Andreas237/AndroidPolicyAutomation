.class public final Lcom/huawei/hwid/api/common/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# static fields
.field private static b:Lcom/huawei/hwid/api/common/a;

.field private static final e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final g:Ljava/util/concurrent/ExecutorService;


# instance fields
.field a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private c:Lcom/huawei/cloudservice/b;

.field private d:Landroid/content/Context;

.field private final f:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/huawei/hwid/api/common/b;>;"
        }
    .end annotation
.end field

.field private h:Landroid/os/Handler;

.field private i:Ljava/util/concurrent/CountDownLatch;

.field private final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 91
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/huawei/hwid/api/common/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 100
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/api/common/a;->g:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    .line 136
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 155
    new-instance v0, Lcom/huawei/hwid/api/common/a$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwid/api/common/a$1;-><init>(Lcom/huawei/hwid/api/common/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->h:Landroid/os/Handler;

    .line 226
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->i:Ljava/util/concurrent/CountDownLatch;

    .line 230
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 262
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/api/common/a;->k:I

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->d:Landroid/content/Context;

    .line 64
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;
    .locals 4

    .line 45
    if-nez p0, :cond_0

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_0
    const-class v2, Lcom/huawei/hwid/api/common/a;

    monitor-enter v2

    .line 49
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/api/common/a;->b:Lcom/huawei/hwid/api/common/a;

    if-nez v0, :cond_1

    .line 50
    const-string v0, "AIDLClientManager"

    const-string v1, "AIDLClientManager init"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    new-instance v0, Lcom/huawei/hwid/api/common/a;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/api/common/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwid/api/common/a;->b:Lcom/huawei/hwid/api/common/a;

    .line 53
    :cond_1
    sget-object v0, Lcom/huawei/hwid/api/common/a;->b:Lcom/huawei/hwid/api/common/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 54
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/a;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->c()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/a;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->d()V

    return-void
.end method

.method private c()V
    .locals 6

    .line 120
    const-string v0, "AIDLClientManager"

    const-string v1, "doTask"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    iget-object v2, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    monitor-enter v2

    .line 123
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwid/api/common/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 125
    :try_start_1
    sget-object v0, Lcom/huawei/hwid/api/common/a;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    goto :goto_0

    .line 126
    :catch_0
    move-exception v4

    .line 127
    const-string v0, "AIDLClientManager"

    const-string v1, "Execute submit task failed!"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    goto :goto_0

    .line 130
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 131
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/api/common/a;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->j()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 198
    const-string v0, "AIDLClientManager"

    const-string v1, "startService"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 200
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->e()V

    .line 201
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->f()V

    .line 202
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwid/api/common/a;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->i()V

    return-void
.end method

.method private e()V
    .locals 4

    .line 208
    const-string v0, "AIDLClientManager"

    const-string v1, "begin to bindService"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 210
    const-string v0, "com.huawei.hwid.ICloudService"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 211
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 213
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v3

    .line 214
    if-nez v3, :cond_0

    .line 216
    const-string v0, "AIDLClientManager"

    const-string v1, "bind service failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    :cond_0
    goto :goto_0

    .line 218
    :catch_0
    move-exception v3

    .line 219
    const-string v0, "AIDLClientManager"

    const-string v1, "bind service exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwid/api/common/a;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->h()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/hwid/api/common/a;)Ljava/util/concurrent/CountDownLatch;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->i:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 241
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->i:Ljava/util/concurrent/CountDownLatch;

    .line 242
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwid/api/common/a$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/api/common/a$2;-><init>(Lcom/huawei/hwid/api/common/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 256
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 257
    return-void
.end method

.method private g()V
    .locals 2

    .line 271
    const-string v0, "AIDLClientManager"

    const-string v1, "onServiceConnectedTimeout"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 274
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->i()V

    .line 275
    iget v0, p0, Lcom/huawei/hwid/api/common/a;->k:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 276
    iget v0, p0, Lcom/huawei/hwid/api/common/a;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hwid/api/common/a;->k:I

    .line 277
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->d()V

    goto :goto_0

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 281
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->h:Landroid/os/Handler;

    const/16 v1, 0xbbd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 285
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/hwid/api/common/a;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->g()V

    return-void
.end method

.method private h()V
    .locals 6

    .line 291
    const-string v0, "AIDLClientManager"

    const-string v1, "onBindServiceFailed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    iget-object v3, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    monitor-enter v3

    .line 293
    const/4 v4, 0x0

    .line 294
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/api/common/b;

    if-eqz v4, :cond_0

    .line 295
    sget-object v0, Lcom/huawei/hwid/api/common/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 296
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "start APK service ERROR"

    const/16 v2, 0x28

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/huawei/hwid/api/common/b;->a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 298
    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 299
    :goto_1
    return-void
.end method

.method private i()V
    .locals 3

    .line 306
    const-string v0, "AIDLClientManager"

    const-string v1, "unbind Service"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->d:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 311
    goto :goto_0

    .line 309
    :catch_0
    move-exception v2

    .line 310
    const-string v0, "AIDLClientManager"

    const-string v1, "unbind service error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    :goto_0
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/a;->j()V

    .line 313
    return-void
.end method

.method private j()V
    .locals 3

    .line 316
    iget-object v1, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    monitor-enter v1

    .line 317
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->c:Lcom/huawei/cloudservice/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 319
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Lcom/huawei/cloudservice/b;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->c:Lcom/huawei/cloudservice/b;

    return-object v0
.end method

.method public a(Lcom/huawei/hwid/api/common/b;)V
    .locals 4

    .line 108
    const-string v0, "AIDLClientManager"

    const-string v1, "addTask:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    iget-object v2, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    monitor-enter v2

    .line 110
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/api/common/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 111
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 113
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->h:Landroid/os/Handler;

    const/16 v1, 0xbb9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 114
    return-void
.end method

.method public b()V
    .locals 4

    .line 79
    const-string v0, "AIDLClientManager"

    const-string v1, "sendTaskFinishMsg"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    iget-object v2, p0, Lcom/huawei/hwid/api/common/a;->f:Ljava/util/Queue;

    monitor-enter v2

    .line 81
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/api/common/a;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->h:Landroid/os/Handler;

    const/16 v1, 0xbbc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 85
    :goto_0
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 323
    const-string v0, "AIDLClientManager"

    const-string v1, "onServiceConnected"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/api/common/a;->k:I

    .line 325
    invoke-static {p2}, Lcom/huawei/cloudservice/b$a;->a(Landroid/os/IBinder;)Lcom/huawei/cloudservice/b;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/a;->c:Lcom/huawei/cloudservice/b;

    .line 326
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->i:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 327
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 328
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->h:Landroid/os/Handler;

    const/16 v1, 0xbba

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 329
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 333
    const-string v0, "AIDLClientManager"

    const-string v1, "onServiceDisconnected"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/api/common/a;->k:I

    .line 335
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a;->h:Landroid/os/Handler;

    const/16 v1, 0xbbb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 336
    return-void
.end method
