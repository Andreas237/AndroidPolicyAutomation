.class public Lcom/shopkick/app/urlhandlers/APICallHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "APICallHandler.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "apicall"

.field private static final PARAM_DATA:Ljava/lang/String; = "data"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/APICallHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 30
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public execute()V
    .locals 3

    .line 23
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/WhateverCallRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/WhateverCallRequest;-><init>()V

    .line 24
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/APICallHandler;->params:Ljava/util/Map;

    const-string v2, "data"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/WhateverCallRequest;->data:Ljava/lang/String;

    .line 25
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/APICallHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
