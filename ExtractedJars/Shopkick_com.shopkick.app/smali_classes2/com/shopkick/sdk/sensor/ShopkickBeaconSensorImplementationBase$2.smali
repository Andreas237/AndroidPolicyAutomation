.class Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;
.super Ljava/lang/Object;
.source "ShopkickBeaconSensorImplementationBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->notifyStatusListenersOfError(Lcom/shopkick/sdk/sensor/SensorStatusError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

.field final synthetic val$error:Lcom/shopkick/sdk/sensor/SensorStatusError;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    iput-object p2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;->val$error:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 269
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->statusListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/SensorStatusListener;

    .line 271
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    iget-object v3, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$2;->val$error:Lcom/shopkick/sdk/sensor/SensorStatusError;

    invoke-interface {v1, v2, v3}, Lcom/shopkick/sdk/sensor/SensorStatusListener;->onErrorReceived(Lcom/shopkick/sdk/sensor/SensorImplementation;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v5, v1

    .line 273
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 274
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v6, "%1$s %2$s"

    const/4 v1, 0x2

    new-array v7, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v8, "SBSIB"

    aput-object v8, v7, v1

    const/4 v1, 0x1

    const-string v8, "Error in SensorStatusListener"

    aput-object v8, v7, v1

    invoke-virtual/range {v2 .. v7}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
