.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$a;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/Button;

.field private B:Lo/emr;

.field private C:Landroid/widget/RelativeLayout;

.field private D:Lo/efy;

.field private E:Landroid/widget/LinearLayout;

.field private F:Landroid/widget/LinearLayout;

.field private G:Lo/egw;

.field private H:Landroid/widget/LinearLayout;

.field private I:Landroid/widget/LinearLayout;

.field private K:I

.field private L:I

.field d:J

.field f:I

.field g:F

.field h:F

.field i:F

.field private j:Landroid/support/v7/widget/RecyclerView;

.field k:Ljava/lang/String;

.field private l:Landroid/content/Context;

.field m:Z

.field private n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

.field private o:Landroid/os/Bundle;

.field p:J

.field private q:Z

.field private r:Lo/efy;

.field private s:I

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/RecordAction;>;"
        }
    .end annotation
.end field

.field private u:Landroid/widget/ImageView;

.field private v:Lo/efy;

.field private w:Lo/efy;

.field private x:Lo/efy;

.field private y:Landroid/widget/RatingBar;

.field private z:Lo/efy;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 97
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->p:J

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->L:I

    .line 119
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->m:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Lo/efy;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->z:Lo/efy;

    return-object v0
.end method

.method private a(I)V
    .locals 8

    .line 700
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 701
    const-string v0, "\\d+.\\d+|\\d+"

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_details_sleep_latency_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 702
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 701
    invoke-static {v1, p1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_result_ar:I

    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v7

    goto :goto_0

    .line 704
    :cond_0
    const-string v0, "\\d+.\\d+|\\d+"

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_details_sleep_latency_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 705
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 704
    invoke-static {v1, p1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_result_n:I

    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v7

    .line 707
    :goto_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_bast_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 708
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_bast_value_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 709
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->K:I

    return v0
.end method

.method private b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 5

    .line 258
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 259
    return-void

    .line 261
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 262
    const-string v0, "workout_id"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    const-string v0, "workout_name"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    const-string v0, "version"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 266
    const-string v0, "finishRate"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    :cond_1
    const-string v0, "rpe"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->L:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    const/4 v0, 0x0

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Ljava/util/Map;Z)V

    .line 271
    const-string v0, "1130010"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 272
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI_rpe\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Ljava/lang/String;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 668
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V

    invoke-interface {v0, p1, v1}, Lo/bsp;->g(Ljava/lang/String;Lo/bui;)V

    .line 685
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->a(I)V

    return-void
.end method

.method private c(Lo/bvr;II)V
    .locals 6

    .line 688
    const-string v5, ""

    .line 689
    const/16 v0, 0x3c

    if-ge p3, v0, :cond_0

    .line 690
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitcoach_sec:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 692
    :cond_0
    div-int/lit8 p3, p3, 0x3c

    .line 693
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 695
    :goto_0
    invoke-virtual {p1, p2, v5}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 696
    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 13

    .line 392
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->y:Landroid/widget/RatingBar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setMax(I)V

    .line 393
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->y:Landroid/widget/RatingBar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setNumStars(I)V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->y:Landroid/widget/RatingBar;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v0, v1}, Lo/buw;->a(Landroid/widget/RatingBar;F)V

    .line 396
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->i:F

    .line 397
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->g:F

    .line 398
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->h:F

    .line 399
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->k:Ljava/lang/String;

    .line 400
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->r:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 401
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->q:Z

    if-eqz v0, :cond_0

    .line 402
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->s:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 404
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->D:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_main_time_line_start_walking:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 405
    goto :goto_0

    .line 407
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->D:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_main_time_line_start_running:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 408
    goto :goto_0

    .line 410
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->D:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_main_time_line_start_cycling:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 411
    .line 416
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->C:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 417
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->A:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 419
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->isRunWorkout()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 420
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->u()V

    .line 428
    :cond_1
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->isSingle()Z

    move-result v6

    .line 429
    if-eqz v6, :cond_5

    .line 431
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 432
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 433
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 434
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 435
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->y:Landroid/widget/RatingBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setVisibility(I)V

    goto :goto_2

    .line 437
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 438
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 439
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 442
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWearType()I

    move-result v7

    .line 443
    sget v0, Lcom/huawei/health/suggestion/R$id;->wear_type_imageView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 444
    const/4 v0, 0x2

    if-ne v0, v7, :cond_3

    .line 445
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->ic_watchwear_gray_2:I

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 446
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 447
    :cond_3
    const/4 v0, 0x1

    if-ne v0, v7, :cond_4

    .line 448
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->ic_watchwear_gray_1:I

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 449
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 451
    :cond_4
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 454
    :goto_3
    goto :goto_4

    .line 455
    :cond_5
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 456
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 457
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_msg_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 464
    :goto_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 465
    move-object v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_result_ar:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v7

    .line 467
    move-object v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    .line 468
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v3

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_result_ar:I

    .line 467
    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v8

    .line 469
    const-string v0, "\\d+.\\d+|\\d+"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_result_ar:I

    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v9

    goto :goto_5

    .line 473
    :cond_6
    move-object v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_result_n:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v7

    .line 475
    move-object v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    .line 476
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v3

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_result_n:I

    .line 475
    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v8

    .line 477
    const-string v0, "\\d+.\\d+|\\d+"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_result_n:I

    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v9

    .line 481
    :goto_5
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->m()V

    .line 482
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->x:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->v:Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 484
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->w:Lo/efy;

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 487
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_calorie_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 488
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_duration_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 489
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_rate_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 491
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_calorie_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 492
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_duration_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 494
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->j:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 496
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireRateInfo()Lcom/huawei/health/suggestion/model/RateInfo;

    move-result-object v10

    .line 499
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 500
    const/4 v0, 0x0

    if-eq v0, v10, :cond_7

    .line 501
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 503
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 504
    const/4 v12, 0x0

    :goto_6
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_8

    .line 505
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->t:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 504
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    .line 509
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->j:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;

    const/4 v2, 0x2

    new-array v2, v2, [I

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_coach_trainfinish_rate:I

    const/4 v4, 0x0

    aput v3, v2, v4

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_coach_item_finish_rcv:I

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-direct {v1, p0, v11, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Ljava/util/List;[I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 573
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v12

    .line 574
    if-eqz v6, :cond_9

    .line 575
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c()V

    .line 576
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;

    invoke-direct {v1, p0, v12}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-interface {v0, v12, v2, v1}, Lo/bsp;->c(Ljava/lang/String;ILo/bui;)V

    goto :goto_7

    .line 597
    :cond_9
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V

    invoke-interface {v0, v12, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 600
    :goto_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)I
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->K:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)Landroid/content/Context;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    return-object v0
.end method

.method private e(Ljava/lang/String;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/suggestion/model/RecordAction;>;"
        }
    .end annotation

    .line 717
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 718
    const/4 v0, 0x0

    return-object v0

    .line 720
    :cond_0
    const/4 v4, 0x0

    .line 722
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 724
    :try_start_0
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 725
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 726
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lorg/json/JSONObject;

    .line 728
    const-string v0, "actionName"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 729
    const-string v0, "finishedAct"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 730
    const-string v0, "theoryAct"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v11, v0

    .line 731
    const-string v0, "actType"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 732
    if-lez v10, :cond_1

    .line 733
    add-int/lit8 v4, v4, 0x1

    .line 735
    :cond_1
    new-instance v13, Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-direct {v13, v9, v10, v11, v12}, Lcom/huawei/health/suggestion/model/RecordAction;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    .line 736
    invoke-interface {v5, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 725
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 738
    :cond_2
    iput v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->f:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 741
    goto :goto_1

    .line 739
    :catch_0
    move-exception v6

    .line 740
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    :goto_1
    return-object v5
.end method

.method private e(I)V
    .locals 7

    .line 712
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4ece\u6570\u636e\u5e93 \u83b7\u53d6\u5355\u6b21\u8bad\u7ec3\u5b8c\u6210\u6b21\u6570 -- data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 713
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_train_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_finish_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, p1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 714
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 5

    .line 216
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 217
    return-void

    .line 220
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 222
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    const-string v0, "date"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    :cond_1
    const-string v0, "workout_name"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    const-string v0, "workout_id"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    const/4 v0, 0x1

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Ljava/util/Map;Z)V

    .line 230
    const-string v0, "1130013"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 231
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bfe\u7a0b\u5386\u53f2\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Lo/bvr;II)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c(Lo/bvr;II)V

    return-void
.end method

.method private e(Ljava/util/Map;Z)V
    .locals 15

    .line 277
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btg;->e(Ljava/lang/String;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v4

    .line 278
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 279
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 280
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 281
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireClasses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginFitnessAdvice/Attribute;

    .line 282
    invoke-virtual {v8}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 283
    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 284
    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    .line 286
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireTrainingpoints()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;

    .line 287
    invoke-virtual {v8}, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 288
    const-string v0, ","

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 289
    goto :goto_1

    .line 290
    :cond_1
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    .line 291
    const-string v0, "type"

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    const-string v0, "train_points"

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    const-string v0, "difficulty"

    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    if-eqz p2, :cond_2

    .line 295
    const-string v0, "duration"

    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    :cond_2
    const/16 v7, 0x3e9

    .line 299
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    div-int/lit16 v8, v0, 0x3e8

    .line 300
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    mul-int/lit16 v2, v8, 0x3e8

    int-to-long v2, v2

    sub-long v9, v0, v2

    .line 301
    invoke-static {v9, v10}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v11

    .line 302
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v12, v0

    .line 303
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 305
    const-string v0, "SportType"

    :try_start_0
    invoke-virtual {v13, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 306
    const-string v0, "SportStartTime"

    invoke-virtual {v13, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 307
    const-string v0, "SportDuration"

    invoke-virtual {v13, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 308
    const-string v0, "HeatQuantity"

    invoke-virtual {v13, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 309
    const-string v0, "BodyBuildingType"

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 310
    const-string v0, "BodyBuildingPart"

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 311
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-virtual {v13}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dnn;->b(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 314
    goto :goto_2

    .line 312
    :catch_0
    move-exception v14

    .line 313
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    :cond_3
    :goto_2
    return-void
.end method

.method private l()V
    .locals 5

    .line 235
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_rpe_dialog:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 236
    new-instance v4, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 237
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rpe_notgood:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->I:Landroid/widget/LinearLayout;

    .line 238
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rpe_ok:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->F:Landroid/widget/LinearLayout;

    .line 239
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rpe_good:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->E:Landroid/widget/LinearLayout;

    .line 240
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rpe_great:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->H:Landroid/widget/LinearLayout;

    .line 241
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->I:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->H:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_fitness_rpe_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 246
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    .line 247
    invoke-virtual {v4}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->G:Lo/egw;

    .line 248
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->G:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 249
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->G:Lo/egw;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V

    invoke-virtual {v0, v1}, Lo/egw;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 255
    return-void
.end method

.method private m()V
    .locals 4

    .line 603
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;

    invoke-direct {v3, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 627
    return-void
.end method

.method private n()V
    .locals 7

    .line 366
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v4

    .line 367
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "button_show instance:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    if-eqz v4, :cond_1

    .line 369
    invoke-interface {v4}, Lo/brr;->e()Lo/brv;

    move-result-object v5

    .line 370
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireRunWorkoutTrajectoryId()Ljava/lang/String;

    move-result-object v6

    .line 371
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 372
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "button_show null == trajectoryId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    return-void

    .line 375
    :cond_0
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "button_show trajectoryId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    if-eqz v5, :cond_1

    .line 377
    invoke-interface {v5, v6}, Lo/brv;->a(Ljava/lang/String;)V

    .line 380
    :cond_1
    return-void
.end method

.method private p()V
    .locals 2

    .line 388
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->o:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lo/bxb;->d(Landroid/os/Bundle;)V

    .line 389
    return-void
.end method

.method private u()V
    .locals 4

    .line 630
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackButton:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->D:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_fit_result_button_text:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 632
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->C:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 633
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->A:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 634
    return-void
.end method


# virtual methods
.method public g()V
    .locals 1

    .line 124
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_coach_trainfinish:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->setContentView(I)V

    .line 125
    return-void
.end method

.method public h()I
    .locals 1

    .line 129
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 1

    .line 134
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 140
    return-void
.end method

.method public k()V
    .locals 0

    .line 321
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 325
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coachf_iv_close:I

    if-ne v0, v1, :cond_0

    .line 326
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->finish()V

    goto/16 :goto_0

    .line 327
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_cb_startrunaftwarmup:I

    if-ne v0, v1, :cond_2

    .line 328
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->q:Z

    if-eqz v0, :cond_1

    .line 329
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->p()V

    .line 330
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->finish()V

    goto/16 :goto_0

    .line 332
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->isRunWorkout()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 333
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n()V

    goto/16 :goto_0

    .line 336
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->btn_right_layout:I

    if-ne v0, v1, :cond_3

    .line 337
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 338
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 339
    const-string v0, "exercisecurrent_time"

    iget-wide v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->d:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 340
    const-string v0, "levels_count"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->K:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 341
    const-string v0, "trainduration"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->h:F

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 342
    const-string v0, "calorie"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->i:F

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 343
    const-string v0, "percent"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->g:F

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 344
    const-string v0, "trainname"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->k:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 345
    const-string v0, "exercise_total_time"

    iget-wide v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->p:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 346
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 347
    const-string v0, "entrance"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "entrance"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 348
    const-string v0, "workout_id"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 349
    invoke-virtual {p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->startActivity(Landroid/content/Intent;)V

    .line 350
    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rpe_notgood:I

    if-ne v0, v1, :cond_4

    .line 351
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->L:I

    .line 352
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->G:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    goto :goto_0

    .line 353
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rpe_ok:I

    if-ne v0, v1, :cond_5

    .line 354
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->L:I

    .line 355
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->G:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    goto :goto_0

    .line 356
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rpe_good:I

    if-ne v0, v1, :cond_6

    .line 357
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->L:I

    .line 358
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->G:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    goto :goto_0

    .line 359
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rpe_great:I

    if-ne v0, v1, :cond_7

    .line 360
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->L:I

    .line 361
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->G:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 363
    :cond_7
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 144
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 145
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    .line 146
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_congra:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->r:Lo/efy;

    .line 147
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_iv_close:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->u:Landroid/widget/ImageView;

    .line 148
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->x:Lo/efy;

    .line 149
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->v:Lo/efy;

    .line 150
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_calorie:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->w:Lo/efy;

    .line 151
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_level:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->z:Lo/efy;

    .line 152
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_rating:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->y:Landroid/widget/RatingBar;

    .line 153
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_rcv_actions:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->j:Landroid/support/v7/widget/RecyclerView;

    .line 154
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->j:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 155
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->u:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rl_startrunaftwarmup:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->C:Landroid/widget/RelativeLayout;

    .line 157
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_startrunaftwarmup:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->A:Landroid/widget/Button;

    .line 158
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_startrunaftwarmup:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->D:Lo/efy;

    .line 159
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->B:Lo/emr;

    .line 160
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->B:Lo/emr;

    invoke-virtual {v0, p0}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 163
    const-string v0, "bundlekey"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->o:Landroid/os/Bundle;

    .line 164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->o:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->o:Landroid/os/Bundle;

    const-string v1, "isshowbutton"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->q:Z

    .line 166
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->o:Landroid/os/Bundle;

    const-string v1, "track_type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->s:I

    .line 169
    :cond_0
    const-string v0, "workout_record"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 170
    const-string v0, "is_show_rpe"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->m:Z

    .line 171
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 172
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->d:J

    .line 173
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActionSummary()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->t:Ljava/util/List;

    .line 174
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 175
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->m:Z

    if-eqz v0, :cond_1

    .line 177
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/fje;->e(Landroid/content/Context;)Lo/fje;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/fje;->a(Landroid/content/Context;)V

    .line 178
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->l()V

    .line 180
    invoke-static {}, Lo/caa;->a()Lo/caa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/caa;->c(Ljava/lang/String;ILandroid/os/Bundle;)V

    goto :goto_0

    .line 182
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->n:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 186
    :cond_2
    :goto_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$a;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/bsp;->b(ILo/bui;)V

    .line 187
    return-void
.end method
