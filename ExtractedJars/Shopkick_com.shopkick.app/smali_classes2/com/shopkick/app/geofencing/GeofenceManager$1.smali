.class Lcom/shopkick/app/geofencing/GeofenceManager$1;
.super Ljava/lang/Object;
.source "GeofenceManager.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/geofencing/GeofenceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/geofencing/GeofenceManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/geofencing/GeofenceManager;)V
    .locals 0

    .line 321
    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$1;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 324
    instance-of p1, p2, Lcom/shopkick/sdk/sensor/GeoFenceReading;

    if-eqz p1, :cond_0

    .line 325
    check-cast p2, Lcom/shopkick/sdk/sensor/GeoFenceReading;

    .line 327
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 328
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->getNumericValue()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 329
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$1;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->queueLoadGeofencesAndSendMessageTask()V

    .line 330
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$1;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string p2, "queueLoadGeofencesAndSendMessageTask"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
