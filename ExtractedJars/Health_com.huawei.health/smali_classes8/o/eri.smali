.class public Lo/eri;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/ImageView;

.field private h:F

.field private i:Lo/byf;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 69
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 71
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eri;->e:Landroid/widget/TextView;

    .line 72
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_duration:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eri;->b:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_calorie:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eri;->a:Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_train_number:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eri;->c:Landroid/widget/TextView;

    .line 75
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_difficulty:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eri;->d:Landroid/widget/TextView;

    .line 76
    sget v0, Lcom/huawei/ui/homehealth/R$id;->new_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    .line 77
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_run_more_auto:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byf;

    iput-object v0, p0, Lo/eri;->i:Lo/byf;

    .line 78
    invoke-direct {p0}, Lo/eri;->c()V

    .line 79
    return-void
.end method

.method private c()V
    .locals 3

    .line 171
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 172
    if-eqz v1, :cond_0

    .line 173
    invoke-interface {v1}, Lo/brr;->a()Lo/brw;

    move-result-object v2

    .line 174
    if-eqz v2, :cond_0

    .line 175
    invoke-interface {v2}, Lo/brw;->getWeight()F

    move-result v0

    iput v0, p0, Lo/eri;->h:F

    .line 178
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 6

    .line 182
    if-nez p1, :cond_0

    .line 183
    const-string v0, "RunCourseViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doBi workout null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 186
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 187
    const-string v0, "course"

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    const-string v0, "courseId"

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    sget-object v0, Lo/dae;->ic:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 190
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 191
    return-void
.end method

.method static synthetic d(Lo/eri;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/eri;->d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 11

    .line 82
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 83
    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lo/eri;->itemView:Landroid/view/View;

    new-instance v1, Lo/eri$5;

    invoke-direct {v1, p0, p1, p2}, Lo/eri$5;-><init>(Lo/eri;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/health/suggestion/model/Topic;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    iget-object v0, p0, Lo/eri;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/eri;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 112
    :cond_1
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 113
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_2

    .line 114
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->pic_corner_new_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 115
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 116
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_3

    .line 117
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->pic_corner_new:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 118
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 119
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_4

    .line 120
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->pic_corner_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 121
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 123
    :cond_4
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 126
    :cond_5
    iget-object v0, p0, Lo/eri;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 130
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 134
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v9

    .line 136
    iget-object v0, p0, Lo/eri;->i:Lo/byf;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/byf;->a(Ljava/lang/String;Z)V

    .line 137
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_6

    .line 138
    iget-object v0, p0, Lo/eri;->i:Lo/byf;

    new-instance v1, Lo/eri$3;

    invoke-direct {v1, p0, v9}, Lo/eri$3;-><init>(Lo/eri;I)V

    invoke-virtual {v0, v1}, Lo/byf;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 146
    iget-object v0, p0, Lo/eri;->i:Lo/byf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/byf;->setClipToOutline(Z)V

    .line 148
    :cond_6
    goto :goto_1

    .line 149
    :cond_7
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->blank_1008:I

    iget-object v1, p0, Lo/eri;->i:Lo/byf;

    invoke-virtual {v1}, Lo/byf;->getContentImg()Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 152
    :goto_1
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 153
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/ui/homehealth/R$plurals;->sug_fitness_personjoin:I

    .line 154
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

    .line 153
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$style;->sug_reco_train_num:I

    sget v4, Lcom/huawei/ui/homehealth/R$style;->sug_reco_train_desc:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v9

    .line 155
    iget-object v0, p0, Lo/eri;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    goto :goto_2

    .line 157
    :cond_8
    iget-object v0, p0, Lo/eri;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 159
    :goto_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->sug_fitness_min:I

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

    .line 161
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->sug_chart_kcal:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v3

    iget v4, p0, Lo/eri;->h:F

    mul-float/2addr v3, v4

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 162
    iget-object v0, p0, Lo/eri;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    iget-object v0, p0, Lo/eri;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object v0, p0, Lo/eri;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    iget-object v0, p0, Lo/eri;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v1

    invoke-static {v1}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    return-void
.end method
