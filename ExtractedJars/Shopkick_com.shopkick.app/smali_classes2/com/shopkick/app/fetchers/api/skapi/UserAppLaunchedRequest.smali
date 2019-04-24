.class public Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "UserAppLaunchedRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public add:Ljava/lang/String;

.field public androidBadgeDisplayType:Ljava/lang/Integer;

.field public androidId:Ljava/lang/String;

.field public btEnabled:Ljava/lang/Boolean;

.field public comp:Ljava/lang/Boolean;

.field public currentBadgeValue:Ljava/lang/Integer;

.field public deviceId:Ljava/lang/String;

.field public fStatus:Ljava/lang/Integer;

.field public gpsPermissionStatus:Ljava/lang/Integer;

.field public hasInstagram:Ljava/lang/Boolean;

.field public isFreshInstall:Ljava/lang/Boolean;

.field public kcid:Ljava/lang/String;

.field public macAddress:Ljava/lang/String;

.field public microphonePermission:Ljava/lang/Integer;

.field public notificationTypesEnabled:Ljava/lang/Integer;

.field public pnsEnabled:Ljava/lang/Boolean;

.field public pnsInitiated:Ljava/lang/Boolean;

.field public pnsParam:Ljava/lang/String;

.field public pnsSource:Ljava/lang/Integer;

.field public supportsAppIconBadging:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;
    .locals 2

    .line 52
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;

    if-eqz p1, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsInitiated:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsInitiated:Ljava/lang/Boolean;

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->isFreshInstall:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->isFreshInstall:Ljava/lang/Boolean;

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->btEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->btEnabled:Ljava/lang/Boolean;

    .line 66
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->comp:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->comp:Ljava/lang/Boolean;

    .line 67
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsEnabled:Ljava/lang/Boolean;

    .line 68
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->hasInstagram:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->hasInstagram:Ljava/lang/Boolean;

    .line 69
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->supportsAppIconBadging:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->supportsAppIconBadging:Ljava/lang/Boolean;

    :cond_6
    return-void
.end method
