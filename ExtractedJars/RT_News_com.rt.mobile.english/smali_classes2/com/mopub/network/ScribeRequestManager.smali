.class public Lcom/mopub/network/ScribeRequestManager;
.super Lcom/mopub/network/RequestManager;
.source "ScribeRequestManager.java"

# interfaces
.implements Lcom/mopub/network/ScribeRequest$Listener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mopub/network/RequestManager<",
        "Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;",
        ">;",
        "Lcom/mopub/network/ScribeRequest$Listener;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/mopub/network/RequestManager;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method createRequest()Lcom/mopub/volley/Request;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/mopub/volley/Request<",
            "*>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager;->mRequestFactory:Lcom/mopub/network/RequestManager$RequestFactory;

    check-cast v0, Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;

    invoke-interface {v0, p0}, Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;->createRequest(Lcom/mopub/network/ScribeRequest$Listener;)Lcom/mopub/network/ScribeRequest;

    move-result-object v0

    return-object v0
.end method

.method public onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/mopub/network/ScribeRequestManager$2;

    invoke-direct {v1, p0, p1}, Lcom/mopub/network/ScribeRequestManager$2;-><init>(Lcom/mopub/network/ScribeRequestManager;Lcom/mopub/volley/VolleyError;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onResponse()V
    .locals 2

    const-string v0, "Successfully scribed events"

    .line 32
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/mopub/network/ScribeRequestManager;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/mopub/network/ScribeRequestManager$1;

    invoke-direct {v1, p0}, Lcom/mopub/network/ScribeRequestManager$1;-><init>(Lcom/mopub/network/ScribeRequestManager;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
