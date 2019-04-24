.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;
.super Ljava/lang/Object;
.source "MyOffersGalleryTracking.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

.field private final eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;Lcom/ibotta/android/tracking/proprietary/event/EventContributor;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method

.method private createBasicOfferEvent(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;
    .locals 3

    .line 83
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/EventContributor;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 86
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->MY_REBATES:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 87
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 88
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setEventAt(J)V

    return-object v0
.end method

.method private trackOfferVisible(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;I)V
    .locals 2

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->createBasicOfferEvent(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    move-result-object p1

    .line 67
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setListIndex(Ljava/lang/Integer;)V

    const-string p2, "Tracking Offer Visible: %1$s"

    const/4 v0, 0x1

    .line 69
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackVisible(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;I)V
    .locals 1

    .line 59
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    if-eqz v0, :cond_0

    .line 60
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->trackOfferVisible(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onInsufficientlyVisible(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onSufficientlyVisible(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onTrackChildren(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 45
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 46
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 50
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->trackVisible(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;I)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public trackOfferClick(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->createBasicOfferEvent(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    move-result-object p1

    .line 75
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 76
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Offer Click: %1$s"

    .line 78
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
