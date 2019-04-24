.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private A:J

.field private B:Lo/cgt;

.field private C:Landroid/widget/LinearLayout;

.field private D:I

.field private E:I

.field private F:I

.field private G:Lo/ekw;

.field private H:Ljava/util/concurrent/ExecutorService;

.field private I:I

.field private J:Lo/ekw;

.field private K:Lo/ekw;

.field private L:Lo/ekw;

.field private M:Lo/ekw;

.field private N:Lo/ekw;

.field private O:Lo/ekw;

.field private P:Z

.field private Q:Landroid/widget/ImageView;

.field private R:Landroid/widget/ImageView;

.field private S:I

.field private T:Landroid/widget/ImageView;

.field private U:Landroid/widget/ImageView;

.field private V:Landroid/widget/ImageView;

.field private W:Landroid/widget/ImageView;

.field private X:Landroid/widget/ImageView;

.field private Y:Landroid/widget/LinearLayout;

.field private Z:Landroid/widget/ImageView;

.field a:Landroid/widget/LinearLayout;

.field private aA:I

.field private aB:Z

.field private aC:Lo/egb;

.field private aD:Lo/egb;

.field private aE:Lo/egb;

.field private aF:Lo/cfh;

.field private aG:Lo/egb;

.field private aa:Landroid/widget/ImageView;

.field private ab:Landroid/widget/LinearLayout;

.field private ac:Landroid/widget/LinearLayout;

.field private ad:Landroid/widget/LinearLayout;

.field private ae:Landroid/widget/LinearLayout;

.field private af:Lo/cil;

.field private ag:Lo/cil;

.field private ah:Lo/cil;

.field private ai:Lo/cil;

.field private aj:Lo/cil;

.field private ak:Lo/cil;

.field private al:Lo/cil;

.field private am:Lo/cil;

.field private an:Landroid/view/View;

.field private ao:Landroid/view/View;

.field private ap:Lo/cil;

.field private aq:Landroid/view/View;

.field private ar:Landroid/view/View;

.field private as:Landroid/view/View;

.field private at:Landroid/view/View;

.field private au:Landroid/view/View;

.field private av:Landroid/view/View;

.field private aw:Landroid/view/View;

.field private ax:Landroid/os/Handler;

.field private ay:Lo/egb;

.field private az:Lo/egb;

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/LinearLayout;

.field private d:Lo/ekw;

.field e:Landroid/widget/LinearLayout;

.field private f:Lo/egb;

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Lo/chg;

.field private j:Landroid/widget/LinearLayout;

.field private k:Lo/egb;

.field private l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

.field private m:Lo/egb;

.field private n:Lo/ekw;

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cfd;>;"
        }
    .end annotation
.end field

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cev;>;"
        }
    .end annotation
.end field

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfj;>;"
        }
    .end annotation
.end field

.field private r:I

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfl;>;"
        }
    .end annotation
.end field

.field private t:I

.field private u:I

.field private v:I

.field private w:Landroid/widget/ProgressBar;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->C:Landroid/widget/LinearLayout;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->j:Landroid/widget/LinearLayout;

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->P:Z

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->S:I

    .line 168
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aB:Z

    .line 170
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    .line 172
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ax:Landroid/os/Handler;

    .line 666
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    return-void
.end method

.method private a()V
    .locals 2

    .line 217
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 218
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    .line 219
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ay:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    goto :goto_0

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ay:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 226
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->w()V

    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 633
    if-eqz p1, :cond_0

    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 634
    :cond_0
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    return-void

    .line 637
    :cond_1
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;

    invoke-direct {v4, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 638
    const-string v0, "KEY_BASELINE"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 639
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 640
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 641
    return-void
.end method

.method private b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Ljava/lang/String;I)V
    .locals 1

    .line 620
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aB:Z

    if-eqz v0, :cond_0

    .line 621
    return-void

    .line 623
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d()V

    .line 625
    if-nez p1, :cond_1

    .line 626
    return-void

    .line 628
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 629
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e(I)V

    .line 630
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->r()V

    return-void
.end method

