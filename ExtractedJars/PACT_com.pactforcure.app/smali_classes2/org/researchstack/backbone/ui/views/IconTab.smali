.class public Lorg/researchstack/backbone/ui/views/IconTab;
.super Landroid/widget/RelativeLayout;
.source "IconTab.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field private icon:Landroid/widget/ImageView;

.field private indicator:Landroid/widget/ImageView;

.field private title:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 31
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->init()V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->init()V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 42
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->init()V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I
    .param p4, "defStyleRes"    # I
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    .line 49
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 50
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->init()V

    .line 51
    return-void
.end method

.method private adjustIndicatorPosition()V
    .locals 4

    .prologue
    .line 107
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    .line 108
    .local v0, "anchor":Landroid/view/View;
    :goto_0
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 109
    .local v1, "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/4 v2, 0x6

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 110
    const/4 v2, 0x7

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 111
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->requestLayout()V

    .line 112
    return-void

    .line 107
    .end local v0    # "anchor":Landroid/view/View;
    .end local v1    # "params":Landroid/widget/RelativeLayout$LayoutParams;
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->title:Landroid/widget/TextView;

    goto :goto_0
.end method

.method private adjustSelectedView()V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    const-wide/16 v6, 0x96

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 77
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_2

    .line 79
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 80
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->title:Landroid/widget/TextView;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setAlpha(F)V

    .line 81
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->adjustIndicatorPosition()V

    .line 103
    :goto_2
    return-void

    :cond_0
    move v0, v2

    .line 79
    goto :goto_0

    :cond_1
    move v2, v1

    .line 80
    goto :goto_1

    .line 85
    :cond_2
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {p0}, Lorg/researchstack/backbone/ui/views/IconTab$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/views/IconTab;)Ljava/lang/Runnable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 90
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    .line 91
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-virtual {v3, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    .line 92
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_4
    invoke-virtual {v3, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    .line 93
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    :goto_5
    invoke-virtual {v3, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 94
    invoke-virtual {v0, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    .line 95
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v0}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    :goto_6
    invoke-virtual {v3, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 96
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v3

    if-eqz v3, :cond_7

    move-wide v4, v6

    :goto_7
    invoke-virtual {v0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 98
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->title:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 99
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v3

    if-eqz v3, :cond_8

    :goto_8
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 100
    invoke-virtual {v0, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 101
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_9
    invoke-virtual {v0, v8, v9}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    goto :goto_2

    :cond_3
    move v0, v2

    .line 91
    goto :goto_3

    :cond_4
    move v0, v2

    .line 92
    goto :goto_4

    :cond_5
    move v0, v2

    .line 93
    goto :goto_5

    .line 95
    :cond_6
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    goto :goto_6

    :cond_7
    move-wide v4, v8

    .line 96
    goto :goto_7

    :cond_8
    move v2, v1

    .line 99
    goto :goto_8

    :cond_9
    move-wide v8, v6

    .line 101
    goto :goto_9
.end method

.method private init()V
    .locals 3

    .prologue
    .line 55
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lorg/researchstack/backbone/R$layout;->rsb_view_icon_tab:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 57
    sget v0, Lorg/researchstack/backbone/R$id;->title:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/views/IconTab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->title:Landroid/widget/TextView;

    .line 58
    sget v0, Lorg/researchstack/backbone/R$id;->icon:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/views/IconTab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    .line 59
    sget v0, Lorg/researchstack/backbone/R$id;->indicator:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/views/IconTab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    .line 62
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->adjustSelectedView()V

    .line 65
    invoke-virtual {p0, p0}, Lorg/researchstack/backbone/ui/views/IconTab;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 66
    return-void
.end method

.method static synthetic lambda$adjustSelectedView$41(Lorg/researchstack/backbone/ui/views/IconTab;)V
    .locals 4
    .param p0, "this"    # Lorg/researchstack/backbone/ui/views/IconTab;

    .prologue
    .line 86
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->adjustIndicatorPosition()V

    .line 87
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 88
    return-void
.end method


# virtual methods
.method public dispatchSetSelected(Z)V
    .locals 0
    .param p1, "selected"    # Z

    .prologue
    .line 71
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchSetSelected(Z)V

    .line 72
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->adjustSelectedView()V

    .line 73
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 10
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 158
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->isSelected()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 160
    const/4 v8, 0x2

    new-array v3, v8, [I

    .line 161
    .local v3, "screenPos":[I
    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/IconTab;->getLocationOnScreen([I)V

    .line 163
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 164
    .local v1, "context":Landroid/content/Context;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->getWidth()I

    move-result v5

    .line 165
    .local v5, "width":I
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTab;->getHeight()I

    move-result v2

    .line 166
    .local v2, "height":I
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v4, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 168
    .local v4, "screenWidth":I
    iget-object v8, p0, Lorg/researchstack/backbone/ui/views/IconTab;->title:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-static {v1, v8, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 170
    .local v0, "cheatSheet":Landroid/widget/Toast;
    const/16 v8, 0x31

    aget v7, v3, v7

    div-int/lit8 v9, v5, 0x2

    add-int/2addr v7, v9

    div-int/lit8 v9, v4, 0x2

    sub-int/2addr v7, v9

    aget v9, v3, v6

    add-int/2addr v9, v2

    invoke-virtual {v0, v8, v7, v9}, Landroid/widget/Toast;->setGravity(III)V

    .line 174
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 177
    .end local v0    # "cheatSheet":Landroid/widget/Toast;
    .end local v1    # "context":Landroid/content/Context;
    .end local v2    # "height":I
    .end local v3    # "screenPos":[I
    .end local v4    # "screenWidth":I
    .end local v5    # "width":I
    :goto_0
    return v6

    :cond_0
    move v6, v7

    goto :goto_0
.end method

.method public setIcon(I)V
    .locals 1
    .param p1, "iconResId"    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    .prologue
    .line 126
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 127
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 131
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 132
    return-void
.end method

.method public setIconTint(I)V
    .locals 2
    .param p1, "iconTint"    # I

    .prologue
    .line 136
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 137
    .local v0, "drawable":Landroid/graphics/drawable/Drawable;
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 138
    invoke-static {v0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 139
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/IconTab;->icon:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 140
    return-void
.end method

.method public setIndicatorTint(I)V
    .locals 2
    .param p1, "indicatorTint"    # I

    .prologue
    .line 149
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 150
    .local v0, "drawable":Landroid/graphics/drawable/Drawable;
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 151
    invoke-static {v0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 152
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    return-void
.end method

.method public setIsIndicatorShow(Z)V
    .locals 2
    .param p1, "visible"    # Z

    .prologue
    .line 144
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/IconTab;->indicator:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 145
    return-void

    .line 144
    :cond_0
    const/4 v0, 0x4

    goto :goto_0
.end method

.method public setText(I)V
    .locals 1
    .param p1, "textResId"    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .prologue
    .line 116
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->title:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 117
    return-void
.end method

.method public setTextColor(I)V
    .locals 1
    .param p1, "textColor"    # I

    .prologue
    .line 121
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab;->title:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    return-void
.end method
