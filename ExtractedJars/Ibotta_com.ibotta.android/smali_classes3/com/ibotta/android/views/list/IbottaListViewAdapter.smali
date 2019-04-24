.class public final Lcom/ibotta/android/views/list/IbottaListViewAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "IbottaListViewAdapter.kt"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;
.implements Lcom/ibotta/android/views/components/ViewComponent;
.implements Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "**>;>;",
        "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIbottaListViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IbottaListViewAdapter.kt\ncom/ibotta/android/views/list/IbottaListViewAdapter\n*L\n1#1,70:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0008\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J \u0010\"\u001a\u00020\u00182\u000e\u0010#\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J.\u0010\"\u001a\u00020\u00182\u000e\u0010#\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u000cH\u0016J \u0010&\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001cH\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0004H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/IbottaListViewAdapter;",
        "Landroid/support/v7/widget/RecyclerView$Adapter;",
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        "Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;",
        "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;",
        "()V",
        "factory",
        "Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;",
        "fastBubbleRows",
        "",
        "Lcom/ibotta/android/views/list/FastBubbleScrollerRow;",
        "ibottaListViewTracking",
        "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
        "getIbottaListViewTracking",
        "()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
        "rows",
        "getRows",
        "()Ljava/util/List;",
        "viewEvents",
        "viewState",
        "bindViewEvents",
        "",
        "getContentType",
        "Lcom/ibotta/android/views/list/ContentViewState$ContentType;",
        "position",
        "",
        "getItemCount",
        "getItemViewType",
        "getTrackingPayload",
        "Lcom/ibotta/android/tracking/content/TrackingPayload;",
        "pos",
        "onBindViewHolder",
        "holder",
        "payloads",
        "",
        "onCreateViewHolder",
        "vgParent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "updateViewState",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final factory:Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;

.field private fastBubbleRows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/views/list/FastBubbleScrollerRow;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

.field private viewState:Lcom/ibotta/android/views/list/IbottaListViewState;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 23
    sget-object v0, Lcom/ibotta/android/views/list/IbottaListViewState;->EMPTY:Lcom/ibotta/android/views/list/IbottaListViewState;

    iput-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    .line 24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->fastBubbleRows:Ljava/util/List;

    .line 26
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    .line 27
    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;

    .line 28
    sget-object v2, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v2}, Lcom/ibotta/android/views/ViewsModule;->getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-result-object v2

    .line 29
    sget-object v3, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v3}, Lcom/ibotta/android/views/ViewsModule;->getIbottaListViewTrackingHelper()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

    move-result-object v3

    .line 26
    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;-><init>(Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingAdapter;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;)V

    iput-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    .line 32
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getIbottaListViewHolderFactoryFactory()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;

    iput-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->factory:Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

    return-void
.end method

.method public final getContentType(I)Lcom/ibotta/android/views/list/ContentViewState$ContentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/ContentViewState;

    invoke-interface {p1}, Lcom/ibotta/android/views/list/ContentViewState;->getItemType()Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    move-result-object p1

    return-object p1
.end method

.method public final getIbottaListViewTracking()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 0

    .line 49
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->getContentType(I)Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->ordinal()I

    move-result p1

    return p1
.end method

.method public getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/FastBubbleScrollerRow;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->fastBubbleRows:Ljava/util/List;

    return-object v0
.end method

.method public getTrackingPayload(I)Lcom/ibotta/android/tracking/content/TrackingPayload;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/ContentViewState;

    invoke-interface {p1}, Lcom/ibotta/android/views/list/ContentViewState;->getTrackingPayload()Lcom/ibotta/android/tracking/content/TrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->onBindViewHolder(Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->onBindViewHolder(Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;I)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
            "**>;I)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewEvents:Lcom/ibotta/android/views/list/IbottaListViewEvents;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/list/ContentViewState;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;->updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;ILjava/util/List;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
            "**>;I",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->onBindViewHolder(Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
            "**>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "vgParent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->factory:Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Lcom/ibotta/android/views/list/IbottaListViewDiffCallback;

    .line 38
    iget-object v1, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v2

    .line 37
    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/views/list/IbottaListViewDiffCallback;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 39
    check-cast v0, Landroid/support/v7/util/DiffUtil$Callback;

    invoke-static {v0}, Landroid/support/v7/util/DiffUtil;->calculateDiff(Landroid/support/v7/util/DiffUtil$Callback;)Landroid/support/v7/util/DiffUtil$DiffResult;

    move-result-object v0

    const-string v1, "DiffUtil.calculateDiff(diffCallback)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->viewState:Lcom/ibotta/android/views/list/IbottaListViewState;

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v1, "Collections.unmodifiable\u2026ollerRow>(viewState.rows)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListViewAdapter;->fastBubbleRows:Ljava/util/List;

    .line 44
    move-object p1, p0

    check-cast p1, Landroid/support/v7/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1}, Landroid/support/v7/util/DiffUtil$DiffResult;->dispatchUpdatesTo(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method
