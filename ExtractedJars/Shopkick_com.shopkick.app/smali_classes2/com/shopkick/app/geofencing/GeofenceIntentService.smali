.class public Lcom/shopkick/app/geofencing/GeofenceIntentService;
.super Landroid/support/v4/app/JobIntentService;
.source "GeofenceIntentService.java"


# static fields
.field private static final JOB_ID:I = 0x65


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/support/v4/app/JobIntentService;-><init>()V

    return-void
.end method

.method public static enqueueWork(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 19
    const-class v0, Lcom/shopkick/sdk/sensor/GeoFencingIntentService;

    const/16 v1, 0x65

    invoke-static {p0, v0, v1, p1}, Lcom/shopkick/app/geofencing/GeofenceIntentService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected onHandleWork(Landroid/content/Intent;)V
    .locals 3
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    .line 29
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/location/GeofencingEvent;->fromIntent(Landroid/content/Intent;)Lcom/google/android/gms/location/GeofencingEvent;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->hasError()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->getErrorCode()I

    move-result p1

    .line 32
    invoke-virtual {p0}, Lcom/shopkick/app/geofencing/GeofenceIntentService;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GEOFENCE INTENT ERROR CODE:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/location/GeofencingEvent;->getGeofenceTransition()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/geofencing/GeofenceIntentService;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->queueLoadGeofencesAndSendMessageTask()V

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/geofencing/GeofenceIntentService;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->geofenceManager:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "queueLoadGeofencesAndSendMessageTask"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 47
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/JobIntentService;->onStartCommand(Landroid/content/Intent;II)I

    const/4 p1, 0x1

    return p1
.end method
