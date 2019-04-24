.class public Lo/crv;
.super Lo/csd;
.source "SourceFile"


# instance fields
.field private a:Lo/cqy;

.field private b:Lo/cqz;

.field private e:Lo/cpy;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 36
    iget-object v0, p0, Lo/crv;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    iput-object v0, p0, Lo/crv;->e:Lo/cpy;

    .line 37
    iget-object v0, p0, Lo/crv;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/crv;->b:Lo/cqz;

    .line 38
    iget-object v0, p0, Lo/crv;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/crv;->a:Lo/cqy;

    .line 39
    return-void
.end method

.method private b(Lo/cob;DI)Z
    .locals 4

    .line 108
    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    .line 109
    const-string v0, "Debug_HiSportStat"

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

    .line 110
    const/4 v0, 0x0

    return v0

    .line 112
    :cond_0
    invoke-virtual {p1, p2, p3}, Lo/cob;->e(D)V

    .line 113
    invoke-virtual {p1, p4}, Lo/cob;->a(I)V

    .line 114
    iget-object v0, p0, Lo/crv;->d:Lo/cqd;

    invoke-virtual {v0, p1}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;IILcom/huawei/hihealth/HiHealthData;)Z"
        }
    .end annotation

    .line 58
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v5

    .line 59
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v7

    .line 60
    new-instance v9, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 61
    invoke-virtual {v9, v5, v6, v7, v8}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 62
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crv;->e:Lo/cpy;

    const/4 v1, 0x7

    move-object/from16 v2, p1

    invoke-virtual {v0, v9, v1, v2}, Lo/cpy;->d(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v10

    .line 63
    if-eqz v10, :cond_0

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_1
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    .line 65
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 66
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/hihealth/HiHealthData;

    .line 67
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 69
    :pswitch_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 71
    :pswitch_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 73
    :pswitch_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 75
    :pswitch_3
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 77
    :pswitch_4
    add-int/lit8 v16, v16, 0x1

    goto :goto_1

    .line 79
    :pswitch_5
    add-int/lit8 v17, v17, 0x1

    goto :goto_1

    .line 81
    :pswitch_6
    add-int/lit8 v18, v18, 0x1

    goto :goto_1

    .line 83
    :pswitch_7
    add-int/lit8 v19, v19, 0x1

    .line 87
    :goto_1
    goto :goto_0

    .line 88
    :cond_2
    new-instance v20, Lo/cob;

    invoke-direct/range {v20 .. v20}, Lo/cob;-><init>()V

    .line 89
    move-object/from16 v0, v20

    invoke-virtual {v0, v5, v6}, Lo/cob;->a(J)V

    .line 90
    move-object/from16 v0, v20

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lo/cob;->e(I)V

    .line 91
    invoke-virtual/range {p4 .. p4}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/cob;->f(I)V

    .line 92
    move-object/from16 v0, v20

    const/16 v1, 0x7f2

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 93
    move-object/from16 v0, v20

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/cob;->b(I)V

    .line 94
    move-object/from16 v0, v20

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lo/cob;->i(I)V

    .line 95
    int-to-double v0, v11

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb7fd

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    move-result v21

    .line 96
    int-to-double v0, v12

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb7fe

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 97
    int-to-double v0, v13

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb7ff

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 98
    int-to-double v0, v14

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb800

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 99
    int-to-double v0, v15

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb801

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 100
    move/from16 v0, v16

    int-to-double v0, v0

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb802

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 101
    move/from16 v0, v17

    int-to-double v0, v0

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb803

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 102
    move/from16 v0, v18

    int-to-double v0, v0

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb804

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 103
    move/from16 v0, v19

    int-to-double v0, v0

    move-object/from16 v2, p0

    move-object/from16 v3, v20

    const v4, 0xb805

    invoke-direct {v2, v3, v0, v1, v4}, Lo/crv;->b(Lo/cob;DI)Z

    .line 104
    return v21

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 7

    .line 43
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v4

    .line 44
    iget-object v0, p0, Lo/crv;->b:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lo/cqz;->a(III)I

    move-result v5

    .line 45
    if-gtz v5, :cond_0

    .line 46
    const-string v0, "HiH_HiSportStat"

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
    iget-object v0, p0, Lo/crv;->a:Lo/cqy;

    invoke-virtual {v0, v4}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v6

    .line 50
    invoke-static {v6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    const-string v0, "HiH_HiSportStat"

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

    .line 54
    :cond_1
    invoke-direct {p0, v6, v5, v4, p1}, Lo/crv;->d(Ljava/util/List;IILcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    return v0
.end method
