.class public Lo/bwa;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/view/GestureDetector$OnDoubleTapListener;
.implements Landroid/view/GestureDetector$OnGestureListener;
.implements Lo/bwk$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwa$e;,
        Lo/bwa$d;
    }
.end annotation


# instance fields
.field public A:J

.field public B:Lo/bye;

.field public C:Lo/bwe;

.field public D:Lo/bwp;

.field public E:Z

.field public F:Lo/bvh;

.field public G:Lo/bus;

.field public H:I

.field public I:F

.field private J:Landroid/view/SurfaceHolder;

.field public K:J

.field public L:I

.field public M:I

.field private N:Landroid/content/Context;

.field private O:Lo/efy;

.field private P:I

.field private Q:Landroid/widget/ImageView;

.field private R:Z

.field private S:Landroid/widget/ImageView;

.field private T:Lo/bwc;

.field private U:Z

.field private V:Ljava/util/List;

.field private W:Landroid/view/animation/TranslateAnimation;

.field public a:Landroid/widget/ImageView;

.field private aa:Landroid/view/animation/TranslateAnimation;

.field private ab:F

.field private ac:Lo/bva;

.field private ad:[Ljava/lang/String;

.field private ae:Landroid/os/Handler;

.field private af:Landroid/view/GestureDetector;

.field private ag:Z

.field private ah:Z

.field private ai:I

.field private aj:Landroid/util/DisplayMetrics;

.field private ak:Landroid/widget/LinearLayout;

.field private al:I

.field private am:Ljava/lang/Runnable;

.field private an:Ljava/lang/Runnable;

.field private ao:F

.field private ap:I

.field private aq:Ljava/lang/String;

.field private ar:Landroid/os/Handler;

.field public b:Landroid/widget/ImageView;

.field public c:Lo/bvu;

.field public d:Landroid/view/SurfaceView;

.field public e:Landroid/widget/ImageView;

.field public f:Lo/byl;

.field public g:Lo/bwg;

.field public h:J

.field public i:Lo/bwg;

.field public j:J

.field public k:Lo/efy;

.field public l:Lo/bus;

.field public m:Lo/bvd;

.field public n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field

.field public o:Lo/bvu;

.field public p:Lo/bwa$d;

.field public q:Lo/bwi;

.field public r:Lo/bwt;

.field public s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field public t:Lo/bwr;

.field public u:I

.field public v:Landroid/widget/FrameLayout;

.field public w:Lo/efy;

.field public x:Landroid/widget/ImageView;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 798
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bwa;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 799
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 802
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bwa;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 803
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 807
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 112
    const-wide/16 v0, 0x64

    iput-wide v0, p0, Lo/bwa;->h:J

    .line 121
    new-instance v0, Lo/bwa$d;

    invoke-direct {v0}, Lo/bwa$d;-><init>()V

    iput-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    .line 134
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/bwa;->s:Ljava/util/List;

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwa;->U:Z

    .line 165
    new-instance v0, Lo/bux;

    invoke-direct {v0, p0}, Lo/bux;-><init>(Lo/bwa;)V

    iput-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    .line 166
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/bwa;->ad:[Ljava/lang/String;

    .line 179
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa;->L:I

    .line 194
    new-instance v0, Lo/bwa$e;

    invoke-direct {v0, p0}, Lo/bwa$e;-><init>(Lo/bwa;)V

    iput-object v0, p0, Lo/bwa;->ar:Landroid/os/Handler;

    .line 808
    iput-object p1, p0, Lo/bwa;->N:Landroid/content/Context;

    .line 809
    new-instance v0, Lo/bvw;

    iget-object v1, p0, Lo/bwa;->N:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/bvw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bwa;->c:Lo/bvu;

    .line 810
    new-instance v0, Lo/bus;

    iget-object v1, p0, Lo/bwa;->N:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/bus;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bwa;->G:Lo/bus;

    .line 811
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lo/bwa;->aj:Landroid/util/DisplayMetrics;

    .line 812
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lo/bwa;->aj:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 813
    iget-object v0, p0, Lo/bwa;->aj:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lo/bwa;->al:I

    .line 814
    iget-object v0, p0, Lo/bwa;->aj:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lo/bwa;->ai:I

    .line 816
    new-instance v0, Lo/bwa$12;

    invoke-direct {v0, p0}, Lo/bwa$12;-><init>(Lo/bwa;)V

    iput-object v0, p0, Lo/bwa;->am:Ljava/lang/Runnable;

    .line 824
    return-void
.end method

.method private K()V
    .locals 4

    .line 513
    invoke-static {p0}, Lo/buz;->e(Lo/bwa;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 514
    const/16 v0, 0xbe

    iput v0, p0, Lo/bwa;->u:I

    .line 515
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xbe

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 516
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0}, Lo/bwe;->c()V

    .line 517
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p0, v0}, Lo/bve;->a(Lo/bwa;I)V

    .line 518
    iget-boolean v0, p0, Lo/bwa;->U:Z

    if-eqz v0, :cond_0

    .line 520
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bvh;->d(I)Lo/bvx;

    goto :goto_0

    .line 522
    :cond_0
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iget-object v2, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {p0, v0, v1, v2}, Lo/bve;->b(Lo/bwa;ILcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 524
    :goto_0
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->m()Lo/bvz;

    .line 526
    :cond_1
    return-void
.end method

.method private O()V
    .locals 4

    .line 888
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwa;->R:Z

    .line 889
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    iget-object v1, p0, Lo/bwa;->ad:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bvu;->b([Ljava/lang/String;)Lo/bvz;

    .line 890
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMediaHelper.setSDSources(mMotionPath):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bwa;->ad:[Ljava/lang/String;

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    const/16 v0, 0xbe

    iput v0, p0, Lo/bwa;->u:I

    .line 892
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xbe

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 893
    iget v0, p0, Lo/bwa;->P:I

    invoke-direct {p0, v0}, Lo/bwa;->i(I)V

    .line 894
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p0, v0}, Lo/bve;->a(Lo/bwa;I)V

    .line 895
    invoke-direct {p0}, Lo/bwa;->R()V

    .line 896
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "afterHolderCreate -------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    new-instance v0, Lo/bwa$11;

    invoke-direct {v0, p0}, Lo/bwa$11;-><init>(Lo/bwa;)V

    iput-object v0, p0, Lo/bwa;->an:Ljava/lang/Runnable;

    .line 906
    iget-object v0, p0, Lo/bwa;->an:Ljava/lang/Runnable;

    const-wide/16 v1, 0xb9

    invoke-virtual {p0, v0, v1, v2}, Lo/bwa;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 907
    iget-object v0, p0, Lo/bwa;->r:Lo/bwt;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwt;->setVisibility(I)V

    .line 908
    iget-object v0, p0, Lo/bwa;->v:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 912
    iget v0, p0, Lo/bwa;->P:I

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lo/bwa;->P:I

    if-ltz v0, :cond_0

    .line 913
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget v2, p0, Lo/bwa;->P:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bus;->b(I)Lo/bvy;

    .line 916
    :cond_0
    iget-object v0, p0, Lo/bwa;->t:Lo/bwr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwr;->setVisibility(I)V

    .line 917
    return-void
.end method

.method private P()V
    .locals 3

    .line 529
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_lock:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwc;

    iput-object v0, p0, Lo/bwa;->T:Lo/bwc;

    .line 530
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_rl_show:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwe;

    iput-object v0, p0, Lo/bwa;->C:Lo/bwe;

    .line 531
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_caintro:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwp;

    iput-object v0, p0, Lo/bwa;->D:Lo/bwp;

    .line 532
    sget v0, Lcom/huawei/health/suggestion/R$id;->fl_animation:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bye;

    iput-object v0, p0, Lo/bwa;->B:Lo/bye;

    .line 534
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_rl_actiontools:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwr;

    iput-object v0, p0, Lo/bwa;->t:Lo/bwr;

    .line 535
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_coach_nums:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwa;->O:Lo/efy;

    .line 536
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tp:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwt;

    iput-object v0, p0, Lo/bwa;->r:Lo/bwt;

    .line 537
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_next:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwa;->e:Landroid/widget/ImageView;

    .line 538
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_pause:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwa;->a:Landroid/widget/ImageView;

    .line 539
    sget v0, Lcom/huawei/health/suggestion/R$id;->sfv:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    iput-object v0, p0, Lo/bwa;->d:Landroid/view/SurfaceView;

    .line 540
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_voice_change:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwa;->Q:Landroid/widget/ImageView;

    .line 541
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_pre:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwa;->b:Landroid/widget/ImageView;

    .line 542
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_second:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwa;->k:Lo/efy;

    .line 543
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_mp_progress:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwg;

    iput-object v0, p0, Lo/bwa;->g:Lo/bwg;

    .line 544
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_bottom_progress:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwg;

    iput-object v0, p0, Lo/bwa;->i:Lo/bwg;

    .line 545
    sget v0, Lcom/huawei/health/suggestion/R$id;->brightorvolumeprogressplus_setting:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byl;

    iput-object v0, p0, Lo/bwa;->f:Lo/byl;

    .line 546
    iget-object v0, p0, Lo/bwa;->i:Lo/bwg;

    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->color_88000000:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bwg;->setProgBgColor(I)V

    .line 547
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_device_heartrate_layout:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lo/bwa;->v:Landroid/widget/FrameLayout;

    .line 548
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_device_heartrate_bg:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwa;->x:Landroid/widget/ImageView;

    .line 549
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_device_heartrate_txt:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwa;->w:Lo/efy;

    .line 550
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_lock:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwa;->S:Landroid/widget/ImageView;

    .line 558
    iget-object v0, p0, Lo/bwa;->d:Landroid/view/SurfaceView;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setTag(Ljava/lang/Object;)V

    .line 559
    invoke-direct {p0}, Lo/bwa;->Q()V

    .line 560
    return-void
.end method

.method private Q()V
    .locals 2

    .line 563
    invoke-direct {p0}, Lo/bwa;->S()V

    .line 564
    iget-object v0, p0, Lo/bwa;->e:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$20;

    invoke-direct {v1, p0}, Lo/bwa$20;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 570
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 571
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 573
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->m:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$16;

    invoke-direct {v1, p0}, Lo/bwa$16;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 581
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 582
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->e:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 583
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->h:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 587
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->a:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$18;

    invoke-direct {v1, p0}, Lo/bwa$18;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 593
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->d:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$19;

    invoke-direct {v1, p0}, Lo/bwa$19;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 600
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/bwa$25;

    invoke-direct {v1, p0}, Lo/bwa$25;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 610
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0}, Lo/bwe;->b()Lo/bwt;

    move-result-object v0

    new-instance v1, Lo/bwa$22;

    invoke-direct {v1, p0}, Lo/bwa$22;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Lo/bwt;->b(Lo/bwt$a;)V

    .line 618
    iget-object v0, p0, Lo/bwa;->Q:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$21;

    invoke-direct {v1, p0}, Lo/bwa$21;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 626
    iget-object v0, p0, Lo/bwa;->T:Lo/bwc;

    new-instance v1, Lo/bwa$2;

    invoke-direct {v1, p0}, Lo/bwa$2;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Lo/bwc;->a(Lo/bwf;)V

    .line 646
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0, p0}, Lo/bwe;->d(Lo/bwk$c;)V

    .line 647
    return-void
.end method

.method private R()V
    .locals 5

    .line 921
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->i()Lo/bvz;

    .line 922
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---initFirstMotion--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa;->n:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v3}, Lo/bvu;->t()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 924
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0, v1}, Lo/bvh;->a(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    .line 925
    return-void
.end method

.method private S()V
    .locals 2

    .line 650
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    new-instance v1, Lo/bwa$5;

    invoke-direct {v1, p0}, Lo/bwa$5;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Lo/bwp;->setOnSlidingListener(Lo/bwf;)V

    .line 668
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lo/bwa$3;

    invoke-direct {v1, p0}, Lo/bwa$3;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 675
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lo/bwa$1;

    invoke-direct {v1, p0}, Lo/bwa$1;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 683
    iget-object v0, p0, Lo/bwa;->S:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$10;

    invoke-direct {v1, p0}, Lo/bwa$10;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 691
    iget-object v0, p0, Lo/bwa;->a:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$9;

    invoke-direct {v1, p0}, Lo/bwa$9;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 698
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachiv_close:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lo/bwa$6;

    invoke-direct {v1, p0}, Lo/bwa$6;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 705
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_rl_coach_guide:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lo/bwa$8;

    invoke-direct {v1, p0}, Lo/bwa$8;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 725
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    iget-object v0, v0, Lo/bwp;->b:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$7;

    invoke-direct {v1, p0}, Lo/bwa$7;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 733
    iget-object v0, p0, Lo/bwa;->b:Landroid/widget/ImageView;

    new-instance v1, Lo/bwa$15;

    invoke-direct {v1, p0}, Lo/bwa$15;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 739
    return-void
.end method

.method private T()V
    .locals 3

    .line 1081
    invoke-virtual {p0}, Lo/bwa;->d()V

    .line 1085
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    invoke-virtual {p0, v0}, Lo/bwa;->a(Landroid/view/View;)V

    .line 1086
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xc2

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1087
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bwa;->n:Ljava/util/List;

    .line 1088
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 1087
    invoke-virtual {v0, v1, v2}, Lo/bwp;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1089
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lo/bwa;->g(I)V

    .line 1090
    return-void
.end method

.method private U()V
    .locals 2

    .line 978
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbf

    if-ne v0, v1, :cond_0

    .line 979
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    invoke-virtual {v0}, Lo/bus;->h()Lo/bvy;

    .line 980
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->a()Lo/bvx;

    .line 981
    iget-object v0, p0, Lo/bwa;->m:Lo/bvd;

    invoke-virtual {v0}, Lo/bvd;->b()Lo/bvv;

    .line 982
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    const/16 v1, 0x99

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 983
    iget v0, p0, Lo/bwa;->H:I

    int-to-long v0, v0

    iput-wide v0, p0, Lo/bwa;->K:J

    goto :goto_0

    .line 984
    :cond_0
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbe

    if-ne v0, v1, :cond_1

    .line 985
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->a()Lo/bvx;

    .line 987
    :cond_1
    :goto_0
    return-void
.end method

.method private V()V
    .locals 4

    .line 1006
    const-string v0, "CoachView"

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "allContinue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ",mIsPlaying="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/bwa;->ag:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, ",holderCreated="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/bwa;->R:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, ",mCoachState.acquireStation()="

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, ",mSurfaceDestroyed="

    const/4 v3, 0x7

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/bwa;->ah:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1007
    iget-boolean v0, p0, Lo/bwa;->ag:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo/bwa;->R:Z

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->b()I

    move-result v1

    iget-boolean v2, p0, Lo/bwa;->ah:Z

    invoke-static {v0, v1, v2}, Lo/bve;->a(ZIZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1008
    invoke-virtual {p0}, Lo/bwa;->i()V

    .line 1009
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwa;->ag:Z

    .line 1011
    :cond_0
    return-void
.end method

.method private W()V
    .locals 2

    .line 1065
    iget-object v0, p0, Lo/bwa;->T:Lo/bwc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwc;->setVisibility(I)V

    .line 1066
    iget-object v0, p0, Lo/bwa;->t:Lo/bwr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwr;->setVisibility(I)V

    .line 1067
    return-void
.end method

.method private X()V
    .locals 6

    .line 929
    const-string v0, "voicecoachviewcount"

    invoke-static {v0}, Lo/bve;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 930
    const-string v0, "voicecoachviewbg"

    invoke-static {v0}, Lo/bve;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 931
    const-string v0, "voicecoachviewguide"

    invoke-static {v0}, Lo/bve;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 932
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/bwa;->I:F

    .line 933
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    iget v1, p0, Lo/bwa;->I:F

    invoke-virtual {v0, v1}, Lo/bus;->d(F)V

    .line 934
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bvh;->d(F)V

    .line 935
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bvu;->d(F)V

    .line 936
    return-void
.end method

.method private Y()Z
    .locals 2

    .line 1149
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbe

    if-eq v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbf

    if-ne v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private Z()Lcom/huawei/health/suggestion/ui/fitness/module/Motion;
    .locals 7
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 1178
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4fdd\u5b58\u52a8\u4f5c\u8bad\u7ec3\u8fdb\u5ea6\uff0c\u5f53\u524d\u52a8\u4f5c\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v3}, Lo/bwa$d;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u5f53\u524d\u7ec4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa;->p:Lo/bwa$d;

    .line 1179
    invoke-virtual {v3}, Lo/bwa$d;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u5f53\u524d\u8282\u62cd\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v3}, Lo/bwa$d;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1178
    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1180
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 1183
    const/4 v5, 0x0

    .line 1184
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->c()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v1

    mul-int/2addr v0, v1

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->e()I

    move-result v1

    add-int v5, v0, v1

    .line 1185
    iget-boolean v0, p0, Lo/bwa;->z:Z

    if-eqz v0, :cond_0

    const-string v0, "timer"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1186
    add-int/lit8 v5, v5, -0x1

    .line 1189
    :cond_0
    int-to-float v0, v5

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v1

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v2

    mul-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    div-float v6, v0, v1

    .line 1190
    invoke-static {p0, v6}, Lo/bve;->a(Lo/bwa;F)V

    .line 1192
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireProgress()I

    move-result v0

    if-le v5, v0, :cond_1

    .line 1193
    invoke-virtual {v4, v5}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveProgress(I)V

    .line 1196
    :cond_1
    return-object v4
