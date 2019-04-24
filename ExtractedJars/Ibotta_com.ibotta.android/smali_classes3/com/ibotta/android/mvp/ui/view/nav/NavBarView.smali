.class public Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;
.super Landroid/widget/LinearLayout;
.source "NavBarView.java"


# static fields
.field protected static final ALPHA_VISIBLE:F = 1.0f

.field private static final ANIMATION_DELAY:I = 0x3e8

.field protected static final ANIMATION_DURATION:I = 0x1f4

.field protected static final INTERPOLATOR:Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

.field private static final TRANSLATION_SHOW:F


# instance fields
.field private hidden:Z

.field private imDataConnected:Z

.field protected lavMyRebatesAnim:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902e9
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;

.field private localBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private navButtonViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;",
            ">;"
        }
    .end annotation
.end field

.field protected nbvAccount:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09036c
    .end annotation
.end field

.field protected nbvAccountContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09036d
    .end annotation
.end field

.field protected nbvFeatured:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09036e
    .end annotation
.end field

.field protected nbvFeaturedContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09036f
    .end annotation
.end field

.field protected nbvFindRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090370
    .end annotation
.end field

.field protected nbvFindRebatesContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090371
    .end annotation
.end field

.field protected nbvMyRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090372
    .end annotation
.end field

.field protected nbvMyRebatesContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090373
    .end annotation
.end field

.field protected nbvRedeem:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090377
    .end annotation
.end field

.field protected nbvRedeemContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090378
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private showBuyableGiftCard:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 64
    new-instance v0, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    invoke-direct {v0}, Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->INTERPOLATOR:Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 76
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 80
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 58
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->navButtonViews:Ljava/util/List;

    const/4 p1, 0x0

    .line 69
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->hidden:Z

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onMyRebatesAnimationFinished()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;Landroid/content/Intent;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onLocalBroadcastReceived(Landroid/content/Intent;)V

    return-void
.end method

.method private animateMyRebates()V
    .locals 4

    .line 219
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->hidden:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 220
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->hidden:Z

    .line 221
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/nav/-$$Lambda$NavBarView$G_qibbnYBQeHBvmzXGIK0C3KtZM;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/nav/-$$Lambda$NavBarView$G_qibbnYBQeHBvmzXGIK0C3KtZM;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 229
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onMyRebatesAnimationStarted()V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 149
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 153
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setOrientation(I)V

    .line 155
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0180

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 156
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeem:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->imDataConnected:Z

    iget-boolean v3, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->showBuyableGiftCard:Z

    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->setRedeemData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->navButtonViews:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFeatured:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->navButtonViews:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFindRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->navButtonViews:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeem:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->navButtonViews:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->navButtonViews:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvAccount:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->lavMyRebatesAnim:Lcom/airbnb/lottie/LottieAnimationView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->addAnimatorListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public static synthetic lambda$animateMyRebates$0(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V
    .locals 3

    .line 222
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 223
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->INTERPOLATOR:Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    .line 224
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    .line 225
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 226
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method private onLocalBroadcastReceived(Landroid/content/Intent;)V
    .locals 0

    .line 213
    invoke-static {p1}, Lcom/ibotta/android/LocalBroadcast;->isRebateUnlocked(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 214
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->animateMyRebates()V

    :cond_0
    return-void
.end method

.method private onMyRebatesAnimationFinished()V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->setIconVisible(Z)V

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->lavMyRebatesAnim:Lcom/airbnb/lottie/LottieAnimationView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    return-void
.end method

.method private onMyRebatesAnimationStarted()V
    .locals 2

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->setIconVisible(Z)V

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->lavMyRebatesAnim:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->lavMyRebatesAnim:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    return-void
.end method

.method private onNavButtonClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0

    .line 268
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->select(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    return-void
.end method

.method private registerUnlockListener()V
    .locals 4

    .line 195
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView$2;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 202
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.ibotta.android.LOCAL"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method private unregisterUnlockListener()V
    .locals 2

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 208
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public isHidden()Z
    .locals 1

    .line 90
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->hidden:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 183
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 184
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->registerUnlockListener()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 189
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->unregisterUnlockListener()V

    .line 190
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    return-void
.end method

.method protected onNbvFiveClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09036c
        }
    .end annotation

    .line 264
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onNavButtonClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V

    return-void
.end method

.method protected onNbvFourClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090372
        }
    .end annotation

    .line 259
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onNavButtonClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V

    return-void
.end method

.method protected onNbvOneClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09036e
        }
    .end annotation

    .line 244
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onNavButtonClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V

    return-void
.end method

.method protected onNbvThreeClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090377
        }
    .end annotation

    .line 254
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onNavButtonClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V

    return-void
.end method

.method protected onNbvTwoClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090370
        }
    .end annotation

    .line 249
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->onNavButtonClicked(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V

    return-void
.end method

.method public select(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 1

    .line 118
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->listener:Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;

    if-eqz v0, :cond_0

    .line 121
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;->onNavButtonSelected(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V

    :cond_0
    return-void
.end method

.method public setBlurred()V
    .locals 2

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080178

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 141
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFeaturedContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 142
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFindRebatesContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 143
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeemContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 144
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebatesContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 145
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvAccountContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setHidden(Z)V
    .locals 0

    .line 94
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->hidden:Z

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->listener:Lcom/ibotta/android/mvp/ui/view/nav/NavBarListener;

    return-void
.end method

.method public setRedeemData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)V
    .locals 1

    .line 98
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 99
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->imDataConnected:Z

    .line 100
    iput-boolean p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->showBuyableGiftCard:Z

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeem:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->setRedeemData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)V

    :cond_0
    return-void
.end method

.method public setup(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)V
    .locals 3

    .line 131
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->REDEEM:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    if-eq p1, v0, :cond_1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->navButtonViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 133
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v2

    if-ne v2, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->setSelected(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method
