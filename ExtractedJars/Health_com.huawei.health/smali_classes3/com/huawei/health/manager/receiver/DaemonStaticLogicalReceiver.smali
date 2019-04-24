.class public Lcom/huawei/health/manager/receiver/DaemonStaticLogicalReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .line 42
    const-string v0, "extra_user_intent_pre_alarm"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userIntent EXTRA_USER_INTENT_PRE_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/manager/receiver/DaemonStaticLogicalReceiver;->b(Landroid/content/Context;)V

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->a(J)J

    move-result-wide v0

    const-wide/32 v2, 0x501bd00

    add-long v4, v0, v2

    .line 46
    sget-wide v0, Lo/ane;->d:J

    add-long/2addr v0, v4

    invoke-static {p1, v0, v1}, Lo/ane;->a(Landroid/content/Context;J)V

    .line 47
    new-instance v6, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v6, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    const-string v0, "com.huawei.health.action.UPLOAD_STATICS"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    const-string v0, "extra_user_intent"

    const-string v1, "extra_user_intent_pre_alarm"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    :try_start_0
    invoke-virtual {p1, v6}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_0

    .line 53
    :catch_0
    move-exception v7

    .line 54
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealRestartSensorMSG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    :goto_0
    goto/16 :goto_2

    :cond_0
    const-string v0, "extra_user_intent_alarm"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userIntent EXTRA_USER_INTENT_ALARM"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-direct {p0, p1}, Lcom/huawei/health/manager/receiver/DaemonStaticLogicalReceiver;->b(Landroid/content/Context;)V

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->a(J)J

    move-result-wide v0

    const-wide/32 v2, 0x521c820

    add-long v4, v0, v2

    .line 61
    sget-wide v0, Lo/ane;->a:J

    add-long/2addr v0, v4

    invoke-static {p1, v0, v1}, Lo/ane;->b(Landroid/content/Context;J)V

    .line 62
    new-instance v6, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v6, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    const-string v0, "com.huawei.health.action.UPLOAD_STATICS"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    const-string v0, "extra_user_intent"

    const-string v1, "extra_user_intent_alarm"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    :try_start_1
    invoke-virtual {p1, v6}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    goto :goto_1

    .line 68
    :catch_1
    move-exception v7

    .line 69
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "extra_user_intent_alarm"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :goto_1
    goto :goto_2

    .line 73
    :cond_1
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userIntent unknown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    :goto_2
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 6

    .line 78
    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/PowerManager;

    .line 79
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v5

    .line 80
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireWakelock"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const-wide/16 v0, 0xbb8

    invoke-virtual {v5, v0, v1}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 84
    :cond_0
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 23
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 24
    const-string v0, "com.huawei.health.action.UPLOAD_STATICS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    const/4 v4, 0x0

    .line 27
    const-string v0, "extra_user_intent"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 31
    goto :goto_0

    .line 28
    :catch_0
    move-exception v5

    .line 29
    const/4 v4, 0x0

    .line 30
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/os/BadParcelableException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    :goto_0
    if-nez v4, :cond_0

    .line 33
    const-string v0, "Step_DaemonStaticLogicalReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userIntent null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void

    .line 36
    :cond_0
    invoke-direct {p0, p1, v4}, Lcom/huawei/health/manager/receiver/DaemonStaticLogicalReceiver;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    :cond_1
    return-void
.end method
