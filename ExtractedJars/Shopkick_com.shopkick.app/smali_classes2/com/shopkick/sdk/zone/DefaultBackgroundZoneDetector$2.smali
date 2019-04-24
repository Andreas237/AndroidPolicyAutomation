.class Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;
.super Ljava/lang/Object;
.source "DefaultBackgroundZoneDetector.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 159
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v0, v0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 160
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    sget-object v3, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->SHOPKICK_BEACON:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v2, v3}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getLastCalled()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x7530

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 162
    new-instance v2, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    .line 163
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v4

    .line 164
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/4 v7, 0x1

    .line 166
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getProximity()I

    move-result v8

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JII)V

    .line 167
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;

    move-result-object v3

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getProximity()I

    move-result v4

    invoke-interface {v3, v4, v2}, Lcom/shopkick/sdk/zone/ZoneProximityListener;->onExited(ILcom/shopkick/sdk/zone/ZoneReading;)V

    const/4 v2, 0x0

    .line 168
    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->setWithinZone(Z)V

    .line 169
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 171
    :cond_1
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$2;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    sget-object v2, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->LOCATION_SERVICE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v1, v2}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->equals(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method
