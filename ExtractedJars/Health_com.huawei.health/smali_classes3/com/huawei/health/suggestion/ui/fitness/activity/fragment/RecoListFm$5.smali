.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;
.super Lo/bvn;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bvn<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {p0, p2, p3, p4}, Lo/bvn;-><init>(Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V

    return-void
.end method


# virtual methods
.method public synthetic b(Lo/bvr;ILjava/lang/Object;)V
    .locals 1

    .line 127
    move-object v0, p3

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;->d(Lo/bvr;ILcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method

.method public d(Lo/bvr;ILcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 12

    .line 130
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_personjoin:I

    .line 131
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 130
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_num:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_desc:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v9

    .line 132
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v10

    .line 133
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_chart_kcals:I

    float-to-int v1, v10

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v10}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 134
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_plan_peoples_num:I

    invoke-virtual {p1, v0, v9}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_fe_name:I

    .line 135
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_Difficulty:I

    .line 136
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v2

    invoke-static {v2}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_parameter_num:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 137
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, Lo/bzr;->h(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Lo/bvr;->e(II[Ljava/lang/Object;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_Kcal:I

    .line 138
    invoke-virtual {v0, v1, v11}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_img_item_pic:I

    .line 139
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v2, v3}, Lo/bvr;->d(ILjava/lang/String;I)Lo/bvr;

    .line 142
    invoke-virtual {p0, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_view_space:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 143
    if-nez p2, :cond_0

    .line 144
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_view_space:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 146
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_view_space:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 151
    :cond_1
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 152
    :cond_2
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_3

    .line 153
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_new_watchwear:I

    invoke-virtual {p1, v0, v1}, Lo/bvr;->e(II)Lo/bvr;

    .line 154
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    goto :goto_1

    .line 155
    :cond_3
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_4

    .line 156
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->new1:I

    invoke-virtual {p1, v0, v1}, Lo/bvr;->e(II)Lo/bvr;

    .line 157
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    goto :goto_1

    .line 158
    :cond_4
    invoke-virtual {p3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_5

    .line 159
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_watchwear:I

    invoke-virtual {p1, v0, v1}, Lo/bvr;->e(II)Lo/bvr;

    .line 160
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    goto :goto_1

    .line 162
    :cond_5
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    goto :goto_1

    .line 165
    :cond_6
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    .line 169
    :goto_1
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 170
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_plan_peoples_num:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    goto :goto_2

    .line 172
    :cond_7
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_plan_peoples_num:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->a(II)V

    .line 175
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 176
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$5;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;Lo/bvr;I)V

    .line 178
    :cond_8
    return-void
.end method
