.class public Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "LocationsCheckinResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public actionType:Ljava/lang/Integer;

.field public checkinStamps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;",
            ">;"
        }
    .end annotation
.end field

.field public checkinStarter:Ljava/lang/Integer;

.field public checkinStatusDisplay:Lcom/shopkick/app/fetchers/api/skapi/CheckinStatusDisplay;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public departmentBannerImageUrl:Ljava/lang/String;

.field public departmentBannerText:Ljava/lang/String;

.field public departmentOfferId:Ljava/lang/String;

.field public forceStoreDetails:Ljava/lang/Boolean;

.field public isKickbateReceiptKicksAvailable:Ljava/lang/Boolean;

.field public isReceiptScanAvailable:Ljava/lang/Boolean;

.field public isRetailerReceiptKicksAvailable:Ljava/lang/Boolean;

.field public kicksAwardedToday:Ljava/lang/Integer;

.field public locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

.field public statusCode:Ljava/lang/Integer;

.field public viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;
    .locals 2

    .line 49
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    if-eqz p1, :cond_0

    .line 50
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStatusDisplay:Lcom/shopkick/app/fetchers/api/skapi/CheckinStatusDisplay;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CheckinStatusDisplay;->postProcess()V

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->postProcess()V

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->forceStoreDetails:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->forceStoreDetails:Ljava/lang/Boolean;

    .line 63
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;->postProcess()V

    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isReceiptScanAvailable:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isReceiptScanAvailable:Ljava/lang/Boolean;

    .line 67
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isKickbateReceiptKicksAvailable:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isKickbateReceiptKicksAvailable:Ljava/lang/Boolean;

    .line 68
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isRetailerReceiptKicksAvailable:Ljava/lang/Boolean;

    if-nez v0, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->isRetailerReceiptKicksAvailable:Ljava/lang/Boolean;

    .line 69
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->postProcess()V

    :cond_8
    return-void
.end method