.end method

.method static synthetic a(Lo/bwa;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lo/bwa;->K()V

    return-void
.end method

.method private aa()V
    .locals 4

    .line 1270
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0}, Lo/bwe;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1271
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwe;->setVisibility(I)V

    .line 1273
    :cond_0
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->r()V

    .line 1274
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwa$d;->a(I)V

    .line 1275
    invoke-virtual {p0}, Lo/bwa;->f()V

    .line 1277
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->k()V

    .line 1278
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 1279
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/bwa$d;->b(I)V

    .line 1280
    return-void

    .line 1281
    :cond_1
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 1282
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0, v1}, Lo/bvh;->e(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    goto :goto_0

    .line 1284
    :cond_2
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0, v1}, Lo/bvh;->c(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    .line 1286
    :goto_0
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u624b\u52a8\u5207\u6362\u5230\u4e0b\u4e00\u4e2a\u52a8\u4f5c,\u5f53\u524d\u6267\u884c\u52a8\u4f5c\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v3}, Lo/bwa$d;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1287
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->n()Lo/bvz;

    .line 1289
    const/16 v0, 0xbe

    iput v0, p0, Lo/bwa;->u:I

    .line 1290
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xbe

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1291
    invoke-virtual {p0}, Lo/bwa;->h()V

    .line 1292
    return-void
