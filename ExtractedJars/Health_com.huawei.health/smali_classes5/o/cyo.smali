.class public Lo/cyo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyn;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cyo$c;,
        Lo/cyo$b;
    }
.end annotation


# static fields
.field private static a:Lo/cyo$b;

.field private static c:Lo/cyo$c;

.field private static final e:Ljava/lang/Object;

.field private static final f:Ljava/lang/Object;


# instance fields
.field private b:Landroid/bluetooth/BluetoothDevice;

.field private d:Lo/cxx;

.field private g:Z

.field private h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field private i:Lo/cxk;

.field private k:I

.field private l:I

.field private n:Lo/cxz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cyo;->e:Ljava/lang/Object;

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cyo;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;I)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyo;->b:Landroid/bluetooth/BluetoothDevice;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyo;->d:Lo/cxx;

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyo;->g:Z

    .line 65
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    iput-object v0, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyo;->i:Lo/cxk;

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lo/cyo;->l:I

    .line 451
    new-instance v0, Lo/cyo$3;

    invoke-direct {v0, p0}, Lo/cyo$3;-><init>(Lo/cyo;)V

    iput-object v0, p0, Lo/cyo;->n:Lo/cxz;

    .line 79
    iput-object p2, p0, Lo/cyo;->b:Landroid/bluetooth/BluetoothDevice;

    .line 80
    iput-object p3, p0, Lo/cyo;->d:Lo/cxx;

    .line 81
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    iput-object v0, p0, Lo/cyo;->i:Lo/cxk;

    .line 82
    iget-object v0, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceBTType(I)V

    .line 83
    iput p4, p0, Lo/cyo;->l:I

    .line 84
    return-void
.end method

.method static synthetic a(Lo/cyo;)I
    .locals 1

    .line 37
    iget v0, p0, Lo/cyo;->l:I

    return v0
.end method

