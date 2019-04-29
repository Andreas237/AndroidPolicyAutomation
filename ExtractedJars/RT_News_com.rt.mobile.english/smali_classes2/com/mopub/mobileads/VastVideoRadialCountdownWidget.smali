.class public Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;
.super Landroid/widget/ImageView;
.source "VastVideoRadialCountdownWidget.java"


# instance fields
.field private mLastProgressMilliseconds:I

.field private mRadialCountdownDrawable:Lcom/mopub/mobileads/resource/RadialCountdownDrawable;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-static {}, Lcom/mopub/common/util/Utils;->generateUniqueId()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->setId(I)V

    const/high16 v0, 0x42340000    # 45.0f

    .line 23
    invoke-static {v0, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v0

    const/high16 v1, 0x41800000    # 16.0f

    .line 24
    invoke-static {v1, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v2

    .line 25
    invoke-static {v1, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v1

    const/high16 v3, 0x40a00000    # 5.0f

    .line 26
    invoke-static {v3, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v3

    .line 28
    new-instance v4, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;

    invoke-direct {v4, p1}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mRadialCountdownDrawable:Lcom/mopub/mobileads/resource/RadialCountdownDrawable;

    .line 29
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mRadialCountdownDrawable:Lcom/mopub/mobileads/resource/RadialCountdownDrawable;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 30
    invoke-virtual {p0, v3, v3, v3, v3}, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->setPadding(IIII)V

    .line 32
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 35
    invoke-virtual {p1, v0, v2, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    const/16 v0, 0xb

    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 37
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method calibrateAndMakeVisible(I)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mRadialCountdownDrawable:Lcom/mopub/mobileads/resource/RadialCountdownDrawable;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->setInitialCountdown(I)V

    const/4 p1, 0x0

    .line 42
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->setVisibility(I)V

    return-void
.end method

.method getImageViewDrawable()Lcom/mopub/mobileads/resource/RadialCountdownDrawable;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mRadialCountdownDrawable:Lcom/mopub/mobileads/resource/RadialCountdownDrawable;

    return-object v0
.end method

.method setImageViewDrawable(Lcom/mopub/mobileads/resource/RadialCountdownDrawable;)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 76
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mRadialCountdownDrawable:Lcom/mopub/mobileads/resource/RadialCountdownDrawable;

    return-void
.end method

.method updateCountdownProgress(II)V
    .locals 1

    .line 50
    iget v0, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mLastProgressMilliseconds:I

    if-lt p2, v0, :cond_1

    sub-int/2addr p1, p2

    if-gez p1, :cond_0

    const/16 p1, 0x8

    .line 57
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->setVisibility(I)V

    goto :goto_0

    .line 59
    :cond_0
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mRadialCountdownDrawable:Lcom/mopub/mobileads/resource/RadialCountdownDrawable;

    invoke-virtual {p1, p2}, Lcom/mopub/mobileads/resource/RadialCountdownDrawable;->updateCountdownProgress(I)V

    .line 60
    iput p2, p0, Lcom/mopub/mobileads/VastVideoRadialCountdownWidget;->mLastProgressMilliseconds:I

    :cond_1
    :goto_0
    return-void
.end method
