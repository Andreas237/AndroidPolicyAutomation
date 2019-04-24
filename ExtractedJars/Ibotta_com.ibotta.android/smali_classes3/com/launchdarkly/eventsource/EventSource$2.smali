.class Lcom/launchdarkly/eventsource/EventSource$2;
.super Ljava/lang/Object;
.source "EventSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/eventsource/EventSource;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/eventsource/EventSource;


# direct methods
.method constructor <init>(Lcom/launchdarkly/eventsource/EventSource;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource$2;->this$0:Lcom/launchdarkly/eventsource/EventSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$2;->this$0:Lcom/launchdarkly/eventsource/EventSource;

    invoke-static {v0}, Lcom/launchdarkly/eventsource/EventSource;->access$1100(Lcom/launchdarkly/eventsource/EventSource;)V

    return-void
.end method
