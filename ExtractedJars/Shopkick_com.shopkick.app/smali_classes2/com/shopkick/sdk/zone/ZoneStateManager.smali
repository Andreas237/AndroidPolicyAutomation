.class Lcom/shopkick/sdk/zone/ZoneStateManager;
.super Ljava/lang/Object;
.source "ZoneStateManager.java"


# instance fields
.field private final FallbackWorkCompletedBeacons:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final LoggedBeaconMatchedToZone:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final LoggedBeaconNotMatchedToZone:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final LoggedZoneEntered:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final listenersToCheckForEvents:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;",
            "Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;",
            ">;"
        }
    .end annotation
.end field

.field private final zoneToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/zone/Zone;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->listenersToCheckForEvents:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->zoneToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->LoggedBeaconMatchedToZone:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 34
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->LoggedBeaconNotMatchedToZone:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 35
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->LoggedZoneEntered:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 40
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->FallbackWorkCompletedBeacons:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-void
.end method


# virtual methods
.method getFallbackWorkCompletedBeacons()Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->FallbackWorkCompletedBeacons:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object v0
.end method

.method getListenersToCheckForEvents()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;",
            "Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->listenersToCheckForEvents:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method getLoggedBeaconMatchedToZone()Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->LoggedBeaconMatchedToZone:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object v0
.end method

.method getLoggedBeaconNotMatchedToZone()Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->LoggedBeaconNotMatchedToZone:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object v0
.end method

.method getLoggedZoneEntered()Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->LoggedZoneEntered:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object v0
.end method

.method getZoneToProximityToListener()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/zone/Zone;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;",
            ">;>;>;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneStateManager;->zoneToProximityToListener:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method
