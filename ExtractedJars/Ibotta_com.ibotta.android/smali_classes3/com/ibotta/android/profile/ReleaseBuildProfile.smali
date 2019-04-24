.class public final Lcom/ibotta/android/profile/ReleaseBuildProfile;
.super Lcom/ibotta/android/profile/AbstractBuildProfile;
.source "ReleaseBuildProfile.kt"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010 \u001a\u00020\u000eH\u0016J\u0008\u0010!\u001a\u00020\u000eH\u0016J\u0008\u0010\"\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u000f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/ibotta/android/profile/ReleaseBuildProfile;",
        "Lcom/ibotta/android/profile/AbstractBuildProfile;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "appVersionSuffix",
        "",
        "getAppVersionSuffix",
        "()Ljava/lang/String;",
        "buildType",
        "Lcom/ibotta/android/profile/BuildType;",
        "getBuildType",
        "()Lcom/ibotta/android/profile/BuildType;",
        "isApiLayerInDebugMode",
        "",
        "()Z",
        "isDebugApolloLogging",
        "isDebugAppsFlyer",
        "isDebugButtonSdkLogging",
        "isDebugCamera",
        "isDebugHttpHeaders",
        "isDebugInternalTracking",
        "isDebugLaunchDarkly",
        "isDebugLoadingAllowed",
        "isDebugMenuAvailable",
        "isDebugPixelTracking",
        "isDebugRadar",
        "isDebugReceiptCapture",
        "isDebugTrackingQueue",
        "isGeofenceDebuggingEnabled",
        "isStethoEnabled",
        "isUpgradeNoticeIgnorable",
        "shouldAllowFeatureFlagOverrides",
        "shouldCheckForPushFramework",
        "shouldDebugCacheClearing",
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
.field private final appVersionSuffix:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final buildType:Lcom/ibotta/android/profile/BuildType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isApiLayerInDebugMode:Z

.field private final isDebugApolloLogging:Z

.field private final isDebugAppsFlyer:Z

.field private final isDebugButtonSdkLogging:Z

.field private final isDebugCamera:Z

.field private final isDebugHttpHeaders:Z

.field private final isDebugInternalTracking:Z

.field private final isDebugLaunchDarkly:Z

.field private final isDebugLoadingAllowed:Z

.field private final isDebugMenuAvailable:Z

.field private final isDebugPixelTracking:Z

.field private final isDebugRadar:Z

.field private final isDebugReceiptCapture:Z

.field private final isDebugTrackingQueue:Z

.field private final isGeofenceDebuggingEnabled:Z

.field private final isStethoEnabled:Z

.field private final isUpgradeNoticeIgnorable:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1}, Lcom/ibotta/android/profile/AbstractBuildProfile;-><init>(Landroid/content/Context;)V

    const-string p1, ""

    .line 12
    iput-object p1, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->appVersionSuffix:Ljava/lang/String;

    .line 13
    sget-object p1, Lcom/ibotta/android/profile/BuildType;->RELEASE:Lcom/ibotta/android/profile/BuildType;

    iput-object p1, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->buildType:Lcom/ibotta/android/profile/BuildType;

    return-void
.end method


# virtual methods
.method public getAppVersionSuffix()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->appVersionSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public getBuildType()Lcom/ibotta/android/profile/BuildType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->buildType:Lcom/ibotta/android/profile/BuildType;

    return-object v0
.end method

.method public isApiLayerInDebugMode()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isApiLayerInDebugMode:Z

    return v0
.end method

.method public isDebugApolloLogging()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugApolloLogging:Z

    return v0
.end method

.method public isDebugAppsFlyer()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugAppsFlyer:Z

    return v0
.end method

.method public isDebugButtonSdkLogging()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugButtonSdkLogging:Z

    return v0
.end method

.method public isDebugCamera()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugCamera:Z

    return v0
.end method

.method public isDebugHttpHeaders()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugHttpHeaders:Z

    return v0
.end method

.method public isDebugInternalTracking()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugInternalTracking:Z

    return v0
.end method

.method public isDebugLaunchDarkly()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugLaunchDarkly:Z

    return v0
.end method

.method public isDebugLoadingAllowed()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugLoadingAllowed:Z

    return v0
.end method

.method public isDebugMenuAvailable()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugMenuAvailable:Z

    return v0
.end method

.method public isDebugPixelTracking()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugPixelTracking:Z

    return v0
.end method

.method public isDebugRadar()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugRadar:Z

    return v0
.end method

.method public isDebugReceiptCapture()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugReceiptCapture:Z

    return v0
.end method

.method public isDebugTrackingQueue()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isDebugTrackingQueue:Z

    return v0
.end method

.method public isGeofenceDebuggingEnabled()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isGeofenceDebuggingEnabled:Z

    return v0
.end method

.method public isStethoEnabled()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isStethoEnabled:Z

    return v0
.end method

.method public isUpgradeNoticeIgnorable()Z
    .locals 1

    .line 14
    iget-boolean v0, p0, Lcom/ibotta/android/profile/ReleaseBuildProfile;->isUpgradeNoticeIgnorable:Z

    return v0
.end method

.method public shouldAllowFeatureFlagOverrides()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldCheckForPushFramework()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public shouldDebugCacheClearing()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
