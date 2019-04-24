.class public Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ezf$c;>;"
        }
    .end annotation
.end field

.field private e:Lo/ezf;

.field private l:Lo/ezf$c;

.field private m:Lo/ezf$c;

.field private n:Lo/ezf$c;

.field private o:Lo/ezf$c;

.field private p:Lo/ezf$c;

.field private t:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a:F

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e:Lo/ezf;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->n:Lo/ezf$c;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->o:Lo/ezf$c;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->m:Lo/ezf$c;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->p:Lo/ezf$c;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->l:Lo/ezf$c;

    .line 157
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->t:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;Lo/eih;Lo/eic;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->d(Lo/eih;Lo/eic;)V

    return-void
.end method

.method private d(Lo/eih;Lo/eic;)V
    .locals 4

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->g:Lo/eyd;

    invoke-virtual {v0}, Lo/eyd;->a()Lo/eyu;

    move-result-object v3

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->o:Lo/ezf$c;

    sget-object v1, Lo/eiv;->b:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->n:Lo/ezf$c;

    sget-object v1, Lo/eiv;->a:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->m:Lo/ezf$c;

    sget-object v1, Lo/eiv;->c:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->p:Lo/ezf$c;

    sget-object v1, Lo/eiv;->e:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->l:Lo/ezf$c;

    sget-object v1, Lo/eiv;->d:Lo/eiv;

    .line 131
    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    sget-object v2, Lo/eiv;->b:Lo/eiv;

    .line 132
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    sget-object v2, Lo/eiv;->a:Lo/eiv;

    .line 133
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    sget-object v2, Lo/eiv;->c:Lo/eiv;

    .line 134
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    sget-object v2, Lo/eiv;->e:Lo/eiv;

    .line 135
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    .line 130
    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e:Lo/ezf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ezf;->a(Ljava/util/List;)V

    .line 137
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->t:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-object v0
.end method

.method public a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 214
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v7

    .line 215
    move-object v0, p0

    move-object v1, v7

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_calorie_data_title:I

    .line 216
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 217
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$4;

    invoke-direct {v4, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;)V

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_calorie_data_title:I

    .line 230
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 231
    invoke-virtual {p0, v6}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 215
    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    return-object v7
.end method

.method public a(Landroid/content/Intent;)V
    .locals 2

    .line 86
    if-nez p1, :cond_0

    .line 87
    return-void

    .line 90
    :cond_0
    const-string v0, "today_current_colories_total"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    const-string v0, "today_current_colories_total"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a:F

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a:F

    .line 93
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a:F

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a:F

    .line 95
    :cond_1
    return-void
.end method

.method public b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 192
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 193
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_calorie_data_title:I

    .line 194
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 195
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_calorie_data_title:I

    .line 196
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 197
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 193
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    return-object v6
.end method

.method public b()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->d:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 103
    return-void
.end method

.method public c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 203
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 204
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_calorie_data_title:I

    .line 205
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 206
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_calorie_data_title:I

    .line 207
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 208
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 204
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    return-object v6
.end method

.method public c()V
    .locals 0

    .line 108
    return-void
.end method

.method public d()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->c:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->d(Lo/ezv;)V

    .line 122
    return-void
.end method

.method public d(Lo/ejf;)V
    .locals 2

    .line 141
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 149
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 141
    invoke-interface {p1, v0, v1}, Lo/ejf;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 150
    return-void
.end method

.method public e()Landroid/view/View;
    .locals 5

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e:Lo/ezf;

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e:Lo/ezf;

    return-object v0

    .line 66
    :cond_0
    new-instance v0, Lo/ezf;

    invoke-direct {v0, p0}, Lo/ezf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e:Lo/ezf;

    .line 67
    new-instance v0, Lo/ezf$g;

    const/16 v1, 0xff

    const/16 v2, 0xfb

    const/16 v3, 0xb1

    const/16 v4, 0x50

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$g;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->n:Lo/ezf$c;

    .line 68
    new-instance v0, Lo/ezf$f;

    const/16 v1, 0xff

    const/16 v2, 0xf8

    const/16 v3, 0x93

    const/16 v4, 0x3b

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$f;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->o:Lo/ezf$c;

    .line 69
    new-instance v0, Lo/ezf$e;

    const/16 v1, 0xff

    const/16 v2, 0xf4

    const/16 v3, 0x72

    const/16 v4, 0x23

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$e;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->m:Lo/ezf$c;

    .line 70
    new-instance v0, Lo/ezf$a;

    const/16 v1, 0xff

    const/16 v2, 0xf1

    const/16 v3, 0x56

    const/16 v4, 0xf

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->p:Lo/ezf$c;

    .line 71
    new-instance v0, Lo/ezf$d;

    const/16 v1, 0xff

    const/16 v2, 0xdd

    const/16 v3, 0x4a

    const/4 v4, 0x7

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$d;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->l:Lo/ezf$c;

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->n:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->o:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->m:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->p:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->l:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e:Lo/ezf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ezf;->a(Ljava/util/List;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e:Lo/ezf;

    return-object v0
.end method

.method public e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 9

    .line 170
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v5

    .line 171
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_calorie_data_title:I

    .line 172
    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    .line 173
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 171
    invoke-virtual {p0, v5, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->e(Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    invoke-virtual {v5}, Lo/ezh;->d()Lo/ezj;

    move-result-object v6

    .line 177
    move-object v0, v6

    check-cast v0, Lo/eyt;

    invoke-virtual {v0}, Lo/eyt;->d_()Lo/ezj;

    move-result-object v7

    .line 178
    move-object v0, v7

    check-cast v0, Lo/ezk;

    new-instance v1, Lo/ezk$c;

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a:F

    .line 180
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->i()Lo/ehy;

    move-result-object v3

    sget-object v4, Lo/eif;->b:Lo/eif;

    invoke-static {v3, v4}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    const v4, 0x9c43

    invoke-direct {v1, p0, v2, v4, v3}, Lo/ezk$c;-><init>(Landroid/content/Context;FILo/eic;)V

    .line 178
    invoke-virtual {v0, v1}, Lo/ezk;->b(Lo/ezk$b;)V

    .line 182
    move-object v0, v6

    check-cast v0, Lo/eyt;

    invoke-virtual {v0}, Lo/eyt;->a()Lo/ezj;

    move-result-object v8

    .line 183
    move-object v0, v8

    check-cast v0, Lo/evx;

    new-instance v1, Lo/ezk$c;

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->a:F

    .line 185
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;->i()Lo/ehy;

    move-result-object v3

    sget-object v4, Lo/eif;->b:Lo/eif;

    invoke-static {v3, v4}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    const v4, 0x9c43

    invoke-direct {v1, p0, v2, v4, v3}, Lo/ezk$c;-><init>(Landroid/content/Context;FILo/eic;)V

    .line 183
    invoke-virtual {v0, v1}, Lo/evx;->b(Lo/ezk$b;)V

    .line 187
    return-object v5
.end method

.method public i()Lo/ehy;
    .locals 1

    .line 237
    sget-object v0, Lo/ehy;->c:Lo/ehy;

    return-object v0
.end method
