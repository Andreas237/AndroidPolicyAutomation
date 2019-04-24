.class final Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;
.super Ljava/lang/Object;
.source "SensorManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/SensorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "SensorImplementationFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lcom/shopkick/sdk/sensor/Sensor;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/SensorManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;)V
    .locals 0

    .line 685
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;Lcom/shopkick/sdk/sensor/SensorManager$1;)V
    .locals 0

    .line 685
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;-><init>(Lcom/shopkick/sdk/sensor/SensorManager;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;Ljava/lang/Class;Lcom/shopkick/sdk/core/ConfigurationProvider;)Lcom/shopkick/sdk/sensor/SensorImplementation;
    .locals 0

    .line 685
    invoke-direct {p0, p1, p2}, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->getSensorImplementation(Ljava/lang/Class;Lcom/shopkick/sdk/core/ConfigurationProvider;)Lcom/shopkick/sdk/sensor/SensorImplementation;

    move-result-object p0

    return-object p0
.end method

.method private getSensorImplementation(Ljava/lang/Class;Lcom/shopkick/sdk/core/ConfigurationProvider;)Lcom/shopkick/sdk/sensor/SensorImplementation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/shopkick/sdk/sensor/SensorImplementation;",
            ">(",
            "Ljava/lang/Class<",
            "TA;>;",
            "Lcom/shopkick/sdk/core/ConfigurationProvider;",
            ")",
            "Lcom/shopkick/sdk/sensor/SensorImplementation;"
        }
    .end annotation

    .line 688
    const-class v0, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 694
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x12

    if-ge p1, p2, :cond_0

    .line 697
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 698
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string p2, "SensorManager: Pre Android 4.3 BLE not supported"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, p2, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 699
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$500(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/sensor/UnsupportedBLESensorImplementation;

    move-result-object p1

    return-object p1

    .line 700
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x15

    if-ge p1, p2, :cond_1

    .line 703
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string p2, "SensorManager: Using Pre Android 5.0 BLE APIs"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, p2, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 704
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$600(Lcom/shopkick/sdk/sensor/SensorManager;)Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p2}, Lcom/shopkick/sdk/sensor/SensorManager;->access$700(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/presence/AppStateProvider;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->access$800(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/core/ConfigurationProvider;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 705
    invoke-static {}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    .line 706
    invoke-static {}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    move-result-object p1

    return-object p1

    .line 710
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string p2, "SensorManager: Using Android 5.0+ BLE APIs"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, p2, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 711
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$600(Lcom/shopkick/sdk/sensor/SensorManager;)Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p2}, Lcom/shopkick/sdk/sensor/SensorManager;->access$700(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/presence/AppStateProvider;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->access$800(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/core/ConfigurationProvider;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 712
    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->addBleScanListener(Lcom/shopkick/sdk/sensor/BleScanListener;)V

    .line 713
    invoke-static {}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    move-result-object p1

    return-object p1

    .line 716
    :cond_2
    const-class v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 719
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$600(Lcom/shopkick/sdk/sensor/SensorManager;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 720
    invoke-static {}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    move-result-object p1

    return-object p1

    .line 722
    :cond_3
    const-class p2, Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 725
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$600(Lcom/shopkick/sdk/sensor/SensorManager;)Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p2}, Lcom/shopkick/sdk/sensor/SensorManager;->access$700(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/presence/AppStateProvider;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->access$800(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/core/ConfigurationProvider;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 726
    invoke-static {}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;

    move-result-object p1

    return-object p1

    .line 727
    :cond_4
    const-class p2, Lcom/shopkick/sdk/sensor/WiFiSensor;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 730
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/SensorManager;->access$600(Lcom/shopkick/sdk/sensor/SensorManager;)Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {p2}, Lcom/shopkick/sdk/sensor/SensorManager;->access$700(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/presence/AppStateProvider;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/SensorManager$SensorImplementationFactory;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/SensorManager;->access$800(Lcom/shopkick/sdk/sensor/SensorManager;)Lcom/shopkick/sdk/core/ConfigurationProvider;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->initialize(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 731
    invoke-static {}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->getInstance()Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    move-result-object p1

    return-object p1

    .line 734
    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    const-string p1, "Unsupported sensor type: %1$s"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
