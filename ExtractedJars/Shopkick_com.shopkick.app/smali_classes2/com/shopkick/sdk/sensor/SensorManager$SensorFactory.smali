.class final Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;
.super Ljava/lang/Object;
.source "SensorManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/SensorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "SensorFactory"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/SensorManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;)V
    .locals 0

    .line 654
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorManager$1;)V
    .locals 0

    .line 654
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;)V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;Ljava/lang/Class;Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;
    .locals 0

    .line 654
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/sdk/sensor/SensorManager$SensorFactory;->getSensor(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object p0

    return-object p0
.end method

.method private getSensor(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/shopkick/sdk/sensor/Sensor;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/shopkick/sdk/sensor/SensorImplementation;",
            "Lcom/shopkick/sdk/sensor/ReadingListener;",
            "Lcom/shopkick/sdk/sensor/StatusListener;",
            ")TT;"
        }
    .end annotation

    .line 659
    const-class v0, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 662
    new-instance p1, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-direct {p1, p2, p3, p4}, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;-><init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-object p1

    .line 663
    :cond_0
    const-class v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 666
    new-instance p1, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-direct {p1, p2, p3, p4}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;-><init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-object p1

    .line 667
    :cond_1
    const-class v0, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 670
    new-instance p1, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-direct {p1, p2, p3, p4}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;-><init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-object p1

    .line 671
    :cond_2
    const-class v0, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 674
    new-instance p1, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-direct {p1, p2, p3, p4}, Lcom/shopkick/sdk/sensor/WiFiSensor;-><init>(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)V

    return-object p1

    .line 677
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 p4, 0x1

    new-array p4, p4, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p4, v0

    const-string p1, "Unsupported sensor type: %1$s"

    invoke-static {p3, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
