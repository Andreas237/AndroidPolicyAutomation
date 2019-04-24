.class public Lcom/shopkick/app/geofencing/GeofenceBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "GeofenceBroadcastReceiver.java"


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

    .line 10
    invoke-static {p1, p2}, Lcom/shopkick/app/geofencing/GeofenceIntentService;->enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
