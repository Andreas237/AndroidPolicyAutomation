.class public Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/bwx$e;


# static fields
.field private static d:I

.field private static e:I


# instance fields
.field private a:Lo/bwx;

.field private b:I

.field private c:Lcom/huawei/health/suggestion/model/Plan;

.field private f:Lo/egw;

.field private g:Lo/bww;

.field private h:Landroid/widget/LinearLayout;

.field private i:Z

.field private k:Lo/egw;

.field private o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 66
    const/16 v0, -0x194

    sput v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->e:I

    .line 67
    const v0, 0x30d53

    sput v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    .line 79
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->o:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->h:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Lo/egw;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k:Lo/egw;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    .line 498
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->l()V

    .line 500
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 501
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btj;->d(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v4

    .line 502
    if-nez v4, :cond_0

    .line 503
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planRecord is null and planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    return-void

    .line 507
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutTimes()I

    move-result v0

    if-lez v0, :cond_1

    .line 508
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 509
    const-string v0, "plan"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 510
    const-string v0, "finish_plan"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 511
    invoke-virtual {p0, v5}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->startActivity(Landroid/content/Intent;)V

    .line 514
    :cond_1
    goto :goto_0

    .line 515
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/bsp;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v4

    .line 516
    if-nez v4, :cond_3

    .line 517
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PlanRecord is null when planId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    return-void

    .line 521
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutTimes()I

    move-result v0

    if-eqz v0, :cond_4

    .line 522
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/TrainReportActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 523
    const-string v0, "plan"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 524
    const-string v0, "finish_plan"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 525
    invoke-virtual {p0, v5}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->startActivity(Landroid/content/Intent;)V

    .line 528
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    .line 534
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 535
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 536
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_notify:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 537
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_yes:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$7;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 538
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 545
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 547
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d()I
    .locals 1

    .line 51
    sget v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->e:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->n()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c(I)V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 277
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 278
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toShowDialog data == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    return-void

    .line 282
    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 283
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 284
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v6

    .line 285
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toShowDialog workDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->p()Z

    move-result v0

    if-nez v0, :cond_1

    .line 287
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toShowDialog show dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 282
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 291
    :cond_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Lo/egw;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f:Lo/egw;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;Ljava/util/List;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d(Ljava/util/List;)V

    return-void
.end method

.method private f()V
    .locals 6

    .line 139
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_run_dialog_post_data:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 140
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_dialog_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/efy;

    .line 141
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_finish_current_plan:I

    invoke-virtual {v4, v0}, Lo/efy;->setText(I)V

    .line 142
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_privacy_dialog_box:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    .line 143
    new-instance v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$8;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 158
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 159
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_settings_button_cancal_ios_btn:I

    .line 160
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$12;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$12;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_finish_plan:I

    .line 165
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$15;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$15;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 171
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f:Lo/egw;

    .line 172
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCanceledOnTouchOutside(Z)V

    .line 173
    return-void
.end method

.method private g()V
    .locals 12

    .line 201
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanFinishDialog dialog is showing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    return-void

    .line 206
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 207
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "runplanfinish"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 208
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "fitnessplanfinish"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 209
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v1, v0, :cond_1

    const-string v0, "true"

    .line 210
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanFinishDialog user has click not remind for run plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    return-void

    .line 213
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v1, v0, :cond_2

    const-string v0, "true"

    .line 214
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 215
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanFinishDialog user has click not remind for fitness plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-void

    .line 219
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-static {v0}, Lo/bxn;->e(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List;

    move-result-object v6

    .line 222
    const/4 v8, 0x0

    .line 223
    const/4 v9, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 224
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/bxt;

    .line 225
    invoke-virtual {v10}, Lo/bxt;->c()Lo/bxv;

    move-result-object v11

    .line 226
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    invoke-virtual {v11}, Lo/bxv;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 227
    invoke-virtual {v11}, Lo/bxv;->a()I

    move-result v0

    if-le v0, v8, :cond_3

    .line 228
    invoke-virtual {v11}, Lo/bxv;->a()I

    move-result v8

    .line 229
    move-object v7, v11

    .line 230
    invoke-virtual {v7}, Lo/bxv;->e()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->o:Ljava/lang/String;

    .line 231
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showPlanFinishDialog mLastWorkDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 236
    :cond_4
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$13;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$13;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->i(Ljava/lang/String;Lo/bui;)Ljava/util/List;

    move-result-object v9

    .line 249
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v1, v0, :cond_5

    .line 250
    invoke-direct {p0, v9}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d(Ljava/util/List;)V

    .line 253
    :cond_5
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->r()V

    return-void
.end method

.method static synthetic h()I
    .locals 1

    .line 51
    sget v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->d:I

    return v0
.end method

.method private i()V
    .locals 6

    .line 101
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_run_dialog_post_data:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 102
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_dialog_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/efy;

    .line 103
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_finish_overdue_current_plan:I

    invoke-virtual {v4, v0}, Lo/efy;->setText(I)V

    .line 104
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_privacy_dialog_box:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    .line 105
    new-instance v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 120
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 121
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_settings_button_cancal_ios_btn:I

    .line 122
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$9;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_finish_plan:I

    .line 127
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$6;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k:Lo/egw;

    .line 134
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCanceledOnTouchOutside(Z)V

    .line 135
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->u()V

    return-void
.end method

.method private k()V
    .locals 6

    .line 176
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanOverdueDialog dialog is showing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    return-void

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 181
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "runplanoverdue"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 182
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "fitnessplanoverdue"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 183
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v1, v0, :cond_1

    const-string v0, "true"

    .line 184
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanOverdueDialog user has click not remind for run plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v1, v0, :cond_2

    const-string v0, "true"

    .line 188
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanOverdueDialog user has click not remind for fitness plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    return-void

    .line 192
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 193
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanOverdueDialog expired dialog show"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 195
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanOverdueDialog isShowing = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f:Lo/egw;

    invoke-virtual {v2}, Lo/egw;->isShowing()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    :cond_3
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->t()V

    return-void
.end method

.method private l()V
    .locals 2

    .line 270
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "fitnessplanfinish"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteSharedPreference(Ljava/lang/String;)I

    .line 271
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "fitnessplanoverdue"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteSharedPreference(Ljava/lang/String;)I

    .line 272
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "runplanfinish"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteSharedPreference(Ljava/lang/String;)I

    .line 273
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "runplanoverdue"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteSharedPreference(Ljava/lang/String;)I

    .line 274
    return-void
.end method

.method private m()V
    .locals 5

    .line 370
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 371
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_notify:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_no_plan:I

    .line 372
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_yes:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 373
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 379
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 380
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 381
    new-instance v0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v4, v0}, Lo/egv;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 387
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 388
    return-void
.end method

.method private n()V
    .locals 3

    .line 394
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v2

    .line 395
    if-eqz v2, :cond_1

    .line 397
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 398
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 399
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    invoke-virtual {v0, v1}, Lo/btj;->a(Lo/bui;)V

    goto :goto_0

    .line 443
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;Ljava/lang/String;)V

    invoke-interface {v0, v2, v1}, Lo/bsp;->e(Ljava/lang/String;Lo/bui;)V

    .line 464
    :cond_1
    :goto_0
    return-void
