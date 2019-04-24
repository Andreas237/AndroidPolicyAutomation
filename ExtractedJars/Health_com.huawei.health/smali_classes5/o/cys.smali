.class public Lo/cys;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cys$a;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/Object;

.field private static f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/cyj;>;"
        }
    .end annotation
.end field

.field private static h:Landroid/content/Context;

.field private static k:Lo/cys;

.field private static n:Lo/cys$a;

.field private static q:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lo/cyi;>;"
        }
    .end annotation
.end field

.field private static final w:Ljava/lang/Object;


# instance fields
.field public final a:Lo/cyf;

.field public final b:Lo/cxy;

.field public c:Lo/cxx;

.field public final e:Lo/cyf;

.field public final g:Lo/cyf;

.field private i:Lo/cxx;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/bluetooth/BluetoothDevice;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private o:Lo/cxw;

.field private p:Lo/cxs;

.field private r:I

.field private s:Ljava/lang/String;

.field private t:Landroid/os/Handler;

.field private u:Lo/cxk;

.field private v:Z

.field private x:Lo/cya;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    const/4 v0, 0x0

    sput-object v0, Lo/cys;->h:Landroid/content/Context;

    .line 61
    const/4 v0, 0x0

    sput-object v0, Lo/cys;->k:Lo/cys;

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/cys;->f:Ljava/util/Map;

    .line 98
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cys;->d:Ljava/lang/Object;

    .line 106
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    .line 115
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cys;->w:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cys;->i:Lo/cxx;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cys;->p:Lo/cxs;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cys;->l:Ljava/util/List;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cys;->m:Ljava/util/List;

    .line 92
    const/4 v0, -0x1

    iput v0, p0, Lo/cys;->r:I

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cys;->u:Lo/cxk;

    .line 109
    const-string v0, ""

    iput-object v0, p0, Lo/cys;->s:Ljava/lang/String;

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cys;->v:Z

    .line 422
    new-instance v0, Lo/cys$2;

    invoke-direct {v0, p0}, Lo/cys$2;-><init>(Lo/cys;)V

    iput-object v0, p0, Lo/cys;->x:Lo/cya;

    .line 1276
    new-instance v0, Lo/cys$1;

    invoke-direct {v0, p0}, Lo/cys$1;-><init>(Lo/cys;)V

    iput-object v0, p0, Lo/cys;->c:Lo/cxx;

    .line 1404
    new-instance v0, Lo/cys$4;

    invoke-direct {v0, p0}, Lo/cys$4;-><init>(Lo/cys;)V

    iput-object v0, p0, Lo/cys;->e:Lo/cyf;

    .line 1448
    new-instance v0, Lo/cys$3;

    invoke-direct {v0, p0}, Lo/cys$3;-><init>(Lo/cys;)V

    iput-object v0, p0, Lo/cys;->a:Lo/cyf;

    .line 1521
    new-instance v0, Lo/cys$8;

    invoke-direct {v0, p0}, Lo/cys$8;-><init>(Lo/cys;)V

    iput-object v0, p0, Lo/cys;->b:Lo/cxy;

    .line 1657
    new-instance v0, Lo/cys$7;

    invoke-direct {v0, p0}, Lo/cys$7;-><init>(Lo/cys;)V

    iput-object v0, p0, Lo/cys;->g:Lo/cyf;

    .line 132
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 133
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "init BTSDKApi with context is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 137
    :cond_0
    sput-object p1, Lo/cys;->h:Landroid/content/Context;

    .line 140
    move-object v6, p0

    monitor-enter v6

    .line 141
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "init BluetoothProfile."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 142
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    iput-object v0, p0, Lo/cys;->u:Lo/cxk;

    .line 143
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, p1}, Lo/cxk;->a(Landroid/content/Context;)V

    .line 144
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->b:Lo/cxy;

    invoke-virtual {v0, v1}, Lo/cxk;->d(Lo/cxy;)V

    .line 145
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->g:Lo/cyf;

    invoke-virtual {v0, v1}, Lo/cxk;->d(Lo/cyf;)V

    .line 146
    invoke-static {}, Lo/cyp;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 150
    :goto_0
    new-instance v0, Lo/cys$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cys$a;-><init>(Lo/cys;Landroid/os/Looper;)V

    sput-object v0, Lo/cys;->n:Lo/cys$a;

    .line 151
    return-void
.end method

.method static synthetic a(Lo/cys;)Lo/cxw;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cys;->o:Lo/cxw;

    return-object v0
.end method

