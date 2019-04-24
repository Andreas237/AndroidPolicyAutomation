.class Lo/bum$e;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bum;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field a:Lo/efy;

.field b:Lo/efy;

.field c:Lo/efy;

.field d:Lo/efy;

.field e:Lo/efy;

.field f:Landroid/widget/ImageView;

.field private i:Landroid/widget/ImageView;

.field k:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 165
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 166
    iput-object p1, p0, Lo/bum$e;->k:Landroid/view/View;

    .line 167
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_plan_peoples_num:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bum$e;->a:Lo/efy;

    .line 168
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_fe_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bum$e;->b:Lo/efy;

    .line 169
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_Difficulty:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bum$e;->d:Lo/efy;

    .line 170
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_parameter_num:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bum$e;->e:Lo/efy;

    .line 171
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_Kcal:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bum$e;->c:Lo/efy;

    .line 172
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_img_item_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bum$e;->f:Landroid/widget/ImageView;

    .line 173
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    .line 174
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;F)V
    .locals 12

    .line 178
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v9

    .line 179
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_chart_kcals:I

    float-to-int v1, v9

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v9}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 182
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_personjoin:I

    .line 185
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

    .line 184
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_num:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_desc:I

    .line 183
    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v11

    .line 187
    iget-object v0, p0, Lo/bum$e;->a:Lo/efy;

    invoke-virtual {v0, v11}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 188
    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lo/bum$e;->a:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 192
    :goto_0
    iget-object v0, p0, Lo/bum$e;->b:Lo/efy;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 193
    iget-object v0, p0, Lo/bum$e;->d:Lo/efy;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v1

    invoke-static {v1}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v0, p0, Lo/bum$e;->e:Lo/efy;

    iget-object v1, p0, Lo/bum$e;->e:Lo/efy;

    invoke-virtual {v1}, Lo/efy;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 195
    iget-object v0, p0, Lo/bum$e;->c:Lo/efy;

    invoke-virtual {v0, v10}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 197
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bum$e;->f:Landroid/widget/ImageView;

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->blank_1008:I

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/cam;->b(Ljava/lang/String;Landroid/widget/ImageView;II)V

    .line 199
    iget-object v0, p0, Lo/bum$e;->k:Landroid/view/View;

    new-instance v1, Lo/bum$e$3;

    invoke-direct {v1, p0, p1}, Lo/bum$e$3;-><init>(Lo/bum$e;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    iget-object v0, p0, Lo/bum$e;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/bum$e;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 222
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_2

    .line 223
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_new_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 224
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 225
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_3

    .line 226
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->new1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 227
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 228
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_4

    .line 229
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 230
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 232
    :cond_4
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 235
    :cond_5
    iget-object v0, p0, Lo/bum$e;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 237
    :goto_1
    return-void
.end method