.end method

.method private o()V
    .locals 5

    .line 256
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-nez v0, :cond_0

    .line 257
    return-void

    .line 259
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v4

    .line 260
    if-nez v4, :cond_1

    .line 261
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planProgress is null when planId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    return-void

    .line 264
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutDays()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 265
    invoke-static {p0}, Lo/fje;->e(Landroid/content/Context;)Lo/fje;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/fje;->a(Landroid/content/Context;)V

    .line 267
    :cond_2
    return-void
.end method

.method private p()Z
    .locals 4

    .line 299
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-nez v0, :cond_0

    .line 300
    const/4 v0, 0x0

    return v0

    .line 302
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/cap;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/huawei/health/suggestion/model/fitness/TimeUtil;->getCurrentDayZeroTimeStamp(J)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 303
    const/4 v0, 0x1

    return v0

    .line 305
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private q()Lcom/huawei/health/suggestion/model/Plan;
    .locals 4

    .line 550
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 551
    const/4 v3, 0x0

    .line 552
    if-eqz v2, :cond_0

    .line 553
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "plan"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/suggestion/model/Plan;

    .line 555
    :cond_0
    if-nez v3, :cond_1

    .line 556
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v3

    .line 558
    :cond_1
    return-object v3
.end method

.method private r()V
    .locals 2

    .line 494
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bzm;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    return-void
.end method

.method private t()V
    .locals 3

    .line 467
    const-string v0, "planStatistics_need_refresh"

    const-string v1, "true"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 468
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$10;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/brt;->e(ILo/bui;)V

    .line 479
    return-void
.end method

.method private u()V
    .locals 3

    .line 482
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 483
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 484
    if-eqz v1, :cond_0

    .line 485
    invoke-interface {v1}, Lo/brr;->e()Lo/brv;

    move-result-object v2

    .line 486
    if-eqz v2, :cond_0

    .line 487
    invoke-interface {v2}, Lo/brv;->e()V

    .line 491
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 318
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLayout enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_run_activity_show_plan_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->setContentView(I)V

    .line 320
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_ll_create_progress:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->h:Landroid/widget/LinearLayout;

    .line 321
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_frag_progress:I

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentById(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lo/bwx;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->a:Lo/bwx;

    .line 322
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_frag_content:I

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentById(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lo/bww;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->g:Lo/bww;

    .line 324
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->a:Lo/bwx;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    iget v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->b:I

    invoke-virtual {v0, v1, v2}, Lo/bwx;->d(Lcom/huawei/health/suggestion/model/Plan;I)V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->g:Lo/bww;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0, v1}, Lo/bww;->d(Lcom/huawei/health/suggestion/model/Plan;)V

    goto :goto_0

    .line 328
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->m()V

    .line 330
    :goto_0
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLayout end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    return-void
.end method

.method public b()V
    .locals 5

    .line 83
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const-string v0, "FINSH_ALL_KEY_ShowPlanActivity"

    invoke-static {v0}, Lo/bxd;->b(Ljava/lang/String;)V

    .line 85
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->q()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    .line 86
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_1

    .line 87
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 88
    if-eqz v4, :cond_0

    .line 89
    const-string v0, "new_plan"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->i:Z

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxz;->e(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->b:I

    .line 94
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f()V

    .line 95
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->i()V

    .line 97
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void
.end method

.method public c()V
    .locals 7

    .line 345
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_request_finish_dialog:I

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 346
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_request_finish_dialog_tv:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/efy;

    .line 347
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->a:Lo/bwx;

    invoke-virtual {v1}, Lo/bwx;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_request_finish_uncompleted_plan:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_request_finish_completed_plan:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 348
    new-instance v6, Lo/egw$c;

    invoke-direct {v6, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 349
    invoke-virtual {v6, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$14;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 350
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_finish:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$11;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V

    .line 355
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 361
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 362
    return-void
.end method

.method public e()V
    .locals 4

    .line 335
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->a:Lo/bwx;

    invoke-virtual {v0, p0}, Lo/bwx;->b(Lo/bwx$e;)V

    .line 339
    :cond_0
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 366
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onBackPressed()V

    .line 367
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 310
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onResume()V

    .line 311
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->k()V

    .line 312
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->g()V

    .line 313
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->o()V

    .line 314
    return-void
.end method
