.class public Lo/csb;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqg;

.field private b:Lo/cqy;

.field private e:Lo/cqz;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 37
    iget-object v0, p0, Lo/csb;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/csb;->e:Lo/cqz;

    .line 38
    iget-object v0, p0, Lo/csb;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/csb;->b:Lo/cqy;

    .line 40
    iget-object v0, p0, Lo/csb;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    iput-object v0, p0, Lo/csb;->a:Lo/cqg;

    .line 41
    return-void
.end method

.method private c(Lo/cob;DI)Z
    .locals 4

    .line 100
    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    .line 101
    const-string v0, "Debug_HiHeartRateUpStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOneStat()  statValue <= 0 statType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x0

    return v0

    .line 104
    :cond_0
    invoke-virtual {p1, p2, p3}, Lo/cob;->e(D)V

    .line 105
    invoke-virtual {p1, p4}, Lo/cob;->a(I)V

    .line 106
    iget-object v0, p0, Lo/csb;->d:Lo/cqd;

    invoke-virtual {v0, p1}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;IILcom/huawei/hihealth/HiHealthData;)Z"
        }
    .end annotation

    .line 61
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v7

    .line 62
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v9

    .line 63
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csb;->a:Lo/cqg;

    move-object/from16 v1, p1

    move-wide v2, v7

    move-wide v4, v9

    const/16 v6, 0x835

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->b(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v11

    .line 64
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    :cond_0
    const-string v0, "Debug_HiHeartRateUpStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStat datas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    return v0

    .line 68
    :cond_1
    const/high16 v12, -0x80000000

    .line 69
    const v13, 0x7fffffff

    .line 70
    const/4 v14, 0x0

    .line 71
    const/4 v15, 0x0

    .line 72
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/hihealth/HiHealthData;

    .line 73
    int-to-long v0, v14

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    add-long/2addr v0, v2

    long-to-int v14, v0

    .line 74
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;

    .line 75
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMaxHeartRate()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 76
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMaxHeartRate()I

    move-result v12

    .line 78
    :cond_2
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMinHeartRate()I

    move-result v0

    if-le v13, v0, :cond_3

    .line 79
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMinHeartRate()I

    move-result v13

    .line 81
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 82
    goto :goto_0

    .line 83
    :cond_4
    const/high16 v0, -0x80000000

    if-ne v12, v0, :cond_5

    const/4 v0, 0x0

    goto :goto_1

    :cond_5
    move v0, v12

    :goto_1
    move v12, v0

    .line 84
    const v0, 0x7fffffff

    if-ne v13, v0, :cond_6

    const/4 v0, 0x0

    goto :goto_2

    :cond_6
    move v0, v13

    :goto_2
    move v13, v0

    .line 85
    new-instance v16, Lo/cob;

    invoke-direct/range {v16 .. v16}, Lo/cob;-><init>()V

    .line 86
    move-object/from16 v0, v16

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/cob;->b(I)V

    .line 87
    move-object/from16 v0, v16

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/cob;->i(I)V

    .line 88
    move-object/from16 v0, v16

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lo/cob;->e(I)V

    .line 89
    move-object/from16 v0, v16

    invoke-virtual {v0, v7, v8}, Lo/cob;->a(J)V

    .line 90
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/cob;->f(I)V

    .line 91
    move-object/from16 v0, v16

    const v1, 0xb799

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 92
    int-to-double v0, v12

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    const v4, 0xb79b

    invoke-direct {v2, v3, v0, v1, v4}, Lo/csb;->c(Lo/cob;DI)Z

    .line 93
    int-to-double v0, v13

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    const v4, 0xb79a

    invoke-direct {v2, v3, v0, v1, v4}, Lo/csb;->c(Lo/cob;DI)Z

    .line 94
    int-to-double v0, v14

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    const v4, 0xb79c

    invoke-direct {v2, v3, v0, v1, v4}, Lo/csb;->c(Lo/cob;DI)Z

    .line 95
    int-to-double v0, v15

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    const v4, 0xb79d

    invoke-direct {v2, v3, v0, v1, v4}, Lo/csb;->c(Lo/cob;DI)Z

    .line 96
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 7

    .line 45
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v4

    .line 46
    iget-object v0, p0, Lo/csb;->e:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lo/cqz;->a(III)I

    move-result v5

    .line 47
    if-gtz v5, :cond_0

    .line 48
    const-string v0, "Debug_HiHeartRateUpStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() statClient <= 0 day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    const/4 v0, 0x0

    return v0

    .line 51
    :cond_0
    iget-object v0, p0, Lo/csb;->b:Lo/cqy;

    invoke-virtual {v0, v4}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v6

    .line 52
    invoke-static {v6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "Debug_HiHeartRateUpStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() statClients <= 0 day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_1
    invoke-direct {p0, v6, v5, v4, p1}, Lo/csb;->d(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    return v0
.end method
