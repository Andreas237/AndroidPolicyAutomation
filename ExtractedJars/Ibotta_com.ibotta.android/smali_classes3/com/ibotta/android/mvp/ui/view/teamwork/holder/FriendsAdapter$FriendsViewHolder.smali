.class public Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "FriendsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FriendsViewHolder"
.end annotation


# instance fields
.field private ctx:Landroid/content/Context;

.field private friend:Lcom/ibotta/api/model/friend/Friend;

.field private friendItem:Lcom/ibotta/android/view/model/FriendItem;

.field protected ivProfilePic:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902cc
    .end annotation
.end field

.field protected llTeammateContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09032e
    .end annotation
.end field

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

.field protected tvAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ee
    .end annotation
.end field

.field protected tvBonusContribution:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904ff
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090525
    .end annotation
.end field

.field protected tvRank:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090564
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;Landroid/view/View;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    .line 107
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 108
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->ctx:Landroid/content/Context;

    .line 109
    invoke-static {p0, p2}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->bind(Lcom/ibotta/android/view/model/FriendItem;)V

    return-void
.end method

.method private bind(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 1

    .line 113
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    .line 114
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->friend:Lcom/ibotta/api/model/friend/Friend;

    .line 116
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->initName()V

    .line 117
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->initBonus()V

    .line 118
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->initPictures()V

    .line 120
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 121
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->llTeammateContainer:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 124
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->llTeammateContainer:Landroid/widget/LinearLayout;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setFocusable(Z)V

    return-void
.end method

.method private initBonus()V
    .locals 5

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->access$100(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvBonusContribution:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->friend:Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {v0}, Lcom/ibotta/api/model/friend/Friend;->getBonusEarnings()Ljava/lang/String;

    move-result-object v0

    .line 138
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->access$200(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Lcom/ibotta/android/util/Formatting;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 142
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->ctx:Landroid/content/Context;

    const v3, 0x7f110622

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v1

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    .line 143
    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->access$300(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 145
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvBonusContribution:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 147
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvBonusContribution:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initName()V
    .locals 3

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvRank:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvName:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->friend:Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private initPictures()V
    .locals 5

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->friend:Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {v0}, Lcom/ibotta/api/model/friend/Friend;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object v0

    .line 153
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_PIC:Lcom/ibotta/android/views/images/Sizes;

    .line 154
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->this$0:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;

    invoke-static {v2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->access$400(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Lcom/ibotta/android/images/ImageCache;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->ctx:Landroid/content/Context;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->ivProfilePic:Landroid/widget/ImageView;

    invoke-interface {v2, v3, v0, v4, v1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method
