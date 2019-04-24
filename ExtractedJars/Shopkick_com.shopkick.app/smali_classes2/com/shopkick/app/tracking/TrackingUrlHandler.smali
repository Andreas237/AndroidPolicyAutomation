.class public Lcom/shopkick/app/tracking/TrackingUrlHandler;
.super Ljava/lang/Object;
.source "TrackingUrlHandler.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/IAPICommonHandler;


# instance fields
.field private trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tracking/TrackingUrlManager;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlHandler;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    return-void
.end method


# virtual methods
.method public handle(Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPIObject;Z)Z
    .locals 0

    .line 21
    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    .line 22
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->trackingUrlResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->trackingUrlResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;->trackingUrls:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 23
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->trackingUrlResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;->trackingUrls:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 24
    iget-object p3, p0, Lcom/shopkick/app/tracking/TrackingUrlHandler;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/tracking/TrackingUrlManager;->sendTrackingUrl(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
