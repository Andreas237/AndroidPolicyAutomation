.class public Lcom/ibotta/android/service/api/InForegroundApiWorkService;
.super Landroid/app/IntentService;
.source "InForegroundApiWorkService.java"


# instance fields
.field protected apiWorkExecutor:Lcom/ibotta/android/service/api/ApiWorkExecutor;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private isHostingExecutor:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    const-class v0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->isHostingExecutor:Z

    return-void
.end method

.method public static start(Landroid/content/Context;)V
    .locals 2

    .line 23
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/service/api/InForegroundApiWorkService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 32
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 33
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/api/InForegroundApiWorkService;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "onDestroy"

    const/4 v1, 0x0

    .line 49
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->isHostingExecutor:Z

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->apiWorkExecutor:Lcom/ibotta/android/service/api/ApiWorkExecutor;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->tearDown()V

    .line 55
    :cond_0
    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const-string p1, "onHandleIntent"

    const/4 v0, 0x0

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    iget-object p1, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->apiWorkExecutor:Lcom/ibotta/android/service/api/ApiWorkExecutor;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/ApiWorkExecutor;->start()Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->isHostingExecutor:Z

    .line 42
    iget-boolean p1, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->isHostingExecutor:Z

    if-nez p1, :cond_0

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->stopSelf()V

    :cond_0
    return-void
.end method
