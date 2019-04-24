.class Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;
.super Ljava/lang/Object;
.source "ShopkickBeaconSensorImplementation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->notifyListenersOfBeacons(Ljava/util/Collection;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

.field final synthetic val$filteredBeacons:Ljava/util/Collection;

.field final synthetic val$iBeacons:Ljava/util/Collection;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;->val$filteredBeacons:Ljava/util/Collection;

    iput-object p3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;->val$iBeacons:Ljava/util/Collection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 303
    :try_start_0
    iget-object v3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;

    iget-object v3, v3, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation;->scanListeners:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/sensor/BleScanListener;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 305
    :try_start_1
    iget-object v5, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;->val$filteredBeacons:Ljava/util/Collection;

    iget-object v6, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementation$2;->val$iBeacons:Ljava/util/Collection;

    invoke-interface {v4, v5, v6}, Lcom/shopkick/sdk/sensor/BleScanListener;->onBeaconsScanned(Ljava/util/Collection;Ljava/util/Collection;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    move-object v8, v4

    .line 307
    :try_start_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v5

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 308
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    const-string v9, "%1$s %2$s"

    new-array v10, v2, [Ljava/lang/Object;

    const-string v4, "SBSI"

    aput-object v4, v10, v1

    const-string v4, "Error in BleScanListener"

    aput-object v4, v10, v0

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v3

    move-object v7, v3

    .line 312
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 313
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    const-string v8, "%1$s %2$s"

    new-array v9, v2, [Ljava/lang/Object;

    const-string v2, "SBSI"

    aput-object v2, v9, v1

    const-string v1, "notifyListenersOfBeacons.mainHandler.post().run() failed"

    aput-object v1, v9, v0

    .line 312
    invoke-virtual/range {v4 .. v9}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
