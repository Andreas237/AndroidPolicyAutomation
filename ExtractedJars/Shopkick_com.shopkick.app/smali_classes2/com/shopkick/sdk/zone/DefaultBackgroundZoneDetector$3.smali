.class Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$3;
.super Ljava/lang/Object;
.source "DefaultBackgroundZoneDetector.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->setStopScanningTimer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

.field final synthetic val$sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/sensor/SensorImplementation;)V
    .locals 0

    .line 512
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iput-object p2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$3;->val$sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 516
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$3;->val$sensorImplementation:Lcom/shopkick/sdk/sensor/SensorImplementation;

    invoke-interface {v0}, Lcom/shopkick/sdk/sensor/SensorImplementation;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    .line 519
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 520
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "DefaultBackgroundZoneDetector.setStopScanningTimer() stop failed"

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    .line 519
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
