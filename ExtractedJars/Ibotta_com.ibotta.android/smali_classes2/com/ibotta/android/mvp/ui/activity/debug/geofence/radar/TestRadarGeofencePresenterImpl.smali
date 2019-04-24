.class public Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "TestRadarGeofencePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;"
    }
.end annotation


# instance fields
.field private final debugState:Lcom/ibotta/android/state/app/debug/DebugState;

.field private final geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

.field private isLoading:Z

.field private radarCallback:Lio/radar/sdk/Radar$RadarCallback;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->isLoading:Z

    .line 121
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$pxaAUNLluKa4cfmVPVZCZ5nLC54;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$pxaAUNLluKa4cfmVPVZCZ5nLC54;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->radarCallback:Lio/radar/sdk/Radar$RadarCallback;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    return-void
.end method

.method public static synthetic lambda$PPhQ7tY53hhT-QyHyrS42JN3x8g(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;Lio/radar/sdk/model/RadarEvent;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->radarEventToDebugString(Lio/radar/sdk/model/RadarEvent;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$new$0(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .locals 0

    .line 122
    invoke-direct {p0, p1, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->radarCallbackInfoToString(Lio/radar/sdk/Radar$RadarStatus;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)Ljava/lang/String;

    move-result-object p1

    .line 123
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;->showTrackOnceInfo(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 125
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->isLoading:Z

    .line 126
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;->showLoading(Z)V

    return-void
.end method

.method private radarCallbackInfoToString(Lio/radar/sdk/Radar$RadarStatus;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)Ljava/lang/String;
    .locals 3
    .param p1    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Lio/radar/sdk/model/RadarEvent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/model/RadarUser;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_0

    .line 77
    array-length v1, p2

    if-lez v1, :cond_0

    .line 78
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$PPhQ7tY53hhT-QyHyrS42JN3x8g;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$PPhQ7tY53hhT-QyHyrS42JN3x8g;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;)V

    .line 79
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p2

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$hJaOOee1qUH_tSxfAw_b3-lndRM;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$hJaOOee1qUH_tSxfAw_b3-lndRM;-><init>(Ljava/lang/StringBuilder;)V

    .line 80
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    goto :goto_0

    :cond_0
    const-string p2, "No Events"

    .line 82
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    :goto_0
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->radarUserToDebugString(Lio/radar/sdk/model/RadarUser;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Status: %1$s\nRadarEvents: %2$s\nRadarUser: %3$s"

    const/4 v1, 0x3

    .line 87
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, p1

    const/4 p1, 0x2

    aput-object p2, v1, p1

    .line 87
    invoke-static {p3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private radarEventToDebugString(Lio/radar/sdk/model/RadarEvent;)Ljava/lang/String;
    .locals 3

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarEvent;->getType()Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-result-object v1

    invoke-virtual {v1}, Lio/radar/sdk/model/RadarEvent$RadarEventType;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "EventType:"

    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "unknown"

    .line 101
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarEvent;->getPlace()Lio/radar/sdk/model/RadarPlace;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 102
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarEvent;->getPlace()Lio/radar/sdk/model/RadarPlace;

    move-result-object p1

    invoke-virtual {p1}, Lio/radar/sdk/model/RadarPlace;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string p1, "Place:"

    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ";"

    .line 106
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private radarUserToDebugString(Lio/radar/sdk/model/RadarUser;)Ljava/lang/String;
    .locals 1
    .param p1    # Lio/radar/sdk/model/RadarUser;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "unknown"

    if-eqz p1, :cond_0

    .line 115
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarUser;->getUserId()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public onDetach()V
    .locals 1

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->radarCallback:Lio/radar/sdk/Radar$RadarCallback;

    .line 69
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onDetach()V

    return-void
.end method

.method public onRadarEnableTestNotificationsTapped(Z)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveIsRadarTestNotificationsOn(Z)V

    return-void
.end method

.method public onRadarTrackOnceTapped()V
    .locals 2

    .line 45
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->isLoading:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->isLoading:Z

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;->showLoading(Z)V

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->radarCallback:Lio/radar/sdk/Radar$RadarCallback;

    invoke-static {v0}, Lio/radar/sdk/Radar;->trackOnce(Lio/radar/sdk/Radar$RadarCallback;)V

    return-void
.end method

.method public onRadarUseTestApiTapped(Z)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveUseRadarTestApi(Z)V

    .line 58
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-interface {p1}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onSettingChange()V

    return-void
.end method

.method public onViewsBound()V
    .locals 2

    .line 38
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onViewsBound()V

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->useRadarTestApi()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;->showUseTestApi(Z)V

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->isRadarTestNotificationsOn()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;->showEnableTestNotifications(Z)V

    return-void
.end method
