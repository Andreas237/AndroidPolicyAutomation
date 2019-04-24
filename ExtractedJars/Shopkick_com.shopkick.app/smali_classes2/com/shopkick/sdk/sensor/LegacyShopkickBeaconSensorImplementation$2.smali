.class Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;
.super Ljava/lang/Object;
.source "LegacyShopkickBeaconSensorImplementation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->notifyListenersOfBeacons(Ljava/util/Collection;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

.field final synthetic val$filteredBeacons:Ljava/util/Collection;

.field final synthetic val$iBeacons:Ljava/util/Collection;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;->val$filteredBeacons:Ljava/util/Collection;

    iput-object p3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;->val$iBeacons:Ljava/util/Collection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 195
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;->this$0:Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation;->scanListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/BleScanListener;

    .line 197
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;->val$filteredBeacons:Ljava/util/Collection;

    iget-object v3, p0, Lcom/shopkick/sdk/sensor/LegacyShopkickBeaconSensorImplementation$2;->val$iBeacons:Ljava/util/Collection;

    invoke-interface {v1, v2, v3}, Lcom/shopkick/sdk/sensor/BleScanListener;->onBeaconsScanned(Ljava/util/Collection;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v5, v1

    .line 199
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 200
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v6, "%1$s %2$s"

    const/4 v1, 0x2

    new-array v7, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v8, "LSBSI"

    aput-object v8, v7, v1

    const/4 v1, 0x1

    const-string v8, "Error in BleScanListener"

    aput-object v8, v7, v1

    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
