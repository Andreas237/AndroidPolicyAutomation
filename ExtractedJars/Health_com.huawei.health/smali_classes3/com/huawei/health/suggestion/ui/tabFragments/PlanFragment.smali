.class public Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:I

.field private B:Landroid/widget/ImageView;

.field private D:Landroid/os/Handler;

.field private a:Lo/efy;

.field private b:Lo/efy;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Lo/efy;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:Z

.field private k:Landroid/widget/RelativeLayout;

.field private l:Lo/efy;

.field private m:Lo/efy;

.field private n:Z

.field private o:Z

.field private p:Lo/efy;

.field private q:Landroid/support/v7/widget/RecyclerView;

.field private r:Z

.field private s:Z

.field private t:Landroid/support/v7/widget/RecyclerView;

.field private u:Landroid/support/v7/widget/RecyclerView;

.field private v:Lo/bwz;

.field private w:Landroid/content/Context;

.field private x:Lo/bxc;

.field private y:Landroid/view/View;

.field private z:Lo/bwz;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 57
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->o:Z

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->n:Z

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->r:Z

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->s:Z

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->A:I

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->j:Z

    .line 452
    new-instance v0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->D:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->n:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Landroid/os/Handler;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->D:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 187
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->r:Z

    .line 189
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->o()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->s:Z

    .line 190
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->k:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private c()V
    .locals 0

    .line 193
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->g()V

    .line 194
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i()V

    .line 195
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->h()V

    .line 196
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->f()V

    .line 197
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->k()V

    .line 198
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Lo/efy;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->b:Lo/efy;

    return-object v0
.end method

