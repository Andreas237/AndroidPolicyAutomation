.class public Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "RetailerSSCardAdapter.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;
.implements Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;",
        ">;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/horiz/RetailerSSCardListViewState;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;"
    }
.end annotation


# instance fields
.field private viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private viewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 24
    new-instance v0, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    invoke-direct {v0}, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->viewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    return-void
.end method

.method public getItem(I)I
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->viewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;->getItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;->getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p1

    return p1
.end method

.method public getItemCount()I
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->viewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;->getItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;I)V
    .locals 2

    .line 49
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;->access$000(Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;)Lcom/ibotta/android/views/components/ViewComponent;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->viewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    invoke-interface {v0, p2}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    .line 50
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;->access$000(Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;)Lcom/ibotta/android/views/components/ViewComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;
    .locals 2

    .line 41
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c01d3

    const/4 v1, 0x0

    .line 42
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardView;

    .line 44
    new-instance p2, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;-><init>(Lcom/ibotta/android/views/components/ViewComponent;)V

    return-object p2
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    if-eqz v0, :cond_0

    .line 65
    invoke-interface {v0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->viewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->updateViewState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;)V

    return-void
.end method
