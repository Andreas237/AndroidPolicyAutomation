.class public Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DE_SportDataUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized convertProtoSportData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/model/SportData;
    .locals 12

    const-class v11, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;

    monitor-enter v11

    .line 17
    const/4 v2, 0x0

    .line 19
    const/4 v0, 0x0

    if-eq v0, p0, :cond_13

    .line 21
    :try_start_0
    new-instance v2, Lcom/huawei/hihealthservice/old/model/SportData;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/model/SportData;-><init>()V

    .line 23
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;

    move-result-object v3

    .line 24
    const/4 v0, 0x0

    if-eq v0, v3, :cond_9

    .line 26
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasHuid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getHuid()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/SportData;->setHuid(J)V

    .line 30
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasType()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 32
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setType(I)V

    .line 35
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasSubType()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 37
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getSubType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setSubType(I)V

    .line 39
    :cond_2
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasDevice()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 41
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getDevice()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoDeviceInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$DeviceInfo;)Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setDevice(Lcom/huawei/hihealthservice/old/model/DeviceInfo;)V

    .line 43
    :cond_3
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasApp()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 45
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getApp()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoAppInfo(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setApp(Lcom/huawei/hihealthservice/old/model/AppInfo;)V

    .line 47
    :cond_4
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasRecordId()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 49
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getRecordId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setRecordId(Ljava/lang/String;)V

    .line 51
    :cond_5
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasTimeZone()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 53
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setTimeZone(Ljava/lang/String;)V

    .line 55
    :cond_6
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasStartTime()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 57
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/SportData;->setStartTime(J)V

    .line 59
    :cond_7
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasEndTime()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 61
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/SportData;->setEndTime(J)V

    .line 63
    :cond_8
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->hasLocation()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 65
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;->getLocation()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/HealthDataUtil;->convertProtoLocation(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$Location;)Lcom/huawei/hihealthservice/old/model/Location;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setLocation(Lcom/huawei/hihealthservice/old/model/Location;)V

    .line 69
    :cond_9
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalCalories()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/SportData;->setTotalCalories(J)V

    .line 70
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalSteps()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/SportData;->setTotalSteps(J)V

    .line 71
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalDistance()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/SportData;->setTotalDistance(J)V

    .line 73
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->hasTotalStoreys()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 75
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getTotalStoreys()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/model/SportData;->setTotalStoreys(J)V

    .line 78
    :cond_a
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getCaloriesList()Ljava/util/List;

    move-result-object v4

    .line 80
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 84
    if-lez v5, :cond_c

    .line 86
    new-array v7, v5, [I

    .line 88
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_b

    .line 90
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v7, v6

    .line 88
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 93
    :cond_b
    invoke-virtual {v2, v7}, Lcom/huawei/hihealthservice/old/model/SportData;->setCalories([I)V

    .line 96
    :cond_c
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getStepsList()Ljava/util/List;

    move-result-object v7

    .line 98
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v5

    .line 100
    if-lez v5, :cond_e

    .line 102
    new-array v8, v5, [I

    .line 104
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_d

    .line 106
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v8, v6

    .line 104
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 109
    :cond_d
    invoke-virtual {v2, v8}, Lcom/huawei/hihealthservice/old/model/SportData;->setSteps([I)V

    .line 112
    :cond_e
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getDistancesList()Ljava/util/List;

    move-result-object v8

    .line 114
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    .line 116
    if-lez v5, :cond_10

    .line 118
    new-array v9, v5, [I

    .line 120
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_f

    .line 122
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v9, v6

    .line 120
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 125
    :cond_f
    invoke-virtual {v2, v9}, Lcom/huawei/hihealthservice/old/model/SportData;->setDistances([I)V

    .line 127
    :cond_10
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;->getStoreysList()Ljava/util/List;

    move-result-object v9

    .line 129
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v5

    .line 131
    if-lez v5, :cond_12

    .line 133
    new-array v10, v5, [I

    .line 135
    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_11

    .line 137
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v10, v6

    .line 135
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 139
    :cond_11
    invoke-virtual {v2, v10}, Lcom/huawei/hihealthservice/old/model/SportData;->setStoreys([I)V

    .line 140
    goto :goto_4

    .line 143
    :cond_12
    invoke-virtual {v2}, Lcom/huawei/hihealthservice/old/model/SportData;->getSteps()[I

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    invoke-virtual {v2, v0}, Lcom/huawei/hihealthservice/old/model/SportData;->setStoreys([I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :cond_13
    :goto_4
    monitor-exit v11

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v11

    throw p0
.end method

.method public static getByteArraySportData([Lcom/huawei/hihealthservice/old/model/SportData;)Ljava/lang/String;
    .locals 1

    .line 201
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtilHelper;->getByteArraySportData([Lcom/huawei/hihealthservice/old/model/SportData;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static parseArraySportData(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/SportData;
    .locals 1

    .line 150
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;->parseArraySportDataSync(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/SportData;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized parseArraySportDataSync(Ljava/lang/String;)[Lcom/huawei/hihealthservice/old/model/SportData;
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;

    monitor-enter v9

    .line 160
    const/4 v4, 0x0

    .line 161
    const/4 v5, 0x0

    .line 163
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_1

    .line 167
    :try_start_1
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/util/Base64;->decoding(Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 172
    goto :goto_0

    .line 169
    :catch_0
    move-exception v6

    .line 171
    const-string v0, "Debug_DE_SportDataUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseArraySportData1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 174
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 178
    .line 179
    :try_start_3
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;

    move-result-object v6

    .line 181
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getSportDataCount()I

    move-result v7

    .line 183
    new-array v0, v7, [Lcom/huawei/hihealthservice/old/model/SportData;

    move-object v5, v0

    .line 185
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_0

    .line 187
    invoke-virtual {v6, v8}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportDataArray;->getSportData(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/util/SportDataUtil;->convertProtoSportData(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$SportData;)Lcom/huawei/hihealthservice/old/model/SportData;

    move-result-object v0

    aput-object v0, v5, v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 194
    :cond_0
    goto :goto_2

    .line 191
    :catch_1
    move-exception v6

    .line 193
    const-string v0, "Debug_DE_SportDataUtil"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseArraySportData2 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 197
    :cond_1
    :goto_2
    monitor-exit v9

    return-object v5

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method
