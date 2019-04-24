.class public final Lcom/ibotta/android/crash/NewRelicCrashManager;
.super Lcom/ibotta/android/crash/CrashManager;
.source "NewRelicCrashManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J,\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/crash/NewRelicCrashManager;",
        "Lcom/ibotta/android/crash/CrashManager;",
        "crashKeys",
        "Lcom/ibotta/android/crash/CrashKeys;",
        "enabledBuildTypes",
        "",
        "Lcom/ibotta/android/profile/BuildType;",
        "(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V",
        "register",
        "",
        "context",
        "Landroid/content/Context;",
        "trackBreadcrumb",
        "eventType",
        "",
        "name",
        "extras",
        "",
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

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/crash/CrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public register(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 18
    invoke-super {p0, p1}, Lcom/ibotta/android/crash/CrashManager;->register(Landroid/content/Context;)V

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/crash/NewRelicCrashManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/crash/NewRelicCrashManager;->getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    sget-object v1, Lcom/ibotta/android/crash/CrashKeyType;->NEW_RELIC_APP_TOKEN:Lcom/ibotta/android/crash/CrashKeyType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashKeys;->getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 24
    :cond_2
    invoke-static {v0}, Lcom/newrelic/agent/android/NewRelic;->withApplicationToken(Ljava/lang/String;)Lcom/newrelic/agent/android/NewRelic;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/NewRelic;->start(Landroid/content/Context;)V

    return-void
.end method

.method public trackBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/crash/NewRelicCrashManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 30
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/crash/CrashManager;->trackBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 31
    invoke-static {p1, p2, p3}, Lcom/newrelic/agent/android/NewRelic;->recordCustomEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z

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

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/crash/NewRelicCrashManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 37
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 38
    instance-of v0, p1, Ljava/lang/Exception;

    if-eqz v0, :cond_1

    .line 39
    check-cast p1, Ljava/lang/Exception;

    invoke-static {p1}, Lcom/newrelic/agent/android/NewRelic;->recordHandledException(Ljava/lang/Exception;)Z

    :cond_1
    return-void
.end method
