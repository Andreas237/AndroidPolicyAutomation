.class public Lcom/shopkick/app/store/VideoPromoConfigurator;
.super Lcom/shopkick/app/store/PromoConfigurator;
.source "VideoPromoConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/store/VideoPromoConfigurator$VideoPromoTileOnClickListener;
    }
.end annotation


# static fields
.field public static final VIDEO_PADDING:I = 0x0

.field public static final VIDEO_RATIO_HEIGHT:I = 0x9

.field public static final VIDEO_RATIO_WIDTH:I = 0x10


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private layout:Landroid/view/ViewGroup;

.field private verifyAgeClickListener:Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/video/VideoController;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/store/PromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 44
    iput-object p4, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    return-void
.end method


# virtual methods
.method public addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    .line 162
    instance-of v0, p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v0, :cond_0

    .line 163
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 164
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    return-void
.end method

.method public loadLayout(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Landroid/view/ViewGroup;
    .locals 8

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7f0c01e8

    .line 61
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    .line 64
    iget-object v1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    const/16 v2, 0x10

    const/16 v3, 0x9

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;IIIIII)V

    .line 73
    iget-object p1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez p1, :cond_0

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/video/VideoController;->setVideoPlayCompleted(Ljava/lang/String;)V

    .line 77
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f090806

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 80
    iget-object v1, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/store/VideoPromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 84
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    const v1, 0x7f090809

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    const v2, 0x7f09052e

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 88
    iget-object v2, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v3, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    iget-object v2, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 89
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lez v2, :cond_2

    .line 90
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0f0046

    iget-object v4, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 92
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    aput-object v6, v5, v0

    .line 91
    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 90
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 99
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v2, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/video/VideoController;->isVideoOnProcessingAward(Ljava/lang/String;)Z

    move-result p1

    .line 100
    iget-object v2, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    const v3, 0x7f0905af

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz p1, :cond_3

    move v3, v0

    goto :goto_1

    :cond_3
    move v3, v1

    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 101
    iget-object v2, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    const v3, 0x7f09052c

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    move v0, v1

    :goto_2
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 103
    new-instance p1, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v0, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v1, Lcom/shopkick/app/store/VideoPromoConfigurator$VideoPromoTileOnClickListener;

    iget-object v2, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-direct {v1, v2, p4}, Lcom/shopkick/app/store/VideoPromoConfigurator$VideoPromoTileOnClickListener;-><init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-direct {p1, v0, p4, v1}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    iput-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->verifyAgeClickListener:Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    invoke-static {p3}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 157
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->verifyAgeClickListener:Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object p2, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->layout:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;->onClick(Landroid/view/View;)V

    return-void
.end method

.method protected onDestroyLayout(Landroid/view/ViewGroup;)V
    .locals 0

    .line 114
    invoke-super {p0, p1}, Lcom/shopkick/app/store/PromoConfigurator;->onDestroyLayout(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    if-eqz p2, :cond_0

    const p1, 0x7f090806

    .line 188
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 190
    :goto_0
    iget-object p2, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/store/VideoPromoConfigurator;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-void
.end method

.method public removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 1

    .line 170
    instance-of v0, p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v0, :cond_0

    .line 171
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 172
    invoke-interface {p1, p2}, Lcom/shopkick/app/logging/IUserEventView;->removeImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setAgeVerificationController(Lcom/shopkick/app/account/AgeVerificationController;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    return-void
.end method

.method public setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V
    .locals 2

    .line 126
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x3

    .line 127
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    check-cast p3, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    invoke-virtual {p3, p8}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 131
    new-instance p8, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p8, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 132
    iget-object v0, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p8, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 133
    iget-object v0, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->promoUnitId:Ljava/lang/String;

    invoke-virtual {p8, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBannerId(Ljava/lang/String;)V

    .line 134
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p8, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 135
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p8, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 136
    iget-object p4, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {p4, p5}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p8, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMinimumAgeEligibility(Ljava/lang/Integer;)V

    .line 138
    new-instance p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p4}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->listViewCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iput-object v0, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 140
    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 141
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 142
    iget-object p1, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 143
    iget-object p1, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 144
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    if-nez p7, :cond_0

    .line 146
    iget-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string p2, "CAROUSEL_CELL_VISIBLE"

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-nez p6, :cond_1

    .line 149
    iget-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string p2, "CAROUSEL_ROW_VISIBLE"

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/VideoPromoConfigurator;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p8, p1, p4}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
