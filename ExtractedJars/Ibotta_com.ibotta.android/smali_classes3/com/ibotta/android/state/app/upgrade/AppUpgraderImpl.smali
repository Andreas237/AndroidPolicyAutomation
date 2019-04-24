.class public Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;
.super Ljava/lang/Object;
.source "AppUpgraderImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/upgrade/AppUpgrader;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final KEY_APP_VERSION:Ljava/lang/String; = "app_version"


# instance fields
.field private final context:Landroid/content/Context;

.field private final listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;",
            ">;"
        }
    .end annotation
.end field

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->context:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->prefs:Landroid/content/SharedPreferences;

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->listeners:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addAppUpgradeListener(Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected convertVersionCodeToStr(I)Ljava/lang/String;
    .locals 0

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->listeners:Ljava/util/List;

    return-object v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method protected notifyListeners(Lcom/ibotta/android/state/app/pojo/UpgradeInfo;)V
    .locals 6

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;

    .line 93
    :try_start_0
    invoke-interface {v1, p1}, Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;->onAppUpgraded(Lcom/ibotta/android/state/app/pojo/UpgradeInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to notify listener: %1$s"

    const/4 v4, 0x1

    .line 95
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected performUpgrade(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/state/app/pojo/UpgradeInfo;
    .locals 2

    .line 79
    new-instance v0, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "Version difference detected. Running upgrade logic."

    const/4 v1, 0x0

    .line 80
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object p1, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "app_version"

    .line 83
    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 84
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 86
    invoke-virtual {p0, v0}, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->notifyListeners(Lcom/ibotta/android/state/app/pojo/UpgradeInfo;)V

    return-object v0
.end method

.method public performUpgradeIfNeeded()Lcom/ibotta/android/state/app/pojo/UpgradeInfo;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 60
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 61
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->convertVersionCodeToStr(I)Ljava/lang/String;

    move-result-object v2

    .line 62
    iget-object v3, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v4, "app_version"

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_0

    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 65
    invoke-virtual {p0, v3, v2}, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->performUpgrade(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/state/app/pojo/UpgradeInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to check version for upgrade logic."

    .line 68
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-object v1
.end method

.method public removeAppUpgradeListener(Lcom/ibotta/android/state/app/upgrade/AppUpgradeListener;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/state/app/upgrade/AppUpgraderImpl;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
