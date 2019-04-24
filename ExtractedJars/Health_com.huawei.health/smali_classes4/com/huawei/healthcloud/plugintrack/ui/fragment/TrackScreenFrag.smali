.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;,
        Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;
    }
.end annotation


# instance fields
.field private A:Lhuawei/widget/HwProgressBar;

.field private B:Landroid/widget/RelativeLayout;

.field private C:Ljava/util/concurrent/ExecutorService;

.field private D:Landroid/animation/Animator;

.field private E:Z

.field private F:Landroid/animation/AnimatorSet;

.field private G:Landroid/animation/AnimatorSet;

.field private H:Landroid/view/View;

.field private I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation
.end field

.field private L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

.field private M:I

.field private a:Lo/cgt;

.field private b:Lo/chc;

.field public c:Z

.field private d:Lo/cha;

.field private e:Landroid/content/Context;

.field private f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

.field private g:Landroid/os/Handler;

.field private h:Landroid/view/View;

.field private i:Lcom/amap/api/maps/MapView;

.field private j:Landroid/graphics/Bitmap;

.field private k:Landroid/widget/LinearLayout;

.field private l:I

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/ImageButton;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/ImageButton;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Landroid/widget/ImageButton;

.field private u:Landroid/widget/ImageButton;

.field private v:Z

.field private w:I

.field private x:Ljava/util/concurrent/ExecutorService;

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 71
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i:Lcom/amap/api/maps/MapView;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    .line 85
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g:Landroid/os/Handler;

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->n:Landroid/widget/ImageButton;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->p:Landroid/widget/ImageButton;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->u:Landroid/widget/ImageButton;

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->q:Z

    .line 99
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->s:Z

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r:Z

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c:Z

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->y:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/animation/AnimatorSet;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->F:Landroid/animation/AnimatorSet;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->D:Landroid/animation/Animator;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->I:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/chc;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    return-object v0
.end method

