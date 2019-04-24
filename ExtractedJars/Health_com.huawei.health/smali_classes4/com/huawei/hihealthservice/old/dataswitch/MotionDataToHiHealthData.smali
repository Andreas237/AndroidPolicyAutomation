.class public Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public switchMotionPath(Lcom/huawei/hihealthservice/old/model/MotionPath;I)Lcom/huawei/hihealth/HiHealthData;
    .locals 11

    .line 35
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x7531

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getEndTime()J

    move-result-wide v2

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 37
    new-instance v5, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-direct {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;-><init>()V

    .line 38
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalSteps()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalSteps(I)V

    .line 39
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalCalories()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalCalories(I)V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalTime()J

    move-result-wide v6

    .line 41
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalDistance()I

    move-result v8

    .line 42
    invoke-virtual {v5, v6, v7}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalTime(J)V

    .line 43
    invoke-virtual {v5, v8}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setTotalDistance(I)V

    .line 44
    if-nez v8, :cond_0

    const/4 v9, 0x0

    goto :goto_0

    :cond_0
    long-to-float v0, v6

    int-to-float v1, v8

    div-float v9, v0, v1

    .line 45
    :goto_0
    invoke-virtual {v5, v9}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setAvgPace(F)V

    .line 46
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getSubType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setSportType(I)V

    .line 47
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getPartTimeMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPartTimeMap(Ljava/util/Map;)V

    .line 48
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setPaceMap(Ljava/util/Map;)V

    .line 49
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v5, v0}, Lo/cnj;->d(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 51
    new-instance v10, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;

    invoke-direct {v10}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;-><init>()V

    .line 52
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getLbsDataMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->setLbsDataMap(Ljava/util/Map;)V

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getHeartrateList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->setHeartRateList(Ljava/util/List;)V

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getPaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->setPaceMap(Ljava/util/Map;)V

    .line 55
    invoke-virtual {v10}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 58
    return-object v4
.end method

.method public switchMotionPaths([Lcom/huawei/hihealthservice/old/model/MotionPath;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcom/huawei/hihealthservice/old/model/MotionPath;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 22
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 23
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 25
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 27
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    goto :goto_1

    .line 28
    :cond_2
    invoke-virtual {p0, v5, p2}, Lcom/huawei/hihealthservice/old/dataswitch/MotionDataToHiHealthData;->switchMotionPath(Lcom/huawei/hihealthservice/old/model/MotionPath;I)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 30
    :cond_3
    return-object v1
.end method
