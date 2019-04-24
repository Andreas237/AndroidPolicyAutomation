.class public Lo/evy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/evy$d;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;

.field private static h:I

.field private static l:Z

.field private static n:Lo/evy;

.field private static o:Z

.field private static p:Z


# instance fields
.field private a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private b:Ljava/util/Date;

.field private c:I

.field private d:Z

.field private f:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

.field private g:Lo/exp;

.field private i:Lo/fiz;

.field private k:[I

.field private m:Landroid/os/Handler;

.field private t:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 116
    const/4 v0, -0x1

    sput v0, Lo/evy;->h:I

    .line 124
    const/4 v0, 0x0

    sput-boolean v0, Lo/evy;->p:Z

    .line 126
    const/4 v0, 0x0

    sput-boolean v0, Lo/evy;->o:Z

    .line 137
    const/4 v0, 0x0

    sput-boolean v0, Lo/evy;->l:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lo/evy;->c:I

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/evy;->d:Z

    .line 110
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/evy;->k:[I

    .line 615
    new-instance v0, Lo/evy$3;

    invoke-direct {v0, p0}, Lo/evy$3;-><init>(Lo/evy;)V

    iput-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    .line 648
    new-instance v0, Lo/evy$2;

    invoke-direct {v0, p0}, Lo/evy$2;-><init>(Lo/evy;)V

    iput-object v0, p0, Lo/evy;->t:Landroid/content/BroadcastReceiver;

    .line 156
    const-string v0, "TimeEat_SleepRefreshDataInteatorEnter SleepRefreshDataInteator"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 157
    sput-object p1, Lo/evy;->e:Landroid/content/Context;

    .line 158
    invoke-static {}, Lo/fiz;->b()Lo/fiz;

    move-result-object v0

    iput-object v0, p0, Lo/evy;->i:Lo/fiz;

    .line 159
    new-instance v0, Lo/exp;

    invoke-direct {v0}, Lo/exp;-><init>()V

    iput-object v0, p0, Lo/evy;->g:Lo/exp;

    .line 160
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lo/evy;->b:Ljava/util/Date;

    .line 161
    invoke-direct {p0}, Lo/evy;->g()V

    .line 162
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->newInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    move-result-object v0

    iput-object v0, p0, Lo/evy;->f:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    .line 163
    iget-object v0, p0, Lo/evy;->f:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->initCoreSleepTagConfig()Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

    .line 164
    const-string v0, "TimeEat_SleepRefreshDataInteatorLeave SleepRefreshDataInteator"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 165
    return-void

    nop

    :array_0
    .array-data 4
        0x13881
        0x13880
    .end array-data
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    .line 54
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lo/evy;)Ljava/util/Date;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/evy;->b:Ljava/util/Date;

    return-object v0
.end method

.method private a(Ljava/util/Date;I)V
    .locals 2

    .line 207
    iget-object v0, p0, Lo/evy;->g:Lo/exp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 208
    iget-object v0, p0, Lo/evy;->g:Lo/exp;

    new-instance v1, Lo/evy$1;

    invoke-direct {v1, p0}, Lo/evy$1;-><init>(Lo/evy;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/exp;->c(Ljava/util/Date;ILo/egg;)V

    .line 252
    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 133
    sput-boolean p0, Lo/evy;->o:Z

    .line 134
    return-void
.end method

.method static synthetic b(Lo/evy;)Lo/exp;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/evy;->g:Lo/exp;

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 19

    .line 285
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 286
    invoke-static {v12, v13}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v14

    .line 287
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evy;->i:Lo/fiz;

    invoke-virtual {v0}, Lo/fiz;->e()J

    move-result-wide v16

    .line 288
    sub-long v0, v12, v16

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/16 v18, 0x0

    goto :goto_0

    :cond_0
    const/16 v18, 0x1

    .line 289
    :goto_0
    invoke-static {v12, v13}, Lo/fee;->b(J)I

    move-result v0

    const/16 v1, 0x4b0

    if-le v0, v1, :cond_1

    .line 290
    const/4 v11, 0x1

    goto :goto_1

    .line 292
    :cond_1
    const/4 v11, 0x0

    .line 294
    :goto_1
    if-nez v18, :cond_2

    .line 295
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/evy;->d:Z

    .line 297
    :cond_2
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "!isToday:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez v18, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isNeedSmartCard:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isTodayShow:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-boolean v3, v3, Lo/evy;->d:Z

    if-nez v3, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    if-eqz v11, :cond_7

    .line 300
    move/from16 v0, p5

    const v1, 0x13881

    if-ne v0, v1, :cond_5

    .line 301
    if-nez v18, :cond_7

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/evy;->d:Z

    if-nez v0, :cond_7

    .line 302
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create jingzhun Card  and insert message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide v7, v12

    move-wide v9, v14

    invoke-direct/range {v0 .. v10}, Lo/evy;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V

    .line 304
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/evy;->d:Z

    goto :goto_4

    .line 307
    :cond_5
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v13}, Lo/evy;->d(J)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 308
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create normal  card  and insert message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide v7, v12

    move-wide v9, v14

    invoke-direct/range {v0 .. v10}, Lo/evy;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V

    goto :goto_4

    .line 311
    :cond_6
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "today created normal smart card"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    :cond_7
    :goto_4
    return-void
.end method

.method static synthetic b(Lo/evy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V
    .locals 0

    .line 54
    invoke-direct/range {p0 .. p10}, Lo/evy;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V

    return-void
.end method

.method private static b(Z)V
    .locals 0

    .line 143
    sput-boolean p0, Lo/evy;->p:Z

    .line 144
    return-void
.end method

.method public static b()Z
    .locals 1

    .line 129
    sget-boolean v0, Lo/evy;->o:Z

    return v0
.end method

.method static synthetic c(Lo/evy;)Lo/fiz;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/evy;->i:Lo/fiz;

    return-object v0
.end method

.method private c(ILjava/lang/Object;)V
    .locals 6

    .line 484
    sget-boolean v0, Lo/evy;->l:Z

    if-eqz v0, :cond_0

    .line 485
    invoke-static {}, Lo/dgh;->c()V

    .line 486
    const/4 v0, 0x0

    sput-boolean v0, Lo/evy;->l:Z

    .line 488
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 490
    :sswitch_0
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doCoreSleepSyncActionByError  errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 492
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 493
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/evy;->c(Z)V

    .line 494
    goto/16 :goto_2

    .line 496
    :sswitch_1
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doCoreSleepSyncActionByError  errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 498
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 499
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 500
    goto/16 :goto_2

    .line 507
    :sswitch_2
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "core sleep sync no data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    invoke-static {}, Lo/evy;->b()Z

    move-result v0

    if-nez v0, :cond_7

    .line 510
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 511
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 512
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 517
    :sswitch_3
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 518
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 520
    :cond_1
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    if-nez p2, :cond_2

    const-string v1, "0"

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v0, v1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/evy;->c:I

    .line 521
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastSyncCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/evy;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    goto/16 :goto_2

    .line 524
    :sswitch_4
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doCoreSleepSyncActionByError  errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 538
    const/4 v4, 0x0

    .line 539
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 540
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 542
    :cond_3
    const/4 v0, 0x0

    if-ne v0, v4, :cond_4

    invoke-static {}, Lo/evy;->b()Z

    move-result v0

    if-nez v0, :cond_4

    .line 544
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == deviceInfo..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    goto/16 :goto_2

    .line 547
    :cond_4
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastSyncCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/evy;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    iget v0, p0, Lo/evy;->c:I

    const/16 v1, 0x64

    if-ge v0, v1, :cond_7

    .line 550
    const/4 v0, -0x1

    iput v0, p0, Lo/evy;->c:I

    .line 551
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 552
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 561
    :sswitch_5
    invoke-static {}, Lo/evy;->b()Z

    move-result v0

    if-nez v0, :cond_5

    .line 562
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 563
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 564
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 566
    :cond_5
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doCoreSleepSyncActionByError  errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto/16 :goto_2

    .line 570
    :sswitch_6
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 571
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 572
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 578
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "core sleep sync cpc error = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    goto/16 :goto_2

    .line 581
    :sswitch_7
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Prevent data synchronization for multiple times errorcode :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    iget-object v0, p0, Lo/evy;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 583
    iget-object v0, p0, Lo/evy;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 584
    new-instance v0, Lo/evy$d;

    invoke-direct {v0, p0}, Lo/evy$d;-><init>(Lo/evy;)V

    iput-object v0, p0, Lo/evy;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 586
    :cond_6
    const/4 v0, 0x1

    sput-boolean v0, Lo/evy;->l:Z

    .line 587
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v5

    .line 588
    invoke-virtual {v5}, Lo/dca;->a()V

    .line 589
    iget-object v0, p0, Lo/evy;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0}, Lo/dca;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 590
    return-void

    .line 594
    :goto_1
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 595
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "core sleep sync cpc error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mIsCoreSleep = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/evy;->f()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    :cond_7
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2710 -> :sswitch_2
        0x4e20 -> :sswitch_3
        0x5208 -> :sswitch_4
        0x5209 -> :sswitch_5
        0x520a -> :sswitch_5
        0x520b -> :sswitch_5
        0x520c -> :sswitch_5
        0x520d -> :sswitch_5
        0x520e -> :sswitch_6
        0x55f0 -> :sswitch_1
        0x7532 -> :sswitch_7
    .end sparse-switch
.end method

.method static synthetic c(Lo/evy;ILjava/lang/Object;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/evy;->c(ILjava/lang/Object;)V

    return-void
.end method

.method private c(Z)V
    .locals 3

    .line 605
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 606
    const-string v0, "action_send_core_sleep_sync_rate"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 607
    const-string v0, "core_sleep_sync_rate_key"

    const/16 v1, 0x64

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 608
    const-string v0, "core_sleep_sync_status"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 609
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0, v2}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 610
    return-void
.end method

.method private d(Ljava/lang/String;)Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;
    .locals 6

    .line 389
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->newInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    move-result-object v4

    .line 390
    invoke-virtual {v4, p1}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getSleepRecommendData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    move-result-object v5

    .line 391
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 392
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommendData :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    return-object v5

    .line 395
    :cond_0
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommendData is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic d(Lo/evy;Ljava/lang/String;)Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lo/evy;->d(Ljava/lang/String;)Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized d()Lo/evy;
    .locals 4

    const-class v2, Lo/evy;

    monitor-enter v2

    .line 149
    :try_start_0
    sget-object v0, Lo/evy;->n:Lo/evy;

    if-nez v0, :cond_0

    .line 150
    new-instance v0, Lo/evy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/evy;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/evy;->n:Lo/evy;

    .line 152
    :cond_0
    sget-object v0, Lo/evy;->n:Lo/evy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V
    .locals 7

    .line 328
    new-instance v4, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 329
    invoke-virtual {v4, p5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 330
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 331
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 332
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 334
    const-string v0, "content"

    :try_start_0
    invoke-virtual {v5, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 335
    const-string v0, "sleepTitle"

    invoke-virtual {v5, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 336
    const-string v0, "msgDetailUrl"

    invoke-virtual {v5, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 337
    const-string v0, "createTime"

    invoke-virtual {v5, v0, p7, p8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    goto :goto_0

    .line 338
    :catch_0
    move-exception v6

    .line 339
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 342
    const-string v0, "100000"

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 343
    invoke-virtual {v4, p4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 344
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 345
    invoke-virtual {v4, p6}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 348
    invoke-direct {p0}, Lo/evy;->i()V

    .line 349
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    .line 350
    const v0, 0x13884

    if-ne v0, p5, :cond_0

    .line 351
    iget-object v0, p0, Lo/evy;->i:Lo/fiz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fiz;->c(Z)V

    goto :goto_1

    .line 353
    :cond_0
    iget-object v0, p0, Lo/evy;->i:Lo/fiz;

    move-wide/from16 v1, p9

    invoke-virtual {v0, v1, v2}, Lo/fiz;->b(J)V

    .line 354
    iget-object v0, p0, Lo/evy;->i:Lo/fiz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fiz;->d(Z)V

    .line 356
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/evy;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/evy;->h()V

    return-void
.end method

.method static synthetic d(Lo/evy;Ljava/util/Date;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/evy;->a(Ljava/util/Date;I)V

    return-void
.end method

.method private d(J)Z
    .locals 8

    .line 364
    iget-object v0, p0, Lo/evy;->i:Lo/fiz;

    invoke-virtual {v0}, Lo/fiz;->e()J

    move-result-wide v4

    .line 366
    iget-object v0, p0, Lo/evy;->i:Lo/fiz;

    invoke-virtual {v0}, Lo/fiz;->a()Z

    move-result v6

    .line 368
    sub-long v0, p1, v4

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    const/4 v7, 0x1

    .line 369
    :goto_0
    if-nez v6, :cond_1

    if-nez v7, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method static synthetic e(Lo/evy;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/evy;->f:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    return-object v0
.end method

.method static synthetic e(Lo/evy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 54
    invoke-direct/range {p0 .. p6}, Lo/evy;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method private static f()Z
    .locals 1

    .line 139
    sget-boolean v0, Lo/evy;->p:Z

    return v0
.end method

.method private g()V
    .locals 6

    .line 674
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 675
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 676
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 677
    if-eqz v4, :cond_0

    .line 678
    iget-object v0, p0, Lo/evy;->t:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 679
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver registe success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 681
    :cond_0
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver registe fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    :goto_0
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver registe coresleep"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 684
    return-void
.end method

.method private h()V
    .locals 5

    .line 633
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenSyncTimeOut() loadingAnimation.stop()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 635
    const-string v0, "action_send_core_sleep_sync_rate"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 636
    const-string v0, "core_sleep_sync_rate_key"

    const/16 v1, 0x64

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 637
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 638
    return-void
.end method

.method private i()V
    .locals 3

    .line 376
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/evy;->k:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 377
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iget-object v1, p0, Lo/evy;->k:[I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 376
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 379
    :cond_0
    return-void
.end method

.method static synthetic k()I
    .locals 1

    .line 54
    sget v0, Lo/evy;->h:I

    return v0
.end method


# virtual methods
.method public a(ZZ)V
    .locals 6

    .line 427
    const/4 v4, 0x0

    .line 428
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 429
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 430
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 431
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 434
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 436
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current is no device,don\'t do sync data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 438
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 439
    return-void

    .line 441
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_2

    .line 443
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is disconnect,don\'t sync data from device."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 445
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 446
    return-void

    .line 448
    :cond_2
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 449
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 451
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is aw70,don\'t sync data from device."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 453
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 454
    return-void

    .line 457
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 458
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-nez v0, :cond_5

    .line 460
    :cond_4
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is not support coreSleep."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emy;->e(I)V

    .line 462
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 463
    return-void

    .line 467
    :cond_5
    invoke-static {p1}, Lo/evy;->b(Z)V

    .line 468
    invoke-static {p2}, Lo/evy;->a(Z)V

    .line 469
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter refreshDayData  isCoreSleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    sget-object v0, Lo/evy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 472
    iget-object v0, p0, Lo/evy;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 473
    new-instance v0, Lo/evy$d;

    invoke-direct {v0, p0}, Lo/evy$d;-><init>(Lo/evy;)V

    iput-object v0, p0, Lo/evy;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 476
    :cond_6
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    sget-object v1, Lo/evy;->e:Landroid/content/Context;

    iget-object v2, p0, Lo/evy;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dca;->b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 477
    return-void
.end method

.method public c()V
    .locals 6

    .line 171
    iget-object v0, p0, Lo/evy;->b:Ljava/util/Date;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 172
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "START:requestDatas(),mCurrentDay="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/evy;->b:Ljava/util/Date;

    invoke-static {v3}, Lo/dbu;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lo/evy;->b:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v4

    .line 174
    iget-object v0, p0, Lo/evy;->g:Lo/exp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 176
    iget-object v0, p0, Lo/evy;->g:Lo/exp;

    new-instance v1, Lo/evy$4;

    invoke-direct {v1, p0}, Lo/evy$4;-><init>(Lo/evy;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v5, v2, v1}, Lo/exp;->b(JILo/egg;)V

    goto :goto_0

    .line 193
    :cond_0
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mInteractor = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :goto_0
    goto :goto_1

    .line 196
    :cond_1
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurrentDay = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    :goto_1
    return-void
.end method

.method public e()V
    .locals 12

    .line 258
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 259
    invoke-virtual {p0}, Lo/evy;->c()V

    .line 260
    iget-object v0, p0, Lo/evy;->i:Lo/fiz;

    invoke-virtual {v0}, Lo/fiz;->d()Z

    move-result v11

    .line 261
    if-eqz v11, :cond_0

    .line 263
    move-object v0, p0

    sget-object v1, Lo/evy;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_sleep_questionnaire:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, "https://messagecenter.hicloud.com/messageH5/sleephtml/QuestionnaireFrontpage.html"

    const-string v4, "00002400"

    .line 266
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 263
    const v5, 0x13884

    const/4 v6, 0x5

    invoke-direct/range {v0 .. v10}, Lo/evy;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V

    .line 269
    :cond_0
    return-void
.end method
