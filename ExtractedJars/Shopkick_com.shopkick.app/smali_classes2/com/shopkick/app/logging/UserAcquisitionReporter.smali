.class public Lcom/shopkick/app/logging/UserAcquisitionReporter;
.super Ljava/lang/Object;
.source "UserAcquisitionReporter.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;
    }
.end annotation


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private inflightEvents:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation
.end field

.field private locale:Ljava/util/Locale;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private queuedEvents:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p2, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 55
    iput-object p3, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 56
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->queuedEvents:Ljava/util/ArrayList;

    .line 57
    iput-object p4, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 58
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->inflightEvents:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->locale:Ljava/util/Locale;

    .line 62
    :cond_0
    iput-object p5, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-void
.end method

.method private makeAcqusitionRequest(IILjava/lang/String;)V
    .locals 1

    .line 114
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;-><init>()V

    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->eventType:Ljava/lang/Integer;

    .line 116
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->secsFromUtc:Ljava/lang/Integer;

    .line 117
    iput-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->tz:Ljava/lang/String;

    .line 118
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->locale:Ljava/util/Locale;

    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->lang:Ljava/lang/String;

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->deviceModel:Ljava/lang/String;

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/DeviceInfo;->getAdvertisingInfo()Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    move-result-object p1

    .line 121
    iget-object p2, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->advertisingId:Ljava/lang/String;

    .line 122
    iget-object p1, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->isLimitAdTrackingEnabled:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->advertisingIdEnabled:Ljava/lang/Boolean;

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getInstallReferrerInfo()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->referrer:Ljava/lang/String;

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->deleteInstallReferrerInfo()V

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const p2, 0x7f10000a

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->kcid:Ljava/lang/String;

    .line 129
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p1}, Lcom/shopkick/app/application/DeviceInfo;->getPhoneName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogAcquisitionEventRequest;->phoneName:Ljava/lang/String;

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->inflightEvents:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 137
    iget-object p2, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->inflightEvents:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public destroy()V
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->inflightEvents:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 67
    iget-object v2, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->inflightEvents:Ljava/util/ArrayList;

    .line 70
    iput-object v0, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->queuedEvents:Ljava/util/ArrayList;

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "advertisingIdReady"

    if-ne p1, p2, :cond_0

    .line 147
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->queuedEvents:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->queuedEvents:Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;

    .line 149
    iget p2, p1, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;->eventType:I

    iget v0, p1, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;->secsFromUtc:I

    iget-object p1, p1, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;->tz:Ljava/lang/String;

    invoke-direct {p0, p2, v0, p1}, Lcom/shopkick/app/logging/UserAcquisitionReporter;->makeAcqusitionRequest(IILjava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public reportEvent(I)V
    .locals 4

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->isAdvertisingInfoReady()Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "advertisingIdReady"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->queuedEvents:Ljava/util/ArrayList;

    new-instance v1, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;

    .line 86
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v2

    div-int/lit16 v2, v2, 0x3e8

    .line 87
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/TimeZone;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, p1, v2, v3}, Lcom/shopkick/app/logging/UserAcquisitionReporter$Event;-><init>(Lcom/shopkick/app/logging/UserAcquisitionReporter;IILjava/lang/String;)V

    .line 85
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/logging/UserAcquisitionReporter;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->getAdvertisingInfo()Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 97
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    .line 98
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    .line 96
    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/logging/UserAcquisitionReporter;->makeAcqusitionRequest(IILjava/lang/String;)V

    :cond_1
    return-void
.end method
