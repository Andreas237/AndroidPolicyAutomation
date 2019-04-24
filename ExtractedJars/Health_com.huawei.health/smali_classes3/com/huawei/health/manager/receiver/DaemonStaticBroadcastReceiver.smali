.class public Lcom/huawei/health/manager/receiver/DaemonStaticBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 31
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 32
    :cond_0
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive() intent or context null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    return-void

    .line 37
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 38
    if-nez v4, :cond_2

    .line 39
    return-void

    .line 42
    :cond_2
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive action: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    const-string v0, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 46
    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lo/amy;->e(Landroid/content/Context;J)V

    .line 61
    invoke-static {p1}, Lo/anb;->c(Landroid/content/Context;)Lo/anb;

    move-result-object v5

    .line 63
    invoke-virtual {v5}, Lo/anb;->a()V

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-static {p1}, Lo/amy;->q(Landroid/content/Context;)Z

    move-result v6

    .line 70
    const/4 v7, 0x0

    .line 71
    if-eqz v6, :cond_3

    .line 72
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v7, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    .line 74
    :cond_3
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/PreDaemonService;

    invoke-direct {v7, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 76
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    :try_start_0
    invoke-virtual {p1, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 85
    goto :goto_1

    .line 79
    :catch_0
    move-exception v8

    .line 80
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_BOOT_COMPLETED  IllegalStateException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance v0, Lo/aml;

    invoke-direct {v0, p1}, Lo/aml;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Lo/aml;->a(Landroid/content/Intent;)V

    .line 85
    goto :goto_1

    .line 82
    :catch_1
    move-exception v8

    .line 83
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_BOOT_COMPLETED Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v0, Lo/aml;

    invoke-direct {v0, p1}, Lo/aml;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Lo/aml;->a(Landroid/content/Intent;)V

    .line 88
    :goto_1
    goto/16 :goto_3

    :cond_4
    const-string v0, "android.intent.action.ACTION_SHUTDOWN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lo/amy;->e(Landroid/content/Context;J)V

    .line 91
    invoke-static {p1}, Lo/anb;->c(Landroid/content/Context;)Lo/anb;

    move-result-object v5

    .line 92
    invoke-virtual {v5}, Lo/anb;->e()V

    .line 94
    new-instance v6, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v6, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 95
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 96
    const-string v0, "android.intent.action.ACTION_SHUTDOWN"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    :try_start_1
    invoke-virtual {p1, v6}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 103
    goto :goto_2

    .line 99
    :catch_2
    move-exception v7

    .line 100
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_SHUTDOWN IllegalStateException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    goto :goto_2

    .line 101
    :catch_3
    move-exception v7

    .line 102
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_SHUTDOWN Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :goto_2
    goto :goto_3

    :cond_5
    const-string v0, "android.intent.action.MY_PACKAGE_REPLACED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 107
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v5, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    :try_start_2
    invoke-virtual {p1, v5}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 115
    goto :goto_3

    .line 111
    :catch_4
    move-exception v6

    .line 112
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_MY_PACKAGE_REPLACED IllegalStateException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    goto :goto_3

    .line 113
    :catch_5
    move-exception v6

    .line 114
    const-string v0, "Step_StaticReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_MY_PACKAGE_REPLACED Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    :cond_6
    :goto_3
    return-void
.end method
