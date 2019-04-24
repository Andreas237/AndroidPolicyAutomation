.class Lio/branch/referral/InstantAppUtil;
.super Ljava/lang/Object;
.source "InstantAppUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;
    }
.end annotation


# static fields
.field private static isInstantApp:Ljava/lang/Boolean;

.field private static lastApplicationContext:Landroid/content/Context;

.field private static packageManagerWrapper:Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Z
    .locals 1

    .line 24
    invoke-static {}, Lio/branch/referral/InstantAppUtil;->isAtLeastO()Z

    move-result v0

    return v0
.end method

.method static doShowInstallPrompt(Landroid/app/Activity;ILjava/lang/String;)Z
    .locals 5
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 71
    sget-object p0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    sget-object p0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "BranchSDK"

    const-string p1, "Unable to show install prompt. Activity is null"

    .line 72
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return v0

    .line 75
    :cond_1
    invoke-static {p0}, Lio/branch/referral/InstantAppUtil;->isInstantApp(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 76
    sget-object p0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    if-eqz p0, :cond_2

    sget-object p0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "BranchSDK"

    const-string p1, "Unable to show install prompt. Application is not an instant app"

    .line 77
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return v0

    .line 81
    :cond_3
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "android.intent.category.DEFAULT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "callerId"

    .line 82
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "overlay"

    const/4 v2, 0x1

    .line 83
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    .line 84
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v3, "market"

    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v3, "details"

    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v3, "id"

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 85
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "referrer"

    .line 86
    invoke-virtual {v1, v3, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 89
    :cond_4
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 90
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return v2
.end method

.method private static isAtLeastO()Z
    .locals 2

    .line 61
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    invoke-static {}, Lio/branch/referral/InstantAppUtil;->isPreReleaseOBuild()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static isInstantApp(Landroid/content/Context;)Z
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 33
    :cond_0
    sget-object v0, Lio/branch/referral/InstantAppUtil;->isInstantApp:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    sget-object v0, Lio/branch/referral/InstantAppUtil;->lastApplicationContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    sget-object p0, Lio/branch/referral/InstantAppUtil;->isInstantApp:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_1
    const/4 v0, 0x0

    .line 36
    sput-object v0, Lio/branch/referral/InstantAppUtil;->isInstantApp:Ljava/lang/Boolean;

    .line 38
    invoke-static {}, Lio/branch/referral/InstantAppUtil;->isAtLeastO()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 39
    sget-object v0, Lio/branch/referral/InstantAppUtil;->packageManagerWrapper:Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;

    if-eqz v0, :cond_2

    sget-object v0, Lio/branch/referral/InstantAppUtil;->lastApplicationContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 40
    :cond_2
    new-instance v0, Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;-><init>(Landroid/content/pm/PackageManager;)V

    sput-object v0, Lio/branch/referral/InstantAppUtil;->packageManagerWrapper:Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;

    .line 42
    :cond_3
    sget-object v0, Lio/branch/referral/InstantAppUtil;->packageManagerWrapper:Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;

    invoke-virtual {v0}, Lio/branch/referral/InstantAppUtil$PackageManagerWrapper;->isInstantApp()Ljava/lang/Boolean;

    move-result-object v0

    .line 44
    :cond_4
    sput-object p0, Lio/branch/referral/InstantAppUtil;->lastApplicationContext:Landroid/content/Context;

    if-eqz v0, :cond_5

    .line 46
    sput-object v0, Lio/branch/referral/InstantAppUtil;->isInstantApp:Ljava/lang/Boolean;

    goto :goto_0

    .line 49
    :cond_5
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v0, "com.google.android.instantapps.supervisor.InstantAppsRuntime"

    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p0, Lio/branch/referral/InstantAppUtil;->isInstantApp:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 52
    :catch_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Lio/branch/referral/InstantAppUtil;->isInstantApp:Ljava/lang/Boolean;

    .line 56
    :goto_0
    sget-object p0, Lio/branch/referral/InstantAppUtil;->isInstantApp:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static isPreReleaseOBuild()Z
    .locals 2

    const-string v0, "REL"

    .line 65
    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "O"

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "OMR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
