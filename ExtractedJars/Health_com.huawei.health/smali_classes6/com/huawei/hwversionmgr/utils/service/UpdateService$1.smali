.class Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;
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

    .line 320
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {p0}, Lo/dps;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 324
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCheckFailed: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    if-nez v0, :cond_1

    .line 326
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 327
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 330
    :cond_0
    const/4 v0, 0x6

    invoke-static {v0}, Lo/dpr;->e(I)V

    .line 332
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 333
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 335
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 337
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 338
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 340
    :cond_2
    const/16 v0, 0xb

    invoke-static {v0, p1}, Lo/dpr;->c(II)V

    .line 342
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    .line 343
    return-void
.end method

.method public d(Lo/dow;)V
    .locals 5

    .line 347
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleManualCheckSuccess:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    if-eqz p1, :cond_6

    .line 349
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 352
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-wide v1, p1, Lo/dow;->h:J

    long-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I

    .line 353
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleManualCheckSuccess: mCheckNewVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget v1, p1, Lo/dow;->z:I

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I

    .line 355
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p1, Lo/dow;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    const-string v0, "UpdateService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleManualCheckSuccess: mAppMinCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->h(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mAppForcedUpdate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "mForcedUpdate = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    if-nez v0, :cond_2

    .line 359
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "APP_AUTO_UPDATE: error, mCheckNewVersionCode is empty... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    const/4 v0, 0x6

    invoke-static {v0}, Lo/dpr;->e(I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    .line 365
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->d(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 368
    :cond_1
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 370
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 375
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 376
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 377
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "APP_MANUAL_UPDATE: error, mCheckNewVersionCode is empty... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    const/16 v0, 0xb

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 379
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    .line 382
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 383
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->d(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 385
    :cond_4
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 387
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 388
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpk;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 389
    iget-wide v0, p1, Lo/dow;->h:J

    long-to-int v0, v0

    iget-object v1, p1, Lo/dow;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xc

    const/4 v4, 0x0

    invoke-static {v3, v0, v1, v2, v4}, Lo/dpr;->e(IILjava/lang/String;Ljava/lang/String;I)V

    .line 393
    :cond_5
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleManualCheckSuccess() NAME="

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

    .line 399
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->m(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    .line 401
    :cond_6
    return-void
.end method
