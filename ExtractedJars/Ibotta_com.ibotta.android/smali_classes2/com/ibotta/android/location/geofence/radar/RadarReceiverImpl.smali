.class public final Lcom/ibotta/android/location/geofence/radar/RadarReceiverImpl;
.super Lio/radar/sdk/RadarReceiver;
.source "RadarReceiverImpl.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/radar/RadarReceiverImpl;",
        "Lio/radar/sdk/RadarReceiver;",
        "()V",
        "radarReceiverDelegate",
        "Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;",
        "onError",
        "",
        "context",
        "Landroid/content/Context;",
        "status",
        "Lio/radar/sdk/Radar$RadarStatus;",
        "onEventsReceived",
        "events",
        "",
        "Lio/radar/sdk/model/RadarEvent;",
        "user",
        "Lio/radar/sdk/model/RadarUser;",
        "(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V",
        "onLocationUpdated",
        "location",
        "Landroid/location/Location;",
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
.field private final radarReceiverDelegate:Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lio/radar/sdk/RadarReceiver;-><init>()V

    .line 15
    new-instance v0, Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;

    invoke-direct {v0}, Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarReceiverImpl;->radarReceiverDelegate:Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;

    return-void
.end method


# virtual methods
.method public onError(Landroid/content/Context;Lio/radar/sdk/Radar$RadarStatus;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "status"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object p1, p0, Lcom/ibotta/android/location/geofence/radar/RadarReceiverImpl;->radarReceiverDelegate:Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;

    sget-object v0, Lcom/ibotta/android/location/geofence/GeofenceModule;->INSTANCE:Lcom/ibotta/android/location/geofence/GeofenceModule;

    invoke-virtual {v0}, Lcom/ibotta/android/location/geofence/GeofenceModule;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v0, p2, v1}, Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;->onError(Lcom/ibotta/android/state/user/UserState;Lio/radar/sdk/Radar$RadarStatus;Lcom/ibotta/android/crash/CrashManager;)V

    return-void
.end method

.method public onEventsReceived(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Lio/radar/sdk/model/RadarEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "events"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/RadarReceiverImpl;->radarReceiverDelegate:Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;

    sget-object v1, Lcom/ibotta/android/location/geofence/GeofenceModule;->INSTANCE:Lcom/ibotta/android/location/geofence/GeofenceModule;

    invoke-virtual {v1}, Lcom/ibotta/android/location/geofence/GeofenceModule;->getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;->onEventsReceived(Lcom/ibotta/android/state/app/debug/DebugState;Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    return-void
.end method

.method public onLocationUpdated(Landroid/content/Context;Landroid/location/Location;Lio/radar/sdk/model/RadarUser;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "user"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Lcom/ibotta/android/location/geofence/radar/RadarReceiverImpl;->radarReceiverDelegate:Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;

    invoke-virtual {p1, p3}, Lcom/ibotta/android/location/geofence/radar/RadarReceiverDelegate;->onLocationUpdated(Lio/radar/sdk/model/RadarUser;)V

    return-void
.end method
