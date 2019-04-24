.class public Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "UserLogAcquisitionEventRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public advertisingId:Ljava/lang/String;

.field public advertisingIdEnabled:Ljava/lang/Boolean;

.field public androidId:Ljava/lang/String;

.field public androidOsName:Ljava/lang/String;

.field public comp:Ljava/lang/Boolean;

.field public country:Ljava/lang/String;

.field public deviceFamily:Ljava/lang/String;

.field public deviceId:Ljava/lang/String;

.field public deviceModel:Ljava/lang/String;

.field public eventType:Ljava/lang/Integer;

.field public fStatus:Ljava/lang/Integer;

.field public iadAdgroupId:Ljava/lang/String;

.field public iadAdgroupName:Ljava/lang/String;

.field public iadAttribution:Ljava/lang/String;

.field public iadCampaignId:Ljava/lang/String;

.field public iadCampaignName:Ljava/lang/String;

.field public iadClickDate:Ljava/lang/String;

.field public iadConversionDate:Ljava/lang/String;

.field public iadKeyword:Ljava/lang/String;

.field public iadLineitemId:Ljava/lang/String;

.field public iadLineitemName:Ljava/lang/String;

.field public iadOrgName:Ljava/lang/String;

.field public kcid:Ljava/lang/String;

.field public lang:Ljava/lang/String;

.field public macAddress:Ljava/lang/String;

.field public phoneName:Ljava/lang/String;

.field public referrer:Ljava/lang/String;

.field public s9:Ljava/lang/Boolean;

.field public secsFromUtc:Ljava/lang/Integer;

.field public tz:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;
    .locals 2

    .line 62
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;

    if-eqz p1, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;
    .locals 1

    .line 57
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->s9:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->s9:Ljava/lang/Boolean;

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->comp:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->comp:Ljava/lang/Boolean;

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->advertisingIdEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->advertisingIdEnabled:Ljava/lang/Boolean;

    :cond_2
    return-void
.end method
