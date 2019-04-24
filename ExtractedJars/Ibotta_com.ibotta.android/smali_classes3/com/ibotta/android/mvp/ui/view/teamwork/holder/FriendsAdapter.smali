.class public Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "FriendsAdapter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;,
        Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemLongClickListener;,
        Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemClickListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private bonusContributionVisible:Z

.field private bonusName:Ljava/lang/String;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private onItemClickListener:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemClickListener;

.field private onItemLongClickListener:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemLongClickListener;

.field private final rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;",
            "Lcom/ibotta/android/util/Formatting;",
            "Lcom/ibotta/android/images/ImageCache;",
            ")V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->bonusContributionVisible:Z

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->rows:Ljava/util/List;

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 50
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Z
    .locals 0

    .line 29
    iget-boolean p0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->bonusContributionVisible:Z

    return p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Lcom/ibotta/android/util/Formatting;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->formatting:Lcom/ibotta/android/util/Formatting;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Ljava/lang/String;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->bonusName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;)Lcom/ibotta/android/images/ImageCache;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-object p0
.end method

.method public static synthetic lambda$onBindViewHolder$0(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;ILandroid/view/View;)V
    .locals 0

    .line 64
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->onItemClickListener:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemClickListener;

    if-eqz p2, :cond_0

    .line 65
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemClickListener;->onItemClicked(I)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$onBindViewHolder$1(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;ILandroid/view/View;)Z
    .locals 0

    .line 69
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->onItemLongClickListener:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemLongClickListener;

    if-eqz p2, :cond_0

    .line 70
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemLongClickListener;->onItemLongClicked(I)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;I)V
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/model/FriendItem;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->access$000(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;Lcom/ibotta/android/view/model/FriendItem;)V

    .line 63
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->llTeammateContainer:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$BPWsilx_U26tj0IQbcRw_BqyLJA;

    invoke-direct {v1, p0, p2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$BPWsilx_U26tj0IQbcRw_BqyLJA;-><init>(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;I)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 68
    :goto_0
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;->llTeammateContainer:Landroid/widget/LinearLayout;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$WL6cl6zb954TvL38SFMkq8_mDZU;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/-$$Lambda$FriendsAdapter$WL6cl6zb954TvL38SFMkq8_mDZU;-><init>(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;I)V

    instance-of p2, p1, Landroid/view/View;

    if-nez p2, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnLongClickListener(Landroid/view/View;Landroid/view/View$OnLongClickListener;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;
    .locals 2

    .line 55
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c01da

    const/4 v1, 0x0

    .line 56
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 57
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$FriendsViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public setBonusContribution(Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 0

    .line 90
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->bonusContributionVisible:Z

    .line 91
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->bonusName:Ljava/lang/String;

    return-void
.end method

.method public setClickListener(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemClickListener;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->onItemClickListener:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemClickListener;

    return-void
.end method

.method public setOnItemLongClickListener(Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemLongClickListener;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter;->onItemLongClickListener:Lcom/ibotta/android/mvp/ui/view/teamwork/holder/FriendsAdapter$OnItemLongClickListener;

    return-void
.end method
