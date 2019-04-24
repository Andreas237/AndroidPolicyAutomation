.class Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;
.super Ljava/lang/Object;
.source "StreamUpdateProcessor.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/StreamUpdateProcessor$1;->onMessage(Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/launchdarkly/android/StreamUpdateProcessor$1;

.field final synthetic val$eventData:Ljava/lang/String;

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/StreamUpdateProcessor$1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->this$1:Lcom/launchdarkly/android/StreamUpdateProcessor$1;

    iput-object p2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->val$eventData:Ljava/lang/String;

    iput-object p3, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->val$name:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "consumeThis: event: %s"

    const/4 v1, 0x1

    .line 86
    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->val$eventData:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->this$1:Lcom/launchdarkly/android/StreamUpdateProcessor$1;

    iget-object v0, v0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v0}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$000(Lcom/launchdarkly/android/StreamUpdateProcessor;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->this$1:Lcom/launchdarkly/android/StreamUpdateProcessor$1;

    iget-object v0, v0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v0}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$200(Lcom/launchdarkly/android/StreamUpdateProcessor;)Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->this$1:Lcom/launchdarkly/android/StreamUpdateProcessor$1;

    iget-object v1, v1, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    iget-object v2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->val$name:Ljava/lang/String;

    iget-object v3, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->val$eventData:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$100(Lcom/launchdarkly/android/StreamUpdateProcessor;Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/util/concurrent/SettableFuture;->setFuture(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    const-string v0, "Initialized LaunchDarkly streaming connection"

    .line 89
    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->this$1:Lcom/launchdarkly/android/StreamUpdateProcessor$1;

    iget-object v0, v0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->val$name:Ljava/lang/String;

    iget-object v2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;->val$eventData:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$100(Lcom/launchdarkly/android/StreamUpdateProcessor;Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
