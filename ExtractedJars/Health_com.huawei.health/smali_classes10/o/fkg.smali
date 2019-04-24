.class public Lo/fkg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fkg$a;,
        Lo/fkg$e;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:J

.field private h:I

.field private i:I

.field private k:I

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfg;>;"
        }
    .end annotation
.end field

.field private m:I

.field private n:I

.field private o:J

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:F

.field private s:Lo/cmj;

.field private t:F

.field private u:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->d:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->b:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->e:I

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lo/fkg;->a:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->c:I

    .line 48
    const/4 v0, -0x1

    iput v0, p0, Lo/fkg;->i:I

    .line 49
    const/4 v0, -0x1

    iput v0, p0, Lo/fkg;->h:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->f:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->k:I

    .line 52
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fkg;->g:J

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fkg;->p:Z

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->n:I

    .line 56
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fkg;->o:J

    .line 57
    const/4 v0, -0x1

    iput v0, p0, Lo/fkg;->m:I

    .line 59
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/fkg;->r:F

    .line 60
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lo/fkg;->t:F

    .line 61
    const-string v0, "unKnown"

    iput-object v0, p0, Lo/fkg;->q:Ljava/lang/String;

    .line 202
    new-instance v0, Lo/fkg$2;

    invoke-direct {v0, p0}, Lo/fkg$2;-><init>(Lo/fkg;)V

    iput-object v0, p0, Lo/fkg;->u:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lo/fkg;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/fkg;->e:I

    return v0
.end method

