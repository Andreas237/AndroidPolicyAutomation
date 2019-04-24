.class public Lo/dms;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dms$a;,
        Lo/dms$e;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/Object;

.field private static d:Lo/dms;

.field private static l:J

.field private static o:J


# instance fields
.field private A:I

.field private B:Lo/dmw;

.field private C:I

.field private D:I

.field private G:Z

.field private I:Z

.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private f:Z

.field private g:Lo/dde;

.field private h:Ljava/util/concurrent/ExecutorService;

.field private i:Lo/dms$e;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private m:J

.field private n:J

.field private p:Z

.field private q:Lo/dmy;

.field private r:Lo/dna;

.field private s:I

.field private t:Ljava/lang/String;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dna;>;"
        }
    .end annotation
.end field

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private w:Lo/dmx;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dmw;>;"
        }
    .end annotation
.end field

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dms;->c:Ljava/lang/Object;

    .line 72
    const-wide/32 v0, 0x5265c00

    sput-wide v0, Lo/dms;->o:J

    .line 73
    sget-wide v0, Lo/dms;->o:J

    const-wide/16 v2, 0x7

    mul-long/2addr v0, v2

    sput-wide v0, Lo/dms;->l:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 118
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->f:Z

    .line 70
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dms;->n:J

    .line 71
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dms;->m:J

    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->p:Z

    .line 84
    const-string v0, ""

    iput-object v0, p0, Lo/dms;->t:Ljava/lang/String;

    .line 87
    new-instance v0, Lo/dmy;

    invoke-direct {v0}, Lo/dmy;-><init>()V

    iput-object v0, p0, Lo/dms;->q:Lo/dmy;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dms;->u:Ljava/util/List;

    .line 90
    new-instance v0, Lo/dna;

    invoke-direct {v0}, Lo/dna;-><init>()V

    iput-object v0, p0, Lo/dms;->r:Lo/dna;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dms;->v:Ljava/util/List;

    .line 97
    new-instance v0, Lo/dmx;

    invoke-direct {v0}, Lo/dmx;-><init>()V

    iput-object v0, p0, Lo/dms;->w:Lo/dmx;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dms;->x:Ljava/util/List;

    .line 100
    new-instance v0, Lo/dmw;

    invoke-direct {v0}, Lo/dmw;-><init>()V

    iput-object v0, p0, Lo/dms;->B:Lo/dmw;

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dms;->j:Ljava/util/List;

    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->G:Z

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->I:Z

    .line 268
    new-instance v0, Lo/dms$5;

    invoke-direct {v0, p0}, Lo/dms$5;-><init>(Lo/dms;)V

    iput-object v0, p0, Lo/dms;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 119
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWStressMgr Constructor context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->g:Lo/dde;

    .line 121
    iget-object v0, p0, Lo/dms;->g:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 122
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void

    .line 126
    :cond_0
    iget-object v0, p0, Lo/dms;->g:Lo/dde;

    iget-object v1, p0, Lo/dms;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x20

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 129
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->h:Ljava/util/concurrent/ExecutorService;

    .line 130
    new-instance v0, Lo/dms$e;

    invoke-direct {v0, p0, p0}, Lo/dms$e;-><init>(Lo/dms;Lo/dms;)V

    iput-object v0, p0, Lo/dms;->i:Lo/dms$e;

    .line 133
    new-instance v4, Lo/dmu;

    invoke-direct {v4}, Lo/dmu;-><init>()V

    .line 134
    invoke-virtual {v4, p0}, Lo/dmu;->c(Lo/dms;)V

    .line 136
    return-void
.end method

.method static synthetic a(Lo/dms;)Lo/dms$e;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    return-object v0
.end method

