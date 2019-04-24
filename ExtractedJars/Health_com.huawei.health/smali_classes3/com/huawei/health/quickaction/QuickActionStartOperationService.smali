.class public Lcom/huawei/health/quickaction/QuickActionStartOperationService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private b()V
    .locals 5

    .line 118
    iget-object v0, p0, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v4

    .line 119
    const-string v0, "com.huawei.health"

    invoke-virtual {p0, v0}, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const-string v0, "QuickActionStartOperationService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "app is running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/health/quickaction/QuickActionStartOperationService$1;

    invoke-direct {v2, p0, v4}, Lcom/huawei/health/quickaction/QuickActionStartOperationService$1;-><init>(Lcom/huawei/health/quickaction/QuickActionStartOperationService;Lcom/huawei/operation/operation/PluginOperation;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    goto :goto_0

    .line 135
    :cond_0
    const-string v0, "QuickActionStartOperationService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "app is not running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->c(Landroid/content/Context;Landroid/content/pm/PackageManager;)V

    .line 138
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Context;Landroid/content/pm/PackageManager;)V
    .locals 6

    .line 45
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 48
    const-string v0, "com.huawei.health"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    .line 49
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.health"

    invoke-virtual {v5}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 50
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 55
    if-eqz p1, :cond_0

    .line 56
    invoke-static {p1}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/health/quickaction/QuickActionStartOperationService$2;

    invoke-direct {v2, p0, v4, p1}, Lcom/huawei/health/quickaction/QuickActionStartOperationService$2;-><init>(Lcom/huawei/health/quickaction/QuickActionStartOperationService;Landroid/content/Intent;Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :cond_0
    goto :goto_0

    .line 71
    :catch_0
    move-exception v5

    .line 72
    const-string v0, "QuickActionStartOperationService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthAPPIntent()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Z
    .locals 8

    .line 94
    iget-object v0, p0, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->c:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/ActivityManager;

    .line 95
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 96
    const/4 v0, 0x0

    return v0

    .line 98
    :cond_0
    const/16 v0, 0x64

    invoke-virtual {v2, v0}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v3

    .line 99
    const/4 v4, 0x0

    .line 100
    move-object v5, p1

    .line 101
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 102
    return v4

    .line 104
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/app/ActivityManager$RunningTaskInfo;

    .line 105
    iget-object v0, v7, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v7, Landroid/app/ActivityManager$RunningTaskInfo;->baseActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    :cond_2
    const/4 v4, 0x1

    .line 107
    goto :goto_1

    .line 109
    :cond_3
    goto :goto_0

    .line 110
    :cond_4
    :goto_1
    return v4
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 40
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .line 33
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 34
    iput-object p0, p0, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->c:Landroid/content/Context;

    .line 35
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 79
    if-nez p1, :cond_0

    .line 80
    const-string v0, "QuickActionStartOperationService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate() intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/quickaction/QuickActionStartOperationService;->b()V

    .line 84
    const-string v0, "QuickActionStartOperationService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
