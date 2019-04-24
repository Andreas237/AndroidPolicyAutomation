.class Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;
.super Ljava/lang/Object;
.source "LikeDetail.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;


# direct methods
.method constructor <init>(Lcom/ibotta/android/fragment/activity/detail/LikeDetail;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;->this$0:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFriendClicked(Lcom/ibotta/api/model/friend/Friend;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;->this$0:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    iget-object v0, v0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getId()I

    move-result p1

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->start(Landroid/content/Context;I)V

    return-void
.end method

.method public onSeeAllFriendsClicked()V
    .locals 4

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;->this$0:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    iget-object v0, v0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v0

    .line 130
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;->this$0:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    iget-object v1, v1, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->context:Landroid/content/Context;

    new-instance v2, Lcom/ibotta/android/routing/intent/FriendsLikeIntentCreator;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/LikeDetail$1;->this$0:Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    iget-object v3, v3, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;->context:Landroid/content/Context;

    invoke-direct {v2, v3, v0}, Lcom/ibotta/android/routing/intent/FriendsLikeIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2}, Lcom/ibotta/android/routing/intent/FriendsLikeIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
