.class public Lcom/sina/weibo/sdk/network/intercept/GuestParamInterception;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sina/weibo/sdk/network/IRequestIntercept;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/network/exception/InterceptException;
        }
    .end annotation

    .line 29
    invoke-static {}, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->getInstance()Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;

    move-result-object v0

    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/network/base/WbUserInfoHelper;->getUserInfo(Landroid/content/Context;)Lcom/sina/weibo/sdk/network/base/WbUserInfo;

    move-result-object v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    const-string v0, "gsid"

    invoke-virtual {v3}, Lcom/sina/weibo/sdk/network/base/WbUserInfo;->getGsid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v0, "uid"

    invoke-virtual {v3}, Lcom/sina/weibo/sdk/network/base/WbUserInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-static {}, Lcom/sina/weibo/wcfc/sobusiness/UtilitySo;->getInstance()Lcom/sina/weibo/wcfc/sobusiness/UtilitySo;

    move-result-object v0

    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v3}, Lcom/sina/weibo/sdk/network/base/WbUserInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/sina/weibo/wcfc/sobusiness/UtilitySo;->calculateS(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 34
    const-string v0, "s"

    invoke-virtual {p2, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public needIntercept(Lcom/sina/weibo/sdk/network/IRequestParam;Landroid/os/Bundle;)Z
    .locals 2

    .line 20
    invoke-interface {p1}, Lcom/sina/weibo/sdk/network/IRequestParam;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https://api.weibo.cn/2/sdk/login"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "http://api.weibo.cn/2/sdk/login"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 24
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
