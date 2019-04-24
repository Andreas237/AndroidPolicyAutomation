.class public Lo/dde;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dde$e;
    }
.end annotation


# static fields
.field private static a:Lo/dde;

.field static d:Ljava/lang/String;

.field private static f:Lcom/huawei/datatype/DataDeviceInfo;

.field private static h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

.field private static i:Lcom/huawei/datatype/DataDeviceInfo;

.field private static k:Ljava/lang/Object;

.field private static l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lcom/huawei/datatype/CommandSend;>;>;"
        }
    .end annotation
.end field

.field private static n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[I>;"
        }
    .end annotation
.end field

.field private static p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;>;"
        }
    .end annotation
.end field

.field private static q:Ljava/lang/Object;

.field private static final v:Ljava/lang/Object;

.field private static w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Ljava/lang/String;

.field private B:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private C:Lo/djr$a;

.field private D:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private E:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private F:Z

.field private G:I

.field private H:Lo/ahg$b;

.field private I:Z

.field private J:Z

.field private volatile L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ear;>;"
        }
    .end annotation
.end field

.field private N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ear;>;"
        }
    .end annotation
.end field

.field b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private e:Landroid/content/Context;

.field private g:Lo/daz;

.field private j:Landroid/content/BroadcastReceiver;

.field private o:Landroid/os/HandlerThread;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private t:Landroid/os/Handler;

.field private final u:Ljava/lang/Object;

.field private x:Ljava/lang/String;

