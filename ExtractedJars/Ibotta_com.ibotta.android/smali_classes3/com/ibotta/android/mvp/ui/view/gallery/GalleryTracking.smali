.class public Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;
.super Ljava/lang/Object;
.source "GalleryTracking.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method

.method private createEvent(Lcom/ibotta/android/view/model/content/AbstractContentItem;Ljava/lang/Class;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/view/model/content/AbstractContentItem;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x1

    .line 156
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    :goto_0
    const-string v1, "Error creating Event: %1$s"

    .line 158
    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, p2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_0

    .line 163
    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setCounter(I)V

    .line 165
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->getEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 166
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->getEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_0
    return-object p2
.end method

.method private createEventForItem(Lcom/ibotta/android/view/model/content/AbstractContentItem;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 137
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 145
    :pswitch_0
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->createEvent(Lcom/ibotta/android/view/model/content/AbstractContentItem;Ljava/lang/Class;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    goto :goto_0

    .line 142
    :pswitch_1
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->createEvent(Lcom/ibotta/android/view/model/content/AbstractContentItem;Ljava/lang/Class;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    goto :goto_0

    .line 139
    :pswitch_2
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->createEvent(Lcom/ibotta/android/view/model/content/AbstractContentItem;Ljava/lang/Class;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private trackRebateVisible(Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;)V
    .locals 3

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->createEventForItem(Lcom/ibotta/android/view/model/content/AbstractContentItem;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "Tracking Offer Visible: %1$s"

    const/4 v1, 0x1

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackVisible(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;)V
    .locals 1

    .line 59
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    if-eqz v0, :cond_0

    .line 60
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackRebateVisible(Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;)V

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

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 50
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 53
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackVisible(Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public trackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 3

    .line 75
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->createEventForItem(Lcom/ibotta/android/view/model/content/AbstractContentItem;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 80
    :cond_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 94
    :pswitch_0
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->DEAL:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    .line 95
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p1, "Tracking Deal Click: %1$s"

    .line 97
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 88
    :pswitch_1
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    .line 89
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p1, "Tracking Product Click: %1$s"

    .line 91
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 82
    :pswitch_2
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    .line 83
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p1, "Tracking Offer Click: %1$s"

    .line 85
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    :goto_0
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getClickType()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 102
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public trackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 3

    .line 123
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->createEventForItem(Lcom/ibotta/android/view/model/content/AbstractContentItem;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 126
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 127
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Shop Click: %1$s"

    .line 129
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_0
    return-void
.end method

.method public trackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 3

    .line 107
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->createEventForItem(Lcom/ibotta/android/view/model/content/AbstractContentItem;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 110
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 111
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Offer Unlock Click: %1$s"

    .line 113
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_0
    return-void
.end method

.method public trackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    .line 119
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method
