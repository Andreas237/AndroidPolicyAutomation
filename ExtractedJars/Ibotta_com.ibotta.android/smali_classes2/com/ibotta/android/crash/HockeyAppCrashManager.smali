.class public final Lcom/ibotta/android/crash/HockeyAppCrashManager;
.super Lcom/ibotta/android/crash/CrashManager;
.source "HockeyAppCrashManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHockeyAppCrashManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HockeyAppCrashManager.kt\ncom/ibotta/android/crash/HockeyAppCrashManager\n*L\n1#1,99:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/crash/HockeyAppCrashManager;",
        "Lcom/ibotta/android/crash/CrashManager;",
        "crashKeys",
        "Lcom/ibotta/android/crash/CrashKeys;",
        "enabledBuildTypes",
        "",
        "Lcom/ibotta/android/profile/BuildType;",
        "(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V",
        "hockeyAppId",
        "",
        "getHockeyAppId",
        "()Ljava/lang/String;",
        "register",
        "",
        "context",
        "Landroid/content/Context;",
        "registerUpdateManager",
        "activity",
        "Landroid/app/Activity;",
        "shouldIgnoreUpdates",
        "",
        "trackException",
        "t",
        "",
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

    const-string v0, "enabledBuildTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/crash/CrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    return-void
.end method

.method private final getHockeyAppId()Ljava/lang/String;
    .locals 5

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HockeyApp initialization for: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    sget-object v1, Lcom/ibotta/android/profile/BuildType;->Companion:Lcom/ibotta/android/profile/BuildType$Companion;

    invoke-virtual {v1}, Lcom/ibotta/android/profile/BuildType$Companion;->fromBuildConfig()Lcom/ibotta/android/profile/BuildType;

    move-result-object v1

    .line 27
    sget-object v2, Lcom/ibotta/android/crash/HockeyAppCrashManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/ibotta/android/profile/BuildType;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 50
    :pswitch_0
    invoke-virtual {v1}, Lcom/ibotta/android/profile/BuildType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_ALPHA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashKeys;->getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 43
    :pswitch_1
    invoke-virtual {v1}, Lcom/ibotta/android/profile/BuildType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", GOOGLE PLAY"

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_RELEASE_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashKeys;->getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 36
    :pswitch_2
    invoke-virtual {v1}, Lcom/ibotta/android/profile/BuildType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", GOOGLE PLAY"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_BETA_EXT_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashKeys;->getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 29
    :pswitch_3
    invoke-virtual {v1}, Lcom/ibotta/android/profile/BuildType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", GOOGLE PLAY"

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lcom/ibotta/android/crash/CrashKeyType;->HOCKEY_APP_BETA_KEY:Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashKeys;->getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;

    move-result-object v3

    :cond_0
    :goto_0
    const-string v1, "HockeyApp ID: %1$s"

    const/4 v2, 0x1

    .line 57
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public register(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/crash/CrashManager;->register(Landroid/content/Context;)V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 68
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->getHockeyAppId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 71
    new-instance v1, Lcom/ibotta/android/crash/HockeyAppCrashManager$register$1$1;

    invoke-direct {v1}, Lcom/ibotta/android/crash/HockeyAppCrashManager$register$1$1;-><init>()V

    check-cast v1, Lnet/hockeyapp/android/CrashManagerListener;

    invoke-static {p1, v0, v1}, Lnet/hockeyapp/android/CrashManager;->register(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/CrashManagerListener;)V

    :cond_1
    return-void
.end method

.method public registerUpdateManager(Landroid/app/Activity;Z)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 80
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/crash/CrashManager;->registerUpdateManager(Landroid/app/Activity;Z)V

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->getHockeyAppId()Ljava/lang/String;

    move-result-object p2

    .line 85
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_1

    .line 86
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-static {p1, p2}, Lnet/hockeyapp/android/UpdateManager;->register(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public trackException(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/crash/HockeyAppCrashManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 93
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method
