.class public Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public switchBloodPressure(Lcom/huawei/hihealthservice/old/model/BloodPresure;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/model/BloodPresure;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 32
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getStartTime()J

    move-result-wide v6

    .line 33
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getEndTime()J

    move-result-wide v8

    .line 34
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 35
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getDiastolic()S

    move-result v11

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getSystolic()S

    move-result v12

    .line 37
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodPresure;->getReferData()Ljava/lang/Object;

    move-result-object v13

    .line 39
    if-lez v11, :cond_0

    .line 40
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x7d7

    invoke-direct {v5, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 41
    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 42
    invoke-virtual {v5, v10}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v5, v11}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 44
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 45
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    :cond_0
    if-lez v12, :cond_1

    .line 49
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x7d6

    invoke-direct {v5, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 50
    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 51
    invoke-virtual {v5, v10}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v5, v12}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 53
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 54
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    move-object v0, v13

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 58
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x7e2

    invoke-direct {v5, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 59
    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 60
    invoke-virtual {v5, v10}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 61
    move-object v0, v13

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 62
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 63
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    :cond_2
    return-object v4
.end method

.method public switchBloodPressures([Lcom/huawei/hihealthservice/old/model/BloodPresure;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcom/huawei/hihealthservice/old/model/BloodPresure;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 18
    if-nez p1, :cond_0

    .line 19
    const/4 v0, 0x0

    return-object v0

    .line 21
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 23
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0, v5}, Lcom/huawei/hihealthservice/old/dataswitch/BloodPressureToHiHealthData;->switchBloodPressure(Lcom/huawei/hihealthservice/old/model/BloodPresure;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 22
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 26
    :cond_2
    return-object v1
.end method
