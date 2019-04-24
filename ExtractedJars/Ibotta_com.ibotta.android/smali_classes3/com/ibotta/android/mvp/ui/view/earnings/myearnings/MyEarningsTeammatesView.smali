.class public Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;
.super Landroid/widget/LinearLayout;
.source "MyEarningsTeammatesView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;
    }
.end annotation


# instance fields
.field protected bViewAll:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b1
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;

.field protected llTeammatesContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09032f
    .end annotation
.end field

.field tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvMyRanking:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054c
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->initLayout()V

    return-void
.end method

.method private addDividerRow()V
    .locals 3

    .line 126
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07015d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07016d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 130
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0600fa

    .line 131
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 133
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->llTeammatesContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private addLargeDividerRow()V
    .locals 3

    .line 137
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 138
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701b0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07016d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 141
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0600fa

    .line 142
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 144
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->llTeammatesContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private addTeammateRow(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 2

    .line 114
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;-><init>(Landroid/content/Context;)V

    .line 115
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setFriendItem(Lcom/ibotta/android/view/model/FriendItem;)V

    .line 116
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->isMe()Z

    move-result p1

    if-nez p1, :cond_0

    .line 117
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;)V

    .line 120
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->llTeammatesContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 122
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->addDividerRow()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 67
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;)V

    const/4 v0, 0x1

    .line 69
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->setOrientation(I)V

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    .line 72
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 75
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c016d

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 76
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 78
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060171

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->setBackgroundColor(I)V

    return-void
.end method

.method private initMyRank(II)V
    .locals 4

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->tvMyRanking:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const p1, 0x7f110557

    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTeammates(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;)V"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->llTeammatesContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    .line 99
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->addLargeDividerRow()V

    .line 104
    :cond_0
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/model/FriendItem;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->addTeammateRow(Lcom/ibotta/android/view/model/FriendItem;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private initViewAllButton()V
    .locals 3

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->bViewAll:Landroid/widget/Button;

    const v1, 0x7f110678

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->bViewAll:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/-$$Lambda$MyEarningsTeammatesView$U12TubVET2PMXnTnZwYOmUPHn94;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/-$$Lambda$MyEarningsTeammatesView$U12TubVET2PMXnTnZwYOmUPHn94;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initViewAllButton$0(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;Landroid/view/View;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->onViewAllTeammatesClicked()V

    return-void
.end method

.method private onViewAllTeammatesClicked()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "view_all_teammates_click"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;

    if-eqz v0, :cond_0

    .line 151
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;->onViewAllTeammatesClicked()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onTeammateRowViewClicked(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;

    if-eqz v0, :cond_0

    .line 158
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;->onTeammateClicked(Lcom/ibotta/android/view/model/FriendItem;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView$MyEarningsTeammatesListener;

    return-void
.end method

.method public setup(Ljava/util/List;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/FriendItem;",
            ">;II)V"
        }
    .end annotation

    .line 82
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->initMyRank(II)V

    .line 83
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->initTeammates(Ljava/util/List;)V

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsTeammatesView;->initViewAllButton()V

    return-void
.end method
