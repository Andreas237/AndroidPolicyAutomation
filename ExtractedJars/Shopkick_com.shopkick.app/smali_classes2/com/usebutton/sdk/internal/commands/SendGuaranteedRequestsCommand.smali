.class public Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;
.super Lcom/usebutton/sdk/internal/core/Command;
.source "SendGuaranteedRequestsCommand.java"


# instance fields
.field private final mHttp:Lcom/usebutton/sdk/internal/api/Http;

.field private final mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/core/Command;-><init>()V

    .line 16
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getHttp()Lcom/usebutton/sdk/internal/api/Http;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    .line 17
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getShepherd()Lcom/usebutton/sdk/internal/api/RequestShepherd;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->hasPendingRequests()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 25
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->nextPendingRequest()Lcom/usebutton/sdk/internal/api/Request;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 26
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->tryRequest(Lcom/usebutton/sdk/internal/api/Request;)V

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public isPermanentFailure(Lcom/usebutton/sdk/internal/api/ButtonNetworkException;)Z
    .locals 3

    .line 43
    instance-of v0, p1, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 46
    :cond_0
    check-cast p1, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;

    .line 47
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->wasBadRequest()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->wasServerError()Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 58
    const-class v0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected tryRequest(Lcom/usebutton/sdk/internal/api/Request;)V
    .locals 1

    .line 33
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    .line 34
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->markAsDone(Lcom/usebutton/sdk/internal/api/Request;)V
    :try_end_0
    .catch Lcom/usebutton/sdk/internal/api/ButtonNetworkException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 36
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->isPermanentFailure(Lcom/usebutton/sdk/internal/api/ButtonNetworkException;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/SendGuaranteedRequestsCommand;->mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/RequestShepherd;->markAsDone(Lcom/usebutton/sdk/internal/api/Request;)V

    :cond_0
    :goto_0
    return-void
.end method
