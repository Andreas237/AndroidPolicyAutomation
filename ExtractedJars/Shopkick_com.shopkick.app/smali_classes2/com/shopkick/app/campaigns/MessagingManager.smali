.class Lcom/shopkick/app/campaigns/MessagingManager;
.super Ljava/lang/Object;
.source "MessagingManager.java"


# static fields
.field private static final SYSTEM_NOTIFICATIONS_TAG:Ljava/lang/String; = "ble_messaging_notification_tag"

.field private static final WALKIN_MESSAGING_CAMPAIGN_ID:Ljava/lang/String; = "-1"


# instance fields
.field private final appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final clockWrapper:Lcom/shopkick/app/util/ClockWrapper;

.field private final context:Landroid/content/Context;

.field private final logger:Lcom/shopkick/app/application/SKLogger;

.field private final walkinController:Lcom/shopkick/app/presence/WalkinController;

.field private final walkinListener:Lcom/shopkick/app/campaigns/WalkinListener;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/presence/WalkinController;Lcom/shopkick/app/application/SKLogger;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/util/Clock;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/shopkick/app/account/UserAccount;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/shopkick/app/application/ClientFlagsManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/shopkick/app/application/AppPreferences;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/shopkick/app/presence/WalkinController;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/shopkick/app/application/SKLogger;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Lcom/shopkick/app/campaigns/MessagingManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/campaigns/MessagingManager$1;-><init>(Lcom/shopkick/app/campaigns/MessagingManager;)V

    iput-object v0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinListener:Lcom/shopkick/app/campaigns/WalkinListener;

    if-eqz p1, :cond_6

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    if-eqz p4, :cond_3

    if-eqz p5, :cond_2

    if-eqz p6, :cond_1

    if-eqz p7, :cond_0

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    .line 80
    new-instance p1, Lcom/shopkick/app/util/ClockWrapper;

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/util/ClockWrapper;-><init>(Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;)V

    iput-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clockWrapper:Lcom/shopkick/app/util/ClockWrapper;

    .line 81
    iput-object p4, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 82
    iput-object p5, p0, Lcom/shopkick/app/campaigns/MessagingManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 83
    iput-object p6, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 84
    iput-object p7, p0, Lcom/shopkick/app/campaigns/MessagingManager;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/shopkick/app/campaigns/MessagingPersistence;->initialize(Landroid/content/Context;)V

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinListener:Lcom/shopkick/app/campaigns/WalkinListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/presence/WalkinController;->registerWalkinListener(Lcom/shopkick/app/campaigns/WalkinListener;)V

    return-void

    .line 77
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'logger\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'walkinController\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 75
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'appPrefs\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 74
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'clientFlagsManager\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'userAccount\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 72
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'clock\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'context\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/shopkick/app/campaigns/MessagingManager;Landroid/location/Location;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/campaigns/MessagingManager;->makeWalkinRequest(Landroid/location/Location;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/campaigns/MessagingManager;)Lcom/shopkick/app/application/ClientFlagsManager;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/campaigns/MessagingManager;)Lcom/shopkick/app/application/SKLogger;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->logger:Lcom/shopkick/app/application/SKLogger;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/campaigns/MessagingManager;ZLjava/lang/String;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/campaigns/MessagingManager;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/campaigns/MessagingManager;)Lcom/shopkick/app/presence/WalkinController;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    return-object p0
.end method

.method private makeWalkinCallback(ZLjava/lang/String;I)V
    .locals 1

    .line 600
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void
.end method

