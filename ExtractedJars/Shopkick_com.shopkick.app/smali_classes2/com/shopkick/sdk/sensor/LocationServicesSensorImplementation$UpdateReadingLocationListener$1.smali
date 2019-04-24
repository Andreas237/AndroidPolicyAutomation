.class Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;
.super Ljava/lang/Object;
.source "LocationServicesSensorImplementation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->onLocationChanged(Landroid/location/Location;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;)V
    .locals 0

    .line 374
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;->this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 378
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;->this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$600(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/LocationServicesReading;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 380
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;->this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    iget-object v0, v0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v0}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$800(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/ReadingListener;

    move-result-object v0

    invoke-interface {v0, v1, v1}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V

    goto :goto_0

    .line 382
    :cond_0
    iget-object v2, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;->this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    iget-object v2, v2, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    invoke-static {v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$800(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/sensor/ReadingListener;

    move-result-object v2

    new-instance v3, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    iget-object v4, p0, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener$1;->this$1:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;

    iget-object v4, v4, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation$UpdateReadingLocationListener;->this$0:Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;

    .line 383
    invoke-static {v4}, Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;->access$700(Lcom/shopkick/sdk/sensor/LocationServicesSensorImplementation;)Lcom/shopkick/sdk/core/ConfigurationProvider;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lcom/shopkick/sdk/sensor/LocationServicesReading;-><init>(Lcom/shopkick/sdk/sensor/LocationServicesReading;Lcom/shopkick/sdk/core/ConfigurationProvider;)V

    .line 382
    invoke-interface {v2, v1, v3}, Lcom/shopkick/sdk/sensor/ReadingListener;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    .line 386
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 387
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "LocationServicesSensorImplementation: ReadingListener.onRead() callback failed"

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
