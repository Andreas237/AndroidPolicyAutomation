.class public Lo/coq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(ILcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;D)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;
    .locals 1

    .line 167
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 169
    :pswitch_0
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setSkeletalMusclelMass(Ljava/lang/Double;)V

    .line 170
    goto :goto_0

    .line 172
    :pswitch_1
    double-to-int v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setGender(Ljava/lang/Integer;)V

    .line 173
    goto :goto_0

    .line 175
    :pswitch_2
    double-to-int v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setAge(Ljava/lang/Integer;)V

    .line 176
    goto :goto_0

    .line 178
    :pswitch_3
    double-to-int v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setHeight(Ljava/lang/Integer;)V

    .line 179
    goto :goto_0

    .line 181
    :pswitch_4
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setHealthyWeight(Ljava/lang/Double;)V

    .line 182
    goto :goto_0

    .line 184
    :pswitch_5
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setHealthyFatRate(Ljava/lang/Double;)V

    .line 185
    goto :goto_0

    .line 187
    :pswitch_6
    double-to-int v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBodySize(Ljava/lang/Integer;)V

    .line 188
    .line 192
    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x805
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static c(Landroid/database/Cursor;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;
    .locals 9

    .line 89
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 91
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseWeightPointData() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_0
    new-instance v4, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    invoke-direct {v4}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;-><init>()V

    .line 96
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 99
    const-string v0, "value"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v6

    .line 100
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 102
    :sswitch_0
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBodyFatRate(Ljava/lang/Double;)V

    .line 103
    goto :goto_2

    .line 105
    :sswitch_1
    invoke-virtual {v4, v6, v7}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBodyFat(D)V

    .line 106
    goto :goto_2

    .line 108
    :sswitch_2
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setImpedance(Ljava/lang/Double;)V

    .line 109
    goto :goto_2

    .line 111
    :sswitch_3
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBMI(Ljava/lang/Double;)V

    .line 112
    goto :goto_2

    .line 114
    :sswitch_4
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBMR(Ljava/lang/Double;)V

    .line 115
    goto :goto_2

    .line 117
    :goto_1
    invoke-static {v5, v4, v6, v7}, Lo/coq;->e(ILcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;D)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 120
    :goto_2
    goto/16 :goto_0

    .line 122
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 123
    goto :goto_3

    .line 122
    :catchall_0
    move-exception v8

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 123
    throw v8

    .line 124
    :goto_3
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x7d1 -> :sswitch_0
        0x7e6 -> :sswitch_3
        0x7e8 -> :sswitch_4
        0x7ef -> :sswitch_1
        0x7f0 -> :sswitch_2
    .end sparse-switch
.end method

.method public static d(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 198
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 200
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseWeightPointData() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v0, 0x0

    return-object v0

    .line 203
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 206
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 209
    const-string v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setDataID(J)V

    .line 210
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    goto :goto_0

    .line 213
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 214
    goto :goto_1

    .line 213
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 214
    throw v6

    .line 215
    :goto_1
    return-object v4
.end method

.method private static e(ILcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;D)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;
    .locals 1

    .line 128
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 130
    :pswitch_0
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setMuscles(Ljava/lang/Double;)V

    .line 131
    goto :goto_1

    .line 133
    :pswitch_1
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setWater(Ljava/lang/Double;)V

    .line 134
    goto :goto_1

    .line 136
    :pswitch_2
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setMoistureRate(Ljava/lang/Double;)V

    .line 137
    goto :goto_1

    .line 139
    :pswitch_3
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setFatLevel(Ljava/lang/Double;)V

    .line 140
    goto :goto_1

    .line 142
    :pswitch_4
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBoneMineral(Ljava/lang/Double;)V

    .line 143
    goto :goto_1

    .line 145
    :pswitch_5
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setProtein(Ljava/lang/Double;)V

    .line 146
    goto :goto_1

    .line 148
    :pswitch_6
    invoke-virtual {p1, p2, p3}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBodyScore(D)V

    .line 149
    goto :goto_1

    .line 151
    :pswitch_7
    double-to-int v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setBodyAge(Ljava/lang/Integer;)V

    .line 152
    goto :goto_1

    .line 154
    :pswitch_8
    double-to-int v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setHeartRate(Ljava/lang/Integer;)V

    .line 155
    goto :goto_1

    .line 157
    :pswitch_9
    double-to-int v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;->setPressure(Ljava/lang/Integer;)V

    .line 158
    goto :goto_1

    .line 160
    :goto_0
    :pswitch_a
    invoke-static {p0, p1, p2, p3}, Lo/coq;->a(ILcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;D)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    move-result-object p1

    .line 163
    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x7e7
        :pswitch_0
        :pswitch_a
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_a
        :pswitch_a
        :pswitch_2
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method public static e(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 48
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 51
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    new-instance v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 54
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 55
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 56
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 57
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 58
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 59
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 60
    invoke-interface {p0, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v3, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 59
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 62
    :cond_0
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 65
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 66
    goto :goto_2

    .line 65
    :catchall_0
    move-exception v8

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 66
    throw v8

    .line 67
    :goto_2
    return-object v2
.end method