.end method

.method private ab()V
    .locals 2

    .line 1140
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc2

    if-ne v0, v1, :cond_0

    .line 1141
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    invoke-direct {p0, v0}, Lo/bwa;->e(Landroid/view/View;)V

    goto :goto_0

    .line 1143
    :cond_0
    invoke-direct {p0}, Lo/bwa;->ah()V

    .line 1145
    :goto_0
    return-void
.end method

.method private ac()V
    .locals 4

    .line 1240
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0}, Lo/bwe;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1241
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwe;->setVisibility(I)V

    .line 1243
    :cond_0
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwa$d;->a(I)V

    .line 1244
    invoke-virtual {p0}, Lo/bwa;->f()V

    .line 1246
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->a()V

    .line 1247
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    if-gez v0, :cond_1

    .line 1248
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwa$d;->b(I)V

    .line 1249
    return-void

    .line 1250
    :cond_1
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    if-nez v0, :cond_2

    .line 1252
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0, v1}, Lo/bvh;->a(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    goto :goto_0

    .line 1255
    :cond_2
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0, v1}, Lo/bvh;->b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    .line 1257
    :goto_0
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u624b\u52a8\u5207\u6362\u5230 \u4e0a\u4e00\u4e2a\u52a8\u4f5c,\u5f53\u524d\u6267\u884c\u52a8\u4f5c\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v3}, Lo/bwa$d;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1258
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->p()Lo/bvz;

    .line 1260
    const/16 v0, 0xbe

    iput v0, p0, Lo/bwa;->u:I

    .line 1261
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xbe

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1262
    invoke-virtual {p0}, Lo/bwa;->h()V

    .line 1263
    return-void
.end method

.method private ae()V
    .locals 2

    .line 1298
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xc3

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1299
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0}, Lo/bwe;->d()V

    .line 1300
    invoke-virtual {p0}, Lo/bwa;->d()V

    .line 1301
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->l()Lo/bvz;

    .line 1302
    return-void
.end method

.method private ah()V
    .locals 2

    .line 1322
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    iget v1, p0, Lo/bwa;->u:I

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1324
    invoke-virtual {p0}, Lo/bwa;->i()V

    .line 1325
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwe;->setVisibility(I)V

    .line 1326
    return-void
.end method

.method static synthetic b(Lo/bwa;)Landroid/widget/ImageView;
    .locals 1

    .line 99
    iget-object v0, p0, Lo/bwa;->S:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b(Landroid/widget/ImageView;Z)V
    .locals 4

    .line 1113
    invoke-virtual {p1}, Landroid/widget/ImageView;->getAlpha()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 1114
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1115
    iget-object v0, p0, Lo/bwa;->B:Lo/bye;

    invoke-virtual {v0}, Lo/bye;->c()V

    .line 1116
    iget-object v0, p0, Lo/bwa;->ar:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1117
    iget-object v0, p0, Lo/bwa;->t:Lo/bwr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwr;->setIsShowBottomProgress(Z)V

    .line 1118
    if-eqz p2, :cond_0

    .line 1119
    invoke-direct {p0}, Lo/bwa;->ac()V

    .line 1120
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0a\u4e00\u4e2a\u52a8\u4f5c\u5207\u6362"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1122
    :cond_0
    invoke-direct {p0}, Lo/bwa;->aa()V

    .line 1123
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0b\u4e00\u4e2a\u52a8\u4f5c\u5207\u6362"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Z)V
    .locals 6

    .line 1094
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getCurrentIndex()I

    move-result v5

    .line 1095
    invoke-direct {p0, p1, v5}, Lo/bwa;->d(ZI)I

    move-result v5

    .line 1096
    invoke-direct {p0, v5}, Lo/bwa;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1097
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    const-string v1, "%d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwp;->setCurrentIndex(Ljava/lang/String;)V

    .line 1098
    add-int/lit8 v0, v5, -0x1

    invoke-direct {p0, v0}, Lo/bwa;->g(I)V

    .line 1100
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/bwa;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lo/bwa;->ae()V

    return-void
.end method

.method static synthetic c(Lo/bwa;Z)V
    .locals 0

    .line 99
    invoke-direct {p0, p1}, Lo/bwa;->e(Z)V

    return-void
.end method

.method private d(ZI)I
    .locals 1

    .line 1103
    if-eqz p1, :cond_0

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 1104
    :goto_0
    return p2
.end method

.method private d(Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;Ljava/util/List;)V"
        }
    .end annotation

    .line 1408
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/Comment;

    .line 1409
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireTime()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireTime()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 1410
    :goto_1
    iget-object v0, p0, Lo/bwa;->s:Ljava/util/List;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1411
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6307\u5bfc\u8bed\u97f3 Times: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1412
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1413
    goto :goto_0

    .line 1414
    :cond_1
    return-void
.end method

