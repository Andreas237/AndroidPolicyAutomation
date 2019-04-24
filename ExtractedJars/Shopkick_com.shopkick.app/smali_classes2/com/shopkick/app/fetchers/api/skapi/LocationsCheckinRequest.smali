.class public Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "LocationsCheckinRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public accuracy:Ljava/lang/Double;

.field public add:Ljava/lang/String;

.field public beaconData:Ljava/lang/String;

.field public carrier:Ljava/lang/String;

.field public checkinStarter:Ljava/lang/Integer;

.field public checkinType:Ljava/lang/Integer;

.field public comp:Ljava/lang/Boolean;

.field public coordTimestamp:Ljava/lang/Long;

.field public correctedBits:Ljava/lang/Integer;

.field public currTimestamp:Ljava/lang/Long;

.field public departmentId:Ljava/lang/String;

.field public fStatus:Ljava/lang/Integer;

.field public failureReasonCode:Ljava/lang/Integer;

.field public gamePieceSeed:Ljava/lang/String;

.field public kcid:Ljava/lang/String;

.field public lat:Ljava/lang/Double;

.field public lng:Ljava/lang/Double;

.field public locationDisabled:Ljava/lang/Boolean;

.field public locationId:Ljava/lang/String;

.field public locationListVersion:Ljava/lang/Integer;

.field public msSinceSigDetection:Ljava/lang/Long;

.field public offline:Ljava/lang/Boolean;

.field public partialMatch:Ljava/lang/Boolean;

.field public presenceCode:Ljava/lang/String;

.field public presenceCodeByPd:Ljava/lang/String;

.field public presenceData:Ljava/lang/String;

.field public presenceFactors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public presenceFftDataId:Ljava/lang/String;

.field public requestRetryCount:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;
    .locals 2

    .line 61
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    if-eqz p1, :cond_0

    .line 62
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->comp:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->comp:Ljava/lang/Boolean;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->partialMatch:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->partialMatch:Ljava/lang/Boolean;

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->offline:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->offline:Ljava/lang/Boolean;

    .line 76
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->locationDisabled:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->locationDisabled:Ljava/lang/Boolean;

    :cond_3
    return-void
.end method
