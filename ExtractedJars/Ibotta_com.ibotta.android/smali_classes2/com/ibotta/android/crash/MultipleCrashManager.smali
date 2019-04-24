.class public final Lcom/ibotta/android/crash/MultipleCrashManager;
.super Lcom/ibotta/android/crash/CrashManager;
.source "MultipleCrashManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultipleCrashManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleCrashManager.kt\ncom/ibotta/android/crash/MultipleCrashManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1574#2,2:40\n1574#2,2:42\n1574#2,2:44\n1574#2,2:46\n*E\n*S KotlinDebug\n*F\n+ 1 MultipleCrashManager.kt\ncom/ibotta/android/crash/MultipleCrashManager\n*L\n22#1,2:40\n27#1,2:42\n32#1,2:44\n37#1,2:46\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0008J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J,\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/ibotta/android/crash/MultipleCrashManager;",
        "Lcom/ibotta/android/crash/CrashManager;",
        "keys",
        "Lcom/ibotta/android/crash/CrashKeys;",
        "enabledBuildTypes",
        "",
        "Lcom/ibotta/android/profile/BuildType;",
        "crashManagers",
        "(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;Ljava/util/Set;)V",
        "register",
        "",
        "context",
        "Landroid/content/Context;",
        "registerUpdateManager",
        "activity",
        "Landroid/app/Activity;",
        "shouldIgnoreUpdates",
        "",
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
.field private final crashManagers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/crash/CrashManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/crash/CrashKeys;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Set;
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
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/crash/CrashManager;",
            ">;)V"
        }
    .end annotation

    const-string v0, "keys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledBuildTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashManagers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/crash/CrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    iput-object p3, p0, Lcom/ibotta/android/crash/MultipleCrashManager;->crashManagers:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public register(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 21
    invoke-super {p0, p1}, Lcom/ibotta/android/crash/CrashManager;->register(Landroid/content/Context;)V

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/crash/MultipleCrashManager;->crashManagers:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/crash/CrashManager;

    .line 22
    invoke-virtual {v1, p1}, Lcom/ibotta/android/crash/CrashManager;->register(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public registerUpdateManager(Landroid/app/Activity;Z)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/crash/CrashManager;->registerUpdateManager(Landroid/app/Activity;Z)V

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/crash/MultipleCrashManager;->crashManagers:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/crash/CrashManager;

    .line 27
    invoke-virtual {v1, p1, p2}, Lcom/ibotta/android/crash/CrashManager;->registerUpdateManager(Landroid/app/Activity;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
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

    .line 31
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/crash/CrashManager;->trackBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/crash/MultipleCrashManager;->crashManagers:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/crash/CrashManager;

    .line 32
    invoke-virtual {v1, p1, p2, p3}, Lcom/ibotta/android/crash/CrashManager;->trackBreadcrumb(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public trackException(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-super {p0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/crash/MultipleCrashManager;->crashManagers:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    .line 46
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/crash/CrashManager;

    .line 37
    invoke-virtual {v1, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method
