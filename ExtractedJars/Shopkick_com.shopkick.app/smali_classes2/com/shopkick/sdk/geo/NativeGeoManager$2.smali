.class Lcom/shopkick/sdk/geo/NativeGeoManager$2;
.super Ljava/lang/Object;
.source "NativeGeoManager.java"

# interfaces
.implements Lcom/google/android/gms/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/geo/NativeGeoManager;->getLocation(Lcom/shopkick/app/util/Consumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

.field final synthetic val$listener:Lcom/shopkick/app/util/Consumer;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/geo/NativeGeoManager;Lcom/shopkick/app/util/Consumer;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    iput-object p2, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->val$listener:Lcom/shopkick/app/util/Consumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->val$listener:Lcom/shopkick/app/util/Consumer;

    invoke-interface {v0, p1}, Lcom/shopkick/app/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 93
    iget-object p1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    invoke-static {p1}, Lcom/shopkick/sdk/geo/NativeGeoManager;->access$100(Lcom/shopkick/sdk/geo/NativeGeoManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;

    iget-object v1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    .line 94
    invoke-static {v1}, Lcom/shopkick/sdk/geo/NativeGeoManager;->access$100(Lcom/shopkick/sdk/geo/NativeGeoManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    new-instance v2, Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;

    invoke-direct {v2, p0, p0}, Lcom/shopkick/sdk/geo/NativeGeoManager$2$1;-><init>(Lcom/shopkick/sdk/geo/NativeGeoManager$2;Lcom/google/android/gms/location/LocationListener;)V

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/util/GoogleApiClientOneShotConnectionCallbacks;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Runnable;)V

    .line 93
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 102
    iget-object p1, p0, Lcom/shopkick/sdk/geo/NativeGeoManager$2;->this$0:Lcom/shopkick/sdk/geo/NativeGeoManager;

    invoke-static {p1}, Lcom/shopkick/sdk/geo/NativeGeoManager;->access$100(Lcom/shopkick/sdk/geo/NativeGeoManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method
