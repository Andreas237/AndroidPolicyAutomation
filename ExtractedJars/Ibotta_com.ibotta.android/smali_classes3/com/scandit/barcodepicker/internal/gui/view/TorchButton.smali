.class public Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;
.super Lcom/scandit/base/view/SbRotatableImageButton;
.source "TorchButton.java"


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

.field private mTorchAvailability:I

.field private mUsesRelativeRect:Z

.field private mVisibleIfTorchAvailable:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 3

    .line 45
    new-instance v0, Lcom/scandit/base/geometry/SbRectangle;

    const/16 v1, 0x28

    const/high16 v2, 0x41700000    # 15.0f

    invoke-direct {v0, v2, v2, v1, v1}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/16 v2, 0x10e

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {p0, p1, v0, v2}, Lcom/scandit/base/view/SbRotatableImageButton;-><init>(Landroid/content/Context;Lcom/scandit/base/geometry/SbRectangle;I)V

    .line 32
    iput v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mTorchAvailability:I

    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mVisibleIfTorchAvailable:Z

    .line 38
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mUsesRelativeRect:Z

    .line 46
    iput-boolean p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mIsLegacy:Z

    .line 47
    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 48
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setBackgroundColor(I)V

    const/16 p2, 0x8

    .line 50
    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setVisibility(I)V

    .line 51
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->switchOff()V

    .line 53
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->restoreDefaults(Landroid/content/Context;)V

    return-void
.end method

