.class Lcom/shopkick/app/presence/WalkinController$3;
.super Ljava/lang/Object;
.source "WalkinController.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/WalkinController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/sensor/ReadingListener<",
        "Lcom/shopkick/sdk/sensor/GeoFenceReading;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/WalkinController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/WalkinController;)V
    .locals 0

    .line 755
    iput-object p1, p0, Lcom/shopkick/app/presence/WalkinController$3;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/GeoFenceReading;)V
    .locals 10

    .line 758
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object p1

    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->EXIT:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 759
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getGeoFence()Lcom/shopkick/sdk/sensor/GeoFence;

    move-result-object p1

    .line 760
    iget-object p2, p0, Lcom/shopkick/app/presence/WalkinController$3;->this$0:Lcom/shopkick/app/presence/WalkinController;

    .line 761
    invoke-static {p2}, Lcom/shopkick/app/presence/WalkinController;->access$300(Lcom/shopkick/app/presence/WalkinController;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez p2, :cond_0

    .line 763
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    .line 764
    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 765
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "WalkinController: exit event for untracked geofence for latitude: %f, longitude: %f, radius: %d"

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v8, p1, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    .line 769
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v0, v3

    iget-wide v8, p1, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    .line 770
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v0, v1

    iget p1, p1, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    .line 771
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v2

    .line 766
    invoke-static {v6, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

    .line 765
    invoke-virtual {p2, v4, v5, p1, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 775
    :cond_0
    iget-object v4, p0, Lcom/shopkick/app/presence/WalkinController$3;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-static {v4, p1}, Lcom/shopkick/app/presence/WalkinController;->access$400(Lcom/shopkick/app/presence/WalkinController;Lcom/shopkick/sdk/sensor/GeoFence;)V

    .line 777
    invoke-virtual {p2}, Lcom/shopkick/app/presence/WalkinController$GeoFenceMappedValue;->getCheckinLocation()Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    move-result-object p1

    .line 778
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v4, 0x72bf8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 779
    iget-object v4, p0, Lcom/shopkick/app/presence/WalkinController$3;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-static {v4}, Lcom/shopkick/app/presence/WalkinController;->access$500(Lcom/shopkick/app/presence/WalkinController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 780
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 781
    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 782
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 783
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 784
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {p2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 785
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {p2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 786
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {p2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 787
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-int p1, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 788
    iget-object p1, p0, Lcom/shopkick/app/presence/WalkinController$3;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-static {p1}, Lcom/shopkick/app/presence/WalkinController;->access$600(Lcom/shopkick/app/presence/WalkinController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v4}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 790
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 791
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 792
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "WalkinController: exited gps tracking radius for chainId: %s, locationId: %s, latitude: %f, longitude: %f, accuracy: %f, coordAge: %d, isAppBackgrounded: %b"

    const/4 v8, 0x7

    new-array v8, v8, [Ljava/lang/Object;

    .line 798
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getChainId()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v3

    .line 799
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLocationId()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v1

    .line 800
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLat()Ljava/lang/Double;

    move-result-object v1

    aput-object v1, v8, v2

    .line 801
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLng()Ljava/lang/Double;

    move-result-object v1

    aput-object v1, v8, v0

    const/4 v0, 0x4

    .line 802
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAccuracy()Ljava/lang/Double;

    move-result-object v1

    aput-object v1, v8, v0

    const/4 v0, 0x5

    .line 803
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCoordAge()Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v8, v0

    const/4 v0, 0x6

    .line 804
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getIsAppBackgrounded()Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v8, v0

    .line 793
    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v3, [Ljava/lang/Object;

    .line 792
    invoke-virtual {p1, v4, v5, p2, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 755
    check-cast p2, Lcom/shopkick/sdk/sensor/GeoFenceReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/presence/WalkinController$3;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/GeoFenceReading;)V

    return-void
.end method
