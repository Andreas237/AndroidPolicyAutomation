.class public abstract Lcom/shopkick/app/store/PromoConfigurator;
.super Ljava/lang/Object;
.source "PromoConfigurator.java"


# instance fields
.field protected context:Landroid/content/Context;

.field protected listViewCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

.field protected userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/shopkick/app/store/PromoConfigurator;->context:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lcom/shopkick/app/store/PromoConfigurator;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 35
    iput-object p3, p0, Lcom/shopkick/app/store/PromoConfigurator;->listViewCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    return-void
.end method


# virtual methods
.method public abstract addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
.end method

.method public abstract animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end method

.method protected loadImage(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 164
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    return-void
.end method

.method public abstract loadLayout(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Landroid/view/ViewGroup;
.end method

.method public onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 71
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_element"

    const/16 v2, 0x13

    .line 73
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_element_id"

    .line 74
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->promoUnitId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    :cond_0
    return-void
.end method

.method protected onDestroyLayout(Landroid/view/ViewGroup;)V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    const-string v0, "CAROUSEL_CELL_VISIBLE"

    .line 47
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/store/PromoConfigurator;->addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V

    return-void
.end method

.method public abstract refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end method

.method public abstract removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V
.end method

.method public resetState()V
    .locals 0

    return-void
.end method

.method protected setupClickLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V
    .locals 2

    .line 141
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p6, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 142
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-virtual {v0, p6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 143
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 144
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->promoUnitId:Ljava/lang/String;

    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBannerId(Ljava/lang/String;)V

    .line 145
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTitle(Ljava/lang/String;)V

    .line 146
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    if-eqz p4, :cond_0

    .line 147
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNusbLayoutVersion(Ljava/lang/Integer;)V

    .line 150
    :cond_0
    new-instance p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p4}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 151
    iget-object p5, p0, Lcom/shopkick/app/store/PromoConfigurator;->listViewCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iput-object p5, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    const/4 p5, 0x1

    .line 152
    iput-boolean p5, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 153
    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 154
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/store/PromoConfigurator;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p3, v0, p1, p4}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method protected setupImpressionLogging(Landroid/view/View;ILcom/shopkick/app/logging/IUserEventView;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZI)V
    .locals 2

    const/4 v0, 0x3

    if-eqz p8, :cond_0

    .line 93
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-interface {p3, p8}, Lcom/shopkick/app/logging/IUserEventView;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 98
    :cond_0
    new-instance p8, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p8, p9, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 99
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p9

    invoke-virtual {p8, p9}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 100
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p8, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 101
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->promoUnitId:Ljava/lang/String;

    invoke-virtual {p8, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBannerId(Ljava/lang/String;)V

    .line 102
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p8, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTitle(Ljava/lang/String;)V

    .line 103
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p8, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 104
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    if-eqz p4, :cond_1

    .line 105
    iget-object p4, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-virtual {p8, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNusbLayoutVersion(Ljava/lang/Integer;)V

    .line 108
    :cond_1
    new-instance p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p4}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 109
    iget-object p9, p0, Lcom/shopkick/app/store/PromoConfigurator;->listViewCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iput-object p9, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 111
    new-instance p9, Ljava/util/ArrayList;

    invoke-direct {p9}, Ljava/util/ArrayList;-><init>()V

    iput-object p9, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 112
    instance-of p9, p3, Landroid/widget/ImageView;

    if-eqz p9, :cond_2

    move-object p9, p3

    check-cast p9, Landroid/widget/ImageView;

    invoke-virtual {p9}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p9

    if-nez p9, :cond_2

    .line 113
    iget-object p9, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v0, "ImageConstraintKey"

    invoke-virtual {p9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    if-nez p7, :cond_3

    .line 116
    iget-object p7, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string p9, "CAROUSEL_CELL_VISIBLE"

    invoke-virtual {p7, p9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    if-nez p6, :cond_4

    .line 119
    iget-object p6, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string p7, "CAROUSEL_ROW_VISIBLE"

    invoke-virtual {p6, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    :cond_4
    iget-object p6, p0, Lcom/shopkick/app/store/PromoConfigurator;->listViewCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    instance-of p6, p6, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    if-eqz p6, :cond_5

    .line 123
    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 124
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    goto :goto_0

    .line 126
    :cond_5
    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 127
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 130
    :goto_0
    iget-object p1, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 131
    iget-object p1, p5, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p1, p4, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/store/PromoConfigurator;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p3, p8, p1, p4}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public abstract setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V
.end method
