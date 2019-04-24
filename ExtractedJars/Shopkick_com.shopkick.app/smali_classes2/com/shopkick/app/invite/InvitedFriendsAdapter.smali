.class Lcom/shopkick/app/invite/InvitedFriendsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "InvitedFriendsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/invite/InvitedFriendsAdapter$VIEW_TYPES;,
        Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;,
        Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field private static final ONE_DAY_IN_MS:I = 0x5265c00


# instance fields
.field private availableAvaters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final disclaimerText:Ljava/lang/String;

.field private friendsActivityList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldShowFooter:Z

.field private final userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            ")V"
        }
    .end annotation

    .line 53
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->context:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->friendsActivityList:Ljava/util/List;

    .line 56
    iput-object p3, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->disclaimerText:Ljava/lang/String;

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 57
    :goto_0
    iput-boolean p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->shouldShowFooter:Z

    .line 58
    iput-object p4, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 61
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->availableAvaters:Ljava/util/List;

    .line 62
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->availableAvaters:Ljava/util/List;

    const p2, 0x7f080149

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->availableAvaters:Ljava/util/List;

    const p2, 0x7f08014a

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->availableAvaters:Ljava/util/List;

    const p2, 0x7f08014b

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->availableAvaters:Ljava/util/List;

    const p2, 0x7f08014c

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Landroid/content/Context;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Ljava/util/List;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->availableAvaters:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/invite/InvitedFriendsAdapter;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method private isFooterPosition(I)Z
    .locals 2

    .line 125
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->getItemCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 107
    iget-boolean v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->shouldShowFooter:Z

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->friendsActivityList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->friendsActivityList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 0

    .line 116
    invoke-direct {p0, p1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->isFooterPosition(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->shouldShowFooter:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    .line 87
    instance-of v0, p1, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->friendsActivityList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;

    if-eqz p2, :cond_1

    .line 90
    check-cast p1, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;

    .line 92
    invoke-static {p1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->access$000(Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 93
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->timestamp:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->setTimestamp(Ljava/lang/Long;)V

    .line 94
    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;->setStatus(Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;)V

    goto :goto_0

    .line 96
    :cond_0
    instance-of p2, p1, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;

    if-eqz p2, :cond_1

    .line 97
    check-cast p1, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;

    .line 98
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->disclaimerText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;->setDisclaimerText(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    packed-switch p2, :pswitch_data_0

    .line 82
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "no other view types supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const p2, 0x7f0c00ec

    .line 78
    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 80
    new-instance p2, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FootViewHolder;-><init>(Lcom/shopkick/app/invite/InvitedFriendsAdapter;Landroid/view/View;)V

    return-object p2

    :pswitch_1
    const p2, 0x7f0c00ed

    .line 75
    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 76
    new-instance p2, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter$FriendActivityViewHolder;-><init>(Lcom/shopkick/app/invite/InvitedFriendsAdapter;Landroid/view/View;)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method replaceData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;)V"
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->friendsActivityList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitedFriendsAdapter;->friendsActivityList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
