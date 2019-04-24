.class public Lcom/ibotta/android/view/bonuses/BonusTokenView;
.super Lcom/ibotta/android/view/common/ProgressCircleView;
.source "BonusTokenView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/bonuses/BonusTokenView$BonusTokenListener;
    }
.end annotation


# instance fields
.field bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private bonusModel:Lcom/ibotta/api/model/BonusModel;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/view/bonuses/BonusTokenView$BonusTokenListener;

.field private size:Lcom/ibotta/android/views/images/Sizes;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/view/common/ProgressCircleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/view/bonuses/BonusTokenView;->injectThis()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/ibotta/android/view/bonuses/BonusTokenView;->onImageLoaded()V

    return-void
.end method

.method private injectThis()V
    .locals 1

    .line 50
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V

    return-void
.end method

.method private onImageLoaded()V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->listener:Lcom/ibotta/android/view/bonuses/BonusTokenView$BonusTokenListener;

    if-eqz v0, :cond_0

    .line 117
    invoke-interface {v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView$BonusTokenListener;->onBonusImageLoaded()V

    :cond_0
    return-void
.end method


# virtual methods
.method public getBonusModel()Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    return-object v0
.end method

.method protected init()V
    .locals 1

    .line 90
    invoke-super {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->init()V

    .line 91
    sget-object v0, Lcom/ibotta/android/views/images/Sizes;->BONUS_SMALL:Lcom/ibotta/android/views/images/Sizes;

    iput-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->size:Lcom/ibotta/android/views/images/Sizes;

    return-void
.end method

.method protected onProgressSet()V
    .locals 7

    .line 95
    invoke-super {p0}, Lcom/ibotta/android/view/common/ProgressCircleView;->onProgressSet()V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    if-nez v0, :cond_0

    return-void

    .line 101
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/api/model/BonusModel;->getCompletedImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/view/bonuses/BonusTokenView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v5, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->size:Lcom/ibotta/android/views/images/Sizes;

    new-instance v6, Lcom/ibotta/android/view/bonuses/BonusTokenView$1;

    invoke-direct {v6, p0}, Lcom/ibotta/android/view/bonuses/BonusTokenView$1;-><init>(Lcom/ibotta/android/view/bonuses/BonusTokenView;)V

    move-object v4, p0

    invoke-interface/range {v1 .. v6}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method public setBonusModel(Lcom/ibotta/api/model/BonusModel;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    if-eqz v0, :cond_1

    if-eq p1, v0, :cond_0

    .line 63
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    :cond_0
    return-void

    :cond_1
    const-string v0, "setBonus"

    const/4 v1, 0x0

    .line 67
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 70
    new-instance v0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;

    invoke-direct {v0}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;-><init>()V

    if-eqz p1, :cond_2

    .line 72
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->setId(I)V

    .line 73
    iget-object v1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/api/helper/bonus/BonusHelper;->isCompleted(Lcom/ibotta/api/model/BonusModel;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->setCompleted(Z)V

    .line 74
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getPercentComplete()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->setPercentComplete(F)V

    .line 75
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getProgressColor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->setProgressColor(Ljava/lang/String;)V

    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->setId(I)V

    .line 78
    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->setCompleted(Z)V

    const/4 p1, 0x0

    .line 79
    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->setPercentComplete(F)V

    .line 82
    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/bonuses/BonusTokenView;->setProgress(Lcom/ibotta/android/view/common/ProgressCircleView$Progress;)V

    return-void
.end method

.method public setImageSize(Lcom/ibotta/android/views/images/Sizes;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->size:Lcom/ibotta/android/views/images/Sizes;

    return-void
.end method

.method public setListener(Lcom/ibotta/android/view/bonuses/BonusTokenView$BonusTokenListener;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/view/bonuses/BonusTokenView;->listener:Lcom/ibotta/android/view/bonuses/BonusTokenView$BonusTokenListener;

    return-void
.end method
