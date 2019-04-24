.class public Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "UserLoginRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public add:Ljava/lang/String;

.field public deviceId:Ljava/lang/String;

.field public deviceModel:Ljava/lang/String;

.field public email:Ljava/lang/String;

.field public facebookAccessToken:Ljava/lang/String;

.field public facebookSessionKey:Ljava/lang/String;

.field public facebookSessionSecret:Ljava/lang/String;

.field public facebookUserId:Ljava/lang/String;

.field public googleIdToken:Ljava/lang/String;

.field public googlePlusAccessToken:Ljava/lang/String;

.field public kcid:Ljava/lang/String;

.field public password:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;
    .locals 2

    .line 44
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    if-eqz p1, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
