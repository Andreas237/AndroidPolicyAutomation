.class public Lcom/tencent/tauth/AuthActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static final ACTION_ADD_TO_QQFAVORITES:Ljava/lang/String; = "addToQQFavorites"

.field public static final ACTION_KEY:Ljava/lang/String; = "action"

.field private static final ACTION_SEND_TO_MY_COMPUTER:Ljava/lang/String; = "sendToMyComputer"

.field public static final ACTION_SHARE_PRIZE:Ljava/lang/String; = "sharePrize"

.field private static final ACTION_SHARE_TO_QQ:Ljava/lang/String; = "shareToQQ"

.field private static final ACTION_SHARE_TO_QZONE:Ljava/lang/String; = "shareToQzone"

.field private static final ACTION_SHARE_TO_TROOP_BAR:Ljava/lang/String; = "shareToTroopBar"

.field private static final SHARE_PRIZE_ACTIVITY_ID:Ljava/lang/String; = "activityid"

.field private static final TAG:Ljava/lang/String; = "openSDK_LOG.AuthActivity"

.field private static mShareQzoneBackTime:I = 0x0


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const/4 v0, 0x0

    sput v0, Lcom/tencent/tauth/AuthActivity;->mShareQzoneBackTime:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private execAuthCallback(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 9

    .line 158
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 159
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 160
    return-void

    .line 162
    :cond_1
    invoke-static {}, Lcom/tencent/connect/auth/AuthMap;->getInstance()Lcom/tencent/connect/auth/AuthMap;

    move-result-object v2

    .line 163
    const-string v0, "serial"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 164
    invoke-virtual {v2, v3}, Lcom/tencent/connect/auth/AuthMap;->get(Ljava/lang/String;)Lcom/tencent/connect/auth/AuthMap$Auth;

    move-result-object v4

    .line 165
    if-eqz v4, :cond_5

    .line 166
    const-string v0, "://cancel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 167
    iget-object v0, v4, Lcom/tencent/connect/auth/AuthMap$Auth;->listener:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 168
    iget-object v0, v4, Lcom/tencent/connect/auth/AuthMap$Auth;->dialog:Lcom/tencent/connect/auth/AuthDialog;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V

    goto :goto_0

    .line 170
    :cond_2
    const-string v0, "access_token"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 171
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 172
    const-string v0, "access_token"

    iget-object v1, v4, Lcom/tencent/connect/auth/AuthMap$Auth;->key:Ljava/lang/String;

    invoke-virtual {v2, v5, v1}, Lcom/tencent/connect/auth/AuthMap;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    :cond_3
    invoke-static {p1}, Lcom/tencent/open/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v6

    .line 175
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 176
    invoke-static {v7, v6}, Lcom/tencent/open/utils/Util;->decodeUrlToJson(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 177
    const-string v0, "cb"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 178
    const-string v0, ""

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 179
    iget-object v0, v4, Lcom/tencent/connect/auth/AuthMap$Auth;->dialog:Lcom/tencent/connect/auth/AuthDialog;

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Lcom/tencent/connect/auth/AuthDialog;->callJs(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 182
    :cond_4
    iget-object v0, v4, Lcom/tencent/connect/auth/AuthMap$Auth;->listener:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v7}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 183
    iget-object v0, v4, Lcom/tencent/connect/auth/AuthMap$Auth;->dialog:Lcom/tencent/connect/auth/AuthDialog;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V

    .line 186
    :goto_0
    invoke-virtual {v2, v3}, Lcom/tencent/connect/auth/AuthMap;->remove(Ljava/lang/String;)V

    .line 188
    :cond_5
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 189
    return-void
.end method

.method private handleActionUri(Landroid/net/Uri;)V
    .locals 12

    .line 78
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 80
    return-void

    .line 82
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    .line 83
    const-string v0, "#"

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 85
    invoke-static {v4}, Lcom/tencent/open/utils/Util;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 86
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 87
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 88
    return-void

    .line 91
    :cond_2
    const-string v0, "action"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 92
    const-string v0, "openSDK_LOG.AuthActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->handleActionUri, action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 94
    invoke-direct {p0, v5, v3}, Lcom/tencent/tauth/AuthActivity;->execAuthCallback(Landroid/os/Bundle;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 95
    :cond_3
    const-string v0, "shareToQQ"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "shareToQzone"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "sendToMyComputer"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "shareToTroopBar"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 102
    :cond_4
    const-string v0, "shareToQzone"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "com.tencent.mobileqq"

    invoke-static {p0, v0}, Lcom/tencent/open/utils/SystemUtils;->getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v0, "5.2.0"

    invoke-static {p0, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_5

    .line 106
    sget v0, Lcom/tencent/tauth/AuthActivity;->mShareQzoneBackTime:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/tencent/tauth/AuthActivity;->mShareQzoneBackTime:I

    .line 107
    sget v0, Lcom/tencent/tauth/AuthActivity;->mShareQzoneBackTime:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 108
    const/4 v0, 0x0

    sput v0, Lcom/tencent/tauth/AuthActivity;->mShareQzoneBackTime:I

    .line 109
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 110
    return-void

    .line 115
    :cond_5
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/tencent/connect/common/AssistActivity;

    invoke-direct {v7, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 116
    invoke-virtual {v7, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 117
    const/high16 v0, 0x24000000

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 118
    const/4 v0, 0x1

    sput-boolean v0, Lcom/tencent/connect/common/AssistActivity;->hackAuthActivity:Z

    .line 119
    invoke-virtual {p0, v7}, Lcom/tencent/tauth/AuthActivity;->startActivity(Landroid/content/Intent;)V

    .line 120
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 121
    goto/16 :goto_1

    :cond_6
    const-string v0, "addToQQFavorites"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 122
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    .line 123
    invoke-virtual {v7, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 124
    const-string v0, "key_action"

    const-string v1, "action_share"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    invoke-static {v6}, Lcom/tencent/open/utils/TemporaryStorage;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    .line 127
    if-eqz v8, :cond_7

    .line 128
    move-object v0, v8

    check-cast v0, Lcom/tencent/tauth/IUiListener;

    invoke-static {v7, v0}, Lcom/tencent/connect/common/BaseApi;->handleDataToListener(Landroid/content/Intent;Lcom/tencent/tauth/IUiListener;)V

    .line 130
    :cond_7
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 131
    goto/16 :goto_1

    :cond_8
    const-string v0, "sharePrize"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 132
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    .line 134
    const-string v0, "response"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 135
    const/4 v9, 0x0

    .line 136
    const-string v10, ""

    .line 138
    :try_start_0
    invoke-static {v8}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    .line 139
    const-string v0, "activityid"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v10, v0

    .line 142
    goto :goto_0

    .line 140
    :catch_0
    move-exception v11

    .line 141
    const-string v0, "openSDK_LOG.AuthActivity"

    const-string v1, "sharePrize parseJson has exception."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :goto_0
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 145
    const-string v0, "sharePrize"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 146
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 147
    const-string v0, "activityid"

    invoke-virtual {v11, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    invoke-virtual {v7, v11}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 150
    :cond_9
    invoke-virtual {p0, v7}, Lcom/tencent/tauth/AuthActivity;->startActivity(Landroid/content/Intent;)V

    .line 151
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    .line 152
    goto :goto_1

    .line 153
    :cond_a
    invoke-direct {p0, v5, v3}, Lcom/tencent/tauth/AuthActivity;->execAuthCallback(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 155
    :goto_1
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 61
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 62
    return-void

    .line 65
    :cond_0
    const/4 v3, 0x0

    .line 67
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 70
    goto :goto_0

    .line 68
    :catch_0
    move-exception v4

    .line 69
    const-string v0, "openSDK_LOG.AuthActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->onCreate, getIntent().getData() has exception! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    :goto_0
    const-string v0, "openSDK_LOG.AuthActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->onCreate, uri: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0, v3}, Lcom/tencent/tauth/AuthActivity;->handleActionUri(Landroid/net/Uri;)V

    .line 75
    return-void
.end method
