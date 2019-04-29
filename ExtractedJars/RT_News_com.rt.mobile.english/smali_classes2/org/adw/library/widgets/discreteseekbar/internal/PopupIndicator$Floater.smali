.class Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;
.super Landroid/widget/FrameLayout;
.source "PopupIndicator.java"

# interfaces
.implements Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Floater"
.end annotation


# instance fields
.field private mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

.field private mOffset:I

.field final synthetic this$0:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;


# direct methods
.method public constructor <init>(Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;II)V
    .locals 7

    .line 216
    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    .line 217
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 218
    new-instance p1, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v4, p5

    move v5, p6

    move v6, p7

    invoke-direct/range {v0 .. v6}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;II)V

    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    .line 219
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x2

    const/16 p4, 0x33

    invoke-direct {p2, p3, p3, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic access$000(Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;)Lorg/adw/library/widgets/discreteseekbar/internal/Marker;
    .locals 0

    .line 212
    iget-object p0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    return-object p0
.end method


# virtual methods
.method public onClosingComplete()V
    .locals 1

    .line 251
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-static {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->access$100(Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;)Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-static {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->access$100(Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;)Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    move-result-object v0

    invoke-interface {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;->onClosingComplete()V

    .line 254
    :cond_0
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->dismissComplete()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 232
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    invoke-virtual {p1}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getMeasuredWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    .line 233
    iget p2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mOffset:I

    sub-int/2addr p2, p1

    .line 234
    iget-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    iget-object p3, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    invoke-virtual {p3}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getMeasuredWidth()I

    move-result p3

    add-int/2addr p3, p2

    iget-object p4, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    invoke-virtual {p4}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getMeasuredHeight()I

    move-result p4

    const/4 p5, 0x0

    invoke-virtual {p1, p2, p5, p3, p4}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 224
    invoke-virtual {p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->measureChildren(II)V

    .line 225
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 226
    iget-object p2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    invoke-virtual {p2}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getMeasuredHeight()I

    move-result p2

    .line 227
    invoke-virtual {p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->setMeasuredDimension(II)V

    return-void
.end method

.method public onOpeningComplete()V
    .locals 1

    .line 259
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-static {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->access$100(Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;)Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;

    invoke-static {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;->access$100(Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator;)Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;

    move-result-object v0

    invoke-interface {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;->onOpeningComplete()V

    :cond_0
    return-void
.end method

.method public setColors(II)V
    .locals 1

    .line 265
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    invoke-virtual {v0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->setColors(II)V

    return-void
.end method

.method public setFloatOffset(I)V
    .locals 2

    .line 238
    iput p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mOffset:I

    .line 239
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getMeasuredWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr p1, v0

    .line 241
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    iget-object v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->mMarker:Lorg/adw/library/widgets/discreteseekbar/internal/Marker;

    invoke-virtual {v1}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->getLeft()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/Marker;->offsetLeftAndRight(I)V

    .line 244
    invoke-static {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/SeekBarCompat;->isHardwareAccelerated(Landroid/view/View;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 245
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/PopupIndicator$Floater;->invalidate()V

    :cond_0
    return-void
.end method
