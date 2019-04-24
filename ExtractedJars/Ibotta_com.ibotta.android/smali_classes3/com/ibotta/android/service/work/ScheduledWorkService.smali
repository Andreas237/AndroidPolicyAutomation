.class public Lcom/ibotta/android/service/work/ScheduledWorkService;
.super Landroid/support/v4/app/JobIntentService;
.source "ScheduledWorkService.java"


# static fields
.field public static final KEY_EVENT_TIME:Ljava/lang/String; = "event_time"

.field public static final KEY_WORK:Ljava/lang/String; = "work"

.field public static final KEY_WORK_ID:Ljava/lang/String; = "work_id"


# instance fields
.field protected scheduledWorkers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/support/v4/app/JobIntentService;-><init>()V

    return-void
.end method

.method public static doWork(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "doWork"

    const/4 v1, 0x0

    .line 28
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    const-string p0, "Can\'t do work, intent is null."

    .line 30
    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "work_id"

    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p0, "Can\'t do work, workType is not set."

    .line 36
    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v1, "work"

    .line 40
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 41
    invoke-static {p0, v0, p1}, Lcom/ibotta/android/service/work/ScheduledWorkService;->newIntent(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/ibotta/android/service/work/ScheduledWorkService;->enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method private static enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 52
    const-class v0, Lcom/ibotta/android/service/work/ScheduledWorkService;

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->SCHEDULED_WORK:Lcom/ibotta/android/service/JobServiceId;

    .line 53
    invoke-virtual {v1}, Lcom/ibotta/android/service/JobServiceId;->ordinal()I

    move-result v1

    .line 52
    invoke-static {p0, v0, v1, p1}, Lcom/ibotta/android/service/work/ScheduledWorkService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    .locals 2

    .line 45
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/service/work/ScheduledWorkService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "work_id"

    .line 46
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "work"

    .line 47
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 58
    invoke-super {p0}, Landroid/support/v4/app/JobIntentService;->onCreate()V

    .line 59
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/work/ScheduledWorkService;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "onDestroy"

    const/4 v1, 0x0

    .line 91
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-super {p0}, Landroid/support/v4/app/JobIntentService;->onDestroy()V

    return-void
.end method

.method protected onHandleWork(Landroid/content/Intent;)V
    .locals 6
    .param p1    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const-string v0, "doWakefulWork"

    const/4 v1, 0x0

    .line 64
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string v0, "STARTING"

    .line 66
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "work_id"

    .line 68
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "work"

    .line 69
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const-string v2, "Work ID: %1$s"

    const/4 v3, 0x1

    .line 71
    new-array v4, v3, [Ljava/lang/Object;

    aput-object v0, v4, v1

    invoke-static {v2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v2, p0, Lcom/ibotta/android/service/work/ScheduledWorkService;->scheduledWorkers:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/service/work/ScheduledWorker;

    .line 74
    invoke-interface {v4}, Lcom/ibotta/android/service/work/ScheduledWorker;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v2, "Delegating work to: %1$s"

    .line 75
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-interface {v4, p1}, Lcom/ibotta/android/service/work/ScheduledWorker;->onWork(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string v0, "Work failed."

    .line 82
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_0
    const-string p1, "STOPPING"

    .line 85
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :goto_1
    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "STOPPING"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method
