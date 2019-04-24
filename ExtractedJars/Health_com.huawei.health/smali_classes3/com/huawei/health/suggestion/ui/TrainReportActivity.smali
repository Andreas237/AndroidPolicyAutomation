.class public Lcom/huawei/health/suggestion/ui/TrainReportActivity;
.super Lcom/huawei/health/suggestion/ui/BaseCloudActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/health/suggestion/model/PlanRecord;

.field private b:Landroid/support/v7/widget/RecyclerView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Lcom/huawei/health/suggestion/model/Plan;

.field private e:Lcom/huawei/health/suggestion/model/PlanStat;

.field private f:Z

.field private h:Lo/emr;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 3

    .line 89
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    .line 91
    if-nez v2, :cond_0

    .line 92
    new-instance v2, Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/Plan;-><init>()V

    .line 93
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_no_plan:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/Plan;->putName(Ljava/lang/String;)V

    .line 95
    :cond_0
    return-object v2
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/TrainReportActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->i:Ljava/util/List;

    return-object p1
.end method

.method private f()V
    .locals 7

    .line 190
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 191
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 193
    :try_start_0
    iget-object v6, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->a:Lcom/huawei/health/suggestion/model/PlanRecord;

    .line 194
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 195
    new-instance v6, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/PlanRecord;-><init>()V

    .line 197
    :cond_0
    const-string v0, "type"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 200
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    const-string v0, "finish_rate"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    const-string v0, "highest_complete_rate"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->e:Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanStat;->getHighestCompleteRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 207
    :cond_1
    const-string v0, "data"

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    const-string v0, "1120010"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    goto :goto_0

    .line 209
    :catch_0
    move-exception v6

    .line 210
    const-string v0, "TrainReportActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :goto_0
    return-void
.end method

.method private k()V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 183
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->m()V

    goto :goto_0

    .line 185
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->f()V

    .line 187
    :goto_0
    return-void
.end method

.method private m()V
    .locals 7

    .line 215
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 216
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 218
    :try_start_0
    iget-object v6, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->a:Lcom/huawei/health/suggestion/model/PlanRecord;

    .line 219
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 220
    new-instance v6, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/PlanRecord;-><init>()V

    .line 222
    :cond_0
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    const-string v0, "finish_rate"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    :cond_1
    const-string v0, "type"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 251
    const-string v0, "data"

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    const-string v0, "1120010"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    goto :goto_0

    .line 253
    :catch_0
    move-exception v6

    .line 254
    const-string v0, "TrainReportActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    :goto_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 5

    .line 129
    :try_start_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->e(I)Lo/bui;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->i(Ljava/lang/String;Lo/bui;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->i:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    goto :goto_0

    .line 130
    :catch_0
    move-exception v4

    .line 131
    const-string v0, "TrainReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCloudData failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->finish()V

    .line 135
    :goto_0
    return-void
.end method

.method protected b()V
    .locals 2

    .line 100
    new-instance v0, Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;-><init>(Lcom/huawei/health/suggestion/ui/TrainReportActivity;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->e(ILo/bui;)V

    .line 101
    return-void
.end method

.method protected c()V
    .locals 1

    .line 63
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_train_report:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->setContentView(I)V

    .line 64
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_ll_load:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->c:Landroid/widget/LinearLayout;

    .line 65
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rcv_report:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->b:Landroid/support/v7/widget/RecyclerView;

    .line 66
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_titleBar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->h:Lo/emr;

    .line 67
    return-void
.end method

.method protected d()V
    .locals 2

    .line 71
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "plan"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 73
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "plan"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    if-nez v0, :cond_1

    .line 77
    invoke-static {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->c(Landroid/content/Context;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    .line 79
    :cond_1
    return-void
.end method

.method public finish()V
    .locals 1

    .line 260
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->finish()V

    .line 262
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->f:Z

    .line 267
    return-void
.end method

.method public g()V
    .locals 5

    .line 163
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->h:Lo/emr;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_report_t:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->h:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 167
    return-void
.end method

.method protected h()V
    .locals 5

    .line 139
    const-string v0, "TrainReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLoaclData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 141
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "finish_plan"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->f:Z

    .line 143
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v4

    .line 144
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 145
    const-string v0, "TrainReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLoaclData null == userinfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->finish()V

    .line 147
    return-void

    .line 150
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 151
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btm;->c(FLjava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->e:Lcom/huawei/health/suggestion/model/PlanStat;

    .line 152
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btj;->d(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->a:Lcom/huawei/health/suggestion/model/PlanRecord;

    goto :goto_0

    .line 154
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->h(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->e:Lcom/huawei/health/suggestion/model/PlanStat;

    .line 155
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->a:Lcom/huawei/health/suggestion/model/PlanRecord;

    .line 158
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->k()V

    .line 159
    return-void
.end method

.method public i()V
    .locals 7

    .line 171
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->e:Lcom/huawei/health/suggestion/model/PlanStat;

    if-nez v0, :cond_1

    .line 175
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->finish()V

    .line 176
    return-void

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lo/bxg;

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d:Lcom/huawei/health/suggestion/model/Plan;

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->e:Lcom/huawei/health/suggestion/model/PlanStat;

    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->a:Lcom/huawei/health/suggestion/model/PlanRecord;

    iget-object v6, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->i:Ljava/util/List;

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lo/bxg;-><init>(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;Lcom/huawei/health/suggestion/model/PlanRecord;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 179
    return-void
.end method
