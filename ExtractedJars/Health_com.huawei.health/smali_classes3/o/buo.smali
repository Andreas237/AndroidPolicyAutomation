.class public Lo/buo;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/efy;

.field private b:Lo/efy;

.field private c:Lo/efy;

.field private d:Lo/efy;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/CheckBox;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Lo/efy;

.field private i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

.field private k:Landroid/widget/ImageView;

.field private n:F

.field private o:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 57
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 58
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_plan_peoples_num:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buo;->h:Lo/efy;

    .line 59
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_fe_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buo;->c:Lo/efy;

    .line 60
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_Kcal:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buo;->d:Lo/efy;

    .line 61
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_Difficulty:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buo;->b:Lo/efy;

    .line 62
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_parameter_num:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/buo;->a:Lo/efy;

    .line 63
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_img_item_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/buo;->e:Landroid/widget/ImageView;

    .line 64
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkable:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/buo;->g:Landroid/widget/RelativeLayout;

    .line 65
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkbox:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/buo;->f:Landroid/widget/CheckBox;

    .line 67
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    .line 68
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_view_space:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/buo;->o:Landroid/view/View;

    .line 70
    invoke-direct {p0}, Lo/buo;->d()V

    .line 71
    return-void
.end method

.method static synthetic b(Lo/buo;)Landroid/widget/CheckBox;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/buo;->f:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic c(Lo/buo;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 188
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 190
    if-eqz v1, :cond_0

    .line 191
    invoke-interface {v1}, Lo/brr;->a()Lo/brw;

    move-result-object v2

    .line 192
    if-eqz v2, :cond_0

    .line 193
    invoke-interface {v2}, Lo/brw;->getWeight()F

    move-result v0

    iput v0, p0, Lo/buo;->n:F

    .line 196
    :cond_0
    return-void
.end method

.method private e()V
    .locals 4

    .line 155
    const-string v0, "FitnessTopicViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeleteModel.issDeleteMode():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->issDeleteMode()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":mDeleteModel.acquirePosition():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquirePosition()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->issDeleteMode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    iget-object v0, p0, Lo/buo;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquirePosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lo/buo;->f:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lo/buo;->f:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 164
    :cond_1
    iget-object v0, p0, Lo/buo;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 166
    :goto_0
    iget-object v0, p0, Lo/buo;->f:Landroid/widget/CheckBox;

    iget-object v1, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquirePosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTag(Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lo/buo;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 168
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    .line 74
    iget-object v0, p0, Lo/buo;->o:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 75
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Ljava/lang/String;ZLcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 10

    .line 79
    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    .line 80
    return-void

    .line 84
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_personjoin:I

    .line 86
    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 85
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_num:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_desc:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v9

    .line 87
    iget-object v0, p0, Lo/buo;->h:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    iget-object v0, p0, Lo/buo;->h:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 91
    :goto_0
    if-eqz p3, :cond_2

    .line 92
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 93
    iput-object p1, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    .line 94
    invoke-direct {p0}, Lo/buo;->e()V

    .line 98
    :cond_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v3

    iget v4, p0, Lo/buo;->n:F

    mul-float/2addr v3, v4

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 100
    iget-object v0, p0, Lo/buo;->c:Lo/efy;

    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v0, p0, Lo/buo;->d:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p0, Lo/buo;->a:Lo/efy;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 103
    iget-object v0, p0, Lo/buo;->b:Lo/efy;

    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v1

    invoke-static {v1}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 107
    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/buo;->e:Landroid/widget/ImageView;

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->sug_bg_trining_defuct:I

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/cam;->b(Ljava/lang/String;Landroid/widget/ImageView;II)V

    .line 110
    iget-object v0, p0, Lo/buo;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/buo;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 111
    :cond_3
    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_4

    .line 112
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_new_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 114
    :cond_4
    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_5

    .line 115
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->new1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 116
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 117
    :cond_5
    invoke-virtual {p4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_6

    .line 118
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 119
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 121
    :cond_6
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 124
    :cond_7
    iget-object v0, p0, Lo/buo;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 127
    :goto_1
    iget-object v0, p0, Lo/buo;->itemView:Landroid/view/View;

    new-instance v1, Lo/buo$3;

    invoke-direct {v1, p0, p4, p2}, Lo/buo$3;-><init>(Lo/buo;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 172
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rv_checkbox:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 173
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 174
    iget-object v0, p0, Lo/buo;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v5

    .line 175
    const-string v0, "FitnessTopicViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "before mDeleteModel.acquireSelects():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--isChecked:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    if-eqz v5, :cond_0

    .line 177
    iget-object v0, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 178
    :cond_0
    iget-object v0, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    iget-object v0, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 181
    :cond_1
    :goto_0
    const-string v0, "FitnessTopicViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "after mDeleteModel.acquireSelects():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/buo;->i:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->acquireSelects()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :cond_2
    return-void
.end method
