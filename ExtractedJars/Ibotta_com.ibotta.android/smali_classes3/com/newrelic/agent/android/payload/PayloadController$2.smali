.class final Lcom/newrelic/agent/android/payload/PayloadController$2;
.super Ljava/lang/Object;
.source "PayloadController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/payload/PayloadController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 58
    invoke-static {}, Lcom/newrelic/agent/android/payload/PayloadController;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    sget-object v0, Lcom/newrelic/agent/android/payload/PayloadController;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/payload/PayloadController;

    invoke-static {v0}, Lcom/newrelic/agent/android/payload/PayloadController;->access$100(Lcom/newrelic/agent/android/payload/PayloadController;)V

    :cond_0
    return-void
.end method
