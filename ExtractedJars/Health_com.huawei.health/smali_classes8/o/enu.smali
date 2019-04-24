.class public Lo/enu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/enu$a;,
        Lo/enu$c;
    }
.end annotation


# instance fields
.field private C:Landroid/os/HandlerThread;

.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field private l:Landroid/content/Context;

.field private m:Lo/dde;

.field private n:Lo/djg;

.field private o:Lo/dpa;

.field private p:Ljava/lang/String;

.field private q:Lcom/huawei/datatype/DataDeviceInfo;

.field private r:Lo/djw$d;

.field private s:Z

.field private t:I

.field private u:I

.field private v:I

.field private w:Lo/djw$d;

.field private final x:Landroid/content/BroadcastReceiver;

.field private y:Landroid/os/PowerManager$WakeLock;

.field private z:Landroid/os/Handler;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/4 v0, -0x1

    iput v0, p0, Lo/enu;->b:I

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->d:Ljava/lang/String;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->p:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->a:Ljava/lang/String;

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/enu;->c:I

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/enu;->e:I

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->i:Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->k:Ljava/lang/String;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->h:Ljava/lang/String;

    .line 72
    const-string v0, ""

    iput-object v0, p0, Lo/enu;->g:Ljava/lang/String;

    .line 81
    const/4 v0, 0x2

    iput v0, p0, Lo/enu;->t:I

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enu;->s:Z

    .line 561
    const/4 v0, 0x0

    iput v0, p0, Lo/enu;->u:I

    .line 562
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->r:Lo/djw$d;

    .line 580
    new-instance v0, Lo/enu$6;

    invoke-direct {v0, p0}, Lo/enu$6;-><init>(Lo/enu;)V

    iput-object v0, p0, Lo/enu;->w:Lo/djw$d;

    .line 623
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->y:Landroid/os/PowerManager$WakeLock;

    .line 669
    new-instance v0, Lo/enu$9;

    invoke-direct {v0, p0}, Lo/enu$9;-><init>(Lo/enu;)V

    iput-object v0, p0, Lo/enu;->x:Landroid/content/BroadcastReceiver;

    .line 705
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->z:Landroid/os/Handler;

    .line 707
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->C:Landroid/os/HandlerThread;

    .line 84
    iput-object p1, p0, Lo/enu;->l:Landroid/content/Context;

    .line 85
    const/4 v0, 0x0

    iput v0, p0, Lo/enu;->c:I

    .line 86
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->o:Lo/dpa;

    .line 87
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->m:Lo/dde;

    .line 88
    invoke-direct {p0}, Lo/enu;->u()V

    .line 90
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/Boolean;)V

    .line 91
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lo/enu$4;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lo/enu;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lo/enu;Lcom/huawei/datatype/DataDeviceInfo;)Lcom/huawei/datatype/DataDeviceInfo;
    .locals 0

    .line 54
    iput-object p1, p0, Lo/enu;->q:Lcom/huawei/datatype/DataDeviceInfo;

    return-object p1
.end method

.method static synthetic a(Lo/enu;)Lo/dde;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/enu;->m:Lo/dde;

    return-object v0
.end method

.method private a(I)V
    .locals 4

    .line 337
    invoke-virtual {p0}, Lo/enu;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 338
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v3

    .line 339
    const-string v0, "device"

    const-string v1, "device_ota1"

    new-instance v2, Lo/enu$2;

    invoke-direct {v2, p0, v3, p1}, Lo/enu$2;-><init>(Lo/enu;Lo/eaa;I)V

    invoke-virtual {v3, v0, v1, v2}, Lo/eaa;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 396
    return-void
.end method

.method static synthetic b(Lo/enu;I)I
    .locals 0

    .line 54
    iput p1, p0, Lo/enu;->u:I

    return p1
.end method

.method static synthetic b(Lo/enu;)Lo/dpa;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/enu;->o:Lo/dpa;

    return-object v0
.end method

.method static synthetic c(Lo/enu;I)I
    .locals 0

    .line 54
    iput p1, p0, Lo/enu;->v:I

    return p1
.end method

