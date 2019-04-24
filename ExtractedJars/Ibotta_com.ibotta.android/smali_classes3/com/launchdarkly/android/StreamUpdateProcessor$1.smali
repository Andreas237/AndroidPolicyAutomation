.class Lcom/launchdarkly/android/StreamUpdateProcessor$1;
.super Ljava/lang/Object;
.source "StreamUpdateProcessor.java"

# interfaces
.implements Lcom/launchdarkly/eventsource/EventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/StreamUpdateProcessor;->start()Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/StreamUpdateProcessor;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosed()V
    .locals 2

    const-string v0, "Closed LaunchDarkly EventStream"

    const/4 v1, 0x0

    .line 76
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onComment(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 6

    const-string v0, "Encountered EventStream error connecting to URI: %s"

    const/4 v1, 0x1

    .line 107
    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v3}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$400(Lcom/launchdarkly/android/StreamUpdateProcessor;)Lcom/launchdarkly/android/UserManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$500(Lcom/launchdarkly/android/StreamUpdateProcessor;Lcom/launchdarkly/android/LDUser;)Ljava/net/URI;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1, v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    instance-of v0, p1, Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;

    if-eqz v0, :cond_2

    .line 109
    move-object v0, p1

    check-cast v0, Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;

    invoke-virtual {v0}, Lcom/launchdarkly/eventsource/UnsuccessfulResponseException;->getCode()I

    move-result v0

    const/16 v2, 0x190

    if-lt v0, v2, :cond_2

    const/16 v2, 0x1f4

    if-ge v0, v2, :cond_2

    const-string v2, "Encountered non-retriable error: %s. Aborting connection to stream. Verify correct Mobile Key and Stream URI"

    .line 111
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v2, v4}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$602(Lcom/launchdarkly/android/StreamUpdateProcessor;Z)Z

    .line 113
    iget-object v2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v2}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$000(Lcom/launchdarkly/android/StreamUpdateProcessor;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v2

    if-nez v2, :cond_0

    .line 114
    iget-object v2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {v2}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$200(Lcom/launchdarkly/android/StreamUpdateProcessor;)Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/common/util/concurrent/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    :cond_0
    const/16 p1, 0x191

    if-ne v0, p1, :cond_1

    .line 117
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {p1, v1}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$702(Lcom/launchdarkly/android/StreamUpdateProcessor;Z)Z

    .line 119
    :try_start_0
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {p1}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$800(Lcom/launchdarkly/android/StreamUpdateProcessor;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/launchdarkly/android/LDClient;->getForMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDClient;

    move-result-object p1

    .line 120
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDClient;->setOffline()V
    :try_end_0
    .catch Lcom/launchdarkly/android/LaunchDarklyException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Client unavailable to be set offline"

    .line 122
    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-virtual {p1}, Lcom/launchdarkly/android/StreamUpdateProcessor;->stop()V

    :cond_2
    return-void
.end method

.method public onMessage(Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "onMessage: name: %s"

    const/4 v1, 0x1

    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-virtual {p2}, Lcom/launchdarkly/eventsource/MessageEvent;->getData()Ljava/lang/String;

    move-result-object p2

    .line 83
    new-instance v0, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;

    invoke-direct {v0, p0, p2, p1}, Lcom/launchdarkly/android/StreamUpdateProcessor$1$1;-><init>(Lcom/launchdarkly/android/StreamUpdateProcessor$1;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor$1;->this$0:Lcom/launchdarkly/android/StreamUpdateProcessor;

    invoke-static {p1}, Lcom/launchdarkly/android/StreamUpdateProcessor;->access$300(Lcom/launchdarkly/android/StreamUpdateProcessor;)Lcom/launchdarkly/android/Debounce;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/launchdarkly/android/Debounce;->call(Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public onOpen()V
    .locals 2

    const-string v0, "Started LaunchDarkly EventStream"

    const/4 v1, 0x0

    .line 71
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
