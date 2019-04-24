.class public Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;
.super Lcom/shopkick/app/store/PromoConfigurator;
.source "KickstarterBonusPromoConfigurator.java"


# instance fields
.field private promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/store/PromoTileTimerController;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/store/PromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 29
    iput-object p4, p0, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    return-void
.end method


# virtual methods
.method public addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    return-void
.end method

.method public loadLayout(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Landroid/view/ViewGroup;
    .locals 3

    .line 37
    iget-object p1, p0, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7f0c0108

    .line 39
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 42
    invoke-static {p3}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 44
    iget-object p3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->backgroundColor:Ljava/lang/String;

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setBackgroundColor(I)V

    const p3, 0x7f09076e

    .line 46
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 47
    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f090709

    .line 49
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 50
    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f090766

    .line 52
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 53
    iget-object v1, p0, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/store/PromoTileTimerController;->registerView(Landroid/view/View;)V

    const p3, 0x7f09001b

    .line 55
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    .line 56
    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 57
    iget-object p4, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p3, p4}, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 59
    :cond_0
    iget-object p4, p0, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->context:Landroid/content/Context;

    invoke-static {p4}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result p4

    int-to-float p4, p4

    const/high16 v1, 0x43a00000    # 320.0f

    invoke-virtual {p3}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 60
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v2, v1

    div-float/2addr p4, v2

    .line 61
    invoke-static {p3, p4, v0}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithScaleFactor(Landroid/view/View;FZ)V

    .line 63
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method

.method protected onDestroyLayout(Landroid/view/ViewGroup;)V
    .locals 2

    if-eqz p1, :cond_0

    const v0, 0x7f090766

    .line 71
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v1, p0, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->promoTileTimerController:Lcom/shopkick/app/store/PromoTileTimerController;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/store/PromoTileTimerController;->unregisterView(Landroid/view/View;)V

    .line 76
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/store/PromoConfigurator;->onDestroyLayout(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    return-void
.end method

.method public removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V
    .locals 11

    .line 88
    move-object v10, p3

    check-cast v10, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const/16 v9, 0xc3

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, v10

    move v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v9}, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->setupImpressionLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZI)V

    const/16 v6, 0xc3

    .line 97
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;->setupClickLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    return-void
.end method
