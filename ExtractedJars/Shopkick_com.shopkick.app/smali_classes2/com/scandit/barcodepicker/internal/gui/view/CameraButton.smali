.class public Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;
.super Lcom/scandit/base/view/SbRotatableImageButton;
.source "CameraButton.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field public static final STATE_NORMAL:Ljava/lang/String; = "normal"

.field public static final STATE_PRESSED:Ljava/lang/String; = "pressed"


# instance fields
.field public mCameraFacingDirection:I

.field private mContentDescriptionWhenBack:Ljava/lang/String;

.field private mContentDescriptionWhenFront:Ljava/lang/String;

.field private mIsLegacy:Z

.field private mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

.field private mUsesRelativeRect:Z

.field private mVisibleIfAvailable:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 4

    .line 44
    new-instance v0, Lcom/scandit/base/geometry/SbRectangle;

    const/16 v1, 0x28

    const v2, 0x3d4ccccd    # 0.05f

    const v3, 0x3c23d70a    # 0.01f

    invoke-direct {v0, v2, v3, v1, v1}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/16 v2, 0x10e

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-direct {p0, p1, v0, v2}, Lcom/scandit/base/view/SbRotatableImageButton;-><init>(Landroid/content/Context;Lcom/scandit/base/geometry/SbRectangle;I)V

    .line 30
    iput v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mCameraFacingDirection:I

    .line 32
    iput v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mVisibleIfAvailable:I

    .line 34
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mIsLegacy:Z

    .line 37
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mUsesRelativeRect:Z

    .line 45
    iput-boolean p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mIsLegacy:Z

    .line 46
    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 47
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setBackgroundColor(I)V

    const/16 p2, 0x8

    .line 49
    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setVisibility(I)V

    const-string p2, "normal"

    .line 50
    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setState(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->restoreDefaults(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public adjustPlacement(III)V
    .locals 2

    .line 110
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mUsesRelativeRect:Z

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

    int-to-float p1, p1

    .line 112
    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->x:F

    mul-float/2addr p1, v1

    float-to-int p1, p1

    int-to-float p2, p2

    .line 113
    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->y:F

    mul-float/2addr p2, v1

    float-to-int p2, p2

    add-int/2addr p2, p3

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mRect:Lcom/scandit/base/geometry/SbRectangle;

    .line 116
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->getContext()Landroid/content/Context;

    move-result-object p1

    iget p2, v0, Lcom/scandit/base/geometry/SbRectangle;->x:F

    float-to-int p2, p2

    invoke-static {p1, p2}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    .line 117
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->getContext()Landroid/content/Context;

    move-result-object p2

    iget p3, v0, Lcom/scandit/base/geometry/SbRectangle;->y:F

    float-to-int p3, p3

    invoke-static {p2, p3}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p2

    .line 119
    :goto_0
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->getContext()Landroid/content/Context;

    move-result-object p3

    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->height:I

    invoke-static {p3, v1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p3

    .line 120
    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->width:I

    int-to-float v1, v1

    iget v0, v0, Lcom/scandit/base/geometry/SbRectangle;->height:I

    int-to-float v0, v0

    div-float/2addr v1, v0

    int-to-float v0, p3

    mul-float/2addr v1, v0

    float-to-int v0, v1

    .line 122
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v0, p3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 123
    iget-boolean p3, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mIsLegacy:Z

    const/16 v0, 0xa

    if-eqz p3, :cond_1

    const/16 p3, 0x9

    .line 124
    invoke-virtual {v1, p3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 125
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 126
    iput p2, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 127
    iput p1, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    goto :goto_1

    :cond_1
    const/16 p3, 0xb

    .line 129
    invoke-virtual {v1, p3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 130
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 131
    iput p2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 132
    iput p1, v1, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    :goto_1
    const/4 p1, 0x0

    .line 134
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setPadding(IIII)V

    .line 135
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getVisibilityIfAvailable()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mVisibleIfAvailable:I

    return v0
.end method

.method public restoreDefaults(Landroid/content/Context;)V
    .locals 3

    const-string v0, "normal"

    const-string v1, "camera_swap_icon"

    const-string v2, "raw"

    .line 56
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setResourceIdForState(Ljava/lang/String;I)V

    const-string v0, "pressed"

    const-string v1, "camera_swap_icon_pressed"

    const-string v2, "raw"

    .line 58
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setResourceIdForState(Ljava/lang/String;I)V

    .line 61
    new-instance p1, Lcom/scandit/base/geometry/SbRectangle;

    const/16 v0, 0x28

    const v1, 0x3d4ccccd    # 0.05f

    const v2, 0x3c23d70a    # 0.01f

    invoke-direct {p1, v1, v2, v0, v0}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setRelativeRect(Lcom/scandit/base/geometry/SbRectangle;)V

    .line 62
    new-instance p1, Lcom/scandit/base/geometry/SbRectangle;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-direct {p1, v1, v1, v0, v0}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    const-string p1, "Camera Switch (Currently back-facing)"

    .line 64
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescriptionWhenBack(Ljava/lang/String;)V

    const-string p1, "Camera Switch (Currently front-facing)"

    .line 65
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescriptionWhenFront(Ljava/lang/String;)V

    return-void
.end method

.method public setCameraFacingDirection(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mCameraFacingDirection:I

    if-nez p1, :cond_0

    .line 72
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mContentDescriptionWhenBack:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 74
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mContentDescriptionWhenFront:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public setContentDescriptionWhenBack(Ljava/lang/String;)V
    .locals 1

    .line 148
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mContentDescriptionWhenBack:Ljava/lang/String;

    .line 150
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mCameraFacingDirection:I

    if-nez v0, :cond_0

    .line 151
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setContentDescriptionWhenFront(Ljava/lang/String;)V
    .locals 2

    .line 156
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mContentDescriptionWhenFront:Ljava/lang/String;

    .line 158
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mCameraFacingDirection:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 159
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 143
    invoke-super {p0, p1}, Lcom/scandit/base/view/SbRotatableImageButton;->setEnabled(Z)V

    if-eqz p1, :cond_0

    const-string p1, "normal"

    goto :goto_0

    :cond_0
    const-string p1, "pressed"

    .line 144
    :goto_0
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setState(Ljava/lang/String;)V

    return-void
.end method

.method public setRect(Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 88
    invoke-super {p0, p1}, Lcom/scandit/base/view/SbRotatableImageButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    const/4 p1, 0x0

    .line 89
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mUsesRelativeRect:Z

    return-void
.end method

.method public setRelativeRect(Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mUsesRelativeRect:Z

    return-void
.end method

.method public setVisibilityIfAvailable(I)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->mVisibleIfAvailable:I

    return-void
.end method
