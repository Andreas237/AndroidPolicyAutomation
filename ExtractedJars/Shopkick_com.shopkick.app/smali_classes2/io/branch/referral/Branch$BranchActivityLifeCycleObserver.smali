.class Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;
.super Ljava/lang/Object;
.source "Branch.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Branch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BranchActivityLifeCycleObserver"
.end annotation


# instance fields
.field private activityCnt_:I

.field final synthetic this$0:Lio/branch/referral/Branch;


# direct methods
.method private constructor <init>(Lio/branch/referral/Branch;)V
    .locals 0

    .line 2531
    iput-object p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2532
    iput p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->activityCnt_:I

    return-void
.end method

.method synthetic constructor <init>(Lio/branch/referral/Branch;Lio/branch/referral/Branch$1;)V
    .locals 0

    .line 2531
    invoke-direct {p0, p1}, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;-><init>(Lio/branch/referral/Branch;)V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 2537
    iget-object p2, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {p2}, Lio/branch/referral/Branch;->access$600(Lio/branch/referral/Branch;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/branch/referral/Branch$INTENT_STATE;->PENDING:Lio/branch/referral/Branch$INTENT_STATE;

    goto :goto_0

    :cond_0
    sget-object v0, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    :goto_0
    invoke-static {p2, v0}, Lio/branch/referral/Branch;->access$502(Lio/branch/referral/Branch;Lio/branch/referral/Branch$INTENT_STATE;)Lio/branch/referral/Branch$INTENT_STATE;

    .line 2538
    iget-object p2, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lio/branch/referral/Branch;->access$702(Lio/branch/referral/Branch;Z)Z

    .line 2539
    invoke-static {}, Lio/branch/referral/BranchViewHandler;->getInstance()Lio/branch/referral/BranchViewHandler;

    move-result-object p2

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/branch/referral/BranchViewHandler;->isInstallOrOpenBranchViewPending(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2540
    invoke-static {}, Lio/branch/referral/BranchViewHandler;->getInstance()Lio/branch/referral/BranchViewHandler;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/branch/referral/BranchViewHandler;->showPendingBranchView(Landroid/content/Context;)Z

    :cond_1
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 2613
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    iget-object v0, v0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    iget-object v0, v0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 2614
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    iget-object v0, v0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    .line 2616
    :cond_0
    invoke-static {}, Lio/branch/referral/BranchViewHandler;->getInstance()Lio/branch/referral/BranchViewHandler;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/branch/referral/BranchViewHandler;->onCurrentActivityDestroyed(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 2592
    iget-object p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$1300(Lio/branch/referral/Branch;)Lio/branch/referral/ShareLinkManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2593
    iget-object p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$1300(Lio/branch/referral/Branch;)Lio/branch/referral/ShareLinkManager;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lio/branch/referral/ShareLinkManager;->cancelShareLinkDialog(Z)V

    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 2576
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-static {v0, v1}, Lio/branch/referral/Branch;->access$1100(Lio/branch/referral/Branch;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2577
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    invoke-static {v0, v1}, Lio/branch/referral/Branch;->access$802(Lio/branch/referral/Branch;Lio/branch/referral/Branch$SESSION_STATE;)Lio/branch/referral/Branch$SESSION_STATE;

    .line 2578
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0, p1}, Lio/branch/referral/Branch;->access$1000(Lio/branch/referral/Branch;Landroid/app/Activity;)V

    .line 2580
    :cond_0
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    .line 2581
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$600(Lio/branch/referral/Branch;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2582
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    sget-object v1, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    invoke-static {v0, v1}, Lio/branch/referral/Branch;->access$502(Lio/branch/referral/Branch;Lio/branch/referral/Branch$INTENT_STATE;)Lio/branch/referral/Branch$INTENT_STATE;

    .line 2584
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$800(Lio/branch/referral/Branch;)Lio/branch/referral/Branch$SESSION_STATE;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2585
    :goto_0
    iget-object v1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1, p1, v0}, Lio/branch/referral/Branch;->access$1200(Lio/branch/referral/Branch;Landroid/app/Activity;Z)V

    :cond_2
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .line 2546
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$600(Lio/branch/referral/Branch;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/branch/referral/Branch$INTENT_STATE;->PENDING:Lio/branch/referral/Branch$INTENT_STATE;

    goto :goto_0

    :cond_0
    sget-object v1, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    :goto_0
    invoke-static {v0, v1}, Lio/branch/referral/Branch;->access$502(Lio/branch/referral/Branch;Lio/branch/referral/Branch$INTENT_STATE;)Lio/branch/referral/Branch$INTENT_STATE;

    .line 2548
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$800(Lio/branch/referral/Branch;)Lio/branch/referral/Branch$SESSION_STATE;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-ne v0, v1, :cond_1

    .line 2550
    :try_start_0
    invoke-static {}, Lio/branch/indexing/ContentDiscoverer;->getInstance()Lio/branch/indexing/ContentDiscoverer;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    iget-object v1, v1, Lio/branch/referral/Branch;->sessionReferredLink_:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lio/branch/indexing/ContentDiscoverer;->discoverContent(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2554
    :catch_0
    :cond_1
    iget v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->activityCnt_:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_4

    .line 2555
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$800(Lio/branch/referral/Branch;)Lio/branch/referral/Branch$SESSION_STATE;

    move-result-object v0

    sget-object v2, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-ne v0, v2, :cond_2

    .line 2557
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    sget-object v2, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    invoke-static {v0, v2}, Lio/branch/referral/Branch;->access$802(Lio/branch/referral/Branch;Lio/branch/referral/Branch$SESSION_STATE;)Lio/branch/referral/Branch$SESSION_STATE;

    .line 2560
    :cond_2
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$900(Lio/branch/referral/Branch;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lio/branch/referral/BranchUtil;->isTestModeEnabled(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2561
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->setExternDebug()V

    .line 2563
    :cond_3
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0, p1}, Lio/branch/referral/Branch;->access$1000(Lio/branch/referral/Branch;Landroid/app/Activity;)V

    goto :goto_1

    .line 2564
    :cond_4
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-static {v0, v2}, Lio/branch/referral/Branch;->access$1100(Lio/branch/referral/Branch;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2565
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    sget-object v2, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    invoke-static {v0, v2}, Lio/branch/referral/Branch;->access$802(Lio/branch/referral/Branch;Lio/branch/referral/Branch$SESSION_STATE;)Lio/branch/referral/Branch$SESSION_STATE;

    .line 2567
    iget-object v0, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0, p1}, Lio/branch/referral/Branch;->access$1000(Lio/branch/referral/Branch;Landroid/app/Activity;)V

    .line 2569
    :cond_5
    :goto_1
    iget p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->activityCnt_:I

    add-int/2addr p1, v1

    iput p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->activityCnt_:I

    .line 2570
    iget-object p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/branch/referral/Branch;->access$702(Lio/branch/referral/Branch;Z)Z

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 2599
    invoke-static {}, Lio/branch/indexing/ContentDiscoverer;->getInstance()Lio/branch/indexing/ContentDiscoverer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/branch/indexing/ContentDiscoverer;->onActivityStopped(Landroid/app/Activity;)V

    .line 2600
    iget p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->activityCnt_:I

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    iput p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->activityCnt_:I

    .line 2601
    iget p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->activityCnt_:I

    if-ge p1, v0, :cond_0

    .line 2602
    iget-object p1, p0, Lio/branch/referral/Branch$BranchActivityLifeCycleObserver;->this$0:Lio/branch/referral/Branch;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lio/branch/referral/Branch;->isInstantDeepLinkPossible:Z

    .line 2603
    invoke-virtual {p1}, Lio/branch/referral/Branch;->closeSessionInternal()V

    :cond_0
    return-void
.end method
