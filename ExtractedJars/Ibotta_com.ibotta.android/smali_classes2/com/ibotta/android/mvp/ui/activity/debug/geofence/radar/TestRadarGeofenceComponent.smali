.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceComponent;
.super Ljava/lang/Object;
.source "TestRadarGeofenceComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpComponent;


# annotations
.annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
.end annotation

.annotation runtime Ldagger/Component;
    dependencies = {
        Lcom/ibotta/android/di/MainComponent;
    }
    modules = {
        Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceView;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofencePresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/debug/geofence/radar/TestRadarGeofenceActivity;)V
.end method
