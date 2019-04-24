.class public Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;
.super Ljava/lang/Object;
.source "ServerUpgradeStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;
.implements Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final KEY_SERVER_REQUIRES_APP_UPGRADE:Ljava/lang/String; = "serverRequiresAppUpgrade"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appSemver:Lcom/ibotta/android/util/AppSemver;

.field private final appVersionCode:I

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/state/app/config/AppConfig;ILcom/ibotta/android/util/AppSemver;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 28
    iput p3, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appVersionCode:I

    .line 29
    iput-object p4, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appSemver:Lcom/ibotta/android/util/AppSemver;

    return-void
.end method


# virtual methods
.method public getAppConfig()Lcom/ibotta/android/state/app/config/AppConfig;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-object v0
.end method

.method protected getAppVersion()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appVersionCode:I

    return v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public isServerRequiresAppUpgrade()Z
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "serverRequiresAppUpgrade"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isUpgradeRequired()Z
    .locals 5

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->isServerRequiresAppUpgrade()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getAppMinVersion()I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-le v0, v2, :cond_1

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->getAppVersion()I

    move-result v2

    if-le v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 54
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getVersionsBlacklist()Ljava/util/List;

    move-result-object v2

    .line 55
    iget-object v4, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->appSemver:Lcom/ibotta/android/util/AppSemver;

    invoke-interface {v4}, Lcom/ibotta/android/util/AppSemver;->getSemver()Lcom/vdurmont/semver4j/Semver;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v0, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    return v1
.end method

.method public onAppUpgraded(Lcom/ibotta/android/state/app/pojo/UpgradeInfo;)V
    .locals 0

    const/4 p1, 0x0

    .line 78
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->setServerRequiresAppUpgrade(Z)V

    return-void
.end method

.method public setServerRequiresAppUpgrade(Z)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "serverRequiresAppUpgrade"

    .line 72
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 73
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
