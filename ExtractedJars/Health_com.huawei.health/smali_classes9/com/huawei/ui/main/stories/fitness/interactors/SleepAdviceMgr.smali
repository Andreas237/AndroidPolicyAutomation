.class public Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[I

.field private static final k:[Ljava/lang/String;


# instance fields
.field private a:I

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 75
    const/16 v0, 0xf

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b:[I

    .line 229
    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "core_sleep_dream_key"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "core_sleep_deep_key"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "core_sleep_shallow_key"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "core_sleep_wake_key"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "core_sleep_sum_key"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "core_sleep_deep_count_key"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "core_sleep_fall_time_key"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "core_sleep_go_bed_time_key"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "core_sleep_wake_up_time_key"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "core_sleep_efficiency_key"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "core_sleep_latency_key"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "core_sleep_score_key"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "core_sleep_snore_freq_key"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "core_sleep_wake_count_key"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "core_sleep_noon_sleep_count_key"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->k:[Ljava/lang/String;

    return-void

    :array_0
    .array-data 4
        0xac45
        0xac46
        0xac47
        0xac48
        0xac49
        0xac4a
        0xaca9
        0xacad
        0xacaa
        0xacaf
        0xacac
        0xacab
        0xacb0
        0xac4b
        0xac4c
    .end array-data
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->c:I

    .line 43
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a:I

    .line 99
    if-nez p1, :cond_0

    .line 100
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SleepAdviceMgr context null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    return-void

    .line 103
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e:Landroid/content/Context;

    .line 104
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->c()V

    .line 105
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->d:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->sleepAdviceFromJni(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 455
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$4;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)V

    invoke-virtual {v0, v1}, Lo/clq;->a(Lo/clz;)V

    .line 477
    return-void
.end method

.method private a(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 256
    move/from16 v0, p5

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v7, p1, v0

    .line 257
    new-instance v9, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 258
    invoke-virtual {v9, v7, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 259
    invoke-virtual {v9, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 260
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getCoreSleepDataFromStorage optionStartTime time =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",end time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const/4 v10, 0x1

    .line 262
    invoke-virtual {v9, v10}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 263
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->k:[Ljava/lang/String;

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 264
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b:[I

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 266
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$5;

    move-object v2, p0

    move-object/from16 v3, p6

    move/from16 v4, p5

    move-wide v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$5;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IJ)V

    invoke-interface {v0, v9, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 340
    return-void
.end method

.method private a(Ljava/util/Date;Ljava/util/Date;Lo/egg;)V
    .locals 11

    .line 139
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getSleepAdviceFromLib() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-static {p2}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v7, v0, v2

    .line 141
    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v9, v0, v2

    .line 143
    const-string v0, "SleepAdviceMgr"

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

    .line 144
    move-object v0, p0

    move-wide v1, v9

    move-wide v3, v7

    new-instance v6, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;

    invoke-direct {v6, p0, p3}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Lo/egg;)V

    const/16 v5, 0x1e

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 172
    return-void
.end method

.method private b(I)I
    .locals 1

    .line 431
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 433
    :sswitch_0
    const/4 v0, 0x0

    return v0

    .line 435
    :sswitch_1
    const/4 v0, 0x1

    return v0

    .line 437
    :sswitch_2
    const/4 v0, 0x2

    return v0

    .line 439
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

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->c:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;I)I
    .locals 0

    .line 37
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->d:I

    return p1
.end method

.method public static b(Landroid/content/Context;)Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;
    .locals 1

    .line 95
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Ljava/util/List;J)Z
    .locals 1

    .line 37
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(Ljava/util/List;J)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;I)I
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b(I)I

    move-result v0

    return v0
.end method

.method private c(J)J
    .locals 3

    .line 480
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 481
    invoke-direct {p0, v2}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->d(Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    add-long/2addr v0, p1

    return-wide v0
.end method

.method private c()V
    .locals 5

    .line 110
    const-string v0, "SleepAdvice"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 111
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load sleep advice lib success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_0

    .line 112
    :catch_0
    move-exception v4

    .line 114
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load sleep advice lib fail"

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

    .line 116
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)F
    .locals 5

    .line 485
    move-object v2, p1

    .line 486
    const/4 v3, 0x1

    .line 487
    const-string v0, "+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 488
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 489
    :cond_0
    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 490
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 491
    const/4 v3, -0x1

    .line 493
    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    rem-int/lit8 v0, v0, 0x64

    int-to-float v4, v0

    .line 494
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v1, v4, v1

    add-float/2addr v0, v1

    int-to-float v1, v3

    mul-float/2addr v0, v1

    return v0
.end method

.method private d(Ljava/util/Date;ILo/egg;)V
    .locals 11

    .line 175
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getSleepAdviceFromLib() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v7, v0, v2

    .line 177
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v9, v7, v0

    .line 179
    const-string v0, "SleepAdviceMgr"

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

    .line 180
    move-object v0, p0

    move-wide v1, v9

    move-wide v3, v7

    move v5, p2

    new-instance v6, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$1;

    invoke-direct {v6, p0, p3}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$1;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Lo/egg;)V

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 208
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;J)J
    .locals 2

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->c(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private e(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 342
    const-string v0, "SleepAdviceMgr"

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

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    move-wide v7, p3

    .line 344
    new-instance v9, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 345
    invoke-virtual {v9, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 346
    invoke-virtual {v9, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 347
    const/4 v10, 0x1

    .line 348
    invoke-virtual {v9, v10}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 349
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->k:[Ljava/lang/String;

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 350
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b:[I

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 352
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;

    move-object v2, p0

    move-object/from16 v3, p6

    move/from16 v4, p5

    move-wide v5, v7

    invoke-direct/range {v1 .. v6}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$2;-><init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IJ)V

    invoke-interface {v0, v9, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 428
    return-void
.end method

.method private e(Ljava/util/List;J)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;J)Z"
        }
    .end annotation

    .line 443
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 444
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {p2, p3}, Lo/cnk;->a(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 445
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "core_sleep_score_key"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 446
    if-lez v3, :cond_0

    .line 447
    const/4 v0, 0x1

    return v0

    .line 443
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 451
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private native sleepAdviceFromJni(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method


# virtual methods
.method public a(Ljava/util/Date;ILo/egg;)V
    .locals 4

    .line 122
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getSleepAdvice() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a()V

    .line 124
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->d(Ljava/util/Date;ILo/egg;)V

    .line 125
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave getSleepAdvice()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void
.end method

.method public c(Ljava/util/Date;Ljava/util/Date;Lo/egg;)V
    .locals 4

    .line 131
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getSleepAdvice() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a()V

    .line 133
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a(Ljava/util/Date;Ljava/util/Date;Lo/egg;)V

    .line 134
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave getSleepAdvice()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void
.end method
