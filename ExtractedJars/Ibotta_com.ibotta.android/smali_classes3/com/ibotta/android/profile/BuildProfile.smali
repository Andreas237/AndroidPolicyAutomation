.class public interface abstract Lcom/ibotta/android/profile/BuildProfile;
.super Ljava/lang/Object;
.source "BuildProfile.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u001a\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010)\u001a\u00020\u0013H&J\u0008\u0010*\u001a\u00020\u0013H&J\u0008\u0010+\u001a\u00020\u0013H&J\u0008\u0010,\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0012\u0010\u000c\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0014R\u0012\u0010\u0016\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0014R\u0012\u0010\u0017\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0014R\u0012\u0010\u0018\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0014R\u0012\u0010\u0019\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0014R\u0012\u0010\u001a\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0014R\u0012\u0010\u001b\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0014R\u0012\u0010\u001c\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0014R\u0012\u0010\u001d\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0014R\u0012\u0010\u001e\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0014R\u0012\u0010\u001f\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0014R\u0012\u0010 \u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0014R\u0012\u0010!\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0014R\u0012\u0010\"\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0014R\u0012\u0010#\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u0014R\u0012\u0010$\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0014R\u0012\u0010%\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0014R\u0012\u0010&\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\u0014R\u0012\u0010\'\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\t\u00a8\u0006-"
    }
    d2 = {
        "Lcom/ibotta/android/profile/BuildProfile;",
        "",
        "apiUrl",
        "",
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
        "displayableAppBuildNumber",
        "getDisplayableAppBuildNumber",
        "displayableAppVersion",
        "getDisplayableAppVersion",
        "isAopFailHard",
        "",
        "()Z",
        "isApiLayerInDebugMode",
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
        "isFeatureFlagInAppConfigMandatory",
        "isGeofenceDebuggingEnabled",
        "isStethoEnabled",
        "isUpgradeNoticeIgnorable",
        "maxCardsPerRow",
        "getMaxCardsPerRow",
        "shouldAllowApiUrlOverride",
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


# virtual methods
.method public abstract getApiUrl()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getAppVersionCode()I
.end method

.method public abstract getAppVersionName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getAppVersionSuffix()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getDisplayableAppBuildNumber()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getDisplayableAppVersion()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMaxCardsPerRow()I
.end method

.method public abstract isAopFailHard()Z
.end method

.method public abstract isApiLayerInDebugMode()Z
.end method

.method public abstract isDebugApolloLogging()Z
.end method

.method public abstract isDebugAppsFlyer()Z
.end method

.method public abstract isDebugButtonSdkLogging()Z
.end method

.method public abstract isDebugCamera()Z
.end method

.method public abstract isDebugHttpHeaders()Z
.end method

.method public abstract isDebugInternalTracking()Z
.end method

.method public abstract isDebugLaunchDarkly()Z
.end method

.method public abstract isDebugLoadingAllowed()Z
.end method

.method public abstract isDebugMenuAvailable()Z
.end method

.method public abstract isDebugPixelTracking()Z
.end method

.method public abstract isDebugRadar()Z
.end method

.method public abstract isDebugReceiptCapture()Z
.end method

.method public abstract isDebugTrackingQueue()Z
.end method

.method public abstract isFeatureFlagInAppConfigMandatory()Z
.end method

.method public abstract isGeofenceDebuggingEnabled()Z
.end method

.method public abstract isStethoEnabled()Z
.end method

.method public abstract isUpgradeNoticeIgnorable()Z
.end method

.method public abstract shouldAllowApiUrlOverride()Z
.end method

.method public abstract shouldAllowFeatureFlagOverrides()Z
.end method

.method public abstract shouldCheckForPushFramework()Z
.end method

.method public abstract shouldDebugCacheClearing()Z
.end method
