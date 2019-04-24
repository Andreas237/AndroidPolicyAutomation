.class public Lo/akx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akx$d;
    }
.end annotation


# static fields
.field private static k:Lo/akx;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:[B

.field private d:Ljava/lang/String;

.field private e:Ljava/util/Timer;

.field private f:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akx;->c:[B

    .line 86
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/akx;->e:Ljava/util/Timer;

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/akx;->b:Z

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akx;->d:Ljava/lang/String;

    .line 110
    new-instance v0, Lo/akx$4;

    invoke-direct {v0, p0}, Lo/akx$4;-><init>(Lo/akx;)V

    iput-object v0, p0, Lo/akx;->f:Landroid/os/Handler;

    .line 104
    iput-object p1, p0, Lo/akx;->a:Landroid/content/Context;

    .line 105
    invoke-direct {p0}, Lo/akx;->i()V

    .line 106
    return-void
.end method

.method static synthetic a(Lo/akx;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 43
    iput-object p1, p0, Lo/akx;->d:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 3

    .line 307
    iget-object v0, p0, Lo/akx;->f:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 308
    iget-object v0, p0, Lo/akx;->f:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 309
    return-void
.end method

.method static synthetic a(Lo/akx;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lo/akx;->a()V

    return-void
.end method

.method static synthetic a(Lo/akx;Z)Z
    .locals 0

    .line 43
    iput-boolean p1, p0, Lo/akx;->b:Z

    return p1
.end method

.method static synthetic b(Lo/akx;J)I
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2}, Lo/akx;->c(J)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/content/Context;)Lo/akx;
    .locals 2

    .line 97
    sget-object v0, Lo/akx;->k:Lo/akx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 98
    new-instance v0, Lo/akx;

    invoke-direct {v0, p0}, Lo/akx;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/akx;->k:Lo/akx;

    .line 100
    :cond_0
    sget-object v0, Lo/akx;->k:Lo/akx;

    return-object v0
.end method

.method private b()V
    .locals 9

    .line 235
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStepData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    const/4 v0, 0x1

    new-array v5, v0, [I

    .line 237
    const/4 v0, 0x2

    const/4 v1, 0x0

    aput v0, v5, v1

    .line 238
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "step"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 240
    invoke-direct {p0}, Lo/akx;->f()[J

    move-result-object v7

    .line 241
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " timeInterval  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget-wide v3, v7, v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget-wide v3, v7, v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    new-instance v8, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 243
    invoke-virtual {v8, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 244
    const/4 v0, 0x0

    aget-wide v0, v7, v0

    const/4 v2, 0x1

    aget-wide v2, v7, v2

    invoke-virtual {v8, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 245
    const/16 v0, 0x4e21

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setAlignType(I)V

    .line 246
    iget-object v0, p0, Lo/akx;->d:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setDeviceUUID(Ljava/lang/String;)V

    .line 247
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 248
    invoke-virtual {v8, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setConstantsKey([Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lo/akx;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/akx$5;

    invoke-direct {v1, p0, v7}, Lo/akx$5;-><init>(Lo/akx;[J)V

    invoke-interface {v0, v8, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 304
    return-void
.end method

.method private b(IILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 458
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUploadMinuteToList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    sub-int v0, p2, p1

    add-int/lit8 v4, v0, 0x1

    .line 461
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 462
    invoke-direct {p0, p1, v5, p3}, Lo/akx;->d(IILjava/util/List;)V

    .line 461
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 465
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/akx;)[B
    .locals 1

    .line 43
    iget-object v0, p0, Lo/akx;->c:[B

    return-object v0
.end method

.method static synthetic b(Lo/akx;[B)[B
    .locals 0

    .line 43
    iput-object p1, p0, Lo/akx;->c:[B

    return-object p1
.end method

.method private c(J)I
    .locals 2

    .line 512
    long-to-int v0, p1

    div-int/lit16 v0, v0, 0x3e8

    div-int/lit8 v0, v0, 0x3c

    return v0
.end method

.method static synthetic c(Lo/akx;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lo/akx;->b()V

    return-void
.end method

.method private d()V
    .locals 4

    .line 191
    iget-object v0, p0, Lo/akx;->e:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lo/akx;->e:Ljava/util/Timer;

    new-instance v1, Lo/akx$3;

    invoke-direct {v1, p0}, Lo/akx$3;-><init>(Lo/akx;)V

    const-wide/32 v2, 0x1b7740

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 200
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAutoCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :cond_0
    return-void
.end method

.method private d(IILjava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 470
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v4

    .line 472
    add-int v0, p2, p1

    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-long v6, v0, v4

    .line 473
    add-int v0, p2, p1

    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-long/2addr v0, v4

    const-wide/32 v2, 0xea60

    add-long v8, v0, v2

    .line 475
    iget-object v0, p0, Lo/akx;->c:[B

    add-int v1, p2, p1

    aget-byte v10, v0, v1

    .line 476
    packed-switch v10, :pswitch_data_0

    goto :goto_0

    .line 478
    :pswitch_0
    const/4 v10, 0x1

    .line 479
    goto :goto_1

    .line 481
    :pswitch_1
    const/4 v10, 0x3

    .line 482
    goto :goto_1

    .line 484
    :pswitch_2
    const/4 v10, 0x2

    .line 485
    goto :goto_1

    .line 487
    :pswitch_3
    const/4 v10, 0x4

    .line 488
    goto :goto_1

    .line 490
    :goto_0
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " sportType unkown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    :goto_1
    new-instance v11, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v11}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 495
    invoke-virtual {v11, v6, v7, v8, v9}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 496
    invoke-virtual {v11, v10}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 497
    const/4 v0, 0x7

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 498
    iget-object v0, p0, Lo/akx;->d:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 501
    invoke-interface {p3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 502
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic d(Lo/akx;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lo/akx;->k()V

    return-void
.end method

.method static synthetic e(Lo/akx;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/akx;->d:Ljava/lang/String;

    return-object v0
.end method

.method private f()[J
    .locals 7

    .line 384
    const/4 v0, 0x2

    new-array v4, v0, [J

    .line 386
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v4, v2

    .line 389
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 391
    const/4 v0, 0x1

    :try_start_0
    aget-wide v0, v4, v0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 392
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 393
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 394
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 395
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 398
    goto :goto_0

    .line 396
    :catch_0
    move-exception v6

    .line 397
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    :goto_0
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v4, v2

    .line 403
    return-object v4
.end method

.method static synthetic h(Lo/akx;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/akx;->a:Landroid/content/Context;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 517
    iget-object v0, p0, Lo/akx;->a:Landroid/content/Context;

    const-string v1, "HiHealth_UUID"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 518
    const-string v0, "PHONE_UUID"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/akx;->d:Ljava/lang/String;

    .line 519
    iget-object v0, p0, Lo/akx;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 520
    return-void

    .line 523
    :cond_0
    iget-object v0, p0, Lo/akx;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/akx$2;

    invoke-direct {v1, p0, v3}, Lo/akx$2;-><init>(Lo/akx;Landroid/content/SharedPreferences;)V

    invoke-interface {v0, v1}, Lo/clt;->e(Lo/cmc;)V

    .line 536
    return-void
.end method

.method static synthetic k(Lo/akx;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/akx;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private k()V
    .locals 8

    .line 408
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " calcuteTotalDatas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 410
    const/4 v5, -0x1

    .line 411
    const/4 v6, -0x1

    .line 414
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/akx;->c:[B

    array-length v0, v0

    if-ge v7, v0, :cond_3

    .line 415
    iget-object v0, p0, Lo/akx;->c:[B

    aget-byte v0, v0, v7

    if-eqz v0, :cond_1

    .line 417
    const/4 v0, -0x1

    if-ne v6, v0, :cond_0

    .line 418
    move v5, v7

    .line 420
    :cond_0
    move v6, v7

    goto :goto_1

    .line 422
    :cond_1
    sub-int v0, v6, v5

    const/16 v1, 0x9

    if-lt v0, v1, :cond_2

    .line 425
    invoke-direct {p0, v5, v6, v4}, Lo/akx;->b(IILjava/util/List;)V

    .line 428
    :cond_2
    const/4 v6, -0x1

    .line 414
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 433
    :cond_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 434
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/akx;->b:Z

    .line 435
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sport intensity data null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    return-void

    .line 438
    :cond_4
    new-instance v7, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 439
    invoke-virtual {v7, v4}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 440
    if-eqz v7, :cond_5

    .line 441
    iget-object v0, p0, Lo/akx;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/akx$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/akx$d;-><init>(Lo/akx;Lo/akx$4;)V

    invoke-interface {v0, v7, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 443
    :cond_5
    return-void
.end method


# virtual methods
.method public c()V
    .locals 7

    .line 313
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readTrackData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 315
    invoke-direct {p0}, Lo/akx;->f()[J

    move-result-object v5

    .line 316
    const/4 v0, 0x0

    aget-wide v0, v5, v0

    const/4 v2, 0x1

    aget-wide v2, v5, v2

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 318
    const/4 v0, 0x1

    new-array v6, v0, [I

    .line 319
    const/16 v0, 0x4e25

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 321
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 322
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 327
    iget-object v0, p0, Lo/akx;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setDeviceUUID(Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Lo/akx;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/akx$1;

    invoke-direct {v1, p0, v5}, Lo/akx$1;-><init>(Lo/akx;[J)V

    invoke-virtual {v0, v4, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 368
    return-void
.end method

.method public e()V
    .locals 4

    .line 183
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start module"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-direct {p0}, Lo/akx;->d()V

    .line 185
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/akx;->e(I)Z

    .line 186
    return-void
.end method

.method public e(I)Z
    .locals 5

    .line 212
    const-string v0, "ISportIntensity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calcuteSportIntensity : type "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " state "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/akx;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-boolean v0, p0, Lo/akx;->b:Z

    if-nez v0, :cond_0

    .line 214
    const/4 v0, 0x0

    return v0

    .line 217
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akx;->b:Z

    .line 218
    const/16 v0, 0x5a0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/akx;->c:[B

    .line 221
    iget-object v0, p0, Lo/akx;->f:Landroid/os/Handler;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 222
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 223
    iget-object v0, p0, Lo/akx;->f:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 230
    const/4 v0, 0x0

    return v0
.end method
