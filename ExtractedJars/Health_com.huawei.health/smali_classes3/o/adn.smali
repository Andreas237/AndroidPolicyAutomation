.class public Lo/adn;
.super Lo/afu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/adn$c;,
        Lo/adn$b;,
        Lo/adn$e;
    }
.end annotation


# static fields
.field private static O:Ljava/lang/Object;

.field private static e:Lo/adn;


# instance fields
.field private A:Ljava/util/TimerTask;

.field private B:Ljava/util/Timer;

.field private C:Lo/afp;

.field private D:Z

.field private E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/abx;>;"
        }
    .end annotation
.end field

.field private F:Landroid/content/Context;

.field private G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/agg;>;"
        }
    .end annotation
.end field

.field private H:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/agg;>;"
        }
    .end annotation
.end field

.field private I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/agg;>;"
        }
    .end annotation
.end field

.field private J:I

.field private K:I

.field private L:Lo/agk;

.field private M:I

.field private N:Z

.field private P:Z

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Lo/adq;

.field private X:Landroid/content/SharedPreferences;

.field private Y:Landroid/bluetooth/BluetoothGattCallback;

.field private Z:Lo/ahi$e;

.field private a:Lo/acl;

.field private ac:Z

.field private c:Ljava/lang/String;

.field d:Lo/adn$b;

.field private f:Landroid/bluetooth/BluetoothGatt;

.field private g:Landroid/bluetooth/BluetoothGattService;

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:Ljava/util/Timer;

.field private m:Lo/adn$c;

.field private n:I

.field private o:Ljava/util/TimerTask;

.field private p:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private q:Lo/adn$e;

.field private r:Z

.field private s:Z

.field private t:I

.field private u:Landroid/os/HandlerThread;

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 149
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/adn;->O:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 171
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 86
    const/16 v0, 0xad

    iput v0, p0, Lo/adn;->h:I

    .line 87
    const/16 v0, 0x1d

    iput v0, p0, Lo/adn;->k:I

    .line 88
    const/4 v0, 0x1

    iput v0, p0, Lo/adn;->i:I

    .line 96
    const/16 v0, 0x1f4

    iput v0, p0, Lo/adn;->t:I

    .line 97
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "PluginDevice_PluginDevice"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/adn;->u:Landroid/os/HandlerThread;

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->s:Z

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->r:Z

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->v:Z

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->y:Z

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->z:Z

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->x:Z

    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->w:Z

    .line 111
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->j:Z

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->D:Z

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afp;->d(Landroid/content/Context;)Lo/afp;

    move-result-object v0

    iput-object v0, p0, Lo/adn;->C:Lo/afp;

    .line 115
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/adn;->F:Landroid/content/Context;

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/adn;->G:Ljava/util/ArrayList;

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/adn;->I:Ljava/util/ArrayList;

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->N:Z

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lo/adn;->J:I

    .line 140
    const/16 v0, 0x7d0

    iput v0, p0, Lo/adn;->K:I

    .line 146
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->S:Z

    .line 147
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->R:Z

    .line 151
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->P:Z

    .line 157
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->T:Z

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->V:Z

    .line 159
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->U:Z

    .line 160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->ac:Z

    .line 321
    new-instance v0, Lo/adn$4;

    invoke-direct {v0, p0}, Lo/adn$4;-><init>(Lo/adn;)V

    iput-object v0, p0, Lo/adn;->Z:Lo/ahi$e;

    .line 519
    new-instance v0, Lo/adn$2;

    invoke-direct {v0, p0}, Lo/adn$2;-><init>(Lo/adn;)V

    iput-object v0, p0, Lo/adn;->Y:Landroid/bluetooth/BluetoothGattCallback;

    .line 172
    invoke-direct {p0}, Lo/adn;->g()V

    .line 173
    iget-object v0, p0, Lo/adn;->F:Landroid/content/Context;

    const-string v1, "weightUser"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/adn;->X:Landroid/content/SharedPreferences;

    .line 174
    return-void
.end method