.method static synthetic a(Lo/fkg;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/fkg;->a:I

    return p1
.end method

.method private a(IIJ)Lcom/huawei/hihealth/HiHealthData;
    .locals 2

    .line 442
    iget-object v0, p0, Lo/fkg;->q:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lo/fkg;->e(IILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v1

    .line 443
    invoke-virtual {v1, p3, p4}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 444
    return-object v1
.end method

.method private a()V
    .locals 10

    .line 249
    const-string v0, "Track_TreadmillStepPointData"

    const/16 v1, 0xe

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertData step is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,calories is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " , distance is"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " ,mStartStep is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->a:I

    .line 250
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ", mStartTime is "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/fkg;->o:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " ,mTreadMillStopStep is "

    const/16 v3, 0xa

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, " , mTreadMillStep is "

    const/16 v3, 0xc

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->f:I

    .line 251
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    .line 249
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    iget v0, p0, Lo/fkg;->f:I

    iget v1, p0, Lo/fkg;->c:I

    sub-int v4, v0, v1

    .line 253
    if-gtz v4, :cond_0

    .line 254
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_START treadmillStep is <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    return-void

    .line 257
    :cond_0
    iget v0, p0, Lo/fkg;->d:I

    iget v1, p0, Lo/fkg;->a:I

    sub-int v5, v0, v1

    .line 258
    int-to-float v0, v4

    iget v1, p0, Lo/fkg;->r:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 259
    int-to-double v0, v6

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    iget v2, p0, Lo/fkg;->t:F

    invoke-static {v0, v1, v2}, Lo/dgp;->e(DF)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-int v7, v0

    .line 260
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addData step is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,calories is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " , distance is"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-direct {p0, v5, v4}, Lo/fkg;->a(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 263
    iget v0, p0, Lo/fkg;->a:I

    add-int/2addr v0, v4

    iget-wide v1, p0, Lo/fkg;->o:J

    const v3, 0x9c42

    invoke-direct {p0, v0, v3, v1, v2}, Lo/fkg;->a(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    iget v0, p0, Lo/fkg;->i:I

    add-int/2addr v0, v7

    iget-wide v1, p0, Lo/fkg;->o:J

    const v3, 0x9c43

    invoke-direct {p0, v0, v3, v1, v2}, Lo/fkg;->a(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    iget v0, p0, Lo/fkg;->h:I

    add-int/2addr v0, v6

    iget-wide v1, p0, Lo/fkg;->o:J

    const v3, 0x9c44

    invoke-direct {p0, v0, v3, v1, v2}, Lo/fkg;->a(IIJ)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInsertData step is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->a:I

    add-int/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,calories is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->i:I

    add-int/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " , distance is"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->h:I

    add-int/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    invoke-static {v8}, Lo/amm;->a(Ljava/util/List;)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v9

    .line 268
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fkg$e;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/fkg$e;-><init>(Lo/fkg$3;)V

    invoke-interface {v0, v9, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 270
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->a:I

    .line 271
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->i:I

    .line 272
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->h:I

    .line 273
    return-void
.end method

.method private a(II)Z
    .locals 6

    .line 290
    if-le p1, p2, :cond_0

    .line 291
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalDiffStep("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") > treadmillDiffStep("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const/4 v0, 0x0

    return v0

    .line 295
    :cond_0
    if-gez p1, :cond_1

    .line 296
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStep is less than mStartStep(totalDiffStep < 0) , mStep is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , mStartStep is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    const/4 v0, 0x0

    return v0

    .line 299
    :cond_1
    const/4 v4, 0x0

    .line 301
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "d"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 304
    goto :goto_0

    .line 302
    :catch_0
    move-exception v5

    .line 303
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInsertData exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    :goto_0
    iget v0, p0, Lo/fkg;->m:I

    if-eq v4, v0, :cond_2

    .line 306
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not same day"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x0

    return v0

    .line 309
    :cond_2
    invoke-direct {p0, p2}, Lo/fkg;->c(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 310
    const/4 v0, 0x0

    return v0

    .line 313
    :cond_3
    iget v0, p0, Lo/fkg;->a:I

    if-ltz v0, :cond_4

    iget v0, p0, Lo/fkg;->b:I

    if-ltz v0, :cond_4

    iget v0, p0, Lo/fkg;->e:I

    if-ltz v0, :cond_4

    if-ltz p1, :cond_4

    .line 314
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInsertData is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    const/4 v0, 0x1

    return v0

    .line 317
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/fkg;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/fkg;->d:I

    return v0
.end method

.method static synthetic b(Lo/fkg;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/fkg;->h:I

    return p1
.end method

.method static synthetic c(Lo/fkg;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/fkg;->i:I

    return p1
.end method

.method private c()V
    .locals 7

    .line 402
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/djl;->c(Landroid/content/Context;)Lo/dao;

    move-result-object v4

    .line 405
    if-eqz v4, :cond_2

    .line 406
    invoke-virtual {v4}, Lo/dao;->e()I

    move-result v5

    .line 407
    if-nez v5, :cond_0

    .line 408
    const v0, 0x3f36c8b4    # 0.714f

    iput v0, p0, Lo/fkg;->r:F

    goto :goto_0

    .line 410
    :cond_0
    int-to-float v0, v5

    const v1, 0x3ed70a3d    # 0.42f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/fkg;->r:F

    .line 412
    :goto_0
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The Stride is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->r:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    invoke-virtual {v4}, Lo/dao;->a()F

    move-result v6

    .line 415
    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-nez v0, :cond_1

    .line 416
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lo/fkg;->t:F

    goto :goto_1

    .line 418
    :cond_1
    iput v6, p0, Lo/fkg;->t:F

    .line 421
    :goto_1
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User weight is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fkg;->t:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 424
    :cond_2
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    :goto_2
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 2

    .line 466
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/os/Bundle;

    .line 467
    const-string v0, "step"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/fkg;->d:I

    .line 468
    const-string v0, "carior"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/fkg;->b:I

    .line 469
    const-string v0, "distance"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/fkg;->e:I

    .line 470
    return-void
.end method

.method static synthetic c(Lo/fkg;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lo/fkg;->a()V

    return-void
.end method

.method private c(I)Z
    .locals 8

    .line 322
    iget-wide v0, p0, Lo/fkg;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 323
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStartTime is less 0 ,mStartTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/fkg;->o:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const/4 v0, 0x0

    return v0

    .line 326
    :cond_0
    if-gtz p1, :cond_1

    .line 327
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "totalDiffStep is less 0 , totalDiffStep is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    const/4 v0, 0x0

    return v0

    .line 330
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/fkg;->o:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    div-long v4, v0, v2

    .line 331
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_2

    .line 332
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "time is less  equla 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    const/4 v0, 0x0

    return v0

    .line 335
    :cond_2
    int-to-long v0, p1

    div-long v6, v0, v4

    .line 336
    long-to-double v0, v6

    const-wide v2, 0x4072c00000000000L    # 300.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 337
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stepRate is bigger than 300 , stepRate is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    const/4 v0, 0x0

    return v0

    .line 340
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic d(Lo/fkg;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/fkg;->b:I

    return v0
.end method

.method static synthetic d(Lo/fkg;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/fkg;->c:I

    return p1
.end method

.method static synthetic d(Lo/fkg;J)J
    .locals 0

    .line 40
    iput-wide p1, p0, Lo/fkg;->o:J

    return-wide p1
.end method

.method static synthetic d(Lo/fkg;Landroid/os/Message;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/fkg;->c(Landroid/os/Message;)V

    return-void
.end method

.method private d()Z
    .locals 7

    .line 451
    new-instance v4, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    add-long/2addr v0, v2

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 452
    const/4 v5, -0x1

    .line 454
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "d"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 457
    goto :goto_0

    .line 455
    :catch_0
    move-exception v6

    .line 456
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewDay exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    :goto_0
    iget v0, p0, Lo/fkg;->m:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, -0x1

    if-eq v5, v0, :cond_0

    iget v0, p0, Lo/fkg;->m:I

    if-eq v0, v5, :cond_0

    .line 460
    const/4 v0, 0x1

    return v0

    .line 462
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/fkg;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lo/fkg;->p:Z

    return p1
.end method

.method static synthetic e(Lo/fkg;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/fkg;->f:I

    return v0
.end method

.method static synthetic e(Lo/fkg;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/fkg;->m:I

    return p1
.end method

.method private e(IILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;
    .locals 5

    .line 432
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 433
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 434
    invoke-virtual {v4, p3}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 435
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 436
    invoke-virtual {v4, p1}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 437
    return-object v4
.end method

.method private e(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfg;>;)V"
        }
    .end annotation

    .line 187
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/fkc;->d(Landroid/content/Context;Ljava/util/List;)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v2

    .line 189
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fkg$3;

    invoke-direct {v1, p0}, Lo/fkg$3;-><init>(Lo/fkg;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 199
    return-void
.end method

.method static synthetic g(Lo/fkg;)Landroid/os/Handler;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/fkg;->u:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h(Lo/fkg;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/fkg;->n:I

    return v0
.end method

.method static synthetic k(Lo/fkg;)J
    .locals 2

    .line 40
    iget-wide v0, p0, Lo/fkg;->o:J

    return-wide v0
.end method


# virtual methods
.method public a(JI)V
    .locals 8

    .line 113
    const-wide/32 v0, 0xea60

    div-long v4, p1, v0

    .line 114
    iput p3, p0, Lo/fkg;->f:I

    .line 115
    iget-wide v0, p0, Lo/fkg;->g:J

    cmp-long v0, v0, v4

    if-gez v0, :cond_5

    .line 116
    iget-object v0, p0, Lo/fkg;->l:Ljava/util/List;

    if-nez v0, :cond_0

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fkg;->l:Ljava/util/List;

    .line 119
    :cond_0
    const-wide/32 v0, 0xea60

    div-long v0, p1, v0

    const-wide/32 v2, 0xea60

    mul-long p1, v0, v2

    .line 120
    iget-object v0, p0, Lo/fkg;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 122
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Time Changed old "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/fkg;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " new "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget v0, p0, Lo/fkg;->k:I

    sub-int v6, p3, v0

    .line 124
    iget-object v0, p0, Lo/fkg;->u:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 125
    iget v0, p0, Lo/fkg;->n:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 126
    const/4 v0, 0x3

    iput v0, p0, Lo/fkg;->n:I

    .line 127
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    new-instance v1, Lo/fkg$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/fkg$a;-><init>(Lo/fkg;Lo/fkg$3;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    .line 131
    :cond_1
    iget v0, p0, Lo/fkg;->n:I

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lo/fkg;->p:Z

    if-nez v0, :cond_2

    .line 132
    invoke-direct {p0}, Lo/fkg;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    const/4 v0, 0x2

    iput v0, p0, Lo/fkg;->n:I

    .line 134
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fkg;->p:Z

    .line 135
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    new-instance v1, Lo/fkg$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/fkg$a;-><init>(Lo/fkg;Lo/fkg$3;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    .line 138
    :cond_2
    iput-wide v4, p0, Lo/fkg;->g:J

    .line 139
    iput p3, p0, Lo/fkg;->k:I

    .line 140
    if-gtz v6, :cond_3

    .line 141
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "diffStep is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    return-void

    .line 144
    :cond_3
    int-to-double v0, v6

    const-wide v2, 0x4072c00000000000L    # 300.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 145
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "diffStep is too big ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    return-void

    .line 148
    :cond_4
    new-instance v7, Lo/cfg;

    invoke-direct {v7}, Lo/cfg;-><init>()V

    .line 149
    const-wide/32 v0, 0xea60

    sub-long v0, p1, v0

    invoke-virtual {v7, v0, v1}, Lo/cfg;->e(J)V

    .line 150
    invoke-virtual {v7, p1, p2}, Lo/cfg;->a(J)V

    .line 151
    invoke-virtual {v7, v6}, Lo/cfg;->c(I)V

    .line 153
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "diffStep is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lo/fkg;->l:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    iget-object v0, p0, Lo/fkg;->l:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/fkg;->e(Ljava/util/List;)V

    .line 161
    :cond_5
    return-void
.end method

.method public b(J)V
    .locals 4

    .line 166
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopStepPointData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    iget v0, p0, Lo/fkg;->n:I

    if-eqz v0, :cond_0

    iget v0, p0, Lo/fkg;->n:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lo/fkg;->p:Z

    if-nez v0, :cond_1

    .line 168
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lo/fkg;->n:I

    .line 171
    :cond_1
    iget v0, p0, Lo/fkg;->f:I

    iget v1, p0, Lo/fkg;->k:I

    if-le v0, v1, :cond_2

    .line 172
    const-wide/32 v0, 0xea60

    add-long/2addr v0, p1

    iget v2, p0, Lo/fkg;->f:I

    invoke-virtual {p0, v0, v1, v2}, Lo/fkg;->a(JI)V

    .line 174
    :cond_2
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    if-nez v0, :cond_3

    .line 175
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDk is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    return-void

    .line 178
    :cond_3
    iget v0, p0, Lo/fkg;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 179
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    new-instance v1, Lo/fkg$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/fkg$a;-><init>(Lo/fkg;Lo/fkg$3;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    .line 181
    :cond_4
    return-void
.end method

.method public e(Landroid/content/Context;J)V
    .locals 5

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->n:I

    .line 80
    const-wide/32 v0, 0xea60

    div-long v0, p2, v0

    iput-wide v0, p0, Lo/fkg;->g:J

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->f:I

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fkg;->l:Ljava/util/List;

    .line 83
    const/4 v0, -0x1

    iput v0, p0, Lo/fkg;->a:I

    .line 84
    const/4 v0, -0x1

    iput v0, p0, Lo/fkg;->i:I

    .line 85
    const/4 v0, -0x1

    iput v0, p0, Lo/fkg;->h:I

    .line 86
    invoke-static {p1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fkg;->q:Ljava/lang/String;

    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fkg;->o:J

    .line 88
    const/4 v0, 0x0

    iput v0, p0, Lo/fkg;->c:I

    .line 90
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "d"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lo/fkg;->o:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/fkg;->m:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_0

    .line 91
    :catch_0
    move-exception v4

    .line 92
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewDay exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :goto_0
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    new-instance v1, Lo/fkg$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/fkg$a;-><init>(Lo/fkg;Lo/fkg$3;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    goto :goto_1

    .line 98
    :cond_0
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create mHealthOpenSDk."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    new-instance v0, Lo/cmj;

    invoke-direct {v0}, Lo/cmj;-><init>()V

    iput-object v0, p0, Lo/fkg;->s:Lo/cmj;

    .line 100
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    new-instance v1, Lo/fkg$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/fkg$a;-><init>(Lo/fkg;Lo/fkg$3;)V

    const-string v2, "TreadmillStepPointData"

    invoke-virtual {v0, p1, v1, v2}, Lo/cmj;->a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I

    .line 101
    iget-object v0, p0, Lo/fkg;->s:Lo/cmj;

    new-instance v1, Lo/fkg$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/fkg$a;-><init>(Lo/fkg;Lo/fkg$3;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    .line 104
    :goto_1
    invoke-direct {p0}, Lo/fkg;->c()V

    .line 106
    return-void
.end method
