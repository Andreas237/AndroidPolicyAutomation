.class public Lo/dez;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dez$a;,
        Lo/dez$d;,
        Lo/dez$f;,
        Lo/dez$c;,
        Lo/dez$i;,
        Lo/dez$h;,
        Lo/dez$b;,
        Lo/dez$g;,
        Lo/dez$e;
    }
.end annotation


# static fields
.field private static final A:Ljava/lang/Object;

.field private static G:Ljava/lang/Object;

.field static f:Ljava/lang/String;

.field private static l:Lo/dez;

.field private static m:Ljava/lang/Object;

.field private static v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;>;"
        }
    .end annotation
.end field


# instance fields
.field private B:J

.field private C:I

.field private D:Landroid/content/BroadcastReceiver;

.field private E:Landroid/content/BroadcastReceiver;

.field private F:Landroid/content/BroadcastReceiver;

.field private H:I

.field private I:Landroid/content/BroadcastReceiver;

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:J

.field private Q:J

.field private R:J

.field private S:I

.field private T:J

.field private U:Lo/djs$a;

.field private V:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private X:I

.field private Z:I

.field a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field public b:I

.field c:Lo/dfs;

.field d:Ljava/util/concurrent/ExecutorService;

.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dfm;>;"
        }
    .end annotation
.end field

.field g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dft;>;"
        }
    .end annotation
.end field

.field i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dfx;>;"
        }
    .end annotation
.end field

.field private j:Lo/dgf;

.field k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dfq;>;"
        }
    .end annotation
.end field

.field private n:Landroid/content/Context;

.field private o:Lo/dde;

.field private p:Lo/dex;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Lo/dez$b;

.field private u:Z

.field private w:Lo/dqi;

.field private x:Landroid/os/Handler;

.field private y:Landroid/os/HandlerThread;

