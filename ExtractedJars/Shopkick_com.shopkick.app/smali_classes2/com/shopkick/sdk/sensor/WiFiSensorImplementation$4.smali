.class Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;
.super Landroid/content/BroadcastReceiver;
.source "WiFiSensorImplementation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V
    .locals 0

    .line 487
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 491
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"

    .line 492
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const-string/jumbo p1, "wifi_state"

    .line 495
    invoke-virtual {p2, p1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 509
    :pswitch_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 510
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    const-string p2, "WiFi: WiFi state unknown"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 511
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$300(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V

    goto/16 :goto_1

    .line 518
    :pswitch_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 519
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    const-string p2, "WiFi: WiFi turned on"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 520
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    sget-object p2, Lcom/shopkick/sdk/sensor/Status;->WIFI_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$200(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Lcom/shopkick/sdk/sensor/Status;)V

    .line 522
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$400(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V

    .line 523
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-static {p1, v2}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$500(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Z)Z

    goto/16 :goto_1

    .line 514
    :pswitch_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 515
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    const-string p2, "WiFi: WiFi turning on"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 498
    :pswitch_3
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 499
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    const-string p2, "WiFi: WiFi turned off"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 500
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    sget-object p2, Lcom/shopkick/sdk/sensor/Status;->WIFI_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$200(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Lcom/shopkick/sdk/sensor/Status;)V

    .line 501
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$300(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V

    goto :goto_1

    .line 504
    :pswitch_4
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 505
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    const-string p2, "WiFi: WiFi turning off"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 506
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-static {p1}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$300(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;)V

    goto :goto_1

    :cond_0
    const-string v1, "android.location.PROVIDERS_CHANGED"

    .line 526
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "android.location.MODE_CHANGED"

    .line 527
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "android.net.wifi.SCAN_RESULTS"

    .line 535
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 536
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$700(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Landroid/content/Intent;)V

    goto :goto_1

    .line 530
    :cond_2
    :goto_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 531
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    const-string v4, "WiFi: Location providers changed"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, v4, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 532
    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasFineLocation(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 533
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation$4;->this$0:Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;

    invoke-static {p1, v2}, Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;->access$600(Lcom/shopkick/sdk/sensor/WiFiSensorImplementation;Z)Z

    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
