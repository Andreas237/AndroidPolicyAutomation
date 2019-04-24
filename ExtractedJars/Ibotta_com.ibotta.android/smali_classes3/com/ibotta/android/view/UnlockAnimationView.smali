.class public Lcom/ibotta/android/view/UnlockAnimationView;
.super Landroid/widget/RelativeLayout;
.source "UnlockAnimationView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;
    }
.end annotation


# instance fields
.field protected lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902e5
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/view/UnlockAnimationView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/view/UnlockAnimationView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/view/UnlockAnimationView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/UnlockAnimationView;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/view/UnlockAnimationView;->notifyAnimationEnded()V

    return-void
.end method

.method private initLayout()V
    .locals 2

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/view/UnlockAnimationView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01f0

    .line 50
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 52
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/view/UnlockAnimationView;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    new-instance v1, Lcom/ibotta/android/view/UnlockAnimationView$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/view/UnlockAnimationView$1;-><init>(Lcom/ibotta/android/view/UnlockAnimationView;)V

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->addAnimatorListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method private notifyAnimationEnded()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/view/UnlockAnimationView;->listener:Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;

    if-eqz v0, :cond_0

    .line 73
    invoke-interface {v0}, Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;->onAnimationFinished()V

    :cond_0
    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/view/UnlockAnimationView;->listener:Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;

    return-void
.end method

.method public startAnimation()V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/view/UnlockAnimationView;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    return-void
.end method
