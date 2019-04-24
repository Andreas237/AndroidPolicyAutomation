.class public Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Lcom/huawei/health/suggestion/model/Plan;

.field private d:Landroid/widget/Button;

.field private e:Lo/egv;

.field private f:Lo/efy;

.field private g:Landroid/widget/ImageView;

.field private h:Lo/efy;

.field private i:Lo/efy;

.field private k:Lo/efy;

.field private n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d:Landroid/widget/Button;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->e:Lo/egv;

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->a:Z

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->b:Ljava/lang/String;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->g:Landroid/widget/ImageView;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->k:Lo/efy;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->i:Lo/efy;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->h:Lo/efy;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->f:Lo/efy;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->a:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)Lo/egv;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->e:Lo/egv;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)Landroid/widget/Button;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->k()V

    return-void
.end method

.method private f()V
    .locals 12

    .line 94
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 95
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mFitnessPackageInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void

    .line 98
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_create_fitness_plan:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d:Landroid/widget/Button;

    .line 99
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_back:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->g:Landroid/widget/ImageView;

    .line 101
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_day_textView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->k:Lo/efy;

    .line 104
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_time_textView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->i:Lo/efy;

    .line 105
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fit_plan_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->h:Lo/efy;

    .line 106
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_description_textView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->f:Lo/efy;

    .line 108
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->h:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->f:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireTotalCourse()I

    move-result v6

    .line 112
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v0, v1}, Lo/btj;->b(Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 114
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_actions:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, v6

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v6, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 115
    const-string v0, "\\d"

    sget v1, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_result_m:I

    invoke-static {p0, v0, v8, v1, v2}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v9

    .line 119
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_chart_kcals:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-float v2, v7

    invoke-static {v2}, Lo/bzr;->d(F)F

    move-result v2

    invoke-static {v2}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v7, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 120
    const-string v0, "\\d"

    sget v1, Lcom/huawei/health/suggestion/R$style;->sug_text_result_k:I

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_result_m:I

    invoke-static {p0, v0, v10, v1, v2}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v11

    .line 123
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->k:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->i:Lo/efy;

    invoke-virtual {v0, v11}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 125
    return-void
.end method

.method private h()V
    .locals 3

    .line 128
    new-instance v2, Lo/egv$b;

    invoke-direct {v2, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 129
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_title:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 130
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_content:I

    invoke-virtual {v2, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 131
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_ok:I

    new-instance v1, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 140
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_no:I

    new-instance v1, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 146
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->e:Lo/egv;

    .line 147
    return-void
.end method

.method private i()V
    .locals 3

    .line 164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 165
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V

    invoke-virtual {v0, v1}, Lo/btj;->a(Lo/bui;)V

    .line 189
    const-string v0, "planStatistics_need_refresh"

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/brt;->e(ILo/bui;)V

    .line 202
    return-void
.end method

.method private k()V
    .locals 3

    .line 206
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->a:Z

    if-eqz v0, :cond_0

    .line 207
    return-void

    .line 209
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->a:Z

    .line 210
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->b:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/btj;->a(Ljava/lang/String;Lo/bui;)V

    .line 230
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 86
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d()V

    .line 87
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_fitness_plan_join:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->setContentView(I)V

    .line 88
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->f()V

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->h()V

    .line 90
    const-string v0, "FINSH_ALL_KEY_ShowPlanActivity"

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lo/bxd;->e(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V

    .line 91
    return-void
.end method

.method public b()V
    .locals 4

    .line 65
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "PLAN_TEMP_ID_KEY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "PLAN_TEMP_ID_KEY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->b:Ljava/lang/String;

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TextUtils.isEmpty(mPlanTempId)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->finish()V

    .line 75
    :cond_1
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/btj;->c(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    .line 77
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->n:Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 78
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mFitnessPackageInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->finish()V

    .line 82
    :cond_2
    return-void
.end method

.method protected d()V
    .locals 3

    .line 235
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 238
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 239
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 242
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 245
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    const/high16 v2, 0x4000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 247
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    const/high16 v2, 0x8000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 250
    :cond_1
    return-void
.end method

.method public e()V
    .locals 4

    .line 151
    const-string v0, "Suggestion_FitnessPlanJoinActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->d:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 157
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->i()V

    goto :goto_0

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;->g:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_1

    .line 159
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onBackPressed()V

    .line 161
    :cond_1
    :goto_0
    return-void
.end method
