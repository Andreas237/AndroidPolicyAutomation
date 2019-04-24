.class Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;
.super Ljava/lang/Object;
.source "AgentDataReporter.java"

# interfaces
.implements Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->submitBatchedPayload(Ljava/util/List;)[B
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

.field final synthetic val$payloads:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/agentdata/AgentDataReporter;Ljava/util/List;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;->this$0:Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    iput-object p2, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;->val$payloads:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onException(Lcom/newrelic/agent/android/payload/PayloadSender;Ljava/lang/Exception;)V
    .locals 2

    .line 212
    invoke-static {}, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->access$100()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AgentDataReporter.submitBatchedPayload(List<Payload>): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Lcom/newrelic/agent/android/payload/PayloadSender;)V
    .locals 2

    .line 201
    invoke-virtual {p1}, Lcom/newrelic/agent/android/payload/PayloadSender;->isSuccessfulResponse()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 202
    iget-object p1, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;->this$0:Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    iget-object p1, p1, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    if-eqz p1, :cond_0

    .line 203
    iget-object p1, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;->val$payloads:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/payload/Payload;

    .line 204
    iget-object v1, p0, Lcom/newrelic/agent/android/agentdata/AgentDataReporter$3;->this$0:Lcom/newrelic/agent/android/agentdata/AgentDataReporter;

    iget-object v1, v1, Lcom/newrelic/agent/android/agentdata/AgentDataReporter;->payloadStore:Lcom/newrelic/agent/android/payload/PayloadStore;

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/payload/PayloadStore;->delete(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
