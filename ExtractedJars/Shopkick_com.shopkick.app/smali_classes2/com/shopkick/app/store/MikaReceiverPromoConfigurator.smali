.class public Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;
.super Lcom/shopkick/app/store/PromoConfigurator;
.source "MikaReceiverPromoConfigurator.java"


# static fields
.field private static final FRIEND_IMAGE_RADIUS:I = 0x1e


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/store/PromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    return-void
.end method


# virtual methods
.method public addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 93
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 94
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    return-void
.end method

.method public loadLayout(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Landroid/view/ViewGroup;
    .locals 4

    .line 37
    iget-object p1, p0, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7f0c011c

    .line 39
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 41
    invoke-static {p3}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setTag(Ljava/lang/Object;)V

    const p3, 0x7f090386

    .line 43
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 44
    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f09029e

    .line 45
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 46
    iget-object v1, p0, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;->context:Landroid/content/Context;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->friendName:Ljava/lang/String;

    aput-object v3, v2, v0

    const v0, 0x7f1103e9

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f0901e7

    .line 47
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 48
    iget-object v0, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->descriptionText:Ljava/lang/String;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f09029d

    .line 50
    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/RoundImageView;

    const/16 v0, 0x1e

    .line 51
    invoke-virtual {p3, v0}, Lcom/shopkick/app/widget/RoundImageView;->setRadius(I)V

    .line 52
    iget-object p4, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->friendImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p3, p4}, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method

.method protected onDestroyLayout(Landroid/view/ViewGroup;)V
    .locals 0

    .line 61
    invoke-super {p0, p1}, Lcom/shopkick/app/store/PromoConfigurator;->onDestroyLayout(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    if-eqz p2, :cond_0

    const p1, 0x7f09029d

    .line 117
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 119
    :goto_0
    iget-object p2, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->friendImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-void
.end method

.method public removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 101
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 102
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V
    .locals 11

    .line 73
    move-object v10, p3

    check-cast v10, Lcom/shopkick/app/logging/IUserEventView;

    const/16 v9, 0xb4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, v10

    move v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v9}, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;->setupImpressionLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZI)V

    const/16 v6, 0xb4

    .line 82
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/store/MikaReceiverPromoConfigurator;->setupClickLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    return-void
.end method
