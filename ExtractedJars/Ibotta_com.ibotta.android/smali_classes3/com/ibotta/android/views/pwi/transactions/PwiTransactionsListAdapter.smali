.class public final Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "PwiTransactionsListAdapter.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;",
        ">;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiTransactionsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiTransactionsListAdapter.kt\ncom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter\n*L\n1#1,51:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;",
        "Landroid/support/v7/widget/RecyclerView$Adapter;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
        "()V",
        "rowViewStates",
        "",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "viewEvents",
        "bindViewEvents",
        "",
        "getItemCount",
        "",
        "onBindViewHolder",
        "viewHolder",
        "position",
        "onCreateViewHolder",
        "viewGroup",
        "Landroid/view/ViewGroup;",
        "viewType",
        "updateViewState",
        "viewState",
        "PwiTransactionsViewHolder",
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
.field private final rowViewStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
            ">;"
        }
    .end annotation
.end field

.field private viewEvents:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->rowViewStates:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->viewEvents:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;

    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->rowViewStates:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->onBindViewHolder(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;I)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->rowViewStates:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    .line 37
    iget-object p2, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->viewEvents:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p2, "viewGroup"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 29
    sget v0, Lcom/ibotta/views/R$layout;->view_pwi_transaction_row:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;

    .line 30
    new-instance p2, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;-><init>(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;)V

    return-object p2

    .line 29
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type com.ibotta.android.views.pwi.transactions.PwiTransactionsRow"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->rowViewStates:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->rowViewStates:Ljava/util/List;

    iget-object p1, p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->rows:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;->notifyDataSetChanged()V

    return-void
.end method
