.class public Lcom/mopub/network/ScribeRequest;
.super Lcom/mopub/volley/Request;
.source "ScribeRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;,
        Lcom/mopub/network/ScribeRequest$Listener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mopub/volley/Request<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final mEventSerializer:Lcom/mopub/common/event/EventSerializer;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mEvents:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mopub/common/event/BaseEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final mListener:Lcom/mopub/network/ScribeRequest$Listener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/mopub/common/event/EventSerializer;Lcom/mopub/network/ScribeRequest$Listener;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/common/event/EventSerializer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/mopub/network/ScribeRequest$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mopub/common/event/BaseEvent;",
            ">;",
            "Lcom/mopub/common/event/EventSerializer;",
            "Lcom/mopub/network/ScribeRequest$Listener;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 41
    invoke-direct {p0, v0, p1, p4}, Lcom/mopub/volley/Request;-><init>(ILjava/lang/String;Lcom/mopub/volley/Response$ErrorListener;)V

    .line 43
    iput-object p2, p0, Lcom/mopub/network/ScribeRequest;->mEvents:Ljava/util/List;

    .line 44
    iput-object p3, p0, Lcom/mopub/network/ScribeRequest;->mEventSerializer:Lcom/mopub/common/event/EventSerializer;

    .line 45
    iput-object p4, p0, Lcom/mopub/network/ScribeRequest;->mListener:Lcom/mopub/network/ScribeRequest$Listener;

    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, Lcom/mopub/network/ScribeRequest;->setShouldCache(Z)Lcom/mopub/volley/Request;

    .line 50
    new-instance p1, Lcom/mopub/volley/DefaultRetryPolicy;

    invoke-direct {p1}, Lcom/mopub/volley/DefaultRetryPolicy;-><init>()V

    invoke-virtual {p0, p1}, Lcom/mopub/network/ScribeRequest;->setRetryPolicy(Lcom/mopub/volley/RetryPolicy;)Lcom/mopub/volley/Request;

    return-void
.end method


# virtual methods
.method protected bridge synthetic deliverResponse(Ljava/lang/Object;)V
    .locals 0

    .line 23
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/mopub/network/ScribeRequest;->deliverResponse(Ljava/lang/Void;)V

    return-void
.end method

.method protected deliverResponse(Ljava/lang/Void;)V
    .locals 0

    .line 73
    iget-object p1, p0, Lcom/mopub/network/ScribeRequest;->mListener:Lcom/mopub/network/ScribeRequest$Listener;

    invoke-interface {p1}, Lcom/mopub/network/ScribeRequest$Listener;->onResponse()V

    return-void
.end method

.method public getEvents()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mopub/common/event/BaseEvent;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/mopub/network/ScribeRequest;->mEvents:Ljava/util/List;

    return-object v0
.end method

.method protected getParams()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/mopub/network/ScribeRequest;->mEventSerializer:Lcom/mopub/common/event/EventSerializer;

    iget-object v1, p0, Lcom/mopub/network/ScribeRequest;->mEvents:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/mopub/common/event/EventSerializer;->serializeAsJson(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v0

    .line 59
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "log"

    .line 60
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method protected parseNetworkResponse(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/NetworkResponse;",
            ")",
            "Lcom/mopub/volley/Response<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 68
    invoke-static {p1}, Lcom/mopub/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Cache$Entry;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lcom/mopub/volley/Response;->success(Ljava/lang/Object;Lcom/mopub/volley/Cache$Entry;)Lcom/mopub/volley/Response;

    move-result-object p1

    return-object p1
.end method