.field private z:Lo/dfv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 143
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dez;->m:Ljava/lang/Object;

    .line 180
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dez;->v:Ljava/util/Map;

    .line 290
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dez;->A:Ljava/lang/Object;

    .line 556
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dez;->G:Ljava/lang/Object;

    .line 2285
    const-string v0, ""

    sput-object v0, Lo/dez;->f:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 244
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->r:Z

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->q:Z

    .line 161
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dez;->u:Z

    .line 199
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->b:I

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dez;->x:Landroid/os/Handler;

    .line 224
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dez;->y:Landroid/os/HandlerThread;

    .line 237
    const/4 v0, 0x1

    iput v0, p0, Lo/dez;->C:I

    .line 365
    new-instance v0, Lo/dez$2;

    invoke-direct {v0, p0}, Lo/dez$2;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->D:Landroid/content/BroadcastReceiver;

    .line 399
    new-instance v0, Lo/dez$13;

    invoke-direct {v0, p0}, Lo/dez$13;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->F:Landroid/content/BroadcastReceiver;

    .line 419
    new-instance v0, Lo/dez$17;

    invoke-direct {v0, p0}, Lo/dez$17;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->E:Landroid/content/BroadcastReceiver;

    .line 531
    new-instance v0, Lo/dez$22;

    invoke-direct {v0, p0}, Lo/dez$22;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->I:Landroid/content/BroadcastReceiver;

    .line 639
    new-instance v0, Lo/dez$25;

    invoke-direct {v0, p0}, Lo/dez$25;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 748
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dez;->e:Ljava/util/List;

    .line 807
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->H:I

    .line 808
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->N:I

    .line 921
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->L:I

    .line 922
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->M:I

    .line 981
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->K:I

    .line 982
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->J:I

    .line 1013
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dez;->k:Ljava/util/List;

    .line 1110
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->O:I

    .line 1111
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->S:I

    .line 1140
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dez;->i:Ljava/util/List;

    .line 1446
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dez;->Q:J

    .line 1447
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dez;->R:J

    .line 1449
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dez;->P:J

    .line 1450
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dez;->T:J

    .line 2856
    new-instance v0, Lo/dez$19;

    invoke-direct {v0, p0}, Lo/dez$19;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->U:Lo/djs$a;

    .line 2871
    new-instance v0, Lo/dez$18;

    invoke-direct {v0, p0}, Lo/dez$18;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->V:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2881
    new-instance v0, Lo/dez$20;

    invoke-direct {v0, p0}, Lo/dez$20;-><init>(Lo/dez;)V

    iput-object v0, p0, Lo/dez;->W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2909
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->X:I

    .line 2910
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->Z:I

    .line 2949
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dez;->h:Ljava/util/List;

    .line 245
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "HWFitnessMgr Constructor"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iput-object p1, p0, Lo/dez;->n:Landroid/content/Context;

    .line 247
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/dez;->o:Lo/dde;

    .line 248
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 249
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mHWDeviceConfigManager is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 250
    return-void

    .line 253
    :cond_0
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    iget-object v1, p0, Lo/dez;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 255
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    iget-object v1, p0, Lo/dez;->U:Lo/djs$a;

    invoke-virtual {v0, v1}, Lo/dde;->e(Lo/djs;)V

    .line 256
    invoke-static {p1}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/dez;->w:Lo/dqi;

    .line 257
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 258
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    :cond_1
    invoke-static {}, Lo/dex;->a()Lo/dex;

    move-result-object v0

    iput-object v0, p0, Lo/dez;->p:Lo/dex;

    .line 264
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dez;->d:Ljava/util/concurrent/ExecutorService;

    .line 267
    iget-object v0, p0, Lo/dez;->p:Lo/dex;

    invoke-virtual {v0, p0}, Lo/dex;->c(Lo/dez;)V

    .line 269
    new-instance v0, Lo/dgf;

    invoke-direct {v0}, Lo/dgf;-><init>()V

    iput-object v0, p0, Lo/dez;->j:Lo/dgf;

    .line 272
    invoke-direct {p0}, Lo/dez;->t()V

    .line 275
    new-instance v0, Lo/dez$b;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dez$b;-><init>(Lo/dez;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dez;->t:Lo/dez$b;

    .line 277
    iget-object v0, p0, Lo/dez;->F:Landroid/content/BroadcastReceiver;

    const-string v1, "com.huawei.plugin.account.login"

    invoke-virtual {p0, v0, v1}, Lo/dez;->registerBroadcast(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lo/dez;->F:Landroid/content/BroadcastReceiver;

    const-string v1, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-virtual {p0, v0, v1}, Lo/dez;->registerBroadcast(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V

    .line 281
    invoke-direct {p0}, Lo/dez;->m()V

    .line 283
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HWFitnessMgr"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dez;->y:Landroid/os/HandlerThread;

    .line 284
    iget-object v0, p0, Lo/dez;->y:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 285
    new-instance v0, Lo/dez$a;

    iget-object v1, p0, Lo/dez;->y:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dez$a;-><init>(Lo/dez;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dez;->x:Landroid/os/Handler;

    .line 287
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dfv;->b(Landroid/content/Context;)Lo/dfv;

    move-result-object v0

    iput-object v0, p0, Lo/dez;->z:Lo/dfv;

    .line 288
    return-void
.end method

.method private A()V
    .locals 1

    .line 3078
    iget-object v0, p0, Lo/dez;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3079
    return-void
.end method

.method private B()V
    .locals 7

    .line 2128
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDeviceReversDataSync enter "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2130
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 2131
    if-nez v5, :cond_0

    .line 2132
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceReversDataSync deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2133
    return-void

    .line 2136
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2137
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceReversDataSync is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2138
    return-void

    .line 2141
    :cond_1
    invoke-static {p0}, Lo/det;->b(Lo/dez;)Z

    move-result v6

    .line 2142
    invoke-static {v6}, Lo/dfj;->d(Z)V

    .line 2143
    return-void
.end method

.method private D()V
    .locals 6

    .line 2449
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter syncCoreSleepButtonEnable()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2450
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 2451
    if-nez v5, :cond_0

    .line 2452
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncCoreSleepButtonEnable deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2453
    return-void

    .line 2455
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2456
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncCoreSleepButtonEnable is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2457
    return-void

    .line 2459
    :cond_1
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    const-string v1, "core_sleep_button"

    new-instance v2, Lo/dez$7;

    invoke-direct {v2, p0}, Lo/dez$7;-><init>(Lo/dez;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2477
    return-void
.end method

.method static synthetic a(Lo/dez;)Landroid/os/Handler;
    .locals 1

    .line 130
    iget-object v0, p0, Lo/dez;->x:Landroid/os/Handler;

    return-object v0
.end method

.method private a(IJ)V
    .locals 5

    .line 1217
    iget-object v0, p0, Lo/dez;->t:Lo/dez$b;

    if-eqz v0, :cond_0

    .line 1218
    iget-object v0, p0, Lo/dez;->t:Lo/dez$b;

    invoke-virtual {v0, p1, p2, p3}, Lo/dez$b;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 1220
    :cond_0
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "fitnessMgrSendMSGDelay mHWFitnessMgrHandler is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1222
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1288
    sget-object v5, Lo/dez;->m:Ljava/lang/Object;

    monitor-enter v5

    .line 1289
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessTodayDatarun enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1290
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 1291
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 1292
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncFitnessTodayDatarun get device info error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1293
    const v0, 0x493e4

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1294
    monitor-exit v5

    return-void

    .line 1297
    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lo/dez;->s:Z

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1298
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessTodayData data syncing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1299
    const v0, 0x493e2

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1300
    monitor-exit v5

    return-void

    .line 1303
    :cond_2
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 1304
    const/4 v0, 0x4

    const-wide/32 v1, 0x9c40

    invoke-direct {p0, v0, v1, v2}, Lo/dez;->a(IJ)V

    .line 1306
    const/16 v0, 0x2718

    invoke-direct {p0, v0, p1}, Lo/dez;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1307
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessTodayData enter thread"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1308
    invoke-static {}, Lo/dfj;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1309
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    .line 1310
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 8

    .line 1371
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v5

    .line 1372
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleDeviceConnection device Connect state = "

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

    .line 1374
    const/4 v0, 0x2

    if-ne v5, v0, :cond_1

    .line 1375
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleDeviceConnection"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1377
    invoke-static {p1}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1381
    invoke-virtual {p0}, Lo/dez;->c()Lcom/huawei/up/model/UserInfomation;

    move-result-object v6

    .line 1383
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1384
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    new-instance v1, Lo/dez$3;

    invoke-direct {v1, p0}, Lo/dez$3;-><init>(Lo/dez;)V

    invoke-virtual {v0, v1}, Lo/dqi;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1396
    :cond_0
    new-instance v0, Lo/dez$5;

    invoke-direct {v0, p0}, Lo/dez$5;-><init>(Lo/dez;)V

    invoke-virtual {p0, v6, v0}, Lo/dez;->b(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1424
    invoke-virtual {p0}, Lo/dez;->d()V

    .line 1426
    invoke-direct {p0}, Lo/dez;->D()V

    .line 1427
    invoke-virtual {p0}, Lo/dez;->k()V

    .line 1429
    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    if-ne v5, v0, :cond_2

    .line 1431
    invoke-static {}, Lo/dez;->o()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 1432
    :try_start_0
    sget-object v0, Lo/dez;->v:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1433
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 1434
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 1435
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->q:Z

    .line 1436
    iget-boolean v0, p0, Lo/dez;->r:Z

    if-nez v0, :cond_2

    .line 1437
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Data sync bt bt disconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1438
    const v0, 0x493e4

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V

    .line 1439
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_detail_sync_fail"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1440
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1441
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1444
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/dez;IZ)V
    .locals 0

    .line 130
    invoke-direct {p0, p1, p2}, Lo/dez;->c(IZ)V

    return-void
.end method

.method static synthetic a(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 130
    invoke-direct {p0, p1, p2}, Lo/dez;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic a(Lo/dez;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic a(Lo/dez;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->c(Lcom/huawei/up/model/UserInfomation;)V

    return-void
.end method

.method static synthetic a(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->d([B)V

    return-void
.end method

.method private a([B)V
    .locals 7

    .line 856
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procDeviceDataReport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    const/4 v5, 0x0

    .line 860
    :try_start_0
    invoke-static {p1}, Lo/dfi;->h([B)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 863
    goto :goto_0

    .line 861
    :catch_0
    move-exception v6

    .line 862
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 865
    :goto_0
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procDeviceDataReport action ="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 867
    const/4 v0, 0x1

    if-ne v5, v0, :cond_0

    .line 868
    new-instance v0, Lo/dez$24;

    invoke-direct {v0, p0}, Lo/dez$24;-><init>(Lo/dez;)V

    invoke-virtual {p0, v0}, Lo/dez;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_1

    .line 874
    :cond_0
    const/4 v0, 0x2

    if-ne v5, v0, :cond_1

    .line 875
    new-instance v0, Lo/dez$23;

    invoke-direct {v0, p0}, Lo/dez$23;-><init>(Lo/dez;)V

    invoke-virtual {p0, v0}, Lo/dez;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_1

    .line 881
    :cond_1
    const/4 v0, 0x3

    if-ne v5, v0, :cond_2

    .line 882
    new-instance v0, Lo/dez$21;

    invoke-direct {v0, p0}, Lo/dez$21;-><init>(Lo/dez;)V

    invoke-virtual {p0, v0}, Lo/dez;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_1

    .line 889
    :cond_2
    const/4 v0, 0x4

    if-ne v5, v0, :cond_4

    .line 890
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action == DeviceReportThroshold.ACTION_SYNC_CORE_SLEEP_MASK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 892
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 893
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter reverse core sleep data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 894
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    new-instance v1, Lo/dez$1;

    invoke-direct {v1, p0}, Lo/dez$1;-><init>(Lo/dez;)V

    invoke-virtual {v0, v1}, Lo/dca;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 905
    :cond_3
    goto :goto_1

    :cond_4
    const/16 v0, 0x10

    if-ne v5, v0, :cond_5

    .line 906
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action == DeviceReportThroshold.ACTION_SYNC_SLEEP_MASK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->L:I

    .line 908
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->M:I

    .line 909
    invoke-direct {p0}, Lo/dez;->s()V

    goto :goto_1

    .line 911
    :cond_5
    const/16 v0, 0x8

    if-ne v5, v0, :cond_6

    .line 912
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action == DeviceReportThroshold.ACTION_SYNC_WORKOUT_MASK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 913
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 914
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 915
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.7.15 notify to sync workout data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 916
    invoke-direct {p0}, Lo/dez;->j()V

    .line 919
    :cond_6
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/dez;I)I
    .locals 0

    .line 130
    iput p1, p0, Lo/dez;->L:I

    return p1
.end method

.method private b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 312
    invoke-static {}, Lo/dez;->o()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 313
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 314
    :try_start_0
    sget-object v0, Lo/dez;->v:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 315
    if-nez v3, :cond_0

    .line 316
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 317
    sget-object v0, Lo/dez;->v:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 319
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 320
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-virtual {v5, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    monitor-exit v2

    return-void

    .line 323
    :cond_1
    goto :goto_0

    .line 325
    :cond_2
    :goto_1
    :try_start_1
    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    :cond_3
    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6

    .line 328
    :goto_2
    return-void
.end method

.method private b(J)V
    .locals 1

    .line 2070
    invoke-static {p0}, Lo/dey;->e(Lo/cwz;)Lo/dey;

    move-result-object v0

    .line 2071
    invoke-virtual {v0, p1, p2}, Lo/dey;->a(J)V

    .line 2072
    return-void
.end method

.method private b(Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;)V
    .locals 4

    .line 2004
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter heartRateRaiseAlarmaNumberSortByTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2005
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 2006
    invoke-virtual {p1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->getDataList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->getDataList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 2007
    invoke-virtual {p1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->getDataList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 2008
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sort by start time end."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2010
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data list is empty or size is 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2013
    :cond_1
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartRateRaiseAlarmaNumberSortByTime value is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2015
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 14

    .line 1481
    sget-object v5, Lo/dez;->m:Ljava/lang/Object;

    monitor-enter v5

    .line 1482
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncFitnessDetailDataRun enter thread isNeedSyncwork:"

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

    .line 1483
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dgf;->a(I)V

    .line 1484
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 1485
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 1486
    :cond_0
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailDataRun get device info error"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1487
    const v0, 0x493e4

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1488
    monitor-exit v5

    return-void

    .line 1491
    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lo/dez;->s:Z

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1492
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData data syncing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1493
    const v0, 0x493e2

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1494
    const/16 v0, 0x2719

    invoke-direct {p0, v0, p1}, Lo/dez;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1495
    monitor-exit v5

    return-void

    .line 1498
    :cond_2
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 1499
    const-string v0, "syncFitnessDetailDataRun"

    move/from16 v1, p2

    invoke-virtual {p0, v1, v0}, Lo/dez;->a(ZLjava/lang/String;)V

    .line 1501
    const/4 v0, 0x0

    const-wide/32 v1, 0x3a980

    invoke-direct {p0, v0, v1, v2}, Lo/dez;->a(IJ)V

    .line 1502
    const/16 v0, 0x2719

    invoke-direct {p0, v0, p1}, Lo/dez;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1503
    invoke-direct {p0}, Lo/dez;->x()V

    .line 1505
    invoke-direct {p0}, Lo/dez;->w()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dez;->Q:J

    .line 1506
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 1507
    const-wide/16 v0, 0x3e8

    div-long/2addr v7, v0

    .line 1508
    long-to-int v0, v7

    int-to-long v0, v0

    iput-wide v0, p0, Lo/dez;->R:J

    .line 1510
    iget-wide v0, p0, Lo/dez;->R:J

    invoke-direct {p0, v0, v1}, Lo/dez;->c(J)J

    move-result-wide v9

    .line 1512
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0, p0}, Lo/dgf;->c(Lo/dez;)J

    move-result-wide v11

    .line 1513
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v11

    if-nez v0, :cond_3

    .line 1514
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    iget-wide v1, p0, Lo/dez;->Q:J

    invoke-direct {p0, v1, v2}, Lo/dez;->c(J)J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Lo/dgf;->b(Lo/dez;J)V

    .line 1516
    :cond_3
    invoke-virtual {p0}, Lo/dez;->f()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_8

    .line 1517
    iget-wide v0, p0, Lo/dez;->R:J

    iget-wide v2, p0, Lo/dez;->Q:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x93a80

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    iget-wide v0, p0, Lo/dez;->Q:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    .line 1518
    :cond_4
    iget-wide v0, p0, Lo/dez;->R:J

    const-wide/32 v2, 0x93a80

    sub-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo/dez;->c(J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/dez;->Q:J

    .line 1519
    iget-wide v0, p0, Lo/dez;->Q:J

    invoke-virtual {p0, v0, v1}, Lo/dez;->e(J)V

    goto :goto_0

    .line 1520
    :cond_5
    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_6

    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_6

    .line 1522
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1523
    iget-wide v0, p0, Lo/dez;->R:J

    const-wide/16 v2, 0x3d

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dez;->Q:J

    goto :goto_0

    .line 1524
    :cond_6
    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    .line 1526
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct and need writeback. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1527
    iget-wide v0, p0, Lo/dez;->R:J

    const-wide/16 v2, 0x3d

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dez;->Q:J

    .line 1528
    iget-wide v0, p0, Lo/dez;->Q:J

    invoke-virtual {p0, v0, v1}, Lo/dez;->e(J)V

    .line 1530
    :cond_7
    :goto_0
    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    invoke-static {v0, v1, v2, v3}, Lo/dfj;->b(JJ)V

    goto/16 :goto_2

    .line 1532
    :cond_8
    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_9

    .line 1533
    iget-wide v0, p0, Lo/dez;->Q:J

    cmp-long v0, v0, v9

    if-gez v0, :cond_b

    .line 1534
    iput-wide v9, p0, Lo/dez;->Q:J

    goto :goto_1

    .line 1536
    :cond_9
    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_a

    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_a

    .line 1538
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1539
    iget-wide v0, p0, Lo/dez;->R:J

    const-wide/16 v2, 0x3d

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dez;->Q:J

    goto :goto_1

    .line 1540
    :cond_a
    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_b

    .line 1542
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct and need writeback. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1543
    iget-wide v0, p0, Lo/dez;->R:J

    const-wide/16 v2, 0x3d

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dez;->Q:J

    .line 1544
    iget-wide v0, p0, Lo/dez;->Q:J

    invoke-virtual {p0, v0, v1}, Lo/dez;->e(J)V

    .line 1546
    :cond_b
    :goto_1
    iget-wide v0, p0, Lo/dez;->Q:J

    iget-wide v2, p0, Lo/dez;->R:J

    invoke-static {v0, v1, v2, v3}, Lo/dfj;->a(JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1549
    :goto_2
    monitor-exit v5

    goto :goto_3

    :catchall_0
    move-exception v13

    monitor-exit v5

    throw v13

    .line 1550
    :goto_3
    return-void
.end method

.method static synthetic b(Lo/dez;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Lo/dez;->t()V

    return-void
.end method

.method static synthetic b(Lo/dez;IJ)V
    .locals 0

    .line 130
    invoke-direct {p0, p1, p2, p3}, Lo/dez;->a(IJ)V

    return-void
.end method

.method static synthetic b(Lo/dez;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 130
    invoke-direct {p0, p1, p2}, Lo/dez;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic b(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->c([B)V

    return-void
.end method

.method private b(Lo/dfm;)V
    .locals 4

    .line 752
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRealtimeDataFrame enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    iget-object v0, p0, Lo/dez;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 754
    return-void
.end method

.method private b([B)V
    .locals 7

    .line 1017
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetSamplePointFrame"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 1020
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 1021
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrame return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1022
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1023
    return-void

    .line 1025
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->g([B)Lo/dfq;

    move-result-object v5

    .line 1026
    iget-object v0, p0, Lo/dez;->k:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1030
    goto :goto_0

    .line 1028
    :catch_0
    move-exception v5

    .line 1029
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrame Exception :"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    :goto_0
    iget v0, p0, Lo/dez;->J:I

    iget v1, p0, Lo/dez;->K:I

    if-ge v0, v1, :cond_1

    .line 1033
    iget v0, p0, Lo/dez;->J:I

    invoke-static {v0}, Lo/dfj;->d(I)V

    .line 1034
    iget v0, p0, Lo/dez;->J:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dez;->J:I

    goto :goto_2

    .line 1036
    :cond_1
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0}, Lo/dgf;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 1037
    sget-object v5, Lo/dez;->m:Ljava/lang/Object;

    monitor-enter v5

    .line 1038
    :try_start_2
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    iget-wide v1, p0, Lo/dez;->T:J

    invoke-virtual {v0, p0, v1, v2}, Lo/dgf;->b(Lo/dez;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1039
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1041
    :cond_2
    :goto_1
    invoke-direct {p0}, Lo/dez;->q()V

    .line 1043
    :goto_2
    return-void
.end method

.method private b([BI)V
    .locals 6

    .line 2694
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lo/dez;->k(I)V

    .line 2696
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procSetCoreCmdResult Complete cmd="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2699
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_1

    .line 2700
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 2701
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCoreCmdResult return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2702
    if-nez v5, :cond_0

    .line 2703
    const/4 v0, 0x1

    iput v0, p0, Lo/dez;->b:I

    .line 2704
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCoreCmdResult  button state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dez;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2706
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->b:I

    .line 2707
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCoreCmdResult  button state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dez;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 2714
    :cond_1
    :goto_0
    goto :goto_1

    .line 2712
    :catch_0
    move-exception v5

    .line 2713
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2715
    :goto_1
    return-void
.end method

.method private c(J)J
    .locals 11

    .line 1459
    move-wide v4, p1

    .line 1460
    new-instance v6, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1461
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1462
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 1463
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddhhmm"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1465
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 1466
    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-wide v4, v0

    .line 1469
    goto :goto_0

    .line 1467
    :catch_0
    move-exception v10

    .line 1468
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBeginOfDate enter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1471
    :goto_0
    return-wide v4
.end method

.method public static c(Landroid/content/Context;)Lo/dez;
    .locals 6

    .line 293
    sget-object v4, Lo/dez;->A:Ljava/lang/Object;

    monitor-enter v4

    .line 294
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    sget-object v0, Lo/dez;->l:Lo/dez;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 296
    new-instance v0, Lo/dez;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dez;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dez;->l:Lo/dez;

    .line 298
    :cond_0
    sget-object v0, Lo/dez;->l:Lo/dez;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 299
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method static synthetic c(Lo/dez;)Lo/dfv;
    .locals 1

    .line 130
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    return-object v0
.end method

.method private c(I)V
    .locals 8

    .line 465
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveFitnessDate."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v5

    .line 468
    invoke-interface {v5}, Lo/clt;->d()Z

    move-result v6

    .line 469
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveFitnessDate isExistHiHealthService = "

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

    .line 470
    if-eqz v6, :cond_0

    .line 471
    const/4 v0, 0x5

    const-wide/32 v1, 0x1d4c0

    invoke-direct {p0, v0, v1, v2}, Lo/dez;->a(IJ)V

    goto :goto_0

    .line 473
    :cond_0
    const v0, 0x493e1

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V

    .line 474
    return-void

    .line 477
    :goto_0
    invoke-virtual {p0}, Lo/dez;->f()I

    move-result v7

    .line 478
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dez;->r:Z

    .line 480
    invoke-virtual {p0}, Lo/dez;->a()V

    .line 481
    const/4 v0, 0x3

    if-ne v0, v7, :cond_1

    .line 482
    iget-object v0, p0, Lo/dez;->p:Lo/dex;

    iget-object v1, p0, Lo/dez;->k:Ljava/util/List;

    iget-object v2, p0, Lo/dez;->i:Ljava/util/List;

    invoke-virtual {v0, p0, v1, v2, p1}, Lo/dex;->e(Lo/dez;Ljava/util/List;Ljava/util/List;I)V

    .line 483
    iget-object v0, p0, Lo/dez;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 484
    iget-object v0, p0, Lo/dez;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_1

    .line 486
    :cond_1
    iget-object v0, p0, Lo/dez;->p:Lo/dex;

    iget-object v1, p0, Lo/dez;->e:Ljava/util/List;

    invoke-virtual {v0, p0, v1, p1}, Lo/dex;->b(Lo/dez;Ljava/util/List;I)V

    .line 487
    iget-object v0, p0, Lo/dez;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 489
    :goto_1
    return-void
.end method

.method private c(IZ)V
    .locals 8

    .line 564
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncCompleteRun isNeedSyncwork:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 565
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 566
    sget-object v6, Lo/dez;->G:Ljava/lang/Object;

    monitor-enter v6

    .line 567
    const/16 v0, 0x2719

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v0, p1, v1}, Lo/dez;->d(IILjava/lang/Object;)V

    .line 568
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0}, Lo/dgf;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 569
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/dez;->k(I)V

    .line 571
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport()Z

    move-result v0

    if-nez v0, :cond_1

    .line 572
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support highAndMiddleSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    invoke-direct {p0}, Lo/dez;->v()V

    goto :goto_0

    .line 575
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dez;->i(I)V

    .line 577
    :goto_0
    invoke-direct {p0}, Lo/dez;->p()V

    .line 578
    invoke-virtual {p0}, Lo/dez;->g()V

    .line 579
    invoke-direct {p0}, Lo/dez;->j()V

    goto :goto_2

    .line 581
    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport()Z

    move-result v0

    if-nez v0, :cond_4

    .line 582
    :cond_3
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support highAndMiddleSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 584
    :cond_4
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncFitnessDetailStage2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lo/dez;->i(I)V

    .line 587
    :goto_1
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/dez;->k(I)V

    .line 588
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 589
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 591
    :goto_2
    monitor-exit v6

    goto :goto_3

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 592
    :goto_3
    return-void
.end method

.method private c(Lcom/huawei/up/model/UserInfomation;)V
    .locals 4

    .line 1760
    const-string v0, "05"

    const-string v1, "setDeviceUserInfo"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1761
    invoke-static {p1}, Lo/dfj;->b(Lcom/huawei/up/model/UserInfomation;)V

    .line 1762
    invoke-static {p1}, Lo/dgb;->c(Lcom/huawei/up/model/UserInfomation;)V

    .line 1763
    return-void
.end method

.method static synthetic c(Lo/dez;I)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->g(I)V

    return-void
.end method

.method static synthetic c(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic c(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->e([B)V

    return-void
.end method

.method private c(Lo/dfs;)V
    .locals 5

    .line 812
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getRealtimeDataByFrame Enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 814
    invoke-virtual {p1}, Lo/dfs;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/dez;->g:Ljava/util/List;

    .line 815
    invoke-virtual {p1}, Lo/dfs;->a()I

    move-result v0

    iput v0, p0, Lo/dez;->H:I

    .line 816
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->N:I

    .line 818
    iget v0, p0, Lo/dez;->N:I

    iget v1, p0, Lo/dez;->H:I

    if-ge v0, v1, :cond_0

    .line 819
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRealtimeDataByFrame get frame idx = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dez;->g:Ljava/util/List;

    iget v4, p0, Lo/dez;->N:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    iget-object v0, p0, Lo/dez;->g:Ljava/util/List;

    iget v1, p0, Lo/dez;->N:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dez;->h(I)V

    goto :goto_0

    .line 823
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dez;->f(I)V

    .line 825
    :goto_0
    return-void
.end method

.method private c([B)V
    .locals 7

    .line 757
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, " procGetRealTimeCompressedData"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 758
    const/4 v5, 0x0

    .line 760
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 761
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v6

    .line 762
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetTodayFitnessData return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 763
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V

    .line 764
    goto :goto_0

    .line 765
    :cond_0
    invoke-static {p1}, Lo/dfi;->c([B)Lo/dfm;

    move-result-object v5

    .line 766
    invoke-direct {p0, v5}, Lo/dez;->b(Lo/dfm;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 770
    :goto_0
    goto :goto_1

    .line 768
    :catch_0
    move-exception v6

    .line 769
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 772
    :goto_1
    iget v0, p0, Lo/dez;->N:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dez;->N:I

    .line 773
    iget v0, p0, Lo/dez;->N:I

    iget v1, p0, Lo/dez;->H:I

    if-ge v0, v1, :cond_1

    .line 774
    iget-object v0, p0, Lo/dez;->g:Ljava/util/List;

    iget v1, p0, Lo/dez;->N:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dfj;->b(I)V

    goto :goto_2

    .line 776
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dez;->f(I)V

    .line 778
    :goto_2
    return-void
.end method

.method private c([BI)V
    .locals 7

    .line 840
    const v5, 0x31128

    .line 842
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procSetCmdResult Complete cmd="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 844
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 845
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v0

    move v5, v0

    .line 846
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCmdResult return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 850
    :cond_0
    goto :goto_0

    .line 848
    :catch_0
    move-exception v6

    .line 849
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 852
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v5, v0}, Lo/dez;->d(IILjava/lang/Object;)V

    .line 853
    return-void
.end method

.method private d(IILjava/lang/Object;)V
    .locals 10

    .line 331
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procCallback callback cmd="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, " error="

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 332
    invoke-static {}, Lo/dez;->o()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 333
    :try_start_0
    sget-object v0, Lo/dez;->v:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 334
    if-eqz v6, :cond_1

    .line 335
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 336
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 337
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 338
    invoke-interface {v8, p2, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 339
    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 340
    goto :goto_1

    .line 342
    :cond_0
    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 345
    :cond_1
    :goto_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 346
    :goto_2
    return-void
.end method

.method private d(Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;)V
    .locals 14

    .line 2022
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter saveOnData."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->getDataList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->getDataList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2024
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2025
    invoke-virtual {p1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->getDataList()Ljava/util/List;

    move-result-object v7

    .line 2026
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v8

    .line 2028
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 2029
    invoke-static {v8}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2030
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v9

    .line 2031
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.7.30 uuid : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2033
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.7.30 get deviceInfo fail.Save data fail."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2034
    return-void

    .line 2036
    :goto_0
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 2037
    new-instance v11, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v11}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 2038
    new-instance v12, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;

    invoke-direct {v12}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;-><init>()V

    .line 2039
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;

    .line 2040
    invoke-virtual {v13}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->getMinNumber()I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->setMinHeartRate(I)V

    .line 2041
    invoke-virtual {v13}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->getMaxNumber()I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->setMaxHeartRate(I)V

    .line 2042
    const/16 v0, 0x835

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 2043
    invoke-virtual {v13}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->getStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v13}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->getEndTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v11, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 2044
    invoke-static {v12}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 2045
    invoke-virtual {v11, v9}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 2046
    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2036
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 2048
    :cond_1
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "datalist : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2049
    new-instance v10, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 2050
    invoke-virtual {v10, v6}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 2051
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;

    invoke-virtual {v0}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->getEndTime()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long v11, v0, v2

    .line 2052
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dez$6;

    invoke-direct {v1, p0, v11, v12}, Lo/dez$6;-><init>(Lo/dez;J)V

    invoke-virtual {v0, v10, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 2064
    goto :goto_2

    .line 2065
    :cond_2
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no data save on data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2067
    :goto_2
    return-void
.end method

.method static synthetic d(Lo/dez;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Lo/dez;->z()V

    return-void
.end method

.method static synthetic d(Lo/dez;I)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->f(I)V

    return-void
.end method

.method static synthetic d(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->k([B)V

    return-void
.end method

.method static synthetic d(Lo/dez;[BI)V
    .locals 0

    .line 130
    invoke-direct {p0, p1, p2}, Lo/dez;->b([BI)V

    return-void
.end method

.method private d([B)V
    .locals 7

    .line 783
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetRealTimeFrameCount "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 784
    const v5, 0x31128

    .line 787
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 788
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v0

    move v5, v0

    .line 789
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetRealTimeFrameCount return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 790
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 791
    return-void

    .line 793
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->e([B)Lo/dfs;

    move-result-object v0

    iput-object v0, p0, Lo/dez;->c:Lo/dfs;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 797
    goto :goto_0

    .line 795
    :catch_0
    move-exception v6

    .line 796
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 799
    :goto_0
    iget-object v0, p0, Lo/dez;->c:Lo/dfs;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 800
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procGetRealTimeFrameCount realtimeFramePageList is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 801
    iget-object v0, p0, Lo/dez;->c:Lo/dfs;

    invoke-direct {p0, v0}, Lo/dez;->c(Lo/dfs;)V

    goto :goto_1

    .line 803
    :cond_1
    invoke-direct {p0, v5}, Lo/dez;->f(I)V

    .line 805
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/dez;I)I
    .locals 0

    .line 130
    iput p1, p0, Lo/dez;->M:I

    return p1
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 2293
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dez;->f:Ljava/lang/String;

    .line 2295
    sget-object v0, Lo/dez;->f:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2296
    const-string v0, ""

    sput-object v0, Lo/dez;->f:Ljava/lang/String;

    .line 2299
    :cond_0
    sget-object v0, Lo/dez;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/dez;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Lo/dez;->r()V

    return-void
.end method

.method static synthetic e(Lo/dez;J)V
    .locals 0

    .line 130
    invoke-direct {p0, p1, p2}, Lo/dez;->b(J)V

    return-void
.end method

.method static synthetic e(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->f([B)V

    return-void
.end method

.method static synthetic e(Lo/dez;[BI)V
    .locals 0

    .line 130
    invoke-direct {p0, p1, p2}, Lo/dez;->c([BI)V

    return-void
.end method

.method private e([B)V
    .locals 6

    .line 985
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->K:I

    .line 986
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->J:I

    .line 988
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetSamplePointFrameCount"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 990
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 991
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 992
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrameCount return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 993
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 994
    return-void

    .line 996
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->a([B)I

    move-result v0

    iput v0, p0, Lo/dez;->K:I

    .line 997
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrameCount get sample frame count :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dez;->K:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1001
    goto :goto_0

    .line 999
    :catch_0
    move-exception v5

    .line 1000
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    :goto_0
    iget v0, p0, Lo/dez;->K:I

    if-lez v0, :cond_1

    .line 1004
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procGetSamplePointFrameCount get sample frame index :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/dez;->J:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1005
    iget v0, p0, Lo/dez;->J:I

    invoke-static {v0}, Lo/dfj;->d(I)V

    .line 1006
    iget v0, p0, Lo/dez;->J:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dez;->J:I

    goto :goto_1

    .line 1009
    :cond_1
    invoke-direct {p0}, Lo/dez;->q()V

    .line 1011
    :goto_1
    return-void
.end method

.method static synthetic f(Lo/dez;)I
    .locals 1

    .line 130
    iget v0, p0, Lo/dez;->L:I

    return v0
.end method

.method private f(I)V
    .locals 5

    .line 616
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notifyDetailSyncComplete errCode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";currentStage = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v4}, Lo/dgf;->c()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 617
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0}, Lo/dgf;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 618
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dez;->k(I)V

    .line 619
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 620
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/dez;->c(I)V

    goto :goto_0

    .line 622
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 623
    const/16 v0, 0x2719

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lo/dez;->d(IILjava/lang/Object;)V

    .line 626
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0}, Lo/dgf;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 627
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 628
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dez;->c(I)V

    goto :goto_1

    .line 630
    :cond_2
    const-string v0, "notifyDetailSyncComplete"

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/dez;->a(ZLjava/lang/String;)V

    .line 631
    const/16 v0, 0x2719

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lo/dez;->d(IILjava/lang/Object;)V

    .line 632
    invoke-virtual {p0}, Lo/dez;->g()V

    .line 633
    invoke-direct {p0}, Lo/dez;->j()V

    .line 636
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic f(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->g([B)V

    return-void
.end method

.method private f([B)V
    .locals 8

    .line 1182
    const v6, 0x31128

    .line 1184
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetTodayFitnessData Complete"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1186
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/dez;->k(I)V

    .line 1189
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 1190
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v0

    move v6, v0

    .line 1191
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procGetTodayFitnessData return err:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1193
    :cond_0
    invoke-static {p1}, Lo/dfi;->b([B)Lo/dfp;

    move-result-object v5

    .line 1194
    iget-object v0, p0, Lo/dez;->p:Lo/dex;

    invoke-virtual {v0, p0, v5}, Lo/dex;->d(Lo/dez;Lo/dfp;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1195
    const/4 v6, 0x0

    .line 1199
    :goto_0
    goto :goto_1

    .line 1197
    :catch_0
    move-exception v7

    .line 1198
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1201
    :goto_1
    invoke-direct {p0, v6}, Lo/dez;->g(I)V

    .line 1202
    return-void
.end method

.method private g(I)V
    .locals 5

    .line 1174
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "doSyncTodayComplete errCode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1175
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 1176
    const/16 v0, 0x2718

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lo/dez;->d(IILjava/lang/Object;)V

    .line 1177
    invoke-direct {p0}, Lo/dez;->n()V

    .line 1178
    return-void
.end method

.method static synthetic g(Lo/dez;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Lo/dez;->B()V

    return-void
.end method

.method static synthetic g(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->i([B)V

    return-void
.end method

.method private g([B)V
    .locals 7

    .line 1143
    const/4 v5, 0x0

    .line 1145
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetStatusFrame Complete"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1147
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 1148
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 1149
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetStatusFrame return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1150
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1151
    return-void

    .line 1153
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->k([B)Lo/dfx;

    move-result-object v6

    .line 1154
    iget-object v0, p0, Lo/dez;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1159
    goto :goto_0

    .line 1156
    :catch_0
    move-exception v6

    .line 1157
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 1158
    const v5, 0x31128

    .line 1161
    :goto_0
    iget v0, p0, Lo/dez;->S:I

    iget v1, p0, Lo/dez;->O:I

    if-ge v0, v1, :cond_1

    .line 1162
    iget v0, p0, Lo/dez;->S:I

    invoke-static {v0}, Lo/dfj;->e(I)V

    .line 1163
    iget v0, p0, Lo/dez;->S:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dez;->S:I

    goto :goto_1

    .line 1166
    :cond_1
    invoke-direct {p0, v5}, Lo/dez;->f(I)V

    .line 1167
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0}, Lo/dgf;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 1168
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    iget-wide v1, p0, Lo/dez;->P:J

    invoke-virtual {v0, p0, v1, v2}, Lo/dgf;->e(Lo/dez;J)V

    .line 1171
    :cond_2
    :goto_1
    return-void
.end method

.method private h(I)V
    .locals 5

    .line 829
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getHealthDataByFrame "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 831
    invoke-virtual {p0}, Lo/dez;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 832
    invoke-static {p1}, Lo/dfj;->b(I)V

    goto :goto_0

    .line 833
    :cond_0
    invoke-virtual {p0}, Lo/dez;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 834
    invoke-static {p1}, Lo/dfj;->a(I)V

    .line 836
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic h(Lo/dez;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Lo/dez;->y()V

    return-void
.end method

.method static synthetic h(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->h([B)V

    return-void
.end method

.method private h([B)V
    .locals 6

    .line 1114
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->O:I

    .line 1115
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->S:I

    .line 1117
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetStatusFrameCount Complete"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1119
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 1120
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 1121
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetStatusFrameCount return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1122
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1123
    return-void

    .line 1125
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->f([B)I

    move-result v0

    iput v0, p0, Lo/dez;->O:I

    .line 1126
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetStatusFrameCount get status frame count :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dez;->O:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1130
    goto :goto_0

    .line 1128
    :catch_0
    move-exception v5

    .line 1129
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    :goto_0
    iget v0, p0, Lo/dez;->O:I

    if-lez v0, :cond_1

    .line 1133
    iget v0, p0, Lo/dez;->S:I

    invoke-static {v0}, Lo/dfj;->e(I)V

    .line 1134
    iget v0, p0, Lo/dez;->S:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dez;->S:I

    goto :goto_1

    .line 1136
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dez;->f(I)V

    .line 1138
    :goto_1
    return-void
.end method

.method private i(I)V
    .locals 18

    .line 2985
    move/from16 v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 2987
    sget-object v5, Lo/dez;->m:Ljava/lang/Object;

    monitor-enter v5

    .line 2988
    const/4 v0, 0x1

    move-object/from16 v1, p0

    :try_start_0
    iput v0, v1, Lo/dez;->C:I

    .line 2989
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dez;->j:Lo/dgf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dgf;->a(I)V

    .line 2990
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 2991
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 2992
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dez;->V:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x493e4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2993
    monitor-exit v5

    return-void

    .line 2996
    :cond_1
    move-object/from16 v0, p0

    :try_start_1
    iget-boolean v0, v0, Lo/dez;->q:Z

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 2997
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData data syncing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2998
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dez;->V:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x493e2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2999
    monitor-exit v5

    return-void

    .line 3002
    :cond_2
    const/4 v0, 0x1

    move-object/from16 v1, p0

    :try_start_2
    iput-boolean v0, v1, Lo/dez;->q:Z

    .line 3003
    move-object/from16 v0, p0

    const/4 v1, 0x0

    const-wide/32 v2, 0x3a980

    invoke-direct {v0, v1, v2, v3}, Lo/dez;->a(IJ)V

    .line 3004
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dez;->V:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-object/from16 v1, p0

    const/16 v2, 0x2719

    invoke-direct {v1, v2, v0}, Lo/dez;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3005
    invoke-direct/range {p0 .. p0}, Lo/dez;->A()V

    .line 3007
    invoke-static/range {p0 .. p0}, Lo/det;->a(Lo/dez;)J

    move-result-wide v7

    .line 3008
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 3009
    const-wide/16 v0, 0x3e8

    div-long/2addr v9, v0

    .line 3010
    long-to-int v11, v9

    .line 3012
    int-to-long v0, v11

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lo/dez;->c(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3840

    sub-long v12, v0, v2

    .line 3014
    invoke-static/range {p0 .. p0}, Lo/det;->c(Lo/dez;)J

    move-result-wide v14

    .line 3015
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v14

    if-nez v0, :cond_3

    .line 3016
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8}, Lo/dez;->c(J)J

    move-result-wide v0

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lo/det;->e(Lo/dez;J)V

    .line 3019
    :cond_3
    int-to-long v0, v11

    cmp-long v0, v7, v0

    if-gez v0, :cond_4

    .line 3020
    cmp-long v0, v7, v12

    if-gez v0, :cond_6

    .line 3021
    move-wide v7, v12

    goto :goto_0

    .line 3023
    :cond_4
    int-to-long v0, v11

    cmp-long v0, v7, v0

    if-ltz v0, :cond_5

    int-to-long v0, v11

    sub-long v0, v7, v0

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_5

    .line 3025
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3026
    add-int/lit8 v0, v11, -0x3d

    int-to-long v7, v0

    goto :goto_0

    .line 3027
    :cond_5
    int-to-long v0, v11

    sub-long v0, v7, v0

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 3029
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct and need writeback. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3030
    add-int/lit8 v0, v11, -0x3d

    int-to-long v7, v0

    .line 3031
    move-object/from16 v0, p0

    invoke-static {v0, v7, v8}, Lo/det;->b(Lo/dez;J)V

    .line 3033
    :cond_6
    :goto_0
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncIntensiveData1 enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3034
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mIntensiveStartTime2:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "=mIntensiveEndTime"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3035
    int-to-long v0, v11

    const/4 v2, 0x0

    invoke-static {v7, v8, v0, v1, v2}, Lo/dfj;->b(JJI)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 3036
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v16

    monitor-exit v5

    throw v16

    :goto_1
    goto/16 :goto_2

    .line 3039
    :cond_7
    sget-object v5, Lo/dez;->m:Ljava/lang/Object;

    monitor-enter v5

    .line 3041
    const/4 v0, 0x7

    move-object/from16 v1, p0

    :try_start_3
    iput v0, v1, Lo/dez;->C:I

    .line 3042
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dez;->j:Lo/dgf;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dgf;->a(I)V

    .line 3044
    invoke-static/range {p0 .. p0}, Lo/det;->c(Lo/dez;)J

    move-result-wide v6

    .line 3045
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 3046
    const-wide/16 v0, 0x3e8

    div-long/2addr v8, v0

    .line 3047
    long-to-int v0, v8

    int-to-long v10, v0

    .line 3048
    move-wide v12, v10

    .line 3056
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v11}, Lo/dez;->c(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3840

    sub-long/2addr v0, v2

    cmp-long v0, v6, v0

    if-lez v0, :cond_8

    .line 3057
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "status stage 2 already ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3059
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/dez;->q:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 3061
    monitor-exit v5

    return-void

    .line 3064
    :cond_8
    sub-long v0, v12, v6

    const-wide/32 v2, 0x93a80

    cmp-long v0, v0, v2

    if-lez v0, :cond_9

    .line 3065
    const-wide/32 v0, 0x93a80

    sub-long v0, v12, v0

    move-object/from16 v2, p0

    :try_start_4
    invoke-direct {v2, v0, v1}, Lo/dez;->c(J)J

    move-result-wide v6

    .line 3068
    :cond_9
    move-object/from16 v0, p0

    iput-wide v12, v0, Lo/dez;->T:J

    .line 3069
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncIntensiveData2 enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3070
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "lastStatusTime:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "=endTime"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3071
    const/4 v0, 0x0

    invoke-static {v6, v7, v12, v13, v0}, Lo/dfj;->b(JJI)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 3072
    monitor-exit v5

    goto :goto_2

    :catchall_1
    move-exception v17

    monitor-exit v5

    throw v17

    .line 3074
    :goto_2
    return-void
.end method

.method static synthetic i(Lo/dez;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Lo/dez;->D()V

    return-void
.end method

.method static synthetic i(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->a([B)V

    return-void
.end method

.method private i([B)V
    .locals 8

    .line 1880
    const v5, 0x31128

    .line 1882
    const/4 v6, 0x0

    .line 1883
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetUserInfoData Complete cmd=21"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1885
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 1886
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v0

    move v5, v0

    .line 1887
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCmdResult return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1889
    :cond_0
    const/4 v5, 0x0

    .line 1891
    invoke-static {p1}, Lo/dfi;->i([B)Lcom/huawei/datatype/FitnessUserInfo;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1895
    :goto_0
    goto :goto_1

    .line 1893
    :catch_0
    move-exception v7

    .line 1894
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1897
    :goto_1
    const/16 v0, 0x15

    invoke-direct {p0, v0, v5, v6}, Lo/dez;->d(IILjava/lang/Object;)V

    .line 1898
    return-void
.end method

.method private j()V
    .locals 6

    .line 2850
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sending broadcast to sync workout data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2851
    sget-object v4, Lo/dez;->m:Ljava/lang/Object;

    monitor-enter v4

    .line 2852
    :try_start_0
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    iget-object v1, p0, Lo/dez;->U:Lo/djs$a;

    iget-object v2, p0, Lo/dez;->V:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dde;->e(Lo/djs;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2853
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 2854
    :goto_0
    return-void
.end method

.method static synthetic k(Lo/dez;)Landroid/content/Context;
    .locals 1

    .line 130
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    return-object v0
.end method

.method private k(I)V
    .locals 5

    .line 1225
    iget-object v0, p0, Lo/dez;->t:Lo/dez$b;

    if-eqz v0, :cond_0

    .line 1226
    iget-object v0, p0, Lo/dez;->t:Lo/dez$b;

    invoke-virtual {v0, p1}, Lo/dez$b;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1227
    iget-object v0, p0, Lo/dez;->t:Lo/dez$b;

    invoke-virtual {v0, p1}, Lo/dez$b;->removeMessages(I)V

    goto :goto_0

    .line 1230
    :cond_0
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "fitnessMgrRemoveMSG mHWFitnessMgrHandler is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1232
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic k(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->b([B)V

    return-void
.end method

.method private k([B)V
    .locals 5

    .line 1284
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetActivityReminder do not porcess"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1285
    return-void
.end method

.method static synthetic l(Lo/dez;)I
    .locals 1

    .line 130
    iget v0, p0, Lo/dez;->M:I

    return v0
.end method

.method static synthetic l(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->m([B)V

    return-void
.end method

.method private m()V
    .locals 9

    .line 349
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 350
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/dez;->D:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 352
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.DEVICE_LIST_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 353
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/dez;->D:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 355
    new-instance v6, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.hihealth.action_user_goal_change"

    invoke-direct {v6, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 356
    const-string v0, "com.huawei.hihealth.action_receive_push"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 357
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v7

    .line 358
    if-eqz v7, :cond_0

    .line 359
    iget-object v0, p0, Lo/dez;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {v7, v0, v6}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 361
    :cond_0
    new-instance v8, Landroid/content/IntentFilter;

    const-string v0, "action_change_core_sleep_button"

    invoke-direct {v8, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 362
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/dez;->E:Landroid/content/BroadcastReceiver;

    invoke-static {v0, v1, v8}, Lo/dbg;->c(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 363
    return-void
.end method

.method static synthetic m(Lo/dez;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Lo/dez;->s()V

    return-void
.end method

.method private m([B)V
    .locals 6

    .line 2917
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx procGetDesFrameCount enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2918
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->X:I

    .line 2919
    const/4 v0, 0x0

    iput v0, p0, Lo/dez;->Z:I

    .line 2921
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetDesFrameCount"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2923
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 2924
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 2925
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetDesFrameCount return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2927
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2928
    return-void

    .line 2930
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->l([B)I

    move-result v0

    iput v0, p0, Lo/dez;->X:I

    .line 2931
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetDesFrameCount get sample frame count :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dez;->X:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 2935
    goto :goto_0

    .line 2933
    :catch_0
    move-exception v5

    .line 2934
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2937
    :goto_0
    iget v0, p0, Lo/dez;->X:I

    if-lez v0, :cond_1

    .line 2938
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ywx desFrameCount > 0 : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dez;->X:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2939
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procGetDesFrameCount get sample frame index :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/dez;->J:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2940
    iget v0, p0, Lo/dez;->Z:I

    invoke-static {v0}, Lo/dfj;->l(I)V

    .line 2941
    iget v0, p0, Lo/dez;->Z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dez;->Z:I

    goto :goto_1

    .line 2943
    :cond_1
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ywx : desFrameCount <= 0 : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dez;->X:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2945
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dez;->b(I)V

    .line 2947
    :goto_1
    return-void
.end method

.method static synthetic n(Lo/dez;)I
    .locals 2

    .line 130
    iget v0, p0, Lo/dez;->M:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/dez;->M:I

    return v0
.end method

.method private n()V
    .locals 7

    .line 450
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendTodaySyncSuccBroadcast."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 451
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 452
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 453
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 455
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_summary_sync_success"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 456
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 457
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 458
    return-void
.end method

.method static synthetic n(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->n([B)V

    return-void
.end method

.method private n([B)V
    .locals 5

    .line 2958
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 2959
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v4

    .line 2961
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dez;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2962
    return-void

    .line 2964
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->m([B)Lo/dft;

    move-result-object v4

    .line 2965
    iget-object v0, p0, Lo/dez;->h:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 2969
    goto :goto_0

    .line 2967
    :catch_0
    move-exception v4

    .line 2968
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetDesFrame Exception :"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2971
    :goto_0
    iget v0, p0, Lo/dez;->Z:I

    iget v1, p0, Lo/dez;->X:I

    if-ge v0, v1, :cond_1

    .line 2972
    iget v0, p0, Lo/dez;->Z:I

    invoke-static {v0}, Lo/dfj;->l(I)V

    .line 2973
    iget v0, p0, Lo/dez;->Z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dez;->Z:I

    goto :goto_1

    .line 2976
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dez;->r:Z

    .line 2977
    iget-object v0, p0, Lo/dez;->p:Lo/dex;

    iget-object v1, p0, Lo/dez;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/dex;->e(Ljava/util/List;)V

    .line 2979
    :goto_1
    return-void
.end method

.method static synthetic o(Lo/dez;)I
    .locals 2

    .line 130
    iget v0, p0, Lo/dez;->L:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/dez;->L:I

    return v0
.end method

.method private static declared-synchronized o()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dez;

    monitor-enter v1

    .line 308
    :try_start_0
    sget-object v0, Lo/dez;->v:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private o([B)V
    .locals 24

    .line 1909
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter procHeartRateRemindAlarm"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1910
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 1911
    const/4 v5, 0x4

    .line 1912
    const/4 v6, 0x5

    .line 1913
    const/4 v7, 0x6

    .line 1914
    const/4 v8, 0x7

    .line 1915
    const/16 v9, 0x8

    .line 1916
    new-instance v10, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;

    invoke-direct {v10}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;-><init>()V

    .line 1917
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_8

    .line 1918
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 1920
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v11

    .line 1921
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 1922
    iget-object v13, v11, Lo/dba;->b:Ljava/util/List;

    .line 1924
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1925
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/daw;

    .line 1926
    invoke-virtual {v15}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 1928
    :sswitch_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.7.30 get error code."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1929
    .line 1933
    :goto_1
    goto :goto_0

    .line 1936
    :cond_0
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1937
    invoke-virtual {v10, v14}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->setDataList(Ljava/util/List;)V

    .line 1938
    const/4 v0, 0x0

    if-eq v0, v13, :cond_7

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 1939
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.7.30 tlvFatherList.size() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1940
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/dba;

    .line 1941
    move-object/from16 v0, v16

    iget-object v0, v0, Lo/dba;->b:Ljava/util/List;

    move-object/from16 v17, v0

    .line 1942
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_5

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1943
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.7.30 childTLVFatherList.size() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1944
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_3
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lo/dba;

    .line 1945
    move-object/from16 v0, v19

    iget-object v0, v0, Lo/dba;->e:Ljava/util/List;

    move-object/from16 v20, v0

    .line 1946
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_3

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1948
    new-instance v21, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;

    invoke-direct/range {v21 .. v21}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;-><init>()V

    .line 1949
    const/4 v0, 0x0

    move-object/from16 v1, v21

    if-eq v0, v1, :cond_2

    .line 1950
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_4
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lo/daw;

    .line 1951
    invoke-virtual/range {v23 .. v23}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_5

    .line 1953
    :pswitch_0
    invoke-virtual/range {v23 .. v23}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->setStartTime(J)V

    .line 1954
    goto :goto_6

    .line 1956
    :pswitch_1
    invoke-virtual/range {v23 .. v23}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->setEndTime(J)V

    .line 1957
    goto :goto_6

    .line 1959
    :pswitch_2
    invoke-virtual/range {v23 .. v23}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->setMinNumber(I)V

    .line 1960
    goto :goto_6

    .line 1962
    :pswitch_3
    invoke-virtual/range {v23 .. v23}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm$Entity;->setMaxNumber(I)V

    .line 1963
    goto :goto_6

    .line 1965
    :goto_5
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive wrong info.This entity is error."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1966
    goto/16 :goto_3

    .line 1968
    :goto_6
    goto/16 :goto_4

    .line 1970
    :cond_1
    move-object/from16 v0, v21

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1972
    :cond_2
    goto :goto_7

    .line 1973
    :cond_3
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "childTlv is null or size is zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1975
    :goto_7
    goto/16 :goto_3

    :cond_4
    goto :goto_8

    .line 1977
    :cond_5
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "childTLVFatherList is null or size is zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1979
    :goto_8
    goto/16 :goto_2

    :cond_6
    goto :goto_9

    .line 1981
    :cond_7
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tlvFatherList is null or size is zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1983
    :goto_9
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.7.30 parse end : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 1986
    goto :goto_a

    .line 1984
    :catch_0
    move-exception v11

    .line 1985
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1986
    goto :goto_a

    .line 1989
    :cond_8
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.7.30 get wrong cmd."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1991
    :goto_a
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lo/dez;->b(Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;)V

    .line 1993
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lo/dez;->d(Lcom/huawei/datatype/HeartRateRaiseRemindAlarm;)V

    .line 1996
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dez;->o:Lo/dde;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dez;->U:Lo/djs$a;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/dez;->W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dde;->e(Lo/djs;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1997
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private p()V
    .locals 6

    .line 441
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendDetailSyncSuccBroadcast."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 444
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_detail_sync_success"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 445
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 446
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 447
    return-void
.end method

.method static synthetic p(Lo/dez;[B)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lo/dez;->o([B)V

    return-void
.end method

.method private q()V
    .locals 13

    .line 1046
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncStatusPoint current stage is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v4}, Lo/dgf;->c()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0}, Lo/dgf;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1048
    invoke-direct {p0}, Lo/dez;->u()V

    .line 1049
    return-void

    .line 1052
    :cond_0
    invoke-static {p0}, Lo/det;->e(Lo/dez;)J

    move-result-wide v5

    .line 1053
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v7, v0, v2

    .line 1054
    const-string v0, "05"

    const-string v1, "syncStatusPoint"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1056
    invoke-direct {p0, v7, v8}, Lo/dez;->c(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3840

    sub-long v9, v0, v2

    .line 1058
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0, p0}, Lo/dgf;->a(Lo/dez;)J

    move-result-wide v11

    .line 1059
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v11

    if-nez v0, :cond_1

    .line 1060
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-direct {p0, v5, v6}, Lo/dez;->c(J)J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Lo/dgf;->e(Lo/dez;J)V

    .line 1062
    :cond_1
    cmp-long v0, v5, v7

    if-gez v0, :cond_2

    .line 1063
    cmp-long v0, v5, v9

    if-gez v0, :cond_4

    .line 1064
    move-wide v5, v9

    goto :goto_0

    .line 1066
    :cond_2
    cmp-long v0, v5, v7

    if-ltz v0, :cond_3

    sub-long v0, v5, v7

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    .line 1068
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStatusPoint lastStatusTime is not correct. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1069
    const-wide/16 v0, 0x3d

    sub-long v5, v7, v0

    goto :goto_0

    .line 1070
    :cond_3
    sub-long v0, v5, v7

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 1072
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStatusPoint lastStatusTime is not correct and need writeback. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1073
    const-wide/16 v0, 0x3d

    sub-long v5, v7, v0

    .line 1074
    invoke-static {p0, v5, v6}, Lo/det;->c(Lo/dez;J)V

    .line 1076
    :cond_4
    :goto_0
    invoke-static {v5, v6, v7, v8}, Lo/dfj;->c(JJ)V

    .line 1077
    return-void
.end method

.method private r()V
    .locals 0

    .line 979
    return-void
.end method

.method private s()V
    .locals 4

    .line 925
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    .line 926
    if-eqz v3, :cond_0

    .line 929
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dez$4;

    invoke-direct {v2, p0}, Lo/dez$4;-><init>(Lo/dez;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 975
    :cond_0
    return-void
.end method

.method private t()V
    .locals 5

    .line 1344
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleUserLogin enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1345
    iget-object v0, p0, Lo/dez;->p:Lo/dex;

    invoke-virtual {v0, p0}, Lo/dex;->e(Lo/dez;)V

    .line 1348
    return-void
.end method

.method private u()V
    .locals 12

    .line 1081
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dgf;->a(I)V

    .line 1083
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0, p0}, Lo/dgf;->a(Lo/dez;)J

    move-result-wide v4

    .line 1084
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 1085
    const-wide/16 v0, 0x3e8

    div-long/2addr v6, v0

    .line 1086
    long-to-int v0, v6

    int-to-long v8, v0

    .line 1088
    move-wide v10, v8

    .line 1095
    invoke-direct {p0, v8, v9}, Lo/dez;->c(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3840

    sub-long/2addr v0, v2

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 1096
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "status stage 2 already ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1098
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->s:Z

    .line 1099
    return-void

    .line 1102
    :cond_0
    sub-long v0, v10, v4

    const-wide/32 v2, 0x93a80

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 1103
    const-wide/32 v0, 0x93a80

    sub-long v0, v10, v0

    invoke-direct {p0, v0, v1}, Lo/dez;->c(J)J

    move-result-wide v4

    .line 1106
    :cond_1
    iput-wide v10, p0, Lo/dez;->P:J

    .line 1107
    invoke-static {v4, v5, v10, v11}, Lo/dfj;->c(JJ)V

    .line 1108
    return-void
.end method

.method private v()V
    .locals 14

    .line 1557
    sget-object v4, Lo/dez;->m:Ljava/lang/Object;

    monitor-enter v4

    .line 1558
    :try_start_0
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dgf;->a(I)V

    .line 1559
    invoke-virtual {p0}, Lo/dez;->f()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 1560
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not separated data, done"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1561
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1562
    monitor-exit v4

    return-void

    .line 1565
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/dez;->j:Lo/dgf;

    invoke-virtual {v0, p0}, Lo/dgf;->c(Lo/dez;)J

    move-result-wide v5

    .line 1566
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 1567
    const-wide/16 v0, 0x3e8

    div-long/2addr v7, v0

    .line 1568
    long-to-int v0, v7

    int-to-long v9, v0

    .line 1570
    move-wide v11, v9

    .line 1577
    invoke-direct {p0, v9, v10}, Lo/dez;->c(J)J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-ltz v0, :cond_1

    .line 1579
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync sample stage 2 already ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1580
    invoke-direct {p0}, Lo/dez;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1581
    monitor-exit v4

    return-void

    .line 1584
    :cond_1
    sub-long v0, v11, v5

    const-wide/32 v2, 0x93a80

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 1585
    const-wide/32 v0, 0x93a80

    sub-long v0, v11, v0

    :try_start_2
    invoke-direct {p0, v0, v1}, Lo/dez;->c(J)J

    move-result-wide v5

    .line 1588
    :cond_2
    iput-wide v11, p0, Lo/dez;->T:J

    .line 1594
    invoke-static {v5, v6, v11, v12}, Lo/dfj;->a(JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1595
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v13

    monitor-exit v4

    throw v13

    .line 1596
    :goto_0
    return-void
.end method

.method private w()J
    .locals 6

    .line 1683
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getLastSyncTime enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1684
    new-instance v5, Lo/dev;

    invoke-direct {v5}, Lo/dev;-><init>()V

    .line 1685
    invoke-virtual {v5, p0}, Lo/dev;->e(Lo/dez;)J

    move-result-wide v0

    return-wide v0
.end method

.method private x()V
    .locals 1

    .line 1475
    iget-object v0, p0, Lo/dez;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1476
    iget-object v0, p0, Lo/dez;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1477
    iget-object v0, p0, Lo/dez;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1478
    return-void
.end method

.method private y()V
    .locals 7

    .line 1766
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDefaultDeviceReportThroshold."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1768
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 1769
    if-nez v5, :cond_0

    .line 1770
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDefaultDeviceReportThroshold deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1771
    return-void

    .line 1774
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1775
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDefaultDeviceReportThroshold is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1776
    return-void

    .line 1779
    :cond_1
    invoke-static {}, Lo/dfr;->b()Ljava/util/List;

    move-result-object v6

    .line 1780
    invoke-static {v6}, Lo/dfj;->c(Ljava/util/List;)V

    .line 1781
    return-void
.end method

.method private z()V
    .locals 6

    .line 1351
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleUserInfoChange enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1352
    invoke-virtual {p0}, Lo/dez;->c()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 1353
    invoke-direct {p0, v5}, Lo/dez;->c(Lcom/huawei/up/model/UserInfomation;)V

    .line 1354
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1357
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "hwfitnessmgr registerDeviceToHiHealth"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1358
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1359
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 1360
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1361
    invoke-static {v5}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 1363
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwfitnessmgr registerDeviceToHiHealth deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1365
    :goto_0
    goto :goto_1

    .line 1366
    :cond_1
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwfitnessmgr registerDeviceToHiHealth enter mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1368
    :goto_1
    return-void
.end method

.method public a(I)V
    .locals 5

    .line 551
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procDetailSyncComplete errCode="

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

    .line 552
    iget-object v0, p0, Lo/dez;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dez$g;

    invoke-virtual {p0}, Lo/dez;->h()Z

    move-result v2

    invoke-direct {v1, p0, p1, v2}, Lo/dez$g;-><init>(Lo/dez;IZ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 553
    const-string v0, "procDetailSyncComplete"

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/dez;->a(ZLjava/lang/String;)V

    .line 554
    return-void
.end method

.method public a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 2670
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveHeartRateButton enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2671
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lo/det;->a(Landroid/content/Context;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2672
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 2

    .line 2412
    iget-object v0, p0, Lo/dez;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dez$d;

    invoke-direct {v1, p0, p1, p2}, Lo/dez$d;-><init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 2413
    return-void
.end method

.method public a(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 2152
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lo/dez;->b(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 2153
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2154
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/dfv;->a(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 2156
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 5

    .line 2494
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWFitnessMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " enter changeHeartRateBtValue = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2496
    if-eqz p1, :cond_0

    .line 2500
    const/4 v4, 0x1

    goto :goto_0

    .line 2503
    :cond_0
    const/4 v4, 0x0

    .line 2506
    :goto_0
    new-instance v0, Lo/dez$10;

    invoke-direct {v0, p0}, Lo/dez$10;-><init>(Lo/dez;)V

    invoke-virtual {p0, v4, v0}, Lo/dez;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2518
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave changeHeartRateBtValue "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2519
    return-void
.end method

.method public a(ZLjava/lang/String;)V
    .locals 4

    .line 2896
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter setNeedWorkout :needWorkout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isFrom:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2897
    iput-boolean p1, p0, Lo/dez;->u:Z

    .line 2898
    return-void
.end method

.method public b()I
    .locals 4

    .line 2274
    const/4 v2, -0x1

    .line 2275
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2276
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    .line 2277
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 2278
    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v2

    .line 2282
    :cond_0
    return v2
.end method

.method public b(I)V
    .locals 5

    .line 3082
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procIntensiveSyncComplete errCode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "  intensiveFlag"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/dez;->C:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3083
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dez;->q:Z

    .line 3085
    iget v0, p0, Lo/dez;->C:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3086
    invoke-direct {p0}, Lo/dez;->v()V

    .line 3088
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 1319
    iget-object v0, p0, Lo/dez;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dez$h;

    invoke-direct {v1, p0, p1}, Lo/dez$h;-><init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1320
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1321
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dfv;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1323
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 4

    .line 2166
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWFitnessMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " setActivityReminder enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2168
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveActivityReminder enable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2173
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2174
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    invoke-virtual {v0, p1}, Lo/dqi;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V

    .line 2177
    :cond_0
    if-eqz p3, :cond_1

    .line 2178
    const/4 v0, 0x7

    invoke-direct {p0, v0, p2}, Lo/dez;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2180
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2182
    :goto_0
    invoke-static {p1}, Lo/dfj;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V

    .line 2184
    return-void
.end method

.method public b(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1863
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 1864
    if-nez v5, :cond_0

    .line 1865
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUserInfo deviceCapability is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1866
    return-void

    .line 1868
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1869
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUserInfo support get user info"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1870
    const/16 v0, 0x15

    invoke-direct {p0, v0, p2}, Lo/dez;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1871
    invoke-static {}, Lo/dfj;->d()V

    goto :goto_0

    .line 1873
    :cond_1
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUserInfo not support get user info"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1874
    invoke-direct {p0, p1}, Lo/dez;->c(Lcom/huawei/up/model/UserInfomation;)V

    .line 1876
    :goto_0
    return-void
.end method

.method public c()Lcom/huawei/up/model/UserInfomation;
    .locals 7

    .line 2304
    const/4 v5, 0x0

    .line 2306
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v6

    .line 2307
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 2308
    invoke-virtual {v6}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 2309
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getLocalUserinfo return  userInfomation"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2311
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwUserProfileMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2315
    :goto_0
    if-nez v5, :cond_1

    .line 2316
    new-instance v5, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v5}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 2319
    :cond_1
    return-object v5
.end method

.method public c(IIZ)V
    .locals 6

    .line 2569
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter heartRateRaiseRemind enable = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "number : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2570
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v4

    .line 2571
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2572
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2574
    :cond_0
    const/4 v5, 0x0

    .line 2575
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    if-nez p3, :cond_1

    .line 2576
    invoke-static {p1, p2}, Lo/dfj;->e(II)V

    goto :goto_0

    .line 2578
    :cond_1
    new-instance v0, Lo/dez$11;

    invoke-direct {v0, p0, p1, p2}, Lo/dez$11;-><init>(Lo/dez;II)V

    invoke-virtual {v4, p2, v0}, Lo/dqi;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2589
    :goto_0
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 2221
    iget-object v0, p0, Lo/dez;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dez$f;

    invoke-direct {v1, p0, p1}, Lo/dez$f;-><init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 2222
    return-void
.end method

.method public c(Z)V
    .locals 6

    .line 2718
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter changeCoreSleepBtValue = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2720
    if-eqz p1, :cond_0

    .line 2721
    const/4 v5, 0x1

    goto :goto_0

    .line 2723
    :cond_0
    const/4 v5, 0x0

    .line 2725
    :goto_0
    new-instance v0, Lo/dez$12;

    invoke-direct {v0, p0}, Lo/dez$12;-><init>(Lo/dez;)V

    invoke-virtual {p0, v5, v0}, Lo/dez;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2735
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave changeCoreSleepBtValue "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2736
    return-void
.end method

.method public d()V
    .locals 5

    .line 492
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDeviceFitnessGoal enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 493
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 494
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;-><init>()V

    new-instance v2, Lo/dez$16;

    invoke-direct {v2, p0}, Lo/dez$16;-><init>(Lo/dez;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 501
    :cond_0
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 502
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 503
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    invoke-virtual {v0}, Lo/dfv;->c()V

    .line 506
    :cond_1
    return-void
.end method

.method public d(I)V
    .locals 5

    .line 2545
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter changeContinueMeasureHeartRateStatus status = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2546
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v4

    .line 2547
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2548
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2550
    :cond_0
    new-instance v0, Lo/dez$15;

    invoke-direct {v0, p0, p1}, Lo/dez$15;-><init>(Lo/dez;I)V

    invoke-virtual {v4, p1, v0}, Lo/dqi;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2561
    :goto_0
    return-void
.end method

.method public d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 2480
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveCoreSleepButton enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2481
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lo/det;->d(Landroid/content/Context;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2482
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 2905
    iput-wide p1, p0, Lo/dez;->B:J

    .line 2906
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1621
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1623
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_detail_sync_fail"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1624
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1625
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1626
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData has no device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1627
    return-void

    .line 1628
    :cond_0
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v1}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1630
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_detail_sync_fail"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1631
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1632
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1633
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData device is OTAing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1634
    return-void

    .line 1635
    :cond_1
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v1}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1637
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_detail_sync_fail"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1638
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1639
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1640
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData AW70 is OTAing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1641
    return-void

    .line 1643
    :cond_2
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1644
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dez;->d(J)V

    .line 1645
    new-instance v0, Lo/dez$8;

    invoke-direct {v0, p0, p1}, Lo/dez$8;-><init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, v0}, Lo/dez;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1652
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1653
    iget-object v0, p0, Lo/dez;->z:Lo/dfv;

    invoke-virtual {v0, p1}, Lo/dfv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1655
    :cond_3
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 2525
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWFitnessMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " enter changeIntelligentHomeBtValue = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2527
    new-instance v0, Lo/dez$9;

    invoke-direct {v0, p0}, Lo/dez$9;-><init>(Lo/dez;)V

    invoke-virtual {p0, p1, p2, v0}, Lo/dez;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2536
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave changeIntelligentHomeBtValue "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2537
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 2678
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveIntelligentHomeButton enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2679
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lo/det;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2680
    return-void
.end method

.method public e(I)V
    .locals 5

    .line 546
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "doDetailSyncComplete errCode="

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

    .line 547
    invoke-virtual {p0, p1}, Lo/dez;->a(I)V

    .line 548
    return-void
.end method

.method public e(J)V
    .locals 7

    .line 1692
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setLastSyncTime time="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1693
    new-instance v5, Lo/dev;

    invoke-direct {v5}, Lo/dev;-><init>()V

    .line 1694
    new-instance v6, Lo/dfa;

    invoke-direct {v6}, Lo/dfa;-><init>()V

    .line 1695
    invoke-virtual {v6, p1, p2}, Lo/dfa;->a(J)V

    .line 1696
    invoke-virtual {v5, p0, v6}, Lo/dev;->c(Lo/dez;Lo/dfa;)V

    .line 1697
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 2188
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityReminderRun enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2191
    new-instance v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;-><init>()V

    .line 2192
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2193
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    invoke-virtual {v0}, Lo/dqi;->b()Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    move-result-object v4

    .line 2195
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivityReminder enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->isEnabled()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; start = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 2196
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->getStartTime()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; cycle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->getCycle()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 2195
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2197
    const/4 v0, 0x0

    invoke-interface {p1, v0, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2199
    return-void
.end method

.method public f()I
    .locals 6

    .line 2323
    const/4 v4, -0x1

    .line 2325
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 2326
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 2327
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getFitness_frame_type()I

    move-result v4

    goto :goto_0

    .line 2329
    :cond_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceDataType deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2332
    :goto_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceDataType type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2334
    return v4
.end method

.method public g()V
    .locals 10

    .line 2595
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getHeartRateRaiseAlarm"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2596
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 2597
    if-nez v4, :cond_0

    .line 2598
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateRaiseAlarm deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2599
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    iget-object v1, p0, Lo/dez;->U:Lo/djs$a;

    iget-object v2, p0, Lo/dez;->W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dde;->e(Lo/djs;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2600
    return-void

    .line 2603
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHeartRateRaiseAlarmNumber()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2604
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportGetHeartRateRaiseAlarmNumber is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2605
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    iget-object v1, p0, Lo/dez;->U:Lo/djs$a;

    iget-object v2, p0, Lo/dez;->W:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dde;->e(Lo/djs;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2606
    return-void

    .line 2610
    :cond_1
    invoke-static {p0}, Lo/dey;->e(Lo/cwz;)Lo/dey;

    move-result-object v5

    .line 2612
    invoke-virtual {v5}, Lo/dey;->c()J

    move-result-wide v6

    .line 2613
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v8, v0, v2

    .line 2615
    sub-long v0, v6, v8

    const-wide/32 v2, 0x93a80

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-nez v0, :cond_3

    .line 2616
    :cond_2
    const-wide/32 v0, 0x93a80

    sub-long v0, v8, v0

    invoke-direct {p0, v0, v1}, Lo/dez;->c(J)J

    move-result-wide v6

    .line 2617
    invoke-direct {p0, v6, v7}, Lo/dez;->b(J)V

    goto :goto_0

    .line 2618
    :cond_3
    cmp-long v0, v6, v8

    if-ltz v0, :cond_4

    sub-long v0, v6, v8

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    .line 2620
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStatusPoint lastStatusTime is not correct. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2621
    const-wide/16 v0, 0x3d

    sub-long v6, v8, v0

    goto :goto_0

    .line 2622
    :cond_4
    sub-long v0, v6, v8

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 2624
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateRaiseAlarm lastStatusTime is not correct and need writeback. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2625
    const-wide/16 v0, 0x3d

    sub-long v6, v8, v0

    .line 2626
    invoke-virtual {v5, v6, v7}, Lo/dey;->a(J)V

    .line 2628
    :cond_5
    :goto_0
    invoke-static {v6, v7, v8, v9}, Lo/dfj;->d(JJ)V

    .line 2629
    return-void
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 304
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    .line 2892
    iget-boolean v0, p0, Lo/dez;->u:Z

    return v0
.end method

.method public i()Z
    .locals 4

    .line 2343
    const/4 v2, 0x0

    .line 2345
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2346
    iget-object v0, p0, Lo/dez;->o:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    .line 2347
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x7

    if-ne v1, v0, :cond_0

    .line 2348
    const/4 v2, 0x1

    .line 2352
    :cond_0
    return v2
.end method

.method public k()V
    .locals 6

    .line 2637
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter syncHeartRateButtonEnable()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2638
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 2639
    if-nez v5, :cond_0

    .line 2640
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncHeartRateButtonEnable deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2641
    return-void

    .line 2643
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2644
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncHeartRateButtonEnable is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2645
    return-void

    .line 2647
    :cond_1
    iget-object v0, p0, Lo/dez;->w:Lo/dqi;

    const-string v1, "heart_rate_button"

    new-instance v2, Lo/dez$14;

    invoke-direct {v2, p0}, Lo/dez$14;-><init>(Lo/dez;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2664
    return-void
.end method

.method public l()J
    .locals 2

    .line 2901
    iget-wide v0, p0, Lo/dez;->B:J

    return-wide v0
.end method

.method protected onDestroy()V
    .locals 3

    .line 2828
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 2829
    iget-object v0, p0, Lo/dez;->y:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 2830
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dez;->y:Landroid/os/HandlerThread;

    .line 2832
    iget-object v0, p0, Lo/dez;->F:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2833
    iget-object v0, p0, Lo/dez;->F:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lo/dez;->unregisterBroadcast(Landroid/content/BroadcastReceiver;)V

    .line 2834
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dez;->F:Landroid/content/BroadcastReceiver;

    .line 2837
    :cond_0
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 2838
    if-eqz v2, :cond_1

    .line 2839
    iget-object v0, p0, Lo/dez;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2840
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dez;->I:Landroid/content/BroadcastReceiver;

    .line 2843
    :cond_1
    iget-object v0, p0, Lo/dez;->E:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 2844
    iget-object v0, p0, Lo/dez;->n:Landroid/content/Context;

    iget-object v1, p0, Lo/dez;->E:Landroid/content/BroadcastReceiver;

    invoke-static {v0, v1}, Lo/dbg;->e(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V

    .line 2845
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dez;->E:Landroid/content/BroadcastReceiver;

    .line 2847
    :cond_2
    return-void
.end method