.method private a(IJI)V
    .locals 7

    .line 644
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter AddToHealthStressList(): stressType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",stressTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",stressScore = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4, p1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 648
    const-wide/16 v0, 0x3e8

    mul-long v5, p2, v0

    .line 649
    invoke-virtual {v4, v5, v6, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 650
    invoke-virtual {v4, p4}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 651
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 652
    iget-object v0, p0, Lo/dms;->b:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 653
    return-void
.end method

.method private a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 209
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter syncStressDetailDataStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0}, Lo/clt;->a()I

    move-result v4

    .line 213
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hiHealthVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    iget-object v0, p0, Lo/dms;->g:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 216
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 217
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStress()Z

    move-result v0

    iput-boolean v0, p0, Lo/dms;->f:Z

    .line 218
    iget-boolean v0, p0, Lo/dms;->f:Z

    if-eqz v0, :cond_3

    .line 219
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "support stress ,begin to sync data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 221
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device is connected."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 223
    const-string v0, "no device is connected."

    const v1, 0x61a83

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 225
    :cond_1
    return-void

    .line 227
    :cond_2
    invoke-direct {p0, p1}, Lo/dms;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 230
    :cond_3
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "don\'t support stress."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const-string v0, "don\'t support stress."

    const v1, 0x61a84

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 232
    return-void

    .line 235
    :cond_4
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CapabilityUtils.getDeviceCapability() is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 238
    const-string v0, " CapabilityUtils.getDeviceCapability() is null."

    const v1, 0x61a83

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 240
    :cond_5
    return-void

    .line 242
    :goto_0
    return-void
.end method

