.class Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$6;
.super Ljava/lang/Object;
.source "DefaultForegroundZoneDetector.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;
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
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V
    .locals 0

    .line 940
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 940
    check-cast p2, Lcom/shopkick/sdk/sensor/WiFiScanReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$6;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/WiFiScanReading;)V

    return-void
.end method

.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/WiFiScanReading;)V
    .locals 0

    .line 943
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/WiFiScanReading;->getWifiScanResult()Lcom/shopkick/sdk/sensor/WiFiScanResult;

    move-result-object p1

    .line 945
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object p2, p2, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    if-eqz p2, :cond_0

    .line 946
    iget-object p2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object p2, p2, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    invoke-interface {p2, p1}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onWiFiObservedInZone(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V

    :cond_0
    return-void
.end method
