.class public Lo/csx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/csx;->a:Landroid/content/Context;

    .line 36
    return-void
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 68
    if-nez p1, :cond_0

    .line 69
    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 72
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->getDeepDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 73
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->getLightDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 74
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->getAwakeDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 75
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->getAwakeTimes()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 76
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->getTotalDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 77
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->loadFallAsleepTime()Ljava/lang/Long;

    move-result-object v10

    .line 78
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->loadWakeupTime()Ljava/lang/Long;

    move-result-object v11

    .line 79
    if-lez v5, :cond_1

    .line 80
    mul-int/lit8 v0, v5, 0x3c

    int-to-double v0, v0

    const v2, 0xabe1

    const/16 v3, 0xd

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_1
    if-lez v6, :cond_2

    .line 83
    mul-int/lit8 v0, v6, 0x3c

    int-to-double v0, v0

    const v2, 0xabe2

    const/16 v3, 0xd

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_2
    if-lez v7, :cond_3

    .line 86
    mul-int/lit8 v0, v7, 0x3c

    int-to-double v0, v0

    const v2, 0xabe3

    const/16 v3, 0xd

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_3
    if-lez v8, :cond_4

    .line 89
    int-to-double v0, v8

    const v2, 0xabe5

    const/16 v3, 0x10

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_4
    if-lez v9, :cond_5

    .line 92
    mul-int/lit8 v0, v9, 0x3c

    int-to-double v0, v0

    const v2, 0xabe4

    const/16 v3, 0xd

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v10, :cond_6

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_6

    .line 95
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    const v2, 0xabe8

    const/4 v3, 0x5

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v11, :cond_7

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_7

    .line 98
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    const v2, 0xabe9

    const/4 v3, 0x5

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_7
    return-object v4
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;
    .locals 13

    .line 121
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;-><init>()V

    .line 122
    const-string v0, "stat_sleep_start_time"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 123
    const-string v0, "stat_sleep_end_time"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 124
    const-wide/16 v0, 0x1

    cmp-long v0, v5, v0

    if-ltz v0, :cond_0

    const-wide/16 v0, 0x1

    cmp-long v0, v7, v0

    if-gez v0, :cond_1

    .line 125
    :cond_0
    const-string v0, "Debug_SleepStatSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepBasic sleep data error ! hiHealthData is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const/4 v0, 0x0

    return-object v0

    .line 128
    :cond_1
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->setStartTime(Ljava/lang/Long;)V

    .line 129
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->setEndTime(Ljava/lang/Long;)V

    .line 130
    const-string v0, "stat_sleep_deep_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v0, v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->setDeepDuration(Ljava/lang/Integer;)V

    .line 131
    const-string v0, "stat_sleep_shallow_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v0, v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->setLightDuration(Ljava/lang/Integer;)V

    .line 132
    const-string v0, "stat_sleep_wake_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v0, v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->setAwakeDuration(Ljava/lang/Integer;)V

    .line 133
    const-string v0, "stat_sleep_wake_count"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->setAwakeTimes(Ljava/lang/Integer;)V

    .line 134
    const-string v0, "stat_sleep_duration_sum"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v0, v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->setTotalDuration(Ljava/lang/Integer;)V

    .line 135
    const-string v0, "stat_sleep_regular_start_time"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 136
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v9

    if-eqz v0, :cond_2

    .line 137
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->saveFallAsleepTime(Ljava/lang/Long;)V

    .line 139
    :cond_2
    const-string v0, "stat_sleep_regular_end_time"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 140
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v11

    if-eqz v0, :cond_3

    .line 141
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;->saveWakeupTime(Ljava/lang/Long;)V

    .line 144
    :cond_3
    return-object v4
.end method


# virtual methods
.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;>;"
        }
    .end annotation

    .line 104
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 106
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

    .line 107
    new-instance v6, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;-><init>()V

    .line 108
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->setTimeZone(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->setRecordDay(Ljava/lang/Integer;)V

    .line 110
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->setDataSource(Ljava/lang/Integer;)V

    .line 111
    const-string v0, "modified_time"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->setGenerateTime(Ljava/lang/Long;)V

    .line 112
    invoke-direct {p0, v5}, Lo/csx;->d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;

    move-result-object v3

    .line 113
    if-nez v3, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {v6, v3}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->setSleepBasic(Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;)V

    .line 115
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    goto :goto_0

    .line 117
    :cond_1
    return-object v2
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 39
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 40
    const-string v0, "Debug_SleepStatSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the sportTotal\'s deviceCode should be 0, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_0
    iget-object v0, p0, Lo/csx;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 44
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 45
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->getSleepBasic()Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/csx;->a(Lcom/huawei/hwcloudmodel/model/unite/SleepBasic;)Ljava/util/List;

    move-result-object v5

    .line 48
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 49
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 51
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 52
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v7

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->getTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->getGenerateTime()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/SleepTotal;->getGenerateTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_0

    :cond_4
    const-wide/16 v9, 0x0

    .line 55
    :goto_0
    const/4 v11, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_5

    .line 56
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v7}, Lo/cob;->b(I)V

    .line 57
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v6}, Lo/cob;->c(I)V

    .line 58
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v8}, Lo/cob;->e(Ljava/lang/String;)V

    .line 59
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 60
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/16 v1, 0x55f0

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 61
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v9, v10}, Lo/cob;->e(J)V

    .line 55
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 63
    :cond_5
    return-object v5
.end method
