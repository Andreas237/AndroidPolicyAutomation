.class public abstract Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "IbottaListViewHolder.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "D::",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        ">",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "TT;TD;>;",
        "Lcom/ibotta/android/views/util/VisibilityListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u0007B\r\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0015\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;",
        "T",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "D",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/util/VisibilityListener;",
        "vView",
        "Landroid/view/View;",
        "(Landroid/view/View;)V",
        "bindViewEvents",
        "",
        "viewEvents",
        "(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V",
        "onVisibilityChanged",
        "visible",
        "",
        "updateViewState",
        "viewState",
        "(Lcom/ibotta/android/views/list/ContentViewState;)V",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "vView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public abstract bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation
.end method

.method public onVisibilityChanged(Z)V
    .locals 0

    return-void
.end method

.method public abstract updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .param p1    # Lcom/ibotta/android/views/list/ContentViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
