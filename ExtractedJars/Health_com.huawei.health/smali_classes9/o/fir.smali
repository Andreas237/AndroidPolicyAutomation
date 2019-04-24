.class public Lo/fir;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 2

    .line 162
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fir;->e(II)V

    .line 163
    return-void
.end method

.method public static b()V
    .locals 2

    .line 166
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/fir;->e(II)V

    .line 167
    return-void
.end method

.method private static b(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 4

    .line 170
    if-gez p2, :cond_0

    .line 171
    const-string v0, "Login_BPAndBSMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryTime < 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-void

    .line 174
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/fir$1;

    invoke-direct {v1, p1, p2, p0}, Lo/fir$1;-><init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;ILcom/huawei/hihealth/HiDataInsertOption;)V

    invoke-virtual {v0, p0, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 186
    return-void
.end method

.method static synthetic c(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 0

    .line 23
    invoke-static {p0, p1, p2}, Lo/fir;->b(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    return-void
.end method

.method public static d()V
    .locals 2

    .line 41
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/fir;->d(II)V

    .line 42
    return-void
.end method

.method private static d(II)V
    .locals 26

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 46
    invoke-static {v7, v8}, Lo/dbu;->b(J)J

    move-result-wide v9

    .line 47
    move/from16 v11, p0

    :goto_0
    move/from16 v0, p1

    if-ge v11, v0, :cond_1

    .line 48
    new-instance v12, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v12}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 49
    const/4 v13, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v13, v0, :cond_0

    .line 50
    mul-int/lit8 v0, v11, 0x7

    add-int/2addr v0, v13

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v14, v9, v0

    .line 52
    const-wide/32 v0, 0x1808580

    add-long v16, v14, v0

    .line 53
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7d8

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v18

    .line 54
    move-object/from16 v0, v18

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 57
    const-wide/32 v0, 0x1ee6280

    add-long v16, v14, v0

    .line 58
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7d9

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v19

    .line 59
    move-object/from16 v0, v19

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 62
    const-wide/32 v0, 0x2255100

    add-long v16, v14, v0

    .line 63
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7da

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v20

    .line 64
    move-object/from16 v0, v20

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 67
    const-wide/32 v0, 0x2ca1c80

    add-long v16, v14, v0

    .line 68
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7db

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v21

    .line 69
    move-object/from16 v0, v21

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 72
    const-wide/32 v0, 0x36ee800

    add-long v16, v14, v0

    .line 73
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7dc

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v22

    .line 74
    move-object/from16 v0, v22

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 77
    const-wide/32 v0, 0x44aa200

    add-long v16, v14, v0

    .line 78
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7dd

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v23

    .line 79
    move-object/from16 v0, v23

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 82
    const-wide/32 v0, 0x4b87f00

    add-long v16, v14, v0

    .line 83
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7df

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v24

    .line 84
    move-object/from16 v0, v24

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 87
    const-wide/32 v0, 0x4ef6d80

    add-long v16, v14, v0

    .line 88
    move-wide/from16 v0, v16

    move-wide/from16 v2, v16

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7de

    invoke-static/range {v0 .. v6}, Lo/fir;->e(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v25

    .line 89
    move-object/from16 v0, v25

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 49
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 92
    :cond_0
    new-instance v0, Lo/fir$4;

    invoke-direct {v0}, Lo/fir$4;-><init>()V

    const/4 v1, 0x1

    invoke-static {v12, v0, v1}, Lo/fir;->b(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    .line 47
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 99
    :cond_1
    return-void
.end method

.method private static e(JJDDD)Lcom/huawei/hihealth/HiHealthData;
    .locals 2

    .line 112
    new-instance v1, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2712

    invoke-direct {v1, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 113
    const-string v0, "-1"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v1, p0, p1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 115
    invoke-virtual {v1, p2, p3}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 116
    const-string v0, "bloodpressure_systolic"

    invoke-virtual {v1, v0, p4, p5}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 117
    const-string v0, "bloodpressure_diastolic"

    invoke-virtual {v1, v0, p6, p7}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 118
    const-string v0, "heart_rate"

    invoke-virtual {v1, v0, p8, p9}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 119
    return-object v1
.end method

.method private static e(JJID)Lcom/huawei/hihealth/HiHealthData;
    .locals 2

    .line 102
    new-instance v1, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2711

    invoke-direct {v1, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 103
    const-string v0, "-1"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v1, p0, p1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 105
    invoke-virtual {v1, p2, p3}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 106
    invoke-virtual {v1, p4}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 107
    invoke-virtual {v1, p5, p6}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 108
    return-object v1
.end method

.method public static e()V
    .locals 2

    .line 37
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fir;->d(II)V

    .line 38
    return-void
.end method

.method private static e(II)V
    .locals 26

    .line 123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 124
    invoke-static {v10, v11}, Lo/dbu;->b(J)J

    move-result-wide v12

    .line 125
    move/from16 v14, p0

    :goto_0
    move/from16 v0, p1

    if-ge v14, v0, :cond_1

    .line 126
    new-instance v15, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v15}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 127
    const/16 v16, 0x0

    :goto_1
    move/from16 v0, v16

    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    .line 128
    mul-int/lit8 v0, v14, 0x7

    add-int v0, v0, v16

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v17, v12, v0

    .line 130
    const-wide/32 v0, 0x1b77400

    add-long v19, v17, v0

    .line 131
    const/16 v0, 0x3c

    const/16 v1, 0xa0

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v21

    .line 132
    add-int/lit8 v0, v21, -0x5

    const/16 v1, 0x28

    const/16 v2, 0x64

    invoke-static {v1, v2}, Lo/fiv;->a(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v22

    .line 133
    move-wide/from16 v0, v19

    move-wide/from16 v2, v19

    move/from16 v4, v21

    int-to-double v4, v4

    move/from16 v6, v22

    int-to-double v6, v6

    const-wide/16 v8, 0x0

    invoke-static/range {v0 .. v9}, Lo/fir;->e(JJDDD)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v23

    .line 134
    move-object/from16 v0, v23

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 136
    const-wide/32 v0, 0x2932e00

    add-long v19, v17, v0

    .line 137
    const/16 v0, 0x3c

    const/16 v1, 0xa0

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v21

    .line 138
    add-int/lit8 v0, v21, -0x5

    const/16 v1, 0x28

    const/16 v2, 0x64

    invoke-static {v1, v2}, Lo/fiv;->a(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v22

    .line 139
    move-wide/from16 v0, v19

    move-wide/from16 v2, v19

    move/from16 v4, v21

    int-to-double v4, v4

    move/from16 v6, v22

    int-to-double v6, v6

    const-wide/16 v8, 0x0

    invoke-static/range {v0 .. v9}, Lo/fir;->e(JJDDD)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v24

    .line 140
    move-object/from16 v0, v24

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 142
    const-wide/32 v0, 0x44aa200

    add-long v19, v17, v0

    .line 143
    const/16 v0, 0x3c

    const/16 v1, 0xa0

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v21

    .line 144
    add-int/lit8 v0, v21, -0x5

    const/16 v1, 0x28

    const/16 v2, 0x64

    invoke-static {v1, v2}, Lo/fiv;->a(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v22

    .line 145
    move-wide/from16 v0, v19

    move-wide/from16 v2, v19

    move/from16 v4, v21

    int-to-double v4, v4

    move/from16 v6, v22

    int-to-double v6, v6

    const-wide/16 v8, 0x0

    invoke-static/range {v0 .. v9}, Lo/fir;->e(JJDDD)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v25

    .line 146
    move-object/from16 v0, v25

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 127
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_1

    .line 149
    :cond_0
    new-instance v0, Lo/fir$3;

    invoke-direct {v0}, Lo/fir$3;-><init>()V

    const/4 v1, 0x1

    invoke-static {v15, v0, v1}, Lo/fir;->b(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    .line 125
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 156
    :cond_1
    return-void
.end method
