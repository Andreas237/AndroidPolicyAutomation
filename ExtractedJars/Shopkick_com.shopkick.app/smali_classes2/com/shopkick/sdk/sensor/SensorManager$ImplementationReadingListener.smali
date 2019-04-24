.class Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;
.super Ljava/lang/Object;
.source "SensorManager.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/SensorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ImplementationReadingListener"
.end annotation


# instance fields
.field private final sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

.field final synthetic this$0:Lcom/shopkick/sdk/sensor/SensorManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorImplementation;)V
    .locals 0

    .line 585
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 586
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;->sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    return-void
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 7

    .line 591
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$400(Lcom/shopkick/sdk/sensor/SensorManager;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;->sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 593
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 594
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "SensorManager.ReadingListener.onRead() making %1$d sensor callbacks for %2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 596
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    iget-object v6, p0, Lcom/shopkick/sdk/sensor/SensorManager$ImplementationReadingListener;->sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    .line 597
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    .line 594
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 601
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/SensorBase;

    .line 602
    invoke-virtual {v0, v0, p2}, Lcom/shopkick/sdk/sensor/SensorBase;->brokerReadingListenerCallback(Lcom/shopkick/sdk/sensor/SensorBase;Lcom/shopkick/sdk/sensor/Reading;)V

    goto :goto_0

    :cond_0
    return-void
.end method