.method private c()V
    .locals 2

    .line 561
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Q:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$12;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$12;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 567
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->R:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$13;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$13;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->U:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$11;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$11;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 579
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->W:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$16;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$16;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->T:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$18;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$18;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 591
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->V:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$17;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$17;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->X:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$20;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$20;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 603
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aa:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$19;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$19;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 609
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Z:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$25;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$25;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 615
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 7

    .line 286
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_sc_j_heart_pie:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chg;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->i:Lo/chg;

    .line 287
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_hotbody:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->k:Lo/egb;

    .line 288
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_burn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->f:Lo/egb;

    .line 289
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_anaerobic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->g:Lo/egb;

    .line 290
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_aerobic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->h:Lo/egb;

    .line 291
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_limit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->m:Lo/egb;

    .line 293
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_detail_loading:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->w:Landroid/widget/ProgressBar;

    .line 294
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->heart_rate_large_scale_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->C:Landroid/widget/LinearLayout;

    .line 296
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->heart_rate_chart_show_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->j:Landroid/widget/LinearLayout;

    .line 298
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_heartrate:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->b:Landroid/widget/LinearLayout;

    .line 299
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_steprate:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->a:Landroid/widget/LinearLayout;

    .line 300
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->c:Landroid/widget/LinearLayout;

    .line 301
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_altitude:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e:Landroid/widget/LinearLayout;

    .line 303
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_rt_pace:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ac:Landroid/widget/LinearLayout;

    .line 304
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_pull_freq:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Y:Landroid/widget/LinearLayout;

    .line 305
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_swolf:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ab:Landroid/widget/LinearLayout;

    .line 307
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_ground_contact_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ae:Landroid/widget/LinearLayout;

    .line 308
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_ground_impact_acceleration:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ad:Landroid/widget/LinearLayout;

    .line 310
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_heart:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aq:Landroid/view/View;

    .line 311
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_step:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ao:Landroid/view/View;

    .line 312
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->an:Landroid/view/View;

    .line 313
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_tip:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ar:Landroid/view/View;

    .line 314
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_pull_freq:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->au:Landroid/view/View;

    .line 315
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_rt_pace:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->av:Landroid/view/View;

    .line 316
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_ground_contact_time_tip:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aw:Landroid/view/View;

    .line 317
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_ground_impact_acceleration_tip:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->as:Landroid/view/View;

    .line 318
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->view_div_altitude:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->at:Landroid/view/View;

    .line 321
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_accuracy_tip:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ay:Lo/egb;

    .line 323
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ring_info_limit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->az:Lo/egb;

    .line 324
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ring_info_wynl:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aC:Lo/egb;

    .line 325
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ring_info_yynl:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aE:Lo/egb;

    .line 326
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ring_info_burn:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aG:Lo/egb;

    .line 327
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ring_info_hot:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aD:Lo/egb;

    .line 328
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmHeartrateZoneType()I

    move-result v0

    invoke-static {v0}, Lo/cgm;->e(I)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v5

    .line 329
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v6

    .line 330
    const/4 v0, 0x1

    if-ne v0, v6, :cond_0

    .line 331
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->az:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_anaerobicAdvance_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 332
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aC:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_anaerobicBase_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 333
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aE:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_lacticAcid_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 334
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aG:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_aerobicAdvance_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 335
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aD:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_aerobicBase_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    goto :goto_0

    .line 337
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->az:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_maximum_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 338
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aC:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_anaerobic_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 339
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aE:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_aerobic_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 340
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aG:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_fatburn_threshold_string:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 341
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aD:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_warmup_threshold:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 344
    :goto_0
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ag:Lo/cil;

    .line 345
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ah:Lo/cil;

    .line 347
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/16 v4, 0x64

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->am:Lo/cil;

    .line 348
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->af:Lo/cil;

    .line 350
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->al:Lo/cil;

    .line 351
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x5

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aj:Lo/cil;

    .line 352
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    const/16 v1, 0x106

    if-ne v0, v1, :cond_2

    .line 353
    :cond_1
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ai:Lo/cil;

    goto :goto_1

    .line 355
    :cond_2
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/16 v4, 0x9

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ai:Lo/cil;

    .line 359
    :goto_1
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ak:Lo/cil;

    .line 360
    new-instance v0, Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/16 v4, 0x8

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ap:Lo/cil;

    .line 362
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ag:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    .line 363
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ag:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Q:Landroid/widget/ImageView;

    .line 364
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 366
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ah:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    .line 367
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ah:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->R:Landroid/widget/ImageView;

    .line 368
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 370
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->af:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    .line 371
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->af:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->U:Landroid/widget/ImageView;

    .line 372
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 374
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->am:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    .line 375
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->am:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->W:Landroid/widget/ImageView;

    .line 376
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 378
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->al:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    .line 379
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->al:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->T:Landroid/widget/ImageView;

    .line 380
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 382
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aj:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    .line 383
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aj:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->V:Landroid/widget/ImageView;

    .line 384
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 386
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ai:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    .line 387
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ai:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->X:Landroid/widget/ImageView;

    .line 388
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 390
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ak:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    .line 391
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ak:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aa:Landroid/widget/ImageView;

    .line 392
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 394
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ap:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->b()Lo/ekw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    .line 395
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ap:Lo/cil;

    invoke-virtual {v0}, Lo/cil;->a()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Z:Landroid/widget/ImageView;

    .line 396
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setLogEnabled(Z)V

    .line 398
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ag:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 399
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ah:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->am:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->af:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 403
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ab:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->al:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ac:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ai:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Y:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aj:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 407
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ae:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ak:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ad:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ap:Lo/cil;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 410
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    invoke-static {v0}, Lo/cfe;->c(Lo/cfe;)V

    .line 412
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->c()V

    .line 414
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$14;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$14;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 421
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$21;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$21;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$34;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$34;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 437
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$40;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$40;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$37;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$37;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$38;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$38;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$36;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$36;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 470
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$39;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$39;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$3;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$2;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 494
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$5;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$9;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$9;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$10;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$10;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 526
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$6;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$6;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$7;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$7;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 542
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$8;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$8;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnSingleTapConfirmedListener(Lo/ekw$f;)V

    .line 550
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$15;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$15;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lo/ekw;->setOnDoubleTapListener(Lo/ekw$d;)V

    .line 558
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->k()V

    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 6

    .line 1117
    const/4 v5, 0x0

    .line 1118
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    if-eqz v0, :cond_1

    .line 1119
    if-lez p1, :cond_0

    const/16 v0, 0x3c

    if-ge p1, v0, :cond_0

    .line 1120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 1122
    :cond_0
    div-int/lit8 v0, p1, 0x3c

    invoke-static {v0}, Lo/cdl;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 1126
    :cond_1
    :goto_0
    return-object v5
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->P:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;Z)Z
    .locals 0

    .line 62
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aB:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    return-object v0
.end method

