.class Lcom/launchdarkly/eventsource/AsyncEventHandler;
.super Ljava/lang/Object;
.source "AsyncEventHandler.java"

# interfaces
.implements Lcom/launchdarkly/eventsource/EventHandler;


# instance fields
.field private final eventSourceHandler:Lcom/launchdarkly/eventsource/EventHandler;

.field private final executor:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lcom/launchdarkly/eventsource/EventHandler;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->executor:Ljava/util/concurrent/Executor;

    .line 15
    iput-object p2, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->eventSourceHandler:Lcom/launchdarkly/eventsource/EventHandler;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/eventsource/AsyncEventHandler;)Lcom/launchdarkly/eventsource/EventHandler;
    .locals 0

    .line 9
    iget-object p0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->eventSourceHandler:Lcom/launchdarkly/eventsource/EventHandler;

    return-object p0
.end method


# virtual methods
.method public onClosed()V
    .locals 2

    .line 31
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/launchdarkly/eventsource/AsyncEventHandler$2;

    invoke-direct {v1, p0}, Lcom/launchdarkly/eventsource/AsyncEventHandler$2;-><init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onComment(Ljava/lang/String;)V
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/launchdarkly/eventsource/AsyncEventHandler$3;

    invoke-direct {v1, p0, p1}, Lcom/launchdarkly/eventsource/AsyncEventHandler$3;-><init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/launchdarkly/eventsource/AsyncEventHandler$5;

    invoke-direct {v1, p0, p1}, Lcom/launchdarkly/eventsource/AsyncEventHandler$5;-><init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onMessage(Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;-><init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOpen()V
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/launchdarkly/eventsource/AsyncEventHandler$1;

    invoke-direct {v1, p0}, Lcom/launchdarkly/eventsource/AsyncEventHandler$1;-><init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
