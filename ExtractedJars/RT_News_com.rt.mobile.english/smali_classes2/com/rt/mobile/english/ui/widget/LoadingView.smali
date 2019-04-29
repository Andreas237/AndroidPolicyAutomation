.class public Lcom/rt/mobile/english/ui/widget/LoadingView;
.super Landroid/widget/FrameLayout;
.source "LoadingView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field errorLayout:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09007e
    .end annotation
.end field

.field private fadeInAnim:Landroid/view/animation/Animation;

.field private fadeOutAnim:Landroid/view/animation/Animation;

.field private onRetryListener:Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;

.field progressBar:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090126
    .end annotation
.end field

.field retryButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09012d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 42
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 57
    iput-object p2, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->onRetryListener:Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;

    .line 58
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->init(Landroid/content/Context;)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    .line 62
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->context:Landroid/content/Context;

    .line 63
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0c008b

    invoke-static {v0, v1, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 64
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/view/View;)V

    const/high16 v0, 0x10a0000

    .line 65
    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeInAnim:Landroid/view/animation/Animation;

    const v0, 0x10a0001

    .line 66
    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeOutAnim:Landroid/view/animation/Animation;

    .line 67
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeInAnim:Landroid/view/animation/Animation;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 68
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeOutAnim:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 69
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->errorLayout:Landroid/widget/LinearLayout;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setAlpha(F)V

    .line 70
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeInAnim:Landroid/view/animation/Animation;

    new-instance v1, Lcom/rt/mobile/english/ui/widget/LoadingView$2;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView$2;-><init>(Lcom/rt/mobile/english/ui/widget/LoadingView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 114
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->errorLayout:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeInAnim:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 115
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->progressBar:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeOutAnim:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onLoaded()V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeOutAnim:Landroid/view/animation/Animation;

    new-instance v1, Lcom/rt/mobile/english/ui/widget/LoadingView$1;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView$1;-><init>(Lcom/rt/mobile/english/ui/widget/LoadingView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 94
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeOutAnim:Landroid/view/animation/Animation;

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onLoadingStart()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeInAnim:Landroid/view/animation/Animation;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 120
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->progressBar:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->fadeInAnim:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public retry()V
    .locals 1
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f09012d
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->onRetryListener:Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->onRetryListener:Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;->onRetryClicked()V

    :cond_0
    return-void
.end method

.method public setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->onRetryListener:Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;

    return-void
.end method
