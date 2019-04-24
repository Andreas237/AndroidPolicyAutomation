.class Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;
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
    name = "ConnectionCallbacksForGeoFenceRegistration"
.end annotation


# instance fields
.field final geoFencesToRegister:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation
.end field

.field final geofencingRequest:Lcom/google/android/gms/location/GeofencingRequest;

.field final pendingIntent:Landroid/app/PendingIntent;

.field final synthetic this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/GeofencingRequest;",
            "Landroid/app/PendingIntent;",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;)V"
        }
    .end annotation

    .line 390
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 391
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->geofencingRequest:Lcom/google/android/gms/location/GeofencingRequest;

    .line 392
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->pendingIntent:Landroid/app/PendingIntent;

    .line 393
    iput-object p4, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->geoFencesToRegister:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;)V
    .locals 0

    .line 380
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 8

    const/4 p1, 0x0

    .line 400
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 401
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "GeoFenceRegistrationManager.registerGeoFences() Google API Client connected"

    new-array v4, p1, [Ljava/lang/Object;

    .line 400
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 403
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->geofencingRequest:Lcom/google/android/gms/location/GeofencingRequest;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->pendingIntent:Landroid/app/PendingIntent;

    iget-object v3, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->geoFencesToRegister:Ljava/util/List;

    invoke-static {v0, v1, v2, v3}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$200(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    :try_start_1
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

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

    .line 406
    :try_start_2
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v1, v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$300(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 409
    :try_start_3
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$400(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v4, v0

    .line 411
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

    .line 409
    :goto_1
    :try_start_4
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceRegistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$400(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    move-object v5, v1

    .line 411
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

    .line 413
    :goto_2
    throw v0
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