.method private declared-synchronized a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 11

    monitor-enter p0

    .line 453
    const/4 v6, 0x0

    .line 454
    :try_start_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v7

    .line 455
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addDeviceToList, name ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 456
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/bluetooth/BluetoothDevice;

    .line 457
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    invoke-virtual {v9}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 458
    invoke-virtual {v9}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    const/4 v6, 0x1

    .line 460
    goto :goto_1

    .line 463
    :cond_0
    goto :goto_0

    .line 465
    :cond_1
    :goto_1
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addDeviceToList, flag ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 466
    if-nez v6, :cond_6

    .line 467
    iget-object v0, p0, Lo/cys;->o:Lo/cxw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 469
    iget-object v0, p0, Lo/cys;->o:Lo/cxw;

    invoke-virtual {v0, v7}, Lo/cxw;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 470
    const/4 v8, 0x0

    .line 471
    const/4 v9, 0x0

    :goto_2
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 472
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 473
    move v8, v9

    .line 474
    goto :goto_3

    .line 475
    :cond_2
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 476
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    .line 477
    goto :goto_3

    .line 480
    :cond_3
    add-int/lit8 v8, v9, 0x1

    .line 471
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 483
    :cond_4
    :goto_3
    sget-object v9, Lo/cys;->w:Ljava/lang/Object;

    monitor-enter v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 484
    :try_start_1
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    invoke-interface {v0, v8, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 485
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_5

    .line 486
    iget-object v0, p0, Lo/cys;->o:Lo/cxw;

    iget-object v1, p0, Lo/cys;->l:Ljava/util/List;

    invoke-virtual {v0, v1, v8}, Lo/cxw;->e(Ljava/util/List;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 487
    monitor-exit v9

    monitor-exit p0

    return-void

    .line 489
    :cond_5
    monitor-exit v9

    goto :goto_4

    :catchall_0
    move-exception v10

    monitor-exit v9

    :try_start_2
    throw v10

    .line 492
    :goto_4
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    new-instance v1, Lo/cys$5;

    invoke-direct {v1, p0}, Lo/cys$5;-><init>(Lo/cys;)V

    invoke-virtual {v0, v1}, Lo/cys$a;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 503
    :cond_6
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic a(Lo/cys;Z)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/cys;->e(Z)V

    return-void
.end method

.method static synthetic b(Lo/cys;)Ljava/util/List;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lo/cys;ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;
    .locals 1

    .line 55
    invoke-direct {p0, p1, p2}, Lo/cys;->d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/cys;)Lo/cxk;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    return-object v0
.end method

.method private c(ILandroid/bluetooth/BluetoothDevice;Z)V
    .locals 13

    .line 1027
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter connectBTDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1029
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    :cond_0
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1030
    :cond_1
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1031
    return-void

    .line 1036
    :cond_2
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    .line 1037
    const-string v6, "AndroidWear"

    goto :goto_0

    .line 1039
    :cond_3
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v6

    .line 1042
    :goto_0
    invoke-static {}, Lo/cys;->r()Ljava/util/List;

    move-result-object v7

    .line 1044
    invoke-direct {p0, p1, p2}, Lo/cys;->d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v8

    .line 1045
    const/4 v9, 0x0

    .line 1046
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 1047
    invoke-virtual {v8}, Lo/cyj;->f()Z

    move-result v9

    .line 1049
    :cond_4
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "hasAddedWantedDevice = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1050
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1051
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "preMacAddress equal strMacAddress."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1052
    const/4 v0, 0x0

    if-eq v0, v8, :cond_e

    .line 1054
    invoke-virtual {v8}, Lo/cyj;->e()I

    move-result v10

    .line 1055
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getBTDeviceConnectState:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1057
    const-string v0, "reconnectDevices"

    invoke-static {v0, v6}, Lo/cyp;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v11

    .line 1060
    const/4 v0, 0x0

    if-eq v0, v11, :cond_5

    const/4 v0, 0x2

    if-eq v0, v10, :cond_5

    const/4 v0, 0x1

    if-eq v0, v10, :cond_5

    .line 1062
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to connect wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1064
    invoke-virtual {v8}, Lo/cyj;->b()V

    goto :goto_1

    .line 1066
    :cond_5
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not need to connect wanted device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1071
    :goto_1
    invoke-virtual {v8}, Lo/cyj;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v12

    .line 1072
    const/4 v0, 0x0

    if-ne v0, v12, :cond_6

    .line 1073
    new-instance v12, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 1076
    :cond_6
    invoke-virtual {v12, v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 1080
    const/4 v0, 0x0

    if-ne v0, v11, :cond_7

    .line 1081
    const-string v0, "reconnectDevices"

    invoke-static {v0, v12}, Lo/cyp;->d(Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1085
    :cond_7
    const/4 v0, 0x2

    if-ne v0, v10, :cond_8

    const/4 v0, 0x0

    if-eq v0, p1, :cond_8

    .line 1087
    iget-object v0, p0, Lo/cys;->i:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 1088
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Start to report connected state with device type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    const/4 v0, 0x2

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1090
    iget-object v0, p0, Lo/cys;->i:Lo/cxx;

    const/4 v1, 0x2

    invoke-interface {v0, v12, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 1093
    :cond_8
    goto/16 :goto_3

    .line 1095
    :cond_9
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "preMacAddress do not equal strMacAddress."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1116
    if-eqz p3, :cond_a

    if-eqz v9, :cond_b

    .line 1117
    :cond_a
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "set current device active state is true."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    invoke-virtual {p0, v6}, Lo/cys;->b(Ljava/lang/String;)V

    .line 1122
    :cond_b
    const/4 v0, 0x0

    if-eq v0, v8, :cond_e

    .line 1123
    invoke-virtual {v8}, Lo/cyj;->e()I

    move-result v10

    .line 1124
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device connect state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1125
    const/4 v0, 0x2

    if-eq v0, v10, :cond_d

    const/4 v0, 0x1

    if-eq v0, v10, :cond_d

    .line 1128
    invoke-virtual {p0}, Lo/cys;->d()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_c

    .line 1129
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BT switch is on so start connect device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1130
    invoke-virtual {v8}, Lo/cyj;->b()V

    goto :goto_2

    .line 1132
    :cond_c
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BT switch is not on.  btswitchstate:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lo/cys;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    :cond_d
    :goto_2
    const/4 v0, 0x2

    if-ne v0, v10, :cond_e

    iget-object v0, p0, Lo/cys;->i:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 1138
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "report device connected status to dms."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1139
    invoke-virtual {v8}, Lo/cyj;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v11

    .line 1140
    iget-object v0, p0, Lo/cys;->i:Lo/cxx;

    const/4 v1, 0x2

    invoke-interface {v0, v11, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 1144
    :cond_e
    :goto_3
    return-void
.end method

.method static synthetic c(Lo/cys;ILandroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method static synthetic d(Lo/cys;)Lo/cxx;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cys;->i:Lo/cxx;

    return-object v0
.end method

.method private d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;
    .locals 11

    .line 187
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getBTDeviceInstance()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v6, 0x0

    .line 189
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 190
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDevice is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const/4 v0, 0x0

    return-object v0

    .line 196
    :cond_0
    if-nez p1, :cond_1

    .line 197
    const-string v7, "AndroidWear"

    goto :goto_0

    .line 199
    :cond_1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v7

    .line 202
    :goto_0
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 203
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 205
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mDeviceMgrMap do not contain this device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 206
    const/4 v8, -0x1

    .line 208
    if-eqz p1, :cond_2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxk;->a(Ljava/util/List;)I

    move-result v8

    .line 210
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "productType = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :cond_2
    new-instance v0, Lo/cyj;

    sget-object v1, Lo/cys;->h:Landroid/content/Context;

    move v2, p1

    move-object v3, p2

    iget-object v4, p0, Lo/cys;->c:Lo/cxx;

    move v5, v8

    invoke-direct/range {v0 .. v5}, Lo/cyj;-><init>(Landroid/content/Context;ILandroid/bluetooth/BluetoothDevice;Lo/cxx;I)V

    move-object v6, v0

    .line 215
    invoke-static {}, Lo/cys;->s()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    .line 216
    :try_start_0
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    monitor-exit v9

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v9

    throw v10

    .line 218
    :goto_1
    goto :goto_2

    .line 219
    :cond_3
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mDeviceMgrMap already has this device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 220
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyj;

    .line 224
    :cond_4
    :goto_2
    return-object v6
.end method

.method static synthetic d(Lo/cys;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/cys;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method static synthetic e(Lo/cys;)Landroid/os/Handler;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cys;->t:Landroid/os/Handler;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/cys;
    .locals 5

    .line 159
    sget-object v0, Lo/cys;->k:Lo/cys;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 160
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBTSDKAPiInstance is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 161
    new-instance v0, Lo/cys;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cys;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cys;->k:Lo/cys;

    .line 163
    :cond_0
    sget-object v0, Lo/cys;->k:Lo/cys;

    return-object v0
.end method

.method private e(Z)V
    .locals 6

    .line 510
    if-eqz p1, :cond_1

    .line 512
    invoke-direct {p0}, Lo/cys;->w()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/cys;->r:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 513
    new-instance v5, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 514
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 515
    const-string v0, "style"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 517
    const-string v0, "content"

    const/4 v1, 0x2

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 518
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 519
    return-void

    .line 523
    :cond_0
    const-string v0, "BTSDKApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS showDiscoverDeviceTip1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cys;->b(Z)V

    goto :goto_0

    .line 528
    :cond_1
    invoke-direct {p0}, Lo/cys;->w()Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lo/cys;->r:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 529
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gps not enable"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 532
    :cond_2
    const-string v0, "BTSDKApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS showDiscoverDeviceTip2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cys;->b(Z)V

    .line 536
    :goto_0
    return-void
.end method

.method static synthetic g(Lo/cys;)I
    .locals 1

    .line 55
    iget v0, p0, Lo/cys;->r:I

    return v0
.end method

.method static synthetic h(Lo/cys;)Lo/cxs;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cys;->p:Lo/cxs;

    return-object v0
.end method

.method private i(Ljava/lang/String;)V
    .locals 12

    .line 232
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter removeBTDeviceInstance()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 235
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 236
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "removeBTDeviceInstance Do not contain delete device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, p1}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    const-string v0, "AndroidWear"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 238
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cxk;->d(Ljava/lang/String;)Z

    move-result v5

    .line 239
    if-nez v5, :cond_0

    .line 240
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "removeBTDeviceInstance Remove bond device fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 242
    :cond_0
    goto/16 :goto_4

    .line 244
    :cond_1
    sget-object v5, Lo/cys;->d:Ljava/lang/Object;

    monitor-enter v5

    .line 246
    const-string v0, "reconnectDevices"

    :try_start_0
    invoke-static {v0, p1}, Lo/cyp;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 248
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 249
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The wanted remove device is current device so clear reconnect device info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 250
    const-string v0, "reconnectDevices"

    invoke-static {v0, v6}, Lo/cyp;->b(Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 252
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Set reconnect device identify is empty."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 253
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cyi;

    .line 254
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 255
    const-string v0, ""

    invoke-virtual {v7, v0}, Lo/cyi;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 257
    :cond_2
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "the ble reconnect manager not in map"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    :cond_3
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 263
    :goto_1
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyj;

    .line 264
    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    .line 265
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Find wanted remove device success."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cyj;->d(Z)V

    .line 269
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/cyj;->b(Z)V

    .line 272
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyi;

    .line 273
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 274
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "null == bleReconnectManager"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 275
    return-void

    .line 277
    :cond_4
    invoke-virtual {v6}, Lo/cyi;->c()Ljava/lang/String;

    move-result-object v7

    .line 278
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Stop reconnect Device Identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v7}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    invoke-virtual {v7, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 280
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Stop reconnect ble for remove device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 281
    invoke-virtual {v6}, Lo/cyi;->d()V

    .line 285
    :cond_5
    invoke-virtual {v5}, Lo/cyj;->e()I

    move-result v8

    .line 286
    const/4 v0, 0x2

    if-eq v0, v8, :cond_8

    const/4 v0, 0x1

    if-eq v0, v8, :cond_8

    .line 288
    invoke-static {}, Lo/cys;->s()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    .line 289
    :try_start_1
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    const-string v0, "AndroidWear"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 292
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cxk;->d(Ljava/lang/String;)Z

    move-result v10

    .line 293
    if-nez v10, :cond_6

    .line 294
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Remove bond device fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 296
    :cond_6
    goto :goto_2

    .line 298
    :cond_7
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AW device should disconnect GMS."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 299
    invoke-virtual {v5}, Lo/cyj;->m()V

    .line 302
    :goto_2
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device remove success and device list size = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 303
    monitor-exit v9

    goto :goto_3

    :catchall_1
    move-exception v11

    monitor-exit v9

    throw v11

    :goto_3
    goto :goto_4

    .line 305
    :cond_8
    invoke-virtual {v5}, Lo/cyj;->d()V

    .line 309
    :cond_9
    :goto_4
    return-void
.end method

.method static synthetic m()Ljava/lang/Object;
    .locals 1

    .line 55
    invoke-static {}, Lo/cys;->s()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic n()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 55
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method static synthetic o()Ljava/lang/Object;
    .locals 1

    .line 55
    sget-object v0, Lo/cys;->w:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic p()Ljava/util/Map;
    .locals 1

    .line 55
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic q()Lo/cys$a;
    .locals 1

    .line 55
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    return-object v0
.end method

.method private static r()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 750
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getAllActiveDeviceInfos()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 751
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 752
    invoke-static {}, Lo/cys;->u()Ljava/util/Map;

    move-result-object v7

    .line 753
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 754
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 755
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getAllActiveDeviceInfos Active device identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 756
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 757
    goto :goto_0

    .line 759
    :cond_0
    return-object v6
.end method

.method private static declared-synchronized s()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cys;

    monitor-enter v1

    .line 178
    :try_start_0
    sget-object v0, Lo/cys;->f:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private t()V
    .locals 3

    .line 334
    invoke-direct {p0}, Lo/cys;->w()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/cys;->r:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 335
    new-instance v2, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 336
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 337
    const-string v0, "style"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 339
    const-string v0, "content"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 340
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 341
    return-void

    .line 345
    :cond_0
    new-instance v2, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 346
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 347
    const-string v0, "style"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 349
    const-string v0, "content"

    const/4 v1, 0x3

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 350
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 351
    return-void
.end method

.method private static u()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lo/cyj;>;"
        }
    .end annotation

    .line 707
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter geActiveDeviceList()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 708
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 712
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 713
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 714
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cyj;

    .line 715
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual {v7}, Lo/cyj;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 717
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    :cond_0
    goto :goto_0

    .line 721
    :cond_1
    return-object v5
.end method

.method private w()Z
    .locals 8

    .line 1563
    const/4 v5, 0x1

    .line 1564
    const/4 v6, 0x1

    .line 1565
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 1566
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/location/LocationManager;

    .line 1568
    const-string v0, "gps"

    invoke-virtual {v7, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v5

    .line 1569
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isGPSLocationEnable\uff1a"

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

    .line 1570
    invoke-static {}, Lo/cxj;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/cxj;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1571
    :cond_0
    return v5

    .line 1573
    :cond_1
    const-string v0, "network"

    invoke-virtual {v7, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v6

    .line 1574
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isNetWorkLocationEnable\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1577
    :cond_2
    if-nez v5, :cond_3

    if-eqz v6, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 993
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter cancelBTDeviceDiscovery()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 994
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0}, Lo/cxk;->e()V

    .line 995
    return-void
.end method

.method public a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 6

    .line 1840
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setDMSHandshakeFail()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1841
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1842
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDeviceInfo is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1843
    return-void

    .line 1846
    :cond_0
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to report connect fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1847
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1848
    iget-object v0, p0, Lo/cys;->c:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 1849
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 8

    .line 1169
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter disconnectBTDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1170
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1171
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btMacAddress is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1172
    return-void

    .line 1176
    :cond_0
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyj;

    .line 1177
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 1179
    invoke-virtual {v6}, Lo/cyj;->e()I

    move-result v7

    .line 1180
    const/4 v0, 0x1

    if-eq v0, v7, :cond_1

    const/4 v0, 0x2

    if-ne v0, v7, :cond_2

    .line 1181
    :cond_1
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to disconnect BT Device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1182
    invoke-virtual {v6}, Lo/cyj;->d()V

    goto :goto_0

    .line 1184
    :cond_2
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device is already disconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1186
    :goto_0
    goto :goto_1

    .line 1187
    :cond_3
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "can not get device manager handle."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    :goto_1
    return-void
.end method

.method public a(Lo/cye;)V
    .locals 9

    .line 1230
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendBTDeviceData()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1231
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1232
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1233
    return-void

    .line 1238
    :cond_0
    const/4 v6, 0x0

    .line 1239
    invoke-virtual {p1}, Lo/cye;->b()Ljava/lang/String;

    move-result-object v7

    .line 1240
    const-string v0, "AndroidWear"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1241
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/cye;->d(I)V

    goto :goto_1

    .line 1243
    :cond_1
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, v7}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    .line 1244
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 1245
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDevice is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1246
    return-void

    .line 1248
    :cond_2
    const/4 v8, -0x1

    .line 1249
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1250
    const/4 v8, 0x1

    goto :goto_0

    .line 1251
    :cond_3
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 1252
    const/4 v8, 0x2

    goto :goto_0

    .line 1254
    :cond_4
    const/4 v8, -0x1

    .line 1255
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The BTType is unknown."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1258
    :goto_0
    invoke-virtual {p1, v8}, Lo/cye;->d(I)V

    .line 1263
    :goto_1
    invoke-virtual {p1}, Lo/cye;->k()I

    move-result v0

    invoke-direct {p0, v0, v6}, Lo/cys;->d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v8

    .line 1264
    const/4 v0, 0x0

    if-ne v0, v8, :cond_5

    .line 1265
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "deviceSendCommandUtil is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1266
    return-void

    .line 1270
    :cond_5
    invoke-virtual {v8, p1}, Lo/cyj;->a(Lo/cye;)V

    .line 1271
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 390
    if-eqz p1, :cond_0

    .line 391
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 393
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/cys$a;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 397
    :cond_0
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 398
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cys$a;->sendEmptyMessage(I)Z

    .line 401
    :cond_1
    :goto_0
    return-void
.end method

.method public a(ZLandroid/os/Handler;)V
    .locals 6

    .line 358
    const-string v0, "BTSDKApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS enableBTSwitch enable ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    if-eqz p1, :cond_1

    .line 361
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 362
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 363
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 364
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    invoke-virtual {v0, v4}, Lo/cys$a;->sendMessage(Landroid/os/Message;)Z

    .line 366
    iget v0, p0, Lo/cys;->r:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 372
    const-string v0, "BTSDKApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS startActivity BTDialogActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    new-instance v5, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 374
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 375
    const-string v0, "style"

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 376
    const-string v0, "device_type"

    iget v1, p0, Lo/cys;->r:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 377
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 380
    :cond_0
    goto :goto_0

    .line 381
    :cond_1
    sget-object v0, Lo/cys;->n:Lo/cys$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cys$a;->sendEmptyMessage(I)Z

    .line 383
    :goto_0
    return-void
.end method

.method public b()V
    .locals 7

    .line 543
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "---------------scanbegin type:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cys;->r:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 545
    sget-object v5, Lo/cys;->w:Ljava/lang/Object;

    monitor-enter v5

    .line 546
    :try_start_0
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 547
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 548
    iget-object v0, p0, Lo/cys;->o:Lo/cxw;

    iget-object v1, p0, Lo/cys;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxw;->e(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 550
    :cond_0
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 551
    :goto_0
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->m:Ljava/util/List;

    iget v2, p0, Lo/cys;->r:I

    iget-object v3, p0, Lo/cys;->x:Lo/cya;

    invoke-virtual {v0, v1, v2, v3}, Lo/cxk;->a(Ljava/util/List;ILo/cya;)V

    .line 553
    iget-object v0, p0, Lo/cys;->o:Lo/cxw;

    iget-object v1, p0, Lo/cys;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxw;->c(Ljava/util/List;)V

    .line 554
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 11

    .line 934
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setActiveDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 935
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 936
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "deviceIdentify is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 937
    return-void

    .line 940
    :cond_0
    const/4 v6, 0x0

    .line 941
    const/4 v7, -0x1

    .line 942
    const-string v0, "AndroidWear"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 943
    const/4 v7, 0x0

    .line 946
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 947
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, p1}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    .line 948
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 949
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDevice is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 950
    return-void

    .line 953
    :cond_2
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 954
    const/4 v7, 0x1

    goto :goto_0

    .line 955
    :cond_3
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 956
    const/4 v7, 0x2

    goto :goto_0

    .line 958
    :cond_4
    const/4 v7, -0x1

    .line 959
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The BTType is unknown."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 968
    :cond_5
    :goto_0
    invoke-direct {p0, v7, v6}, Lo/cys;->d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v8

    .line 969
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 970
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Set wanted device active flag enable."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 971
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/cyj;->b(I)V

    .line 975
    :cond_6
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Set Reconnect device identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, p1}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 977
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/cyi;

    .line 978
    const/4 v0, 0x0

    if-eq v0, v9, :cond_7

    .line 979
    invoke-virtual {v9, p1}, Lo/cyi;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 982
    :cond_7
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "add new device"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, p1}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 983
    new-instance v10, Lo/cyi;

    invoke-direct {v10}, Lo/cyi;-><init>()V

    .line 984
    invoke-virtual {v10, p1}, Lo/cyi;->b(Ljava/lang/String;)V

    .line 985
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    :goto_1
    return-void
.end method

.method public b(Lo/cxw;)V
    .locals 4

    .line 124
    iput-object p1, p0, Lo/cys;->o:Lo/cxw;

    .line 125
    sget-object v2, Lo/cys;->w:Ljava/lang/Object;

    monitor-enter v2

    .line 126
    :try_start_0
    iget-object v0, p0, Lo/cys;->o:Lo/cxw;

    iget-object v1, p0, Lo/cys;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxw;->e(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 128
    :goto_0
    return-void
.end method

.method public b(Lo/cxx;)V
    .locals 6

    .line 1002
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter registerBTDeviceStateCallBack()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1004
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDeviceCallback is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1005
    return-void

    .line 1008
    :cond_0
    iput-object p1, p0, Lo/cys;->i:Lo/cxx;

    .line 1009
    return-void
.end method

.method public b(Z)V
    .locals 8

    .line 562
    const-string v0, "BTSDKApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS showDeviceList needBRTip:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    iget v0, p0, Lo/cys;->r:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    if-eqz p1, :cond_2

    .line 564
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxk;->b(Ljava/util/List;)Z

    move-result v5

    .line 565
    if-eqz v5, :cond_0

    .line 567
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Has wanted BR device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 568
    new-instance v6, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 569
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 570
    const-string v0, "style"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 572
    const-string v0, "content"

    const/4 v1, 0x4

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 573
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 574
    return-void

    .line 577
    :cond_0
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not have wanted BR device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 578
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxk;->e(Ljava/util/List;)Z

    move-result v6

    .line 579
    if-eqz v6, :cond_1

    .line 580
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Has wanted BR device type."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 582
    new-instance v7, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 583
    const/high16 v0, 0x10000000

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 584
    const-string v0, "style"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 586
    const-string v0, "content"

    const/4 v1, 0x5

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 587
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 588
    return-void

    .line 590
    :cond_1
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not have wanted BR device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 596
    :cond_2
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Clear device scan list."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 604
    new-instance v5, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 605
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 606
    const-string v0, "style"

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 607
    const-string v0, "device_type"

    iget v1, p0, Lo/cys;->r:I

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 608
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 609
    return-void
.end method

.method public c()V
    .locals 6

    .line 616
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter showPermissionDialog"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 617
    new-instance v5, Landroid/content/Intent;

    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 618
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 619
    const-string v0, "style"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 621
    const-string v0, "content"

    const/4 v1, 0x6

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 622
    sget-object v0, Lo/cys;->h:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 624
    return-void
.end method

.method public c(ILjava/lang/String;Ljava/util/List;Lo/cxs;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lo/cxs;Ljava/lang/String;)V"
        }
    .end annotation

    .line 659
    invoke-virtual {p0}, Lo/cys;->d()I

    move-result v2

    .line 660
    iput p1, p0, Lo/cys;->r:I

    .line 662
    iput-object p2, p0, Lo/cys;->s:Ljava/lang/String;

    .line 664
    iput-object p3, p0, Lo/cys;->m:Ljava/util/List;

    .line 665
    iput-object p4, p0, Lo/cys;->p:Lo/cxs;

    .line 666
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 667
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p5}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    .line 668
    const/4 v0, 0x1

    invoke-direct {p0, p1, v3, v0}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    .line 669
    goto :goto_0

    .line 670
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v2, :cond_1

    .line 672
    invoke-direct {p0}, Lo/cys;->t()V

    goto :goto_0

    .line 673
    :cond_1
    const/4 v0, 0x3

    if-ne v0, v2, :cond_3

    .line 675
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 676
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    goto :goto_0

    .line 679
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cys;->e(Z)V

    .line 683
    :cond_3
    :goto_0
    return-void
.end method

.method public c(Landroid/os/Handler;)V
    .locals 0

    .line 416
    iput-object p1, p0, Lo/cys;->t:Landroid/os/Handler;

    .line 417
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 6

    .line 312
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter removeCurrentInstance()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 314
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyj;

    .line 315
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 316
    invoke-virtual {v5}, Lo/cyj;->d()V

    .line 318
    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1910
    iput-boolean p1, p0, Lo/cys;->v:Z

    .line 1911
    return-void
.end method

.method public c(ZLjava/lang/String;)V
    .locals 6

    .line 1878
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyj;

    .line 1879
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1880
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "null == deviceSendCommandUtil"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1881
    return-void

    .line 1883
    :cond_0
    invoke-virtual {v5, p1}, Lo/cyj;->e(Z)V

    .line 1884
    return-void
.end method

.method public d()I
    .locals 5

    .line 325
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getBTSwitchState()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 326
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0}, Lo/cxk;->b()I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 7

    .line 1147
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "stopReconnectAndDisconnectDevice enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1148
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyj;

    .line 1150
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 1152
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to stopReconnectBLE."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/cyj;->e(Z)V

    .line 1154
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyi;

    .line 1155
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 1156
    invoke-virtual {v6}, Lo/cyi;->d()V

    .line 1159
    :cond_0
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to disconnect device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    invoke-virtual {v5}, Lo/cyj;->d()V

    .line 1162
    :cond_1
    return-void
.end method

.method public e()V
    .locals 5

    .line 1703
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setAF500CurrentDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1743
    return-void
.end method

.method public e(J)V
    .locals 7

    .line 633
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 634
    return-void

    .line 636
    :cond_0
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    .line 637
    iget-object v0, p0, Lo/cys;->l:Ljava/util/List;

    long-to-int v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/bluetooth/BluetoothDevice;

    .line 638
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 639
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "connectSelectedDevice:btDevice is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 640
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "connectSelectedDevice id: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";name is: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 641
    invoke-virtual {p0}, Lo/cys;->a()V

    .line 642
    iget v0, p0, Lo/cys;->r:I

    const/4 v1, 0x1

    invoke-direct {p0, v0, v6, v1}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    .line 644
    :cond_1
    goto :goto_0

    .line 645
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_device_mgr_device_pair_guide_tips:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 648
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1211
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setFileCallback()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1213
    const/4 v6, 0x0

    .line 1215
    const/4 v0, 0x0

    invoke-direct {p0, v0, v6}, Lo/cys;->d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v7

    .line 1216
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 1217
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "deviceSendCommandUtil is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1218
    return-void

    .line 1220
    :cond_0
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setFileCallback path : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1222
    invoke-virtual {v7, p1}, Lo/cyj;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1223
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 1

    .line 767
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/cys;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Z)V

    .line 768
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Z)V
    .locals 15

    .line 772
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setCurrentDevice()."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v4, p2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 779
    const-string v0, "currentConnectedDevices"

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/cyp;->d(Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 781
    const-string v0, "reconnectDevices"

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/cyp;->d(Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 785
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 787
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceInfo is null\uff01\uff01\uff01"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 788
    return-void

    .line 791
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v6

    .line 792
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "macAddress = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v6}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 793
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x2

    if-ne v1, v0, :cond_1

    .line 794
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "This func do not support AF500 device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 795
    return-void

    .line 798
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v7

    .line 799
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v8

    .line 800
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device BTType = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 803
    invoke-static {}, Lo/cys;->r()Ljava/util/List;

    move-result-object v9

    .line 804
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v10

    .line 805
    invoke-interface {v9, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 806
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 810
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The Current device has already active."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 811
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 812
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, v7}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v11

    .line 813
    const/4 v0, 0x0

    if-eq v0, v11, :cond_5

    .line 814
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/cyj;

    .line 815
    const/4 v0, 0x1

    if-ne v0, v8, :cond_2

    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, v11}, Lo/cxk;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 817
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    invoke-virtual {v12}, Lo/cyj;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_4

    .line 818
    const/4 v0, 0x0

    invoke-direct {p0, v8, v11, v0}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    goto :goto_0

    .line 820
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v8, :cond_3

    if-eqz p2, :cond_3

    .line 822
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "reconnect Need to connect hfp profile."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 823
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, v11}, Lo/cxk;->c(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    .line 825
    :cond_3
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btType is not BR or hfp is not connect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 826
    const/4 v0, 0x2

    if-ne v0, v8, :cond_4

    .line 827
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Current is ble device so set is disconnect by user flag is false."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 829
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    invoke-virtual {v12}, Lo/cyj;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_4

    .line 831
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/cyj;->e(Z)V

    .line 832
    const/4 v0, 0x0

    invoke-virtual {p0, v10, v0}, Lo/cys;->e(Ljava/lang/String;Z)V

    .line 836
    :cond_4
    :goto_0
    goto :goto_1

    .line 837
    :cond_5
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDevice is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 839
    :goto_1
    goto/16 :goto_3

    .line 841
    :cond_6
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cyj;

    .line 842
    const/4 v0, 0x0

    if-eq v0, v11, :cond_7

    invoke-virtual {v11}, Lo/cyj;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_7

    .line 843
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to connect aw device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 844
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v8, v0, v1}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    .line 846
    :cond_7
    goto/16 :goto_3

    .line 849
    :cond_8
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The Current device has not active."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 850
    const/4 v11, 0x0

    .line 851
    const/4 v0, 0x0

    if-eq v0, v8, :cond_b

    .line 852
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, v10}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v11

    .line 853
    const/4 v0, 0x0

    if-ne v0, v11, :cond_9

    .line 854
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDevice is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 855
    return-void

    .line 859
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    .line 860
    :cond_a
    invoke-virtual {v11}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 861
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDevice name is empty."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 863
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-virtual {v11}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/cyj;

    .line 864
    const/4 v0, 0x0

    if-ne v0, v12, :cond_b

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_b

    .line 865
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device list do not have this device and device product exist."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 866
    new-instance v0, Lo/cyj;

    sget-object v1, Lo/cys;->h:Landroid/content/Context;

    move v2, v8

    move-object v3, v11

    iget-object v4, p0, Lo/cys;->c:Lo/cxx;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lo/cyj;-><init>(Landroid/content/Context;ILandroid/bluetooth/BluetoothDevice;Lo/cxx;I)V

    move-object v12, v0

    .line 868
    invoke-static {}, Lo/cys;->s()Ljava/lang/Object;

    move-result-object v13

    monitor-enter v13

    .line 869
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Put thie new device send command util into device list."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 870
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, v7, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 871
    monitor-exit v13

    goto :goto_2

    :catchall_0
    move-exception v14

    monitor-exit v13

    throw v14

    .line 878
    :cond_b
    :goto_2
    const/4 v0, 0x0

    invoke-direct {p0, v8, v11, v0}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    .line 880
    :cond_c
    :goto_3
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 7

    .line 883
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "disconnectDeviceByMac "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 886
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyj;

    .line 888
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 889
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to setBTDeviceActiveState is disable."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 891
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/cyj;->b(I)V

    .line 893
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Set Reconnect device identify is empty"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 894
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyi;

    .line 895
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 896
    const-string v0, ""

    invoke-virtual {v6, v0}, Lo/cyi;->b(Ljava/lang/String;)V

    .line 897
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to stopReconnectBLE."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 899
    invoke-virtual {v6}, Lo/cyi;->d()V

    .line 902
    :cond_0
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to disconnect device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 903
    invoke-virtual {v5}, Lo/cyj;->d()V

    .line 905
    :cond_1
    return-void
