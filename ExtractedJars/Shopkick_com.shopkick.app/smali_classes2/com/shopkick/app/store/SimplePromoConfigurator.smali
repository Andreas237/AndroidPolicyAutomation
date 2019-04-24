.class public Lcom/shopkick/app/store/SimplePromoConfigurator;
.super Lcom/shopkick/app/store/PromoConfigurator;
.source "SimplePromoConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;
    }
.end annotation


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private promoCellLayout:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/account/AgeVerificationController;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/store/PromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 31
    iput-object p4, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    return-void
.end method

.method static synthetic access$001(Lcom/shopkick/app/store/SimplePromoConfigurator;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 21
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/store/PromoConfigurator;->onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method


# virtual methods
.method public addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const v0, 0x7f090560

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz p1, :cond_0

    .line 102
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    return-void
.end method

.method public loadLayout(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Landroid/view/ViewGroup;
    .locals 2

    .line 39
    iget-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7f0c0162

    .line 40
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventFrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    invoke-static {p3}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const p3, 0x7f090560

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    .line 51
    iget-object p3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const/16 v1, 0x6a

    if-ne p3, v1, :cond_0

    .line 52
    iget-object p3, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const v1, 0x7f0905df

    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 53
    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 58
    :cond_0
    iget-object p3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p1, p3}, Lcom/shopkick/app/store/SimplePromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    iget-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 136
    new-instance v0, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;

    invoke-direct {v0, p0, p2, p1}, Lcom/shopkick/app/store/SimplePromoConfigurator$SimplePromoTileOnClickListener;-><init>(Lcom/shopkick/app/store/SimplePromoConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/url/URLDispatcher;)V

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v1, p0, Lcom/shopkick/app/store/SimplePromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Lcom/shopkick/app/account/AgeVerificationController;->maybeVerifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method protected onDestroyLayout(Landroid/view/ViewGroup;)V
    .locals 0

    .line 67
    invoke-super {p0, p1}, Lcom/shopkick/app/store/PromoConfigurator;->onDestroyLayout(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    if-eqz p2, :cond_0

    const p1, 0x7f090560

    .line 129
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 131
    :goto_0
    iget-object p2, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/store/SimplePromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-void
.end method

.method public removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const v0, 0x7f090560

    .line 110
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz p1, :cond_0

    .line 112
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V
    .locals 19

    move-object/from16 v0, p3

    const v1, 0x7f090560

    .line 79
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/shopkick/app/logging/IUserEventView;

    const/16 v11, 0x13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    .line 80
    invoke-virtual/range {v2 .. v11}, Lcom/shopkick/app/store/SimplePromoConfigurator;->setupImpressionLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZI)V

    .line 89
    move-object v15, v0

    check-cast v15, Lcom/shopkick/app/logging/IUserEventView;

    const/16 v18, 0x13

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move/from16 v14, p2

    move/from16 v16, p4

    move-object/from16 v17, p5

    invoke-virtual/range {v12 .. v18}, Lcom/shopkick/app/store/SimplePromoConfigurator;->setupClickLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    return-void
.end method
