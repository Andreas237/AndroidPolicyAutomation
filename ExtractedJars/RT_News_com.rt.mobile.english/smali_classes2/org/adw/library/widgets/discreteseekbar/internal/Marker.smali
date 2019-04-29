.class public Lorg/adw/library/widgets/discreteseekbar/internal/Marker;
.super Landroid/view/ViewGroup;
.source "Marker.java"

# interfaces
.implements Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;


# static fields
.field private static final ELEVATION_DP:I = 0x8

.field private static final PADDING_DP:I = 0x4


# instance fields
.field mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

.field private mNumber:Landroid/widget/TextView;

.field private mSeparation:I

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;II)V
    .locals 4

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 63
    invoke-virtual {p0, p3}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->setVisibility(I)V

    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 66
    sget-object v1, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar:[I

    sget v2, Lorg/adw/library/widgets/discreteseekbar/R$attr;->discreteSeekBarStyle:I

    sget v3, Lorg/adw/library/widgets/discreteseekbar/R$style;->Widget_DiscreteSeekBar:I

    invoke-virtual {p1, p2, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 69
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v2, v1

    float-to-int v1, v2

    mul-int/lit8 v1, v1, 0x2

    .line 70
    sget v2, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_indicatorTextAppearance:I

    sget v3, Lorg/adw/library/widgets/discreteseekbar/R$style;->Widget_DiscreteIndicatorTextAppearance:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 72
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    .line 74
    iget-object v3, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {v3, v1, p3, v1, p3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 75
    iget-object p3, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {p3, p1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 76
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    const/16 p3, 0x11

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setGravity(I)V

    .line 77
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 79
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 80
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    const/4 p3, 0x5

    invoke-static {p1, p3}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->setTextDirection(Landroid/widget/TextView;I)V

    .line 81
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    const/4 p3, 0x4

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 85
    invoke-virtual {p0, v1, v1, v1, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->setPadding(IIII)V

    .line 87
    invoke-virtual {p0, p4}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->resetSizes(Ljava/lang/String;)V

    .line 89
    iput p6, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mSeparation:I

    .line 90
    sget p1, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_indicatorColor:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 91
    new-instance p3, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-direct {p3, p1, p5}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;-><init>(Landroid/content/res/ColorStateList;I)V

    iput-object p3, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    .line 92
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {p1, p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 93
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {p1, p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->setMarkerListener(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;)V

    .line 94
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {p1, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->setExternalOffset(I)V

    .line 97
    sget p1, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar_dsb_indicatorElevation:I

    iget p3, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x41000000    # 8.0f

    mul-float/2addr p4, p3

    invoke-virtual {p2, p1, p4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    .line 98
    invoke-static {p0, p1}, Landroid/support/v4/view/ViewCompat;->setElevation(Landroid/view/View;F)V

    .line 99
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x15

    if-lt p1, p3, :cond_0

    .line 100
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-static {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->setOutlineProvider(Landroid/view/View;Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;)V

    .line 102
    :cond_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public animateClose()V
    .locals 2

    .line 181
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->stop()V

    .line 182
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 183
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->animateToNormal()V

    return-void
.end method

.method public animateOpen()V
    .locals 1

    .line 176
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->stop()V

    .line 177
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->animateToPressed()V

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 123
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getValue()Ljava/lang/CharSequence;
    .locals 1

    .line 172
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 159
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 164
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->animateOpen()V

    return-void
.end method

.method public onClosingComplete()V
    .locals 1

    .line 196
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    if-eqz v0, :cond_0

    .line 197
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    invoke-interface {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;->onClosingComplete()V

    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 203
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 204
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->stop()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .line 141
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingLeft()I

    move-result p1

    .line 142
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingTop()I

    move-result p2

    .line 143
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingRight()I

    move-result p4

    sub-int/2addr p3, p4

    .line 144
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getHeight()I

    move-result p4

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingBottom()I

    move-result p5

    sub-int/2addr p4, p5

    .line 146
    iget-object p5, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    add-int/2addr v1, p2

    invoke-virtual {p5, p1, p2, v0, v1}, Landroid/widget/TextView;->layout(IIII)V

    .line 149
    iget-object p5, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {p5, p1, p2, p3, p4}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->setBounds(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 128
    invoke-virtual {p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->measureChildren(II)V

    .line 129
    iget p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingLeft()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingRight()I

    move-result p2

    add-int/2addr p1, p2

    .line 130
    iget p2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingTop()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getPaddingBottom()I

    move-result v0

    add-int/2addr p2, v0

    .line 135
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    int-to-float v0, v0

    const v1, 0x3fb47ae1    # 1.41f

    mul-float/2addr v1, v0

    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    int-to-float v0, v0

    sub-float/2addr v1, v0

    float-to-int v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    .line 136
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mSeparation:I

    add-int/2addr p2, v0

    invoke-virtual {p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->setMeasuredDimension(II)V

    return-void
.end method

.method public onOpeningComplete()V
    .locals 2

    .line 188
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 189
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    if-eqz v0, :cond_0

    .line 190
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    invoke-interface {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;->onOpeningComplete()V

    :cond_0
    return-void
.end method

.method public resetSizes(Ljava/lang/String;)V
    .locals 4

    .line 106
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 108
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    iget p1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v1, -0x80000000

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 113
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 114
    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {v1, p1, v0}, Landroid/widget/TextView;->measure(II)V

    .line 115
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    .line 116
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->removeView(Landroid/view/View;)V

    .line 117
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    iget v2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mWidth:I

    const/16 v3, 0x33

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, p1, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setColors(II)V
    .locals 1

    .line 208
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    invoke-virtual {v0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;->setColors(II)V

    return-void
.end method

.method public setValue(Ljava/lang/CharSequence;)V
    .locals 1

    .line 168
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mNumber:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 154
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->mMarkerDrawable:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable;

    if-eq p1, v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_0

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
