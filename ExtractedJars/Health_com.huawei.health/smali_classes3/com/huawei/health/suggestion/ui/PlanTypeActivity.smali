.class public Lcom/huawei/health/suggestion/ui/PlanTypeActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Lcom/huawei/health/suggestion/model/Plan;

.field private B:Lcom/huawei/health/suggestion/model/Plan;

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation
.end field

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bxw;>;"
        }
    .end annotation
.end field

.field private H:Landroid/os/Handler;

.field private d:Landroid/widget/RelativeLayout;

.field private f:Lo/efy;

.field private g:Lo/efy;

.field private h:Lo/efy;

.field private i:Landroid/widget/Button;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;"
        }
    .end annotation
.end field

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Lo/efy;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Lo/efy;

.field private r:Landroid/support/v7/widget/RecyclerView;

.field private s:Z

.field private t:Lo/efy;

.field private u:Z

.field private v:Lo/bwz;

.field private w:Landroid/support/v7/widget/RecyclerView;

.field private x:Lo/bwz;

.field private y:Lo/bxc;

.field private z:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->u:Z

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->s:Z

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->C:Ljava/util/List;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->j:Ljava/util/List;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->D:Ljava/util/List;

    .line 526
    new-instance v0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;-><init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->w()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/List;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->d(Ljava/util/List;)V

    return-void
.end method

.method private a(Ljava/util/Map;)V
    .locals 7

    .line 444
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 447
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "duration"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float v2, v2

    invoke-static {v2}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 448
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calorie"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float v2, v2

    invoke-static {v2}, Lo/bzr;->d(F)F

    move-result v2

    invoke-static {v2}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 449
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_fitness_actions:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "totalPlan"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 450
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->f:Lo/efy;

    invoke-virtual {v0, v4}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->g:Lo/efy;

    invoke-virtual {v0, v5}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->h:Lo/efy;

    invoke-virtual {v0, v6}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 453
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->r()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/List;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->c(Ljava/util/List;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/Map;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->a(Ljava/util/Map;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->t()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/List;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->e(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 467
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 470
    :cond_1
    move-object v4, p1

    .line 471
    if-eqz v4, :cond_7

    .line 472
    const-string v0, "Suggestion_PlanTypeActivity"

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

    .line 473
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->u:Z

    if-eqz v0, :cond_4

    .line 474
    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->B:Lcom/huawei/health/suggestion/model/Plan;

    .line 475
    const/4 v6, 0x0

    .line 476
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 477
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v6

    .line 479
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 480
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "info is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 482
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 483
    invoke-interface {v4, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 484
    goto :goto_1

    .line 481
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 490
    :cond_4
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_6

    .line 491
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 493
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 495
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 496
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->j:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 499
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->v:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->notifyDataSetChanged()V

    .line 501
    :cond_7
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->n()V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bxw;>;)V"
        }
    .end annotation

    .line 504
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 505
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 507
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 508
    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->A:Lcom/huawei/health/suggestion/model/Plan;

    .line 509
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_3

    .line 510
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v3

    .line 511
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 512
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxw;

    invoke-virtual {v0}, Lo/bxw;->c()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 513
    invoke-interface {p1, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 514
    goto :goto_1

    .line 511
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 518
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 519
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->D:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 520
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->x:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->notifyDataSetChanged()V

    .line 523
    :goto_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->m()V

    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;)V"
        }
    .end annotation

    .line 456
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 457
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 459
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 461
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 462
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->C:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 463
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->y:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->notifyDataSetChanged()V

    .line 464
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)Landroid/os/Handler;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 133
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->c()V

    .line 138
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 146
    :goto_0
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 162
    return-void
.end method

.method private m()V
    .locals 5

    .line 170
    const/4 v3, -0x1

    .line 171
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 172
    if-eqz v4, :cond_0

    .line 173
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v3

    .line 176
    :cond_0
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v3, v1}, Lo/btj;->c(IILo/bui;)V

    .line 198
    return-void
.end method

.method private n()V
    .locals 3

    .line 165
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 166
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 167
    return-void
.end method

.method private p()V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->s()V

    .line 114
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->u()V

    .line 115
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->x()V

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->z()V

    .line 117
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->y()V

    .line 118
    return-void
.end method

.method private q()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation

    .line 290
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 291
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 292
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 293
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 294
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->u:Z

    .line 295
    iput-object v5, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->B:Lcom/huawei/health/suggestion/model/Plan;

    .line 296
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 298
    :cond_0
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessPlan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->u:Z

    .line 300
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->B:Lcom/huawei/health/suggestion/model/Plan;

    .line 305
    :cond_1
    :goto_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->i()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 306
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 307
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->s:Z

    .line 308
    iput-object v5, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->A:Lcom/huawei/health/suggestion/model/Plan;

    .line 309
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 311
    :cond_2
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runPlan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->s:Z

    .line 313
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->A:Lcom/huawei/health/suggestion/model/Plan;

    .line 319
    :goto_1
    return-object v4
.end method

.method private r()V
    .locals 4

    .line 201
    const-string v0, "planStatistics_need_refresh"

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 202
    const-string v0, "false"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/brt;->e(ILo/bui;)V

    .line 219
    :cond_0
    return-void
.end method

