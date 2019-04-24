.class public Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BleStateBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "LegacyShopkickBeaconSensorImplementation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BleStateBroadcastReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 242
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    const-string p1, "android.bluetooth.adapter.action.STATE_CHANGED"

    .line 245
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 248
    :cond_0
    invoke-static {}, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;->getInstance()Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-nez p1, :cond_1

    .line 250
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string p2, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v5, "LSBSI"

    aput-object v5, v2, v1

    const-string v1, "PresenceSDKClient is null"

    aput-object v1, v2, v0

    invoke-virtual {p1, v3, v4, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 254
    :cond_1
    invoke-interface {p1}, Lcom/shopkick/sdk/presence/PresenceSDKClient;->getSensorManager()Lcom/shopkick/sdk/presence/SensorManager;

    move-result-object p1

    const-class v3, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    .line 255
    invoke-interface {p1, v3}, Lcom/shopkick/sdk/presence/SensorManager;->getSensor(Ljava/lang/Class;)Lcom/shopkick/sdk/sensor/SensorImplementation;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    if-nez p1, :cond_2

    .line 258
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string p2, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v5, "LSBSI"

    aput-object v5, v2, v1

    const-string v1, "BLESensor is null"

    aput-object v1, v2, v0

    invoke-virtual {p1, v3, v4, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 262
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 263
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s %2$d %3$d"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const-string v8, "LSBSI"

    aput-object v8, v7, v1

    const-string v8, "State change of BluetoothAdapter"

    aput-object v8, v7, v0

    const-string v8, "android.bluetooth.adapter.extra.STATE"

    const/high16 v9, -0x80000000

    .line 267
    invoke-virtual {p2, v8, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    .line 263
    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    const-string v3, "android.bluetooth.adapter.extra.STATE"

    .line 268
    invoke-virtual {p2, v3, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    const/16 v3, 0xa

    if-eq p2, v3, :cond_4

    const/16 v3, 0xc

    if-eq p2, v3, :cond_3

    goto :goto_0

    .line 270
    :cond_3
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "LSBSI"

    aput-object v6, v2, v1

    const-string v1, "Bluetooth turned on"

    aput-object v1, v2, v0

    invoke-virtual {p2, v3, v4, v5, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 271
    sget-object p2, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    goto :goto_0

    .line 274
    :cond_4
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "%1$s %2$s"

    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "LSBSI"

    aput-object v6, v2, v1

    const-string v1, "Bluetooth turned off"

    aput-object v1, v2, v0

    invoke-virtual {p2, v3, v4, v5, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 275
    sget-object p2, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    :goto_0
    return-void
.end method
