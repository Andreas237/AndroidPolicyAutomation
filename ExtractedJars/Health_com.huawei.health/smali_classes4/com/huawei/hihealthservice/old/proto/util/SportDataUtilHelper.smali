.class public Lcom/huawei/hihealthservice/old/proto/util/SportDataUtilHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized convertSportData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;Lcom/huawei/hihealthservice/old/model/SportData;)V
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtilHelper;

    monitor-enter v9

    .line 51
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    const/4 v0, 0x0

    if-eq v0, p0, :cond_3

    .line 53
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 55
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->getBaseHealthDataBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertHealthData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData$Builder;Lcom/huawei/hihealthservice/old/model/HealthData;)V

    .line 57
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getTotalCalories()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalCalories(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    .line 58
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getTotalSteps()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalSteps(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    .line 59
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getTotalDistance()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalDistance(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v0

    .line 60
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getTotalStoreys()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->setTotalStoreys(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 63
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getCalories()[I

    move-result-object v3

    .line 65
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    array-length v0, v3

    if-lez v0, :cond_0

    .line 67
    array-length v4, v3

    .line 68
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 70
    aget v0, v3, v5

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->addCalories(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 68
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getSteps()[I

    move-result-object v5

    .line 76
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    array-length v0, v5

    if-lez v0, :cond_1

    .line 78
    array-length v4, v5

    .line 79
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_1

    .line 81
    aget v0, v5, v6

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->addSteps(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 79
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getDistances()[I

    move-result-object v6

    .line 86
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    array-length v0, v6

    if-lez v0, :cond_2

    .line 88
    array-length v4, v6

    .line 89
    const/4 v7, 0x0

    :goto_2
    if-ge v7, v4, :cond_2

    .line 91
    aget v0, v6, v7

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->addDistances(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    .line 89
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getStoreys()[I

    move-result-object v7

    .line 96
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    array-length v0, v7

    if-lez v0, :cond_3

    .line 98
    array-length v4, v7

    .line 99
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v4, :cond_3

    .line 101
    aget v0, v7, v8

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->addStoreys(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 105
    :cond_3
    monitor-exit v9

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method

.method public static getByteArraySportData([Lcom/huawei/hihealthservice/old/model/SportData;)Ljava/lang/String;
    .locals 1

    .line 13
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtilHelper;->getByteArraySportDataSync([Lcom/huawei/hihealthservice/old/model/SportData;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized getByteArraySportDataSync([Lcom/huawei/hihealthservice/old/model/SportData;)Ljava/lang/String;
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtilHelper;

    monitor-enter v9

    .line 19
    const/4 v2, 0x0

    .line 22
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getSportArraybuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    move-result-object v3

    .line 23
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtoApplication;->getSportbuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;

    move-result-object v4

    .line 25
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 27
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    .line 29
    move-object v5, p0

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 31
    invoke-static {v4, v8}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtilHelper;->convertSportData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;Lcom/huawei/hihealthservice/old/model/SportData;)V

    .line 32
    invoke-virtual {v3, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->addSportData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    .line 29
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->toByteArray()[B

    move-result-object v5

    .line 37
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 39
    array-length v0, v5

    const/4 v1, 0x0

    invoke-static {v5, v1, v0}, Lcom/huawei/hihealthservice/old/util/Base64;->encoding([BII)Ljava/lang/String;

    move-result-object v2

    .line 42
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray$Builder;

    .line 44
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :cond_2
    monitor-exit v9

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method
