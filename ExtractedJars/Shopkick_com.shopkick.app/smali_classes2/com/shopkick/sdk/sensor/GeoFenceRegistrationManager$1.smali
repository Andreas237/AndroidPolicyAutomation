.class Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;
.super Ljava/lang/Object;
.source "GeoFenceRegistrationManager.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->registerGeoFences(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Ljava/util/List;)V
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
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

.field final synthetic val$geoFencesToRegister:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/util/List;)V
    .locals 0

    .line 523
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->val$geoFencesToRegister:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 523
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->onResult(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 526
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$800(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;-><init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
