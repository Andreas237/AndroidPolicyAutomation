.class public final Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "PwiTransactionsListAdapter.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PwiTransactionsViewHolder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
        "view",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;",
        "(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;)V",
        "getView",
        "()Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;",
        "bindViewEvents",
        "",
        "viewEvents",
        "updateViewState",
        "viewState",
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
.field private final view:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->view:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 40
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

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

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->view:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->bindViewEvents(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;)V

    return-void
.end method

.method public final getView()Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->view:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;

    return-object v0
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 40
    check-cast p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsListAdapter$PwiTransactionsViewHolder;->view:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsRow;->updateViewState(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    return-void
.end method
