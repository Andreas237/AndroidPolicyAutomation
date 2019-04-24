.class Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
.source "FriendsMessageFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FriendMessageViewHolder"
.end annotation


# instance fields
.field private etMessage:Landroid/widget/EditText;

.field private ivProfilePic:Landroid/widget/ImageView;

.field private tvCharsRemaining:Landroid/widget/TextView;

.field private tvFriendName:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 221
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$1;)V
    .locals 0

    .line 221
    invoke-direct {p0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/ImageView;
    .locals 0

    .line 221
    iget-object p0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->ivProfilePic:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->ivProfilePic:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 221
    iget-object p0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->tvFriendName:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$202(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->tvFriendName:Landroid/widget/TextView;

    return-object p1
.end method

.method static synthetic access$300(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/EditText;
    .locals 0

    .line 221
    iget-object p0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->etMessage:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$302(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->etMessage:Landroid/widget/EditText;

    return-object p1
.end method

.method static synthetic access$400(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 221
    iget-object p0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->tvCharsRemaining:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$402(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->tvCharsRemaining:Landroid/widget/TextView;

    return-object p1
.end method
