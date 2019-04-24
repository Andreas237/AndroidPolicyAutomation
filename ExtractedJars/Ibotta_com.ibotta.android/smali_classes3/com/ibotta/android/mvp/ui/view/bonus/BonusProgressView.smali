.class public Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;
.super Landroid/widget/FrameLayout;
.source "BonusProgressView.java"


# static fields
.field private static final ANIMATION_DURATION:I = 0x1f4


# instance fields
.field bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private bonusModel:Lcom/ibotta/api/model/BonusModel;

.field protected dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901a6
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivCheck:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09029d
    .end annotation
.end field

.field protected ivImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090297
    .end annotation
.end field

.field protected ivLock:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b3
    .end annotation
.end field

.field private size:Lcom/ibotta/android/views/images/Sizes;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 49
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 53
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    .line 57
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

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

    .line 65
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->initLayout()V

    return-void
.end method

.method private initCheck()V
    .locals 3

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivCheck:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1, v2}, Lcom/ibotta/api/helper/bonus/BonusHelper;->isCompleted(Lcom/ibotta/api/model/BonusModel;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private initImage()V
    .locals 5

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/BonusModel;->getCompletedImageUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivImage:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->size:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 118
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;)V

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0139

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 121
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701c5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setSize(I)V

    return-void
.end method

.method private initLock()V
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivLock:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->isLocked()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private initProgress()V
    .locals 5

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/bonus/BonusHelper;->isCompleted(Lcom/ibotta/api/model/BonusModel;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    invoke-virtual {v0, v1}, Lcom/github/lzyzsd/circleprogress/DonutProgress;->setProgress(F)V

    goto :goto_0

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    const-string v2, "progress"

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v1, v3, v4

    const/4 v1, 0x1

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v4}, Lcom/ibotta/api/model/BonusModel;->getPercentComplete()F

    move-result v4

    aput v4, v3, v1

    invoke-static {v0, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    .line 139
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 140
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 141
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :goto_0
    return-void
.end method

.method private onDataSet()V
    .locals 0

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->initProgress()V

    .line 128
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->initImage()V

    .line 129
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->initCheck()V

    .line 130
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->initLock()V

    return-void
.end method


# virtual methods
.method public setProgressBackgroundColor(I)V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    invoke-virtual {v0, p1}, Lcom/github/lzyzsd/circleprogress/DonutProgress;->setUnfinishedStrokeColor(I)V

    return-void
.end method

.method public setProgressRingWidth(I)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lcom/github/lzyzsd/circleprogress/DonutProgress;->setFinishedStrokeWidth(F)V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    invoke-virtual {v0, p1}, Lcom/github/lzyzsd/circleprogress/DonutProgress;->setUnfinishedStrokeWidth(F)V

    return-void
.end method

.method public setSize(I)V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    invoke-virtual {v0}, Lcom/github/lzyzsd/circleprogress/DonutProgress;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 88
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 89
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    invoke-virtual {v1, v0}, Lcom/github/lzyzsd/circleprogress/DonutProgress;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivImage:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->dpProgress:Lcom/github/lzyzsd/circleprogress/DonutProgress;

    invoke-virtual {v1}, Lcom/github/lzyzsd/circleprogress/DonutProgress;->getFinishedStrokeWidth()F

    move-result v1

    float-to-int v1, v1

    mul-int/lit8 v1, v1, 0x3

    sub-int/2addr p1, v1

    .line 95
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 96
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivImage:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivCheck:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 101
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 102
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivCheck:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivLock:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 107
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 108
    iget p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 110
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->ivLock:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setViewModel(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    .line 70
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/bonus/BonusHelper;->isCompleted(Lcom/ibotta/api/model/BonusModel;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 73
    sget-object p1, Lcom/ibotta/android/views/images/Sizes;->BONUS_GRID_COMPLETE:Lcom/ibotta/android/views/images/Sizes;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->size:Lcom/ibotta/android/views/images/Sizes;

    goto :goto_0

    .line 75
    :cond_0
    sget-object p1, Lcom/ibotta/android/views/images/Sizes;->BONUS_GRID_INCOMPLETE:Lcom/ibotta/android/views/images/Sizes;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->size:Lcom/ibotta/android/views/images/Sizes;

    .line 78
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->onDataSet()V

    return-void
.end method
