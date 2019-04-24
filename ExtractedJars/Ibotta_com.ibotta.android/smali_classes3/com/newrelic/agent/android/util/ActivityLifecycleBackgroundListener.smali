.class public Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;
.super Lcom/newrelic/agent/android/util/UiBackgroundListener;
.source "ActivityLifecycleBackgroundListener.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Lcom/newrelic/agent/android/util/UiBackgroundListener;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method static synthetic access$000()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 15
    sget-object v0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 44
    sget-object p1, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p2, "ActivityLifecycleBackgroundListener.onActivityCreated"

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 45
    iget-object p1, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 50
    sget-object p1, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "ActivityLifecycleBackgroundListener.onActivityDestroyed"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 51
    iget-object p1, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 71
    iget-object p1, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 72
    new-instance p1, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$3;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$3;-><init>(Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;)V

    .line 79
    iget-object v0, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 22
    sget-object p1, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "ActivityLifecycleBackgroundListener.onActivityResumed"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 23
    iget-object p1, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 24
    new-instance p1, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$1;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$1;-><init>(Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;)V

    .line 30
    iget-object v0, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 57
    iget-object p1, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 58
    new-instance p1, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$2;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$2;-><init>(Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;)V

    .line 65
    iget-object v0, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 3

    .line 36
    sget-object v0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityLifecycleBackgroundListener.onTrimMemory level: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    const/16 v0, 0x14

    if-ne v0, p1, :cond_0

    .line 38
    iget-object v0, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->isInBackground:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 39
    :cond_0
    invoke-super {p0, p1}, Lcom/newrelic/agent/android/util/UiBackgroundListener;->onTrimMemory(I)V

    return-void
.end method
