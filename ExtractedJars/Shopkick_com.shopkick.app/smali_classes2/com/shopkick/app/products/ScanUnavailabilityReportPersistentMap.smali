.class public Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;
.super Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;
.source "ScanUnavailabilityReportPersistentMap.java"


# static fields
.field private static final DEFAULT_REPORT_PRUNE_INTERVAL_MS:J = 0x240c8400L

.field private static final QUEUE_FILENAME_SUFFIX:Ljava/lang/String; = "ScanUnavailabilityReportMap.dat"

.field private static instance:Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;-><init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;
    .locals 1

    .line 28
    sget-object v0, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->instance:Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;-><init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V

    sput-object v0, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->instance:Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    .line 31
    :cond_0
    sget-object p0, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->instance:Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    return-object p0
.end method

.method private getReportKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "--"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected destroyQueue()V
    .locals 1

    .line 41
    invoke-super {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->destroyQueue()V

    const/4 v0, 0x0

    .line 42
    sput-object v0, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->instance:Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    return-void
.end method

.method protected getQueueFileName()Ljava/lang/String;
    .locals 1

    const-string v0, "ScanUnavailabilityReportMap.dat"

    return-object v0
.end method

.method protected getTimestampToPrune()J
    .locals 4

    .line 49
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_SCANS_FOR_LOCATION_V2_SHORT_PRUNE_TIME"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x2710

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0x240c8400

    .line 51
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2
.end method

.method public isReported(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->getReportKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->isKeyAvailable(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public setReported(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->getReportKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->putKey(Ljava/lang/String;)V

    return-void
.end method
