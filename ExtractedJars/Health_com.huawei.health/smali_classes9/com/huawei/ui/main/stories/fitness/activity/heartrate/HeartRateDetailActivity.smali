.class public Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/ui/commonui/base/BaseActivity;"
    }
.end annotation


# instance fields
.field protected a:Lo/eyk;

.field private b:Lo/eya;

.field protected c:Lo/eyl;

.field protected d:Lo/exw;

.field protected e:Lo/faa;

.field private f:Ljava/lang/String;

.field private g:Lo/emr;

.field private h:Ljava/lang/String;

.field private i:Landroid/widget/LinearLayout;

.field private k:Ljava/lang/String;

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)Lo/eya;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->i:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 97
    sget v0, Lcom/huawei/ui/main/R$id;->classified_button_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyl;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->c:Lo/eyl;

    .line 98
    sget v0, Lcom/huawei/ui/main/R$id;->classified_view_place:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/faa;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->e:Lo/faa;

    .line 99
    new-instance v0, Lo/eyk;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->c:Lo/eyl;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->e:Lo/faa;

    invoke-direct {v0, p0, v1, v2}, Lo/eyk;-><init>(Landroid/content/Context;Lo/eyl;Lo/faa;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->a:Lo/eyk;

    .line 100
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g:Lo/emr;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->flightmode_active:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->heart_rate_extension:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->i:Landroid/widget/LinearLayout;

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/eya;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/exw;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 127
    return-void
.end method

.method private i()V
    .locals 1

    .line 88
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    .line 89
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_heartrate_range:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->k:Ljava/lang/String;

    .line 90
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_avg_rest_heartrate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->f:Ljava/lang/String;

    .line 91
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_heartrate_raise_remind:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->o:Ljava/lang/String;

    .line 92
    return-void
.end method


# virtual methods
.method protected a()Lo/ezh;
    .locals 11

    .line 365
    new-instance v9, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$11;

    invoke-direct {v9, p0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$11;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;Landroid/app/Activity;)V

    .line 372
    const-string v0, "normal_hr"

    invoke-virtual {v9, v0}, Lo/ezp;->c(Ljava/lang/String;)V

    .line 374
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->a:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v10

    .line 375
    invoke-virtual {v9, v10}, Lo/ezp;->setStepDatatype(Lo/eic;)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v9, v0}, Lo/ezp;->setHighlightedEntryParser(Lo/eyp;)V

    .line 377
    const-string v0, "normal_hr"

    invoke-virtual {v9, v0}, Lo/ezp;->c(Ljava/lang/String;)V

    .line 379
    move-object v0, p0

    move-object v1, v9

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->k:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->o:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 389
    return-object v9
.end method

