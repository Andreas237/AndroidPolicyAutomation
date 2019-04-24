.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1$1;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Lcom/google/android/gms/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;->onConnected(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1$1;->this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1

    .line 241
    sget-object p1, Lcom/google/android/gms/location/LocationServices;->FusedLocationApi:Lcom/google/android/gms/location/FusedLocationProviderApi;

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1$1;->this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$000(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/location/FusedLocationProviderApi;->removeLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    return-void
.end method
