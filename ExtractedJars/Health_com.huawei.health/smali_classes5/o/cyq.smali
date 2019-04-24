.class public Lo/cyq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyn;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cyq$a;,
        Lo/cyq$b;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field private d:Landroid/content/Context;

.field private e:Landroid/bluetooth/BluetoothDevice;

.field private f:Lo/cxx;

.field private g:Lo/cyq$b;

.field private h:Landroid/os/HandlerThread;

.field private i:I

.field private k:I

.field private l:I

.field private m:Z

.field private n:Landroid/bluetooth/BluetoothGatt;

.field private o:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private p:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private q:Z

.field private r:Ljava/lang/Boolean;

.field private s:Landroid/os/Handler;

.field private t:Landroid/os/HandlerThread;

.field private u:Ljava/lang/String;

.field private x:Z

.field private y:I

.field private final z:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;)V
    .locals 5

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->d:Landroid/content/Context;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->e:Landroid/bluetooth/BluetoothDevice;

    .line 54
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    iput-object v0, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->f:Lo/cxx;

    .line 86
    const/4 v0, 0x0

    iput v0, p0, Lo/cyq;->k:I

    .line 90
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BTDeviceBLEService"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cyq;->h:Landroid/os/HandlerThread;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyq;->m:Z

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lo/cyq;->l:I

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyq;->q:Z

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->t:Landroid/os/HandlerThread;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->s:Landroid/os/Handler;

    .line 116
    const-string v0, ""

    iput-object v0, p0, Lo/cyq;->u:Ljava/lang/String;

    .line 117
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/cyq;->r:Ljava/lang/Boolean;

    .line 119
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cyq;->b:Ljava/lang/Object;

    .line 121
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cyq;->c:Ljava/lang/Object;

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyq;->x:Z

    .line 127
    const/4 v0, 0x0

    iput v0, p0, Lo/cyq;->y:I

    .line 415
    new-instance v0, Lo/cyq$1;

    invoke-direct {v0, p0}, Lo/cyq$1;-><init>(Lo/cyq;)V

    iput-object v0, p0, Lo/cyq;->z:Landroid/bluetooth/BluetoothGattCallback;

    .line 145
    iput-object p1, p0, Lo/cyq;->d:Landroid/content/Context;

    .line 146
    iput-object p2, p0, Lo/cyq;->e:Landroid/bluetooth/BluetoothDevice;

    .line 147
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 148
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyq;->u:Ljava/lang/String;

    .line 149
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyq;->u:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 151
    :cond_0
    iput-object p3, p0, Lo/cyq;->f:Lo/cxx;

    .line 152
    iget-object v0, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceBTType(I)V

    .line 153
    invoke-direct {p0}, Lo/cyq;->c()V

    .line 154
    return-void
.end method

.method static synthetic a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method static synthetic a(Lo/cyq;Landroid/bluetooth/BluetoothGatt;I)Z
    .locals 1

    .line 46
    invoke-direct {p0, p1, p2}, Lo/cyq;->e(Landroid/bluetooth/BluetoothGatt;I)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/cyq;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->e:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 386
    iget-object v1, p0, Lo/cyq;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 388
    :try_start_0
    iget-boolean v0, p0, Lo/cyq;->x:Z

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lo/cyq;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 390
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyq;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 392
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 393
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/cyq;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/cyq;->d(I)V

    return-void
.end method

.method static synthetic c(Lo/cyq;)I
    .locals 1

    .line 46
    iget v0, p0, Lo/cyq;->i:I

    return v0
.end method

