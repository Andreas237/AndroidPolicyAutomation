.class Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;
.super Ljava/lang/Object;
.source "LegacyShopkickBeaconSensorImplementation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->createStopScanRunnable(Z)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

.field final synthetic val$scanIndefinitely:Z


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;Z)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    iput-boolean p2, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->val$scanIndefinitely:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 111
    :try_start_0
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    invoke-virtual {v3}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->stopScan()V

    .line 112
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    iget-object v3, v3, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->isActivelyScanning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 114
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    sget-object v4, Lcom/shopkick/sdk/sensor/Status;->BLE_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {v3, v4}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->notifyStatusListeners(Lcom/shopkick/sdk/sensor/Status;)V

    .line 115
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    iget-object v4, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    invoke-static {v4}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->access$100(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;)Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;->access$200(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$BLEScanCallback;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->access$300(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;Ljava/util/Collection;)V

    .line 117
    iget-boolean v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->val$scanIndefinitely:Z

    if-eqz v3, :cond_0

    .line 119
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s %2$s"

    new-array v7, v0, [Ljava/lang/Object;

    const-string v8, "LSBSI"

    aput-object v8, v7, v2

    const-string v8, "Starting next BLE scan"

    aput-object v8, v7, v1

    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    invoke-virtual {v3, v1}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->scan(Z)V

    goto :goto_0

    .line 122
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 123
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "%1$s %2$s"

    new-array v7, v0, [Ljava/lang/Object;

    const-string v8, "LSBSI"

    aput-object v8, v7, v2

    const-string v8, "That\'s it. One BLE scan, going to stop"

    aput-object v8, v7, v1

    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$1;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    invoke-virtual {v3}, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    move-object v7, v3

    .line 128
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 129
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v8, "%1$s %2$s"

    new-array v9, v0, [Ljava/lang/Object;

    const-string v0, "LSBSI"

    aput-object v0, v9, v2

    const-string v0, "createStopScanRunnable.run() failed"

    aput-object v0, v9, v1

    .line 128
    invoke-virtual/range {v4 .. v9}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
