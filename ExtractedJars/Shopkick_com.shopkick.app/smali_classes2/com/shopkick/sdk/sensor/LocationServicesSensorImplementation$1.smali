.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->initiateLocationUpdate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 4

    .line 234
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "GoogleApiClient connected."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 236
    new-instance p1, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1$1;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1$1;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;)V

    .line 247
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$100(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$200(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 248
    :cond_0
    sget-object v0, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$300(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lcom/google/android/gms/location/FusedLocationProviderApi;->requestLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 253
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "GoogleApiClient temporarily disconnected."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
