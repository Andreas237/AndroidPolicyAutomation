.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->startListening(Lcom/google/android/gms/location/LocationRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

.field final synthetic val$config:Lcom/google/android/gms/location/LocationRequest;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Lcom/google/android/gms/location/LocationRequest;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;->val$config:Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 4

    .line 281
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 282
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$100(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$200(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 283
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$500(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 285
    sget-object v0, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$3;->val$config:Lcom/google/android/gms/location/LocationRequest;

    invoke-interface {v0, v1, v2, p1}, Lcom/google/android/gms/location/FusedLocationProviderApi;->requestLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    .line 288
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 289
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "LocationServicesSensorImplementation: started listening"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