.method static synthetic d(Lo/bwa;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lo/bwa;->ah()V

    return-void
.end method

.method static synthetic d(Lo/bwa;Landroid/widget/ImageView;Z)V
    .locals 0

    .line 99
    invoke-direct {p0, p1, p2}, Lo/bwa;->b(Landroid/widget/ImageView;Z)V

    return-void
.end method

.method static synthetic d(Lo/bwa;Z)V
    .locals 0

    .line 99
    invoke-direct {p0, p1}, Lo/bwa;->b(Z)V

    return-void
.end method

.method static synthetic e(Lo/bwa;)Lo/bwc;
    .locals 1

    .line 99
    iget-object v0, p0, Lo/bwa;->T:Lo/bwc;

    return-object v0
.end method

.method private e(Landroid/view/View;)V
    .locals 9

    .line 1542
    iget-object v0, p0, Lo/bwa;->aa:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1543
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lo/bwa;->aa:Landroid/view/animation/TranslateAnimation;

    .line 1545
    iget-object v0, p0, Lo/bwa;->aa:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 1546
    iget-object v0, p0, Lo/bwa;->aa:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1547
    iget-object v0, p0, Lo/bwa;->aa:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Lo/bwa$14;

    invoke-direct {v1, p0, p1}, Lo/bwa$14;-><init>(Lo/bwa;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1564
    :cond_0
    iget-object v0, p0, Lo/bwa;->aa:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1565
    return-void
.end method

.method private e(Lo/dgj;)V
    .locals 2

    .line 377
    iget-object v0, p0, Lo/bwa;->N:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lo/bwa$4;

    invoke-direct {v1, p0, p1}, Lo/bwa$4;-><init>(Lo/bwa;Lo/dgj;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 391
    return-void
.end method

.method private e(Z)V
    .locals 2

    .line 1071
    if-eqz p1, :cond_0

    .line 1072
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->p()Lo/bvz;

    goto :goto_0

    .line 1074
    :cond_0
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->n()Lo/bvz;

    .line 1076
    :goto_0
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->c:Lo/efy;

    iget-object v1, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v1}, Lo/bvu;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1077
    return-void
.end method

.method static synthetic f(Lo/bwa;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lo/bwa;->W()V

    return-void
.end method

.method private g(I)V
    .locals 5

    .line 1335
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 1336
    :cond_0
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMoions is null or currPosition is invalid: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1337
    return-void

    .line 1339
    :cond_1
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 1340
    iget-object v0, p0, Lo/bwa;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1341
    iget-object v0, p0, Lo/bwa;->V:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1342
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCovers()Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1343
    iget-object v0, p0, Lo/bwa;->V:Ljava/util/List;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCovers()Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1345
    :cond_2
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p0, p1, v0}, Lo/bve;->b(Lo/bwa;II)V

    .line 1346
    iget-object v0, p0, Lo/bwa;->ac:Lo/bva;

    invoke-virtual {v0}, Lo/bva;->notifyDataSetChanged()V

    .line 1347
    return-void
.end method

.method private i(I)V
    .locals 6

    .line 1482
    const-string v4, ""

    .line 1483
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1484
    const-string v0, "%d%s%d %s  "

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "/"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    add-int/lit8 v2, p1, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 1487
    :cond_0
    const-string v0, "%d%s%d %s  "

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "/"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1489
    :goto_0
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v1

    invoke-static {v0, v1}, Lo/bve;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    .line 1490
    iget-object v0, p0, Lo/bwa;->O:Lo/efy;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1491
    return-void
.end method

.method static synthetic k(Lo/bwa;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lo/bwa;->T()V

    return-void
.end method

.method private k(I)Z
    .locals 1

    .line 1108
    if-lez p1, :cond_0

    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public A()Lo/bwg;
    .locals 1

    .line 1741
    iget-object v0, p0, Lo/bwa;->i:Lo/bwg;

    return-object v0
.end method

.method public B()Lo/bwp;
    .locals 1

    .line 1745
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    return-object v0
.end method

.method public C()Z
    .locals 1

    .line 1749
    iget-boolean v0, p0, Lo/bwa;->z:Z

    return v0
.end method

.method public D()Lo/bvu;
    .locals 1

    .line 1729
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    return-object v0
.end method

.method public E()Lo/bvh;
    .locals 1

    .line 1753
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    return-object v0
.end method

.method public F()Lo/bwi;
    .locals 1

    .line 1757
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    return-object v0
.end method

.method public G()Lo/bwt;
    .locals 1

    .line 1765
    iget-object v0, p0, Lo/bwa;->r:Lo/bwt;

    return-object v0
.end method

.method public H()Lo/bwg;
    .locals 1

    .line 1761
    iget-object v0, p0, Lo/bwa;->g:Lo/bwg;

    return-object v0
.end method

.method public I()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1777
    iget-object v0, p0, Lo/bwa;->s:Ljava/util/List;

    return-object v0
.end method

.method public J()Lo/bvd;
    .locals 1

    .line 1781
    iget-object v0, p0, Lo/bwa;->m:Lo/bvd;

    return-object v0
.end method

.method public L()Z
    .locals 1

    .line 1797
    iget-boolean v0, p0, Lo/bwa;->y:Z

    return v0
.end method

.method public M()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation

    .line 1789
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    return-object v0
.end method

.method public N()Lo/bvu;
    .locals 1

    .line 1785
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    return-object v0
.end method

.method public a()V
    .locals 4

    .line 763
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter OnDisDeviceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    iget-boolean v0, p0, Lo/bwa;->z:Z

    if-eqz v0, :cond_1

    .line 765
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbf

    if-ne v0, v1, :cond_0

    .line 766
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter OnDisDeviceConnected BEATING"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    invoke-virtual {p0}, Lo/bwa;->n()V

    .line 768
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwa;->y:Z

    .line 769
    iget-object v0, p0, Lo/bwa;->m:Lo/bvd;

    invoke-virtual {v0}, Lo/bvd;->c()Lo/bvv;

    .line 770
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0xfa0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bwa;->j:J

    .line 771
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    const/16 v1, 0x99

    const-wide/16 v2, 0xfa0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 773
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwa;->y:Z

    .line 776
    :cond_1
    :goto_0
    return-void
.end method

.method public a(I)V
    .locals 7

    .line 1392
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5237\u65b0\u6307\u5bfc\u8bed\u97f3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1393
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-gez p1, :cond_1

    .line 1394
    :cond_0
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMoions is null or startposition is invalid: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1395
    return-void

    .line 1397
    :cond_1
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 1398
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCommentaryTraining()Ljava/util/List;

    move-result-object v5

    .line 1399
    invoke-static {v5}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1400
    iget-object v0, p0, Lo/bwa;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1401
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1402
    invoke-direct {p0, v5, v6}, Lo/bwa;->d(Ljava/util/List;Ljava/util/List;)V

    .line 1403
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0, v6}, Lo/bvh;->e(Ljava/util/List;)Lo/bvz;

    move-result-object v0

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lo/bvz;->a(I)V

    .line 1405
    :cond_2
    return-void
.end method

.method public a(IZ)V
    .locals 4

    .line 339
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "applyAnimation-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    if-eqz p2, :cond_1

    .line 341
    const/4 v0, 0x1

    if-gt v0, p1, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    .line 342
    iget-object v0, p0, Lo/bwa;->B:Lo/bye;

    invoke-virtual {v0, p1}, Lo/bye;->b(I)V

    goto :goto_0

    .line 344
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 345
    iget-object v0, p0, Lo/bwa;->B:Lo/bye;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bye;->b(I)V

    .line 346
    iget-object v0, p0, Lo/bwa;->B:Lo/bye;

    invoke-virtual {v0}, Lo/bye;->b()V

    goto :goto_0

    .line 350
    :cond_1
    iget-object v0, p0, Lo/bwa;->B:Lo/bye;

    invoke-virtual {v0}, Lo/bye;->d()V

    .line 352
    :cond_2
    :goto_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 9

    .line 1606
    iget-object v0, p0, Lo/bwa;->W:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1607
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lo/bwa;->W:Landroid/view/animation/TranslateAnimation;

    .line 1609
    iget-object v0, p0, Lo/bwa;->W:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1610
    iget-object v0, p0, Lo/bwa;->W:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 1611
    iget-object v0, p0, Lo/bwa;->W:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Lo/bwa$17;

    invoke-direct {v1, p0, p1}, Lo/bwa$17;-><init>(Lo/bwa;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1628
    :cond_0
    iget-object v0, p0, Lo/bwa;->W:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1629
    return-void
.end method

.method public a(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 4

    .line 1202
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    const/16 v1, 0x99

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1203
    iget-wide v0, p0, Lo/bwa;->A:J

    iget v2, p0, Lo/bwa;->H:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bwa;->A:J

    .line 1204
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa;->H:I

    .line 1205
    iget-wide v0, p0, Lo/bwa;->A:J

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    iput-wide v0, p0, Lo/bwa;->A:J

    .line 1206
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa;->M:I

    .line 1207
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e00\u7ec4\u52a8\u4f5c\u7ed3\u675f\u3002"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1208
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/bvh;->a(I)V

    .line 1211
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwa$d;->d(I)V

    .line 1212
    iget-object v0, p0, Lo/bwa;->r:Lo/bwt;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwt;->setVisibility(I)V

    .line 1213
    iget-object v0, p0, Lo/bwa;->v:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1214
    invoke-static {p0, p1}, Lo/bve;->d(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 1215
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwa;->U:Z

    .line 1216
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1671
    iput-object p1, p0, Lo/bwa;->aq:Ljava/lang/String;

    .line 1672
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0, p1}, Lo/bvu;->e(Ljava/lang/String;)V

    .line 1673
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0, p1}, Lo/bvu;->e(Ljava/lang/String;)V

    .line 1674
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    invoke-virtual {v0, p1}, Lo/bus;->e(Ljava/lang/String;)V

    .line 1675
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0, p1}, Lo/bvh;->e(Ljava/lang/String;)V

    .line 1676
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    invoke-virtual {v0, p1}, Lo/bus;->e(Ljava/lang/String;)V

    .line 1677
    iget-object v0, p0, Lo/bwa;->m:Lo/bvd;

    invoke-virtual {v0, p1}, Lo/bvd;->e(Ljava/lang/String;)V

    .line 1678
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 1769
    iput-boolean p1, p0, Lo/bwa;->E:Z

    .line 1770
    return-void
.end method

.method public b(Landroid/content/Context;)I
    .locals 7

    .line 260
    const/4 v4, 0x0

    .line 261
    const/4 v5, 0x0

    .line 263
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness_mode"

    invoke-static {v0, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v5

    .line 264
    if-nez v5, :cond_0

    .line 265
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness"

    invoke-static {v0, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    goto :goto_0

    .line 267
    :cond_0
    const/16 v4, 0x7f

    .line 271
    :goto_0
    goto :goto_1

    .line 269
    :catch_0
    move-exception v6

    .line 270
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSystemBrightness SettingNotFoundException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :goto_1
    return v4
.end method

.method public b()V
    .locals 14

    .line 486
    iget-object v0, p0, Lo/bwa;->r:Lo/bwt;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/bwt;->setAutoProgress(I)V

    .line 487
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->k()Lo/bvz;

    .line 490
    const/16 v0, 0xc1

    iput v0, p0, Lo/bwa;->u:I

    .line 491
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xc1

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 493
    const/4 v10, 0x0

    .line 494
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    .line 495
    const/4 v10, 0x1

    .line 497
    :cond_0
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 498
    invoke-virtual {p0}, Lo/bwa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_string_default:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 499
    invoke-static {v11, v12}, Lo/bve;->d(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 501
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGap()I

    move-result v13

    .line 502
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    move v1, v13

    move v2, v10

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v3

    .line 503
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    iget v7, p0, Lo/bwa;->ab:F

    .line 504
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCalorie()F

    move-result v8

    mul-float/2addr v7, v8

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v8

    mul-float/2addr v7, v8

    const/high16 v8, 0x447a0000    # 1000.0f

    div-float/2addr v7, v8

    invoke-static {v7}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    .line 503
    invoke-static {v4, v5, v6}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 505
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/health/suggestion/R$string;->sug_fitcoach_sec:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v8

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8}, Lo/bzr;->f(F)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    invoke-static {v5, v6, v7}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object v6, v12

    .line 506
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquirePicUrl()Ljava/lang/String;

    move-result-object v7

    .line 502
    invoke-virtual/range {v0 .. v7}, Lo/bwe;->e(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1717
    iput p1, p0, Lo/bwa;->M:I

    .line 1718
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1793
    iput-wide p1, p0, Lo/bwa;->j:J

    .line 1794
    return-void
.end method

.method public b(Lo/bwi;)V
    .locals 0

    .line 1477
    iput-object p1, p0, Lo/bwa;->q:Lo/bwi;

    .line 1478
    return-void
.end method

.method public c(Ljava/lang/String;)Lo/bwa;
    .locals 1

    .line 1431
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0, p1}, Lo/bvu;->c(Ljava/lang/String;)Lo/bvz;

    .line 1432
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->t()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1433
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->i()Lo/bvz;

    .line 1435
    :cond_0
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v0, v0, Lo/bwe;->c:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1436
    return-object p0
.end method

.method public c()V
    .locals 4

    .line 355
    iget-object v0, p0, Lo/bwa;->r:Lo/bwt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwt;->setVisibility(I)V

    .line 356
    iget-object v0, p0, Lo/bwa;->r:Lo/bwt;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/16 v3, 0x12c

    invoke-static {v0, v1, v2, v3}, Lo/byb;->d(Landroid/view/View;FFI)V

    .line 357
    iget-boolean v0, p0, Lo/bwa;->z:Z

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lo/bwa;->v:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 359
    iget-object v0, p0, Lo/bwa;->v:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/16 v3, 0x12c

    invoke-static {v0, v1, v2, v3}, Lo/byb;->d(Landroid/view/View;FFI)V

    .line 361
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1773
    iput p1, p0, Lo/bwa;->u:I

    .line 1774
    return-void
.end method

.method public c(Lo/dgj;)V
    .locals 4

    .line 364
    if-nez p1, :cond_0

    .line 365
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postureResult is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    return-void

    .line 368
    :cond_0
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postureResult:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dgj;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    invoke-virtual {p1}, Lo/dgj;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 370
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Motion ID is wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    return-void

    .line 373
    :cond_1
    invoke-direct {p0, p1}, Lo/bwa;->e(Lo/dgj;)V

    .line 374
    return-void
.end method

.method public d()V
    .locals 4

    .line 951
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "_allPause()--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 952
    iget-object v0, p0, Lo/bwa;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 953
    iget-object v0, p0, Lo/bwa;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_fitness_play_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 955
    :cond_0
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    .line 956
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->k()Lo/bvz;

    .line 957
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->k()Lo/bvz;

    .line 958
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc1

    if-ne v0, v1, :cond_1

    .line 959
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0}, Lo/bwe;->b()Lo/bwt;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwt;->b()Lo/bwt;

    goto :goto_0

    .line 961
    :cond_1
    invoke-direct {p0}, Lo/bwa;->U()V

    .line 962
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 963
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/bwi;->c(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 967
    :cond_2
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1693
    invoke-static {p0, p1}, Lo/bve;->c(Lo/bwa;I)V

    .line 1694
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 1737
    iput-wide p1, p0, Lo/bwa;->K:J

    .line 1738
    return-void
.end method

.method public d(Landroid/view/View;Z)V
    .locals 5

    .line 316
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 318
    if-nez v4, :cond_0

    .line 319
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    iget-object v1, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v1, v1, Lo/bwe;->b:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v0, p2, v1}, Lo/buz;->b(Lo/bvu;ZF)V

    .line 320
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "change mBeatHelper"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 321
    :cond_0
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 322
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v1, v1, Lo/bwe;->e:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v0, p2, v1}, Lo/buz;->b(Lo/bvu;ZF)V

    .line 323
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "change mGuiderhelper"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 325
    :cond_1
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    iget-object v1, p0, Lo/bwa;->C:Lo/bwe;

    iget-object v1, v1, Lo/bwe;->h:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v0, p2, v1}, Lo/buz;->b(Lo/bvu;ZF)V

    .line 326
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "change mBgHelper"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    :goto_0
    return-void
.end method

.method public d(Z)V
    .locals 2

    .line 1660
    if-eqz p1, :cond_0

    .line 1661
    sget v0, Lcom/huawei/health/suggestion/R$id;->viewstub:I

    invoke-virtual {p0, v0}, Lo/bwa;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bwa;->ak:Landroid/widget/LinearLayout;

    goto :goto_0

    .line 1664
    :cond_0
    iget-object v0, p0, Lo/bwa;->ak:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 1665
    iget-object v0, p0, Lo/bwa;->ak:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1668
    :cond_1
    :goto_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 331
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResume==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/bwa;->ah:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lo/bwa;->ac:Lo/bva;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lo/bwa;->ac:Lo/bva;

    invoke-virtual {v0}, Lo/bva;->notifyDataSetChanged()V

    .line 335
    :cond_0
    invoke-direct {p0}, Lo/bwa;->V()V

    .line 336
    return-void
.end method

.method public e(I)V
    .locals 5

    .line 1697
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->e()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 1698
    const-string v0, "CoachView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MotionComplete value is wrong:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1699
    return-void

    .line 1701
    :cond_0
    invoke-static {p0, p1}, Lo/buz;->c(Lo/bwa;I)I

    move-result v4

    .line 1702
    if-nez v4, :cond_1

    .line 1703
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "complete is not add!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1704
    return-void

    .line 1706
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/bwa;->j:J

    .line 1707
    iget-wide v0, p0, Lo/bwa;->K:J

    iget-object v2, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v3, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v3}, Lo/bwa$d;->d()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireInterval()I

    move-result v2

    mul-int/2addr v2, v4

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bwa;->K:J

    .line 1708
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    iget-object v1, p0, Lo/bwa;->l:Lo/bus;

    invoke-virtual {v1}, Lo/bus;->o()I

    move-result v1

    add-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/bus;->a(I)V

    .line 1709
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    const/16 v1, 0x99

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1710
    return-void
