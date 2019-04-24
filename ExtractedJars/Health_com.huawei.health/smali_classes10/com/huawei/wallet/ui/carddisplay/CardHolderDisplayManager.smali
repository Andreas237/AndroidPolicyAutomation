.class public Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;
.super Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;
.source "SourceFile"


# instance fields
.field private q:Z

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;"
        }
    .end annotation
.end field

.field private t:F

.field private w:Ljava/lang/String;

.field private y:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;IILjava/lang/String;)V
    .locals 1

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;-><init>(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;II)V

    .line 44
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->w:Ljava/lang/String;

    .line 61
    iput-object p5, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->w:Ljava/lang/String;

    .line 62
    return-void
.end method

.method private b(Landroid/widget/TextView;)V
    .locals 4

    .line 486
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->w:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/StringUtil;->e(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    :cond_0
    const-string v0, "CardHolderDisplayManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " SupportType is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$string;->add_online_card_bus:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 489
    return-void

    .line 491
    :cond_1
    const-string v0, "CardHolderDisplayManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mSupportType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->w:Ljava/lang/String;

    const-string v1, "0010"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->w:Ljava/lang/String;

    const-string v1, "0011"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 494
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$string;->add_offline_card_brief:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 496
    :cond_3
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$string;->add_online_card_bus:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 498
    :goto_0
    return-void
.end method

.method private c(ILcom/huawei/wallet/model/unicard/UniCardInfo;)Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;
    .locals 8

    .line 466
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->n()Ljava/lang/String;

    move-result-object v3

    .line 467
    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f()I

    move-result v4

    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i()Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    move-object v6, v0

    .line 469
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->h:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g:I

    invoke-direct {v7, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 470
    const/16 v0, 0xe

    invoke-virtual {v7, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 471
    invoke-virtual {v6, v7}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 472
    sget v0, Lcom/huawei/base/R$id;->card_virtual:I

    invoke-virtual {v6, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setId(I)V

    .line 473
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v6, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->addView(Landroid/view/View;I)V

    .line 474
    return-object v6
.end method

.method private h(I)Landroid/view/View;
    .locals 7

    .line 420
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 422
    sget v0, Lcom/huawei/base/R$layout;->card_empty_view:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 423
    sget v0, Lcom/huawei/base/R$id;->card_virtual:I

    invoke-virtual {v3, v0}, Landroid/view/View;->setId(I)V

    .line 433
    sget v0, Lcom/huawei/base/R$id;->description:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 434
    sget v0, Lcom/huawei/base/R$id;->empty_icon:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 435
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 437
    const v0, 0x800003

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 438
    invoke-direct {p0, v4}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b(Landroid/widget/TextView;)V

    .line 439
    sget v0, Lcom/huawei/base/R$drawable;->img_empty_offline:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 443
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$string;->add_online_card_brief:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 444
    sget v0, Lcom/huawei/base/R$drawable;->img_empty_online:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 447
    :goto_0
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->h:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g:I

    invoke-direct {v6, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 448
    const/16 v0, 0xe

    invoke-virtual {v6, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 449
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v3}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->addView(Landroid/view/View;)V

    .line 452
    return-object v3
.end method


# virtual methods
.method public a(IIIF)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIF)Ljava/util/ArrayList<Landroid/animation/Animator;>;"
        }
    .end annotation

    .line 367
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 368
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->q:Z

    if-eqz v0, :cond_1

    .line 371
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 372
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->o:F

    const/4 v1, 0x0

    move/from16 v2, p3

    invoke-static {v9, v1, v2, v0}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->b(Landroid/view/View;IIF)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 373
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    const/4 v10, 0x1

    :goto_0
    if-ge v10, p2, :cond_0

    .line 379
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v10}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 380
    new-instance v12, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v12, p0, v10}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 381
    move-object v0, v11

    move v1, v10

    move v2, p1

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v3, v3, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    move v4, p2

    move/from16 v5, p3

    iget v6, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->o:F

    invoke-static/range {v0 .. v6}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->b(Landroid/view/View;IIFIIF)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 383
    invoke-virtual {v7, v12}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 384
    invoke-virtual {v7, v12}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 385
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 388
    :cond_0
    goto/16 :goto_2

    .line 389
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->y:Z

    if-eqz v0, :cond_3

    .line 392
    add-int/lit8 v9, p2, -0x1

    .line 393
    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_2

    .line 395
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v10}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 396
    new-instance v12, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v12, p0, v10}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 397
    move-object v0, v11

    move v1, v10

    move v2, p1

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v3, v3, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    move v4, v9

    move/from16 v5, p3

    iget v6, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->o:F

    invoke-static/range {v0 .. v6}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->b(Landroid/view/View;IIFIIF)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 400
    invoke-virtual {v7, v12}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 401
    invoke-virtual {v7, v12}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 402
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 406
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 407
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->o:F

    move/from16 v1, p3

    invoke-static {v10, v9, v1, v0}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->b(Landroid/view/View;IIF)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 408
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    goto :goto_2

    .line 413
    :cond_3
    move/from16 v0, p3

    move/from16 v1, p4

    invoke-super {p0, p1, p2, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a(IIIF)Ljava/util/ArrayList;

    move-result-object v8

    .line 415
    :goto_2
    return-object v8
.end method

.method public b(II)I
    .locals 3

    .line 87
    const/4 v1, 0x0

    .line 88
    const/4 v2, 0x0

    .line 89
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v2, v0

    .line 97
    :cond_1
    invoke-virtual {p0, p1, p2, v2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c(III)I

    move-result v1

    .line 98
    return v1
.end method

.method public c(IIIF)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIF)Ljava/util/ArrayList<Landroid/animation/Animator;>;"
        }
    .end annotation

    .line 331
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 334
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->y:Z

    if-eqz v0, :cond_1

    .line 337
    add-int/lit8 v9, p2, -0x1

    .line 338
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_0

    .line 340
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v10}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 341
    new-instance v12, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v12, p0, v10}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 342
    move-object v0, v11

    move v1, v10

    move v2, p1

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v3, v3, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    move v4, v9

    move/from16 v5, p3

    iget v6, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->o:F

    invoke-static/range {v0 .. v6}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->a(Landroid/view/View;IIFIIF)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 345
    invoke-virtual {v8, v12}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 346
    invoke-virtual {v8, v12}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 347
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 351
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 352
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->o:F

    move/from16 v1, p3

    invoke-static {v10, v9, v1, v0}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->b(Landroid/view/View;IIF)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 353
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    goto :goto_1

    .line 358
    :cond_1
    move/from16 v0, p3

    move/from16 v1, p4

    invoke-super {p0, p1, p2, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c(IIIF)Ljava/util/ArrayList;

    move-result-object v7

    .line 360
    :goto_1
    return-object v7
.end method

.method protected c()V
    .locals 13

    .line 104
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 105
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v7

    .line 107
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_1

    .line 109
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 110
    if-ge v9, v6, :cond_0

    .line 112
    move-object v0, v10

    move v1, v9

    move v2, v6

    iget v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g:I

    iget v4, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->l:F

    iget v5, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->n:F

    invoke-static/range {v0 .. v5}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->a(Landroid/view/View;IIIFF)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 114
    new-instance v11, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v11, p0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 115
    invoke-virtual {v8, v11}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 116
    invoke-virtual {v8, v11}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->u:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    goto :goto_1

    .line 121
    :cond_0
    sub-int v11, v9, v6

    .line 122
    move-object v0, v10

    move v1, v11

    move v2, v6

    iget v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g:I

    iget v4, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->l:F

    iget v5, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->t:F

    invoke-static/range {v0 .. v5}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->a(Landroid/view/View;IIIFF)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 124
    new-instance v12, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v12, p0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 125
    invoke-virtual {v8, v12}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 126
    invoke-virtual {v8, v12}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->u:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->u:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->b(Ljava/util/List;)V

    .line 132
    return-void
.end method

.method public d()I
    .locals 5

    .line 314
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->h()I

    move-result v0

    return v0

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 319
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->t:F

    add-int/lit8 v1, v3, -0x1

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->l:F

    mul-float/2addr v1, v2

    add-float v4, v0, v1

    .line 320
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g:I

    if-nez v0, :cond_2

    .line 322
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v0, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    const/high16 v1, 0x434b0000    # 203.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g:I

    .line 325
    :cond_2
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g:I

    int-to-float v0, v0

    add-float/2addr v0, v4

    float-to-int v0, v0

    return v0
.end method

.method public d(II)V
    .locals 2

    .line 277
    invoke-virtual {p0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->a(II)V

    .line 279
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 280
    if-ge p1, v1, :cond_0

    .line 283
    if-ge p2, v1, :cond_1

    .line 285
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    invoke-virtual {p0, v0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d(Ljava/util/List;II)V

    goto :goto_0

    .line 290
    :cond_0
    if-lt p2, v1, :cond_1

    .line 293
    sub-int/2addr p1, v1

    .line 294
    sub-int/2addr p2, v1

    .line 295
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    invoke-virtual {p0, v0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d(Ljava/util/List;II)V

    .line 298
    :cond_1
    :goto_0
    return-void
.end method

.method protected e()V
    .locals 9

    .line 137
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->i()V

    .line 138
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 140
    const/4 v3, 0x0

    .line 142
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 144
    invoke-virtual {v6}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f()I

    move-result v4

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardHolderDisplayManager initCardAnimImageViewList TYPE= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 146
    const/16 v0, -0x456

    if-ne v4, v0, :cond_0

    .line 149
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->h(I)Landroid/view/View;

    move-result-object v7

    .line 150
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->q:Z

    .line 151
    const/high16 v0, 0x43220000    # 162.0f

    invoke-virtual {v7, v0}, Landroid/view/View;->setY(F)V

    .line 152
    add-int/lit8 v3, v3, 0x1

    .line 153
    goto :goto_1

    .line 155
    :cond_0
    const/16 v0, -0x457

    if-ne v4, v0, :cond_1

    .line 158
    invoke-direct {p0, v3, v6}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c(ILcom/huawei/wallet/model/unicard/UniCardInfo;)Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    move-result-object v7

    .line 159
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->q:Z

    .line 160
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->n:F

    invoke-virtual {v7, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setY(F)V

    .line 161
    add-int/lit8 v3, v3, 0x1

    .line 162
    goto :goto_1

    .line 166
    :cond_1
    invoke-virtual {p0, v3, v6}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->e(ILcom/huawei/wallet/model/unicard/UniCardInfo;)Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    move-result-object v7

    .line 167
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->n:F

    int-to-float v1, v3

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->l:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {v7, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setY(F)V

    .line 168
    add-int/lit8 v3, v3, 0x1

    .line 170
    goto/16 :goto_0

    .line 172
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardHolderDisplayManager top card size= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",index= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 174
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 176
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 178
    invoke-virtual {v7}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f()I

    move-result v4

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardHolderDisplayManager initCardAnimImageViewList bottomCardInfoList TYPE= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 180
    const/16 v0, -0x456

    if-ne v4, v0, :cond_3

    .line 182
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->h(I)Landroid/view/View;

    move-result-object v8

    .line 183
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->y:Z

    .line 184
    const/high16 v0, 0x43220000    # 162.0f

    invoke-virtual {v8, v0}, Landroid/view/View;->setY(F)V

    .line 185
    goto :goto_3

    .line 187
    :cond_3
    const/16 v0, -0x457

    if-ne v4, v0, :cond_4

    .line 189
    invoke-direct {p0, v3, v7}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->c(ILcom/huawei/wallet/model/unicard/UniCardInfo;)Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    move-result-object v8

    .line 190
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->y:Z

    .line 191
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->t:F

    invoke-virtual {v8, v0}, Landroid/view/View;->setY(F)V

    .line 192
    goto :goto_3

    .line 196
    :cond_4
    invoke-virtual {p0, v3, v7}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->e(ILcom/huawei/wallet/model/unicard/UniCardInfo;)Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    move-result-object v8

    .line 197
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->t:F

    sub-int v1, v3, v5

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->l:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setY(F)V

    .line 198
    add-int/lit8 v3, v3, 0x1

    .line 200
    goto/16 :goto_2

    .line 203
    :cond_5
    :goto_3
    return-void
.end method

.method public h()I
    .locals 1

    .line 308
    invoke-super {p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d()I

    move-result v0

    return v0
.end method

.method public i()V
    .locals 1

    .line 479
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->q:Z

    .line 480
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->y:Z

    .line 481
    return-void
.end method
