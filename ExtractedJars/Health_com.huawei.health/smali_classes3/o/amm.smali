.class public Lo/amm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Lcom/huawei/hihealth/HiDataInsertOption;"
        }
    .end annotation

    .line 51
    new-instance v0, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 52
    invoke-virtual {v0, p0}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 53
    return-object v0
.end method

.method public static c()Lcom/huawei/hihealth/HiAggregateOption;
    .locals 7

    .line 31
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v5

    .line 33
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 34
    const-wide/32 v0, 0x5265c00

    add-long/2addr v0, v5

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 35
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 42
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "walk_step"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "run_step"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "climb_step"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "step_sum"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "calorie_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "altitude_sum"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "distance_sum"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 43
    const-string v0, "Step_HiHealthHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStepsWithHiHealth..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 45
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 47
    return-object v4

    :array_0
    .array-data 4
        0x9c4b
        0x9c4c
        0x9c4d
        0x9c42
        0x9c43
        0x9c45
        0x9c44
    .end array-data
.end method

.method public static c(IILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;
    .locals 5

    .line 22
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 23
    invoke-virtual {v4, p1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 24
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 26
    invoke-virtual {v4, p0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 27
    return-object v4
.end method
