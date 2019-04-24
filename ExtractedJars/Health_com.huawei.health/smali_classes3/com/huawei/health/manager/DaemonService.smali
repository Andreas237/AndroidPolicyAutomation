.class public Lcom/huawei/health/manager/DaemonService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private b:Lo/alo;

.field private c:Lo/aln;

.field private e:Lo/amb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/manager/DaemonService;->e:Lo/amb;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/manager/DaemonService;->c:Lo/aln;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/manager/DaemonService;->b:Lo/alo;

    .line 38
    return-void
.end method

.method private b()V
    .locals 1

    .line 155
    new-instance v0, Lo/aln;

    invoke-direct {v0, p0}, Lo/aln;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/manager/DaemonService;->c:Lo/aln;

    .line 157
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->c:Lo/aln;

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->c:Lo/aln;

    invoke-virtual {v0}, Lo/aln;->a()V

    .line 161
    :cond_0
    return-void
.end method

.method private e()V
    .locals 4

    .line 138
    invoke-static {}, Lo/dho;->a()V

    .line 139
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/health/manager/DaemonService$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/manager/DaemonService$3;-><init>(Lcom/huawei/health/manager/DaemonService;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 145
    invoke-static {}, Lo/dhn;->a()V

    .line 146
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/health/manager/DaemonService$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/manager/DaemonService$5;-><init>(Lcom/huawei/health/manager/DaemonService;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 151
    return-void
.end method

.method private e(Landroid/content/Intent;)Z
    .locals 2

    .line 165
    const/4 v1, 0x0

    .line 167
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->c:Lo/aln;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->c:Lo/aln;

    invoke-virtual {v0, p1}, Lo/aln;->b(Landroid/content/Intent;)Z

    move-result v1

    .line 171
    :cond_0
    return v1
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 5

    .line 100
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBind "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 102
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, "com.huawei.health.device.oper"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "intent.getAction === "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->b:Lo/alo;

    return-object v0

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->e:Lo/amb;

    return-object v0
.end method

.method public onCreate()V
    .locals 10

    .line 42
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 43
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-static {p0}, Lo/amy;->n(Landroid/content/Context;)J

    move-result-wide v4

    .line 45
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SHUTDOWN UTC:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " System.currentTimeMillis():"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 48
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate stopself"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    goto :goto_0

    .line 51
    :cond_0
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lo/amy;->e(Landroid/content/Context;J)V

    .line 54
    :goto_0
    invoke-static {p0}, Lo/alu;->c(Landroid/content/Context;)V

    .line 55
    invoke-static {p0}, Lo/amy;->t(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_1

    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->b(J)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {p0, v0}, Lo/amy;->c(Landroid/content/Context;I)V

    .line 59
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/amy;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 61
    new-instance v0, Lo/amb;

    invoke-direct {v0, p0}, Lo/amb;-><init>(Lcom/huawei/health/manager/DaemonService;)V

    iput-object v0, p0, Lcom/huawei/health/manager/DaemonService;->e:Lo/amb;

    .line 63
    new-instance v0, Lo/alo;

    invoke-direct {v0, p0}, Lo/alo;-><init>(Lcom/huawei/health/manager/DaemonService;)V

    iput-object v0, p0, Lcom/huawei/health/manager/DaemonService;->b:Lo/alo;

    .line 65
    invoke-static {p0}, Lo/alm;->e(Landroid/content/Context;)Lo/alm;

    move-result-object v0

    invoke-virtual {v0}, Lo/alm;->a()Z

    .line 67
    invoke-direct {p0}, Lcom/huawei/health/manager/DaemonService;->b()V

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v0

    const-wide/32 v2, 0x521c820

    add-long v6, v0, v2

    .line 78
    sget-wide v0, Lo/ane;->a:J

    add-long/2addr v0, v6

    invoke-static {p0, v0, v1}, Lo/ane;->b(Landroid/content/Context;J)V

    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v0

    const-wide/32 v2, 0x501bd00

    add-long v8, v0, v2

    .line 81
    sget-wide v0, Lo/ane;->d:J

    add-long/2addr v0, v8

    invoke-static {p0, v0, v1}, Lo/ane;->a(Landroid/content/Context;J)V

    .line 83
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 87
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 90
    invoke-static {p0}, Lo/alm;->e(Landroid/content/Context;)Lo/alm;

    move-result-object v0

    invoke-virtual {v0}, Lo/alm;->b()V

    .line 91
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->e:Lo/amb;

    invoke-virtual {v0}, Lo/amb;->m()V

    .line 92
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 94
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .line 112
    if-eqz p1, :cond_2

    .line 113
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 114
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->e:Lo/amb;

    if-eqz v0, :cond_2

    .line 115
    const-string v0, "THE_MAINUI_START_DAEMONSERVICE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    const-string v0, "THE_MAINUI_START_DAEMONSERVICE"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 117
    invoke-static {p0, v4}, Lo/amy;->e(Landroid/content/Context;Z)V

    .line 118
    goto :goto_0

    :cond_0
    const-string v0, "flushLog"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    const-string v0, "flushLog"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 120
    if-eqz v4, :cond_1

    .line 121
    invoke-direct {p0}, Lcom/huawei/health/manager/DaemonService;->e()V

    .line 124
    :cond_1
    :goto_0
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-direct {p0, p1}, Lcom/huawei/health/manager/DaemonService;->e(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 127
    iget-object v0, p0, Lcom/huawei/health/manager/DaemonService;->e:Lo/amb;

    invoke-virtual {v0, p1}, Lo/amb;->b(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :cond_2
    goto :goto_1

    .line 131
    :catch_0
    move-exception v4

    .line 132
    const-string v0, "Step_DaemonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/BadParcelableException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
