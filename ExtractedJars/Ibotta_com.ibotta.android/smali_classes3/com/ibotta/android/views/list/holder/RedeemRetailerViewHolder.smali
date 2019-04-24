.class public final Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "RedeemRetailerViewHolder.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;",
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
        "Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;",
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;",
        "view",
        "Lcom/ibotta/android/views/redeem/RedeemRetailersRow;",
        "(Lcom/ibotta/android/views/redeem/RedeemRetailersRow;)V",
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
.field private final view:Lcom/ibotta/android/views/redeem/RedeemRetailersRow;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/redeem/RedeemRetailersRow;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailersRow;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;->view:Lcom/ibotta/android/views/redeem/RedeemRetailersRow;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 7
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;->bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    .line 7
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;->bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;->view:Lcom/ibotta/android/views/redeem/RedeemRetailersRow;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 7
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;->updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 7
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;->updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;->view:Lcom/ibotta/android/views/redeem/RedeemRetailersRow;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method
