.class public Lo/ctf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctf;->a:Landroid/content/Context;

    .line 37
    return-void
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/StressBasic;
    .locals 10

    .line 111
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;-><init>()V

    .line 112
    const-string v0, "stress_score_last"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 113
    const-string v0, "stress_score_max"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 114
    const-string v0, "stress_score_avg"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 115
    const-string v0, "stress_score_count"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 116
    const-string v0, "stress_score_min"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 117
    if-lez v5, :cond_0

    if-lez v6, :cond_0

    if-lez v7, :cond_0

    if-lez v8, :cond_0

    if-gtz v9, :cond_1

    .line 118
    :cond_0
    const-string v0, "HiH_StressStatSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error stress stat, some stat <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x0

    return-object v0

    .line 121
    :cond_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->configLastScore(Ljava/lang/Integer;)V

    .line 122
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->configMaxScore(Ljava/lang/Integer;)V

    .line 123
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->configMeanScore(Ljava/lang/Integer;)V

    .line 124
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->configMeasureCount(Ljava/lang/Integer;)V

    .line 125
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->configMinScore(Ljava/lang/Integer;)V

    .line 126
    return-object v4
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/StressBasic;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/StressBasic;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 68
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->fetchMaxScore()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 71
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->fetchMinScore()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 72
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->fetchMeanScore()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 73
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->fetchLastScore()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 74
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->fetchMeasureCount()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 75
    if-lez v5, :cond_1

    .line 76
    int-to-double v0, v5

    const v2, 0xad11

    const/16 v3, 0x11

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_1
    if-lez v6, :cond_2

    .line 79
    int-to-double v0, v6

    const v2, 0xad10

    const/16 v3, 0x11

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_2
    if-lez v7, :cond_3

    .line 82
    int-to-double v0, v7

    const v2, 0xad12

    const/16 v3, 0x11

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_3
    if-lez v8, :cond_4

    .line 85
    int-to-double v0, v8

    const v2, 0xad13

    const/16 v3, 0x11

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    :cond_4
    if-lez v9, :cond_5

    .line 88
    int-to-double v0, v9

    const v2, 0xad14

    const/16 v3, 0x10

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_5
    return-object v4
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/unite/StressTotal;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/StressTotal;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 40
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchDeviceCode()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 41
    const-string v0, "HiH_StressStatSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the StressTotal\'s deviceCode should be 0, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchDeviceCode()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchRecordDay()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    .line 45
    const-string v0, "HiH_StressStatSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the StressTotal\'s recordDay should not be null, recordDay is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchDeviceCode()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_1
    iget-object v0, p0, Lo/ctf;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 49
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchStressBasic()Lcom/huawei/hwcloudmodel/model/unite/StressBasic;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ctf;->d(Lcom/huawei/hwcloudmodel/model/unite/StressBasic;)Ljava/util/List;

    move-result-object v5

    .line 51
    if-eqz v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 53
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v7

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 55
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->fetchGenerateTime()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 56
    const/4 v11, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_5

    .line 57
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v7}, Lo/cob;->b(I)V

    .line 58
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v6}, Lo/cob;->c(I)V

    .line 59
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v8}, Lo/cob;->e(Ljava/lang/String;)V

    .line 60
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 61
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/16 v1, 0x7f2

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 62
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v9, v10}, Lo/cob;->e(J)V

    .line 56
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 64
    :cond_5
    return-object v5
.end method

.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/StressTotal;>;"
        }
    .end annotation

    .line 94
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 95
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

    .line 96
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;-><init>()V

    .line 97
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->configTimeZone(Ljava/lang/String;)V

    .line 98
    const-string v0, "modified_time"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->configGenerateTime(Ljava/lang/Long;)V

    .line 99
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->configRecordDay(Ljava/lang/Integer;)V

    .line 100
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->configDataSource(Ljava/lang/Integer;)V

    .line 101
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->configDeviceCode(Ljava/lang/Long;)V

    .line 102
    invoke-direct {p0, v4}, Lo/ctf;->d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/StressBasic;

    move-result-object v6

    .line 103
    if-nez v6, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {v5, v6}, Lcom/huawei/hwcloudmodel/model/unite/StressTotal;->configStressBasic(Lcom/huawei/hwcloudmodel/model/unite/StressBasic;)V

    .line 105
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    goto :goto_0

    .line 107
    :cond_1
    return-object v2
.end method
