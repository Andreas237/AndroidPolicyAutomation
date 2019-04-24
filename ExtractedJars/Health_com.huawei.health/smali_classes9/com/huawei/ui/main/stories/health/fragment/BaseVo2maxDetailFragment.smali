.class public abstract Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$e;
    }
.end annotation


# instance fields
.field protected A:Landroid/widget/LinearLayout;

.field protected B:Landroid/widget/ImageView;

.field protected C:Landroid/widget/LinearLayout;

.field protected D:Landroid/widget/LinearLayout;

.field protected E:Lo/fac;

.field protected F:Landroid/view/View;

.field protected G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field protected H:Landroid/view/View;

.field protected I:Lo/fab;

.field protected J:Z

.field protected K:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field protected L:Landroid/graphics/drawable/AnimationDrawable;

.field protected M:I

.field protected N:Landroid/widget/ImageView;

.field protected O:Landroid/os/Handler;

.field protected P:Lo/dgu;

.field protected Q:Lo/fcf;

.field protected R:[Ljava/lang/Integer;

.field protected S:F

.field private T:I

.field private U:Landroid/view/View;

.field private V:Landroid/widget/ImageView;

.field private W:Lo/fep;

.field private X:Landroid/widget/ImageView;

.field protected a:Landroid/widget/TextView;

.field protected b:Z

.field protected c:Landroid/widget/TextView;

.field protected d:Landroid/content/Context;

.field protected final e:Ljava/lang/Object;

.field protected f:Landroid/widget/TextView;

.field protected g:Landroid/widget/TextView;

.field protected h:Landroid/widget/TextView;

.field protected i:Landroid/widget/TextView;

.field protected j:Landroid/widget/LinearLayout;

.field protected k:Landroid/widget/TextView;

.field protected l:Landroid/widget/TextView;

.field protected m:Landroid/widget/TextView;

.field protected n:Landroid/widget/TextView;

.field protected o:Landroid/widget/TextView;

.field protected p:Landroid/widget/TextView;

.field protected q:Landroid/widget/TextView;

.field protected r:Landroid/widget/TextView;

.field protected s:Landroid/widget/TextView;

.field protected t:Landroid/widget/TextView;

.field protected u:Landroid/widget/TextView;

.field protected v:Landroid/widget/LinearLayout;

.field protected w:Landroid/widget/TextView;

.field protected x:Landroid/widget/LinearLayout;

.field protected y:Landroid/widget/TextView;

.field protected z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b:Z

    .line 62
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->e:Ljava/lang/Object;

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->G:Ljava/util/ArrayList;

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->J:Z

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->M:I

    .line 112
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->O:Landroid/os/Handler;

    .line 138
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->P:Lo/dgu;

    .line 302
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->S:F

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;JI)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b(JI)V

    return-void
.end method

