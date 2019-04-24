.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;
.super Landroid/widget/LinearLayout;
.source "SpotlightFriendsLikeView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;
    }
.end annotation


# instance fields
.field protected fcvFriendColumn1:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901e0
    .end annotation
.end field

.field protected fcvFriendColumn2:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901e1
    .end annotation
.end field

.field protected fcvFriendColumn3:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901e2
    .end annotation
.end field

.field private friends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;

.field protected llSeeAll:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090329
    .end annotation
.end field

.field protected tvFriendCount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090529
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 53
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 78
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->setOrientation(I)V

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01ce

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 81
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->llSeeAll:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->llSeeAll:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setFocusable(Z)V

    return-void
.end method

.method private onFriendsSet()V
    .locals 7

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn1:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn2:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->fcvFriendColumn3:Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 95
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    .line 96
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/api/model/friend/Friend;

    invoke-virtual {v5, v6}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->setFriend(Lcom/ibotta/api/model/friend/Friend;)V

    .line 97
    invoke-virtual {v5, v3}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->setVisibility(I)V

    .line 98
    instance-of v6, v5, Landroid/view/View;

    if-nez v6, :cond_0

    invoke-virtual {v5, p0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_0
    check-cast v5, Landroid/view/View;

    invoke-static {v5, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 101
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_3

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->tvFriendCount:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->llSeeAll:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->llSeeAll:Landroid/widget/LinearLayout;

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_2

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;

    if-nez v0, :cond_0

    return-void

    .line 114
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    if-eqz v1, :cond_1

    .line 115
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;->onFriendClicked(Lcom/ibotta/api/model/friend/Friend;)V

    goto :goto_0

    .line 116
    :cond_1
    instance-of p1, p1, Landroid/widget/LinearLayout;

    if-eqz p1, :cond_2

    .line 117
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;->onSeeAllFriendsClicked()V

    :cond_2
    :goto_0
    return-void
.end method

.method public setFriends(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    goto :goto_0

    .line 71
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->friends:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 74
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->onFriendsSet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightFriendsLikeView$SpotlightFriendsLikeListener;

    return-void
.end method
