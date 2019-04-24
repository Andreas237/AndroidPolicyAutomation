.class Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$7;
.super Ljava/lang/Object;
.source "DefaultBackgroundZoneDetector.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/sensor/ReadingListener<",
        "Lcom/shopkick/sdk/sensor/WiFiScanReading;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V
    .locals 0

    .line 1090
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$7;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 1090
    check-cast p2, Lcom/shopkick/sdk/sensor/WiFiScanReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$7;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/WiFiScanReading;)V

    return-void
.end method

.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/WiFiScanReading;)V
    .locals 0

    .line 1093
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/WiFiScanReading;->getWifiScanResult()Lcom/shopkick/sdk/sensor/WiFiScanResult;

    move-result-object p1

    .line 1095
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$7;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object p2, p2, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    if-eqz p2, :cond_0

    .line 1097
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$7;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object p2, p2, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    invoke-interface {p2, p1}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onWiFiObservedInZone(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V

    :cond_0
    return-void
.end method
