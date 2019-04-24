.class final Lo/dnj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnj;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 388
    iput-object p1, p0, Lo/dnj$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 15

    .line 391
    const-string v4, "SportStep_0"

    .line 392
    if-nez p2, :cond_4

    .line 393
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_3

    .line 394
    move-object/from16 v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 395
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateSportStepLabel, map = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, "map.size() = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 398
    const v0, 0x9c42

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 399
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateSportStepLabel, STAT_SPORT_STEP_SUM = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    move-object v6, v7

    check-cast v6, Ljava/util/List;

    .line 401
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateSportStepLabel,SportStepValueList.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    const/4 v8, 0x0

    .line 403
    const/4 v9, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_0

    .line 404
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    add-int/2addr v8, v0

    .line 403
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 406
    :cond_0
    int-to-double v0, v8

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    div-double v9, v0, v2

    .line 407
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateSportStepLabel, average_day_steps = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    invoke-static {}, Lo/dnj;->c()[Lo/dnp;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_2

    aget-object v14, v11, v13

    .line 409
    invoke-virtual {v14, v9, v10}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 410
    invoke-virtual {v14, v9, v10}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v4

    .line 411
    goto :goto_2

    .line 408
    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 415
    :cond_2
    :goto_2
    goto :goto_3

    .line 416
    :cond_3
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter generateSportStepLabel, data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 419
    :cond_4
    const-string v0, "BIUserLabelMgrread failed, errorCode is"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    :goto_3
    const-string v0, "BIUserLabelMgrgenerateSportStepLabel, sportStepLabel = "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    iget-object v0, p0, Lo/dnj$1;->a:Landroid/content/Context;

    const-string v1, "health_sport_grade_up"

    invoke-static {v0, v1, v4}, Lo/dnj;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    return-void
.end method
