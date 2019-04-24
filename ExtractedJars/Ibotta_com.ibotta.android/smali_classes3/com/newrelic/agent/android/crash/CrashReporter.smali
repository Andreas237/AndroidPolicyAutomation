.class public Lcom/newrelic/agent/android/crash/CrashReporter;
.super Lcom/newrelic/agent/android/payload/PayloadReporter;
.source "CrashReporter.java"

# interfaces
.implements Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;


# static fields
.field protected static instance:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/newrelic/agent/android/crash/CrashReporter;",
            ">;"
        }
    .end annotation
.end field

.field private static reportCrashes:Z


# instance fields
.field protected final crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

.field private final uncaughtExceptionHandler:Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    .line 20
    sput-boolean v0, Lcom/newrelic/agent/android/crash/CrashReporter;->reportCrashes:Z

    return-void
.end method

.method protected constructor <init>(Lcom/newrelic/agent/android/AgentConfiguration;)V
    .locals 1

    .line 61
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/payload/PayloadReporter;-><init>(Lcom/newrelic/agent/android/AgentConfiguration;)V

    .line 62
    new-instance v0, Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;-><init>(Lcom/newrelic/agent/android/crash/CrashReporter;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->uncaughtExceptionHandler:Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;

    .line 63
    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getCrashStore()Lcom/newrelic/agent/android/crash/CrashStore;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

    .line 64
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getReportCrashes()Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method static synthetic access$000()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 16
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method static synthetic access$100(Lcom/newrelic/agent/android/crash/CrashReporter;)V
    .locals 0

    .line 16
    invoke-virtual {p0}, Lcom/newrelic/agent/android/crash/CrashReporter;->reportSupportabilityMetrics()V

    return-void
.end method

.method public static getInstance()Lcom/newrelic/agent/android/crash/CrashReporter;
    .locals 1

    .line 26
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/crash/CrashReporter;

    return-object v0
.end method

.method public static getUncaughtExceptionHandler()Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;
    .locals 1

    .line 49
    invoke-static {}, Lcom/newrelic/agent/android/crash/CrashReporter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/crash/CrashReporter;

    iget-object v0, v0, Lcom/newrelic/agent/android/crash/CrashReporter;->uncaughtExceptionHandler:Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static initialize(Lcom/newrelic/agent/android/AgentConfiguration;)Lcom/newrelic/agent/android/crash/CrashReporter;
    .locals 2

    .line 30
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/newrelic/agent/android/crash/CrashReporter;

    invoke-direct {v1, p0}, Lcom/newrelic/agent/android/crash/CrashReporter;-><init>(Lcom/newrelic/agent/android/AgentConfiguration;)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    sget-object p0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;

    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/Harvest;->addHarvestListener(Lcom/newrelic/agent/android/harvest/HarvestLifecycleAware;)V

    .line 32
    sget-object p0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/crash/CrashReporter;

    return-object p0
.end method

.method protected static isInitialized()Z
    .locals 1

    .line 56
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static setReportCrashes(Z)V
    .locals 1

    .line 43
    invoke-static {}, Lcom/newrelic/agent/android/crash/CrashReporter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/crash/CrashReporter;

    sput-boolean p0, Lcom/newrelic/agent/android/crash/CrashReporter;->reportCrashes:Z

    :cond_0
    return-void
.end method

.method public static shutdown()V
    .locals 2

    .line 36
    invoke-static {}, Lcom/newrelic/agent/android/crash/CrashReporter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/crash/CrashReporter;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/crash/CrashReporter;->stop()V

    .line 38
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onHarvest()V
    .locals 0

    return-void
.end method

.method public onHarvestBefore()V
    .locals 0

    return-void
.end method

.method public onHarvestComplete()V
    .locals 0

    return-void
.end method

.method public onHarvestConnected()V
    .locals 1

    .line 201
    new-instance v0, Lcom/newrelic/agent/android/crash/CrashReporter$2;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/crash/CrashReporter$2;-><init>(Lcom/newrelic/agent/android/crash/CrashReporter;)V

    invoke-static {v0}, Lcom/newrelic/agent/android/payload/PayloadController;->submitCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public onHarvestDisabled()V
    .locals 0

    return-void
.end method

.method public onHarvestDisconnected()V
    .locals 0

    return-void
.end method

.method public onHarvestError()V
    .locals 0

    return-void
.end method

.method public onHarvestFinalize()V
    .locals 0

    return-void
.end method

.method public onHarvestSendFailed()V
    .locals 0

    return-void
.end method

.method public onHarvestStart()V
    .locals 0

    return-void
.end method

.method public onHarvestStop()V
    .locals 0

    return-void
.end method

.method protected reportCrash(Lcom/newrelic/agent/android/crash/Crash;)Ljava/util/concurrent/Future;
    .locals 3

    .line 103
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->isValid()Z

    move-result v0

    .line 104
    sget-boolean v1, Lcom/newrelic/agent/android/crash/CrashReporter;->reportCrashes:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_2

    .line 106
    new-instance v0, Lcom/newrelic/agent/android/crash/CrashSender;

    iget-object v1, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-direct {v0, p1, v1}, Lcom/newrelic/agent/android/crash/CrashSender;-><init>(Lcom/newrelic/agent/android/crash/Crash;Lcom/newrelic/agent/android/AgentConfiguration;)V

    .line 108
    new-instance v1, Lcom/newrelic/agent/android/crash/CrashReporter$1;

    invoke-direct {v1, p0, p1}, Lcom/newrelic/agent/android/crash/CrashReporter$1;-><init>(Lcom/newrelic/agent/android/crash/CrashReporter;Lcom/newrelic/agent/android/crash/Crash;)V

    .line 124
    invoke-static {v0, v1}, Lcom/newrelic/agent/android/payload/PayloadController;->submitPayload(Lcom/newrelic/agent/android/payload/PayloadSender;Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "attempted to report null crash."

    if-nez v0, :cond_1

    const-string p1, "agent has not successfully connected and cannot report crashes."

    .line 131
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CrashReporter.reportCrash(Crash): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method protected reportSavedCrashes()V
    .locals 5

    .line 89
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

    if-eqz v0, :cond_1

    .line 90
    invoke-interface {v0}, Lcom/newrelic/agent/android/crash/CrashStore;->fetchAll()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/crash/Crash;

    .line 91
    invoke-virtual {v1}, Lcom/newrelic/agent/android/crash/Crash;->isStale()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 92
    iget-object v2, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/crash/CrashStore;->delete(Lcom/newrelic/agent/android/crash/Crash;)V

    .line 93
    sget-object v2, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Crash ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/crash/Crash;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] has become stale, and has been removed"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 94
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v1

    const-string v2, "Supportability/AgentHealth/Crash/Removed/Stale"

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/crash/CrashReporter;->reportCrash(Lcom/newrelic/agent/android/crash/Crash;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public start()V
    .locals 3

    .line 69
    invoke-static {}, Lcom/newrelic/agent/android/crash/CrashReporter;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p0}, Lcom/newrelic/agent/android/crash/CrashReporter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->uncaughtExceptionHandler:Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;->installExceptionHandler()V

    .line 73
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->agentConfiguration:Lcom/newrelic/agent/android/AgentConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/AgentConfiguration;->getReportCrashes()Z

    move-result v0

    sput-boolean v0, Lcom/newrelic/agent/android/crash/CrashReporter;->reportCrashes:Z

    goto :goto_0

    .line 77
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "AgentDataReporter.start(): Must initialize PayloadController first."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected stop()V
    .locals 1

    .line 83
    invoke-static {}, Lcom/newrelic/agent/android/crash/CrashReporter;->getUncaughtExceptionHandler()Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    invoke-static {}, Lcom/newrelic/agent/android/crash/CrashReporter;->getUncaughtExceptionHandler()Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/crash/UncaughtExceptionHandler;->resetExceptionHandler()V

    :cond_0
    return-void
.end method

.method protected storeAndReportCrash(Lcom/newrelic/agent/android/crash/Crash;)V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/newrelic/agent/android/crash/CrashReporter;->crashStore:Lcom/newrelic/agent/android/crash/CrashStore;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 141
    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/crash/CrashStore;->store(Lcom/newrelic/agent/android/crash/Crash;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 143
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "CrashReporter.storeAndReportCrash(Crash): failed to store passed crash."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    goto :goto_0

    .line 146
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "CrashReporter.storeAndReportCrash(Crash): attempted to store null crash."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    goto :goto_0

    .line 149
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "CrashReporter.storeAndReportCrash(Crash): attempted to store crash without a crash store."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    .line 154
    :cond_2
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/crash/CrashReporter;->reportCrash(Lcom/newrelic/agent/android/crash/Crash;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 156
    sget-object v0, Lcom/newrelic/agent/android/crash/CrashReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CrashReporter.storeAndReportCrash(Crash): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
