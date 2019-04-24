.class public Lcom/shopkick/sdk/analytics/BeaconProcessor;
.super Ljava/lang/Object;
.source "BeaconProcessor.java"


# instance fields
.field private final appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

.field private final beaconHistory:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            "Lcom/shopkick/sdk/scanner/ShopBeaconInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final eventLogger:Lcom/shopkick/sdk/core/EventLogger;

.field private final serverFlags:Lcom/shopkick/sdk/core/ServerFlags;


# direct methods
.method public constructor <init>(Lcom/shopkick/sdk/core/EventLogger;Ljava/util/Map;Lcom/shopkick/app/application/AppStatusManager;Lcom/shopkick/sdk/core/ServerFlags;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/core/EventLogger;",
            "Ljava/util/Map<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            "Lcom/shopkick/sdk/scanner/ShopBeaconInfo;",
            ">;",
            "Lcom/shopkick/app/application/AppStatusManager;",
            "Lcom/shopkick/sdk/core/ServerFlags;",
            ")V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/shopkick/sdk/analytics/BeaconProcessor;->eventLogger:Lcom/shopkick/sdk/core/EventLogger;

    .line 26
    iput-object p2, p0, Lcom/shopkick/sdk/analytics/BeaconProcessor;->beaconHistory:Ljava/util/Map;

    .line 27
    iput-object p3, p0, Lcom/shopkick/sdk/analytics/BeaconProcessor;->appStatusManager:Lcom/shopkick/app/application/AppStatusManager;

    .line 28
    iput-object p4, p0, Lcom/shopkick/sdk/analytics/BeaconProcessor;->serverFlags:Lcom/shopkick/sdk/core/ServerFlags;

    return-void
.end method


# virtual methods
.method public getProximity(Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/zone/ble/Proximity;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/shopkick/sdk/analytics/BeaconProcessor;->beaconHistory:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 36
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getProximity()Lcom/shopkick/sdk/zone/ble/Proximity;

    move-result-object p1

    return-object p1
.end method
