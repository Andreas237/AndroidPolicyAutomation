.class public interface abstract Lcom/shopkick/sdk/zone/ZoneEventsListener;
.super Ljava/lang/Object;
.source "ZoneEventsListener.java"


# virtual methods
.method public abstract onBeaconMatchedToZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;)V
.end method

.method public abstract onBeaconMatchedToZoneInFallback(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;Landroid/location/Location;)V
.end method

.method public abstract onBeaconNotMatchedToZone(Ljava/lang/String;)V
.end method

.method public abstract onBeaconObservedInZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;I)V
.end method

.method public abstract onWiFiObservedInZone(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V
.end method

.method public abstract onZoneEntered(Lcom/shopkick/sdk/zone/Zone;ILcom/shopkick/sdk/sensor/Reading;)V
.end method
