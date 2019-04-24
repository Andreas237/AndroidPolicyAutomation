.class Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;
.super Ljava/lang/Object;
.source "DefaultForegroundZoneDetector.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 117
    iget-object v0, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v0, v0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

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

    .line 118
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    sget-object v3, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->SHOPKICK_BEACON:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v2, v3}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 119
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-static {v2, v1}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->access$000(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V

    goto :goto_0

    .line 120
    :cond_1
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

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

    .line 122
    :cond_2
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    iget-object v2, v2, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->zoneStateManager:Lcom/shopkick/sdk/zone/ZoneStateManager;

    invoke-virtual {v2}, Lcom/shopkick/sdk/zone/ZoneStateManager;->getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    sget-object v3, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->GEOFENCE:Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;

    invoke-virtual {v2, v3}, Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 123
    iget-object v2, p0, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector$1;->this$0:Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;

    invoke-static {v2, v1}, Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;->access$000(Lcom/shopkick/sdk/zone/DefaultForegroundZoneDetector;Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)V

    goto :goto_0

    :cond_3
    return-void
.end method
