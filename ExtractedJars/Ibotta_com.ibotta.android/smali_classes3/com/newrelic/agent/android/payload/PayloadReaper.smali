.class Lcom/newrelic/agent/android/payload/PayloadReaper;
.super Ljava/lang/Object;
.source "PayloadReaper.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/newrelic/agent/android/payload/PayloadSender;",
        ">;"
    }
.end annotation


# instance fields
.field final handler:Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;

.field final sender:Lcom/newrelic/agent/android/payload/PayloadSender;


# direct methods
.method public constructor <init>(Lcom/newrelic/agent/android/payload/PayloadSender;Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 14
    iput-object p1, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->sender:Lcom/newrelic/agent/android/payload/PayloadSender;

    .line 15
    iput-object p2, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->handler:Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;

    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Must provide payload sender!"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public call()Lcom/newrelic/agent/android/payload/PayloadSender;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 22
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->sender:Lcom/newrelic/agent/android/payload/PayloadSender;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/payload/PayloadSender;->call()Lcom/newrelic/agent/android/payload/PayloadSender;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->handler:Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;

    if-eqz v1, :cond_0

    .line 25
    iget-object v1, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->handler:Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;->onResponse(Lcom/newrelic/agent/android/payload/PayloadSender;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    .line 31
    iget-object v1, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->handler:Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;

    if-eqz v1, :cond_1

    .line 32
    iget-object v2, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->sender:Lcom/newrelic/agent/android/payload/PayloadSender;

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;->onException(Lcom/newrelic/agent/android/payload/PayloadSender;Ljava/lang/Exception;)V

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 5
    invoke-virtual {p0}, Lcom/newrelic/agent/android/payload/PayloadReaper;->call()Lcom/newrelic/agent/android/payload/PayloadSender;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 45
    :cond_0
    instance-of v0, p1, Lcom/newrelic/agent/android/payload/PayloadReaper;

    if-eqz v0, :cond_1

    .line 46
    check-cast p1, Lcom/newrelic/agent/android/payload/PayloadReaper;

    .line 47
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->sender:Lcom/newrelic/agent/android/payload/PayloadSender;

    iget-object v0, v0, Lcom/newrelic/agent/android/payload/PayloadSender;->payload:Lcom/newrelic/agent/android/payload/Payload;

    iget-object p1, p1, Lcom/newrelic/agent/android/payload/PayloadReaper;->sender:Lcom/newrelic/agent/android/payload/PayloadSender;

    iget-object p1, p1, Lcom/newrelic/agent/android/payload/PayloadSender;->payload:Lcom/newrelic/agent/android/payload/Payload;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/payload/Payload;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getUuid()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/PayloadReaper;->sender:Lcom/newrelic/agent/android/payload/PayloadSender;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/payload/PayloadSender;->getPayload()Lcom/newrelic/agent/android/payload/Payload;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/payload/Payload;->getUuid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
