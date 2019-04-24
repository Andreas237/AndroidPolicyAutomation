.class Lcom/launchdarkly/eventsource/AsyncEventHandler$2;
.super Ljava/lang/Object;
.source "AsyncEventHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/eventsource/AsyncEventHandler;->onClosed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;


# direct methods
.method constructor <init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$2;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$2;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    invoke-static {v0}, Lcom/launchdarkly/eventsource/AsyncEventHandler;->access$000(Lcom/launchdarkly/eventsource/AsyncEventHandler;)Lcom/launchdarkly/eventsource/EventHandler;

    move-result-object v0

    invoke-interface {v0}, Lcom/launchdarkly/eventsource/EventHandler;->onClosed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 36
    iget-object v1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$2;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    invoke-virtual {v1, v0}, Lcom/launchdarkly/eventsource/AsyncEventHandler;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
