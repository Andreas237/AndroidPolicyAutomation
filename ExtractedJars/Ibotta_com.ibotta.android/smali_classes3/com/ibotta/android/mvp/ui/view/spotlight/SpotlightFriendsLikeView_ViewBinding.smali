.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView_ViewBinding;
.super Ljava/lang/Object;
.source "SpotlightFriendsLikeView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    const-string v0, "field \'fcvFriendColumn1\'"

    .line 28
    const-class v1, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    const v2, 0x7f0901e0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn1:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    const-string v0, "field \'fcvFriendColumn2\'"

    .line 29
    const-class v1, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    const v2, 0x7f0901e1

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn2:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    const-string v0, "field \'fcvFriendColumn3\'"

    .line 30
    const-class v1, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    const v2, 0x7f0901e2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn3:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    const-string v0, "field \'llSeeAll\'"

    .line 31
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090329

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->llSeeAll:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvFriendCount\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090529

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->tvFriendCount:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn1:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn2:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn3:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->llSeeAll:Landroid/widget/LinearLayout;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->tvFriendCount:Landroid/widget/TextView;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
