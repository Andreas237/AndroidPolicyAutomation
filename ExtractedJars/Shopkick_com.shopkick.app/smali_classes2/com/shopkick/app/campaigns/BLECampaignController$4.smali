.class Lcom/shopkick/app/campaigns/BLECampaignController$4;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/SensorEventsListener;


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

    .line 811
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$4;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBeaconsFound(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;)V"
        }
    .end annotation

    .line 816
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/Beacon;

    .line 817
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x125

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x51

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/4 v2, 0x3

    .line 818
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    const/16 v2, 0x80

    .line 819
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 820
    invoke-virtual {v0}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBeaconMacAddress(Ljava/lang/String;)V

    .line 821
    invoke-virtual {v0}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBeaconDataHash(Ljava/lang/String;)V

    .line 822
    iget-object v2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$4;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 823
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/shopkick/sdk/scanner/Beacon;->getShopBeaconRssiList()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShopBeaconRssiList(Ljava/util/ArrayList;)V

    .line 824
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/shopkick/sdk/scanner/Beacon;->getIBeaconRssiList()Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIBeaconRssiList(Ljava/util/ArrayList;)V

    .line 826
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 825
    invoke-static {v1, v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 827
    invoke-static {v1}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 828
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$4;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 829
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$4;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object v0

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public onIBeaconsFound(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;)V"
        }
    .end annotation

    .line 838
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/Beacon;

    .line 839
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x126

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x51

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/4 v2, 0x3

    .line 840
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 841
    invoke-virtual {v0}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBeaconMacAddress(Ljava/lang/String;)V

    .line 842
    iget-object v2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$4;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 843
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/shopkick/sdk/scanner/Beacon;->getIBeaconRssiList()Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIBeaconRssiList(Ljava/util/ArrayList;)V

    .line 845
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 844
    invoke-static {v1, v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 846
    invoke-static {v1}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 847
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$4;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 848
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$4;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object v0

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onWiFiScanReturned(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/net/wifi/ScanResult;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
