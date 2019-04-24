.class Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;
.super Ljava/lang/Object;
.source "SensorManager.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/StatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/SensorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ImplementationStatusListener"
.end annotation


# instance fields
.field private final sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

.field final synthetic this$0:Lcom/shopkick/sdk/sensor/SensorManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorImplementation;)V
    .locals 0

    .line 616
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 617
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;->sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    return-void
.end method


# virtual methods
.method public onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    .locals 2

    .line 640
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$400(Lcom/shopkick/sdk/sensor/SensorManager;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;->sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    .line 642
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorBase;

    .line 643
    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorBase;->getStatusListener()Lcom/shopkick/sdk/sensor/StatusListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 644
    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorBase;->getStatusListener()Lcom/shopkick/sdk/sensor/StatusListener;

    move-result-object v1

    invoke-interface {v1, v0, p2}, Lcom/shopkick/sdk/sensor/StatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onStatusChanged(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Status;)V
    .locals 2

    .line 625
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$400(Lcom/shopkick/sdk/sensor/SensorManager;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationStatusListener;->sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    .line 627
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorBase;

    .line 628
    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorBase;->getStatusListener()Lcom/shopkick/sdk/sensor/StatusListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 629
    invoke-virtual {v0}, Lcom/shopkick/sdk/sensor/SensorBase;->getStatusListener()Lcom/shopkick/sdk/sensor/StatusListener;

    move-result-object v1

    invoke-interface {v1, v0, p2}, Lcom/shopkick/sdk/sensor/StatusListener;->onStatusChanged(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Status;)V

    goto :goto_0

    :cond_1
    return-void
.end method
