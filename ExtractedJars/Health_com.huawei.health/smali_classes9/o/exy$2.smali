.class Lo/exy$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exy;->d(Landroid/content/Context;JJIFLo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exy;

.field final synthetic b:F

.field final synthetic d:Lo/ekr;


# direct methods
.method constructor <init>(Lo/exy;Lo/ekr;F)V
    .locals 0

    .line 470
    iput-object p1, p0, Lo/exy$2;->a:Lo/exy;

    iput-object p2, p0, Lo/exy$2;->d:Lo/ekr;

    iput p3, p0, Lo/exy$2;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 473
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 474
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$2;->d:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 475
    return-void

    .line 477
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 478
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$2;->d:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 480
    return-void

    .line 483
    :cond_1
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 484
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 486
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 489
    const-wide/32 v7, 0x4d3f6400

    .line 492
    const/4 v9, 0x0

    :goto_0
    :try_start_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 496
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 497
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 499
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$2;->a:Lo/exy;

    invoke-static {v0, v11}, Lo/exy;->a(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 500
    goto/16 :goto_2

    .line 503
    :cond_2
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v12

    .line 504
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v14

    .line 505
    invoke-virtual {v14, v12, v13}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 506
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v14, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 507
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v14, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 508
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v14, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 509
    const-string v0, "content"

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/exy$2;->b:F

    mul-float v15, v0, v1

    .line 510
    const-string v0, "sum"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/exy$2;->b:F

    mul-float v16, v0, v1

    .line 513
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    .line 514
    new-instance v0, Lo/eyg;

    move v1, v15

    move/from16 v2, v16

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/eyg;-><init>(FFI)V

    move-object/from16 v17, v0

    goto :goto_1

    .line 516
    :cond_3
    new-instance v0, Lo/eyg;

    move v1, v15

    move/from16 v2, v16

    div-float v3, v16, v15

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/eyg;-><init>(FFI)V

    move-object/from16 v17, v0

    .line 518
    :goto_1
    invoke-virtual {v14}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    add-long/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exy$2;->a:Lo/exy;

    invoke-static {v1, v11}, Lo/exy;->a(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/exy$2;->b:F

    mul-float/2addr v1, v2

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lo/eyg;->b(Lo/eiv;F)V

    .line 521
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exy$2;->a:Lo/exy;

    invoke-static {v1, v11}, Lo/exy;->b(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/exy$2;->b:F

    mul-float/2addr v1, v2

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lo/eyg;->b(Lo/eiv;F)V

    .line 522
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exy$2;->a:Lo/exy;

    invoke-static {v1, v11}, Lo/exy;->d(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/exy$2;->b:F

    mul-float/2addr v1, v2

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lo/eyg;->b(Lo/eiv;F)V

    .line 523
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exy$2;->a:Lo/exy;

    invoke-static {v1, v11}, Lo/exy;->c(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/exy$2;->b:F

    mul-float/2addr v1, v2

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lo/eyg;->b(Lo/eiv;F)V

    .line 524
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exy$2;->a:Lo/exy;

    invoke-static {v1, v11}, Lo/exy;->e(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F

    move-result v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/exy$2;->b:F

    mul-float/2addr v1, v2

    move-object/from16 v2, v17

    invoke-virtual {v2, v0, v1}, Lo/eyg;->b(Lo/eiv;F)V

    .line 526
    move/from16 v18, v16

    .line 527
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lo/eyg;->d(Lo/eiv;)F

    move-result v0

    sget-object v1, Lo/eiv;->a:Lo/eiv;

    .line 528
    move-object/from16 v2, v17

    invoke-virtual {v2, v1}, Lo/eyg;->d(Lo/eiv;)F

    move-result v1

    add-float/2addr v0, v1

    sget-object v1, Lo/eiv;->c:Lo/eiv;

    .line 529
    move-object/from16 v2, v17

    invoke-virtual {v2, v1}, Lo/eyg;->d(Lo/eiv;)F

    move-result v1

    add-float/2addr v0, v1

    sget-object v1, Lo/eiv;->e:Lo/eiv;

    .line 530
    move-object/from16 v2, v17

    invoke-virtual {v2, v1}, Lo/eyg;->d(Lo/eiv;)F

    move-result v1

    add-float v19, v0, v1

    .line 531
    cmpg-float v0, v18, v19

    if-gez v0, :cond_4

    .line 533
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    move-object/from16 v1, v17

    move/from16 v2, v19

    invoke-virtual {v1, v0, v2}, Lo/eyg;->b(Lo/eiv;F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 492
    :cond_4
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 540
    :cond_5
    goto :goto_3

    .line 538
    :catch_0
    move-exception v9

    .line 539
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$2;->d:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 543
    return-void
.end method
