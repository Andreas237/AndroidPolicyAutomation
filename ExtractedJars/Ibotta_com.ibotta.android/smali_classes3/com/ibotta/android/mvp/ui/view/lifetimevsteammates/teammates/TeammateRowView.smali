.class public Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;
.super Landroid/widget/LinearLayout;
.source "TeammateRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;
    }
.end annotation


# instance fields
.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private friendItem:Lcom/ibotta/android/view/model/FriendItem;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivFriendImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902be
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;

.field protected tvFirstName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090525
    .end annotation
.end field

.field protected tvRank:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090564
    .end annotation
.end field

.field protected tvTotalEarnings:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09058b
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 49
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->initLayout()V

    return-void
.end method

.method private initFirstName()V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvFirstName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initFriendImage()V
    .locals 5

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/friend/Friend;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object v0

    .line 106
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_PIC:Lcom/ibotta/android/views/images/Sizes;

    .line 107
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->ivFriendImage:Landroid/widget/ImageView;

    invoke-interface {v2, v3, v0, v4, v1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 66
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;)V

    .line 68
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    .line 69
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setOrientation(I)V

    const/4 v1, 0x1

    .line 70
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setClickable(Z)V

    const/16 v2, 0x10

    .line 71
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setGravity(I)V

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 74
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 77
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c01d9

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 78
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060171

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setBackgroundColor(I)V

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/-$$Lambda$TeammateRowView$_dZV6QybopYztnj-ZfM5lkvb2XI;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/-$$Lambda$TeammateRowView$_dZV6QybopYztnj-ZfM5lkvb2XI;-><init>(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initRank()V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvRank:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/FriendItem;->getRank()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTotalEarnings()V
    .locals 3

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {v0}, Lcom/ibotta/android/view/model/FriendItem;->isShowEarnings()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvTotalEarnings:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getTotalEarnings()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 118
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvTotalEarnings:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->tvTotalEarnings:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;Landroid/view/View;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->onTeammateRowViewClicked()V

    return-void
.end method

.method private onFriendItemSet()V
    .locals 0

    .line 94
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->initRank()V

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->initFriendImage()V

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->initFirstName()V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->initTotalEarnings()V

    return-void
.end method

.method private onTeammateRowViewClicked()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->listener:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;

    if-eqz v0, :cond_0

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;->onTeammateRowViewClicked(Lcom/ibotta/android/view/model/FriendItem;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public setFriendItem(Lcom/ibotta/android/view/model/FriendItem;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->friendItem:Lcom/ibotta/android/view/model/FriendItem;

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->onFriendItemSet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView;->listener:Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammates/TeammateRowView$OnTeammateRowViewClickedListener;

    return-void
.end method
