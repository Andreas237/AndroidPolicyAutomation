.class public Lcom/tencent/connect/auth/QQAuth;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/tencent/connect/auth/AuthAgent;

.field private b:Lcom/tencent/connect/auth/QQToken;


# direct methods
.method private constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const-string v0, "openSDK_LOG"

    const-string v1, "new QQAuth() --start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    new-instance v0, Lcom/tencent/connect/auth/QQToken;

    invoke-direct {v0, p1}, Lcom/tencent/connect/auth/QQToken;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    .line 41
    new-instance v0, Lcom/tencent/connect/auth/AuthAgent;

    iget-object v1, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-direct {v0, v1}, Lcom/tencent/connect/auth/AuthAgent;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    iput-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;

    .line 42
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-static {p2, v0}, Lcom/tencent/connect/a/a;->c(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 43
    const-string v0, "openSDK_LOG"

    const-string v1, "new QQAuth() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method private a(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I
    .locals 13

    .line 166
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    .line 167
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    .line 168
    const/16 v0, 0x80

    invoke-virtual {v8, v0}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v9

    .line 169
    const/4 v10, 0x0

    .line 170
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/content/pm/ApplicationInfo;

    .line 171
    iget-object v0, v12, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v10, v12, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 173
    goto :goto_1

    :cond_0
    goto :goto_0

    .line 176
    :cond_1
    :goto_1
    if-eqz v10, :cond_3

    .line 178
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tencent/open/utils/ApkExternalInfoTool;->readChannelId(Ljava/io/File;)Ljava/lang/String;

    move-result-object v11

    .line 179
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 180
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->login channelId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v11

    move-object v5, v11

    const-string v6, ""

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/connect/auth/QQAuth;->loginWithOEM(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 186
    :cond_2
    goto :goto_2

    .line 183
    :catch_0
    move-exception v11

    .line 184
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->login get channel id exception."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 189
    :cond_3
    :goto_2
    const-string v0, "openSDK_LOG"

    const-string v1, "-->login channelId is null "

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/connect/common/BaseApi;->isOEM:Z

    .line 192
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;

    move-object v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v5, p2

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZLandroid/support/v4/app/Fragment;)I

    move-result v0

    return v0
.end method

.method public static createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/connect/auth/QQAuth;
    .locals 5

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Global;->setContext(Landroid/content/Context;)V

    .line 57
    const-string v0, "openSDK_LOG"

    const-string v1, "QQAuth -- createInstance() --start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 60
    new-instance v4, Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.tauth.AuthActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 65
    new-instance v4, Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.connect.common.AssistActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_0

    .line 69
    :catch_0
    move-exception v3

    .line 70
    const-string v0, "openSDK_LOG"

    const-string v1, "createInstance() error --end"

    invoke-static {v0, v1, v3}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u8bf7\u53c2\u7167\u6587\u6863\u5728Androidmanifest.xml\u52a0\u4e0aAuthActivity\u548cAssitActivity\u7684\u5b9a\u4e49 "

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 77
    :goto_0
    new-instance v3, Lcom/tencent/connect/auth/QQAuth;

    invoke-direct {v3, p0, p1}, Lcom/tencent/connect/auth/QQAuth;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 79
    const-string v0, "openSDK_LOG"

    const-string v1, "QQAuth -- createInstance()  --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    return-object v3
.end method


# virtual methods
.method public checkLogin(Lcom/tencent/tauth/IUiListener;)V
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-virtual {v0, p1}, Lcom/tencent/connect/auth/AuthAgent;->b(Lcom/tencent/tauth/IUiListener;)V

    .line 265
    return-void
.end method

.method public getQQToken()Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method public isSessionValid()Z
    .locals 3

    .line 317
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isSessionValid(), result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "true"

    goto :goto_0

    :cond_0
    const-string v2, "false"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z

    move-result v0

    return v0
.end method

.method public login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 102
    const-string v0, "openSDK_LOG"

    const-string v1, "login()"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v0, ""

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/tencent/connect/auth/QQAuth;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I
    .locals 6

    .line 126
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->login activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/QQAuth;->a(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public login(Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I
    .locals 7

    .line 151
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    .line 152
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->login activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    move-object v0, p0

    move-object v1, v6

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/QQAuth;->a(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public loginWithOEM(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 209
    const-string v0, "openSDK_LOG"

    const-string v1, "loginWithOEM"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    const/4 v0, 0x1

    sput-boolean v0, Lcom/tencent/connect/common/BaseApi;->isOEM:Z

    .line 212
    const-string v0, ""

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    const-string p4, "null"

    .line 215
    :cond_0
    const-string v0, ""

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    const-string p5, "null"

    .line 218
    :cond_1
    const-string v0, ""

    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 219
    const-string p6, "null"

    .line 221
    :cond_2
    sput-object p5, Lcom/tencent/connect/common/BaseApi;->installChannel:Ljava/lang/String;

    .line 222
    sput-object p4, Lcom/tencent/connect/common/BaseApi;->registerChannel:Ljava/lang/String;

    .line 223
    sput-object p6, Lcom/tencent/connect/common/BaseApi;->businessId:Ljava/lang/String;

    .line 224
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I

    move-result v0

    return v0
.end method

.method public logout(Landroid/content/Context;)V
    .locals 2

    .line 275
    const-string v0, "openSDK_LOG"

    const-string v1, "logout() --start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-static {p1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 281
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/tencent/connect/auth/QQAuth;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/tencent/connect/auth/QQAuth;->setOpenId(Landroid/content/Context;Ljava/lang/String;)V

    .line 283
    const-string v0, "openSDK_LOG"

    const-string v1, "logout() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 3

    .line 358
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResult() ,resultCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    const/4 v0, 0x1

    return v0
.end method

.method public reAuth(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 6

    .line 247
    const-string v0, "openSDK_LOG"

    const-string v1, "reAuth()"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZLandroid/support/v4/app/Fragment;)I

    move-result v0

    return v0
.end method

.method public reportDAU()V
    .locals 2

    .line 255
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->a:Lcom/tencent/connect/auth/AuthAgent;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/connect/auth/AuthAgent;->a(Lcom/tencent/tauth/IUiListener;)V

    .line 256
    return-void
.end method

.method public setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 306
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setAccessToken(), validTimeInSecond = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    return-void
.end method

.method public setOpenId(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 331
    const-string v0, "openSDK_LOG"

    const-string v1, "setOpenId() --start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0, p2}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/tencent/connect/auth/QQAuth;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-static {p1, v0}, Lcom/tencent/connect/a/a;->d(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 334
    const-string v0, "openSDK_LOG"

    const-string v1, "setOpenId() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    return-void
.end method
