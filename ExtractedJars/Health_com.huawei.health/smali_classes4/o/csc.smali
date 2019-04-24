.class public Lo/csc;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqy;

.field private b:Lo/cqz;

.field private e:Lo/cqh;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 36
    iget-object v0, p0, Lo/csc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/csc;->b:Lo/cqz;

    .line 37
    iget-object v0, p0, Lo/csc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/csc;->a:Lo/cqy;

    .line 38
    iget-object v0, p0, Lo/csc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    iput-object v0, p0, Lo/csc;->e:Lo/cqh;

    .line 39
    return-void
.end method

.method private b(Lo/cob;DI)Z
    .locals 4

    .line 104
    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    .line 105
    const-string v0, "Debug_HiNewStressStat"

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

    .line 106
    const/4 v0, 0x0

    return v0

    .line 108
    :cond_0
    invoke-virtual {p1, p2, p3}, Lo/cob;->e(D)V

    .line 109
    invoke-virtual {p1, p4}, Lo/cob;->a(I)V

    .line 110
    iget-object v0, p0, Lo/csc;->d:Lo/cqd;

    invoke-virtual {v0, p1}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private c(JJLjava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 84
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 85
    invoke-virtual {v2, p1, p2}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 86
    invoke-virtual {v2, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 87
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 88
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 89
    iget-object v0, p0, Lo/csc;->e:Lo/cqh;

    const/16 v1, 0x7f2

    invoke-virtual {v0, v2, v1, p5}, Lo/cqh;->a(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;IILcom/huawei/hihealth/HiHealthData;)Z"
        }
    .end annotation

    .line 59
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v6

    .line 60
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v8

    .line 61
    move-object/from16 v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/csc;->c(JJLjava/util/List;)Ljava/util/List;

    move-result-object v10

    .line 62
    move-object/from16 v0, p0

    move-wide v1, v6

    move-wide v3, v8

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/csc;->e(JJLjava/util/List;)Ljava/util/List;

    move-result-object v11

    .line 63
    if-eqz v10, :cond_0

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    :cond_0
    const-string v0, "Debug_HiNewStressStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveScoreStat query stat is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    const/4 v0, 0x0

    return v0

    .line 67
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 68
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 69
    new-instance v14, Lo/cob;

    invoke-direct {v14}, Lo/cob;-><init>()V

    .line 70
    invoke-virtual {v14, v6, v7}, Lo/cob;->a(J)V

    .line 71
    move/from16 v0, p3

    invoke-virtual {v14, v0}, Lo/cob;->e(I)V

    .line 72
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v14, v0}, Lo/cob;->f(I)V

    .line 73
    const/16 v0, 0x7f2

    invoke-virtual {v14, v0}, Lo/cob;->d(I)V

    .line 74
    move/from16 v0, p2

    invoke-virtual {v14, v0}, Lo/cob;->b(I)V

    .line 75
    const-string v0, "stress_score_count"

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    move-object/from16 v2, p0

    const v3, 0xad14

    invoke-direct {v2, v14, v0, v1, v3}, Lo/csc;->b(Lo/cob;DI)Z

    move-result v15

    .line 76
    const-string v0, "stress_score_max"

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    move-object/from16 v2, p0

    const v3, 0xad11

    invoke-direct {v2, v14, v0, v1, v3}, Lo/csc;->b(Lo/cob;DI)Z

    .line 77
    const-string v0, "stress_score_min"

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    move-object/from16 v2, p0

    const v3, 0xad10

    invoke-direct {v2, v14, v0, v1, v3}, Lo/csc;->b(Lo/cob;DI)Z

    .line 78
    const-string v0, "stress_score_avg"

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    move-object/from16 v2, p0

    const v3, 0xad12

    invoke-direct {v2, v14, v0, v1, v3}, Lo/csc;->b(Lo/cob;DI)Z

    .line 79
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    move-object/from16 v2, p0

    const v3, 0xad13

    invoke-direct {v2, v14, v0, v1, v3}, Lo/csc;->b(Lo/cob;DI)Z

    .line 80
    return v15
.end method

.method private e(JJLjava/util/List;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 93
    const/4 v0, 0x4

    new-array v11, v0, [Ljava/lang/String;

    const-string v0, "stress_score_count"

    const/4 v1, 0x0

    aput-object v0, v11, v1

    const-string v0, "stress_score_max"

    const/4 v1, 0x1

    aput-object v0, v11, v1

    const-string v0, "stress_score_min"

    const/4 v1, 0x2

    aput-object v0, v11, v1

    const-string v0, "stress_score_avg"

    const/4 v1, 0x3

    aput-object v0, v11, v1

    .line 96
    const/4 v12, 0x4

    new-array v12, v12, [I

    fill-array-data v12, :array_0

    .line 99
    iget-object v0, p0, Lo/csc;->e:Lo/cqh;

    move-object/from16 v1, p5

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-object v8, v11

    move-object v9, v12

    const/4 v6, 0x3

    const/16 v7, 0x7f2

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lo/cqh;->e(Ljava/util/List;JJII[Ljava/lang/String;[II)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x2
        0x4
        0x5
        0x3
    .end array-data
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 7

    .line 43
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v4

    .line 44
    iget-object v0, p0, Lo/csc;->b:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lo/cqz;->a(III)I

    move-result v5

    .line 45
    if-gtz v5, :cond_0

    .line 46
    const-string v0, "Debug_HiNewStressStat"

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

    .line 47
    const/4 v0, 0x0

    return v0

    .line 49
    :cond_0
    iget-object v0, p0, Lo/csc;->a:Lo/cqy;

    invoke-virtual {v0, v4}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v6

    .line 50
    invoke-static {v6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    const-string v0, "Debug_HiNewStressStat"

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

    .line 52
    const/4 v0, 0x0

    return v0

    .line 55
    :cond_1
    invoke-direct {p0, v6, v5, v4, p1}, Lo/csc;->c(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    return v0
.end method
