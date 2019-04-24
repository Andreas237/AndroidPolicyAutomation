.class public Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "UserLoginResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public errorMsg:Ljava/lang/String;

.field public facebookAccessToken:Ljava/lang/String;

.field public sessionKeyBase64Enc:Ljava/lang/String;

.field public status:Ljava/lang/Integer;

.field public userId:Ljava/lang/String;

.field public userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;
    .locals 2

    .line 41
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;

    if-eqz p1, :cond_0

    .line 42
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->postProcess()V

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->postProcess()V

    :cond_2
    return-void
.end method