.end method

.method public e(Lo/dgl;)V
    .locals 4

    .line 394
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postureReminder: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dgl;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    invoke-virtual {p1}, Lo/dgl;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 397
    :sswitch_0
    invoke-virtual {p1}, Lo/dgl;->d()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_0

    .line 399
    :sswitch_1
    iget-object v0, p0, Lo/bwa;->m:Lo/bvd;

    invoke-virtual {v0}, Lo/bvd;->e()Lo/bvv;

    .line 400
    goto :goto_1

    .line 402
    :sswitch_2
    iget-object v0, p0, Lo/bwa;->N:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lo/bwa$13;

    invoke-direct {v1, p0}, Lo/bwa$13;-><init>(Lo/bwa;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 408
    goto :goto_1

    .line 410
    :goto_0
    nop

    .line 414
    .line 418
    :goto_1
    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x1e -> :sswitch_1
        0x78 -> :sswitch_2
    .end sparse-switch
.end method

.method public f()V
    .locals 5

    .line 1154
    iget-wide v0, p0, Lo/bwa;->A:J

    iget v2, p0, Lo/bwa;->H:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bwa;->A:J

    .line 1155
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa;->H:I

    .line 1156
    iget-wide v0, p0, Lo/bwa;->A:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lo/bwa;->A:J

    .line 1157
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa;->M:I

    .line 1158
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e00\u6574\u4e2a\u52a8\u4f5c\u7ed3\u675f\u3002"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1159
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    invoke-static {p0, v0}, Lo/buz;->c(Lo/bwa;Landroid/os/Handler;)V

    .line 1160
    invoke-direct {p0}, Lo/bwa;->Z()Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    move-result-object v4

    .line 1162
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwa$d;->d(I)V

    .line 1163
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwa$d;->a(I)V

    .line 1164
    iget-object v0, p0, Lo/bwa;->r:Lo/bwt;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwt;->setVisibility(I)V

    .line 1165
    iget-object v0, p0, Lo/bwa;->v:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1166
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwa;->U:Z

    .line 1167
    invoke-static {p0, v4}, Lo/buz;->b(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 1168
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa;->L:I

    .line 1169
    return-void
.end method

.method public g()V
    .locals 4

    .line 970
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()--holderCreated="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/bwa;->R:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 971
    iget-boolean v0, p0, Lo/bwa;->R:Z

    if-eqz v0, :cond_0

    .line 972
    invoke-virtual {p0}, Lo/bwa;->d()V

    .line 973
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwa;->ag:Z

    .line 975
    :cond_0
    return-void
.end method

.method public getTrainStation()I
    .locals 1

    .line 1494
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    return v0
.end method

.method public h()V
    .locals 5

    .line 1221
    iget-object v0, p0, Lo/bwa;->g:Lo/bwg;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->c()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/bwg;->setProgress(IIF)V

    .line 1222
    iget-object v0, p0, Lo/bwa;->i:Lo/bwg;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->c()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/bwg;->setProgress(IIF)V

    .line 1223
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 1224
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p0, v0}, Lo/bve;->a(Lo/bwa;I)V

    .line 1226
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lo/bwa;->i(I)V

    .line 1228
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bus;->b(I)Lo/bvy;

    .line 1230
    return-void
.end method

.method public i()V
    .locals 4

    .line 991
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "_allContinue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 992
    iget-object v0, p0, Lo/bwa;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 993
    iget-object v0, p0, Lo/bwa;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_fitness_pause_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 995
    :cond_0
    iget-boolean v0, p0, Lo/bwa;->R:Z

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->b()I

    move-result v1

    iget-boolean v2, p0, Lo/bwa;->ah:Z

    invoke-static {v0, v1, v2}, Lo/bve;->a(ZIZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 996
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "_allContinue ??"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    invoke-static {p0, v0}, Lo/buz;->b(Lo/bwa;Landroid/os/Handler;)V

    .line 998
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 999
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iget-object v2, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/bwi;->e(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 1002
    :cond_1
    return-void
.end method

.method public j()J
    .locals 2

    .line 1733
    iget-wide v0, p0, Lo/bwa;->K:J

    return-wide v0
.end method

.method public k()V
    .locals 4

    .line 1130
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u70b9\u51fb x \u6309\u94ae"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1131
    invoke-direct {p0}, Lo/bwa;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1132
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    invoke-interface {v0}, Lo/bwi;->e()V

    goto :goto_0

    .line 1133
    :cond_0
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc1

    if-ne v0, v1, :cond_1

    .line 1134
    invoke-direct {p0}, Lo/bwa;->K()V

    goto :goto_0

    .line 1136
    :cond_1
    invoke-direct {p0}, Lo/bwa;->ab()V

    .line 1137
    :goto_0
    return-void
.end method

.method public l()V
    .locals 4

    .line 1441
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CoachView release---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1442
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1443
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    if-eqz v0, :cond_0

    .line 1444
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    invoke-virtual {v0}, Lo/bus;->r()V

    .line 1445
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    invoke-virtual {v0}, Lo/bus;->d()Lo/bvz;

    .line 1447
    :cond_0
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    if-eqz v0, :cond_1

    .line 1448
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->r()V

    .line 1449
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->d()Lo/bvz;

    .line 1451
    :cond_1
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    if-eqz v0, :cond_2

    .line 1452
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->r()V

    .line 1453
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->d()Lo/bvz;

    .line 1455
    :cond_2
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    if-eqz v0, :cond_3

    .line 1456
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->r()V

    .line 1457
    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->d()Lo/bvz;

    .line 1459
    :cond_3
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    if-eqz v0, :cond_4

    .line 1460
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    invoke-virtual {v0}, Lo/bus;->r()V

    .line 1461
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    invoke-virtual {v0}, Lo/bus;->d()Lo/bvz;

    .line 1464
    :cond_4
    return-void
.end method

.method public m()V
    .locals 10

    .line 1306
    iget-object v0, p0, Lo/bwa;->am:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lo/bwa;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1307
    iget-object v0, p0, Lo/bwa;->am:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lo/bwa;->post(Ljava/lang/Runnable;)Z

    .line 1308
    invoke-virtual {p0}, Lo/bwa;->d()V

    .line 1309
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xc0

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1310
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwa;->d(I)V

    .line 1311
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 1312
    invoke-virtual {p0}, Lo/bwa;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_string_default:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1313
    invoke-static {v8, v9}, Lo/bve;->d(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1314
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v1

    .line 1315
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lo/bwa;->ab:F

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCalorie()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v6

    mul-float/2addr v5, v6

    const/high16 v6, 0x447a0000    # 1000.0f

    div-float/2addr v5, v6

    invoke-static {v5}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1316
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$string;->sug_fitcoach_sec:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v6

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Lo/bzr;->f(F)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static {v3, v4, v5}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v4, v9

    invoke-virtual {v8}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquirePicUrl()Ljava/lang/String;

    move-result-object v5

    .line 1314
    invoke-virtual/range {v0 .. v5}, Lo/bwe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1318
    return-void
.end method

.method public n()V
    .locals 1

    .line 1537
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwa;->z:Z

    .line 1538
    return-void
.end method

.method public o()V
    .locals 1

    .line 1331
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->m()Lo/bvz;

    .line 1332
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1023
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 1024
    invoke-static {v4}, Lo/bve;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1026
    invoke-direct {p0}, Lo/bwa;->ah()V

    goto :goto_0

    .line 1027
    :cond_0
    invoke-static {p0, v4}, Lo/bve;->e(Lo/bwa;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1028
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ":\u7ed3\u675f\u8bad\u7ec3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1029
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    invoke-interface {v0}, Lo/bwi;->e()V

    .line 1060
    :cond_1
    :goto_0
    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 4

    .line 198
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8bad\u7ec3\u8bed\u97f3\u7ed3\u675f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    iget-object v0, p0, Lo/bwa;->ae:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 200
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 1686
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    .line 1687
    iget-object v0, p0, Lo/bwa;->am:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lo/bwa;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1688
    iget-object v0, p0, Lo/bwa;->an:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lo/bwa;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1689
    iget-object v0, p0, Lo/bwa;->ar:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1690
    return-void
.end method

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1589
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc1

    if-eq v0, v1, :cond_0

    .line 1590
    invoke-virtual {p0}, Lo/bwa;->m()V

    .line 1591
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1596
    const/4 v0, 0x0

    return v0
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 204
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bwa;->d(Z)V

    .line 205
    const/4 v0, 0x1

    return v0
.end method

.method protected onFinishInflate()V
    .locals 3

    .line 828
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 829
    iget-object v0, p0, Lo/bwa;->N:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_coachview:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 830
    invoke-direct {p0}, Lo/bwa;->P()V

    .line 831
    iget-object v0, p0, Lo/bwa;->d:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lo/bwa;->J:Landroid/view/SurfaceHolder;

    .line 832
    iget-object v0, p0, Lo/bwa;->J:Landroid/view/SurfaceHolder;

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 833
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    if-eqz v0, :cond_0

    .line 834
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    iget-object v1, p0, Lo/bwa;->d:Landroid/view/SurfaceView;

    invoke-virtual {v0, v1}, Lo/bvu;->d(Landroid/view/SurfaceView;)Lo/bvz;

    .line 835
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvu;->e(Z)V

    .line 837
    :cond_0
    new-instance v0, Lo/bvu;

    iget-object v1, p0, Lo/bwa;->N:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/bvu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bwa;->o:Lo/bvu;

    .line 838
    new-instance v0, Lo/bvh;

    iget-object v1, p0, Lo/bwa;->N:Landroid/content/Context;

    iget-object v2, p0, Lo/bwa;->ae:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lo/bvh;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lo/bwa;->F:Lo/bvh;

    .line 839
    new-instance v0, Lo/bus;

    iget-object v1, p0, Lo/bwa;->N:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/bus;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bwa;->l:Lo/bus;

    .line 840
    new-instance v0, Lo/bvd;

    iget-object v1, p0, Lo/bwa;->N:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/bvd;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bwa;->m:Lo/bvd;

    .line 842
    invoke-static {}, Lo/bve;->b()F

    move-result v0

    iput v0, p0, Lo/bwa;->ab:F

    .line 843
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lo/bwa;->N:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/bwa;->af:Landroid/view/GestureDetector;

    .line 844
    iget-object v0, p0, Lo/bwa;->af:Landroid/view/GestureDetector;

    invoke-virtual {v0, p0}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 845
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bwa;->setTag(Ljava/lang/Object;)V

    .line 846
    return-void
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    .line 211
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/bwa;->b:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/bwa;->b(Landroid/widget/ImageView;Z)V

    goto :goto_0

    .line 213
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 214
    iget-object v0, p0, Lo/bwa;->e:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/bwa;->b(Landroid/widget/ImageView;Z)V

    .line 216
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lo/bwa;->p()V

    .line 217
    const/4 v0, 0x1

    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 222
    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .line 781
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bwa;->o:Lo/bvu;

    if-eqz v0, :cond_0

    .line 782
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result v1

    .line 783
    invoke-static {p0, p2, v1}, Lo/buz;->e(Lo/bwa;II)V

    .line 785
    :cond_0
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 6

    .line 227
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget v1, p0, Lo/bwa;->al:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 228
    iget v0, p0, Lo/bwa;->ai:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    div-float v0, p4, v0

    invoke-virtual {p0, v0}, Lo/bwa;->setBrightness(F)V

    .line 229
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byl;->setVisibility(I)V

    goto :goto_0

    .line 230
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget v1, p0, Lo/bwa;->al:I

    int-to-float v1, v1

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 231
    invoke-virtual {p0, p4}, Lo/bwa;->setVolume(F)V

    .line 232
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byl;->setVisibility(I)V

    .line 234
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 307
    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1583
    invoke-virtual {p0}, Lo/bwa;->p()V

    .line 1584
    const/4 v0, 0x1

    return v0
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 311
    const/4 v0, 0x1

    return v0
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 790
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 795
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 851
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 853
    :sswitch_0
    iget-object v0, p0, Lo/bwa;->am:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lo/bwa;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 854
    iget-object v0, p0, Lo/bwa;->am:Ljava/lang/Runnable;

    const-wide/16 v1, 0x4b0

    invoke-virtual {p0, v0, v1, v2}, Lo/bwa;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 855
    .line 859
    :goto_0
    iget-object v0, p0, Lo/bwa;->af:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public p()V
    .locals 5

    .line 1498
    iget-object v0, p0, Lo/bwa;->t:Lo/bwr;

    invoke-virtual {v0}, Lo/bwr;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1499
    :goto_0
    iget-object v0, p0, Lo/bwa;->t:Lo/bwr;

    invoke-virtual {v0, v3}, Lo/bwr;->setVisibility(I)V

    .line 1500
    iget-object v0, p0, Lo/bwa;->ar:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1502
    iget-object v0, p0, Lo/bwa;->ar:Landroid/os/Handler;

    const/16 v1, 0x4b1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1503
    iget-object v0, p0, Lo/bwa;->ar:Landroid/os/Handler;

    const-wide/16 v1, 0x1b58

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1504
    return-void
.end method

.method public q()V
    .locals 2

    .line 1633
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc0

    if-eq v0, v1, :cond_0

    .line 1634
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    iput v0, p0, Lo/bwa;->u:I

    .line 1635
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xc0

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1637
    :cond_0
    return-void
.end method

.method public r()V
    .locals 2

    .line 1641
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    invoke-virtual {v0}, Lo/bwe;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1642
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    iget v1, p0, Lo/bwa;->u:I

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1643
    invoke-virtual {p0}, Lo/bwa;->i()V

    .line 1645
    :cond_0
    return-void
.end method

.method public s()V
    .locals 5

    .line 1569
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishTrain-----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1570
    invoke-direct {p0}, Lo/bwa;->Z()Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    move-result-object v4

    .line 1571
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, -0x64

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 1572
    invoke-virtual {p0}, Lo/bwa;->l()V

    .line 1573
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1574
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v4, v1}, Lo/bwi;->k(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 1575
    iget-object v0, p0, Lo/bwa;->q:Lo/bwi;

    iget-boolean v1, p0, Lo/bwa;->E:Z

    invoke-interface {v0, v1}, Lo/bwi;->e(Z)V

    .line 1577
    :cond_0
    return-void
.end method

.method public setBrightness(F)V
    .locals 5

    .line 242
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    .line 243
    iget v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 244
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bwa;->b(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 246
    :cond_0
    iget v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    add-float/2addr v0, p1

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 247
    iget v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 248
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    goto :goto_0

    .line 249
    :cond_1
    iget v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    float-to-double v0, v0

    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 250
    const v0, 0x3c23d70a    # 0.01f

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 252
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/byl;->setProgressMax(F)V

    .line 253
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    iget v1, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    invoke-virtual {v0, v1}, Lo/byl;->d(F)Lo/byl;

    .line 254
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->ic_video_light:I

    invoke-virtual {v0, v1}, Lo/byl;->a(I)V

    .line 255
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    invoke-virtual {p0}, Lo/bwa;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_brightness:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/byl;->b(Ljava/lang/String;)V

    .line 256
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 257
    return-void
.end method

.method public setDeviceConnected()V
    .locals 1

    .line 1532
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwa;->z:Z

    .line 1533
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwa;->y:Z

    .line 1534
    return-void
.end method

.method public setGender(I)V
    .locals 1

    .line 1525
    iget-object v0, p0, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0, p1}, Lo/bvh;->c(I)V

    .line 1526
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    invoke-virtual {v0, p1}, Lo/bus;->c(I)V

    .line 1527
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    invoke-virtual {v0, p1}, Lo/bus;->c(I)V

    .line 1529
    return-void
.end method

.method public setMotions(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;I)V"
        }
    .end annotation

    .line 1362
    iput p2, p0, Lo/bwa;->P:I

    .line 1363
    iput-object p1, p0, Lo/bwa;->n:Ljava/util/List;

    .line 1364
    iget-object v0, p0, Lo/bwa;->g:Lo/bwg;

    invoke-virtual {v0, p1}, Lo/bwg;->setMotions(Ljava/util/List;)V

    .line 1365
    iget-object v0, p0, Lo/bwa;->i:Lo/bwg;

    invoke-virtual {v0, p1}, Lo/bwg;->setMotions(Ljava/util/List;)V

    .line 1366
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/bwa;->ad:[Ljava/lang/String;

    .line 1368
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 1369
    iget-object v0, p0, Lo/bwa;->ad:[Ljava/lang/String;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    .line 1368
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1378
    :cond_0
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveMotions----size-"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1381
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwa;->V:Ljava/util/List;

    .line 1382
    new-instance v0, Lo/bva;

    iget-object v1, p0, Lo/bwa;->V:Ljava/util/List;

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_coach_vp_intro:I

    invoke-direct {v0, v1, v2}, Lo/bva;-><init>(Ljava/util/List;I)V

    iput-object v0, p0, Lo/bwa;->ac:Lo/bva;

    .line 1383
    iget-object v0, p0, Lo/bwa;->ac:Lo/bva;

    iget-object v1, p0, Lo/bwa;->aq:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bva;->e(Ljava/lang/String;)V

    .line 1384
    iget-object v0, p0, Lo/bwa;->D:Lo/bwp;

    iget-object v1, p0, Lo/bwa;->ac:Lo/bva;

    invoke-virtual {v0, v1}, Lo/bwp;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1385
    return-void
.end method

.method public setVolume(F)V
    .locals 6

    .line 276
    invoke-virtual {p0}, Lo/bwa;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/media/AudioManager;

    .line 278
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    iput v0, p0, Lo/bwa;->ap:I

    .line 280
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v5

    .line 281
    iget v0, p0, Lo/bwa;->ao:F

    add-float/2addr v0, p1

    iput v0, p0, Lo/bwa;->ao:F

    .line 282
    iget v0, p0, Lo/bwa;->ao:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lo/bwa;->ai:I

    int-to-float v1, v1

    int-to-float v2, v5

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    div-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 283
    iget v0, p0, Lo/bwa;->ao:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 284
    iget v0, p0, Lo/bwa;->ap:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bwa;->ap:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v4, v1, v0, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    goto :goto_0

    .line 286
    :cond_0
    iget v0, p0, Lo/bwa;->ap:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/bwa;->ap:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v4, v1, v0, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 289
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa;->ao:F

    .line 291
    :cond_1
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    int-to-float v1, v5

    invoke-virtual {v0, v1}, Lo/byl;->setProgressMax(F)V

    .line 292
    iget v0, p0, Lo/bwa;->ap:I

    if-gtz v0, :cond_2

    .line 293
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->ic_video_mute:I

    invoke-virtual {v0, v1}, Lo/byl;->a(I)V

    goto :goto_1

    .line 295
    :cond_2
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->ic_video_voice:I

    invoke-virtual {v0, v1}, Lo/byl;->a(I)V

    .line 297
    :goto_1
    iget v0, p0, Lo/bwa;->ap:I

    if-ltz v0, :cond_3

    .line 298
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    iget v1, p0, Lo/bwa;->ap:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/byl;->d(F)Lo/byl;

    .line 301
    :cond_3
    iget-object v0, p0, Lo/bwa;->f:Lo/byl;

    invoke-virtual {p0}, Lo/bwa;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_volume:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/byl;->b(Ljava/lang/String;)V

    .line 303
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 4

    .line 940
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "surfaceChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 941
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 864
    const-string v0, "CoachView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "surfaceCreated--- holderCreated = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/bwa;->R:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    invoke-direct {p0}, Lo/bwa;->X()V

    .line 866
    iget-object v0, p0, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0, p1}, Lo/bvu;->a(Landroid/view/SurfaceHolder;)Lo/bvz;

    .line 868
    iget-object v0, p0, Lo/bwa;->n:Ljava/util/List;

    invoke-static {v0}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 869
    iget-boolean v0, p0, Lo/bwa;->R:Z

    if-nez v0, :cond_0

    .line 870
    invoke-direct {p0}, Lo/bwa;->O()V

    goto :goto_0

    .line 872
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwa;->ah:Z

    .line 873
    invoke-direct {p0}, Lo/bwa;->V()V

    .line 876
    :cond_1
    :goto_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 945
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bwa;->ah:Z

    .line 946
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "surfaceDestroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 947
    return-void
.end method

.method public t()Lo/bwa$d;
    .locals 1

    .line 1648
    iget-object v0, p0, Lo/bwa;->p:Lo/bwa$d;

    return-object v0
.end method

.method public u()Lo/bwe;
    .locals 1

    .line 1652
    iget-object v0, p0, Lo/bwa;->C:Lo/bwe;

    return-object v0
.end method

.method public v()I
    .locals 1

    .line 1721
    iget v0, p0, Lo/bwa;->H:I

    return v0
.end method

.method public w()Lo/bus;
    .locals 1

    .line 1725
    iget-object v0, p0, Lo/bwa;->l:Lo/bus;

    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1656
    iget v0, p0, Lo/bwa;->u:I

    return v0
.end method

.method public y()I
    .locals 1

    .line 1713
    iget v0, p0, Lo/bwa;->M:I

    return v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .line 1681
    iget-object v0, p0, Lo/bwa;->aq:Ljava/lang/String;

    return-object v0
.end method
