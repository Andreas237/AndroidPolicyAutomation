.class public abstract Lcom/ibotta/android/crash/CrashManager;
.super Ljava/lang/Object;
.source "CrashManager.kt"

# interfaces
.implements Lcom/ibotta/api/ExceptionTracker;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0017J,\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u001cH\u0017J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000cR\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/ibotta/android/crash/CrashManager;",
        "Lcom/ibotta/api/ExceptionTracker;",
        "crashKeys",
        "Lcom/ibotta/android/crash/CrashKeys;",
        "enabledBuildTypes",
        "",
        "Lcom/ibotta/android/profile/BuildType;",
        "(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V",
        "getCrashKeys",
        "()Lcom/ibotta/android/crash/CrashKeys;",
        "isEnabled",
        "",
        "()Z",
        "registered",
        "checkRegistered",
        "",
        "register",
        "context",
        "Landroid/content/Context;",
        "registerUpdateManager",
        "activity",
        "Landroid/app/Activity;",
        "shouldIgnoreUpdates",
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


# instance fields
.field private final crashKeys:Lcom/ibotta/android/crash/CrashKeys;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final enabledBuildTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/profile/BuildType;",
            ">;"
        }
    .end annotation
.end field

.field private registered:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/crash/CrashKeys;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/Nullable;
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

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/crash/CrashManager;->crashKeys:Lcom/ibotta/android/crash/CrashKeys;

    iput-object p2, p0, Lcom/ibotta/android/crash/CrashManager;->enabledBuildTypes:Ljava/util/Set;

    return-void
.end method

.method private final checkRegistered()V
    .locals 2

    .line 36
    iget-boolean v0, p0, Lcom/ibotta/android/crash/CrashManager;->registered:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must call CrashManager#register before using"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method


# virtual methods
.method protected final getCrashKeys()Lcom/ibotta/android/crash/CrashKeys;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/crash/CrashManager;->crashKeys:Lcom/ibotta/android/crash/CrashKeys;

    return-object v0
.end method

.method protected final isEnabled()Z
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/crash/CrashManager;->enabledBuildTypes:Ljava/util/Set;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/ibotta/android/profile/BuildType;->Companion:Lcom/ibotta/android/profile/BuildType$Companion;

    invoke-virtual {v1}, Lcom/ibotta/android/profile/BuildType$Companion;->fromBuildConfig()Lcom/ibotta/android/profile/BuildType;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public register(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/ibotta/android/crash/CrashManager;->registered:Z

    return-void
.end method

.method public registerUpdateManager(Landroid/app/Activity;Z)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    const-string p2, "activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/crash/CrashManager;->checkRegistered()V

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

    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extras"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/crash/CrashManager;->checkRegistered()V

    return-void
.end method

.method public trackException(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/OverridingMethodsMustInvokeSuper;
    .end annotation

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/crash/CrashManager;->checkRegistered()V

    return-void
.end method
