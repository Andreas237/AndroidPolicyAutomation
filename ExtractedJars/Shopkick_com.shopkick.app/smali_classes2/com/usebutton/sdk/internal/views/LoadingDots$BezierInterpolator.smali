.class Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;
.super Ljava/lang/Object;
.source "LoadingDots.java"

# interfaces
.implements Landroid/animation/TimeInterpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/LoadingDots;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BezierInterpolator"
.end annotation


# instance fields
.field private final mA0:F

.field private final mA1:F

.field private final mA2:F

.field private final mA3:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0
    .param p1    # F
        .annotation build Landroid/support/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .param p2    # F
        .annotation build Landroid/support/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .param p3    # F
        .annotation build Landroid/support/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .param p4    # F
        .annotation build Landroid/support/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    iput p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA0:F

    .line 170
    iput p2, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA1:F

    .line 171
    iput p3, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA2:F

    .line 172
    iput p4, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA3:F

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 13

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    float-to-double v1, v0

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    .line 178
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    iget v7, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA0:F

    float-to-double v7, v7

    mul-double/2addr v5, v7

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    mul-double/2addr v1, v3

    float-to-double v9, p1

    mul-double/2addr v1, v9

    iget p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA1:F

    float-to-double v11, p1

    mul-double/2addr v1, v11

    add-double/2addr v5, v1

    const/high16 p1, 0x40400000    # 3.0f

    mul-float/2addr v0, p1

    float-to-double v0, v0

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    mul-double/2addr v0, v7

    iget p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA2:F

    float-to-double v7, p1

    mul-double/2addr v0, v7

    add-double/2addr v5, v0

    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    iget p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;->mA3:F

    float-to-double v2, p1

    mul-double/2addr v0, v2

    add-double/2addr v5, v0

    double-to-float p1, v5

    return p1
.end method
