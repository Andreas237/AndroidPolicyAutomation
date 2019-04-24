.class Lcom/launchdarkly/eventsource/AsyncEventHandler$5;
.super Ljava/lang/Object;
.source "AsyncEventHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/eventsource/AsyncEventHandler;->onError(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

.field final synthetic val$error:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/launchdarkly/eventsource/AsyncEventHandler;Ljava/lang/Throwable;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$5;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    iput-object p2, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$5;->val$error:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$5;->this$0:Lcom/launchdarkly/eventsource/AsyncEventHandler;

    invoke-static {v0}, Lcom/launchdarkly/eventsource/AsyncEventHandler;->access$000(Lcom/launchdarkly/eventsource/AsyncEventHandler;)Lcom/launchdarkly/eventsource/EventHandler;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/eventsource/AsyncEventHandler$5;->val$error:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