.method private a([B)V
    .locals 5

    .line 394
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter processRelaxFrameIndexList(), data =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_2

    .line 398
    invoke-static {p1}, Lo/dne;->e([B)I

    move-result v4

    .line 399
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRelaxFrameIndexList return errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 401
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x61a83

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 403
    :cond_0
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 404
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dms$e;->removeMessages(I)V

    .line 406
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->p:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 407
    return-void

    .line 409
    :cond_2
    :try_start_1
    invoke-static {p1}, Lo/dne;->d([B)Lo/dmx;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->w:Lo/dmx;

    .line 410
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxRecordIndexList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->w:Lo/dmx;

    invoke-virtual {v3}, Lo/dmx;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    iget-object v0, p0, Lo/dms;->w:Lo/dmx;

    invoke-virtual {v0}, Lo/dmx;->a()I

    move-result v0

    iput v0, p0, Lo/dms;->D:I

    .line 413
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relax frameCount :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dms;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    iget v0, p0, Lo/dms;->D:I

    if-lez v0, :cond_4

    .line 415
    iget-object v0, p0, Lo/dms;->w:Lo/dmx;

    invoke-virtual {v0}, Lo/dmx;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->j:Ljava/util/List;

    .line 416
    iget-object v0, p0, Lo/dms;->j:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 417
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relax indexList :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->j:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lo/dms;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/dms;->C:I

    .line 419
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxIndexListSize"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dms;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    const/4 v0, 0x0

    iput v0, p0, Lo/dms;->A:I

    .line 421
    iget-object v0, p0, Lo/dms;->j:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dnf;->b(I)V

    goto :goto_0

    .line 423
    :cond_3
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no relax frame index."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    invoke-direct {p0}, Lo/dms;->b()V

    goto :goto_0

    .line 428
    :cond_4
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "else : no relax frame index."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    invoke-direct {p0}, Lo/dms;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 435
    :goto_0
    goto :goto_1

    .line 433
    :catch_0
    move-exception v4

    .line 434
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relax getIndexList Exception :"

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

    .line 436
    :goto_1
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/dms;
    .locals 6

    .line 139
    sget-object v4, Lo/dms;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 140
    const-string v0, "HWStressMgr"

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

    .line 141
    sget-object v0, Lo/dms;->d:Lo/dms;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 142
    new-instance v0, Lo/dms;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dms;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dms;->d:Lo/dms;

    .line 144
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    sget-object v0, Lo/dms;->d:Lo/dms;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 146
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method private b()V
    .locals 4

    .line 511
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAllDataToHiHealth enter():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    invoke-virtual {p0}, Lo/dms;->c()V

    .line 513
    invoke-virtual {p0}, Lo/dms;->a()V

    .line 514
    invoke-direct {p0}, Lo/dms;->i()V

    .line 515
    return-void
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 245
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter syncStressDetailDataRun(): isSyncing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dms;->p:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iget-boolean v0, p0, Lo/dms;->p:Z

    if-eqz v0, :cond_0

    .line 247
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSyncing,please wait, return."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    const-string v0, "isSyncing already."

    const v1, 0x61a82

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 250
    return-void

    .line 252
    :cond_0
    invoke-direct {p0}, Lo/dms;->k()V

    .line 253
    iput-object p1, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 254
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dms;->p:Z

    .line 255
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dms;->n:J

    .line 256
    invoke-direct {p0}, Lo/dms;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dms;->m:J

    .line 257
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dms;->n:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", lastSyncTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dms;->m:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    iget-wide v0, p0, Lo/dms;->m:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lo/dms;->n:J

    iget-wide v2, p0, Lo/dms;->m:J

    sub-long/2addr v0, v2

    sget-wide v2, Lo/dms;->l:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 259
    :cond_1
    iget-wide v0, p0, Lo/dms;->n:J

    sget-wide v2, Lo/dms;->l:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dms;->m:J

    .line 261
    :cond_2
    iget-wide v0, p0, Lo/dms;->m:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v5, v0

    .line 262
    iget-wide v0, p0, Lo/dms;->n:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 263
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    const-wide/32 v2, 0x2bf20

    invoke-virtual {v0, v1, v2, v3}, Lo/dms$e;->sendEmptyMessageDelayed(IJ)Z

    .line 265
    invoke-static {v5, v6}, Lo/dnf;->a(II)V

    .line 266
    return-void
.end method

.method static synthetic b(Lo/dms;[B)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/dms;->d([B)V

    return-void
.end method

.method static synthetic b(Lo/dms;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lo/dms;->I:Z

    return v0
.end method

.method static synthetic b(Lo/dms;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lo/dms;->G:Z

    return p1
.end method

.method static synthetic c(Lo/dms;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private c(J)V
    .locals 5

    .line 711
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLastSyncTime time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    new-instance v4, Lo/dmu;

    invoke-direct {v4}, Lo/dmu;-><init>()V

    .line 713
    invoke-virtual {v4, p0, p1, p2}, Lo/dmu;->c(Lo/dms;J)V

    .line 714
    return-void
.end method

.method static synthetic c(Lo/dms;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/dms;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic c(Lo/dms;[B)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/dms;->c([B)V

    return-void
.end method

.method private c([B)V
    .locals 5

    .line 354
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter processStressRecordDetail(), data =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_2

    .line 358
    invoke-static {p1}, Lo/dne;->e([B)I

    move-result v4

    .line 359
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processStressRecordDetail return errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 361
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x61a83

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 363
    :cond_0
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 364
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dms$e;->removeMessages(I)V

    .line 366
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->p:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    return-void

    .line 369
    :cond_2
    :try_start_1
    invoke-static {p1}, Lo/dne;->a([B)Lo/dna;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->r:Lo/dna;

    .line 370
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressRecordDetails = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->r:Lo/dna;

    invoke-virtual {v3}, Lo/dna;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lo/dms;->u:Ljava/util/List;

    iget-object v1, p0, Lo/dms;->r:Lo/dna;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressIndexProcessed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dms;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    iget v0, p0, Lo/dms;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dms;->y:I

    .line 374
    iget v0, p0, Lo/dms;->y:I

    iget v1, p0, Lo/dms;->s:I

    if-ge v0, v1, :cond_3

    .line 375
    iget-object v0, p0, Lo/dms;->v:Ljava/util/List;

    iget v1, p0, Lo/dms;->y:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dnf;->c(I)V

    goto :goto_0

    .line 378
    :cond_3
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressRecordDetailsList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->u:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    invoke-direct {p0}, Lo/dms;->e()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 385
    :goto_0
    goto :goto_1

    .line 383
    :catch_0
    move-exception v4

    .line 384
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 386
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/dms;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lo/dms;->p:Z

    return p1
.end method

.method private d(IJII)V
    .locals 9

    .line 687
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter addToHealthRelaxList(): relaxType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",relaxTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",relaxLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",relaxScore = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4, p1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 690
    const-wide/16 v0, 0x3e8

    mul-long v5, p2, v0

    .line 691
    int-to-long v0, p4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long v7, v0, v2

    .line 692
    add-long v0, v5, v7

    invoke-virtual {v4, v5, v6, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 693
    invoke-virtual {v4, p5}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 694
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 695
    iget-object v0, p0, Lo/dms;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 696
    return-void
.end method

.method static synthetic d(Lo/dms;J)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lo/dms;->c(J)V

    return-void
.end method

.method static synthetic d(Lo/dms;[B)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/dms;->e([B)V

    return-void
.end method

.method private d([B)V
    .locals 5

    .line 304
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter processStressFrameIndexList(), data =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_2

    .line 308
    invoke-static {p1}, Lo/dne;->e([B)I

    move-result v4

    .line 309
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processStressFrameIndexList return errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 311
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x61a83

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 313
    :cond_0
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 314
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dms$e;->removeMessages(I)V

    .line 316
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->p:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 317
    return-void

    .line 319
    :cond_2
    :try_start_1
    invoke-static {p1}, Lo/dne;->c([B)Lo/dmy;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->q:Lo/dmy;

    .line 320
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressRecordIndexList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->q:Lo/dmy;

    invoke-virtual {v3}, Lo/dmy;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lo/dms;->q:Lo/dmy;

    invoke-virtual {v0}, Lo/dmy;->e()I

    move-result v0

    iput v0, p0, Lo/dms;->s:I

    .line 323
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stress frameCount :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dms;->s:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget v0, p0, Lo/dms;->s:I

    if-lez v0, :cond_4

    .line 325
    iget-object v0, p0, Lo/dms;->q:Lo/dmy;

    invoke-virtual {v0}, Lo/dmy;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->v:Ljava/util/List;

    .line 326
    iget-object v0, p0, Lo/dms;->v:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 327
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stress indexList :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->v:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    iget-object v0, p0, Lo/dms;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/dms;->z:I

    .line 329
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressIndexListSize :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dms;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    const/4 v0, 0x0

    iput v0, p0, Lo/dms;->y:I

    .line 331
    iget-object v0, p0, Lo/dms;->v:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dnf;->c(I)V

    goto :goto_0

    .line 333
    :cond_3
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no stress frame index.start to sync relax data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    invoke-direct {p0}, Lo/dms;->e()V

    goto :goto_0

    .line 338
    :cond_4
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "else : no stress frame index.start to sync relax data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    invoke-direct {p0}, Lo/dms;->e()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 345
    :goto_0
    goto :goto_1

    .line 343
    :catch_0
    move-exception v4

    .line 344
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 346
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/dms;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lo/dms;->G:Z

    return v0
.end method

.method private e()V
    .locals 7

    .line 479
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startToSyncRelaxDetailsData enter():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    invoke-direct {p0}, Lo/dms;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dms;->m:J

    .line 481
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dms;->n:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", lastSyncTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dms;->m:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    iget-wide v0, p0, Lo/dms;->m:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lo/dms;->n:J

    iget-wide v2, p0, Lo/dms;->m:J

    sub-long/2addr v0, v2

    sget-wide v2, Lo/dms;->l:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 483
    :cond_0
    iget-wide v0, p0, Lo/dms;->n:J

    sget-wide v2, Lo/dms;->l:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dms;->m:J

    .line 485
    :cond_1
    iget-wide v0, p0, Lo/dms;->m:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v5, v0

    .line 486
    iget-wide v0, p0, Lo/dms;->n:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v6, v0

    .line 487
    invoke-static {v5, v6}, Lo/dnf;->d(II)V

    .line 488
    return-void
.end method

.method static synthetic e(Lo/dms;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lo/dms;->g()V

    return-void
.end method

.method static synthetic e(Lo/dms;[B)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/dms;->a([B)V

    return-void
.end method

.method private e(Lo/dmw;)V
    .locals 13

    .line 656
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter saveRelaxDetailData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    invoke-virtual {p1}, Lo/dmw;->a()Ljava/util/List;

    move-result-object v6

    .line 658
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list size = "

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

    .line 660
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 661
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmt;

    invoke-virtual {v0}, Lo/dmt;->e()I

    move-result v7

    .line 662
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmt;

    invoke-virtual {v0}, Lo/dmt;->a()J

    move-result-wide v9

    .line 663
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmt;

    invoke-virtual {v0}, Lo/dmt;->b()I

    move-result v11

    .line 664
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmt;

    invoke-virtual {v0}, Lo/dmt;->c()I

    move-result v12

    .line 665
    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    .line 668
    :sswitch_0
    const/16 v7, 0x7e5

    .line 669
    move-object v0, p0

    move v1, v7

    move-wide v2, v9

    move v4, v11

    move v5, v12

    const/16 v1, 0x7e5

    invoke-direct/range {v0 .. v5}, Lo/dms;->d(IJII)V

    .line 660
    .line 670
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 675
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->a:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(Lo/dna;)V
    .locals 10

    .line 610
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressDetailData enter:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    invoke-virtual {p1}, Lo/dna;->a()Ljava/util/List;

    move-result-object v4

    .line 613
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 616
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmz;

    invoke-virtual {v0}, Lo/dmz;->a()J

    move-result-wide v7

    .line 617
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmz;

    invoke-virtual {v0}, Lo/dmz;->c()I

    move-result v9

    .line 618
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmz;

    invoke-virtual {v0}, Lo/dmz;->d()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 621
    :sswitch_0
    const/16 v6, 0x7e3

    .line 622
    invoke-direct {p0, v6, v7, v8, v9}, Lo/dms;->a(IJI)V

    .line 623
    goto :goto_1

    .line 626
    :sswitch_1
    const/16 v6, 0x7e4

    .line 627
    invoke-direct {p0, v6, v7, v8, v9}, Lo/dms;->a(IJI)V

    .line 614
    .line 628
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 633
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->b:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private e([B)V
    .locals 5

    .line 444
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter processRelaxRecordDetail(), data =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_2

    .line 448
    invoke-static {p1}, Lo/dne;->e([B)I

    move-result v4

    .line 449
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRelaxRecordDetail return errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 451
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x61a83

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 453
    :cond_0
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 454
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dms$e;->removeMessages(I)V

    .line 456
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->p:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 457
    return-void

    .line 459
    :cond_2
    :try_start_1
    invoke-static {p1}, Lo/dne;->b([B)Lo/dmw;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->B:Lo/dmw;

    .line 460
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxRecordDetails = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->B:Lo/dmw;

    invoke-virtual {v3}, Lo/dmw;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    iget-object v0, p0, Lo/dms;->x:Ljava/util/List;

    iget-object v1, p0, Lo/dms;->B:Lo/dmw;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxIndexProcessed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dms;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    iget v0, p0, Lo/dms;->A:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dms;->A:I

    .line 464
    iget v0, p0, Lo/dms;->A:I

    iget v1, p0, Lo/dms;->D:I

    if-ge v0, v1, :cond_3

    .line 465
    iget-object v0, p0, Lo/dms;->j:Ljava/util/List;

    iget v1, p0, Lo/dms;->A:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dnf;->b(I)V

    goto :goto_0

    .line 469
    :cond_3
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxRecordDetailsList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->x:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    invoke-direct {p0}, Lo/dms;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 475
    :goto_0
    goto :goto_1

    .line 473
    :catch_0
    move-exception v4

    .line 474
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

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

    .line 476
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/dms;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lo/dms;->I:Z

    return p1
.end method

.method private static f()V
    .locals 3

    .line 730
    sget-object v1, Lo/dms;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 731
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lo/dms;->d:Lo/dms;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 732
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 733
    :goto_0
    return-void
.end method

.method private g()V
    .locals 5

    .line 556
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRelaxDetailsListToHiHealth enter():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    iget-object v0, p0, Lo/dms;->x:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dms;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 559
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relaxRecordDetailsList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->x:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/dms;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 561
    iget-object v0, p0, Lo/dms;->x:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmw;

    invoke-direct {p0, v0}, Lo/dms;->e(Lo/dmw;)V

    .line 560
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 563
    :cond_0
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 564
    iget-object v0, p0, Lo/dms;->a:Ljava/util/List;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 565
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dms$4;

    invoke-direct {v1, p0}, Lo/dms$4;-><init>(Lo/dms;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 591
    goto/16 :goto_1

    .line 592
    :cond_1
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRelaxDetailsListToHiHealth relaxRecordDetailsList is null!end saveToHealth."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dms;->I:Z

    .line 594
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveStressSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dms;->G:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveRelaxSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dms;->I:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 596
    iget-boolean v0, p0, Lo/dms;->G:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lo/dms;->I:Z

    if-eqz v0, :cond_2

    .line 597
    iget-wide v0, p0, Lo/dms;->n:J

    invoke-direct {p0, v0, v1}, Lo/dms;->c(J)V

    .line 599
    :cond_2
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 600
    iget-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "save successful."

    const v2, 0x61a81

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 602
    :cond_3
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 603
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dms$e;->removeMessages(I)V

    .line 605
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->p:Z

    .line 607
    :goto_1
    return-void
.end method

.method private h()J
    .locals 5

    .line 702
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSyncTime enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 703
    new-instance v4, Lo/dmu;

    invoke-direct {v4}, Lo/dmu;-><init>()V

    .line 704
    invoke-virtual {v4, p0}, Lo/dmu;->a(Lo/dms;)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic i(Lo/dms;)J
    .locals 2

    .line 50
    iget-wide v0, p0, Lo/dms;->n:J

    return-wide v0
.end method

.method private i()V
    .locals 5

    .line 521
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressDetailsListToHiHealth enter():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    iget-object v0, p0, Lo/dms;->u:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dms;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 524
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressRecordDetailsList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dms;->u:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/dms;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 526
    iget-object v0, p0, Lo/dms;->u:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dna;

    invoke-direct {p0, v0}, Lo/dms;->e(Lo/dna;)V

    .line 525
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 529
    :cond_0
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 530
    iget-object v0, p0, Lo/dms;->b:Ljava/util/List;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 531
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dms$1;

    invoke-direct {v1, p0}, Lo/dms$1;-><init>(Lo/dms;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 545
    goto :goto_1

    .line 546
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dms;->G:Z

    .line 547
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStressDetailsListToHiHealth relaxRecordDetailsList is null.start save relax data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dms$e;->sendEmptyMessage(I)Z

    .line 550
    :goto_1
    return-void
.end method

.method private k()V
    .locals 4

    .line 739
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter resetAllParams():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 740
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 741
    iget-object v0, p0, Lo/dms;->i:Lo/dms$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dms$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 743
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dms;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 744
    const/4 v0, 0x0

    iput v0, p0, Lo/dms;->s:I

    .line 745
    const/4 v0, 0x0

    iput v0, p0, Lo/dms;->z:I

    .line 746
    const/4 v0, 0x0

    iput v0, p0, Lo/dms;->D:I

    .line 747
    const/4 v0, 0x0

    iput v0, p0, Lo/dms;->C:I

    .line 748
    new-instance v0, Lo/dmy;

    invoke-direct {v0}, Lo/dmy;-><init>()V

    iput-object v0, p0, Lo/dms;->q:Lo/dmy;

    .line 749
    new-instance v0, Lo/dmx;

    invoke-direct {v0}, Lo/dmx;-><init>()V

    iput-object v0, p0, Lo/dms;->w:Lo/dmx;

    .line 750
    iget-object v0, p0, Lo/dms;->u:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 751
    iget-object v0, p0, Lo/dms;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 753
    :cond_1
    iget-object v0, p0, Lo/dms;->x:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 754
    iget-object v0, p0, Lo/dms;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 756
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->G:Z

    .line 757
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->I:Z

    .line 758
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dms;->b:Ljava/util/List;

    .line 114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dms;->a:Ljava/util/List;

    .line 115
    return-void
.end method

.method public c()V
    .locals 5

    .line 494
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwstessmgr registerDeviceToHiHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    iget-object v0, p0, Lo/dms;->g:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 496
    iget-object v0, p0, Lo/dms;->g:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 497
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 498
    invoke-static {v4}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 500
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwstessmgr registerDeviceToHiHealth deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    :goto_0
    goto :goto_1

    .line 503
    :cond_1
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwstessmgr registerDeviceToHiHealth enter mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    :goto_1
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 189
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter toSyncStressDetailData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/dms;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dms$a;

    invoke-direct {v1, p0, p1}, Lo/dms$a;-><init>(Lo/dms;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 191
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 766
    iget-object v0, p0, Lo/dms;->g:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 768
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 769
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dms;->t:Ljava/lang/String;

    .line 771
    :cond_0
    iget-object v0, p0, Lo/dms;->t:Ljava/lang/String;

    return-object v0
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 718
    const/16 v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onDestroy()V
    .locals 1

    .line 723
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 724
    invoke-static {}, Lo/dms;->f()V

    .line 725
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dms;->p:Z

    .line 726
    invoke-direct {p0}, Lo/dms;->k()V

    .line 727
    return-void
.end method
