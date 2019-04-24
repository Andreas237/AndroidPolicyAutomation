.class Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;
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
        "Lcom/shopkick/sdk/sensor/GeoFenceReading;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V
    .locals 0

    .line 640
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private isGeoFenceInTrigger(Lcom/shopkick/sdk/sensor/GeoFenceReading;DDI)Z
    .locals 13

    .line 754
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getGeoFence()Lcom/shopkick/sdk/sensor/GeoFence;

    move-result-object v0

    iget-wide v1, v0, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    .line 755
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getGeoFence()Lcom/shopkick/sdk/sensor/GeoFence;

    move-result-object v0

    iget-wide v3, v0, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    .line 756
    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getGeoFence()Lcom/shopkick/sdk/sensor/GeoFence;

    move-result-object v0

    iget v0, v0, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    int-to-double v5, v0

    move/from16 v0, p6

    int-to-double v11, v0

    move-wide v7, p2

    move-wide/from16 v9, p4

    .line 753
    invoke-static/range {v1 .. v12}, Lcom/shopkick/utilities/GeoUtilities;->getCircleRelationship(DDDDDD)Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    move-result-object v0

    .line 765
    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->Overlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    invoke-virtual {v1, v0}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->NoOverlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    .line 766
    invoke-virtual {v1, v0}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->AContainsB:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    .line 767
    invoke-virtual {v1, v0}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/GeoFenceReading;)V
    .locals 21

    move-object/from16 v8, p0

    .line 643
    iget-object v0, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-static {v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->access$100(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    .line 650
    :try_start_0
    iget-object v0, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-static {v0}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->access$200(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    const-string v1, "geo_radial"

    .line 653
    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 657
    :cond_1
    iget-object v1, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-static {v1, v10}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->access$300(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 658
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 659
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    const-string v1, "detect"

    .line 660
    invoke-virtual {v12}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v15, 0x1

    const/4 v13, 0x0

    if-eqz v1, :cond_9

    .line 663
    iget-object v1, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v1, v1, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneToProximityToCount:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v1, :cond_8

    .line 665
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 666
    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int v12, v2, v1

    .line 667
    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLatitude()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLongitude()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move v7, v12

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->isGeoFenceInTrigger(Lcom/shopkick/sdk/sensor/GeoFenceReading;DDI)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 671
    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->ENTER:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 674
    new-instance v1, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 676
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 v16, 0x1

    move v4, v12

    move-object v12, v1

    move v7, v13

    move-object v13, v14

    move-object/from16 v20, v14

    move v5, v15

    move-wide v14, v2

    move/from16 v17, v4

    invoke-direct/range {v12 .. v17}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JII)V

    .line 680
    iget-object v2, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    .line 681
    invoke-interface {v1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v3

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getListenersForZoneAndProximity(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/List;

    move-result-object v2

    .line 682
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 683
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->isWithinZone()Z

    move-result v6

    if-nez v6, :cond_3

    .line 684
    invoke-virtual {v3, v5}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setWithinZone(Z)V

    .line 685
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v3, v12, v13}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setEnterTime(J)V

    .line 686
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getEnterTime()J

    move-result-wide v12

    invoke-virtual {v3, v12, v13}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastDwelled(J)V

    .line 687
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getEnterTime()J

    move-result-wide v12

    invoke-virtual {v3, v12, v13}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastCalled(J)V

    .line 688
    iget-object v6, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v6, v6, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v6}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v6

    sget-object v12, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->GEOFENCE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v6, v3, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;

    move-result-object v3

    invoke-interface {v3, v4, v1}, Lcom/shopkick/sdk/zone/ZoneProximityListener;->onEntered(ILcom/shopkick/sdk/zone/ZoneReading;)V

    goto :goto_3

    .line 694
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v3, v12, v13}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setLastCalled(J)V

    goto :goto_3

    :cond_4
    move v4, v12

    move v7, v13

    move-object/from16 v20, v14

    move v5, v15

    .line 698
    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->EXIT:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 700
    new-instance v1, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 702
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    const/16 v16, 0x1

    move-object v12, v1

    move-object/from16 v13, v20

    move/from16 v17, v4

    invoke-direct/range {v12 .. v17}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JII)V

    .line 706
    iget-object v2, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    .line 707
    invoke-interface {v1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v3

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->getListenersForZoneAndProximity(Lcom/shopkick/sdk/zone/Zone;I)Ljava/util/List;

    move-result-object v2

    .line 708
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 709
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;

    move-result-object v6

    invoke-interface {v6, v4, v1}, Lcom/shopkick/sdk/zone/ZoneProximityListener;->onExited(ILcom/shopkick/sdk/zone/ZoneReading;)V

    .line 710
    invoke-virtual {v3, v7}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setWithinZone(Z)V

    .line 711
    iget-object v6, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v6, v6, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v6}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    move v7, v13

    move-object/from16 v20, v14

    move v5, v15

    :cond_6
    move v15, v5

    move v13, v7

    move-object/from16 v14, v20

    goto/16 :goto_2

    :cond_7
    move-object/from16 v20, v14

    goto :goto_5

    :cond_8
    move-object/from16 v20, v14

    goto :goto_5

    :cond_9
    move v7, v13

    move-object/from16 v20, v14

    move v5, v15

    const-string v1, "enable"

    .line 717
    invoke-virtual {v12}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 722
    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLatitude()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 723
    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getLongitude()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    .line 724
    invoke-virtual {v10}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getRadius()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 p1, v0

    move v0, v5

    move-wide v5, v13

    move v13, v7

    move v7, v15

    .line 720
    invoke-direct/range {v1 .. v7}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->isGeoFenceInTrigger(Lcom/shopkick/sdk/sensor/GeoFenceReading;DDI)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 729
    sget-object v1, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->ENTER:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 732
    iget-object v1, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-static {v1, v12, v0, v13}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->access$400(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V

    goto :goto_6

    .line 734
    :cond_a
    sget-object v0, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->EXIT:Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/GeoFenceReading;->getTransitionType()Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/sensor/GeoFenceTransitionType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 736
    iget-object v0, v8, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-static {v0, v12, v13, v13}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->access$400(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V

    goto :goto_6

    :cond_b
    :goto_5
    move-object/from16 p1, v0

    :cond_c
    :goto_6
    move-object/from16 v0, p1

    move-object/from16 v14, v20

    goto/16 :goto_1

    .line 743
    :cond_d
    monitor-exit v9

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 640
    check-cast p2, Lcom/shopkick/sdk/sensor/GeoFenceReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$3;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/GeoFenceReading;)V

    return-void
.end method
