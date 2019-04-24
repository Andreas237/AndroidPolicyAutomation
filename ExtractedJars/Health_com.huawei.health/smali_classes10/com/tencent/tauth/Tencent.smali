.class public Lcom/tencent/tauth/Tencent;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sInstance:Lcom/tencent/tauth/Tencent;


# instance fields
.field private mAgent:Lcom/tencent/open/yyb/AppbarAgent;

.field private mLocationApi:Lcom/tencent/open/LocationApi;

.field private final mQQAuth:Lcom/tencent/connect/auth/QQAuth;


# direct methods
.method private constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Global;->setContext(Landroid/content/Context;)V

    .line 46
    invoke-static {p1, p2}, Lcom/tencent/connect/auth/QQAuth;->createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/connect/auth/QQAuth;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    .line 47
    return-void
.end method

.method private static checkManifestConfig(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    .line 77
    :try_start_0
    new-instance v2, Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.tauth.AuthActivity"

    invoke-direct {v2, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 81
    const/4 v0, 0x0

    invoke-virtual {v3, v2, v0}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    goto :goto_0

    .line 85
    :catch_0
    move-exception v2

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity,\u8bf7\u52a0\u4e0acom.tencent.open.AuthActivity,\u5e76\u914d\u7f6e<data android:scheme=\"tencent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" />,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.connect.util.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n     <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" />\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</intent-filter>\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</activity>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 98
    const-string v0, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity"

    invoke-static {v0, v3}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const/4 v0, 0x0

    return v0

    .line 106
    :goto_0
    :try_start_1
    new-instance v2, Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.connect.common.AssistActivity"

    invoke-direct {v2, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 110
    const/4 v0, 0x0

    invoke-virtual {v3, v2, v0}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 126
    goto :goto_1

    .line 114
    :catch_1
    move-exception v2

    .line 115
    const-string v3, "\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity,\u8bf7\u52a0\u4e0acom.tencent.connect.common.AssistActivity,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863."

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"portrait\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 122
    const-string v0, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity"

    invoke-static {v0, v3}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const/4 v0, 0x0

    return v0

    .line 127
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public static declared-synchronized createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/tauth/Tencent;
    .locals 3

    const-class v2, Lcom/tencent/tauth/Tencent;

    monitor-enter v2

    .line 50
    const-string v0, "openSDK_LOG"

    const-string v1, "createInstance()  -- start"

    :try_start_0
    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    sget-object v0, Lcom/tencent/tauth/Tencent;->sInstance:Lcom/tencent/tauth/Tencent;

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lcom/tencent/tauth/Tencent;

    invoke-direct {v0, p0, p1}, Lcom/tencent/tauth/Tencent;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    sput-object v0, Lcom/tencent/tauth/Tencent;->sInstance:Lcom/tencent/tauth/Tencent;

    goto :goto_0

    .line 54
    :cond_0
    sget-object v0, Lcom/tencent/tauth/Tencent;->sInstance:Lcom/tencent/tauth/Tencent;

    invoke-virtual {v0}, Lcom/tencent/tauth/Tencent;->getAppId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 55
    sget-object v0, Lcom/tencent/tauth/Tencent;->sInstance:Lcom/tencent/tauth/Tencent;

    invoke-virtual {v0, p1}, Lcom/tencent/tauth/Tencent;->logout(Landroid/content/Context;)V

    .line 56
    new-instance v0, Lcom/tencent/tauth/Tencent;

    invoke-direct {v0, p0, p1}, Lcom/tencent/tauth/Tencent;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    sput-object v0, Lcom/tencent/tauth/Tencent;->sInstance:Lcom/tencent/tauth/Tencent;

    .line 60
    :cond_1
    :goto_0
    invoke-static {p1, p0}, Lcom/tencent/tauth/Tencent;->checkManifestConfig(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 61
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_2
    const-string v0, "openSDK_LOG"

    const-string v1, "createInstance()  -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    sget-object v0, Lcom/tencent/tauth/Tencent;->sInstance:Lcom/tencent/tauth/Tencent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static handleResultData(Landroid/content/Intent;Lcom/tencent/tauth/IUiListener;)V
    .locals 0

    .line 397
    invoke-static {p0, p1}, Lcom/tencent/connect/common/BaseApi;->handleDataToListener(Landroid/content/Intent;Lcom/tencent/tauth/IUiListener;)V

    .line 398
    return-void
.end method


# virtual methods
.method public addToQQFavorites(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 499
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 500
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/GameAppOperation;->addToQQFavorites(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 501
    return-void
.end method

.method public ask(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 302
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 303
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->ask(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 304
    const/4 v0, 0x0

    return v0
.end method

.method public bindQQGroup(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 484
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 485
    invoke-virtual {v1, p1, p2}, Lcom/tencent/open/GameAppOperation;->bindQQGroup(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 486
    return-void
.end method

.method public brag(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 610
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 611
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->brag(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 612
    const/4 v0, 0x0

    return v0
.end method

.method public challenge(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 616
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 617
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->challenge(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 618
    const/4 v0, 0x0

    return v0
.end method

.method public checkActivityAvailable(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 712
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 713
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/GameAppOperation;->isActivityAvailable(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V

    .line 714
    return-void
.end method

.method public checkLogin(Lcom/tencent/tauth/IUiListener;)V
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0, p1}, Lcom/tencent/connect/auth/QQAuth;->checkLogin(Lcom/tencent/tauth/IUiListener;)V

    .line 281
    return-void
.end method

.method public checkPrizeByIntent(Landroid/app/Activity;Landroid/content/Intent;)Z
    .locals 3

    .line 726
    const/4 v2, 0x0

    .line 727
    if-nez p2, :cond_0

    .line 728
    const-string v0, "Tencent"

    const-string v1, "-->check by prize by intent, intent is null."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 731
    :cond_0
    const-string v0, "sharePrize"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 733
    :goto_0
    return v2
.end method

.method public deleteLocation(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 602
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/open/LocationApi;

    if-nez v0, :cond_0

    .line 603
    new-instance v0, Lcom/tencent/open/LocationApi;

    iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/open/LocationApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/open/LocationApi;

    .line 605
    :cond_0
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/open/LocationApi;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/LocationApi;->deleteLocation(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 606
    const/4 v0, 0x0

    return v0
.end method

.method public exchangePrize(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 699
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 700
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/GameAppOperation;->exchangePrize(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 701
    return-void
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 347
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExpiresIn()J
    .locals 2

    .line 355
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getExpireTimeInSecond()J

    move-result-wide v0

    return-wide v0
.end method

.method public getOpenId()Ljava/lang/String;
    .locals 1

    .line 369
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQQToken()Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 448
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    return-object v0
.end method

.method public getWPAUserOnlineState(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 581
    new-instance v1, Lcom/tencent/open/wpa/WPA;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/wpa/WPA;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 582
    invoke-virtual {v1, p1, p2}, Lcom/tencent/open/wpa/WPA;->getWPAUserOnlineState(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V

    .line 583
    return-void
.end method

.method public gift(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 296
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 297
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->gift(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 298
    const/4 v0, 0x0

    return v0
.end method

.method public grade(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 637
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 638
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->grade(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 639
    return-void
.end method

.method public handleLoginData(Landroid/content/Intent;Lcom/tencent/tauth/IUiListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 384
    invoke-static {p1, p2}, Lcom/tencent/connect/common/BaseApi;->handleDataToListener(Landroid/content/Intent;Lcom/tencent/tauth/IUiListener;)V

    .line 385
    return-void
.end method

.method public invite(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 284
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 285
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->invite(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 286
    const/4 v0, 0x0

    return v0
.end method

.method public isReady()Z
    .locals 2

    .line 443
    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->isSessionValid()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getOpenId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 444
    :goto_0
    return v1
.end method

.method public isSessionValid()Z
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->isSessionValid()Z

    move-result v0

    return v0
.end method

.method public isSupportSSOLogin(Landroid/app/Activity;)Z
    .locals 2

    .line 456
    const-string v0, "com.tencent.mobileqq"

    invoke-static {p1, v0}, Lcom/tencent/open/utils/SystemUtils;->getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 459
    if-nez v1, :cond_0

    .line 460
    const/4 v0, 0x0

    return v0

    .line 463
    :cond_0
    invoke-static {p1}, Lcom/tencent/open/utils/SystemUtils;->checkMobileQQ(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public joinQQGroup(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 9

    .line 757
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 758
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 762
    :try_start_0
    invoke-virtual {p1, v7}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 763
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.JOININGROUP.XX"

    const-string v4, "13"

    const-string v5, "18"

    const-string v6, "0"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 766
    const/4 v0, 0x1

    return v0

    .line 767
    :catch_0
    move-exception v8

    .line 769
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.JOININGROUP.XX"

    const-string v4, "13"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 772
    const/4 v0, 0x0

    return v0
.end method

.method public login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/QQAuth;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I

    move-result v0

    return v0
.end method

.method public login(Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    const-string v1, ""

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/tencent/connect/auth/QQAuth;->login(Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public loginServerSide(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 3

    .line 209
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",server_side"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p3}, Lcom/tencent/connect/auth/QQAuth;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I

    move-result v0

    return v0
.end method

.method public loginServerSide(Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 3

    .line 237
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",server_side"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, p1, v1, p3, v2}, Lcom/tencent/connect/auth/QQAuth;->login(Landroid/support/v4/app/Fragment;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public loginWithOEM(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 253
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/connect/auth/QQAuth;->loginWithOEM(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public logout(Landroid/content/Context;)V
    .locals 3

    .line 257
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    const-string v1, "0"

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V

    .line 259
    return-void
.end method

.method public makeFriend(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 470
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 471
    invoke-virtual {v1, p1, p2}, Lcom/tencent/open/GameAppOperation;->makeFriend(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 472
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    .line 339
    const/4 v0, 0x0

    return v0
.end method

.method public queryUnexchangePrize(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 686
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 687
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/GameAppOperation;->queryUnexchangePrize(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 688
    return-void
.end method

.method public reAuth(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/connect/auth/QQAuth;->reAuth(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I

    move-result v0

    return v0
.end method

.method public reactive(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 588
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 589
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->reactive(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 590
    const/4 v0, 0x0

    return v0
.end method

.method public releaseResource()V
    .locals 1

    .line 331
    const-string v0, "shareToQQ"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 332
    const-string v0, "shareToQzone"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 333
    const-string v0, "sendToMyComputer"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 334
    const-string v0, "addToQQFavorites"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 335
    const-string v0, "shareToTroopBar"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 336
    return-void
.end method

.method public reportDAU()V
    .locals 1

    .line 271
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->reportDAU()V

    .line 272
    return-void
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/json/JSONException;,
            Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;,
            Lcom/tencent/open/utils/HttpUtils$HttpStatusException;
        }
    .end annotation

    .line 316
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1, p1, p2, p3}, Lcom/tencent/open/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public requestAsync(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;Ljava/lang/Object;)V
    .locals 6

    .line 309
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 311
    return-void
.end method

.method public searchNearby(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 594
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/open/LocationApi;

    if-nez v0, :cond_0

    .line 595
    new-instance v0, Lcom/tencent/open/LocationApi;

    iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/open/LocationApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/open/LocationApi;

    .line 597
    :cond_0
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mLocationApi:Lcom/tencent/open/LocationApi;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/open/LocationApi;->searchNearby(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 598
    const/4 v0, 0x0

    return v0
.end method

.method public sendToMyComputer(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 514
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 515
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/GameAppOperation;->sendToMyComputer(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 516
    return-void
.end method

.method public setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 417
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setAccessToken(), expiresIn = "

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

    .line 418
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/connect/auth/QQAuth;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    return-void
.end method

.method public setAvatar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 4

    .line 622
    const-string v0, "picture"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 623
    const-string v0, "exitAnim"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 624
    new-instance v3, Lcom/tencent/connect/avatar/QQAvatar;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/tencent/connect/avatar/QQAvatar;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 625
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3, p1, v0, p3, v2}, Lcom/tencent/connect/avatar/QQAvatar;->setAvatar(Landroid/app/Activity;Landroid/net/Uri;Lcom/tencent/tauth/IUiListener;I)V

    .line 626
    return-void
.end method

.method public setAvatar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;II)V
    .locals 1

    .line 630
    const-string v0, "exitAnim"

    invoke-virtual {p2, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 632
    const/4 v0, 0x0

    invoke-virtual {p1, p4, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 633
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/tauth/Tencent;->setAvatar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 634
    return-void
.end method

.method public setOpenId(Ljava/lang/String;)V
    .locals 2

    .line 430
    const-string v0, "openSDK_LOG"

    const-string v1, "setOpenId() --start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/tencent/connect/auth/QQAuth;->setOpenId(Landroid/content/Context;Ljava/lang/String;)V

    .line 434
    const-string v0, "openSDK_LOG"

    const-string v1, "setOpenId() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    return-void
.end method

.method public sharePrizeToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 675
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 676
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/GameAppOperation;->sharePrizeToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 677
    return-void
.end method

.method public shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 321
    new-instance v1, Lcom/tencent/connect/share/QQShare;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/tencent/connect/share/QQShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 322
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/connect/share/QQShare;->shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 323
    return-void
.end method

.method public shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 326
    new-instance v1, Lcom/tencent/connect/share/QzoneShare;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/tencent/connect/share/QzoneShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 327
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/connect/share/QzoneShare;->shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 328
    return-void
.end method

.method public shareToTroopBar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 529
    new-instance v1, Lcom/tencent/open/GameAppOperation;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/GameAppOperation;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 530
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/GameAppOperation;->shareToTroopBar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 531
    return-void
.end method

.method public showTaskGuideWindow(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 648
    new-instance v1, Lcom/tencent/open/TaskGuide;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/tencent/open/TaskGuide;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 649
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/TaskGuide;->showTaskGuideWindow(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 650
    return-void
.end method

.method public startAppbar(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 653
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    if-nez v0, :cond_0

    .line 654
    new-instance v0, Lcom/tencent/open/yyb/AppbarAgent;

    iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/open/yyb/AppbarAgent;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    .line 656
    :cond_0
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/open/yyb/AppbarAgent;->startAppbar(Landroid/app/Activity;Ljava/lang/String;)V

    .line 657
    return-void
.end method

.method public startAppbarLabel(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 660
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    if-nez v0, :cond_0

    .line 661
    new-instance v0, Lcom/tencent/open/yyb/AppbarAgent;

    iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/open/yyb/AppbarAgent;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    .line 663
    :cond_0
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/open/yyb/AppbarAgent;->startAppbarLabel(Landroid/app/Activity;Ljava/lang/String;)V

    .line 664
    return-void
.end method

.method public startAppbarThread(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 743
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    if-nez v0, :cond_0

    .line 744
    new-instance v0, Lcom/tencent/open/yyb/AppbarAgent;

    iget-object v1, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/open/yyb/AppbarAgent;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    iput-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    .line 746
    :cond_0
    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mAgent:Lcom/tencent/open/yyb/AppbarAgent;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/open/yyb/AppbarAgent;->startAppbarThread(Landroid/app/Activity;Ljava/lang/String;)V

    .line 747
    return-void
.end method

.method public startWPAConversation(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 549
    const-string v0, "wpa"

    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/tencent/tauth/Tencent;->startWPAConversation(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public startWPAConversation(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 576
    new-instance v1, Lcom/tencent/open/wpa/WPA;

    invoke-virtual {p0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/wpa/WPA;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 577
    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/tencent/open/wpa/WPA;->startWPAConversation(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public story(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)I
    .locals 2

    .line 290
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 291
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->story(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 292
    const/4 v0, 0x0

    return v0
.end method

.method public voice(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 2

    .line 643
    new-instance v1, Lcom/tencent/open/SocialApi;

    iget-object v0, p0, Lcom/tencent/tauth/Tencent;->mQQAuth:Lcom/tencent/connect/auth/QQAuth;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQAuth;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/tencent/open/SocialApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 644
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/open/SocialApi;->voice(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 645
    return-void
.end method
