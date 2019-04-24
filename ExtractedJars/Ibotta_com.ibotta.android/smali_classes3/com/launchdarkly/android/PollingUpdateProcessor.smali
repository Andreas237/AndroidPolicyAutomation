.class Lcom/launchdarkly/android/PollingUpdateProcessor;
.super Ljava/lang/Object;
.source "PollingUpdateProcessor.java"

# interfaces
.implements Lcom/launchdarkly/android/UpdateProcessor;


# instance fields
.field private final config:Lcom/launchdarkly/android/LDConfig;

.field private final context:Landroid/content/Context;

.field private final userManager:Lcom/launchdarkly/android/UserManager;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/launchdarkly/android/UserManager;Lcom/launchdarkly/android/LDConfig;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->context:Landroid/content/Context;

    .line 17
    iput-object p2, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    .line 18
    iput-object p3, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    return-void
.end method


# virtual methods
.method public isInitialized()Z
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->isInitialized()Z

    move-result v0

    return v0
.end method

.method public restart()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 41
    invoke-virtual {p0}, Lcom/launchdarkly/android/PollingUpdateProcessor;->stop()V

    .line 42
    invoke-virtual {p0}, Lcom/launchdarkly/android/PollingUpdateProcessor;->start()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public start()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Starting PollingUpdateProcessor"

    const/4 v1, 0x0

    .line 23
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    iget-object v0, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->getPollingIntervalMillis()I

    move-result v1

    iget-object v2, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v2}, Lcom/launchdarkly/android/LDConfig;->getPollingIntervalMillis()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/launchdarkly/android/PollingUpdater;->startPolling(Landroid/content/Context;II)V

    .line 25
    iget-object v0, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v0}, Lcom/launchdarkly/android/UserManager;->updateCurrentUser()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public stop()V
    .locals 2

    const-string v0, "Stopping PollingUpdateProcessor"

    const/4 v1, 0x0

    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    iget-object v0, p0, Lcom/launchdarkly/android/PollingUpdateProcessor;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/launchdarkly/android/PollingUpdater;->stop(Landroid/content/Context;)V

    return-void
.end method
