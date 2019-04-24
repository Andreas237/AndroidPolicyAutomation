.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lo/chu;

.field private b:Lo/chf;

.field private c:Lo/cgt;

.field private d:Landroid/content/Context;

.field e:Landroid/os/Bundle;

.field private f:I

.field private g:Landroid/view/View;

.field private h:I

.field private i:I

.field private k:Landroid/content/res/Resources;

.field private l:I

.field private m:Lo/cho;

.field private n:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b:Lo/chf;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    .line 81
    const/16 v0, 0x10

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->h:I

    .line 84
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    .line 86
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e:Landroid/os/Bundle;

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->n:I

    return v0
.end method

.method private a()V
    .locals 13

    .line 292
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 293
    new-instance v0, Lo/cho;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    invoke-direct {v0, v1, v2}, Lo/cho;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    .line 294
    const/4 v5, 0x0

    .line 295
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->e()[B

    move-result-object v6

    .line 296
    if-eqz v6, :cond_0

    .line 298
    :try_start_0
    array-length v0, v6

    const/4 v1, 0x0

    invoke-static {v6, v1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 302
    goto :goto_0

    .line 299
    :catch_0
    move-exception v7

    .line 300
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawMapAndDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    const/4 v5, 0x0

    .line 305
    :cond_0
    :goto_0
    if-nez v5, :cond_1

    .line 306
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b(Lo/cho;)V

    goto :goto_1

    .line 308
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-virtual {v0, v5}, Lo/cho;->setImgMap(Landroid/graphics/Bitmap;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/cho;->setLayoutStyle(IZ)V

    .line 313
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->h()Ljava/util/Map;

    move-result-object v7

    .line 314
    if-eqz v7, :cond_5

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_5

    .line 315
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0, v7}, Lo/cgt;->d(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v8

    .line 316
    if-eqz v8, :cond_4

    array-length v0, v8

    const/4 v1, 0x2

    if-lt v0, v1, :cond_4

    .line 317
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cho;->setMaxAndMinPaceVisibility(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v9

    .line 319
    invoke-static {v7}, Lo/cdl;->c(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v10

    .line 320
    const/4 v0, 0x0

    aget-object v0, v10, v0

    invoke-direct {p0, v0, v9}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b(Ljava/lang/Float;I)Ljava/lang/String;

    move-result-object v11

    .line 321
    const/4 v0, 0x1

    aget-object v0, v10, v0

    invoke-direct {p0, v0, v9}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b(Ljava/lang/Float;I)Ljava/lang/String;

    move-result-object v12

    .line 322
    invoke-static {v9}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-static {v0}, Lo/cgl;->c(Lo/cgt;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 324
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-static {v0}, Lo/cgl;->b(Lo/cgt;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 325
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgl;->e(Lo/cgt;Z)Ljava/lang/String;

    move-result-object v12

    .line 326
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgl;->c(Lo/cgt;Z)Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    .line 328
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/cho;->setMaxAndMinPaceVisibility(I)V

    .line 331
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    invoke-direct {p0, v12, v11, v9, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V

    .line 332
    goto :goto_3

    .line 333
    :cond_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/cho;->setMaxAndMinPaceVisibility(I)V

    .line 334
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-virtual {v0}, Lo/cho;->setPaceGradientViewToCutLine()V

    .line 336
    :goto_3
    goto :goto_4

    .line 337
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/cho;->setMaxAndMinPaceVisibility(I)V

    .line 338
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-virtual {v0}, Lo/cho;->setPaceGradientViewToCutLine()V

    .line 341
    :goto_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-virtual {v0}, Lo/cho;->e()Lo/chp;

    move-result-object v8

    .line 342
    if-eqz v8, :cond_6

    .line 343
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v9

    .line 344
    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cgl;->c(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/chp;->setSportStartTime(Ljava/lang/String;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-static {v0, v1}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/chp;->setTextSportType(Ljava/lang/String;)V

    .line 346
    invoke-direct {p0, v8, v9}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c(Lo/chp;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 349
    :cond_6
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d(Lo/cho;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a(Lo/cho;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c(Lo/cho;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i(Lo/cho;)V

    .line 356
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e(Lo/cho;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-virtual {v0, v1, v4}, Lo/chu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 360
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Landroid/view/View;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->g:Landroid/view/View;

    return-object v0
.end method

.method private b(Ljava/lang/Float;I)Ljava/lang/String;
    .locals 3

    .line 363
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v2

    .line 364
    invoke-static {p2}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 365
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 366
    :cond_0
    const/16 v0, 0x10a

    if-eq p2, v0, :cond_1

    const/16 v0, 0x106

    if-ne p2, v0, :cond_2

    .line 367
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v2

    .line 368
    :cond_2
    :goto_0
    return-object v2
.end method

.method private b()V
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    if-nez v0, :cond_0

    .line 254
    return-void

    .line 258
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a()V

    .line 260
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f()V

    .line 262
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k()V

    .line 266
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->o()V

    .line 269
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    .line 270
    const/16 v0, 0x109

    if-eq v1, v0, :cond_1

    .line 271
    invoke-static {v1}, Lo/cgl;->c(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 272
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->n()V

    .line 275
    :cond_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->h()V

    .line 276
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->r()V

    .line 277
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->l()V

    .line 279
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->p()V

    .line 280
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->s()V

    .line 282
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->g()V

    .line 285
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i()V

    .line 287
    return-void
.end method

.method private b(Lo/cho;)V
    .locals 2

    .line 397
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_0

    .line 398
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_watch2_no_map:I

    invoke-virtual {p1, v0}, Lo/cho;->setImgMap(I)V

    goto :goto_0

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x29

    if-ne v0, v1, :cond_1

    .line 400
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_s1_no_map:I

    invoke-virtual {p1, v0}, Lo/cho;->setImgMap(I)V

    goto :goto_0

    .line 401
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x4f

    if-ne v0, v1, :cond_2

    .line 402
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->img_device_honor_tolas_no_map:I

    invoke-virtual {p1, v0}, Lo/cho;->setImgMap(I)V

    goto :goto_0

    .line 403
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x50

    if-ne v0, v1, :cond_3

    .line 404
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->img_device_huawei_fortuna_no_map:I

    invoke-virtual {p1, v0}, Lo/cho;->setImgMap(I)V

    .line 406
    :cond_3
    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/cho;->setLayoutStyle(IZ)V

    .line 407
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->l:I

    return v0
.end method

.method private c(Lo/cho;)V
    .locals 10

    .line 689
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 690
    invoke-virtual {v4}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 692
    invoke-virtual {p1}, Lo/cho;->e()Lo/chp;

    move-result-object v6

    .line 695
    const/4 v7, 0x0

    .line 696
    if-eqz v5, :cond_0

    .line 697
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v7

    .line 699
    :cond_0
    if-eqz v7, :cond_1

    const-string v0, ""

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 700
    :cond_1
    new-instance v8, Lcom/huawei/up/api/UpApi;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 701
    invoke-virtual {v8}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v9

    .line 702
    move-object v7, v9

    .line 703
    invoke-virtual {v6, v9}, Lo/chp;->setUserName(Ljava/lang/String;)V

    .line 704
    goto :goto_0

    .line 705
    :cond_2
    invoke-virtual {v6, v7}, Lo/chp;->setUserName(Ljava/lang/String;)V

    .line 708
    :goto_0
    const/4 v8, 0x0

    .line 709
    if-eqz v5, :cond_3

    .line 710
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v8

    .line 712
    :cond_3
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 713
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 714
    if-eqz v9, :cond_4

    .line 715
    invoke-virtual {p1, v9}, Lo/cho;->setUserImg(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 718
    :cond_4
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()bmp != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 720
    :goto_1
    goto :goto_2

    .line 721
    :cond_5
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 723
    :goto_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 724
    invoke-virtual {p1}, Lo/cho;->d()V

    .line 726
    :cond_6
    return-void
.end method

.method private c(Lo/chp;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 8

    .line 436
    if-nez p2, :cond_0

    .line 437
    return-void

    .line 440
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v4

    .line 441
    const/4 v0, 0x2

    if-eq v0, v4, :cond_1

    const/4 v0, 0x1

    if-ne v0, v4, :cond_3

    .line 442
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    if-eqz v0, :cond_2

    .line 443
    invoke-virtual {p2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefData(Ljava/lang/String;)V

    goto :goto_0

    .line 445
    :cond_2
    const-string v0, "--"

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefData(Ljava/lang/String;)V

    .line 447
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefUnit(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 449
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    if-nez v0, :cond_4

    .line 450
    const-string v0, "--"

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefData(Ljava/lang/String;)V

    .line 452
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_5

    invoke-virtual {p2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_8

    .line 454
    :cond_5
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 455
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 456
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefUnit(Ljava/lang/String;)V

    goto :goto_1

    .line 458
    :cond_6
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefUnit(Ljava/lang/String;)V

    .line 460
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v7

    .line 461
    if-lez v7, :cond_7

    .line 462
    int-to-float v0, v7

    invoke-static {v0}, Lo/cgl;->h(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefData(Ljava/lang/String;)V

    goto :goto_2

    .line 464
    :cond_7
    const-string v0, "--"

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefData(Ljava/lang/String;)V

    .line 466
    :goto_2
    goto :goto_4

    .line 467
    :cond_8
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 468
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefUnit(Ljava/lang/String;)V

    goto :goto_3

    .line 470
    :cond_9
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefUnit(Ljava/lang/String;)V

    .line 472
    :goto_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v5

    .line 473
    if-lez v5, :cond_a

    .line 474
    int-to-double v0, v5

    invoke-static {v0, v1}, Lo/cgl;->e(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefData(Ljava/lang/String;)V

    goto :goto_4

    .line 476
    :cond_a
    const-string v0, "--"

    invoke-virtual {p1, v0}, Lo/chp;->setTextChiefData(Ljava/lang/String;)V

    .line 481
    :goto_4
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chf;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b:Lo/chf;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 233
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 235
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_device_card_bg:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/chu;->setAllChildViewBackgroudSource(II)V

    .line 236
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_watch_all_bg:I

    invoke-virtual {v0, v1}, Lo/chu;->setBackgroundResource(I)V

    .line 237
    goto :goto_1

    .line 239
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_device_card_bg:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/chu;->setAllChildViewBackgroudSource(II)V

    .line 240
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_watch_all_bg:I

    invoke-virtual {v0, v1}, Lo/chu;->setBackgroundResource(I)V

    .line 241
    goto :goto_1

    .line 244
    :goto_0
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_app_card_bg:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/chu;->setAllChildViewBackgroudSource(II)V

    .line 245
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->hw_show_health_share_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/chu;->setBackgroundColor(I)V

    .line 248
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V
    .locals 4

    .line 373
    invoke-static {p3}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p4, :cond_1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 374
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 375
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3, p2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 376
    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 377
    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 378
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 380
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 382
    :cond_0
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 383
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 386
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    .line 387
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    .line 389
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m:Lo/cho;

    invoke-virtual {v0, p1, p2}, Lo/cho;->setMaxAndMinPace(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    return-void
.end method

.method private d(Lo/cho;)V
    .locals 3

    .line 410
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v2

    .line 412
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 413
    const/high16 v0, -0x1000000

    invoke-virtual {p1, v0}, Lo/cho;->c(I)V

    .line 415
    :cond_0
    const/16 v0, 0x2e

    if-ne v2, v0, :cond_1

    .line 417
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_watch2_logo:I

    invoke-virtual {p1, v0}, Lo/cho;->setImgDevice(I)V

    .line 418
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lo/cho;->setTextDeviceVisibility(I)V

    goto :goto_0

    .line 420
    :cond_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_2

    .line 421
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lo/cho;->setImgDeviceVisibility(I)V

    .line 422
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/cho;->setTextDeviceVisibility(I)V

    .line 423
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_health_logo:I

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_app_name_health:I

    invoke-virtual {p1, v0, v1}, Lo/cho;->setTextDevice(II)V

    goto :goto_0

    .line 426
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lo/cho;->setImgDeviceVisibility(I)V

    .line 427
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/cho;->setTextDeviceVisibility(I)V

    .line 428
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    .line 429
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lo/cdo;->c(ILandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 428
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lo/cho;->setTextDevice(ILjava/lang/String;)V

    .line 432
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)Lo/chu;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->k()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 219
    const/16 v0, 0x65

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    .line 220
    const/16 v0, 0x65

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    goto :goto_0

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->k()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 222
    invoke-virtual {v0}, Lo/cgt;->k()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 223
    :cond_1
    const/16 v0, 0x66

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    .line 224
    const/16 v0, 0x65

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    goto :goto_0

    .line 226
    :cond_2
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    .line 227
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    .line 229
    :goto_0
    return-void
.end method

.method private e(Lo/cho;)V
    .locals 23

    .line 958
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 959
    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 960
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v9

    .line 961
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v10

    .line 962
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgEversionExcursion()I

    move-result v11

    .line 963
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgSwingAngle()I

    move-result v12

    .line 966
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v13

    .line 967
    const/4 v14, 0x0

    .line 968
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 969
    const/high16 v0, 0x45610000    # 3600.0f

    div-float v14, v0, v13

    .line 972
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgForeFootStrikePattern()I

    move-result v15

    .line 973
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgWholeFootStrikePattern()I

    move-result v16

    .line 974
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHindFootStrikePattern()I

    move-result v17

    .line 976
    add-int v0, v15, v16

    add-int v0, v0, v17

    int-to-double v1, v0

    move-wide/from16 v18, v1

    .line 978
    int-to-double v0, v15

    div-double v0, v0, v18

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v2, v0

    move/from16 v20, v2

    .line 979
    move/from16 v0, v17

    int-to-double v0, v0

    div-double v0, v0, v18

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v2, v0

    move/from16 v21, v2

    .line 980
    rsub-int/lit8 v0, v20, 0x64

    sub-int v22, v0, v21

    .line 981
    if-gez v22, :cond_1

    .line 982
    const/16 v22, 0x0

    .line 986
    :cond_1
    move-object/from16 v0, p1

    move v1, v9

    move v2, v10

    move v3, v11

    move v4, v12

    move v5, v14

    move/from16 v6, v20

    move/from16 v7, v22

    move/from16 v8, v21

    invoke-virtual/range {v0 .. v8}, Lo/cho;->c(IIIIFIII)V

    .line 987
    goto :goto_0

    .line 988
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lo/cho;->c()V

    .line 992
    :goto_0
    return-void
.end method

.method private f()V
    .locals 10

    .line 484
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    if-nez v0, :cond_1

    .line 485
    :cond_0
    return-void

    .line 487
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 488
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawHeartRateDataView hide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    return-void

    .line 492
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->c(Ljava/util/List;)I

    move-result v4

    .line 493
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v5

    .line 495
    new-instance v6, Lo/cie;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    invoke-direct {v6, v0, v2, v1}, Lo/cie;-><init>(Landroid/content/Context;II)V

    .line 496
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmHeartrateZoneType()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cie;->a(I)Landroid/view/View;

    move-result-object v7

    .line 497
    invoke-virtual {v6}, Lo/cie;->d()Lo/ekw;

    move-result-object v8

    .line 498
    if-nez v8, :cond_3

    .line 499
    return-void

    .line 502
    :cond_3
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v9

    .line 503
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v6, v0, v4, v5}, Lo/cie;->a(Lo/cgt;II)V

    .line 505
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Lo/cfe;->a(Lo/ekw;Lo/cfe$a;)Lo/elb;

    .line 506
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 507
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v8, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 508
    invoke-virtual {v8}, Lo/ekw;->c()V

    .line 510
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v7}, Lo/chu;->addView(Landroid/view/View;)V

    .line 511
    return-void
.end method

.method private f(Lo/cho;)Z
    .locals 8

    .line 1011
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v5

    .line 1014
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_0

    .line 1015
    invoke-static {v5}, Lo/cgl;->g(F)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 1017
    :cond_0
    invoke-virtual {p1}, Lo/cho;->g()V

    .line 1018
    const/4 v0, 0x0

    return v0

    .line 1021
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1022
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

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

    move-result-object v7

    goto :goto_1

    .line 1024
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

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

    move-result-object v7

    .line 1027
    :goto_1
    invoke-virtual {p1, v6, v7}, Lo/cho;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1030
    const/4 v0, 0x1

    return v0
.end method

.method private g()V
    .locals 5

    .line 556
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 557
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 558
    :cond_0
    return-void

    .line 560
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 561
    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cgt;->a(I)Ljava/util/Map;

    move-result-object v0

    .line 560
    invoke-static {v0}, Lo/cdl;->e(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 562
    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 563
    :cond_2
    return-void

    .line 566
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->s()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 567
    new-instance v4, Lo/cim;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    invoke-direct {v4, v0, v1}, Lo/cim;-><init>(Landroid/content/Context;I)V

    .line 568
    invoke-virtual {v4}, Lo/cim;->a()Landroid/view/View;

    move-result-object v3

    .line 569
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v4, v0, v2}, Lo/cim;->a(Lo/cgt;Ljava/util/Map;)V

    .line 570
    goto :goto_0

    .line 571
    :cond_4
    new-instance v4, Lo/cii;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    invoke-direct {v4, v0, v1}, Lo/cii;-><init>(Landroid/content/Context;I)V

    .line 572
    invoke-virtual {v4}, Lo/cii;->a()Landroid/view/View;

    move-result-object v3

    .line 573
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v4, v0, v2}, Lo/cii;->a(Lo/cgt;Ljava/util/Map;)V

    .line 575
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v3}, Lo/chu;->addView(Landroid/view/View;)V

    .line 576
    return-void
.end method

.method private h()V
    .locals 9

    .line 579
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    if-nez v0, :cond_1

    .line 580
    :cond_0
    return-void

    .line 582
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 583
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawStepRateView hide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    return-void

    .line 588
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    invoke-static {v0}, Lo/cgm;->a(Lo/cfd;)I

    move-result v4

    .line 595
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgStepRate()I

    move-result v5

    .line 598
    new-instance v6, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v6, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 602
    int-to-float v0, v5

    invoke-virtual {v6, v0}, Lo/cil;->d(F)V

    .line 603
    int-to-float v0, v4

    invoke-virtual {v6, v0}, Lo/cil;->c(F)V

    .line 604
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const v1, 0x415ccccd    # 13.8f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 605
    invoke-virtual {v6}, Lo/cil;->b()Lo/ekw;

    move-result-object v7

    .line 606
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v8

    .line 607
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    invoke-virtual {v8, v7, v0}, Lo/cfe;->e(Lo/ekw;Lo/cfe$a;)Lo/elb;

    .line 608
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 609
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v7, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 610
    invoke-virtual {v7}, Lo/ekw;->c()V

    .line 611
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v6}, Lo/chu;->addView(Landroid/view/View;)V

    .line 612
    return-void
.end method

.method private h(Lo/cho;)Z
    .locals 7

    .line 1035
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 1036
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "swim_pull_freq"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1037
    :cond_0
    invoke-virtual {p1}, Lo/cho;->f()V

    .line 1038
    const/4 v0, 0x0

    return v0

    .line 1041
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "swim_pull_freq"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 1043
    if-gtz v4, :cond_2

    .line 1044
    invoke-virtual {p1}, Lo/cho;->f()V

    .line 1045
    const/4 v0, 0x0

    return v0

    .line 1047
    :cond_2
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 1048
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_stroke_rate_unit:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v6

    .line 1050
    invoke-virtual {p1, v5, v6}, Lo/cho;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1051
    const/4 v0, 0x1

    return v0
.end method

.method private i()V
    .locals 7

    .line 616
    new-instance v4, Lo/chs;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    invoke-direct {v4, v0, v1}, Lo/chs;-><init>(Landroid/content/Context;I)V

    .line 618
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    invoke-virtual {v4, v0}, Lo/chs;->setLayoutStyle(I)V

    .line 619
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 620
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Lo/chs;->setLinkInfoVisibility(I)V

    goto/16 :goto_1

    .line 623
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/chs;->setLinkInfoVisibility(I)V

    .line 624
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->m()I

    move-result v5

    .line 625
    invoke-virtual {v4, v5}, Lo/chs;->setmImgDeviceLink(I)V

    .line 626
    const/4 v6, 0x0

    .line 627
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_1

    .line 628
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_watch2_pic:I

    invoke-virtual {v4, v0}, Lo/chs;->setmImgDevicePic(I)V

    .line 629
    const/4 v6, 0x1

    goto :goto_0

    .line 630
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x29

    if-ne v0, v1, :cond_2

    .line 631
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_s1_pic:I

    invoke-virtual {v4, v0}, Lo/chs;->setmImgDevicePic(I)V

    goto :goto_0

    .line 632
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x50

    if-ne v0, v1, :cond_3

    .line 633
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->img_device_huawei_fortuna_pic2:I

    invoke-virtual {v4, v0}, Lo/chs;->setmImgDevicePic(I)V

    goto :goto_0

    .line 634
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    const/16 v1, 0x4f

    if-ne v0, v1, :cond_4

    .line 635
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->img_device_honor_tolas_pic2:I

    invoke-virtual {v4, v0}, Lo/chs;->setmImgDevicePic(I)V

    .line 637
    :cond_4
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_health:I

    if-eq v5, v0, :cond_6

    .line 638
    if-eqz v6, :cond_5

    .line 639
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    .line 640
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 639
    invoke-static {v0, v1, v2}, Lo/cdo;->c(ILandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/chs;->setLeomTextDeviceName(Ljava/lang/String;)V

    goto :goto_1

    .line 642
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    .line 643
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 642
    invoke-static {v0, v1, v2}, Lo/cdo;->c(ILandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/chs;->setmTextDeviceName(Ljava/lang/String;)V

    goto :goto_1

    .line 646
    :cond_6
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_app_name_health:I

    invoke-virtual {v4, v0}, Lo/chs;->setmTextDeviceName(I)V

    .line 647
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_scan_qr_code_to_download:I

    invoke-virtual {v4, v0}, Lo/chs;->setmTextLinkTip(I)V

    .line 651
    :goto_1
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 652
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_7

    .line 653
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, -0x3db80000    # -50.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v1, v0, v2, v3}, Lo/chs;->setPadding(IIII)V

    .line 655
    :cond_7
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4, v5}, Lo/chu;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 658
    return-void
.end method

.method private i(Lo/cho;)V
    .locals 5

    .line 995
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 996
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-ne v0, v1, :cond_3

    .line 997
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->f(Lo/cho;)Z

    move-result v2

    .line 998
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->h(Lo/cho;)Z

    move-result v3

    .line 999
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k(Lo/cho;)Z

    move-result v4

    .line 1000
    if-nez v2, :cond_1

    if-nez v3, :cond_1

    if-eqz v4, :cond_2

    .line 1001
    :cond_1
    invoke-virtual {p1}, Lo/cho;->a()V

    goto :goto_0

    .line 1003
    :cond_2
    invoke-virtual {p1}, Lo/cho;->h()V

    .line 1005
    :goto_0
    goto :goto_1

    .line 1006
    :cond_3
    invoke-virtual {p1}, Lo/cho;->h()V

    .line 1009
    :goto_1
    return-void
.end method

.method private k()V
    .locals 10

    .line 514
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    if-nez v0, :cond_1

    .line 515
    :cond_0
    return-void

    .line 517
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v2

    .line 518
    if-nez v2, :cond_2

    .line 519
    return-void

    .line 521
    :cond_2
    const/4 v3, 0x0

    .line 522
    const/4 v4, 0x0

    .line 523
    const/4 v5, 0x0

    .line 524
    const/4 v6, 0x0

    .line 525
    const-string v0, "max_met"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 526
    if-eqz v7, :cond_3

    .line 527
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40600000    # 3.5f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x10000

    div-int v3, v0, v1

    .line 529
    :cond_3
    const-string v0, "etraining_effect"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 530
    if-eqz v7, :cond_4

    .line 531
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v4, v0, v1

    .line 533
    :cond_4
    const-string v0, "anaerobic_exercise_etraining_effect"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 534
    if-eqz v7, :cond_5

    .line 535
    const-string v0, "anaerobic_exercise_etraining_effect"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v5, v0, v1

    .line 538
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x104

    if-eq v0, v1, :cond_6

    const-string v0, "recovery_time"

    .line 539
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 540
    const-string v0, "recovery_time"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 542
    div-int/lit8 v6, v6, 0x3c

    .line 547
    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v4, v0

    if-gez v0, :cond_7

    if-gtz v3, :cond_7

    if-gtz v6, :cond_7

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v5, v0

    if-ltz v0, :cond_8

    .line 548
    :cond_7
    new-instance v8, Lo/cip;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    invoke-direct {v8, v0, v1}, Lo/cip;-><init>(Landroid/content/Context;I)V

    .line 549
    invoke-virtual {v8}, Lo/cip;->d()Landroid/view/View;

    move-result-object v9

    .line 550
    invoke-virtual {v8, v3, v4, v5, v6}, Lo/cip;->a(IFFI)V

    .line 551
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v9}, Lo/chu;->addView(Landroid/view/View;)V

    .line 553
    :cond_8
    return-void
.end method

.method private k(Lo/cho;)Z
    .locals 6

    .line 1056
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 1057
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "swim_avg_swolf"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1058
    :cond_0
    invoke-virtual {p1}, Lo/cho;->k()V

    .line 1059
    const/4 v0, 0x0

    return v0

    .line 1062
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "swim_avg_swolf"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 1064
    if-gtz v4, :cond_2

    .line 1065
    invoke-virtual {p1}, Lo/cho;->k()V

    .line 1066
    const/4 v0, 0x0

    return v0

    .line 1068
    :cond_2
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 1070
    invoke-virtual {p1, v5}, Lo/cho;->b(Ljava/lang/String;)V

    .line 1071
    const/4 v0, 0x1

    return v0
.end method

.method private l()V
    .locals 9

    .line 766
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 767
    return-void

    .line 771
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMinAlti()F

    move-result v5

    .line 772
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestMaxAlti()F

    move-result v6

    .line 773
    invoke-static {v5, v6}, Lo/cgl;->e(FF)Z

    move-result v0

    if-nez v0, :cond_1

    .line 774
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lo/cgl;->d(Ljava/util/ArrayList;)[Ljava/lang/Float;

    move-result-object v7

    .line 775
    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v6

    .line 776
    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v5

    .line 778
    :cond_1
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/16 v3, 0x64

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 779
    invoke-virtual {v4, v5}, Lo/cil;->d(F)V

    .line 780
    invoke-virtual {v4, v6}, Lo/cil;->c(F)V

    .line 782
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const v1, 0x415ccccd    # 13.8f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 783
    invoke-virtual {v4}, Lo/cil;->b()Lo/ekw;

    move-result-object v7

    .line 784
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v8

    .line 786
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    invoke-virtual {v8, v7, v0}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;)Lo/elb;

    .line 787
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 788
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v7, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 789
    invoke-virtual {v7}, Lo/ekw;->c()V

    .line 790
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4}, Lo/chu;->addView(Landroid/view/View;)V

    .line 791
    return-void
.end method

.method private m()I
    .locals 1

    .line 661
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 663
    :sswitch_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_leo:I

    return v0

    .line 665
    :sswitch_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_r1:I

    return v0

    .line 667
    :sswitch_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_nyx:I

    return v0

    .line 669
    :sswitch_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_a1_plus:I

    return v0

    .line 671
    :sswitch_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_metis:I

    return v0

    .line 673
    :sswitch_5
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_janus:I

    return v0

    .line 675
    :sswitch_6
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_honor_aw70_qr_code:I

    return v0

    .line 677
    :sswitch_7
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_fortuna:I

    return v0

    .line 679
    :sswitch_8
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_talos:I

    return v0

    .line 681
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_health:I

    return v0

    :sswitch_data_0
    .sparse-switch
        0x29 -> :sswitch_4
        0x2a -> :sswitch_2
        0x2b -> :sswitch_1
        0x2c -> :sswitch_3
        0x2e -> :sswitch_0
        0x4a -> :sswitch_5
        0x4f -> :sswitch_8
        0x50 -> :sswitch_7
        0x53 -> :sswitch_6
    .end sparse-switch
.end method

.method private n()V
    .locals 11

    .line 794
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 795
    return-void

    .line 800
    :cond_0
    const/4 v5, 0x1

    .line 801
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v6

    .line 802
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v7

    .line 803
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->q()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->a(Ljava/util/List;)I

    move-result v0

    int-to-float v8, v0

    .line 805
    const/16 v0, 0x106

    if-eq v6, v0, :cond_1

    const/16 v0, 0x10a

    if-ne v6, v0, :cond_3

    .line 807
    :cond_1
    const/high16 v0, 0x41200000    # 10.0f

    div-float/2addr v7, v0

    .line 808
    const/high16 v0, 0x41200000    # 10.0f

    div-float/2addr v8, v0

    .line 809
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 810
    float-to-double v0, v7

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v7, v0

    .line 811
    float-to-double v0, v8

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v8, v0

    .line 813
    :cond_2
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/4 v3, 0x6

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    goto :goto_0

    .line 815
    :cond_3
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 816
    float-to-double v0, v7

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v7, v0

    .line 817
    float-to-double v0, v8

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v8, v0

    .line 819
    :cond_4
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/16 v3, 0x9

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 821
    :goto_0
    invoke-virtual {v4, v7}, Lo/cil;->d(F)V

    .line 823
    invoke-virtual {v4, v8}, Lo/cil;->c(F)V

    .line 825
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 827
    invoke-virtual {v4}, Lo/cil;->b()Lo/ekw;

    move-result-object v9

    .line 828
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v10

    .line 830
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    invoke-virtual {v10, v9, v0}, Lo/cfe;->k(Lo/ekw;Lo/cfe$a;)Lo/elb;

    .line 831
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 832
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v9, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 833
    invoke-virtual {v9}, Lo/ekw;->c()V

    .line 834
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4}, Lo/chu;->addView(Landroid/view/View;)V

    .line 835
    return-void
.end method

.method private o()V
    .locals 7

    .line 739
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 740
    return-void

    .line 743
    :cond_0
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/4 v3, 0x3

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 745
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 747
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    .line 746
    invoke-static {v0}, Lo/cgl;->i(F)D

    move-result-wide v0

    double-to-float v0, v0

    .line 745
    invoke-virtual {v4, v0}, Lo/cil;->d(F)V

    .line 749
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 751
    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->r()Ljava/util/List;

    move-result-object v0

    .line 750
    invoke-static {v0}, Lo/cgm;->b(Ljava/util/List;)D

    move-result-wide v0

    double-to-float v0, v0

    .line 749
    invoke-virtual {v4, v0}, Lo/cil;->c(F)V

    .line 753
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const v1, 0x415ccccd    # 13.8f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 755
    invoke-virtual {v4}, Lo/cil;->b()Lo/ekw;

    move-result-object v5

    .line 756
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v6

    .line 758
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    invoke-virtual {v6, v5, v0}, Lo/cfe;->c(Lo/ekw;Lo/cfe$a;)Lo/elb;

    .line 759
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 760
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v5, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 761
    invoke-virtual {v5}, Lo/ekw;->c()V

    .line 762
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4}, Lo/chu;->addView(Landroid/view/View;)V

    .line 763
    return-void
.end method

.method private p()V
    .locals 9

    .line 838
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 839
    return-void

    .line 842
    :cond_0
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/4 v3, 0x5

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 844
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v5

    .line 845
    if-nez v5, :cond_1

    .line 846
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawPullFreqView sportData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 847
    return-void

    .line 851
    :cond_1
    const-string v0, "swim_pull_freq"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 852
    if-eqz v6, :cond_2

    .line 853
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->d(F)V

    goto :goto_0

    .line 855
    :cond_2
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stroke rate is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 856
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/cil;->d(F)V

    .line 859
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->s()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->f(Ljava/util/List;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->c(F)V

    .line 863
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 865
    invoke-virtual {v4}, Lo/cil;->b()Lo/ekw;

    move-result-object v7

    .line 866
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v8

    .line 868
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    invoke-virtual {v8, v7, v0}, Lo/cfe;->h(Lo/ekw;Lo/cfe$a;)Lo/elb;

    .line 869
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 870
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v7, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 871
    invoke-virtual {v7}, Lo/ekw;->c()V

    .line 872
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4}, Lo/chu;->addView(Landroid/view/View;)V

    .line 873
    return-void
.end method

.method private q()V
    .locals 8

    .line 938
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/16 v3, 0x8

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 940
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v5

    .line 942
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->d(F)V

    .line 943
    invoke-static {v5}, Lo/cgm;->k(Ljava/util/List;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->c(F)V

    .line 945
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 947
    invoke-virtual {v4}, Lo/cil;->b()Lo/ekw;

    move-result-object v6

    .line 948
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v7

    .line 950
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v7, v6, v0, v1}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;I)Lo/elb;

    .line 951
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 952
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v6, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 953
    invoke-virtual {v6}, Lo/ekw;->c()V

    .line 954
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4}, Lo/chu;->addView(Landroid/view/View;)V

    .line 955
    return-void
.end method

.method private r()V
    .locals 1

    .line 907
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 908
    return-void

    .line 911
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->u()V

    .line 912
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->q()V

    .line 914
    return-void
.end method

.method private s()V
    .locals 8

    .line 876
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 877
    return-void

    .line 880
    :cond_0
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/4 v3, 0x4

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 882
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v5

    .line 884
    if-eqz v5, :cond_1

    const-string v0, "swim_avg_swolf"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 885
    const-string v0, "swim_avg_swolf"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->d(F)V

    goto :goto_0

    .line 887
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/cil;->d(F)V

    .line 888
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportData or avgswolf is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->i(Ljava/util/List;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->c(F)V

    .line 893
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 895
    invoke-virtual {v4}, Lo/cil;->b()Lo/ekw;

    move-result-object v6

    .line 896
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v7

    .line 898
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    invoke-virtual {v7, v6, v0}, Lo/cfe;->b(Lo/ekw;Lo/cfe$a;)Lo/elb;

    .line 899
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 900
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v6, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 901
    invoke-virtual {v6}, Lo/ekw;->c()V

    .line 902
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4}, Lo/chu;->addView(Landroid/view/View;)V

    .line 903
    return-void
.end method

.method private u()V
    .locals 8

    .line 918
    new-instance v4, Lo/cil;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/4 v2, 0x1

    const/4 v3, 0x7

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cil;-><init>(Landroid/content/Context;IZI)V

    .line 920
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v5

    .line 922
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->d(F)V

    .line 923
    invoke-static {v5}, Lo/cgm;->h(Ljava/util/List;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/cil;->c(F)V

    .line 925
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Lo/cil;->setPadding(IIII)V

    .line 927
    invoke-virtual {v4}, Lo/cil;->b()Lo/ekw;

    move-result-object v6

    .line 928
    invoke-static {}, Lo/cfe;->e()Lo/cfe;

    move-result-object v7

    .line 930
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/cfe$a;->a(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cfe$a;->d(Z)Lo/cfe$a;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v7, v6, v0, v1}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;I)Lo/elb;

    .line 931
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/ekw;->setTouchEnabled(Z)V

    .line 932
    sget-object v0, Lo/ekw$h;->a:Lo/ekw$h;

    invoke-virtual {v6, v0}, Lo/ekw;->setTimeValueMode(Lo/ekw$h;)V

    .line 933
    invoke-virtual {v6}, Lo/ekw;->c()V

    .line 934
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v4}, Lo/chu;->addView(Landroid/view/View;)V

    .line 935
    return-void
.end method


# virtual methods
.method public a(Lo/cho;)V
    .locals 5

    .line 729
    new-instance v4, Lo/cgp;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 730
    invoke-virtual {v1}, Lo/cgt;->a()Lo/cex;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    iget v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->i:I

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cgp;-><init>(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;Landroid/content/Context;I)V

    .line 731
    invoke-virtual {p1}, Lo/cho;->b()Lo/che;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->h:I

    const/4 v2, 0x1

    invoke-virtual {v4, v0, v2, v1}, Lo/cgp;->d(Lo/che;ZI)V

    .line 732
    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    .line 735
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 95
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 97
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 14
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 104
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e:Landroid/os/Bundle;

    .line 107
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->fragment_track_share_all_data:I

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 108
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    .line 109
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->k:Landroid/content/res/Resources;

    .line 111
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->h:I

    .line 113
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_scrollview_share:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chu;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    .line 114
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_all_data_scroll:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chf;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b:Lo/chf;

    .line 115
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_all_white:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->g:Landroid/view/View;

    .line 117
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->c()Lo/cgt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    .line 118
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c:Lo/cgt;

    if-nez v0, :cond_0

    .line 119
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/4 v0, 0x0

    return-object v0

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x437a0000    # 250.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v6

    .line 124
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e:Landroid/os/Bundle;

    const-string v1, "allDataWidth"

    invoke-virtual {v0, v1, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 126
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e:Landroid/os/Bundle;

    const-string v1, "allDataHeight"

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->l:I

    goto :goto_0

    .line 128
    :cond_1
    move v5, v6

    .line 129
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->l:I

    .line 131
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    int-to-float v1, v5

    int-to-float v2, v6

    div-float/2addr v1, v2

    const/high16 v2, 0x43be0000    # 380.0f

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->n:I

    .line 133
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b:Lo/chf;

    invoke-virtual {v0}, Lo/chf;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    .line 134
    iput v5, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 135
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->l:I

    iput v0, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 136
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b:Lo/chf;

    invoke-virtual {v0, v7}, Lo/chf;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/WindowManager;

    .line 139
    new-instance v9, Landroid/util/DisplayMetrics;

    invoke-direct {v9}, Landroid/util/DisplayMetrics;-><init>()V

    .line 140
    invoke-interface {v8}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 142
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 144
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0}, Lo/chu;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    .line 145
    iput v10, v11, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 146
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v11}, Lo/chu;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->e()V

    .line 150
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b()V

    .line 152
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d()V

    .line 154
    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v10

    div-float v12, v0, v1

    .line 155
    move v13, v12

    .line 157
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    int-to-float v1, v10

    invoke-virtual {v0, v1}, Lo/chu;->setPivotX(F)V

    .line 159
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chu;->setPivotY(F)V

    goto :goto_1

    .line 161
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chu;->setPivotX(F)V

    .line 162
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chu;->setPivotY(F)V

    .line 165
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v12}, Lo/chu;->setScaleX(F)V

    .line 166
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->a:Lo/chu;

    invoke-virtual {v0, v13}, Lo/chu;->setScaleY(F)V

    .line 169
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b:Lo/chf;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;

    invoke-direct {v1, p0, v13}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;F)V

    invoke-virtual {v0, v1}, Lo/chf;->setOnScrollChangedListener(Lo/chf$d;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->b:Lo/chf;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;

    invoke-direct {v1, p0, v13}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;F)V

    invoke-virtual {v0, v1}, Lo/chf;->post(Ljava/lang/Runnable;)Z

    .line 191
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 203
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 204
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    return-void
.end method

.method public onDetach()V
    .locals 4

    .line 210
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 211
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDetach"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 196
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 197
    const-string v0, "Track_TrackShareAllDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void
.end method
