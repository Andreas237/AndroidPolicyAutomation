.class public final Lio/streamroot/dna/core/system/SystemInformationService;
.super Ljava/lang/Object;
.source "SystemInformationService.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSystemInformationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemInformationService.kt\nio/streamroot/dna/core/system/SystemInformationService\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,97:1\n1096#2,2:98\n*E\n*S KotlinDebug\n*F\n+ 1 SystemInformationService.kt\nio/streamroot/dna/core/system/SystemInformationService\n*L\n74#1,2:98\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u0019\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\n0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000cR\u0019\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\n0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000cR\u0019\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\n0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000cR\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\nX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u000cR\u0019\u0010\u001c\u001a\n \u0010*\u0004\u0018\u00010\n0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lio/streamroot/dna/core/system/SystemInformationService;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "packageInfo",
        "Landroid/content/pm/PackageInfo;",
        "(Landroid/content/pm/PackageInfo;)V",
        "applicationBuild",
        "",
        "getApplicationBuild",
        "()I",
        "applicationBundleId",
        "",
        "getApplicationBundleId",
        "()Ljava/lang/String;",
        "applicationVersion",
        "getApplicationVersion",
        "deviceBrand",
        "kotlin.jvm.PlatformType",
        "getDeviceBrand",
        "deviceCPU",
        "getDeviceCPU",
        "deviceModel",
        "getDeviceModel",
        "isEmulator",
        "",
        "()Z",
        "isOsRooted",
        "osName",
        "getOsName",
        "osVersion",
        "getOsVersion",
        "appendSupportAnalytics",
        "",
        "supportPayload",
        "Lorg/json/JSONObject;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final deviceBrand:Ljava/lang/String;

.field private final deviceCPU:Ljava/lang/String;

.field private final deviceModel:Ljava/lang/String;

.field private final osName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final osVersion:Ljava/lang/String;

.field private final packageInfo:Landroid/content/pm/PackageInfo;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageInfo;)V
    .locals 1
    .param p1    # Landroid/content/pm/PackageInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "packageInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/system/SystemInformationService;->packageInfo:Landroid/content/pm/PackageInfo;

    .line 25
    sget-object p1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    iput-object p1, p0, Lio/streamroot/dna/core/system/SystemInformationService;->deviceBrand:Ljava/lang/String;

    .line 27
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object p1, p0, Lio/streamroot/dna/core/system/SystemInformationService;->deviceModel:Ljava/lang/String;

    .line 29
    sget-object p1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    iput-object p1, p0, Lio/streamroot/dna/core/system/SystemInformationService;->deviceCPU:Ljava/lang/String;

    const-string p1, "android"

    .line 48
    iput-object p1, p0, Lio/streamroot/dna/core/system/SystemInformationService;->osName:Ljava/lang/String;

    .line 50
    sget-object p1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object p1, p0, Lio/streamroot/dna/core/system/SystemInformationService;->osVersion:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendStatsAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "native"

    .line 78
    new-instance v1, Lio/streamroot/dna/core/system/SystemInformationService$appendSupportAnalytics$1;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/system/SystemInformationService$appendSupportAnalytics$1;-><init>(Lio/streamroot/dna/core/system/SystemInformationService;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final getApplicationBuild()I
    .locals 1

    .line 19
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->packageInfo:Landroid/content/pm/PackageInfo;

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    return v0
.end method

.method public final getApplicationBundleId()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->packageInfo:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v1, "packageInfo.packageName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getApplicationVersion()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->packageInfo:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-string v1, "packageInfo.versionName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getDeviceBrand()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->deviceBrand:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeviceCPU()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->deviceCPU:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->deviceModel:Ljava/lang/String;

    return-object v0
.end method

.method public final getOsName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 48
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->osName:Ljava/lang/String;

    return-object v0
.end method

.method public final getOsVersion()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lio/streamroot/dna/core/system/SystemInformationService;->osVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final isEmulator()Z
    .locals 5

    const/4 v0, 0x0

    .line 34
    :try_start_0
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v2, "Build.FINGERPRINT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "generic"

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 35
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v2, "Build.FINGERPRINT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unknown"

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 36
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "Build.MODEL"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "google_sdk"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 37
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "Build.MODEL"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "Emulator"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 38
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "Build.MODEL"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "Android SDK built for x86"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 39
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "Build.MANUFACTURER"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "Genymotion"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 40
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v2, "Build.BRAND"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "generic"

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "Build.DEVICE"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "generic"

    invoke-static {v1, v2, v0, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "google_sdk"

    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :catch_0
    :cond_2
    return v0
.end method

.method public final isOsRooted()Z
    .locals 10

    .line 54
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    const-string v5, "android.os.Build.TAGS"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    const-string v5, "test-keys"

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v0, v5, v4, v2, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    const/16 v0, 0xf

    .line 58
    new-array v0, v0, [Ljava/lang/String;

    const-string v5, "/data/local/bin/su"

    aput-object v5, v0, v4

    const-string v5, "/data/local/su"

    aput-object v5, v0, v3

    const-string v5, "/data/local/xbin/su"

    aput-object v5, v0, v2

    const/4 v2, 0x3

    const-string v5, "/sbin/su"

    aput-object v5, v0, v2

    const/4 v2, 0x4

    const-string v5, "/su/bin"

    aput-object v5, v0, v2

    const/4 v2, 0x5

    const-string v5, "/su/bin/su"

    aput-object v5, v0, v2

    const/4 v2, 0x6

    const-string v5, "/system/app/SuperSU"

    aput-object v5, v0, v2

    const/4 v2, 0x7

    const-string v5, "/system/app/SuperSU.apk"

    aput-object v5, v0, v2

    const/16 v2, 0x8

    const-string v5, "/system/app/Superuser"

    aput-object v5, v0, v2

    const/16 v2, 0x9

    const-string v5, "/system/app/Superuser.apk"

    aput-object v5, v0, v2

    const/16 v2, 0xa

    const-string v5, "/system/bin/failsafe/su"

    aput-object v5, v0, v2

    const/16 v2, 0xb

    const-string v5, "/system/bin/su"

    aput-object v5, v0, v2

    const/16 v2, 0xc

    const-string v5, "/system/sd/xbin/su"

    aput-object v5, v0, v2

    const/16 v2, 0xd

    const-string v5, "/system/xbin/daemonsu"

    aput-object v5, v0, v2

    const/16 v2, 0xe

    const-string v5, "/system/xbin/su"

    aput-object v5, v0, v2

    .line 98
    array-length v2, v0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_3

    aget-object v6, v0, v5

    .line 74
    :try_start_0
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v7, p0

    check-cast v7, Lio/streamroot/dna/core/system/SystemInformationService;

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v7

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v7}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v7}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v7, v8

    :cond_1
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v1, v6

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move v3, v4

    :goto_3
    return v3
.end method

.method public priority()I
    .locals 1

    .line 11
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method
