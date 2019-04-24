.class public Lo/dca;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dca$b;,
        Lo/dca$e;,
        Lo/dca$d;,
        Lo/dca$c;
    }
.end annotation


# static fields
.field private static b:Lo/dca;

.field private static v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private static y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# instance fields
.field public a:I

.field private c:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

.field d:Ljava/util/concurrent/ExecutorService;

.field private e:Lo/dde;

.field private f:Landroid/content/Context;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/yl;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/yn;>;"
        }
    .end annotation
.end field

.field private i:J

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/yo;>;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:J

.field private n:Lo/dca$c;

.field private o:Z

.field private p:I

.field private q:Landroid/os/HandlerThread;

.field private r:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private s:Lo/dca$b;

.field private t:Lo/dbz;

.field private u:Ljava/util/Timer;

.field private final w:Landroid/content/BroadcastReceiver;

.field private x:Lo/dcb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 85
    const/4 v0, 0x0

    sput-object v0, Lo/dca;->b:Lo/dca;

    .line 1180
    const/4 v0, 0x0

    sput-object v0, Lo/dca;->y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1316
    const/4 v0, 0x0

    sput-object v0, Lo/dca;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 162
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 88
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dca;->i:J

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->l:Z

    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->o:Z

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lo/dca;->a:I

    .line 121
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dca;->m:J

    .line 123
    const/4 v0, 0x0

    iput v0, p0, Lo/dca;->p:I

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dca;->r:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    .line 147
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dca;->s:Lo/dca$b;

    .line 395
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dca;->x:Lo/dcb;

    .line 1120
    new-instance v0, Lo/dca$2;

    invoke-direct {v0, p0}, Lo/dca$2;-><init>(Lo/dca;)V

    iput-object v0, p0, Lo/dca;->w:Landroid/content/BroadcastReceiver;

    .line 163
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCoreSleepMgr new start!.................."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    .line 165
    invoke-static {}, Lo/dbz;->b()Lo/dbz;

    move-result-object v0

    iput-object v0, p0, Lo/dca;->t:Lo/dbz;

    .line 167
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lo/dca;->r:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 169
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/dca;->e:Lo/dde;

    .line 170
    iget-object v0, p0, Lo/dca;->e:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 171
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :cond_0
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    iput-object v0, p0, Lo/dca;->c:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    .line 174
    iget-object v0, p0, Lo/dca;->c:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 175
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwDeviceDFXManager is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :cond_1
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dca;->d:Ljava/util/concurrent/ExecutorService;

    .line 179
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CORESLEEPMISSON_HwCoreSleepMgr"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dca;->q:Landroid/os/HandlerThread;

    .line 180
    iget-object v0, p0, Lo/dca;->q:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 181
    new-instance v0, Lo/dca$c;

    iget-object v1, p0, Lo/dca;->q:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dca$c;-><init>(Lo/dca;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dca;->n:Lo/dca$c;

    .line 184
    invoke-direct {p0}, Lo/dca;->l()V

    .line 185
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCoreSleepMgr new success!.................."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void
.end method

.method static synthetic a(Lo/dca;I)I
    .locals 0

    .line 69
    iput p1, p0, Lo/dca;->p:I

    return p1
.end method

.method static synthetic a(Lo/dca;)Ljava/util/List;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lo/dca;Lo/dcb;)Lo/dcb;
    .locals 0

    .line 69
    iput-object p1, p0, Lo/dca;->x:Lo/dcb;

    return-object p1
.end method

.method private a(I)V
    .locals 4

    .line 493
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handle sync error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    iput p1, p0, Lo/dca;->a:I

    .line 495
    return-void
.end method

