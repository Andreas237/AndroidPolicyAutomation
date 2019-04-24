.class Lcom/shopkick/sdk/sensor/SensorManager$2;
.super Ljava/lang/Object;
.source "SensorManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/SensorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/SensorManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;)V
    .locals 0

    .line 745
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$2;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 755
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeResponse;

    if-eqz p1, :cond_0

    .line 759
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeResponse;

    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BTLEPhoneHomeResponse;->beaconDatasPhonedHome:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 762
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 763
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$2;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->access$900(Lcom/shopkick/sdk/sensor/SensorManager;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
