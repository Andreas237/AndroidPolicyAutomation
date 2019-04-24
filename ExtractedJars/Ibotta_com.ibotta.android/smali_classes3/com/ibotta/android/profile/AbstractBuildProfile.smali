.class public abstract Lcom/ibotta/android/profile/AbstractBuildProfile;
.super Ljava/lang/Object;
.source "AbstractBuildProfile.kt"

# interfaces
.implements Lcom/ibotta/android/profile/BuildProfile;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010&\u001a\u00020\u001dH\u0016R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\tR\u001c\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\tR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001dX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\rR\u0016\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/ibotta/android/profile/AbstractBuildProfile;",
        "Lcom/ibotta/android/profile/BuildProfile;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "apiUrl",
        "",
        "kotlin.jvm.PlatformType",
        "getApiUrl",
        "()Ljava/lang/String;",
        "appVersionCode",
        "",
        "getAppVersionCode",
        "()I",
        "appVersionName",
        "getAppVersionName",
        "appVersionSuffix",
        "getAppVersionSuffix",
        "buildType",
        "Lcom/ibotta/android/profile/BuildType;",
        "getBuildType",
        "()Lcom/ibotta/android/profile/BuildType;",
        "getContext",
        "()Landroid/content/Context;",
        "displayableAppBuildNumber",
        "getDisplayableAppBuildNumber",
        "displayableAppVersion",
        "getDisplayableAppVersion",
        "isAopFailHard",
        "",
        "()Z",
        "isFeatureFlagInAppConfigMandatory",
        "maxCardsPerRow",
        "getMaxCardsPerRow",
        "packageInfo",
        "Landroid/content/pm/PackageInfo;",
        "getPackageInfo",
        "()Landroid/content/pm/PackageInfo;",
        "shouldAllowApiUrlOverride",
        "ibotta-profile_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final apiUrl:Ljava/lang/String;

.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final displayableAppVersion:Ljava/lang/String;

.field private final isAopFailHard:Z

.field private final isFeatureFlagInAppConfigMandatory:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->context:Landroid/content/Context;

    .line 28
    iget-object p1, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->context:Landroid/content/Context;

    sget v0, Lcom/ibotta/android/profile/R$string;->setting_version_s:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->displayableAppVersion:Ljava/lang/String;

    .line 33
    iget-object p1, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->context:Landroid/content/Context;

    sget v0, Lcom/ibotta/android/profile/R$string;->api_url:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->apiUrl:Ljava/lang/String;

    return-void
.end method

.method private final getPackageInfo()Landroid/content/pm/PackageInfo;
    .locals 3

    const/4 v0, 0x0

    .line 44
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 46
    check-cast v1, Ljava/lang/Throwable;

    const-string v2, "Failed to obtain PackageInfo."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public getApiUrl()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->apiUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersionCode()I
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getAppVersionName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getAppVersionSuffix()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getBuildType()Lcom/ibotta/android/profile/BuildType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/profile/BuildType;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getBuildType()Lcom/ibotta/android/profile/BuildType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method protected final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getDisplayableAppBuildNumber()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getAppVersionCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/profile/AbstractBuildProfile;->getAppVersionSuffix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayableAppVersion()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->displayableAppVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxCardsPerRow()I
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "context.resources"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 38
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v0

    const/16 v0, 0x1b8

    int-to-float v0, v0

    cmpg-float v0, v1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    :goto_0
    return v0
.end method

.method public isAopFailHard()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->isAopFailHard:Z

    return v0
.end method

.method public isFeatureFlagInAppConfigMandatory()Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lcom/ibotta/android/profile/AbstractBuildProfile;->isFeatureFlagInAppConfigMandatory:Z

    return v0
.end method

.method public shouldAllowApiUrlOverride()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