.method public static a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1323
    sput-object p0, Lo/dca;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1324
    return-void
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/util/ArrayList<[B>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 882
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter procCpcDataRun() ,strDataContent = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",strStatusContent = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 883
    new-instance v4, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;

    invoke-direct {v4}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;-><init>()V

    .line 884
    invoke-virtual {v4, p1, p2, p3}, Lcom/huawei/coresleepresult/HwCoreSleepDataProvider;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 886
    return-void
.end method

.method static synthetic a(Lo/dca;Z)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lo/dca;->e(Z)V

    return-void
.end method

.method static synthetic b(Lo/dca;)Ljava/util/List;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/dca;->h:Ljava/util/List;

    return-object v0
.end method

.method private b(Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;Lo/dcb;)V
    .locals 2

    .line 1155
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1156
    iget-object v0, p0, Lo/dca;->x:Lo/dcb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1157
    iget-object v0, p0, Lo/dca;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dca$6;

    invoke-direct {v1, p0, p1}, Lo/dca$6;-><init>(Lo/dca;Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1177
    :cond_0
    return-void
.end method

.method private b(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/util/ArrayList<[B>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 850
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter procCpcData() ,strDataContent = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",strStatusContent = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 851
    iget-object v0, p0, Lo/dca;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dca$e;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/dca$e;-><init>(Lo/dca;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 852
    return-void
.end method

.method static synthetic b(Lo/dca;I)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lo/dca;->a(I)V

    return-void
.end method

.method static synthetic b(Lo/dca;IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dca;->e(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic b(Lo/dca;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lo/dca;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic b(Lo/dca;Z)Z
    .locals 0

    .line 69
    iput-boolean p1, p0, Lo/dca;->o:Z

    return p1
.end method

.method static synthetic c(Lo/dca;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 69
    iput-object p1, p0, Lo/dca;->g:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lo/dca;)Lo/dca$b;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/dca;->s:Lo/dca$b;

    return-object v0
.end method

.method private static c(I)V
    .locals 5

    .line 1331
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter reportProgress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1332
    invoke-static {}, Lo/dca;->f()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1333
    const/4 v4, 0x0

    .line 1334
    const/16 v0, 0x64

    if-gt p0, v0, :cond_0

    if-ltz p0, :cond_0

    .line 1335
    mul-int/lit8 v0, p0, 0x7

    div-int/lit8 v4, v0, 0x9

    goto :goto_0

    .line 1336
    :cond_0
    const/16 v0, 0xa0

    if-le v0, p0, :cond_1

    const/16 v0, 0x64

    if-le p0, v0, :cond_1

    .line 1337
    add-int/lit8 v0, p0, -0x64

    mul-int/lit8 v0, v0, 0x64

    mul-int/lit8 v0, v0, 0x6

    div-int/lit16 v0, v0, 0x870

    add-int/lit8 v4, v0, 0x4d

    goto :goto_0

    .line 1338
    :cond_1
    const/16 v0, 0x118

    if-le v0, p0, :cond_2

    const/16 v0, 0xa0

    if-lt p0, v0, :cond_2

    .line 1339
    add-int/lit16 v0, p0, -0xa0

    mul-int/lit8 v0, v0, 0x64

    mul-int/lit8 v0, v0, 0x2

    div-int/lit16 v0, v0, 0x10e0

    add-int/lit8 v4, v0, 0x5e

    goto :goto_0

    .line 1341
    :cond_2
    const/4 v0, -0x1

    if-ne v0, p0, :cond_3

    .line 1342
    const/16 v4, 0x64

    goto :goto_0

    .line 1344
    :cond_3
    const/16 v4, 0x63

    .line 1346
    :goto_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " enter reportProgress progress : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1347
    invoke-static {}, Lo/dca;->f()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x4e20

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1349
    :cond_4
    return-void
.end method

.method private c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 1071
    const/4 v4, 0x0

    .line 1072
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1073
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 1074
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    add-int/2addr v4, v0

    .line 1073
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1076
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strDataContent length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 1086
    :cond_1
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "strDataContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1088
    :goto_1
    const/4 v5, 0x0

    .line 1089
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1090
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 1091
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v0, v0

    add-int/2addr v5, v0

    .line 1090
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 1093
    :cond_2
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strStatusContent length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 1102
    :cond_3
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "strStatusContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1104
    :goto_3
    return-void
.end method

.method private d(II)I
    .locals 4

    .line 727
    if-lt p1, p2, :cond_0

    sub-int v0, p1, p2

    const/16 v1, 0x12c

    if-gt v0, v1, :cond_0

    .line 728
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "future time : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    add-int/lit8 p1, p2, -0x3d

    goto :goto_0

    .line 730
    :cond_0
    sub-int v0, p1, p2

    const/16 v1, 0x12c

    if-le v0, v1, :cond_1

    .line 731
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "future time : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    add-int/lit8 p1, p2, -0x3d

    .line 733
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lo/dca;->a(J)V

    .line 735
    :cond_1
    :goto_0
    return p1
.end method

.method static synthetic d(Lo/dca;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 69
    iput-object p1, p0, Lo/dca;->h:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lo/dca;)Lo/dca$c;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Lo/dca;
    .locals 6

    .line 151
    const-class v4, Lo/dca;

    monitor-enter v4

    .line 152
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCoreSleepMgr getInstance() 1.................."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    sget-object v0, Lo/dca;->b:Lo/dca;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 154
    new-instance v0, Lo/dca;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dca;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dca;->b:Lo/dca;

    .line 157
    :cond_0
    sget-object v0, Lo/dca;->b:Lo/dca;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 158
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method static synthetic d(I)V
    .locals 0

    .line 69
    invoke-static {p0}, Lo/dca;->c(I)V

    return-void
.end method

.method private d(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 4

    .line 807
    iget-object v0, p0, Lo/dca;->c:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 808
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceDFXManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    return-void

    .line 811
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " sendCommand() start time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",end time = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",isNormalSync = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 812
    invoke-direct {p0}, Lo/dca;->h()V

    .line 813
    iget-object v0, p0, Lo/dca;->c:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    new-instance v1, Lo/dca$4;

    invoke-direct {v1, p0, p3, p4}, Lo/dca$4;-><init>(Lo/dca;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-virtual {v0, p4, p1, p2, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getSleepDetailFromDevice(ZIILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V

    .line 847
    return-void
.end method

.method private d(ILjava/lang/String;)V
    .locals 4

    .line 247
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " makeCoreSleepResult:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 249
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, ""

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 250
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dca;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 252
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " setCoreSleepSyncRate coreSleepCallBack is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-virtual {p0, p1}, Lo/dca;->e(I)V

    .line 254
    const/4 v0, -0x1

    invoke-static {v0}, Lo/dca;->c(I)V

    .line 256
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 1276
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncCoreSleepDataForUI enter isSyncing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dca;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1282
    const/16 v0, 0x3a

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v7

    .line 1283
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncCoreSleepDataForUI isFeatureIDSupport :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1284
    if-nez v7, :cond_1

    .line 1285
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncCoreSleepDataForUI this version don\'t support core sleep ,don\'t sync core sleep data."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1286
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1287
    const-string v0, "this siteID don\'t support core sleep."

    const v1, 0x186a2

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1289
    :cond_0
    return-void

    .line 1292
    :cond_1
    iget-boolean v0, p0, Lo/dca;->o:Z

    if-nez v0, :cond_3

    .line 1293
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncCoreSleepDataForUI coreSleepMgrThreadPool.execute syncCoreSleep. isSyncing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dca;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1294
    invoke-static {}, Lo/dgh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/dca;->r:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dca;->r:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1295
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1296
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncCoreSleepDataForUI isManualSync is true  \u540c\u6b65\u79d1\u5b66\u7761\u7720\u524d\u5148\u901a\u77e5\u5355\u677f\u51fa\u7761\uff01\uff01\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1297
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dfj;->h(I)V

    .line 1299
    :cond_2
    invoke-virtual {p0}, Lo/dca;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 1300
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v9, v0

    .line 1301
    invoke-direct {p0, v8, v9}, Lo/dca;->d(II)I

    move-result v8

    .line 1302
    iget-object v0, p0, Lo/dca;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dca$d;

    move-object v2, p0

    move v3, v8

    move v4, v9

    move-object v5, p1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lo/dca$d;-><init>(Lo/dca;IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1303
    goto :goto_0

    .line 1304
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 1305
    const-string v0, " is syncing"

    const/16 v1, 0x7532

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1308
    :cond_4
    :goto_0
    return-void
.end method

.method private d(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 404
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getCpcResult()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CoreSleepData in getCpcResult is as follow:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    invoke-direct {p0, p1, p2}, Lo/dca;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 413
    iget-object v0, p0, Lo/dca;->x:Lo/dcb;

    if-eqz v0, :cond_0

    .line 414
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->o:Z

    .line 415
    new-instance v4, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;

    invoke-direct {v4}, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;-><init>()V

    .line 416
    invoke-virtual {v4, p1}, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;->setRRDataContent(Ljava/util/ArrayList;)V

    .line 417
    invoke-virtual {v4, p2}, Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;->setStatusContent(Ljava/util/ArrayList;)V

    .line 418
    iget-object v0, p0, Lo/dca;->x:Lo/dcb;

    invoke-direct {p0, v4, v0}, Lo/dca;->b(Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;Lo/dcb;)V

    .line 419
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->l:Z

    .line 420
    return-void

    .line 423
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 424
    const-string v0, "value"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ja:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 427
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dca;->h:Ljava/util/List;

    .line 428
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dca;->g:Ljava/util/List;

    .line 429
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dca;->k:Ljava/util/List;

    .line 430
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x1

    const-wide/32 v2, 0x2bf20

    invoke-virtual {v0, v1, v2, v3}, Lo/dca$c;->sendEmptyMessageDelayed(IJ)Z

    .line 431
    new-instance v0, Lo/dca$3;

    invoke-direct {v0, p0}, Lo/dca$3;-><init>(Lo/dca;)V

    invoke-direct {p0, p1, p2, v0}, Lo/dca;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 482
    return-void
.end method

.method static synthetic e(Lo/dca;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 69
    iput-object p1, p0, Lo/dca;->k:Ljava/util/List;

    return-object p1
.end method

.method private e(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 7

    .line 772
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter syncCoreSleepDetailDataRun() isNormalSync:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 773
    iget-boolean v0, p0, Lo/dca;->o:Z

    if-eqz v0, :cond_1

    .line 774
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncing ,return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 776
    const-string v0, " is syncing"

    const/16 v1, 0x7532

    invoke-interface {p3, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 778
    :cond_0
    return-void

    .line 781
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dca;->o:Z

    .line 782
    const/4 v0, 0x2

    iput v0, p0, Lo/dca;->a:I

    .line 783
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dca;->m:J

    .line 789
    :try_start_0
    iget-object v0, p0, Lo/dca;->s:Lo/dca$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 790
    iget-object v0, p0, Lo/dca;->s:Lo/dca$b;

    invoke-virtual {v0}, Lo/dca$b;->cancel()Z

    .line 793
    :cond_2
    new-instance v0, Lo/dca$b;

    invoke-direct {v0, p0, p4}, Lo/dca$b;-><init>(Lo/dca;Z)V

    iput-object v0, p0, Lo/dca;->s:Lo/dca$b;

    .line 794
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    .line 795
    iget-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    iget-object v1, p0, Lo/dca;->s:Lo/dca$b;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x7d0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 798
    goto :goto_0

    .line 796
    :catch_0
    move-exception v6

    .line 797
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timer error"

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

    .line 802
    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dca;->d(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 803
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x0

    const-wide/32 v2, 0x124f80

    invoke-virtual {v0, v1, v2, v3}, Lo/dca$c;->sendEmptyMessageDelayed(IJ)Z

    .line 804
    return-void
.end method

.method public static e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1187
    sput-object p0, Lo/dca;->y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1188
    return-void
.end method

.method static synthetic e(Lo/dca;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lo/dca;->i()V

    return-void
.end method

.method static synthetic e(Lo/dca;ILjava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lo/dca;->d(ILjava/lang/String;)V

    return-void
.end method

.method private e(Z)V
    .locals 8

    .line 262
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter setCoreSleepSyncRate() isNormalSync:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 265
    const-wide/32 v6, 0x124f80

    .line 267
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncCoreSleepRate, current time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",begin synctime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/dca;->m:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",total time = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iget-wide v0, p0, Lo/dca;->m:J

    sub-long v0, v4, v0

    cmp-long v0, v0, v6

    if-lez v0, :cond_1

    .line 269
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCoreSleepSyncRate() time out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    invoke-direct {p0}, Lo/dca;->i()V

    .line 272
    const/4 v0, -0x1

    iput v0, p0, Lo/dca;->a:I

    .line 273
    if-eqz p1, :cond_0

    .line 274
    const/16 v0, 0x520b

    invoke-virtual {p0, v0}, Lo/dca;->e(I)V

    goto :goto_0

    .line 276
    :cond_0
    const-string v0, "time out"

    const/16 v1, 0x520b

    invoke-direct {p0, v1, v0}, Lo/dca;->d(ILjava/lang/String;)V

    .line 280
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->o:Z

    .line 281
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " setCoreSleepSyncRate sync time out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 283
    :cond_1
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(currTime - beginSyncTime) < totalTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "status : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dca;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget v0, p0, Lo/dca;->a:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 286
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rate = 100"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    invoke-direct {p0}, Lo/dca;->i()V

    .line 288
    if-eqz p1, :cond_2

    .line 289
    invoke-direct {p0}, Lo/dca;->o()V

    .line 290
    const/4 v0, -0x1

    invoke-static {v0}, Lo/dca;->c(I)V

    goto :goto_1

    .line 292
    :cond_2
    const-string v0, "success"

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lo/dca;->d(ILjava/lang/String;)V

    .line 294
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->o:Z

    goto/16 :goto_4

    .line 295
    :cond_3
    iget v0, p0, Lo/dca;->a:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_5

    .line 296
    invoke-direct {p0}, Lo/dca;->i()V

    .line 297
    if-eqz p1, :cond_4

    .line 298
    const/16 v0, 0x520c

    invoke-virtual {p0, v0}, Lo/dca;->e(I)V

    goto :goto_2

    .line 300
    :cond_4
    const-string v0, "error"

    const/16 v1, 0x520c

    invoke-direct {p0, v1, v0}, Lo/dca;->d(ILjava/lang/String;)V

    .line 302
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->o:Z

    goto/16 :goto_4

    .line 303
    :cond_5
    iget v0, p0, Lo/dca;->a:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_7

    .line 304
    invoke-direct {p0}, Lo/dca;->i()V

    .line 305
    if-eqz p1, :cond_6

    .line 306
    const/16 v0, 0x520e

    invoke-virtual {p0, v0}, Lo/dca;->e(I)V

    goto :goto_3

    .line 308
    :cond_6
    const-string v0, "error"

    const/16 v1, 0x520e

    invoke-direct {p0, v1, v0}, Lo/dca;->d(ILjava/lang/String;)V

    .line 310
    :goto_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->o:Z

    goto/16 :goto_4

    .line 311
    :cond_7
    iget v0, p0, Lo/dca;->a:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_9

    .line 313
    iget v0, p0, Lo/dca;->p:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/dca;->p:I

    .line 314
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cpc progress :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dca;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget v0, p0, Lo/dca;->p:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_8

    .line 316
    invoke-static {}, Lo/dca;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget v1, p0, Lo/dca;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x4e20

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 317
    iget v0, p0, Lo/dca;->p:I

    invoke-static {v0}, Lo/dca;->c(I)V

    goto :goto_4

    .line 318
    :cond_8
    iget v0, p0, Lo/dca;->p:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_a

    .line 319
    iget v0, p0, Lo/dca;->p:I

    invoke-static {v0}, Lo/dca;->c(I)V

    goto :goto_4

    .line 334
    :cond_9
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    :cond_a
    :goto_4
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "leave setCoreSleepSyncRate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    return-void
.end method

.method static synthetic e(Lo/dca;Z)Z
    .locals 0

    .line 69
    iput-boolean p1, p0, Lo/dca;->l:Z

    return p1
.end method

.method public static f()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 1319
    sget-object v0, Lo/dca;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 904
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwcoresleepmgr registerDeviceToHiHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    iget-object v0, p0, Lo/dca;->e:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 906
    iget-object v0, p0, Lo/dca;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 907
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 908
    invoke-static {v4}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 910
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwcoresleepmgr registerDeviceToHiHealth deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 912
    :goto_0
    goto :goto_1

    .line 913
    :cond_1
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwcoresleepmgr registerDeviceToHiHealth enter mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 915
    :goto_1
    return-void
.end method

.method static synthetic h(Lo/dca;)Lo/dbz;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/dca;->t:Lo/dbz;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 975
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncStartBroadcast."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 976
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_START"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 977
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 978
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 979
    return-void
.end method

.method private i()V
    .locals 4

    .line 498
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter canleTimer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    iget-object v0, p0, Lo/dca;->s:Lo/dca$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 500
    iget-object v0, p0, Lo/dca;->s:Lo/dca$b;

    invoke-virtual {v0}, Lo/dca$b;->cancel()Z

    .line 501
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dca;->s:Lo/dca$b;

    .line 502
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync time out,task cancle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    :cond_0
    iget-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 505
    iget-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 506
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    .line 507
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync time out,synctimer cancle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    :cond_1
    return-void
.end method

.method static synthetic i(Lo/dca;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lo/dca;->g()V

    return-void
.end method

.method public static k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 1183
    sget-object v0, Lo/dca;->y:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic k(Lo/dca;)Lo/dcb;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/dca;->x:Lo/dcb;

    return-object v0
.end method

.method private l()V
    .locals 5

    .line 1112
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1113
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1114
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    iget-object v1, p0, Lo/dca;->w:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1115
    return-void
.end method

.method private n()V
    .locals 5

    .line 1028
    :try_start_0
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    iget-object v1, p0, Lo/dca;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1033
    goto :goto_0

    .line 1029
    :catch_0
    move-exception v4

    .line 1030
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1033
    goto :goto_0

    .line 1031
    :catch_1
    move-exception v4

    .line 1032
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1034
    :goto_0
    return-void
.end method

.method private o()V
    .locals 5

    .line 982
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncSuccBroadcast."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 983
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_SUCCESS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 984
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 985
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 986
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dca;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 987
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 764
    iget-object v0, p0, Lo/dca;->s:Lo/dca$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 765
    iget-object v0, p0, Lo/dca;->s:Lo/dca$b;

    invoke-virtual {v0}, Lo/dca$b;->cancel()Z

    .line 767
    :cond_0
    new-instance v0, Lo/dca$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/dca$b;-><init>(Lo/dca;Z)V

    iput-object v0, p0, Lo/dca;->s:Lo/dca$b;

    .line 768
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    .line 769
    iget-object v0, p0, Lo/dca;->u:Ljava/util/Timer;

    iget-object v1, p0, Lo/dca;->s:Lo/dca$b;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x7d0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 770
    return-void
.end method

.method public a(J)V
    .locals 18

    .line 518
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " enter updateLastSyncTime,time ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p1

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 521
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    .line 522
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dca;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v7

    .line 523
    const-string v8, ""

    .line 524
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 525
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v8

    .line 527
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentDeviceMac is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v8}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v9

    .line 531
    new-instance v10, Lcom/google/gson/Gson;

    invoke-direct {v10}, Lcom/google/gson/Gson;-><init>()V

    .line 532
    const-string v0, "kStorage_CoreSleepMgr_Long_LastSyncTime"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/dca;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 533
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get timeStrFromSharedPreference is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    :try_start_0
    new-instance v0, Lo/dca$1;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/dca$1;-><init>(Lo/dca;)V

    .line 537
    invoke-virtual {v0}, Lo/dca$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 536
    invoke-virtual {v10, v11, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 541
    goto :goto_0

    .line 538
    :catch_0
    move-exception v13

    .line 539
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fromJson parse fail."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    const/4 v12, 0x0

    .line 543
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v12, :cond_6

    .line 544
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 545
    const/4 v13, 0x0

    .line 546
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastSyncTimeList: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 547
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 548
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    .line 549
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 550
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;

    .line 551
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->getDeviceMac()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 552
    const/4 v13, 0x1

    .line 553
    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->setLastSyncTime(Ljava/lang/String;)V

    goto :goto_2

    .line 554
    :cond_1
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->getDeviceMac()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 555
    const/4 v13, 0x1

    .line 556
    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->setLastSyncTime(Ljava/lang/String;)V

    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->setDeviceMac(Ljava/lang/String;)V

    .line 559
    :cond_2
    :goto_2
    if-eqz v13, :cond_3

    .line 560
    goto :goto_3

    .line 562
    :cond_3
    goto :goto_1

    .line 563
    :cond_4
    :goto_3
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isExist:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    if-nez v13, :cond_5

    .line 566
    new-instance v16, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;-><init>()V

    .line 567
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->setDeviceMac(Ljava/lang/String;)V

    .line 568
    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->setLastSyncTime(Ljava/lang/String;)V

    .line 569
    move-object/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 572
    :cond_5
    new-instance v16, Lcom/google/gson/Gson;

    invoke-direct/range {v16 .. v16}, Lcom/google/gson/Gson;-><init>()V

    .line 573
    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 574
    const-string v0, "kStorage_CoreSleepMgr_Long_LastSyncTime"

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    invoke-virtual {v1, v0, v2, v5}, Lo/dca;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 575
    goto :goto_4

    .line 578
    :cond_6
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastSyncTimeList is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 580
    new-instance v14, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;

    invoke-direct {v14}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;-><init>()V

    .line 581
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->setDeviceMac(Ljava/lang/String;)V

    .line 582
    invoke-virtual {v14, v6}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->setLastSyncTime(Ljava/lang/String;)V

    .line 583
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 584
    new-instance v15, Lcom/google/gson/Gson;

    invoke-direct {v15}, Lcom/google/gson/Gson;-><init>()V

    .line 585
    invoke-virtual {v15, v13}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 586
    const-string v0, "kStorage_CoreSleepMgr_Long_LastSyncTime"

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    invoke-virtual {v1, v0, v2, v5}, Lo/dca;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 588
    :cond_7
    :goto_4
    return-void
.end method

.method public b()V
    .locals 4

    .line 489
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x2

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Lo/dca$c;->sendEmptyMessageDelayed(IJ)Z

    .line 490
    return-void
.end method

.method public declared-synchronized b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    monitor-enter p0

    .line 1198
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSyncCoreSleep_2 isSyncing:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dca;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1199
    const/4 v4, 0x0

    .line 1200
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1201
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 1204
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 1205
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncCoreSleep_2 callback is null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1206
    monitor-exit p0

    return-void

    .line 1209
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    .line 1210
    :cond_2
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncCoreSleep_2 ACTION_CORE_SLEEP_SYNC get device info error or DEVICE_DISCONNECTED return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1211
    const-string v0, ""

    const/16 v1, 0x5208

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1212
    monitor-exit p0

    return-void

    .line 1215
    :cond_3
    iget-boolean v0, p0, Lo/dca;->o:Z

    if-eqz v0, :cond_4

    .line 1216
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "busy,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1217
    const-string v0, ""

    const/16 v1, 0x7532

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1219
    new-instance v5, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;-><init>()V

    .line 1220
    const/16 v0, 0xc8

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setType(I)V

    .line 1221
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setRecordId(Ljava/util/List;)V

    .line 1222
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/dde;->b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V

    .line 1223
    monitor-exit p0

    return-void

    .line 1226
    :cond_4
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1227
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncCoreSleep_2 device is OTAing."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1228
    const-string v0, ""

    const/16 v1, 0x55f0

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1229
    monitor-exit p0

    return-void

    .line 1231
    :cond_5
    invoke-static {p2}, Lo/dca;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1232
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncCoreSleep_2 start to sync core sleep."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1233
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 1234
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    .line 1235
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSyncCoreSleep_2 capability.isSupportCoreSleep(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1236
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSyncCoreSleep_2 capability.isSupportQueryDeviceCoreSleepSwitch(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryDeviceCoreSleepSwitch()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1237
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryDeviceCoreSleepSwitch()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1238
    :cond_6
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dgh;->d(Z)V

    .line 1239
    new-instance v0, Lo/dca$7;

    invoke-direct {v0, p0}, Lo/dca$7;-><init>(Lo/dca;)V

    invoke-direct {p0, v0}, Lo/dca;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1259
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dgh;->d(Z)V

    goto :goto_0

    .line 1261
    :cond_7
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncCoreSleep_2 don\'t satisfy coreSleep sync condition! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1263
    const-string v0, "don\'t satisfy coreSleep sync condition!"

    const/16 v1, 0x520a

    invoke-direct {p0, v1, v0}, Lo/dca;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 1266
    :cond_8
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncCoreSleep_2 capability is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1267
    const-string v0, "capability is null"

    const/16 v1, 0x5209

    invoke-direct {p0, v1, v0}, Lo/dca;->d(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1270
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c()V
    .locals 1

    .line 485
    const/4 v0, -0x1

    iput v0, p0, Lo/dca;->a:I

    .line 486
    return-void
.end method

.method public c(IILo/dcb;)V
    .locals 5

    .line 645
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncRRDataForThrirPart not SupportCrowdFunding"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    const v0, 0x186a2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-interface {p3, v0, v1, v2, v3}, Lo/dcb;->e(IIILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 650
    goto :goto_0

    .line 648
    :catch_0
    move-exception v4

    .line 649
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Remote Exception  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    :goto_0
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 694
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter syncCoreSleepData. isSyncing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dca;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    const/16 v0, 0x3a

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v7

    .line 701
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isFeatureIDSupport :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 702
    if-nez v7, :cond_1

    .line 703
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "this version don\'t support core sleep ,don\'t sync core sleep data."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 705
    const-string v0, "this siteID don\'t support core sleep."

    const v1, 0x186a2

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 707
    :cond_0
    return-void

    .line 710
    :cond_1
    iget-boolean v0, p0, Lo/dca;->o:Z

    if-nez v0, :cond_3

    .line 711
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncCoreSleepData coreSleepMgrThreadPool.execute syncCoreSleep. isSyncing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dca;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    invoke-static {}, Lo/dgh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/dca;->r:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dca;->r:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 713
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 714
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncCoreSleepData isManualSync is true  \u540c\u6b65\u79d1\u5b66\u7761\u7720\u524d\u5148\u901a\u77e5\u5355\u677f\u51fa\u7761\uff01\uff01\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 715
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dfj;->h(I)V

    .line 718
    :cond_2
    invoke-static {p1}, Lo/dca;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 719
    invoke-virtual {p0}, Lo/dca;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 720
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v9, v0

    .line 721
    invoke-direct {p0, v8, v9}, Lo/dca;->d(II)I

    move-result v8

    .line 722
    iget-object v0, p0, Lo/dca;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dca$d;

    move-object v2, p0

    move v3, v8

    move v4, v9

    move-object v5, p1

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lo/dca$d;-><init>(Lo/dca;IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 724
    :cond_3
    return-void
.end method

.method public d()J
    .locals 16

    .line 596
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getLastSyncTime():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    const-wide/16 v0, 0x0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lo/dca;->i:J

    .line 598
    const-string v5, ""

    .line 599
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dca;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 600
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 601
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v5

    .line 603
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentDeviceMac is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v7

    .line 606
    new-instance v8, Lcom/google/gson/Gson;

    invoke-direct {v8}, Lcom/google/gson/Gson;-><init>()V

    .line 607
    const-string v0, "kStorage_CoreSleepMgr_Long_LastSyncTime"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/dca;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 608
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timeStrFromSharedPreference is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    :try_start_0
    new-instance v0, Lo/dca$5;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/dca$5;-><init>(Lo/dca;)V

    .line 612
    invoke-virtual {v0}, Lo/dca$5;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 611
    invoke-virtual {v8, v9, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 616
    goto :goto_0

    .line 613
    :catch_0
    move-exception v11

    .line 614
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fromJson parse fail...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    const/4 v10, 0x0

    .line 617
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    .line 618
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 619
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastSyncTimeList: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 621
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;

    .line 622
    invoke-virtual {v13}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->getDeviceMac()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v13}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->getDeviceMac()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 623
    :cond_1
    invoke-virtual {v13}, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->getLastSyncTime()Ljava/lang/String;

    move-result-object v14

    .line 624
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 626
    :try_start_1
    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lo/dca;->i:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 629
    goto :goto_2

    .line 627
    :catch_1
    move-exception v15

    .line 628
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getLastCoreSleepSyncTime error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v15}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    goto :goto_2

    .line 633
    :cond_2
    goto :goto_1

    .line 634
    :cond_3
    :goto_2
    goto :goto_3

    .line 636
    :cond_4
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastSyncTimeList is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    :cond_5
    :goto_3
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getLastCoreSleepSyncTime lastTimeStamp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/dca;->i:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/dca;->i:J

    return-wide v0
.end method

.method public d(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/yl;>;)Z"
        }
    .end annotation

    .line 966
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 967
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yl;

    invoke-virtual {v0}, Lo/yl;->c()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 968
    const/4 v0, 0x1

    return v0

    .line 966
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 971
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e()J
    .locals 7

    .line 918
    invoke-virtual {p0}, Lo/dca;->d()J

    move-result-wide v4

    .line 919
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter getNewSyncTime(),LastSyncTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 920
    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 921
    :cond_0
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSleepErrorFramesList size = 0,Can not update SyncTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 922
    const-wide/32 v0, 0xea60

    add-long/2addr v4, v0

    .line 923
    return-wide v4

    .line 925
    :cond_1
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 926
    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yo;

    invoke-virtual {v0}, Lo/yo;->a()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_3

    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yo;

    invoke-virtual {v0}, Lo/yo;->c()I

    move-result v0

    const/16 v1, 0x68

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    .line 927
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yo;

    invoke-virtual {v0}, Lo/yo;->c()I

    move-result v0

    const/16 v1, 0xd7

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yo;

    invoke-virtual {v0}, Lo/yo;->c()I

    move-result v0

    const/16 v1, 0xd9

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    .line 928
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yo;

    invoke-virtual {v0}, Lo/yo;->c()I

    move-result v0

    const/16 v1, 0xed

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yo;

    invoke-virtual {v0}, Lo/yo;->c()I

    move-result v0

    const/16 v1, 0xfc

    if-ne v0, v1, :cond_3

    .line 929
    :cond_2
    iget-object v0, p0, Lo/dca;->k:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yo;

    invoke-virtual {v0}, Lo/yo;->a()J

    move-result-wide v4

    .line 925
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 932
    :cond_4
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 933
    :cond_5
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSleepStatusFramesList size = 0,Can not update SyncTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    const-wide/32 v0, 0xea60

    add-long/2addr v4, v0

    .line 935
    return-wide v4

    .line 937
    :cond_6
    iget-object v0, p0, Lo/dca;->h:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lo/dca;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_b

    .line 938
    :cond_7
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/dca;->d(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 939
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSleepCalcFramesList size = 0, Has Night Sleep, Can not update SyncTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 940
    const-wide/32 v0, 0xea60

    add-long/2addr v4, v0

    .line 941
    return-wide v4

    .line 943
    :cond_8
    const/4 v6, 0x0

    :goto_1
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_a

    .line 944
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yl;

    invoke-virtual {v0}, Lo/yl;->e()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_9

    .line 945
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yl;

    invoke-virtual {v0}, Lo/yl;->e()J

    move-result-wide v4

    .line 943
    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 948
    :cond_a
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSleepCalcFramesList size = 0,Can Only update noonSleep Time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 949
    const-wide/32 v0, 0xea60

    add-long/2addr v4, v0

    .line 950
    return-wide v4

    .line 954
    :cond_b
    const/4 v6, 0x0

    :goto_2
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_d

    .line 955
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yl;

    invoke-virtual {v0}, Lo/yl;->e()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_c

    .line 956
    iget-object v0, p0, Lo/dca;->g:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yl;

    invoke-virtual {v0}, Lo/yl;->e()J

    move-result-wide v4

    .line 954
    :cond_c
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 960
    :cond_d
    const-wide/32 v0, 0xea60

    add-long/2addr v4, v0

    .line 961
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave getNewSyncTime(),NewSyncTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 962
    return-wide v4
.end method

.method public e(I)V
    .locals 5

    .line 996
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendSyncFailBroadcast. error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_FAILED"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 998
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 999
    const-string v0, "errorcode"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1000
    iget-object v0, p0, Lo/dca;->f:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 1002
    const/4 v0, -0x1

    invoke-static {v0}, Lo/dca;->c(I)V

    .line 1003
    return-void
.end method

.method public e(ILjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<[B>;Ljava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 202
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " ENTER procCoreSleepData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-boolean v0, p0, Lo/dca;->l:Z

    if-eqz v0, :cond_0

    .line 204
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procCoreSleepData is running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    return-void

    .line 207
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dca;->l:Z

    .line 209
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dca$c;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dca$c;->removeMessages(I)V

    .line 212
    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 213
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procCoreSleepData data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/4 v0, -0x1

    iput v0, p0, Lo/dca;->a:I

    .line 215
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->l:Z

    .line 216
    return-void

    .line 218
    :cond_2
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CoreSleepData from BT is as follow:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-direct {p0, p2, p3}, Lo/dca;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 220
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 221
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 222
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 223
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strDataContent size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 225
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v6, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 224
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 228
    :cond_3
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 229
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strStatusContent size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 231
    invoke-virtual {p3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v6, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 230
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 235
    :cond_4
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CoreSleepData before getCpcResult(mStrDataContent, mStrStatusContent) is as follow:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    invoke-direct {p0, v4, v5}, Lo/dca;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 237
    const/4 v0, 0x0

    if-ne v0, p1, :cond_5

    .line 238
    invoke-direct {p0, v4, v5}, Lo/dca;->d(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_2

    .line 240
    :cond_5
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " procCoreSleepData err, errCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    :goto_2
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 190
    const/16 v0, 0x1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onDestroy()V
    .locals 2

    .line 1008
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 1009
    invoke-direct {p0}, Lo/dca;->i()V

    .line 1010
    iget-boolean v0, p0, Lo/dca;->o:Z

    if-eqz v0, :cond_0

    .line 1011
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lo/dca;->a(I)V

    .line 1013
    const-string v0, ""

    const/16 v1, 0x520d

    invoke-direct {p0, v1, v0}, Lo/dca;->d(ILjava/lang/String;)V

    .line 1015
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca;->o:Z

    .line 1016
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1017
    iget-object v0, p0, Lo/dca;->n:Lo/dca$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dca$c;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1020
    :cond_1
    invoke-direct {p0}, Lo/dca;->n()V

    .line 1021
    return-void
.end method
