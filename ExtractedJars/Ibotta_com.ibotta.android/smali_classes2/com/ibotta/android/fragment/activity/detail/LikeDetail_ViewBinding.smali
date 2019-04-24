.class public Lcom/ibotta/android/fragment/activity/detail/LikeDetail_ViewBinding;
.super Ljava/lang/Object;
.source "LikeDetail_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/activity/detail/LikeDetail;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    const-string v0, "field \'tvProductName\'"

    .line 24
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09055e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->tvProductName:Landroid/widget/TextView;

    const-string v0, "field \'tvProductDescription\'"

    .line 25
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09055d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->tvProductDescription:Landroid/widget/TextView;

    const-string v0, "field \'bSeeThisRebate\'"

    .line 26
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f0900a5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->bSeeThisRebate:Landroid/widget/Button;

    const-string v0, "field \'ricvRebateImageCard\'"

    .line 27
    const-class v1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    const v2, 0x7f090386

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    const-string v0, "field \'flvLikeFriends\'"

    .line 28
    const-class v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    const v2, 0x7f090200

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    iput-object p2, p1, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->flvLikeFriends:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->tvProductName:Landroid/widget/TextView;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->tvProductDescription:Landroid/widget/TextView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->bSeeThisRebate:Landroid/widget/Button;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->flvLikeFriends:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
