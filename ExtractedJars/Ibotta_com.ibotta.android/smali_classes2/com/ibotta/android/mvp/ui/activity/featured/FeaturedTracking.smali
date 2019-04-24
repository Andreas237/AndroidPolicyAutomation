.class public Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;
.super Ljava/lang/Object;
.source "FeaturedTracking.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

.field private final eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    .line 54
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method

.method private createBasicBonusEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;
    .locals 2

    .line 401
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;-><init>()V

    .line 402
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 404
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 405
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setModuleName(Ljava/lang/String;)V

    .line 406
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 407
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setCounter(I)V

    .line 408
    invoke-interface {p2}, Lcom/ibotta/api/ContentEventTrackable;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setBonusId(Ljava/lang/Integer;)V

    .line 409
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 410
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setEventAt(J)V

    return-object v0
.end method

.method private createBasicCategoryEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;
    .locals 2

    .line 483
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;-><init>()V

    .line 484
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 486
    instance-of v1, p2, Lcom/ibotta/api/model/retailer/Category;

    if-eqz v1, :cond_0

    .line 487
    move-object v1, p2

    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 488
    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getCategoryType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setCategoryType(Ljava/lang/String;)V

    .line 491
    :cond_0
    invoke-interface {p2}, Lcom/ibotta/api/ContentEventTrackable;->getId()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setCategoryId(I)V

    .line 492
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 493
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setModuleName(Ljava/lang/String;)V

    .line 494
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setModuleIndex(Ljava/lang/Integer;)V

    .line 495
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 496
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setEventAt(J)V

    return-object v0
.end method

