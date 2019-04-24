.class Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;
.super Ljava/lang/Object;
.source "GeoFenceRegistrationManager.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ConnectionCallbacksForGeoFenceUnregistration"
.end annotation


# instance fields
.field final geoFenceIdsToUnregister:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 435
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 436
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->geoFenceIdsToUnregister:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/util/List;Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;)V
    .locals 0

    .line 431
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 8

    const/4 p1, 0x0

    .line 444
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$600(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/location/GeofencingApi;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$400(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->geoFenceIdsToUnregister:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/location/GeofencingApi;->removeGeofences(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;)V

    .line 445
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 460
    :try_start_1
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$400(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 457
    :try_start_2
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v1, v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$300(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 460
    :try_start_3
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$400(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v4, v0

    .line 462
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "GoogleApiClient.unregisterConnectionCallbacks() failed"

    new-array v6, p1, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    .line 460
    :goto_1
    :try_start_4
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$400(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    move-object v5, v1

    .line 462
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    new-array v7, p1, [Ljava/lang/Object;

    const-string v6, "GoogleApiClient.unregisterConnectionCallbacks() failed"

    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    :goto_2
    throw v0
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
