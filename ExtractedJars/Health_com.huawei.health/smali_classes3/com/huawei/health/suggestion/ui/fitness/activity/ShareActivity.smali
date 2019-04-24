.class public Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$b;
    }
.end annotation


# static fields
.field private static final d:[Ljava/lang/String;


# instance fields
.field private A:Landroid/widget/RelativeLayout;

.field private B:Landroid/widget/LinearLayout;

.field private C:Landroid/widget/RelativeLayout;

.field private D:Landroid/widget/LinearLayout;

.field private E:J

.field private F:Z

.field private G:Landroid/widget/LinearLayout;

.field private H:Landroid/widget/LinearLayout;

.field private a:Lo/bzd;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field c:Lo/dav;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dam;>;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Landroid/widget/FrameLayout;

.field private h:F

.field private i:Landroid/os/Bundle;

.field private j:Landroid/widget/LinearLayout;

.field private k:F

.field private l:Landroid/support/v4/view/ViewPager;

.field private m:I

.field private n:J

.field private o:F

.field private p:J

.field private q:Landroid/widget/RelativeLayout;

.field private r:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$b;

.field private s:Ljava/lang/String;

.field private t:Landroid/graphics/Bitmap;

.field private u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private v:Ljava/lang/String;

.field private w:[I

.field private x:Landroid/net/Uri;

.field private y:Landroid/content/Context;

.field private z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 97
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "share/fitness_share_0.jpg"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "share/track_share_1.jpg"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "share/fitness_share_1.jpg"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "share/track_share_0.jpg"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "share/track_share_4.jpg"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->b:Ljava/util/ArrayList;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->e:Ljava/util/ArrayList;

    .line 114
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->n:J

    .line 121
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->v:Ljava/lang/String;

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->x:Landroid/net/Uri;

    .line 123
    const/4 v0, 0x4

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->bg_pic_01:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->bg_pic02:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->bg_pic03:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->bg_pic04:I

    const/4 v2, 0x3

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->z:[I

    .line 129
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->w:[I

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c:Lo/dav;

    .line 145
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->E:J

    .line 149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->F:Z

    return-void

    :array_0
    .array-data 4
        0x5
        0x1
        0x2
        0x3
        0x4
    .end array-data
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/view/View;>;)V"
        }
    .end annotation

    .line 369
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_layout_share_new:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 370
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_new_detail:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzd;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    .line 371
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_new_background:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 372
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_short_image:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 373
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_detail_title_usrname:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/efy;

    .line 374
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_detail_map_sport_formal_time:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/efy;

    .line 375
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_new_bottom:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->g:Landroid/widget/FrameLayout;

    .line 376
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v11

    .line 377
    invoke-static {}, Lo/dbf;->d()Z

    move-result v12

    .line 378
    if-eqz v11, :cond_0

    if-eqz v12, :cond_0

    const/4 v13, 0x1

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    .line 379
    :goto_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_new_edit:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    .line 380
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V

    invoke-virtual {v14, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 386
    if-nez v13, :cond_1

    .line 387
    const/16 v0, 0x8

    invoke-virtual {v14, v0}, Landroid/view/View;->setVisibility(I)V

    .line 389
    :cond_1
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v15, v0, v1

    .line 390
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->b:Ljava/util/ArrayList;

    sget-object v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 391
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 392
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->x:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 393
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->x:Landroid/net/Uri;

    invoke-static {v0, v8}, Lo/cam;->b(Landroid/net/Uri;Landroid/widget/ImageView;)V

    .line 395
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v9, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 396
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->s:Ljava/lang/String;

    invoke-virtual {v10, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 397
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/view/WindowManager;

    .line 398
    new-instance v17, Landroid/util/DisplayMetrics;

    invoke-direct/range {v17 .. v17}, Landroid/util/DisplayMetrics;-><init>()V

    .line 399
    invoke-interface/range {v16 .. v16}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 400
    move-object/from16 v0, v17

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    move/from16 v18, v0

    .line 402
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    const/high16 v1, 0x437a0000    # 250.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v22

    .line 403
    move/from16 v19, v22

    .line 404
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v21

    .line 406
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    move/from16 v1, v18

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/bzd;->setPivotX(F)V

    .line 408
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bzd;->setPivotY(F)V

    .line 409
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_new_arrow:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 411
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bzd;->setPivotX(F)V

    .line 412
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bzd;->setPivotY(F)V

    .line 414
    :goto_1
    move/from16 v0, v19

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    move/from16 v1, v18

    int-to-float v1, v1

    div-float v23, v0, v1

    .line 415
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    add-int v24, v18, v0

    .line 416
    move/from16 v0, v24

    int-to-float v0, v0

    mul-float v0, v0, v23

    float-to-int v1, v0

    move/from16 v20, v1

    .line 417
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_all_white:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v25

    .line 418
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v26

    .line 419
    sub-int v0, v21, v20

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    const/high16 v2, 0x42080000    # 34.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    sub-int v27, v0, v1

    .line 420
    move/from16 v0, v27

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, v26

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 421
    move-object/from16 v0, v25

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 422
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_share_new_detail_position:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v28

    .line 423
    invoke-virtual/range {v28 .. v28}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v29

    .line 424
    move/from16 v0, v20

    move-object/from16 v1, v29

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 425
    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 426
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lo/bzd;->setScaleX(F)V

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lo/bzd;->setScaleY(F)V

    .line 429
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->k:F

    .line 430
    invoke-static {v3}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 429
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v30

    .line 431
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->h:F

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v31

    .line 432
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->m:I

    invoke-static {v0}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v32

    .line 433
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->o:F

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v33

    .line 434
    new-instance v0, Lo/bzg;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bzg;-><init>(Landroid/content/Context;)V

    move-object/from16 v34, v0

    .line 435
    move-object/from16 v0, v34

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->f:Ljava/lang/String;

    move-object/from16 v2, v30

    move-object/from16 v3, v31

    move-object/from16 v4, v32

    move-object/from16 v5, v33

    invoke-virtual/range {v0 .. v5}, Lo/bzg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    new-instance v0, Lo/bzg;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bzg;-><init>(Landroid/content/Context;)V

    move-object/from16 v35, v0

    .line 437
    move-object/from16 v0, v35

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->f:Ljava/lang/String;

    move-object/from16 v2, v30

    move-object/from16 v3, v31

    move-object/from16 v4, v32

    move-object/from16 v5, v33

    invoke-virtual/range {v0 .. v5}, Lo/bzg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->e:Ljava/util/ArrayList;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->g:Landroid/widget/FrameLayout;

    invoke-virtual/range {v34 .. v34}, Lo/bzg;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 441
    new-instance v0, Lo/bzk;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bzk;-><init>(Landroid/content/Context;)V

    move-object/from16 v36, v0

    .line 442
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->f:Ljava/lang/String;

    move-object/from16 v1, v36

    move-object/from16 v2, v30

    move-object/from16 v3, v31

    invoke-virtual {v1, v0, v2, v3}, Lo/bzk;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->e:Ljava/util/ArrayList;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->g()V

    return-void
.end method

.method private static c(IF)F
    .locals 2

    .line 710
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    .line 711
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 10

    .line 715
    if-nez p1, :cond_0

    .line 716
    const/4 v0, 0x0

    return-object v0

    .line 719
    :cond_0
    const/4 v4, 0x0

    .line 720
    const/4 v5, 0x0

    .line 721
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    .line 723
    :try_start_0
    invoke-virtual {v6, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 724
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 729
    if-eqz v5, :cond_1

    .line 730
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 734
    :cond_1
    goto :goto_1

    .line 732
    :catch_0
    move-exception v7

    .line 733
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    goto :goto_1

    .line 725
    :catch_1
    move-exception v7

    .line 726
    const-string v0, "ShareActivity"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 729
    if-eqz v5, :cond_2

    .line 730
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 734
    :cond_2
    goto :goto_1

    .line 732
    :catch_2
    move-exception v7

    .line 733
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    goto :goto_1

    .line 728
    :catchall_0
    move-exception v8

    .line 729
    if-eqz v5, :cond_3

    .line 730
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 734
    :cond_3
    goto :goto_0

    .line 732
    :catch_3
    move-exception v9

    .line 733
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    :goto_0
    throw v8

    .line 736
    :goto_1
    return-object v4
.end method

.method private c(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;
    .locals 1

    .line 273
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_img:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private c(I)V
    .locals 6

    .line 673
    const/4 v3, 0x0

    .line 675
    const/4 v4, 0x0

    .line 676
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 677
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "workout_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 678
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "workout_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 680
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 682
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 683
    const-string v0, "workout_name"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->f:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 685
    const-string v0, "finish_rate"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->o:F

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    const-string v0, "workout_TimeInMinutes"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->k:F

    invoke-static {v1}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    :cond_2
    if-ltz p1, :cond_3

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->w:[I

    array-length v0, v0

    if-ge p1, v0, :cond_3

    .line 689
    const-string v0, "share_result"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->w:[I

    aget v1, v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    :cond_3
    const-string v0, "entrance"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    const-string v0, "workout_id"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    const-string v0, "1130014"

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 694
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->C:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private d(Landroid/widget/LinearLayout;)Landroid/widget/TextView;
    .locals 1

    .line 262
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_tv:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private d(Ljava/util/ArrayList;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/view/View;>;I)V"
        }
    .end annotation

    .line 457
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_layout_share:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 458
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->z:[I

    add-int/lit8 v1, p2, -0x1

    aget v0, v0, v1

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 459
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_completion:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/efy;

    .line 460
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_time:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/efy;

    .line 461
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_calorie:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/efy;

    .line 462
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_motionname:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/efy;

    .line 463
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_duration:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/efy;

    .line 464
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_levels:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/efy;

    .line 465
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_username:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/efy;

    .line 466
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_workout_time:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/efy;

    .line 467
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_user_pic:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    .line 472
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 473
    const-string v0, "L[1-4]{1}"

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->m:I

    invoke-static {v1}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc_ar:I

    move-object/from16 v4, p0

    invoke-static {v4, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v16

    .line 474
    move-object/from16 v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->k:F

    invoke-static {v3}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc_ar:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v17

    .line 475
    move-object/from16 v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->h:F

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc_ar:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v18

    .line 476
    const-string v0, "\\d+.\\d+|\\d+"

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->o:F

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc_ar:I

    move-object/from16 v4, p0

    invoke-static {v4, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v19

    goto :goto_0

    .line 478
    :cond_0
    const-string v0, "L[1-4]{1}"

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->m:I

    invoke-static {v1}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc:I

    move-object/from16 v4, p0

    invoke-static {v4, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v16

    .line 479
    move-object/from16 v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->k:F

    invoke-static {v3}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v17

    .line 480
    move-object/from16 v0, p0

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->h:F

    invoke-static {v3}, Lo/bzr;->d(F)F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v18

    .line 481
    const-string v0, "\\d+.\\d+|\\d+"

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->o:F

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_num:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_reco_train_share_desc:I

    move-object/from16 v4, p0

    invoke-static {v4, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v19

    .line 483
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v10, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 484
    move-object/from16 v0, v19

    invoke-virtual {v7, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 485
    move-object/from16 v0, v17

    invoke-virtual {v11, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 486
    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 487
    move-object/from16 v0, v16

    invoke-virtual {v12, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 488
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->s:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 489
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->x:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 490
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->x:Landroid/net/Uri;

    invoke-static {v0, v15}, Lo/cam;->b(Landroid/net/Uri;Landroid/widget/ImageView;)V

    .line 492
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v13, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 493
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->n:J

    long-to-float v0, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v20

    .line 494
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_FitnessAdvice_share_train_times:I

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->n:J

    long-to-float v2, v2

    const/high16 v3, 0x42700000    # 60.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Lo/bzr;->d(F)F

    move-result v2

    float-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v20, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 495
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mTotalTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->A:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private f()V
    .locals 6

    .line 697
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v4

    .line 699
    if-eqz v4, :cond_0

    .line 700
    invoke-interface {v4}, Lo/brr;->a()Lo/brw;

    move-result-object v5

    .line 701
    if-eqz v5, :cond_0

    .line 702
    invoke-interface {v5}, Lo/brw;->getPortrait()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->x:Landroid/net/Uri;

    .line 703
    invoke-interface {v5}, Lo/brw;->getNicaName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->v:Ljava/lang/String;

    .line 706
    :cond_0
    const-string v0, "ShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserInfo: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->x:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-mNicaName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 707
    return-void
.end method

.method private g()V
    .locals 2

    .line 449
    new-instance v1, Lo/dau;

    invoke-direct {v1}, Lo/dau;-><init>()V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Lo/dau;->d(Ljava/util/List;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Lo/dau;->a(Ljava/util/ArrayList;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->s:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lo/dau;->e(Ljava/lang/String;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/djl;->e(Landroid/content/Context;Lo/dau;)V

    .line 454
    return-void
.end method

.method private h()Z
    .locals 6

    .line 600
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 602
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->E:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 603
    const-string v0, "ShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ">_< >_< click too much"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    iput-wide v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->E:J

    .line 605
    const/4 v0, 0x1

    return v0

    .line 607
    :cond_0
    iput-wide v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->E:J

    .line 608
    const/4 v0, 0x0

    return v0
.end method

.method private i()Z
    .locals 6

    .line 743
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 745
    const/4 v0, 0x1

    return v0

    .line 747
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 748
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 752
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 753
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 755
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 756
    :goto_0
    if-nez v5, :cond_3

    .line 757
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->q(Landroid/content/Context;)V

    .line 758
    const/4 v0, 0x0

    return v0

    .line 761
    :cond_3
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V

    invoke-static {p0, v4, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 773
    const/4 v0, 0x0

    return v0

    .line 776
    :cond_4
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    const/4 v0, 0x1

    return v0

    .line 780
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method private k()V
    .locals 5

    .line 204
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_wechat_friends_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->B:Landroid/widget/LinearLayout;

    .line 205
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_wechat_chat_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->j:Landroid/widget/LinearLayout;

    .line 206
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_weibo_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->H:Landroid/widget/LinearLayout;

    .line 207
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_more_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->D:Landroid/widget/LinearLayout;

    .line 208
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_save_to_local_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->G:Landroid/widget/LinearLayout;

    .line 209
    sget v0, Lcom/huawei/health/suggestion/R$id;->dst_selector:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->C:Landroid/widget/RelativeLayout;

    .line 210
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->A:Landroid/widget/RelativeLayout;

    .line 211
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->B:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->share_wechat_friends_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->share_wechat_chat_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 213
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->H:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->share_weibo_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 214
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->D:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->share_more_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 215
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->G:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->share_save_local:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 218
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->B:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_socialshare_wechat_friends:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 219
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_socialshare_wechat_chat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 220
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->H:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_socialshare_weibo:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->D:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_user_profile_more:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 222
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->G:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_show_save_local:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 225
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->B:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->H:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 232
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 233
    const v0, 0x106000d

    invoke-virtual {v2, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 238
    sget v0, Lcom/huawei/health/suggestion/R$anim;->fly_up_in:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    .line 241
    new-instance v4, Landroid/view/animation/LayoutAnimationController;

    invoke-direct {v4, v3}, Landroid/view/animation/LayoutAnimationController;-><init>(Landroid/view/animation/Animation;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->C:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 246
    sget v0, Lcom/huawei/health/suggestion/R$anim;->fade_in:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->overridePendingTransition(II)V

    .line 248
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->B:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->G:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->H:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->D:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 181
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_share:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->setContentView(I)V

    .line 182
    sget v0, Lcom/huawei/health/suggestion/R$id;->view_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    .line 183
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_viewpager_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->q:Landroid/widget/RelativeLayout;

    .line 184
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 185
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 186
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 187
    iget v5, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 188
    const/4 v0, 0x1

    const/high16 v1, 0x44160000    # 600.0f

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(IF)F

    move-result v6

    .line 189
    int-to-float v0, v5

    cmpl-float v0, v6, v0

    if-lez v0, :cond_0

    .line 190
    int-to-float v0, v5

    const/4 v1, 0x1

    const/high16 v2, 0x43480000    # 200.0f

    invoke-static {v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(IF)F

    move-result v1

    sub-float v7, v0, v1

    .line 191
    const/high16 v0, 0x43c80000    # 400.0f

    div-float v0, v7, v0

    const/high16 v1, 0x437a0000    # 250.0f

    mul-float v8, v0, v1

    .line 192
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    .line 193
    float-to-int v0, v7

    iput v0, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 194
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    .line 196
    float-to-int v0, v8

    iput v0, v10, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 197
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v10}, Landroid/support/v4/view/ViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 199
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->k()V

    .line 200
    return-void
.end method

.method public a(I)V
    .locals 6

    .line 643
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doshare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v4

    .line 646
    if-nez v4, :cond_0

    .line 647
    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a:Lo/bzd;

    goto :goto_0

    .line 649
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    .line 651
    :goto_0
    invoke-direct {p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c(I)V

    .line 652
    invoke-static {v5}, Lo/buk;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->t:Landroid/graphics/Bitmap;

    .line 654
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->t:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 655
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShareBitmap is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    return-void

    .line 659
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->t:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 660
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShareBitmap isRecyCled "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    return-void

    .line 664
    :cond_2
    new-instance v0, Lo/dav;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dav;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c:Lo/dav;

    .line 665
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c:Lo/dav;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->t:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 666
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c:Lo/dav;

    sget-object v1, Lo/dae;->gS:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dav;->d(Ljava/lang/String;)V

    .line 667
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c:Lo/dav;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dav;->d(Z)V

    .line 668
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c:Lo/dav;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dav;->a(I)V

    .line 669
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->c:Lo/dav;

    invoke-static {v0, p1, v1}, Lo/djl;->c(Landroid/content/Context;ILo/dav;)V

    .line 670
    return-void
.end method

.method public b()V
    .locals 5

    .line 154
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->y:Landroid/content/Context;

    .line 155
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 156
    if-eqz v4, :cond_0

    .line 157
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    if-nez v0, :cond_1

    .line 160
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    const-string v1, "trainname"

    const-string v2, "--"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->f:Ljava/lang/String;

    .line 163
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    const-string v1, "trainduration"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->k:F

    .line 164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    const-string v1, "calorie"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->h:F

    .line 165
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    const-string v1, "percent"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->o:F

    .line 166
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    const-string v1, "levels_count"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->m:I

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    const-string v1, "exercisecurrent_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->p:J

    .line 168
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i:Landroid/os/Bundle;

    const-string v1, "exercise_total_time"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->n:J

    .line 169
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->p:J

    const/16 v3, 0x15

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->s:Ljava/lang/String;

    .line 170
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->f()V

    .line 171
    return-void
.end method

.method public b_()V
    .locals 0

    .line 177
    return-void
.end method

.method public d()V
    .locals 0

    .line 363
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->finish()V

    .line 364
    invoke-static {}, Lo/djl;->a()V

    .line 365
    return-void
.end method

.method public e()V
    .locals 4

    .line 279
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->u:Ljava/util/ArrayList;

    .line 280
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v3, v0, :cond_1

    .line 281
    if-nez v3, :cond_0

    .line 282
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->u:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->u:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->d(Ljava/util/ArrayList;I)V

    .line 280
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 287
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 288
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x42700000    # 60.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setPageMargin(I)V

    .line 289
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setScaleX(F)V

    .line 290
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setScaleY(F)V

    .line 291
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/view/ViewPager;->setPageTransformer(ZLandroid/support/v4/view/ViewPager$PageTransformer;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->q:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 320
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$b;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->u:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$b;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->r:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$b;

    .line 321
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->l:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->r:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$b;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 322
    return-void
.end method

.method public finish()V
    .locals 6

    .line 327
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->F:Z

    if-eqz v0, :cond_0

    .line 329
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The animation is finishing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    return-void

    .line 332
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->F:Z

    .line 334
    sget v0, Lcom/huawei/health/suggestion/R$anim;->fly_down_out:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v4

    .line 335
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->C:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 336
    sget v0, Lcom/huawei/health/suggestion/R$anim;->fade_out:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v5

    .line 337
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 338
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->A:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 339
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V

    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 360
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 549
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 550
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() if (isClickFast())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    return-void

    .line 555
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 557
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_save_to_local_layout:I

    if-ne v4, v0, :cond_2

    .line 558
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 559
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a(I)V

    .line 560
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_save_to_local_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 562
    :cond_1
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_save_to_local_layout failed with no storage permisssion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    :goto_0
    return-void

    .line 568
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 569
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_connect_error:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 570
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network connect error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    return-void

    .line 575
    :cond_3
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_wechat_friends_layout:I

    if-ne v4, v0, :cond_4

    .line 576
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_friends_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a(I)V

    goto/16 :goto_1

    .line 578
    :cond_4
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_wechat_chat_layout:I

    if-ne v4, v0, :cond_5

    .line 579
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_chat_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a(I)V

    goto :goto_1

    .line 581
    :cond_5
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_more_layout:I

    if-ne v4, v0, :cond_7

    .line 582
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_more_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 584
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a(I)V

    .line 585
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_save_to_more_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 587
    :cond_6
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_save_to_more_layout failed with no storage permisssion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    return-void

    .line 590
    :cond_7
    sget v0, Lcom/huawei/health/suggestion/R$id;->share_weibo_layout:I

    if-ne v4, v0, :cond_8

    .line 591
    const-string v0, "ShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_weibo_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->a(I)V

    .line 594
    :cond_8
    :goto_1
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 544
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 527
    return-void
.end method

.method public onPageSelected(I)V
    .locals 0

    .line 539
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 785
    const-string v0, "ShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 786
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 787
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 788
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 789
    const-string v0, "ShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission success"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 791
    :cond_0
    const-string v0, "ShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 792
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->finish()V

    .line 795
    :cond_1
    :goto_0
    return-void
.end method