.method private makeWalkinRequest(Landroid/location/Location;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V
    .locals 12
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/sdk/zone/ZoneReading;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 415
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x3

    .line 418
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    .line 419
    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 420
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    sget-object v7, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v7}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    or-long/2addr v5, v7

    const-string v7, "MessagingManager.makeWalkinRequest() [lat:%1$f lon:%2$f]"

    new-array v8, v2, [Ljava/lang/Object;

    .line 422
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v8, v1

    const/4 v9, 0x1

    .line 423
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v8, v9

    .line 420
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_6

    if-eqz p2, :cond_5

    .line 430
    invoke-interface {p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v4

    const-string v5, "retail.chain_id"

    invoke-interface {v4, v5}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    .line 431
    invoke-interface {p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v4

    const-string v5, "retail.store_id"

    invoke-interface {v4, v5}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljava/lang/String;

    .line 432
    invoke-interface {p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v4

    const-string v5, "retail.department_id"

    invoke-interface {v4, v5}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 433
    invoke-interface {p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getSensorData()Ljava/util/Map;

    move-result-object v5

    const-string v6, "ble-data"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 436
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 437
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 438
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 441
    new-instance v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    invoke-direct {v7}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;-><init>()V

    .line 442
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    iput-object v6, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->lat:Ljava/lang/Double;

    .line 443
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    iput-object v6, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->lng:Ljava/lang/Double;

    .line 444
    iput-object v5, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->beaconData:Ljava/lang/String;

    .line 445
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->currTimestamp:Ljava/lang/Long;

    .line 446
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinType:Ljava/lang/Integer;

    .line 447
    iput-object v9, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->locationId:Ljava/lang/String;

    .line 448
    iput-object v4, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->departmentId:Ljava/lang/String;

    .line 449
    iput-object p3, v7, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinStarter:Ljava/lang/Integer;

    .line 452
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    const/16 v4, 0x81

    .line 453
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 454
    invoke-interface {p2}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/shopkick/app/campaigns/LoggingUtility;->addZoneIdsToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/sdk/zone/Zone;)V

    .line 455
    invoke-static {v0, p1}, Lcom/shopkick/app/campaigns/LoggingUtility;->addLocationToLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Landroid/location/Location;)V

    .line 458
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    if-eq p1, p2, :cond_0

    .line 462
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Lcom/shopkick/app/campaigns/MessagingManager$4;

    move-object v5, p2

    move-object v6, p0

    move-object v10, p3

    invoke-direct/range {v5 .. v10}, Lcom/shopkick/app/campaigns/MessagingManager$4;-><init>(Lcom/shopkick/app/campaigns/MessagingManager;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 484
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {p1, v7, v8, v9, v3}, Lcom/shopkick/app/presence/WalkinController;->issueWalkinRequest(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    :goto_0
    invoke-static {v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 496
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 497
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_1
    return-void

    .line 438
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'beaconData\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 437
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'locationId\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 436
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'chainId\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 427
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'reading\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 426
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'location\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 488
    :try_start_2
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, v2, :cond_7

    const-string p2, "BLE: MessagingManager.makeWalkinRequest() exception"

    .line 489
    invoke-direct {p0, v1, p2, v3}, Lcom/shopkick/app/campaigns/MessagingManager;->makeWalkinCallback(ZLjava/lang/String;I)V

    :cond_7
    const/16 p2, 0x3b8

    .line 491
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/16 p2, 0xd

    .line 492
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 493
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 495
    :goto_1
    invoke-static {v0}, Lcom/shopkick/app/campaigns/LoggingUtility;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 496
    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 497
    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_8
    throw p1
.end method

.method private showBleMessageSystemNotification(Lcom/shopkick/app/fetchers/api/skapi/Message;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 508
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/Message;->notificationTitle:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Message;->notificationMessage:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/campaigns/MessagingManager;->showBleMessageSystemNotification(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 506
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'message\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private startWalkinRequest(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V
    .locals 5
    .param p1    # Lcom/shopkick/sdk/zone/ZoneReading;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 373
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 375
    invoke-direct {p0, v0, p1, p2}, Lcom/shopkick/app/campaigns/MessagingManager;->makeWalkinRequest(Landroid/location/Location;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V

    goto :goto_0

    .line 378
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 379
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 380
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "MessagingManager.startWalkinRequest() Initiating async location request"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 384
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/campaigns/MessagingManager$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/app/campaigns/MessagingManager$3;-><init>(Lcom/shopkick/app/campaigns/MessagingManager;Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->initiateLocationUpdate(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method canDoWalkin(Lcom/shopkick/sdk/zone/ZoneReading;)Z
    .locals 4
    .param p1    # Lcom/shopkick/sdk/zone/ZoneReading;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 121
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v0

    const-string v1, "retail.chain_id"

    invoke-interface {v0, v1}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 122
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object p1

    const-string v1, "retail.department_id"

    invoke-interface {p1, v1}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 125
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 127
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object v1

    .line 130
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingManager;->millisecondsSince2AM()J

    move-result-wide v2

    .line 128
    invoke-virtual {v1, v0, p1, v2, v3}, Lcom/shopkick/app/campaigns/MessagingPersistence;->hasObservedWalkinMessage(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    .line 125
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\'chainId\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 118
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'reading\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method cancelBleMessageSystemNotification(Ljava/lang/String;)V
    .locals 2

    .line 588
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    .line 589
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    const-string v1, "notification"

    .line 590
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    const-string v1, "ble_messaging_notification_tag"

    .line 591
    invoke-virtual {v0, v1, p1}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void
.end method

.method doNotification(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11
    .param p1    # Lcom/shopkick/app/fetchers/api/skapi/Campaign;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_2

    .line 291
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 294
    iget-object v1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isNearOrInStoreNotificationEnabled(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 297
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object v2

    sget-object v3, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Notification:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/Message;->departmentMessagingConfigId:Ljava/lang/String;

    .line 302
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingManager;->millisecondsSince2AM()J

    move-result-wide v7

    move-object v5, p2

    move-object v6, p3

    .line 298
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/campaigns/MessagingPersistence;->hasObservedMessage(Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 306
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    invoke-direct {p0, v1}, Lcom/shopkick/app/campaigns/MessagingManager;->showBleMessageSystemNotification(Lcom/shopkick/app/fetchers/api/skapi/Message;)V

    .line 309
    new-instance v1, Lcom/shopkick/app/campaigns/MessageHistoryRecord;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Notification:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const/4 v6, 0x2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    iget-object v7, p1, Lcom/shopkick/app/fetchers/api/skapi/Message;->departmentMessagingConfigId:Ljava/lang/String;

    move-object v2, v1

    move-object v8, p2

    move-object v9, p4

    move-object v10, p3

    invoke-direct/range {v2 .. v10}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;-><init>(JLcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/campaigns/MessagingPersistence;->observe(Lcom/shopkick/app/campaigns/MessageHistoryRecord;)Z

    :cond_0
    return v0

    .line 291
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'chainId\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 290
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'campaign\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method doNotificationWithCustomTitleAndMessage(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    if-eqz p1, :cond_2

    .line 331
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v0

    const-string v1, "retail.chain_id"

    invoke-interface {v0, v1}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 332
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object v1

    const-string v2, "retail.store_id"

    invoke-interface {v1, v2}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    .line 333
    invoke-interface {p1}, Lcom/shopkick/sdk/zone/ZoneReading;->getZone()Lcom/shopkick/sdk/zone/Zone;

    move-result-object p1

    const-string v1, "retail.department_id"

    invoke-interface {p1, v1}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    .line 335
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 339
    iget-object v1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isNearOrInStoreNotificationEnabled(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 342
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object v1

    sget-object v2, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Notification:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const-string v3, "-1"

    .line 347
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingManager;->millisecondsSince2AM()J

    move-result-wide v6

    move-object v4, v0

    move-object v5, v9

    .line 343
    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/campaigns/MessagingPersistence;->hasObservedMessage(Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 351
    invoke-virtual {p0, p2, p3}, Lcom/shopkick/app/campaigns/MessagingManager;->showBleMessageSystemNotification(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    new-instance p2, Lcom/shopkick/app/campaigns/MessageHistoryRecord;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Notification:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const/4 v5, 0x2

    const-string v6, "-1"

    move-object v1, p2

    move-object v7, v0

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/app/campaigns/MessageHistoryRecord;-><init>(JLcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/shopkick/app/campaigns/MessagingPersistence;->observe(Lcom/shopkick/app/campaigns/MessageHistoryRecord;)Z

    :cond_0
    return p1

    .line 335
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'chainId\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 329
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'reading\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method doOverlay(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11
    .param p1    # Lcom/shopkick/app/fetchers/api/skapi/Campaign;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_2

    .line 179
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 181
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/campaigns/MessagingManager;->shouldShowOverlay(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x4

    if-eqz v0, :cond_0

    .line 183
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v6

    .line 184
    invoke-virtual {v6}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v6

    sget-object v7, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 185
    invoke-virtual {v7}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    sget-object v9, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v9}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v9

    or-long/2addr v7, v9

    const-string v9, "MessagingManager: [BLE_MESSAGING] doOverlay() should show overlay, adding overlay for chain id: %s, location id: %s, department id: %s, campaign: %s"

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p2, v5, v4

    aput-object p4, v5, v3

    aput-object p3, v5, v2

    aput-object p1, v5, v1

    invoke-virtual {v6, v7, v8, v9, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 194
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Message;->overlay:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    new-instance v9, Lcom/shopkick/app/campaigns/MessagingManager$2;

    move-object v3, v9

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p4

    move-object v8, p3

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/campaigns/MessagingManager$2;-><init>(Lcom/shopkick/app/campaigns/MessagingManager;Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v9}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addRawOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    goto :goto_0

    .line 242
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v6

    .line 243
    invoke-virtual {v6}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v6

    sget-object v7, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 244
    invoke-virtual {v7}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    sget-object v9, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v9}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v9

    or-long/2addr v7, v9

    const-string v9, "MessagingManager: [BLE_MESSAGING] doOverlay() shouldn\'t show overlay for chain id: %s, location id: %s, department id: %s, campaign: %s"

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p2, v5, v4

    aput-object p4, v5, v3

    aput-object p3, v5, v2

    aput-object p1, v5, v1

    invoke-virtual {v6, v7, v8, v9, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v0

    .line 179
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'chainId\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 178
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'campaign\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method doWalkin(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)Z
    .locals 8
    .param p1    # Lcom/shopkick/sdk/zone/ZoneReading;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/WalkinController;->isManualWalkin()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isAutomaticWalkinsDisabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 143
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 144
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object p2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string p2, "CHECKIN: MessagingManager: doWalkin() from automatic when manual only"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, p2, v0}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 149
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/campaigns/MessagingManager;->canDoWalkin(Lcom/shopkick/sdk/zone/ZoneReading;)Z

    move-result v0

    .line 151
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 152
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 153
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "MessagingManager.doWalkin() [shouldDoWalkin:%1$s]"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    .line 155
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v6, v1

    .line 153
    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    .line 157
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/campaigns/MessagingManager;->startWalkinRequest(Lcom/shopkick/sdk/zone/ZoneReading;Ljava/lang/Integer;)V

    goto :goto_0

    .line 159
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    const-string p1, "BLE: MessagingManager: shouldDoWalkin false"

    const/4 p2, 0x3

    .line 160
    invoke-direct {p0, v1, p1, p2}, Lcom/shopkick/app/campaigns/MessagingManager;->makeWalkinCallback(ZLjava/lang/String;I)V

    :cond_2
    :goto_0
    return v0
.end method

.method millisecondsSince2AM()J
    .locals 4

    .line 596
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->clockWrapper:Lcom/shopkick/app/util/ClockWrapper;

    invoke-virtual {v2}, Lcom/shopkick/app/util/ClockWrapper;->mostRecent2AM()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method shouldShowOverlay(Lcom/shopkick/app/fetchers/api/skapi/Campaign;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9
    .param p1    # Lcom/shopkick/app/fetchers/api/skapi/Campaign;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_2

    .line 262
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 265
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 268
    invoke-static {}, Lcom/shopkick/app/campaigns/MessagingPersistence;->getInstance()Lcom/shopkick/app/campaigns/MessagingPersistence;

    move-result-object v2

    sget-object v3, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Overlay:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Campaign;->message:Lcom/shopkick/app/fetchers/api/skapi/Message;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/Message;->departmentMessagingConfigId:Ljava/lang/String;

    .line 273
    invoke-virtual {p0}, Lcom/shopkick/app/campaigns/MessagingManager;->millisecondsSince2AM()J

    move-result-wide v7

    move-object v5, p2

    move-object v6, p3

    .line 269
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/campaigns/MessagingPersistence;->hasObservedMessage(Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    :cond_0
    return v0

    .line 262
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'chainId\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 261
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'campaign\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method showBleMessageSystemNotification(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 514
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 515
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 516
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 517
    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object p2, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string p2, "onEntered() BLE message campaign received with no message"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, p2, v0}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 522
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 523
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 524
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 525
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "onEntered() BLE message campaign received with no title, using default"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v4}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 527
    iget-object p1, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    const v0, 0x7f110036

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 531
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 532
    iget-object v2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    const-string v3, "notification"

    .line 533
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    .line 536
    new-instance v3, Landroid/support/v4/app/NotificationCompat$Builder;

    iget-object v4, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    const-string/jumbo v5, "shopkick_notif_channel_geofence"

    invoke-direct {v3, v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    .line 538
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060135

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setColor(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    const v4, 0x7f0801af

    .line 539
    invoke-virtual {v3, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    .line 540
    invoke-virtual {v3, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    .line 541
    invoke-virtual {p1, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    new-instance v3, Landroid/support/v4/app/NotificationCompat$BigTextStyle;

    invoke-direct {v3}, Landroid/support/v4/app/NotificationCompat$BigTextStyle;-><init>()V

    .line 542
    invoke-virtual {v3, p2}, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 544
    invoke-virtual {p1, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    .line 545
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    .line 548
    new-instance v3, Landroid/content/Intent;

    iget-object v4, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    const-class v5, Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "fromLocalNotif"

    .line 549
    invoke-virtual {v3, v4, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p2, "localNotifId"

    const-string v4, "ble_messaging_notification_tag"

    .line 550
    invoke-virtual {v3, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p2, 0x24000000

    .line 551
    invoke-virtual {v3, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const p2, 0x10008000

    .line 552
    invoke-virtual {v3, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 553
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 554
    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->context:Landroid/content/Context;

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {p2, v1, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    .line 558
    invoke-virtual {p1, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 561
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    .line 562
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge p2, v1, :cond_3

    .line 563
    iget p2, p1, Landroid/app/Notification;->defaults:I

    or-int/lit8 p2, p2, 0x4

    iput p2, p1, Landroid/app/Notification;->defaults:I

    .line 564
    iget p2, p1, Landroid/app/Notification;->flags:I

    or-int/lit8 p2, p2, 0x10

    iput p2, p1, Landroid/app/Notification;->flags:I

    .line 567
    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->isSoundEnabled()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "android.resource://com.shopkick.app/2131755013"

    .line 568
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    iput-object p2, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 570
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->isVibrateEnabled()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 571
    iget p2, p1, Landroid/app/Notification;->defaults:I

    or-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/app/Notification;->defaults:I

    .line 576
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/campaigns/MessagingManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->arePushNotificationsEnabled()Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "ble_messaging_notification_tag"

    .line 577
    invoke-virtual {v2, p2, v0, p1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    :cond_4
    return-void
.end method
