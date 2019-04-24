.class public Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;
.super Ljava/lang/Object;
.source "IbottaListViewTracking.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;

.field private final trackingHelper:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->adapter:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingHelper:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

    return-void
.end method

.method private trackVisible(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 1

    .line 51
    invoke-interface {p1}, Lcom/ibotta/android/tracking/content/TrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 55
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    if-eqz v0, :cond_1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    check-cast p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toTrackingEvent()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    goto :goto_0

    .line 57
    :cond_1
    instance-of v0, p1, Lcom/ibotta/android/tracking/AdviceProperties;

    if-eqz v0, :cond_2

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingHelper:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

    check-cast p1, Lcom/ibotta/android/tracking/AdviceProperties;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;->trackVisible(Lcom/ibotta/android/tracking/AdviceProperties;)V

    :cond_2
    :goto_0
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

    .line 40
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

    .line 41
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->adapter:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;

    invoke-interface {v2}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 45
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->adapter:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;->getTrackingPayload(I)Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackVisible(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onTrackContentRowClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 3

    .line 134
    invoke-interface {p1}, Lcom/ibotta/android/tracking/content/TrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 138
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    if-eqz v0, :cond_2

    .line 139
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 143
    sget-object v1, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking$1;->$SwitchMap$com$ibotta$android$tracking$content$ContentTrackingPayload$TrackingContent:[I

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 148
    :pswitch_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackRetailerRowClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    goto :goto_0

    .line 145
    :pswitch_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackOfferClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    goto :goto_0

    .line 140
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ContentTrackingPayload does not have a content type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onTrackMainButtonClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 3

    .line 157
    invoke-interface {p1}, Lcom/ibotta/android/tracking/content/TrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 161
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    if-eqz v0, :cond_3

    .line 162
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 166
    sget-object v1, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking$1;->$SwitchMap$com$ibotta$android$tracking$content$ContentTrackingPayload$TrackingContent:[I

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 168
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackOfferUnlockClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    goto :goto_0

    .line 163
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ContentTrackingPayload does not have a content type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    return-void
.end method

.method public onTrackOfferClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 3

    .line 64
    invoke-interface {p1}, Lcom/ibotta/android/tracking/content/TrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 68
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    if-eqz v0, :cond_1

    .line 69
    check-cast p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 70
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 71
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clicked(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string v1, "Tracking Offer Clicked: %1$s"

    .line 74
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toTrackingEvent()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_1
    return-void
.end method

.method public onTrackOfferUnlockClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 3

    .line 85
    invoke-interface {p1}, Lcom/ibotta/android/tracking/content/TrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 89
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    if-eqz v0, :cond_1

    .line 90
    check-cast p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 91
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 92
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clicked(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string v1, "Tracking Offer Unlock: %1$s"

    .line 95
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toTrackingEvent()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_1
    return-void
.end method

.method public onTrackOfferUnlockedClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 0

    .line 80
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackOfferClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    return-void
.end method

.method public onTrackRetailerRowClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 3

    .line 118
    invoke-interface {p1}, Lcom/ibotta/android/tracking/content/TrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 122
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    if-eqz v0, :cond_1

    .line 123
    check-cast p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 124
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 125
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clicked(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 126
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string v1, "Tracking Retailer Click: %1$s"

    .line 128
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toTrackingEvent()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_1
    return-void
.end method

.method public onTrackShopClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V
    .locals 3

    .line 102
    invoke-interface {p1}, Lcom/ibotta/android/tracking/content/TrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 106
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    if-eqz v0, :cond_1

    .line 107
    check-cast p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 108
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 109
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->clicked(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 110
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string v1, "Tracking Offer Shop: %1$s"

    .line 112
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toTrackingEvent()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    :cond_1
    return-void
.end method
