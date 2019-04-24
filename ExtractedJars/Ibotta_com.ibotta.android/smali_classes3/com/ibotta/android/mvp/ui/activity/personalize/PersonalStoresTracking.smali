.class public Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;
.super Ljava/lang/Object;
.source "PersonalStoresTracking.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

.field private final personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-void
.end method

.method private createBaseRetailerEvent(II)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;
    .locals 3

    .line 80
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    const/4 v1, 0x1

    .line 81
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setCounter(I)V

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->APP:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    if-ne v1, v2, :cond_0

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->RETAILER_PICKER_MCOMM:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->RETAILER_PICKER_CPG:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 82
    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 85
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setEventAt(J)V

    return-object v0
.end method

.method private trackPersonalStoreRow(Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;)V
    .locals 1

    .line 64
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->getPersonalStoresItem()Lcom/ibotta/android/view/model/PersonalStoresItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->getPersonalStoresItem()Lcom/ibotta/android/view/model/PersonalStoresItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getIndex()I

    move-result p1

    .line 66
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->createBaseRetailerEvent(II)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object p1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackVisible(Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;)V
    .locals 1

    .line 58
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;

    if-eqz v0, :cond_0

    .line 59
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->trackPersonalStoreRow(Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;)V

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

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 50
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 52
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->trackVisible(Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public trackRetailerClick(Lcom/ibotta/android/view/model/PersonalStoresItem;)V
    .locals 2

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getIndex()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->createBaseRetailerEvent(II)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object v0

    const/4 v1, 0x1

    .line 73
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->NOT_FAVORITED:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    .line 76
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
