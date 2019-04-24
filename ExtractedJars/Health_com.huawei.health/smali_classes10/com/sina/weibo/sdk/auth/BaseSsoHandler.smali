.class public Lcom/sina/weibo/sdk/auth/BaseSsoHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;
    }
.end annotation


# static fields
.field protected static final OAUTH2_BASE_URL:Ljava/lang/String; = "https://open.weibo.cn/oauth2/authorize?"


# instance fields
.field protected final SSO_TYPE_INVALID:I

.field protected authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

.field protected mAuthActivity:Landroid/content/Context;

.field protected ssoRequestCode:I

.field protected ssoRequestType:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x3

    iput v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->SSO_TYPE_INVALID:I

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->ssoRequestCode:I

    .line 44
    const/4 v0, 0x3

    iput v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->ssoRequestType:I

    .line 52
    iput-object p1, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    .line 53
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask;

    move-result-object v0

    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask;->aidTaskInit(Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x3

    iput v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->SSO_TYPE_INVALID:I

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->ssoRequestCode:I

    .line 44
    const/4 v0, 0x3

    iput v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->ssoRequestType:I

    .line 57
    iput-object p1, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    .line 58
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask;

    move-result-object v0

    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask;->aidTaskInit(Ljava/lang/String;)V

    .line 59
    return-void
.end method

.method private authorize(ILcom/sina/weibo/sdk/auth/WbAuthListener;Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;)V
    .locals 3

    .line 90
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->resetIntentFillData()V

    .line 91
    if-nez p2, :cond_0

    .line 92
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "please set auth listener"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    iput-object p2, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    .line 95
    sget-object v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;->WebOnly:Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;

    if-ne p3, v0, :cond_2

    .line 96
    if-eqz p2, :cond_1

    .line 97
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->startWebAuth()V

    .line 99
    :cond_1
    return-void

    .line 101
    :cond_2
    const/4 v2, 0x0

    .line 102
    sget-object v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;->SsoOnly:Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;

    if-ne p3, v0, :cond_3

    .line 103
    const/4 v2, 0x1

    .line 105
    :cond_3
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->isWbAppInstalled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 106
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->startClientAuth(I)V

    goto :goto_0

    .line 108
    :cond_4
    if-eqz v2, :cond_5

    .line 109
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    new-instance v1, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;

    invoke-direct {v1}, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;-><init>()V

    invoke-interface {v0, v1}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->onFailure(Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;)V

    goto :goto_0

    .line 111
    :cond_5
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->startWebAuth()V

    .line 114
    :goto_0
    return-void
.end method


# virtual methods
.method public authorize(Lcom/sina/weibo/sdk/auth/WbAuthListener;)V
    .locals 2

    .line 67
    sget-object v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;->ALL:Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;

    const v1, 0x80cd

    invoke-direct {p0, v1, p1, v0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authorize(ILcom/sina/weibo/sdk/auth/WbAuthListener;Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;)V

    .line 68
    return-void
.end method

.method public authorizeCallBack(IILandroid/content/Intent;)V
    .locals 9

    .line 214
    const v0, 0x80cd

    if-ne v0, p1, :cond_7

    .line 215
    const/4 v0, -0x1

    if-ne p2, v0, :cond_5

    .line 217
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    iget-object v1, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v1}, Lcom/sina/weibo/sdk/WeiboAppManager;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/WeiboAppManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/WeiboAppManager;->getWbAppInfo()Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v1

    invoke-static {v0, v1, p3}, Lcom/sina/weibo/sdk/utils/SecurityHelper;->checkResponseAppLegal(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/WbAppInfo;Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    new-instance v1, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;

    const-string v2, "your install weibo app is counterfeit"

    const-string v3, "8001"

    invoke-direct {v1, v2, v3}, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->onFailure(Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;)V

    .line 219
    return-void

    .line 221
    :cond_0
    const-string v0, "error"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/Utility;->safeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 222
    const-string v0, "error_type"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/Utility;->safeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 223
    const-string v0, "error_description"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/Utility;->safeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 224
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", error_type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", error_description: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 226
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 227
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 228
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v7

    .line 229
    invoke-static {v7}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->parseAccessToken(Landroid/os/Bundle;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    move-result-object v8

    .line 230
    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->isSessionValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Login Success! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0, v8}, Lcom/sina/weibo/sdk/auth/AccessTokenKeeper;->writeAccessToken(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;)V

    .line 233
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    invoke-interface {v0, v8}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->onSuccess(Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;)V

    .line 235
    :cond_1
    goto :goto_0

    .line 236
    :cond_2
    const-string v0, "access_denied"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "OAuthAccessDeniedException"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 237
    :cond_3
    const-string v0, "WBAgent"

    const-string v1, "Login canceled by user."

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    invoke-interface {v0}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->cancel()V

    goto :goto_0

    .line 240
    :cond_4
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Login failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    new-instance v1, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;

    invoke-direct {v1, v5, v6}, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->onFailure(Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;)V

    .line 244
    :goto_0
    goto :goto_1

    :cond_5
    if-nez p2, :cond_7

    .line 245
    if-eqz p3, :cond_6

    .line 246
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    invoke-interface {v0}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->cancel()V

    goto :goto_1

    .line 248
    :cond_6
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    invoke-interface {v0}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->cancel()V

    .line 252
    :cond_7
    :goto_1
    return-void
.end method

.method public authorizeClientSso(Lcom/sina/weibo/sdk/auth/WbAuthListener;)V
    .locals 2

    .line 76
    sget-object v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;->SsoOnly:Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;

    const v1, 0x80cd

    invoke-direct {p0, v1, p1, v0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authorize(ILcom/sina/weibo/sdk/auth/WbAuthListener;Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;)V

    .line 77
    return-void
.end method

.method public authorizeWeb(Lcom/sina/weibo/sdk/auth/WbAuthListener;)V
    .locals 2

    .line 85
    sget-object v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;->WebOnly:Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;

    const v1, 0x80cd

    invoke-direct {p0, v1, p1, v0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authorize(ILcom/sina/weibo/sdk/auth/WbAuthListener;Lcom/sina/weibo/sdk/auth/BaseSsoHandler$AuthType;)V

    .line 86
    return-void
.end method

.method protected couldNotStartWbSsoActivity()V
    .locals 0

    .line 269
    return-void
.end method

.method protected fillExtraIntent(Landroid/content/Intent;I)V
    .locals 0

    .line 152
    return-void
.end method

.method public isWbAppInstalled()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 261
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WbSdk;->isWbInstall(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method protected resetIntentFillData()V
    .locals 1

    .line 158
    const v0, 0x80cd

    iput v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->ssoRequestCode:I

    .line 159
    return-void
.end method

.method protected startClientAuth(I)V
    .locals 6

    .line 121
    :try_start_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WeiboAppManager;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/WeiboAppManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/WeiboAppManager;->getWbAppInfo()Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v3

    .line 122
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 123
    invoke-virtual {v3}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getAuthActivityName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAuthBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 125
    const-string v0, "_weibo_command_type"

    const/4 v1, 0x3

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 126
    const-string v0, "_weibo_transaction"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    const-string v0, "aid"

    iget-object v1, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/sina/weibo/sdk/utils/Utility;->getAid(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/sina/weibo/sdk/utils/SecurityHelper;->validateAppSignatureForIntent(Landroid/content/Context;Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_0

    .line 130
    return-void

    .line 132
    :cond_0
    :try_start_1
    invoke-virtual {p0, v4, p1}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->fillExtraIntent(Landroid/content/Intent;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 134
    :try_start_2
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    iget v1, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->ssoRequestCode:I

    invoke-virtual {v0, v4, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 140
    goto :goto_0

    .line 135
    :catch_0
    move-exception v5

    .line 136
    :try_start_3
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    if-eqz v0, :cond_1

    .line 137
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    new-instance v1, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;

    invoke-direct {v1}, Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;-><init>()V

    invoke-interface {v0, v1}, Lcom/sina/weibo/sdk/auth/WbAuthListener;->onFailure(Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;)V

    .line 139
    :cond_1
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->couldNotStartWbSsoActivity()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 143
    :goto_0
    goto :goto_1

    .line 142
    :catch_1
    move-exception v3

    .line 144
    :goto_1
    return-void
.end method

.method protected startWebAuth()V
    .locals 16

    .line 164
    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v7

    .line 165
    new-instance v8, Lcom/sina/weibo/sdk/net/WeiboParameters;

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/sina/weibo/sdk/net/WeiboParameters;-><init>(Ljava/lang/String;)V

    .line 166
    const-string v0, "client_id"

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "redirect_uri"

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getRedirectUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "scope"

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getScope()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "response_type"

    const-string v1, "code"

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "version"

    const-string v1, "0041005000"

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v0, "luicode"

    const-string v1, "10000360"

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/auth/AccessTokenKeeper;->readAccessToken(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    move-result-object v9

    .line 173
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    const-string v0, "trans_token"

    invoke-virtual {v9}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, "trans_access_token"

    invoke-virtual {v9}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :cond_0
    const-string v0, "lfid"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OP_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/Utility;->getAid(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 179
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 180
    const-string v0, "aid"

    invoke-virtual {v8, v0, v10}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :cond_1
    const-string v0, "packagename"

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const-string v0, "key_hash"

    invoke-virtual {v7}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getKeyHash()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://open.weibo.cn/oauth2/authorize?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Lcom/sina/weibo/sdk/net/WeiboParameters;->encodeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 185
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/NetworkHelper;->hasInternetPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    const-string v1, "Error"

    const-string v2, "Application requires permission to access the Internet"

    invoke-static {v0, v1, v2}, Lcom/sina/weibo/sdk/utils/UIUtils;->showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 188
    :cond_2
    const/4 v12, 0x0

    .line 190
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    if-eqz v0, :cond_3

    .line 192
    invoke-static {}, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->getInstance()Lcom/sina/weibo/sdk/web/WeiboCallbackManager;

    move-result-object v13

    .line 193
    invoke-virtual {v13}, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->genCallbackKey()Ljava/lang/String;

    move-result-object v12

    .line 194
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->authListener:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    invoke-virtual {v13, v12, v0}, Lcom/sina/weibo/sdk/web/WeiboCallbackManager;->setWeiboAuthListener(Ljava/lang/String;Lcom/sina/weibo/sdk/auth/WbAuthListener;)V

    .line 196
    :cond_3
    new-instance v0, Lcom/sina/weibo/sdk/web/param/AuthWebViewRequestParam;

    move-object v1, v7

    sget-object v2, Lcom/sina/weibo/sdk/web/WebRequestType;->AUTH:Lcom/sina/weibo/sdk/web/WebRequestType;

    move-object v3, v12

    const-string v4, "\u5fae\u535a\u767b\u5f55"

    move-object v5, v11

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-direct/range {v0 .. v6}, Lcom/sina/weibo/sdk/web/param/AuthWebViewRequestParam;-><init>(Lcom/sina/weibo/sdk/auth/AuthInfo;Lcom/sina/weibo/sdk/web/WebRequestType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    move-object v13, v0

    .line 197
    new-instance v14, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    const-class v1, Lcom/sina/weibo/sdk/web/WeiboSdkWebActivity;

    invoke-direct {v14, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 198
    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 199
    invoke-virtual {v13, v15}, Lcom/sina/weibo/sdk/web/param/AuthWebViewRequestParam;->fillBundle(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 200
    invoke-virtual {v14, v15}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 201
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/sina/weibo/sdk/auth/BaseSsoHandler;->mAuthActivity:Landroid/content/Context;

    invoke-virtual {v0, v14}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 204
    :goto_0
    return-void
.end method
