.class public Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;
.super Landroid/support/constraint/ConstraintLayout;
.source "ForegroundConstraintLayout.java"


# instance fields
.field private foreground:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 21
    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    sget-object p3, Lcom/shopkick/app/R$styleable;->ForegroundView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 33
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 35
    invoke-virtual {p0, p2}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    sget-object p1, Landroid/view/ViewOutlineProvider;->BOUNDS:Landroid/view/ViewOutlineProvider;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 132
    invoke-super {p0, p1}, Landroid/support/constraint/ConstraintLayout;->draw(Landroid/graphics/Canvas;)V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 134
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public drawableHotspotChanged(FF)V
    .locals 1

    .line 140
    invoke-super {p0, p1, p2}, Landroid/support/constraint/ConstraintLayout;->drawableHotspotChanged(FF)V

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 142
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    :cond_0
    return-void
.end method

.method protected drawableStateChanged()V
    .locals 2

    .line 69
    invoke-super {p0}, Landroid/support/constraint/ConstraintLayout;->drawableStateChanged()V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method public getForeground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getForegroundDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 1

    .line 63
    invoke-super {p0}, Landroid/support/constraint/ConstraintLayout;->jumpDrawablesToCurrentState()V

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 45
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/constraint/ConstraintLayout;->onSizeChanged(IIII)V

    .line 46
    iget-object p3, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz p3, :cond_0

    const/4 p4, 0x0

    .line 47
    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public setForeground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 102
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_3

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 110
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 114
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_1

    .line 117
    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->getLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->getTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->getRight()I

    move-result v2

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->getBottom()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    const/4 p1, 0x0

    .line 118
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->setWillNotDraw(Z)V

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 124
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->setWillNotDraw(Z)V

    .line 126
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->invalidate()V

    :cond_3
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 58
    invoke-super {p0, p1}, Landroid/support/constraint/ConstraintLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->foreground:Landroid/graphics/drawable/Drawable;

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