.method private b(DI)V
    .locals 6

    .line 505
    const/16 v0, 0x10a

    if-eq p3, v0, :cond_1

    const/16 v0, 0x106

    if-eq p3, v0, :cond_1

    .line 507
    invoke-static {p1, p2}, Lo/cgl;->e(D)Ljava/lang/String;

    move-result-object v5

    .line 509
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    goto :goto_0

    .line 512
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    goto :goto_0

    .line 515
    :cond_1
    double-to-float v0, p1

    invoke-static {v0}, Lo/cgl;->h(F)Ljava/lang/String;

    move-result-object v5

    .line 516
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 517
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    .line 518
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    .line 519
    const/4 v3, 0x2

    invoke-static {p1, p2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-int v3, v3

    .line 518
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    .line 517
    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 522
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 525
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->l(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 526
    return-void
.end method

.method private b(Landroid/os/Handler;)V
    .locals 3

    .line 654
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->v:Z

    if-eqz v0, :cond_1

    .line 655
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->z:Z

    if-eqz v0, :cond_0

    .line 656
    const/4 v0, 0x1

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 658
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->x:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$3;

    invoke-direct {v1, p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/os/Handler;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 674
    :cond_1
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;

    invoke-direct {v0, p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/os/Handler;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 698
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->v:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 6

    .line 185
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 186
    if-nez v4, :cond_0

    .line 187
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMap parentActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    return-void

    .line 190
    :cond_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 191
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sport_track_map:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/MapView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i:Lcom/amap/api/maps/MapView;

    .line 192
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->getMap()Lcom/amap/api/maps/AMap;

    move-result-object v5

    .line 193
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 197
    if-nez v5, :cond_1

    .line 198
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception: AMap of MapView is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 200
    return-void

    .line 202
    :cond_1
    new-instance v0, Lo/cgy;

    invoke-virtual {v4}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i:Lcom/amap/api/maps/MapView;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/cgy;-><init>(Landroid/content/Context;Lcom/amap/api/maps/MapView;Z)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    .line 203
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cgy;->d(Ljava/lang/Boolean;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, p1, v1, v2}, Lo/chc;->c(Landroid/os/Bundle;ZZ)V

    .line 205
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/chc;->h(Z)V

    .line 206
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->C:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 333
    goto :goto_1

    .line 334
    :cond_2
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e()V

    .line 335
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->E:Z

    .line 336
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sport_track_map:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/maps/SupportMapFragment;

    .line 337
    if-eqz v5, :cond_3

    .line 339
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView() mapFragment is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    invoke-virtual {v5, p0}, Lcom/google/android/gms/maps/SupportMapFragment;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    goto :goto_0

    .line 342
    :cond_3
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView() mapFragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 346
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/view/View;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->H:Landroid/view/View;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 748
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r:Z

    if-eqz v0, :cond_1

    .line 749
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->q:Z

    if-eqz v0, :cond_0

    .line 750
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lo/cha;->e(I)V

    goto :goto_0

    .line 752
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cha;->e(I)V

    goto :goto_0

    .line 755
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cha;->e(I)V

    .line 758
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->E:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/animation/AnimatorSet;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->G:Landroid/animation/AnimatorSet;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->j:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method private e(Ljava/lang/Float;ILcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Ljava/lang/String;
    .locals 3

    .line 487
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v2

    .line 488
    invoke-static {p2}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 489
    invoke-static {p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 490
    invoke-static {p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const v1, 0x800003

    invoke-virtual {v0, v1}, Lo/egb;->setGravity(I)V

    .line 491
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 492
    :cond_0
    const/16 v0, 0x10a

    if-eq p2, v0, :cond_1

    const/16 v0, 0x106

    if-ne p2, v0, :cond_2

    .line 493
    :cond_1
    invoke-static {p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 494
    invoke-static {p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const v1, 0x800003

    invoke-virtual {v0, v1}, Lo/egb;->setGravity(I)V

    .line 495
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 497
    :cond_2
    invoke-static {p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 498
    invoke-static {p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lo/egb;->setGravity(I)V

    .line 500
    :goto_0
    return-object v2
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cgt;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    return-object v0
.end method

.method private e()V
    .locals 18

    .line 349
    invoke-direct/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 350
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    return-void

    .line 354
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v6

    .line 355
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v7

    .line 356
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v9

    .line 357
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-static {v7, v8}, Lo/cds;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 359
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1, v9}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(DI)V

    .line 362
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cgl;->d(J)Ljava/lang/String;

    move-result-object v10

    .line 363
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 365
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->k(F)Ljava/lang/String;

    move-result-object v11

    .line 366
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 368
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->b(I)Ljava/lang/String;

    move-result-object v12

    .line 370
    const/16 v0, 0x104

    if-ne v9, v0, :cond_2

    .line 372
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_total_climbed:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 373
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v13, v0, v1

    .line 376
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 377
    float-to-double v0, v13

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v16

    .line 378
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v14

    .line 379
    move-wide/from16 v0, v16

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v15

    .line 380
    goto :goto_0

    .line 381
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 382
    float-to-double v0, v13

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v15

    .line 385
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v15}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 387
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const v1, 0x800003

    invoke-virtual {v0, v1}, Lo/egb;->setGravity(I)V

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v14}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 391
    goto/16 :goto_2

    :cond_2
    const/16 v0, 0x10a

    if-eq v9, v0, :cond_3

    const/16 v0, 0x106

    if-ne v9, v0, :cond_5

    .line 392
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v1

    invoke-static {v1}, Lo/cgl;->g(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 393
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 394
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const v1, 0x800003

    invoke-virtual {v0, v1}, Lo/egb;->setGravity(I)V

    .line 395
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 396
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    .line 397
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x64

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 396
    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 400
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    .line 401
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x64

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 400
    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 403
    :cond_5
    const/16 v0, 0x103

    if-ne v9, v0, :cond_7

    .line 404
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->c(F)Ljava/lang/String;

    move-result-object v13

    .line 405
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 406
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 408
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const v1, 0x800003

    invoke-virtual {v0, v1}, Lo/egb;->setGravity(I)V

    .line 409
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 412
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 415
    :goto_1
    goto :goto_2

    .line 416
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v11}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 419
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->g(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v12}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 421
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->h()Ljava/util/Map;

    move-result-object v13

    .line 423
    if-eqz v13, :cond_b

    .line 424
    invoke-interface {v13}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_8

    .line 425
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    move v4, v9

    move-object/from16 v1, p0

    iget-object v5, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;ZLjava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V

    goto/16 :goto_4

    .line 427
    :cond_8
    invoke-static {v13}, Lo/cdl;->c(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v14

    .line 428
    const/4 v0, 0x0

    aget-object v0, v14, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v9, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Ljava/lang/Float;ILcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Ljava/lang/String;

    move-result-object v15

    .line 429
    const/4 v0, 0x1

    aget-object v0, v14, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v9, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e(Ljava/lang/Float;ILcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Ljava/lang/String;

    move-result-object v16

    .line 430
    invoke-static {v9}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-static {v0}, Lo/cgl;->c(Lo/cgt;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 432
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-static {v0}, Lo/cgl;->b(Lo/cgt;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 433
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgl;->e(Lo/cgt;Z)Ljava/lang/String;

    move-result-object v16

    .line 434
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgl;->c(Lo/cgt;Z)Ljava/lang/String;

    move-result-object v15

    goto :goto_3

    .line 436
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->k(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->h(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 438
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->i(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 439
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 442
    :cond_a
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    move-object v2, v15

    move-object/from16 v3, v16

    move v4, v9

    move-object/from16 v1, p0

    iget-object v5, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static/range {v0 .. v5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;ZLjava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V

    .line 446
    :cond_b
    :goto_4
    if-eqz v13, :cond_c

    .line 447
    invoke-interface {v13}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_c

    .line 448
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_c

    .line 449
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_c

    .line 450
    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-ne v0, v1, :cond_d

    .line 451
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->u:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 456
    :cond_d
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 457
    sget-object v0, Lo/dae;->ht:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v15

    .line 458
    const-string v0, "sportId"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_e

    .line 460
    const-string v0, "startTime"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    const-string v0, "endTime"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    const-string v0, "sportTime"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    long-to-int v1, v1

    div-int/lit16 v1, v1, 0x3e8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    const-string v0, "distances"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    const-string v0, "calories"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    const-string v0, "totalSteps"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalSteps()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    const-string v0, "avgHeartRate"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    :cond_e
    const-string v0, "sportType"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    const-string v0, "trackType"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v15, v14, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 472
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z
    .locals 0

    .line 71
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->z:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e()V

    return-void
.end method

.method private f()Z
    .locals 2

    .line 790
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic g(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/AnimatorSet;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->G:Landroid/animation/AnimatorSet;

    return-object v0
.end method

.method private g()V
    .locals 1

    .line 762
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 763
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    invoke-interface {v0}, Lo/chc;->k()V

    goto :goto_0

    .line 764
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 765
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    invoke-interface {v0}, Lo/cha;->g()V

    .line 767
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/os/Handler;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g:Landroid/os/Handler;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 770
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r:Z

    .line 771
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 772
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r:Z

    invoke-interface {v0, v1}, Lo/chc;->e(Z)V

    goto :goto_1

    .line 773
    :cond_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 774
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d()V

    .line 776
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r:Z

    if-eqz v0, :cond_3

    .line 777
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->n:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_motionrecord_map_turnon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_2

    .line 779
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->n:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_motionrecord_map_turnoff:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 781
    :goto_2
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showOrHideMap click , show map is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->r:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    return-void
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private i()Z
    .locals 1

    .line 794
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->b()Lo/cew;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/LinearLayout;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private k()Z
    .locals 2

    .line 785
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic l(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->M:I

    return v0
.end method

.method static synthetic m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/AnimatorSet;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->F:Landroid/animation/AnimatorSet;

    return-object v0
.end method

.method private m()Z
    .locals 1

    .line 798
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

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

.method static synthetic n(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/Animator;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->D:Landroid/animation/Animator;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/content/Context;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->B:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/graphics/Bitmap;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->j:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->x:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->v:Z

    return v0
.end method

.method static synthetic t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cha;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->z:Z

    return v0
.end method

.method static synthetic v(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 548
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i:Lcom/amap/api/maps/MapView;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 549
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i:Lcom/amap/api/maps/MapView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/MapView;->setVisibility(I)V

    .line 551
    :cond_0
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation

    .line 865
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->I:Ljava/util/List;

    return-object v0
.end method

.method public c(Landroid/os/Handler;)V
    .locals 4

    .line 627
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 628
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareSportData() mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    return-void

    .line 631
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 632
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    invoke-interface {v0}, Lo/chc;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 633
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;

    invoke-direct {v0, p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Landroid/os/Handler;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 641
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    invoke-interface {v0}, Lo/chc;->e()V

    .line 642
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->b()Lo/cew;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/chc;->c(Landroid/os/Handler;Lo/cew;)V

    goto :goto_0

    .line 644
    :cond_2
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 645
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->w:I

    if-nez v0, :cond_3

    .line 646
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->b()Lo/cew;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/cha;->c(Landroid/os/Handler;Lo/cew;)V

    goto :goto_0

    .line 648
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Landroid/os/Handler;)V

    .line 651
    :cond_4
    :goto_0
    return-void
.end method

.method public c()Z
    .locals 2

    .line 861
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(I)V
    .locals 2

    .line 802
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->y:Z

    if-eqz v0, :cond_0

    .line 803
    return-void

    .line 805
    :cond_0
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->M:I

    .line 806
    if-nez p1, :cond_1

    .line 807
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->v:Z

    goto :goto_0

    .line 808
    :cond_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 809
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    invoke-interface {v0}, Lo/chc;->e()V

    .line 812
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->E:Z

    if-nez v0, :cond_3

    .line 813
    return-void

    .line 815
    :cond_3
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->w:I

    if-nez v0, :cond_4

    .line 816
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V

    invoke-interface {v0, v1}, Lo/cha;->a(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    .line 857
    :cond_4
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->w:I

    .line 858
    return-void
.end method

.method public e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;)V
    .locals 0

    .line 873
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    .line 874
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 702
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 703
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_showMap:I

    if-ne v0, v1, :cond_0

    .line 705
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h()V

    .line 706
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    .line 707
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_move_to_center:I

    if-ne v0, v1, :cond_1

    .line 708
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g()V

    .line 709
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveMapToCenter click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    .line 711
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_show_km_mi_markers:I

    if-ne v0, v1, :cond_6

    .line 712
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->s:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->s:Z

    .line 713
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 714
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->s:Z

    invoke-interface {v0, v1}, Lo/chc;->k(Z)V

    goto :goto_1

    .line 715
    :cond_3
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 716
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->s:Z

    invoke-interface {v0, v1}, Lo/cha;->e(Z)V

    .line 719
    :cond_4
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->s:Z

    if-eqz v0, :cond_5

    .line 720
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->u:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_map_traking_km_show:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_2

    .line 722
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->u:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_map_traking_km_hide:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 724
    :goto_2
    const-string v0, "type"

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 725
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_show_map_type_satellite:I

    if-ne v0, v1, :cond_a

    .line 726
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->q:Z

    if-nez v0, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->q:Z

    .line 727
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 728
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->q:Z

    invoke-interface {v0, v1}, Lo/chc;->c(Z)V

    goto :goto_4

    .line 730
    :cond_8
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d()V

    .line 732
    :goto_4
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->q:Z

    if-eqz v0, :cond_9

    .line 733
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_map_traking_show_satellite_map:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_5

    .line 735
    :cond_9
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_map_traking_show_normal_map:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 740
    :cond_a
    :goto_5
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    sget-object v2, Lo/dae;->hL:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 741
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 125
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    .line 128
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 129
    invoke-virtual {v4}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d()Lo/cgt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    .line 130
    invoke-virtual {v4}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->H:Landroid/view/View;

    .line 131
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    .line 132
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cgl;->e(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    goto :goto_0

    .line 135
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->y:Z

    .line 136
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 138
    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 139
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_map_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    goto :goto_1

    .line 141
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_google_map_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    .line 142
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->x:Ljava/util/concurrent/ExecutorService;

    .line 144
    :goto_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->C:Ljava/util/concurrent/ExecutorService;

    .line 146
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sport_data_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k:Landroid/widget/LinearLayout;

    .line 147
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_sport_title_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m:Landroid/widget/LinearLayout;

    .line 148
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_showMap:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->n:Landroid/widget/ImageButton;

    .line 149
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->n:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_move_to_center:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->p:Landroid/widget/ImageButton;

    .line 151
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->p:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_layout_map_share_control:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->o:Landroid/widget/LinearLayout;

    .line 153
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_londing:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->B:Landroid/widget/RelativeLayout;

    .line 154
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->A:Lhuawei/widget/HwProgressBar;

    .line 155
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->A:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_show_km_mi_markers:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->u:Landroid/widget/ImageButton;

    .line 158
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_btn_show_map_type_satellite:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t:Landroid/widget/ImageButton;

    .line 159
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->u:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;-><init>(Landroid/view/View;Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    .line 163
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_right_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/egb;

    .line 164
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->paceColorGradientView:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 166
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 167
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_pic_health_content:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v7

    .line 168
    if-eqz v7, :cond_2

    .line 169
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 171
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/high16 v1, 0x42900000    # 72.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/egb;->setMaxWidth(I)V

    .line 173
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 174
    const/16 v0, 0x11

    iput v0, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 175
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$b;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    :cond_3
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c(Landroid/os/Bundle;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->h:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 5

    .line 578
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 579
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->y:Z

    if-eqz v0, :cond_0

    .line 580
    return-void

    .line 583
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->C:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 584
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->C:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 586
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->x:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_2

    .line 587
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->x:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 589
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 590
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 594
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->G:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->G:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 595
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->G:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 596
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->G:Landroid/animation/AnimatorSet;

    .line 599
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->F:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->F:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 600
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->F:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 601
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->F:Landroid/animation/AnimatorSet;

    .line 604
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_7

    .line 605
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 606
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 608
    :cond_6
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->j:Landroid/graphics/Bitmap;

    .line 611
    :cond_7
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 612
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    invoke-interface {v0}, Lo/chc;->h()V

    goto :goto_0

    .line 613
    :cond_8
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 614
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    invoke-interface {v0}, Lo/cha;->d()V

    .line 615
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const-string v1, "google_temp.png"

    invoke-direct {v4, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 616
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 617
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_9

    .line 618
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete google temp error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    :cond_9
    :goto_0
    return-void
.end method

.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 5

    .line 924
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMapReady() isGaodeMap = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 925
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 926
    const-string v0, "Track_TrackScreenFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMapReady() mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->B:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 928
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->H:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 929
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    if-eqz v0, :cond_1

    .line 930
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->L:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    invoke-interface {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;->d()V

    .line 932
    :cond_1
    return-void

    .line 934
    :cond_2
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->l:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 935
    new-instance v0, Lo/chb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->e:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lo/chb;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    .line 936
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cha;->e(Landroid/os/Bundle;ZZ)V

    .line 937
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cha;->b(Z)V

    .line 938
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->b()Lo/cew;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/cha;->a(Lo/cew;)V

    .line 939
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->C:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$10;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 986
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->B:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 987
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->H:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 989
    :goto_1
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 555
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 556
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->y:Z

    if-eqz v0, :cond_0

    .line 557
    return-void

    .line 560
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c:Z

    if-eqz v0, :cond_1

    .line 561
    return-void

    .line 563
    :cond_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 564
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    invoke-interface {v0}, Lo/chc;->g()V

    goto :goto_0

    .line 565
    :cond_2
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 566
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    invoke-interface {v0}, Lo/cha;->a()V

    .line 568
    :cond_3
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 535
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 536
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->y:Z

    if-eqz v0, :cond_0

    .line 537
    return-void

    .line 539
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 540
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b:Lo/chc;

    invoke-interface {v0}, Lo/chc;->i()V

    goto :goto_0

    .line 541
    :cond_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 542
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d:Lo/cha;

    invoke-interface {v0}, Lo/cha;->b()V

    .line 545
    :cond_2
    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 530
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 531
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 572
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 574
    return-void
.end method
