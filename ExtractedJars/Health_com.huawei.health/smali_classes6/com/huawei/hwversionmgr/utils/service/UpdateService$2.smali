.class Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;
.super Lo/dps;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwversionmgr/utils/service/UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V
    .locals 0

    .line 404
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {p0}, Lo/dps;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 407
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mBandCheckNewVersion HandlerhandleCheckFailed: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 409
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 410
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandCheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;Z)V

    .line 413
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpk;->l(Landroid/content/Context;)V

    .line 414
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->d(Ljava/lang/Boolean;)V

    .line 415
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->k(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 417
    :cond_0
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandCheckNewVersionHandler handleAutoCheckFailed() reason = \u5176\u4ed6\u539f\u56e0\u5931\u8d25\uff0c\u672a\u6fc0\u6d3b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;Z)V

    .line 420
    :goto_0
    const/16 v0, 0x8

    invoke-static {v0}, Lo/dpr;->e(I)V

    .line 422
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 423
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 424
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandCheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->k(Ljava/lang/String;Landroid/content/Context;)V

    .line 426
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 427
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpk;->l(Landroid/content/Context;)V

    .line 428
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->d(Ljava/lang/Boolean;)V

    .line 430
    :cond_2
    const/16 v0, 0xb

    invoke-static {v0, p1}, Lo/dpr;->c(II)V

    .line 432
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    .line 433
    return-void
.end method

.method public d(Lo/dow;)V
    .locals 5

    .line 437
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mBandCheckNewVersionHandler handleManualCheckSuccess: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    if-eqz p1, :cond_4

    .line 439
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 440
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 441
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-wide v1, p1, Lo/dow;->h:J

    long-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I

    .line 442
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mBandCheckNewVersionHandler handleManualCheckSuccess: mCheckNewVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget v1, p1, Lo/dow;->z:I

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I

    .line 444
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 446
    const-string v0, "UpdateService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandCheckNewVersionHandler handleManualCheckSuccess: mAppMinCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->h(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mAppForcedUpdate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "mForcedUpdate = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 448
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->k(Ljava/lang/String;Landroid/content/Context;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 453
    :cond_0
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 455
    :goto_0
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandCheckNewVersion success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;Z)V

    .line 458
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 459
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->k(Ljava/lang/String;Landroid/content/Context;)V

    .line 461
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 462
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->e(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 464
    :cond_2
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 466
    :goto_1
    iget-wide v0, p1, Lo/dow;->h:J

    long-to-int v0, v0

    iget-object v1, p1, Lo/dow;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->h(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v3

    const/16 v4, 0xc

    invoke-static {v4, v0, v1, v2, v3}, Lo/dpr;->e(IILjava/lang/String;Ljava/lang/String;I)V

    .line 468
    :cond_3
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mBandCheckNewVersionHandler handleManualCheckSuccess() NAME="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", DESCRIPTION="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", CREATETIME="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", BYTESIZE="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p1, Lo/dow;->h:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", VERSION_NAME="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", VERSION_CODE="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->u(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    .line 476
    :cond_4
    return-void
.end method
