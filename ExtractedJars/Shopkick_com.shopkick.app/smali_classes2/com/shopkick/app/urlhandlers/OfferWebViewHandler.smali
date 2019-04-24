.class public Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "OfferWebViewHandler.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "offer"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private getOfferWebviewDeeplinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 28
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 29
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    return-void
.end method


# virtual methods
.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 4

    .line 34
    new-instance v0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 17
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->getOfferWebviewDeeplinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;

    if-ne p1, v0, :cond_1

    .line 61
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    .line 62
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkResponse;

    .line 63
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkResponse;->skLink:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 65
    iget-object p2, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 66
    iget-object p2, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :cond_0
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->getOfferWebviewDeeplinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;

    :cond_1
    return-void
.end method

.method public execute()V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->urlPathComponents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->urlPathComponents:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 46
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->getOfferWebviewDeeplinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;

    if-nez v1, :cond_1

    .line 47
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->getOfferWebviewDeeplinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;

    .line 48
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->getOfferWebviewDeeplinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/GetOfferWebviewDeeplinkRequest;->offerId:Ljava/lang/String;

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_1
    return-void

    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/OfferWebViewHandler;->finish()V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
