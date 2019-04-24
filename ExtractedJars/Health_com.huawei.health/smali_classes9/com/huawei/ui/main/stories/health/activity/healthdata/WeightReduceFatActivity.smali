.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field protected b:Landroid/widget/RelativeLayout;

.field protected c:Landroid/support/v7/widget/RecyclerView;

.field protected d:Landroid/widget/RelativeLayout;

.field protected e:Landroid/support/v7/widget/RecyclerView;

.field private f:Z

.field private g:Landroid/widget/TextView;

.field private h:Lo/bxc;

.field private k:Lo/bwz;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->f:Z

    return-void
.end method

.method private a()V
    .locals 1

    .line 72
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
    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->f:Z

    .line 73
    return-void
.end method

.method private b()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation

    .line 94
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 95
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 97
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 98
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 100
    :cond_0
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessPlan is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :cond_1
    :goto_0
    return-object v4
.end method

.method private c()V
    .locals 6

    .line 141
    new-instance v0, Lo/bxc;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bxc;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->h:Lo/bxc;

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->h:Lo/bxc;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bxc;->e(Z)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->h:Lo/bxc;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->h:Lo/bxc;

    invoke-virtual {v0}, Lo/bxc;->notifyDataSetChanged()V

    .line 145
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasFitnessPlan :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->f:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->f:Z

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 155
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v4

    .line 156
    invoke-static {}, Lo/czu;->e()Z

    move-result v5

    .line 157
    const-string v0, "WeightReduceFatActivity"

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

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v5, :cond_2

    .line 159
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 163
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;Ljava/util/List;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 166
    move-object v4, p1

    .line 168
    if-eqz v4, :cond_5

    .line 169
    const-string v0, "WeightReduceFatActivity"

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

    .line 170
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->f:Z

    if-eqz v0, :cond_2

    .line 171
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 172
    const/4 v6, 0x0

    .line 173
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 174
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v6

    .line 176
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 177
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "info is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 179
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

    .line 180
    invoke-interface {v4, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 181
    goto :goto_1

    .line 178
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 187
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_4

    .line 188
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 191
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 194
    :goto_2
    new-instance v0, Lo/bwz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a:Landroid/content/Context;

    const/16 v2, 0x66

    invoke-direct {v0, v4, v2, v1}, Lo/bwz;-><init>(Ljava/util/List;ILandroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->k:Lo/bwz;

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->k:Lo/bwz;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwz;->b(Z)V

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->k:Lo/bwz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->k:Lo/bwz;

    invoke-virtual {v0}, Lo/bwz;->notifyDataSetChanged()V

    .line 199
    :cond_5
    return-void
.end method

.method private d()V
    .locals 7

    .line 108
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshFitnessView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
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
    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->f:Z

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 112
    :cond_1
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMyPlansRecyclerView or mFitnessPkgRecyclerView is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-void

    .line 116
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c()V

    .line 117
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 118
    const/4 v5, -0x1

    .line 119
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 120
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v5

    .line 122
    :cond_3
    const/4 v6, 0x1

    .line 123
    const-string v0, "WeightReduceFatActivity"

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

    .line 124
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;)V

    invoke-virtual {v0, v6, v5, v1}, Lo/btj;->c(IILo/bui;)V

    .line 138
    return-void
.end method

.method private e()V
    .locals 3

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->my_plans_rcy:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c:Landroid/support/v7/widget/RecyclerView;

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 83
    sget v0, Lcom/huawei/ui/main/R$id;->sug_myplans_ryt:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->b:Landroid/widget/RelativeLayout;

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->sug_fitness_pkg_rcy:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e:Landroid/support/v7/widget/RecyclerView;

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->sug_fitnessplan_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->d:Landroid/widget/RelativeLayout;

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->all_fitness_plans:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->g:Landroid/widget/TextView;

    .line 91
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 77
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 57
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 58
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a:Landroid/content/Context;

    .line 59
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_weight_reduce_fat:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->setContentView(I)V

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->a()V

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->e()V

    .line 62
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 66
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 67
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->d()V

    .line 69
    return-void
.end method
