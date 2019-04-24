.class Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;
.super Ljava/lang/Object;
.source "NativeGeoManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/geo/NativeGeoManager$2;->onLocationChanged(Landroid/location/Location;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/sdk/geo/NativeGeoManager$2;

.field final synthetic val$locationListener:Lcom/google/android/gms/location/LocationListener;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/geo/NativeGeoManager$2;Lcom/google/android/gms/location/LocationListener;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;->this$1:Lcom/shopkick/sdk/geo/NativeGeoManager$2;

    iput-object p2, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;->val$locationListener:Lcom/google/android/gms/location/LocationListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 98
    iget-object v0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;->this$1:Lcom/shopkick/sdk/geo/NativeGeoManager$2;

    iget-object v0, v0, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    invoke-static {v0}, Lcom/shopkick/sdk/geo/NativeGeoManager;->access$200(Lcom/shopkick/sdk/geo/NativeGeoManager;)Lcom/google/android/gms/location/FusedLocationProviderApi;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;->this$1:Lcom/shopkick/sdk/geo/NativeGeoManager$2;

    iget-object v1, v1, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    invoke-static {v1}, Lcom/shopkick/sdk/geo/NativeGeoManager;->access$100(Lcom/shopkick/sdk/geo/NativeGeoManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;->val$locationListener:Lcom/google/android/gms/location/LocationListener;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/location/FusedLocationProviderApi;->removeLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    return-void
.end method
