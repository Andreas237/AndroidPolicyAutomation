.class public final Lcom/nineoldandroids/view/ViewHelper;
.super Ljava/lang/Object;
.source "ViewHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nineoldandroids/view/ViewHelper$Honeycomb;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAlpha(Landroid/view/View;)F
    .locals 1

    .line 12
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getAlpha()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getAlpha(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getPivotX(Landroid/view/View;)F
    .locals 1

    .line 24
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getPivotX()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getPivotX(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getPivotY(Landroid/view/View;)F
    .locals 1

    .line 36
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getPivotY()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getPivotY(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getRotation(Landroid/view/View;)F
    .locals 1

    .line 48
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotation()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getRotation(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getRotationX(Landroid/view/View;)F
    .locals 1

    .line 60
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationX()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getRotationX(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getRotationY(Landroid/view/View;)F
    .locals 1

    .line 72
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationY()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getRotationY(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getScaleX(Landroid/view/View;)F
    .locals 1

    .line 84
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleX()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScaleX(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getScaleY(Landroid/view/View;)F
    .locals 1

    .line 96
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleY()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScaleY(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getScrollX(Landroid/view/View;)F
    .locals 1

    .line 108
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScrollX()I

    move-result p0

    int-to-float p0, p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScrollX(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getScrollY(Landroid/view/View;)F
    .locals 1

    .line 120
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScrollY()I

    move-result p0

    int-to-float p0, p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getScrollY(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getTranslationX(Landroid/view/View;)F
    .locals 1

    .line 132
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationX()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getTranslationX(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getTranslationY(Landroid/view/View;)F
    .locals 1

    .line 144
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationY()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getTranslationY(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getX(Landroid/view/View;)F
    .locals 1

    .line 156
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getX()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getX(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static getY(Landroid/view/View;)F
    .locals 1

    .line 168
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getY()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->getY(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static setAlpha(Landroid/view/View;F)V
    .locals 1

    .line 16
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 17
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setAlpha(F)V

    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setAlpha(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setPivotX(Landroid/view/View;F)V
    .locals 1

    .line 28
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 29
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setPivotX(F)V

    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setPivotX(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setPivotY(Landroid/view/View;F)V
    .locals 1

    .line 40
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 41
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setPivotY(F)V

    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setPivotY(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setRotation(Landroid/view/View;F)V
    .locals 1

    .line 52
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 53
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotation(F)V

    goto :goto_0

    .line 55
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setRotation(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setRotationX(Landroid/view/View;F)V
    .locals 1

    .line 64
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 65
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationX(F)V

    goto :goto_0

    .line 67
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setRotationX(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setRotationY(Landroid/view/View;F)V
    .locals 1

    .line 76
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 77
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationY(F)V

    goto :goto_0

    .line 79
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setRotationY(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setScaleX(Landroid/view/View;F)V
    .locals 1

    .line 88
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 89
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleX(F)V

    goto :goto_0

    .line 91
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScaleX(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setScaleY(Landroid/view/View;F)V
    .locals 1

    .line 100
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 101
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleY(F)V

    goto :goto_0

    .line 103
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScaleY(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setScrollX(Landroid/view/View;I)V
    .locals 1

    .line 112
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 113
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScrollX(I)V

    goto :goto_0

    .line 115
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScrollX(Landroid/view/View;I)V

    :goto_0
    return-void
.end method

.method public static setScrollY(Landroid/view/View;I)V
    .locals 1

    .line 124
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 125
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScrollY(I)V

    goto :goto_0

    .line 127
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setScrollY(Landroid/view/View;I)V

    :goto_0
    return-void
.end method

.method public static setTranslationX(Landroid/view/View;F)V
    .locals 1

    .line 136
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 137
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationX(F)V

    goto :goto_0

    .line 139
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setTranslationX(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setTranslationY(Landroid/view/View;F)V
    .locals 1

    .line 148
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 149
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationY(F)V

    goto :goto_0

    .line 151
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setTranslationY(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setX(Landroid/view/View;F)V
    .locals 1

    .line 160
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 161
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setX(F)V

    goto :goto_0

    .line 163
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setX(Landroid/view/View;F)V

    :goto_0
    return-void
.end method

.method public static setY(Landroid/view/View;F)V
    .locals 1

    .line 172
    sget-boolean v0, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z

    if-eqz v0, :cond_0

    .line 173
    invoke-static {p0}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setY(F)V

    goto :goto_0

    .line 175
    :cond_0
    invoke-static {p0, p1}, Lcom/nineoldandroids/view/ViewHelper$Honeycomb;->setY(Landroid/view/View;F)V

    :goto_0
    return-void
.end method
