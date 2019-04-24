.class public Lo/buw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/widget/RatingBar;F)V
    .locals 1

    .line 54
    const/high16 v0, 0x42b40000    # 90.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 55
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Landroid/widget/RatingBar;->setProgress(I)V

    goto :goto_0

    .line 56
    :cond_0
    invoke-static {p1}, Lo/buw;->c(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/widget/RatingBar;->setProgress(I)V

    goto :goto_0

    .line 58
    :cond_1
    invoke-static {p1}, Lo/buw;->b(F)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Landroid/widget/RatingBar;->setProgress(I)V

    goto :goto_0

    .line 60
    :cond_2
    invoke-static {p1}, Lo/buw;->e(F)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 61
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/widget/RatingBar;->setProgress(I)V

    goto :goto_0

    .line 63
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/RatingBar;->setProgress(I)V

    .line 65
    :goto_0
    return-void
.end method

.method public static b(Lo/bvr;Lcom/huawei/health/suggestion/model/RecordAction;)V
    .locals 3

    .line 24
    const-string v0, "timer"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getActType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_total:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getTheoryAct()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->f(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 26
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_unit:I

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_second_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    goto :goto_0

    .line 28
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_total:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getTheoryAct()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 29
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_unit:I

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_ci:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 31
    :goto_0
    return-void
.end method

.method public static b(Lo/bvr;Lcom/huawei/health/suggestion/model/RecordAction;Ljava/text/DecimalFormat;)V
    .locals 3

    .line 34
    const-string v0, "timer"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getActType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_unit:I

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_second_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 36
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_total:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getTheoryAct()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->f(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    goto/16 :goto_0

    .line 37
    :cond_0
    const-string v0, "run_distance"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getActType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_unit:I

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_unit_KM:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 39
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_total:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getTheoryAct()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Lo/bzr;->d(I)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Lo/bzr;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    goto :goto_0

    .line 40
    :cond_1
    const-string v0, "run_time"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getActType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_unit:I

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_unit_MIN:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 42
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_total:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getTheoryAct()F

    move-result v1

    invoke-static {v1}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    goto :goto_0

    .line 44
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_unit:I

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_ci:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 45
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_finish_total:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RecordAction;->getTheoryAct()F

    move-result v1

    float-to-double v1, v1

    invoke-static {p2, v1, v2}, Lo/buk;->c(Ljava/text/DecimalFormat;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 47
    :goto_0
    return-void
.end method

.method private static b(F)Z
    .locals 1

    .line 68
    const/high16 v0, 0x42a00000    # 80.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    const/high16 v0, 0x42700000    # 60.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(F)Z
    .locals 1

    .line 50
    const/high16 v0, 0x42b40000    # 90.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    const/high16 v0, 0x42a00000    # 80.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(F)Z
    .locals 1

    .line 72
    const/high16 v0, 0x41f00000    # 30.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
