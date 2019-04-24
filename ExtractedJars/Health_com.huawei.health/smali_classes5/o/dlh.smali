.class public Lo/dlh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dlh$e;
    }
.end annotation


# static fields
.field private static c:Lo/dlh;


# instance fields
.field private A:I

.field private B:I

.field private C:Ljava/lang/String;

.field private D:I

.field private E:I

.field private G:I

.field private H:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private a:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

.field private b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private d:Z

.field private e:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

.field private i:Landroid/os/Handler;

.field private j:I

.field private k:Ljava/util/ArrayList;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private o:I

.field private p:I

.field private q:J

.field private r:Z

.field private s:I

.field private t:I

.field private u:Ljava/lang/String;

.field private v:I

.field private w:Ljava/lang/String;

.field private x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

.field private y:Ljava/lang/String;

.field private z:Ljava/util/Date;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dlh;->d:Z

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlh;->f:Ljava/lang/String;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->g:I

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dlh;->l:Ljava/util/ArrayList;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dlh;->n:Ljava/util/ArrayList;

    .line 85
    const/16 v0, 0x988

    iput v0, p0, Lo/dlh;->p:I

    .line 86
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dlh;->m:I

    .line 88
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->o:I

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->s:I

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->t:I

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dlh;->r:Z

    .line 95
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dlh;->u:Ljava/lang/String;

    .line 96
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dlh;->w:Ljava/lang/String;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlh;->z:Ljava/util/Date;

    .line 98
    const/16 v0, 0x1388

    iput v0, p0, Lo/dlh;->v:I

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 100
    const-string v0, ""

    iput-object v0, p0, Lo/dlh;->y:Ljava/lang/String;

    .line 101
    const-string v0, ""

    iput-object v0, p0, Lo/dlh;->C:Ljava/lang/String;

    .line 102
    const/4 v0, -0x1

    iput v0, p0, Lo/dlh;->A:I

    .line 103
    const/4 v0, 0x1

    iput v0, p0, Lo/dlh;->D:I

    .line 105
    const/16 v0, 0xf4

    iput v0, p0, Lo/dlh;->B:I

    .line 106
    const/4 v0, -0x1

    iput v0, p0, Lo/dlh;->j:I

    .line 108
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->E:I

    .line 114
    const/4 v0, 0x1

    iput v0, p0, Lo/dlh;->G:I

    .line 738
    new-instance v0, Lo/dlh$4;

    invoke-direct {v0, p0}, Lo/dlh$4;-><init>(Lo/dlh;)V

    iput-object v0, p0, Lo/dlh;->H:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 125
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iput-object v0, p0, Lo/dlh;->e:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    .line 126
    new-instance v0, Lo/dlh$e;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dlh$e;-><init>(Lo/dlh;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    .line 128
    return-void
.end method

.method static synthetic a(Lo/dlh;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public static a()Lo/dlh;
    .locals 2

    .line 118
    sget-object v0, Lo/dlh;->c:Lo/dlh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 119
    new-instance v0, Lo/dlh;

    invoke-direct {v0}, Lo/dlh;-><init>()V

    sput-object v0, Lo/dlh;->c:Lo/dlh;

    .line 121
    :cond_0
    sget-object v0, Lo/dlh;->c:Lo/dlh;

    return-object v0
.end method

.method private a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 4

    .line 729
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendCommand  deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v3

    invoke-static {v3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 731
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 5

    .line 445
    move-object v4, p1

    :try_start_0
    check-cast v4, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;

    .line 447
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 449
    invoke-direct {p0, v4}, Lo/dlh;->b(Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;)V

    goto :goto_0

    .line 451
    :cond_0
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != maintLog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 455
    :goto_0
    goto :goto_1

    .line 453
    :catch_0
    move-exception v4

    .line 454
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---queryOtaAllowHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/dlh;Ljava/lang/Object;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->g(Ljava/lang/Object;)V

    return-void
.end method

.method private a([B)Z
    .locals 4

    .line 981
    const/4 v2, 0x0

    .line 982
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    .line 983
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const v1, 0x1adb2

    if-ne v1, v0, :cond_0

    .line 984
    const/4 v2, 0x1

    .line 986
    :cond_0
    return v2
.end method

.method static synthetic b(Lo/dlh;I)I
    .locals 0

    .line 52
    iput p1, p0, Lo/dlh;->j:I

    return p1
.end method

.method static synthetic b(Lo/dlh;)Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dlh;->f:Ljava/lang/String;

    return-object v0
.end method

.method private b(Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;)V
    .locals 7

    .line 462
    invoke-virtual {p1}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->getIndex()I

    move-result v4

    .line 464
    iget v0, p0, Lo/dlh;->j:I

    if-ne v4, v0, :cond_0

    .line 465
    invoke-virtual {p1}, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->getValue()Ljava/lang/String;

    move-result-object v5

    .line 467
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v6

    .line 468
    iget v0, p0, Lo/dlh;->t:I

    array-length v1, v6

    add-int/2addr v0, v1

    iput v0, p0, Lo/dlh;->t:I

    .line 469
    iget-object v0, p0, Lo/dlh;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    iget v0, p0, Lo/dlh;->E:I

    array-length v1, v6

    add-int/2addr v0, v1

    iput v0, p0, Lo/dlh;->E:I

    .line 471
    iget v0, p0, Lo/dlh;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dlh;->j:I

    .line 473
    goto :goto_0

    .line 474
    :cond_0
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepOrDFXPlayData2List() lost  index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    :goto_0
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addSleepOrDFXPlayData2List() currentApplyDataSize ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+donePackatgeSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",currentSleepOrDFXFrameNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget v0, p0, Lo/dlh;->p:I

    iget v1, p0, Lo/dlh;->t:I

    if-ne v0, v1, :cond_a

    .line 480
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->g:I

    .line 481
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->t:I

    .line 483
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 484
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 486
    iget v0, p0, Lo/dlh;->E:I

    iput v0, p0, Lo/dlh;->s:I

    .line 487
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 488
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    iget-object v1, p0, Lo/dlh;->l:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/dlh;->f:Ljava/lang/String;

    iget-object v3, p0, Lo/dlh;->z:Ljava/util/Date;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->writeLogToFile(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Date;)V

    .line 491
    :cond_1
    iget-object v0, p0, Lo/dlh;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 493
    iget v0, p0, Lo/dlh;->o:I

    if-gtz v0, :cond_4

    .line 494
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepOrDFXPlayData2List() lost  package error!!!!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 496
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 497
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 498
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    :cond_2
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "package error"

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 502
    :cond_3
    return-void

    .line 505
    :cond_4
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "***addSleepOrDFXPlayData2List() send ok  doneTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->s:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    iget v0, p0, Lo/dlh;->s:I

    iget v1, p0, Lo/dlh;->o:I

    if-lt v0, v1, :cond_9

    .line 509
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dlh;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dlh;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dlh;->w:Ljava/lang/String;

    .line 510
    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 511
    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 514
    :cond_5
    const/4 v5, 0x0

    .line 516
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 517
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->transferFileEndProcess()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v5

    .line 520
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v5, :cond_7

    .line 521
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSleepOrDFXPlayData2List transferFileEndProcess sendDeviceData ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    invoke-direct {p0, v5}, Lo/dlh;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 525
    :cond_7
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 526
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dlh$5;

    invoke-direct {v1, p0}, Lo/dlh$5;-><init>(Lo/dlh;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 535
    :cond_8
    goto :goto_1

    .line 536
    :cond_9
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    new-instance v1, Lo/dlh$1;

    invoke-direct {v1, p0}, Lo/dlh$1;-><init>(Lo/dlh;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 547
    :cond_a
    :goto_1
    return-void
.end method

.method private b(Ljava/lang/Object;)V
    .locals 5

    .line 192
    move-object v0, p1

    :try_start_0
    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    .line 193
    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 194
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 195
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 196
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "error ,filelist is null"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    :cond_0
    return-void

    .line 202
    :cond_1
    :try_start_1
    iget v0, p0, Lo/dlh;->D:I

    if-eqz v0, :cond_2

    .line 203
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    iget-object v1, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    iget v2, p0, Lo/dlh;->D:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->filtertFile(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    .line 205
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dlh;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dlh;->u:Ljava/lang/String;

    .line 206
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintSleepOrDFXFileNameHandle() allFileListName "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlh;->u:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 208
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintSleepOrDFXFileNameHandle fileList() = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 210
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 211
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dlh;->k()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 216
    :cond_3
    invoke-direct {p0}, Lo/dlh;->f()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 220
    :cond_4
    :goto_0
    goto :goto_1

    .line 218
    :catch_0
    move-exception v4

    .line 219
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---getMaintSleepOrDFXFileNameHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/dlh;Ljava/lang/Object;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->b(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lo/dlh;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lo/dlh;[B)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->b([B)V

    return-void
.end method

.method private b([B)V
    .locals 4

    .line 941
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isgetlog_from_aboutactivity  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dlh;->d:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 942
    iget-boolean v0, p0, Lo/dlh;->d:Z

    if-eqz v0, :cond_0

    .line 943
    iget-object v0, p0, Lo/dlh;->a:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    iget-object v1, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p0, v0, v1}, Lo/dlh;->b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 944
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isgetlog_from_aboutactivity  =false= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 945
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dlh;->d:Z

    .line 946
    iget-object v0, p0, Lo/dlh;->a:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsFromAbout(I)V

    .line 947
    return-void

    .line 976
    :cond_0
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the version is not beta. do not support 11"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 978
    return-void
.end method

.method static synthetic c(Lo/dlh;I)I
    .locals 0

    .line 52
    iput p1, p0, Lo/dlh;->G:I

    return p1
.end method

.method static synthetic c(Lo/dlh;)Ljava/util/ArrayList;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c(I)V
    .locals 7

    .line 227
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 228
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 229
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 231
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 232
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 233
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 234
    invoke-direct {p0}, Lo/dlh;->i()Ljava/lang/String;

    move-result-object v5

    .line 235
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 236
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 240
    :cond_1
    if-eqz p1, :cond_2

    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xf

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 242
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 243
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 248
    :cond_2
    invoke-direct {p0, v4}, Lo/dlh;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 249
    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 5

    .line 278
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    iput-object v0, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 280
    iget-object v0, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTimeout()I

    move-result v0

    iput v0, p0, Lo/dlh;->v:I

    .line 281
    iget-object v0, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTransfer_unit_size()I

    move-result v0

    iput v0, p0, Lo/dlh;->B:I

    .line 283
    iget-object v0, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getMax_apply_data_size()I

    move-result v0

    iput v0, p0, Lo/dlh;->m:I

    .line 284
    iget v0, p0, Lo/dlh;->m:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 285
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dlh;->m:I

    .line 287
    :cond_0
    iget v0, p0, Lo/dlh;->m:I

    iput v0, p0, Lo/dlh;->p:I

    .line 290
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getMaintSleepOrDFXParametersHandle() ok, protocalVersion :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 291
    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n transferUnitSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n maxApplyDataSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n waitTimeout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n breakPointEnable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    .line 295
    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getTransfer_bitmap_enable()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 290
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 299
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->deleteTenDayFile()V

    .line 300
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    iget v1, p0, Lo/dlh;->A:I

    iget-object v2, p0, Lo/dlh;->y:Ljava/lang/String;

    iget-object v3, p0, Lo/dlh;->C:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->initMaintenanceParame(ILjava/lang/String;Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    :cond_1
    goto :goto_0

    .line 303
    :catch_0
    move-exception v4

    .line 304
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---getMaintSleepOrDFXParametersHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 306
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 307
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dlh;->k()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 311
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/dlh;Ljava/lang/Object;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->c(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lo/dlh;[B)Z
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->a([B)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/dlh;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 52
    iput-object p1, p0, Lo/dlh;->f:Ljava/lang/String;

    return-object p1
.end method

.method private d(I)V
    .locals 4

    .line 132
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4fee\u6539\u72b6\u6001\u673a\u72b6\u6001\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ||STATE_GPS = 0 STATE_SLEEP_DFX = 1"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    return-void
.end method

.method private d(Ljava/lang/Object;)V
    .locals 6

    .line 345
    move-object v5, p1

    :try_start_0
    check-cast v5, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    .line 346
    invoke-virtual {v5}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->getFileSize()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lo/dlh;->o:I

    .line 347
    invoke-virtual {v5}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->getFileCrc()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dlh;->q:J

    .line 348
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " querySleepOrDFXFileInformationHandle() ok, fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", fileCrc = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dlh;->q:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget v0, p0, Lo/dlh;->o:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 350
    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 351
    iget-object v0, p0, Lo/dlh;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 353
    :cond_0
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 354
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 357
    :cond_1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lo/dlh;->z:Ljava/util/Date;

    .line 358
    invoke-virtual {p0}, Lo/dlh;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 362
    :cond_2
    :goto_0
    goto :goto_1

    .line 360
    :catch_0
    move-exception v5

    .line 361
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---querySleepOrDFXFileInformationHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :goto_1
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 8

    .line 317
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 318
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 319
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 321
    :cond_0
    invoke-direct {p0}, Lo/dlh;->h()V

    .line 322
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 325
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 326
    const/16 v0, 0xa

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 327
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 328
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 329
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 330
    invoke-direct {p0}, Lo/dlh;->i()Ljava/lang/String;

    move-result-object v7

    .line 331
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 332
    invoke-virtual {v6, v7}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 336
    :cond_1
    invoke-direct {p0, v6}, Lo/dlh;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 337
    return-void
.end method

.method static synthetic d(Lo/dlh;Ljava/lang/Object;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->e(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic d(Lo/dlh;)Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lo/dlh;->r:Z

    return v0
.end method

.method static synthetic e(Lo/dlh;)Landroid/os/Handler;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    return-object v0
.end method

.method private e(I)Ljava/lang/String;
    .locals 1

    .line 603
    const-string v0, ""

    .line 604
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 606
    :sswitch_0
    const-string v0, "SUCCESS"

    .line 607
    goto :goto_0

    .line 609
    :sswitch_1
    const-string v0, "UNKNOW ERROR"

    .line 610
    goto :goto_0

    .line 612
    :sswitch_2
    const-string v0, "NOT SUPPORT THIS REQUEST"

    .line 613
    goto :goto_0

    .line 615
    :sswitch_3
    const-string v0, "NO PERMISSION"

    .line 616
    goto :goto_0

    .line 618
    :sswitch_4
    const-string v0, "SYSTEM BUSY"

    .line 619
    goto :goto_0

    .line 621
    :sswitch_5
    const-string v0, "REQUEST FORMAT ERROR"

    .line 622
    goto :goto_0

    .line 624
    :sswitch_6
    const-string v0, "REQUEST PARAMETER ERROR"

    .line 625
    goto :goto_0

    .line 627
    :sswitch_7
    const-string v0, "MEMORY ERROR"

    .line 628
    goto :goto_0

    .line 630
    :sswitch_8
    const-string v0, "RESPONSE TIMEOUT"

    .line 631
    goto :goto_0

    .line 633
    :sswitch_9
    const-string v0, "\u4f4e\u7535\u91cf "

    .line 634
    goto :goto_0

    .line 636
    :sswitch_a
    const-string v0, "\u5355\u677f\u4e0d\u652f\u6301OTA\u5347\u7ea7"

    .line 637
    .line 641
    :goto_0
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x186a0 -> :sswitch_0
        0x186a1 -> :sswitch_1
        0x186a2 -> :sswitch_2
        0x186a3 -> :sswitch_3
        0x186a4 -> :sswitch_4
        0x186a5 -> :sswitch_5
        0x186a6 -> :sswitch_6
        0x186a7 -> :sswitch_7
        0x186a8 -> :sswitch_8
        0x19641 -> :sswitch_a
        0x19642 -> :sswitch_9
    .end sparse-switch
.end method

.method private e(Ljava/lang/Object;)V
    .locals 6

    .line 413
    move-object v0, p1

    :try_start_0
    check-cast v0, [I

    move-object v4, v0

    check-cast v4, [I

    .line 414
    const/4 v5, -0x1

    .line 415
    array-length v0, v4

    if-lez v0, :cond_0

    .line 416
    const/4 v0, 0x0

    aget v5, v4, v0

    .line 418
    :cond_0
    const v0, 0x186a0

    if-ne v0, v5, :cond_1

    .line 419
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->j:I

    .line 420
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->t:I

    .line 421
    iget v0, p0, Lo/dlh;->s:I

    iput v0, p0, Lo/dlh;->E:I

    .line 422
    iget-object v0, p0, Lo/dlh;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 423
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 424
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 425
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 426
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    iget v1, p0, Lo/dlh;->v:I

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 429
    :cond_1
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 430
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 431
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dlh;->k()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 437
    :cond_2
    :goto_0
    goto :goto_1

    .line 435
    :catch_0
    move-exception v4

    .line 436
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---applySleepOrDFXDataHandle errorCodeHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/dlh;Ljava/lang/Object;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->d(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic f(Lo/dlh;)I
    .locals 1

    .line 52
    iget v0, p0, Lo/dlh;->v:I

    return v0
.end method

.method private f()V
    .locals 6

    .line 255
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 256
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 257
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 261
    :cond_0
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 262
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->maintParametersCommand()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v4

    .line 263
    invoke-direct {p0}, Lo/dlh;->i()Ljava/lang/String;

    move-result-object v5

    .line 264
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 265
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 268
    :cond_1
    invoke-direct {p0, v4}, Lo/dlh;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 270
    :cond_2
    return-void
.end method

.method static synthetic g(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    return-object v0
.end method

.method private g(Ljava/lang/Object;)V
    .locals 5

    .line 582
    move-object v0, p1

    :try_start_0
    check-cast v0, [I

    move-object v4, v0

    check-cast v4, [I

    .line 584
    const/4 v0, 0x0

    aget v0, v4, v0

    const v1, 0x186a0

    if-eq v1, v0, :cond_0

    .line 585
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 586
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 587
    iget-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    aget v1, v4, v1

    const/4 v2, 0x0

    aget v2, v4, v2

    invoke-direct {p0, v2}, Lo/dlh;->e(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 593
    :cond_0
    goto :goto_0

    .line 591
    :catch_0
    move-exception v4

    .line 592
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---errorCodeHandle Exception---e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    :goto_0
    return-void
.end method

.method static synthetic h(Lo/dlh;)Ljava/lang/String;
    .locals 1

    .line 52
    invoke-direct {p0}, Lo/dlh;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 649
    iget v0, p0, Lo/dlh;->m:I

    iput v0, p0, Lo/dlh;->p:I

    .line 650
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->o:I

    .line 651
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->s:I

    .line 652
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->E:I

    .line 654
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->t:I

    .line 655
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dlh;->q:J

    .line 656
    iget-object v0, p0, Lo/dlh;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 657
    iget-object v0, p0, Lo/dlh;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 658
    return-void
.end method

.method static synthetic i(Lo/dlh;)I
    .locals 1

    .line 52
    iget v0, p0, Lo/dlh;->g:I

    return v0
.end method

.method private i()Ljava/lang/String;
    .locals 2

    .line 990
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 991
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 992
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 994
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic k(Lo/dlh;)I
    .locals 2

    .line 52
    iget v0, p0, Lo/dlh;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/dlh;->g:I

    return v0
.end method

.method private k()Ljava/lang/String;
    .locals 5

    .line 723
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dlh;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dlh;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 724
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportStatusFileList result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    return-object v4
.end method

.method static synthetic k(Lo/dlh;Ljava/lang/Object;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/dlh;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic l(Lo/dlh;)Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lo/dlh;->d:Z

    return v0
.end method

.method static synthetic m(Lo/dlh;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dlh;->e:Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    return-object v0
.end method

.method static synthetic p(Lo/dlh;)Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/dlh;->a:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;IILjava/lang/String;)V
    .locals 12

    .line 370
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 371
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 372
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 376
    :cond_0
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 377
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 378
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p2

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 379
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p3

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 381
    iget-object v0, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v8

    .line 384
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 385
    const-string v0, "AW"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 386
    move-object v9, v5

    goto :goto_0

    .line 388
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 391
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 394
    :goto_0
    new-instance v10, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v10}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 395
    const/16 v0, 0xa

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 396
    const/4 v0, 0x4

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 397
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 398
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 399
    invoke-direct {p0}, Lo/dlh;->i()Ljava/lang/String;

    move-result-object v11

    .line 400
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 401
    invoke-virtual {v10, v11}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 405
    :cond_3
    invoke-direct {p0, v10}, Lo/dlh;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 406
    return-void
.end method

.method public b()V
    .locals 7

    .line 553
    iget v0, p0, Lo/dlh;->o:I

    iget v1, p0, Lo/dlh;->s:I

    sub-int v4, v0, v1

    .line 554
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter getSleepOrDFXApplyDataFromDevice spareSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+currentApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    iget-object v0, p0, Lo/dlh;->x:Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;->getFile_protocal_version()Ljava/lang/String;

    move-result-object v5

    .line 556
    const/4 v6, 0x0

    .line 557
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 558
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepOrDFXApplyDataFromDevice version : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    const-string v0, "AW"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 560
    const/4 v6, 0x1

    .line 564
    :cond_0
    iget v0, p0, Lo/dlh;->p:I

    if-le v4, v0, :cond_1

    if-eqz v6, :cond_2

    .line 566
    :cond_1
    iput v4, p0, Lo/dlh;->p:I

    .line 567
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepOrDFXApplyDataFromDevice requeset final package currentApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    iget-object v0, p0, Lo/dlh;->f:Ljava/lang/String;

    iget v1, p0, Lo/dlh;->s:I

    iget v2, p0, Lo/dlh;->p:I

    const-string v3, ""

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/dlh;->a(Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_0

    .line 571
    :cond_2
    iget v0, p0, Lo/dlh;->m:I

    iput v0, p0, Lo/dlh;->p:I

    .line 572
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepOrDFXApplyDataFromDevice requeset next package currentApplyDataSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dlh;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    iget-object v0, p0, Lo/dlh;->f:Ljava/lang/String;

    iget v1, p0, Lo/dlh;->s:I

    iget v2, p0, Lo/dlh;->p:I

    const-string v3, ""

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/dlh;->a(Ljava/lang/String;IILjava/lang/String;)V

    .line 575
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 136
    iget-boolean v0, p0, Lo/dlh;->r:Z

    if-eqz v0, :cond_0

    .line 137
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMainteFile isMainting, so return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_0
    iput-object p2, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 141
    iput-object p1, p0, Lo/dlh;->a:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    .line 142
    iget-object v0, p0, Lo/dlh;->a:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getIsFromAbout()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 143
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dlh;->d:Z

    goto :goto_0

    .line 145
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dlh;->d:Z

    .line 147
    :goto_0
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isFromAbout === "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlh;->a:Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getIsFromAbout()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dlh;->r:Z

    .line 150
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 151
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dlh;->d(I)V

    .line 153
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bf7\u6c42\u53ef\u7ef4\u53ef\u6d4b transferFileInfo.getDeviceMac() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceMac()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , transferFileInfo.getDeviceVersion() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const/4 v0, 0x1

    iput v0, p0, Lo/dlh;->D:I

    .line 161
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceMac()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dlh;->y:Ljava/lang/String;

    .line 162
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dlh;->C:Ljava/lang/String;

    .line 163
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDeviceType()I

    move-result v0

    iput v0, p0, Lo/dlh;->A:I

    .line 166
    iget-object v0, p0, Lo/dlh;->y:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/dlh;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 167
    :cond_2
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8bf7\u6c42\u53ef\u7ef4\u53ef\u6d4b ,parameter is error!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 169
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, " parameter is error"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 170
    return-void

    .line 173
    :cond_3
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    move-result-object v0

    iput-object v0, p0, Lo/dlh;->h:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 174
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u624b\u8868\u53ef\u7ef4\u53ef\u6d4b  \u6ce8\u518c\u56de\u8c03"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getDfxLogType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dlh;->c(I)V

    goto :goto_1

    .line 178
    :cond_4
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bf7\u6c42\u7c7b\u578b\u9519\u8bef transferFileInfo.getType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-virtual {p0}, Lo/dlh;->d()V

    .line 180
    invoke-virtual {p0}, Lo/dlh;->e()V

    .line 181
    iget-object v0, p0, Lo/dlh;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, " type not found"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 183
    :goto_1
    return-void
.end method

.method public c()V
    .locals 4

    .line 703
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter resetDFXMaintenance()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    invoke-direct {p0}, Lo/dlh;->h()V

    .line 705
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 706
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 708
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lo/dlh;->j:I

    .line 709
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dlh;->r:Z

    .line 710
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->g:I

    .line 711
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dlh;->u:Ljava/lang/String;

    .line 712
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dlh;->w:Ljava/lang/String;

    .line 713
    const/16 v0, 0x1388

    iput v0, p0, Lo/dlh;->v:I

    .line 714
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dlh;->m:I

    .line 715
    const/16 v0, 0xf4

    iput v0, p0, Lo/dlh;->B:I

    .line 716
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 717
    return-void
.end method

.method public d()V
    .locals 4

    .line 664
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter resetMaintenance()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    invoke-direct {p0}, Lo/dlh;->h()V

    .line 666
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dlh;->r:Z

    .line 667
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->g:I

    .line 668
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dlh;->u:Ljava/lang/String;

    .line 669
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dlh;->w:Ljava/lang/String;

    .line 671
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 672
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 673
    const/16 v0, 0x1388

    iput v0, p0, Lo/dlh;->v:I

    .line 674
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dlh;->m:I

    .line 675
    const/16 v0, 0xf4

    iput v0, p0, Lo/dlh;->B:I

    .line 676
    return-void
.end method

.method public e()V
    .locals 4

    .line 682
    const-string v0, "HWFileTransferTaskAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter resetSleepOrDFXMaintenance()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    invoke-direct {p0}, Lo/dlh;->h()V

    .line 684
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 685
    iget-object v0, p0, Lo/dlh;->i:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 687
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lo/dlh;->j:I

    .line 688
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dlh;->r:Z

    .line 689
    const/4 v0, 0x0

    iput v0, p0, Lo/dlh;->g:I

    .line 690
    const-string v0, "All file:"

    iput-object v0, p0, Lo/dlh;->u:Ljava/lang/String;

    .line 691
    const-string v0, "Done file:"

    iput-object v0, p0, Lo/dlh;->w:Ljava/lang/String;

    .line 692
    const/16 v0, 0x1388

    iput v0, p0, Lo/dlh;->v:I

    .line 693
    const/16 v0, 0x2dc

    iput v0, p0, Lo/dlh;->m:I

    .line 694
    const/16 v0, 0xf4

    iput v0, p0, Lo/dlh;->B:I

    .line 695
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dea;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 696
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 697
    return-void
.end method

.method public e([B)V
    .locals 2

    .line 734
    iget-object v0, p0, Lo/dlh;->H:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 735
    return-void
.end method
