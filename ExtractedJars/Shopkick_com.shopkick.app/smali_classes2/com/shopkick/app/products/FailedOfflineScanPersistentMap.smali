.class public Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;
.super Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;
.source "FailedOfflineScanPersistentMap.java"


# static fields
.field private static final DEFAULT_PRUNE_INTERVAL_MS:J = 0x5265c00L

.field private static final QUEUE_FILENAME_SUFFIX:Ljava/lang/String; = "FailedOfflineScanMap.dat"

.field private static instance:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p3, p4}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;-><init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 28
    iput-object p2, p0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public static getInstance(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;
    .locals 1

    .line 35
    sget-object v0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->instance:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V

    sput-object v0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->instance:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    .line 38
    :cond_0
    sget-object p0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->instance:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    return-object p0
.end method


# virtual methods
.method protected destroyQueue()V
    .locals 1

    .line 48
    invoke-super {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->destroyQueue()V

    const/4 v0, 0x0

    .line 49
    sput-object v0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->instance:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    return-void
.end method

.method protected getQueueFileName()Ljava/lang/String;
    .locals 1

    const-string v0, "FailedOfflineScanMap.dat"

    return-object v0
.end method

.method protected getTimestampToPrune()J
    .locals 4

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineScanFailureStatusDataMaxAgeInSeconds:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineScanFailureStatusDataMaxAgeInSeconds:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineScanFailureStatusDataMaxAgeInSeconds:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0x5265c00

    .line 67
    :goto_0
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v2

    const-string v3, "FEATURE_FLAG_SCANS_FOR_LOCATION_V2_SHORT_PRUNE_TIME"

    invoke-virtual {v2, v3}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-wide/32 v0, 0x2bf20

    .line 69
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2
.end method
