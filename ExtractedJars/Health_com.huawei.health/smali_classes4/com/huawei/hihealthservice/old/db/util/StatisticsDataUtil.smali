.class public Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DE_StatisticsDataUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseStatisticsData(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 38
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;->parseStatisticsDataSync(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized parseStatisticsDataSync(Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    const-class v7, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;

    monitor-enter v7

    .line 43
    const/4 v4, 0x0

    .line 45
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_0

    .line 47
    const/4 v5, 0x0

    .line 51
    :try_start_1
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/util/Base64;->decoding(Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 56
    goto :goto_0

    .line 53
    :catch_0
    move-exception v6

    .line 55
    const-string v0, "Debug_DE_StatisticsDataUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseStatisticsData1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 62
    :try_start_3
    invoke-static {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->parseFrom([B)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v6

    .line 64
    invoke-static {v6}, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;->toStringMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/Map;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 69
    goto :goto_1

    .line 66
    :catch_1
    move-exception v6

    .line 68
    const-string v0, "Debug_DE_StatisticsDataUtil"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseStatisticsData2 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 73
    :cond_0
    :goto_1
    monitor-exit v7

    return-object v4

    :catchall_0
    move-exception p0

    monitor-exit v7

    throw p0
.end method

.method private static declared-synchronized toIntegerMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    const-class v5, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;

    monitor-enter v5

    .line 138
    :try_start_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 140
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getEntriesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;

    .line 142
    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapEntry;->getState()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    goto :goto_0

    .line 145
    :cond_0
    monitor-exit v5

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method private static declared-synchronized toStringMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    const-class v6, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;

    monitor-enter v6

    .line 82
    :try_start_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 85
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getEntriesList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 87
    :cond_0
    monitor-exit v6

    return-object v2

    .line 92
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getEntriesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    .line 94
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getKey()Ljava/lang/String;

    move-result-object v3

    .line 98
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasStringValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getStringValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 102
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasIntValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 104
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getIntValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 106
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasLongValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 108
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getLongValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 110
    :cond_4
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasDoubleValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 112
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDoubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 114
    :cond_5
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasFloatValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 116
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getFloatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 118
    :cond_6
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasMapValue()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 120
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;->toStringMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 122
    :cond_7
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasIntegerMapValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 124
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getIntegerMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/StatisticsDataUtil;->toIntegerMap(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    :cond_8
    :goto_1
    goto/16 :goto_0

    .line 129
    :cond_9
    monitor-exit v6

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v6

    throw p0
.end method
