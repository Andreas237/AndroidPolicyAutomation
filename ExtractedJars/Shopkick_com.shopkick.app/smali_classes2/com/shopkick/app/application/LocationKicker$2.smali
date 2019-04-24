.class final Lcom/shopkick/app/application/LocationKicker$2;
.super Ljava/lang/Object;
.source "LocationKicker.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/LocationKicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/sensor/ReadingListener<",
        "Lcom/shopkick/sdk/sensor/LocationServicesReading;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V
    .locals 2

    .line 86
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "LocationKicker.LocationServicesReadingListener Reading received"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 87
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, " ["

    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", "

    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", "

    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object p2

    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, "]"

    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/application/LocationKicker;->access$200(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 83
    check-cast p2, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/application/LocationKicker$2;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    return-void
.end method
