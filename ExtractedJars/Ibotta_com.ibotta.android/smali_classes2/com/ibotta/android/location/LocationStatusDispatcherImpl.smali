.class public final Lcom/ibotta/android/location/LocationStatusDispatcherImpl;
.super Ljava/lang/Object;
.source "LocationStatusDispatcherImpl.kt"

# interfaces
.implements Lcom/ibotta/android/location/LocationStatusDispatcher;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLocationStatusDispatcherImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationStatusDispatcherImpl.kt\ncom/ibotta/android/location/LocationStatusDispatcherImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1574#2,2:47\n1574#2,2:49\n*E\n*S KotlinDebug\n*F\n+ 1 LocationStatusDispatcherImpl.kt\ncom/ibotta/android/location/LocationStatusDispatcherImpl\n*L\n25#1,2:47\n37#1,2:49\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/location/LocationStatusDispatcherImpl;",
        "Lcom/ibotta/android/location/LocationStatusDispatcher;",
        "()V",
        "listeners",
        "Ljava/util/ArrayList;",
        "Lcom/ibotta/android/location/LocationStatusListener;",
        "addListener",
        "",
        "listener",
        "onLocationChanged",
        "location",
        "Landroid/location/Location;",
        "onLocationStatusChanged",
        "locationEnabled",
        "",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final listeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/android/location/LocationStatusListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/location/LocationStatusDispatcherImpl;->listeners:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public addListener(Lcom/ibotta/android/location/LocationStatusListener;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/location/LocationStatusListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/location/LocationStatusDispatcherImpl;->listeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 6
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/location/LocationStatusDispatcherImpl;->listeners:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 47
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/location/LocationStatusListener;

    .line 27
    :try_start_0
    invoke-interface {v1, p1}, Lcom/ibotta/android/location/LocationStatusListener;->onLocationChanged(Landroid/location/Location;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 29
    check-cast v2, Ljava/lang/Throwable;

    const-string v3, "Failed to send location changed event to: %1$s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onLocationStatusChanged(Z)V
    .locals 6
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/location/LocationStatusDispatcherImpl;->listeners:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/location/LocationStatusListener;

    .line 39
    :try_start_0
    invoke-interface {v1, p1}, Lcom/ibotta/android/location/LocationStatusListener;->onLocationStatusChanged(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 41
    check-cast v2, Ljava/lang/Throwable;

    const-string v3, "Failed to send location status event to: %1$s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method