.method private updateVisibility()V
    .locals 1

    .line 99
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mTorchAvailability:I

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mVisibleIfTorchAvailable:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 102
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setVisibility(I)V

    .line 103
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mTorchAvailability:I

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->updateEnabled(I)V

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v0, 0x8

    .line 100
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setVisibility(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method public adjustPlacement(III)V
    .locals 2

    .line 131
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mUsesRelativeRect:Z

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

    int-to-float p1, p1

    .line 133
    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->x:F

    mul-float p1, p1, v1

    float-to-int p1, p1

    int-to-float p2, p2

    .line 134
    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->y:F

    mul-float p2, p2, v1

    float-to-int p2, p2

    add-int/2addr p2, p3

    goto :goto_0

    .line 136
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mRect:Lcom/scandit/base/geometry/SbRectangle;

    .line 137
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getContext()Landroid/content/Context;

    move-result-object p1

    iget p2, v0, Lcom/scandit/base/geometry/SbRectangle;->x:F

    float-to-int p2, p2

    invoke-static {p1, p2}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p1

    .line 138
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getContext()Landroid/content/Context;

    move-result-object p2

    iget p3, v0, Lcom/scandit/base/geometry/SbRectangle;->y:F

    float-to-int p3, p3

    invoke-static {p2, p3}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p2

    .line 140
    :goto_0
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getContext()Landroid/content/Context;

    move-result-object p3

    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->height:I

    invoke-static {p3, v1}, Lcom/scandit/base/system/SbSystemUtils;->pxFromDp(Landroid/content/Context;I)I

    move-result p3

    .line 141
    iget v1, v0, Lcom/scandit/base/geometry/SbRectangle;->width:I

    int-to-float v1, v1

    iget v0, v0, Lcom/scandit/base/geometry/SbRectangle;->height:I

    int-to-float v0, v0

    div-float/2addr v1, v0

    int-to-float v0, p3

    mul-float v1, v1, v0

    float-to-int v0, v1

    .line 143
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v0, p3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 144
    iget-boolean p3, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mIsLegacy:Z

    const/16 v0, 0x9

    if-eqz p3, :cond_1

    .line 145
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 p3, 0xc

    .line 146
    invoke-virtual {v1, p3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 147
    iput p2, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 148
    iput p1, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    goto :goto_1

    .line 150
    :cond_1
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 p3, 0xa

    .line 151
    invoke-virtual {v1, p3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 152
    iput p2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 153
    iput p1, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    :goto_1
    const/4 p1, 0x0

    .line 155
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setPadding(IIII)V

    .line 156
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public restoreDefaults(Landroid/content/Context;)V
    .locals 3

    const-string v0, "off"

    const-string v1, "flashlight_turn_on_icon"

    const-string v2, "raw"

    .line 57
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setResourceIdForState(Ljava/lang/String;I)V

    const-string v0, "off_pressed"

    const-string v1, "flashlight_turn_on_icon_pressed"

    const-string v2, "raw"

    .line 59
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setResourceIdForState(Ljava/lang/String;I)V

    const-string v0, "on"

    const-string v1, "flashlight_turn_off_icon"

    const-string v2, "raw"

    .line 61
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setResourceIdForState(Ljava/lang/String;I)V

    const-string v0, "on_pressed"

    const-string v1, "flashlight_turn_off_icon_pressed"

    const-string v2, "raw"

    .line 63
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setResourceIdForState(Ljava/lang/String;I)V

    .line 66
    new-instance p1, Lcom/scandit/base/geometry/SbRectangle;

    const/16 v0, 0x28

    const v1, 0x3d4ccccd    # 0.05f

    const v2, 0x3c23d70a    # 0.01f

    invoke-direct {p1, v1, v2, v0, v0}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setRelativeRect(Lcom/scandit/base/geometry/SbRectangle;)V

    .line 67
    new-instance p1, Lcom/scandit/base/geometry/SbRectangle;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-direct {p1, v1, v1, v0, v0}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    const-string p1, "off"

    .line 68
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setState(Ljava/lang/String;)V

    const-string p1, "Torch Switch (Currently Off)"

    .line 70
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescriptionWhenOff(Ljava/lang/String;)V

    const-string p1, "Torch Switch (Currently On)"

    .line 71
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescriptionWhenOn(Ljava/lang/String;)V

    return-void
.end method

.method public setContentDescriptionWhenOff(Ljava/lang/String;)V
    .locals 2

    .line 199
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mContentDescriptionWhenOff:Ljava/lang/String;

    .line 201
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "off"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "off_pressed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 202
    :cond_0
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public setContentDescriptionWhenOn(Ljava/lang/String;)V
    .locals 2

    .line 207
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mContentDescriptionWhenOn:Ljava/lang/String;

    .line 209
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "on"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "on_pressed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    :cond_0
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public setRect(Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 109
    invoke-super {p0, p1}, Lcom/scandit/base/view/SbRotatableImageButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    const/4 p1, 0x0

    .line 110
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mUsesRelativeRect:Z

    return-void
.end method

.method public setRelativeRect(Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mRelativeRect:Lcom/scandit/base/geometry/SbRectangle;

    const/4 p1, 0x1

    .line 115
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mUsesRelativeRect:Z

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 1

    .line 189
    invoke-super {p0, p1}, Lcom/scandit/base/view/SbRotatableImageButton;->setState(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getState()Ljava/lang/String;

    move-result-object p1

    const-string v0, "off"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getState()Ljava/lang/String;

    move-result-object p1

    const-string v0, "off_pressed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 194
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mContentDescriptionWhenOn:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 192
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mContentDescriptionWhenOff:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method public setTorchAvailability(I)V
    .locals 0

    .line 89
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mTorchAvailability:I

    .line 90
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->updateVisibility()V

    return-void
.end method

.method public setVisibleIfTorchAvailable(Z)V
    .locals 0

    .line 94
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->mVisibleIfTorchAvailable:Z

    .line 95
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->updateVisibility()V

    return-void
.end method

.method public switchOff()V
    .locals 1

    const-string v0, "off"

    .line 85
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setState(Ljava/lang/String;)V

    return-void
.end method

.method public switchOn()V
    .locals 1

    const-string v0, "on"

    .line 78
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setState(Ljava/lang/String;)V

    return-void
.end method

.method torchStateToButtonState(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string p1, "off"

    return-object p1

    :pswitch_0
    const-string p1, "on"

    return-object p1

    :pswitch_1
    const-string p1, "off"

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public updateEnabled(I)V
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 178
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->torchStateToButtonState(I)Ljava/lang/String;

    move-result-object p1

    .line 179
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->isEnabled()Z

    move-result v1

    if-ne v1, v0, :cond_2

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->getState()Ljava/lang/String;

    move-result-object v1

    if-ne v1, p1, :cond_2

    return-void

    .line 183
    :cond_2
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setEnabled(Z)V

    .line 184
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setState(Ljava/lang/String;)V

    return-void
.end method
