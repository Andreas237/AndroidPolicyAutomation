.class public Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;
.super Lcom/shopkick/app/store/PromoConfigurator;
.source "ReceiptKickPromoConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/ReceiptKickPromoConfigurator$ReceiptKickPromoTileOnClickListener;
    }
.end annotation


# static fields
.field private static final TILE_1X_WIDTH:I = 0x140


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private promoCellLayout:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/account/AgeVerificationController;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/store/PromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 34
    iput-object p4, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    return-void
.end method

.method static synthetic access$001(Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 22
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/store/PromoConfigurator;->onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method


# virtual methods
.method public addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const v0, 0x7f090560

    .line 113
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz p1, :cond_0

    .line 115
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

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0163

    const/4 v1, 0x0

    .line 46
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventFrameLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    .line 51
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    invoke-static {p3}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 54
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const p3, 0x7f090562

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object p3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const p3, 0x7f090561

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object p3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const p3, 0x7f09040b

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object p3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const p3, 0x7f090560

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    .line 62
    iget-object p3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p1, p3}, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 65
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const p3, 0x7f0905fb

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 66
    iget-object p3, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->context:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 67
    iget-object p4, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->context:Landroid/content/Context;

    const/16 v0, 0x140

    invoke-static {v0, p4}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p4

    int-to-float p3, p3

    int-to-float p4, p4

    div-float/2addr p3, p4

    .line 70
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->setScaleX(F)V

    .line 71
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->setScaleY(F)V

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 149
    new-instance v0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator$ReceiptKickPromoTileOnClickListener;

    invoke-direct {v0, p0, p2, p1}, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator$ReceiptKickPromoTileOnClickListener;-><init>(Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/url/URLDispatcher;)V

    .line 151
    iget-object p1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object v1, p0, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->promoCellLayout:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Lcom/shopkick/app/account/AgeVerificationController;->maybeVerifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method protected onDestroyLayout(Landroid/view/ViewGroup;)V
    .locals 0

    .line 80
    invoke-super {p0, p1}, Lcom/shopkick/app/store/PromoConfigurator;->onDestroyLayout(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    if-eqz p2, :cond_0

    const p1, 0x7f090560

    .line 142
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 144
    :goto_0
    iget-object p2, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-void
.end method

.method public removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const v0, 0x7f090560

    .line 123
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz p1, :cond_0

    .line 125
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V
    .locals 19

    move-object/from16 v0, p3

    const v1, 0x7f090560

    .line 92
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

    .line 93
    invoke-virtual/range {v2 .. v11}, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->setupImpressionLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZI)V

    .line 102
    move-object v15, v0

    check-cast v15, Lcom/shopkick/app/logging/IUserEventView;

    const/16 v18, 0x13

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move/from16 v14, p2

    move/from16 v16, p4

    move-object/from16 v17, p5

    invoke-virtual/range {v12 .. v18}, Lcom/shopkick/app/store/ReceiptKickPromoConfigurator;->setupClickLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    return-void
.end method
