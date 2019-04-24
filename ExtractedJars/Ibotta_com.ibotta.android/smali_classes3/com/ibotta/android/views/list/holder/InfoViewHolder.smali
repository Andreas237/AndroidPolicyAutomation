.class public final Lcom/ibotta/android/views/list/holder/InfoViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "InfoViewHolder.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewEvents;",
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
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/holder/InfoViewHolder;",
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewEvents;",
        "irvInfo",
        "Lcom/ibotta/android/views/base/info/InformationRowView;",
        "(Lcom/ibotta/android/views/base/info/InformationRowView;)V",
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
.field private final irvInfo:Lcom/ibotta/android/views/base/info/InformationRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/info/InformationRowView;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/base/info/InformationRowView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "irvInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->irvInfo:Lcom/ibotta/android/views/base/info/InformationRowView;

    .line 16
    iget-object p1, p0, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->irvInfo:Lcom/ibotta/android/views/base/info/InformationRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/info/InformationRowView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->irvInfo:Lcom/ibotta/android/views/base/info/InformationRowView;

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/info/InformationRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$dimen;->size_14:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->irvInfo:Lcom/ibotta/android/views/base/info/InformationRowView;

    check-cast p1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/info/InformationRowView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 16
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/views/base/info/InformationRowViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/info/InformationRowViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->irvInfo:Lcom/ibotta/android/views/base/info/InformationRowView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/info/InformationRowView;->bindViewEvents(Lcom/ibotta/android/views/base/info/InformationRowViewEvents;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->bindViewEvents(Lcom/ibotta/android/views/base/info/InformationRowViewEvents;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->bindViewEvents(Lcom/ibotta/android/views/base/info/InformationRowViewEvents;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/base/info/InformationRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/info/InformationRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->irvInfo:Lcom/ibotta/android/views/base/info/InformationRowView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/info/InformationRowView;->updateViewState(Lcom/ibotta/android/views/base/info/InformationRowViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->updateViewState(Lcom/ibotta/android/views/base/info/InformationRowViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/InfoViewHolder;->updateViewState(Lcom/ibotta/android/views/base/info/InformationRowViewState;)V

    return-void
.end method
