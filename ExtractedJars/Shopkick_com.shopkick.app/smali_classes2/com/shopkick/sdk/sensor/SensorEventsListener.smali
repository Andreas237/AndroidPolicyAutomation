.class public interface abstract Lcom/shopkick/sdk/sensor/SensorEventsListener;
.super Ljava/lang/Object;
.source "SensorEventsListener.java"


# virtual methods
.method public abstract onBeaconsFound(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onIBeaconsFound(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onWiFiScanReturned(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/net/wifi/ScanResult;",
            ">;)V"
        }
    .end annotation
.end method
