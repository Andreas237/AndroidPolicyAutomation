.class public Lcom/shopkick/app/animation/VerticalResizeAnimation;
.super Landroid/view/animation/Animation;
.source "VerticalResizeAnimation.java"


# instance fields
.field private heightDelta:I

.field private originalHeight:I

.field private view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;II)V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/shopkick/app/animation/VerticalResizeAnimation;->view:Landroid/view/View;

    .line 14
    iput p2, p0, Lcom/shopkick/app/animation/VerticalResizeAnimation;->originalHeight:I

    sub-int/2addr p3, p2

    .line 15
    iput p3, p0, Lcom/shopkick/app/animation/VerticalResizeAnimation;->heightDelta:I

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 20
    iget-object p2, p0, Lcom/shopkick/app/animation/VerticalResizeAnimation;->view:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iget v0, p0, Lcom/shopkick/app/animation/VerticalResizeAnimation;->originalHeight:I

    iget v1, p0, Lcom/shopkick/app/animation/VerticalResizeAnimation;->heightDelta:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int p1, v1

    add-int/2addr v0, p1

    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 21
    iget-object p1, p0, Lcom/shopkick/app/animation/VerticalResizeAnimation;->view:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public initialize(IIII)V
    .locals 0

    .line 26
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V

    return-void
.end method

.method public willChangeBounds()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
