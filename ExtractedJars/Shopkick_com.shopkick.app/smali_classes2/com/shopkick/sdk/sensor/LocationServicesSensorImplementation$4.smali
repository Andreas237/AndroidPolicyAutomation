.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->stopListening()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

.field final synthetic val$locListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;->val$locListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 4

    .line 314
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 315
    sget-object p1, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$4;->val$locListener:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/location/FusedLocationProviderApi;->removeLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 316
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 317
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "LocationServicesSensorImplementation: stopped listening"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
