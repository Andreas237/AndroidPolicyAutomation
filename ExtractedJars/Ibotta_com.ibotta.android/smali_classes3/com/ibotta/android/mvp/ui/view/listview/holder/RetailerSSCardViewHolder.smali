.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "RetailerSSCardViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;"
    }
.end annotation


# instance fields
.field private final ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

.field private final rcvCircle:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
            ">;"
        }
    .end annotation
.end field

.field private trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

.field private viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
            ">;",
            "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
            ")V"
        }
    .end annotation

    .line 31
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    .line 26
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->rcvCircle:Lcom/ibotta/android/views/components/ViewComponent;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    .line 36
    invoke-interface {p1, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;->onTrackRetailerRowClicked(Lcom/ibotta/android/tracking/content/TrackingPayload;)V

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->updateViewState(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->updateViewState(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 1

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->trackingPayload:Lcom/ibotta/android/tracking/content/TrackingPayload;

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;->rcvCircle:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    return-void
.end method