.method private createBasicModuleEvent(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;
    .locals 3

    .line 585
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;-><init>()V

    .line 586
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 588
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getModuleId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 589
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setModuleName(Ljava/lang/String;)V

    .line 590
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 591
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setCounter(I)V

    .line 592
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setEventAt(J)V

    return-object v0
.end method

.method private createBasicOfferEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;
    .locals 2

    .line 332
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    .line 333
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 335
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 336
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setModuleName(Ljava/lang/String;)V

    .line 337
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 338
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setCounter(I)V

    .line 339
    invoke-interface {p2}, Lcom/ibotta/api/ContentEventTrackable;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 341
    instance-of p1, p2, Lcom/ibotta/api/model/OfferModel;

    if-eqz p1, :cond_0

    .line 342
    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    .line 345
    :cond_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 346
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setEventAt(J)V

    return-object v0
.end method

.method private createBasicProductEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;
    .locals 2

    .line 377
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;-><init>()V

    .line 378
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 380
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 381
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 382
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setModuleName(Ljava/lang/String;)V

    .line 383
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 384
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setCounter(I)V

    .line 385
    invoke-interface {p2}, Lcom/ibotta/api/ContentEventTrackable;->getIdString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setProductId(Ljava/lang/String;)V

    .line 386
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 387
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setEventAt(J)V

    return-object v0
.end method

.method private createBasicRetailerEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;
    .locals 2

    .line 432
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    .line 433
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 435
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 436
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setModuleName(Ljava/lang/String;)V

    .line 437
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 438
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setCounter(I)V

    .line 439
    invoke-interface {p2}, Lcom/ibotta/api/ContentEventTrackable;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 440
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 441
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setEventAt(J)V

    return-object v0
.end method

.method private createBasicTileEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;
    .locals 2

    .line 502
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;-><init>()V

    .line 503
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 505
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 506
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setModuleName(Ljava/lang/String;)V

    .line 507
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 508
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setCounter(I)V

    .line 509
    invoke-interface {p2}, Lcom/ibotta/api/ContentEventTrackable;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setTileId(Ljava/lang/Integer;)V

    .line 510
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 511
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setEventAt(J)V

    return-object v0
.end method

.method private getContentEventTrackable(Lcom/ibotta/api/model/base/Module;I)Lcom/ibotta/api/ContentEventTrackable;
    .locals 1

    .line 132
    instance-of v0, p1, Lcom/ibotta/api/model/module/GridModule;

    if-eqz v0, :cond_0

    .line 133
    check-cast p1, Lcom/ibotta/api/model/module/GridModule;

    invoke-virtual {p1}, Lcom/ibotta/api/model/module/GridModule;->getCategories()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/ContentEventTrackable;

    goto :goto_0

    .line 135
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/ContentEventTrackable;

    :goto_0
    return-object p1
.end method

.method private getContentIndex(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)I
    .locals 2

    .line 197
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 199
    instance-of v1, p1, Lcom/ibotta/api/model/module/GridModule;

    if-eqz v1, :cond_0

    .line 200
    check-cast p1, Lcom/ibotta/api/model/module/GridModule;

    invoke-virtual {p1}, Lcom/ibotta/api/model/module/GridModule;->getCategories()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    :cond_0
    return v0
.end method

.method private getContentSize(Lcom/ibotta/api/model/base/Module;)I
    .locals 1

    .line 119
    instance-of v0, p1, Lcom/ibotta/api/model/module/GridModule;

    if-eqz v0, :cond_0

    .line 120
    check-cast p1, Lcom/ibotta/api/model/module/GridModule;

    .line 121
    invoke-virtual {p1}, Lcom/ibotta/api/model/module/GridModule;->getCategories()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_0
    return p1
.end method

.method private getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x0

    .line 600
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 601
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;

    move-result-object v1

    .line 602
    instance-of v2, v1, Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v1

    if-ne v1, p1, :cond_0

    .line 603
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method private isTrackable(Lcom/ibotta/api/model/base/Module;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    .line 187
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/module/GridModule;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/api/model/module/GridModule;

    invoke-virtual {v1}, Lcom/ibotta/api/model/module/GridModule;->getCategories()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 189
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method private trackBonusContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 393
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicBonusEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    move-result-object p1

    .line 394
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    const-string p2, "Tracking Bonus Visible: %1$s"

    const/4 p3, 0x1

    .line 396
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackCategoryContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 473
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicCategoryEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    move-result-object p1

    .line 474
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 475
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Category Visible: %1$s"

    .line 477
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackCategoryContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 466
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicCategoryEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    move-result-object p1

    const-string p2, "Tracking Category Visible: %1$s"

    const/4 p3, 0x1

    .line 468
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 282
    instance-of v0, p2, Lcom/ibotta/api/model/BonusModel;

    if-eqz v0, :cond_0

    .line 283
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackBonusContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 284
    :cond_0
    instance-of v0, p2, Lcom/ibotta/api/model/FeatureModel;

    if-eqz v0, :cond_1

    .line 285
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackFeatureContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 286
    :cond_1
    instance-of v0, p2, Lcom/ibotta/api/model/RetailerModel;

    if-eqz v0, :cond_2

    .line 287
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackRetailerContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 288
    :cond_2
    instance-of v0, p2, Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_3

    .line 289
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackOfferContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 290
    :cond_3
    instance-of v0, p2, Lcom/ibotta/api/model/ProductModel;

    if-eqz v0, :cond_4

    .line 291
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackProductContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 292
    :cond_4
    instance-of v0, p2, Lcom/ibotta/api/model/retailer/Category;

    if-eqz v0, :cond_5

    .line 293
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackCategoryContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    :cond_5
    :goto_0
    return-void
.end method

.method private trackFeatureContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 455
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicTileEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    .line 456
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 458
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 459
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Tile Click: %1$s"

    .line 461
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackFeatureContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 447
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicTileEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    .line 448
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    const-string p2, "Tracking Tile Visible: %1$s"

    const/4 p3, 0x1

    .line 450
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackModuleControlsVisible(Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 525
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleEllipsesVisible(Lcom/ibotta/api/model/base/Module;)V

    .line 526
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleCtaVisible(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method private trackModuleCtaClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 561
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicModuleEvent(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    move-result-object p1

    .line 562
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->CTA:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 563
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Module CTA Click: %1$s"

    .line 565
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackModuleCtaVisible(Lcom/ibotta/api/model/base/Module;)V
    .locals 3

    .line 543
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 547
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicModuleEvent(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    move-result-object p1

    .line 548
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->CTA:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x0

    .line 549
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Module CTA Visible: %1$s"

    const/4 v2, 0x1

    .line 551
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private trackModuleEllipsesClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 575
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicModuleEvent(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    move-result-object p1

    .line 576
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 577
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Module Ellipses Click: %1$s"

    .line 579
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackModuleEllipsesVisible(Lcom/ibotta/api/model/base/Module;)V
    .locals 3

    .line 530
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMenuActions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMenuActions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 534
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicModuleEvent(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    move-result-object p1

    .line 535
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->ELLIPSES:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const-string v0, "Tracking Module Ellipses Visible: %1$s"

    const/4 v1, 0x1

    .line 537
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private trackModuleImpression(Lcom/ibotta/api/model/base/Module;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 275
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicModuleEvent(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    move-result-object p1

    const-string v0, "Tracking Module impression: %1$s"

    const/4 v1, 0x1

    .line 276
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackOfferContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 305
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicOfferEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    move-result-object p1

    .line 306
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 307
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Offer Click: %1$s"

    .line 309
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackOfferContentShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 323
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicOfferEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    move-result-object p1

    .line 324
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 325
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Offer Shop: %1$s"

    .line 327
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackOfferContentUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 314
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicOfferEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    move-result-object p1

    .line 315
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 316
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Offer Unlock: %1$s"

    .line 318
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackOfferContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 298
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicOfferEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    move-result-object p1

    const-string p2, "Tracking Offer Visible: %1$s"

    const/4 p3, 0x1

    .line 300
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackProductContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 359
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicProductEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    move-result-object p1

    .line 360
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->PRODUCT:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 361
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Product Click: %1$s"

    .line 363
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackProductContentShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 368
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicProductEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    move-result-object p1

    .line 369
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 370
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Product Shop: %1$s"

    .line 372
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackProductContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 352
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicProductEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    move-result-object p1

    const-string p2, "Tracking Product Visible: %1$s"

    const/4 p3, 0x1

    .line 354
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackRetailerContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 423
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicRetailerEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object p1

    .line 424
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 425
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Retailer Click: %1$s"

    .line 427
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackRetailerContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 416
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->createBasicRetailerEvent(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object p1

    const-string p2, "Tracking Retailer Visible: %1$s"

    const/4 p3, 0x1

    .line 418
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackRowVisible(Lcom/ibotta/api/model/base/Module;)V
    .locals 2

    const/4 v0, 0x0

    .line 110
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getContentSize(Lcom/ibotta/api/model/base/Module;)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 111
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getContentEventTrackable(Lcom/ibotta/api/model/base/Module;I)Lcom/ibotta/api/ContentEventTrackable;

    move-result-object v1

    .line 112
    invoke-direct {p0, p1, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private trackVisible(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;)V
    .locals 1

    .line 93
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;

    if-eqz v0, :cond_0

    .line 94
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FavoriteRetailerRow;->getModule()Lcom/ibotta/api/model/module/RetailerModule;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackRowVisible(Lcom/ibotta/api/model/base/Module;)V

    goto :goto_0

    .line 95
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;

    if-eqz v0, :cond_1

    .line 96
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ProductsRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackRowVisible(Lcom/ibotta/api/model/base/Module;)V

    goto :goto_0

    .line 97
    :cond_1
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;

    if-eqz v0, :cond_2

    .line 98
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackRowVisible(Lcom/ibotta/api/model/base/Module;)V

    .line 101
    :cond_2
    :goto_0
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;

    if-eqz v0, :cond_3

    .line 102
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleControlsVisible(Lcom/ibotta/api/model/base/Module;)V

    .line 105
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleImpression(Lcom/ibotta/api/model/base/Module;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public onInsufficientlyVisible(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 63
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

    .line 64
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 68
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 71
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->setVisible(Z)V

    goto :goto_0

    :cond_2
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

    .line 78
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

    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 83
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 86
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->setVisible(Z)V

    .line 87
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackVisible(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/view/model/content/BonusItem;)V
    .locals 2

    .line 207
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;-><init>()V

    .line 208
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 210
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setModuleName(Ljava/lang/String;)V

    .line 211
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 212
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setCounter(I)V

    .line 213
    invoke-virtual {p2}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setBonusId(Ljava/lang/Integer;)V

    .line 214
    invoke-virtual {p2}, Lcom/ibotta/android/view/model/content/BonusItem;->getIndex()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 215
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 216
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const-string p2, "Tracking Bonus Click: %1$s"

    .line 218
    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    invoke-static {p2, p1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 2

    .line 142
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->isTrackable(Lcom/ibotta/api/model/base/Module;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 146
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getContentIndex(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)I

    move-result v0

    .line 148
    instance-of v1, p2, Lcom/ibotta/api/model/FeatureModel;

    if-eqz v1, :cond_1

    .line 149
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackFeatureContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 150
    :cond_1
    instance-of v1, p2, Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_2

    .line 151
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackRetailerContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 152
    :cond_2
    instance-of v1, p2, Lcom/ibotta/api/model/OfferModel;

    if-eqz v1, :cond_3

    .line 153
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackOfferContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 154
    :cond_3
    instance-of v1, p2, Lcom/ibotta/api/model/ProductModel;

    if-eqz v1, :cond_4

    .line 155
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackProductContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 156
    :cond_4
    instance-of v1, p2, Lcom/ibotta/api/model/retailer/Category;

    if-eqz v1, :cond_5

    .line 157
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackCategoryContentClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    :cond_5
    :goto_0
    return-void
.end method

.method public trackModuleActionClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 263
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleCtaClicked(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public trackModuleTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 267
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleEllipsesClicked(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public trackQuestClick(Lcom/ibotta/api/model/base/Module;ILjava/lang/String;I)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 164
    :cond_0
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;-><init>()V

    .line 165
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->QUEST_START:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 166
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setBonusId(Ljava/lang/Integer;)V

    .line 167
    sget-object p2, Lcom/ibotta/api/model/QuestModel$State;->STARTED:Lcom/ibotta/api/model/QuestModel$State;

    invoke-virtual {p2}, Lcom/ibotta/api/model/QuestModel$State;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setQuestState(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 168
    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setQuestStep(I)V

    .line 169
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setListIndex(Ljava/lang/Integer;)V

    const/4 p2, 0x1

    .line 170
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 171
    invoke-virtual {v0, p3}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setQuestName(Ljava/lang/String;)V

    .line 172
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->getModuleIndex(Lcom/ibotta/api/model/base/Module;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setModuleIndex(Ljava/lang/Integer;)V

    .line 173
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setModuleName(Ljava/lang/String;)V

    .line 174
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 176
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public trackShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 2

    if-eqz p1, :cond_3

    .line 243
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 247
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 249
    instance-of v1, p2, Lcom/ibotta/api/model/OfferModel;

    if-eqz v1, :cond_1

    .line 250
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackOfferContentShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    .line 251
    :cond_1
    instance-of v1, p2, Lcom/ibotta/api/model/ProductModel;

    if-eqz v1, :cond_2

    .line 252
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackProductContentShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public trackSubListContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 0

    .line 259
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    return-void
.end method

.method public trackUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 226
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 230
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 232
    instance-of v1, p2, Lcom/ibotta/api/model/OfferModel;

    if-eqz v1, :cond_1

    .line 233
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackOfferContentUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method
