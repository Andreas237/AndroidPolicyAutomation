.class public Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/emr;

.field private b:Landroid/content/Context;

.field private c:Landroid/support/v7/widget/RecyclerView;

.field private d:Landroid/widget/LinearLayout;

.field e:Lo/erj;

.field private f:F

.field private g:Lo/erz;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/os/HandlerThread;

.field private k:Landroid/os/Handler;

.field private l:F

.field private m:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 88
    new-instance v0, Lo/erj;

    invoke-direct {v0}, Lo/erj;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->e:Lo/erj;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c:Landroid/support/v7/widget/RecyclerView;

    .line 94
    new-instance v0, Lo/erz;

    invoke-direct {v0}, Lo/erz;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->g:Lo/erz;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->i:Landroid/os/HandlerThread;

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->k:Landroid/os/Handler;

    .line 663
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$9;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->m:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)F
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->l:F

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;F)F
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->f:F

    return p1
.end method

.method private a()V
    .locals 8

    .line 163
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRecommendData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b:Landroid/content/Context;

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_LAST_RECOMMEND_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 165
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ffk;->c(JI)J

    move-result-wide v5

    .line 166
    if-eqz v4, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 168
    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-nez v0, :cond_0

    .line 172
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Has recommend today"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    invoke-static {}, Lo/erh;->a()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    move-result-object v7

    .line 175
    if-eqz v7, :cond_0

    .line 177
    invoke-virtual {p0, v7}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    return-void

    .line 184
    :cond_0
    goto :goto_0

    .line 181
    :catch_0
    move-exception v7

    .line 183
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRecommendData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    :cond_1
    :goto_0
    invoke-static {}, Lo/bzy;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 189
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No Heartrate devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(I)V

    .line 191
    const/4 v0, -0x1

    const/16 v1, 0x8

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/erh;->b(IID)V

    goto :goto_1

    .line 194
    :cond_2
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Has Heartrate devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->e()V

    .line 197
    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/os/Handler;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->m:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 327
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRunCourseView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    sget v0, Lcom/huawei/ui/homehealth/R$id;->rv_course:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c:Landroid/support/v7/widget/RecyclerView;

    .line 329
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_runmore_recommend_reason:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->h:Landroid/widget/TextView;

    .line 351
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 352
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->g:Lo/erz;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 355
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_run_course_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d:Landroid/widget/LinearLayout;

    .line 357
    return-void
.end method

.method private b(I)V
    .locals 1

    .line 498
    invoke-static {p1}, Lo/erh;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$1;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;I)V

    invoke-static {v0}, Lo/erh;->c(Lo/erh$b;)V

    goto :goto_0

    .line 507
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c(I)V

    .line 510
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;Ljava/util/List;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d(Ljava/util/List;)V

    return-void
.end method

.method private c()V
    .locals 7

    .line 202
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$3;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 229
    sget v0, Lcom/huawei/ui/homehealth/R$id;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->a:Lo/emr;

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->a:Lo/emr;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$5;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    new-instance v4, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    .line 242
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 243
    const-string v0, "PAGE_TYPE"

    const/4 v1, 0x4

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 244
    invoke-virtual {v4, v5}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 246
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v6

    .line 247
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->fragment_configured_sport:I

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 248
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 262
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b()V

    .line 290
    return-void
.end method

.method private c(I)V
    .locals 1

    .line 538
    invoke-static {p1}, Lo/erh;->a(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    move-result-object v0

    .line 539
    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;)V

    .line 540
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->a()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V

    return-void
.end method

.method private c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V
    .locals 3

    .line 513
    const/4 v1, -0x1

    .line 514
    if-eqz p1, :cond_0

    .line 515
    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v1

    .line 517
    :cond_0
    invoke-static {v1}, Lo/erh;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    move v2, v1

    .line 520
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$8;

    invoke-direct {v0, p0, v2}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$8;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;I)V

    invoke-static {v0}, Lo/erh;->c(Lo/erh$b;)V

    .line 526
    goto :goto_0

    .line 527
    :cond_1
    invoke-direct {p0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c(I)V

    .line 530
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private d(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 596
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRunCourse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 598
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 599
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 600
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->g:Lo/erz;

    invoke-virtual {v0, v4}, Lo/erz;->c(Ljava/util/List;)V

    .line 602
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireExtendSeaMap()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bso;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 603
    if-eqz v5, :cond_1

    const-string v0, "workoutRecommendDec"

    invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 604
    invoke-static {}, Lo/erh;->b()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v6

    .line 605
    const-string v0, "workoutRecommendDec"

    .line 606
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b:Landroid/content/Context;

    .line 605
    invoke-static {v6, v0, v1}, Lo/esk;->b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 608
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 610
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 612
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 613
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRunCourse invalid recommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    :goto_0
    goto :goto_1

    .line 616
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 617
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRunCourse no desc"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    :goto_1
    goto :goto_2

    .line 620
    :cond_2
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateRunCourse invalid data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    :goto_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)F
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->f:F

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;F)F
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->l:F

    return p1
.end method

.method private e()V
    .locals 4

    .line 477
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start get SportLevel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->e:Lo/erj;

    if-nez v0, :cond_0

    .line 479
    new-instance v0, Lo/erj;

    invoke-direct {v0}, Lo/erj;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->e:Lo/erj;

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->e:Lo/erj;

    .line 482
    invoke-static {}, Lo/feg;->e()Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$2;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V

    .line 481
    invoke-virtual {v0, v1, v2}, Lo/erj;->d(Lcom/huawei/up/model/UserInfomation;Lo/erj$c;)V

    .line 491
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c(I)V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;)V
    .locals 7

    .line 543
    if-eqz p1, :cond_0

    .line 544
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    new-instance v3, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;

    invoke-direct {v3, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b:Landroid/content/Context;

    .line 576
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_LAST_RECOMMEND_TIME"

    .line 578
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lo/ffk;->c(JI)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 575
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 582
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 583
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workout is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->m:Landroid/os/Handler;

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->m:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 589
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 132
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 134
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->activity_track_view_more_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->setContentView(I)V

    .line 136
    iput-object p0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b:Landroid/content/Context;

    .line 138
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c()V

    .line 140
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Track_RunMoreInfoActivity"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->i:Landroid/os/HandlerThread;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->i:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 142
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->i:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->k:Landroid/os/Handler;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->k:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$4;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 155
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 690
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->i:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 693
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->m:Landroid/os/Handler;

    .line 694
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->i:Landroid/os/HandlerThread;

    .line 695
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 701
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 702
    if-eqz p1, :cond_0

    .line 703
    const-string v0, "android:support:fragments"

    .line 705
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 707
    :cond_0
    return-void
.end method