.method protected b()V
    .locals 3

    .line 149
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 151
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->e()Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->a()Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d()Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->f()Lo/ezh;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->a:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$8;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;Ljava/util/List;)V

    invoke-virtual {v0, v2, v1}, Lo/eyk;->c(Ljava/util/List;Lo/eyk$c;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->a:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$7;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->setOnClassifiedViewChangeListener(Lo/eyk$b;)V

    .line 194
    return-void
.end method

.method protected c()I
    .locals 1

    .line 131
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_heart_rate_detail:I

    return v0
.end method

.method protected c(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lo/ezh;>(TT;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V"
        }
    .end annotation

    .line 202
    new-instance v2, Lo/eyo;

    invoke-direct {v2, p0, p1}, Lo/eyo;-><init>(Landroid/content/Context;Lo/ezh;)V

    .line 204
    invoke-virtual {v2}, Lo/eyo;->d()Landroid/view/View;

    move-result-object v3

    .line 205
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 207
    invoke-virtual {v2}, Lo/eyo;->a()Landroid/view/View;

    move-result-object v4

    .line 208
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 210
    new-instance v5, Lo/ezl;

    invoke-direct {v5, p0, p1, p2, p3}, Lo/ezl;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    new-instance v6, Lo/ezn;

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    invoke-direct {v6, p0, p1, v0, v1}, Lo/ezn;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    new-instance v7, Lo/ezm;

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    invoke-direct {v7, p0, p1, v0, v1}, Lo/ezm;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$6;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V

    invoke-virtual {v2, v0}, Lo/eyo;->a(Lo/ezi$i;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    invoke-virtual {v0}, Lo/eya;->b()Lo/eyv;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/ezn;->c(Lo/eyv;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    invoke-virtual {v0}, Lo/eya;->e()Lo/eyv;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ezm;->c(Lo/eyv;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    invoke-virtual {v0}, Lo/eya;->c()Lo/eyv;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ezm;->e(Lo/eyv;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    invoke-virtual {v7, v0}, Lo/ezm;->a(Lo/ezx;)V

    .line 240
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 241
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 243
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    new-instance v10, Lo/ehe$a;

    invoke-direct {v10}, Lo/ehe$a;-><init>()V

    .line 248
    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 249
    const-string v0, "rest_hr"

    invoke-virtual {v10, v0}, Lo/ehe$a;->a(Ljava/lang/String;)Lo/ehe$a;

    .line 251
    new-instance v11, Lo/ehe$a;

    invoke-direct {v11}, Lo/ehe$a;-><init>()V

    .line 252
    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 253
    const-string v0, "warning_hr"

    invoke-virtual {v11, v0}, Lo/ehe$a;->a(Ljava/lang/String;)Lo/ehe$a;

    .line 255
    sget-object v0, Lo/ezi;->c:Lo/ehe$a;

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    move/from16 v0, p8

    invoke-virtual {v2, v8, v9, v0}, Lo/eyo;->b(Ljava/util/List;Ljava/util/List;Z)V

    .line 262
    invoke-virtual {p1, v2}, Lo/ezh;->b(Lo/ezj;)V

    .line 263
    return-void
.end method

.method protected d()Lo/ezh;
    .locals 11

    .line 394
    new-instance v9, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$1;

    invoke-direct {v9, p0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;Landroid/app/Activity;)V

    .line 400
    const-string v0, "normal_hr"

    invoke-virtual {v9, v0}, Lo/ezc;->c(Ljava/lang/String;)V

    .line 402
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->c:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v10

    .line 403
    invoke-virtual {v9, v10}, Lo/ezc;->setStepDatatype(Lo/eic;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v9, v0}, Lo/ezc;->setHighlightedEntryParser(Lo/eyp;)V

    .line 405
    const-string v0, "normal_hr"

    invoke-virtual {v9, v0}, Lo/ezc;->c(Ljava/lang/String;)V

    .line 407
    move-object v0, p0

    move-object v1, v9

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->k:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->o:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 417
    return-object v9
.end method

.method protected d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lo/ezh;>(TT;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V"
        }
    .end annotation

    .line 271
    new-instance v2, Lo/ezi;

    invoke-direct {v2, p0, p1}, Lo/ezi;-><init>(Landroid/content/Context;Lo/ezh;)V

    .line 273
    invoke-virtual {v2}, Lo/ezi;->d()Landroid/view/View;

    move-result-object v3

    .line 274
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 276
    invoke-virtual {v2}, Lo/ezi;->a()Landroid/view/View;

    move-result-object v4

    .line 277
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 279
    new-instance v5, Lo/ezl;

    invoke-direct {v5, p0, p1, p2, p3}, Lo/ezl;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    new-instance v6, Lo/ezn;

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    invoke-direct {v6, p0, p1, v0, v1}, Lo/ezn;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    new-instance v7, Lo/ezm;

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    invoke-direct {v7, p0, p1, v0, v1}, Lo/ezm;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v0}, Lo/exw;->a()Lo/eyv;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/ezl;->d(Lo/eyv;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v0}, Lo/exw;->e()Lo/eyv;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/ezl;->b(Lo/eyv;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v0}, Lo/exw;->c()Lo/eyv;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/ezn;->c(Lo/eyv;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v0}, Lo/exw;->b()Lo/eyv;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ezm;->c(Lo/eyv;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v0}, Lo/exw;->g()Lo/eyv;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ezm;->e(Lo/eyv;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v7, v0}, Lo/ezm;->a(Lo/ezx;)V

    .line 292
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$10;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V

    invoke-virtual {v2, v0}, Lo/ezi;->a(Lo/ezi$i;)V

    .line 312
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 313
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 315
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    new-instance v10, Lo/ehe$a;

    invoke-direct {v10}, Lo/ehe$a;-><init>()V

    .line 320
    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 321
    const-string v0, "rest_hr"

    invoke-virtual {v10, v0}, Lo/ehe$a;->a(Ljava/lang/String;)Lo/ehe$a;

    .line 323
    new-instance v11, Lo/ehe$a;

    invoke-direct {v11}, Lo/ehe$a;-><init>()V

    .line 324
    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 325
    const-string v0, "warning_hr"

    invoke-virtual {v11, v0}, Lo/ehe$a;->a(Ljava/lang/String;)Lo/ehe$a;

    .line 327
    sget-object v0, Lo/ezi;->c:Lo/ehe$a;

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    move/from16 v0, p8

    invoke-virtual {v2, v8, v9, v0}, Lo/ezi;->b(Ljava/util/List;Ljava/util/List;Z)V

    .line 334
    invoke-virtual {p1, v2}, Lo/ezh;->b(Lo/ezj;)V

    .line 335
    return-void
.end method

.method protected e()Lo/ezh;
    .locals 11

    .line 340
    new-instance v9, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$9;

    invoke-direct {v9, p0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$9;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;Landroid/app/Activity;)V

    .line 347
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->b:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v10

    .line 348
    invoke-virtual {v9, v10}, Lo/eyq;->setStepDatatype(Lo/eic;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    invoke-virtual {v9, v0}, Lo/eyq;->setHighlightedEntryParser(Lo/eyp;)V

    .line 351
    const-string v0, "normal_hr"

    invoke-virtual {v9, v0}, Lo/eyq;->c(Ljava/lang/String;)V

    .line 353
    move-object v0, p0

    move-object v1, v9

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->k:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_resting_heart_bmp:I

    .line 356
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    sget v6, Lcom/huawei/ui/main/R$string;->IDS_heartrate_raise_remind:I

    .line 358
    invoke-virtual {p0, v6}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    .line 353
    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->c(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 361
    return-object v9
.end method

.method protected f()Lo/ezh;
    .locals 11

    .line 421
    new-instance v9, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$2;

    invoke-direct {v9, p0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;Landroid/app/Activity;)V

    .line 428
    const-string v0, "normal_hr"

    invoke-virtual {v9, v0}, Lo/ezw;->c(Ljava/lang/String;)V

    .line 430
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->g()Lo/ehy;

    move-result-object v0

    sget-object v1, Lo/eif;->e:Lo/eif;

    invoke-static {v0, v1}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v10

    .line 431
    invoke-virtual {v9, v10}, Lo/ezw;->setStepDatatype(Lo/eic;)V

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    invoke-virtual {v9, v0}, Lo/ezw;->setHighlightedEntryParser(Lo/eyp;)V

    .line 433
    const-string v0, "normal_hr"

    invoke-virtual {v9, v0}, Lo/ezw;->c(Ljava/lang/String;)V

    .line 435
    move-object v0, p0

    move-object v1, v9

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->k:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->o:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h:Ljava/lang/String;

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 443
    return-object v9
.end method

.method public g()Lo/ehy;
    .locals 1

    .line 451
    sget-object v0, Lo/ehy;->h:Lo/ehy;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 76
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 77
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->setContentView(I)V

    .line 78
    new-instance v0, Lo/exw;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/exw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d:Lo/exw;

    .line 79
    new-instance v0, Lo/eya;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eya;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b:Lo/eya;

    .line 80
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->i()V

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h()V

    .line 83
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b()V

    .line 84
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 142
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 143
    return-void
.end method