.field private y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private z:Lo/dqi;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 155
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dde;->k:Ljava/lang/Object;

    .line 167
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dde;->l:Ljava/util/Map;

    .line 172
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dde;->p:Ljava/util/Map;

    .line 177
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dde;->n:Ljava/util/List;

    .line 182
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dde;->m:Ljava/util/List;

    .line 199
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dde;->q:Ljava/lang/Object;

    .line 204
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dde;->v:Ljava/lang/Object;

    .line 238
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x18

    new-array v1, v1, [Ljava/lang/Integer;

    .line 239
    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 240
    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 241
    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 242
    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 243
    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 244
    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 245
    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 246
    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 247
    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 248
    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 249
    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    .line 250
    const/16 v2, 0xd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    .line 251
    const/16 v2, 0x10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xc

    aput-object v2, v1, v3

    .line 252
    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    .line 253
    const/16 v2, 0x15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xe

    aput-object v2, v1, v3

    .line 254
    const/16 v2, 0x17

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    .line 255
    const/16 v2, 0x18

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x10

    aput-object v2, v1, v3

    .line 256
    const/16 v2, 0x19

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x11

    aput-object v2, v1, v3

    .line 257
    const/16 v2, 0x1b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x12

    aput-object v2, v1, v3

    .line 258
    const/16 v2, 0x1a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x13

    aput-object v2, v1, v3

    .line 259
    const/16 v2, 0x1d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x14

    aput-object v2, v1, v3

    .line 260
    const/16 v2, 0x22

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x15

    aput-object v2, v1, v3

    .line 261
    const/16 v2, 0x23

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x16

    aput-object v2, v1, v3

    .line 262
    const/16 v2, 0x24

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x17

    aput-object v2, v1, v3

    .line 238
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lo/dde;->w:Ljava/util/List;

    .line 3783
    const-string v0, ""

    sput-object v0, Lo/dde;->d:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 309
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 142
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    iput-object v0, p0, Lo/dde;->g:Lo/daz;

    .line 187
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dde;->o:Landroid/os/HandlerThread;

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dde;->r:Ljava/util/List;

    .line 203
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/dde;->u:Ljava/lang/Object;

    .line 234
    const-string v0, ""

    iput-object v0, p0, Lo/dde;->x:Ljava/lang/String;

    .line 272
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dde;->y:Ljava/util/Map;

    .line 405
    new-instance v0, Lo/dde$2;

    invoke-direct {v0, p0}, Lo/dde$2;-><init>(Lo/dde;)V

    iput-object v0, p0, Lo/dde;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1534
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dde;->B:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2201
    new-instance v0, Lo/dde$16;

    invoke-direct {v0, p0}, Lo/dde$16;-><init>(Lo/dde;)V

    iput-object v0, p0, Lo/dde;->C:Lo/djr$a;

    .line 3620
    new-instance v0, Lo/dde$4;

    invoke-direct {v0, p0}, Lo/dde$4;-><init>(Lo/dde;)V

    iput-object v0, p0, Lo/dde;->j:Landroid/content/BroadcastReceiver;

    .line 3686
    new-instance v0, Lo/dde$3;

    invoke-direct {v0, p0}, Lo/dde$3;-><init>(Lo/dde;)V

    iput-object v0, p0, Lo/dde;->D:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 4437
    new-instance v0, Lo/dde$9;

    invoke-direct {v0, p0}, Lo/dde$9;-><init>(Lo/dde;)V

    iput-object v0, p0, Lo/dde;->H:Lo/ahg$b;

    .line 4507
    new-instance v0, Lo/dde$7;

    invoke-direct {v0, p0}, Lo/dde$7;-><init>(Lo/dde;)V

    iput-object v0, p0, Lo/dde;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 4543
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dde;->E:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 4792
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dde;->F:Z

    .line 4801
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dde;->I:Z

    .line 4808
    const/4 v0, 0x0

    iput v0, p0, Lo/dde;->G:I

    .line 4809
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dde;->L:Ljava/util/List;

    .line 4810
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dde;->N:Ljava/util/List;

    .line 4828
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dde;->J:Z

    .line 310
    iput-object p1, p0, Lo/dde;->e:Landroid/content/Context;

    .line 311
    iget-object v0, p0, Lo/dde;->o:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 312
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HWDeviceConfigManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dde;->o:Landroid/os/HandlerThread;

    .line 313
    iget-object v0, p0, Lo/dde;->o:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 314
    new-instance v0, Lo/dde$e;

    iget-object v1, p0, Lo/dde;->o:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dde$e;-><init>(Lo/dde;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    .line 317
    :cond_0
    invoke-static {p1}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/dde;->z:Lo/dqi;

    .line 318
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 319
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    :cond_1
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 324
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceConfigManager() start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    iget-object v0, p0, Lo/dde;->C:Lo/djr$a;

    invoke-static {v0}, Lo/dkt;->c(Lo/djr;)V

    .line 327
    invoke-direct {p0}, Lo/dde;->H()V

    .line 329
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 330
    const v0, 0x7fffffff

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 331
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/dde;->j:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 333
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.TIMEZONE_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/dde;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 336
    new-instance v6, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.TIME_SET"

    invoke-direct {v6, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/dde;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 339
    new-instance v7, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-direct {v7, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 340
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 341
    const v0, 0x7fffffff

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 342
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/dde;->j:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v7, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 344
    invoke-direct {p0}, Lo/dde;->A()V

    .line 347
    invoke-direct {p0}, Lo/dde;->P()V

    .line 348
    invoke-direct {p0}, Lo/dde;->J()V

    .line 349
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 350
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "support wear regist call back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    iget-object v1, p0, Lo/dde;->H:Lo/ahg$b;

    invoke-virtual {v0, v1}, Lo/ahg;->b(Lo/ahg$b;)V

    .line 353
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceConfigManager() end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    goto :goto_0

    .line 354
    :catch_0
    move-exception v4

    .line 355
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWDeviceConfigManager() e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    :cond_3
    :goto_0
    return-void
.end method

.method private A()V
    .locals 2

    .line 401
    iget-object v0, p0, Lo/dde;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 403
    return-void
.end method

.method private B()V
    .locals 2

    .line 396
    iget-object v0, p0, Lo/dde;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v1, 0x21

    invoke-virtual {p0, v1, v0}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 398
    return-void
.end method

.method private C()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1353
    const/16 v0, 0x16

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 1355
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1357
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1359
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1361
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1363
    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1365
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1368
    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1370
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1373
    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1375
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1378
    const/4 v0, 0x6

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1380
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1383
    const/4 v0, 0x7

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1385
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1388
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1390
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1393
    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1395
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1398
    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1400
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1403
    const/16 v0, 0xb

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1405
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1406
    return-object v1
.end method

.method private static declared-synchronized D()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dde;

    monitor-enter v1

    .line 2962
    :try_start_0
    sget-object v0, Lo/dde;->l:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized E()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dde;

    monitor-enter v1

    .line 2980
    :try_start_0
    sget-object v0, Lo/dde;->n:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized F()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dde;

    monitor-enter v1

    .line 2971
    :try_start_0
    sget-object v0, Lo/dde;->p:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized G()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dde;

    monitor-enter v1

    .line 2998
    :try_start_0
    sget-object v0, Lo/dde;->k:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private H()V
    .locals 4

    .line 3006
    iget-object v2, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v2

    .line 3007
    :try_start_0
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3008
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    new-instance v1, Lo/dde$17;

    invoke-direct {v1, p0}, Lo/dde$17;-><init>(Lo/dde;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3071
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 3072
    :goto_0
    return-void
.end method

.method private static declared-synchronized I()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dde;

    monitor-enter v1

    .line 2989
    :try_start_0
    sget-object v0, Lo/dde;->m:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private J()V
    .locals 9

    .line 3302
    invoke-virtual {p0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 3303
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 3304
    move-object v4, v5

    goto :goto_0

    .line 3306
    :cond_0
    invoke-virtual {p0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 3308
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_b

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 3309
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 3311
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 3314
    const/4 v0, 0x0

    if-eq v0, v6, :cond_9

    .line 3315
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetFirmwareVersion()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3317
    iget-object v0, p0, Lo/dde;->D:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p0, v0}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 3319
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() not Support GetFirmwareVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3322
    :goto_1
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3323
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const-string v1, "left_or_right_hand_wear_status"

    new-instance v2, Lo/dde$18;

    invoke-direct {v2, p0}, Lo/dde$18;-><init>(Lo/dde;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_2

    .line 3342
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() not isSupportLeftRightHandWearMode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3346
    :goto_2
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3347
    invoke-direct {p0}, Lo/dde;->L()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/dde;->e(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3351
    :cond_4
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3352
    invoke-static {}, Lo/dbf;->u()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3353
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() Support midware"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3354
    invoke-direct {p0}, Lo/dde;->w()V

    goto :goto_4

    .line 3357
    :cond_5
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dip;->e(Z)V

    .line 3358
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dip;->d(Z)V

    .line 3359
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dip;->a(Z)V

    .line 3360
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() not Support midware"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3364
    :goto_4
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPressAutoMonitor()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 3365
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reLink send press auto monitor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3366
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const-string v1, "press_auto_monitor_switch_status"

    new-instance v2, Lo/dde$19;

    invoke-direct {v2, p0}, Lo/dde$19;-><init>(Lo/dde;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3391
    :cond_6
    const/4 v0, 0x1

    new-array v7, v0, [I

    .line 3392
    new-instance v8, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v8, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 3393
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 3394
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reLink send continue heart rate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3395
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const-string v1, "continue_heart_rate"

    new-instance v2, Lo/dde$20;

    invoke-direct {v2, p0, v7, v8}, Lo/dde$20;-><init>(Lo/dde;[ILjava/util/concurrent/Semaphore;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3419
    :cond_7
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3421
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.7.28 is open. check heart rate raise remind number."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3422
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    new-instance v1, Lo/dde$22;

    invoke-direct {v1, p0, v8, v7}, Lo/dde$22;-><init>(Lo/dde;Ljava/util/concurrent/Semaphore;[I)V

    invoke-virtual {v0, v1}, Lo/dqi;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3462
    :cond_8
    goto :goto_5

    .line 3463
    :cond_9
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3466
    :cond_a
    :goto_5
    goto :goto_6

    .line 3467
    :cond_b
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3469
    :goto_6
    invoke-direct {p0}, Lo/dde;->N()I

    move-result v0

    invoke-direct {p0}, Lo/dde;->K()I

    move-result v1

    iget-object v2, p0, Lo/dde;->D:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/dde;->c(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 3470
    invoke-virtual {p0}, Lo/dde;->a()Ljava/util/List;

    move-result-object v6

    .line 3471
    const/4 v0, 0x0

    if-eq v0, v6, :cond_e

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 3472
    iget-object v0, p0, Lo/dde;->D:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {p0, v0}, Lo/dde;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3473
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3474
    const/4 v0, 0x0

    if-eq v0, v8, :cond_c

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 3475
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dde;->i(Ljava/lang/String;)V

    .line 3477
    :cond_c
    goto :goto_7

    .line 3479
    :cond_d
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const-string v1, "rotate_switch_screen"

    new-instance v2, Lo/dde$25;

    invoke-direct {v2, p0, v6}, Lo/dde$25;-><init>(Lo/dde;Ljava/util/List;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3512
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const-string v1, "auto_light_screen"

    new-instance v2, Lo/dde$5;

    invoke-direct {v2, p0, v6}, Lo/dde$5;-><init>(Lo/dde;Ljava/util/List;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3541
    new-instance v0, Lo/dde$1;

    invoke-direct {v0, p0, v6}, Lo/dde$1;-><init>(Lo/dde;Ljava/util/List;)V

    invoke-direct {p0, v0}, Lo/dde;->g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3562
    :cond_e
    return-void
.end method

.method private K()I
    .locals 8

    .line 3570
    const/4 v4, 0x2

    .line 3571
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    .line 3572
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSystemTimeFormat() mContext = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3573
    const-string v0, "time_12_24"

    invoke-static {v5, v0}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 3574
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSystemTimeFormat() strTimeFormat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3575
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 3576
    const-string v0, "24"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3577
    const/4 v4, 0x2

    goto :goto_0

    .line 3579
    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    .line 3582
    :cond_1
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v7

    .line 3583
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSystemTimeFormat() is24HourFormat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3584
    if-eqz v7, :cond_2

    .line 3585
    const/4 v4, 0x2

    goto :goto_0

    .line 3587
    :cond_2
    const/4 v4, 0x1

    .line 3590
    :goto_0
    return v4
.end method

.method private declared-synchronized L()I
    .locals 5

    monitor-enter p0

    .line 3213
    const/4 v2, 0x0

    .line 3214
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v3

    .line 3215
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3216
    const-string v3, "default_id"

    .line 3218
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "wear_push_message_key"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dde;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3219
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3220
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    .line 3221
    monitor-exit p0

    return v2

    .line 3223
    :cond_1
    monitor-exit p0

    return v2

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private static M()V
    .locals 4

    .line 3725
    sget-object v1, Lo/dde;->v:Ljava/lang/Object;

    monitor-enter v1

    .line 3726
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lo/dde;->a:Lo/dde;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3727
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 3728
    :goto_0
    invoke-static {}, Lo/dde;->G()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 3729
    const/4 v0, 0x0

    :try_start_1
    sput-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    .line 3730
    const/4 v0, 0x0

    sput-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 3731
    monitor-exit v1

    goto :goto_1

    :catchall_1
    move-exception v3

    monitor-exit v1

    throw v3

    .line 3732
    :goto_1
    return-void
.end method

.method private N()I
    .locals 7

    .line 3599
    const/4 v4, 0x1

    .line 3600
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    .line 3601
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSystemDateFormat() mContext = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3602
    const-string v0, "date_format"

    invoke-static {v5, v0}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 3603
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSystemDateFormat() strDateFormat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3604
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 3605
    const-string v0, "yy"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v6, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3606
    const/4 v4, 0x1

    goto :goto_0

    .line 3607
    :cond_0
    const-string v0, "MM"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v6, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3608
    const/4 v4, 0x2

    goto :goto_0

    .line 3609
    :cond_1
    const-string v0, "dd"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v6, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3610
    const/4 v4, 0x3

    .line 3614
    :cond_2
    :goto_0
    return v4
.end method

.method private O()V
    .locals 10

    .line 4139
    :try_start_0
    iget-object v0, p0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4140
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 4141
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 4142
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4143
    iget-object v0, p0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4144
    goto :goto_0

    .line 4145
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteUseDeviceList() \u5220\u9664\u524dusedDeviceList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4146
    iget-object v0, p0, Lo/dde;->x:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 4147
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 4148
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteUseDeviceList() \u9700\u8981\u5220\u9664\u7684\u8bbe\u5907Mac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4149
    const/4 v7, -0x1

    .line 4150
    iget-object v0, p0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4151
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteUseDeviceList() \u5217\u8868\u4e2d\u7684\u8bbe\u5907Mac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4152
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4153
    iget-object v0, p0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    .line 4155
    :cond_1
    goto :goto_1

    .line 4156
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteUseDeviceList() id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4157
    const/4 v0, -0x1

    if-eq v0, v7, :cond_3

    .line 4158
    iget-object v0, p0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 4160
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteUseDeviceList() \u5220\u9664\u540eusedDeviceList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4161
    goto :goto_2

    .line 4162
    :cond_4
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteUseDeviceList() removeDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4164
    :goto_2
    goto :goto_3

    .line 4165
    :cond_5
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteUseDeviceList() getUsedDeviceList() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4172
    :goto_3
    goto :goto_4

    .line 4167
    :catch_0
    move-exception v5

    .line 4168
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteUseDeviceList() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4170
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4173
    :goto_4
    return-void
.end method

.method private P()V
    .locals 9

    .line 4102
    invoke-virtual {p0}, Lo/dde;->q()Ljava/util/Map;

    move-result-object v4

    .line 4103
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 4104
    invoke-static {v4}, Lo/czw;->e(Ljava/util/Map;)V

    .line 4106
    :cond_0
    invoke-virtual {p0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 4107
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 4108
    invoke-direct {p0}, Lo/dde;->j()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 4109
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 4111
    invoke-static {v6}, Lo/czw;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 4113
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 4114
    const-class v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v7, v6, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v8

    .line 4115
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDeviceInfo setSharedPreference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4116
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {p0}, Lo/dde;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "kStorage_DeviceCfgMgr_Capability"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v8, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4119
    :cond_1
    invoke-static {v5}, Lo/czw;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4120
    goto :goto_0

    .line 4121
    :cond_2
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 4122
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {p0}, Lo/dde;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "kStorage_DeviceCfgMgr_Capability"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 4123
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    const-string v0, ""

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 4124
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDeviceInfo getSharedPreference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4125
    const-class v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v6, v7, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 4127
    invoke-static {v8}, Lo/czw;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 4130
    :cond_3
    :goto_0
    return-void
.end method

.method private Q()Ljava/lang/String;
    .locals 6

    .line 4196
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v4, v0

    .line 4198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v4, 0x18

    .line 4199
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v4, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 4200
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v4, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 4201
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v4, 0xff

    .line 4202
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4203
    return-object v5
.end method

.method private R()Ljava/lang/String;
    .locals 8

    .line 4208
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    .line 4209
    invoke-virtual {v2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    div-int/lit16 v0, v0, 0xe10

    div-int/lit16 v3, v0, 0x3e8

    .line 4211
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result v4

    .line 4212
    if-eqz v4, :cond_0

    .line 4213
    invoke-virtual {v2}, Ljava/util/TimeZone;->getDSTSavings()I

    move-result v0

    div-int/lit16 v0, v0, 0xe10

    div-int/lit16 v0, v0, 0x3e8

    add-int/2addr v3, v0

    .line 4216
    :cond_0
    invoke-virtual {v2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    div-int/lit16 v0, v0, 0xe10

    rem-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    div-int/lit16 v5, v0, 0x3e8

    .line 4217
    const/4 v6, 0x0

    .line 4218
    if-gez v3, :cond_1

    .line 4219
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x80

    shl-int/lit8 v3, v0, 0x8

    goto :goto_0

    .line 4221
    :cond_1
    shl-int/lit8 v3, v3, 0x8

    .line 4224
    :goto_0
    add-int v6, v3, v5

    .line 4227
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v1, v6, 0x8

    .line 4228
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v6, 0xff

    .line 4229
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 4230
    return-object v7
.end method

.method private static declared-synchronized S()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dde;

    monitor-enter v1

    .line 4133
    :try_start_0
    sget-object v0, Lo/dde;->q:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private T()V
    .locals 4

    .line 4986
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter updatePluginForWear size\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4987
    iget-object v0, p0, Lo/dde;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4988
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 4989
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dde;->e(I)V

    .line 4991
    :cond_0
    return-void
.end method

.method private U()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/ear;>;"
        }
    .end annotation

    .line 5041
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5042
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ear;

    .line 5043
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5044
    goto :goto_0

    .line 5045
    :cond_0
    return-object v1
.end method

.method private W()V
    .locals 1

    .line 5030
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 5031
    return-void
.end method

.method private X()I
    .locals 5

    .line 4351
    const/4 v4, 0x1

    .line 4352
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->u(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4353
    const/4 v4, 0x2

    .line 4355
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHWHealthStatus() flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4356
    return v4
.end method

.method static synthetic a(Lo/dde;[B)I
    .locals 1

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->a([B)I

    move-result v0

    return v0
.end method

.method private a([B)I
    .locals 3

    .line 2931
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 2932
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/datatype/DataDeviceInfo;)Lcom/huawei/datatype/DataDeviceInfo;
    .locals 0

    .line 117
    sput-object p0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    return-object p0
.end method

.method static synthetic a(Lo/dde;)Lo/djr$a;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->C:Lo/djr$a;

    return-object v0
.end method

.method private a(I)V
    .locals 8

    .line 4722
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " enter handleDefaultSwitch result :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4723
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 4724
    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 4725
    const-string v0, "core_sleep_button"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4727
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set CoreSleep switch open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4729
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    const/16 v1, 0x272e

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "core_sleep_Default"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4737
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 4738
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DEFAULT_SWITCH"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4739
    const-string v0, "coreSleep_value"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 4740
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 4741
    goto :goto_0

    .line 4744
    :cond_0
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    const/16 v1, 0x272e

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "core_sleep_Default"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4747
    :goto_0
    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 4748
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dde;->I:Z

    .line 4749
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "support continue heart rate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4751
    const-string v0, "continue_heart_rate"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4752
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dfj;->g(I)V

    .line 4754
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    new-instance v1, Lo/dde$8;

    invoke-direct {v1, p0}, Lo/dde$8;-><init>(Lo/dde;)V

    invoke-virtual {v0, v1}, Lo/dqi;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4775
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 4776
    const-string v0, "com.huawei.bone.action.CONTINUE_HEART_RATE_SWITCH"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4777
    const-string v0, "continue_heart_rate_value"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 4778
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 4779
    goto :goto_1

    .line 4780
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dde;->I:Z

    .line 4782
    :goto_1
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    new-instance v1, Lo/dde$10;

    invoke-direct {v1, p0}, Lo/dde$10;-><init>(Lo/dde;)V

    invoke-virtual {v0, v6, v1}, Lo/dqi;->b(Ljava/util/Map;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4788
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ear;>;)V"
        }
    .end annotation

    .line 4932
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter checkIsNeedUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4933
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ear;

    .line 4935
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4937
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dde$15;

    invoke-direct {v2, p0, v5}, Lo/dde$15;-><init>(Lo/dde;Lo/ear;)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->c(Ljava/lang/String;Lo/eaz;)V

    .line 4947
    :cond_0
    goto :goto_0

    .line 4948
    :cond_1
    invoke-direct {p0}, Lo/dde;->U()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 4950
    invoke-direct {p0}, Lo/dde;->U()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dde;->g(Ljava/util/List;)V

    .line 4952
    :cond_2
    return-void
.end method

.method static synthetic a(Lo/dde;I)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->e(I)V

    return-void
.end method

.method static synthetic a(Lo/dde;Ljava/lang/String;I[B)V
    .locals 0

    .line 117
    invoke-direct {p0, p1, p2, p3}, Lo/dde;->e(Ljava/lang/String;I[B)V

    return-void
.end method

.method private a(Lo/ear;)V
    .locals 1

    .line 5033
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5034
    return-void
.end method

.method static synthetic b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->D:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private declared-synchronized b(Ljava/lang/String;Z)V
    .locals 6

    monitor-enter p0

    .line 3232
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setRotateSwitchScreenSwitchStatus() :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3233
    invoke-virtual {p0, p1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 3234
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 3235
    const/4 v5, 0x0

    .line 3237
    if-eqz p2, :cond_0

    .line 3238
    const/4 v5, 0x1

    .line 3243
    :cond_0
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3244
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->b(Ljava/lang/String;)V

    .line 3246
    :cond_1
    goto :goto_0

    .line 3247
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRotateSwitchScreenSwitchStatus() : deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3249
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 3098
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 3099
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDeviceAvoidDisturbingToDB()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3100
    new-instance v5, Lcom/huawei/datatype/DBObject;

    invoke-direct {v5}, Lcom/huawei/datatype/DBObject;-><init>()V

    .line 3101
    invoke-virtual {v5, p2}, Lcom/huawei/datatype/DBObject;->setiBaseResponseCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3102
    invoke-virtual {v5, p1}, Lcom/huawei/datatype/DBObject;->setObject(Ljava/lang/Object;)V

    .line 3103
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 3104
    const/4 v0, 0x2

    iput v0, v6, Landroid/os/Message;->what:I

    .line 3105
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 3106
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3107
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 3108
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/dde;I)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->a(I)V

    return-void
.end method

.method static synthetic b(Lo/dde;Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 117
    invoke-direct/range {p0 .. p5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic b(Lo/dde;Ljava/lang/String;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->f(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lo/dde;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1, p2}, Lo/dde;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic b(Lo/dde;[B)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->b([B)V

    return-void
.end method

.method private b(Lo/ear;)V
    .locals 1

    .line 5036
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5037
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 5039
    :cond_0
    return-void
.end method

.method private b([B)V
    .locals 17

    .line 426
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter procResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    new-instance v5, Lo/daz;

    invoke-direct {v5}, Lo/daz;-><init>()V

    .line 428
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 429
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_9

    .line 430
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 431
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter procResult + tlvString:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    const/4 v8, 0x0

    .line 434
    :try_start_0
    invoke-virtual {v5, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 435
    iget-object v9, v8, Lo/dba;->b:Ljava/util/List;

    .line 436
    if-eqz v9, :cond_8

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 437
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 438
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 439
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 440
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_5

    .line 442
    :sswitch_0
    invoke-static {}, Lo/dbf;->u()Z

    move-result v0

    if-nez v0, :cond_0

    .line 443
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MiddleWear not Suport Health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dip;->e(Z)V

    .line 445
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dip;->d(Z)V

    .line 446
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dip;->a(Z)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 447
    return-void

    .line 449
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MID_WIRE_NOTIFICATION value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    div-int/lit16 v15, v0, 0x100

    .line 451
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    rem-int/lit16 v1, v0, 0x100

    move/from16 v16, v1

    .line 452
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MID_WIRE_NOTIFICATION type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    const/4 v0, 0x1

    if-ne v15, v0, :cond_2

    .line 454
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    if-nez v16, :cond_1

    const/4 v1, 0x1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Lo/dip;->e(Z)V

    goto :goto_5

    .line 455
    :cond_2
    const/4 v0, 0x2

    if-ne v15, v0, :cond_4

    .line 456
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    if-nez v16, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lo/dip;->d(Z)V

    goto :goto_5

    .line 457
    :cond_4
    const/4 v0, 0x3

    if-ne v15, v0, :cond_6

    .line 458
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    if-nez v16, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lo/dip;->a(Z)V
    :try_end_1
    .catch Lo/day; {:try_start_1 .. :try_end_1} :catch_0

    .line 464
    :cond_6
    :goto_5
    goto/16 :goto_1

    .line 465
    :cond_7
    goto/16 :goto_0

    .line 469
    :cond_8
    goto :goto_6

    .line 467
    :catch_0
    move-exception v9

    .line 468
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportedCommand() tlv resolve exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    :goto_6
    new-instance v9, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v9}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 472
    const/16 v0, 0x21

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 473
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 474
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7f

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/32 v1, 0x186a0

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 475
    invoke-static {v10}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v11

    .line 476
    array-length v0, v11

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 477
    invoke-virtual {v9, v11}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 478
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 481
    :cond_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public static b(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 963
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/ahg;->c(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    .line 964
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 965
    const/4 v0, 0x1

    return v0

    .line 967
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/datatype/DataDeviceInfo;)Lcom/huawei/datatype/DataDeviceInfo;
    .locals 0

    .line 117
    sput-object p0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    return-object p0
.end method

.method static synthetic c(Lcom/huawei/datatype/DataDeviceIntelligentInfo;)Lcom/huawei/datatype/DataDeviceIntelligentInfo;
    .locals 0

    .line 117
    sput-object p0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    return-object p0
.end method

.method private c([BLjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 2833
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "caseForNotAw70Device enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2834
    invoke-static {}, Lo/dde;->G()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 2835
    :try_start_0
    new-instance v0, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-direct {v0}, Lcom/huawei/datatype/DataDeviceInfo;-><init>()V

    sput-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    .line 2836
    invoke-virtual {p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 2837
    const-string v5, ""

    .line 2838
    array-length v0, p1

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const/4 v0, 0x2

    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_0

    .line 2839
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getResult() get V0 device version info timeout."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2841
    :cond_0
    invoke-direct {p0, p1}, Lo/dde;->c([B)Ljava/lang/String;

    move-result-object v5

    .line 2843
    :goto_0
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v0, v5}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_soft_version(Ljava/lang/String;)V

    .line 2844
    sget-object p2, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    .line 2845
    goto :goto_1

    .line 2846
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/dde;->d([BLjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object p2

    .line 2848
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 2849
    :goto_2
    return-object p2
.end method

.method private c([B)Ljava/lang/String;
    .locals 14

    .line 3741
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getV0DeviceVersion()."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3742
    const-string v5, ""

    .line 3744
    const/16 v6, 0xe

    .line 3745
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 3746
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Parameter is incorrect."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3747
    return-object v5

    .line 3750
    :cond_0
    array-length v0, p1

    if-eq v6, v0, :cond_1

    .line 3751
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "V0 device version info is incorrect."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3752
    return-object v5

    .line 3755
    :cond_1
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 3756
    const/4 v0, 0x6

    const/16 v1, 0x8

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 3757
    const/16 v0, 0x8

    const/16 v1, 0xa

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 3758
    const/16 v0, 0xa

    const/16 v1, 0xe

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 3759
    const/16 v0, 0xe

    const/16 v1, 0x12

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v11

    .line 3760
    const/16 v0, 0x12

    const/16 v1, 0x16

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    .line 3761
    const/16 v0, 0x16

    const/16 v1, 0x1a

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 3762
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit8 v1, v8, 0x64

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%02X."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%02X."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 3763
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%02X."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%02X"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3765
    return-object v5
.end method

.method static synthetic c(Lo/dde;)Lo/dqi;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    return-object v0
.end method

.method private c(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 12

    .line 1121
    invoke-virtual {p0}, Lo/dde;->a()Ljava/util/List;

    move-result-object v6

    .line 1122
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1123
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1124
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1125
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v9

    .line 1126
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportTimeSetting()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1127
    const-string v0, "03"

    const-string v1, "HWDeviceConfigManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDeviceDateDisplayFormat"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    new-instance v10, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v10}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1129
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1130
    const/4 v0, 0x4

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1131
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1133
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v11

    .line 1136
    const/16 v0, -0x7f

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1138
    const/4 v0, 0x6

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1141
    const/4 v0, 0x2

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1143
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1145
    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1148
    const/4 v0, 0x3

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1150
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1152
    invoke-static {p2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1154
    move-object v0, p0

    move-object v1, v10

    move-object v2, v11

    move-object v4, p3

    move/from16 v5, p4

    const/4 v3, 0x4

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1155
    goto :goto_1

    .line 1156
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() not Support TimeSetting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1159
    :cond_1
    :goto_1
    goto/16 :goto_0

    .line 1161
    :cond_2
    return-void
.end method

.method private c(Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 4

    .line 386
    new-instance v2, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 387
    const/16 v0, 0x21

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 388
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 389
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, p1, v1}, Lo/dip;->c(Ljava/lang/Boolean;Z)[B

    move-result-object v3

    .line 390
    array-length v0, v3

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 391
    invoke-virtual {v2, v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 392
    invoke-virtual {p0, v2}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 393
    return-void
.end method

.method private c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 3080
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 3081
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDeviceAvoidDisturbingToDB()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3082
    new-instance v5, Lcom/huawei/datatype/DBObject;

    invoke-direct {v5}, Lcom/huawei/datatype/DBObject;-><init>()V

    .line 3083
    invoke-virtual {v5, p2}, Lcom/huawei/datatype/DBObject;->setiBaseResponseCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3084
    invoke-virtual {v5, p1}, Lcom/huawei/datatype/DBObject;->setObject(Ljava/lang/Object;)V

    .line 3085
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 3086
    const/4 v0, 0x1

    iput v0, v6, Landroid/os/Message;->what:I

    .line 3087
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 3088
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3089
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 3090
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/dde;IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 117
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dde;->c(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic c(Lo/dde;Z)Z
    .locals 0

    .line 117
    iput-boolean p1, p0, Lo/dde;->J:Z

    return p1
.end method

.method private d([BLjava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 2855
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 2856
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 2858
    :try_start_0
    iget-object v0, p0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 2859
    iget-object v0, v6, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/daw;

    .line 2860
    invoke-virtual {v8}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 2862
    :pswitch_0
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setBT_version(Ljava/lang/String;)V

    .line 2863
    goto/16 :goto_1

    .line 2866
    :pswitch_1
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_type(I)V

    .line 2867
    goto/16 :goto_1

    .line 2870
    :pswitch_2
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_version(Ljava/lang/String;)V

    .line 2871
    goto/16 :goto_1

    .line 2874
    :pswitch_3
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_phone_numbe(Ljava/lang/String;)V

    .line 2875
    goto/16 :goto_1

    .line 2878
    :pswitch_4
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_bt_mac(Ljava/lang/String;)V

    .line 2879
    goto/16 :goto_1

    .line 2882
    :pswitch_5
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_imei(Ljava/lang/String;)V

    .line 2883
    goto/16 :goto_1

    .line 2886
    :pswitch_6
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_soft_version(Ljava/lang/String;)V

    .line 2888
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v9

    .line 2889
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2890
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->c(Ljava/lang/String;)V

    .line 2891
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "support OTA ,set device version :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 2896
    :pswitch_7
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_opensource_version(Ljava/lang/String;)V

    .line 2897
    goto :goto_1

    .line 2900
    :pswitch_8
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_sn(Ljava/lang/String;)V

    .line 2901
    goto :goto_1

    .line 2904
    :pswitch_9
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_model(Ljava/lang/String;)V

    .line 2905
    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dde;->A:Ljava/lang/String;

    .line 2906
    goto :goto_1

    .line 2909
    :pswitch_a
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_emmc_id(Ljava/lang/String;)V

    .line 2910
    .line 2916
    :cond_0
    :goto_1
    goto/16 :goto_0

    .line 2917
    :cond_1
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-object p2, v0

    .line 2920
    goto :goto_2

    .line 2918
    :catch_0
    move-exception v6

    .line 2919
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2921
    :goto_2
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public static d(Landroid/content/Context;)Lo/dde;
    .locals 7

    .line 291
    invoke-static {}, Lo/dde;->F()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 292
    :try_start_0
    sget-object v0, Lo/dde;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 293
    sget-object v0, Lo/dde;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 294
    sget-object v0, Lo/dde;->p:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
    goto :goto_0

    .line 297
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 299
    :goto_1
    sget-object v2, Lo/dde;->v:Ljava/lang/Object;

    monitor-enter v2

    .line 300
    :try_start_1
    sget-object v0, Lo/dde;->a:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 301
    new-instance v0, Lo/dde;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dde;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dde;->a:Lo/dde;

    .line 303
    :cond_1
    sget-object v0, Lo/dde;->a:Lo/dde;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    return-object v0

    .line 304
    :catchall_1
    move-exception v6

    monitor-exit v2

    throw v6
.end method

.method private d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 5

    .line 1084
    invoke-static {}, Lo/dde;->F()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 1085
    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    if-eqz p5, :cond_0

    .line 1086
    :try_start_0
    sget-object v0, Lo/dde;->p:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 1087
    invoke-interface {v3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1089
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 1090
    :goto_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1091
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1092
    invoke-virtual {p0, p1}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1093
    return-void
.end method

.method static synthetic d(Lo/dde;)V
    .locals 0

    .line 117
    invoke-direct {p0}, Lo/dde;->J()V

    return-void
.end method

.method static synthetic d(Lo/dde;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic d(Lo/dde;Ljava/lang/String;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->k(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/dde;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1, p2}, Lo/dde;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method private declared-synchronized d(Z)V
    .locals 6

    monitor-enter p0

    .line 3278
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLeftRightHandStateToSharedPreference() :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3279
    invoke-virtual {p0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 3280
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 3281
    const/4 v5, 0x0

    .line 3282
    if-eqz p1, :cond_0

    .line 3283
    const/4 v5, 0x1

    .line 3288
    :cond_0
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3289
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->f(Ljava/lang/String;)V

    .line 3291
    :cond_1
    goto :goto_0

    .line 3292
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLeftRightHandStateToSharedPreference() : deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3294
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic e(Lo/dde;I)I
    .locals 0

    .line 117
    iput p1, p0, Lo/dde;->G:I

    return p1
.end method

.method private e([B)Ljava/lang/Object;
    .locals 9

    .line 2764
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "caseForAw70Device enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2765
    new-instance v0, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-direct {v0}, Lcom/huawei/datatype/DataDeviceInfo;-><init>()V

    sput-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    .line 2768
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 2769
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 2771
    :try_start_0
    iget-object v0, p0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 2772
    iget-object v0, v6, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/daw;

    .line 2773
    invoke-virtual {v8}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 2775
    :pswitch_0
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setBT_version(Ljava/lang/String;)V

    .line 2776
    goto/16 :goto_1

    .line 2779
    :pswitch_1
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_type(I)V

    .line 2780
    goto/16 :goto_1

    .line 2783
    :pswitch_2
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_version(Ljava/lang/String;)V

    .line 2784
    goto/16 :goto_1

    .line 2787
    :pswitch_3
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_phone_numbe(Ljava/lang/String;)V

    .line 2788
    goto/16 :goto_1

    .line 2791
    :pswitch_4
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_bt_mac(Ljava/lang/String;)V

    .line 2792
    goto/16 :goto_1

    .line 2795
    :pswitch_5
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_imei(Ljava/lang/String;)V

    .line 2796
    goto :goto_1

    .line 2799
    :pswitch_6
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_soft_version(Ljava/lang/String;)V

    .line 2800
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->k(Ljava/lang/String;)V

    .line 2801
    goto :goto_1

    .line 2804
    :pswitch_7
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_opensource_version(Ljava/lang/String;)V

    .line 2805
    goto :goto_1

    .line 2808
    :pswitch_8
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_sn(Ljava/lang/String;)V

    .line 2809
    goto :goto_1

    .line 2812
    :pswitch_9
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_model(Ljava/lang/String;)V

    .line 2813
    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dde;->A:Ljava/lang/String;

    .line 2814
    goto :goto_1

    .line 2817
    :pswitch_a
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceInfo;->setDevice_emmc_id(Ljava/lang/String;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 2818
    .line 2824
    :goto_1
    goto/16 :goto_0

    .line 2827
    :cond_0
    goto :goto_2

    .line 2825
    :catch_0
    move-exception v6

    .line 2826
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2829
    :goto_2
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private e(I)V
    .locals 4

    .line 4997
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter downloadOnePlugin uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ear;

    invoke-virtual {v3}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4998
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    iget-object v1, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ear;

    invoke-virtual {v1}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dde$11;

    invoke-direct {v2, p0, p1}, Lo/dde$11;-><init>(Lo/dde;I)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->d(Ljava/lang/String;Lo/eaz;)V

    .line 5028
    return-void
.end method

.method private e(ILcom/huawei/datatype/WearableOpenAppInfo;)V
    .locals 8

    .line 4273
    iget-object v0, p0, Lo/dde;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 4275
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 4276
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 4277
    const/16 v0, 0x17

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 4279
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 4280
    const/16 v0, 0x7f

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 4281
    const/4 v0, 0x4

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 4282
    const-wide/32 v0, 0x186a0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4284
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 4285
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 4287
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    const/16 v3, 0x17

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 4288
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openApp() callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4289
    return-void
.end method

.method private e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 5

    .line 3985
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 3986
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter generateConnectedMessage !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3988
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v4

    .line 3990
    const-string v0, "device"

    const-string v1, "device_type_connected"

    new-instance v2, Lo/dde$6;

    invoke-direct {v2, p0, v4, p1}, Lo/dde$6;-><init>(Lo/dde;Lo/eaa;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    invoke-virtual {v4, v0, v1, v2}, Lo/eaa;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4095
    goto :goto_0

    .line 4096
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateConnectedMessage fail, btDeviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4098
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;I[B)V
    .locals 30

    .line 2272
    const/4 v5, 0x0

    .line 2275
    const/4 v0, 0x1

    aget-byte v0, p3, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_25

    .line 2278
    :pswitch_0
    move-object/from16 v0, p3

    array-length v0, v0

    add-int/lit8 v0, v0, -0x4

    new-array v8, v0, [B

    .line 2279
    array-length v0, v8

    move-object/from16 v1, p3

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v1, v2, v8, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2281
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 2282
    const/4 v11, 0x0

    .line 2283
    invoke-static {}, Lo/dde;->E()Ljava/lang/Object;

    move-result-object v12

    monitor-enter v12

    .line 2284
    :try_start_0
    sget-object v0, Lo/dde;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2285
    sget-object v0, Lo/dde;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2287
    :cond_0
    monitor-exit v12

    goto :goto_0

    :catchall_0
    move-exception v13

    monitor-exit v12

    throw v13

    .line 2288
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    .line 2289
    const/4 v12, 0x0

    :goto_1
    array-length v0, v8

    if-ge v12, v0, :cond_1

    .line 2290
    aget-byte v0, v8, v12

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 2292
    :sswitch_0
    const/4 v9, 0x0

    .line 2293
    goto :goto_3

    .line 2296
    :goto_2
    const/4 v9, 0x1

    .line 2300
    :goto_3
    aget v0, v11, v12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2289
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 2303
    :cond_1
    move-object v5, v10

    .line 2304
    invoke-static {}, Lo/dde;->E()Ljava/lang/Object;

    move-result-object v12

    monitor-enter v12

    .line 2305
    :try_start_1
    sget-object v0, Lo/dde;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 2306
    sget-object v0, Lo/dde;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2308
    :cond_2
    monitor-exit v12

    goto :goto_4

    :catchall_1
    move-exception v14

    monitor-exit v12

    throw v14

    .line 2309
    :goto_4
    goto/16 :goto_25

    .line 2313
    :pswitch_1
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 2314
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2315
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 2317
    move-object/from16 v0, p0

    :try_start_2
    iget-object v0, v0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v9

    .line 2318
    const/4 v10, 0x0

    .line 2319
    const/4 v11, 0x0

    .line 2320
    const/4 v12, 0x0

    .line 2321
    invoke-static {}, Lo/dde;->I()Ljava/lang/Object;

    move-result-object v13

    monitor-enter v13
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_0

    .line 2322
    :try_start_3
    sget-object v0, Lo/dde;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2323
    sget-object v0, Lo/dde;->m:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 2325
    :cond_3
    monitor-exit v13

    goto :goto_5

    :catchall_2
    move-exception v15

    monitor-exit v13

    :try_start_4
    throw v15

    .line 2326
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v12, :cond_9

    .line 2327
    iget-object v13, v9, Lo/dba;->b:Ljava/util/List;

    .line 2328
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dba;

    .line 2329
    iget-object v0, v15, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/daw;

    .line 2330
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/datatype/CommandSend;

    .line 2331
    invoke-virtual/range {v17 .. v17}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto/16 :goto_a

    .line 2333
    :sswitch_1
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 2334
    goto/16 :goto_a

    .line 2337
    :sswitch_2
    new-instance v19, Lcom/huawei/datatype/CommandResponse;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/datatype/CommandResponse;-><init>()V

    .line 2338
    move-object/from16 v0, v19

    invoke-virtual {v0, v10}, Lcom/huawei/datatype/CommandResponse;->setServiceID(I)V

    .line 2339
    new-instance v20, Ljava/util/HashMap;

    invoke-direct/range {v20 .. v20}, Ljava/util/HashMap;-><init>()V

    .line 2340
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v21

    .line 2341
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_5

    .line 2342
    const/16 v22, 0x0

    .line 2343
    const/16 v23, 0x0

    :goto_8
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_5

    .line 2344
    add-int/lit8 v0, v23, 0x2

    move-object/from16 v1, v21

    move/from16 v2, v23

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 2345
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/datatype/CommandSend;->getCommandIDs()Ljava/util/List;

    move-result-object v0

    move/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 2347
    :cond_4
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/datatype/CommandSend;->getCommandIDs()Ljava/util/List;

    move-result-object v0

    move/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2349
    :goto_9
    add-int/lit8 v22, v22, 0x1

    .line 2343
    add-int/lit8 v23, v23, 0x2

    goto :goto_8

    .line 2352
    :cond_5
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/CommandResponse;->setFlags(Ljava/util/Map;)V

    .line 2353
    move-object/from16 v0, v19

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2354
    .line 2360
    :goto_a
    goto/16 :goto_7

    .line 2361
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 2362
    goto/16 :goto_6

    .line 2363
    :cond_7
    move-object v5, v8

    .line 2364
    invoke-static {}, Lo/dde;->I()Ljava/lang/Object;

    move-result-object v14

    monitor-enter v14
    :try_end_4
    .catch Lo/day; {:try_start_4 .. :try_end_4} :catch_0

    .line 2365
    :try_start_5
    sget-object v0, Lo/dde;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 2366
    sget-object v0, Lo/dde;->m:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 2368
    :cond_8
    monitor-exit v14

    goto :goto_b

    :catchall_3
    move-exception v24

    monitor-exit v14

    :try_start_6
    throw v24
    :try_end_6
    .catch Lo/day; {:try_start_6 .. :try_end_6} :catch_0

    .line 2369
    :goto_b
    goto :goto_c

    .line 2370
    :cond_9
    const/4 v5, 0x0

    .line 2374
    :goto_c
    goto/16 :goto_25

    .line 2372
    :catch_0
    move-exception v9

    .line 2373
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COMMAND_ID_COMMAND_CAPABILITY_NEGOTIATION error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2375
    goto/16 :goto_25

    .line 2379
    :pswitch_2
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2380
    goto/16 :goto_25

    .line 2384
    :pswitch_3
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2385
    goto/16 :goto_25

    .line 2389
    :pswitch_4
    new-instance v8, Lcom/huawei/datatype/DataGMTTime;

    invoke-direct {v8}, Lcom/huawei/datatype/DataGMTTime;-><init>()V

    .line 2390
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 2391
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 2393
    move-object/from16 v0, p0

    :try_start_7
    iget-object v0, v0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v9

    .line 2394
    iget-object v0, v9, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/daw;

    .line 2395
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto :goto_e

    .line 2397
    :sswitch_3
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/datatype/DataGMTTime;->setTime(J)V

    .line 2398
    goto :goto_e

    .line 2401
    :sswitch_4
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    mul-int/lit8 v12, v0, 0x64

    .line 2402
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 2403
    add-int v0, v12, v13

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/DataGMTTime;->setTimeZone(I)V
    :try_end_7
    .catch Lo/day; {:try_start_7 .. :try_end_7} :catch_1

    .line 2404
    .line 2410
    :goto_e
    goto/16 :goto_d

    .line 2411
    :cond_a
    move-object v5, v8

    .line 2414
    goto/16 :goto_25

    .line 2412
    :catch_1
    move-exception v9

    .line 2413
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COMMAND_ID_GET_DATE error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2415
    goto/16 :goto_25

    .line 2419
    :pswitch_5
    invoke-virtual/range {p0 .. p0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v8

    .line 2420
    invoke-virtual/range {p0 .. p0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v9

    .line 2421
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_b

    const/4 v0, 0x0

    if-eq v0, v8, :cond_b

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2422
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1, v5}, Lo/dde;->c([BLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_25

    .line 2423
    :cond_b
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_24

    const/4 v0, 0x0

    if-eq v0, v9, :cond_24

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 2424
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->e([B)Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_25

    .line 2430
    :pswitch_6
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 2431
    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2432
    invoke-virtual/range {p0 .. p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_f

    .line 2433
    move-object/from16 v0, p3

    array-length v0, v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_c

    const/4 v0, 0x2

    aget-byte v0, p3, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_c

    .line 2434
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2435
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getResult() get V0 battery level timeout."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_25

    .line 2437
    :cond_c
    const/16 v0, 0xe

    aget-byte v0, p3, v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_d

    const/16 v0, 0x64

    goto :goto_f

    :cond_d
    const/16 v0, 0xe

    aget-byte v0, p3, v0

    :goto_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2438
    invoke-static/range {p2 .. p2}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_e

    .line 2439
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dke;->c(I)V

    .line 2441
    :cond_e
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/dke;->d(Ljava/lang/String;I)V

    .line 2442
    const-string v0, "BATTERY_LEVEL"

    move-object v1, v5

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2443
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dde;->e:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_25

    .line 2447
    :cond_f
    move-object/from16 v0, p3

    array-length v0, v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_10

    const/4 v0, 0x2

    aget-byte v0, p3, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_10

    .line 2448
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2449
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getResult() get !V0 battery level timeout."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_25

    .line 2452
    :cond_10
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    :try_start_8
    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v9

    .line 2453
    const/16 v0, 0x64

    if-le v9, v0, :cond_11

    const/16 v0, 0x64

    goto :goto_10

    :cond_11
    move v0, v9

    :goto_10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_2

    move-result-object v5

    .line 2457
    goto :goto_11

    .line 2454
    :catch_2
    move-exception v9

    .line 2455
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2456
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2458
    :goto_11
    invoke-static/range {p2 .. p2}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_12

    .line 2459
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dke;->c(I)V

    .line 2461
    :cond_12
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/dke;->d(Ljava/lang/String;I)V

    .line 2462
    const-string v0, "BATTERY_LEVEL"

    move-object v1, v5

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2463
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dde;->e:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 2469
    goto/16 :goto_25

    .line 2473
    :pswitch_7
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2474
    goto/16 :goto_25

    .line 2478
    :pswitch_8
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2479
    goto/16 :goto_25

    .line 2483
    :pswitch_9
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2484
    goto/16 :goto_25

    .line 2488
    :pswitch_a
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2489
    goto/16 :goto_25

    .line 2493
    :pswitch_b
    invoke-virtual/range {p0 .. p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_19

    .line 2495
    const v8, 0x186a1

    .line 2496
    move-object/from16 v0, p3

    array-length v0, v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_13

    const/4 v0, 0x2

    aget-byte v0, p3, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_13

    .line 2497
    const v8, 0x186a9

    goto/16 :goto_14

    .line 2500
    :cond_13
    const/4 v9, 0x3

    .line 2501
    move-object/from16 v0, p3

    array-length v0, v0

    if-ne v9, v0, :cond_18

    .line 2502
    const/4 v0, 0x2

    aget-byte v8, p3, v0

    .line 2503
    const/4 v0, 0x0

    if-ne v0, v8, :cond_15

    .line 2504
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "V0 Device factory reset success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2505
    const v8, 0x186a0

    .line 2507
    :try_start_9
    invoke-static {}, Lo/dde;->S()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_3

    .line 2508
    :try_start_a
    invoke-direct/range {p0 .. p0}, Lo/dde;->O()V

    .line 2509
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_12
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2510
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult() V0 \u5217\u8868\u4e2d\u7684\u8bbe\u5907Mac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2511
    goto :goto_12

    .line 2512
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dde;->r:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/dde;->d(Ljava/util/List;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 2513
    monitor-exit v10

    goto :goto_13

    :catchall_4
    move-exception v25

    monitor-exit v10

    :try_start_b
    throw v25
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_b} :catch_3

    .line 2519
    :goto_13
    goto :goto_14

    .line 2514
    :catch_3
    move-exception v10

    .line 2515
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult() setUsedDeviceList error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2517
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 2519
    goto :goto_14

    .line 2520
    :cond_15
    const/4 v0, 0x1

    if-ne v0, v8, :cond_16

    .line 2521
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "V0 Device factory reset fail for time remove."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_14

    .line 2522
    :cond_16
    const/4 v0, 0x2

    if-ne v0, v8, :cond_17

    .line 2523
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "V0 Device factory reset fail for flash remove."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_14

    .line 2525
    :cond_17
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "V0 Device factory reset fail for unknown."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2530
    :cond_18
    :goto_14
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2531
    goto/16 :goto_25

    .line 2532
    :cond_19
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v8

    .line 2533
    const v0, 0x186a0

    if-ne v0, v8, :cond_1a

    .line 2535
    :try_start_c
    invoke-static {}, Lo/dde;->S()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_4

    .line 2536
    :try_start_d
    invoke-direct/range {p0 .. p0}, Lo/dde;->O()V

    .line 2537
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult() V2 usedDeviceList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/dde;->r:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2538
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dde;->r:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/dde;->d(Ljava/util/List;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 2539
    monitor-exit v9

    goto :goto_15

    :catchall_5
    move-exception v26

    monitor-exit v9

    :try_start_e
    throw v26
    :try_end_e
    .catch Landroid/os/RemoteException; {:try_start_e .. :try_end_e} :catch_4

    .line 2545
    :goto_15
    goto :goto_16

    .line 2540
    :catch_4
    move-exception v9

    .line 2541
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult() setUsedDeviceList error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2543
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 2547
    :cond_1a
    :goto_16
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2549
    goto/16 :goto_25

    .line 2553
    :pswitch_c
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 2554
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 2555
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2557
    const/4 v9, 0x0

    .line 2559
    move-object/from16 v0, p0

    :try_start_f
    iget-object v0, v0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v10

    .line 2560
    iget-object v0, v10, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_17
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/daw;

    .line 2561
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_1b

    .line 2562
    const/4 v9, 0x1

    goto :goto_18

    .line 2564
    :cond_1b
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_f
    .catch Lo/day; {:try_start_f .. :try_end_f} :catch_5

    .line 2566
    :goto_18
    goto :goto_17

    .line 2569
    :cond_1c
    goto :goto_19

    .line 2567
    :catch_5
    move-exception v10

    .line 2568
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult() getHandsetInfo error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2570
    :goto_19
    if-nez v9, :cond_24

    .line 2571
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/dde;->e(Ljava/util/List;)V

    goto/16 :goto_25

    .line 2578
    :pswitch_d
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v8

    .line 2579
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    .line 2580
    const/16 v0, 0x8

    if-le v0, v9, :cond_1d

    .line 2581
    const/4 v10, 0x0

    :goto_1a
    rsub-int/lit8 v0, v9, 0x8

    if-ge v10, v0, :cond_1d

    .line 2582
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 2581
    add-int/lit8 v10, v10, 0x1

    goto :goto_1a

    .line 2585
    :cond_1d
    const/4 v0, 0x4

    const/4 v1, 0x5

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 2586
    goto/16 :goto_25

    .line 2589
    :pswitch_e
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 2590
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 2592
    move-object/from16 v0, p0

    :try_start_10
    iget-object v0, v0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 2593
    iget-object v0, v8, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 2594
    invoke-virtual {v10}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto :goto_1c

    .line 2596
    :sswitch_5
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_10
    .catch Lo/day; {:try_start_10 .. :try_end_10} :catch_6

    move-result-object v0

    move-object v5, v0

    .line 2597
    .line 2603
    :goto_1c
    goto :goto_1b

    .line 2606
    :cond_1e
    goto/16 :goto_25

    .line 2604
    :catch_6
    move-exception v8

    .line 2605
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult() COMMAND_ID_PAY_GET_CPLC error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2607
    goto/16 :goto_25

    .line 2610
    :pswitch_f
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v8

    .line 2611
    move-object v5, v8

    .line 2612
    goto/16 :goto_25

    .line 2615
    :pswitch_10
    new-instance v8, Lcom/huawei/datatype/WearableOpenAppInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/WearableOpenAppInfo;-><init>()V

    .line 2616
    const/4 v9, 0x0

    .line 2617
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 2618
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 2620
    move-object/from16 v0, p0

    :try_start_11
    iget-object v0, v0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v10

    .line 2621
    iget-object v0, v10, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/daw;

    .line 2622
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_4

    goto :goto_1e

    .line 2624
    :sswitch_6
    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WearableOpenAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 2625
    goto :goto_1e

    .line 2628
    :sswitch_7
    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/WearableOpenAppInfo;->setClassName(Ljava/lang/String;)V

    .line 2629
    .line 2635
    :goto_1e
    goto :goto_1d

    .line 2636
    :cond_1f
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v8}, Lo/dde;->e(ILcom/huawei/datatype/WearableOpenAppInfo;)V
    :try_end_11
    .catch Lo/day; {:try_start_11 .. :try_end_11} :catch_7

    .line 2639
    goto/16 :goto_25

    .line 2637
    :catch_7
    move-exception v10

    .line 2638
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COMMAND_ID_GET_DATE error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2641
    goto/16 :goto_25

    .line 2645
    :pswitch_11
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2646
    goto/16 :goto_25

    .line 2650
    :pswitch_12
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2651
    goto/16 :goto_25

    .line 2654
    :pswitch_13
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v8

    .line 2655
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult getAllowDisturbContentlist message = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2656
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2657
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult getAllowDisturbContentlist object = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2658
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dde;->y:Ljava/util/Map;

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    invoke-direct {v1, v2}, Lo/dde;->a([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2659
    goto/16 :goto_25

    .line 2662
    :pswitch_14
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getResult getDefaultSwitch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2663
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v8

    .line 2664
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult getDefaultSwitch message = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2665
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2666
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult getDefaultSwitch value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2668
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_21

    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 2669
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device support default switch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2670
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 2671
    const/4 v0, 0x1

    if-ne v9, v0, :cond_20

    .line 2672
    move-object/from16 v0, p0

    iget-object v10, v0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v10

    .line 2673
    move-object/from16 v0, p0

    :try_start_12
    iget-object v0, v0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v11

    .line 2674
    const/16 v0, 0x21

    iput v0, v11, Landroid/os/Message;->what:I

    .line 2675
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lo/dde;->a([B)I

    move-result v0

    iput v0, v11, Landroid/os/Message;->arg1:I

    .line 2676
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 2677
    monitor-exit v10

    goto :goto_1f

    :catchall_6
    move-exception v27

    monitor-exit v10

    throw v27

    :goto_1f
    goto :goto_20

    .line 2679
    :cond_20
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult getDefaultSwitch type is error, type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2681
    :goto_20
    goto/16 :goto_25

    .line 2682
    :cond_21
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device not support default switch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2684
    goto/16 :goto_25

    .line 2687
    :pswitch_15
    invoke-static {}, Lo/dde;->G()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    .line 2688
    :try_start_13
    new-instance v0, Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    invoke-direct {v0}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;-><init>()V

    sput-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    .line 2690
    invoke-virtual/range {p0 .. p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_22

    .line 2691
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LinkLayerVersion.LINK_LAYER_V0 == getCurrentDeviceProtocol()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_23

    .line 2693
    :cond_22
    invoke-static/range {p3 .. p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 2694
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    move-result-object v7

    .line 2696
    move-object/from16 v0, p0

    :try_start_14
    iget-object v0, v0, Lo/dde;->g:Lo/daz;

    invoke-virtual {v0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v10

    .line 2697
    iget-object v0, v10, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_21
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/daw;

    .line 2698
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto :goto_22

    .line 2700
    :pswitch_16
    sget-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->setDevice_manu(Ljava/lang/String;)V

    .line 2701
    goto :goto_22

    .line 2704
    :pswitch_17
    sget-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->setDevice_prodId(Ljava/lang/String;)V

    .line 2705
    goto :goto_22

    .line 2708
    :pswitch_18
    sget-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->setDevice_hiv(Ljava/lang/String;)V

    .line 2709
    .line 2716
    :goto_22
    goto :goto_21

    .line 2717
    :cond_23
    sget-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;
    :try_end_14
    .catch Lo/day; {:try_start_14 .. :try_end_14} :catch_8
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    move-object v5, v0

    .line 2720
    goto :goto_23

    .line 2718
    :catch_8
    move-exception v10

    .line 2719
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_15
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    .line 2722
    :goto_23
    monitor-exit v9

    goto :goto_24

    :catchall_7
    move-exception v28

    monitor-exit v9

    throw v28

    .line 2723
    :goto_24
    goto :goto_25

    .line 2726
    :pswitch_19
    move-object/from16 v5, p3

    .line 2727
    goto :goto_25

    .line 2729
    :pswitch_1a
    move-object/from16 v5, p3

    .line 2730
    .line 2735
    :cond_24
    :goto_25
    :pswitch_1b
    invoke-static {}, Lo/dde;->F()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 2736
    :try_start_16
    sget-object v0, Lo/dde;->p:Ljava/util/Map;

    const/4 v1, 0x1

    aget-byte v1, p3, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/List;

    .line 2737
    const/4 v0, 0x0

    if-eq v0, v9, :cond_29

    .line 2738
    const/4 v0, 0x0

    if-eq v0, v5, :cond_28

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_28

    .line 2739
    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_27

    .line 2740
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_25

    const/16 v10, 0x64

    goto :goto_26

    :cond_25
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 2741
    :goto_26
    new-instance v11, Lo/dkd;

    invoke-direct {v11}, Lo/dkd;-><init>()V

    .line 2742
    invoke-virtual {v11, v10}, Lo/dkd;->e(I)V

    .line 2743
    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Lo/dkd;->e(Ljava/lang/String;)V

    .line 2745
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_27
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2746
    const/4 v0, 0x0

    invoke-interface {v13, v0, v11}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2747
    goto :goto_27

    .line 2748
    :cond_26
    invoke-interface {v9}, Ljava/util/List;->clear()V

    .line 2749
    goto :goto_28

    .line 2750
    :cond_27
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2751
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_28

    .line 2754
    :cond_28
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_29

    .line 2755
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "UNKNOWN_ERROR"

    const v2, 0x186a1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2756
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    .line 2760
    :cond_29
    :goto_28
    monitor-exit v8

    goto :goto_29

    :catchall_8
    move-exception v29

    monitor-exit v8

    throw v29

    .line 2761
    :goto_29
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_1b
        :pswitch_1b
        :pswitch_c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_d
        :pswitch_1b
        :pswitch_1b
        :pswitch_10
        :pswitch_e
        :pswitch_f
        :pswitch_11
        :pswitch_12
        :pswitch_1b
        :pswitch_13
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_14
        :pswitch_15
        :pswitch_19
        :pswitch_1a
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x2 -> :sswitch_1
        0x4 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x1 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x1 -> :sswitch_6
        0x2 -> :sswitch_7
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_16
        :pswitch_17
        :pswitch_18
    .end packed-switch
.end method

.method private declared-synchronized e(Ljava/lang/String;Z)V
    .locals 6

    monitor-enter p0

    .line 3169
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dddd setAutoLightScreenToSharedPreference() :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3170
    invoke-virtual {p0, p1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 3171
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 3172
    const/4 v5, 0x0

    .line 3173
    if-eqz p2, :cond_0

    .line 3174
    const/4 v5, 0x1

    .line 3180
    :cond_0
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3181
    iget-object v0, p0, Lo/dde;->z:Lo/dqi;

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dqi;->a(Ljava/lang/String;)V

    .line 3183
    :cond_1
    goto :goto_0

    .line 3184
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAutoLightScreenToDB() : deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3186
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private e(Ljava/util/List;)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 2001
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 2002
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 2003
    const/16 v0, 0x10

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 2005
    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 2006
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 2007
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2008
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 2009
    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 2010
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 2011
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 2012
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 2013
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 2014
    const-string v16, ""

    .line 2015
    invoke-direct/range {p0 .. p0}, Lo/dde;->Q()Ljava/lang/String;

    move-result-object v17

    .line 2016
    invoke-direct/range {p0 .. p0}, Lo/dde;->R()Ljava/lang/String;

    move-result-object v18

    .line 2018
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dde;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object/from16 v16, v0

    .line 2021
    goto :goto_0

    .line 2019
    :catch_0
    move-exception v19

    .line 2020
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHandsetInfo() e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v19 .. v19}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    :goto_0
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v19

    .line 2025
    invoke-direct/range {p0 .. p0}, Lo/dde;->X()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v20

    .line 2028
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "01"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v21

    .line 2030
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "02"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v22

    .line 2032
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "03"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v23

    .line 2034
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "04"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v24

    .line 2036
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "05"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v25

    .line 2038
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "06"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v26

    .line 2040
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "07"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v27

    .line 2042
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "08"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v28

    .line 2044
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "09"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v29

    .line 2046
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0A"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v30

    .line 2048
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v31

    .line 2050
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0C"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v32

    .line 2052
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0D"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v33

    .line 2054
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0E"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v34

    .line 2057
    const/16 v35, 0x0

    .line 2059
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v36

    :goto_1
    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v37

    .line 2060
    packed-switch v37, :pswitch_data_0

    goto/16 :goto_2

    .line 2062
    :pswitch_0
    move-object/from16 v0, v21

    array-length v0, v0

    add-int v35, v35, v0

    .line 2063
    goto/16 :goto_2

    .line 2065
    :pswitch_1
    move-object/from16 v0, v22

    array-length v0, v0

    add-int v35, v35, v0

    .line 2066
    goto/16 :goto_2

    .line 2068
    :pswitch_2
    move-object/from16 v0, v23

    array-length v0, v0

    add-int v35, v35, v0

    .line 2069
    goto :goto_2

    .line 2071
    :pswitch_3
    move-object/from16 v0, v24

    array-length v0, v0

    add-int v35, v35, v0

    .line 2072
    goto :goto_2

    .line 2074
    :pswitch_4
    move-object/from16 v0, v25

    array-length v0, v0

    add-int v35, v35, v0

    .line 2075
    goto :goto_2

    .line 2077
    :pswitch_5
    move-object/from16 v0, v26

    array-length v0, v0

    add-int v35, v35, v0

    .line 2078
    goto :goto_2

    .line 2080
    :pswitch_6
    move-object/from16 v0, v27

    array-length v0, v0

    add-int v35, v35, v0

    .line 2081
    goto :goto_2

    .line 2083
    :pswitch_7
    move-object/from16 v0, v28

    array-length v0, v0

    add-int v35, v35, v0

    .line 2084
    goto :goto_2

    .line 2086
    :pswitch_8
    move-object/from16 v0, v29

    array-length v0, v0

    add-int v35, v35, v0

    .line 2087
    goto :goto_2

    .line 2089
    :pswitch_9
    move-object/from16 v0, v30

    array-length v0, v0

    add-int v35, v35, v0

    .line 2090
    goto :goto_2

    .line 2092
    :pswitch_a
    move-object/from16 v0, v31

    array-length v0, v0

    add-int v35, v35, v0

    .line 2093
    goto :goto_2

    .line 2095
    :pswitch_b
    move-object/from16 v0, v32

    array-length v0, v0

    add-int v35, v35, v0

    .line 2096
    goto :goto_2

    .line 2098
    :pswitch_c
    move-object/from16 v0, v33

    array-length v0, v0

    add-int v35, v35, v0

    .line 2099
    goto :goto_2

    .line 2101
    :pswitch_d
    move-object/from16 v0, v34

    array-length v0, v0

    add-int v35, v35, v0

    .line 2102
    .line 2106
    :goto_2
    goto/16 :goto_1

    .line 2108
    :cond_0
    invoke-static/range {v35 .. v35}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v36

    .line 2109
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v37

    :goto_3
    invoke-interface/range {v37 .. v37}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface/range {v37 .. v37}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v38

    .line 2110
    packed-switch v38, :pswitch_data_1

    goto/16 :goto_4

    .line 2113
    :pswitch_e
    move-object/from16 v0, v36

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2114
    goto/16 :goto_4

    .line 2117
    :pswitch_f
    move-object/from16 v0, v36

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2118
    goto/16 :goto_4

    .line 2121
    :pswitch_10
    move-object/from16 v0, v36

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2122
    goto :goto_4

    .line 2125
    :pswitch_11
    move-object/from16 v0, v36

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2126
    goto :goto_4

    .line 2129
    :pswitch_12
    move-object/from16 v0, v36

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2130
    goto :goto_4

    .line 2133
    :pswitch_13
    move-object/from16 v0, v36

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2134
    goto :goto_4

    .line 2137
    :pswitch_14
    move-object/from16 v0, v36

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2138
    goto :goto_4

    .line 2141
    :pswitch_15
    move-object/from16 v0, v36

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2142
    goto :goto_4

    .line 2145
    :pswitch_16
    move-object/from16 v0, v36

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2146
    goto :goto_4

    .line 2149
    :pswitch_17
    move-object/from16 v0, v36

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2150
    goto :goto_4

    .line 2153
    :pswitch_18
    move-object/from16 v0, v36

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2154
    goto :goto_4

    .line 2157
    :pswitch_19
    move-object/from16 v0, v36

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2158
    goto :goto_4

    .line 2161
    :pswitch_1a
    move-object/from16 v0, v36

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2162
    goto :goto_4

    .line 2165
    :pswitch_1b
    move-object/from16 v0, v36

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2166
    .line 2170
    :goto_4
    goto/16 :goto_3

    .line 2171
    :cond_1
    move-object/from16 v0, p0

    move-object v1, v6

    move-object/from16 v2, v36

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 2172
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch
.end method

.method static synthetic e(Lo/dde;)V
    .locals 0

    .line 117
    invoke-direct {p0}, Lo/dde;->P()V

    return-void
.end method

.method static synthetic e(Lo/dde;Lo/ear;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Lo/dde;->b(Lo/ear;)V

    return-void
.end method

.method private declared-synchronized e(Z)V
    .locals 6

    monitor-enter p0

    .line 3195
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setWearMessagePushToSharedPreference() :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3196
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 3197
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3198
    const-string v4, "default_id"

    .line 3200
    :cond_0
    const/4 v5, 0x1

    .line 3201
    if-eqz p1, :cond_1

    .line 3202
    const/4 v5, 0x0

    .line 3204
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "wear_push_message_key"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/dde;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3205
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic f(Lo/dde;)Landroid/content/Context;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    return-object v0
.end method

.method private f(Ljava/lang/String;)V
    .locals 2

    .line 4871
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    new-instance v1, Lo/dde$13;

    invoke-direct {v1, p0, p1}, Lo/dde$13;-><init>(Lo/dde;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/eaw;->a(Lo/eaz;)V

    .line 4888
    return-void
.end method

.method static synthetic g(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->B:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 3116
    iget-object v1, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v1

    .line 3117
    :try_start_0
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 3118
    const/4 v0, 0x3

    iput v0, v2, Landroid/os/Message;->what:I

    .line 3119
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 3120
    iget-object v0, p0, Lo/dde;->t:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3121
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 3122
    :goto_0
    return-void
.end method

.method private g(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ear;>;)V"
        }
    .end annotation

    .line 4958
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateDescripForWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4959
    const/4 v0, 0x0

    iput v0, p0, Lo/dde;->G:I

    .line 4961
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ear;

    .line 4962
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dde$14;

    invoke-direct {v2, p0, v5}, Lo/dde$14;-><init>(Lo/dde;Lo/ear;)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->b(Ljava/lang/String;Lo/eaz;)V

    .line 4980
    goto :goto_0

    .line 4981
    :cond_0
    return-void
.end method

.method static synthetic h(Lo/dde;)I
    .locals 1

    .line 117
    invoke-direct {p0}, Lo/dde;->K()I

    move-result v0

    return v0
.end method

.method static synthetic i(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->E:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private i(Ljava/lang/String;)V
    .locals 5

    .line 1790
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestDeviceAllowDisturbContent 5!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1791
    invoke-static {p1}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 1792
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1793
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestDeviceAllowDisturbContent no support return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1794
    return-void

    .line 1797
    :cond_1
    invoke-virtual {p0, p1}, Lo/dde;->e(Ljava/lang/String;)V

    .line 1798
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestDeviceAllowDisturbContent !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1799
    return-void
.end method

.method private declared-synchronized j()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 6

    monitor-enter p0

    .line 1101
    const/4 v4, 0x0

    .line 1103
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1105
    :try_start_1
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0}, Lo/djz;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 1108
    goto :goto_0

    .line 1106
    :catch_0
    move-exception v5

    .line 1107
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "capabilityNegotiation() occur remoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1110
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method static synthetic k(Lo/dde;)I
    .locals 1

    .line 117
    invoke-direct {p0}, Lo/dde;->N()I

    move-result v0

    return v0
.end method

.method public static k()Ljava/lang/String;
    .locals 2

    .line 3791
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dde;->d:Ljava/lang/String;

    .line 3793
    sget-object v0, Lo/dde;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3794
    const-string v0, ""

    sput-object v0, Lo/dde;->d:Ljava/lang/String;

    .line 3797
    :cond_0
    sget-object v0, Lo/dde;->d:Ljava/lang/String;

    return-object v0
.end method

.method private k(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1568
    iput-object p1, p0, Lo/dde;->B:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1569
    return-void
.end method

.method private k(Ljava/lang/String;)V
    .locals 6

    .line 4890
    invoke-direct {p0}, Lo/dde;->W()V

    .line 4891
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 4892
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ear;

    .line 4893
    invoke-virtual {v5}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    invoke-virtual {v5}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4894
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "has band plugin info, uuid :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4895
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "publish mode :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4897
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4899
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4900
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4901
    :cond_0
    invoke-direct {p0, v5}, Lo/dde;->a(Lo/ear;)V

    goto :goto_1

    .line 4905
    :cond_1
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 4906
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4907
    :cond_2
    invoke-direct {p0, v5}, Lo/dde;->a(Lo/ear;)V

    .line 4911
    :cond_3
    :goto_1
    goto/16 :goto_0

    .line 4912
    :cond_4
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 4913
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no band plugin info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4914
    iget-boolean v0, p0, Lo/dde;->J:Z

    if-eqz v0, :cond_7

    .line 4915
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dde;->J:Z

    .line 4916
    const-string v0, "SMART_WATCH"

    invoke-direct {p0, v0}, Lo/dde;->f(Ljava/lang/String;)V

    goto :goto_2

    .line 4920
    :cond_5
    invoke-direct {p0}, Lo/dde;->U()Ljava/util/List;

    move-result-object v4

    .line 4921
    invoke-direct {p0, v4}, Lo/dde;->a(Ljava/util/List;)V

    .line 4922
    goto :goto_2

    .line 4924
    :cond_6
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no index info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4926
    :cond_7
    :goto_2
    return-void
.end method

.method static synthetic l(Lo/dde;)Ljava/util/List;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->L:Ljava/util/List;

    return-object v0
.end method

.method static synthetic m(Lo/dde;)Z
    .locals 1

    .line 117
    iget-boolean v0, p0, Lo/dde;->J:Z

    return v0
.end method

.method private n(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 4655
    iput-object p1, p0, Lo/dde;->E:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 4656
    iget-object v0, p0, Lo/dde;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4658
    return-void
.end method

.method static synthetic n(Lo/dde;)V
    .locals 0

    .line 117
    invoke-direct {p0}, Lo/dde;->T()V

    return-void
.end method

.method static synthetic o(Lo/dde;)I
    .locals 1

    .line 117
    iget v0, p0, Lo/dde;->G:I

    return v0
.end method

.method static synthetic p(Lo/dde;)Ljava/util/List;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dde;->N:Ljava/util/List;

    return-object v0
.end method

.method static synthetic s()Ljava/util/Map;
    .locals 1

    .line 117
    sget-object v0, Lo/dde;->l:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic u()Ljava/lang/Object;
    .locals 1

    .line 117
    invoke-static {}, Lo/dde;->D()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic v()Ljava/util/Map;
    .locals 1

    .line 117
    sget-object v0, Lo/dde;->p:Ljava/util/Map;

    return-object v0
.end method

.method private w()V
    .locals 6

    .line 364
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter midware"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {v0}, Lo/dip;->c()Z

    move-result v4

    .line 368
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Lo/dip;->a(Ljava/lang/String;)I

    move-result v5

    .line 369
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter midware isClosed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dip;->e(Z)V

    .line 373
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dip;->d(Z)V

    .line 374
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dip;->a(Z)V

    .line 376
    if-nez v5, :cond_0

    .line 377
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dde;->c(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 378
    :cond_0
    const/4 v0, 0x1

    if-ne v5, v0, :cond_1

    .line 379
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dde;->c(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 382
    :cond_1
    :goto_0
    invoke-direct {p0}, Lo/dde;->B()V

    .line 383
    return-void
.end method

.method static synthetic x()Ljava/lang/Object;
    .locals 1

    .line 117
    invoke-static {}, Lo/dde;->G()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic y()Ljava/lang/Object;
    .locals 1

    .line 117
    invoke-static {}, Lo/dde;->F()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic z()Ljava/util/List;
    .locals 1

    .line 117
    sget-object v0, Lo/dde;->w:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 778
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 779
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 781
    :try_start_1
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 782
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 783
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 784
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 785
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 786
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 788
    :cond_0
    goto :goto_0

    .line 789
    :cond_1
    monitor-exit v4

    return-object v6

    .line 791
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 792
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 794
    :catch_0
    move-exception v5

    .line 795
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConnectDeviceInfo() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 797
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 799
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 802
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectDeviceInfo() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 803
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 804
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 806
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1785
    invoke-direct {p0, p1}, Lo/dde;->g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1786
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 4183
    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 4186
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "kStorage_AlarmMgr_MAC"

    invoke-static {v0, v1, v2, p1, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4188
    return-void
.end method

.method public a(Ljava/lang/String;IJILjava/lang/String;Ljava/lang/String;[BLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 27

    .line 4547
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter sendFAQMessageToDevice !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4548
    move-object/from16 v0, p0

    move-object/from16 v1, p9

    invoke-direct {v0, v1}, Lo/dde;->n(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4549
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 4550
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 4551
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 4554
    invoke-static/range {p1 .. p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 4556
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 4558
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 4561
    invoke-static/range {p2 .. p2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 4563
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 4565
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 4568
    invoke-static/range {p3 .. p4}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v11

    .line 4570
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v12

    .line 4572
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 4576
    invoke-static/range {p5 .. p5}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v14

    .line 4578
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v15

    .line 4580
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v16

    .line 4583
    invoke-static/range {p6 .. p6}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 4585
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v18

    .line 4587
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v19

    .line 4590
    invoke-static/range {p7 .. p7}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 4592
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v21

    .line 4594
    const/4 v0, 0x6

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v22

    .line 4597
    const-string v23, ""

    .line 4598
    const/4 v0, 0x0

    move-object/from16 v1, p8

    if-eq v0, v1, :cond_0

    .line 4599
    invoke-static/range {p8 .. p8}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v23

    .line 4602
    :cond_0
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v24

    .line 4604
    const/4 v0, 0x7

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v25

    .line 4606
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4607
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4608
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4609
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4610
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4611
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4612
    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4606
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v26

    .line 4614
    invoke-static {v7}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4615
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4616
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4618
    invoke-static {v10}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4619
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4620
    invoke-static {v8}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4622
    invoke-static {v13}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4623
    invoke-static {v12}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4624
    invoke-static {v11}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4626
    invoke-static/range {v16 .. v16}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4627
    invoke-static {v15}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4628
    invoke-static {v14}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4630
    invoke-static/range {v19 .. v19}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4631
    invoke-static/range {v18 .. v18}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4632
    invoke-static/range {v17 .. v17}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4634
    invoke-static/range {v22 .. v22}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4635
    invoke-static/range {v21 .. v21}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4636
    invoke-static/range {v20 .. v20}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4638
    invoke-static/range {v25 .. v25}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4639
    invoke-static/range {v24 .. v24}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4640
    const/4 v0, 0x0

    move-object/from16 v1, p8

    if-eq v0, v1, :cond_1

    .line 4641
    move-object/from16 v0, v26

    move-object/from16 v1, p8

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 4643
    :cond_1
    invoke-static/range {v23 .. v23}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4648
    :goto_0
    invoke-virtual/range {v26 .. v26}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 4649
    invoke-virtual/range {v26 .. v26}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 4650
    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 4651
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 4299
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 4300
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 4301
    const/16 v0, 0x19

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 4305
    invoke-static {p1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 4307
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 4309
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 4311
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 4313
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4314
    invoke-static {v8}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4315
    invoke-static {v7}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4317
    move-object v0, p0

    move-object v1, v6

    move-object v2, v10

    move-object v4, p2

    const/16 v3, 0x19

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 4318
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 1935
    const-string v0, "03"

    const-string v1, "HWDeviceConfigManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deleteDeviceAvoidDisturbingInfo"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1936
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1937
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1938
    const/16 v0, 0xb

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1939
    invoke-virtual {v6, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1941
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1944
    const/16 v0, -0x7f

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1946
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1949
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1951
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1952
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 1954
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1955
    goto :goto_0

    .line 1957
    :cond_0
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p3

    const/16 v3, 0xb

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1958
    return-void
.end method

.method public a(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 8

    .line 1578
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceConfigManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setRotateSwitchScreenSwitchStatus"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1579
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1580
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1581
    const/16 v0, 0x1b

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1582
    invoke-virtual {v6, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1584
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1587
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1589
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1591
    if-eqz p2, :cond_0

    .line 1592
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 1594
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1596
    :goto_0
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p3

    move v5, p4

    const/16 v3, 0x1b

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1597
    invoke-direct {p0, p1, p2}, Lo/dde;->b(Ljava/lang/String;Z)V

    .line 1598
    return-void
.end method

.method public a(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4380
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4381
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->e(Z)V

    goto :goto_0

    .line 4383
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openSystemBluetoothSwitch() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4384
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4386
    :goto_0
    return-void
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 9

    .line 742
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 743
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 745
    :try_start_1
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 746
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 747
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 748
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 749
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 750
    monitor-exit v4

    return-object v7

    .line 752
    :cond_0
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 754
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 755
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 763
    :goto_1
    goto :goto_2

    .line 757
    :catch_0
    move-exception v5

    .line 758
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConnectDeviceInfo() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 762
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 765
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectDeviceInfo() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 767
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 769
    :goto_2
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 770
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 9

    .line 848
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 849
    invoke-virtual {p0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0

    .line 851
    :cond_0
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 852
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 854
    :try_start_1
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 855
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 856
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 857
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 858
    monitor-exit v4

    return-object v7

    .line 860
    :cond_1
    goto :goto_0

    .line 861
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 862
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 864
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 865
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 867
    :catch_0
    move-exception v5

    .line 868
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 872
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 875
    :cond_4
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 877
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 879
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 611
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerIBaseResponseCallback() serviceID ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    invoke-static {}, Lo/dde;->D()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 613
    :try_start_0
    sget-object v0, Lo/dde;->l:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 614
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != serviceCallback.get(serviceID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    sget-object v0, Lo/dde;->l:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    :cond_0
    sget-object v0, Lo/dde;->l:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 618
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 619
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1410
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAW70FirmVersion() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1411
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1412
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAW70FirmVersion enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1413
    return-void

    .line 1416
    :cond_0
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1417
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAW70FirmVersion null !=mAw70DeviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1418
    sget-object v0, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1419
    return-void

    .line 1422
    :cond_1
    invoke-virtual {p0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1423
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAW70FirmVersion null == getCurrentAW70DeviceInfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1424
    const-string v0, "aw70 not connected"

    const v1, 0x186a1

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1425
    return-void

    .line 1428
    :cond_2
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1429
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1430
    const/4 v0, 0x7

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1431
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setPriority(I)V

    .line 1432
    invoke-virtual {p0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1433
    invoke-direct {p0}, Lo/dde;->C()Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1435
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p1

    const/4 v3, 0x7

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1436
    return-void
.end method

.method public b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V
    .locals 5

    .line 980
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 981
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/djz;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V

    goto :goto_0

    .line 983
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 984
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 988
    :goto_0
    goto :goto_1

    .line 986
    :catch_0
    move-exception v4

    .line 987
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFile() error = "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 989
    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 7

    .line 997
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 1000
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1001
    invoke-virtual {p0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1002
    const/4 v5, 0x1

    goto :goto_0

    .line 1003
    :cond_0
    invoke-virtual {p0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1004
    const/4 v5, 0x1

    goto :goto_0

    .line 1006
    :cond_1
    const/4 v5, 0x0

    goto :goto_0

    .line 1009
    :cond_2
    const/4 v5, 0x1

    .line 1011
    :goto_0
    if-eqz v5, :cond_4

    .line 1012
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendDeviceData(): Command = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v3

    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v3

    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v3

    invoke-static {v3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1013
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1014
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    goto :goto_1

    .line 1016
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDeviceData() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1017
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    goto :goto_1

    .line 1020
    :cond_4
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDeviceData() device is not connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1024
    :goto_1
    goto :goto_2

    .line 1022
    :catch_0
    move-exception v5

    .line 1023
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendDeviceData() e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1025
    :goto_2
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 1026
    :goto_3
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/djw;)V
    .locals 9

    .line 1060
    iget-object v6, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v6

    .line 1062
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1063
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lo/djz;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/djw;)V

    goto :goto_0

    .line 1065
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1070
    :goto_0
    goto :goto_1

    .line 1068
    :catch_0
    move-exception v7

    .line 1069
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendOTAFileData() e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1071
    :goto_1
    monitor-exit v6

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v6

    throw v8

    .line 1073
    :goto_2
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 659
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 660
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 661
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0}, Lo/djz;->d()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 663
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUsedDeviceList() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 665
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 667
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public c(I)V
    .locals 1

    .line 4819
    invoke-static {p1}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4821
    const-string v0, "SMART_BAND"

    invoke-direct {p0, v0}, Lo/dde;->f(Ljava/lang/String;)V

    goto :goto_0

    .line 4824
    :cond_0
    const-string v0, "SMART_WATCH"

    invoke-direct {p0, v0}, Lo/dde;->f(Ljava/lang/String;)V

    .line 4826
    :goto_0
    return-void
.end method

.method public c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1836
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1837
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1838
    const/16 v0, 0x23

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1840
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1842
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1843
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1844
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1846
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p2

    const/16 v3, 0x23

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1847
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 1445
    invoke-virtual {p0}, Lo/dde;->a()Ljava/util/List;

    move-result-object v6

    .line 1446
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 1447
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1448
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1449
    new-instance v9, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v9}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1450
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1451
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1452
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setPriority(I)V

    .line 1453
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1454
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 1456
    invoke-virtual {p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1458
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1460
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 1463
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1465
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1468
    :goto_1
    move-object v0, p0

    move-object v1, v9

    move-object v2, v10

    move-object v4, p1

    const/16 v3, 0x8

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1470
    :cond_1
    goto/16 :goto_0

    .line 1472
    :cond_2
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 7

    .line 4326
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 4328
    :try_start_0
    invoke-virtual {p0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 4329
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendAWFilePath(): filepath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4330
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4331
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 4333
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendAWFilePath() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4334
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4342
    :cond_1
    :goto_0
    goto :goto_1

    .line 4337
    :catch_0
    move-exception v5

    .line 4338
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendAWFilePath "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4340
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4343
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 4344
    :goto_2
    return-void
.end method

.method public c(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1966
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceConfigManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " factoryReset"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1967
    iput-object p1, p0, Lo/dde;->x:Ljava/lang/String;

    .line 1968
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1969
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1970
    const/16 v0, 0xd

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1971
    invoke-virtual {v6, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1974
    invoke-virtual {p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1975
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1977
    const/16 v0, 0x40

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1979
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 1981
    :cond_0
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1983
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1985
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1987
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1989
    :goto_0
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p2

    const/16 v3, 0xd

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1991
    const-string v0, ""

    invoke-virtual {p0, v0}, Lo/dde;->a(Ljava/lang/String;)V

    .line 1992
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "factoryReset clear KEY_ALARM_IDENTIFY data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1993
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 690
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 691
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 692
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->d(Ljava/util/List;)V

    goto :goto_0

    .line 694
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateUsedDeviceList() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 697
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 698
    :goto_1
    return-void
.end method

.method public c(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 8

    .line 1619
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceConfigManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setLeftOrRightHandWearStatus"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1620
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1621
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1622
    const/16 v0, 0x1a

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1624
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1627
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1629
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1631
    if-eqz p1, :cond_0

    .line 1632
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 1634
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1636
    :goto_0
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p2

    move v5, p3

    const/16 v3, 0x1a

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1637
    invoke-direct {p0, p1}, Lo/dde;->d(Z)V

    .line 1638
    return-void
.end method

.method public d(Ljava/lang/String;)I
    .locals 2

    .line 1803
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1804
    const/4 v0, 0x0

    return v0

    .line 1806
    :cond_0
    iget-object v0, p0, Lo/dde;->y:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1807
    const/4 v0, 0x0

    return v0

    .line 1809
    :cond_1
    iget-object v0, p0, Lo/dde;->y:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 9

    .line 812
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 813
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 815
    :try_start_1
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 816
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 817
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 818
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 819
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 820
    monitor-exit v4

    return-object v7

    .line 822
    :cond_0
    goto :goto_0

    .line 823
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 824
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 826
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 827
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 829
    :catch_0
    move-exception v5

    .line 830
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 834
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 837
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 839
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 841
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public d(I)V
    .locals 6

    .line 627
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterIBaseResponseCallback,serviceID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 628
    invoke-static {}, Lo/dde;->D()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 629
    :try_start_0
    sget-object v0, Lo/dde;->l:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 630
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 631
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 643
    iget-object v7, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v7

    .line 644
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 645
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lo/djz;->a(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 647
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDevice() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 650
    :goto_0
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v7

    throw v8

    .line 651
    :goto_1
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 1271
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFirmwareVersion() dataDeviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p1, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1272
    invoke-static {}, Lo/dde;->G()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 1273
    :try_start_0
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1274
    new-instance v7, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v7}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1275
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1276
    const/4 v0, 0x7

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1277
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setPriority(I)V

    .line 1279
    invoke-virtual {p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1280
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 1282
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1284
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 1286
    :cond_1
    invoke-direct {p0}, Lo/dde;->C()Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 1289
    :goto_1
    move-object v0, p0

    move-object v1, v7

    move-object v2, v8

    move-object v4, p1

    const/4 v3, 0x7

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1290
    goto :goto_2

    .line 1291
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 1292
    sget-object v0, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_2

    .line 1294
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFirmwareVersion() callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1297
    :goto_2
    monitor-exit v6

    goto :goto_3

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 1298
    :goto_3
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1481
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1482
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1483
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1484
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1485
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setPriority(I)V

    .line 1486
    invoke-virtual {v6, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1487
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1489
    invoke-virtual {p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1491
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1493
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 1496
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1498
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1501
    :goto_0
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p2

    const/16 v3, 0x8

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1503
    :cond_1
    return-void
.end method

.method public d(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 8

    .line 1512
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceConfigManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setAutoLightScreenSwitchStatus"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1513
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1514
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1515
    const/16 v0, 0x9

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1516
    invoke-virtual {v6, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1518
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1521
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1523
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1525
    if-eqz p2, :cond_0

    .line 1526
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 1528
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1530
    :goto_0
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p3

    move v5, p4

    const/16 v3, 0x9

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1531
    invoke-direct {p0, p1, p2}, Lo/dde;->e(Ljava/lang/String;Z)V

    .line 1532
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 675
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsedDeviceList() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 677
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 678
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->c(Ljava/util/List;)V

    goto :goto_0

    .line 680
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsedDeviceList() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 683
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 684
    :goto_1
    return-void
.end method

.method public e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 9

    .line 705
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 706
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 708
    :try_start_1
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 709
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 710
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 711
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 712
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 713
    monitor-exit v4

    return-object v7

    .line 715
    :cond_0
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 717
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 718
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 726
    :goto_1
    goto :goto_2

    .line 720
    :catch_0
    move-exception v5

    .line 721
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConnectDeviceInfo() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 723
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 725
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 728
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectDeviceInfo() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 730
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 732
    :goto_2
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 733
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 1221
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIntelligentHomeLinkage() dataDeviceIntelligentInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p1, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1222
    invoke-static {}, Lo/dde;->G()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 1223
    :try_start_0
    sget-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1224
    new-instance v7, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v7}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1225
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1226
    const/16 v0, 0x22

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1227
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setPriority(I)V

    .line 1229
    invoke-virtual {p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1230
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 1232
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1234
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 1236
    :cond_1
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 1238
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1240
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1243
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1245
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1248
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1250
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1253
    :goto_1
    move-object v0, p0

    move-object v1, v7

    move-object v2, v8

    move-object v4, p1

    const/16 v3, 0x22

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1254
    goto :goto_2

    .line 1255
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 1256
    sget-object v0, Lo/dde;->h:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_2

    .line 1258
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntelligentHomeLinkage() callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1261
    :goto_2
    monitor-exit v6

    goto :goto_3

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 1262
    :goto_3
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 8

    .line 1818
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1819
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1820
    const/16 v0, 0x1d

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1821
    invoke-virtual {v6, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1823
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1825
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1826
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1828
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    const/16 v3, 0x1d

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1829
    return-void
.end method

.method public e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 1307
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFirmwareVersion() dataDeviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p2, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1308
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1309
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFirmwareVersion() id = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1310
    return-void

    .line 1312
    :cond_1
    sget-object v6, Lo/dde;->f:Lcom/huawei/datatype/DataDeviceInfo;

    .line 1313
    invoke-virtual {p0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v7

    .line 1314
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "id=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, p1}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==mAw70DeviceInfo=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1315
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1316
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectAW70DeviceInfo=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1317
    sget-object v6, Lo/dde;->i:Lcom/huawei/datatype/DataDeviceInfo;

    .line 1320
    :cond_2
    invoke-static {}, Lo/dde;->G()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 1321
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 1322
    :try_start_0
    new-instance v9, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v9}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1323
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1324
    const/4 v0, 0x7

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1325
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setPriority(I)V

    .line 1326
    invoke-virtual {v9, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1328
    invoke-virtual {p0}, Lo/dde;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1329
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 1331
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1333
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 1335
    :cond_3
    invoke-direct {p0}, Lo/dde;->C()Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 1338
    :goto_1
    move-object v0, p0

    move-object v1, v9

    move-object v2, v10

    move-object v4, p2

    const/4 v3, 0x7

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1339
    goto :goto_2

    .line 1340
    :cond_4
    const/4 v0, 0x0

    if-eq v0, p2, :cond_5

    .line 1341
    const/4 v0, 0x0

    invoke-interface {p2, v0, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_2

    .line 1343
    :cond_5
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFirmwareVersion() callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1346
    :goto_2
    monitor-exit v8

    goto :goto_3

    :catchall_0
    move-exception v11

    monitor-exit v8

    throw v11

    .line 1347
    :goto_3
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V"
        }
    .end annotation

    .line 1647
    invoke-static {p1}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 1648
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceConfigManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " addDeviceAvoidDisturbingInfo()"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1649
    new-instance v0, Lo/dde$12;

    move-object v1, p0

    move-object v2, p1

    move-object v3, v7

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lo/dde$12;-><init>(Lo/dde;Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-direct {p0, v0}, Lo/dde;->g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1777
    return-void
.end method

.method public e(Lo/djs;)V
    .locals 5

    .line 4684
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4686
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->e(Lo/djs;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4690
    goto :goto_0

    .line 4687
    :catch_0
    move-exception v4

    .line 4688
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4689
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerWorkOutCallback RemoteException:"

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4690
    goto :goto_0

    .line 4692
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWorkOutCallback() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4693
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4696
    :goto_0
    return-void
.end method

.method public e(Lo/djs;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 4664
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4666
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->c(Lo/djs;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4671
    goto :goto_0

    .line 4667
    :catch_0
    move-exception v4

    .line 4668
    const-string v0, "send command error"

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 4669
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4670
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException:"

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4671
    goto :goto_0

    .line 4673
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openOrCloseHeartRate() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4674
    const-string v0, "send command error"

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 4675
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4677
    :goto_0
    return-void
.end method

.method public e(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 1543
    invoke-direct {p0, p2}, Lo/dde;->k(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1544
    const-string v0, "04"

    const-string v1, "HWDeviceConfigManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setWearMessagePushSwitchStatus"

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

    .line 1545
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1546
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1547
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1549
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 1552
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1554
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1556
    if-eqz p1, :cond_0

    .line 1557
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 1559
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1561
    :goto_0
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1562
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1563
    invoke-virtual {p0, v5}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1564
    invoke-direct {p0, p1}, Lo/dde;->e(Z)V

    .line 1565
    return-void
.end method

.method public f()I
    .locals 3

    .line 3774
    const/4 v1, -0x1

    .line 3775
    invoke-virtual {p0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 3776
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 3777
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    .line 3780
    :cond_0
    return v1
.end method

.method public f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 4258
    iput-object p1, p0, Lo/dde;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 4259
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerOpenAppIBaseResponseCallback() callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4260
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4413
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4414
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/djz;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 4417
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeDeviceByMac() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4418
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4420
    :goto_0
    return-void
.end method

.method public g()Z
    .locals 5

    .line 1606
    invoke-direct {p0}, Lo/dde;->L()I

    move-result v4

    .line 1607
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWearMessagePushSwitchStatus() flag ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1608
    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 485
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 9

    .line 886
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 887
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 889
    :try_start_1
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 890
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 891
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 892
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 893
    monitor-exit v4

    return-object v7

    .line 895
    :cond_0
    goto :goto_0

    .line 896
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 897
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 899
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 900
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 902
    :catch_0
    move-exception v5

    .line 903
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 907
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 910
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 912
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 914
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1854
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1855
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1856
    const/16 v0, 0x24

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1858
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1860
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1861
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1863
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p1

    const/16 v3, 0x24

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1864
    return-void
.end method

.method public i()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 922
    iget-object v4, p0, Lo/dde;->u:Ljava/lang/Object;

    monitor-enter v4

    .line 923
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 925
    :try_start_1
    invoke-virtual {p0}, Lo/dde;->c()Ljava/util/List;

    move-result-object v5

    .line 926
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 927
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 929
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 930
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 931
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 933
    :cond_0
    goto :goto_0

    .line 934
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() has active list"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 935
    monitor-exit v4

    return-object v6

    .line 937
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 938
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 940
    :catch_0
    move-exception v5

    .line 941
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentDeviceInfo() error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 943
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 945
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 948
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceInfo() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 949
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 950
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 952
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method public i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 4239
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 4240
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 4241
    const/16 v0, 0x18

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 4243
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 4246
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 4248
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 4249
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v4, p1

    const/16 v3, 0x18

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 4250
    return-void
.end method

.method public l()V
    .locals 8

    .line 4706
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4707
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getDefaultSwitch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4708
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 4709
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 4710
    const/16 v0, 0x21

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 4711
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 4712
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 4713
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 4714
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    const/16 v3, 0x21

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/dde;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 4716
    :cond_0
    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 4699
    iget-object v0, p0, Lo/dde;->A:Ljava/lang/String;

    return-object v0
.end method

.method public n()V
    .locals 1

    .line 4266
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dde;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 4267
    return-void
.end method

.method public o()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4425
    const/4 v4, 0x1

    .line 4426
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4427
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0}, Lo/djz;->g()Z

    move-result v4

    goto :goto_0

    .line 4430
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeDeviceByMac() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4431
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4433
    :goto_0
    return v4
.end method

.method public onDataMigrate()Z
    .locals 1

    .line 1926
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 7

    .line 3695
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 3696
    iget-object v0, p0, Lo/dde;->o:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 3697
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dde;->o:Landroid/os/HandlerThread;

    .line 3699
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/dde;->d(I)V

    .line 3701
    invoke-static {}, Lo/dde;->M()V

    .line 3703
    :try_start_0
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/dde;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3706
    goto :goto_0

    .line 3704
    :catch_0
    move-exception v4

    .line 3705
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver is not registered"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3708
    :goto_0
    invoke-static {}, Lo/dde;->F()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 3709
    const/4 v5, 0x0

    :goto_1
    :try_start_1
    sget-object v0, Lo/dde;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 3710
    sget-object v0, Lo/dde;->p:Ljava/util/Map;

    sget-object v1, Lo/dde;->w:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3711
    sget-object v0, Lo/dde;->p:Ljava/util/Map;

    sget-object v1, Lo/dde;->w:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3709
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 3714
    :cond_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 3715
    :goto_2
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3716
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dde;->H:Lo/ahg$b;

    .line 3718
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3719
    return-void
.end method

.method public p()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 4363
    const/4 v4, 0x0

    .line 4364
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4365
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0}, Lo/djz;->k()Z

    move-result v4

    goto :goto_0

    .line 4367
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSystemBluetoothSwitchState() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4368
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 4371
    :goto_0
    return v4
.end method

.method public q()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .line 5053
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 5055
    :try_start_0
    invoke-static {}, Lo/dkt;->a()Lo/djz;

    move-result-object v0

    invoke-interface {v0}, Lo/djz;->a()Ljava/util/Map;

    move-result-object v4

    .line 5056
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 5057
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == map"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5058
    const/4 v0, 0x0

    return-object v0

    .line 5060
    :cond_0
    return-object v4

    .line 5061
    :catch_0
    move-exception v4

    .line 5062
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 5063
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceCapability RemoteException:"

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5064
    goto :goto_0

    .line 5066
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability() iPhoneServiceAIDL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5067
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 5069
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public r()V
    .locals 11

    .line 4831
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4832
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Oversea not down."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4833
    return-void

    .line 4836
    :cond_0
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    .line 4837
    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "download_plugin_source"

    .line 4836
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 4838
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " lasttime : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4839
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 4840
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " nowtime : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4841
    const/4 v8, 0x1

    .line 4842
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 4844
    :try_start_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 4845
    sub-long v0, v6, v9

    const-wide/32 v2, 0xf731400

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 4846
    const/4 v8, 0x0

    .line 4847
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GAT < 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 4849
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " gat > 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4853
    :goto_0
    goto :goto_1

    .line 4851
    :catch_0
    move-exception v9

    .line 4852
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4855
    :cond_2
    :goto_1
    if-eqz v8, :cond_3

    .line 4856
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start down load source."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4857
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dde;->J:Z

    .line 4859
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "download_plugin_source"

    .line 4860
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    .line 4859
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4861
    const-string v0, "SMART_BAND"

    invoke-direct {p0, v0}, Lo/dde;->f(Ljava/lang/String;)V

    .line 4863
    :cond_3
    return-void
.end method

.method public t()Z
    .locals 4

    .line 4794
    iget-object v0, p0, Lo/dde;->e:Landroid/content/Context;

    const/16 v1, 0x272e

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "core_sleep_Default"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4795
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4796
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/dde;->F:Z

    .line 4798
    :cond_1
    iget-boolean v0, p0, Lo/dde;->F:Z

    return v0
.end method
