.class public Lo/cxk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cxk$d;
    }
.end annotation


# static fields
.field private static final b:I

.field private static r:Lo/cxk;

.field private static final t:Ljava/lang/Object;


# instance fields
.field private a:Landroid/bluetooth/BluetoothHeadset;

.field private c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

.field private d:Landroid/bluetooth/BluetoothAdapter;

.field private e:Landroid/content/Context;

.field private f:Lo/cxl;

.field private g:Lo/cya;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/bluetooth/BluetoothDevice;>;"
        }
    .end annotation
.end field

.field private i:Landroid/bluetooth/BluetoothManager;

.field private k:Z

.field private l:Lo/cxy;

.field private m:Lo/cxz;

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cyf;>;"
        }
    .end annotation
.end field

.field private o:Z

.field private p:Lo/cxk$d;

.field private q:Landroid/os/HandlerThread;

.field private s:Lo/cyb;

.field private u:Landroid/os/Handler;

.field private v:Landroid/content/BroadcastReceiver;

.field private w:Landroid/content/BroadcastReceiver;

.field private x:Landroid/content/BroadcastReceiver;

.field private y:Lo/cya;

.field private z:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lo/cxk;->b:I

    .line 100
    const/4 v0, 0x0

    sput-object v0, Lo/cxk;->r:Lo/cxk;

    .line 116
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cxk;->t:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->g:Lo/cya;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->f:Lo/cxl;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cxk;->h:Ljava/util/List;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->i:Landroid/bluetooth/BluetoothManager;

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cxk;->k:Z

    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cxk;->o:Z

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->m:Lo/cxz;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cxk;->n:Ljava/util/List;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->l:Lo/cxy;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->s:Lo/cyb;

    .line 110
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "scan_thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cxk;->q:Landroid/os/HandlerThread;

    .line 238
    new-instance v0, Lo/cxk$5;

    invoke-direct {v0, p0}, Lo/cxk$5;-><init>(Lo/cxk;)V

    iput-object v0, p0, Lo/cxk;->z:Landroid/content/BroadcastReceiver;

    .line 734
    new-instance v0, Lo/cxk$2;

    invoke-direct {v0, p0}, Lo/cxk$2;-><init>(Lo/cxk;)V

    iput-object v0, p0, Lo/cxk;->y:Lo/cya;

    .line 1304
    new-instance v0, Lo/cxk$1;

    invoke-direct {v0, p0}, Lo/cxk$1;-><init>(Lo/cxk;)V

    iput-object v0, p0, Lo/cxk;->w:Landroid/content/BroadcastReceiver;

    .line 1338
    new-instance v0, Lo/cxk$7;

    invoke-direct {v0, p0}, Lo/cxk$7;-><init>(Lo/cxk;)V

    iput-object v0, p0, Lo/cxk;->x:Landroid/content/BroadcastReceiver;

    .line 1371
    new-instance v0, Lo/cxk$9;

    invoke-direct {v0, p0}, Lo/cxk$9;-><init>(Lo/cxk;)V

    iput-object v0, p0, Lo/cxk;->v:Landroid/content/BroadcastReceiver;

    .line 121
    iget-object v0, p0, Lo/cxk;->q:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 122
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/cxk;->q:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cxk;->u:Landroid/os/Handler;

    .line 123
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;)I
    .locals 8

    .line 1188
    const/4 v5, -0x1

    .line 1190
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1191
    const/4 v0, -0x1

    return v0

    .line 1195
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getUuids()[Landroid/os/ParcelUuid;

    move-result-object v6

    .line 1196
    if-eqz v6, :cond_5

    .line 1197
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_4

    .line 1199
    aget-object v0, v6, v7

    invoke-virtual {v0}, Landroid/os/ParcelUuid;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "82ff3820-8411-400c-b85a-55bdb32cf057"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1200
    const/4 v5, 0x1

    .line 1201
    goto :goto_1

    .line 1202
    :cond_1
    aget-object v0, v6, v7

    invoke-virtual {v0}, Landroid/os/ParcelUuid;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "82ff3820-8411-400c-b85a-55bdb32cf059"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1203
    const/4 v5, 0x4

    .line 1204
    goto :goto_1

    .line 1205
    :cond_2
    aget-object v0, v6, v7

    invoke-virtual {v0}, Landroid/os/ParcelUuid;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "82ff3820-8411-400c-b85a-55bdb32cf060"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1206
    const/4 v5, 0x7

    .line 1207
    goto :goto_1

    .line 1197
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    goto :goto_2

    .line 1211
    :cond_5
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "uuids is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1214
    :goto_2
    return v5
.end method

.method static synthetic a(Lo/cxk;)Lo/cya;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->g:Lo/cya;

    return-object v0
.end method

.method static synthetic a(Lo/cxk;Lo/cya;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/cxk;->a(Lo/cya;)V

    return-void
.end method

.method private a(Lo/cya;)V
    .locals 10

    .line 641
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter discoverBLEDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 642
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 643
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 644
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 646
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mAdapter is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 647
    return-void

    .line 652
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 653
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    .line 658
    :cond_1
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 659
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/cxk$d;->d(I)V

    .line 663
    :cond_2
    sget-object v6, Lo/cxk;->t:Ljava/lang/Object;

    monitor-enter v6

    .line 665
    :try_start_0
    iput-object p1, p0, Lo/cxk;->g:Lo/cya;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 666
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 670
    :goto_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lo/cxk;->k:Z

    .line 672
    iget-object v0, p0, Lo/cxk;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 681
    iget-object v0, p0, Lo/cxk;->i:Landroid/bluetooth/BluetoothManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 682
    iget-object v0, p0, Lo/cxk;->h:Ljava/util/List;

    iget-object v1, p0, Lo/cxk;->i:Landroid/bluetooth/BluetoothManager;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothManager;->getConnectedDevices(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 686
    :cond_3
    sget-object v6, Lo/cxk;->t:Ljava/lang/Object;

    monitor-enter v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 687
    :try_start_2
    iget-object v0, p0, Lo/cxk;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/bluetooth/BluetoothDevice;

    .line 688
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 689
    iget-object v0, p0, Lo/cxk;->g:Lo/cya;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 690
    iget-object v0, p0, Lo/cxk;->g:Lo/cya;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v8, v1, v2}, Lo/cya;->a(Landroid/bluetooth/BluetoothDevice;I[B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 693
    :cond_4
    goto :goto_1

    .line 694
    :cond_5
    monitor-exit v6

    goto :goto_2

    :catchall_1
    move-exception v9

    monitor-exit v6

    :try_start_3
    throw v9

    .line 697
    :goto_2
    new-instance v0, Lo/cxl;

    iget-object v1, p0, Lo/cxk;->y:Lo/cya;

    invoke-direct {v0, v1}, Lo/cxl;-><init>(Lo/cya;)V

    iput-object v0, p0, Lo/cxk;->f:Lo/cxl;

    .line 699
    const/4 v6, 0x0

    .line 700
    const/4 v7, 0x0

    :goto_3
    const/4 v0, 0x3

    if-ge v7, v0, :cond_7

    .line 702
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lo/cxk;->f:Lo/cxl;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->startLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result v6

    .line 703
    if-eqz v6, :cond_6

    .line 704
    const/4 v6, 0x1

    .line 705
    goto :goto_4

    .line 700
    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 709
    :cond_7
    :goto_4
    if-nez v6, :cond_8

    .line 711
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->f:Lo/cxl;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 712
    return-void

    .line 722
    :cond_8
    :try_start_4
    new-instance v0, Lo/cxk$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/cxk$d;-><init>(Lo/cxk;Lo/cxk$4;)V

    iput-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    .line 723
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    invoke-virtual {v0}, Lo/cxk$d;->start()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 728
    goto :goto_5

    .line 725
    :catch_0
    move-exception v6

    .line 727
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "discoverBLEDevice exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 729
    :goto_5
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/bluetooth/BluetoothDevice;Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 465
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 466
    :cond_0
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "matchDeviceByName with parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 467
    const/4 v0, 0x0

    return v0

    .line 470
    :cond_1
    const/4 v6, 0x0

    .line 471
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v7

    .line 472
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 473
    const/4 v8, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 474
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 475
    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 476
    const/4 v6, 0x1

    .line 477
    goto :goto_1

    .line 473
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 483
    :cond_3
    :goto_1
    return v6
.end method

.method static synthetic b(Lo/cxk;Landroid/bluetooth/BluetoothAdapter;)Landroid/bluetooth/BluetoothAdapter;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    return-object p1
.end method

.method static synthetic b(Lo/cxk;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    return-object p1
.end method

.method static synthetic b(Lo/cxk;)Ljava/util/List;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->h:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lo/cxk;Lo/cxl;)Lo/cxl;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/cxk;->f:Lo/cxl;

    return-object p1
.end method

.method static synthetic b(Lo/cxk;Lo/cya;)Lo/cya;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/cxk;->g:Lo/cya;

    return-object p1
.end method

.method static synthetic b(Lo/cxk;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lo/cxk;->k:Z

    return p1
.end method

.method static synthetic c(Lo/cxk;)Landroid/content/BroadcastReceiver;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->z:Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method static synthetic c(Lo/cxk;Lo/cxk$d;)Lo/cxk$d;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/cxk;->p:Lo/cxk$d;

    return-object p1
.end method

.method public static c()Lo/cxk;
    .locals 2

    .line 130
    sget-object v0, Lo/cxk;->r:Lo/cxk;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 131
    new-instance v0, Lo/cxk;

    invoke-direct {v0}, Lo/cxk;-><init>()V

    sput-object v0, Lo/cxk;->r:Lo/cxk;

    .line 134
    :cond_0
    sget-object v0, Lo/cxk;->r:Lo/cxk;

    return-object v0
.end method

.method static synthetic d(I)I
    .locals 1

    .line 44
    invoke-static {p0}, Lo/cxk;->e(I)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/cxk;)Landroid/content/Context;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    return-object v0
.end method

.method private d(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 491
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unPairBRDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 493
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 494
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 495
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 497
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mAdapter is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 498
    return-void

    .line 503
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v6

    .line 504
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 506
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/bluetooth/BluetoothDevice;

    .line 507
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 508
    invoke-virtual {p0, v8}, Lo/cxk;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, v8, p1}, Lo/cxk;->a(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 509
    invoke-virtual {p0, v8}, Lo/cxk;->b(Landroid/bluetooth/BluetoothDevice;)Z

    .line 512
    :cond_1
    goto :goto_0

    .line 514
    :cond_2
    return-void
.end method

.method private d(Lo/cya;)V
    .locals 11

    .line 571
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter discoverClassicDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 573
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 574
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 575
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 577
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mAdapter is null for br discover."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 578
    return-void

    .line 583
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 584
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    .line 588
    :cond_1
    iget-boolean v0, p0, Lo/cxk;->k:Z

    if-eqz v0, :cond_2

    .line 589
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 590
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/cxk$d;->d(I)V

    .line 595
    :cond_2
    sget-object v6, Lo/cxk;->t:Ljava/lang/Object;

    monitor-enter v6

    .line 596
    :try_start_0
    iput-object p1, p0, Lo/cxk;->g:Lo/cya;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 597
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 600
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cxk;->o:Z

    .line 601
    iget-object v0, p0, Lo/cxk;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 602
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 604
    new-instance v6, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.device.action.FOUND"

    invoke-direct {v6, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 605
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/cxk;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 608
    new-instance v6, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-direct {v6, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 609
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/cxk;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 613
    :cond_3
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v6

    .line 614
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 615
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/bluetooth/BluetoothDevice;

    .line 616
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 618
    iget-object v0, p0, Lo/cxk;->h:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 619
    sget-object v9, Lo/cxk;->t:Ljava/lang/Object;

    monitor-enter v9

    .line 620
    :try_start_1
    iget-object v0, p0, Lo/cxk;->g:Lo/cya;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 621
    iget-object v0, p0, Lo/cxk;->g:Lo/cya;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v8, v1, v2}, Lo/cya;->a(Landroid/bluetooth/BluetoothDevice;I[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 623
    :cond_4
    monitor-exit v9

    goto :goto_2

    :catchall_1
    move-exception v10

    monitor-exit v9

    throw v10

    .line 625
    :cond_5
    :goto_2
    goto :goto_1

    .line 630
    :cond_6
    :try_start_2
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->startDiscovery()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 634
    goto :goto_3

    .line 632
    :catch_0
    move-exception v7

    .line 633
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "start discover br device occur exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 635
    :goto_3
    return-void
.end method

.method private static e(I)I
    .locals 2

    .line 303
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 305
    :pswitch_0
    const/4 v1, 0x1

    .line 306
    goto :goto_1

    .line 308
    :pswitch_1
    const/4 v1, 0x4

    .line 309
    goto :goto_1

    .line 311
    :pswitch_2
    const/4 v1, 0x3

    .line 312
    goto :goto_1

    .line 314
    :pswitch_3
    const/4 v1, 0x2

    .line 315
    goto :goto_1

    .line 317
    :goto_0
    const/4 v1, 0x0

    .line 320
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic e(Lo/cxk;)Lo/cxz;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->m:Lo/cxz;

    return-object v0
.end method

.method static synthetic e(Lo/cxk;Ljava/util/List;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/cxk;->d(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e(Lo/cxk;Lo/cya;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/cxk;->d(Lo/cya;)V

    return-void
.end method

.method static synthetic f(Lo/cxk;)Z
    .locals 1

    .line 44
    invoke-direct {p0}, Lo/cxk;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic g()I
    .locals 1

    .line 44
    sget v0, Lo/cxk;->b:I

    return v0
.end method

.method static synthetic g(Lo/cxk;)Lo/cxk$d;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    return-object v0
.end method

.method static synthetic h(Lo/cxk;)Lo/cxl;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->f:Lo/cxl;

    return-object v0
.end method

.method private h()Z
    .locals 3

    .line 450
    const/4 v2, 0x0

    .line 451
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.bluetooth_le"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    const/4 v2, 0x1

    .line 455
    :cond_0
    return v2
.end method

.method static synthetic i()Ljava/lang/Object;
    .locals 1

    .line 44
    sget-object v0, Lo/cxk;->t:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic i(Lo/cxk;)Lo/cya;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->y:Lo/cya;

    return-object v0
.end method

.method static synthetic k(Lo/cxk;)Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    return-object v0
.end method

.method private declared-synchronized k()Ljava/lang/Object;
    .locals 2

    monitor-enter p0

    .line 1402
    :try_start_0
    iget-object v0, p0, Lo/cxk;->n:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method static synthetic l(Lo/cxk;)Lo/cxy;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->l:Lo/cxy;

    return-object v0
.end method

.method static synthetic m(Lo/cxk;)Ljava/util/List;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->n:Ljava/util/List;

    return-object v0
.end method

.method static synthetic o(Lo/cxk;)Lo/cyb;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cxk;->s:Lo/cyb;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)I"
        }
    .end annotation

    .line 1437
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getDeviceTypeByNameFilter()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1438
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1439
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "parameter is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1440
    const/4 v0, -0x1

    return v0

    .line 1443
    :cond_1
    const/4 v5, -0x1

    .line 1444
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 1445
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "after toUpperCase mNameFilter["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "] = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1446
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1447
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    .line 1448
    const-string v0, "HUAWEI B2"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1449
    const/4 v5, 0x1

    .line 1450
    goto :goto_1

    .line 1451
    :cond_2
    const-string v0, "HONOR ZERO"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "HUAWEI B0"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "HUAWEI BAND-"

    .line 1452
    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "HONOR BAND Z1"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1453
    :cond_3
    const/4 v5, 0x5

    .line 1454
    goto :goto_1

    .line 1444
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1459
    :cond_5
    :goto_1
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Product Type = "

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

    .line 1460
    return v5
.end method

.method public a()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/bluetooth/BluetoothDevice;>;"
        }
    .end annotation

    .line 1050
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getHFPConnectedDeviceList()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1052
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mAdapter is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    const/4 v0, 0x0

    return-object v0

    .line 1055
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1056
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v6

    .line 1057
    const/4 v7, 0x0

    .line 1058
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 1059
    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v7

    .line 1060
    if-lez v7, :cond_2

    .line 1061
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/bluetooth/BluetoothDevice;

    .line 1062
    invoke-virtual {p0, v9}, Lo/cxk;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v10

    .line 1063
    if-eqz v10, :cond_1

    .line 1064
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1066
    :cond_1
    goto :goto_0

    .line 1069
    :cond_2
    return-object v5
.end method

.method public a(Landroid/content/Context;)V
    .locals 9

    .line 142
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 144
    iput-object p1, p0, Lo/cxk;->e:Landroid/content/Context;

    .line 146
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    const-string v1, "bluetooth"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothManager;

    iput-object v0, p0, Lo/cxk;->i:Landroid/bluetooth/BluetoothManager;

    .line 148
    invoke-virtual {p0}, Lo/cxk;->d()V

    .line 149
    iget-object v0, p0, Lo/cxk;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 150
    new-instance v0, Lo/cxk$4;

    invoke-direct {v0, p0}, Lo/cxk$4;-><init>(Lo/cxk;)V

    iput-object v0, p0, Lo/cxk;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    .line 186
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 188
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 189
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 191
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lo/cxk;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result v6

    .line 192
    if-nez v6, :cond_1

    .line 193
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Get HFP Profile handle fail."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :cond_1
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lo/cxk;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v2, 0x4

    invoke-virtual {v0, p1, v1, v2}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result v7

    .line 198
    if-nez v7, :cond_2

    .line 199
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Get HID Profile handle fail."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 201
    :cond_2
    goto :goto_0

    .line 203
    :cond_3
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mAdapter is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :cond_4
    :goto_0
    new-instance v6, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v6, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/cxk;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 211
    new-instance v7, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-direct {v7, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/cxk;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 214
    new-instance v8, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v8, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/cxk;->v:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v8}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 217
    :cond_5
    return-void
.end method

.method public a(Ljava/util/List;ILo/cya;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;ILo/cya;)V"
        }
    .end annotation

    .line 523
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter startBTDeviceDiscovery()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 524
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 525
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "callback is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 526
    return-void

    .line 528
    :cond_0
    iget-object v0, p0, Lo/cxk;->u:Landroid/os/Handler;

    new-instance v1, Lo/cxk$3;

    invoke-direct {v1, p0, p2, p1, p3}, Lo/cxk$3;-><init>(Lo/cxk;ILjava/util/List;Lo/cya;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 565
    return-void
.end method

.method public a(Lo/cyf;)V
    .locals 7

    .line 402
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS btSwitchEnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 404
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btSwitchEnable with parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 405
    return-void

    .line 408
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 409
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS mAdapter == NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 411
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 413
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS mAdapter == NULL onBTSwitchStateCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lo/cyf;->b(I)V

    goto/16 :goto_0

    .line 416
    :cond_1
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 417
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is open1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lo/cyf;->b(I)V

    goto/16 :goto_0

    .line 421
    :cond_2
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is close1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    invoke-virtual {p0, p1}, Lo/cxk;->d(Lo/cyf;)V

    .line 425
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v6

    .line 426
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS BT isEnable1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    goto :goto_0

    .line 430
    :cond_3
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 431
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is open2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lo/cyf;->b(I)V

    goto :goto_0

    .line 435
    :cond_4
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is close2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    invoke-virtual {p0, p1}, Lo/cxk;->d(Lo/cyf;)V

    .line 439
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v6

    .line 440
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS BT isEnable2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    :goto_0
    return-void
.end method

.method public a(Lo/cyf;Landroid/os/Handler;)V
    .locals 6

    .line 352
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS btSwitchEnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 354
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btSwitchEnable with parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 355
    return-void

    .line 358
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 359
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS mAdapter == NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 361
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 363
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS mAdapter == NULL onBTSwitchStateCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lo/cyf;->b(I)V

    goto/16 :goto_0

    .line 366
    :cond_1
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 367
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is open1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lo/cyf;->b(I)V

    goto :goto_0

    .line 371
    :cond_2
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is close1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    invoke-virtual {p0, p1}, Lo/cxk;->d(Lo/cyf;)V

    .line 375
    const/4 v0, 0x0

    if-eq v0, p2, :cond_5

    .line 376
    const/16 v0, 0x9

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 381
    :cond_3
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 382
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is open2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Lo/cyf;->b(I)V

    goto :goto_0

    .line 386
    :cond_4
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is close2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    invoke-virtual {p0, p1}, Lo/cxk;->d(Lo/cyf;)V

    .line 390
    const/4 v0, 0x0

    if-eq v0, p2, :cond_5

    .line 391
    const/16 v0, 0x9

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 395
    :cond_5
    :goto_0
    return-void
.end method

.method public b()I
    .locals 3

    .line 329
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 331
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 332
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 334
    const/4 v2, 0x1

    goto :goto_0

    .line 337
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    invoke-static {v0}, Lo/cxk;->e(I)I

    move-result v2

    goto :goto_0

    .line 341
    :cond_1
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    invoke-static {v0}, Lo/cxk;->e(I)I

    move-result v2

    .line 344
    :goto_0
    return v2
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1469
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1470
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 1471
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1473
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 7

    .line 930
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to unPair device with btDevice."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 931
    const/4 v5, 0x0

    .line 933
    :try_start_0
    invoke-static {p1}, Lo/cxp;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    move v5, v0

    .line 934
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "removeBond: result = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 937
    goto :goto_0

    .line 935
    :catch_0
    move-exception v6

    .line 936
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "removeBond occur exception with info : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 939
    :goto_0
    return v5
.end method

.method public b(Ljava/util/List;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 1078
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter isWantedDeviceConnected()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1079
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1080
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "parameter is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    const/4 v0, 0x0

    return v0

    .line 1085
    :cond_1
    invoke-virtual {p0}, Lo/cxk;->a()Ljava/util/List;

    move-result-object v5

    .line 1087
    const/4 v6, 0x0

    .line 1088
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 1089
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/bluetooth/BluetoothDevice;

    .line 1090
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    invoke-virtual {v8}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1092
    invoke-virtual {v8}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v9

    .line 1093
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDeviceName = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    const/4 v10, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 1095
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "after toUpperCase mNameFilter["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "] = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1096
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1097
    invoke-virtual {v9}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1098
    const/4 v6, 0x1

    .line 1099
    goto :goto_2

    .line 1094
    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 1103
    :cond_3
    :goto_2
    if-eqz v6, :cond_4

    .line 1104
    goto :goto_3

    .line 1107
    :cond_4
    goto/16 :goto_0

    .line 1109
    :cond_5
    :goto_3
    return v6
.end method

.method public c(Ljava/lang/String;)I
    .locals 7

    .line 1223
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getDeviceTypeByName with name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1224
    const/4 v5, -0x1

    .line 1226
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1227
    const/4 v0, -0x1

    return v0

    .line 1230
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 1231
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1232
    const-string v0, "HUAWEI B2"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1233
    const/4 v5, 0x1

    goto :goto_0

    .line 1234
    :cond_1
    const-string v0, "HONOR ZERO"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "HUAWEI B0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "HUAWEI BAND-"

    .line 1235
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "HONOR BAND Z1"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1236
    :cond_2
    const/4 v5, 0x5

    goto :goto_0

    .line 1237
    :cond_3
    const-string v0, "HUAWEI WATCH"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1238
    const/4 v5, 0x3

    goto :goto_0

    .line 1240
    :cond_4
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not match product name, may be they are new type device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1244
    :cond_5
    :goto_0
    return v5
.end method

.method public c(Ljava/util/List;)Landroid/bluetooth/BluetoothDevice;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Landroid/bluetooth/BluetoothDevice;"
        }
    .end annotation

    .line 1015
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getHFPConnectedDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1016
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1017
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mAdapter is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1018
    const/4 v0, 0x0

    return-object v0

    .line 1021
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v5

    .line 1022
    const/4 v6, 0x0

    .line 1023
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 1024
    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v6

    .line 1025
    if-lez v6, :cond_3

    .line 1026
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/bluetooth/BluetoothDevice;

    .line 1027
    invoke-virtual {p0, v8}, Lo/cxk;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v9

    .line 1028
    if-eqz v9, :cond_2

    .line 1029
    const/4 v10, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 1030
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "after toUpperCase mNameFilter["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "] = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1031
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1032
    invoke-virtual {v8}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v11

    .line 1033
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1034
    return-object v8

    .line 1029
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 1039
    :cond_2
    goto/16 :goto_0

    .line 1042
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 9

    .line 1165
    const/4 v6, 0x0

    .line 1166
    const/4 v7, 0x0

    .line 1169
    :try_start_0
    iget-object v0, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1170
    iget-object v0, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    const/16 v1, 0x64

    invoke-static {v0, p1, v1}, Lo/cxp;->b(Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;I)Z

    move-result v0

    move v6, v0

    .line 1171
    iget-object v0, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v0, p1}, Lo/cxp;->b(Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v7, v0

    .line 1174
    :cond_0
    and-int v0, v6, v7

    return v0

    .line 1175
    :catch_0
    move-exception v8

    .line 1176
    const-string v0, "0xA0200001"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1179
    and-int v0, v6, v7

    return v0
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)Z
    .locals 8

    .line 907
    const/4 v6, 0x0

    .line 910
    :try_start_0
    iput-object p2, p0, Lo/cxk;->m:Lo/cxz;

    .line 911
    new-instance v7, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-direct {v7, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 912
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/cxk;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 913
    invoke-static {p1}, Lo/cxp;->b(Landroid/bluetooth/BluetoothDevice;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 919
    goto :goto_0

    .line 917
    :catch_0
    move-exception v7

    .line 918
    const-string v0, "0xA0200001"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "btDevicePair with exception = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 921
    :goto_0
    return v6
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)I
    .locals 7

    .line 1253
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getDeviceType()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1255
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1256
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getDeviceType with btDevice is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1257
    const/4 v0, -0x1

    return v0

    .line 1261
    :cond_0
    invoke-direct {p0, p1}, Lo/cxk;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result v6

    .line 1262
    const/4 v0, -0x1

    if-ne v0, v6, :cond_1

    .line 1263
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not get product type by UUID."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1265
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cxk;->c(Ljava/lang/String;)I

    move-result v6

    .line 1266
    const/4 v0, -0x1

    if-ne v0, v6, :cond_1

    .line 1267
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not get product type by Device Name."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1271
    :cond_1
    return v6
.end method

.method public d()V
    .locals 3

    .line 223
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 225
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    .line 229
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    .line 231
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->c:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    .line 233
    :cond_0
    return-void
.end method

.method public d(Lo/cxy;)V
    .locals 0

    .line 1332
    iput-object p1, p0, Lo/cxk;->l:Lo/cxy;

    .line 1333
    return-void
.end method

.method public d(Lo/cyb;)V
    .locals 0

    .line 1365
    iput-object p1, p0, Lo/cxk;->s:Lo/cyb;

    .line 1366
    return-void
.end method

.method public d(Lo/cyf;)V
    .locals 7

    .line 1410
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lo/cxk;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1411
    invoke-direct {p0}, Lo/cxk;->k()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 1412
    :try_start_0
    iget-object v0, p0, Lo/cxk;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1413
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Reg mBTSwitchStateCallbackList size = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cxk;->n:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1414
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1416
    :cond_0
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 8

    .line 948
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to unPair device with mac address."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 949
    const/4 v5, 0x0

    .line 951
    invoke-virtual {p0, p1}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    .line 952
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 953
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-eq v1, v0, :cond_0

    .line 954
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "device is not bond."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 955
    const/4 v5, 0x1

    goto :goto_0

    .line 958
    :cond_0
    :try_start_0
    invoke-static {v6}, Lo/cxp;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    move v5, v0

    .line 959
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "removeBond: result = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 962
    goto :goto_0

    .line 960
    :catch_0
    move-exception v7

    .line 961
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "removeBond occur exception with info : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 966
    :cond_1
    :goto_0
    return v5
.end method

.method public e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;
    .locals 6

    .line 1289
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1290
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getBluetoothDeviceByMac with parameter incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1291
    const/4 v0, 0x0

    return-object v0

    .line 1294
    :cond_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1295
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0

    .line 1297
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()V
    .locals 7

    .line 862
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter cancelBTDeviceDiscovery()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 864
    iget-boolean v0, p0, Lo/cxk;->o:Z

    if-eqz v0, :cond_2

    .line 866
    :try_start_0
    iget-object v0, p0, Lo/cxk;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/cxk;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 869
    goto :goto_0

    .line 867
    :catch_0
    move-exception v5

    .line 868
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unregisterReceiver exception = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 872
    :goto_0
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 873
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    .line 876
    :cond_0
    sget-object v5, Lo/cxk;->t:Ljava/lang/Object;

    monitor-enter v5

    .line 877
    :try_start_1
    iget-object v0, p0, Lo/cxk;->g:Lo/cya;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 879
    iget-object v0, p0, Lo/cxk;->g:Lo/cya;

    invoke-interface {v0}, Lo/cya;->e()V

    .line 880
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cxk;->g:Lo/cya;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 882
    :cond_1
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 884
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cxk;->o:Z

    .line 887
    :cond_2
    iget-boolean v0, p0, Lo/cxk;->k:Z

    if-eqz v0, :cond_3

    .line 888
    invoke-direct {p0}, Lo/cxk;->h()Z

    move-result v5

    .line 889
    sget v0, Lo/cxk;->b:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_3

    if-eqz v5, :cond_3

    .line 890
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cxk;->k:Z

    .line 891
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 892
    iget-object v0, p0, Lo/cxk;->p:Lo/cxk$d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cxk$d;->d(I)V

    .line 897
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Leave cancelBTDeviceDiscovery()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 898
    return-void
.end method

.method public e(Lo/cyf;)V
    .locals 7

    .line 1423
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lo/cxk;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1424
    invoke-direct {p0}, Lo/cxk;->k()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 1425
    :try_start_0
    iget-object v0, p0, Lo/cxk;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1426
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UnReg mBTSwitchStateCallbackList size = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cxk;->n:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1427
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1429
    :cond_0
    :goto_0
    return-void
.end method

.method public e(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 7

    .line 975
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter isHfpConnected()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 976
    iget-object v0, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 977
    iget-object v0, p0, Lo/cxk;->a:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothHeadset;->getConnectionState(Landroid/bluetooth/BluetoothDevice;)I

    move-result v6

    .line 978
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HFP connect state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 979
    const/4 v0, 0x2

    if-ne v0, v6, :cond_0

    .line 980
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "HFP connected."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 981
    const/4 v0, 0x1

    return v0

    .line 983
    :cond_0
    goto :goto_0

    .line 984
    :cond_1
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mHfpService or btDevice is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 987
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/util/List;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 1118
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter isWantedBRDeviceTypePaired()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1119
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1120
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "parameter is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1121
    const/4 v0, 0x0

    return v0

    .line 1125
    :cond_1
    const/4 v6, 0x0

    .line 1126
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 1127
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v7

    .line 1128
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    .line 1129
    invoke-interface {v7}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 1130
    const/4 v8, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_5

    .line 1131
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "after toUpperCase mNameFilter["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "] = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    if-eqz v6, :cond_2

    .line 1133
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Has found the wanted paired BR device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1134
    goto/16 :goto_3

    .line 1137
    :cond_2
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1138
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/bluetooth/BluetoothDevice;

    .line 1139
    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 1140
    invoke-virtual {v10}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v11

    .line 1141
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1142
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v11, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1143
    const/4 v6, 0x1

    .line 1144
    goto :goto_2

    .line 1147
    :cond_3
    goto :goto_1

    .line 1130
    :cond_4
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :cond_5
    :goto_3
    goto :goto_4

    .line 1151
    :cond_6
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "pairedDevices size = 0"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1156
    :cond_7
    :goto_4
    return v6
.end method

.method public f()V
    .locals 2

    .line 1278
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1279
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1280
    iget-object v0, p0, Lo/cxk;->d:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    .line 1283
    :cond_0
    return-void
.end method
