.class public Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;
.super Landroid/widget/LinearLayout;
.source "FriendColumnView.java"


# instance fields
.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private friend:Lcom/ibotta/api/model/friend/Friend;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

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
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 38
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 60
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;)V

    const/4 v0, 0x1

    .line 62
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->setClickable(Z)V

    .line 63
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->setOrientation(I)V

    const/16 v1, 0x31

    .line 64
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->setGravity(I)V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c015c

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 68
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onFriendSet()V
    .locals 5

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->friend:Lcom/ibotta/api/model/friend/Friend;

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->friend:Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->ivProfilePic:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->FRIEND_LIKE_PROFILE_PIC:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->friend:Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->friend:Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->tvName:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->tvName:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->ivProfilePic:Landroid/widget/ImageView;

    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->FRIEND_LIKE_PROFILE_PIC:Lcom/ibotta/android/views/images/Sizes;

    invoke-virtual {v1}, Lcom/ibotta/android/views/images/Sizes;->getPlaceholderResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getFriend()Lcom/ibotta/api/model/friend/Friend;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->friend:Lcom/ibotta/api/model/friend/Friend;

    return-object v0
.end method

.method public setFriend(Lcom/ibotta/api/model/friend/Friend;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->friend:Lcom/ibotta/api/model/friend/Friend;

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->onFriendSet()V

    return-void
.end method
