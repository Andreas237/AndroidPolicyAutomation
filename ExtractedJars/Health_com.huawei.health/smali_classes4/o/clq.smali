.class public Lo/clq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clt;
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/clq$d;,
        Lo/clq$e;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private a:Ljava/util/concurrent/ExecutorService;

.field private b:Lo/clg;

.field private d:Ljava/util/concurrent/ExecutorService;

.field private e:Ljava/lang/Object;

.field private h:Lo/clq$d;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/clq;->e:Ljava/lang/Object;

    .line 115
    new-instance v0, Lo/clq$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/clq$d;-><init>(Lo/clq$4;)V

    iput-object v0, p0, Lo/clq;->h:Lo/clq$d;

    .line 161
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiHealthNativeAPI create "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    .line 163
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    .line 164
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$4;

    invoke-direct {v1, p0}, Lo/clq$4;-><init>(Lo/clq;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 170
    return-void
.end method

.method synthetic constructor <init>(Lo/clq$4;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lo/clq;-><init>()V

    return-void
.end method

.method static synthetic b()Landroid/content/Context;
    .locals 1

    .line 81
    sget-object v0, Lo/clq;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/clq;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lo/clq;->c()V

    return-void
.end method

.method private static c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 6

    .line 173
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 174
    const/4 v0, 0x0

    invoke-virtual {v4, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v5

    .line 175
    if-nez v5, :cond_0

    .line 176
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService() resolveInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 179
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService() resolveInfo.size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    const/4 v0, 0x0

    return-object v0

    .line 182
    :cond_1
    return-object p1
.end method

.method static synthetic c(Lo/clq;)Lo/clg;
    .locals 1

    .line 81
    iget-object v0, p0, Lo/clq;->b:Lo/clg;

    return-object v0
.end method

.method private declared-synchronized c()V
    .locals 11

    monitor-enter p0

    .line 188
    :try_start_0
    iget-object v0, p0, Lo/clq;->b:Lo/clg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 190
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 191
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService()! time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealthservice.HiHealthService"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 193
    const-string v0, "com.huawei.health"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 194
    sget-object v0, Lo/clq;->c:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/clq;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v7

    .line 195
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 196
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService() explicitIntent = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    monitor-exit p0

    return-void

    .line 199
    :cond_0
    sget-object v0, Lo/clq;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-virtual {v0, v7, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 200
    iget-object v8, p0, Lo/clq;->e:Ljava/lang/Object;

    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 202
    :try_start_1
    iget-object v0, p0, Lo/clq;->b:Lo/clg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 203
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService bind mApiAidl is not null = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/clq;->b:Lo/clg;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 204
    monitor-exit v8

    monitor-exit p0

    return-void

    .line 206
    :cond_1
    const/4 v9, 0x1

    .line 207
    :goto_0
    if-eqz v9, :cond_2

    .line 208
    :try_start_2
    iget-object v0, p0, Lo/clq;->e:Ljava/lang/Object;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 209
    const/4 v9, 0x0

    goto :goto_0

    .line 213
    :cond_2
    goto :goto_1

    .line 211
    :catch_0
    move-exception v9

    .line 212
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService() InterruptedException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 214
    :goto_1
    monitor-exit v8

    goto :goto_2

    :catchall_0
    move-exception v10

    monitor-exit v8

    :try_start_4
    throw v10

    .line 215
    :goto_2
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindService bind over mApiAidl is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/clq;->b:Lo/clg;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " end time is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 217
    :cond_3
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method public static e(Landroid/content/Context;)Lo/clq;
    .locals 1

    .line 156
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/clq;->c:Landroid/content/Context;

    .line 157
    sget-object v0, Lo/clq$e;->e:Lo/clq;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 1381
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisteMyBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    const-string v0, "com.huawei.health"

    sget-object v1, Lo/clq;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1383
    sget-object v0, Lo/clq;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/clq;->h:Lo/clq$d;

    invoke-static {v0, v1}, Lo/cls;->d(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V

    .line 1385
    :cond_0
    return-void
.end method

.method private i()V
    .locals 4

    .line 1374
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerMyBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1375
    const-string v0, "com.huawei.health"

    sget-object v1, Lo/clq;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1376
    sget-object v0, Lo/clq;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/clq;->h:Lo/clq$d;

    invoke-static {}, Lo/clr;->a()Landroid/content/IntentFilter;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cls;->d(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1378
    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 8

    .line 1356
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1357
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHiHealthVersionCode can\'t be called in main thread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1360
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1361
    const/4 v6, -0x1

    .line 1362
    invoke-direct {p0}, Lo/clq;->c()V

    .line 1364
    :try_start_0
    iget-object v0, p0, Lo/clq;->b:Lo/clg;

    invoke-interface {v0}, Lo/clg;->e()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 1367
    goto :goto_0

    .line 1365
    :catch_0
    move-exception v7

    .line 1366
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHiHealthVersionCode e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1369
    :goto_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHiHealthVersion version = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1370
    return v6
.end method

.method public a(ILo/cmg;)V
    .locals 2

    .line 379
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$21;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$21;-><init>(Lo/clq;ILo/cmg;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 409
    return-void
.end method

.method public a(Ljava/util/List;Lo/cmg;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/cmg;)V"
        }
    .end annotation

    .line 311
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$24;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$24;-><init>(Lo/clq;Ljava/util/List;Lo/cmg;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 339
    return-void
.end method

.method public a(Lo/clz;)V
    .locals 2

    .line 1021
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$12;

    invoke-direct {v1, p0, p1}, Lo/clq$12;-><init>(Lo/clq;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1048
    return-void
.end method

.method public a(Lo/cmc;)V
    .locals 2

    .line 833
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$8;

    invoke-direct {v1, p0, p1}, Lo/clq$8;-><init>(Lo/clq;Lo/cmc;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 854
    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 8

    .line 1298
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1299
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreference can\'t be called in main thread key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1302
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1303
    const/4 v6, 0x0

    .line 1304
    invoke-direct {p0}, Lo/clq;->c()V

    .line 1306
    :try_start_0
    iget-object v0, p0, Lo/clq;->b:Lo/clg;

    invoke-interface {v0, p1}, Lo/clg;->c(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1309
    goto :goto_0

    .line 1307
    :catch_0
    move-exception v7

    .line 1308
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreference e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1311
    :goto_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreference totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1312
    return-object v6
.end method

.method public b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V
    .locals 2

    .line 465
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$1;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$1;-><init>(Lo/clq;Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 497
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiUserInfo;Lo/clz;)V
    .locals 2

    .line 989
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$15;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$15;-><init>(Lo/clq;Lcom/huawei/hihealth/HiUserInfo;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1017
    return-void
.end method

.method public b(Ljava/util/List;Lo/clx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiAggregateOption;>;Lo/clx;)V"
        }
    .end annotation

    .line 502
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$5;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$5;-><init>(Lo/clq;Ljava/util/List;Lo/clx;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 535
    return-void
.end method

.method public b(Ljava/util/List;Lo/clz;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/clz;)V"
        }
    .end annotation

    .line 1073
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$20;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$20;-><init>(Lo/clq;Ljava/util/List;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1098
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiUserPreference;Z)Z
    .locals 8

    .line 1278
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1279
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference can\'t be called in main thread needNotifyChange = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1282
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference needNotifyChange = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1283
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1284
    const/4 v6, 0x0

    .line 1285
    invoke-direct {p0}, Lo/clq;->c()V

    .line 1287
    :try_start_0
    iget-object v0, p0, Lo/clq;->b:Lo/clg;

    invoke-interface {v0, p1, p2}, Lo/clg;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 1290
    goto :goto_0

    .line 1288
    :catch_0
    move-exception v7

    .line 1289
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1292
    :goto_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1293
    return v6
.end method

.method public c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V
    .locals 2

    .line 584
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$3;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$3;-><init>(Lo/clq;Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 607
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V
    .locals 2

    .line 539
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$2;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$2;-><init>(Lo/clq;Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 580
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/cme;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List<Ljava/lang/Integer;>;Lo/cme;)V"
        }
    .end annotation

    .line 758
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$9;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/clq$9;-><init>(Lo/clq;Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/cme;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 779
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V
    .locals 2

    .line 1052
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$14;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$14;-><init>(Lo/clq;Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1069
    return-void
.end method

.method public c(Lo/clz;)V
    .locals 2

    .line 1180
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$19;

    invoke-direct {v1, p0, p1}, Lo/clq$19;-><init>(Lo/clq;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1208
    return-void
.end method

.method public c(Lo/cmb;)V
    .locals 2

    .line 1401
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$23;

    invoke-direct {v1, p0, p1}, Lo/clq$23;-><init>(Lo/clq;Lo/cmb;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1424
    return-void
.end method

.method public d(IILo/clz;)V
    .locals 2

    .line 1243
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$25;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/clq$25;-><init>(Lo/clq;IILo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1269
    return-void
.end method

.method public d(ILcom/huawei/hihealth/HiTimeInterval;Lo/cmc;)V
    .locals 2

    .line 966
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$13;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/clq$13;-><init>(Lo/clq;ILcom/huawei/hihealth/HiTimeInterval;Lo/cmc;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 985
    return-void
.end method

.method public d(Lcom/huawei/hihealth/HiAppInfo;)V
    .locals 2

    .line 221
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$10;

    invoke-direct {v1, p0, p1}, Lo/clq$10;-><init>(Lo/clq;Lcom/huawei/hihealth/HiAppInfo;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 235
    return-void
.end method

.method public d()Z
    .locals 7

    .line 1317
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealthservice.HiHealthService"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1318
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1319
    sget-object v0, Lo/clq;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 1320
    const/4 v0, 0x0

    invoke-virtual {v5, v4, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    .line 1321
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 1322
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHiHealthServiceExist() resolveInfo == null || resolveInfo.size () != 1 false "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1323
    const/4 v0, 0x0

    return v0

    .line 1326
    :cond_1
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHiHealthServiceExist() true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1327
    const/4 v0, 0x1

    return v0
.end method

.method public e()V
    .locals 2

    .line 1102
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$18;

    invoke-direct {v1, p0}, Lo/clq$18;-><init>(Lo/clq;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1113
    return-void
.end method

.method public e(ILjava/util/List;Lo/clz;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;Lo/clz;)V"
        }
    .end annotation

    .line 1212
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$22;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/clq$22;-><init>(Lo/clq;ILjava/util/List;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1239
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiAccountInfo;Lo/clz;)V
    .locals 2

    .line 1117
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$16;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$16;-><init>(Lo/clq;Lcom/huawei/hihealth/HiAccountInfo;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1145
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
    .locals 2

    .line 612
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$7;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$7;-><init>(Lo/clq;Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 644
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/cma;)V
    .locals 2

    .line 692
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$6;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$6;-><init>(Lo/clq;Lcom/huawei/hihealth/HiDataUpdateOption;Lo/cma;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 713
    return-void
.end method

.method public e(Ljava/util/List;Lo/cmh;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/cmh;)V"
        }
    .end annotation

    .line 439
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    iget-object v0, p0, Lo/clq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$29;

    invoke-direct {v1, p0, p1, p2}, Lo/clq$29;-><init>(Lo/clq;Ljava/util/List;Lo/cmh;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 460
    return-void
.end method

.method public e(Lo/clz;)V
    .locals 2

    .line 1149
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$17;

    invoke-direct {v1, p0, p1}, Lo/clq$17;-><init>(Lo/clq;Lo/clz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1176
    return-void
.end method

.method public e(Lo/cmc;)V
    .locals 2

    .line 860
    iget-object v0, p0, Lo/clq;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/clq$11;

    invoke-direct {v1, p0, p1}, Lo/clq$11;-><init>(Lo/clq;Lo/cmc;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 881
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiUserPreference;)Z
    .locals 1

    .line 1273
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/clq;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    move-result v0

    return v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 8

    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 128
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceConnected() name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " time is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    invoke-static {p2}, Lo/clg$a;->e(Landroid/os/IBinder;)Lo/clg;

    move-result-object v0

    iput-object v0, p0, Lo/clq;->b:Lo/clg;

    .line 130
    iget-object v0, p0, Lo/clq;->b:Lo/clg;

    if-nez v0, :cond_0

    .line 131
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceConnected error !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " time is "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    :cond_0
    iget-object v6, p0, Lo/clq;->e:Ljava/lang/Object;

    monitor-enter v6

    .line 134
    :try_start_0
    iget-object v0, p0, Lo/clq;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 136
    :goto_0
    invoke-direct {p0}, Lo/clq;->i()V

    .line 137
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceConnected() end name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " time is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 142
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceDisconnected() name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v0, 0x0

    iput-object v0, p0, Lo/clq;->b:Lo/clg;

    .line 144
    invoke-direct {p0}, Lo/clq;->g()V

    .line 145
    return-void
.end method