.method private c()V
    .locals 2

    .line 160
    iget-object v0, p0, Lo/cyq;->h:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 161
    new-instance v0, Lo/cyq$b;

    iget-object v1, p0, Lo/cyq;->h:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cyq$b;-><init>(Lo/cyq;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    .line 164
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BTDeviceBLEService"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cyq;->t:Landroid/os/HandlerThread;

    .line 166
    iget-object v0, p0, Lo/cyq;->t:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 168
    new-instance v0, Lo/cyq$a;

    iget-object v1, p0, Lo/cyq;->t:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cyq$a;-><init>(Lo/cyq;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cyq;->s:Landroid/os/Handler;

    .line 169
    return-void
.end method

.method static synthetic c(Lo/cyq;ZI)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lo/cyq;->c(ZI)V

    return-void
.end method

.method private c(ZI)V
    .locals 5

    .line 570
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter reConnect() with reConnectFlag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 571
    invoke-direct {p0, p2}, Lo/cyq;->d(I)V

    .line 572
    return-void
.end method

.method static synthetic c(Lo/cyq;Z)Z
    .locals 0

    .line 46
    iput-boolean p1, p0, Lo/cyq;->q:Z

    return p1
.end method

.method static synthetic d(Lo/cyq;I)I
    .locals 0

    .line 46
    iput p1, p0, Lo/cyq;->k:I

    return p1
.end method

.method static synthetic d(Lo/cyq;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 46
    iput-object p1, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method static synthetic d(Lo/cyq;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/cyq;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 46
    iput-object p1, p0, Lo/cyq;->r:Ljava/lang/Boolean;

    return-object p1
.end method

.method private d(I)V
    .locals 7

    .line 656
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter release() with state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyq;->i:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 657
    iget-object v5, p0, Lo/cyq;->c:Ljava/lang/Object;

    monitor-enter v5

    .line 658
    :try_start_0
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 659
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to close gatt."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 660
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 661
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    .line 663
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 664
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 666
    :goto_0
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 667
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cyq$b;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    goto :goto_1

    .line 669
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mMsgHandler = null so can not remove all message."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 672
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cyq;->k:I

    .line 673
    const/4 v0, 0x0

    iput v0, p0, Lo/cyq;->l:I

    .line 674
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyq;->m:Z

    .line 675
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyq;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 676
    iget v0, p0, Lo/cyq;->y:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_5

    iget v0, p0, Lo/cyq;->i:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_5

    .line 677
    iget v0, p0, Lo/cyq;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cyq;->y:I

    .line 679
    invoke-direct {p0}, Lo/cyq;->i()I

    move-result v5

    .line 680
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Try connect with BT switch state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 682
    iget-boolean v0, p0, Lo/cyq;->q:Z

    if-nez v0, :cond_3

    const/4 v0, 0x3

    if-ne v0, v5, :cond_3

    .line 683
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 684
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x5

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_2

    .line 692
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mMsgHandler = null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 696
    :cond_3
    iget v0, p0, Lo/cyq;->i:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 697
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/cyq;->c(I)V

    goto :goto_2

    .line 699
    :cond_4
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/cyq;->c(I)V

    .line 702
    :goto_2
    goto :goto_3

    .line 704
    :cond_5
    iget v0, p0, Lo/cyq;->i:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 705
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/cyq;->c(I)V

    goto :goto_3

    .line 707
    :cond_6
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/cyq;->c(I)V

    .line 710
    :goto_3
    return-void
.end method

.method static synthetic e(Lo/cyq;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 46
    iput-object p1, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method static synthetic e(Lo/cyq;)Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->z:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method static synthetic e(Lo/cyq;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 0

    .line 46
    iput-object p1, p0, Lo/cyq;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object p1
.end method

.method private e(Landroid/bluetooth/BluetoothGatt;I)Z
    .locals 9

    .line 612
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter refreshDeviceCache()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 614
    const-string v0, "0xA0200003"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "BluetoothGatt parameter is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 615
    const/4 v0, 0x0

    return v0

    .line 619
    :cond_0
    :try_start_0
    iget v0, p0, Lo/cyq;->k:I

    if-eq v0, p2, :cond_1

    iget v0, p0, Lo/cyq;->k:I

    if-eqz v0, :cond_1

    .line 620
    const/4 v0, 0x0

    iput v0, p0, Lo/cyq;->l:I

    .line 623
    :cond_1
    iget v0, p0, Lo/cyq;->l:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_3

    .line 624
    iget v0, p0, Lo/cyq;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cyq;->l:I

    .line 625
    iput p2, p0, Lo/cyq;->k:I

    .line 626
    move-object v6, p1

    .line 628
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "refresh"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 630
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x2

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    .line 631
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to refresh Device Cache."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 632
    if-eqz v7, :cond_2

    .line 633
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v7, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    .line 634
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "refresh Device Cache invoke result :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 635
    return v8

    .line 637
    :cond_2
    goto :goto_0

    .line 638
    :cond_3
    const-string v0, "0xA0200003"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "id ="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " call over times"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 640
    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lo/cyq;->c(ZI)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 648
    :goto_0
    goto :goto_1

    .line 642
    :catch_0
    move-exception v6

    .line 643
    const-string v0, "0xA0200003"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "An exception occur while refreshing device:NoSuchMethodException"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 648
    goto :goto_1

    .line 644
    :catch_1
    move-exception v6

    .line 645
    const-string v0, "0xA0200003"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "An exception occur while refreshing device:IllegalAccessException"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 648
    goto :goto_1

    .line 646
    :catch_2
    move-exception v6

    .line 647
    const-string v0, "0xA0200003"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "An exception occur while refreshing device:Other Exception"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 649
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic f(Lo/cyq;)Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lo/cyq;->q:Z

    return v0
.end method

.method static synthetic g(Lo/cyq;)Lo/cyq$b;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    return-object v0
.end method

.method private g()V
    .locals 9

    .line 578
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setCharacteristicMessage()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 580
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyq;->m:Z

    .line 583
    iget-object v0, p0, Lo/cyq;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 584
    iget-object v0, p0, Lo/cyq;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v6

    .line 585
    or-int/lit8 v0, v6, 0x10

    if-lez v0, :cond_0

    .line 586
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/cyq;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 588
    iget-object v0, p0, Lo/cyq;->o:Landroid/bluetooth/BluetoothGattCharacteristic;

    const-string v1, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v7

    .line 589
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 590
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to set Notification."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 592
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v7, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 594
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v7}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result v8

    .line 595
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "writeDescriptorResult = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 598
    :cond_0
    goto :goto_0

    .line 599
    :cond_1
    const-string v0, "0xA0200004"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mNotifyPoint is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lo/cyq;->e(Landroid/bluetooth/BluetoothGatt;I)Z

    .line 603
    :goto_0
    return-void
.end method

.method static synthetic h(Lo/cyq;)Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lo/cyq;->m:Z

    return v0
.end method

.method private i()I
    .locals 1

    .line 775
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk;->b()I

    move-result v0

    return v0
.end method

.method static synthetic i(Lo/cyq;)I
    .locals 1

    .line 46
    invoke-direct {p0}, Lo/cyq;->i()I

    move-result v0

    return v0
.end method

.method static synthetic k(Lo/cyq;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/cyq;->g()V

    return-void
.end method

.method static synthetic l(Lo/cyq;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/cyq;->b()V

    return-void
.end method

.method static synthetic n(Lo/cyq;)Lo/cxx;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->f:Lo/cxx;

    return-object v0
.end method

.method static synthetic o(Lo/cyq;)Landroid/os/Handler;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->s:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic p(Lo/cyq;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 282
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " Enter disconnectBTDevice()."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyq;->q:Z

    .line 285
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 286
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BluetoothGatt not initialized."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/cyq$b;->sendEmptyMessage(I)Z

    .line 288
    return-void

    .line 291
    :cond_0
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    .line 292
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to execute gatt disconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 295
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 299
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "End disconnectBTDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 300
    return-void
.end method

.method public a(I)V
    .locals 5

    .line 822
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setPathExtendNum in ble with pathExtendNum = "

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

    .line 823
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 800
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setFileCallback in ble."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 801
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 795
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendBTFilePath in ble."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 796
    return-void
.end method

.method public a([B)Z
    .locals 13

    .line 307
    const/4 v6, 0x0

    .line 308
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 309
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 310
    return v6

    .line 313
    :cond_0
    const/4 v7, 0x0

    .line 315
    iget-object v8, p0, Lo/cyq;->c:Ljava/lang/Object;

    monitor-enter v8

    .line 317
    :try_start_0
    iget-object v0, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 318
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mWritePoint is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 319
    monitor-exit v8

    return v6

    .line 322
    :cond_1
    :try_start_1
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 323
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBluetoothGatt is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 324
    monitor-exit v8

    return v6

    .line 328
    :cond_2
    :try_start_2
    iget-object v0, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 330
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/cyq;->r:Ljava/lang/Boolean;

    .line 331
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDK-->Device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 333
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    .line 334
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BLE Service data send flag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 335
    move v6, v7

    .line 336
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v8

    throw v9

    .line 339
    :goto_0
    if-nez v7, :cond_4

    .line 341
    const-wide/16 v0, 0xa

    :try_start_3
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 344
    goto :goto_1

    .line 342
    :catch_0
    move-exception v8

    .line 343
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InterruptedException = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v8}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :goto_1
    iget-object v8, p0, Lo/cyq;->c:Ljava/lang/Object;

    monitor-enter v8

    .line 346
    :try_start_4
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 347
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v7

    .line 348
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Service data send for retry ,dataSendResult = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 349
    move v6, v7

    .line 351
    :cond_3
    monitor-exit v8

    goto :goto_2

    :catchall_1
    move-exception v10

    monitor-exit v8

    throw v10

    .line 354
    :cond_4
    :goto_2
    iget-object v0, p0, Lo/cyq;->r:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_8

    .line 355
    iget-object v8, p0, Lo/cyq;->b:Ljava/lang/Object;

    monitor-enter v8

    .line 356
    const/4 v0, 0x1

    :try_start_5
    iput-boolean v0, p0, Lo/cyq;->x:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 358
    :try_start_6
    iget-object v0, p0, Lo/cyq;->b:Ljava/lang/Object;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 361
    goto :goto_3

    .line 359
    :catch_1
    move-exception v9

    .line 360
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    :try_start_7
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "InterruptedException = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v9}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :goto_3
    iget-boolean v0, p0, Lo/cyq;->x:Z

    if-eqz v0, :cond_7

    .line 364
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Wait onCharacteristicWrite() back, timeout = 300"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 366
    if-nez v7, :cond_6

    .line 367
    iget-object v9, p0, Lo/cyq;->c:Ljava/lang/Object;

    monitor-enter v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 368
    :try_start_8
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 369
    iget-object v0, p0, Lo/cyq;->n:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/cyq;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v10

    .line 370
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Service data send for timeout ,dataTempSendResult = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 371
    move v6, v10

    .line 373
    :cond_5
    monitor-exit v9

    goto :goto_4

    :catchall_2
    move-exception v11

    monitor-exit v9

    :try_start_9
    throw v11

    .line 375
    :cond_6
    :goto_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyq;->x:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 377
    :cond_7
    monitor-exit v8

    goto :goto_5

    :catchall_3
    move-exception v12

    monitor-exit v8

    throw v12

    .line 379
    :cond_8
    :goto_5
    return v6
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 7

    .line 254
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter connectBTDevice() with device state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cyq;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 256
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceBLEService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "bt Device is null"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 257
    return-void

    .line 260
    :cond_0
    iget v6, p0, Lo/cyq;->i:I

    .line 262
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cyq;->c(I)V

    .line 263
    const/4 v0, 0x2

    if-ne v0, v6, :cond_1

    .line 264
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device has connected."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 265
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/cyq;->c(I)V

    goto :goto_0

    .line 268
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Start to connect ble device with name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 270
    const/4 v0, 0x0

    iput v0, p0, Lo/cyq;->y:I

    .line 271
    iput-object p1, p0, Lo/cyq;->e:Landroid/bluetooth/BluetoothDevice;

    .line 272
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyq;->q:Z

    .line 274
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cyq$b;->sendEmptyMessage(I)Z

    .line 276
    :goto_0
    return-void
.end method

.method protected c(I)V
    .locals 6

    .line 717
    iput p1, p0, Lo/cyq;->i:I

    .line 718
    iget-object v0, p0, Lo/cyq;->f:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 719
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Report BLE connect state = "

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

    .line 720
    iget-object v0, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 721
    iget-object v0, p0, Lo/cyq;->e:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v5

    .line 722
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 723
    iget-object v5, p0, Lo/cyq;->u:Ljava/lang/String;

    .line 725
    :cond_0
    iget-object v0, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 726
    iget-object v0, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iget-object v1, p0, Lo/cyq;->e:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 728
    iget-object v0, p0, Lo/cyq;->f:Lo/cxx;

    iget-object v1, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iget v2, p0, Lo/cyq;->i:I

    invoke-interface {v0, v1, v2}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 729
    goto :goto_0

    .line 731
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Client callback is null. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 733
    :cond_2
    :goto_0
    return-void
.end method

.method public d()V
    .locals 5

    .line 807
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to disconnectGMS in ble."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 808
    return-void
.end method

.method public e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 767
    iget-object v0, p0, Lo/cyq;->a:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method public e(I)V
    .locals 5

    .line 782
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

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

    .line 783
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 784
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 786
    iget-object v0, p0, Lo/cyq;->g:Lo/cyq$b;

    const/4 v1, 0x7

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 788
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mMsgHandler = null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 791
    :cond_1
    :goto_0
    return-void
.end method

.method public f()I
    .locals 1

    .line 829
    iget v0, p0, Lo/cyq;->i:I

    return v0
.end method

.method public h()V
    .locals 5

    .line 814
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to removeV1CheckCommand in ble."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 815
    return-void
.end method
