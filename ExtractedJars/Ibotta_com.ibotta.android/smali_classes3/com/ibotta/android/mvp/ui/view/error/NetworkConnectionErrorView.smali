.class public Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;
.super Landroid/support/design/widget/CoordinatorLayout;
.source "NetworkConnectionErrorView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;
    }
.end annotation


# instance fields
.field protected ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090029
    .end annotation
.end field

.field protected bConnectionErrorCta:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090083
    .end annotation
.end field

.field private isModalIdentifier:Z

.field protected llContentContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090304
    .end annotation
.end field

.field protected nbvOfflineNavBarView:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090375
    .end annotation
.end field

.field private networkConnectionErrorViewListener:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;

.field protected tToolbar:Landroid/support/v7/widget/Toolbar;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09043a
    .end annotation
.end field

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field

.field protected vTopSpacing:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905bd
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Landroid/support/design/widget/CoordinatorLayout;-><init>(Landroid/content/Context;)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0182

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 76
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onSetUp()V
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->bConnectionErrorCta:Landroid/widget/Button;

    const v1, 0x7f1101e4

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->tvMessage:Landroid/widget/TextView;

    const v1, 0x7f1103a2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 92
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->isModalIdentifier:Z

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->vTopSpacing:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0800a1

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/AppBarLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->tToolbar:Landroid/support/v7/widget/Toolbar;

    const v1, 0x7f080272

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setNavigationIcon(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getToolbar()Landroid/support/v7/widget/Toolbar;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->tToolbar:Landroid/support/v7/widget/Toolbar;

    return-object v0
.end method

.method public hideConnectionErrorViewBottomNavigation()V
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->nbvOfflineNavBarView:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setVisibility(I)V

    return-void
.end method

.method public initConnectionErrorViewBottomNavigation(Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V
    .locals 2
    .param p2    # Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 109
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;->getTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->nbvOfflineNavBarView:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;->getTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    .line 113
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->nbvOfflineNavBarView:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/misc/BottomNavIdentifier;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setRedeemData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)V

    :cond_1
    if-eqz p2, :cond_2

    .line 118
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->nbvOfflineNavBarView:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V

    :cond_2
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 2

    .line 66
    invoke-super {p0}, Landroid/support/design/widget/CoordinatorLayout;->onAttachedToWindow()V

    .line 67
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->isModalIdentifier:Z

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->llContentContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;

    .line 69
    new-instance v1, Landroid/support/design/widget/BottomSheetBehavior;

    invoke-direct {v1}, Landroid/support/design/widget/BottomSheetBehavior;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;->setBehavior(Landroid/support/design/widget/CoordinatorLayout$Behavior;)V

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->networkConnectionErrorViewListener:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->llContentContainer:Landroid/widget/LinearLayout;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;->onNetworkConnectionModalIdentified(Landroid/widget/LinearLayout;)V

    :cond_0
    return-void
.end method

.method protected onConnectionErrorCtaClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090083
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->networkConnectionErrorViewListener:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;

    if-nez v0, :cond_0

    return-void

    .line 105
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;->onNetworkConnectionErrorRetryClicked()V

    return-void
.end method

.method public setAppBarChild(Landroid/view/View;)V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/AppBarLayout;->removeAllViews()V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/AppBarLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public setNetworkConnectionErrorViewListener(Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->networkConnectionErrorViewListener:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView$NetworkConnectionErrorViewListener;

    return-void
.end method

.method public setup(Z)V
    .locals 0

    .line 80
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->isModalIdentifier:Z

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->onSetUp()V

    return-void
.end method
