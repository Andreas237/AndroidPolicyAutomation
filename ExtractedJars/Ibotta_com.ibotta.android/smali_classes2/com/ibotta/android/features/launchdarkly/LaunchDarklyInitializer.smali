.class public final Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;
.super Ljava/lang/Object;
.source "LaunchDarklyInitializer.kt"

# interfaces
.implements Lcom/ibotta/android/features/FlagsInitializer;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008H\u0016J\u0008\u0010\u000e\u001a\u00020\u000cH\u0016J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008H\u0016J\u0010\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;",
        "Lcom/ibotta/android/features/FlagsInitializer;",
        "app",
        "Landroid/app/Application;",
        "launchDarklyKey",
        "",
        "(Landroid/app/Application;Ljava/lang/String;)V",
        "lastSeenFlagsUser",
        "Lcom/ibotta/android/features/FlagsUser;",
        "ldConfig",
        "Lcom/launchdarkly/android/LDConfig;",
        "initUser",
        "",
        "flagsUser",
        "isInitialized",
        "reInitUser",
        "userIsInitialized",
        "ibotta-features-kotlin_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final app:Landroid/app/Application;

.field private lastSeenFlagsUser:Lcom/ibotta/android/features/FlagsUser;

.field private final ldConfig:Lcom/launchdarkly/android/LDConfig;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchDarklyKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->app:Landroid/app/Application;

    .line 33
    new-instance p1, Lcom/launchdarkly/android/LDConfig$Builder;

    invoke-direct {p1}, Lcom/launchdarkly/android/LDConfig$Builder;-><init>()V

    .line 34
    invoke-virtual {p1, p2}, Lcom/launchdarkly/android/LDConfig$Builder;->setMobileKey(Ljava/lang/String;)Lcom/launchdarkly/android/LDConfig$Builder;

    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDConfig$Builder;->build()Lcom/launchdarkly/android/LDConfig;

    move-result-object p1

    const-string p2, "LDConfig.Builder()\n     \u2026rklyKey)\n        .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->ldConfig:Lcom/launchdarkly/android/LDConfig;

    return-void
.end method


# virtual methods
.method public initUser(Lcom/ibotta/android/features/FlagsUser;)Z
    .locals 5
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "flagsUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 40
    :try_start_0
    invoke-static {p1}, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializerKt;->access$mapFlagsUserToLaunchDarklyUser(Lcom/ibotta/android/features/FlagsUser;)Lcom/launchdarkly/android/LDUser;

    move-result-object v1

    .line 41
    iget-object v2, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->app:Landroid/app/Application;

    iget-object v3, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->ldConfig:Lcom/launchdarkly/android/LDConfig;

    invoke-static {v2, v3, v1}, Lcom/launchdarkly/android/LDClient;->init(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;

    move-result-object v1

    const-wide/16 v2, 0x5

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setup LaunchDarkly client success - flagsUser: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->lastSeenFlagsUser:Lcom/ibotta/android/features/FlagsUser;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v1

    .line 46
    check-cast v1, Ljava/lang/Throwable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setup LaunchDarkly client failed - flagsUser: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method

.method public isInitialized()Z
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->lastSeenFlagsUser:Lcom/ibotta/android/features/FlagsUser;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public reInitUser(Lcom/ibotta/android/features/FlagsUser;)Z
    .locals 5
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "flagsUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 53
    :try_start_0
    invoke-static {p1}, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializerKt;->access$mapFlagsUserToLaunchDarklyUser(Lcom/ibotta/android/features/FlagsUser;)Lcom/launchdarkly/android/LDUser;

    move-result-object v1

    .line 54
    invoke-static {}, Lcom/launchdarkly/android/LDClient;->get()Lcom/launchdarkly/android/LDClient;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/launchdarkly/android/LDClient;->identify(Lcom/launchdarkly/android/LDUser;)Ljava/util/concurrent/Future;

    move-result-object v1

    if-eqz v1, :cond_0

    const-wide/16 v2, 0x5

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Void;

    .line 55
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "identify LaunchDarkly user success - flagsUser: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->lastSeenFlagsUser:Lcom/ibotta/android/features/FlagsUser;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v1

    .line 59
    check-cast v1, Ljava/lang/Throwable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "identify LaunchDarkly client failed - flagsUser: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method

.method public userIsInitialized(Lcom/ibotta/android/features/FlagsUser;)Z
    .locals 1
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "flagsUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializer;->lastSeenFlagsUser:Lcom/ibotta/android/features/FlagsUser;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
