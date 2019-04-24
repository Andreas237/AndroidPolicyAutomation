.class public Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;
.super Landroid/widget/FrameLayout;
.source "ProfileImageView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;
    }
.end annotation


# instance fields
.field private connected:Z

.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivNotLinked:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b8
    .end annotation
.end field

.field protected ivProfilePic:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902be
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;

.field private me:Z

.field protected tvNotLinked:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090550
    .end annotation
.end field

.field userState:Lcom/ibotta/android/state/user/UserState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 65
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 71
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 85
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;)V

    const/4 v0, 0x1

    .line 87
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 88
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->setFocusable(Z)V

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    .line 91
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 94
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0198

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 95
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 97
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/profile/-$$Lambda$ProfileImageView$IOoIOTts-IndBxr60Z0pQxx3ShI;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/profile/-$$Lambda$ProfileImageView$IOoIOTts-IndBxr60Z0pQxx3ShI;-><init>(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;Landroid/view/View;)V
    .locals 1

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->listener:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;

    if-eqz p1, :cond_1

    .line 99
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->connected:Z

    if-eqz v0, :cond_0

    .line 100
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;->onProfileImageClicked()V

    goto :goto_0

    .line 102
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;->onLinkAccountClicked()V

    :cond_1
    :goto_0
    return-void
.end method

.method private onCustomerSet()V
    .locals 7

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->me:Z

    .line 111
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->me:Z

    if-eqz v1, :cond_1

    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->ACTIVITY_PROFILE_PIC:Lcom/ibotta/android/views/images/Sizes;

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_HERO_PIC:Lcom/ibotta/android/views/images/Sizes;

    .line 113
    :goto_1
    iput-boolean v4, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->connected:Z

    .line 114
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->me:Z

    if-eqz v2, :cond_3

    .line 115
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getSocial()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 117
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/api/model/customer/CustomerSocial;

    .line 118
    invoke-virtual {v5}, Lcom/ibotta/api/model/customer/CustomerSocial;->getTypeEnum()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v5

    sget-object v6, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    if-ne v5, v6, :cond_2

    .line 119
    iput-boolean v3, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->connected:Z

    .line 126
    :cond_3
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->connected:Z

    const/16 v3, 0x8

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->me:Z

    if-eqz v2, :cond_4

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivNotLinked:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->tvNotLinked:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivProfilePic:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 131
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ibotta/android/views/images/Sizes;->getPlaceholderResId()I

    move-result v5

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivProfilePic:Landroid/widget/ImageView;

    invoke-interface {v0, v2, v5, v6, v1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivNotLinked:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->tvNotLinked:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivProfilePic:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 139
    :cond_5
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 140
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 141
    invoke-virtual {v5}, Lcom/ibotta/api/model/customer/Customer;->getProfilePictureUrl()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivProfilePic:Landroid/widget/ImageView;

    .line 139
    invoke-interface {v0, v2, v5, v6, v1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivNotLinked:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->tvNotLinked:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->ivProfilePic:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    return-void
.end method


# virtual methods
.method public setCustomer(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->onCustomerSet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView;->listener:Lcom/ibotta/android/mvp/ui/view/profile/ProfileImageView$ProfileImageListener;

    return-void
.end method
