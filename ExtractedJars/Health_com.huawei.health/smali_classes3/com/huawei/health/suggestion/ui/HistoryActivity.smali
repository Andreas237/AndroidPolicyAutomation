.class public Lcom/huawei/health/suggestion/ui/HistoryActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"


# instance fields
.field private d:Landroid/support/v7/widget/RecyclerView;

.field private f:Lo/bvn;

.field private g:Lcom/huawei/health/suggestion/model/RunPlanParams;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
        }
    .end annotation
.end field

.field private i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

.field private k:Landroid/widget/LinearLayout;

.field private l:Ljava/lang/String;

.field private final m:I

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
        }
    .end annotation
.end field

.field private o:I

.field private p:Z

.field private q:Lcom/huawei/health/suggestion/model/Plan;

.field private r:Lo/egy;

.field private t:Lo/egv;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->h:Ljava/util/List;

    .line 73
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->m:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->o:I

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    return-object v0
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanRecord;>;)V"
        }
    .end annotation

    .line 363
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 364
    iget v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->o:I

    if-nez v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 367
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->o:I

    .line 368
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    if-eqz v0, :cond_1

    .line 369
    new-instance v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$13;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$13;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    invoke-virtual {v0, p1}, Lo/bvn;->e(Ljava/util/List;)V

    .line 384
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_4

    .line 385
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->e()Lo/bvn;

    goto :goto_0

    .line 388
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->p()V

    goto :goto_0

    .line 391
    :cond_2
    iget v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->o:I

    if-nez v0, :cond_3

    .line 392
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 393
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 395
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    if-eqz v0, :cond_4

    .line 396
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    invoke-virtual {v0}, Lo/bvn;->e()Lo/bvn;

    .line 399
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/HistoryActivity;)I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->o:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->q:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Ljava/util/List;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/model/RunPlanParams;)Lcom/huawei/health/suggestion/model/RunPlanParams;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->g:Lcom/huawei/health/suggestion/model/RunPlanParams;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/egv;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->t:Lo/egv;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/HistoryActivity;Z)Z
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->p:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/HistoryActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->l:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->l()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/HistoryActivity;ILo/bvr;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->e(ILo/bvr;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->q:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method private e(ILo/bvr;)V
    .locals 10

    .line 410
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->p:Z

    if-eqz v0, :cond_0

    .line 411
    return-void

    .line 413
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->p:Z

    .line 415
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 417
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v8

    .line 418
    if-eqz v8, :cond_2

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->l:Ljava/lang/String;

    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v1

    invoke-static {v0, v1}, Lo/bya;->b(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 419
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can\'t create plan with the gender not match "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    new-instance v9, Lo/egy$b;

    invoke-direct {v9, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 421
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_fitness_male_plangender_notmatch_notice:I

    goto :goto_0

    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_fitness_famale_plangender_notmatch_notice:I

    :goto_0
    invoke-virtual {v9, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/HistoryActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$11;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    .line 422
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 427
    invoke-virtual {v9}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->r:Lo/egy;

    .line 428
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->r:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 429
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->p:Z

    .line 430
    return-void

    .line 432
    :cond_2
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->l:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;

    invoke-direct {v2, p0, p2}, Lcom/huawei/health/suggestion/ui/HistoryActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lo/bvr;)V

    invoke-virtual {v0, v1, v2}, Lo/btj;->a(Ljava/lang/String;Lo/bui;)V

    .line 453
    goto :goto_1

    :cond_3
    if-nez p1, :cond_4

    .line 454
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->g:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->g:Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-static {v2}, Lo/bug;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;)Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/suggestion/ui/HistoryActivity$5;

    invoke-direct {v3, p0, p2}, Lcom/huawei/health/suggestion/ui/HistoryActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lo/bvr;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/util/Map;Lo/bui;)V

    goto :goto_1

    .line 477
    :cond_4
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->acquireBeginDate()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->acquireType()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    .line 478
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->acquireDifficulty()I

    move-result v4

    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->acquireTimes()I

    move-result v5

    iget-object v6, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->acquireExcludedDate()Ljava/util/TreeSet;

    move-result-object v6

    new-instance v7, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;

    invoke-direct {v7, p0, p2}, Lcom/huawei/health/suggestion/ui/HistoryActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lo/bvr;)V

    .line 477
    invoke-interface/range {v0 .. v7}, Lo/bsp;->d(JIIILjava/util/TreeSet;Lo/bui;)V

    .line 500
    :goto_1
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Ljava/util/List;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->n:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/bvn;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    return-object v0
.end method

.method private l()V
    .locals 0

    .line 406
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->i()V

    .line 407
    return-void
.end method

.method private m()V
    .locals 3

    .line 120
    new-instance v2, Lo/egv$b;

    invoke-direct {v2, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 121
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_title:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 122
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_content:I

    invoke-virtual {v2, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 123
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_ok:I

    new-instance v1, Lcom/huawei/health/suggestion/ui/HistoryActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 131
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_no:I

    new-instance v1, Lcom/huawei/health/suggestion/ui/HistoryActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$8;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 137
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->t:Lo/egv;

    .line 138
    return-void
.end method

.method private p()V
    .locals 0

    .line 403
    return-void
.end method


# virtual methods
.method protected d()I
    .locals 1

    .line 93
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 2

    .line 98
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/HistoryActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/btj;->b(Lo/bui;)V

    .line 114
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_history:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->setContentView(I)V

    .line 115
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->m()V

    .line 116
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->n()V

    .line 117
    return-void
.end method

.method protected h()I
    .locals 1

    .line 88
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 4

    .line 315
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->o:I

    mul-int/lit8 v1, v1, 0xa

    new-instance v2, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$10;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v2}, Lo/bsp;->b(IILo/bui;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->n:Ljava/util/List;

    .line 360
    return-void
.end method

.method public k()V
    .locals 4

    .line 142
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    return-void
.end method

.method public n()V
    .locals 4

    .line 146
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rcv_history:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d:Landroid/support/v7/widget/RecyclerView;

    .line 147
    sget v0, Lcom/huawei/health/suggestion/R$id;->iv_no_workout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->k:Landroid/widget/LinearLayout;

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 149
    new-instance v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->h:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d:Landroid/support/v7/widget/RecyclerView;

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_item_rcv_history:I

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    .line 276
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    new-instance v1, Lcom/huawei/health/suggestion/ui/HistoryActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$7;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/bvn;->b(Lo/bvn$b;)Lo/bvn;

    .line 283
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity;->f:Lo/bvn;

    new-instance v1, Lcom/huawei/health/suggestion/ui/HistoryActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$6;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/bvn;->b(Lo/bvn$e;)V

    .line 310
    return-void
.end method