.method static synthetic A(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->u()V

    return-void
.end method

.method static synthetic B(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->l()V

    return-void
.end method

.method static synthetic C(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->R:Z

    return v0
.end method

.method static synthetic D(Lo/adn;)Lo/acg;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic E(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->ac:Z

    return v0
.end method

.method static synthetic F(Lo/adn;)Lo/acg;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic G(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->U:Z

    return v0
.end method

.method static synthetic H(Lo/adn;)Lo/afp;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->C:Lo/afp;

    return-object v0
.end method

.method static synthetic I(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->V:Z

    return v0
.end method

.method static synthetic J(Lo/adn;)Lo/acg;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic K(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->P:Z

    return v0
.end method

.method static synthetic L(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->w:Z

    return v0
.end method

.method static synthetic M(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->Q:Z

    return v0
.end method

.method static synthetic a(Lo/adn;)I
    .locals 2

    .line 71
    iget v0, p0, Lo/adn;->J:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/adn;->J:I

    return v0
.end method

.method static synthetic a(Lo/adn;I)I
    .locals 0

    .line 71
    iput p1, p0, Lo/adn;->i:I

    return p1
.end method

.method private a(I)Ljava/lang/String;
    .locals 6

    .line 836
    div-int/lit16 v2, p1, 0x1000

    .line 837
    div-int/lit16 v0, p1, 0x100

    rem-int/lit8 v3, v0, 0x10

    .line 838
    rem-int/lit16 v4, p1, 0x100

    .line 839
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

    .line 840
    return-object v5
.end method

.method public static a()Lo/adn;
    .locals 3

    .line 163
    sget-object v1, Lo/adn;->O:Ljava/lang/Object;

    monitor-enter v1

    .line 164
    :try_start_0
    sget-object v0, Lo/adn;->e:Lo/adn;

    if-nez v0, :cond_0

    .line 165
    new-instance v0, Lo/adn;

    invoke-direct {v0}, Lo/adn;-><init>()V

    sput-object v0, Lo/adn;->e:Lo/adn;

    .line 167
    :cond_0
    sget-object v0, Lo/adn;->e:Lo/adn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 168
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;Lo/adn$e;)V
    .locals 4

    .line 484
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 485
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to close gatt..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 487
    const/4 p1, 0x0

    .line 489
    :cond_0
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 490
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/adn$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 492
    :cond_1
    return-void
.end method

.method private a(Lo/abx;)V
    .locals 6

    .line 354
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCallBack----start----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    monitor-enter v4

    .line 356
    :try_start_0
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    monitor-exit v4

    return-void

    .line 359
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 360
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCallBack  Null =callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 361
    monitor-exit v4

    return-void

    .line 363
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCallBack  add sucess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 366
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 367
    :goto_0
    return-void
.end method

.method private a([BLo/adn$b;)V
    .locals 4

    .line 1152
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "safeguardSendData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lo/adn$b;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    iget-object v0, p0, Lo/adn;->m:Lo/adn$c;

    if-eqz v0, :cond_0

    .line 1154
    iget-object v0, p0, Lo/adn;->m:Lo/adn$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/adn$c;->e(Z)V

    .line 1155
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    iget-object v1, p0, Lo/adn;->m:Lo/adn$c;

    invoke-virtual {v0, v1}, Lo/adn$e;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1157
    :cond_0
    new-instance v0, Lo/adn$c;

    invoke-direct {v0, p0, p1, p2}, Lo/adn$c;-><init>(Lo/adn;[BLo/adn$b;)V

    iput-object v0, p0, Lo/adn;->m:Lo/adn$c;

    .line 1158
    iput-object p2, p0, Lo/adn;->d:Lo/adn$b;

    .line 1159
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executorService.execute(mRun)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    iget-object v1, p0, Lo/adn;->m:Lo/adn$c;

    iget v2, p0, Lo/adn;->t:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lo/adn$e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1161
    return-void
.end method

.method static synthetic a(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->S:Z

    return p1
.end method

.method static synthetic b(Lo/adn;)I
    .locals 1

    .line 71
    iget v0, p0, Lo/adn;->J:I

    return v0
.end method

.method static synthetic b(Lo/adn;I)I
    .locals 0

    .line 71
    iput p1, p0, Lo/adn;->h:I

    return p1
.end method

.method static synthetic b(Lo/adn;Lo/adq;)Lo/adq;
    .locals 0

    .line 71
    iput-object p1, p0, Lo/adn;->W:Lo/adq;

    return-object p1
.end method

.method private b(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/ArrayList<Lo/agg;>;)V"
        }
    .end annotation

    .line 1241
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1242
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 1243
    iget-object v0, p0, Lo/adn;->C:Lo/afp;

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/agg;

    invoke-virtual {v1}, Lo/agg;->h()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lo/afp;->d(Ljava/lang/String;J)V

    .line 1242
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1246
    :cond_0
    return-void
.end method

.method private b(Lo/acl;Lo/afz;)V
    .locals 5

    .line 390
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v1

    .line 391
    const/4 v2, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 392
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/abx;

    .line 393
    if-eqz v3, :cond_0

    .line 394
    invoke-interface {v3, p1, p2}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 391
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 397
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 398
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/adn;[BLo/adn$b;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lo/adn;->a([BLo/adn$b;)V

    return-void
.end method

.method static synthetic b(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->P:Z

    return p1
.end method

.method static synthetic c(Lo/adn;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method static synthetic c(Lo/adn;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 71
    iput-object p1, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method static synthetic c(Lo/adn;I)Ljava/lang/String;
    .locals 1

    .line 71
    invoke-direct {p0, p1}, Lo/adn;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/adn;Lo/acl;I)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lo/adn;->d(Lo/acl;I)V

    return-void
.end method

.method static synthetic c(Lo/adn;Lo/adw;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lo/adn;->c(Lo/adw;)V

    return-void
.end method

.method private c(Lo/adw;)V
    .locals 7

    .line 848
    new-instance v4, Lo/ady;

    invoke-direct {v4}, Lo/ady;-><init>()V

    .line 850
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 851
    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/ady;->a(Ljava/lang/String;)V

    .line 852
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController setUserIdToDevice getSendData  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 854
    :cond_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/ady;->a(Ljava/lang/String;)V

    .line 855
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController setUserIdToDevice getSendData  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/act;->a:Lo/act;

    invoke-virtual {v3}, Lo/act;->b()Lo/acu;

    move-result-object v3

    invoke-virtual {v3}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 858
    :goto_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v5

    .line 859
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 860
    invoke-virtual {v5}, Lo/acu;->b()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ady;->e(I)V

    .line 861
    invoke-virtual {v5}, Lo/acu;->d()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ady;->d(I)V

    .line 862
    invoke-virtual {v5}, Lo/acu;->c()B

    move-result v0

    iput v0, p0, Lo/adn;->i:I

    .line 863
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user name: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", uuid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 865
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user info is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    iget v0, p0, Lo/adn;->k:I

    invoke-virtual {v4, v0}, Lo/ady;->e(I)V

    .line 867
    iget v0, p0, Lo/adn;->h:I

    invoke-virtual {v4, v0}, Lo/ady;->d(I)V

    .line 870
    :goto_1
    iget v0, p0, Lo/adn;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 871
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/ady;->c(I)V

    goto :goto_2

    .line 873
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/ady;->c(I)V

    .line 876
    :goto_2
    sget-object v0, Lo/acs;->c:Lo/acs;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->b()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v6

    .line 877
    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 878
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/ady;->b(F)V

    goto :goto_3

    .line 880
    :cond_3
    const/high16 v0, 0x42700000    # 60.0f

    invoke-virtual {v4, v0}, Lo/ady;->b(F)V

    .line 882
    :goto_3
    invoke-static {v4}, Lo/adl;->a(Lo/ady;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/adw;->a([B)V

    .line 883
    return-void
.end method

.method static synthetic c(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->v:Z

    return p1
.end method

.method static synthetic d(Lo/adn;I)I
    .locals 0

    .line 71
    iput p1, p0, Lo/adn;->n:I

    return p1
.end method

.method static synthetic d(Lo/adn;)Lo/adn$e;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    return-object v0
.end method

.method private d(Lo/acl;I)V
    .locals 5

    .line 378
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v1

    .line 379
    const/4 v2, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 380
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/abx;

    .line 381
    if-eqz v3, :cond_0

    .line 382
    invoke-interface {v3, p1, p2}, Lo/abx;->onStatusChanged(Lo/acl;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 385
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 386
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/adn;Landroid/bluetooth/BluetoothGatt;Lo/adn$e;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lo/adn;->a(Landroid/bluetooth/BluetoothGatt;Lo/adn$e;)V

    return-void
.end method

.method static synthetic d(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->R:Z

    return p1
.end method

.method static synthetic e(Lo/adn;I)I
    .locals 0

    .line 71
    iput p1, p0, Lo/adn;->k:I

    return p1
.end method

.method static synthetic e(Lo/adn;Lo/ads;)Lo/afz;
    .locals 1

    .line 71
    invoke-direct {p0, p1}, Lo/adn;->e(Lo/ads;)Lo/afz;

    move-result-object v0

    return-object v0
.end method

.method private e(Lo/ads;)Lo/afz;
    .locals 3

    .line 886
    new-instance v2, Lo/agg;

    invoke-direct {v2}, Lo/agg;-><init>()V

    .line 887
    invoke-virtual {p1}, Lo/ads;->a()F

    move-result v0

    invoke-virtual {v2, v0}, Lo/agg;->e(F)V

    .line 888
    invoke-virtual {p1}, Lo/ads;->d()F

    move-result v0

    invoke-virtual {v2, v0}, Lo/agg;->b(F)V

    .line 889
    invoke-virtual {p1}, Lo/ads;->e()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Lo/agg;->d(D)V

    .line 890
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/agg;->e(J)V

    .line 891
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/agg;->d(J)V

    .line 892
    return-object v2
.end method

.method static synthetic e(Lo/adn;Lo/acl;Lo/afz;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Lo/adn;->b(Lo/acl;Lo/afz;)V

    return-void
.end method

.method private declared-synchronized e(Z)V
    .locals 6

    monitor-enter p0

    .line 952
    :try_start_0
    iget-object v0, p0, Lo/adn;->l:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 953
    iget-object v0, p0, Lo/adn;->l:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 954
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->l:Ljava/util/Timer;

    .line 956
    :cond_0
    iget-object v0, p0, Lo/adn;->o:Ljava/util/TimerTask;

    if-eqz v0, :cond_1

    .line 957
    iget-object v0, p0, Lo/adn;->o:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 958
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->o:Ljava/util/TimerTask;

    .line 961
    :cond_1
    if-nez p1, :cond_2

    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 962
    :cond_2
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/adn;->l:Ljava/util/Timer;

    .line 963
    new-instance v0, Lo/adn$1;

    invoke-direct {v0, p0}, Lo/adn$1;-><init>(Lo/adn;)V

    iput-object v0, p0, Lo/adn;->o:Ljava/util/TimerTask;

    .line 969
    iget-object v0, p0, Lo/adn;->l:Ljava/util/Timer;

    iget-object v1, p0, Lo/adn;->o:Ljava/util/TimerTask;

    const-wide/16 v2, 0x7d0

    const-wide/16 v4, 0x7d0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 971
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic e(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->v:Z

    return v0
.end method

.method static synthetic e(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->s:Z

    return p1
.end method

.method static synthetic f(Lo/adn;)Lo/acg;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic f(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->x:Z

    return p1
.end method

.method static synthetic g(Lo/adn;)I
    .locals 1

    .line 71
    iget v0, p0, Lo/adn;->M:I

    return v0
.end method

.method private g()V
    .locals 2

    .line 184
    iget-object v0, p0, Lo/adn;->u:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 185
    new-instance v0, Lo/adn$e;

    iget-object v1, p0, Lo/adn;->u:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/adn$e;-><init>(Lo/adn;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/adn;->q:Lo/adn$e;

    .line 186
    return-void
.end method

.method static synthetic g(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->T:Z

    return p1
.end method

.method static synthetic h(Lo/adn;)Landroid/content/Context;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->F:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h(Lo/adn;Z)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lo/adn;->e(Z)V

    return-void
.end method

.method static synthetic i(Lo/adn;)Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->D:Z

    return p1
.end method

.method static synthetic j(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->S:Z

    return v0
.end method

.method static synthetic k(Lo/adn;)Lo/acg;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->b:Lo/acg;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 272
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController setCleanData isSyncData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/adn;->j:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";  mType=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adn;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->r:Z

    .line 274
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->g:Landroid/bluetooth/BluetoothGattService;

    .line 275
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 276
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->P:Z

    .line 277
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->T:Z

    .line 278
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 279
    invoke-direct {p0}, Lo/adn;->n()V

    .line 280
    invoke-direct {p0}, Lo/adn;->l()V

    .line 281
    iget-object v0, p0, Lo/adn;->m:Lo/adn$c;

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Lo/adn;->m:Lo/adn$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/adn$c;->e(Z)V

    .line 284
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->s:Z

    .line 285
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->W:Lo/adq;

    .line 286
    invoke-direct {p0}, Lo/adn;->s()V

    .line 287
    invoke-direct {p0}, Lo/adn;->u()V

    .line 288
    invoke-direct {p0}, Lo/adn;->p()V

    .line 289
    iget-object v0, p0, Lo/adn;->Z:Lo/ahi$e;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "weight_device_clear_user_data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "weight_device_ota_update"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "get_scale_version_code"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ahi;->a(Lo/ahi$e;[Ljava/lang/String;)V

    .line 291
    return-void
.end method

.method static synthetic k(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->w:Z

    return p1
.end method

.method private declared-synchronized l()V
    .locals 2

    monitor-enter p0

    .line 997
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lo/adn;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 998
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method static synthetic l(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->y:Z

    return v0
.end method

.method static synthetic l(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->z:Z

    return p1
.end method

.method private m()V
    .locals 5

    .line 924
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_3

    .line 925
    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    .line 927
    iget-object v0, p0, Lo/adn;->X:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 928
    iget-object v0, p0, Lo/adn;->X:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    goto :goto_0

    .line 930
    :cond_0
    iget-object v0, p0, Lo/adn;->F:Landroid/content/Context;

    const-string v1, "weightUser"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 932
    :goto_0
    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 933
    const-string v0, "weightUser_id"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 934
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 936
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController setUserIdToDevice  getCurrentUser = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 937
    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->b(Ljava/lang/String;)[B

    move-result-object v0

    sget-object v1, Lo/adn$b;->l:Lo/adn$b;

    invoke-direct {p0, v0, v1}, Lo/adn;->a([BLo/adn$b;)V

    .line 938
    goto :goto_1

    .line 939
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController setUserIdToDevice  getCurrentUser2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 940
    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->b(Ljava/lang/String;)[B

    move-result-object v0

    sget-object v1, Lo/adn$b;->l:Lo/adn$b;

    invoke-direct {p0, v0, v1}, Lo/adn;->a([BLo/adn$b;)V

    goto :goto_1

    .line 943
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->b(Ljava/lang/String;)[B

    move-result-object v0

    sget-object v1, Lo/adn$b;->l:Lo/adn$b;

    invoke-direct {p0, v0, v1}, Lo/adn;->a([BLo/adn$b;)V

    .line 945
    :goto_1
    return-void
.end method

.method static synthetic m(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->s()V

    return-void
.end method

.method static synthetic m(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->V:Z

    return p1
.end method

.method private n()V
    .locals 1

    .line 295
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->V:Z

    .line 296
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->U:Z

    .line 297
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->ac:Z

    .line 298
    return-void
.end method

.method static synthetic n(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->z:Z

    return v0
.end method

.method static synthetic n(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->U:Z

    return p1
.end method

.method static synthetic o(Lo/adn;)Lo/adq;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->W:Lo/adq;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 495
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HeartRateMeasureController setBlueGattStatus type == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adn;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    const/4 v0, 0x0

    iput v0, p0, Lo/adn;->n:I

    .line 497
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->R:Z

    .line 498
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->j:Z

    .line 499
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->D:Z

    .line 500
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->S:Z

    .line 501
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->g:Landroid/bluetooth/BluetoothGattService;

    .line 502
    invoke-direct {p0}, Lo/adn;->l()V

    .line 503
    invoke-direct {p0}, Lo/adn;->u()V

    .line 504
    invoke-direct {p0}, Lo/adn;->p()V

    .line 505
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController onConnectionStateChange STATUS_DISCONNECTED 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    iget-boolean v0, p0, Lo/adn;->r:Z

    if-eqz v0, :cond_0

    .line 508
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateMeasureController isFirstConnect enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/adn;->q:Lo/adn$e;

    invoke-direct {p0, v0, v1}, Lo/adn;->a(Landroid/bluetooth/BluetoothGatt;Lo/adn$e;)V

    .line 511
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 512
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Lo/adn$e;->sendEmptyMessageDelayed(IJ)Z

    .line 516
    :cond_0
    iget-object v0, p0, Lo/adn;->a:Lo/acl;

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lo/adn;->d(Lo/acl;I)V

    .line 517
    return-void
.end method

.method static synthetic o(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->j:Z

    return p1
.end method

.method private declared-synchronized p()V
    .locals 3

    monitor-enter p0

    .line 1001
    :try_start_0
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1002
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 1003
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 1006
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1007
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method static synthetic p(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->x:Z

    return v0
.end method

.method static synthetic p(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->y:Z

    return p1
.end method

.method private q()V
    .locals 5

    .line 1210
    iget-object v0, p0, Lo/adn;->I:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/adn;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1211
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/adn;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 1212
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert to data platform"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1213
    iget-object v0, p0, Lo/adn;->L:Lo/agk;

    iget-object v1, p0, Lo/adn;->a:Lo/acl;

    iget-object v2, p0, Lo/adn;->I:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afz;

    invoke-virtual {v0, v1, v2}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 1211
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1215
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1216
    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/adn;->I:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Lo/adn;->b(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_1

    .line 1218
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/adn;->I:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Lo/adn;->b(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1220
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/adn;->N:Z

    .line 1223
    :cond_2
    iget-object v0, p0, Lo/adn;->G:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/adn;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1224
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1225
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lo/adn$e;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 1228
    :cond_3
    iget-boolean v0, p0, Lo/adn;->N:Z

    if-eqz v0, :cond_4

    .line 1229
    iget-object v0, p0, Lo/adn;->F:Landroid/content/Context;

    iget-object v1, p0, Lo/adn;->F:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_sync_data_done_toast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1230
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1231
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/adn$e;->sendEmptyMessage(I)Z

    .line 1235
    :cond_4
    :goto_2
    return-void
.end method

.method static synthetic q(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->j:Z

    return v0
.end method

.method private declared-synchronized r()V
    .locals 7

    monitor-enter p0

    .line 1010
    :try_start_0
    invoke-direct {p0}, Lo/adn;->u()V

    .line 1011
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/adn;->B:Ljava/util/Timer;

    .line 1012
    new-instance v0, Lo/adn$5;

    invoke-direct {v0, p0}, Lo/adn$5;-><init>(Lo/adn;)V

    iput-object v0, p0, Lo/adn;->A:Ljava/util/TimerTask;

    .line 1042
    iget v6, p0, Lo/adn;->K:I

    .line 1043
    iget-object v0, p0, Lo/adn;->B:Ljava/util/Timer;

    iget-object v1, p0, Lo/adn;->A:Ljava/util/TimerTask;

    int-to-long v2, v6

    int-to-long v4, v6

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1044
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6
.end method

.method static synthetic r(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->m()V

    return-void
.end method

.method static synthetic r(Lo/adn;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lo/adn;->ac:Z

    return p1
.end method

.method static synthetic s(Lo/adn;)I
    .locals 1

    .line 71
    iget v0, p0, Lo/adn;->n:I

    return v0
.end method

.method private s()V
    .locals 1

    .line 1061
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->w:Z

    .line 1062
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->y:Z

    .line 1063
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->z:Z

    .line 1064
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->x:Z

    .line 1065
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->D:Z

    .line 1066
    return-void
.end method

.method private t()V
    .locals 2

    .line 1083
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1084
    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->c(Ljava/lang/String;)[B

    move-result-object v0

    sget-object v1, Lo/adn$b;->f:Lo/adn$b;

    invoke-direct {p0, v0, v1}, Lo/adn;->a([BLo/adn$b;)V

    goto :goto_0

    .line 1086
    :cond_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->c(Ljava/lang/String;)[B

    move-result-object v0

    sget-object v1, Lo/adn$b;->f:Lo/adn$b;

    invoke-direct {p0, v0, v1}, Lo/adn;->a([BLo/adn$b;)V

    .line 1088
    :goto_0
    return-void
.end method

.method static synthetic t(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->o()V

    return-void
.end method

.method static synthetic u(Lo/adn;)Lo/acg;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->b:Lo/acg;

    return-object v0
.end method

.method private u()V
    .locals 1

    .line 1047
    iget-object v0, p0, Lo/adn;->B:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 1048
    iget-object v0, p0, Lo/adn;->B:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 1049
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->B:Ljava/util/Timer;

    .line 1051
    :cond_0
    iget-object v0, p0, Lo/adn;->A:Ljava/util/TimerTask;

    if-eqz v0, :cond_1

    .line 1052
    iget-object v0, p0, Lo/adn;->A:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 1053
    const/4 v0, 0x0

    iput-object v0, p0, Lo/adn;->A:Ljava/util/TimerTask;

    .line 1055
    :cond_1
    return-void
.end method

.method static synthetic v(Lo/adn;)Lo/acl;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/adn;->a:Lo/acl;

    return-object v0
.end method

.method static synthetic w(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->t()V

    return-void
.end method

.method static synthetic x(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->r()V

    return-void
.end method

.method static synthetic y(Lo/adn;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/adn;->n()V

    return-void
.end method

.method static synthetic z(Lo/adn;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lo/adn;->s:Z

    return v0
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGatt;)V
    .locals 5

    .line 896
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController initService, service = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn;->g:Landroid/bluetooth/BluetoothGattService;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 898
    iput-object p1, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    .line 899
    iget-object v0, p0, Lo/adn;->g:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_0

    .line 900
    return-void

    .line 903
    :cond_0
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    const-string v1, "0000faa0-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    iput-object v0, p0, Lo/adn;->g:Landroid/bluetooth/BluetoothGattService;

    .line 905
    iget-object v0, p0, Lo/adn;->g:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_2

    .line 906
    iget-object v0, p0, Lo/adn;->g:Landroid/bluetooth/BluetoothGattService;

    const-string v1, "0000faa2-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iput-object v0, p0, Lo/adn;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 907
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/adn;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 909
    iget-object v0, p0, Lo/adn;->p:Landroid/bluetooth/BluetoothGattCharacteristic;

    const-string v1, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v4

    .line 910
    if-eqz v4, :cond_1

    .line 911
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 912
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 913
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    .line 916
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController mHealthDevice.getAddress() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn;->a:Lo/acl;

    invoke-virtual {v3}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    :cond_2
    return-void
.end method

.method public a([B)V
    .locals 7

    .line 974
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_2

    .line 975
    iget v0, p0, Lo/adn;->n:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 976
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    const-string v1, "0000faa0-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v4

    .line 977
    if-eqz v4, :cond_1

    .line 978
    const-string v0, "0000faa1-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v5

    .line 979
    if-eqz v5, :cond_0

    .line 980
    invoke-virtual {v5, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 981
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    .line 983
    :try_start_0
    iget-object v0, p0, Lo/adn;->f:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v5}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v6

    .line 984
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Write key: isSuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 987
    goto :goto_0

    .line 985
    :catch_0
    move-exception v6

    .line 986
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Write key fail:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 989
    :cond_0
    :goto_0
    goto :goto_1

    .line 990
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write BluetoothGattService is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 994
    :cond_2
    :goto_1
    return-void
.end method

.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 403
    iget-object v0, p0, Lo/adn;->Z:Lo/ahi$e;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "weight_device_clear_user_data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "weight_device_ota_update"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "get_scale_version_code"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/ahi;->d(Lo/ahi$e;I[Ljava/lang/String;)V

    .line 405
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController prepare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    if-eqz p2, :cond_0

    .line 407
    invoke-direct {p0, p2}, Lo/adn;->a(Lo/abx;)V

    .line 410
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 411
    const-string v0, "type"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/adn;->M:I

    .line 412
    const-string v0, "productId"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/adn;->c:Ljava/lang/String;

    .line 413
    const-string v0, "clearData"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/adn;->Q:Z

    .line 414
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController prepare  mType ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adn;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 416
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->Q:Z

    .line 417
    const/4 v0, 0x0

    iput v0, p0, Lo/adn;->M:I

    .line 419
    :goto_0
    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x4

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_3

    .line 420
    :cond_2
    const/16 v0, 0x7d0

    iput v0, p0, Lo/adn;->K:I

    .line 421
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/adn;->r:Z

    goto :goto_1

    .line 423
    :cond_3
    const/16 v0, 0x1f40

    iput v0, p0, Lo/adn;->K:I

    .line 424
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->r:Z

    .line 427
    :goto_1
    iget-boolean v0, p0, Lo/adn;->T:Z

    if-eqz v0, :cond_4

    const/16 v0, 0xe

    goto :goto_2

    :cond_4
    const/16 v0, 0xd

    :goto_2
    invoke-direct {p0, p1, v0}, Lo/adn;->d(Lo/acl;I)V

    .line 428
    iget-boolean v0, p0, Lo/adn;->D:Z

    if-eqz v0, :cond_5

    const/4 v0, 0x2

    goto :goto_3

    :cond_5
    const/4 v0, 0x3

    :goto_3
    invoke-direct {p0, p1, v0}, Lo/adn;->d(Lo/acl;I)V

    .line 430
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/adn$3;

    invoke-direct {v1, p0}, Lo/adn$3;-><init>(Lo/adn;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 459
    iput-object p1, p0, Lo/adn;->a:Lo/acl;

    .line 460
    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->d(Ljava/lang/String;)V

    .line 461
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 463
    if-eqz p3, :cond_6

    .line 464
    const-string v0, "height"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/adn;->h:I

    .line 465
    const-string v0, "sex"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/adn;->i:I

    .line 466
    const-string v0, "age"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/adn;->k:I

    .line 467
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController productId is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 470
    :cond_6
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController args is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :goto_4
    const/4 v0, 0x1

    return v0

    .line 474
    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lo/abx;)V
    .locals 3

    .line 370
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v1

    .line 371
    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    iget-object v0, p0, Lo/adn;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 375
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 4

    .line 178
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController start  mState  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adn;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 4

    .line 479
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController getGattCallbackImpl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    iget-object v0, p0, Lo/adn;->Y:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 256
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController cleanup isSyncData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/adn;->j:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";  mType=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adn;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x5

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lo/adn;->j:Z

    if-nez v0, :cond_1

    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x4

    if-eq v0, v1, :cond_1

    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 260
    :cond_0
    invoke-direct {p0}, Lo/adn;->k()V

    .line 262
    const/4 v0, 0x0

    iput v0, p0, Lo/adn;->n:I

    .line 263
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->R:Z

    .line 264
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->D:Z

    .line 265
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adn;->S:Z

    .line 266
    invoke-direct {p0}, Lo/adn;->l()V

    .line 267
    invoke-direct {p0}, Lo/adn;->u()V

    .line 269
    :cond_1
    return-void
.end method

.method public e()V
    .locals 4

    .line 302
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWChMeasureController ending isSyncData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/adn;->j:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";  mType=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adn;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x5

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lo/adn;->j:Z

    if-nez v0, :cond_2

    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x4

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/adn;->M:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 307
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController ending"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    invoke-direct {p0}, Lo/adn;->k()V

    .line 310
    iget-object v0, p0, Lo/adn;->u:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 311
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 312
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/adn$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    iget-object v1, p0, Lo/adn;->m:Lo/adn$c;

    invoke-virtual {v0, v1}, Lo/adn$e;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 316
    :cond_1
    invoke-super {p0}, Lo/afu;->e()V

    .line 319
    :cond_2
    return-void
.end method

.method public declared-synchronized f()V
    .locals 7

    monitor-enter p0

    .line 1167
    :try_start_0
    iget-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1168
    iget-object v0, p0, Lo/adn;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1169
    iget-object v0, p0, Lo/adn;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1170
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1171
    iget-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/adn;->C:Lo/afp;

    invoke-virtual {p0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/afp;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 1173
    :cond_0
    iget-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/adn;->C:Lo/afp;

    sget-object v2, Lo/act;->a:Lo/act;

    invoke-virtual {v2}, Lo/act;->b()Lo/acu;

    move-result-object v2

    invoke-virtual {v2}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/afp;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1175
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "weight offline data size is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1176
    iget-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1177
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 1178
    iget-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/agg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/agg;->a(Z)V

    .line 1179
    iget-object v0, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/agg;

    invoke-virtual {v0}, Lo/agg;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1180
    iget-object v0, p0, Lo/adn;->G:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1182
    :cond_1
    iget-object v0, p0, Lo/adn;->I:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1177
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1185
    :cond_2
    new-instance v0, Lo/agk;

    iget-object v1, p0, Lo/adn;->a:Lo/acl;

    invoke-virtual {v1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x2716

    invoke-direct {v0, v2, v1, v3}, Lo/agk;-><init>(ILjava/lang/String;I)V

    iput-object v0, p0, Lo/adn;->L:Lo/agk;

    .line 1187
    invoke-direct {p0}, Lo/adn;->q()V

    .line 1188
    iget-object v0, p0, Lo/adn;->G:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-double v0, v0

    iget-object v2, p0, Lo/adn;->H:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    int-to-double v2, v2

    div-double v4, v0, v2

    .line 1189
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v4

    .line 1190
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "normal data size =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn;->I:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";suspected data size =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn;->G:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1191
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1192
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1193
    const-string v0, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1194
    const-string v0, "proportion"

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/adn;->F:Landroid/content/Context;

    sget-object v2, Lo/dae;->gc:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1197
    goto :goto_3

    .line 1198
    :cond_3
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1199
    iget-object v0, p0, Lo/adn;->q:Lo/adn$e;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/adn$e;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1203
    :cond_4
    :goto_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method public h()Z
    .locals 1

    .line 1253
    iget-boolean v0, p0, Lo/adn;->D:Z

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 3

    .line 1073
    iget-object v0, p0, Lo/adn;->X:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1074
    iget-object v0, p0, Lo/adn;->X:Landroid/content/SharedPreferences;

    const-string v1, "weightUser_id"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1076
    :cond_0
    const-string v0, ""

    return-object v0
.end method
