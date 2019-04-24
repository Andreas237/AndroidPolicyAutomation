.class public Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private switchType(I)I
    .locals 1

    .line 52
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 54
    :pswitch_0
    const/16 v0, 0x55f1

    return v0

    .line 57
    :pswitch_1
    const/16 v0, 0x55f2

    return v0

    .line 60
    :pswitch_2
    const/16 v0, 0x55f3

    return v0

    .line 63
    :goto_0
    const/16 v0, 0x55f0

    return v0

    :pswitch_data_0
    .packed-switch 0x201
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public switchSleepData(Lcom/huawei/hihealthservice/old/model/SleepData;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/model/SleepData;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 33
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SleepData;->getEndTime()J

    move-result-wide v4

    .line 35
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SleepData;->getStartTime()J

    move-result-wide v6

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/SleepData;->getSubType()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;->switchType(I)I

    move-result v8

    .line 37
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 39
    :goto_0
    cmp-long v0, v6, v4

    if-gez v0, :cond_0

    .line 40
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2, v8}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 41
    const-wide/32 v0, 0xea60

    add-long/2addr v0, v6

    invoke-virtual {v2, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 42
    invoke-virtual {v2, v9}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v2, p2}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 44
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    const-wide/32 v0, 0xea60

    add-long/2addr v6, v0

    goto :goto_0

    .line 48
    :cond_0
    return-object v3
.end method

.method public switchSleepDatas([Lcom/huawei/hihealthservice/old/model/SleepData;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcom/huawei/hihealthservice/old/model/SleepData;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 20
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 21
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 23
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 25
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {p0, v5, p2}, Lcom/huawei/hihealthservice/old/dataswitch/SleepDataToHiHealthData;->switchSleepData(Lcom/huawei/hihealthservice/old/model/SleepData;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 24
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 28
    :cond_3
    return-object v1
.end method
