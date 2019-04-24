.class Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;
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

    .line 125
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 127
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

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

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    .line 128
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

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

    .line 129
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v2, v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$000(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V

    goto :goto_0

    .line 130
    :cond_1
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    sget-object v3, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->LOCATION_SERVICE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v2, v3}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 132
    :cond_2
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    sget-object v3, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->GEOFENCE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v2, v3}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 133
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;

    invoke-static {v2, v1}, Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;->access$000(Lcom/shopkick/sdk/zone/DefaultBackgroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V

    goto :goto_0

    :cond_3
    return-void
.end method
