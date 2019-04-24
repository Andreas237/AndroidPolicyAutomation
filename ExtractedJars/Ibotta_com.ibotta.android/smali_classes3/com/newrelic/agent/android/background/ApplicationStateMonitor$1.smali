.class Lcom/newrelic/agent/android/background/ApplicationStateMonitor$1;
.super Ljava/lang/Object;
.source "ApplicationStateMonitor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->uiHidden()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$1;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$1;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    iget-object v0, v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->access$000()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    const-string v1, "UI has become hidden (app backgrounded)"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$1;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    invoke-static {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->access$100(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V

    .line 61
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$1;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    iget-object v0, v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
