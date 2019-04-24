.class public Lcom/sina/weibo/sdk/share/WbShareHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final WB_SHARE_REQUEST:I = 0x1


# instance fields
.field private context:Landroid/app/Activity;

.field private hasRegister:Z

.field private progressColor:I

.field private progressId:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->hasRegister:Z

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressColor:I

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressId:I

    .line 38
    iput-object p1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    .line 39
    return-void
.end method

.method private sendBroadcast(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 52
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 54
    const-string v0, "_weibo_sdkVersion"

    const-string v1, "0041005000"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    const-string v0, "_weibo_appPackage"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    const-string v0, "_weibo_appKey"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    const-string v0, "_weibo_flag"

    const v1, 0x20130329

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 58
    const-string v0, "_weibo_sign"

    invoke-static {p1, v3}, Lcom/sina/weibo/sdk/utils/Utility;->getSign(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    invoke-virtual {v2, p4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    :cond_0
    if-eqz p5, :cond_1

    .line 63
    invoke-virtual {v2, p5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 65
    :cond_1
    const-string v0, "com.sina.weibo.permission.WEIBO_SDK_PERMISSION"

    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method private startClientShare(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V
    .locals 6

    .line 116
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 117
    const-string v0, "_weibo_command_type"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 118
    const-string v0, "_weibo_transaction"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v0, "callbackId"

    const-wide/16 v1, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 120
    invoke-virtual {p1, v3}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->toBundle(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 121
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 122
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const-class v1, Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 123
    const-string v0, "startPackage"

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v1}, Lcom/sina/weibo/sdk/WeiboAppManager;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/WeiboAppManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/WeiboAppManager;->getWbAppInfo()Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    const-string v0, "startAction"

    const-string v1, "com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    const-string v0, "startFlag"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 126
    const-string v0, "startActivity"

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    const-string v0, "progressColor"

    iget v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressColor:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 128
    const-string v0, "progressId"

    iget v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressId:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    if-eqz v3, :cond_0

    .line 130
    invoke-virtual {v4, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 133
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    goto :goto_0

    .line 134
    :catch_0
    move-exception v5

    .line 135
    const-string v0, "weibo sdk error "

    invoke-virtual {v5}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    :goto_0
    return-void
.end method

.method private startWebShare(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V
    .locals 13

    .line 140
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const-class v1, Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 141
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v9

    .line 142
    new-instance v0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;

    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v1

    sget-object v2, Lcom/sina/weibo/sdk/web/WebRequestType;->SHARE:Lcom/sina/weibo/sdk/web/WebRequestType;

    const-string v3, ""

    const-string v5, "\u5fae\u535a\u5206\u4eab"

    iget-object v7, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const/4 v4, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;-><init>(Lcom/sina/weibo/sdk/auth/AuthInfo;Lcom/sina/weibo/sdk/web/WebRequestType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    move-object v10, v0

    .line 143
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-virtual {v10, v0}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->setContext(Landroid/content/Context;)V

    .line 144
    const-string v0, ""

    invoke-virtual {v10, v0}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->setHashKey(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v10, v9}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->setPackageName(Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/auth/AccessTokenKeeper;->readAccessToken(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    move-result-object v11

    .line 147
    if-eqz v11, :cond_0

    invoke-virtual {v11}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    invoke-virtual {v11}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->setToken(Ljava/lang/String;)V

    .line 150
    :cond_0
    invoke-virtual {v10, p1}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->setMultiMessage(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V

    .line 151
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 152
    invoke-virtual {v10, v12}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->fillBundle(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 153
    invoke-virtual {v8, v12}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 154
    const-string v0, "startFlag"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 155
    const-string v0, "startActivity"

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 156
    const-string v0, "startAction"

    const-string v1, "com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    const-string v0, "gotoActivity"

    const-string v1, "com.sina.weibo.sdk.web.WeiboSdkWebActivity"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-virtual {v0, v8, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 159
    return-void
.end method


# virtual methods
.method public doResultIntent(Landroid/content/Intent;Lcom/sina/weibo/sdk/share/WbShareCallback;)V
    .locals 4

    .line 171
    if-nez p2, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 175
    if-nez v2, :cond_1

    .line 176
    return-void

    .line 178
    :cond_1
    const-string v0, "_weibo_resp_errcode"

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 179
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 181
    :pswitch_0
    invoke-interface {p2}, Lcom/sina/weibo/sdk/share/WbShareCallback;->onWbShareSuccess()V

    .line 182
    goto :goto_0

    .line 184
    :pswitch_1
    invoke-interface {p2}, Lcom/sina/weibo/sdk/share/WbShareCallback;->onWbShareCancel()V

    .line 185
    goto :goto_0

    .line 187
    :pswitch_2
    invoke-interface {p2}, Lcom/sina/weibo/sdk/share/WbShareCallback;->onWbShareFail()V

    .line 190
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public isWbAppInstalled()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WbSdk;->isWbInstall(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public registerApp()Z
    .locals 6

    .line 47
    move-object v0, p0

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const-string v2, "com.sina.weibo.sdk.Intent.ACTION_WEIBO_REGISTER"

    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sina/weibo/sdk/share/WbShareHandler;->sendBroadcast(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->hasRegister:Z

    .line 49
    const/4 v0, 0x1

    return v0
.end method

.method public setProgressColor(I)V
    .locals 0

    .line 205
    iput p1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressColor:I

    .line 206
    return-void
.end method

.method public setProgressId(I)V
    .locals 0

    .line 213
    iput p1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressId:I

    .line 214
    return-void
.end method

.method public shareMessage(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;Z)V
    .locals 2

    .line 74
    iget-boolean v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->hasRegister:Z

    if-nez v0, :cond_0

    .line 75
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "please call WbShareHandler.registerApp(),before use share function"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WbSdk;->isWbInstall(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    .line 78
    return-void

    .line 80
    :cond_1
    if-eqz p2, :cond_2

    .line 81
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareHandler;->startClientShare(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V

    .line 82
    return-void

    .line 84
    :cond_2
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WbSdk;->isWbInstall(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WeiboAppManager;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/WeiboAppManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/WeiboAppManager;->getWbAppInfo()Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getSupportVersion()I

    move-result v0

    const/16 v1, 0x2710

    if-le v0, v1, :cond_3

    .line 85
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareHandler;->startClientShare(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V

    goto :goto_0

    .line 87
    :cond_3
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareHandler;->startWebShare(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V

    .line 89
    :goto_0
    return-void
.end method

.method public shareToStory(Lcom/sina/weibo/sdk/api/StoryMessage;)V
    .locals 5

    .line 98
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/api/StoryMessage;->getImageUri()Landroid/net/Uri;

    move-result-object v2

    .line 99
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/api/StoryMessage;->getVideoUri()Landroid/net/Uri;

    move-result-object v3

    .line 100
    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v0, v2}, Lcom/sina/weibo/sdk/utils/FileUtils;->isImageFile(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    .line 101
    invoke-static {v0, v3}, Lcom/sina/weibo/sdk/utils/FileUtils;->isVideoFile(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    :cond_1
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 103
    const-string v0, "_weibo_message_stroy"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 104
    const-string v0, "startActivity"

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    const-string v0, "startPackage"

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    invoke-static {v1}, Lcom/sina/weibo/sdk/WeiboAppManager;->getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/WeiboAppManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/WeiboAppManager;->getWbAppInfo()Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    const-string v0, "progressColor"

    iget v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressColor:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 107
    const-string v0, "progressId"

    iget v1, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->progressId:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 108
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const-class v1, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 109
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareHandler;->context:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "File only can be Image or Video. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 113
    :goto_0
    return-void
.end method

.method public supportMulti()Z
    .locals 1

    .line 197
    const/4 v0, 0x0

    return v0
.end method
