.class Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;
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
        "Lcom/shopkick/sdk/sensor/ShopBeaconReading;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V
    .locals 0

    .line 918
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 918
    check-cast p2, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/ShopBeaconReading;)V

    return-void
.end method

.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/ShopBeaconReading;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v8, p2

    .line 923
    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v1

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v9

    .line 924
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-virtual {v1, v8}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getBeaconDataHashMatchingPrefix(Lcom/shopkick/sdk/sensor/ShopBeaconReading;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_0

    return-void

    .line 930
    :cond_0
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$200(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    .line 933
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-virtual {v2, v10, v13}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getMatchingBeaconDataHash(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/lang/String;

    move-result-object v14

    .line 934
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 937
    :cond_2
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-virtual {v2, v13, v9}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->getDistanceFromSignalStrength(Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    .line 940
    iget-object v2, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v2, v13}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$300(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 941
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lcom/shopkick/sdk/zone/ZoneParcelable;

    .line 944
    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v3, v3, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    if-eqz v3, :cond_4

    .line 945
    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v3, v3, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneEventsListener:Lcom/shopkick/sdk/zone/ZoneEventsListener;

    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v4

    invoke-virtual {v4}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v7, v9}, Lcom/shopkick/sdk/zone/ZoneEventsListener;->onBeaconObservedInZone(Ljava/lang/String;Lcom/shopkick/sdk/zone/Zone;I)V

    .line 949
    :cond_4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    const-string v3, "detect"

    .line 950
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v6, 0x1

    if-eqz v3, :cond_5

    .line 954
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    move-object/from16 v2, p2

    move-object v3, v7

    move-object v4, v13

    move-object v5, v14

    move v12, v6

    move v6, v9

    move-object/from16 v18, v7

    move-object v7, v15

    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->handleBeaconMatchedToZone(Lcom/shopkick/sdk/sensor/ShopBeaconReading;Lcom/shopkick/sdk/zone/ZoneParcelable;Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;Ljava/lang/String;ILjava/lang/Integer;)V

    move v1, v12

    const/4 v4, 0x0

    goto :goto_2

    :cond_5
    move v12, v6

    move-object/from16 v18, v7

    const-string v3, "enable"

    .line 955
    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 958
    iget-object v3, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    const/4 v4, 0x0

    invoke-static {v3, v2, v12, v4}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$500(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;ZI)V

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    :goto_2
    move-object/from16 v7, v18

    goto :goto_1

    :cond_7
    if-nez v1, :cond_8

    .line 970
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-virtual {v1, v8}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->handleBeaconNotMatchedToZone(Lcom/shopkick/sdk/sensor/ShopBeaconReading;)V

    .line 974
    :cond_8
    iget-object v1, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$5;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$400(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V

    return-void
.end method
