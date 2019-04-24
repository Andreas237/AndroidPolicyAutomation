.class public final synthetic Lcom/ibotta/android/api/mvt/-$$Lambda$y0JTwvtLE_vcPtRBTfP-MCqW5tA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/location/geofence/GeofenceCoordinator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/api/mvt/-$$Lambda$y0JTwvtLE_vcPtRBTfP-MCqW5tA;->f$0:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/api/mvt/-$$Lambda$y0JTwvtLE_vcPtRBTfP-MCqW5tA;->f$0:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-interface {v0}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onSettingChange()V

    return-void
.end method
