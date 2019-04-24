.class public Lcom/newrelic/agent/android/util/UiBackgroundListener;
.super Ljava/lang/Object;
.source "UiBackgroundListener.java"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field protected final executor:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lcom/newrelic/agent/android/util/NamedThreadFactory;

    const-string v1, "UiBackgroundListener"

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/util/UiBackgroundListener;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    const/16 v0, 0x14

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Lcom/newrelic/agent/android/util/UiBackgroundListener$1;

    invoke-direct {p1, p0}, Lcom/newrelic/agent/android/util/UiBackgroundListener$1;-><init>(Lcom/newrelic/agent/android/util/UiBackgroundListener;)V

    .line 36
    iget-object v0, p0, Lcom/newrelic/agent/android/util/UiBackgroundListener;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :goto_0
    return-void
.end method
