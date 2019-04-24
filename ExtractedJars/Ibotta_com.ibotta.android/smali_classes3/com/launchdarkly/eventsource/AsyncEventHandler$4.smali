.class Lcom/launchdarkly/eventsource/AsyncEventHandler$4;
.super Ljava/lang/Object;
.source "AsyncEventHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/eventsource/AsyncEventHandler;->onMessage(Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

.field final synthetic val$event:Ljava/lang/String;

.field final synthetic val$messageEvent:Lcom/launchdarkly/eventsource/MessageEvent;


# direct methods
.method constructor <init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    iput-object p2, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;->val$event:Ljava/lang/String;

    iput-object p3, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;->val$messageEvent:Lcom/launchdarkly/eventsource/MessageEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 58
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    invoke-static {v0}, Lcom/launchdarkly/eventsource/AsyncEventHandler;->access$000(Lcom/launchdarkly/eventsource/AsyncEventHandler;)Lcom/launchdarkly/eventsource/EventHandler;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;->val$event:Ljava/lang/String;

    iget-object v2, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;->val$messageEvent:Lcom/launchdarkly/eventsource/MessageEvent;

    invoke-interface {v0, v1, v2}, Lcom/launchdarkly/eventsource/EventHandler;->onMessage(Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 60
    iget-object v1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$4;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    invoke-virtual {v1, v0}, Lcom/launchdarkly/eventsource/AsyncEventHandler;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
