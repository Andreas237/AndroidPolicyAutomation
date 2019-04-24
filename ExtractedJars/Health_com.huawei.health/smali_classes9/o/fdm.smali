.class public Lo/fdm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-string v0, "HeartDataMockUtil"

    sput-object v0, Lo/fdm;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 19
    sget-object v0, Lo/fdm;->e:Ljava/lang/String;

    return-object v0
.end method

.method private static c(II)V
    .locals 22

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 27
    invoke-static {v7, v8}, Lo/dbu;->b(J)J

    move-result-wide v9

    .line 28
    move/from16 v11, p0

    :goto_0
    move/from16 v0, p1

    if-ge v11, v0, :cond_5

    .line 29
    new-instance v12, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v12}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 30
    const/4 v13, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v13, v0, :cond_4

    .line 31
    mul-int/lit8 v0, v11, 0x7

    add-int/2addr v0, v13

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v14, v9, v0

    .line 33
    const/16 v16, 0x0

    :goto_2
    move/from16 v0, v16

    const/16 v1, 0x5a0

    if-ge v0, v1, :cond_3

    .line 34
    move/from16 v0, v16

    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-long v17, v14, v0

    .line 36
    move/from16 v0, v16

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    .line 37
    const/16 v0, 0x28

    const/16 v1, 0x5a

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v0

    int-to-double v1, v0

    move-wide/from16 v19, v1

    goto :goto_3

    .line 38
    :cond_0
    move/from16 v0, v16

    const/16 v1, 0x294

    if-ge v0, v1, :cond_1

    .line 39
    const/16 v0, 0x3c

    const/16 v1, 0xc8

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v0

    int-to-double v1, v0

    move-wide/from16 v19, v1

    goto :goto_3

    .line 40
    :cond_1
    move/from16 v0, v16

    const/16 v1, 0x3fc

    if-ge v0, v1, :cond_2

    .line 41
    const/16 v0, 0x50

    const/16 v1, 0x8c

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v0

    int-to-double v1, v0

    move-wide/from16 v19, v1

    goto :goto_3

    .line 43
    :cond_2
    const/16 v0, 0x3c

    const/16 v1, 0xc8

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v0

    int-to-double v1, v0

    move-wide/from16 v19, v1

    .line 45
    :goto_3
    move-wide/from16 v0, v17

    move-wide/from16 v2, v17

    move-wide/from16 v5, v19

    const/16 v4, 0x7d2

    invoke-static/range {v0 .. v6}, Lo/fdm;->d(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v21

    .line 46
    move-object/from16 v0, v21

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 33
    add-int/lit8 v16, v16, 0x19

    goto :goto_2

    .line 48
    :cond_3
    move-wide v0, v14

    move-wide v2, v14

    const/16 v4, 0x3c

    const/16 v5, 0x46

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7e2

    invoke-static/range {v0 .. v6}, Lo/fdm;->d(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v16

    .line 49
    move-object/from16 v0, v16

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 50
    move-wide v0, v14

    move-wide v2, v14

    const/16 v4, 0x3c

    const/16 v5, 0x46

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7e2

    invoke-static/range {v0 .. v6}, Lo/fdm;->d(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v17

    .line 51
    move-object/from16 v0, v17

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 52
    move-wide v0, v14

    move-wide v2, v14

    const/16 v4, 0x3c

    const/16 v5, 0x46

    invoke-static {v4, v5}, Lo/fiv;->a(II)I

    move-result v4

    int-to-double v5, v4

    const/16 v4, 0x7e2

    invoke-static/range {v0 .. v6}, Lo/fdm;->d(JJID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v18

    .line 53
    move-object/from16 v0, v18

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 30
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 55
    :cond_4
    new-instance v0, Lo/fdm$3;

    invoke-direct {v0}, Lo/fdm$3;-><init>()V

    const/4 v1, 0x1

    invoke-static {v12, v0, v1}, Lo/fdm;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    .line 28
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 62
    :cond_5
    return-void
.end method

.method private static c(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 4

    .line 83
    if-gez p2, :cond_0

    .line 84
    sget-object v0, Lo/fdm;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryTime < 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void

    .line 87
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/fdm$5;

    invoke-direct {v1, p1, p2, p0}, Lo/fdm$5;-><init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;ILcom/huawei/hihealth/HiDataInsertOption;)V

    invoke-virtual {v0, p0, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 99
    return-void
.end method

.method private static d(JJID)Lcom/huawei/hihealth/HiHealthData;
    .locals 2

    .line 74
    new-instance v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v1, p4}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 75
    const-string v0, "-1"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v1, p0, p1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 77
    invoke-virtual {v1, p2, p3}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 78
    invoke-virtual {v1, p5, p6}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 79
    return-object v1
.end method

.method public static d()V
    .locals 2

    .line 70
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/fdm;->c(II)V

    .line 71
    return-void
.end method

.method public static e()V
    .locals 2

    .line 67
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fdm;->c(II)V

    .line 68
    return-void
.end method

.method static synthetic e(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 0

    .line 19
    invoke-static {p0, p1, p2}, Lo/fdm;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    return-void
.end method
