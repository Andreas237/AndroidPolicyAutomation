.class public Lcom/tencent/connect/UserInfo;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# static fields
.field public static final GRAPH_OPEN_ID:Ljava/lang/String; = "oauth2.0/m_me"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 26
    invoke-direct {p0, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 22
    invoke-direct {p0, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 23
    return-void
.end method


# virtual methods
.method public getOpenId(Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 67
    invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 68
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 69
    iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "oauth2.0/m_me"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 71
    return-void
.end method

.method public getTenPayAddr(Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 55
    invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 56
    const-string v0, "ver"

    const-string v1, "1"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 58
    iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "cft_info/get_tenpay_addr"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 60
    return-void
.end method

.method public getUserInfo(Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 30
    invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 31
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 32
    iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "user/get_simple_userinfo"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 34
    return-void
.end method

.method public getVipUserInfo(Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 37
    invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 38
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 39
    iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "user/get_vip_info"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 41
    return-void
.end method

.method public getVipUserRichInfo(Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 44
    invoke-virtual {p0}, Lcom/tencent/connect/UserInfo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 45
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 46
    iget-object v0, p0, Lcom/tencent/connect/UserInfo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "user/get_vip_rich_info"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 48
    return-void
.end method
