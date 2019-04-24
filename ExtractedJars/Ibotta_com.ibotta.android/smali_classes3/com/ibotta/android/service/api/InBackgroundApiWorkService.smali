.class public Lcom/ibotta/android/service/api/InBackgroundApiWorkService;
.super Landroid/support/v4/app/JobIntentService;
.source "InBackgroundApiWorkService.java"


# instance fields
.field protected apiWorkExecutor:Lcom/ibotta/android/service/api/ApiWorkExecutor;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private isHostingExecutor:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Landroid/support/v4/app/JobIntentService;-><init>()V

    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->isHostingExecutor:Z

    return-void
.end method

.method public static start(Landroid/content/Context;)V
    .locals 4

    .line 24
    const-class v0, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->API_WORK:Lcom/ibotta/android/service/JobServiceId;

    .line 27
    invoke-virtual {v1}, Lcom/ibotta/android/service/JobServiceId;->ordinal()I

    move-result v1

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 24
    invoke-static {p0, v0, v1, v2}, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 33
    invoke-super {p0}, Landroid/support/v4/app/JobIntentService;->onCreate()V

    .line 34
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/api/InBackgroundApiWorkService;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "onDestroy"

    const/4 v1, 0x0

    .line 50
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->isHostingExecutor:Z

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->apiWorkExecutor:Lcom/ibotta/android/service/api/ApiWorkExecutor;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tearDown()V

    .line 56
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/JobIntentService;->onDestroy()V

    return-void
.end method

.method protected onHandleWork(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const-string p1, "onHandleWork"

    const/4 v0, 0x0

    .line 39
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    iget-object p1, p0, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->apiWorkExecutor:Lcom/ibotta/android/service/api/ApiWorkExecutor;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->start()Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->isHostingExecutor:Z

    .line 43
    iget-boolean p1, p0, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->isHostingExecutor:Z

    if-nez p1, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->stopSelf()V

    :cond_0
    return-void
.end method
