.class public Lo/cst;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cst;->b:Landroid/content/Context;

    .line 33
    return-void
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 65
    if-nez p1, :cond_0

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 69
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->getMaxHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 70
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->getMinHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 71
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->getAvgRestingHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 72
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->getLastHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 73
    if-lez v5, :cond_1

    .line 74
    int-to-double v0, v5

    const v2, 0xb3c0

    const/16 v3, 0x8

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_1
    if-lez v6, :cond_2

    .line 77
    int-to-double v0, v6

    const v2, 0xb3c1

    const/16 v3, 0x8

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_2
    if-lez v7, :cond_3

    .line 80
    int-to-double v0, v7

    const v2, 0xb3c2

    const/16 v3, 0x8

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_3
    if-lez v8, :cond_4

    .line 83
    int-to-double v0, v8

    const v2, 0xb3c3

    const/16 v3, 0x8

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_4
    return-object v4
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;
    .locals 2

    .line 107
    new-instance v1, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;-><init>()V

    .line 108
    const-string v0, "maxHeartRate"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->setMaxHeartRate(Ljava/lang/Integer;)V

    .line 109
    const-string v0, "minHeartRate"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->setMinHeartRate(Ljava/lang/Integer;)V

    .line 110
    const-string v0, "avgRestingHeartRate"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->setAvgRestingHeartRate(Ljava/lang/Integer;)V

    .line 111
    const-string v0, "lastHeartRate"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;->setLastHeartRate(Ljava/lang/Integer;)V

    .line 112
    return-object v1
.end method


# virtual methods
.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;>;"
        }
    .end annotation

    .line 89
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 92
    new-instance v6, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;-><init>()V

    .line 93
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->setTimeZone(Ljava/lang/String;)V

    .line 94
    const-string v0, "modified_time"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->setGenerateTime(J)V

    .line 95
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->setRecordDay(I)V

    .line 96
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->setDataSource(I)V

    .line 97
    const-wide/16 v0, 0x0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->setDeviceCode(J)V

    .line 98
    invoke-direct {p0, v5}, Lo/cst;->c(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;

    move-result-object v3

    .line 99
    if-nez v3, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {v6, v3}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->setHeartRateBasic(Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;)V

    .line 101
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    goto :goto_0

    .line 103
    :cond_1
    return-object v2
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->getDeviceCode()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 37
    const-string v0, "Debug_HeartRateStatSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the heartRateTotal\'s deviceCode should be 0, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->getDeviceCode()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_0
    iget-object v0, p0, Lo/cst;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 41
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->getHeartRateBasic()Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cst;->a(Lcom/huawei/hwcloudmodel/model/unite/HeartRateBasic;)Ljava/util/List;

    move-result-object v5

    .line 45
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 46
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->getRecordDay()I

    move-result v6

    .line 49
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v7

    .line 50
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->getTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 51
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateTotal;->getGenerateTime()J

    move-result-wide v9

    .line 52
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 53
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v7}, Lo/cob;->b(I)V

    .line 54
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v6}, Lo/cob;->c(I)V

    .line 55
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v8}, Lo/cob;->e(Ljava/lang/String;)V

    .line 56
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 57
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const v1, 0xb3bf

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 58
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v9, v10}, Lo/cob;->e(J)V

    .line 52
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 60
    :cond_4
    return-object v5
.end method
