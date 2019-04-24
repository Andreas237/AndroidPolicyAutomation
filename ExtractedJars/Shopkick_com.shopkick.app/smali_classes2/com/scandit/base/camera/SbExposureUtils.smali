.class public Lcom/scandit/base/camera/SbExposureUtils;
.super Ljava/lang/Object;
.source "SbExposureUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertTargetBiasToExposureStep(FFII)I
    .locals 0

    div-float/2addr p0, p1

    .line 16
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    .line 17
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p3, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method
