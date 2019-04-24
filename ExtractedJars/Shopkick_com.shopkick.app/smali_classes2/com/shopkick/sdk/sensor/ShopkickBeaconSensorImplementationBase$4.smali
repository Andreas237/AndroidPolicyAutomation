.class Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$4;
.super Landroid/content/BroadcastReceiver;
.source "ShopkickBeaconSensorImplementationBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$4;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 466
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    .line 467
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string p1, "android.bluetooth.adapter.extra.STATE"

    const/high16 v0, -0x80000000

    .line 470
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 477
    :pswitch_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 478
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v0, v3

    const-string p2, "BLE: Bluetooth turning off"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 481
    :pswitch_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 482
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v0, v3

    const-string p2, "BLE: Bluetooth turned on"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 483
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$4;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    invoke-static {p1, v2}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->access$000(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Z)Z

    goto :goto_0

    .line 486
    :pswitch_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 487
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v0, v3

    const-string p2, "BLE: Bluetooth turning on"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 473
    :pswitch_3
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 474
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v0, v3

    const-string p2, "BLE: Bluetooth turned off"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p2, "android.location.PROVIDERS_CHANGED"

    .line 490
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "android.location.MODE_CHANGED"

    .line 491
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 494
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 495
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v0, v3

    const-string v3, "BLE: Location providers changed"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 496
    invoke-static {p1}, Lcom/shopkick/sdk/core/PermissionsUtility;->hasFineLocation(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 497
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase$4;->this$0:Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;

    invoke-static {p1, v2}, Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;->access$000(Lcom/shopkick/sdk/sensor/ShopkickBeaconSensorImplementationBase;Z)Z

    :cond_2
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
