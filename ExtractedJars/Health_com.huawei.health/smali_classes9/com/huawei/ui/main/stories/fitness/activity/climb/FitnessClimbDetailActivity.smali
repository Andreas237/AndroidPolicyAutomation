.class public Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Ljava/lang/String;

.field private e:Landroid/widget/TextView;

.field private n:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a:F

    .line 136
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->n:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-void
.end method

.method private c(Lo/eih;Lo/eic;)V
    .locals 4

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->g:Lo/eyd;

    invoke-virtual {v0}, Lo/eyd;->a()Lo/eyu;

    move-result-object v1

    .line 233
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    invoke-interface {v1, p1, p2, v0}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    .line 234
    const-string v3, ""

    .line 235
    const/4 v0, 0x0

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_0

    invoke-static {}, Lo/czz;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 236
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_climb_isnot_support_floor_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 238
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_climb_is_support_floor_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 240
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 241
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;Lo/eih;Lo/eic;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->c(Lo/eih;Lo/eic;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->n:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-object v0
.end method

.method public a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 190
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v7

    .line 191
    move-object v0, p0

    move-object v1, v7

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_height_data_title:I

    .line 192
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    new-instance v4, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$4;

    invoke-direct {v4, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;)V

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_height_data_title:I

    .line 205
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    .line 191
    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    return-object v7
.end method

.method public a(Landroid/content/Intent;)V
    .locals 4

    .line 62
    if-nez p1, :cond_0

    .line 63
    return-void

    .line 66
    :cond_0
    const-string v0, "today_current_climb_total"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    const-string v0, "today_current_climb_total"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a:F

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a:F

    .line 69
    const v3, 0x3dcccccd    # 0.1f

    .line 71
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v3, v0

    .line 74
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a:F

    mul-float/2addr v0, v3

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a:F

    .line 77
    :cond_2
    return-void
.end method

.method public b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 172
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 173
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_height_data_title:I

    .line 174
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_height_data_title:I

    .line 175
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    .line 173
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    return-object v6
.end method

.method public b()V
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->d:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_climb_stairs_tip:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 84
    return-void
.end method

.method public c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 181
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 182
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_height_data_title:I

    .line 183
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_height_data_title:I

    .line 184
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    .line 182
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    return-object v6
.end method

.method public c()V
    .locals 0

    .line 87
    return-void
.end method

.method public d()V
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->c:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->d(Lo/ezv;)V

    .line 229
    return-void
.end method

.method public d(Lo/ejf;)V
    .locals 2

    .line 119
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;)V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lo/ejf;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 128
    return-void
.end method

.method public e()Landroid/view/View;
    .locals 9

    .line 91
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->climb_view_extension:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 93
    sget v0, Lcom/huawei/ui/main/R$id;->climb_floor_height_tips:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 94
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_one_story_equal_to_three_meters_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 95
    const-string v0, "3"

    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 96
    const-string v0, "10"

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 97
    const-string v0, "16"

    const-wide/high16 v1, 0x4030000000000000L    # 16.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 98
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    sget v0, Lcom/huawei/ui/main/R$id;->tv_explain:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->e:Landroid/widget/TextView;

    .line 101
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-static {}, Lo/czz;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 102
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_climb_isnot_support_floor_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    :cond_2
    return-object v5
.end method

.method public e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 150
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v5

    .line 151
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_height_data_title:I

    .line 152
    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    .line 151
    invoke-virtual {p0, v5, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    invoke-virtual {v5}, Lo/ezh;->d()Lo/ezj;

    move-result-object v6

    .line 156
    instance-of v0, v6, Lo/ezr;

    if-nez v0, :cond_0

    .line 157
    return-object v5

    .line 159
    :cond_0
    move-object v0, v6

    check-cast v0, Lo/ezr;

    invoke-virtual {v0}, Lo/ezr;->d()Lo/ezj;

    move-result-object v7

    .line 160
    instance-of v0, v7, Lo/ezk;

    if-nez v0, :cond_1

    .line 161
    return-object v5

    .line 163
    :cond_1
    move-object v0, v7

    check-cast v0, Lo/ezk;

    new-instance v1, Lo/ezk$c;

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->a:F

    .line 165
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->i()Lo/ehy;

    move-result-object v3

    sget-object v4, Lo/eif;->b:Lo/eif;

    invoke-static {v3, v4}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    const v4, 0x9c45

    invoke-direct {v1, p0, v2, v4, v3}, Lo/ezk$c;-><init>(Landroid/content/Context;FILo/eic;)V

    .line 163
    invoke-virtual {v0, v1}, Lo/ezk;->b(Lo/ezk$b;)V

    .line 167
    return-object v5
.end method

.method public f()V
    .locals 1

    .line 110
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    goto :goto_0

    .line 113
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;->b:Ljava/lang/String;

    .line 115
    :goto_0
    return-void
.end method

.method public i()Lo/ehy;
    .locals 1

    .line 211
    sget-object v0, Lo/ehy;->d:Lo/ehy;

    return-object v0
.end method