.method private b(I)Ljava/lang/String;
    .locals 2

    .line 502
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 504
    :pswitch_0
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_verypoor:I

    .line 505
    goto :goto_1

    .line 507
    :pswitch_1
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_poor:I

    .line 508
    goto :goto_1

    .line 510
    :pswitch_2
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_fair:I

    .line 511
    goto :goto_1

    .line 513
    :pswitch_3
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_average:I

    .line 514
    goto :goto_1

    .line 516
    :pswitch_4
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_good:I

    .line 517
    goto :goto_1

    .line 519
    :pswitch_5
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_verygood:I

    .line 520
    goto :goto_1

    .line 522
    :pswitch_6
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_excellent:I

    .line 523
    goto :goto_1

    .line 525
    :goto_0
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_average:I

    .line 529
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private b(JI)V
    .locals 6

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->x:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->W:Lo/fep;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fep;->setVisibility(I)V

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->c:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    invoke-static {v1, p1, p2}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->f:Landroid/widget/TextView;

    int-to-double v1, p3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 397
    const/16 v0, 0x11

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 400
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->R:[Ljava/lang/Integer;

    invoke-static {p3, v0}, Lo/feg;->a(I[Ljava/lang/Integer;)I

    move-result v5

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->W:Lo/fep;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->R:[Ljava/lang/Integer;

    invoke-static {p3, v5, v1}, Lo/feg;->d(II[Ljava/lang/Integer;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fep;->setProgress(I)V

    .line 402
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->T:I

    if-nez v0, :cond_1

    .line 403
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_male_level:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 405
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_female_level:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 407
    :goto_0
    invoke-direct {p0, p3}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->c(I)V

    .line 408
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    .line 357
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->N:Landroid/widget/ImageView;

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->N:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->sleep_loading_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->N:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->L:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 363
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_fragment_viewpager:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fac;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->E:Lo/fac;

    .line 365
    new-instance v0, Lo/fab;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->G:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fab;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->I:Lo/fab;

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->E:Lo/fac;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->I:Lo/fab;

    invoke-virtual {v0, v1}, Lo/fac;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 368
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d()V

    .line 369
    return-void
.end method

.method private c(I)V
    .locals 20

    .line 411
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dwm;

    .line 412
    const-wide/16 v6, 0x0

    .line 413
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 414
    invoke-virtual {v5}, Lo/dwm;->b()D

    move-result-wide v6

    .line 416
    :cond_0
    const-string v0, "Track_BaseVo2maxDetailFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "distance : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->v:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 418
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move/from16 v1, p1

    int-to-double v1, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/brt;->e(DI)I

    move-result v8

    .line 419
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move/from16 v1, p1

    int-to-double v1, v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/brt;->e(DI)I

    move-result v9

    .line 420
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move/from16 v1, p1

    int-to-double v1, v1

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Lo/brt;->e(DI)I

    move-result v10

    .line 421
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move/from16 v1, p1

    int-to-double v1, v1

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v2, v3}, Lo/brt;->e(DI)I

    move-result v11

    .line 422
    int-to-float v0, v8

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-long v12, v0

    .line 423
    long-to-float v0, v12

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    if-nez v0, :cond_1

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 426
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->u:Landroid/widget/TextView;

    long-to-float v1, v12

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 429
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->s:Landroid/widget/TextView;

    long-to-float v1, v12

    const/high16 v2, 0x42700000    # 60.0f

    rem-float/2addr v1, v2

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 431
    int-to-float v0, v9

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-long v14, v0

    .line 432
    long-to-float v0, v14

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    if-nez v0, :cond_2

    .line 433
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->m:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 435
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->t:Landroid/widget/TextView;

    long-to-float v1, v14

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 436
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 438
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->y:Landroid/widget/TextView;

    long-to-float v1, v14

    const/high16 v2, 0x42700000    # 60.0f

    rem-float/2addr v1, v2

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 440
    int-to-float v0, v10

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-long v1, v0

    move-wide/from16 v16, v1

    .line 441
    move-wide/from16 v0, v16

    long-to-float v0, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    if-nez v0, :cond_3

    .line 442
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->n:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 444
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->r:Landroid/widget/TextView;

    move-wide/from16 v1, v16

    long-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 447
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->z:Landroid/widget/TextView;

    move-wide/from16 v1, v16

    long-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    rem-float/2addr v1, v2

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 449
    int-to-float v0, v11

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-long v1, v0

    move-wide/from16 v18, v1

    .line 450
    move-wide/from16 v0, v18

    long-to-float v0, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    if-nez v0, :cond_4

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 453
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->q:Landroid/widget/TextView;

    move-wide/from16 v1, v18

    long-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 454
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 456
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->w:Landroid/widget/TextView;

    move-wide/from16 v1, v18

    long-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    rem-float/2addr v1, v2

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 457
    const-string v0, "Track_BaseVo2maxDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6210\u7ee9\u9884\u6d4b\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    const-string v0, "Track_BaseVo2maxDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Performance prediction mins\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v16

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v18

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    move-object/from16 v0, p0

    invoke-direct {v0, v6, v7}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d(D)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 461
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->C:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 462
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->D:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 463
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->A:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 464
    goto :goto_4

    .line 466
    :pswitch_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 467
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->D:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 468
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->A:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 469
    goto :goto_4

    .line 471
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 472
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->C:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 473
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->A:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 474
    goto :goto_4

    .line 476
    :pswitch_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 477
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->C:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 478
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->D:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 479
    .line 483
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private d(D)I
    .locals 2

    .line 486
    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    .line 487
    const/4 v0, 0x0

    return v0

    .line 488
    :cond_0
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_1

    .line 489
    const/4 v0, 0x1

    return v0

    .line 490
    :cond_1
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    cmpg-double v0, p1, v0

    if-gez v0, :cond_2

    .line 491
    const/4 v0, 0x2

    return v0

    .line 492
    :cond_2
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    cmpg-double v0, p1, v0

    if-gez v0, :cond_3

    .line 493
    const/4 v0, 0x3

    return v0

    .line 495
    :cond_3
    const/4 v0, 0x4

    return v0
.end method

.method private e(Landroid/view/View;)V
    .locals 6

    .line 242
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_mid_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->x:Landroid/widget/LinearLayout;

    .line 243
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_mid_time:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->c:Landroid/widget/TextView;

    .line 245
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_value:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->f:Landroid/widget/TextView;

    .line 246
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_value_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->i:Landroid/widget/TextView;

    .line 247
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_value_dafault:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->h:Landroid/widget/TextView;

    .line 248
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_gender_level:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->k:Landroid/widget/TextView;

    .line 250
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_race:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->v:Landroid/widget/LinearLayout;

    .line 251
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_5km_race_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->j:Landroid/widget/LinearLayout;

    .line 252
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_10km_race_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->C:Landroid/widget/LinearLayout;

    .line 253
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_half_maronthon_race_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->D:Landroid/widget/LinearLayout;

    .line 254
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_maronthon_race_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->A:Landroid/widget/LinearLayout;

    .line 256
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_race_5km:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->g:Landroid/widget/TextView;

    .line 257
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_race_10km:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->o:Landroid/widget/TextView;

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->g:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_5km_time_hour_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->l:Landroid/widget/TextView;

    .line 263
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_10km_time_hour_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->m:Landroid/widget/TextView;

    .line 264
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_half_maronthon_time_hour_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->n:Landroid/widget/TextView;

    .line 265
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_maronthon_time_hour_unit:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->p:Landroid/widget/TextView;

    .line 266
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_5km_time_hour:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->u:Landroid/widget/TextView;

    .line 267
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_10km_time_hour:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->t:Landroid/widget/TextView;

    .line 268
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_half_maronthon_time_hour:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->r:Landroid/widget/TextView;

    .line 269
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_maronthon_time_hour:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->q:Landroid/widget/TextView;

    .line 270
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_5km_time_min:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->s:Landroid/widget/TextView;

    .line 271
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_10km_time_min:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->y:Landroid/widget/TextView;

    .line 272
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_half_maronthon_time_min:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->z:Landroid/widget/TextView;

    .line 273
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_maronthon_time_min:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->w:Landroid/widget/TextView;

    .line 275
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_detail_time_date_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->a:Landroid/widget/TextView;

    .line 277
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->F:Landroid/view/View;

    .line 278
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->H:Landroid/view/View;

    .line 279
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_detail_up_arrow_left:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->V:Landroid/widget/ImageView;

    .line 280
    sget v0, Lcom/huawei/ui/main/R$id;->vo2max_detail_up_arrow_right:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->X:Landroid/widget/ImageView;

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->V:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->X:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->V:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->X:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 289
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->M:I

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->F:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->H:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 292
    return-void
.end method

.method private g()V
    .locals 7

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->U:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_mid_progressbar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fep;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->W:Lo/fep;

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->U:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_vo2max_progressbar_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->B:Landroid/widget/ImageView;

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->B:Landroid/widget/ImageView;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setRotation(F)V

    .line 191
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    .line 192
    const-string v0, "vo2max_value"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 193
    if-eqz v4, :cond_1

    .line 194
    const-string v0, "vo2max_time"

    const-wide/16 v1, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    .line 195
    invoke-direct {p0, v5, v6, v4}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b(JI)V

    .line 197
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d(Z)V

    .line 198
    goto :goto_0

    .line 199
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->h()V

    .line 201
    :goto_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->P:Lo/dgu;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$e;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$e;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/dgu;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 205
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected a(II)V
    .locals 2

    .line 372
    if-lez p1, :cond_0

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->H:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 376
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->H:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 379
    :goto_0
    if-lt p1, p2, :cond_1

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->F:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 383
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->F:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 385
    :goto_1
    return-void
.end method

.method public b()V
    .locals 0

    .line 300
    return-void
.end method

.method public c()Z
    .locals 3

    .line 153
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 154
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    .line 155
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method protected d()V
    .locals 2

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->E:Lo/fac;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fac;->setScanScroll(Z)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->E:Lo/fac;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fac;->setOnViewPagerTouchEventListener(Lo/fac$c;)V

    .line 348
    return-void
.end method

.method public d(Z)V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 146
    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 148
    :goto_0
    return-void
.end method

.method public e()V
    .locals 0

    .line 296
    return-void
.end method

.method public abstract f()V
.end method

.method public abstract k()V
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->U:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 162
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_health_vo2max_detail:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->U:Landroid/view/View;

    .line 164
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d:Landroid/content/Context;

    .line 165
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->J:Z

    .line 166
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 167
    const-string v0, "vo2max_gender"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->T:I

    .line 168
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->T:I

    const-string v1, "vo2max_age"

    const/4 v2, 0x0

    invoke-virtual {v4, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0, v1}, Lo/feg;->d(II)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->R:[Ljava/lang/Integer;

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->U:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->e(Landroid/view/View;)V

    .line 171
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->f()V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->U:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->b(Landroid/view/View;)V

    .line 173
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->g()V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->O:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->U:Landroid/view/View;

    return-object v0
.end method
