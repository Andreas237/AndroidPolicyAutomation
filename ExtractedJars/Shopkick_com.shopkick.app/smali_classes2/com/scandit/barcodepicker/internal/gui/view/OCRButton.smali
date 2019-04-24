.class public Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;
.super Lcom/scandit/base/view/SbRotatableImageButton;
.source "OCRButton.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field public static final STATE_OFF:Ljava/lang/String; = "off"

.field public static final STATE_OFF_PRESSED:Ljava/lang/String; = "off_pressed"

.field public static final STATE_ON:Ljava/lang/String; = "on"

.field public static final STATE_ON_PRESSED:Ljava/lang/String; = "on_pressed"


# instance fields
.field private mContentDescriptionWhenOff:Ljava/lang/String;

.field private mContentDescriptionWhenOn:Ljava/lang/String;

.field private final mIsLegacy:Z

.field private mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

.field private mUsesRelativeRect:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 4

    .line 45
    new-instance v0, Lcom/scandit/base/geometry/SbRectangle;

    const/16 v1, 0x28

    const/high16 v2, 0x41700000    # 15.0f

    const/high16 v3, 0x42820000    # 65.0f

    invoke-direct {v0, v2, v3, v1, v1}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/16 v2, 0x10e

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-direct {p0, p1, v0, v2}, Lcom/scandit/base/view/SbRotatableImageButton;-><init>(Landroid/content/Context;Lcom/scandit/base/geometry/SbRectangle;I)V

    .line 38
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mUsesRelativeRect:Z

    .line 46
    iput-boolean p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mIsLegacy:Z

    .line 47
    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 48
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setBackgroundColor(I)V

    .line 49
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->switchOff()V

    .line 51
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->restoreDefaults(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public adjustPlacement(III)V
    .locals 2

    .line 110
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mUsesRelativeRect:Z

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

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
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mRect:Lcom/scandit/base/geometry/SbRectangle;

    .line 116
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getContext()Landroid/content/Context;

    move-result-object p1

    iget p2, v0, Lcom/scandit/base/geometry/SbRectangle;->x:F

    float-to-int p2, p2

    invoke-static {p1, p2}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    .line 117
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getContext()Landroid/content/Context;

    move-result-object p2

    iget p3, v0, Lcom/scandit/base/geometry/SbRectangle;->y:F

    float-to-int p3, p3

    invoke-static {p2, p3}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p2

    .line 119
    :goto_0
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getContext()Landroid/content/Context;

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
    iget-boolean p3, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mIsLegacy:Z

    const/16 v0, 0x9

    if-eqz p3, :cond_1

    .line 124
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 p3, 0xc

    .line 125
    invoke-virtual {v1, p3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 126
    iput p2, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 127
    iput p1, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    goto :goto_1

    .line 129
    :cond_1
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 p3, 0xa

    .line 130
    invoke-virtual {v1, p3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 131
    iput p2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 132
    iput p1, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    :goto_1
    const/4 p1, 0x0

    .line 134
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setPadding(IIII)V

    .line 135
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public restoreDefaults(Landroid/content/Context;)V
    .locals 3

    const-string v0, "off"

    const-string v1, "ocr_turn_off_icon"

    const-string v2, "raw"

    .line 55
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setResourceIdForState(Ljava/lang/String;I)V

    const-string v0, "off_pressed"

    const-string v1, "ocr_turn_off_icon"

    const-string v2, "raw"

    .line 57
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setResourceIdForState(Ljava/lang/String;I)V

    const-string v0, "on"

    const-string v1, "ocr_turn_on_icon"

    const-string v2, "raw"

    .line 59
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setResourceIdForState(Ljava/lang/String;I)V

    const-string v0, "on_pressed"

    const-string v1, "ocr_turn_on_icon"

    const-string v2, "raw"

    .line 61
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setResourceIdForState(Ljava/lang/String;I)V

    .line 64
    new-instance p1, Lcom/scandit/base/geometry/SbRectangle;

    const/16 v0, 0x28

    const v1, 0x3d4ccccd    # 0.05f

    const v2, 0x3c23d70a    # 0.01f

    invoke-direct {p1, v1, v2, v0, v0}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setRelativeRect(Lcom/scandit/base/geometry/SbRectangle;)V

    .line 65
    new-instance p1, Lcom/scandit/base/geometry/SbRectangle;

    const/high16 v1, 0x41700000    # 15.0f

    const/high16 v2, 0x42820000    # 65.0f

    invoke-direct {p1, v1, v2, v0, v0}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    const-string p1, "off"

    .line 66
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setState(Ljava/lang/String;)V

    const-string p1, "Text Recognition Switch (Currently Off)"

    .line 68
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setContentDescriptionWhenOff(Ljava/lang/String;)V

    const-string p1, "Text Recognition Switch (Currently On)"

    .line 69
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setContentDescriptionWhenOn(Ljava/lang/String;)V

    return-void
.end method

.method public setContentDescriptionWhenOff(Ljava/lang/String;)V
    .locals 2

    .line 151
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mContentDescriptionWhenOff:Ljava/lang/String;

    .line 153
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "off"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "off_pressed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    :cond_0
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public setContentDescriptionWhenOn(Ljava/lang/String;)V
    .locals 2

    .line 159
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mContentDescriptionWhenOn:Ljava/lang/String;

    .line 161
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "on"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "on_pressed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    :cond_0
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public setRect(Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 88
    invoke-super {p0, p1}, Lcom/scandit/base/view/SbRotatableImageButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    const/4 p1, 0x0

    .line 89
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mUsesRelativeRect:Z

    return-void
.end method

.method public setRelativeRect(Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mUsesRelativeRect:Z

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 1

    .line 141
    invoke-super {p0, p1}, Lcom/scandit/base/view/SbRotatableImageButton;->setState(Ljava/lang/String;)V

    .line 143
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getState()Ljava/lang/String;

    move-result-object p1

    const-string v0, "off"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->getState()Ljava/lang/String;

    move-result-object p1

    const-string v0, "off_pressed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 146
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mContentDescriptionWhenOn:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 144
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->mContentDescriptionWhenOff:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method public switchOff()V
    .locals 1

    const-string v0, "off"

    .line 83
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setState(Ljava/lang/String;)V

    return-void
.end method

.method public switchOn()V
    .locals 1

    const-string v0, "on"

    .line 76
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;->setState(Ljava/lang/String;)V

    return-void
.end method
