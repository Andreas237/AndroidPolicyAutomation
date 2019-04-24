.class Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;
.super Ljava/lang/Object;
.source "GeoFenceRegistrationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->onResult(Lcom/google/android/gms/common/api/Status;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;

.field final synthetic val$status:Lcom/google/android/gms/common/api/Status;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;->val$status:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 530
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;->val$status:Lcom/google/android/gms/common/api/Status;

    iget-object v2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;

    iget-object v2, v2, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->val$geoFencesToRegister:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$700(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 532
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1$1;->this$1:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;

    iget-object v1, v1, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$1;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-static {v1, v0}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;->access$300(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
