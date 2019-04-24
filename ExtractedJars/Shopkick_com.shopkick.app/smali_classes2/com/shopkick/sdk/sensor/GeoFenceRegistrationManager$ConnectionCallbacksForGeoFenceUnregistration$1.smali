.class Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;
.super Ljava/lang/Object;
.source "GeoFenceRegistrationManager.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->onConnected(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 445
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;->onResult(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 449
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;

    iget-object v1, v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->geoFenceIdsToUnregister:Ljava/util/List;

    invoke-static {v0, p1, v1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$500(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 451
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$ConnectionCallbacksForGeoFenceUnregistration;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$300(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
