.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# static fields
.field private static final c:I


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Lo/cgt;

.field private d:Landroid/graphics/Matrix;

.field private e:Landroid/view/View;

.field private f:Landroid/content/Context;

.field private g:Landroid/widget/ImageView;

.field private h:Lo/egb;

.field private i:Landroid/widget/LinearLayout;

.field private k:Lo/egb;

.field private l:Lo/egb;

.field private m:Lo/egb;

.field private n:Lo/egb;

.field private o:Lo/egb;

.field private p:Lo/egb;

.field private q:Lo/egb;

.field private r:Lo/egb;

.field private s:Lo/egb;

.field private t:Lo/egb;

.field private u:Lo/egb;

.field private v:Lo/egb;

.field private w:Z

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const-string v0, "#6B6B6B"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    .line 62
    const-string v0, "--"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->z:Ljava/lang/String;

    return-void
.end method

.method private a(D)Ljava/lang/String;
    .locals 6

    .line 299
    double-to-float v0, p1

    const/high16 v1, 0x41200000    # 10.0f

    div-float v5, v0, v1

    .line 300
    float-to-double v0, v5

    const-wide v2, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    float-to-double v0, v5

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->z:Ljava/lang/String;

    return-object v0

    .line 303
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 304
    float-to-double v0, v5

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 306
    :cond_2
    invoke-static {v5}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    .line 307
    return-object v4
.end method

