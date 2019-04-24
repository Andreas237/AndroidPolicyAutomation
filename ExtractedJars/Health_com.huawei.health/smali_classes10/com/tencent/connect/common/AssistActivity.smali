.class public Lcom/tencent/connect/common/AssistActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static final RESTART_FLAG:Ljava/lang/String; = "RESTART_FLAG"

.field private static final TAG:Ljava/lang/String; = "AssistActivity"

.field public static hackAuthActivity:Z = false

.field public static hackShareSend:Z = false

.field public static isQQMobileShare:Z = false

.field private static sApiObject:Lcom/tencent/connect/common/BaseApi; = null


# instance fields
.field private mAPiObject:Lcom/tencent/connect/common/BaseApi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/connect/common/AssistActivity;->isQQMobileShare:Z

    .line 28
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/connect/common/AssistActivity;->hackShareSend:Z

    .line 29
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/connect/common/AssistActivity;->hackAuthActivity:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static getAssistActivityIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 32
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/tencent/connect/common/AssistActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 33
    return-object v1
.end method

.method private openBrowser(Landroid/os/Bundle;)V
    .locals 20

    .line 240
    const-string v0, "viaShareType"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 241
    const-string v0, "callbackAction"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 242
    const-string v0, "url"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 243
    const-string v0, "openId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 244
    const-string v0, "appId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 246
    const-string v16, ""

    .line 247
    const-string v17, ""

    .line 248
    const-string v0, "shareToQQ"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    const-string v16, "ANDROIDQQ.SHARETOQQ.XX"

    .line 250
    const-string v17, "10"

    goto :goto_0

    .line 251
    :cond_0
    const-string v0, "shareToQzone"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    const-string v16, "ANDROIDQQ.SHARETOQZ.XX"

    .line 253
    const-string v17, "11"

    .line 256
    :cond_1
    :goto_0
    move-object/from16 v0, p0

    invoke-static {v0, v13}, Lcom/tencent/open/utils/Util;->openBrowser(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v18

    .line 257
    if-nez v18, :cond_3

    .line 258
    invoke-static {v12}, Lcom/tencent/open/utils/TemporaryStorage;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/tencent/tauth/IUiListener;

    .line 259
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_2

    .line 260
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u6253\u5f00\u6d4f\u89c8\u5668\u5931\u8d25!"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 263
    :cond_2
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object v1, v14

    move-object v2, v15

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    const-string v5, "3"

    const-string v6, "1"

    move-object v7, v11

    const-string v8, "0"

    const-string v9, "2"

    const-string v10, "0"

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/common/AssistActivity;->finish()V

    .line 267
    goto :goto_1

    .line 268
    :cond_3
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object v1, v14

    move-object v2, v15

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    const-string v5, "3"

    const-string v6, "0"

    move-object v7, v11

    const-string v8, "0"

    const-string v9, "2"

    const-string v10, "0"

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/common/AssistActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "shareH5"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 273
    return-void
.end method

.method public static setApiObject(Lcom/tencent/connect/common/BaseApi;)V
    .locals 0

    .line 187
    sput-object p0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;

    .line 188
    return-void
.end method

.method public static setResultDataForLogin(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 7

    .line 196
    if-nez p0, :cond_0

    .line 197
    return-void

    .line 201
    :cond_0
    if-nez p1, :cond_1

    .line 202
    const/16 v0, 0x2775

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 203
    return-void

    .line 208
    :cond_1
    const-string v0, "key_response"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 209
    const-string v0, "AssistActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AssistActivity--setResultDataForLogin-- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 211
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 212
    const-string v0, "openid"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 213
    const-string v0, "access_token"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 216
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 217
    const/16 v0, 0x2775

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 219
    :cond_2
    const/16 v0, 0x3039

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    :cond_3
    :goto_0
    goto :goto_1

    .line 231
    :catch_0
    move-exception v3

    .line 232
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 234
    :goto_1
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 158
    const-string v0, "AssistActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AssistActivity--onActivityResult--"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " data="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "AssistActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--requestCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | resultCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | data: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 162
    if-nez p1, :cond_1

    .line 163
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->finish()V

    .line 166
    :cond_0
    return-void

    .line 170
    :cond_1
    if-eqz p3, :cond_2

    .line 171
    const-string v0, "key_action"

    const-string v1, "action_login"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    :cond_2
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;

    if-eqz v0, :cond_3

    .line 175
    const-string v0, "AssistActivity"

    const-string v1, "AssistActivity--onActivityResult-- mAPiObject != null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    goto :goto_0

    .line 179
    :cond_3
    const-string v0, "AssistActivity"

    const-string v1, "AssistActivity--onActivityResult-- mAPiObject == null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    invoke-static {p0, p3}, Lcom/tencent/connect/common/AssistActivity;->setResultDataForLogin(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 183
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->finish()V

    .line 184
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 38
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/connect/common/AssistActivity;->requestWindowFeature(I)Z

    .line 41
    const-string v0, "AssistActivity"

    const-string v1, "AssistActivity--onCreate--"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    sget-object v0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;

    if-nez v0, :cond_0

    .line 45
    return-void

    .line 47
    :cond_0
    sget-object v0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;

    iput-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;

    .line 48
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/connect/common/AssistActivity;->sApiObject:Lcom/tencent/connect/common/BaseApi;

    .line 49
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->mAPiObject:Lcom/tencent/connect/common/BaseApi;

    invoke-virtual {v0}, Lcom/tencent/connect/common/BaseApi;->getActivityIntent()Landroid/content/Intent;

    move-result-object v2

    .line 50
    if-nez v2, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "key_request_code"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 51
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "h5_share_data"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    .line 53
    const/4 v5, 0x0

    .line 54
    if-eqz p1, :cond_2

    .line 55
    const-string v0, "RESTART_FLAG"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    .line 57
    :cond_2
    if-nez v5, :cond_4

    .line 58
    if-nez v4, :cond_3

    .line 61
    invoke-virtual {p0, v2, v3}, Lcom/tencent/connect/common/AssistActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_1

    .line 63
    :cond_3
    invoke-direct {p0, v4}, Lcom/tencent/connect/common/AssistActivity;->openBrowser(Landroid/os/Bundle;)V

    .line 68
    :cond_4
    :goto_1
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 120
    const-string v0, "AssistActivity"

    const-string v1, "-->onDestroy"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 122
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 127
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 132
    const-string v0, "action"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 133
    invoke-static {v3}, Lcom/tencent/open/utils/TemporaryStorage;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 136
    const-string v0, "AssistActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AssistActivity--onNewIntent--"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_0

    const-string v2, "mAPiObject = null"

    goto :goto_0

    :cond_0
    const-string v2, "mAPiObject != null"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "key_action"

    const-string v1, "action_share"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    if-eqz v4, :cond_1

    .line 139
    move-object v0, v4

    check-cast v0, Lcom/tencent/tauth/IUiListener;

    invoke-static {p1, v0}, Lcom/tencent/connect/common/BaseApi;->handleDataToListener(Landroid/content/Intent;Lcom/tencent/tauth/IUiListener;)V

    goto :goto_1

    .line 141
    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/tencent/connect/common/AssistActivity;->setResult(ILandroid/content/Intent;)V

    .line 144
    :goto_1
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 145
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->finish()V

    .line 147
    :cond_2
    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 108
    const-string v0, "AssistActivity"

    const-string v1, "-->onPause"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 110
    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 78
    const-string v0, "AssistActivity"

    const-string v1, "-->onResume"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 88
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 89
    const-string v0, "is_login"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    return-void

    .line 93
    :cond_0
    const-string v0, "is_qq_mobile_share"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 94
    sget-boolean v0, Lcom/tencent/connect/common/AssistActivity;->hackShareSend:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    invoke-virtual {p0}, Lcom/tencent/connect/common/AssistActivity;->finish()V

    .line 97
    :cond_1
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/connect/common/AssistActivity;->hackShareSend:Z

    .line 100
    :cond_2
    sget-boolean v0, Lcom/tencent/connect/common/AssistActivity;->hackAuthActivity:Z

    if-eqz v0, :cond_3

    .line 101
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/connect/common/AssistActivity;->hackAuthActivity:Z

    .line 104
    :cond_3
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 151
    const-string v0, "AssistActivity"

    const-string v1, "AssistActivity--onSaveInstanceState--"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "RESTART_FLAG"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 153
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 154
    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 72
    const-string v0, "AssistActivity"

    const-string v1, "-->onStart"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 74
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 114
    const-string v0, "AssistActivity"

    const-string v1, "-->onStop"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 116
    return-void
.end method
