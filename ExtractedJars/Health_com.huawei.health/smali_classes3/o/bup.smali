.class public Lo/bup;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field public b:Landroid/widget/RelativeLayout;

.field public c:Lo/efy;

.field public d:Lo/efy;

.field private e:Lcom/huawei/health/suggestion/model/Topic;

.field private f:Lo/efy;

.field private g:Lo/efy;

.field private h:Landroid/widget/ImageView;

.field private i:Lo/efy;

.field private k:Lo/efy;

.field private l:F

.field private n:Lo/efy;

.field private o:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;)V
    .locals 2

    .line 70
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 72
    sget v0, Lcom/huawei/health/suggestion/R$id;->rl_topic_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bup;->b:Landroid/widget/RelativeLayout;

    .line 73
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_topic_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bup;->d:Lo/efy;

    .line 74
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bup;->a:Landroid/widget/ImageView;

    .line 75
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    sget v0, Lcom/huawei/health/suggestion/R$id;->before_one_more_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bup;->c:Lo/efy;

    .line 77
    iget-object v0, p0, Lo/bup;->c:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 78
    iget-object v0, p0, Lo/bup;->a:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 80
    :cond_0
    invoke-static {p2}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    iget-object v0, p0, Lo/bup;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 93
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_img_item_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bup;->h:Landroid/widget/ImageView;

    .line 94
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bup;->i:Lo/efy;

    .line 95
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_duration:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bup;->g:Lo/efy;

    .line 96
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_calorie:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bup;->k:Lo/efy;

    .line 97
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_train_number:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bup;->f:Lo/efy;

    .line 98
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_difficulty:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bup;->n:Lo/efy;

    .line 99
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    .line 100
    invoke-direct {p0}, Lo/bup;->a()V

    .line 101
    return-void
.end method

.method private a()V
    .locals 3

    .line 235
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 237
    if-eqz v1, :cond_0

    .line 238
    invoke-interface {v1}, Lo/brr;->a()Lo/brw;

    move-result-object v2

    .line 239
    if-eqz v2, :cond_0

    .line 240
    invoke-interface {v2}, Lo/brw;->getWeight()F

    move-result v0

    iput v0, p0, Lo/bup;->l:F

    .line 243
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/bup;Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/bup;->c(Lcom/huawei/health/suggestion/model/Topic;)V

    return-void
.end method

.method private c(Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 3

    .line 197
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 198
    const-string v0, "entrance"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    const-string v0, "position"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    const-string v0, "1130015"

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 201
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 13

    .line 104
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 105
    return-void

    .line 107
    :cond_0
    iput-object p1, p0, Lo/bup;->e:Lcom/huawei/health/suggestion/model/Topic;

    .line 108
    iget-object v0, p0, Lo/bup;->d:Lo/efy;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 109
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutList()Ljava/util/List;

    move-result-object v9

    .line 110
    if-eqz v9, :cond_1

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 111
    :cond_1
    const-string v0, "FitnessCourseHorizontalHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workouts is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void

    .line 114
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 115
    iget-object v0, p0, Lo/bup;->itemView:Landroid/view/View;

    new-instance v1, Lo/bup$4;

    invoke-direct {v1, p0, v10, p1}, Lo/bup$4;-><init>(Lo/bup;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/health/suggestion/model/Topic;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    iget-object v0, p0, Lo/bup;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/bup;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 143
    :cond_3
    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_4

    .line 144
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_new_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 145
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 146
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_5

    .line 147
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->new1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 148
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 149
    :cond_5
    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_6

    .line 150
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 151
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 153
    :cond_6
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 156
    :cond_7
    iget-object v0, p0, Lo/bup;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 159
    :goto_0
    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 160
    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bup;->h:Landroid/widget/ImageView;

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->blank_1008:I

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/cam;->b(Ljava/lang/String;Landroid/widget/ImageView;II)V

    goto :goto_1

    .line 162
    :cond_8
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->blank_1008:I

    iget-object v1, p0, Lo/bup;->h:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 166
    :goto_1
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 167
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_personjoin:I

    .line 168
    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 167
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_num:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_desc:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v11

    .line 169
    iget-object v0, p0, Lo/bup;->f:Lo/efy;

    invoke-virtual {v0, v11}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 170
    goto :goto_2

    .line 171
    :cond_9
    iget-object v0, p0, Lo/bup;->f:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 173
    :goto_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 175
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v3

    iget v4, p0, Lo/bup;->l:F

    mul-float/2addr v3, v4

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 176
    iget-object v0, p0, Lo/bup;->i:Lo/efy;

    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 177
    iget-object v0, p0, Lo/bup;->g:Lo/efy;

    invoke-virtual {v0, v11}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p0, Lo/bup;->k:Lo/efy;

    invoke-virtual {v0, v12}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 179
    iget-object v0, p0, Lo/bup;->n:Lo/efy;

    invoke-virtual {v10}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v1

    invoke-static {v1}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 181
    iget-object v0, p0, Lo/bup;->b:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/bup$1;

    invoke-direct {v1, p0, p1}, Lo/bup$1;-><init>(Lo/bup;Lcom/huawei/health/suggestion/model/Topic;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    return-void
.end method
