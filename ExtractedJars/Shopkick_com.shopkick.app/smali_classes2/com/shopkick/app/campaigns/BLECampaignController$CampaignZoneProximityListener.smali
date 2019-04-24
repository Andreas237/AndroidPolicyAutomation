.class Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;
.super Ljava/lang/Object;
.source "BLECampaignController.java"

# interfaces
.implements Lcom/shopkick/sdk/zone/ZoneProximityListener;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/campaigns/BLECampaignController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CampaignZoneProximityListener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/zone/ZoneProximityListener;",
        "Ljava/lang/Comparable<",
        "Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

.field private final campaignText:Ljava/lang/String;

.field private final hashCode:I

.field final synthetic this$0:Lcom/shopkick/app/campaigns/BLECampaignController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/app/fetchers/api/skapi/Campaign;)V
    .locals 0

    .line 427
    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 428
    iput-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    .line 429
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaignText:Ljava/lang/String;

    .line 430
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaignText:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->hashCode:I

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V
    .locals 0

    .line 420
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->doDebugLogging(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;)Lcom/shopkick/app/fetchers/api/skapi/Campaign;
    .locals 0

    .line 420
    iget-object p0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    return-object p0
.end method

.method private doDebugLogging(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V
    .locals 6

    .line 442
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "BLECampaignController: %1$s [background:%2$s] [campaign:%3$s] [zone:%4$s]"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    .line 445
    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v2, v4

    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaignText:Ljava/lang/String;

    const/4 v4, 0x2

    aput-object p1, v2, v4

    .line 447
    invoke-direct {p0, p2}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->getZoneText(Lcom/shopkick/sdk/zone/ZoneReading;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v2, p2

    .line 442
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 448
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    .line 449
    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 450
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v0, v4

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, p1, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private getZoneText(Lcom/shopkick/sdk/zone/ZoneReading;)Ljava/lang/String;
    .locals 5

    .line 434
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Zone [id:%1$s proximity:%2$d confidence:%3$d]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    .line 436
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v3

    invoke-interface {v3}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 437
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getProximity()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 438
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getConfidence()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x2

    aput-object p1, v2, v3

    .line 434
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private logCampaignTriggered(Lcom/shopkick/sdk/zone/Zone;)V
    .locals 2

    .line 653
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x72bf6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v1, 0x3

    .line 654
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 655
    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCampaignType(Ljava/lang/Integer;)V

    .line 656
    iget-object v1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsAppBackgrounded(Ljava/lang/Boolean;)V

    .line 657
    invoke-static {v0, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 659
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    .line 658
    invoke-static {v0, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 660
    invoke-static {v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 661
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 662
    iget-object p1, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;)I
    .locals 1

    .line 643
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->hashCode()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 420
    check-cast p1, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->compareTo(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 630
    :cond_0
    instance-of v1, p1, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;

    if-nez v1, :cond_1

    return v0

    .line 631
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v1, p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 620
    iget v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->hashCode:I

    return v0
.end method

.method public onDwelled(ILcom/shopkick/sdk/zone/ZoneReading;)V
    .locals 2
    .param p2    # Lcom/shopkick/sdk/zone/ZoneReading;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "onDwelled()"

    .line 607
    invoke-direct {p0, v0, p2}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->doDebugLogging(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V

    .line 610
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$300(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-interface {p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 611
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->onEntered(ILcom/shopkick/sdk/zone/ZoneReading;)V

    :cond_0
    return-void
.end method

.method public onEntered(ILcom/shopkick/sdk/zone/ZoneReading;)V
    .locals 17
    .param p2    # Lcom/shopkick/sdk/zone/ZoneReading;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v7, p0

    move-object/from16 v8, p2

    const-string v0, "onEntered()"

    .line 455
    invoke-direct {v7, v0, v8}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->doDebugLogging(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V

    .line 458
    invoke-interface/range {p2 .. p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v0

    .line 459
    iget-object v1, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$300(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    .line 460
    invoke-direct {v7, v0}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->logCampaignTriggered(Lcom/shopkick/sdk/zone/Zone;)V

    const/16 v9, 0x3b8

    const/4 v10, 0x3

    const/4 v1, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    :try_start_0
    const-string v2, "retail.chain_id"

    .line 466
    invoke-interface {v0, v2}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    const-string v2, "retail.store_id"

    .line 467
    invoke-interface {v0, v2}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    const-string v2, "retail.department_id"

    .line 468
    invoke-interface {v0, v2}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    .line 471
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 472
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 475
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    iget-object v3, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    invoke-static {v2, v3}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$400(Lcom/shopkick/app/campaigns/BLECampaignController;Lcom/shopkick/app/fetchers/api/skapi/Campaign;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 476
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v11, :cond_1

    .line 478
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 482
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 483
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 484
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "BLECampaignController: onEntered() App in background, queueing walkin [zoneId:%1$s]"

    new-array v6, v11, [Ljava/lang/Object;

    .line 486
    invoke-interface {v0}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v6, v1

    .line 484
    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 487
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$500(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-interface {v0}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinButtonEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    .line 491
    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/shopkick/app/campaigns/MessagingManager;->canDoWalkin(Lcom/shopkick/sdk/zone/ZoneReading;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 492
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object v0

    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    .line 493
    invoke-static {v2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$800(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    .line 494
    invoke-static {v3}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$900(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/lang/String;

    move-result-object v3

    .line 492
    invoke-virtual {v0, v8, v2, v3}, Lcom/shopkick/app/campaigns/MessagingManager;->doNotificationWithCustomTitleAndMessage(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/String;Ljava/lang/String;)Z

    goto/16 :goto_0

    .line 498
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 499
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 500
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "BLECampaignController: onEntered() App in foreground, attempting walkin [zoneId:%1$s]"

    new-array v6, v11, [Ljava/lang/Object;

    .line 502
    invoke-interface {v0}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v1

    .line 500
    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 503
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v8, v2}, Lcom/shopkick/app/campaigns/MessagingManager;->doWalkin(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)Z

    move-result v1

    goto/16 :goto_0

    .line 505
    :cond_1
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    .line 506
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    if-nez v2, :cond_2

    .line 507
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 508
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 509
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "BLECampaignController: onEntered() BLE message campaign received with NULL message"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 511
    :cond_2
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBLEMessagingEnabled()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 513
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$200(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/AppActivityManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 514
    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object v2

    iget-object v3, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    invoke-virtual {v2, v3, v4, v5}, Lcom/shopkick/app/campaigns/MessagingManager;->shouldShowOverlay(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 516
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 517
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 518
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v13

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v15

    or-long/2addr v13, v15

    const-string v3, "BLECampaignController: onEntered() App in background, showing system notification [zoneId:%1$s]"

    new-array v15, v11, [Ljava/lang/Object;

    .line 520
    invoke-interface {v0}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v15, v1

    .line 518
    invoke-virtual {v2, v13, v14, v3, v15}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 521
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object v0

    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    invoke-virtual {v0, v2, v4, v5, v6}, Lcom/shopkick/app/campaigns/MessagingManager;->doNotification(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    goto/16 :goto_0

    .line 526
    :cond_3
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Message;->overlay:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_4

    .line 527
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$700(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/campaigns/MessagingManager;

    move-result-object v0

    iget-object v2, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    invoke-virtual {v0, v2, v4, v5}, Lcom/shopkick/app/campaigns/MessagingManager;->shouldShowOverlay(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "[BLE_MESSAGING] App in foreground, should show overlay, posting runnable"

    .line 529
    invoke-direct {v7, v0, v8}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->doDebugLogging(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 536
    :try_start_1
    invoke-static {}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1200()Landroid/os/Handler;

    move-result-object v0

    new-instance v13, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;

    move-object v1, v13

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener$1;-><init>(Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v13, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v1, v11

    goto :goto_0

    :catchall_0
    move-exception v0

    move v1, v11

    goto/16 :goto_3

    :catch_0
    move v1, v11

    goto/16 :goto_1

    .line 545
    :cond_4
    :try_start_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 546
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 547
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "BLECampaignController: onEntered() BLE message campaign received that we are unable to handle"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 553
    :cond_5
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 554
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 555
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "BLECampaignController: onEntered() BLE campaign received with unknown campaign type [%1$d]"

    new-array v5, v11, [Ljava/lang/Object;

    iget-object v6, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    aput-object v6, v5, v1

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_6
    :goto_0
    if-nez v1, :cond_7

    .line 568
    new-instance v12, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v12}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 569
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    :cond_7
    if-eqz v12, :cond_a

    .line 574
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 575
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 576
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {v12, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCampaignType(Ljava/lang/Integer;)V

    .line 577
    invoke-interface/range {p2 .. p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v0

    invoke-static {v12, v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 579
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 578
    invoke-static {v12, v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 580
    invoke-static {v12}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 581
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 582
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object v0

    iget-object v1, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    goto :goto_2

    .line 472
    :cond_8
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "\'locationId\' cannot be null"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 471
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "\'chainId\' cannot be null"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_3

    .line 563
    :catch_1
    :goto_1
    :try_start_4
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const/16 v0, 0xd

    .line 564
    :try_start_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 574
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 575
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 576
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCampaignType(Ljava/lang/Integer;)V

    .line 577
    invoke-interface/range {p2 .. p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 579
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 578
    invoke-static {v2, v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 580
    invoke-static {v2}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 581
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 582
    iget-object v0, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v0}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object v0

    iget-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    :goto_2
    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_a
    return-void

    :catchall_2
    move-exception v0

    move-object v12, v2

    :goto_3
    if-nez v12, :cond_b

    if-nez v1, :cond_b

    .line 568
    new-instance v12, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v12}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 569
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    :cond_b
    if-eqz v12, :cond_c

    .line 574
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 575
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 576
    iget-object v1, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaign:Lcom/shopkick/app/fetchers/api/skapi/Campaign;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {v12, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCampaignType(Ljava/lang/Integer;)V

    .line 577
    invoke-interface/range {p2 .. p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v1

    invoke-static {v12, v1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 579
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v1

    .line 578
    invoke-static {v12, v1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 580
    invoke-static {v12}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 581
    iget-object v1, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$600(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 582
    iget-object v1, v7, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {v1}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$1300(Lcom/shopkick/app/campaigns/BLECampaignController;)Lcom/shopkick/app/application/SKLogger;

    move-result-object v1

    iget-object v2, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_c
    throw v0
.end method

.method public onExited(ILcom/shopkick/sdk/zone/ZoneReading;)V
    .locals 5
    .param p2    # Lcom/shopkick/sdk/zone/ZoneReading;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "onExited()"

    .line 590
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->doDebugLogging(Ljava/lang/String;Lcom/shopkick/sdk/zone/ZoneReading;)V

    .line 593
    invoke-interface {p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object p1

    .line 594
    iget-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$300(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    .line 595
    iget-object p2, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->this$0:Lcom/shopkick/app/campaigns/BLECampaignController;

    invoke-static {p2}, Lcom/shopkick/app/campaigns/BLECampaignController;->access$500(Lcom/shopkick/app/campaigns/BLECampaignController;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-interface {p1}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/zone/ZoneReading;

    if-eqz p1, :cond_0

    .line 597
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p2

    .line 598
    invoke-virtual {p2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p2

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 599
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "BLECampaignController: Zone exited, removed cached walkin [zoneId:%1$s]"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 601
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v4

    .line 599
    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 637
    iget-object v0, p0, Lcom/shopkick/app/campaigns/BLECampaignController$CampaignZoneProximityListener;->campaignText:Ljava/lang/String;

    return-object v0
.end method
