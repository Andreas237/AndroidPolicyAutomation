.class public Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter$FriendViewHolder;
.super Lcom/ibotta/android/commons/view/list/ViewHolder;
.source "FriendsLikeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "FriendViewHolder"
.end annotation


# instance fields
.field protected ivProfilePic:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902be
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/list/ViewHolder;-><init>()V

    return-void
.end method
