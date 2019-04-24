.class public final Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;
.super Ljava/lang/Object;
.source "RadarReceiverDelegate.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ1\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;",
        "",
        "()V",
        "onError",
        "",
        "userState",
        "Lcom/ibotta/android/state/user/UserState;",
        "status",
        "Lio/radar/sdk/Radar$RadarStatus;",
        "crashManager",
        "Lcom/ibotta/android/crash/CrashManager;",
        "onEventsReceived",
        "debugState",
        "Lcom/ibotta/android/state/app/debug/DebugState;",
        "context",
        "Landroid/content/Context;",
        "events",
        "",
        "Lio/radar/sdk/model/RadarEvent;",
        "user",
        "Lio/radar/sdk/model/RadarUser;",
        "(Lcom/ibotta/android/state/app/debug/DebugState;Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V",
        "onLocationUpdated",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Lcom/ibotta/android/state/user/UserState;Lio/radar/sdk/Radar$RadarStatus;Lcom/ibotta/android/crash/CrashManager;)V
    .locals 4
    .param p1    # Lcom/ibotta/android/state/user/UserState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/crash/CrashManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "userState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError - status: %s"

    const/4 v1, 0x1

    .line 32
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    new-instance v0, Lcom/ibotta/android/location/geofence/radar/debug/RadarErrorFormatter;

    invoke-direct {v0}, Lcom/ibotta/android/location/geofence/radar/debug/RadarErrorFormatter;-><init>()V

    .line 35
    sget-object v2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_NETWORK:Lio/radar/sdk/Radar$RadarStatus;

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->hasEmployeeTesterRole()Z

    move-result p1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_2

    .line 39
    :cond_1
    invoke-virtual {v0, p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarErrorFormatter;->errorToException(Lio/radar/sdk/Radar$RadarStatus;)Ljava/lang/IllegalStateException;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p3, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public final onEventsReceived(Lcom/ibotta/android/state/app/debug/DebugState;Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .locals 4
    .param p1    # Lcom/ibotta/android/state/app/debug/DebugState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [Lio/radar/sdk/model/RadarEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "debugState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "events"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEventsReceived - radar user id: %s, ibotta user id: %s"

    const/4 v1, 0x2

    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p4}, Lio/radar/sdk/model/RadarUser;->getId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p4}, Lio/radar/sdk/model/RadarUser;->getUserId()Ljava/lang/String;

    move-result-object p4

    const/4 v2, 0x1

    aput-object p4, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    new-instance p4, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;

    invoke-direct {p4}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;-><init>()V

    .line 19
    invoke-interface {p1}, Lcom/ibotta/android/state/app/debug/DebugState;->isRadarTestNotificationsOn()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 20
    invoke-virtual {p4, p2, p3}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;->sendPushNotificationsForEvents(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;)V

    :cond_0
    return-void
.end method

.method public final onLocationUpdated(Lio/radar/sdk/model/RadarUser;)V
    .locals 4
    .param p1    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLocationUpdated - place: %s, radar user id: %s, ibotta user id: %s"

    const/4 v1, 0x3

    .line 25
    new-array v1, v1, [Ljava/lang/Object;

    .line 26
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarUser;->getPlace()Lio/radar/sdk/model/RadarPlace;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "unknown"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarUser;->getPlace()Lio/radar/sdk/model/RadarPlace;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/radar/sdk/model/RadarPlace;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    .line 27
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarUser;->getId()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    .line 28
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarUser;->getUserId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    .line 25
    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
