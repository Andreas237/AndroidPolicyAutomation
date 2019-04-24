.class public Lo/crt;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqz;

.field private b:Lo/cpz;

.field private e:Lo/cps;

.field private k:Lo/cqy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 42
    iget-object v0, p0, Lo/crt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/crt;->a:Lo/cqz;

    .line 43
    iget-object v0, p0, Lo/crt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/crt;->k:Lo/cqy;

    .line 44
    iget-object v0, p0, Lo/crt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cps;->c(Landroid/content/Context;)Lo/cps;

    move-result-object v0

    iput-object v0, p0, Lo/crt;->e:Lo/cps;

    .line 45
    iget-object v0, p0, Lo/crt;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpz;->b(Landroid/content/Context;)Lo/cpz;

    move-result-object v0

    iput-object v0, p0, Lo/crt;->b:Lo/cpz;

    .line 46
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiAggregateOption;Lo/cob;[Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiAggregateOption;Lo/cob;[Ljava/lang/String;ILjava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;Ljava/lang/String;)Z"
        }
    .end annotation

    .line 109
    invoke-static {p6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 110
    move-object v0, p0

    move-object v1, p1

    move-object v2, p6

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p2

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lo/crt;->e(Lcom/huawei/hihealth/HiAggregateOption;Ljava/util/List;[Ljava/lang/String;ILjava/lang/String;Lo/cob;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 112
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private e(DLo/cob;ILjava/lang/String;)Z
    .locals 4

    .line 126
    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_0

    .line 127
    const-string v0, "Debug_HiConfigDataStat"

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

    .line 128
    const/4 v0, 0x0

    return v0

    .line 130
    :cond_0
    invoke-virtual {p3, p1, p2}, Lo/cob;->e(D)V

    .line 131
    invoke-virtual {p3, p4}, Lo/cob;->a(I)V

    .line 132
    iget-object v0, p0, Lo/crt;->b:Lo/cpz;

    invoke-virtual {v0, p5, p3}, Lo/cpz;->e(Ljava/lang/String;Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private e(Lcom/huawei/hihealth/HiAggregateOption;Ljava/util/List;[Ljava/lang/String;ILjava/lang/String;Lo/cob;Ljava/lang/String;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiAggregateOption;Ljava/util/List<Ljava/lang/Integer;>;[Ljava/lang/String;ILjava/lang/String;Lo/cob;Ljava/lang/String;)Z"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lo/crt;->e:Lo/cps;

    invoke-virtual {v0, p5, p2, p1}, Lo/cps;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v6

    .line 118
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 119
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 121
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const/4 v1, 0x0

    aget-object v1, p3, v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 122
    move-object v0, p0

    move-wide v1, v7

    move-object v3, p6

    move v4, p4

    move-object/from16 v5, p7

    invoke-direct/range {v0 .. v5}, Lo/crt;->e(DLo/cob;ILjava/lang/String;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 30

    .line 50
    const-string v0, "Debug_HiConfigDataStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cmi;->k(I)Ljava/lang/Integer;

    move-result-object v8

    .line 53
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 54
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 55
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 56
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    const/4 v0, 0x0

    if-ne v0, v11, :cond_1

    .line 57
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 60
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cmi;->a(I)I

    move-result v12

    .line 61
    const/4 v0, 0x0

    if-le v0, v12, :cond_2

    .line 62
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_2
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 65
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->d(I)Ljava/lang/String;

    move-result-object v14

    .line 66
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v15

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v18

    .line 70
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v19

    .line 71
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v21

    .line 73
    const/4 v0, 0x1

    new-array v0, v0, [I

    move-object/from16 v23, v0

    const/4 v0, 0x0

    aput v9, v23, v0

    .line 74
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v0, "dataType"

    const/4 v1, 0x0

    aput-object v0, v24, v1

    .line 75
    new-instance v25, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct/range {v25 .. v25}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 76
    move-object/from16 v0, v25

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 77
    move-object/from16 v0, v25

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 78
    move-object/from16 v0, v25

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 79
    move-object/from16 v0, v25

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 80
    move-object/from16 v0, v25

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 81
    move-object/from16 v0, v25

    invoke-virtual {v0, v12}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v26

    .line 84
    new-instance v27, Lo/cob;

    invoke-direct/range {v27 .. v27}, Lo/cob;-><init>()V

    .line 85
    move-object/from16 v0, v27

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2}, Lo/cob;->a(J)V

    .line 86
    move-object/from16 v0, v27

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/cob;->e(I)V

    .line 87
    move-object/from16 v0, v27

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 88
    move-object/from16 v0, v27

    invoke-virtual {v0, v9}, Lo/cob;->d(I)V

    .line 89
    move-object/from16 v0, v27

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lo/cob;->i(I)V

    .line 91
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crt;->a:Lo/cqz;

    const/4 v1, 0x0

    move/from16 v2, v18

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/cqz;->a(III)I

    move-result v28

    .line 92
    if-gtz v28, :cond_3

    .line 93
    const/4 v0, 0x0

    return v0

    .line 95
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crt;->k:Lo/cqy;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v29

    .line 96
    move-object/from16 v0, v27

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lo/cob;->b(I)V

    .line 98
    move-object/from16 v0, p0

    move-object/from16 v1, v25

    move-object/from16 v2, v27

    move-object/from16 v3, v24

    move v4, v15

    move-object v5, v13

    move-object/from16 v6, v29

    move-object v7, v14

    invoke-direct/range {v0 .. v7}, Lo/crt;->a(Lcom/huawei/hihealth/HiAggregateOption;Lo/cob;[Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;)Z

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->a(J)I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crt;->c:Landroid/content/Context;

    .line 101
    invoke-static {v0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 104
    :cond_4
    const-string v0, "Debug_HiConfigDataStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, v2, v16

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const/4 v0, 0x1

    return v0
.end method