.method private d()Z
    .locals 2

    .line 169
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->A:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 170
    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->c:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;Ljava/util/List;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e(Ljava/util/List;)V

    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 411
    move-object v4, p1

    .line 412
    if-eqz v4, :cond_5

    .line 413
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->r:Z

    if-eqz v0, :cond_2

    .line 415
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 416
    const/4 v6, 0x0

    .line 417
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 418
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v6

    .line 420
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 421
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "info is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 423
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 424
    invoke-interface {v4, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 425
    goto :goto_1

    .line 422
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 431
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->o:Z

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->d()Z

    move-result v0

    if-nez v0, :cond_4

    .line 432
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 434
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 437
    :goto_2
    new-instance v0, Lo/bwz;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    const/16 v2, 0x66

    invoke-direct {v0, v4, v2, v1}, Lo/bwz;-><init>(Ljava/util/List;ILandroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->v:Lo/bwz;

    .line 438
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->t:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->v:Lo/bwz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 440
    :cond_5
    return-void
.end method

.method private e()Z
    .locals 2

    .line 180
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->A:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 181
    const/4 v0, 0x0

    return v0

    .line 183
    :cond_0
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Lo/efy;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->a:Lo/efy;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 229
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->network_disable_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->c:Landroid/widget/RelativeLayout;

    .line 230
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->btn_set_network:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->d:Landroid/widget/Button;

    .line 231
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->d:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 232
    return-void
.end method

.method private g()V
    .locals 3

    .line 201
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_plan_statistic_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e:Landroid/widget/LinearLayout;

    .line 203
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fragment_plan_statistic_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->b:Lo/efy;

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fragment_plan_statistic_calories:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->a:Lo/efy;

    .line 205
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fragment_plan_statistic_num:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->g:Lo/efy;

    .line 206
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->plan_record:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    .line 209
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_record:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->B:Landroid/widget/ImageView;

    .line 212
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->arrow_right_normal:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v2

    .line 214
    if-eqz v2, :cond_0

    .line 215
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->B:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 218
    :cond_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 243
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->all_run_plans_ryt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->f:Landroid/widget/RelativeLayout;

    .line 244
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_run_plan_rcy:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->u:Landroid/support/v7/widget/RecyclerView;

    .line 245
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->u:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->all_run_plans:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->m:Lo/efy;

    .line 248
    return-void
.end method

.method private i()V
    .locals 3

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->my_plans_rcy:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->q:Landroid/support/v7/widget/RecyclerView;

    .line 222
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->q:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_myplans_ryt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->h:Landroid/widget/RelativeLayout;

    .line 225
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->my_plans_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->p:Lo/efy;

    .line 226
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Lo/efy;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->g:Lo/efy;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 235
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitnessplan_list:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->k:Landroid/widget/RelativeLayout;

    .line 236
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_pkg_rcy:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->t:Landroid/support/v7/widget/RecyclerView;

    .line 237
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->t:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->all_fitness_plans:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->l:Lo/efy;

    .line 240
    return-void
.end method

.method private l()V
    .locals 8

    .line 303
    new-instance v0, Lo/bwz;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->s()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    const/16 v3, 0x65

    invoke-direct {v0, v3, v1, v2}, Lo/bwz;-><init>(ILjava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->z:Lo/bwz;

    .line 305
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->u:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->z:Lo/bwz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 307
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 308
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_2

    .line 309
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->z:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->a()Ljava/util/List;

    move-result-object v5

    .line 310
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v6

    .line 311
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 312
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxw;

    invoke-virtual {v0}, Lo/bxw;->c()I

    move-result v0

    if-ne v0, v6, :cond_0

    .line 313
    invoke-interface {v5, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 314
    goto :goto_1

    .line 311
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 317
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->z:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->notifyDataSetChanged()V

    .line 319
    :cond_2
    return-void
.end method

.method private m()V
    .locals 4

    .line 263
    const-string v0, "planStatistics_need_refresh"

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 264
    const-string v0, "false"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 265
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$5;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/brt;->e(ILo/bui;)V

    .line 281
    :cond_0
    return-void
.end method

.method private n()V
    .locals 3

    .line 284
    new-instance v0, Lo/bxc;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->p()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bxc;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->x:Lo/bxc;

    .line 285
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->q:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->x:Lo/bxc;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 287
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->r:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->s:Z

    if-nez v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 293
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->o:Z

    if-eqz v0, :cond_1

    .line 294
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->r()V

    .line 297
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->n:Z

    if-eqz v0, :cond_2

    .line 298
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->u()V

    .line 300
    :cond_2
    return-void
.end method

.method private o()Z
    .locals 3

    .line 255
    iget v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->A:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 256
    const/4 v0, 0x0

    return v0

    .line 258
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    .line 259
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private p()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation

    .line 322
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 323
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 325
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 326
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 328
    :cond_0
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessPlan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    :cond_1
    :goto_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 334
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_2

    .line 335
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 337
    :cond_2
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runPlan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    :goto_1
    return-object v4
.end method

.method private r()V
    .locals 4

    .line 374
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 376
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->r:Z

    if-eqz v0, :cond_2

    .line 377
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->x:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->d()Ljava/util/List;

    move-result-object v2

    .line 378
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 379
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 380
    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 378
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 383
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->x:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->notifyDataSetChanged()V

    .line 387
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->m:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 389
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->p:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_my_run_plans:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 390
    return-void
.end method

.method private s()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/bxw;>;"
        }
    .end annotation

    .line 344
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 346
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x3

    if-gt v6, v0, :cond_3

    .line 347
    new-instance v5, Lo/bxw;

    invoke-direct {v5}, Lo/bxw;-><init>()V

    .line 348
    invoke-static {v6}, Lo/bya;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->e(Ljava/lang/String;)V

    .line 349
    if-nez v6, :cond_0

    .line 350
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_run_plantype_5km:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->b(Ljava/lang/String;)V

    .line 351
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_five:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 352
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    goto :goto_1

    .line 353
    :cond_0
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    .line 354
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_run_plantype_5km:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->b(Ljava/lang/String;)V

    .line 355
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_ten:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 356
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    goto :goto_1

    .line 357
    :cond_1
    const/4 v0, 0x2

    if-ne v6, v0, :cond_2

    .line 358
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_run_plantype_half:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->b(Ljava/lang/String;)V

    .line 359
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_half:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 360
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    goto :goto_1

    .line 362
    :cond_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_run_plantype_full:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->b(Ljava/lang/String;)V

    .line 363
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_marathon:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 364
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    .line 366
    :goto_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 346
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 369
    :cond_3
    return-object v4
.end method

.method private u()V
    .locals 4

    .line 393
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 395
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->s:Z

    if-eqz v0, :cond_2

    .line 396
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->x:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->d()Ljava/util/List;

    move-result-object v2

    .line 397
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 398
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 399
    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 397
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 402
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->x:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->notifyDataSetChanged()V

    .line 405
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->l:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 407
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->p:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_header_fitness_plan:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 408
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 497
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 498
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->j:Z

    .line 499
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 501
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 444
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e:Landroid/widget/LinearLayout;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 445
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->f()V

    goto :goto_0

    .line 446
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->d:Landroid/widget/Button;

    if-ne p1, v0, :cond_2

    .line 447
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 449
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 113
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->w:Landroid/content/Context;

    .line 114
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->b()V

    .line 115
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fragment_plan:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->c()V

    .line 117
    const-string v0, "planStatistics_need_refresh"

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 121
    if-eqz v2, :cond_0

    .line 122
    const-string v0, "KEY_TYPE_SHOW_PLAN"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->A:I

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->y:Landroid/view/View;

    return-object v0
.end method

.method public onResume()V
    .locals 2

    .line 130
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 131
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->r:Z

    .line 132
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->o()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->s:Z

    .line 134
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->m()V

    .line 136
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 143
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->j:Z

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 146
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->n()V

    .line 148
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->l()V

    .line 150
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;-><init>(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)V

    invoke-virtual {v0, v1}, Lo/btj;->b(Lo/bui;)V

    .line 166
    return-void
.end method
