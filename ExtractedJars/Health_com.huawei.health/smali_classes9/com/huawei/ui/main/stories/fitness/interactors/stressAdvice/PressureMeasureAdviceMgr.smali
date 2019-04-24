.class public Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    if-nez p1, :cond_0

    .line 59
    const-string v0, "PressureMeasureAdviceMgrPressureMeasureAdviceMgr context null"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->a:Landroid/content/Context;

    .line 63
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->c()V

    .line 65
    :goto_0
    return-void
.end method

.method private b(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 13

    .line 145
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getCoreSleepDataFromStorage start time =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",end time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    move-wide/from16 v7, p3

    .line 147
    new-instance v9, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 148
    invoke-virtual {v9, p1, p2}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 149
    move-wide/from16 v0, p3

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 150
    move/from16 v0, p5

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->c(I)I

    move-result v10

    .line 151
    packed-switch v10, :pswitch_data_0

    goto :goto_0

    .line 154
    :pswitch_0
    const/4 v0, 0x1

    new-array v11, v0, [I

    .line 155
    const/16 v0, 0x7f2

    const/4 v1, 0x0

    aput v0, v11, v1

    .line 156
    invoke-virtual {v9, v11}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;

    move-object v2, p0

    move-object/from16 v3, p6

    move-wide v4, v7

    move/from16 v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Lcom/huawei/hwbasemgr/IBaseResponseCallback;JI)V

    invoke-virtual {v0, v9, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 217
    goto :goto_0

    .line 221
    :pswitch_1
    const/4 v0, 0x1

    new-array v12, v0, [I

    .line 222
    const v0, 0xad12

    const/4 v1, 0x0

    aput v0, v12, v1

    .line 223
    invoke-virtual {v9, v12}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;

    move-object v2, p0

    move-object/from16 v3, p6

    move-wide v4, v7

    move/from16 v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Lcom/huawei/hwbasemgr/IBaseResponseCallback;JI)V

    invoke-virtual {v0, v9, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 279
    .line 290
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private b(Ljava/util/Date;ILo/egg;)V
    .locals 11

    .line 99
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getPressureAdviceFromLib() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-static {p1}, Lo/dbu;->i(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v7, v0, v2

    .line 101
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v9, v7, v0

    .line 102
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v9, v10}, Ljava/util/Date;-><init>(J)V

    invoke-static {v3}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-static {v3}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",end time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    move-object v0, p0

    move-wide v1, v9

    move-wide v3, v7

    move v5, p2

    new-instance v6, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;

    invoke-direct {v6, p0, p3}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Lo/egg;)V

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->b(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 140
    return-void
.end method

.method private c(I)I
    .locals 1

    .line 79
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 81
    :sswitch_0
    const/4 v0, 0x0

    return v0

    .line 83
    :sswitch_1
    const/4 v0, 0x1

    return v0

    .line 85
    :sswitch_2
    const/4 v0, 0x2

    return v0

    .line 87
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
        0xd -> :sswitch_1
        0x3b -> :sswitch_2
    .end sparse-switch
.end method

.method private c()V
    .locals 5

    .line 71
    const-string v0, "StressAdvice"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 72
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load pressure advice lib success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_0

    .line 73
    :catch_0
    move-exception v4

    .line 74
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load pressure advice lib fail"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/UnsatisfiedLinkError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;I)I
    .locals 1

    .line 39
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->c(I)I

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 39
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->stressAdviceFromJni(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private native stressAdviceFromJni(Ljava/lang/String;)Ljava/lang/String;
.end method


# virtual methods
.method public a(Ljava/util/Date;ILo/egg;)V
    .locals 4

    .line 92
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getPressureAdevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->b(Ljava/util/Date;ILo/egg;)V

    .line 94
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getPressureAdevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void
.end method
