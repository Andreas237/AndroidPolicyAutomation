.class public Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;
.super Landroid/widget/FrameLayout;
.source "LoadingSpinnerView.java"


# instance fields
.field private animation:Landroid/view/animation/Animation;

.field protected ivSpinner:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902c8
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 38
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->initLayout()V

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
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 51
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->initLayout()V

    return-void
.end method

.method private animate(Z)V
    .locals 1

    if-eqz p1, :cond_1

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->ivSpinner:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->animation:Landroid/view/animation/Animation;

    if-eq p1, v0, :cond_0

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->ivSpinner:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 87
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->ivSpinner:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->animation:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 89
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->ivSpinner:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0172

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 57
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010016

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->animation:Landroid/view/animation/Animation;

    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 1

    .line 64
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->animate(Z)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    const/4 v0, 0x0

    .line 70
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->animate(Z)V

    .line 71
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 76
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onVisibilityChanged(Landroid/view/View;I)V

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 78
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;->animate(Z)V

    return-void
.end method
