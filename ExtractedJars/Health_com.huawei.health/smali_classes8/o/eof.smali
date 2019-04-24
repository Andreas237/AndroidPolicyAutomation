.class public Lo/eof;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static p:Lo/eof;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public k:Lo/afj;

.field private l:Landroid/content/Context;

.field private m:Lo/dpc;

.field private n:Z

.field private o:Ljava/lang/String;

.field private t:Landroid/os/Handler;

.field private u:Lo/ahi$e;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/eof;->d:I

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->b:Ljava/lang/String;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->a:Ljava/lang/String;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->e:Ljava/lang/String;

    .line 64
    const/4 v0, -0x1

    iput v0, p0, Lo/eof;->c:I

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->h:Ljava/lang/String;

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lo/eof;->i:Ljava/lang/String;

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/eof;->f:I

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eof;->n:Z

    .line 167
    new-instance v0, Lo/eof$3;

    invoke-direct {v0, p0}, Lo/eof$3;-><init>(Lo/eof;)V

    iput-object v0, p0, Lo/eof;->u:Lo/ahi$e;

    .line 96
    iput-object p1, p0, Lo/eof;->l:Landroid/content/Context;

    .line 97
    const/4 v0, 0x0

    iput v0, p0, Lo/eof;->f:I

    .line 98
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->m:Lo/dpc;

    .line 100
    return-void
.end method

.method public static declared-synchronized a()Lo/eof;
    .locals 6

    const-class v4, Lo/eof;

    monitor-enter v4

    .line 137
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance,instance-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/eof;->p:Lo/eof;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    sget-object v0, Lo/eof;->p:Lo/eof;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 139
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new WeightUpdateInteractors()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    new-instance v0, Lo/eof;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eof;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/eof;->p:Lo/eof;

    .line 142
    :cond_0
    sget-object v0, Lo/eof;->p:Lo/eof;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method private a(I)V
    .locals 4

    .line 376
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v3

    .line 377
    const-string v0, "device"

    const-string v1, "device_scale_ota"

    new-instance v2, Lo/eof$4;

    invoke-direct {v2, p0, p1, v3}, Lo/eof$4;-><init>(Lo/eof;ILo/eaa;)V

    invoke-virtual {v3, v0, v1, v2}, Lo/eaa;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 436
    return-void
.end method

.method private a(Z)V
    .locals 8

    .line 479
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v4

    .line 482
    new-instance v5, Lo/fhd;

    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/fhd;-><init>(Landroid/content/Context;)V

    .line 483
    const-string v0, "device"

    const-string v1, "device_scale_ota"

    invoke-virtual {v4, v0, v1}, Lo/eaa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 484
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "makeMessage, delete messageList, messageList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    const/4 v7, 0x0

    :goto_0
    :try_start_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 487
    if-nez p1, :cond_0

    .line 488
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eaa;->i(Ljava/lang/String;)Z

    .line 490
    :cond_0
    const v0, 0x133efb8

    invoke-virtual {v5, v0}, Lo/fhd;->e(I)V

    .line 491
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelNotification device ota"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 486
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 495
    :cond_1
    goto :goto_1

    .line 493
    :catch_0
    move-exception v7

    .line 494
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/eof;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/eof;->t()V

    return-void
.end method

.method static synthetic d(Lo/eof;)Landroid/content/Context;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    return-object v0
.end method

.method private d(I)Ljava/lang/String;
    .locals 6

    .line 203
    div-int/lit16 v2, p1, 0x1000

    .line 204
    div-int/lit16 v0, p1, 0x100

    rem-int/lit8 v3, v0, 0x10

    .line 205
    rem-int/lit16 v4, p1, 0x100

    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 207
    return-object v5
.end method

.method static synthetic e(Lo/eof;)Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/eof;->o:Ljava/lang/String;

    return-object v0
.end method

