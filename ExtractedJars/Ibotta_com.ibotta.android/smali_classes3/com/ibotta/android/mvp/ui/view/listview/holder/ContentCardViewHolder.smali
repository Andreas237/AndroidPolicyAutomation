.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "ContentCardViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/content/card/ContentCardViewState;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;"
    }
.end annotation


# instance fields
.field private final ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

.field private ilocView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

.field private trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

.field private viewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

.field private viewState:Lcom/ibotta/android/content/card/ContentCardViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V
    .locals 1

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    .line 19
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ilocView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ilocView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    :cond_0
    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->bindViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V

    return-void
.end method

.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackOfferClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onContentImageClicked()V
    .locals 0

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackShopClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackOfferUnlockClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackOfferUnlockedClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/content/card/ContentCardViewState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->ilocView:Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->viewState:Lcom/ibotta/android/content/card/ContentCardViewState;

    :cond_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/content/card/ContentCardViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;->updateViewState(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    return-void
.end method
