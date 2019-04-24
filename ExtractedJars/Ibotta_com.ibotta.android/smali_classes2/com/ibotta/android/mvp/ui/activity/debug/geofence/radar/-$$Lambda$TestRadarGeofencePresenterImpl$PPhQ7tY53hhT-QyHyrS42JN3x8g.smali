.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$PPhQ7tY53hhT-QyHyrS42JN3x8g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$PPhQ7tY53hhT-QyHyrS42JN3x8g;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/-$$Lambda$TestRadarGeofencePresenterImpl$PPhQ7tY53hhT-QyHyrS42JN3x8g;->f$0:Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;

    check-cast p1, Lio/radar/sdk/model/RadarEvent;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;->lambda$PPhQ7tY53hhT-QyHyrS42JN3x8g(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenterImpl;Lio/radar/sdk/model/RadarEvent;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method
