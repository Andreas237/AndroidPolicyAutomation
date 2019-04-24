.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$pxaAUNLluKa4cfmVPVZCZ5nLC54;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/radar/sdk/Radar$RadarCallback;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$pxaAUNLluKa4cfmVPVZCZ5nLC54;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;

    return-void
.end method


# virtual methods
.method public final onComplete(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$pxaAUNLluKa4cfmVPVZCZ5nLC54;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->lambda$new$0(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    return-void
.end method
