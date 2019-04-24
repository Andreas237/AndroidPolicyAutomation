.class public Lcom/tencent/stat/StatService;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/os/Handler;

.field private static volatile b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/tencent/stat/a/c;Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private static volatile c:J

.field private static volatile d:J

.field private static volatile e:I

.field private static volatile f:Ljava/lang/String;

.field private static volatile g:Ljava/lang/String;

.field private static h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private static i:Lcom/tencent/stat/common/StatLogger;

.field private static j:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private static volatile k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/tencent/stat/StatService;->c:J

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/tencent/stat/StatService;->d:J

    const/4 v0, 0x0

    sput v0, Lcom/tencent/stat/StatService;->e:I

    const-string v0, ""

    sput-object v0, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/tencent/stat/StatService;->g:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;

    invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/StatService;->j:Ljava/lang/Thread$UncaughtExceptionHandler;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/tencent/stat/StatService;->k:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/content/Context;Z)I
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    if-eqz p1, :cond_0

    sget-wide v0, Lcom/tencent/stat/StatService;->c:J

    sub-long v0, v4, v0

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getSessionTimoutMillis()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v6, 0x1

    :cond_0
    sput-wide v4, Lcom/tencent/stat/StatService;->c:J

    sget-wide v0, Lcom/tencent/stat/StatService;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Lcom/tencent/stat/common/k;->c()J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/stat/StatService;->d:J

    :cond_1
    sget-wide v0, Lcom/tencent/stat/StatService;->d:J

    cmp-long v0, v4, v0

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/tencent/stat/common/k;->c()J

    move-result-wide v0

    sput-wide v0, Lcom/tencent/stat/StatService;->d:J

    invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->getUserType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/DeviceInfo;->b(I)V

    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/stat/StatConfig;->b(I)V

    invoke-static {p0}, Lcom/tencent/stat/StatMid;->a(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    const/4 v6, 0x1

    :cond_3
    sget-boolean v0, Lcom/tencent/stat/StatService;->k:Z

    if-eqz v0, :cond_4

    const/4 v6, 0x1

    :cond_4
    if-eqz v6, :cond_6

    invoke-static {}, Lcom/tencent/stat/StatConfig;->e()I

    move-result v0

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxDaySessionNumbers()I

    move-result v1

    if-ge v0, v1, :cond_5

    invoke-static {p0}, Lcom/tencent/stat/common/k;->F(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->d(Landroid/content/Context;)V

    goto :goto_0

    :cond_5
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Exceed StatConfig.getMaxDaySessionNumbers()."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :cond_6
    :goto_0
    sget-boolean v0, Lcom/tencent/stat/StatService;->k:Z

    if-eqz v0, :cond_7

    invoke-static {p0}, Lcom/tencent/stat/common/f;->b(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->testSpeed(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->e(Landroid/content/Context;)V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/stat/StatService;->k:Z

    :cond_7
    sget v0, Lcom/tencent/stat/StatService;->e:I

    return v0
.end method

.method static a()Lorg/json/JSONObject;
    .locals 4

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    sget-object v0, Lcom/tencent/stat/StatConfig;->b:Lcom/tencent/stat/b;

    iget v0, v0, Lcom/tencent/stat/b;->d:I

    if-eqz v0, :cond_0

    const-string v0, "v"

    sget-object v1, Lcom/tencent/stat/StatConfig;->b:Lcom/tencent/stat/b;

    iget v1, v1, Lcom/tencent/stat/b;->d:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_0
    sget-object v0, Lcom/tencent/stat/StatConfig;->b:Lcom/tencent/stat/b;

    iget v0, v0, Lcom/tencent/stat/b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    sget-object v0, Lcom/tencent/stat/StatConfig;->a:Lcom/tencent/stat/b;

    iget v0, v0, Lcom/tencent/stat/b;->d:I

    if-eqz v0, :cond_1

    const-string v0, "v"

    sget-object v1, Lcom/tencent/stat/StatConfig;->a:Lcom/tencent/stat/b;

    iget v1, v1, Lcom/tencent/stat/b;->d:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_1
    sget-object v0, Lcom/tencent/stat/StatConfig;->a:Lcom/tencent/stat/b;

    iget v0, v0, Lcom/tencent/stat/b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_0
    return-object v2
.end method

.method static declared-synchronized a(Landroid/content/Context;)V
    .locals 5

    const-class v4, Lcom/tencent/stat/StatService;

    monitor-enter v4

    if-nez p0, :cond_0

    monitor-exit v4

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    invoke-static {p0}, Lcom/tencent/stat/StatService;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    monitor-exit v4

    return-void

    :cond_1
    invoke-static {p0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "ooh, Compatibility problem was found in this device!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "If you are on debug mode, please delete apk and try again."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V

    monitor-exit v4

    return-void

    :cond_2
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "StatService"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;

    invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;

    invoke-static {p0}, Lcom/tencent/stat/d;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/tencent/stat/d;->b()Lcom/tencent/stat/d;

    invoke-static {p0}, Lcom/tencent/stat/StatConfig;->getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/StatService;->j:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isAutoExceptionCaught()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    new-instance v0, Lcom/tencent/stat/g;

    invoke-direct {v0, v3}, Lcom/tencent/stat/g;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "MTA SDK AutoExceptionCaught is disable"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V

    :goto_0
    invoke-static {}, Lcom/tencent/stat/StatConfig;->getStatSendStrategy()Lcom/tencent/stat/StatReportStrategy;

    move-result-object v0

    sget-object v1, Lcom/tencent/stat/StatReportStrategy;->APP_LAUNCH:Lcom/tencent/stat/StatReportStrategy;

    if-ne v0, v1, :cond_4

    invoke-static {p0}, Lcom/tencent/stat/common/k;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/n;->a(I)V

    :cond_4
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Init MTA StatService success."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    monitor-exit v4

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method static a(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    :try_start_1
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.reportSdkSelfException() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :cond_1
    :try_start_2
    new-instance v3, Lcom/tencent/stat/a/d;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    const/16 v1, 0x63

    invoke-direct {v3, p0, v0, v1, p1}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;IILjava/lang/Throwable;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v3}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reportSdkSelfException error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method static a(Landroid/content/Context;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;*>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.sendAdditionEvent() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    new-instance v2, Lcom/tencent/stat/a/a;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    invoke-direct {v2, p0, v0, p1}, Lcom/tencent/stat/a/a;-><init>(Landroid/content/Context;ILjava/util/Map;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method static a(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b()Lcom/tencent/stat/common/StatLogger;
    .locals 1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    return-object v0
.end method

.method static b(Landroid/content/Context;)Z
    .locals 7

    sget-object v0, Lcom/tencent/stat/StatConfig;->c:Ljava/lang/String;

    const-wide/16 v1, 0x0

    invoke-static {p0, v0, v1, v2}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v3

    const-string v0, "1.6.2"

    invoke-static {v0}, Lcom/tencent/stat/common/k;->b(Ljava/lang/String;)J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method static c(Landroid/content/Context;)Landroid/os/Handler;
    .locals 2

    sget-object v0, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-static {p0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;)V

    :cond_0
    sget-object v0, Lcom/tencent/stat/StatService;->a:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    sget-object v0, Lcom/tencent/stat/StatService;->j:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object v0
.end method

.method public static commitEvents(Landroid/content/Context;I)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.commitEvents() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 v0, -0x1

    if-lt p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The maxNumber of StatService.commitEvents() should be -1 or bigger than 0."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_3
    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tencent/stat/n;->a(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method static d(Landroid/content/Context;)V
    .locals 5

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "start new session."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    invoke-static {}, Lcom/tencent/stat/common/k;->a()I

    move-result v0

    sput v0, Lcom/tencent/stat/StatService;->e:I

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/stat/StatConfig;->a(I)V

    invoke-static {}, Lcom/tencent/stat/StatConfig;->d()V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    new-instance v2, Lcom/tencent/stat/a/k;

    sget v3, Lcom/tencent/stat/StatService;->e:I

    invoke-static {}, Lcom/tencent/stat/StatService;->a()Lorg/json/JSONObject;

    move-result-object v4

    invoke-direct {v2, p0, v3, v4}, Lcom/tencent/stat/a/k;-><init>(Landroid/content/Context;ILorg/json/JSONObject;)V

    invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method static e(Landroid/content/Context;)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.reportNativeCrash() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/i;

    invoke-direct {v1, p0}, Lcom/tencent/stat/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static onPause(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.onPause() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/tencent/stat/common/k;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->trackEndPage(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static onResume(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.onResume() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/tencent/stat/common/k;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->trackBeginPage(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static reportAppMonitorStat(Landroid/content/Context;Lcom/tencent/stat/StatAppMonitor;)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.reportAppMonitorStat() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    if-nez p1, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The StatAppMonitor of StatService.reportAppMonitorStat() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/tencent/stat/StatAppMonitor;->getInterfaceName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The interfaceName of StatAppMonitor on StatService.reportAppMonitorStat() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_3
    :try_start_0
    new-instance v2, Lcom/tencent/stat/a/h;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    invoke-direct {v2, p0, v0, p1}, Lcom/tencent/stat/a/h;-><init>(Landroid/content/Context;ILcom/tencent/stat/StatAppMonitor;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static reportError(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.reportError() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Error message in StatService.reportError() is empty."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v0, Lcom/tencent/stat/a/d;

    move-object v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v2

    move-object v3, p1

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxReportEventLength()I

    move-result v5

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;ILjava/lang/String;II)V

    move-object v6, v0

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v6}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    goto :goto_0

    :catch_0
    move-exception v6

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v6}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v6}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static reportException(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.reportException() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    if-nez p1, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Throwable error message of StatService.reportException() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance v2, Lcom/tencent/stat/a/d;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {v2, p0, v0, v1, p1}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;IILjava/lang/Throwable;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    return-void
.end method

.method public static reportGameUser(Landroid/content/Context;Lcom/tencent/stat/StatGameUser;)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.reportGameUser() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    if-nez p1, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The gameUser of StatService.reportGameUser() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/tencent/stat/StatGameUser;->getAccount()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/tencent/stat/StatGameUser;->getAccount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The account of gameUser on StatService.reportGameUser() can not be null or empty!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_4
    :try_start_0
    new-instance v2, Lcom/tencent/stat/a/g;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    invoke-direct {v2, p0, v0, p1}, Lcom/tencent/stat/a/g;-><init>(Landroid/content/Context;ILcom/tencent/stat/StatGameUser;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static reportQQ(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    sget-object v0, Lcom/tencent/stat/StatConfig;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/tencent/stat/StatConfig;->d:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public static setEnvAttributes(Landroid/content/Context;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    const/16 v1, 0x200

    if-le v0, v1, :cond_1

    :cond_0
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The map in setEnvAttributes can\'t be null or its size can\'t exceed 512."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {p0, p1}, Lcom/tencent/stat/common/a;->a(Landroid/content/Context;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public static startNewSession(Landroid/content/Context;)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.startNewSession() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {}, Lcom/tencent/stat/StatService;->stopSession()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static startStatService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "MTA StatService is disable."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v4, "1.6.2"

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MTA SDK version, current: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ,required: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    const-string v5, ""

    if-eqz p0, :cond_1

    if-nez p2, :cond_2

    :cond_1
    const-string v5, "Context or mtaSdkVersion in StatService.startStatService() is null, please check it!"

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v5}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V

    new-instance v0, Lcom/tencent/stat/MtaSDkException;

    invoke-direct {v0, v5}, Lcom/tencent/stat/MtaSDkException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v4}, Lcom/tencent/stat/common/k;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {p2}, Lcom/tencent/stat/common/k;->b(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MTA SDK version conflicted, current: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",required: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v5}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setEnableStatService(Z)V

    new-instance v0, Lcom/tencent/stat/MtaSDkException;

    invoke-direct {v0, v5}, Lcom/tencent/stat/MtaSDkException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/StatConfig;->getInstallChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const-string v0, "-"

    invoke-static {v0}, Lcom/tencent/stat/StatConfig;->setInstallChannel(Ljava/lang/String;)V

    :cond_5
    if-eqz p1, :cond_6

    invoke-static {p0, p1}, Lcom/tencent/stat/StatConfig;->setAppKey(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v6}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return v0

    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static stopSession()V
    .locals 2

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/tencent/stat/StatService;->c:J

    return-void
.end method

.method public static testSpeed(Landroid/content/Context;)V
    .locals 4

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.testSpeed() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tencent/stat/j;-><init>(Landroid/content/Context;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v3}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static testSpeed(Landroid/content/Context;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.testSpeed() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The domainMap of StatService.testSpeed() can not be null or empty!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_3
    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/j;

    invoke-direct {v1, p0, p1}, Lcom/tencent/stat/j;-><init>(Landroid/content/Context;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static trackBeginPage(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context or pageName of StatService.trackBeginPage() can not be null or empty!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    sget-object v4, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;

    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I

    move-result v1

    if-lt v0, v1, :cond_3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The number of page events exceeds the maximum value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    return-void

    :cond_3
    move-object v5, p1

    :try_start_2
    sput-object v5, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;

    sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;

    sget-object v1, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Duplicate PageID : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", onResume() repeated?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v4

    return-void

    :cond_4
    :try_start_3
    sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;

    sget-object v1, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    :try_start_4
    throw v6

    :goto_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v4}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public static varargs trackCustomBeginEvent(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.trackCustomBeginEvent() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The event_id of StatService.trackCustomBeginEvent() can not be null or empty."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v3, Lcom/tencent/stat/a/c;

    const/4 v0, 0x0

    invoke-direct {v3, p1, p2, v0}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V

    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Duplicate CustomEvent key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", trackCustomBeginEvent() repeated?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_3
    :try_start_1
    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I

    move-result v1

    if-gt v0, v1, :cond_4

    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The number of timedEvent exceeds the maximum value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v3}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public static trackCustomBeginKVEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Properties;)V
    .locals 4

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.trackCustomBeginEvent() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The event_id of StatService.trackCustomBeginEvent() can not be null or empty."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v3, Lcom/tencent/stat/a/c;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0, p2}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V

    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Duplicate CustomEvent key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", trackCustomBeginKVEvent() repeated?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_3
    :try_start_1
    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I

    move-result v1

    if-gt v0, v1, :cond_4

    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The number of timedEvent exceeds the maximum value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxParallelTimmingEvents()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v3}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public static varargs trackCustomEndEvent(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.trackCustomEndEvent() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The event_id of StatService.trackCustomEndEvent() can not be null or empty."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v4, Lcom/tencent/stat/a/c;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p2, v0}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V

    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Long;

    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    new-instance v6, Lcom/tencent/stat/a/b;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    invoke-direct {v6, p0, v0, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    invoke-virtual {v6, p2}, Lcom/tencent/stat/a/b;->a([Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const-wide/16 v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/tencent/stat/a/b;->a(J)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v6}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    goto :goto_1

    :cond_5
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No start time found for custom event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", lost trackCustomBeginEvent()?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    goto :goto_2

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v4}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public static trackCustomEndKVEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Properties;)V
    .locals 8

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.trackCustomEndEvent() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The event_id of StatService.trackCustomEndEvent() can not be null or empty."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v4, Lcom/tencent/stat/a/c;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0, p2}, Lcom/tencent/stat/a/c;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V

    sget-object v0, Lcom/tencent/stat/StatService;->b:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Long;

    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    new-instance v6, Lcom/tencent/stat/a/b;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    invoke-direct {v6, p0, v0, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    invoke-virtual {v6, p2}, Lcom/tencent/stat/a/b;->a(Ljava/util/Properties;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const-wide/16 v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/tencent/stat/a/b;->a(J)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v6}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    goto :goto_1

    :cond_5
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No start time found for custom event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/tencent/stat/a/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", lost trackCustomBeginKVEvent()?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    goto :goto_2

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v4}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public static varargs trackCustomEvent(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.trackCustomEvent() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The event_id of StatService.trackCustomEvent() can not be null or empty."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v2, Lcom/tencent/stat/a/b;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    invoke-direct {v2, p0, v0, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    invoke-virtual {v2, p2}, Lcom/tencent/stat/a/b;->a([Ljava/lang/String;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static trackCustomKVEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Properties;)V
    .locals 3

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context of StatService.trackCustomEvent() can not be null!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/tencent/stat/StatService;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The event_id of StatService.trackCustomEvent() can not be null or empty."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    new-instance v2, Lcom/tencent/stat/a/b;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v0

    invoke-direct {v2, p0, v0, p1}, Lcom/tencent/stat/a/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    invoke-virtual {v2, p2}, Lcom/tencent/stat/a/b;->a(Ljava/util/Properties;)V

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v2}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static trackEndPage(Landroid/content/Context;Ljava/lang/String;)V
    .locals 11

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "The Context or pageName of StatService.trackEndPage() can not be null or empty!"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    return-void

    :cond_2
    move-object v6, p1

    const/4 v7, 0x0

    :try_start_0
    sget-object v8, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;

    monitor-enter v8
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v0, Lcom/tencent/stat/StatService;->h:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Long;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v8

    :try_start_2
    throw v9

    :goto_0
    if-eqz v7, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :cond_3
    sget-object v9, Lcom/tencent/stat/StatService;->g:Ljava/lang/String;

    if-eqz v9, :cond_4

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const-string v9, "-"

    :cond_4
    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v0, Lcom/tencent/stat/a/j;

    move-object v1, p0

    move-object v2, v9

    move-object v3, v6

    const/4 v4, 0x0

    invoke-static {p0, v4}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v4

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/tencent/stat/a/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;)V

    move-object v10, v0

    sget-object v0, Lcom/tencent/stat/StatService;->f:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Invalid invocation since previous onResume on diff page."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V

    :cond_5
    invoke-static {p0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v10}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_6
    sput-object v6, Lcom/tencent/stat/StatService;->g:Ljava/lang/String;

    goto :goto_1

    :cond_7
    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Starttime for PageID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not found, lost onResume()?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :goto_1
    goto :goto_2

    :catch_0
    move-exception v6

    sget-object v0, Lcom/tencent/stat/StatService;->i:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v6}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {p0, v6}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
