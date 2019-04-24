.class final Lcom/shopkick/app/campaigns/LoggingUtility;
.super Ljava/lang/Object;
.source "LoggingUtility.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V
    .locals 4

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 39
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 40
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    :cond_0
    return-void

    .line 36
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'logRecord\' cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V
    .locals 1

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    .line 25
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setZoneId(Ljava/lang/String;)V

    const-string v0, "retail.chain_id"

    .line 26
    invoke-interface {p1, v0}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    const-string v0, "retail.store_id"

    .line 27
    invoke-interface {p1, v0}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    const-string v0, "retail.department_id"

    .line 28
    invoke-interface {p1, v0}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDepartmentId(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 23
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'logRecord\' cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 6

    if-eqz p0, :cond_16

    .line 51
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 53
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getSource()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string/jumbo v1, "source"

    .line 54
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getSource()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getChainId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "chainId"

    .line 57
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getChainId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLocationId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "locationId"

    .line 60
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLocationId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getDepartmentId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "departmentId"

    .line 63
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getDepartmentId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLat()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v1, "lat"

    .line 66
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLat()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLng()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v1, "lng"

    .line 69
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLng()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAccuracy()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v1, "accuracy"

    .line 72
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAccuracy()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_6
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCoordAge()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v1, "coordAge"

    .line 75
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCoordAge()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_7
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCheckinFailureReason()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_8

    const-string v1, "reason"

    .line 78
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCheckinFailureReason()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_8
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getBeaconDataHash()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    const-string v1, "beaconDataHash"

    .line 81
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getBeaconDataHash()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    :cond_9
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getZoneId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    const-string/jumbo v1, "zoneId"

    .line 84
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getZoneId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    :cond_a
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getBtleSignal()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_b

    const-string v1, "btleSignal"

    .line 87
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getBtleSignal()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    :cond_b
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getIsAppBackgrounded()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_c

    const-string v1, "isAppBackgrounded"

    .line 90
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getIsAppBackgrounded()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    :cond_c
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCampaignType()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_d

    const-string v1, "campaignType"

    .line 93
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCampaignType()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    :cond_d
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getWifiScanData()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_e

    const-string/jumbo v1, "wifiScanData"

    .line 96
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getWifiScanData()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    :cond_e
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAction()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_f

    const-string v1, "action"

    .line 99
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAction()Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_f
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getElement()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_10

    const-string v1, "element"

    .line 102
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getElement()Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    :cond_10
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getBeaconMacAddress()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_11

    const-string v1, "beaconMacAddress"

    .line 105
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getBeaconMacAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    :cond_11
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getShopBeaconRssiList()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_12

    const-string/jumbo v1, "shopBeaconRssiList"

    .line 108
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getShopBeaconRssiList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    :cond_12
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getIBeaconRssiList()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_13

    const-string v1, "iBeaconRssiList"

    .line 111
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getIBeaconRssiList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :cond_13
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getEventType()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_14

    .line 115
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 116
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 117
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getEventType()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1, v2, v3, p0, v0}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    goto :goto_0

    .line 119
    :cond_14
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p0

    .line 120
    invoke-virtual {p0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p0

    sget-object v1, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 121
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_15
    :goto_0
    return-void

    .line 50
    :cond_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'logRecord\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
