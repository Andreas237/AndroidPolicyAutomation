.class public final Lcom/ibotta/android/crash/CrashlyticsCrashManager;
.super Lcom/ibotta/android/crash/CrashManager;
.source "CrashlyticsCrashManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/crash/CrashlyticsCrashManager;",
        "Lcom/ibotta/android/crash/CrashManager;",
        "crashKeys",
        "Lcom/ibotta/android/crash/CrashKeys;",
        "buildTypes",
        "",
        "Lcom/ibotta/android/profile/BuildType;",
        "(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V",
        "register",
        "",
        "context",
        "Landroid/content/Context;",
        "ibotta-crash_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/crash/CrashKeys;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/crash/CrashKeys;",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/profile/BuildType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "crashKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/crash/CrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public register(Landroid/content/Context;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 19
    invoke-super {p0, p1}, Lcom/ibotta/android/crash/CrashManager;->register(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/crash/CrashlyticsCrashManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/crash/CrashlyticsCrashManager;->getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/ibotta/android/crash/CrashKeyType;->TWITTER_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashKeys;->getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 24
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/crash/CrashlyticsCrashManager;->getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/crash/CrashKeyType;->TWITTER_SECRET:Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashKeys;->getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 26
    :cond_3
    new-instance v2, Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    invoke-direct {v2, v0, v1}, Lcom/twitter/sdk/android/core/TwitterAuthConfig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 27
    new-array v0, v0, [Lio/fabric/sdk/android/Kit;

    const/4 v1, 0x0

    new-instance v3, Lcom/twitter/sdk/android/core/TwitterCore;

    invoke-direct {v3, v2}, Lcom/twitter/sdk/android/core/TwitterCore;-><init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;)V

    check-cast v3, Lio/fabric/sdk/android/Kit;

    aput-object v3, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/crashlytics/android/Crashlytics;

    invoke-direct {v2}, Lcom/crashlytics/android/Crashlytics;-><init>()V

    check-cast v2, Lio/fabric/sdk/android/Kit;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    new-instance v2, Lcom/crashlytics/android/ndk/CrashlyticsNdk;

    invoke-direct {v2}, Lcom/crashlytics/android/ndk/CrashlyticsNdk;-><init>()V

    check-cast v2, Lio/fabric/sdk/android/Kit;

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Lio/fabric/sdk/android/Fabric;->with(Landroid/content/Context;[Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric;

    return-void
.end method
