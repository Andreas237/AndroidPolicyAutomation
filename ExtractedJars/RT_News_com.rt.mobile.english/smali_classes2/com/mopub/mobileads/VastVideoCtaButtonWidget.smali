.class public Lcom/mopub/mobileads/VastVideoCtaButtonWidget;
.super Landroid/widget/ImageView;
.source "VastVideoCtaButtonWidget.java"


# instance fields
.field private mCtaButtonDrawable:Lcom/mopub/mobileads/resource/CtaButtonDrawable;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mHasClickthroughUrl:Z

.field private mHasCompanionAd:Z

.field private mHasSocialActions:Z

.field private mIsVideoComplete:Z

.field private mIsVideoSkippable:Z

.field private final mLandscapeLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;IZZ)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 32
    iput-boolean p3, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasCompanionAd:Z

    .line 33
    iput-boolean p4, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasClickthroughUrl:Z

    const/4 p3, 0x0

    .line 34
    iput-boolean p3, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasSocialActions:Z

    .line 36
    invoke-static {}, Lcom/mopub/common/util/Utils;->generateUniqueId()J

    move-result-wide p3

    long-to-int p3, p3

    invoke-virtual {p0, p3}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setId(I)V

    const/high16 p3, 0x43160000    # 150.0f

    .line 38
    invoke-static {p3, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result p3

    const/high16 p4, 0x42180000    # 38.0f

    .line 39
    invoke-static {p4, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result p4

    const/high16 v0, 0x41800000    # 16.0f

    .line 40
    invoke-static {v0, p1}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result v0

    .line 42
    new-instance v1, Lcom/mopub/mobileads/resource/CtaButtonDrawable;

    invoke-direct {v1, p1}, Lcom/mopub/mobileads/resource/CtaButtonDrawable;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mCtaButtonDrawable:Lcom/mopub/mobileads/resource/CtaButtonDrawable;

    .line 43
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mCtaButtonDrawable:Lcom/mopub/mobileads/resource/CtaButtonDrawable;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p1, p3, p4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mLandscapeLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 47
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mLandscapeLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 48
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mLandscapeLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 49
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mLandscapeLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x7

    invoke-virtual {p1, v1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 52
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p1, p3, p4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 53
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 54
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 p2, 0xc

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 55
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 p2, 0xb

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 57
    invoke-direct {p0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->updateLayoutAndVisibility()V

    return-void
.end method

.method private updateLayoutAndVisibility()V
    .locals 2

    .line 92
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasClickthroughUrl:Z

    const/16 v1, 0x8

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0, v1}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setVisibility(I)V

    return-void

    .line 98
    :cond_0
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mIsVideoSkippable:Z

    if-nez v0, :cond_1

    const/4 v0, 0x4

    .line 99
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setVisibility(I)V

    return-void

    .line 105
    :cond_1
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mIsVideoComplete:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasCompanionAd:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasSocialActions:Z

    if-nez v0, :cond_2

    .line 106
    invoke-virtual {p0, v1}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setVisibility(I)V

    return-void

    .line 110
    :cond_2
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Unrecognized screen orientation: CTA button widget defaulting to portrait layout"

    .line 128
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :pswitch_0
    const-string v0, "Screen orientation is deprecated ORIENTATION_SQUARE: CTA button widget defaulting to portrait layout"

    .line 124
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 114
    :pswitch_1
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mLandscapeLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 117
    :pswitch_2
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :pswitch_3
    const-string v0, "Screen orientation undefined: CTA button widget defaulting to portrait layout"

    .line 120
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    const/4 v0, 0x0

    .line 132
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->setVisibility(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method getCtaText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mCtaButtonDrawable:Lcom/mopub/mobileads/resource/CtaButtonDrawable;

    invoke-virtual {v0}, Lcom/mopub/mobileads/resource/CtaButtonDrawable;->getCtaText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method getHasSocialActions()Z
    .locals 1

    .line 76
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasSocialActions:Z

    return v0
.end method

.method hasLandscapeLayoutParams()Z
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 153
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mLandscapeLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method hasPortraitLayoutParams()Z
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 146
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mPortraitLayoutParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method notifyVideoComplete()V
    .locals 1

    const/4 v0, 0x1

    .line 85
    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mIsVideoSkippable:Z

    .line 86
    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mIsVideoComplete:Z

    .line 87
    invoke-direct {p0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->updateLayoutAndVisibility()V

    return-void
.end method

.method notifyVideoSkippable()V
    .locals 1

    const/4 v0, 0x1

    .line 80
    iput-boolean v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mIsVideoSkippable:Z

    .line 81
    invoke-direct {p0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->updateLayoutAndVisibility()V

    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 62
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 64
    invoke-direct {p0}, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->updateLayoutAndVisibility()V

    return-void
.end method

.method setHasSocialActions(Z)V
    .locals 0

    .line 72
    iput-boolean p1, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mHasSocialActions:Z

    return-void
.end method

.method updateCtaText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 68
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoCtaButtonWidget;->mCtaButtonDrawable:Lcom/mopub/mobileads/resource/CtaButtonDrawable;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/resource/CtaButtonDrawable;->setCtaText(Ljava/lang/String;)V

    return-void
.end method