.method private t()V
    .locals 10

    .line 439
    new-instance v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 440
    const-string v0, "device"

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 441
    const-string v0, "device_scale_ota"

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 442
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 443
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_messagecenter_device_need_upgrade_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 444
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/eof;->p()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 446
    invoke-virtual {v4, v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 447
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage mstTitle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    const-string v6, ""

    .line 450
    invoke-virtual {v4, v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 451
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage mstContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 453
    invoke-virtual {v4, v7, v8}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 454
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://device_scale_ota?key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 455
    const-string v0, "D201809201048"

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 456
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 457
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 458
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end_to_set_message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    new-instance v9, Lo/fhd;

    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-direct {v9, v0, v4}, Lo/fhd;-><init>(Landroid/content/Context;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 460
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mcNotificationManager =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    const-wide/32 v0, 0x133efb8

    invoke-virtual {v9, v0, v1}, Lo/fhd;->c(J)V

    .line 463
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end_makeMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/eof;->t:Landroid/os/Handler;

    .line 147
    return-void
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .line 576
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 577
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpc;->c(Ljava/lang/Boolean;)V

    .line 579
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 103
    iput-object p1, p0, Lo/eof;->o:Ljava/lang/String;

    .line 104
    invoke-virtual {p0}, Lo/eof;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->i:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public a(J)Z
    .locals 8

    .line 269
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkMemory needSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    .line 271
    new-instance v5, Landroid/os/StatFs;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 272
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I

    move-result v2

    int-to-long v2, v2

    mul-long v6, v0, v2

    .line 273
    long-to-double v0, v6

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v0, v2

    double-to-long v6, v0

    .line 274
    cmp-long v0, v6, p1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()V
    .locals 9

    .line 108
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "34fa0346-d46c-439d-9cb0-2f696618846b"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 109
    const-string v0, "34fa0346-d46c-439d-9cb0-2f696618846b"

    iput-object v0, p0, Lo/eof;->o:Ljava/lang/String;

    goto :goto_0

    .line 110
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 111
    const-string v0, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    iput-object v0, p0, Lo/eof;->o:Ljava/lang/String;

    goto :goto_0

    .line 112
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 113
    const-string v0, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    iput-object v0, p0, Lo/eof;->o:Ljava/lang/String;

    .line 116
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 117
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    return-void

    .line 121
    :cond_3
    iget-object v0, p0, Lo/eof;->m:Lo/dpc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 122
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->m:Lo/dpc;

    .line 124
    :cond_4
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v5

    .line 125
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 126
    invoke-static {v6}, Lo/dpl;->b(Ljava/lang/String;)Z

    move-result v7

    .line 127
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " alreadyCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    if-eqz v5, :cond_5

    if-eqz v7, :cond_6

    .line 129
    :cond_5
    return-void

    .line 131
    :cond_6
    iget-object v0, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 132
    iget-object v0, p0, Lo/eof;->m:Lo/dpc;

    iget-object v1, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-virtual {v5}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v8, v2, v3}, Lo/dpc;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 133
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 8

    .line 181
    if-eqz p1, :cond_2

    .line 182
    const-string v0, "bleVersion"

    const v1, 0xffff

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 183
    const-string v0, "scaleVersion"

    const v1, 0xffff

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 184
    invoke-direct {p0, v6}, Lo/eof;->d(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->g:Ljava/lang/String;

    .line 185
    iget-object v0, p0, Lo/eof;->t:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 186
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 187
    const/4 v0, 0x3

    iput v0, v7, Landroid/os/Message;->what:I

    .line 188
    iget-object v0, p0, Lo/eof;->g:Ljava/lang/String;

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 189
    iget-object v0, p0, Lo/eof;->t:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 192
    :cond_0
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ble device version bleVersion"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0, v5}, Lo/eof;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " scale "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0, v6}, Lo/eof;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lo/eof;->m:Lo/dpc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 195
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->m:Lo/dpc;

    .line 197
    :cond_1
    iget-object v0, p0, Lo/eof;->m:Lo/dpc;

    iget-object v1, p0, Lo/eof;->o:Ljava/lang/String;

    iget-object v2, p0, Lo/eof;->g:Ljava/lang/String;

    iget-object v3, p0, Lo/eof;->h:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dpc;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 200
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 1

    .line 366
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/eof;->a(I)V

    .line 369
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 582
    iput-object p1, p0, Lo/eof;->h:Ljava/lang/String;

    .line 583
    return-void
.end method

.method public c(Ljava/lang/String;)Lo/afj;
    .locals 1

    .line 340
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->k:Lo/afj;

    .line 341
    iget-object v0, p0, Lo/eof;->k:Lo/afj;

    return-object v0
.end method

.method public c(Ljava/lang/Boolean;)V
    .locals 1

    .line 89
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/eof;->n:Z

    .line 90
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 503
    invoke-direct {p0, p1}, Lo/eof;->a(Z)V

    .line 504
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage  ture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    return-void
.end method

.method public c()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lo/eof;->n:Z

    return v0
.end method

.method public d()V
    .locals 4

    .line 216
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doDownloadAppFile "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 218
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->h()V

    .line 220
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 6

    .line 350
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOtaFileExist(): path = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOtaFileExist() error, file path is empty..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    const/4 v0, 0x0

    return v0

    .line 356
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 357
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    .line 358
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOtaFileExist: bExist = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    return v5
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 315
    const-string v2, ""

    .line 316
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 317
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpb;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 319
    :cond_0
    return-object v2
.end method

.method public e()V
    .locals 4

    .line 155
    iget-object v0, p0, Lo/eof;->m:Lo/dpc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 156
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->m:Lo/dpc;

    .line 158
    :cond_0
    iget v0, p0, Lo/eof;->f:I

    if-nez v0, :cond_1

    .line 159
    const/4 v0, 0x1

    iput v0, p0, Lo/eof;->f:I

    .line 161
    :cond_1
    const-string v0, ""

    iput-object v0, p0, Lo/eof;->g:Ljava/lang/String;

    .line 162
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doManualCheckDeviceNewVersion,deviceSoftVersion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lo/eof;->u:Lo/ahi$e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "set_scale_version_code"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/ahi;->d(Lo/ahi$e;I[Ljava/lang/String;)V

    .line 164
    new-instance v0, Lo/ahi$a;

    const-string v1, "get_scale_version_code"

    invoke-direct {v0, v1}, Lo/ahi$a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 165
    return-void
.end method

.method public f()Z
    .locals 4

    .line 298
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const-string v1, "connectivity"

    .line 299
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 300
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 301
    if-eqz v3, :cond_0

    .line 302
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-nez v0, :cond_0

    .line 303
    const/4 v0, 0x1

    return v0

    .line 305
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 4

    .line 228
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelDownloadApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 230
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->k()V

    .line 232
    :cond_0
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 5

    .line 255
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getBandStorePath"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    const-string v4, ""

    .line 257
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 258
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->e()Ljava/lang/String;

    move-result-object v4

    .line 260
    :cond_0
    return-object v4
.end method

.method public i()Z
    .locals 6

    .line 283
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWifiConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    .line 285
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 286
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 287
    const/4 v0, 0x1

    return v0

    .line 289
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 5

    .line 241
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getBandCheckNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    const-string v4, ""

    .line 243
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 244
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->c()Ljava/lang/String;

    move-result-object v4

    .line 246
    :cond_0
    return-object v4
.end method

.method public l()V
    .locals 5

    .line 522
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUpdateInteractors "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 525
    new-instance v0, Lo/eof$1;

    invoke-direct {v0, p0}, Lo/eof$1;-><init>(Lo/eof;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 532
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 533
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->f()V

    .line 535
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/eof;->f:I

    .line 536
    const/4 v0, 0x0

    iput v0, p0, Lo/eof;->d:I

    .line 537
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->b:Ljava/lang/String;

    .line 538
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->a:Ljava/lang/String;

    .line 539
    const-string v0, ""

    iput-object v0, p0, Lo/eof;->e:Ljava/lang/String;

    .line 540
    const/4 v0, -0x1

    iput v0, p0, Lo/eof;->c:I

    .line 541
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->h:Ljava/lang/String;

    .line 542
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->i:Ljava/lang/String;

    .line 543
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->k:Lo/afj;

    .line 544
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->m:Lo/dpc;

    .line 545
    return-void
.end method

.method public m()V
    .locals 4

    .line 552
    iget-object v0, p0, Lo/eof;->m:Lo/dpc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 553
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    iput-object v0, p0, Lo/eof;->m:Lo/dpc;

    .line 555
    :cond_0
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteDfu"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    iget-object v0, p0, Lo/eof;->m:Lo/dpc;

    invoke-virtual {v0}, Lo/dpc;->i()V

    .line 557
    return-void
.end method

.method public n()V
    .locals 4

    .line 512
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/eof;->a(Z)V

    .line 513
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage  false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    return-void
.end method

.method public o()V
    .locals 1

    .line 372
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/eof;->a(I)V

    .line 373
    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 4

    .line 467
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const-string v0, "34fa0346-d46c-439d-9cb0-2f696618846b"

    iget-object v1, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 469
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_huawei_body_fat_scale_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 470
    :cond_0
    const-string v0, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    iget-object v1, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 471
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_honor_smart_scale_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 472
    :cond_1
    const-string v0, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    iget-object v1, p0, Lo/eof;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 473
    iget-object v0, p0, Lo/eof;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_huawei_body_fat_scale_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 475
    :cond_2
    const-string v0, ""

    return-object v0
.end method

.method public s()V
    .locals 4

    .line 563
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->m:Lo/dpc;

    .line 565
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eof;->g:Ljava/lang/String;

    .line 566
    iget-object v0, p0, Lo/eof;->u:Lo/ahi$e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "set_scale_version_code"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ahi;->a(Lo/ahi$e;[Ljava/lang/String;)V

    .line 567
    return-void
.end method
