.class public Lcom/shopkick/app/controllers/WindowBrightnessController;
.super Ljava/lang/Object;
.source "WindowBrightnessController.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static restoreScreenBrightness(Landroid/view/Window;)V
    .locals 2

    .line 37
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBrightnessControlEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/high16 v1, -0x40800000    # -1.0f

    .line 39
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 40
    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public static setScreenBrightnessToMaximum(Landroid/view/Window;)V
    .locals 2

    .line 23
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isBrightnessControlEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 25
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 26
    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_0
    return-void
.end method
