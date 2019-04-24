.class Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;
.super Ljava/lang/Object;
.source "ApplicationStateMonitor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V
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

    .line 82
    iput-object p1, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 85
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    invoke-static {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->access$200(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    iget-object v0, v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    iget-object v0, v0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 87
    iget-object v0, p0, Lcom/newrelic/agent/android/background/ApplicationStateMonitor$3;->this$0:Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    invoke-static {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->access$300(Lcom/newrelic/agent/android/background/ApplicationStateMonitor;)V

    :cond_0
    return-void
.end method
