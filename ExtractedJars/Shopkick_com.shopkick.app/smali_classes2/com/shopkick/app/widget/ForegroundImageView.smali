.class public Lcom/shopkick/app/widget/ForegroundImageView;
.super Landroid/support/v7/widget/AppCompatImageView;
.source "ForegroundImageView.java"


# instance fields
.field private foreground:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/widget/ForegroundImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    sget-object p3, Lcom/shopkick/app/R$styleable;->ForegroundView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 25
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 27
    invoke-virtual {p0, p2}, Lcom/shopkick/app/widget/ForegroundImageView;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    sget-object p1, Landroid/view/ViewOutlineProvider;->BOUNDS:Landroid/view/ViewOutlineProvider;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/ForegroundImageView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 105
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;->draw(Landroid/graphics/Canvas;)V

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 107
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public drawableHotspotChanged(FF)V
    .locals 1

    .line 113
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/AppCompatImageView;->drawableHotspotChanged(FF)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    :cond_0
    return-void
.end method

.method protected drawableStateChanged()V
    .locals 2

    .line 59
    invoke-super {p0}, Landroid/support/v7/widget/AppCompatImageView;->drawableStateChanged()V

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/ForegroundImageView;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method public getForeground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 1

    .line 53
    invoke-super {p0}, Landroid/support/v7/widget/AppCompatImageView;->jumpDrawablesToCurrentState()V

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 35
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/AppCompatImageView;->onSizeChanged(IIII)V

    .line 36
    iget-object p3, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz p3, :cond_0

    const/4 p4, 0x0

    .line 37
    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public setForeground(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_3

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 83
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/ForegroundImageView;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 87
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_1

    .line 90
    invoke-virtual {p0}, Lcom/shopkick/app/widget/ForegroundImageView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/shopkick/app/widget/ForegroundImageView;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 91
    invoke-virtual {p0, v2}, Lcom/shopkick/app/widget/ForegroundImageView;->setWillNotDraw(Z)V

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/ForegroundImageView;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 97
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/ForegroundImageView;->setWillNotDraw(Z)V

    .line 99
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/widget/ForegroundImageView;->invalidate()V

    :cond_3
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 48
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatImageView;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/widget/ForegroundImageView;->foreground:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
