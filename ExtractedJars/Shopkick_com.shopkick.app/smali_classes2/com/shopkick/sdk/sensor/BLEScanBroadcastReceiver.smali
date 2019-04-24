.class public Lcom/shopkick/sdk/sensor/BLEScanBroadcastReceiver;
.super Landroid/support/v4/content/WakefulBroadcastReceiver;
.source "BLEScanBroadcastReceiver.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BeaconScanTimer"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroid/support/v4/content/WakefulBroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p2, "BeaconScanTimer"

    const-string/jumbo v0, "timer"

    .line 17
    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x12

    if-ge p2, v0, :cond_0

    return-void

    .line 22
    :cond_0
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/shopkick/sdk/sensor/BLESensorService;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/BLEScanBroadcastReceiver;->startWakefulService(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method
