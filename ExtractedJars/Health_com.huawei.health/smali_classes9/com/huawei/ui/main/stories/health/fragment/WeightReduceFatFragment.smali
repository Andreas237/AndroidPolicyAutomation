.class public Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected a:Landroid/widget/RelativeLayout;

.field private b:Landroid/view/View;

.field protected c:Landroid/support/v7/widget/RecyclerView;

.field protected d:Landroid/support/v7/widget/RecyclerView;

.field protected e:Landroid/widget/RelativeLayout;

.field private f:Z

.field private g:Lo/bxc;

.field private h:Lo/bwz;

.field private i:Landroid/widget/LinearLayout;

.field private k:Landroid/content/Context;

.field private l:Ljava/lang/String;

.field private m:Z

.field private p:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->f:Z

    .line 57
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->l:Ljava/lang/String;

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->m:Z

    return-void
.end method

.method private a()V
    .locals 3

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->my_plans_rcy:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d:Landroid/support/v7/widget/RecyclerView;

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sug_myplans_ryt:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->e:Landroid/widget/RelativeLayout;

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->my_plan_more_ll:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->i:Landroid/widget/LinearLayout;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sug_fitness_pkg_rcy:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->c:Landroid/support/v7/widget/RecyclerView;

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sug_fitnessplan_list:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->a:Landroid/widget/RelativeLayout;

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sug_fitnessplan_more_ll:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->p:Landroid/widget/LinearLayout;

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->i:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$3;-><init>(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->p:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$5;-><init>(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->l:Ljava/lang/String;

    return-object v0
.end method

.method private b()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation

    .line 116
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 117
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 119
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 120
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 122
    :cond_0
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessPlan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :cond_1
    :goto_0
    return-object v4
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 213
    move-object v4, p1

    .line 215
    if-eqz v4, :cond_5

    .line 216
    const-string v0, "WeightReduceFatFragment"

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

    .line 217
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->f:Z

    if-eqz v0, :cond_2

    .line 218
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 219
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PL0004"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PL1002"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    :cond_0
    invoke-interface {v4, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 223
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->l:Ljava/lang/String;

    .line 224
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->m:Z

    .line 218
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 229
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_4

    .line 230
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 232
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->a:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 234
    :goto_1
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRefreshPlan is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->m:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->m:Z

    if-eqz v0, :cond_5

    .line 236
    new-instance v0, Lo/bwz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    const/16 v2, 0x66

    invoke-direct {v0, v4, v2, v1}, Lo/bwz;-><init>(Ljava/util/List;ILandroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->h:Lo/bwz;

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->h:Lo/bwz;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwz;->b(Z)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->h:Lo/bwz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->h:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->notifyDataSetChanged()V

    .line 242
    :cond_5
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->m:Z

    return p1
.end method

.method private c()V
    .locals 3

    .line 107
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 109
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->l:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 1

    .line 112
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->f:Z

    .line 113
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;Ljava/util/List;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b(Ljava/util/List;)V

    return-void
.end method

.method private e()V
    .locals 7

    .line 130
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshFitnessView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->f:Z

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 134
    :cond_1
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMyPlansRecyclerView or mFitnessPkgRecyclerView is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 138
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->f()V

    .line 139
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 140
    const/4 v5, -0x1

    .line 141
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 142
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v5

    .line 144
    :cond_3
    const/4 v0, 0x1

    if-eq v5, v0, :cond_4

    if-eqz v5, :cond_4

    .line 145
    const/4 v5, 0x0

    .line 147
    :cond_4
    const/4 v6, 0x1

    .line 148
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sexType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;-><init>(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)V

    invoke-virtual {v0, v6, v5, v1}, Lo/btj;->c(IILo/bui;)V

    .line 186
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->c()V

    return-void
.end method

.method private f()V
    .locals 6

    .line 191
    new-instance v0, Lo/bxc;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bxc;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->g:Lo/bxc;

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->g:Lo/bxc;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bxc;->e(Z)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->g:Lo/bxc;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->g:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->notifyDataSetChanged()V

    .line 195
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasFitnessPlan :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->f:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->f:Z

    if-nez v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->e:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 203
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v4

    .line 204
    invoke-static {}, Lo/czu;->e()Z

    move-result v5

    .line 205
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isChineseSimplified is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; isOversea is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    if-eqz v4, :cond_1

    if-eqz v5, :cond_2

    .line 207
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 210
    :cond_2
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 61
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 62
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 67
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->k:Landroid/content/Context;

    .line 68
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_weight_reduce_fat:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d()V

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->a()V

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onResume()V
    .locals 4

    .line 76
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 77
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->e()V

    .line 79
    return-void
.end method
