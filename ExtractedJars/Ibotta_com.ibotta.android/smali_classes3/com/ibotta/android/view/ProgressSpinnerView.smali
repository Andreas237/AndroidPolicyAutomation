.class public Lcom/ibotta/android/view/ProgressSpinnerView;
.super Landroid/widget/LinearLayout;
.source "ProgressSpinnerView.java"


# instance fields
.field private animation:Landroid/view/animation/Animation;

.field private ivRing:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ProgressSpinnerView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ProgressSpinnerView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method private animate(Z)V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->ivRing:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    .line 66
    invoke-virtual {v0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->animation:Landroid/view/animation/Animation;

    if-eq p1, v0, :cond_1

    .line 67
    iget-object p1, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->ivRing:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 69
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->ivRing:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->animation:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 71
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    return-void
.end method

.method private inflateContent(Landroid/content/Context;)V
    .locals 2

    .line 29
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->ivRing:Landroid/widget/ImageView;

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->ivRing:Landroid/widget/ImageView;

    const v1, 0x7f08002f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->ivRing:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 33
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    .line 34
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 36
    iget-object v1, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->ivRing:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/view/ProgressSpinnerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x7f010016

    .line 38
    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/view/ProgressSpinnerView;->animation:Landroid/view/animation/Animation;

    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 1

    .line 43
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/view/ProgressSpinnerView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/ProgressSpinnerView;->animate(Z)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    const/4 v0, 0x0

    .line 49
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/ProgressSpinnerView;->animate(Z)V

    .line 50
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 55
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onVisibilityChanged(Landroid/view/View;I)V

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 57
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ProgressSpinnerView;->animate(Z)V

    return-void
.end method
