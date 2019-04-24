.class Lcom/shopkick/app/location/SKLocationManager$3;
.super Ljava/lang/Object;
.source "SKLocationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/SKLocationManager;->registerLocationRequests()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/SKLocationManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/SKLocationManager;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$100(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 236
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$400(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/LocationListener;

    .line 237
    iget-object v2, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v2}, Lcom/shopkick/app/location/SKLocationManager;->access$200(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/location/FusedLocationProviderApi;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v3}, Lcom/shopkick/app/location/SKLocationManager;->access$100(Lcom/shopkick/app/location/SKLocationManager;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/location/FusedLocationProviderApi;->removeLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;

    goto :goto_0

    .line 239
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$400(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v0}, Lcom/shopkick/app/location/SKLocationManager;->access$000(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/location/LocationListener;

    .line 242
    iget-object v1, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    invoke-static {v1}, Lcom/shopkick/app/location/SKLocationManager;->access$000(Lcom/shopkick/app/location/SKLocationManager;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;

    .line 243
    iget-object v2, p0, Lcom/shopkick/app/location/SKLocationManager$3;->this$0:Lcom/shopkick/app/location/SKLocationManager;

    iget-wide v3, v1, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;->minTime:J

    iget v5, v1, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;->minDistance:F

    iget v6, v1, Lcom/shopkick/app/location/SKLocationManager$LocationUpdateRequestParams;->priority:I

    invoke-static/range {v2 .. v7}, Lcom/shopkick/app/location/SKLocationManager;->access$600(Lcom/shopkick/app/location/SKLocationManager;JFILcom/google/android/gms/location/LocationListener;)V

    goto :goto_1

    :cond_2
    return-void
.end method
