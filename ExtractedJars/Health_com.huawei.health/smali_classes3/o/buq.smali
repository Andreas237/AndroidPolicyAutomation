.class public Lo/buq;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private a:Lo/efy;

.field private b:Landroid/view/View;

.field private c:Lo/efy;

.field private d:Landroid/view/View;

.field private e:Landroid/widget/ImageView;

.field private f:F

.field private g:Lo/efy;

.field private h:Lo/efy;

.field private i:Lo/efy;

.field private k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 56
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 57
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_left_padding:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/buq;->d:Landroid/view/View;

    .line 58
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_right_padding:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/buq;->b:Landroid/view/View;

    .line 59
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_img_item_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/buq;->e:Landroid/widget/ImageView;

    .line 60
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buq;->c:Lo/efy;

    .line 61
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_duration:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buq;->a:Lo/efy;

    .line 62
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_calorie:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buq;->i:Lo/efy;

    .line 63
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_train_number:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buq;->g:Lo/efy;

    .line 64
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_difficulty:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buq;->h:Lo/efy;

    .line 65
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    .line 67
    invoke-direct {p0}, Lo/buq;->c()V

    .line 68
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 3

    .line 169
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 170
    const-string v0, "entrance"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    const-string v0, "position"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "1130015"

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 173
    return-void
.end method

.method private c()V
    .locals 3

    .line 158
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 160
    if-eqz v1, :cond_0

    .line 161
    invoke-interface {v1}, Lo/brr;->a()Lo/brw;

    move-result-object v2

    .line 162
    if-eqz v2, :cond_0

    .line 163
    invoke-interface {v2}, Lo/brw;->getWeight()F

    move-result v0

    iput v0, p0, Lo/buq;->f:F

    .line 166
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/buq;Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/buq;->a(Lcom/huawei/health/suggestion/model/Topic;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;ZZ)V
    .locals 1

    .line 71
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/buq;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;ZZLcom/huawei/health/suggestion/model/Topic;)V

    .line 72
    return-void
.end method

.method public c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;ZZLcom/huawei/health/suggestion/model/Topic;)V
    .locals 11

    .line 75
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 76
    return-void

    .line 78
    :cond_0
    if-eqz p2, :cond_1

    .line 79
    iget-object v0, p0, Lo/buq;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 81
    :cond_1
    iget-object v0, p0, Lo/buq;->d:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 84
    :goto_0
    if-eqz p3, :cond_2

    .line 85
    iget-object v0, p0, Lo/buq;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 87
    :cond_2
    iget-object v0, p0, Lo/buq;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 89
    :goto_1
    iget-object v0, p0, Lo/buq;->itemView:Landroid/view/View;

    new-instance v1, Lo/buq$3;

    invoke-direct {v1, p0, p1, p4}, Lo/buq$3;-><init>(Lo/buq;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/health/suggestion/model/Topic;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    iget-object v0, p0, Lo/buq;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/buq;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 117
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_4

    .line 118
    iget-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_new_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 119
    iget-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 120
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_5

    .line 121
    iget-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->new1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 122
    iget-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 123
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_6

    .line 124
    iget-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 125
    iget-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 127
    :cond_6
    iget-object v0, p0, Lo/buq;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 131
    :cond_7
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 132
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/buq;->e:Landroid/widget/ImageView;

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->blank_1008:I

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/cam;->b(Ljava/lang/String;Landroid/widget/ImageView;II)V

    goto :goto_3

    .line 134
    :cond_8
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->blank_1008:I

    iget-object v1, p0, Lo/buq;->e:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 138
    :goto_3
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 139
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_personjoin:I

    .line 140
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 139
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_num:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_desc:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v9

    .line 142
    iget-object v0, p0, Lo/buq;->g:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 143
    goto :goto_4

    .line 144
    :cond_9
    iget-object v0, p0, Lo/buq;->g:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 147
    :goto_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 149
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v3

    iget v4, p0, Lo/buq;->f:F

    mul-float/2addr v3, v4

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 150
    iget-object v0, p0, Lo/buq;->c:Lo/efy;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 151
    iget-object v0, p0, Lo/buq;->a:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 152
    iget-object v0, p0, Lo/buq;->i:Lo/efy;

    invoke-virtual {v0, v10}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 153
    iget-object v0, p0, Lo/buq;->h:Lo/efy;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v1

    invoke-static {v1}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 155
    return-void
.end method