.method static synthetic c(Lo/enu;)Lcom/huawei/datatype/DataDeviceInfo;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/enu;->q:Lcom/huawei/datatype/DataDeviceInfo;

    return-object v0
.end method

.method public static c()Lo/enu;
    .locals 1

    .line 95
    invoke-static {}, Lo/enu$c;->d()Lo/enu;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/enu;)Landroid/content/Context;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/enu;Lo/dde;)Lo/dde;
    .locals 0

    .line 54
    iput-object p1, p0, Lo/enu;->m:Lo/dde;

    return-object p1
.end method

.method private d(Z)V
    .locals 8

    .line 416
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v4

    .line 419
    new-instance v5, Lo/fhd;

    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/fhd;-><init>(Landroid/content/Context;)V

    .line 420
    const-string v0, "device"

    const-string v1, "device_ota1"

    invoke-virtual {v4, v0, v1}, Lo/eaa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 421
    const-string v0, "AW70_AW70UpdateInteractors"

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

    .line 423
    const/4 v7, 0x0

    :goto_0
    :try_start_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 424
    if-nez p1, :cond_0

    .line 425
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eaa;->i(Ljava/lang/String;)Z

    .line 427
    :cond_0
    const v0, 0x133ef48

    invoke-virtual {v5, v0}, Lo/fhd;->e(I)V

    .line 428
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelNotification device ota"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 423
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 432
    :cond_1
    goto :goto_1

    .line 430
    :catch_0
    move-exception v7

    .line 431
    const-string v0, "AW70_AW70UpdateInteractors"

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

    .line 433
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/enu;Ljava/util/List;)Z
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lo/enu;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/enu;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 54
    iput-object p1, p0, Lo/enu;->p:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lo/enu;)Lo/djw$d;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/enu;->r:Lo/djw$d;

    return-object v0
.end method

.method private e(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)Z"
        }
    .end annotation

    .line 399
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAW70MessageExists enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 401
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAW70MessageExists null == messageList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    const/4 v0, 0x0

    return v0

    .line 405
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 406
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device_ota1"

    if-ne v0, v1, :cond_1

    .line 407
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAW70MessageExists message exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    const/4 v0, 0x1

    return v0

    .line 410
    :cond_1
    goto :goto_0

    .line 411
    :cond_2
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAW70MessageExists message not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic f(Lo/enu;)I
    .locals 1

    .line 54
    iget v0, p0, Lo/enu;->v:I

    return v0
.end method

