.class public Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "UserCreateGuestRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public accuracy:Ljava/lang/Double;

.field public add:Ljava/lang/String;

.field public androidId:Ljava/lang/String;

.field public comp:Ljava/lang/Boolean;

.field public deviceId:Ljava/lang/String;

.field public deviceModel:Ljava/lang/String;

.field public fStatus:Ljava/lang/Integer;

.field public kcid:Ljava/lang/String;

.field public lat:Ljava/lang/Double;

.field public lng:Ljava/lang/Double;

.field public macAddress:Ljava/lang/String;

.field public simCountry:Ljava/lang/String;

.field public userSelectedCountry:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;
    .locals 2

    .line 45
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;
    .locals 1

    .line 40
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->comp:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->comp:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method
