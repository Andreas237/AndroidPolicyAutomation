.class public Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public switchWeight(Lcom/huawei/hihealthservice/old/model/Weight;I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/model/Weight;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 31
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 32
    const/4 v0, 0x0

    return-object v0

    .line 34
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Weight;->getStartTime()J

    move-result-wide v1

    .line 35
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Weight;->getStartTime()J

    move-result-wide v3

    .line 36
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 37
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 38
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Weight;->getWeight()F

    move-result v7

    .line 39
    new-instance v8, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x7d4

    invoke-direct {v8, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 40
    invoke-virtual {v8, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 41
    invoke-virtual {v8, v3, v4}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 42
    invoke-virtual {v8, v7}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 43
    invoke-virtual {v8, v5}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v8, p2}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 45
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/Weight;->getFat()F

    move-result v9

    .line 47
    invoke-static {v9}, Lcom/huawei/hihealthservice/old/model/HealthData;->validFloat(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    new-instance v10, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x7d1

    invoke-direct {v10, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 49
    invoke-virtual {v10, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 50
    invoke-virtual {v10, v3, v4}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 51
    invoke-virtual {v10, v9}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 52
    invoke-virtual {v10, v5}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v10, p2}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 54
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_1
    return-object v6
.end method

.method public switchWeights([Lcom/huawei/hihealthservice/old/model/Weight;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcom/huawei/hihealthservice/old/model/Weight;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 19
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 20
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 22
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 24
    invoke-virtual {p0, v5, p2}, Lcom/huawei/hihealthservice/old/dataswitch/WeightToHiHealthData;->switchWeight(Lcom/huawei/hihealthservice/old/model/Weight;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 23
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 26
    :cond_2
    return-object v1
.end method
