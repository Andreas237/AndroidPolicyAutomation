.class public final enum Lo/ahw;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahw$a;,
        Lo/ahw$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ahw;>;"
    }
.end annotation


# static fields
.field private static d:Ljava/lang/Object;

.field public static final enum e:Lo/ahw;

.field private static final synthetic t:[Lo/ahw;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field private b:Lo/ahw$b;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field private f:I

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation
.end field

.field private h:J

.field private i:J

.field private k:I

.field private l:Lo/cma;

.field private m:Lo/ego$a;

.field private n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/ajj;>;"
        }
    .end annotation
.end field

.field private o:Lo/ahw$a;

.field private p:Lo/ego;

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 48
    new-instance v0, Lo/ahw;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ahw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ahw;->e:Lo/ahw;

    .line 47
    const/4 v0, 0x1

    new-array v0, v0, [Lo/ahw;

    sget-object v1, Lo/ahw;->e:Lo/ahw;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/ahw;->t:[Lo/ahw;

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ahw;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ahw;->c:Ljava/util/ArrayList;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    .line 66
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ahw;->h:J

    .line 67
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ahw;->i:J

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/ahw;->k:I

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/ahw;->f:I

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahw;->r:Z

    .line 86
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "updata_wifi_data"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 88
    new-instance v0, Lo/ahw$b;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/ahw$b;-><init>(Lo/ahw;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ahw;->b:Lo/ahw$b;

    .line 89
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/ahw;->n:Ljava/util/Map;

    .line 90
    return-void
.end method

.method static synthetic a(Lo/ahw;)Lo/ahw$b;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/ahw;->b:Lo/ahw$b;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 5

    .line 352
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 353
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 354
    return-void

    .line 356
    :cond_0
    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 357
    new-instance v0, Lo/ego;

    invoke-direct {v0, p1}, Lo/ego;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ahw;->p:Lo/ego;

    .line 358
    new-instance v0, Lo/ego$a;

    invoke-direct {v0, p1}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ahw;->m:Lo/ego$a;

    .line 359
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "IDS_hw_health_show_healthdata_deleteing"

    invoke-static {v1}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 360
    iget-object v0, p0, Lo/ahw;->m:Lo/ego$a;

    invoke-virtual {v0, v4}, Lo/ego$a;->d(Ljava/lang/String;)Lo/ego$a;

    .line 361
    iget-object v0, p0, Lo/ahw;->m:Lo/ego$a;

    invoke-virtual {v0}, Lo/ego$a;->d()Lo/ego;

    move-result-object v0

    iput-object v0, p0, Lo/ahw;->p:Lo/ego;

    .line 362
    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 363
    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    new-instance v1, Lo/ahw$4;

    invoke-direct {v1, p0}, Lo/ahw$4;-><init>(Lo/ahw;)V

    invoke-virtual {v0, v1}, Lo/ego;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 373
    :cond_1
    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 374
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog show"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->show()V

    .line 376
    iget-object v0, p0, Lo/ahw;->o:Lo/ahw$a;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lo/ahw$a;->sendEmptyMessage(I)Z

    .line 378
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/ahw;I)I
    .locals 0

    .line 47
    iput p1, p0, Lo/ahw;->f:I

    return p1
.end method

.method private b(J)V
    .locals 2

    .line 306
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 307
    const-string v0, "weight_data_old_time"

    invoke-virtual {v1, v0, p1, p2}, Lo/aev;->b(Ljava/lang/String;J)V

    .line 308
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 171
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 172
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 173
    const-string v0, "isDelUser"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 174
    new-instance v0, Lo/ahi$a;

    const-string v1, "evebus_weight_measure_notification"

    invoke-direct {v0, v1, v4}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 176
    :cond_0
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mData.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 177
    sget-object v4, Lo/ahw;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 178
    :try_start_0
    iget-object v0, p0, Lo/ahw;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 179
    iget-object v0, p0, Lo/ahw;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 181
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/ahw;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/ahw;->i()V

    return-void
.end method

.method private c(J)V
    .locals 2

    .line 312
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 313
    const-string v0, "weight_data_red_old_time"

    invoke-virtual {v1, v0, p1, p2}, Lo/aev;->b(Ljava/lang/String;J)V

    .line 314
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 155
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 156
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 157
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/ahw;->i:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 159
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ahw;->i:J

    .line 160
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " updataNewClaimData oldRedDataTime "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/ahw;->i:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahw;->r:Z

    .line 165
    :cond_0
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    iget-boolean v0, p0, Lo/ahw;->r:Z

    if-eqz v0, :cond_1

    .line 166
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahw;->r:Z

    .line 168
    :cond_1
    return-void
.end method

.method static synthetic c(Lo/ahw;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/ahw;->h()V

    return-void
.end method

.method static synthetic c(Lo/ahw;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/ahw;->e(I)V

    return-void
.end method

.method static synthetic c(Lo/ahw;Ljava/util/List;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/ahw;->b(Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lo/ahw;Lo/cma;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/ahw;->d(Lo/cma;)V

    return-void
.end method

.method static synthetic d(Lo/ahw;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/ahw;->k()V

    return-void
.end method

.method private d(Lo/cma;)V
    .locals 5

    .line 400
    iget v0, p0, Lo/ahw;->k:I

    const/16 v1, 0x64

    if-lt v0, v1, :cond_2

    .line 401
    iget v0, p0, Lo/ahw;->f:I

    iget v1, p0, Lo/ahw;->k:I

    if-ge v0, v1, :cond_1

    .line 402
    iget v0, p0, Lo/ahw;->k:I

    iget v1, p0, Lo/ahw;->f:I

    sub-int/2addr v0, v1

    const/16 v1, 0x32

    if-lt v0, v1, :cond_0

    iget v0, p0, Lo/ahw;->f:I

    add-int/lit8 v4, v0, 0x32

    goto :goto_0

    :cond_0
    iget v4, p0, Lo/ahw;->k:I

    .line 403
    :goto_0
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDatasInProgress mCurrentDeleteSize:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ahw;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " deleteNum:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 404
    iget-object v0, p0, Lo/ahw;->g:Ljava/util/ArrayList;

    iget v1, p0, Lo/ahw;->f:I

    invoke-virtual {v0, v1, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lo/ahw;->b(Ljava/util/List;Lo/cma;)V

    .line 405
    goto :goto_1

    .line 406
    :cond_1
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lo/ahw;->e(I)V

    goto :goto_1

    .line 409
    :cond_2
    iget v0, p0, Lo/ahw;->f:I

    iget v1, p0, Lo/ahw;->k:I

    if-ge v0, v1, :cond_3

    .line 410
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDatasInProgress not show dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 411
    iget-object v0, p0, Lo/ahw;->g:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, p1}, Lo/ahw;->b(Ljava/util/List;Lo/cma;)V

    goto :goto_1

    .line 413
    :cond_3
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lo/ahw;->e(I)V

    .line 416
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/ahw;)Ljava/util/ArrayList;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/ahw;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method private e(I)V
    .locals 2

    .line 392
    iget-object v0, p0, Lo/ahw;->o:Lo/ahw$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 393
    iget-object v0, p0, Lo/ahw;->o:Lo/ahw$a;

    invoke-virtual {v0, p1}, Lo/ahw$a;->sendEmptyMessage(I)Z

    .line 395
    :cond_0
    return-void
.end method

.method static synthetic f(Lo/ahw;)I
    .locals 1

    .line 47
    iget v0, p0, Lo/ahw;->f:I

    return v0
.end method

.method static synthetic g()Ljava/lang/Object;
    .locals 1

    .line 47
    sget-object v0, Lo/ahw;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic g(Lo/ahw;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/ahw;->m()V

    return-void
.end method

.method private h()V
    .locals 9

    .line 228
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncClaimData in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 229
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 230
    const/4 v6, 0x1

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 231
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 232
    new-instance v8, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 233
    const-wide/32 v0, 0x240c8400

    sub-long v0, v4, v0

    invoke-virtual {v8, v0, v1, v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 234
    invoke-virtual {v8, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 235
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 236
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 237
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 238
    const-string v0, "-1"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 239
    invoke-virtual {v8, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 240
    invoke-direct {p0}, Lo/ahw;->p()V

    .line 241
    invoke-direct {p0}, Lo/ahw;->o()V

    .line 242
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ahw$2;

    invoke-direct {v1, p0}, Lo/ahw$2;-><init>(Lo/ahw;)V

    invoke-interface {v0, v8, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 277
    return-void

    nop

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method static synthetic h(Lo/ahw;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/ahw;->n()V

    return-void
.end method

.method static synthetic i(Lo/ahw;)Lo/cma;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/ahw;->l:Lo/cma;

    return-object v0
.end method

.method private i()V
    .locals 12

    .line 280
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getShowMeasureData in oldDataTime;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/ahw;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-wide v4, p0, Lo/ahw;->h:J

    .line 283
    invoke-virtual {p0}, Lo/ahw;->d()Ljava/util/ArrayList;

    move-result-object v6

    .line 284
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 286
    sget-object v8, Lo/ahw;->d:Ljava/lang/Object;

    monitor-enter v8

    .line 287
    :try_start_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 288
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    .line 289
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getShowMeasureData ADD data "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 290
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    :cond_0
    goto :goto_0

    .line 293
    :cond_1
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v11

    monitor-exit v8

    throw v11

    .line 294
    :goto_1
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getShowMeasureData new device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    invoke-direct {p0, v7}, Lo/ahw;->c(Ljava/util/List;)V

    .line 296
    iget-object v0, p0, Lo/ahw;->b:Lo/ahw$b;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/ahw$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 298
    return-void
.end method

.method static synthetic k(Lo/ahw;)I
    .locals 1

    .line 47
    iget v0, p0, Lo/ahw;->k:I

    return v0
.end method

.method private k()V
    .locals 6

    .line 222
    iget-object v0, p0, Lo/ahw;->n:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 223
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ajj;

    const-string v1, "get new claim complete"

    invoke-virtual {p0}, Lo/ahw;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Lo/ajj;->onResult(ILjava/lang/String;Ljava/lang/Object;)V

    .line 224
    goto :goto_0

    .line 225
    :cond_0
    return-void
.end method

.method private m()V
    .locals 5

    .line 443
    iget-object v0, p0, Lo/ahw;->m:Lo/ego$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 444
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataProgress mCurrentDeleteSize:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ahw;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " deleteTotalSize:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/ahw;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 445
    iget v0, p0, Lo/ahw;->f:I

    mul-int/lit8 v0, v0, 0x64

    iget v1, p0, Lo/ahw;->k:I

    div-int v4, v0, v1

    .line 446
    iget-object v0, p0, Lo/ahw;->m:Lo/ego$a;

    invoke-virtual {v0, v4}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 447
    iget-object v0, p0, Lo/ahw;->m:Lo/ego$a;

    invoke-virtual {v0, v4}, Lo/ego$a;->b(I)Lo/ego$a;

    .line 449
    :cond_0
    return-void
.end method

.method private n()V
    .locals 4

    .line 381
    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 382
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lo/ahw;->p:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->dismiss()V

    .line 384
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ahw;->p:Lo/ego;

    .line 385
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ahw;->m:Lo/ego$a;

    .line 387
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ahw;->l:Lo/cma;

    .line 388
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ahw;->o:Lo/ahw$a;

    .line 389
    return-void
.end method

.method private o()V
    .locals 3

    .line 317
    new-instance v2, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 318
    const-string v0, "weight_data_red_old_time"

    invoke-virtual {v2, v0}, Lo/aev;->a(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/ahw;->i:J

    .line 319
    return-void
.end method

.method private p()V
    .locals 3

    .line 301
    new-instance v2, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 302
    const-string v0, "weight_data_old_time"

    invoke-virtual {v2, v0}, Lo/aev;->a(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/ahw;->h:J

    .line 303
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ahw;
    .locals 1

    .line 47
    const-class v0, Lo/ahw;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ahw;

    return-object v0
.end method

.method public static values()[Lo/ahw;
    .locals 1

    .line 47
    sget-object v0, Lo/ahw;->t:[Lo/ahw;

    invoke-virtual {v0}, [Lo/ahw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ahw;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 145
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 146
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/ahw;->c(J)V

    goto :goto_0

    .line 148
    :cond_0
    iget-wide v0, p0, Lo/ahw;->i:J

    invoke-direct {p0, v0, v1}, Lo/ahw;->c(J)V

    .line 150
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahw;->r:Z

    .line 151
    return-void
.end method

.method public b()V
    .locals 2

    .line 134
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 135
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/ahw;->b(J)V

    goto :goto_0

    .line 137
    :cond_0
    iget-wide v0, p0, Lo/ahw;->h:J

    invoke-direct {p0, v0, v1}, Lo/ahw;->b(J)V

    .line 139
    :goto_0
    invoke-virtual {p0}, Lo/ahw;->a()V

    .line 140
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 141
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lo/ahw;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lo/ahw;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    :cond_0
    return-void
.end method

.method public b(Ljava/util/List;Lo/cma;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;Lo/cma;)V"
        }
    .end annotation

    .line 451
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightData mDatas:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 452
    new-instance v0, Lo/ahw$3;

    invoke-direct {v0, p0, p1, p2}, Lo/ahw$3;-><init>(Lo/ahw;Ljava/util/List;Lo/cma;)V

    invoke-static {p1, v0}, Lo/ahx;->d(Ljava/util/List;Lo/cma;)V

    .line 477
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lo/ahw;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 103
    sget-object v4, Lo/ahw;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 104
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getClaimDataCatch Size,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahw;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lo/ahw;->c:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 106
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public d(Ljava/lang/String;Lo/ajj;)V
    .locals 1

    .line 93
    iget-object v0, p0, Lo/ahw;->n:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    return-void
.end method

.method public d(Ljava/util/ArrayList;Landroid/content/Context;Lo/cma;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/aht;>;Landroid/content/Context;Lo/cma;)V"
        }
    .end annotation

    .line 334
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 335
    :cond_0
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightData mDatas is null or context is null or listener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 336
    return-void

    .line 338
    :cond_1
    iput-object p3, p0, Lo/ahw;->l:Lo/cma;

    .line 339
    new-instance v0, Lo/ahw$a;

    invoke-virtual {p2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/ahw$a;-><init>(Lo/ahw;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ahw;->o:Lo/ahw$a;

    .line 340
    invoke-static {p1}, Lo/ahx;->c(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/ahw;->g:Ljava/util/ArrayList;

    .line 341
    iget-object v0, p0, Lo/ahw;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lo/ahw;->k:I

    .line 342
    const/4 v0, 0x0

    iput v0, p0, Lo/ahw;->f:I

    .line 343
    iget v0, p0, Lo/ahw;->k:I

    const/16 v1, 0x64

    if-lt v0, v1, :cond_2

    .line 344
    invoke-direct {p0, p2}, Lo/ahw;->a(Landroid/content/Context;)V

    .line 345
    iget-object v0, p0, Lo/ahw;->o:Lo/ahw$a;

    const/4 v1, 0x5

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Lo/ahw$a;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 347
    :cond_2
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/ahw;->e(I)V

    .line 349
    :goto_0
    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/aht;>;"
        }
    .end annotation

    .line 110
    sget-object v1, Lo/ahw;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 111
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 112
    iget-object v0, p0, Lo/ahw;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 113
    new-instance v5, Lo/aht;

    invoke-direct {v5}, Lo/aht;-><init>()V

    .line 114
    iput-object v4, v5, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    .line 115
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    monitor-exit v1

    return-object v2

    .line 118
    :catchall_0
    move-exception v6

    monitor-exit v1

    throw v6
.end method

.method public e(Ljava/util/ArrayList;Lo/acu;Ljava/lang/String;Lo/abz;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/aht;>;Lo/acu;Ljava/lang/String;Lo/abz;)V"
        }
    .end annotation

    .line 323
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "claimWeightData in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    .line 325
    new-instance v4, Lo/ahx;

    invoke-direct {v4, p1, p2, p3, p4}, Lo/ahx;-><init>(Ljava/util/ArrayList;Lo/acu;Ljava/lang/String;Lo/abz;)V

    .line 326
    iget-object v0, p0, Lo/ahw;->b:Lo/ahw$b;

    invoke-virtual {v0, v4}, Lo/ahw$b;->post(Ljava/lang/Runnable;)Z

    .line 327
    goto :goto_2

    .line 328
    :cond_0
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "claimWeightData data or user is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " data:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    if-nez p1, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " : user:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    if-nez p2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 330
    :goto_2
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "claimWeightData out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 331
    return-void
.end method

.method public f()V
    .locals 2

    .line 217
    iget-object v0, p0, Lo/ahw;->b:Lo/ahw$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ahw$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 218
    return-void
.end method