.end method

.method public e(Ljava/lang/String;Z)V
    .locals 13

    .line 1585
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter forceConnectBTDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1587
    const-string v0, "reconnectDevices"

    invoke-static {v0, p1}, Lo/cyp;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 1592
    sget-object v0, Lo/cys;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyj;

    .line 1593
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    .line 1594
    invoke-virtual {v6}, Lo/cyj;->e()I

    move-result v7

    .line 1595
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v8

    .line 1596
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Current connect state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1598
    const/4 v0, 0x2

    if-eq v0, v7, :cond_6

    .line 1599
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 1600
    const/4 v0, 0x1

    if-eq v0, v7, :cond_6

    .line 1601
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to connect AW device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1602
    invoke-virtual {v6}, Lo/cyj;->b()V

    goto/16 :goto_1

    .line 1606
    :cond_0
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v9

    .line 1607
    const/4 v0, 0x0

    if-eq v0, v9, :cond_6

    .line 1608
    const/4 v0, 0x2

    if-ne v0, v8, :cond_5

    .line 1609
    invoke-virtual {v6}, Lo/cyj;->i()Z

    move-result v10

    .line 1610
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reconnectEnableFlag = "

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

    .line 1611
    if-nez v10, :cond_1

    .line 1612
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "user has disabled the connect operation."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1613
    return-void

    .line 1616
    :cond_1
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cyi;

    .line 1617
    const/4 v0, 0x0

    if-eq v0, v11, :cond_4

    .line 1618
    invoke-virtual {v11}, Lo/cyi;->d()V

    .line 1620
    invoke-virtual {v11}, Lo/cyi;->b()Lo/cyj;

    move-result-object v12

    .line 1621
    const/4 v0, 0x0

    if-ne v0, v12, :cond_2

    .line 1623
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDeviceSendCommandUtil is null so reset it."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1624
    invoke-virtual {v11, v6}, Lo/cyi;->e(Lo/cyj;)V

    .line 1628
    :cond_2
    if-eqz p2, :cond_3

    .line 1629
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect find device so connect device directly."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1630
    const/4 v0, 0x1

    if-eq v0, v7, :cond_4

    const/4 v0, 0x2

    if-eq v0, v7, :cond_4

    .line 1631
    invoke-virtual {v6}, Lo/cyj;->b()V

    goto :goto_0

    .line 1635
    :cond_3
    invoke-virtual {v11, v5}, Lo/cyi;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1639
    :cond_4
    :goto_0
    goto :goto_1

    .line 1640
    :cond_5
    const/4 v0, 0x1

    if-ne v0, v8, :cond_6

    const/4 v0, 0x1

    if-eq v0, v7, :cond_6

    .line 1641
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, v9}, Lo/cxk;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1642
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to connect BR device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1643
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cys;->c(Z)V

    .line 1644
    invoke-virtual {v6}, Lo/cyj;->b()V

    .line 1652
    :cond_6
    :goto_1
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 690
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter removeDeviceList()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 691
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 692
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 693
    return-void

    .line 697
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 698
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cys;->i(Ljava/lang/String;)V

    .line 699
    goto :goto_0

    .line 700
    :cond_1
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 7

    .line 1772
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getHFPConnectedDeviceName()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1774
    const-string v5, ""

    .line 1776
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxk;->c(Ljava/util/List;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    .line 1777
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 1778
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The wanted device name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1779
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v5

    .line 1782
    :cond_0
    return-object v5
.end method

.method public f(Ljava/lang/String;)V
    .locals 8

    .line 1192
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendAWFilePath()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1194
    const/4 v6, 0x0

    .line 1196
    const/4 v0, 0x0

    invoke-direct {p0, v0, v6}, Lo/cys;->d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v7

    .line 1197
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 1198
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "deviceSendCommandUtil is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1199
    return-void

    .line 1201
    :cond_0
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendAWFilePath path : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1203
    invoke-virtual {v7, p1}, Lo/cyj;->e(Ljava/lang/String;)V

    .line 1204
    return-void
.end method

.method public g()V
    .locals 2

    .line 1749
    iget-object v0, p0, Lo/cys;->p:Lo/cxs;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1750
    iget-object v0, p0, Lo/cys;->p:Lo/cxs;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lo/cxs;->e(I)V

    .line 1752
    :cond_0
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 6

    .line 1887
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "stopReconnectBle enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1888
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1889
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "stopReconnectBle macAddress is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1890
    return-void

    .line 1893
    :cond_0
    sget-object v0, Lo/cys;->q:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cyi;

    .line 1894
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 1895
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "stopReconnectBle null == bleReconnectManager"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1896
    return-void

    .line 1898
    :cond_1
    invoke-virtual {v5}, Lo/cyi;->d()V

    .line 1899
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1790
    iget-object v0, p0, Lo/cys;->s:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 9

    .line 1797
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setAddedDeviceSuccess()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1798
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1799
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTSDKApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "strIdentify is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1800
    return-void

    .line 1803
    :cond_0
    const/4 v6, -0x1

    .line 1804
    const-string v0, "AndroidWear"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1805
    const/4 v6, 0x0

    .line 1808
    :cond_1
    const/4 v7, 0x0

    .line 1809
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 1810
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    invoke-virtual {v0, p1}, Lo/cxk;->e(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v7

    .line 1811
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 1812
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDevice is null so return."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1813
    return-void

    .line 1816
    :cond_2
    invoke-virtual {v7}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1817
    const/4 v6, 0x1

    goto :goto_0

    .line 1818
    :cond_3
    invoke-virtual {v7}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 1819
    const/4 v6, 0x2

    goto :goto_0

    .line 1821
    :cond_4
    const/4 v6, -0x1

    .line 1822
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The btType is unknown."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1827
    :cond_5
    :goto_0
    invoke-direct {p0, v6, v7}, Lo/cys;->d(ILandroid/bluetooth/BluetoothDevice;)Lo/cyj;

    move-result-object v8

    .line 1828
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 1829
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Set wanted device add success flag."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1830
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/cyj;->b(Z)V

    goto :goto_1

    .line 1832
    :cond_6
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceSendCommandUtil is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1834
    :goto_1
    return-void
.end method

.method public i()V
    .locals 6

    .line 1758
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter connectHFPConnectedDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1760
    iget-object v0, p0, Lo/cys;->u:Lo/cxk;

    iget-object v1, p0, Lo/cys;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cxk;->c(Ljava/util/List;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    .line 1761
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1762
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The wanted device name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1763
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v5, v1}, Lo/cys;->c(ILandroid/bluetooth/BluetoothDevice;Z)V

    .line 1765
    :cond_0
    return-void
.end method

.method public k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 5

    .line 1871
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getCurrentConnectedAWDeviceInfo."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1872
    const-string v0, "currentConnectedDevices"

    const-string v1, "AndroidWear"

    invoke-static {v0, v1}, Lo/cyp;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 1902
    invoke-static {p1}, Lo/cyp;->e(Ljava/lang/String;)V

    .line 1903
    return-void
.end method

.method public l()Z
    .locals 1

    .line 1906
    iget-boolean v0, p0, Lo/cys;->v:Z

    return v0
.end method
