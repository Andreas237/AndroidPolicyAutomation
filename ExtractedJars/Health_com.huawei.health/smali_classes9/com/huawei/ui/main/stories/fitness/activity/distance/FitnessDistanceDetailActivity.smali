.class public Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:F

.field private e:Lo/ezf;

.field private l:Lo/ezf$c;

.field private m:Lo/ezf$c;

.field private n:Lo/ezf$c;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ezf$c;>;"
        }
    .end annotation
.end field

.field private p:Lo/ezf$c;

.field private t:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b:F

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->e:Lo/ezf;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->o:Ljava/util/List;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->n:Lo/ezf$c;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->m:Lo/ezf$c;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->p:Lo/ezf$c;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->l:Lo/ezf$c;

    .line 167
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->t:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;Lo/eih;Lo/eic;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b(Lo/eih;Lo/eic;)V

    return-void
.end method

.method private b(Lo/eih;Lo/eic;)V
    .locals 4

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->g:Lo/eyd;

    invoke-virtual {v0}, Lo/eyd;->a()Lo/eyu;

    move-result-object v3

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->m:Lo/ezf$c;

    sget-object v1, Lo/eiv;->b:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->n:Lo/ezf$c;

    sget-object v1, Lo/eiv;->a:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->p:Lo/ezf$c;

    sget-object v1, Lo/eiv;->e:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->l:Lo/ezf$c;

    sget-object v1, Lo/eiv;->d:Lo/eiv;

    .line 155
    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    sget-object v2, Lo/eiv;->b:Lo/eiv;

    .line 156
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    sget-object v2, Lo/eiv;->a:Lo/eiv;

    .line 157
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    sget-object v2, Lo/eiv;->e:Lo/eiv;

    .line 158
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    .line 154
    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->e:Lo/ezf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->o:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ezf;->a(Ljava/util/List;)V

    .line 160
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->t:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-object v0
.end method

.method public a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 220
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v7

    .line 221
    move-object v0, p0

    move-object v1, v7

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    .line 222
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    new-instance v4, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$5;

    invoke-direct {v4, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;)V

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_distance_data_title:I

    .line 236
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    .line 221
    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    return-object v7
.end method

.method public a(Landroid/content/Intent;)V
    .locals 4

    .line 85
    if-nez p1, :cond_0

    .line 86
    return-void

    .line 89
    :cond_0
    const-string v0, "today_current_distance_total"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 90
    const-string v0, "today_current_distance_total"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b:F

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b:F

    .line 92
    const v3, 0x3a83126f    # 0.001f

    .line 94
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v3, v0

    .line 97
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b:F

    mul-float/2addr v0, v3

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b:F

    .line 99
    :cond_2
    return-void
.end method

.method public b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 198
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 199
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    .line 200
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_distance_data_title:I

    .line 202
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    .line 199
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    return-object v6
.end method

.method public b()V
    .locals 2

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->d:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 128
    return-void
.end method

.method public c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 209
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 210
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    .line 211
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_distance_data_title:I

    .line 213
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    .line 210
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    return-object v6
.end method

.method public c()V
    .locals 0

    .line 133
    return-void
.end method

.method public d()V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->c:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->d(Lo/ezv;)V

    .line 147
    return-void
.end method

.method public d(Lo/ejf;)V
    .locals 2

    .line 112
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;)V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lo/ejf;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 121
    return-void
.end method

.method public e()Landroid/view/View;
    .locals 5

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->e:Lo/ezf;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->e:Lo/ezf;

    return-object v0

    .line 67
    :cond_0
    new-instance v0, Lo/ezf;

    invoke-direct {v0, p0}, Lo/ezf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->e:Lo/ezf;

    .line 68
    new-instance v0, Lo/ezf$g;

    const/16 v1, 0xff

    const/16 v2, 0x50

    const/16 v3, 0xe6

    const/16 v4, 0x50

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$g;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->n:Lo/ezf$c;

    .line 69
    new-instance v0, Lo/ezf$f;

    const/16 v1, 0xff

    const/16 v2, 0x4c

    const/16 v3, 0xd9

    const/16 v4, 0x4c

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$f;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->m:Lo/ezf$c;

    .line 70
    new-instance v0, Lo/ezf$a;

    const/16 v1, 0xff

    const/16 v2, 0x47

    const/16 v3, 0xcc

    const/16 v4, 0x47

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->p:Lo/ezf$c;

    .line 71
    new-instance v0, Lo/ezf$d;

    const/16 v1, 0xff

    const/16 v2, 0x43

    const/16 v3, 0xbf

    const/16 v4, 0x43

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$d;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->l:Lo/ezf$c;

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->n:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->m:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->p:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->l:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->e:Lo/ezf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->o:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ezf;->a(Ljava/util/List;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->e:Lo/ezf;

    return-object v0
.end method

.method public e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 176
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v5

    .line 177
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    .line 178
    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    .line 177
    invoke-virtual {p0, v5, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    invoke-virtual {v5}, Lo/ezh;->d()Lo/ezj;

    move-result-object v6

    .line 182
    instance-of v0, v6, Lo/ezr;

    if-nez v0, :cond_0

    .line 183
    return-object v5

    .line 185
    :cond_0
    move-object v0, v6

    check-cast v0, Lo/ezr;

    invoke-virtual {v0}, Lo/ezr;->d()Lo/ezj;

    move-result-object v7

    .line 186
    instance-of v0, v7, Lo/ezk;

    if-nez v0, :cond_1

    .line 187
    return-object v5

    .line 189
    :cond_1
    move-object v0, v7

    check-cast v0, Lo/ezk;

    new-instance v1, Lo/ezk$c;

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->b:F

    .line 191
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->i()Lo/ehy;

    move-result-object v3

    sget-object v4, Lo/eif;->b:Lo/eif;

    invoke-static {v3, v4}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v3

    const v4, 0x9c44

    invoke-direct {v1, p0, v2, v4, v3}, Lo/ezk$c;-><init>(Landroid/content/Context;FILo/eic;)V

    .line 189
    invoke-virtual {v0, v1}, Lo/ezk;->b(Lo/ezk$b;)V

    .line 193
    return-object v5
.end method

.method public f()V
    .locals 1

    .line 103
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    goto :goto_0

    .line 106
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;->a:Ljava/lang/String;

    .line 108
    :goto_0
    return-void
.end method

.method public i()Lo/ehy;
    .locals 1

    .line 243
    sget-object v0, Lo/ehy;->a:Lo/ehy;

    return-object v0
.end method
