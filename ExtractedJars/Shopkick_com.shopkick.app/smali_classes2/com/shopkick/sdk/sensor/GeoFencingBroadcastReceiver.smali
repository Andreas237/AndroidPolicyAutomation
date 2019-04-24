.class public Lcom/shopkick/sdk/sensor/GeoFencingBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "GeoFencingBroadcastReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 11
    invoke-static {p1, p2}, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;->enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
