.class Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;
.super Ljava/lang/Object;
.source "CompatHelpers.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LollipopRippleBackground"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/util/CompatHelpers$1;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;-><init>()V

    return-void
.end method

.method public static getColorDrawableFromColor(I)Landroid/graphics/drawable/ColorDrawable;
    .locals 1

    .line 106
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0
.end method

.method public static getPressedColorSelector(II)Landroid/content/res/ColorStateList;
    .locals 8

    .line 110
    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x4

    new-array v2, v1, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    const/4 v5, 0x0

    const v6, 0x10100a7

    aput v6, v4, v5

    aput-object v4, v2, v5

    new-array v4, v3, [I

    const v6, 0x101009c

    aput v6, v4, v5

    aput-object v4, v2, v3

    new-array v4, v3, [I

    const v6, 0x10102fe

    aput v6, v4, v5

    const/4 v6, 0x2

    aput-object v4, v2, v6

    new-array v4, v5, [I

    const/4 v7, 0x3

    aput-object v4, v2, v7

    new-array v1, v1, [I

    aput p1, v1, v5

    aput p1, v1, v3

    aput p1, v1, v6

    aput p0, v1, v7

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v0
.end method


# virtual methods
.method public from(II)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 102
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {p1, p2}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;->getPressedColorSelector(II)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground$LollipopRippleBackground;->getColorDrawableFromColor(I)Landroid/graphics/drawable/ColorDrawable;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p2, p1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method
