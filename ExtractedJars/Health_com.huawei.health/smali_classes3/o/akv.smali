.class public Lo/akv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akv$a;
    }
.end annotation


# static fields
.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private static m:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Landroid/content/IntentFilter;

.field private d:Z

.field private f:Z

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:I

.field private k:Z

.field private l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private n:Landroid/content/BroadcastReceiver;

.field private o:Ljava/lang/Object;

.field private p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/akv;->e:Ljava/util/List;

    .line 92
    new-instance v0, Lo/akv$4;

    invoke-direct {v0}, Lo/akv$4;-><init>()V

    sput-object v0, Lo/akv;->m:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->d:Z

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->b:Z

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->a:Z

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->h:Z

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->f:Z

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/akv;->i:I

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/akv;->g:Ljava/util/List;

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->k:Z

    .line 68
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/akv;->o:Ljava/lang/Object;

    .line 103
    new-instance v0, Lo/akv$5;

    invoke-direct {v0, p0}, Lo/akv$5;-><init>(Lo/akv;)V

    iput-object v0, p0, Lo/akv;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 161
    new-instance v0, Lo/akv$1;

    invoke-direct {v0, p0}, Lo/akv$1;-><init>(Lo/akv;)V

    iput-object v0, p0, Lo/akv;->l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 183
    new-instance v0, Lo/akv$2;

    invoke-direct {v0, p0}, Lo/akv$2;-><init>(Lo/akv;)V

    iput-object v0, p0, Lo/akv;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 75
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    new-instance v1, Lo/akv$3;

    invoke-direct {v1, p0}, Lo/akv$3;-><init>(Lo/akv;)V

    invoke-virtual {v0, v1}, Lo/aks;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 89
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    sget-object v1, Lo/akv;->m:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->u(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 90
    return-void
.end method

.method synthetic constructor <init>(Lo/akv$3;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/akv;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/akv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/akv;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 257
    const-string v0, "com.huawei.health.fitness_summary_sync_success"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive SUMMARY_DATA_SYNC_SUCCEED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_2

    .line 260
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 262
    :cond_0
    const-string v0, "com.huawei.health.fitness_detail_sync_success"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 263
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive DETAIL_DATA_SYNC_SUCCEED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    .line 266
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 269
    :cond_1
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    invoke-virtual {v0}, Lo/yy;->k()V

    .line 271
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/akv;Landroid/content/Intent;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/akv;->e(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lo/akv;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/akv;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lo/akv;)Ljava/lang/Object;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/akv;->o:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lo/akv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 274
    const-string v0, "com.huawei.health.workout_record_save_finish"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive WORKOUT_RECORD_SAVE_FINISH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 278
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x5

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 280
    :cond_0
    const-string v0, "com.huawei.health.fitness_detail_sync_fail"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive FITNESS_DETAIL_SYNC_FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 284
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 287
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/akv;)Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lo/akv;->k:Z

    return v0
.end method

.method public static final e()Lo/akv;
    .locals 1

    .line 100
    invoke-static {}, Lo/akv$a;->a()Lo/akv;

    move-result-object v0

    return-object v0
.end method

.method private e(Landroid/content/Intent;)V
    .locals 7

    .line 290
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 291
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_START"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive CORE_SLEEP_DATA_SYNC_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_2

    .line 295
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 298
    :cond_0
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_SUCCESS"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 299
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive CORE_SLEEP_DATA_SYNC_SUCCEED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_2

    .line 301
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x3

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 303
    :cond_1
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_FAILED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 304
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator receive CORE_SLEEP_DATA_SYNC_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_2

    .line 307
    const/4 v5, -0x1

    .line 309
    const-string v0, "errorcode"

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    move v5, v0

    .line 310
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshSleepData() errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 313
    goto :goto_0

    .line 311
    :catch_0
    move-exception v6

    .line 312
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshSleepData() Exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    :goto_0
    iget-object v0, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 317
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/akv;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/akv;->g()V

    return-void
.end method

.method static synthetic e(Lo/akv;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/akv;->c(Ljava/lang/String;)V

    return-void
.end method

.method private e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z
    .locals 3

    .line 509
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    const/4 v0, 0x0

    return v0

    .line 513
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    .line 514
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 515
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 516
    const/4 v0, 0x1

    return v0

    .line 514
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 520
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private g()V
    .locals 6

    .line 124
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMediator"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/akv;->k:Z

    .line 128
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->a()Z

    .line 130
    invoke-static {}, Lo/akq;->a()Lo/akq;

    move-result-object v0

    invoke-virtual {v0}, Lo/akq;->c()Z

    .line 132
    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v0

    invoke-virtual {v0}, Lo/akr;->e()Z

    .line 134
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->c()Z

    .line 136
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->b()Z

    .line 138
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->e()Z

    .line 140
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->h()V

    .line 142
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->k()V

    .line 144
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->m()V

    .line 146
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->o()V

    .line 148
    invoke-static {}, Lo/akp;->d()Lo/akp;

    move-result-object v0

    invoke-virtual {v0}, Lo/akp;->e()V

    .line 150
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akv;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 152
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->h()I

    move-result v4

    .line 153
    const/4 v5, 0x0

    .line 154
    const/4 v0, 0x2

    if-le v4, v0, :cond_0

    .line 155
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->b()I

    move-result v5

    .line 157
    :cond_0
    invoke-virtual {p0}, Lo/akv;->f()V

    .line 158
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator initialized completed wearSize:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  deleteNum:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-void
.end method

.method private o()V
    .locals 7

    .line 457
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->i()Lorg/json/JSONObject;

    move-result-object v4

    .line 461
    if-eqz v4, :cond_6

    .line 462
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceCapability"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const/4 v5, 0x0

    .line 469
    const/4 v6, 0x0

    .line 470
    const-string v0, "isSupportExerciseAdvice"

    :try_start_0
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 471
    const-string v0, "isSupportExerciseAdvice"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    .line 473
    :cond_0
    const-string v0, "isSupportWorkoutExerciseDisplayLink"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    const-string v0, "isSupportWorkoutExerciseDisplayLink"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    .line 476
    :cond_1
    const-string v0, "isSupportHeartRateInfo"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 477
    const-string v0, "isSupportHeartRateInfo"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/akv;->h:Z

    .line 478
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SupportHeartRateInfo is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/akv;->h:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    :cond_2
    const-string v0, "isSupportStressInfo"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 481
    const-string v0, "isSupportStressInfo"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/akv;->f:Z

    .line 482
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SupportStressInfo is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/akv;->f:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    :cond_3
    if-eqz v5, :cond_4

    if-eqz v6, :cond_4

    .line 485
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNewLinkStrategy is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/akv;->a:Z

    .line 487
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->b:Z

    goto :goto_0

    .line 488
    :cond_4
    if-eqz v5, :cond_5

    .line 490
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOldLinkStrategy is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/akv;->b:Z

    .line 492
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->a:Z

    goto :goto_0

    .line 496
    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->a:Z

    .line 497
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->b:Z

    .line 498
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "both are false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    :goto_0
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Mediator isNewLinkStrategy:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/akv;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isOldLinkStrategy:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/akv;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isSupportHeartReport:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/akv;->h:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 504
    goto :goto_1

    .line 502
    :catch_0
    move-exception v5

    .line 503
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    :cond_6
    :goto_1
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 342
    iput p1, p0, Lo/akv;->i:I

    .line 343
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 350
    iput-boolean p1, p0, Lo/akv;->b:Z

    .line 351
    return-void
.end method

.method public a()Z
    .locals 1

    .line 329
    iget-boolean v0, p0, Lo/akv;->d:Z

    return v0
.end method

.method public b()V
    .locals 2

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akv;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 202
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akv;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 203
    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 333
    iput-boolean p1, p0, Lo/akv;->d:Z

    .line 334
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    iget-boolean v1, p0, Lo/akv;->d:Z

    invoke-virtual {v0, v1}, Lo/yy;->b(Z)V

    .line 335
    return-void
.end method

.method public c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 210
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyWearSDKRefreshData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lo/akv;->n:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    .line 213
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register Receiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    iget-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.health.fitness_summary_sync_success"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 216
    iget-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.health.fitness_detail_sync_success"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_START"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_SUCCESS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_FAILED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.health.workout_record_save_finish"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.health.fitness_detail_sync_fail"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 223
    new-instance v0, Lo/akv$8;

    invoke-direct {v0, p0}, Lo/akv$8;-><init>(Lo/akv;)V

    iput-object v0, p0, Lo/akv;->n:Landroid/content/BroadcastReceiver;

    .line 245
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/akv;->n:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lo/akv;->c:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 249
    :cond_0
    iput-object p2, p0, Lo/akv;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 251
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akv;->l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->n(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 253
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 196
    iput-object p1, p0, Lo/akv;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 197
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akv;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 198
    return-void
.end method

.method public c()Z
    .locals 1

    .line 346
    iget-boolean v0, p0, Lo/akv;->b:Z

    return v0
.end method

.method public d(Z)V
    .locals 0

    .line 358
    iput-boolean p1, p0, Lo/akv;->a:Z

    .line 359
    return-void
.end method

.method public d()Z
    .locals 1

    .line 354
    iget-boolean v0, p0, Lo/akv;->a:Z

    return v0
.end method

.method public e(Z)V
    .locals 0

    .line 366
    iput-boolean p1, p0, Lo/akv;->h:Z

    .line 367
    return-void
.end method

.method public f()V
    .locals 9

    .line 382
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateDeviceFromWearAPP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    sget-object v0, Lo/akv;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 386
    invoke-direct {p0}, Lo/akv;->o()V

    .line 387
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/aks;->d(Z)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 388
    if-eqz v4, :cond_1

    .line 389
    invoke-direct {p0, v4}, Lo/akv;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 392
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateDeviceFromWearAPP isWearDeviceSupportHeart()\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v3

    invoke-virtual {v3}, Lo/aks;->k()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 394
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 395
    sget-object v0, Lo/akv;->e:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 399
    :cond_0
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " has already been added "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    :cond_1
    :goto_0
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/aks;->d(Z)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 404
    if-eqz v5, :cond_3

    .line 405
    invoke-direct {p0, v5}, Lo/akv;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 407
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateDeviceFromWearAPP isHealthDeviceSupportHeart()\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v3

    invoke-virtual {v3}, Lo/aks;->l()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 409
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 410
    sget-object v0, Lo/akv;->e:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 414
    :cond_2
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " has already been added "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    :cond_3
    :goto_1
    sget-object v0, Lo/akv;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    iget-boolean v0, p0, Lo/akv;->h:Z

    if-eqz v0, :cond_4

    .line 419
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->b()I

    move-result v6

    .line 420
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateDeviceFromWearAPP delete num;"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  tempDeviceInfoList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/akv;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    sget-object v0, Lo/akv;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 422
    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/akr;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 423
    goto :goto_2

    .line 442
    :cond_4
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateDeviceFromWearAPP heartRateDevices size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 444
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateDeviceFromWearAPP heartRateDevices aar "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    goto :goto_3

    .line 448
    :cond_5
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 450
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateDeviceFromWearAPP setLinkStatus is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akv;->d:Z

    .line 453
    :cond_6
    return-void
.end method

.method protected finalize()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 321
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Mediator finalized"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 323
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/akv;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 324
    invoke-static {}, Lo/akp;->d()Lo/akp;

    move-result-object v0

    invoke-virtual {v0}, Lo/akp;->c()V

    .line 325
    return-void
.end method

.method public h()Z
    .locals 1

    .line 362
    iget-boolean v0, p0, Lo/akv;->h:Z

    return v0
.end method

.method public i()Z
    .locals 1

    .line 374
    iget-boolean v0, p0, Lo/akv;->f:Z

    return v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 378
    iget-object v0, p0, Lo/akv;->g:Ljava/util/List;

    return-object v0
.end method
