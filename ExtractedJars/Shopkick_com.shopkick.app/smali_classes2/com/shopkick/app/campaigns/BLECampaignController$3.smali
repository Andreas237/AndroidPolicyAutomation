.class Lcom/shopkick/app/campaigns/BLECampaignController$3;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Lcom/shopkick/sdk/zone/ZoneEventsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/campaigns/BLECampaignController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/campaigns/BLECampaignController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/BLECampaignController;)V
    .locals 0

    .line 684
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBeaconMatchedToZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;)V
    .locals 2

    .line 712
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x72bf2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v1, 0x3

    .line 713
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 714
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBeaconDataHash(Ljava/lang/String;)V

    .line 715
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 716
    invoke-static {v0, p2}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 718
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 717
    invoke-static {v0, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 719
    invoke-static {v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 720
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 721
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onBeaconMatchedToZoneInFallback(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;Landroid/location/Location;)V
    .locals 10

    .line 731
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 732
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 733
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string p2, "CHECKIN: BLECampaignController.zoneEventsListener.onBeaconMatchedToZoneInFallback()"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 735
    invoke-static {p3}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1400(Landroid/location/Location;)Landroid/location/Location;

    if-eqz p3, :cond_0

    .line 739
    new-instance v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;

    invoke-direct {v5}, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;-><init>()V

    .line 740
    invoke-virtual {p3}, Landroid/location/Location;->getLatitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;->latitude:Ljava/lang/Double;

    .line 741
    invoke-virtual {p3}, Landroid/location/Location;->getLongitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyCampaignsRequest;->longitude:Ljava/lang/Double;

    .line 744
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1500(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object v3

    sget-object v4, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    invoke-virtual/range {v3 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchSynchronous(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object p1

    .line 750
    iget-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p2, p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$000(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/fetchers/DataResponse;)V

    :cond_0
    return-void
.end method

.method public onBeaconNotMatchedToZone(Ljava/lang/String;)V
    .locals 2

    .line 758
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x72bf3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v1, 0x3

    .line 759
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 760
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBeaconDataHash(Ljava/lang/String;)V

    .line 761
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 763
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 762
    invoke-static {v0, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 764
    invoke-static {v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 765
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 766
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onBeaconObservedInZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;I)V
    .locals 2

    .line 774
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x72bf4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v1, 0x3

    .line 775
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 776
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleSignal(Ljava/lang/Integer;)V

    .line 777
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBeaconDataHash(Ljava/lang/String;)V

    .line 778
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 780
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 779
    invoke-static {v0, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 781
    invoke-static {v0, p2}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 782
    invoke-static {v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 783
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 784
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onWiFiObservedInZone(Lcom/shopkick/sdk/sensor/WiFiScanResult;)V
    .locals 2

    .line 792
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x72bf7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v1, 0x4

    .line 793
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 794
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/WiFiScanResult;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWifiScanData(Ljava/lang/String;)V

    .line 795
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 797
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 796
    invoke-static {v0, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 798
    invoke-static {v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 799
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 800
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onZoneEntered(Lcom/shopkick/sdk/zone/Zone;ILcom/shopkick/sdk/sensor/Reading;)V
    .locals 2

    .line 689
    instance-of p2, p3, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    if-eqz p2, :cond_0

    .line 690
    check-cast p3, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    invoke-virtual {p3}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object p2

    .line 693
    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v0, 0x72bf1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v0, 0x3

    .line 694
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 695
    invoke-virtual {p2, v0, v1}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtleSignal(Ljava/lang/Integer;)V

    .line 696
    invoke-virtual {p2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBeaconDataHash(Ljava/lang/String;)V

    .line 697
    iget-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 698
    invoke-static {p3, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 700
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 699
    invoke-static {p3, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 701
    invoke-static {p3}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 702
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 703
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$3;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object p2, p3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
