.class public Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "CommonResponseData.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

.field public overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

.field public pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

.field public popupsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;

.field public requestId:Ljava/lang/String;

.field public retry:Ljava/lang/Boolean;

.field public toastResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonToastResponse;

.field public trackingUrlResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;
    .locals 2

    .line 40
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz p1, :cond_0

    .line 41
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->postProcess()V

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->popupsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;->postProcess()V

    .line 53
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->toastResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonToastResponse;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonToastResponse;->postProcess()V

    .line 54
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->postProcess()V

    .line 55
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->retry:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->retry:Ljava/lang/Boolean;

    .line 56
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;->postProcess()V

    .line 57
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->trackingUrlResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonTrackingURLResponse;->postProcess()V

    :cond_6
    return-void
.end method
