.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;
.super Lo/buv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/buv<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;


# direct methods
.method varargs constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Ljava/util/List;[I)V
    .locals 0

    .line 509
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {p0, p2, p3}, Lo/buv;-><init>(Ljava/util/List;[I)V

    return-void
.end method


# virtual methods
.method public e(Lo/bvr;ILjava/lang/Object;)V
    .locals 15

    .line 512
    move-object/from16 v0, p3

    instance-of v0, v0, Lcom/huawei/health/suggestion/model/RateInfo;

    if-eqz v0, :cond_0

    .line 513
    move-object/from16 v6, p3

    check-cast v6, Lcom/huawei/health/suggestion/model/RateInfo;

    .line 514
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_details_month_data_rate_uint:I

    .line 515
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RateInfo;->acquireMinRate()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_result_b:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_result_b_13:I

    .line 514
    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v7

    .line 517
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_details_month_data_rate_uint:I

    .line 518
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RateInfo;->acquireMaxRate()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_result_b:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_result_b_13:I

    .line 517
    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v8

    .line 520
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_show_min_rate_value:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v7}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    .line 521
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_show_max_rate_value:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v8}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    .line 523
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RateInfo;->acquireLimit()I

    move-result v9

    .line 524
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RateInfo;->acquireNoRaise()I

    move-result v10

    .line 525
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RateInfo;->acquireHaveRaise()I

    move-result v11

    .line 526
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RateInfo;->acquireFatBurning()I

    move-result v12

    .line 527
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RateInfo;->acquireWarmUp()I

    move-result v13

    .line 529
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rate_1:I

    move-object/from16 v2, p1

    invoke-static {v0, v2, v1, v9}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Lo/bvr;II)V

    .line 530
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rate_2:I

    move-object/from16 v2, p1

    invoke-static {v0, v2, v1, v10}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Lo/bvr;II)V

    .line 531
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rate_3:I

    move-object/from16 v2, p1

    invoke-static {v0, v2, v1, v11}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Lo/bvr;II)V

    .line 532
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rate_4:I

    move-object/from16 v2, p1

    invoke-static {v0, v2, v1, v12}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Lo/bvr;II)V

    .line 533
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rate_5:I

    move-object/from16 v2, p1

    invoke-static {v0, v2, v1, v13}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Lo/bvr;II)V

    .line 535
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_round_view:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/byv;

    .line 536
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_result_limit_color:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v14, v9, v0}, Lo/byv;->set(II)V

    .line 537
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_result_no_raise_color:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v14, v10, v0}, Lo/byv;->set(II)V

    .line 538
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_result_have_raise_color:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v14, v11, v0}, Lo/byv;->set(II)V

    .line 539
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_result_fat_burning_color:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v14, v12, v0}, Lo/byv;->set(II)V

    .line 540
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_result_warm_up_color:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v14, v13, v0}, Lo/byv;->set(II)V

    .line 541
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v14, v0}, Lo/byv;->setStrokeWidth(F)V

    .line 542
    invoke-virtual {v14}, Lo/byv;->b()V

    .line 543
    goto/16 :goto_1

    .line 544
    :cond_0
    move-object/from16 v6, p3

    check-cast v6, Lcom/huawei/health/suggestion/model/RecordAction;

    .line 545
    new-instance v7, Ljava/text/DecimalFormat;

    const-string v0, "#0"

    invoke-direct {v7, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 546
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_finish_actionname:I

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RecordAction;->getActionName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 547
    const-string v0, "run_distance"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RecordAction;->getActType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 548
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_finish_actionmsg:I

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RecordAction;->getFinishedAct()I

    move-result v1

    invoke-static {v1}, Lo/bzr;->d(I)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v7, v1, v2}, Lo/buk;->c(Ljava/text/DecimalFormat;D)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    goto :goto_0

    .line 549
    :cond_1
    const-string v0, "run_time"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RecordAction;->getActType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 550
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_finish_actionmsg:I

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RecordAction;->getFinishedAct()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v1}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v7, v1, v2}, Lo/buk;->c(Ljava/text/DecimalFormat;D)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    goto :goto_0

    .line 552
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_finish_actionmsg:I

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RecordAction;->getFinishedAct()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v7, v1, v2}, Lo/buk;->c(Ljava/text/DecimalFormat;D)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 554
    :goto_0
    move-object/from16 v0, p1

    invoke-static {v0, v6, v7}, Lo/buw;->b(Lo/bvr;Lcom/huawei/health/suggestion/model/RecordAction;Ljava/text/DecimalFormat;)V

    .line 556
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p2

    if-ne v1, v0, :cond_3

    .line 557
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_item_under_line:I

    move-object/from16 v1, p1

    const/4 v2, 0x4

    invoke-virtual {v1, v0, v2}, Lo/bvr;->a(II)V

    .line 559
    :cond_3
    return-void
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 563
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;->a(I)Ljava/lang/Object;

    move-result-object v1

    .line 564
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    instance-of v0, v1, Lcom/huawei/health/suggestion/model/RateInfo;

    if-eqz v0, :cond_0

    .line 565
    const/4 v0, 0x0

    return v0

    .line 567
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
