.class abstract Lhuawei/widget/LookupTableInterpolator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# instance fields
.field private final mStepSize:F

.field private final mValues:[F


# direct methods
.method public constructor <init>([F)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lhuawei/widget/LookupTableInterpolator;->mValues:[F

    .line 16
    iget-object v0, p0, Lhuawei/widget/LookupTableInterpolator;->mValues:[F

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    iput v0, p0, Lhuawei/widget/LookupTableInterpolator;->mStepSize:F

    .line 17
    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 9

    .line 21
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_1

    .line 25
    const/4 v0, 0x0

    return v0

    .line 30
    :cond_1
    iget-object v0, p0, Lhuawei/widget/LookupTableInterpolator;->mValues:[F

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v3, v0

    .line 31
    iget-object v0, p0, Lhuawei/widget/LookupTableInterpolator;->mValues:[F

    array-length v0, v0

    add-int/lit8 v4, v0, -0x2

    .line 32
    if-ge v3, v4, :cond_2

    move v5, v3

    goto :goto_0

    :cond_2
    move v5, v4

    .line 35
    :goto_0
    int-to-float v0, v5

    iget v1, p0, Lhuawei/widget/LookupTableInterpolator;->mStepSize:F

    mul-float v6, v0, v1

    .line 36
    sub-float v7, p1, v6

    .line 37
    iget v0, p0, Lhuawei/widget/LookupTableInterpolator;->mStepSize:F

    div-float v8, v7, v0

    .line 40
    iget-object v0, p0, Lhuawei/widget/LookupTableInterpolator;->mValues:[F

    aget v0, v0, v5

    iget-object v1, p0, Lhuawei/widget/LookupTableInterpolator;->mValues:[F

    add-int/lit8 v2, v5, 0x1

    aget v1, v1, v2

    iget-object v2, p0, Lhuawei/widget/LookupTableInterpolator;->mValues:[F

    aget v2, v2, v5

    sub-float/2addr v1, v2

    mul-float/2addr v1, v8

    add-float/2addr v0, v1

    return v0
.end method