.method static synthetic g(Lo/enu;)Landroid/os/Handler;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/enu;->z:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h(Lo/enu;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/enu;->m()V

    return-void
.end method

.method static synthetic i(Lo/enu;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/enu;->l()V

    return-void
.end method

.method static synthetic k(Lo/enu;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/enu;->p()V

    return-void
.end method

.method private l()V
    .locals 4

    .line 629
    iget-object v0, p0, Lo/enu;->y:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/enu;->y:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 630
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeDone, release wacklock."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    iget-object v0, p0, Lo/enu;->y:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 632
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->y:Landroid/os/PowerManager$WakeLock;

    .line 634
    :cond_0
    return-void
.end method

.method private m()V
    .locals 5

    .line 660
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unregisterConnectStateChangedBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    :try_start_0
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    iget-object v1, p0, Lo/enu;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 667
    goto :goto_0

    .line 663
    :catch_0
    move-exception v4

    .line 664
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    goto :goto_0

    .line 665
    :catch_1
    move-exception v4

    .line 666
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    :goto_0
    return-void
.end method

.method private p()V
    .locals 5

    .line 653
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerConnectStateBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 655
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 656
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    iget-object v1, p0, Lo/enu;->x:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 657
    return-void
.end method

.method private u()V
    .locals 2

    .line 710
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "AW70_AW70UpdateInteractors"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/enu;->C:Landroid/os/HandlerThread;

    .line 711
    iget-object v0, p0, Lo/enu;->C:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 712
    new-instance v0, Lo/enu$a;

    iget-object v1, p0, Lo/enu;->C:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/enu$a;-><init>(Lo/enu;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/enu;->z:Landroid/os/Handler;

    .line 713
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 132
    const-string v2, ""

    .line 133
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 134
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpb;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 136
    :cond_0
    return-object v2
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .line 557
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 558
    iget-object v0, p0, Lo/enu;->o:Lo/dpa;

    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpa;->b(Ljava/lang/Boolean;)V

    .line 560
    :cond_0
    return-void
.end method

.method public a(Lo/djw$d;)V
    .locals 5

    .line 564
    iput-object p1, p0, Lo/enu;->r:Lo/djw$d;

    .line 565
    iget v0, p0, Lo/enu;->u:I

    if-eqz v0, :cond_0

    .line 567
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState,currentPercent:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/enu;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    iget v0, p0, Lo/enu;->u:I

    invoke-virtual {p1, v0}, Lo/djw$d;->b(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 571
    goto :goto_0

    .line 569
    :catch_0
    move-exception v4

    .line 570
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState,error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    :cond_0
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 143
    iget-boolean v0, p0, Lo/enu;->s:Z

    return v0
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 6

    .line 110
    const/4 v5, 0x0

    .line 111
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 114
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 115
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    iput v0, p0, Lo/enu;->b:I

    .line 116
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->g:Ljava/lang/String;

    .line 117
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->d:Ljava/lang/String;

    .line 118
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->p:Ljava/lang/String;

    .line 119
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/enu;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() mDeviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enu;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() deviceBtMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/enu;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :cond_1
    return-object v5
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 1

    .line 329
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/enu;->a(I)V

    .line 332
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 4

    .line 438
    invoke-direct {p0, p1}, Lo/enu;->d(Z)V

    .line 439
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage  ture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 6

    .line 517
    const-string v0, "AW70_AW70UpdateInteractors"

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

    .line 518
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 519
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOtaFileExist() error, file path is empty..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    const/4 v0, 0x0

    return v0

    .line 523
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 524
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    .line 525
    const-string v0, "AW70_AW70UpdateInteractors"

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

    .line 526
    return v5
.end method

.method public c(Ljava/lang/String;ILjava/lang/String;Lo/djw$d;)V
    .locals 4

    .line 482
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() updateMode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() mHWAW70OTABaseMgr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enu;->n:Lo/djg;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    invoke-static {}, Lo/djg;->b()Lo/djg;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->n:Lo/djg;

    .line 487
    iget-object v0, p0, Lo/enu;->n:Lo/djg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 488
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() new mHWAW70OTABaseMgr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enu;->n:Lo/djg;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    iget-object v0, p0, Lo/enu;->n:Lo/djg;

    invoke-virtual {v0}, Lo/djg;->c()I

    move-result v0

    iput v0, p0, Lo/enu;->t:I

    .line 490
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() new mOtaType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/enu;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    invoke-virtual {p0, p4}, Lo/enu;->a(Lo/djw$d;)V

    .line 492
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/enu;->d(Ljava/lang/Boolean;)V

    .line 493
    iget-object v0, p0, Lo/enu;->n:Lo/djg;

    iget-object v1, p0, Lo/enu;->w:Lo/djw$d;

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/djg;->c(Ljava/lang/String;ILjava/lang/String;Lo/djw;)V

    .line 494
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is transfering "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/enu;->s:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lo/enu;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/enu;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/dpa;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    invoke-virtual {p0}, Lo/enu;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    goto :goto_0

    .line 499
    :cond_0
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWAW70OTABaseMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    :goto_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 224
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter autoCheckAW70NewVersionService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    iget-object v0, p0, Lo/enu;->m:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 226
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->m:Lo/dde;

    .line 228
    :cond_0
    iget-object v0, p0, Lo/enu;->m:Lo/dde;

    new-instance v1, Lo/enu$5;

    invoke-direct {v1, p0}, Lo/enu$5;-><init>(Lo/enu;)V

    invoke-virtual {v0, v1}, Lo/dde;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 258
    return-void
.end method

.method public d(Ljava/lang/Boolean;)V
    .locals 1

    .line 147
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/enu;->s:Z

    .line 148
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dpa;->d(Ljava/lang/Boolean;)V

    .line 149
    return-void
.end method

.method public e()V
    .locals 5

    .line 184
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetUpdateInteractorsInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 187
    new-instance v0, Lo/enu$1;

    invoke-direct {v0, p0}, Lo/enu$1;-><init>(Lo/enu;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 194
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 195
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->i()V

    .line 197
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/enu;->c:I

    .line 198
    const/4 v0, 0x0

    iput v0, p0, Lo/enu;->e:I

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->i:Ljava/lang/String;

    .line 200
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->k:Ljava/lang/String;

    .line 201
    const-string v0, ""

    iput-object v0, p0, Lo/enu;->h:Ljava/lang/String;

    .line 202
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->q:Lcom/huawei/datatype/DataDeviceInfo;

    .line 203
    const/4 v0, -0x1

    iput v0, p0, Lo/enu;->b:I

    .line 205
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->a:Ljava/lang/String;

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->g:Ljava/lang/String;

    .line 207
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 208
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 506
    iget-object v0, p0, Lo/enu;->o:Lo/dpa;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 507
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->o:Lo/dpa;

    .line 509
    :cond_0
    iget-object v0, p0, Lo/enu;->o:Lo/dpa;

    invoke-virtual {v0, p1}, Lo/dpa;->b(Ljava/lang/String;)V

    .line 510
    return-void
.end method

.method public f()V
    .locals 6

    .line 277
    iget-object v0, p0, Lo/enu;->o:Lo/dpa;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 278
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->o:Lo/dpa;

    .line 280
    :cond_0
    iget-object v0, p0, Lo/enu;->m:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 281
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->m:Lo/dde;

    .line 283
    :cond_1
    iget-object v0, p0, Lo/enu;->m:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 284
    iget-object v0, p0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 285
    iget-object v0, p0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    iput v0, p0, Lo/enu;->b:I

    .line 286
    iget-object v0, p0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->d:Ljava/lang/String;

    .line 287
    iget-object v0, p0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enu;->p:Ljava/lang/String;

    .line 288
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/enu;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " deviceSoftVersion: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enu;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "deviceBtMac:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/enu;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    :cond_2
    iget v0, p0, Lo/enu;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/enu;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 292
    :cond_3
    new-instance v5, Landroid/content/Intent;

    const-string v0, "action_app_check_new_version_state"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 293
    const/high16 v0, 0x60000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 294
    const-string v0, "result"

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 295
    const-string v0, "state"

    const/16 v1, 0xb

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 296
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 297
    goto :goto_0

    :cond_4
    iget-object v0, p0, Lo/enu;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 298
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doManualCheckDeviceNewVersion,deviceSoftVersion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    iget-object v0, p0, Lo/enu;->m:Lo/dde;

    new-instance v1, Lo/enu$3;

    invoke-direct {v1, p0}, Lo/enu$3;-><init>(Lo/enu;)V

    invoke-virtual {v0, v1}, Lo/dde;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 321
    :cond_5
    iget-object v0, p0, Lo/enu;->o:Lo/dpa;

    iget v1, p0, Lo/enu;->b:I

    iget-object v2, p0, Lo/enu;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/enu;->d:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dpa;->d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 323
    :goto_0
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 5

    .line 470
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getAW70StorePath"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    const-string v4, ""

    .line 472
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->a()Ljava/lang/String;

    move-result-object v4

    .line 473
    return-object v4
.end method

.method public h()V
    .locals 1

    .line 334
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/enu;->a(I)V

    .line 335
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 5

    .line 458
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getAW70CheckNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    const-string v4, ""

    .line 460
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->b()Ljava/lang/String;

    move-result-object v4

    .line 461
    return-object v4
.end method

.method public k()V
    .locals 4

    .line 447
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/enu;->d(Z)V

    .line 448
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter deleteMessage  false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    return-void
.end method

.method public n()V
    .locals 1

    .line 575
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enu;->r:Lo/djw$d;

    .line 576
    return-void
.end method

.method public o()V
    .locals 4

    .line 545
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelDownloadApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 547
    iget-object v0, p0, Lo/enu;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->b()V

    .line 549
    :cond_0
    return-void
.end method
