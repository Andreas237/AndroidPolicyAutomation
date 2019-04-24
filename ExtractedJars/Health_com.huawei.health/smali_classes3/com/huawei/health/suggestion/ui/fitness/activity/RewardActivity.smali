.class public Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private d:Landroid/widget/ImageView;

.field private f:Lo/efy;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Lo/efy;

.field private i:Landroid/support/v7/widget/RecyclerView;

.field private k:Lo/efy;

.field private l:Landroid/widget/RatingBar;

.field private m:Ljava/lang/String;

.field private n:Lo/efy;

.field private o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;Ljava/lang/Integer;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->d(Ljava/lang/Integer;)V

    return-void
.end method

.method private b(FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FLjava/lang/String;IFLjava/util/List<Lcom/huawei/health/suggestion/model/RecordAction;>;Ljava/lang/Integer;)V"
        }
    .end annotation

    .line 172
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 178
    return-void
.end method

.method private c(FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FLjava/lang/String;IFLjava/util/List<Lcom/huawei/health/suggestion/model/RecordAction;>;Ljava/lang/Integer;)V"
        }
    .end annotation

    .line 181
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->b()V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->l:Landroid/widget/RatingBar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setMax(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->l:Landroid/widget/RatingBar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setNumStars(I)V

    .line 184
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->l:Landroid/widget/RatingBar;

    invoke-static {v0, p1}, Lo/buw;->a(Landroid/widget/RatingBar;F)V

    .line 186
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->n:Lo/efy;

    invoke-virtual {v0, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 188
    move-object v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    int-to-float v3, p3

    invoke-static {v3}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v6

    .line 189
    move-object v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    invoke-static {p4}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v7

    .line 190
    const-string v0, "\\d+.\\d+|\\d+"

    float-to-double v1, p1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v8

    .line 192
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->f:Lo/efy;

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->k:Lo/efy;

    invoke-virtual {v0, v6}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->h:Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->i:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->i:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$3;

    const/4 v2, 0x1

    new-array v2, v2, [I

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_coach_item_finish_rcv:I

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-direct {v1, p0, p5, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;Ljava/util/List;[I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 208
    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    .line 209
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_train_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_finish_times:I

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-double v4, v4

    invoke-static {v4, v5}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 211
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_train_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 213
    :goto_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 118
    const/4 v7, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v9, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->m:Ljava/lang/String;

    .line 123
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 124
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 125
    if-eqz v13, :cond_0

    .line 126
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    add-float/2addr v9, v0

    .line 127
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireCalorie()F

    move-result v0

    add-float/2addr v10, v0

    .line 128
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    add-int/2addr v8, v0

    .line 129
    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActionSummary()Ljava/lang/String;

    move-result-object v14

    .line 130
    const-class v0, [Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-static {v14, v0}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v15

    .line 131
    invoke-interface {v11, v15}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 133
    :cond_0
    goto :goto_0

    .line 134
    :cond_1
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v0, v9

    div-float v7, v0, v10

    .line 135
    const-string v0, "RewardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Actual kcal: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "----Total Kcal: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    move-object/from16 v0, p0

    move v1, v7

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->m:Ljava/lang/String;

    move v3, v8

    move v4, v9

    move-object v5, v11

    const/4 v6, -0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->b(FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V

    .line 137
    return-void
.end method

.method private d(Ljava/lang/Integer;)V
    .locals 8

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActionSummary()Ljava/lang/String;

    move-result-object v7

    .line 168
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v4

    const-class v5, [Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-static {v7, v5}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v5

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->b(FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V

    .line 169
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V
    .locals 0

    .line 44
    invoke-direct/range {p0 .. p6}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->c(FLjava/lang/String;IFLjava/util/List;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 67
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 1

    .line 141
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_coach_trainfinish:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->setContentView(I)V

    .line 148
    return-void
.end method

.method public h()I
    .locals 1

    .line 62
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 7

    .line 72
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    const-string v0, "workoutrecord"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 75
    const-string v0, "workoutdate"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->p:Ljava/lang/String;

    .line 76
    const-string v0, "dayworkoutname"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->m:Ljava/lang/String;

    .line 77
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    if-eqz v0, :cond_3

    .line 78
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->p:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 79
    const-string v0, "RewardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWorkoutDate not null ..from showPlanActivity --show a day record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 81
    if-eqz v5, :cond_1

    .line 82
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->p:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->p:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 83
    if-eqz v6, :cond_0

    .line 84
    invoke-direct {p0, v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->c(Ljava/util/List;)V

    goto :goto_0

    .line 86
    :cond_0
    const-string v0, "RewardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no WorkoutRecord.."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->finish()V

    .line 89
    :goto_0
    goto :goto_1

    .line 90
    :cond_1
    const-string v0, "RewardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no currentplan.."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->finish()V

    .line 93
    :goto_1
    goto :goto_2

    .line 94
    :cond_2
    const-string v0, "RewardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWorkoutDate is null ..show only one workout record --"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->o:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;

    invoke-direct {v3, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    goto :goto_2

    .line 111
    :cond_3
    const-string v0, "RewardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no mWorkoutRecord.."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->finish()V

    .line 115
    :cond_4
    :goto_2
    return-void
.end method

.method public k()V
    .locals 1

    .line 153
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_rl_finish:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->g:Landroid/widget/RelativeLayout;

    .line 154
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_iv_close:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->d:Landroid/widget/ImageView;

    .line 155
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->f:Lo/efy;

    .line 156
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_congra:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->n:Lo/efy;

    .line 157
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->k:Lo/efy;

    .line 158
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_tv_calorie:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->h:Lo/efy;

    .line 159
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_rating:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->l:Landroid/widget/RatingBar;

    .line 160
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachf_rcv_actions:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->i:Landroid/support/v7/widget/RecyclerView;

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 232
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coachf_iv_close:I

    if-ne v0, v1, :cond_0

    .line 233
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->finish()V

    .line 235
    :cond_0
    return-void
.end method
