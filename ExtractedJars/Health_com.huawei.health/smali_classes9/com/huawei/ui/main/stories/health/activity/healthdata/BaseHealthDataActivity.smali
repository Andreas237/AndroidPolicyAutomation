.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;
.super Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/fei;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;
    }
.end annotation


# instance fields
.field private B:Landroid/widget/LinearLayout;

.field public a:Lo/enb;

.field public b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

.field public c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

.field public d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

.field public e:Lo/ems;

.field public f:Landroid/widget/LinearLayout;

.field public g:Landroid/widget/LinearLayout;

.field public h:Landroid/widget/LinearLayout;

.field public i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/LinearLayout;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;>;"
        }
    .end annotation
.end field

.field private l:Landroid/widget/TextView;

.field private m:Lo/fdc;

.field private n:Lo/emq;

.field private o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

.field private p:I

.field private q:Landroid/view/View;

.field private r:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Lo/fck;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Landroid/widget/TextView;

.field private z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;-><init>()V

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k:Ljava/util/ArrayList;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->t:Ljava/lang/String;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 2

    .line 203
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_toast_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->x:Landroid/widget/RelativeLayout;

    .line 204
    sget v0, Lcom/huawei/ui/main/R$id;->toast_try_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->w:Landroid/widget/TextView;

    .line 205
    sget v0, Lcom/huawei/ui/main/R$id;->toast_no_no_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->v:Landroid/widget/TextView;

    .line 206
    sget v0, Lcom/huawei/ui/main/R$id;->toast_title_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->y:Landroid/widget/TextView;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->w:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->v:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->f()V

    return-void
.end method

.method private b()V
    .locals 2

    .line 171
    sget-object v0, Lo/act;->a:Lo/act;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    invoke-virtual {v0, v1}, Lo/act;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 177
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->c()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;Z)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d(Z)V

    return-void
.end method

.method private c()V
    .locals 1

    .line 231
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 240
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    return-object v0
.end method

.method private d()V
    .locals 1

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->base_activity_no_empty:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->q:Landroid/view/View;

    .line 185
    return-void
.end method