.method static synthetic a(Lo/cyo;Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    .line 37
    iput-object p1, p0, Lo/cyo;->b:Landroid/bluetooth/BluetoothDevice;

    return-object p1
.end method

.method static synthetic b(Lo/cyo;)Lo/cxx;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/cyo;->d:Lo/cxx;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 174
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/cyo;->d(I)V

    .line 175
    return-void
.end method

.method static synthetic c(Lo/cyo;)Lo/cxk;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/cyo;->i:Lo/cxk;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 181
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " connectionFail"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    const v0, 0xf462a

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 183
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/cyo;->d(I)V

    .line 184
    return-void
.end method

.method static synthetic c(Lo/cyo;Landroid/bluetooth/BluetoothSocket;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/cyo;->e(Landroid/bluetooth/BluetoothSocket;)V

    return-void
.end method

.method private d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 8

    .line 91
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter connectBTDeviceThread()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 94
    invoke-static {}, Lo/cyo;->i()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 95
    :try_start_0
    sget-object v0, Lo/cyo;->a:Lo/cyo$b;

    if-eqz v0, :cond_0

    .line 96
    sget-object v0, Lo/cyo;->a:Lo/cyo$b;

    invoke-virtual {v0}, Lo/cyo$b;->e()V

    .line 97
    const/4 v0, 0x0

    sput-object v0, Lo/cyo;->a:Lo/cyo$b;

    .line 102
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start ConnectThread."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 103
    new-instance v0, Lo/cyo$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lo/cyo$b;-><init>(Lo/cyo;Landroid/bluetooth/BluetoothDevice;Lo/cyo$3;)V

    sput-object v0, Lo/cyo;->a:Lo/cyo$b;

    .line 104
    sget-object v0, Lo/cyo;->a:Lo/cyo$b;

    invoke-virtual {v0}, Lo/cyo$b;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 108
    :goto_0
    invoke-static {}, Lo/cyo;->k()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 109
    :try_start_1
    sget-object v0, Lo/cyo;->c:Lo/cyo$c;

    if-eqz v0, :cond_1

    .line 110
    sget-object v0, Lo/cyo;->c:Lo/cyo$c;

    invoke-virtual {v0}, Lo/cyo$c;->a()V

    .line 111
    const/4 v0, 0x0

    sput-object v0, Lo/cyo;->c:Lo/cyo$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    :cond_1
    monitor-exit v5

    goto :goto_1

    :catchall_1
    move-exception v7

    monitor-exit v5

    throw v7

    .line 114
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/cyo;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lo/cyo;->c()V

    return-void
.end method

.method static synthetic d(Lo/cyo;Z)Z
    .locals 0

    .line 37
    iput-boolean p1, p0, Lo/cyo;->g:Z

    return p1
.end method

.method private e(Landroid/bluetooth/BluetoothSocket;)V
    .locals 7

    .line 154
    invoke-static {}, Lo/cyo;->k()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 155
    :try_start_0
    sget-object v0, Lo/cyo;->c:Lo/cyo$c;

    if-eqz v0, :cond_0

    .line 156
    sget-object v0, Lo/cyo;->c:Lo/cyo$c;

    invoke-virtual {v0}, Lo/cyo$c;->a()V

    .line 157
    const/4 v0, 0x0

    sput-object v0, Lo/cyo;->c:Lo/cyo$c;

    .line 161
    :cond_0
    new-instance v0, Lo/cyo$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lo/cyo$c;-><init>(Lo/cyo;Landroid/bluetooth/BluetoothSocket;Lo/cyo$3;)V

    sput-object v0, Lo/cyo;->c:Lo/cyo$c;

    .line 162
    sget-object v0, Lo/cyo;->c:Lo/cyo$c;

    invoke-virtual {v0}, Lo/cyo$c;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 166
    :goto_0
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Connect success, so report state."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/cyo;->d(I)V

    .line 168
    return-void
.end method

.method static synthetic e(Lo/cyo;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/cyo;->d(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method static synthetic e(Lo/cyo;)Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lo/cyo;->g:Z

    return v0
.end method

.method static synthetic f(Lo/cyo;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lo/cyo;->b()V

    return-void
.end method

.method static synthetic g(Lo/cyo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method private static declared-synchronized i()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cyo;

    monitor-enter v1

    .line 573
    :try_start_0
    sget-object v0, Lo/cyo;->e:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic k(Lo/cyo;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/cyo;->b:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method private static declared-synchronized k()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cyo;

    monitor-enter v1

    .line 569
    :try_start_0
    sget-object v0, Lo/cyo;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 486
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Enter disconnectBTDevice."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    invoke-static {}, Lo/cyo;->i()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 489
    :try_start_0
    sget-object v0, Lo/cyo;->a:Lo/cyo$b;

    if-eqz v0, :cond_0

    .line 490
    sget-object v0, Lo/cyo;->a:Lo/cyo$b;

    invoke-virtual {v0}, Lo/cyo$b;->e()V

    .line 491
    const/4 v0, 0x0

    sput-object v0, Lo/cyo;->a:Lo/cyo$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 497
    :goto_0
    invoke-static {}, Lo/cyo;->k()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 498
    :try_start_1
    sget-object v0, Lo/cyo;->c:Lo/cyo$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 499
    sget-object v0, Lo/cyo;->c:Lo/cyo$c;

    invoke-virtual {v0}, Lo/cyo$c;->a()V

    .line 500
    const/4 v0, 0x0

    sput-object v0, Lo/cyo;->c:Lo/cyo$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 502
    :cond_1
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v6

    monitor-exit v4

    throw v6

    .line 503
    :goto_1
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/cyo;->d(I)V

    .line 505
    return-void
.end method

.method public a(I)V
    .locals 5

    .line 595
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setPathExtendNum in br with pathExtendNum = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 596
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 565
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setFileCallback in br."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 566
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 560
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendBTFilePath in br."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 561
    return-void
.end method

.method public a([B)Z
    .locals 9

    .line 514
    move-object v6, p0

    monitor-enter v6

    .line 515
    :try_start_0
    iget v0, p0, Lo/cyo;->k:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    .line 516
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Connect State is not connect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 517
    monitor-exit v6

    const/4 v0, 0x0

    return v0

    .line 519
    :cond_0
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 521
    :goto_0
    invoke-static {}, Lo/cyo;->k()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 522
    :try_start_1
    sget-object v5, Lo/cyo;->c:Lo/cyo$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 523
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 525
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 526
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "dataTransferThread is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 527
    const/4 v0, 0x0

    return v0

    .line 531
    :cond_1
    invoke-static {v5, p1}, Lo/cyo$c;->a(Lo/cyo$c;[B)V

    .line 533
    const/4 v0, 0x1

    return v0
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 8

    .line 121
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 122
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDevice is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void

    .line 127
    :cond_0
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Start to report connecting state."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cyo;->d(I)V

    .line 130
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v6

    .line 131
    const/16 v0, 0xc

    if-eq v0, v6, :cond_2

    .line 132
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need to pair btDevice."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/cyo;->i:Lo/cxk;

    iget-object v1, p0, Lo/cyo;->n:Lo/cxz;

    invoke-virtual {v0, p1, v1}, Lo/cxk;->c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)Z

    move-result v7

    .line 135
    if-nez v7, :cond_1

    .line 137
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " btDevice pair failed, so connect btDevice fail."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    const v0, 0xf4629

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 139
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/cyo;->d(I)V

    .line 141
    :cond_1
    goto :goto_0

    .line 143
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not need to pair btDevice, so connect btDevice directly."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-direct {p0, p1}, Lo/cyo;->d(Landroid/bluetooth/BluetoothDevice;)V

    .line 146
    :goto_0
    return-void
.end method

.method public d()V
    .locals 5

    .line 580
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to disconnectGMS in br."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 581
    return-void
.end method

.method protected d(I)V
    .locals 5

    .line 191
    iget v0, p0, Lo/cyo;->k:I

    if-eq p1, v0, :cond_0

    .line 192
    iput p1, p0, Lo/cyo;->k:I

    .line 193
    iget-object v0, p0, Lo/cyo;->d:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 194
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "report connect state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 196
    iget-object v0, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iget-object v1, p0, Lo/cyo;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iget-object v1, p0, Lo/cyo;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lo/cyo;->d:Lo/cxx;

    iget-object v1, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iget v2, p0, Lo/cyo;->k:I

    invoke-interface {v0, v1, v2}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 203
    :cond_0
    return-void
.end method

.method public e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 548
    iget-object v0, p0, Lo/cyo;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method public e(I)V
    .locals 5

    .line 555
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter btSwitchChangeInfo() with status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 556
    return-void
.end method

.method public f()I
    .locals 3

    .line 602
    move-object v1, p0

    monitor-enter v1

    .line 603
    :try_start_0
    iget v0, p0, Lo/cyo;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    .line 604
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public h()V
    .locals 5

    .line 587
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to removeV1CheckCommand in br."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 588
    return-void
.end method
