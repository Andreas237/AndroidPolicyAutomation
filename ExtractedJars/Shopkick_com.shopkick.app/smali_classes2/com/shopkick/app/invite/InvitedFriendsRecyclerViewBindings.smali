.class public Lcom/shopkick/app/invite/InvitedFriendsRecyclerViewBindings;
.super Ljava/lang/Object;
.source "InvitedFriendsRecyclerViewBindings.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static setItems(Landroid/support/v7/widget/RecyclerView;Ljava/util/List;)V
    .locals 0
    .annotation build Landroid/databinding/BindingAdapter;
        value = {
            "items"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v7/widget/RecyclerView;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 21
    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->replaceData(Ljava/util/List;)V

    :cond_0
    return-void
.end method
