.class public Lcom/mopub/network/MoPubRequestQueue;
.super Lcom/mopub/volley/RequestQueue;
.source "MoPubRequestQueue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;
    }
.end annotation


# static fields
.field private static final CAPACITY:I = 0xa


# instance fields
.field private final mDelayedRequests:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/mopub/volley/Request<",
            "*>;",
            "Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lcom/mopub/volley/RequestQueue;-><init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;)V

    .line 45
    new-instance p1, Ljava/util/HashMap;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Lcom/mopub/volley/RequestQueue;-><init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;I)V

    .line 40
    new-instance p1, Ljava/util/HashMap;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;ILcom/mopub/volley/ResponseDelivery;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/mopub/volley/RequestQueue;-><init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;ILcom/mopub/volley/ResponseDelivery;)V

    .line 35
    new-instance p1, Ljava/util/HashMap;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/network/MoPubRequestQueue;)Ljava/util/Map;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public addDelayedRequest(Lcom/mopub/volley/Request;I)V
    .locals 1
    .param p1    # Lcom/mopub/volley/Request;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request<",
            "*>;I)V"
        }
    .end annotation

    .line 55
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 56
    new-instance v0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;

    invoke-direct {v0, p0, p1, p2}, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;-><init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;I)V

    invoke-virtual {p0, p1, v0}, Lcom/mopub/network/MoPubRequestQueue;->addDelayedRequest(Lcom/mopub/volley/Request;Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;)V

    return-void
.end method

.method addDelayedRequest(Lcom/mopub/volley/Request;Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;)V
    .locals 1
    .param p1    # Lcom/mopub/volley/Request;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request<",
            "*>;",
            "Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;",
            ")V"
        }
    .end annotation

    .line 61
    invoke-static {p2}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p0, p1}, Lcom/mopub/network/MoPubRequestQueue;->cancel(Lcom/mopub/volley/Request;)V

    .line 67
    :cond_0
    invoke-virtual {p2}, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->start()V

    .line 68
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public cancel(Lcom/mopub/volley/Request;)V
    .locals 1
    .param p1    # Lcom/mopub/volley/Request;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request<",
            "*>;)V"
        }
    .end annotation

    .line 115
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 117
    new-instance v0, Lcom/mopub/network/MoPubRequestQueue$2;

    invoke-direct {v0, p0, p1}, Lcom/mopub/network/MoPubRequestQueue$2;-><init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;)V

    invoke-virtual {p0, v0}, Lcom/mopub/network/MoPubRequestQueue;->cancelAll(Lcom/mopub/volley/RequestQueue$RequestFilter;)V

    return-void
.end method

.method public cancelAll(Lcom/mopub/volley/RequestQueue$RequestFilter;)V
    .locals 3
    .param p1    # Lcom/mopub/volley/RequestQueue$RequestFilter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 76
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 78
    invoke-super {p0, p1}, Lcom/mopub/volley/RequestQueue;->cancelAll(Lcom/mopub/volley/RequestQueue$RequestFilter;)V

    .line 80
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 81
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 83
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mopub/volley/Request;

    invoke-interface {p1, v2}, Lcom/mopub/volley/RequestQueue$RequestFilter;->apply(Lcom/mopub/volley/Request;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 85
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mopub/volley/Request;

    invoke-virtual {v2}, Lcom/mopub/volley/Request;->cancel()V

    .line 86
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;

    invoke-virtual {v1}, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->cancel()V

    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public cancelAll(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 97
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 99
    invoke-super {p0, p1}, Lcom/mopub/volley/RequestQueue;->cancelAll(Ljava/lang/Object;)V

    .line 101
    new-instance v0, Lcom/mopub/network/MoPubRequestQueue$1;

    invoke-direct {v0, p0, p1}, Lcom/mopub/network/MoPubRequestQueue$1;-><init>(Lcom/mopub/network/MoPubRequestQueue;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/mopub/network/MoPubRequestQueue;->cancelAll(Lcom/mopub/volley/RequestQueue$RequestFilter;)V

    return-void
.end method

.method getDelayedRequests()Ljava/util/Map;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/mopub/volley/Request<",
            "*>;",
            "Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue;->mDelayedRequests:Ljava/util/Map;

    return-object v0
.end method
