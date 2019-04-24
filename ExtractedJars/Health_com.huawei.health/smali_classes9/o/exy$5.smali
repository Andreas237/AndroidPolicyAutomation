.class Lo/exy$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exy;->a(Landroid/content/Context;JJIFLo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exy;

.field final synthetic c:F

.field final synthetic d:Lo/ekr;


# direct methods
.method constructor <init>(Lo/exy;Lo/ekr;F)V
    .locals 0

    .line 382
    iput-object p1, p0, Lo/exy$5;->b:Lo/exy;

    iput-object p2, p0, Lo/exy$5;->d:Lo/ekr;

    iput p3, p0, Lo/exy$5;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 385
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 386
    iget-object v0, p0, Lo/exy$5;->d:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 387
    return-void

    .line 389
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 390
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    iget-object v0, p0, Lo/exy$5;->d:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 392
    return-void

    .line 395
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 397
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 399
    const-wide/32 v6, 0x2932e00

    .line 401
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 402
    iget-object v0, p0, Lo/exy$5;->b:Lo/exy;

    invoke-static {v0, v9}, Lo/exy;->a(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 403
    goto :goto_0

    .line 406
    :cond_2
    new-instance v10, Lo/ehz;

    const-string v0, "sum"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    iget v1, p0, Lo/exy$5;->c:F

    mul-float/2addr v0, v1

    invoke-direct {v10, v0}, Lo/ehz;-><init>(F)V

    .line 407
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    add-long/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    iget-object v1, p0, Lo/exy$5;->b:Lo/exy;

    invoke-static {v1, v9}, Lo/exy;->a(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    iget v2, p0, Lo/exy$5;->c:F

    mul-float/2addr v1, v2

    invoke-virtual {v10, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 409
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    iget-object v1, p0, Lo/exy$5;->b:Lo/exy;

    invoke-static {v1, v9}, Lo/exy;->b(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    iget v2, p0, Lo/exy$5;->c:F

    mul-float/2addr v1, v2

    invoke-virtual {v10, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 410
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    iget-object v1, p0, Lo/exy$5;->b:Lo/exy;

    invoke-static {v1, v9}, Lo/exy;->d(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    iget v2, p0, Lo/exy$5;->c:F

    mul-float/2addr v1, v2

    invoke-virtual {v10, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 411
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    iget-object v1, p0, Lo/exy$5;->b:Lo/exy;

    invoke-static {v1, v9}, Lo/exy;->c(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    iget v2, p0, Lo/exy$5;->c:F

    mul-float/2addr v1, v2

    invoke-virtual {v10, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 412
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    iget-object v1, p0, Lo/exy$5;->b:Lo/exy;

    invoke-static {v1, v9}, Lo/exy;->e(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    iget v2, p0, Lo/exy$5;->c:F

    mul-float/2addr v1, v2

    invoke-virtual {v10, v0, v1}, Lo/ehz;->b(Lo/eiv;F)V

    .line 414
    const-string v0, "sum"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    iget v1, p0, Lo/exy$5;->c:F

    mul-float v11, v0, v1

    .line 415
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    invoke-virtual {v10, v0}, Lo/ehz;->d(Lo/eiv;)F

    move-result v0

    sget-object v1, Lo/eiv;->a:Lo/eiv;

    .line 416
    invoke-virtual {v10, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    add-float/2addr v0, v1

    sget-object v1, Lo/eiv;->c:Lo/eiv;

    .line 417
    invoke-virtual {v10, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    add-float/2addr v0, v1

    sget-object v1, Lo/eiv;->e:Lo/eiv;

    .line 418
    invoke-virtual {v10, v1}, Lo/ehz;->d(Lo/eiv;)F

    move-result v1

    add-float v12, v0, v1

    .line 419
    cmpg-float v0, v11, v12

    if-gez v0, :cond_3

    .line 421
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    invoke-virtual {v10, v0, v12}, Lo/ehz;->b(Lo/eiv;F)V

    .line 423
    :cond_3
    goto/16 :goto_0

    .line 425
    :cond_4
    iget-object v0, p0, Lo/exy$5;->d:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 426
    return-void
.end method
