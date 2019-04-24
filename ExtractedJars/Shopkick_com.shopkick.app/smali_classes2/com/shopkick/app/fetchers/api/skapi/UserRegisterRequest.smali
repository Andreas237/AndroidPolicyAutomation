.class public Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "UserRegisterRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public accuracy:Ljava/lang/Double;

.field public add:Ljava/lang/String;

.field public email:Ljava/lang/String;

.field public facebookAccessToken:Ljava/lang/String;

.field public facebookSessionKey:Ljava/lang/String;

.field public facebookSessionSecret:Ljava/lang/String;

.field public facebookUserId:Ljava/lang/String;

.field public firstName:Ljava/lang/String;

.field public flowOriginElement:Ljava/lang/Integer;

.field public flowOriginElementId:Ljava/lang/Integer;

.field public flowOriginOverlay:Ljava/lang/Integer;

.field public flowOriginScreen:Ljava/lang/Integer;

.field public fullName:Ljava/lang/String;

.field public googleIdToken:Ljava/lang/String;

.field public googlePlusAccessToken:Ljava/lang/String;

.field public googlePlusUserId:Ljava/lang/String;

.field public lastName:Ljava/lang/String;

.field public lat:Ljava/lang/Double;

.field public lng:Ljava/lang/Double;

.field public makePublic:Ljava/lang/Boolean;

.field public password:Ljava/lang/String;

.field public phoneNumber:Ljava/lang/String;

.field public zipCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;
    .locals 2

    .line 55
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    if-eqz p1, :cond_0

    .line 56
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->makePublic:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->makePublic:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method