.method private d(Z)V
    .locals 3

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;

    .line 465
    instance-of v0, v2, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    if-eqz v0, :cond_0

    .line 466
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->c(I)V

    .line 468
    :cond_0
    invoke-virtual {v2, p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->c(Z)V

    .line 469
    goto :goto_0

    .line 470
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h()V

    return-void
.end method

.method private f()V
    .locals 3

    .line 251
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->i()V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;Landroid/support/v4/app/FragmentManager;)V

    invoke-virtual {v0, v1}, Lo/enb;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 254
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_weight_day_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 335
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_input:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->j:Landroid/widget/LinearLayout;

    .line 336
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mesure:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->B:Landroid/widget/LinearLayout;

    .line 337
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_more:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->f:Landroid/widget/LinearLayout;

    .line 338
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g:Landroid/widget/LinearLayout;

    .line 339
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_tag:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->i:Landroid/widget/LinearLayout;

    .line 340
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_share:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->e:Lo/ems;

    invoke-virtual {v0, v3}, Lo/ems;->e(Landroid/view/View;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->e:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->B:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 350
    return-void
.end method

.method private h()V
    .locals 2

    .line 293
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->e()V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_buttomview:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->e:Lo/ems;

    .line 296
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g()V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_sub_tab_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    .line 298
    sget v0, Lcom/huawei/ui/main/R$id;->hw_base_health_viewpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/enb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lo/enb;->setScrollHeightArea(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    invoke-virtual {v0, v1}, Lo/enb;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/enb;->setOffscreenPageLimit(I)V

    .line 329
    return-void
.end method

.method private i()V
    .locals 7

    .line 259
    new-instance v0, Lo/fck;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/fck;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->u:Lo/fck;

    .line 260
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->p:I

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->e(I)Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-virtual {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->a(Lo/fei;)V

    .line 262
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-virtual {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Lo/fei;)V

    .line 264
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-virtual {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lo/fei;)V

    .line 266
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-virtual {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lo/fei;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_day:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v3

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->u:Lo/fck;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lo/fck;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_week:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v4

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->u:Lo/fck;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/fck;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_month:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v5

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->u:Lo/fck;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v1, v2}, Lo/fck;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_detail_radio_button_tab_year:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v6

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->u:Lo/fck;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v1, v2}, Lo/fck;->e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->b:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    return-void
.end method

.method private k()V
    .locals 0

    .line 367
    return-void
.end method

.method private l()I
    .locals 2

    .line 375
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->p:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 376
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    return v0

    .line 377
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->p:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 378
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    return v0

    .line 380
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight:I

    return v0
.end method


# virtual methods
.method public b(Z)V
    .locals 2

    .line 431
    if-eqz p1, :cond_0

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emq;->setVisibility(I)V

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    goto :goto_0

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->n:Lo/emq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emq;->setVisibility(I)V

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 438
    :goto_0
    return-void
.end method

.method public d(Ljava/util/Date;)V
    .locals 2

    .line 425
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/enb;->setCurrentItem(I)V

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->c(Ljava/util/Date;)V

    .line 427
    return-void
.end method

.method protected e()V
    .locals 3

    .line 384
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->e()V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->base_health_right_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v2

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->detail_title_text:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->l:Landroid/widget/TextView;

    .line 389
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 390
    new-instance v0, Lo/fdc;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->r:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;

    invoke-direct {v0, p0, v2, v1}, Lo/fdc;-><init>(Landroid/app/Activity;Landroid/view/View;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->m:Lo/fdc;

    .line 391
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 392
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->m:Lo/fdc;

    invoke-virtual {v0}, Lo/fdc;->a()V

    goto :goto_0

    .line 396
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 399
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->l:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 401
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->j:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fcu;->c(I)V

    goto/16 :goto_0

    .line 407
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->B:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/fcu;->c(I)V

    goto :goto_0

    .line 409
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->f:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_2

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f()V

    goto :goto_0

    .line 411
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->g:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_3

    .line 413
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 414
    const-string v0, "base_health_data_type_key"

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->p:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 415
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->startActivity(Landroid/content/Intent;)V

    .line 416
    sget-object v0, Lo/dae;->cJ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-static {v0, v1}, Lo/fej;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 417
    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->i:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_4

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/fcu;->c(I)V

    goto :goto_0

    .line 419
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_5

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/fcu;->c(I)V

    .line 422
    :cond_5
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 133
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 134
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_base_health_data:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->setContentView(I)V

    .line 135
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    .line 136
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 137
    if-nez v4, :cond_0

    .line 138
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 141
    :cond_0
    const-string v0, "healthdata"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->t:Ljava/lang/String;

    .line 142
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->p:I

    .line 143
    const-string v0, "weight_user_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 145
    sget-object v0, Lo/act;->a:Lo/act;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/act;->c(Ljava/lang/String;)Lo/acu;

    move-result-object v5

    .line 146
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v5}, Lo/act;->c(Lo/acu;)V

    .line 147
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    .line 148
    goto :goto_0

    .line 149
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    .line 151
    :goto_0
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->r:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;

    .line 153
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a()V

    .line 154
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d()V

    .line 155
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->b()V

    .line 168
    return-void
.end method

.method public onDestroy()V
    .locals 7

    .line 514
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onDestroy()V

    .line 515
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->r:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;

    .line 520
    new-instance v4, Ljava/io/File;

    sget-object v0, Lo/dab;->e:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 521
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 522
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no delete file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    return-void

    .line 525
    :cond_0
    new-instance v5, Ljava/io/File;

    const-string v0, "weight_share_tmp.jpg"

    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 526
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 528
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    .line 529
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 533
    :cond_1
    goto :goto_0

    .line 531
    :catch_0
    move-exception v6

    .line 532
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SecurityException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    :cond_2
    :goto_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 5

    .line 540
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->t:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->t:Ljava/lang/String;

    const-string v1, "MyHealthData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 542
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed jumpToDeviceActivity is Success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 544
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 545
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 547
    const-string v0, "kind"

    const-string v1, "HDK_UNKNOWN"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 548
    const-string v0, "view"

    const-string v1, "ListDevice"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 549
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->startActivity(Landroid/content/Intent;)V

    .line 550
    goto :goto_0

    .line 551
    :cond_0
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed jumpToDeviceActivity is Fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->finish()V

    .line 554
    const/4 v0, 0x1

    return v0

    .line 556
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 563
    if-nez p1, :cond_0

    .line 564
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    return-void

    .line 567
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 568
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onNewIntent() intent="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    const-string v0, "healthdata"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->t:Ljava/lang/String;

    .line 570
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->p:I

    .line 571
    const-string v0, "weight_user_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 573
    sget-object v0, Lo/act;->a:Lo/act;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/act;->c(Ljava/lang/String;)Lo/acu;

    move-result-object v4

    .line 574
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v4}, Lo/act;->c(Lo/acu;)V

    .line 575
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->s:Ljava/lang/String;

    .line 576
    goto :goto_0

    .line 577
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    .line 580
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->onResume()V

    .line 581
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d(Z)V

    .line 582
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 586
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-static {v0, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 589
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult HasPermissions:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->z:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/fcu;->c(I)V

    .line 592
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 496
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onResume()V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->m:Lo/fdc;

    if-eqz v0, :cond_0

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->m:Lo/fdc;

    invoke-virtual {v0}, Lo/fdc;->a()V

    .line 501
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->k()V

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$9;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    invoke-static {v0, v1}, Lo/fjb;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 510
    return-void
.end method
