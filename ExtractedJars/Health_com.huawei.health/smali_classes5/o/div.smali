.class public Lo/div;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field static b:Ljava/lang/String;

.field private static c:Lo/div;

.field private static final f:Ljava/lang/Object;

.field private static g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lo/dsw;

.field private d:Lo/dde;

.field e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private h:Lo/dta;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/String;

.field private l:Landroid/content/BroadcastReceiver;

.field private n:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/div;->g:Ljava/util/Map;

    .line 122
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/div;->f:Ljava/lang/Object;

    .line 178
    const-string v0, ""

    sput-object v0, Lo/div;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 102
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lo/div;->a:Lo/dsw;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lo/div;->h:Lo/dta;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/div;->i:Ljava/util/List;

    .line 272
    new-instance v0, Lo/div$1;

    invoke-direct {v0, p0}, Lo/div$1;-><init>(Lo/div;)V

    iput-object v0, p0, Lo/div;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 580
    const-string v0, ""

    iput-object v0, p0, Lo/div;->k:Ljava/lang/String;

    .line 665
    new-instance v0, Lo/div$2;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/div$2;-><init>(Lo/div;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    .line 861
    new-instance v0, Lo/div$7;

    invoke-direct {v0, p0}, Lo/div$7;-><init>(Lo/div;)V

    iput-object v0, p0, Lo/div;->l:Landroid/content/BroadcastReceiver;

    .line 103
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWMultiSimMgr Constructor context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/div;->d:Lo/dde;

    .line 106
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 107
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    iget-object v1, p0, Lo/div;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x1d

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 113
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/div;->l:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 116
    invoke-direct {p0}, Lo/div;->o()V

    .line 120
    return-void
.end method

.method static synthetic a(Lo/div;)Landroid/os/Handler;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    return-object v0
.end method

.method private a(I)V
    .locals 1

    .line 428
    new-instance v0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>()V

    .line 429
    invoke-virtual {v0, p1}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setResultCode(I)V

    .line 430
    invoke-direct {p0, v0}, Lo/div;->c(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V

    .line 431
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 200
    const-string v0, "MULTISIM_STORAGE_STATUS_KEY"

    new-instance v1, Lo/dcy;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lo/div;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 201
    return-void
.end method

.method static synthetic a(Lo/div;[B)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->e([B)V

    return-void
.end method

.method private a([B)V
    .locals 7

    .line 362
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procRemoveProfileRet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    const/4 v4, 0x1

    .line 366
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 367
    invoke-static {p1}, Lo/diu;->d([B)I

    move-result v5

    .line 368
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procRemoveProfileRet return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    const v5, 0x186a6

    goto :goto_0

    .line 371
    :cond_0
    invoke-static {p1}, Lo/diu;->b([B)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 372
    const v5, 0x186a0

    .line 377
    :goto_0
    goto :goto_1

    .line 374
    :catch_0
    move-exception v6

    .line 375
    const-string v0, "HWMultiSimMgr"

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

    .line 376
    const v5, 0x186a6

    .line 378
    :goto_1
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procRemoveProfileRet errCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "delProfileRet:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    const/16 v0, 0x9

    invoke-static {v0, v5}, Lo/dis;->a(II)V

    .line 382
    iget-object v0, p0, Lo/div;->a:Lo/dsw;

    if-eqz v0, :cond_1

    .line 384
    :try_start_1
    iget-object v0, p0, Lo/div;->a:Lo/dsw;

    invoke-interface {v0, v4}, Lo/dsw;->c(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 387
    goto :goto_2

    .line 385
    :catch_1
    move-exception v6

    .line 386
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procRemoveReportRet excption"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    :cond_1
    :goto_2
    return-void
.end method

.method static synthetic b(Lo/div;)Lo/dsw;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/div;->a:Lo/dsw;

    return-object v0
.end method

.method private b(IILjava/lang/Object;)V
    .locals 9

    .line 221
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procCallback callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {}, Lo/div;->n()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 223
    :try_start_0
    sget-object v0, Lo/div;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 224
    if-eqz v5, :cond_1

    .line 225
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 226
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 227
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 228
    invoke-interface {v7, p2, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 229
    invoke-interface {v5, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 230
    goto :goto_1

    .line 232
    :cond_0
    invoke-interface {v5, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 235
    :cond_1
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 236
    :goto_2
    return-void
.end method

.method private b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 208
    invoke-static {}, Lo/div;->n()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 209
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 210
    :try_start_0
    sget-object v0, Lo/div;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 211
    if-nez v3, :cond_0

    .line 212
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 213
    sget-object v0, Lo/div;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    :cond_0
    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 218
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 516
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getLocalDeviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    new-instance v0, Lo/div$4;

    invoke-direct {v0, p0, p1}, Lo/div$4;-><init>(Lo/div;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-direct {p0, v0}, Lo/div;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 540
    return-void
.end method

.method static synthetic b(Lo/div;IILjava/lang/Object;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3}, Lo/div;->b(IILjava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lo/div;[B)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->i([B)V

    return-void
.end method

.method private b([B)V
    .locals 7

    .line 333
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procSimInfoQuery"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    new-instance v4, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v4}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>()V

    .line 338
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 339
    invoke-static {p1}, Lo/diu;->d([B)I

    move-result v5

    .line 340
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSimInfoQuery return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    const v5, 0x186a6

    goto :goto_0

    .line 343
    :cond_0
    invoke-static {p1}, Lo/diu;->e([B)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    move-result-object v0

    move-object v4, v0

    .line 344
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procSimInfoQuery simInfo :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    const v5, 0x186a0

    .line 350
    :goto_0
    goto :goto_1

    .line 347
    :catch_0
    move-exception v6

    .line 348
    const-string v0, "HWMultiSimMgr"

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

    .line 349
    const v5, 0x186a6

    .line 352
    :goto_1
    const v0, 0x186a0

    if-ne v5, v0, :cond_1

    .line 353
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setResultCode(I)V

    goto :goto_2

    .line 355
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setResultCode(I)V

    .line 358
    :goto_2
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v4}, Lo/div;->b(IILjava/lang/Object;)V

    .line 359
    return-void
.end method

.method private b([BI)V
    .locals 6

    .line 317
    const v4, 0x31128

    .line 319
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCmdResult Complete cmd="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 322
    invoke-static {p1}, Lo/diu;->d([B)I

    move-result v0

    move v4, v0

    .line 323
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCmdResult return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 327
    :cond_0
    goto :goto_0

    .line 325
    :catch_0
    move-exception v5

    .line 326
    const-string v0, "HWMultiSimMgr"

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :goto_0
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCmdResult return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    return-void
.end method

.method public static c()Lo/div;
    .locals 6

    .line 125
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    sget-object v4, Lo/div;->f:Ljava/lang/Object;

    monitor-enter v4

    .line 127
    :try_start_0
    sget-object v0, Lo/div;->c:Lo/div;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 128
    new-instance v0, Lo/div;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/div;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/div;->c:Lo/div;

    .line 130
    :cond_0
    sget-object v0, Lo/div;->c:Lo/div;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 131
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method private c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 543
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " sendSimInfoQueryCmd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x6

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 545
    const/4 v0, 0x6

    invoke-direct {p0, v0, p1}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 546
    invoke-static {}, Lo/dis;->b()V

    .line 547
    return-void
.end method

.method private c(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V
    .locals 5

    .line 411
    if-nez p1, :cond_0

    .line 412
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "inpurt devInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    return-void

    .line 417
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/div;->a:Lo/dsw;

    if-eqz v0, :cond_1

    .line 418
    iget-object v0, p0, Lo/div;->a:Lo/dsw;

    invoke-interface {v0, p1}, Lo/dsw;->b(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V

    goto :goto_0

    .line 419
    :cond_1
    iget-object v0, p0, Lo/div;->h:Lo/dta;

    if-eqz v0, :cond_2

    .line 420
    iget-object v0, p0, Lo/div;->h:Lo/dta;

    invoke-interface {v0, p1}, Lo/dta;->e(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 424
    :cond_2
    :goto_0
    goto :goto_1

    .line 422
    :catch_0
    move-exception v4

    .line 423
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportDeviceInfo excption"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/div;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lo/div;->u()V

    return-void
.end method

.method static synthetic c(Lo/div;Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->c(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V

    return-void
.end method

.method static synthetic c(Lo/div;[B)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->k([B)V

    return-void
.end method

.method private c([B)V
    .locals 6

    .line 797
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procConformCode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 801
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_2

    .line 802
    invoke-static {p1}, Lo/diu;->d([B)I

    move-result v4

    .line 803
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procRemoveProfileRet return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v0, v4, v1}, Lo/div;->b(IILjava/lang/Object;)V

    .line 805
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 806
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/32 v2, 0x249f0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 808
    :cond_0
    const v0, 0x186a5

    if-ne v0, v4, :cond_1

    .line 809
    const/4 v0, 0x4

    const/16 v1, 0x3e8

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    goto :goto_0

    .line 812
    :cond_1
    const/4 v0, 0x4

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    goto :goto_0

    .line 815
    :cond_2
    const/4 v0, 0x3

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 816
    const/4 v0, 0x4

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 822
    :goto_0
    goto :goto_1

    .line 818
    :catch_0
    move-exception v5

    .line 819
    const-string v0, "HWMultiSimMgr"

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

    .line 820
    const/4 v0, 0x3

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 821
    const/4 v0, 0x4

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 823
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/div;I)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->a(I)V

    return-void
.end method

.method static synthetic d(Lo/div;[B)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->c([B)V

    return-void
.end method

.method static synthetic d(Lo/div;[BI)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lo/div;->b([BI)V

    return-void
.end method

.method private d([B)V
    .locals 5

    .line 742
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procMateDataAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 743
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 745
    :try_start_0
    invoke-static {p1}, Lo/diu;->g([B)Lo/dap;

    move-result-object v4

    .line 746
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procMateDataAuth :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/dap;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    invoke-virtual {v4}, Lo/dap;->c()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 748
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, v4}, Lo/div;->b(IILjava/lang/Object;)V

    .line 749
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dis;->a(IZ)V

    goto :goto_0

    .line 752
    :cond_0
    invoke-virtual {v4}, Lo/dap;->c()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 753
    invoke-virtual {v4}, Lo/dap;->c()I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    .line 754
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dis;->a(IZ)V

    goto :goto_0

    .line 757
    :cond_1
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dis;->a(IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 764
    :goto_0
    goto :goto_1

    .line 760
    :catch_0
    move-exception v4

    .line 761
    const-string v0, "HWMultiSimMgr"

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    const/4 v0, 0x2

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 763
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dis;->a(IZ)V

    .line 765
    :goto_1
    return-void
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 184
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/div;->b:Ljava/lang/String;

    .line 186
    sget-object v0, Lo/div;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 187
    const-string v0, ""

    sput-object v0, Lo/div;->b:Ljava/lang/String;

    .line 190
    :cond_0
    sget-object v0, Lo/div;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/div;)Ljava/util/List;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/div;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lo/div;[B)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->d([B)V

    return-void
.end method

.method private e([B)V
    .locals 6

    .line 768
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procOpenEsim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 772
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_2

    .line 773
    invoke-static {p1}, Lo/diu;->d([B)I

    move-result v4

    .line 774
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procOpenEsim return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v4, v1}, Lo/div;->b(IILjava/lang/Object;)V

    .line 776
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 777
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/32 v2, 0x249f0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 779
    :cond_0
    const v0, 0x186a5

    if-ne v0, v4, :cond_1

    .line 780
    const/4 v0, 0x2

    const/16 v1, 0x3e8

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    goto :goto_0

    .line 783
    :cond_1
    const/4 v0, 0x2

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    goto :goto_0

    .line 786
    :cond_2
    const/4 v0, 0x1

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 787
    const/4 v0, 0x2

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 793
    :goto_0
    goto :goto_1

    .line 789
    :catch_0
    move-exception v5

    .line 790
    const-string v0, "HWMultiSimMgr"

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

    .line 791
    const/4 v0, 0x1

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 792
    const/4 v0, 0x2

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 794
    :goto_1
    return-void
.end method

.method static synthetic g(Lo/div;[B)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->b([B)V

    return-void
.end method

.method static synthetic i(Lo/div;[B)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/div;->a([B)V

    return-void
.end method

.method private i([B)V
    .locals 6

    .line 826
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procConformCodeAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 830
    :try_start_0
    invoke-static {p1}, Lo/diu;->a([B)I

    move-result v4

    .line 831
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procRemoveProfileRet return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 833
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, v0, v4, v1}, Lo/div;->b(IILjava/lang/Object;)V

    .line 834
    const/4 v0, -0x1

    if-ne v0, v4, :cond_0

    .line 835
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dis;->a(IZ)V

    goto :goto_0

    .line 838
    :cond_0
    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dis;->a(IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 844
    :goto_0
    goto :goto_1

    .line 840
    :catch_0
    move-exception v5

    .line 841
    const-string v0, "HWMultiSimMgr"

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

    .line 842
    const/4 v0, 0x4

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 843
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dis;->a(IZ)V

    .line 845
    :goto_1
    return-void
.end method

.method private k([B)V
    .locals 6

    .line 848
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procEsimOpenRetReport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    const/4 v4, 0x0

    .line 851
    :try_start_0
    invoke-static {p1}, Lo/diu;->c([B)I

    move-result v4

    .line 852
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p0, v0, v4, v1}, Lo/div;->b(IILjava/lang/Object;)V

    .line 853
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procEsimOpenRetReport return ret:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 857
    goto :goto_0

    .line 854
    :catch_0
    move-exception v5

    .line 855
    const/4 v0, 0x5

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/div;->b(IILjava/lang/Object;)V

    .line 856
    const-string v0, "HWMultiSimMgr"

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

    .line 859
    :goto_0
    return-void
.end method

.method private m()Ljava/lang/String;
    .locals 1

    .line 196
    const-string v0, "MULTISIM_STORAGE_STATUS_KEY"

    invoke-virtual {p0, v0}, Lo/div;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static n()Ljava/lang/Object;
    .locals 1

    .line 204
    sget-object v0, Lo/div;->g:Ljava/util/Map;

    return-object v0
.end method

.method private o()V
    .locals 8

    .line 156
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStorage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    new-instance v4, Lo/dim;

    invoke-direct {v4}, Lo/dim;-><init>()V

    .line 160
    invoke-virtual {v4, p0}, Lo/dim;->b(Lo/div;)V

    .line 161
    invoke-direct {p0}, Lo/div;->m()Ljava/lang/String;

    move-result-object v5

    .line 162
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStorage updateStatus="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const-string v0, "STATUSV1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStorage already update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-void

    .line 168
    :cond_0
    new-instance v6, Lo/diq;

    invoke-direct {v6}, Lo/diq;-><init>()V

    .line 169
    invoke-virtual {p0}, Lo/div;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, p0, v0}, Lo/diq;->b(Lo/div;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 170
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStorage appList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    if-eqz v7, :cond_1

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 172
    invoke-static {}, Lo/div;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lo/div;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, p0, v7, v0, v1}, Lo/dim;->a(Lo/div;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    :cond_1
    invoke-virtual {v6, p0}, Lo/diq;->a(Lo/div;)V

    .line 175
    const-string v0, "STATUSV1"

    invoke-direct {p0, v0}, Lo/div;->a(Ljava/lang/String;)V

    .line 176
    return-void
.end method

.method private u()V
    .locals 4

    .line 506
    invoke-virtual {p0}, Lo/div;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 507
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simInfoQueryTimeout device not connect report not connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    const/4 v0, -0x2

    invoke-direct {p0, v0}, Lo/div;->a(I)V

    goto :goto_0

    .line 510
    :cond_0
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simInfoQueryTimeout device timeout unknow error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/div;->a(I)V

    .line 513
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 451
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " simInfoQueryFromDev "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    invoke-virtual {p0}, Lo/div;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 454
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simInfoQuery device not connect report not connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    const/4 v0, -0x2

    invoke-direct {p0, v0}, Lo/div;->a(I)V

    .line 456
    return-void

    .line 459
    :cond_0
    invoke-virtual {p0}, Lo/div;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 460
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simInfoQuery device not support multisim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    const/4 v0, -0x3

    invoke-direct {p0, v0}, Lo/div;->a(I)V

    .line 462
    return-void

    .line 465
    :cond_1
    iget-object v0, p0, Lo/div;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 466
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurCallingApp is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/div;->a(I)V

    .line 468
    return-void

    .line 471
    :cond_2
    iget-object v0, p0, Lo/div;->k:Ljava/lang/String;

    const-string v1, "com.huawei.hwmultisim"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/div;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/div;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 472
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simInfoQueryFromDev app not auth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 474
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 475
    const-string v0, "com.huawei.health.MULTI_SIM_AUTH"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 476
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 477
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 478
    return-void

    .line 482
    :cond_3
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 483
    new-instance v0, Lo/div$5;

    invoke-direct {v0, p0}, Lo/div$5;-><init>(Lo/div;)V

    invoke-direct {p0, v0}, Lo/div;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 503
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 735
    iget-object v1, p0, Lo/div;->i:Ljava/util/List;

    monitor-enter v1

    .line 736
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 737
    :try_start_0
    iget-object v0, p0, Lo/div;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 739
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 740
    :goto_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 434
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " simInfoQuery "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    invoke-virtual {p0}, Lo/div;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 438
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x4

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 439
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simInfoQuery device not connect wait"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    return-void

    .line 443
    :cond_0
    invoke-virtual {p0}, Lo/div;->a()V

    .line 444
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 392
    new-instance v0, Lo/div$3;

    invoke-direct {v0, p0}, Lo/div$3;-><init>(Lo/div;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v0, v2}, Lo/div;->c(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 407
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;)V"
        }
    .end annotation

    .line 550
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " removeESimProfile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    invoke-static {p1}, Lo/dis;->b(Ljava/util/List;)V

    .line 552
    return-void
.end method

.method public c(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 718
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Now it is openning Esim"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    const/4 v0, 0x1

    invoke-direct {p0, v0, p3}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 720
    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 721
    invoke-static {p1, p2}, Lo/dis;->e(Ljava/lang/String;I)V

    .line 722
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/32 v2, 0xafc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 724
    return-void
.end method

.method public c(Lo/dsw;)V
    .locals 4

    .line 248
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterAttachedDeviceMultiSimCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    iget-object v0, p0, Lo/div;->a:Lo/dsw;

    if-eq p1, v0, :cond_0

    .line 250
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IAttachedDeviceMultiSimCallback not equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/div;->a:Lo/dsw;

    .line 253
    return-void
.end method

.method public c(Lo/dta;)V
    .locals 4

    .line 265
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterIOpenMultiSimCalbcak"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    iget-object v0, p0, Lo/div;->h:Lo/dta;

    if-eq p1, v0, :cond_0

    .line 267
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIOpenMultiSimCalbcak not equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/div;->h:Lo/dta;

    .line 270
    return-void
.end method

.method public c(Z)V
    .locals 5

    .line 570
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " setAppAuthStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    new-instance v4, Lo/dim;

    invoke-direct {v4}, Lo/dim;-><init>()V

    .line 572
    if-eqz p1, :cond_0

    .line 573
    iget-object v0, p0, Lo/div;->k:Ljava/lang/String;

    invoke-static {}, Lo/div;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lo/div;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, p0, v0, v1, v2}, Lo/dim;->d(Lo/div;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    invoke-virtual {p0}, Lo/div;->b()V

    goto :goto_0

    .line 576
    :cond_0
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lo/div;->a(I)V

    .line 578
    :goto_0
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 586
    iget-object v0, p0, Lo/div;->k:Ljava/lang/String;

    return-object v0
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 727
    iget-object v1, p0, Lo/div;->i:Ljava/util/List;

    monitor-enter v1

    .line 728
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 729
    :try_start_0
    iget-object v0, p0, Lo/div;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 731
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 732
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 930
    const/4 v0, 0x3

    invoke-direct {p0, v0, p3}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 931
    const/4 v0, 0x4

    invoke-direct {p0, v0, p4}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 932
    invoke-static {p1, p2}, Lo/dis;->a(Ljava/lang/String;I)V

    .line 933
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/32 v2, 0xafc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 934
    return-void
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 701
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Now it is openning Esim"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 702
    const/4 v0, 0x1

    invoke-direct {p0, v0, p2}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 703
    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 704
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/dis;->e(Ljava/lang/String;I)V

    .line 705
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/32 v2, 0xafc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 707
    return-void
.end method

.method public d(Lo/dsw;)V
    .locals 4

    .line 239
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerAttachedDeviceMultiSimCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 241
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    return-void

    .line 244
    :cond_0
    iput-object p1, p0, Lo/div;->a:Lo/dsw;

    .line 245
    return-void
.end method

.method public d(Lo/dta;)V
    .locals 4

    .line 256
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registeIOpenMultiSimCalbcak"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 258
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    return-void

    .line 261
    :cond_0
    iput-object p1, p0, Lo/div;->h:Lo/dta;

    .line 262
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 5

    .line 564
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getAppAuthStatus :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    new-instance v4, Lo/dim;

    invoke-direct {v4}, Lo/dim;-><init>()V

    .line 566
    invoke-static {}, Lo/div;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lo/div;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, p0, p1, v0, v1}, Lo/dim;->b(Lo/div;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(ILjava/lang/String;)V
    .locals 4

    .line 555
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " eSimStatusNotify"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    invoke-static {p1, p2}, Lo/dis;->a(ILjava/lang/String;)V

    .line 557
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 962
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getMultiSimDevicInfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 963
    invoke-direct {p0, p1}, Lo/div;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 964
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 582
    iput-object p1, p0, Lo/div;->k:Ljava/lang/String;

    .line 583
    return-void
.end method

.method public e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 710
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Now it is openEsimWithoutConfirm Esim"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    const/4 v0, 0x1

    invoke-direct {p0, v0, p2}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 712
    const/4 v0, 0x5

    invoke-direct {p0, v0, p3}, Lo/div;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 713
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/dis;->e(Ljava/lang/String;I)V

    .line 714
    iget-object v0, p0, Lo/div;->n:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/32 v2, 0xafc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 715
    return-void
.end method

.method public f()Z
    .locals 6

    .line 590
    const/4 v4, 0x0

    .line 591
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 593
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " isDeviceConnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 595
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getAttachedDeviceMultiSimInfo deviceInfo is connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 596
    const/4 v4, 0x1

    .line 599
    :cond_0
    return v4
.end method

.method public g()Z
    .locals 6

    .line 621
    const/4 v4, 0x0

    .line 623
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 624
    if-nez v5, :cond_0

    .line 625
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportMultiSim deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    return v4

    .line 629
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 630
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device support multiSim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    const/4 v4, 0x1

    .line 634
    :cond_1
    return v4
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 152
    const/16 v0, 0x1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 3

    .line 656
    const-string v1, ""

    .line 657
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 659
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 660
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    .line 662
    :cond_0
    return-object v1
.end method

.method public i()Ljava/lang/String;
    .locals 3

    .line 642
    const-string v1, ""

    .line 643
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 645
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 646
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    .line 648
    :cond_0
    return-object v1
.end method

.method public k()Z
    .locals 6

    .line 603
    const/4 v4, 0x0

    .line 605
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 606
    if-nez v5, :cond_0

    .line 607
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportESIM deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    return v4

    .line 611
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 612
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device support esim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const/4 v4, 0x1

    .line 616
    :cond_1
    return v4
.end method

.method public l()I
    .locals 5

    .line 906
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 907
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 908
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncFitnessTodayData get device info error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 909
    const/4 v0, 0x3

    return v0

    .line 912
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 7

    .line 136
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 138
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/div;->l:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 139
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, Lo/dde;->d(I)V

    .line 140
    invoke-static {}, Lo/div;->n()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 141
    :try_start_0
    sget-object v0, Lo/div;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 143
    :goto_0
    iget-object v4, p0, Lo/div;->i:Ljava/util/List;

    monitor-enter v4

    .line 144
    :try_start_1
    iget-object v0, p0, Lo/div;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 145
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v6

    monitor-exit v4

    throw v6

    .line 146
    :goto_1
    const/4 v0, 0x0

    sput-object v0, Lo/div;->c:Lo/div;

    .line 147
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy() complete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 6

    .line 942
    const-string v4, ""

    .line 943
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 944
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 945
    return-object v4

    .line 947
    :cond_0
    iget-object v0, p0, Lo/div;->d:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 948
    if-eqz v5, :cond_1

    .line 949
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 950
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    .line 953
    :cond_1
    return-object v4
.end method