.method private s()V
    .locals 2

    .line 277
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_plan_statistic_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    .line 278
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fragment_plan_statistic_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->f:Lo/efy;

    .line 279
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fragment_plan_statistic_calories:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->g:Lo/efy;

    .line 280
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fragment_plan_statistic_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->h:Lo/efy;

    .line 281
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 283
    sget v0, Lcom/huawei/health/suggestion/R$id;->plan_record:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->n:Landroid/widget/LinearLayout;

    .line 284
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 286
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 287
    return-void
.end method

.method private t()V
    .locals 4

    .line 223
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->q()Ljava/util/List;

    move-result-object v2

    .line 225
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 226
    iput-object v2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 227
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 236
    return-void
.end method

.method private u()V
    .locals 4

    .line 323
    sget v0, Lcom/huawei/health/suggestion/R$id;->my_plans_rcy:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->r:Landroid/support/v7/widget/RecyclerView;

    .line 324
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->r:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, p0, v2, v3}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 330
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_myplans_ryt:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->l:Landroid/widget/RelativeLayout;

    .line 331
    new-instance v0, Lo/bxc;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->C:Ljava/util/List;

    invoke-direct {v0, v1, p0}, Lo/bxc;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->y:Lo/bxc;

    .line 332
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->y:Lo/bxc;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 333
    sget v0, Lcom/huawei/health/suggestion/R$id;->my_plans_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->q:Lo/efy;

    .line 335
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 336
    return-void
.end method

.method private v()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/bxw;>;"
        }
    .end annotation

    .line 384
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 386
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x3

    if-gt v6, v0, :cond_3

    .line 387
    new-instance v5, Lo/bxw;

    invoke-direct {v5}, Lo/bxw;-><init>()V

    .line 388
    invoke-static {v6}, Lo/bya;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->e(Ljava/lang/String;)V

    .line 389
    if-nez v6, :cond_0

    .line 390
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

    .line 391
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_five:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 392
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    goto :goto_1

    .line 393
    :cond_0
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    .line 394
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

    .line 395
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_ten:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 396
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    goto :goto_1

    .line 397
    :cond_1
    const/4 v0, 0x2

    if-ne v6, v0, :cond_2

    .line 398
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_run_plantype_half:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->b(Ljava/lang/String;)V

    .line 399
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_half:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 400
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    goto :goto_1

    .line 402
    :cond_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_run_plantype_full:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bxw;->b(Ljava/lang/String;)V

    .line 403
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_marathon:I

    invoke-virtual {v5, v0}, Lo/bxw;->a(I)V

    .line 404
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lo/bxw;->b(I)V

    .line 406
    :goto_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 409
    :cond_3
    return-object v4
.end method

.method private w()V
    .locals 4

    .line 377
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->v()Ljava/util/List;

    move-result-object v2

    .line 378
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 379
    iput-object v2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 380
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->H:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 381
    return-void
.end method

.method private x()V
    .locals 4

    .line 360
    sget v0, Lcom/huawei/health/suggestion/R$id;->all_run_plans_ryt:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->p:Landroid/widget/RelativeLayout;

    .line 361
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_plan_rcy:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->z:Landroid/support/v7/widget/RecyclerView;

    .line 362
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->z:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$10;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, p0, v2, v3}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$10;-><init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 370
    new-instance v0, Lo/bwz;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->D:Ljava/util/List;

    const/16 v2, 0x65

    invoke-direct {v0, v2, v1, p0}, Lo/bwz;-><init>(ILjava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->x:Lo/bwz;

    .line 371
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->z:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->x:Lo/bwz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 372
    sget v0, Lcom/huawei/health/suggestion/R$id;->all_run_plans:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->m:Lo/efy;

    .line 373
    return-void
.end method

.method private y()V
    .locals 4

    .line 345
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitnessplan_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->o:Landroid/widget/RelativeLayout;

    .line 346
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_pkg_rcy:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->w:Landroid/support/v7/widget/RecyclerView;

    .line 347
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->w:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$3;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, p0, v2, v3}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 353
    new-instance v0, Lo/bwz;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->j:Ljava/util/List;

    const/16 v2, 0x66

    invoke-direct {v0, v1, v2, p0}, Lo/bwz;-><init>(Ljava/util/List;ILandroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->v:Lo/bwz;

    .line 354
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->w:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->v:Lo/bwz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 355
    sget v0, Lcom/huawei/health/suggestion/R$id;->all_fitness_plans:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->t:Lo/efy;

    .line 356
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 357
    return-void
.end method

.method private z()V
    .locals 1

    .line 339
    sget v0, Lcom/huawei/health/suggestion/R$id;->network_disable_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->d:Landroid/widget/RelativeLayout;

    .line 340
    sget v0, Lcom/huawei/health/suggestion/R$id;->btn_set_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->i:Landroid/widget/Button;

    .line 341
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->i:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 342
    return-void
.end method


# virtual methods
.method public g()V
    .locals 4

    .line 414
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLayout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->setContentView(I)V

    .line 416
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->p()V

    .line 417
    const-string v0, "planStatistics_need_refresh"

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    return-void
.end method

.method protected h()I
    .locals 1

    .line 129
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 4

    .line 98
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void
.end method

.method public k()V
    .locals 4

    .line 423
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 433
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->k:Landroid/widget/LinearLayout;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->n:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 434
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->f()V

    .line 435
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 436
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    const-string v0, "1120015"

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 438
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->i:Landroid/widget/Button;

    if-ne p1, v0, :cond_2

    .line 439
    invoke-static {p0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 441
    :cond_2
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 555
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 556
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onConfigurationChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->l()V

    .line 558
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 122
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onResume()V

    .line 123
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->l()V

    .line 125
    return-void
.end method
