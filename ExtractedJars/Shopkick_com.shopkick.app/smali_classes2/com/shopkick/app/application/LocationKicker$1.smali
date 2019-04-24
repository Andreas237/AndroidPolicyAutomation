.class final Lcom/shopkick/app/application/LocationKicker$1;
.super Ljava/lang/Object;
.source "LocationKicker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/LocationKicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 64
    :try_start_0
    invoke-static {}, Lcom/shopkick/app/application/LocationKicker;->access$000()Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 65
    invoke-static {}, Lcom/shopkick/app/application/LocationKicker;->access$100()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :try_start_1
    invoke-static {}, Lcom/shopkick/app/application/LocationKicker;->access$000()Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "LocationKicker.StopHighAccuracyRunnable Stopping high accuracy readings"

    .line 69
    invoke-static {v1}, Lcom/shopkick/app/application/LocationKicker;->access$200(Ljava/lang/String;)V

    .line 70
    invoke-static {}, Lcom/shopkick/app/application/LocationKicker;->access$000()Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensor;->close()V

    const/4 v1, 0x0

    .line 71
    invoke-static {v1}, Lcom/shopkick/app/application/LocationKicker;->access$002(Lcom/shopkick/sdk/sensor/LocationServicesSensor;)Lcom/shopkick/sdk/sensor/LocationServicesSensor;

    .line 73
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "LocationKicker.StopHighAccuracyRunnable failed"

    .line 77
    invoke-static {v1, v0}, Lcom/shopkick/app/application/LocationKicker;->access$300(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    :goto_0
    return-void
.end method