.method private e()V
    .locals 6

    .line 232
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v4

    .line 233
    if-nez v4, :cond_0

    .line 234
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motionPath is null return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    return-void

    .line 237
    :cond_0
    invoke-virtual {v4}, Lo/cex;->t()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->s:Ljava/util/List;

    .line 238
    invoke-virtual {v4}, Lo/cex;->s()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->q:Ljava/util/List;

    .line 240
    new-instance v5, Lo/cgx;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-direct {v5, v0, v1}, Lo/cgx;-><init>(Lo/cfh;Lo/cgt;)V

    .line 241
    sget-object v0, Lo/cgx$e;->a:Lo/cgx$e;

    invoke-virtual {v5, v0}, Lo/cgx;->a(Lo/cgx$e;)V

    .line 242
    sget-object v0, Lo/cgx$e;->d:Lo/cgx$e;

    invoke-virtual {v5, v0}, Lo/cgx;->a(Lo/cgx$e;)V

    .line 243
    sget-object v0, Lo/cgx$e;->c:Lo/cgx$e;

    invoke-virtual {v5, v0}, Lo/cgx;->a(Lo/cgx$e;)V

    .line 244
    sget-object v0, Lo/cgx$e;->b:Lo/cgx$e;

    invoke-virtual {v5, v0}, Lo/cgx;->a(Lo/cgx$e;)V

    .line 246
    sget-object v0, Lo/cgx$e;->f:Lo/cgx$e;

    invoke-virtual {v5, v0}, Lo/cgx;->a(Lo/cgx$e;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->s:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cfh;->a(Ljava/util/List;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->q:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/cfh;->b(Ljava/util/List;)V

    .line 250
    sget-object v0, Lo/cgx$e;->g:Lo/cgx$e;

    invoke-virtual {v5, v0}, Lo/cgx;->a(Lo/cgx$e;)V

    .line 251
    sget-object v0, Lo/cgx$e;->i:Lo/cgx$e;

    invoke-virtual {v5, v0}, Lo/cgx;->a(Lo/cgx$e;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    invoke-virtual {v0, v1}, Lo/cfh;->e(I)V

    .line 256
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 645
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 646
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    const-string v0, "chartType"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->hT:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 649
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Ljava/lang/String;I)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ab:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private f()V
    .locals 1

    .line 709
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 710
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->o()V

    .line 711
    return-void

    .line 714
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 715
    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    .line 714
    invoke-static {v0}, Lo/cgm;->h(Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->F:I

    .line 716
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 717
    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    .line 716
    invoke-static {v0}, Lo/cgm;->k(Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->E:I

    .line 718
    return-void
.end method

.method static synthetic g(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->av:Landroid/view/View;

    return-object v0
.end method

.method private g()V
    .locals 1

    .line 721
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 722
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->q()V

    .line 724
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ac:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 734
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 735
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->s()V

    .line 736
    return-void

    .line 738
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->o:Ljava/util/ArrayList;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$24;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$24;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    invoke-static {v0}, Lo/cgm;->a(Lo/cfd;)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->u:I

    .line 745
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgStepRate()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->I:I

    .line 746
    return-void
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ar:Landroid/view/View;

    return-object v0
.end method

.method private i()V
    .locals 1

    .line 727
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 728
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->t()V

    .line 730
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Y:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 673
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initdata ---- --------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 674
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->P:Z

    .line 675
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->S:I

    .line 677
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v4

    .line 678
    if-nez v4, :cond_0

    .line 679
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motionPath is null return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    return-void

    .line 682
    :cond_0
    invoke-virtual {v4}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->S:I

    const/16 v2, 0x2710

    invoke-static {v0, v1, v2}, Lo/cgm;->d(Ljava/util/ArrayList;II)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->o:Ljava/util/ArrayList;

    .line 684
    invoke-virtual {v4}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p:Ljava/util/ArrayList;

    .line 687
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n()V

    .line 688
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->h()V

    .line 689
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->g()V

    .line 690
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->i()V

    .line 692
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->m()V

    .line 693
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p()V

    .line 694
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l()V

    .line 697
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->f()V

    .line 700
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$22;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$22;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 706
    return-void
.end method

.method static synthetic l(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aw:Landroid/view/View;

    return-object v0
.end method

.method private l()V
    .locals 2

    .line 789
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->x()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 790
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 791
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$26;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$26;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 808
    :cond_1
    return-void
.end method

.method static synthetic m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ae:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private m()V
    .locals 2

    .line 767
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 768
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$28;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$28;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 786
    :cond_0
    return-void
.end method

.method static synthetic n(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ad:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 750
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 751
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->u()V

    .line 752
    return-void

    .line 754
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/cgm;->c(Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->t:I

    .line 755
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->D:I

    .line 756
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mHeartRateList size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$29;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$29;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 764
    return-void
.end method

.method static synthetic o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->au:Landroid/view/View;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 833
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goneRunningPostureChart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 834
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$30;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 844
    return-void
.end method

.method static synthetic p(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->as:Landroid/view/View;

    return-object v0
.end method

.method private p()V
    .locals 2

    .line 811
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 812
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$27;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 830
    :cond_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->C:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private q()V
    .locals 2

    .line 859
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$33;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$33;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 867
    return-void
.end method

.method static synthetic r(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->an:Landroid/view/View;

    return-object v0
.end method

.method private r()V
    .locals 7

    .line 897
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 898
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fragment is not added to activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 899
    return-void

    .line 901
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->w:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 903
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->z:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->v:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->x:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->r:I

    if-nez v0, :cond_1

    .line 905
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 907
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->k:Lo/egb;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y:I

    invoke-direct {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 908
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->f:Lo/egb;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->z:I

    invoke-direct {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 909
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->g:Lo/egb;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->v:I

    invoke-direct {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 910
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->h:Lo/egb;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->x:I

    invoke-direct {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 911
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->m:Lo/egb;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->r:I

    invoke-direct {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 916
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    invoke-virtual {v0, v1}, Lo/cfh;->e(Lo/ekw;)Lo/elb;

    .line 917
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    invoke-virtual {v0, v1}, Lo/cfh;->c(Lo/ekw;)Lo/elb;

    .line 918
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    invoke-virtual {v0, v1}, Lo/cfh;->b(Lo/ekw;)Lo/elb;

    .line 919
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    invoke-virtual {v0, v1}, Lo/cfh;->d(Lo/ekw;)Lo/elb;

    .line 921
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    invoke-virtual {v0, v1}, Lo/cfh;->a(Lo/ekw;)Lo/elb;

    .line 922
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    invoke-virtual {v0, v1}, Lo/cfh;->g(Lo/ekw;)Lo/elb;

    .line 923
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    invoke-virtual {v0, v1}, Lo/cfh;->i(Lo/ekw;)Lo/elb;

    .line 925
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Lo/cfh;->d(Lo/ekw;I)Lo/elb;

    .line 926
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lo/cfh;->d(Lo/ekw;I)Lo/elb;

    .line 928
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 929
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 931
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 932
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 935
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 937
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 938
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 940
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 941
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 943
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 944
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 946
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 947
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 949
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 950
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 952
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setTouchEnabled(Z)V

    .line 953
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    sget-object v1, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v0, v1}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 956
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->n:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 957
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->d:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 958
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->G:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 959
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->J:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 961
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->K:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 962
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->L:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 963
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->M:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 965
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->N:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 966
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->O:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 968
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ag:Lo/cil;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->D:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    .line 969
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ag:Lo/cil;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->t:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->c(F)V

    .line 970
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ah:Lo/cil;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->I:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    .line 971
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ah:Lo/cil;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->u:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->c(F)V

    .line 973
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMinAlti()F

    move-result v4

    .line 974
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMaxAlti()F

    move-result v5

    .line 975
    invoke-static {v4, v5}, Lo/cgl;->e(FF)Z

    move-result v0

    if-nez v0, :cond_2

    .line 976
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lo/cgl;->d(Ljava/util/ArrayList;)[Ljava/lang/Float;

    move-result-object v6

    .line 977
    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v5

    .line 978
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 980
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->am:Lo/cil;

    invoke-virtual {v0, v4}, Lo/cil;->d(F)V

    .line 981
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->am:Lo/cil;

    invoke-virtual {v0, v5}, Lo/cil;->c(F)V

    .line 982
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->af:Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v1

    invoke-static {v1}, Lo/cgl;->i(F)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    .line 983
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->af:Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 985
    invoke-virtual {v1}, Lo/cgt;->a()Lo/cex;

    move-result-object v1

    invoke-virtual {v1}, Lo/cex;->r()Ljava/util/List;

    move-result-object v1

    .line 984
    invoke-static {v1}, Lo/cgm;->b(Ljava/util/List;)D

    move-result-wide v1

    double-to-float v1, v1

    .line 983
    invoke-virtual {v0, v1}, Lo/cil;->c(F)V

    .line 987
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->v()V

    .line 989
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->z()V

    .line 992
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ak:Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    .line 993
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ak:Lo/cil;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->F:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->c(F)V

    .line 994
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ap:Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    .line 995
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ap:Lo/cil;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->E:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->c(F)V

    .line 997
    return-void
.end method

.method static synthetic s(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aq:Landroid/view/View;

    return-object v0
.end method

.method private s()V
    .locals 4

    .line 848
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStepRateList is empty  null=========="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$31;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$31;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 856
    return-void
.end method

.method static synthetic t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ao:Landroid/view/View;

    return-object v0
.end method

.method private t()V
    .locals 4

    .line 870
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goneSpeedChart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 871
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$32;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$32;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 878
    return-void
.end method

.method static synthetic u(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->at:Landroid/view/View;

    return-object v0
.end method

.method private u()V
    .locals 2

    .line 882
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$35;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$35;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 894
    return-void
.end method

.method private v()V
    .locals 6

    .line 1003
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v3

    .line 1004
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->x()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1005
    invoke-virtual {v3}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v4

    .line 1006
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 1007
    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->q()Ljava/util/List;

    move-result-object v0

    .line 1006
    invoke-static {v0}, Lo/cgm;->a(Ljava/util/List;)I

    move-result v0

    int-to-float v5, v0

    .line 1009
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    const/16 v1, 0x106

    if-ne v0, v1, :cond_1

    .line 1012
    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    div-float/2addr v4, v0

    .line 1013
    const/high16 v0, 0x41200000    # 10.0f

    div-float/2addr v5, v0

    .line 1015
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1016
    float-to-double v0, v4

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v4, v0

    .line 1017
    float-to-double v0, v5

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    goto :goto_0

    .line 1022
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1023
    float-to-double v0, v4

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v4, v0

    .line 1024
    float-to-double v0, v5

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 1029
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ai:Lo/cil;

    invoke-virtual {v0, v4}, Lo/cil;->d(F)V

    .line 1030
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ai:Lo/cil;

    invoke-virtual {v0, v5}, Lo/cil;->c(F)V

    .line 1034
    :cond_3
    return-void
.end method

.method private w()V
    .locals 7

    .line 1081
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    if-nez v0, :cond_1

    .line 1082
    :cond_0
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "arrayngeRingData() mHeartRateList is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1083
    return-void

    .line 1085
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1086
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->p:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 1087
    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmHeartrateZoneType()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 1088
    invoke-virtual {v2}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v2

    .line 1086
    invoke-static {v0, v1, v2, v3}, Lo/cgm;->a(Ljava/util/List;IJ)[I

    move-result-object v5

    .line 1089
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartZoneConf: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v5, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget v3, v5, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x2

    aget v3, v5, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x3

    aget v3, v5, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x4

    aget v3, v5, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    const/4 v0, 0x0

    aget v0, v5, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->r:I

    .line 1091
    const/4 v0, 0x1

    aget v0, v5, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->x:I

    .line 1092
    const/4 v0, 0x2

    aget v0, v5, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->v:I

    .line 1093
    const/4 v0, 0x3

    aget v0, v5, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->z:I

    .line 1094
    const/4 v0, 0x4

    aget v0, v5, v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y:I

    .line 1098
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->r:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1099
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1100
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->v:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1101
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1102
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1104
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->r:I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->x:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->v:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->z:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y:I

    add-int/2addr v0, v1

    int-to-float v6, v0

    .line 1105
    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-nez v0, :cond_2

    .line 1106
    return-void

    .line 1109
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->i:Lo/chg;

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/chg;->setTime(Ljava/util/ArrayList;I)V

    .line 1112
    return-void
.end method

.method private x()Z
    .locals 1

    .line 1143
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private y()Z
    .locals 1

    .line 1147
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private z()V
    .locals 5

    .line 1038
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v2

    .line 1039
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    const/16 v1, 0x106

    if-ne v0, v1, :cond_5

    .line 1041
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v3

    .line 1045
    if-nez v3, :cond_1

    .line 1046
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->Y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1047
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->au:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1048
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ab:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1049
    return-void

    .line 1053
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->r()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1054
    const-string v0, "swim_pull_freq"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 1055
    if-eqz v4, :cond_2

    .line 1056
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aj:Lo/cil;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    goto :goto_0

    .line 1058
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aj:Lo/cil;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    .line 1061
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aj:Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->q:Ljava/util/List;

    invoke-static {v1}, Lo/cgm;->f(Ljava/util/List;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->c(F)V

    .line 1065
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->q()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1066
    const-string v0, "swim_avg_swolf"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 1067
    if-eqz v4, :cond_4

    .line 1068
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->al:Lo/cil;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    goto :goto_1

    .line 1070
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->al:Lo/cil;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cil;->d(F)V

    .line 1072
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->al:Lo/cil;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->s:Ljava/util/List;

    invoke-static {v1}, Lo/cgm;->i(Ljava/util/List;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/cil;->c(F)V

    .line 1076
    :cond_5
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 663
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aB:Z

    return v0
.end method

.method public d()V
    .locals 4

    .line 653
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->ax:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$23;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$23;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 659
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aB:Z

    .line 660
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 184
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 185
    if-nez v7, :cond_0

    .line 186
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackDetailActivity == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, 0x0

    return-object v0

    .line 189
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d()Lo/cgt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    .line 190
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    if-nez v0, :cond_1

    .line 191
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTrackDetailDataManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const/4 v0, 0x0

    return-object v0

    .line 194
    :cond_1
    iput-object v7, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 195
    new-instance v0, Lo/cfh;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->l:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cfh;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aF:Lo/cfh;

    .line 197
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 198
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->A:J

    .line 199
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->B:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->aA:I

    .line 200
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "*****start*****start*****start*****start: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-wide v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->A:J

    const/16 v6, 0x11

    invoke-static {v3, v4, v5, v6}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*****----"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 202
    :cond_2
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMotionPath or mSimplifyData null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-virtual {v7}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->finish()V

    .line 204
    const/4 v0, 0x0

    return-object v0

    .line 206
    :goto_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->e()V

    .line 207
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView--------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_sug_fm_detail_heartrate:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/FrameLayout;

    .line 209
    invoke-direct {p0, v8}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->c(Landroid/view/View;)V

    .line 210
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->a()V

    .line 211
    return-object v8
.end method

.method public onDestroy()V
    .locals 7

    .line 1132
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 1133
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->A:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1134
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "*****end*****end*****end*****end*****end*****end: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-wide v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->A:J

    const/16 v6, 0x11

    invoke-static {v3, v4, v5, v6}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*****end*****end*****end"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->H:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 1137
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->H:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1139
    :cond_1
    invoke-static {}, Lo/cgm;->c()V

    .line 1140
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 261
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 262
    const-string v0, "Track_HeartRateFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart ---- --------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->H:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 265
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->H:Ljava/util/concurrent/ExecutorService;

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;->H:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 277
    return-void
.end method
