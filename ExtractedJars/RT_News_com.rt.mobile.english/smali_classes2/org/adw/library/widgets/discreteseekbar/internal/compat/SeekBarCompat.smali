.class public Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;
.super Ljava/lang/Object;
.source "SeekBarCompat.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRipple(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 61
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 62
    invoke-static {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash;->getRipple(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    .line 64
    :cond_0
    new-instance v0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;

    invoke-direct {v0, p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;-><init>(Landroid/content/res/ColorStateList;)V

    return-object v0
.end method

.method public static isHardwareAccelerated(Landroid/view/View;)Z
    .locals 2

    .line 138
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 139
    invoke-static {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash;->isHardwareAccelerated(Landroid/view/View;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isInScrollingContainer(Landroid/view/ViewParent;)Z
    .locals 2

    .line 131
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 132
    invoke-static {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash;->isInScrollingContainer(Landroid/view/ViewParent;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 110
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 111
    invoke-static {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public static setHotspotBounds(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 2

    .line 92
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    sub-int v0, p3, p1

    .line 94
    div-int/lit8 v0, v0, 0x8

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    sub-int/2addr p4, v0

    .line 95
    invoke-static {p0, p1, p2, p3, p4}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setHotspotBounds(Landroid/graphics/drawable/Drawable;IIII)V

    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :goto_0
    return-void
.end method

.method public static setOutlineProvider(Landroid/view/View;Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;)V
    .locals 2

    .line 48
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 49
    invoke-static {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash;->setOutlineProvider(Landroid/view/View;Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;)V

    :cond_0
    return-void
.end method

.method public static setRippleColor(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 2
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 74
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 75
    check-cast p0, Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 77
    :cond_0
    check-cast p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/AlmostRippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    :goto_0
    return-void
.end method

.method public static setTextDirection(Landroid/widget/TextView;I)V
    .locals 2

    .line 125
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 126
    invoke-static {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompatDontCrash;->setTextDirection(Landroid/widget/TextView;I)V

    :cond_0
    return-void
.end method
