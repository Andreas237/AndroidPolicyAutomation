.class public Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;
.super Landroid/widget/LinearLayout;
.source "ConnectedAccountsView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private connected:Z

.field private connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;

.field protected tvConnect:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050d
    .end annotation
.end field

.field protected tvSubtitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09057c
    .end annotation
.end field

.field protected tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 57
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 63
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initLayout()V

    return-void
.end method

.method private initConnect()V
    .locals 2

    .line 148
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connected:Z

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->tvConnect:Landroid/widget/TextView;

    const v1, 0x7f110151

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->tvConnect:Landroid/widget/TextView;

    const v1, 0x7f110147

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 154
    :goto_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/-$$Lambda$ConnectedAccountsView$epW5YVCRuF1APLEvxsl3IkOPl6w;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/-$$Lambda$ConnectedAccountsView$epW5YVCRuF1APLEvxsl3IkOPl6w;-><init>(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method private initImSubtitle(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;)V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->tvSubtitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getUsername()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 68
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;)V

    const/4 v0, 0x0

    .line 70
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 71
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 72
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setClickable(Z)V

    .line 73
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setFocusable(Z)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 76
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c0141

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 80
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 81
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 83
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private initLogo()V
    .locals 5

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getLogoResId()I

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->ivLogo:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getLogoResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getLogoUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getLogoUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->ivLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :cond_1
    :goto_0
    return-void
.end method

.method private initSocialSubtitle(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V
    .locals 1

    .line 136
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connected:Z

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->tvSubtitle:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getUserName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 139
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->tvSubtitle:Landroid/widget/TextView;

    const v0, 0x7f11020f

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method private initSubtitle()V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 129
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initImSubtitle(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;)V

    goto :goto_0

    .line 125
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initSocialSubtitle(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initTitle()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->tvTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic lambda$initConnect$0(Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;Landroid/view/View;)V
    .locals 0

    .line 155
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connected:Z

    if-eqz p1, :cond_0

    .line 156
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->onDisconnectClicked()V

    goto :goto_0

    .line 158
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->onConnectClicked()V

    :goto_0
    return-void
.end method

.method private onConnectClicked()V
    .locals 2

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;

    if-eqz v0, :cond_0

    .line 165
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;->onConnectClicked(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V

    :cond_0
    return-void
.end method

.method private onConnectedAccountSet()V
    .locals 0

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initLogo()V

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initTitle()V

    return-void
.end method

.method private onConnectedSet()V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initConnect()V

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->initSubtitle()V

    return-void
.end method

.method private onDisconnectClicked()V
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;

    if-eqz v0, :cond_0

    .line 171
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;->onDisconnectClicked(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public setConnected(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connected:Z

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->onConnectedSet()V

    return-void
.end method

.method public setConnectedAccount(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->onConnectedAccountSet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/connectedaccounts/ConnectedAccountsView;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsListener;

    return-void
.end method
