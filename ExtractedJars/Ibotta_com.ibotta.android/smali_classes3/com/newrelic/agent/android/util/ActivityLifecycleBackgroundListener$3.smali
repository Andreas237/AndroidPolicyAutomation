.class Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$3;
.super Ljava/lang/Object;
.source "ActivityLifecycleBackgroundListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->onActivityPaused(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener$3;->this$0:Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 75
    invoke-static {}, Lcom/newrelic/agent/android/util/ActivityLifecycleBackgroundListener;->access$000()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    const-string v1, "ActivityLifecycleBackgroundListener.onActivityPaused - notifying ApplicationStateMonitor"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 76
    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->uiHidden()V

    return-void
.end method
