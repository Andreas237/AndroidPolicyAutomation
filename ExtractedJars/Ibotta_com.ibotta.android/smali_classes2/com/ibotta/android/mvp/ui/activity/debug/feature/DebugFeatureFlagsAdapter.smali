.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "DebugFeatureFlagsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
            ">;"
        }
    .end annotation
.end field

.field private rowViewEvents:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->items:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->rowViewEvents:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;

    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;I)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    .line 58
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;->dffvFeatureFlag:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->updateViewState(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 22
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;
    .locals 2

    .line 48
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c014a

    const/4 v1, 0x0

    .line 49
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;

    .line 50
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->rowViewEvents:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->bindViewEvents(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;)V

    .line 52
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter$FeatureFlagViewHolder;-><init>(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;)V

    return-object p2
.end method

.method public setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
            ">;)V"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsAdapter;->notifyDataSetChanged()V

    return-void
.end method
