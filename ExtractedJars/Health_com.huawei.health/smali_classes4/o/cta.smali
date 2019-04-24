.class public Lo/cta;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;

.field private e:Lo/cob;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    .line 49
    new-instance v0, Lo/cob;

    invoke-direct {v0}, Lo/cob;-><init>()V

    iput-object v0, p0, Lo/cta;->e:Lo/cob;

    .line 50
    return-void
.end method

.method private a(ILcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 143
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 145
    :pswitch_0
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-static {p2, v0, p3}, Lo/ctc;->d(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 147
    :pswitch_1
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-static {p2, v0}, Lo/ctc;->a(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 149
    :pswitch_2
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-static {p2, v0}, Lo/ctc;->c(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 151
    :pswitch_3
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-static {p2, v0}, Lo/cte;->b(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 153
    :pswitch_4
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-static {p2, v0}, Lo/cte;->e(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 155
    :pswitch_5
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-static {p2, v0}, Lo/cte;->c(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 157
    :pswitch_6
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-static {p2, v0}, Lo/cte;->a(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 159
    :goto_0
    :pswitch_7
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/SportTotalData;Lcom/huawei/hwcloudmodel/model/SportTotalData;)Lcom/huawei/hwcloudmodel/model/SportTotalData;
    .locals 10

    .line 234
    new-instance v8, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    invoke-direct {v8}, Lcom/huawei/hwcloudmodel/model/SportTotalData;-><init>()V

    .line 235
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->setSportType(Ljava/lang/Integer;)V

    .line 236
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->setDeviceCode(Ljava/lang/Long;)V

    .line 237
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getDataSource()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->setDataSource(Ljava/lang/Integer;)V

    .line 238
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->setRecordDay(Ljava/lang/Integer;)V

    .line 239
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->setTimeZone(Ljava/lang/String;)V

    .line 241
    .line 242
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 243
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 244
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 245
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchAltitude()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchAltitude()Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 246
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchFloor()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchFloor()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 247
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 248
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCount()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCount()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 241
    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v9

    .line 250
    invoke-virtual {v8, v9}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 251
    return-object v8
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/SportTotalData;)V
    .locals 4

    .line 222
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->setSportType(Ljava/lang/Integer;)V

    .line 223
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v2

    .line 228
    invoke-virtual {v2}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchFloor()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1e

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v3, v0, v1

    .line 229
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configAltitude(Ljava/lang/Float;)V

    .line 230
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configFloor(Ljava/lang/Integer;)V

    .line 231
    return-void
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/SportTotalData;IILcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V
    .locals 10
    .param p1    # Lcom/huawei/hwcloudmodel/model/SportTotalData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 87
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 88
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 89
    invoke-virtual {p4}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 90
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    const v2, 0x9c42

    invoke-static {v0, p2, v1, v2}, Lo/cui;->a(Landroid/content/Context;III)I

    move-result v5

    .line 92
    sub-int v6, v4, v5

    .line 93
    if-lez v6, :cond_0

    .line 94
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cqs;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "step_sum_dvalue"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 96
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchSportTotalDataToDayStat huid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, ", key is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cuy;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v9

    .line 98
    add-int/2addr v9, v6

    .line 99
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0, v7, v9}, Lo/cuy;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 100
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchSportTotalDataToDayStat sportStepDvalueDB is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", stepDvalue is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v1, v2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 104
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/SportTotalData;I)V
    .locals 7
    .param p1    # Lcom/huawei/hwcloudmodel/model/SportTotalData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crc;->b(Landroid/content/Context;)Lo/crc;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getDeviceCode()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v3, p2, v1, v2}, Lo/crc;->d(IIJ)Lo/crd;

    move-result-object v4

    .line 108
    if-nez v4, :cond_0

    .line 109
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceStat hiHealthContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/crd;->c(I)V

    .line 113
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 114
    new-instance v6, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x385

    invoke-direct {v6, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 115
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 116
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 117
    invoke-virtual {v4}, Lo/crd;->f()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 118
    invoke-virtual {v4}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setAppID(I)V

    .line 119
    invoke-virtual {v4}, Lo/crd;->c()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceID(I)V

    .line 120
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 121
    invoke-virtual {v4}, Lo/crd;->e()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 122
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 123
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 124
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0, v5, p2}, Lo/crf;->a(Ljava/util/List;I)I

    .line 126
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/SportTotalData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/SportTotalData;>;"
        }
    .end annotation

    .line 197
    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    .line 200
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 201
    if-nez v8, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 203
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mergeOneDayStat key is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 205
    if-eqz v6, :cond_1

    .line 206
    invoke-direct {p0, v6, v8}, Lo/cta;->b(Lcom/huawei/hwcloudmodel/model/SportTotalData;Lcom/huawei/hwcloudmodel/model/SportTotalData;)Lcom/huawei/hwcloudmodel/model/SportTotalData;

    move-result-object v6

    .line 207
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mergeOneDayStat need merged key is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    :cond_1
    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 210
    goto :goto_0

    .line 211
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 213
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 214
    invoke-virtual {v4, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 215
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 217
    :cond_3
    return-object v7
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/SportTotalData;I)Ljava/util/List;
    .locals 11
    .param p1    # Lcom/huawei/hwcloudmodel/model/SportTotalData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/SportTotalData;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 55
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v6

    .line 56
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getTimeZone()Ljava/lang/String;

    move-result-object v7

    .line 57
    if-nez v6, :cond_0

    .line 58
    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 63
    :try_start_0
    invoke-direct {p0, p1, p2}, Lo/cta;->d(Lcom/huawei/hwcloudmodel/model/SportTotalData;I)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 64
    :catch_0
    move-exception v8

    .line 65
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceStat exception e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_1
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v8

    .line 70
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 71
    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_2
    invoke-direct {p0, p1, p2, v5, v6}, Lo/cta;->c(Lcom/huawei/hwcloudmodel/model/SportTotalData;IILcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 76
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchSportTotalDataToDayStat sportType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-direct {p0, v5, v6, v4}, Lo/cta;->a(ILcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;I)Ljava/util/List;

    move-result-object v9

    .line 78
    if-eqz v9, :cond_3

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 79
    :cond_3
    const/4 v0, 0x0

    return-object v0

    .line 81
    :cond_4
    invoke-virtual {v8}, Lo/crd;->a()I

    move-result v10

    .line 82
    iget-object v0, p0, Lo/cta;->e:Lo/cob;

    invoke-virtual {v0, v9, v7, v10, v4}, Lo/cob;->e(Ljava/util/List;Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ctd;->a(Landroid/content/Context;)Lo/ctd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ctd;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation

    .line 135
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ctg;->c(Landroid/content/Context;)Lo/ctg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ctg;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lo/cta;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ctg;->c(Landroid/content/Context;)Lo/ctg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ctg;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/SportTotalData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/SportTotalData;>;"
        }
    .end annotation

    .line 170
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start mergeClimbAndFloor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 172
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 173
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/SportTotalData;

    .line 174
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 175
    invoke-direct {p0, v7}, Lo/cta;->b(Lcom/huawei/hwcloudmodel/model/SportTotalData;)V

    .line 176
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    goto :goto_0

    .line 179
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/SportTotalData;->getSportType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 180
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    goto :goto_0

    .line 183
    :cond_1
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    goto :goto_0

    .line 186
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 187
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mergeClimbAndFloor no such data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    return-object v5

    .line 190
    :cond_3
    invoke-virtual {p0, v4}, Lo/cta;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 191
    invoke-interface {v5, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 192
    return-object v5
.end method
