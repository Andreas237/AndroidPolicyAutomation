.class Lhuawei/widget/AnimationUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/view/animation/Interpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Lhuawei/widget/FastOutSlowInInterpolator;

    invoke-direct {v0}, Lhuawei/widget/FastOutSlowInInterpolator;-><init>()V

    sput-object v0, Lhuawei/widget/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/view/animation/Interpolator;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static lerp(FFF)F
    .locals 1

    .line 29
    sub-float v0, p1, p0

    mul-float/2addr v0, p2

    add-float/2addr v0, p0

    return v0
.end method

.method static lerp(IIF)I
    .locals 1

    .line 33
    sub-int v0, p1, p0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method
