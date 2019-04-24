.class public Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;
.super Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.source "FriendsLikeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter<",
        "Lcom/ibotta/android/view/model/FriendItem;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/ibotta/android/util/AppHelper;",
            "Lcom/ibotta/android/images/ImageCache;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0c015d

    .line 30
    invoke-direct {p0, p1, v0, p4}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isEnabled(I)Z
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .locals 0

    .line 37
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;-><init>()V

    .line 38
    invoke-static {p1, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-object p1
.end method

.method public updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 1

    .line 44
    check-cast p3, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;

    .line 46
    invoke-virtual {p4}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    .line 50
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;->tvName:Landroid/widget/TextView;

    invoke-virtual {p4}, Lcom/ibotta/android/view/model/FriendItem;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    invoke-virtual {p4}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 53
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;->tvName:Landroid/widget/TextView;

    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v0, 0x7f0600e9

    invoke-interface {p4, v0}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 54
    sget-object p2, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_PIC_ME:Lcom/ibotta/android/views/images/Sizes;

    goto :goto_0

    .line 56
    :cond_0
    iget-object p2, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;->tvName:Landroid/widget/TextView;

    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v0, 0x7f0600ef

    invoke-interface {p4, v0}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    sget-object p2, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_PIC:Lcom/ibotta/android/views/images/Sizes;

    .line 60
    :goto_0
    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/friend/Friend;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object p1

    iget-object p3, p3, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;->ivProfilePic:Landroid/widget/ImageView;

    invoke-interface {p4, v0, p1, p3, p2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method public bridge synthetic updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 25
    check-cast p4, Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/view/model/FriendItem;)V

    return-void
.end method
