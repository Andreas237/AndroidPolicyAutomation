.class public Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;
.super Lcom/shopkick/app/store/PromoConfigurator;
.source "OfflineEducationV3PromoConfigurator.java"


# instance fields
.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/store/PromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 34
    iput-object p4, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 35
    iput-object p5, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    return-void
.end method


# virtual methods
.method public addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    .line 124
    instance-of v0, p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v0, :cond_0

    .line 125
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 126
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    return-void
.end method

.method public loadLayout(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Landroid/view/ViewGroup;
    .locals 3

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p4, 0x0

    const v0, 0x7f0c0140

    .line 48
    invoke-virtual {p1, v0, p2, p4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventFrameLayout;

    .line 51
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0x7f09065e

    if-gtz v0, :cond_0

    .line 54
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p4

    const/4 v0, 0x4

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p4}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const p4, 0x7f0904cb

    .line 61
    invoke-virtual {p1, p4}, Lcom/shopkick/app/widget/UserEventFrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f0904d2

    .line 62
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/UserEventFrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 64
    iget-object v1, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, v1, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x5c

    if-ne v1, v2, :cond_1

    .line 65
    iget-object v1, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->context:Landroid/content/Context;

    const v2, 0x7f11046c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const/16 p4, 0x8

    .line 66
    invoke-virtual {v0, p4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_1

    .line 68
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->context:Landroid/content/Context;

    const v2, 0x7f11046b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 70
    iget-object p4, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {p4}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->hasScanInfos()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 71
    iget-object p4, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->context:Landroid/content/Context;

    const v1, 0x7f11046d

    invoke-virtual {p4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    goto :goto_1

    .line 73
    :cond_2
    iget-object p4, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->context:Landroid/content/Context;

    const v1, 0x7f11046e

    invoke-virtual {p4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 77
    :goto_1
    invoke-static {p3}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setTag(Ljava/lang/Object;)V

    .line 78
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method

.method public onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 116
    iget-object p2, p0, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 117
    new-instance p2, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    invoke-direct {p2, v1, v2, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 118
    invoke-virtual {p2}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method protected onDestroyLayout(Landroid/view/ViewGroup;)V
    .locals 0

    .line 84
    invoke-super {p0, p1}, Lcom/shopkick/app/store/PromoConfigurator;->onDestroyLayout(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    return-void
.end method

.method public removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    .line 132
    instance-of v0, p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v0, :cond_0

    .line 133
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 134
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V
    .locals 11

    .line 96
    move-object v10, p3

    check-cast v10, Lcom/shopkick/app/logging/IUserEventView;

    const/16 v9, 0x52

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, v10

    move v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    .line 97
    invoke-virtual/range {v0 .. v9}, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->setupImpressionLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZI)V

    const/16 v6, 0x52

    .line 106
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/store/OfflineEducationV3PromoConfigurator;->setupClickLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    return-void
.end method
