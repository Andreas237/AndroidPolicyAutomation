.class Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash;
.super Ljava/lang/Object;
.source "SeekBarCompatDontCrash.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRipple(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 50
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public static isHardwareAccelerated(Landroid/view/View;)Z
    .locals 0

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p0

    return p0
.end method

.method public static isInScrollingContainer(Landroid/view/ViewParent;)Z
    .locals 1

    :goto_0
    if-eqz p0, :cond_1

    .line 62
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 63
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 66
    :cond_0
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 54
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static setOutlineProvider(Landroid/view/View;Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;)V
    .locals 1

    .line 41
    new-instance v0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash$1;

    invoke-direct {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash$1;-><init>(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    return-void
.end method

.method public static setTextDirection(Landroid/widget/TextView;I)V
    .locals 0

    .line 58
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextDirection(I)V

    return-void
.end method
