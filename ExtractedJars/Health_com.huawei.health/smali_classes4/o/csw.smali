.class public Lo/csw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/csw;->c:Landroid/content/Context;

    .line 31
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;
    .locals 9

    .line 97
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;-><init>()V

    .line 98
    const-string v0, "heart_rate_rise_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 99
    const-string v0, "heart_rate_rise_max"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 100
    const-string v0, "heart_rate_rise_min"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 101
    const-string v0, "heart_rate_rise_alarmtimes"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 102
    if-lez v5, :cond_0

    if-lez v6, :cond_0

    if-lez v7, :cond_0

    if-gtz v8, :cond_1

    .line 103
    :cond_0
    const-string v0, "HiH_HeartRateRiseStatSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error HeartRateRise stat, some stat <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v0, 0x0

    return-object v0

    .line 106
    :cond_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->setDuration(Ljava/lang/Integer;)V

    .line 107
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->setMaxHeartRate(Ljava/lang/Integer;)V

    .line 108
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->setMinHeartRate(Ljava/lang/Integer;)V

    .line 109
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->setAlarmTimes(Ljava/lang/Integer;)V

    .line 110
    return-object v4
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 58
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 60
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->getDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 61
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->getMaxHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 62
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->getMinHeartRate()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 63
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;->getAlarmTimes()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 64
    if-lez v5, :cond_1

    .line 65
    int-to-double v0, v5

    const v2, 0xb79c

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    :cond_1
    if-lez v6, :cond_2

    .line 68
    int-to-double v0, v6

    const v2, 0xb79b

    const/16 v3, 0x8

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_2
    if-lez v7, :cond_3

    .line 71
    int-to-double v0, v7

    const v2, 0xb79a

    const/16 v3, 0x8

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_3
    if-lez v8, :cond_4

    .line 74
    int-to-double v0, v8

    const v2, 0xb79d

    const/16 v3, 0x10

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_4
    return-object v4
.end method


# virtual methods
.method public e(Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 34
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 35
    const-string v0, "HiH_HeartRateRiseStatSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the ExerciseIntensityTotal\'s deviceCode should be 0, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_0
    iget-object v0, p0, Lo/csw;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 39
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->getHeartRateRiseAlarmBasic()Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/csw;->d(Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;)Ljava/util/List;

    move-result-object v5

    .line 41
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 43
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v7

    .line 44
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->getTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 45
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->getGenerateTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 46
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_4

    .line 47
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v7}, Lo/cob;->b(I)V

    .line 48
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v6}, Lo/cob;->c(I)V

    .line 49
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v8}, Lo/cob;->e(Ljava/lang/String;)V

    .line 50
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 51
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const v1, 0xb799

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 52
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v9, v10}, Lo/cob;->e(J)V

    .line 46
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 54
    :cond_4
    return-object v5
.end method

.method public e(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;>;"
        }
    .end annotation

    .line 80
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 81
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 82
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;-><init>()V

    .line 83
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->setTimeZone(Ljava/lang/String;)V

    .line 84
    const-string v0, "modified_time"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->setGenerateTime(Ljava/lang/Long;)V

    .line 85
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 86
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 87
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->setDeviceCode(Ljava/lang/Long;)V

    .line 88
    invoke-direct {p0, v4}, Lo/csw;->a(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;

    move-result-object v6

    .line 89
    if-nez v6, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {v5, v6}, Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmTotal;->setHeartRateRiseAlarmBasic(Lcom/huawei/hwcloudmodel/model/unite/HeartRateRiseAlarmBasic;)V

    .line 91
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    return-object v2
.end method
