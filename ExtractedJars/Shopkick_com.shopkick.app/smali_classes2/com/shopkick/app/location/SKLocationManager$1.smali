.class Lcom/shopkick/app/location/SKLocationManager$1;
.super Ljava/lang/Object;
.source "SKLocationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/SKLocationManager;->removeUpdates(Lcom/google/android/gms/location/LocationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/SKLocationManager;

.field final synthetic val$listener:Lcom/google/android/gms/location/LocationListener;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/SKLocationManager;Lcom/google/android/gms/location/LocationListener;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager$1;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    iput-object p2, p0, Lcom/shopkick/app/location/SKLocationManager$1;->val$listener:Lcom/google/android/gms/location/LocationListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$1;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$000(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager$1;->val$listener:Lcom/google/android/gms/location/LocationListener;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$1;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$100(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$1;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$200(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/location/FusedLocationProviderApi;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager$1;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v1}, Lcom/shopkick/app/location/SKLocationManager;->access$100(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/location/SKLocationManager$1;->val$listener:Lcom/google/android/gms/location/LocationListener;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/location/FusedLocationProviderApi;->removeLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 143
    :catch_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$1;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$300(Lcom/shopkick/app/location/SKLocationManager;)V

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$1;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$400(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager$1;->val$listener:Lcom/google/android/gms/location/LocationListener;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method
