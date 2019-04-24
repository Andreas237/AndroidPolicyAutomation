.class public Lcom/ibotta/android/view/featured/FeatureRouteHandler;
.super Ljava/lang/Object;
.source "FeatureRouteHandler.java"

# interfaces
.implements Lcom/ibotta/android/views/featured/PagingBannerViewEvents;


# instance fields
.field private eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

.field private final pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

.field private previousSelectedFeatureModelId:I

.field private retailerCategoryId:I

.field private retailerId:Ljava/lang/Integer;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

.field private viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->HOME:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    iput-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    return-void
.end method

.method private isNotDuplicateFeatureModel(I)Z
    .locals 1

    .line 71
    iget v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->previousSelectedFeatureModelId:I

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 72
    :goto_0
    iput p1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->previousSelectedFeatureModelId:I

    return v0
.end method


# virtual methods
.method public onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V
    .locals 4
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getTrackingClickUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->trackClick(Ljava/lang/String;)V

    .line 82
    sget-object v0, Lcom/ibotta/android/view/featured/FeatureRouteHandler$1;->$SwitchMap$com$ibotta$android$tracking$proprietary$event$enums$EventContext:[I

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 93
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result v1

    iget v2, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerCategoryId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackGalleryClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;ILjava/lang/Integer;I)V

    goto :goto_0

    .line 90
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result v1

    iget v2, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerCategoryId:I

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackFeaturedCategoryClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V

    goto :goto_0

    .line 87
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result v1

    iget v2, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerCategoryId:I

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackCategoryClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V

    goto :goto_0

    .line 84
    :pswitch_3
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackFeaturedClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;I)V

    .line 97
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    if-eqz v0, :cond_0

    .line 98
    invoke-interface {v0, p1}, Lcom/ibotta/android/views/featured/PagingBannerViewEvents;->onBannerClicked(Lcom/ibotta/android/views/featured/BannerViewState;)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onBannerViewed(Lcom/ibotta/android/views/featured/BannerViewState;)V
    .locals 3

    .line 51
    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->isNotDuplicateFeatureModel(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    sget-object v0, Lcom/ibotta/android/view/featured/FeatureRouteHandler$1;->$SwitchMap$com$ibotta$android$tracking$proprietary$event$enums$EventContext:[I

    iget-object v1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 64
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result p1

    iget v1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerCategoryId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerId:Ljava/lang/Integer;

    invoke-static {v0, p1, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackGalleryView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;ILjava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 61
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result p1

    iget v1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerCategoryId:I

    invoke-static {v0, p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackFeaturedCategoryView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V

    goto :goto_0

    .line 58
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result p1

    iget v1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerCategoryId:I

    invoke-static {v0, p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackCategoryView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V

    goto :goto_0

    .line 55
    :pswitch_3
    iget-object v0, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/views/featured/BannerViewState;->getId()I

    move-result p1

    invoke-static {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->trackFeaturedView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;I)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public setIbottaEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;)V
    .locals 0

    if-nez p1, :cond_0

    .line 42
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->HOME:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 45
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 46
    iput p2, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerCategoryId:I

    .line 47
    iput-object p3, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->retailerId:Ljava/lang/Integer;

    return-void
.end method

.method public setListener(Lcom/ibotta/android/views/featured/PagingBannerViewEvents;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;->viewEvents:Lcom/ibotta/android/views/featured/PagingBannerViewEvents;

    return-void
.end method