.method private a()V
    .locals 10

    .line 359
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 360
    invoke-virtual {v4}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 361
    const/4 v6, 0x0

    .line 362
    if-eqz v5, :cond_0

    .line 363
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v6

    .line 365
    :cond_0
    if-eqz v6, :cond_1

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 366
    :cond_1
    new-instance v7, Lcom/huawei/up/api/UpApi;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 367
    invoke-virtual {v7}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v8

    .line 368
    move-object v6, v8

    .line 369
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 370
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->u:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 371
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->t:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    goto :goto_0

    .line 373
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->u:Lo/egb;

    invoke-virtual {v0, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 374
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->t:Lo/egb;

    invoke-virtual {v0, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 376
    :goto_0
    goto :goto_1

    .line 377
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->u:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->t:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 380
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_short_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 381
    const/4 v8, 0x0

    .line 382
    if-eqz v5, :cond_4

    .line 383
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v8

    .line 385
    :cond_4
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 386
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 387
    if-eqz v9, :cond_5

    .line 388
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 390
    :cond_5
    const-string v0, "Track_ShortTrackShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()bmp != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    :goto_2
    goto :goto_3

    .line 393
    :cond_6
    const-string v0, "Track_ShortTrackShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    :goto_3
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 397
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 398
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 400
    :cond_7
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_short_qrcode:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 402
    :cond_8
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Matrix;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->d:Landroid/graphics/Matrix;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 98
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->w:Z

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->u:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c:I

    invoke-virtual {v0, v1}, Lo/egb;->setTextColor(I)V

    .line 100
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->o:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c:I

    invoke-virtual {v0, v1}, Lo/egb;->setTextColor(I)V

    .line 101
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_shadow:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 102
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 103
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v3

    .line 104
    int-to-float v0, v3

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setTranslationX(F)V

    .line 105
    int-to-float v0, v3

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setTranslationY(F)V

    .line 107
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->g:Landroid/widget/ImageView;

    return-object v0
.end method

.method private c()V
    .locals 7

    .line 110
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_short_map:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->g:Landroid/widget/ImageView;

    .line 112
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->d:Landroid/graphics/Matrix;

    .line 113
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->g:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 136
    :cond_0
    const-string v0, "Track_ShortTrackShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_distance_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->h:Lo/egb;

    .line 140
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->text_targetUnit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->k:Lo/egb;

    .line 141
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_during_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->n:Lo/egb;

    .line 142
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_calorie_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->l:Lo/egb;

    .line 143
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_speed_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->m:Lo/egb;

    .line 144
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_formal_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->o:Lo/egb;

    .line 145
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_formal_time_shadow:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->q:Lo/egb;

    .line 146
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_linear_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->i:Landroid/widget/LinearLayout;

    .line 147
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->txt_track_share_map_max_pace_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    .line 148
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->txt_track_share_map_min_pace_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->r:Lo/egb;

    .line 149
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_usrname:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->u:Lo/egb;

    .line 150
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_usrname_shadow:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->t:Lo/egb;

    .line 151
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_speed_value_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->s:Lo/egb;

    .line 152
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_mid_datatype:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->v:Lo/egb;

    .line 153
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->img_track_share_pace_gradient:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 154
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_pic_health_content:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v5

    .line 156
    if-eqz v5, :cond_1

    .line 157
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 159
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->k:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 160
    const/16 v0, 0x11

    iput v0, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 161
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->k:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    :cond_2
    return-void
.end method

.method private d()V
    .locals 19

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v5

    .line 167
    if-nez v5, :cond_0

    .line 168
    const-string v0, "Track_ShortTrackShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simplify is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 170
    return-void

    .line 173
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x15

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v6

    .line 174
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v7, v0, v2

    .line 175
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v9

    .line 176
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    const/4 v0, 0x3

    invoke-static {v7, v8, v0}, Lo/cxh;->a(DI)D

    move-result-wide v7

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->k:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 179
    float-to-double v0, v9

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v9, v0

    .line 182
    :cond_1
    const/4 v0, 0x0

    cmpg-float v0, v9, v0

    if-gtz v0, :cond_2

    .line 183
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 185
    :cond_2
    invoke-static {v9}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v10

    .line 187
    :goto_0
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    long-to-int v0, v0

    div-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 189
    const-wide/16 v0, 0x0

    cmpg-double v0, v7, v0

    if-gtz v0, :cond_3

    .line 190
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    .line 192
    :cond_3
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v7, v8, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v12

    .line 194
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->m:Lo/egb;

    invoke-virtual {v0, v10}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 195
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->o:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 196
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->q:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 197
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->l:Lo/egb;

    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v1

    invoke-static {v1}, Lo/cgl;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 198
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->h:Lo/egb;

    invoke-virtual {v0, v12}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->n:Lo/egb;

    invoke-virtual {v0, v11}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 200
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->h()Ljava/util/Map;

    move-result-object v13

    .line 201
    if-eqz v13, :cond_a

    invoke-interface {v13}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_a

    .line 202
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-virtual {v0, v13}, Lo/cgt;->d(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v14

    .line 203
    if-eqz v14, :cond_9

    array-length v0, v14

    const/4 v1, 0x2

    if-lt v0, v1, :cond_9

    .line 204
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 205
    const/4 v0, 0x0

    aget-object v0, v14, v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Ljava/lang/Float;)Ljava/lang/String;

    move-result-object v15

    .line 206
    const/4 v0, 0x1

    aget-object v0, v14, v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Ljava/lang/Float;)Ljava/lang/String;

    move-result-object v16

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-static {v0}, Lo/cgl;->c(Lo/cgt;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-static {v0}, Lo/cgl;->b(Lo/cgt;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cgl;->e(Lo/cgt;Z)Ljava/lang/String;

    move-result-object v16

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cgl;->c(Lo/cgt;Z)Ljava/lang/String;

    move-result-object v15

    goto :goto_2

    .line 212
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->r:Lo/egb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 216
    :cond_5
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    invoke-virtual {v0, v15}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->r:Lo/egb;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 218
    goto/16 :goto_3

    :cond_6
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_7

    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_8

    .line 219
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    aget-object v2, v14, v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    move-object/from16 v4, p0

    invoke-direct {v4, v2, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    move-object/from16 v3, p0

    invoke-direct {v3, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    aget-object v2, v14, v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    move-object/from16 v4, p0

    invoke-direct {v4, v2, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    move-object/from16 v3, p0

    invoke-direct {v3, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 223
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    invoke-virtual {v2}, Lo/egb;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, v14, v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {v2}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 224
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->r:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->r:Lo/egb;

    invoke-virtual {v2}, Lo/egb;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v2, v14, v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {v2}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 228
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->r:Lo/egb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 231
    :goto_3
    goto :goto_4

    .line 232
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->p:Lo/egb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->r:Lo/egb;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 236
    :goto_4
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x104

    if-ne v0, v1, :cond_c

    .line 237
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v14, v0, v1

    .line 240
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 241
    float-to-double v0, v14

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v17

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v15

    .line 243
    move-wide/from16 v0, v17

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v16

    .line 244
    goto :goto_5

    .line 245
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 246
    float-to-double v0, v14

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v16

    .line 248
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->m:Lo/egb;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 249
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_speed_value_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/egb;

    .line 250
    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 251
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 252
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_mid_datatype:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    .line 253
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_total_climbed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 254
    goto/16 :goto_7

    :cond_c
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x103

    if-ne v0, v1, :cond_e

    .line 256
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->v:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 257
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->s:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->m:Lo/egb;

    invoke-static {v9}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 259
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 260
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->s:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_7

    .line 262
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->s:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_7

    .line 264
    :cond_e
    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_f

    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_12

    .line 265
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->s:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 266
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->m:Lo/egb;

    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v1

    float-to-double v1, v1

    move-object/from16 v3, p0

    invoke-direct {v3, v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 267
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->s:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 269
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 270
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v14

    .line 271
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->k:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 273
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->k:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 275
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v16

    .line 276
    if-lez v16, :cond_11

    .line 277
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->h:Lo/egb;

    move/from16 v1, v16

    int-to-float v1, v1

    invoke-static {v1}, Lo/cgl;->h(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_7

    .line 279
    :cond_11
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->h:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 282
    :cond_12
    :goto_7
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;)Landroid/graphics/Bitmap;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private e(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 285
    const-string v5, ""

    .line 286
    if-nez p1, :cond_0

    .line 287
    const-string v0, "Track_ShortTrackShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aquireSwinUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    return-object v5

    .line 290
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 293
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 295
    :goto_0
    return-object v5
.end method

.method private e(Ljava/lang/Float;)Ljava/lang/String;
    .locals 3

    .line 311
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 312
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 313
    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 314
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 319
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 7

    .line 323
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v2

    .line 324
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v3

    .line 326
    const/16 v0, 0x2e

    if-ne v2, v0, :cond_0

    .line 327
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_huaweiwatch_1:I

    goto :goto_1

    .line 328
    :cond_0
    const/16 v0, 0x29

    if-ne v2, v0, :cond_1

    .line 329
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_ertongwatch:I

    goto :goto_1

    .line 331
    :cond_1
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 334
    :pswitch_0
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_hshouhuan:I

    .line 335
    goto :goto_1

    .line 337
    :pswitch_1
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_ertongwatch:I

    .line 338
    goto :goto_1

    .line 340
    :pswitch_2
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_erji:I

    .line 341
    goto :goto_1

    .line 343
    :goto_0
    const/4 v4, 0x0

    .line 348
    :goto_1
    if-nez v4, :cond_2

    .line 349
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_short_device_info:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 351
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_share_appname:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/egb;

    .line 352
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_short_logo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 353
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lo/cdo;->c(ILandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 354
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 356
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 66
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 67
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->e()[B

    move-result-object v4

    .line 68
    if-eqz v4, :cond_0

    .line 70
    :try_start_0
    array-length v0, v4

    const/4 v1, 0x0

    invoke-static {v4, v1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    goto :goto_0

    .line 71
    :catch_0
    move-exception v5

    .line 72
    const-string v0, "Track_ShortTrackShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decodeMapBitmap "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a:Landroid/graphics/Bitmap;

    .line 76
    :cond_0
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
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

    .line 81
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_short_track:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    .line 82
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    .line 83
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v2

    .line 84
    invoke-virtual {v2}, Lo/cfa;->c()Lo/cgt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    .line 85
    invoke-virtual {v2}, Lo/cfa;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->w:Z

    .line 86
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b:Lo/cgt;

    if-nez v0, :cond_0

    .line 87
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 89
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->c()V

    .line 90
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e()V

    .line 91
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->a()V

    .line 92
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->d()V

    .line 93
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->b()V

    .line 94
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->e:Landroid/view/View;

    return-object v0
.end method
