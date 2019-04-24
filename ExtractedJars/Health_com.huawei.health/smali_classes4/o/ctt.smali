.class public Lo/ctt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctt$b;
    }
.end annotation


# static fields
.field private static i:Landroid/content/Context;


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:Lo/cpw;

.field private e:Lo/czg;

.field private final f:[Ljava/lang/String;

.field private final k:[I


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lo/ctt;->b:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/ctt;->c:I

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ctt;->a:Z

    .line 48
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/ctt;->k:[I

    .line 52
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sport_step_sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "sport_distance_sum"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "sport_calorie_sum"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "sport_duration_sum"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "sport_altitude_offset_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ctt;->f:[Ljava/lang/String;

    .line 58
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/ctt;->d:Lo/cpw;

    .line 59
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctt;->e:Lo/czg;

    .line 60
    return-void

    nop

    :array_0
    .array-data 4
        0x9c42
        0x9c44
        0x9c43
        0x9c46
        0x9c45
    .end array-data
.end method

.method synthetic constructor <init>(Lo/ctt$4;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lo/ctt;-><init>()V

    return-void
.end method

.method private a(IILcom/huawei/hihealth/HiDataReadOption;Lcom/huawei/hihealth/HiSyncOption;Lo/cta;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 98
    :goto_0
    iget v0, p0, Lo/ctt;->b:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    move-object/from16 v0, p4

    invoke-direct {p0, p1, v0}, Lo/ctt;->d(ILcom/huawei/hihealth/HiSyncOption;)Ljava/util/List;

    move-result-object v10

    .line 103
    invoke-static {v10}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    const/4 v7, 0x1

    .line 106
    :cond_0
    iget-object v0, p0, Lo/ctt;->d:Lo/cpw;

    invoke-virtual {v0, p2}, Lo/cpw;->a(I)Ljava/util/List;

    move-result-object v11

    .line 107
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 108
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadDeviceStatData() has client"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    move-object/from16 v0, p4

    invoke-direct {p0, v11, v0, p3}, Lo/ctt;->e(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v9

    .line 110
    invoke-static {v9}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 111
    const/4 v8, 0x1

    .line 114
    :cond_1
    move-object v0, p0

    move-object v1, v10

    move-object v2, v9

    move v3, v7

    move v4, v8

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v6}, Lo/ctt;->a(Ljava/util/List;Ljava/util/List;ZZLcom/huawei/hihealth/HiSyncOption;Lo/cta;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    if-eqz v7, :cond_2

    .line 116
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/ctt;->k:[I

    invoke-static {v0, v10, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 118
    :cond_2
    if-eqz v8, :cond_3

    .line 119
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    invoke-static {v0, v9}, Lo/cui;->c(Landroid/content/Context;Ljava/util/List;)V

    .line 122
    :cond_3
    goto/16 :goto_0

    .line 123
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lo/ctt;->b:I

    .line 124
    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;ZZLcom/huawei/hihealth/HiSyncOption;Lo/cta;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;ZZLcom/huawei/hihealth/HiSyncOption;Lo/cta;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 140
    iget-boolean v0, p0, Lo/ctt;->a:Z

    if-nez v0, :cond_0

    .line 141
    iget v0, p0, Lo/ctt;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctt;->c:I

    invoke-virtual {p5}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 143
    :cond_0
    iget v0, p0, Lo/ctt;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctt;->c:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 144
    iget v0, p0, Lo/ctt;->b:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctt;->b:I

    .line 145
    const/4 v0, 0x0

    return v0

    .line 149
    :cond_1
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 150
    if-eqz p3, :cond_2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 151
    invoke-virtual {p6, p1}, Lo/cta;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 152
    invoke-static {v5}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 153
    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 156
    :cond_2
    if-eqz p4, :cond_3

    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 157
    invoke-virtual {p6, p2}, Lo/cta;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 158
    invoke-static {v5}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 159
    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 162
    :cond_3
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 163
    iget v0, p0, Lo/ctt;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctt;->b:I

    .line 164
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSportStatDataOne sportTotals is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const/4 v0, 0x0

    return v0

    .line 167
    :cond_4
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0, p5}, Lo/ctt;->e(Ljava/util/List;Ljava/lang/String;Lcom/huawei/hihealth/HiSyncOption;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;

    move-result-object v5

    .line 169
    :goto_1
    iget v0, p0, Lo/ctt;->b:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_6

    .line 170
    iget-object v0, p0, Lo/ctt;->e:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;

    move-result-object v6

    .line 172
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 173
    iget v0, p0, Lo/ctt;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctt;->b:I

    .line 174
    goto :goto_1

    .line 176
    :cond_5
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSportStat success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctt;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const-string v0, "HiH_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSportStat success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctt;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const/4 v0, 0x1

    return v0

    .line 180
    :cond_6
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDataToCloud failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctt;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const/4 v0, 0x0

    return v0
.end method

.method private d(ILcom/huawei/hihealth/HiSyncOption;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiSyncOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 127
    iget-boolean v0, p0, Lo/ctt;->a:Z

    if-nez v0, :cond_0

    .line 128
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    move v1, p1

    iget-object v2, p0, Lo/ctt;->k:[I

    iget-object v3, p0, Lo/ctt;->f:[Ljava/lang/String;

    const/16 v4, 0x32

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/cui;->c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 131
    :cond_0
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    move v1, p1

    iget-object v2, p0, Lo/ctt;->k:[I

    iget-object v3, p0, Lo/ctt;->f:[Ljava/lang/String;

    const/16 v4, 0x32

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/cui;->c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/util/List;Ljava/lang/String;Lcom/huawei/hihealth/HiSyncOption;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;Ljava/lang/String;Lcom/huawei/hihealth/HiSyncOption;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;"
        }
    .end annotation

    .line 185
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;-><init>()V

    .line 186
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->setTotalInfo(Ljava/util/List;)V

    .line 187
    invoke-virtual {v4, p2}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->setTimeZone(Ljava/lang/String;)V

    .line 188
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;

    .line 189
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getRecordDay()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 190
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAddSportTotalReq upload today stat may let cloud do push ,pushAction is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Lcom/huawei/hihealth/HiSyncOption;->getPushAction()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " day is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 191
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->getRecordDay()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 190
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiSyncOption;->getPushAction()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->setIsForce(I)V

    .line 194
    :cond_0
    goto :goto_0

    .line 195
    :cond_1
    return-object v4
.end method

.method private e(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiSyncOption;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 136
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    const/16 v1, 0x32

    invoke-virtual {v0, p1, p3, v1}, Lo/cqn;->d(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/ctt;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 70
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctt;->i:Landroid/content/Context;

    .line 71
    sget-object v0, Lo/ctt$b;->a:Lo/ctt;

    return-object v0
.end method


# virtual methods
.method public d(ILcom/huawei/hihealth/HiDataReadOption;Lcom/huawei/hihealth/HiSyncOption;Lo/cta;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 75
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/ctt;->b:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/ctt;->c:I

    .line 78
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/ctt;->a:Z

    .line 79
    invoke-static {}, Lo/csk;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() dataPrivacy switch is closed ,can not pushData right now, push end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return-void

    .line 83
    :cond_0
    const-string v0, "SYNC_SPORT_STAT_DOWNLOAD_PERCENT_MAX"

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 84
    iget-object v0, p0, Lo/ctt;->d:Lo/cpw;

    invoke-virtual {v0, p1}, Lo/cpw;->b(I)I

    move-result v6

    .line 85
    if-gtz v6, :cond_1

    .line 86
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() no statClient get, maybe no data need to pushData!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 88
    :cond_1
    move-object v0, p0

    move v1, v6

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/ctt;->a(IILcom/huawei/hihealth/HiDataReadOption;Lcom/huawei/hihealth/HiSyncOption;Lo/cta;)V

    .line 90
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/csk;->a(I)V

    .line 92
    :goto_0
    sget-object v0, Lo/ctt;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 93
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return-void
.end method
