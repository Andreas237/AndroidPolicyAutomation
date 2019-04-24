.class public Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground;
.super Ljava/lang/Object;
.source "CompatHelpers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/CompatHelpers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RippleBackground"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromColor(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 84
    invoke-static {p0}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground;->rippleColor(I)I

    move-result v0

    invoke-static {p0, v0}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground;->fromColors(II)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static fromColors(II)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 76
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 77
    new-instance v0, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;-><init>(Lcom/usebutton/sdk/internal/util/CompatHelpers$1;)V

    invoke-virtual {v0, p0, p1}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;->from(II)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    .line 79
    :cond_0
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p1, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object p1
.end method

.method private static rippleColor(I)I
    .locals 7

    const/4 v0, 0x3

    .line 88
    new-array v0, v0, [F

    .line 89
    invoke-static {p0, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 p0, 0x2

    .line 90
    aget v1, v0, p0

    float-to-double v1, v1

    const v3, 0x3e4ccccd    # 0.2f

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    cmpg-double v6, v1, v4

    if-gez v6, :cond_0

    .line 91
    aget v1, v0, p0

    add-float/2addr v1, v3

    aput v1, v0, p0

    goto :goto_0

    .line 93
    :cond_0
    aget v1, v0, p0

    sub-float/2addr v1, v3

    aput v1, v0, p0

    .line 95
    :goto_0
    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result p0

    return p0
.end method
