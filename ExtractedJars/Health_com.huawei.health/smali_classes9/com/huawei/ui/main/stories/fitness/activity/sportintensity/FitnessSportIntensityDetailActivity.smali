.class public Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

.field private b:Lo/ewr;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;-><init>()V

    .line 49
    new-instance v0, Lo/ewr;

    invoke-direct {v0, p0}, Lo/ewr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b:Lo/ewr;

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->e:I

    .line 162
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->a:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)Lo/ewr;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b:Lo/ewr;

    return-object v0
.end method

.method private o()V
    .locals 6

    .line 98
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 99
    const-string v0, "event_manual_ui"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    :try_start_0
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    goto :goto_0

    .line 102
    :catch_0
    move-exception v5

    .line 103
    const-string v0, "Strength_FitnessTimeStrengthDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSportIntensitycalc"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :goto_0
    return-void
.end method

.method private u()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->c:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->d(Lo/ezv;)V

    .line 154
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->a:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-object v0
.end method

.method public a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 217
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v7

    .line 218
    move-object v0, p0

    move-object v1, v7

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_user_profile_achieve_sum:I

    .line 219
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 220
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$1;

    invoke-direct {v4, p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)V

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_daily_average_time:I

    .line 233
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 234
    invoke-virtual {p0, v6}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 218
    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->a(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    return-object v7
.end method

.method public a(Landroid/content/Intent;)V
    .locals 2

    .line 55
    if-nez p1, :cond_0

    .line 56
    return-void

    .line 59
    :cond_0
    const-string v0, "today_current_middle_and_high_total"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    const-string v0, "today_current_middle_and_high_total"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->e:I

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->e:I

    .line 62
    :cond_1
    return-void
.end method

.method public b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 195
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 196
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_user_profile_achieve_sum:I

    .line 197
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 198
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_step_strength_average:I

    .line 199
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 200
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 196
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    return-object v6
.end method

.method public b()V
    .locals 4

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->d:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_step_strength:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 241
    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v3

    .line 242
    if-eqz v3, :cond_0

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->d:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_info:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->d:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 206
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 207
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_user_profile_achieve_sum:I

    .line 208
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 209
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_step_strength_average:I

    .line 210
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 211
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 207
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    return-object v6
.end method

.method public c()V
    .locals 0

    .line 274
    return-void
.end method

.method public d(Lo/ejf;)V
    .locals 2

    .line 76
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 84
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 76
    invoke-interface {p1, v0, v1}, Lo/ejf;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method public e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 173
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v5

    .line 174
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    .line 175
    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_minutes:I

    .line 176
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 174
    invoke-virtual {p0, v5, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-virtual {v5}, Lo/ezh;->d()Lo/ezj;

    move-result-object v6

    .line 179
    instance-of v0, v6, Lo/ezr;

    if-nez v0, :cond_0

    .line 180
    return-object v5

    .line 182
    :cond_0
    move-object v0, v6

    check-cast v0, Lo/ezr;

    invoke-virtual {v0}, Lo/ezr;->d()Lo/ezj;

    move-result-object v7

    .line 183
    instance-of v0, v7, Lo/ezk;

    if-nez v0, :cond_1

    .line 184
    return-object v5

    .line 186
    :cond_1
    move-object v0, v7

    check-cast v0, Lo/ezk;

    new-instance v1, Lo/ezk$c;

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->e:I

    int-to-float v2, v2

    .line 188
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->i()Lo/ehy;

    move-result-object v3

    sget-object v4, Lo/eif;->b:Lo/eif;

    invoke-static {v3, v4}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    const v4, 0xb7fd

    invoke-direct {v1, p0, v2, v4, v3}, Lo/ezk$c;-><init>(Landroid/content/Context;FILo/eic;)V

    .line 186
    invoke-virtual {v0, v1}, Lo/ezk;->b(Lo/ezk$b;)V

    .line 190
    return-object v5
.end method

.method protected g()V
    .locals 10

    .line 108
    const-string v0, "Strength_FitnessTimeStrengthDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " requestDayData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v6

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->d(J)J

    move-result-wide v8

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b:Lo/ewr;

    move-wide v1, v6

    move-wide v3, v8

    const/4 v5, 0x3

    invoke-virtual/range {v0 .. v5}, Lo/ewr;->c(JJI)V

    .line 114
    return-void
.end method

.method public h()I
    .locals 1

    .line 265
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_time_strength_detail_layout:I

    return v0
.end method

.method public i()Lo/ehy;
    .locals 1

    .line 259
    sget-object v0, Lo/ehy;->g:Lo/ehy;

    return-object v0
.end method

.method public k()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b:Lo/ewr;

    invoke-virtual {v0, p0}, Lo/ewr;->a(Landroid/app/Activity;)V

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->u()V

    .line 92
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->g()V

    .line 94
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->o()V

    .line 95
    return-void
.end method

.method public l()Z
    .locals 1

    .line 270
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 66
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->onCreate(Landroid/os/Bundle;)V

    .line 67
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->g:Lo/eyd;

    invoke-virtual {v0}, Lo/eyd;->d()Lo/ejk;

    move-result-object v0

    check-cast v0, Lo/exy;

    check-cast v0, Lo/exy;

    .line 71
    invoke-virtual {v0, v1}, Lo/exy;->e(Ljava/util/List;)V

    .line 72
    return-void
.end method
