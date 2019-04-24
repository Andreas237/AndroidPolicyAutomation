.class public Lcom/tencent/stat/StatMid;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/tencent/stat/common/StatLogger;

.field private static b:Lcom/tencent/stat/DeviceInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
    .locals 12

    const-class v11, Lcom/tencent/stat/StatMid;

    monitor-enter v11

    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/a;->a(Landroid/content/Context;)Lcom/tencent/stat/a;

    move-result-object v3

    const-string v0, "__MTA_DEVICE_INFO__"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Lcom/tencent/stat/a;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/tencent/stat/StatMid;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v5

    sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get device info from internal storage:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    const-string v0, "__MTA_DEVICE_INFO__"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Lcom/tencent/stat/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/tencent/stat/StatMid;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v7

    sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get device info from setting.system:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    const-string v0, "__MTA_DEVICE_INFO__"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Lcom/tencent/stat/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/tencent/stat/StatMid;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v9

    sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get device info from SharedPreference:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    invoke-static {v9, v7, v5}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/stat/DeviceInfo;

    invoke-direct {v0}, Lcom/tencent/stat/DeviceInfo;-><init>()V

    sput-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    :cond_0
    invoke-static {p0}, Lcom/tencent/stat/n;->a(Landroid/content/Context;)Lcom/tencent/stat/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v10

    if-eqz v10, :cond_1

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {v10}, Lcom/tencent/stat/DeviceInfo;->getImei()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/DeviceInfo;->d(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {v10}, Lcom/tencent/stat/DeviceInfo;->getMac()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/DeviceInfo;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {v10}, Lcom/tencent/stat/DeviceInfo;->getUserType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/DeviceInfo;->b(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v3

    :try_start_1
    sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v11

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v11

    throw p0
.end method

.method static a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
    .locals 1

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/tencent/stat/DeviceInfo;->a(Lcom/tencent/stat/DeviceInfo;)I

    move-result v0

    if-ltz v0, :cond_0

    return-object p0

    :cond_0
    return-object p1

    :cond_1
    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method static a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;
    .locals 3

    invoke-static {p0, p1}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v1

    invoke-static {p1, p2}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/stat/StatMid;->a(Lcom/tencent/stat/DeviceInfo;Lcom/tencent/stat/DeviceInfo;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/tencent/stat/common/k;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/stat/DeviceInfo;->a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
    .locals 2

    if-nez p0, :cond_0

    sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Context for StatConfig.getDeviceInfo is null."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/tencent/stat/StatMid;->a(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    :cond_1
    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    return-object v0
.end method

.method public static getMid(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/tencent/stat/StatMid;->getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    :cond_0
    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->getMid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static updateDeviceInfo(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/StatMid;->getDeviceInfo(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {v0, p1}, Lcom/tencent/stat/DeviceInfo;->c(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    sget-object v1, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {v1}, Lcom/tencent/stat/DeviceInfo;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/DeviceInfo;->a(I)V

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/stat/DeviceInfo;->a(J)V

    sget-object v0, Lcom/tencent/stat/StatMid;->b:Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {v0}, Lcom/tencent/stat/DeviceInfo;->c()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "save DeviceInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lcom/tencent/stat/a;->a(Landroid/content/Context;)Lcom/tencent/stat/a;

    move-result-object v5

    const-string v0, "__MTA_DEVICE_INFO__"

    invoke-virtual {v5, v0, v4}, Lcom/tencent/stat/a;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v0, "__MTA_DEVICE_INFO__"

    invoke-virtual {v5, v0, v4}, Lcom/tencent/stat/a;->e(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v0, "__MTA_DEVICE_INFO__"

    invoke-virtual {v5, v0, v4}, Lcom/tencent/stat/a;->a(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/StatMid;->a:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
