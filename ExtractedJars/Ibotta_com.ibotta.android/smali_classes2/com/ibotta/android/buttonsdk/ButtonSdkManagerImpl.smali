.class public Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;
.super Ljava/lang/Object;
.source "ButtonSdkManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/buttonsdk/ButtonSdkManager;
.implements Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;
.implements Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

.field private final cacheRemover:Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

.field private final globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

.field private final handler:Landroid/os/Handler;

.field private final storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;

.field private welcomeBackUI:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->cacheRemover:Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    .line 57
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    .line 58
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 59
    iput-object p5, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 60
    iput-object p6, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 61
    iput-object p7, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 62
    iput-object p8, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->handler:Landroid/os/Handler;

    .line 63
    iput-object p9, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;

    .line 64
    iput-object p10, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    return-void
.end method

.method private handleTxResponse(Lcom/ibotta/api/model/buttonsdk/ButtonTx;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 189
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object p2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {p2}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->isReturningFromLaunch()Z

    move-result p2

    if-nez p2, :cond_0

    const-string p1, "Not expecting Button transactions at this time."

    .line 191
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 196
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;

    move-result-object p2

    .line 197
    invoke-interface {p2, p1}, Lcom/ibotta/android/state/GlobalEventManager;->onButtonSdkWelcomeBack(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    return-void
.end method


# virtual methods
.method protected createButtonSdkTxsLoader()Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;
    .locals 10

    .line 92
    new-instance v9, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->handler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    .line 97
    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    .line 98
    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getLaunchTimestamp()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    .line 99
    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getSrcToken()Ljava/lang/String;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Landroid/os/Handler;IJLjava/lang/String;)V

    return-object v9
.end method

.method protected createButtonSdkWelcomeBackUI()Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;
    .locals 1

    .line 88
    new-instance v0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    invoke-direct {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;-><init>()V

    return-object v0
.end method

.method protected getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-object v0
.end method

.method protected getButtonSdkCacheRemover()Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->cacheRemover:Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    return-object v0
.end method

.method protected getButtonSdkStorage()Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    return-object v0
.end method

.method protected getGlobalEventManager()Lcom/ibotta/android/state/GlobalEventManager;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    return-object v0
.end method

.method protected getNow()J
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 215
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method protected isLaunchTimeRecentEnough()Z
    .locals 6

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getButtonSdkWelcomeBackThreshold()J

    move-result-wide v0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-gtz v5, :cond_0

    return v2

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getLaunchTimestamp()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_1

    return v2

    .line 208
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->getNow()J

    move-result-wide v0

    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v3}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getLaunchTimestamp()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v0, v3

    .line 210
    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v3}, Lcom/ibotta/android/state/app/config/AppConfig;->getButtonSdkWelcomeBackThreshold()J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-gtz v5, :cond_2

    const/4 v2, 0x1

    :cond_2
    return v2
.end method

.method public onFetchTxFail()V
    .locals 2

    const-string v0, "Failed to fetch Button SDK transactions."

    const/4 v1, 0x0

    .line 185
    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->handleTxResponse(Lcom/ibotta/api/model/buttonsdk/ButtonTx;Ljava/lang/String;)V

    return-void
.end method

.method public onFetchTxSuccess(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 1

    const-string v0, "Successfully fetched Button SDK transactions."

    .line 180
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->handleTxResponse(Lcom/ibotta/api/model/buttonsdk/ButtonTx;Ljava/lang/String;)V

    return-void
.end method

.method public onLogOut(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 220
    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->resetLaunch(Z)V

    return-void
.end method

.method public onWelcomeBackDialogDisplayed()V
    .locals 1

    const/4 v0, 0x0

    .line 175
    invoke-virtual {p0, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->resetLaunch(Z)V

    return-void
.end method

.method public pollForTransactions(Lcom/ibotta/android/activity/CompatSupplier;)V
    .locals 3

    const-string v0, "pollForTransactions"

    const/4 v1, 0x0

    .line 125
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "User is not logged in."

    .line 128
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->isReturningFromLaunch()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "Not expecting any Button transactions right now."

    .line 132
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 136
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->isLaunchTimeRecentEnough()Z

    move-result v0

    if-nez v0, :cond_2

    const-string p1, "Time is not recent enough from the last app launch."

    .line 137
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-virtual {p0, v1}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->resetLaunch(Z)V

    return-void

    .line 142
    :cond_2
    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->showWelcomeBackLoading(Lcom/ibotta/android/activity/CompatSupplier;)V

    const-string p1, "Submitting request for Button transactions."

    .line 144
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->createButtonSdkTxsLoader()Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;

    move-result-object p1

    .line 147
    invoke-virtual {p1, p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->setListener(Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader$ButtonSdkTxsLoaderListener;)V

    .line 148
    invoke-virtual {p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkTxsLoader;->pollForTransactions()V

    return-void
.end method

.method public recordAppLaunch(Lcom/ibotta/android/fragment/retailer/RetailerParcel;JLjava/lang/String;)V
    .locals 2

    const-string v0, "recordAppLaunch"

    const/4 v1, 0x0

    .line 104
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->saveLaunchData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;JLjava/lang/String;)V

    return-void
.end method

.method public resetLaunch(Z)V
    .locals 5

    const-string v0, "resetLaunch"

    const/4 v1, 0x0

    .line 110
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackMcommReturn()V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getLaunchTimestamp()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->cacheRemover:Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v1}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v2}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getLaunchTimestamp()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v4}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getSrcToken()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;->remove(IJLjava/lang/String;)V

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->deleteEverything()V

    if-eqz p1, :cond_1

    .line 119
    invoke-static {}, Lcom/usebutton/sdk/Button;->clearAllData()V

    :cond_1
    return-void
.end method

.method protected showWelcomeBackLoading(Lcom/ibotta/android/activity/CompatSupplier;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "Show welcome back loading screen"

    const/4 v1, 0x0

    .line 153
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    .line 154
    invoke-interface {p1}, Lcom/ibotta/android/activity/CompatSupplier;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    if-eqz v0, :cond_1

    .line 155
    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->createButtonSdkWelcomeBackUI()Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->welcomeBackUI:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->welcomeBackUI:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->setListener(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI$ButtonSdkWelcomeBackUIListener;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->welcomeBackUI:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    invoke-interface {p1}, Lcom/ibotta/android/activity/CompatSupplier;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-virtual {v0, p1, v1}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->showWelcomeBackLoadingDialog(Landroid/app/Activity;Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public showWelcomeBackTransactionData(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 3

    const-string v0, "Show welcome back Transaction data"

    const/4 v1, 0x0

    .line 165
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->welcomeBackUI:Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    if-nez v0, :cond_0

    .line 167
    invoke-virtual {p0, v1}, Lcom/ibotta/android/buttonsdk/ButtonSdkManagerImpl;->resetLaunch(Z)V

    return-void

    .line 170
    :cond_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->showWelcomeBackTxDialog(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    return-void
.end method
