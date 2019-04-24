.class Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;
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
        "Lcom/shopkick/sdk/sensor/LocationServicesReading;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V
    .locals 0

    .line 978
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V
    .locals 28

    move-object/from16 v0, p0

    .line 997
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$200(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    const-string v3, "geo_radial"

    .line 1000
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 1005
    :cond_1
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLatitude()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLongitude()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 1012
    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v3, v2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$300(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 1013
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 1016
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    const-string v9, "detect"

    .line 1017
    invoke-virtual {v8}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const/16 v14, 0x64

    if-eqz v9, :cond_7

    .line 1020
    iget-object v8, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v8, v8, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v8, :cond_3

    .line 1022
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :cond_4
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 1027
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v13

    if-lt v8, v14, :cond_5

    goto :goto_2

    .line 1034
    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object v9

    invoke-virtual {v9}, Landroid/location/Location;->getLatitude()D

    move-result-wide v16

    .line 1035
    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object v9

    invoke-virtual {v9}, Landroid/location/Location;->getLongitude()D

    move-result-wide v18

    .line 1036
    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/LocationServicesReading;->getLocation()Landroid/location/Location;

    move-result-object v9

    invoke-virtual {v9}, Landroid/location/Location;->getAccuracy()F

    move-result v9

    float-to-double v9, v9

    .line 1037
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLatitude()Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v22

    .line 1038
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLongitude()Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v24

    int-to-double v11, v8

    move-wide/from16 v20, v9

    move-wide/from16 v26, v11

    .line 1033
    invoke-static/range {v16 .. v27}, Lcom/shopkick/utilities/GeoUtilities;->getCircleRelationship(DDDDDD)Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    move-result-object v8

    .line 1042
    sget-object v9, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->BContainsA:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    invoke-virtual {v9, v8}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 1045
    new-instance v12, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 1047
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    const/16 v16, 0x1

    move-object v8, v12

    move-object v9, v7

    move-object/from16 p1, v12

    move/from16 v12, v16

    move/from16 v16, v13

    invoke-direct/range {v8 .. v13}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JII)V

    .line 1050
    iget-object v8, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    .line 1051
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v9

    move/from16 v10, v16

    invoke-virtual {v8, v9, v10}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getListenersForZoneAndProximity(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/List;

    move-result-object v8

    .line 1052
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 1053
    invoke-virtual {v9}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->isWithinZone()Z

    move-result v11

    if-nez v11, :cond_6

    .line 1054
    invoke-virtual {v9, v5}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setWithinZone(Z)V

    .line 1055
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setEnterTime(J)V

    .line 1056
    invoke-virtual {v9}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getEnterTime()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastDwelled(J)V

    .line 1057
    invoke-virtual {v9}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getEnterTime()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastCalled(J)V

    .line 1058
    iget-object v11, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v11, v11, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v11}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v11

    sget-object v12, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->LOCATION_SERVICE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v11, v9, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1061
    invoke-virtual {v9}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;

    move-result-object v9

    move-object/from16 v11, p1

    invoke-interface {v9, v10, v11}, Lcom/shopkick/sdk/zone/ZoneProximityListener;->onEntered(ILcom/shopkick/sdk/zone/ZoneReading;)V

    goto :goto_4

    :cond_6
    move-object/from16 v11, p1

    .line 1064
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v9, v12, v13}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastCalled(J)V

    :goto_4
    move-object/from16 p1, v11

    goto :goto_3

    :cond_7
    const-string v9, "enable"

    .line 1070
    invoke-virtual {v8}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 1074
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lt v9, v14, :cond_8

    goto/16 :goto_1

    .line 1079
    :cond_8
    iget-object v9, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v9, v8, v5, v4}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$500(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V

    goto/16 :goto_1

    .line 1006
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v5, v5, [Ljava/lang/Object;

    .line 1008
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v4

    const-string v2, "Trigger %1$s of type geo_radial is missing location and/or radius"

    .line 1006
    invoke-static {v3, v2, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    return-void
.end method

.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 978
    check-cast p2, Lcom/shopkick/sdk/sensor/LocationServicesReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$6;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/LocationServicesReading;)V

    return-void
.end method
