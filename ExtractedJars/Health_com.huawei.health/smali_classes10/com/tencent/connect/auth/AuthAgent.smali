.class public Lcom/tencent/connect/auth/AuthAgent;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;,
        Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;,
        Lcom/tencent/connect/auth/AuthAgent$TokenListener;
    }
.end annotation


# static fields
.field public static final SECURE_LIB_FILE_NAME:Ljava/lang/String; = "libwbsafeedit"

.field public static final SECURE_LIB_NAME:Ljava/lang/String; = "libwbsafeedit.so"


# instance fields
.field private a:Lcom/tencent/tauth/IUiListener;

.field private b:Ljava/lang/String;

.field private c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 82
    return-void
.end method

.method private a(ZLcom/tencent/tauth/IUiListener;)I
    .locals 12

    .line 196
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, showDialog -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 199
    invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 200
    if-eqz p1, :cond_0

    .line 201
    const-string v0, "isadd"

    const-string v1, "1"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    :cond_0
    const-string v0, "scope"

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->b:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    const-string v0, "client_id"

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    sget-boolean v0, Lcom/tencent/connect/auth/AuthAgent;->isOEM:Z

    if-eqz v0, :cond_1

    .line 206
    const-string v0, "pf"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "desktop_m_qq-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/tencent/connect/auth/AuthAgent;->installChannel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "android"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/tencent/connect/auth/AuthAgent;->registerChannel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/tencent/connect/auth/AuthAgent;->businessId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 208
    :cond_1
    const-string v0, "pf"

    const-string v1, "openmobile_android"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 213
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v7}, Lcom/tencent/open/utils/SystemUtils;->getAppSignatureMD5(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 214
    const-string v0, "sign"

    invoke-virtual {v6, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const-string v0, "time"

    invoke-virtual {v6, v0, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    const-string v0, "display"

    const-string v1, "mobile"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    const-string v0, "response_type"

    const-string v1, "token"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const-string v0, "redirect_uri"

    const-string v1, "auth://tauth.qq.com/"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const-string v0, "cancel_display"

    const-string v1, "1"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    const-string v0, "switch"

    const-string v1, "1"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    const-string v0, "status_userip"

    invoke-static {}, Lcom/tencent/open/utils/Util;->getUserIp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    invoke-static {}, Lcom/tencent/open/utils/ServerSetting;->getInstance()Lcom/tencent/open/utils/ServerSetting;

    move-result-object v0

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "http://openmobile.qq.com/oauth2.0/m_authorize?"

    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    invoke-static {v6}, Lcom/tencent/open/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 232
    new-instance v0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;

    move-object v1, p0

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object v3, p2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent$TokenListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;Landroid/content/Context;Lcom/tencent/tauth/IUiListener;ZZ)V

    move-object v11, v0

    .line 234
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, showDialog TDialog"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    new-instance v0, Lcom/tencent/connect/auth/AuthAgent$1;

    invoke-direct {v0, p0, v10, v11}, Lcom/tencent/connect/auth/AuthAgent$1;-><init>(Lcom/tencent/connect/auth/AuthAgent;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V

    invoke-static {v0}, Lcom/tencent/open/utils/ThreadManager;->executeOnSubThread(Ljava/lang/Runnable;)V

    .line 257
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, showDialog -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    const/4 v0, 0x2

    return v0
.end method

.method static synthetic a(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .line 412
    :try_start_0
    invoke-static {p1}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 413
    const-string v0, "access_token"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 414
    const-string v0, "expires_in"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 415
    const-string v0, "openid"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 416
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 418
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0, v2, v3}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0, v4}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 422
    :cond_0
    goto :goto_0

    .line 421
    :catch_0
    move-exception v1

    .line 423
    :goto_0
    return-void
.end method

.method private a(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Z)Z
    .locals 13

    .line 262
    const-string v0, "openSDK_LOG"

    const-string v1, "startActionActivity() -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    const-string v0, "com.tencent.open.agent.AgentActivity"

    invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthAgent;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v10

    .line 266
    if-eqz v10, :cond_3

    .line 267
    invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v11

    .line 268
    if-eqz p3, :cond_0

    .line 269
    const-string v0, "isadd"

    const-string v1, "1"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    :cond_0
    const-string v0, "scope"

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->b:Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    const-string v0, "client_id"

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    sget-boolean v0, Lcom/tencent/connect/auth/AuthAgent;->isOEM:Z

    if-eqz v0, :cond_1

    .line 275
    const-string v0, "pf"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "desktop_m_qq-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/tencent/connect/auth/AuthAgent;->installChannel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "android"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/tencent/connect/auth/AuthAgent;->registerChannel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/tencent/connect/auth/AuthAgent;->businessId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 277
    :cond_1
    const-string v0, "pf"

    const-string v1, "openmobile_android"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    :goto_0
    const-string v0, "need_pay"

    const-string v1, "1"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string v0, "oauth_app_name"

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/open/utils/SystemUtils;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v0, "key_action"

    const-string v1, "action_login"

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 282
    const-string v0, "key_params"

    invoke-virtual {v10, v0, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 284
    iput-object v10, p0, Lcom/tencent/connect/auth/AuthAgent;->mActivityIntent:Landroid/content/Intent;

    .line 285
    invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 287
    new-instance v12, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;

    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    invoke-direct {v12, p0, v0}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V

    .line 288
    iput-object v12, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    .line 290
    if-eqz p2, :cond_2

    .line 291
    const-string v0, "AuthAgent"

    const-string v1, "startAssitActivity fragment"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    invoke-virtual {p0, p2, v0}, Lcom/tencent/connect/auth/AuthAgent;->startAssitActivity(Landroid/support/v4/app/Fragment;Lcom/tencent/tauth/IUiListener;)V

    goto :goto_1

    .line 294
    :cond_2
    const-string v0, "AuthAgent"

    const-string v1, "startAssitActivity activity"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    invoke-virtual {p0, p1, v0}, Lcom/tencent/connect/auth/AuthAgent;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V

    .line 297
    :goto_1
    const-string v0, "openSDK_LOG"

    const-string v1, "startActionActivity() -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "LOGIN_CHECK_SDK"

    const-string v3, "1000"

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, ""

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 300
    const/4 v0, 0x1

    return v0

    .line 303
    :cond_3
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "LOGIN_CHECK_SDK"

    const-string v3, "1000"

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "startActionActivity fail"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 305
    const-string v0, "openSDK_LOG"

    const-string v1, "startActionActivity() -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic c(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic d(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->c:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic f(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic g(Lcom/tencent/connect/auth/AuthAgent;)Landroid/os/Bundle;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeActivityParams()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method


# virtual methods
.method protected a(Lcom/tencent/tauth/IUiListener;)V
    .locals 14

    .line 315
    const-string v0, "openSDK_LOG"

    const-string v1, "reportDAU() -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    const-string v6, "tencent&sdk&qazxc***14969%%"

    .line 317
    const-string v7, "qzone3.4"

    .line 318
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;

    move-result-object v8

    .line 319
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v9

    .line 320
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v10

    .line 321
    const-string v11, ""

    .line 322
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 325
    :cond_0
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    const-string v0, "openSDK_LOG"

    const-string v1, "reportDAU -- encrytoken is null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    return-void

    .line 329
    :cond_1
    const-string v12, "https://openmobile.qq.com/user/user_login_statis"

    .line 330
    invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v13

    .line 331
    const-string v0, "encrytoken"

    invoke-virtual {v13, v0, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, v12

    move-object v3, v13

    const-string v4, "POST"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 333
    const-string v0, "openSDK_LOG"

    const-string v1, "reportDAU() -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    return-void
.end method

.method protected b(Lcom/tencent/tauth/IUiListener;)V
    .locals 9

    .line 342
    const-string v6, "https://openmobile.qq.com/v3/user/get_info"

    .line 343
    invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v7

    .line 344
    const-string v0, "reqType"

    const-string v1, "checkLogin"

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    new-instance v8, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    new-instance v0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;

    invoke-direct {v0, p0, p1}, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V

    invoke-direct {v8, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 346
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, v6

    move-object v3, v7

    const-string v4, "GET"

    move-object v5, v8

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 348
    return-void
.end method

.method public doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 6

    .line 161
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZLandroid/support/v4/app/Fragment;)I

    move-result v0

    return v0
.end method

.method public doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZLandroid/support/v4/app/Fragment;)I
    .locals 10

    .line 165
    iput-object p2, p0, Lcom/tencent/connect/auth/AuthAgent;->b:Ljava/lang/String;

    .line 166
    iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent;->c:Landroid/app/Activity;

    .line 167
    iput-object p3, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    .line 169
    invoke-direct {p0, p1, p5, p4}, Lcom/tencent/connect/auth/AuthAgent;->a(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, showUi, return Constants.UI_ACTIVITY"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "2"

    const-string v4, "1"

    const-string v5, "5"

    const-string v6, "0"

    const-string v7, "0"

    const-string v8, "0"

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const/4 v0, 0x1

    return v0

    .line 179
    :cond_0
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "2"

    const-string v4, "1"

    const-string v5, "5"

    const-string v6, "1"

    const-string v7, "0"

    const-string v8, "0"

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v0, "openSDK_LOG"

    const-string v1, "startActivity fail show dialog."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    new-instance v9, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;

    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    invoke-direct {v9, p0, v0}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V

    .line 184
    iput-object v9, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    .line 185
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    invoke-direct {p0, p4, v0}, Lcom/tencent/connect/auth/AuthAgent;->a(ZLcom/tencent/tauth/IUiListener;)I

    move-result v0

    return v0
.end method

.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 5

    .line 365
    new-instance v0, Lcom/tencent/connect/auth/AuthAgent$2;

    invoke-direct {v0, p0}, Lcom/tencent/connect/auth/AuthAgent$2;-><init>(Lcom/tencent/connect/auth/AuthAgent;)V

    invoke-static {v0}, Lcom/tencent/open/utils/ThreadManager;->executeOnSubThread(Ljava/lang/Runnable;)V

    .line 373
    const/4 v2, 0x0

    .line 374
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mTaskList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/tencent/connect/common/BaseApi$ApiTask;

    .line 375
    iget v0, v4, Lcom/tencent/connect/common/BaseApi$ApiTask;->mRequestCode:I

    if-ne v0, p2, :cond_0

    .line 376
    iget-object v2, v4, Lcom/tencent/connect/common/BaseApi$ApiTask;->mListener:Lcom/tencent/tauth/IUiListener;

    .line 377
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mTaskList:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 378
    goto :goto_1

    :cond_0
    goto :goto_0

    .line 383
    :cond_1
    :goto_1
    if-nez p4, :cond_3

    .line 384
    if-eqz v2, :cond_2

    .line 385
    invoke-interface {v2}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 387
    :cond_2
    return-void

    .line 390
    :cond_3
    const-string v0, "key_response"

    invoke-virtual {p4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 391
    invoke-direct {p0, v3}, Lcom/tencent/connect/auth/AuthAgent;->a(Ljava/lang/String;)V

    .line 393
    if-nez v2, :cond_4

    .line 396
    invoke-static {p1, p4}, Lcom/tencent/connect/common/AssistActivity;->setResultDataForLogin(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 397
    return-void

    .line 400
    :cond_4
    const/4 v0, -0x1

    if-ne p3, v0, :cond_5

    .line 401
    invoke-static {p4, v2}, Lcom/tencent/connect/auth/AuthAgent;->handleDataToListener(Landroid/content/Intent;Lcom/tencent/tauth/IUiListener;)V

    goto :goto_2

    .line 403
    :cond_5
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, onActivityResult, Constants.ACTIVITY_CANCEL"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    invoke-interface {v2}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 406
    :goto_2
    invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->releaseResource()V

    .line 407
    invoke-static {}, Lcom/tencent/open/a/f;->b()V

    .line 408
    return-void
.end method

.method public releaseResource()V
    .locals 1

    .line 191
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->c:Landroid/app/Activity;

    .line 192
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;

    .line 193
    return-void
.end method
