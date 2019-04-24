.class public Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "ForegroundRelativeLayout.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private foreground:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    sget-object p3, Lcom/shopkick/app/R$styleable;->ForegroundView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 34
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 36
    invoke-virtual {p0, p2}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 38
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 39
    sget-object p1, Landroid/view/ViewOutlineProvider;->BOUNDS:Landroid/view/ViewOutlineProvider;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 133
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->draw(Landroid/graphics/Canvas;)V

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public drawableHotspotChanged(FF)V
    .locals 1

    .line 141
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->drawableHotspotChanged(FF)V

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    :cond_0
    return-void
.end method

.method protected drawableStateChanged()V
    .locals 2

    .line 70
    invoke-super {p0}, Landroid/widget/RelativeLayout;->drawableStateChanged()V

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method public getForeground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getForegroundDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 1

    .line 64
    invoke-super {p0}, Landroid/widget/RelativeLayout;->jumpDrawablesToCurrentState()V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 46
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 47
    iget-object p3, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz p3, :cond_0

    const/4 p4, 0x0

    .line 48
    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public setForeground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 103
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setForegroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_3

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 111
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 115
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    .line 117
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_1

    .line 118
    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->getLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->getTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->getRight()I

    move-result v2

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->getBottom()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    const/4 p1, 0x0

    .line 119
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->setWillNotDraw(Z)V

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 125
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->setWillNotDraw(Z)V

    .line 127
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->invalidate()V

    :cond_3
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 59
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/view/foreground/ForegroundRelativeLayout;->foreground:Landroid/graphics/drawable/Drawable;

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
