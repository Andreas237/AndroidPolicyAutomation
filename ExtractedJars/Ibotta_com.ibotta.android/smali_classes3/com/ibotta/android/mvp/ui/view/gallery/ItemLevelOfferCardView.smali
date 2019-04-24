.class public Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;
.super Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;
.source "ItemLevelOfferCardView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 25
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private initCardViewAttributes()V
    .locals 2

    const/4 v0, 0x0

    .line 58
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->setPreventCornerOverlap(Z)V

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701cd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->setCardElevation(F)V

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701d2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->setRadius(F)V

    return-void
.end method

.method private updateCardClickListener()V
    .locals 2

    .line 48
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView$1;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/util/AppHelper;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public initLayout()V
    .locals 3

    .line 34
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->initLayout()V

    .line 35
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->initCardViewAttributes()V

    return-void
.end method

.method public onUpdateViewState()V
    .locals 0

    .line 42
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->onUpdateViewState()V

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;->updateCardClickListener()V

    return-void
.end method
